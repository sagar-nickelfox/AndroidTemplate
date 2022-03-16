package {{ cookiecutter.package_name }}.data.models

import com.google.gson.annotations.SerializedName

data class CommonResponse<T : Any>(@SerializedName("data") val data: T)
