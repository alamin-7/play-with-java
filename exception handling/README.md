# Exception Handling in Java

Exception handling is a mechanism to handle runtime errors or exceptions in Java. It allows us to handle unexpected events during the execution of a program and prevent it from crashing.

In java we can handle exceptions in two ways:

1. try catch block:

try block: This block contains the code that might throw an exception.
catch block: This block contains the code that will be executed if an exception is thrown.

try {
    // code that might throw an exception
} catch {
    // code that will be executed if an exception is thrown
}

In java, there are many types of exceptions, some of them are:

1. ArithmeticException: This exception is thrown when we try to divide a number by zero.
2. ArrayIndexOutOfBoundsException: This exception is thrown when we try to access an array with an index that is
3. NullPointerException: This exception is thrown when we try to use a null object reference.
4. ClassCastException: This exception is thrown when we try to cast an object to a class that it is

We can handle this excetion by their class name. If there is any posibility that, there will be multiple exception, then we can handle it by using multiple catch block. Then use the generic exception class `Exception`. This way all the exception will be handled. Below is the example of it:


```java
private static final Logger logger = Logger.getLogger(MyClass.class.getName());


try{
    int [] a = {1,2,3,4,5};
    System.out.println(a[10]);
    String str = null;
    System.out.println(str.length());
} catch (ArrayIndedOutOfBoundException ex){
    logger.severe("A null pointer exception occured. please check your data);
} catch (NullPointerException ex){
    logger.severe("A null pointer exception occured. please check your data);
} catch (Exception ex){
    logger.severe("An exception occured. please check your data);
}

```
finally block: This block is used to execute some code regardless of whether an exception is thrown or not. like database connection close, file close etc.


Uncheck Exception: These are the exception that are not checked at compile time. These are the exception that are thrown at runtime. Like `ArithmeticException`, `NullPointerException` etc.

Checked Exception: These are the exception that are checked at compile time. These are the exception that are thrown at compile time. Like `IOException`, `SQLException` etc.
