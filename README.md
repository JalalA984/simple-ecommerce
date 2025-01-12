# Simple SpringBoot App to understand REST

### App implements and supports basic HTTP methods with an in memory H2 Database:

- GET /products
  - Lists all products

- GET /products/{prodId}
  - Get a product by its ID

- POST /products
  - Add a product through JSON body
    - Example:
      {
      "prodId": 101,
      "prodName": "laptop",
      "prodCost": 1000
      }
- PUT /products
  - Update product through JSON body
- DELETE /products/{prodId}
  - Delete a product by its ID

### Future app:

Checkout full fledged app @: [EcommerceBackend](https://github.com/JalalA984/ecommerce-backend)