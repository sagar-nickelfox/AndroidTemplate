package {{ cookiecutter.package_name }}.data.network

import {{ cookiecutter.package_name }}.data.db.entities.Categories
import {{ cookiecutter.package_name }}.data.db.entities.CategoryImages
import {{ cookiecutter.package_name }}.data.db.entities.Employees
import {{ cookiecutter.package_name }}.data.models.CommonResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


//TODO: these are just sample calls for demonstration, replace them with your own
interface Api {

    @GET("categories")
    suspend fun getCategories(): Response<CommonResponse<List<Categories>>>

    @GET("category_images")
    suspend fun getCategoryImages(): Response<CommonResponse<List<CategoryImages>>>

}