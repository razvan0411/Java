# Spring Tutorial 1
## Tutorial:
[Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)

## Issues
1. "Unable to find main class" at compile
    - create **MainApplication** class which contain **main** method
    - add **@SpringBootApplication** and call **SpringApplication.run(...)** method
   ``` java
   @SpringBootApplication
   public class MainApplication {
   
       public static void main(String[] args) {
           SpringApplication.run(MainApplication.class, args);
       }
   }
   ```

## Code Changes
1. Use DDD (Domain Driven Design)
    - create **GettingService** interface
    - create **getting** package which contain **SimpleGreetingService** class
    - move business logic in **SimpleGreetingService**:
        - template and counter variable
        - the constructor call
2. Add Lombok annotations
    - add **@Data** annotation which generate constructors, getter and setter