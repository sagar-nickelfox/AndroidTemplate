package {{ cookiecutter.package_name }}.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import {{ cookiecutter.package_name }}.data.db.dao.CategoryDao
import {{ cookiecutter.package_name }}.data.db.dao.EmployeesDao
import {{ cookiecutter.package_name }}.data.db.entities.Categories
import {{ cookiecutter.package_name }}.data.db.entities.CategoryImages
import {{ cookiecutter.package_name }}.data.db.entities.Employees

@Database(entities = [Categories::class, CategoryImages::class, Employees::class], version = 1, exportSchema = false)
abstract class GenieDatabase : RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
    abstract fun employeesDao(): EmployeesDao
}