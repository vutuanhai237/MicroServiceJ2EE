Reference: https://github.com/ndtai/learning-microservice

This example is modified so that doesn't need databases and proxy.

## 1. Example's architecture diagram

![Ảnh1](https://user-images.githubusercontent.com/43202025/96558614-222bb580-12e6-11eb-92d1-c34aab17c7e2.png)

1.1. Forex microservice (located at port 8000) receive  2 params FROM and TO and response conversionMultiple metric

![image](https://user-images.githubusercontent.com/43202025/96559303-0e348380-12e7-11eb-8723-4d6c4ff62652.png)

1.2. Currency conversion microservice (located at port 8100) receive 3 params FROM, TO and QUANTITY and response (conversionMultiple x quantity) with conversionMultiple is being requested from Forex microservice.

![image](https://user-images.githubusercontent.com/43202025/96559650-869b4480-12e7-11eb-992d-f4c2c13fc61c.png)

1.3. Naming server Eureka: manage all microservices that register to it.

![image](https://user-images.githubusercontent.com/43202025/96559938-d974fc00-12e7-11eb-9c65-af2090de2d7b.png)

## 2. Fully's architecture diagram: authentication, business logic, logging, database, ...

![Ảnh1](https://user-images.githubusercontent.com/43202025/97383719-d1791580-1900-11eb-9772-efd918fc59cf.png)

