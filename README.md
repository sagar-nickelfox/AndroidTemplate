
# Android Project Template

_Use this template project to improve your project setup experience._

*Template contents:*

* recommended package structure
* latest libraries (Androidx, Glide, Retrofit, Moshi, A3 libraries, Timber, LeakCanary)
* flavor dimension for development environments (`dev`, `staging`, `live`)
* Retrofit setup
* Firebase Analytics and Messaging setup
* SplashScreen helper -> https://blog.davidmedenjak.com/android/2017/09/02/splash-screens.html
* Code to show [Open Source Licenses](#open-source-licenses) as a stand-alone activity or dialog
* (optional) Texterify: texterify.json setup


## Project Setup (using this template)

Install [cookiecutter](http://cookiecutter.readthedocs.io/en/latest/installation.html) and run the following command to fetch and use this template:
```
cookiecutter gh:sagar-nickelfox/AndroidTemplate
```

Supply the following values when prompted:

1) `repo_name`        - name of cloned directory  (eg   myproject-android)
2) `app_name`         - app name
3) `package_name`     - "com.example.app",
4) `package_name_dir` - Leave blank to use the previous input for `package_name` (used to generate the correct folder structure)
5) `string_tool`      - Choose a string-export tool for this project (none, googlesheet or texterify)
6) `texterify_project_id` - project id of your Texterify project - default: empty
7) `texterify_export_config` - export configuration id of your Texterify project - default: empty
8) `firebase_analytics` - Setup firebase analytics
9) `firebase_messaging` - Basic setup for FCM
10) `strings_sheet_id` - Sheet ID for strings (eg 1234565432345) (AAA internal tool for localization - just leave it blank if you don't know what this is)


