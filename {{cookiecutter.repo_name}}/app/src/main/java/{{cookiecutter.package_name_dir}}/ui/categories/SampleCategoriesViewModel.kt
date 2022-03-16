package {{ cookiecutter.package_name }}.ui.categories

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import {{ cookiecutter.package_name }}.data.respository.DefaultRepo
import {{ cookiecutter.package_name }}.data.models.CustomResult
import {{ cookiecutter.package_name }}.utils.LocalisedException
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SampleCategoriesViewModel @Inject constructor(private val repo: DefaultRepo) : ViewModel() {

    private val error = MutableLiveData<LocalisedException>()

    init {
        updateCategories()
    }

    fun observeCategories() = repo.observeCategories()

    private fun updateCategories() {
        viewModelScope.launch {
            when (val result = repo.getCategories()) {
                is CustomResult.Success -> {

                }
                is CustomResult.Error -> {
                    error.postValue(result.exception)
                }
            }
        }
    }


}