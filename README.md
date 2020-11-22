# Технологии разработки программного обеспечения
Лабораторная работа №1: создание микросервиса на Spring Boot с базой данных

Иванова Анна Викторовна МБД2031

Целью лабораторной работы является знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов).

# Инструкции по запуску приложения
Для запуска потребуется Docker, Idea, PostgresSQL, git.

Для запуска БД на Docker используем команду:
```docker run -e POSTGRES_PASSWORD=pass -p 5432:5432 postgres```


Для сборки maven из командной строки используем:
```mvnw clean install```

Производим сборку Docker образа:
```docker build . -t myapi:latest```

Запустим контейнер:
```docker run -p 8080:8080 myapi:latest```

# Ендпоинты
GET (GET) ```http://localhost:8080/api/v1/pictures/{id}```

GET ALL(GET) ```http://localhost:8080/api/v1/pictures```

SAVE (POST) ```http://localhost:8080/api/v1/pictures {«name»: «Мадонна″, "author": "Леонардо да Винчи", "year": 1513}```

DELETE (DELETE) ```http://localhost:8080/api/v1/pictures/{id}```

GET HOSTNAME (GET) ```http://localhost:8080/api/v1/status```


# CURL
Получить hostname:
```curl -X GET http://localhost:8080/api/v1/status```

Получить все данные из таблицы:
```curl -X GET http://localhost:8080/api/v1/pictures```

Получить даннные по id:
```curl -X GET http://localhost:8080/api/v1/pictures/{id}```

Удалить по id:
```curl -X DELETE http://localhost:8080/api/v1/pictures/{id}```

Добавить новую запись:
```curl -X POST http://localhost:8080/api/v1/pictures -d {«name»: «Мадонна″, "author": "Леонардо да Винчи", "year": 1513} -H «Content-Type:application/json»```


--------------------------------

Лабораторная работа №3: CI/CD и деплой приложения в Heroku

Целью лабораторной работы является знакомство с CI/CD и его реализацией на примере Travis CI и Heroku.

[Ссылка на развернутое приложение](https://mirabila.herokuapp.com/api/v1/status)
