# Sistema de Gerenciamento de Tarefas

## Requisitos
- Java 11+
- Maven
- MySQL

## Configuração
1. Clone o repositório.
2. Configure o banco de dados no arquivo `application.properties`.
3. Rode o comando `mvn spring-boot:run` para iniciar a aplicação.

## Endpoints Principais
- `POST /api/lists`: Cria uma nova lista.
- `GET /api/lists/{id}`: Retorna uma lista específica.
