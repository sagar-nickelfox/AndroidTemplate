package {{ cookiecutter.package_name }}.data.models

import {{ cookiecutter.package_name }}.utils.LocalisedException


sealed class CustomResult<out R> {
    data class Success<out T>(val data: T) : CustomResult<T>()
    data class Error(
        val exception: LocalisedException,
    ) : CustomResult<Nothing>()
}
