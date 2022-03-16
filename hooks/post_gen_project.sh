#!/bin/bash

APP_NAME="{{ cookiecutter.app_name }}"
PACKAGE_NAME="{{ cookiecutter.package_name }}"
REPO_NAME="{{ cookiecutter.repo_name }}"
ROOT_DIRECTORY="${PWD%/*}/$REPO_NAME"

echo "*) Project ($APP_NAME) created"

git init > /dev/null
git add .

cd ..

echo "*) GIT setup completed"


echo -e "\n\n\n*************************Project setup completed -> Happy coding*************************\n\n"


