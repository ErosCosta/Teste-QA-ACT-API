# Projeto QA - Dog API (Completo)

Projeto automatizado para validar a **Dog API** utilizando **Java 11, JUnit 5, RestAssured, Gradle e Allure**.

## Endpoints testados
- `GET /breeds/list/all`
- `GET /breed/{breed}/images`
- `GET /breeds/image/random`

## Como executar
```
./gradlew clean test
```

## Relatório Allure
Resultados em:
```
build/allure-results
```

## Execução com relatório visual
```
allure serve build/allure-results
```
