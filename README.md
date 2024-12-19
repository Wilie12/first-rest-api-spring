# Product Spring REST API
Product Spring REST API is a simple CRUD Spring Boot Web application providing products for teaching purposes, sample codes and tests.
## Resources
There is only one main resource related with products:

- https://localhost:8080/api/v1/products
## How to use
This REST API provides all CRUD operations.
### Get a single product
```
[GET] https://localhost:8080/api/v1/products/1
```
Note: Product must be previously created to fetch it.
### Get all products
```
[GET] https://localhost:8080/api/v1/products
```
### Create a new product
```
[POST] https://localhost:8080/api/vi/products

#body
{
  "name": "Product name"
}
```
### Update product
```
[PUT] https://localhost:8080/api/vi/products/1

#body
{
  "id": 3,
  "name": "New product name"
}
```
Note: Product must be previously created to update it.
### Delete product
```
[DELETE] https://localhost:8080/api/vi/products/1
```
Note: Product must be previously created to delete it.
## All available routes
### Products
```
{
  "id": Number,
  "name": String
}
```
#### GET
- /api/v1/products [Get all products]
- /api/v1/products/{id} [Get a single product with given id]
#### POST
- /api/v1/products [Create a new product]
#### PUT
- /api/v1/products/{id} [Update existing product with given id]
#### DELETE
- /api/v1/products/{id} [Delete existing product with given id]
## Technologies
- Spring Boot 3
- Java
- Spring Web
- H2 Database
- Spring Data JPA
- Spring Boot DevTools
