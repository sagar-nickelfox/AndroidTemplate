package {{ cookiecutter.package_name }}.data.respository

import {{ cookiecutter.package_name }}.data.db.GenieDatabase
import {{ cookiecutter.package_name }}.data.models.CustomResult
import javax.inject.Inject

class DefaultRepo @Inject constructor(
    private val remoteRepo: RemoteRepository,
    private val database: GenieDatabase
) {

    fun observeCategories() = database.categoryDao().getCategoriesWithImages()

    suspend fun getCategories(): CustomResult<String> {
        return when (val result = remoteRepo.getCategories()) {
            is CustomResult.Success -> {
                database.categoryDao().insertUpdateCategories(result.data.first)
                database.categoryDao().insertUpdateCategoryImages(result.data.second)
                CustomResult.Success("Success")
            }
            is CustomResult.Error -> {
                CustomResult.Error(result.exception)
            }
        }
    }

}