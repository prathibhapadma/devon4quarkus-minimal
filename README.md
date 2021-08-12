# devon4quarkus-minimal
This is a minimal devon4quarkus project.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode using: `shell script ./mvnw compile quarkus:dev `

## Access your REST endpoint

curl -w "\n" http://localhost:8080/greeting/{name}

or

curl -w "\n" http://localhost:8080/greeting

## Running tests

You can run tests from your IDE or via Maven. Simply run ./mvnw test or ./mvnw package

