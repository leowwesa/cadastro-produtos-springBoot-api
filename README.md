# 🏍 Cadastro de Produtos - API Spring Boot

Api Rest criada para o gerenciamento de produtos permitindo cadastrar, listar, atualizar e deletar

## Tecnologias utilizadas

Utilizei Java versão 25
Site para a criação do arquivo "https://start.spring.io/" - versão 4.0.3
Dependencias utilizadas: Spring Data JPA, MySql Driver, Spring Boot DevTools
Banco de dados relacional MySql
Postman para testes da api local

## Funcionalidades 

- Criar produto
- Listar produto
- Atualizar Produto
- Deletar produto
Obs: Se tiver um schema no MySql o codigo já cria a coluna


## EndPoints / metodos

POST /produto = Cadastrar produto  
GET /produto = Listar produtos  
PUT /produto/{id} = Atualizar produto  
DELETE /produto/{id} = Deletar produto

## Como Rodar

1. Colone o repositorio
2. Utilize uma IDE a que utilizei foi intellij
3. Configure o banco de dados MySql no aplication.properties
4. Rode a aplicação
5. Use o EndPoint "http://localhost:8080/produto" com a api rodando
6. Teste os EndPoints no postman
