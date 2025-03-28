# Desafio API Rest do programa DIO Avanade 2025

Este projeto faz parte do desafio da DIO Avanade 2025 e, basicamente, consiste no desenvolvimento de uma API REST para o gerenciamento de estoque de uma loja. 

## Diagrama de classes
```mermaid 
classDiagram
    class Product {
        -String name
        -String sku
        -double price
        -int quantity
    }
    
    class Supplier {
        -String name
        -String contact
        -String phone
    }
    
    class Feature {
        -String icon
        -String description
    }
    

    Product "1" --> "1" Supplier
    Product "1" --> "*" Feature
```

