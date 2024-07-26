# outsera-tests-API-automation
Projeto de Testes API - Outsera

Obs:. Utilizei RestAssured porque é uma biblioteca Java amplamente utilizada para testar APIs REST de forma simples e eficiente. 
Oferece uma API fluente e fácil de usar para fazer requisições HTTP.

## Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado:

- [Java Development Kit (JDK)](https://www.oracle.com/br/java/technologies/downloads/)
- [Apache Maven](https://maven.apache.org/download.cgi)

## Configuração

1. Clone o repositório (ou faça o download do código-fonte):

  - git clone  https://github.com/raialmeida/Tests-API-RESTassured

## Execução

1. Para instalar no repositório local, utilize o seguinte comando:

```
mvn install
```
3. Para executar os testes, utilize o seguinte comando:

```
mvn test
```

4. Para executar o Allure Report, utilize o seguinte comando:

```
mvn allure:serve
```

5. Para executar os testes no container docker, utilize o seguinte comando:

```
docker-compose run --rm api-test mvn test
```
6. Para executar os testes de acordo com o ambiente, utilize o seguinte comando:

```
mvn test -P dev
```
7. Para executar os testes de acordo com a tag, utilize o seguinte comando:

```
mvn test -Dgroups=Smoke
```

_Obs:. Poderá executar os testes via JUnit conforme sua IDE_
## Estrutura do Projeto

- `src/test/java/Config`: Código com as configurações dos testes.
- `src/test/java/com/services`: Pasta que contém os serviços separado, e cada serviços tem suas pastas separada por atribuição.
- `src/test/java/Utils`: Contém arquivo de configuração de variveis de ambiente e utilitários dos testes. 
- `pom.xml`: Arquivo de configuração do Maven.
- `target`: Pasta criada na execução que vão armazenar reports do testes.