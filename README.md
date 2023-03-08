This repository is used for educational purposes and the capabilities of the system described in the requirement section will be developed over time

# Requirements of the system: Order management system

## System description

Create an order management backend capable of tracking orders as well as returning aggregate statistics about them.

### Endpoints required:

* create/edit :heavy_check_mark:
* mark cancelled :x:
* mark delivered :x:
* return given an id :x:
* return all given a status :x:

### Statistical capabilities

* return number of in progress orders :x:
* return the average delivery time of delivered orders :x:

# Arquitecture

![image](https://user-images.githubusercontent.com/81703261/223745522-39acfa12-87a0-4188-a524-ce937a65f502.png)

# How to run the service

### Run in Intellij
To run the service locally in Intellij, you can run the com.ordermanagementsystem.Application file.

You should add the following env variable to the configuration created, which must contain the information of a running DB

* DB_URL
* DB_USERNAME
* DB_PASSWORD
