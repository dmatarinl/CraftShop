# CraftShop
## Creating and stores orders with their references
For individual or industry level. 

**These are some examples of possible outputs.**

```
********************************
       OUTPUT OF STEP 1
********************************
List of materials (in the order they were introduced)
-----------------------------------------------------
Name: Silver	Price per m2: 4480,00 euros
Name: Wood	Price per m2: 570,00 euros
Name: Plastic	Price per m2: 350,00 euros
```
```
********************************
       OUTPUT OF STEP 2
********************************
List of products (in the order they were introduced)
----------------------------------------------------
Product id: C01
Product description: 
  Circle made on Silver
  Material price: 4480,00 euros per m2
  Radius: 4,50 cm
Product price: 28,50 euros

Product id: C02
Product description: 
  Circle made on Silver
  Material price: 4480,00 euros per m2
  Radius: 3,50 cm
Product price: 17,24 euros

Product id: C03
Product description: 
  Circle made on Wood
  Material price: 570,00 euros per m2
  Radius: 4,50 cm
Product price: 3,63 euros

Product id: R01
Product description: 
  Rectangle made on Silver
  Material price: 4480,00 euros per m2
  Length: 3,50 cm
  Width: 7,50 cm
Product price: 11,76 euros

Product id: R02
Product description: 
  Rectangle made on Plastic
  Material price: 350,00 euros per m2
  Length: 3,50 cm
  Width: 7,50 cm
Product price: 0,92 euros

Product id: R03
Product description: 
  Rectangle made on Wood
  Material price: 570,00 euros per m2
  Length: 3,50 cm
  Width: 7,50 cm
Product price: 1,50 euros
```
```
********************************
       OUTPUT OF STEP 3
********************************
List of orders (in the order they were introduced)
--------------------------------------------------
Order ref: O001
Order date: 22/03/2018
Order information:
Product:
Product id: C01
Product description: 
  Circle made on Silver
  Material price: 4480,00 euros per m2
  Radius: 4,50 cm
Product price: 28,50 euros
Quantity: 100 units
Total amount: 2.850,06 euros

Order ref: O002
Order date: 23/03/2018
Order information:
Product:
Product id: C02
Product description: 
  Circle made on Silver
  Material price: 4480,00 euros per m2
  Radius: 3,50 cm
Product price: 17,24 euros
Quantity: 150 units
Total amount: 2.586,17 euros

Order ref: O003
Order date: 25/03/2018
Order information:
Product:
Product id: R01
Product description: 
  Rectangle made on Silver
  Material price: 4480,00 euros per m2
  Length: 3,50 cm
  Width: 7,50 cm
Product price: 11,76 euros
Quantity: 50 units
Total amount: 588,00 euros

Order ref: O004
Order date: 28/03/2018
Order information:
Product:
Product id: R03
Product description: 
  Rectangle made on Wood
  Material price: 570,00 euros per m2
  Length: 3,50 cm
  Width: 7,50 cm
Product price: 1,50 euros
Quantity: 100 units
Total amount: 149,62 euros
```
```
********************************
       OUTPUT OF STEP 4
********************************
List of products within a price range (in order of introduction)
----------------------------------------------------------------
Minimum price: 2,00 euros
Maximum price: 20,00 euros

Product id: C02
Product description: 
  Circle made on Silver
  Material price: 4480,00 euros per m2
  Radius: 3,50 cm
Product price: 17,24 euros

Product id: C03
Product description: 
  Circle made on Wood
  Material price: 570,00 euros per m2
  Radius: 4,50 cm
Product price: 3,63 euros

Product id: R01
Product description: 
  Rectangle made on Silver
  Material price: 4480,00 euros per m2
  Length: 3,50 cm
  Width: 7,50 cm
Product price: 11,76 euros
```
```
********************************
       OUTPUT OF STEP 5
********************************
Trying to remove Order with reference code: O002
Order object has been removed
List of remaining orders (in order of introduction)
---------------------------------------------------
Order ref: O001
Order date: 22/03/2018
Order information:
Product:
Product id: C01
Product description: 
  Circle made on Silver
  Material price: 4480,00 euros per m2
  Radius: 4,50 cm
Product price: 28,50 euros
Quantity: 100 units
Total amount: 2.850,06 euros

Order ref: O003
Order date: 25/03/2018
Order information:
Product:
Product id: R01
Product description: 
  Rectangle made on Silver
  Material price: 4480,00 euros per m2
  Length: 3,50 cm
  Width: 7,50 cm
Product price: 11,76 euros
Quantity: 50 units
Total amount: 588,00 euros

Order ref: O004
Order date: 28/03/2018
Order information:
Product:
Product id: R03
Product description: 
  Rectangle made on Wood
  Material price: 570,00 euros per m2
  Length: 3,50 cm
  Width: 7,50 cm
Product price: 1,50 euros
Quantity: 100 units
Total amount: 149,62 euros


Trying to remove Order with reference code: O022
ERROR: Order object not found
```
