package {{ cookiecutter.package_name }}.data.db

import javax.inject.Inject


//TODO: remove this if not needed
@Suppress("unused")
class LocalRepo @Inject constructor(private val database: GenieDatabase)