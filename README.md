# spring-eureka
Repo dove configuro un server eureka (discovery service)


What is the use of Eureka server in Microservices
AUTHOR:SOUMITRA - WHAT IS THE USE OF EUREKA SERVER IN MICROSERVICES
Here I will explain what is Eureka Server and why do we need to use Eureka server in Microservices Architecture?

What is Eureka server?
The Eureka server is nothing but an implementation of service discovery pattern, where microservices can register themselves so others can discover them.

This server holds information about the client service applications. Each microservice registers into Eureka server and eureka server knows all client applications running on each port and IP address. This server is also known as discovery server.

The @EnableEurekaServer annotation is used to make your Spring Boot application acts as a Eureka Server.

The Eureka Server is a Netflix OSS product, and Spring Cloud offers a declarative way to register and invoke services by Java annotation.

Why do we need Eureka server?
To understand why the Eureka server is needed in microservice architecture, let’s understand how one service calls another service, usually using REST endpoint for communication.

Say we need to call the employee payroll service to get payroll information for an employee. The payroll service is deployed on the host localhost and on 9000 port. Therefore, we get this payroll information for an employee by passing the employee primary key. So we just call the following:

http://localhost:9000/payroll/245676 or http://127.0.0.1/payroll/245676

Where localhost or 127.0.0.1 is the hostname or IP address and payroll is the payroll service context, 245676 is the employee’s primary key.

But wait, this is only possible when you know the hostname or IP address beforehand, then you can configure your URL. So here the hostname or IP address is a constraint or a pain point.

If the IP address of a server/container is fixed, then you can use this approach to easily call your service, but what happens when your IP address and hostname are unpredictable?

Nowadays, on a cloud platform, it is obvious that all servers or containers use dynamic IPs for autoscaling. And the interesting thing is that in microservices architecture, the key principle is that your service can autoscale as per load, so cloud platforms are ideal for microservices.

Therefore as a result, putting dependent service’s IP address in the config file is not a solution. We need a more sophisticated technique to identify the service, and Eureka server steps in here.

Thanks for reading.
