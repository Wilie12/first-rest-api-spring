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
#### Example
![get_single](https://github.com/user-attachments/assets/644458f4-8a55-4398-a42e-6fa1e02ad4ef)
In response we get product with given id.
### Get all products
```
[GET] https://localhost:8080/api/v1/products
```
#### Example
![getAll](https://github.com/user-attachments/assets/1b47c8f6-6f7d-4474-884e-0662ee1229c2)
In response we get list of all products.

### Create a new product
```
[POST] https://localhost:8080/api/vi/products

#body
{
  "name": "Product name"
}
```
#### Example
![created](https://github.com/user-attachments/assets/48b113b5-b51c-49e2-90d2-80eac771cc0c)
In response we get new created product.
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
#### Example
![updated](https://github.com/user-attachments/assets/c5081086-ba68-4729-bb3c-6a7fa6c73a9e)
We send new product name to update product with given id. In response we get updated porduct.
![not_updated](https://github.com/user-attachments/assets/86a201ce-7d74-45a8-9523-56ac6a097f74)
If product with given id doesn't exist we get error message.
### Delete product
```
[DELETE] https://localhost:8080/api/vi/products/1
```
Note: Product must be previously created to delete it.
#### Example
![deleted](https://github.com/user-attachments/assets/e5404e02-0170-4fe8-bd63-81d277cdd69f)
We delete product with given id. In response we get No content status.
![not_deleted](https://github.com/user-attachments/assets/64681d23-607b-4ca2-8b6a-dcb843a2d6f3)
If product with given id doesn't exist we get error message.
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
- Swagger
