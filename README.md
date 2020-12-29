# API Spec

## Authentication

All API must use this authentication

Request:
- Header :
    - X-Api-Key : "your secret api key"

## Create Product
Request :
- Method : POST
- Endpoint : `/api/product`
- Header :
    - Content-Type: application/json
    - Accept: applications/json
- Body :
```json
{
    "id" : "string, unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer"
}
```

Response :
```json
{
    "code" : "number",
    "status" : "string",
    "data" : {
        "id" : "string, unique",
        "name" : "string",
        "price" : "long",
        "quantity" : "integer",
        "createdAt" : "date",
        "updatedAt" : "date"
    } 
}
```

## Get Product
Request :
- Method : GET
- Endpoint : `/api/product/{id_product}`
- Header :
    - Accept: applications/json

Response :
```json
{
    "code" : "number",
    "status" : "string",
    "data" : {
        "id" : "string, unique",
        "name" : "string",
        "price" : "long",
        "quantity" : "integer",
        "createdAt" : "date",
        "updatedAt" : "date"
    } 
}
```

## Update Product
Request :
- Method : PUT
- Endpoint : `/api/product/{id_product}`
- Header :
    - Content-Type: application/json
    - Accept: applications/json
- Body :
```json
{
    "name" : "string",
    "price" : "long",
    "quantity" : "integer"
}
```

Response :
```json
{
    "code" : "number",
    "status" : "string",
    "data" : {
        "id" : "string, unique",
        "name" : "string",
        "price" : "long",
        "quantity" : "integer",
        "createdAt" : "date",
        "updatedAt" : "date"
    } 
}
```

## List Product
Request :
- Method : GET
- Endpoint : `/api/product`
- Header :
    - Accept: applications/json
    - Query Param :
        - size : number,
        - page : number

Response :
```json
{
    "code" : "number",
    "status" : "string",
    "data" : [
        {
            "id" : "string, unique",
            "name" : "string",
            "price" : "long",
            "quantity" : "integer",
            "createdAt" : "date",
            "updatedAt" : "date"
        },
        {
            "id" : "string, unique",
            "name" : "string",
            "price" : "long",
            "quantity" : "integer",
            "createdAt" : "date",
            "updatedAt" : "date"
        }
    ]
}
```

## Delete Product
Request :
- Method : DELETE
- Endpoint : `/api/product/{id_product}`
- Header :
    - Accept: applications/json

Response :
```json
{
    "code" : "number",
    "status" : "string"
}
```