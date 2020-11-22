# Технологии разработки программного обеспечения
Лабораторная работа №1: создание микросервиса на Spring Boot с базой данных
Иванова Анна Викторовна МБД2031
Целью лабораторной работы является знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов).

# Инструкции по запуску приложения
Для запуска потребуется Docker, Idea, PostgresSQL, git.
Используем БД, которая работаеат на Docker, для подключения используем команду:
```mvn package -D maven.test.skip=true```
docker run -e POSTGRES_PASSWORD=pass -p 5432:5432 postgres
Для сборки maven из командной строки используем:
```mvn package -D maven.test.skip=true```
Производим сборку Docker образа:
```docker build . -t myapi:latest```
Запустим контейнер:
```docker run -p 8080:8080 myapi:latest```
# CURL
Получить hostname:
```curl -X GET http://localhost:8080/api/v1/status```
Получить все данные из таблицы:
```curl -X GET http://localhost:8080/api/v1/pictures```
Получить даннные по id:
```curl -X GET http://localhost:8080/api/v1/pictures/{id}```
Удалить по id:
```curl -X POST http://localhost:8080/api/v1/pictures/{id}```
Добавить новую запись:
```curl -X POST http://localhost:8080/api/v1/ -d {«name»: «Мадонна″, "author": "Леонардо да Винчи", "year": 1513} -H «Content-Type:application/json»```
