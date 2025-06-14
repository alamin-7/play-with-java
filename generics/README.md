# Generics in Java

Generics in java provides the feature us to write polymorphic code which will allow us to write code that can work with different data types. 

We can achive this generic bevibour by writhing a class and use instance variable of type Object as all classes in java are subclass of Object class. But this is not the best way to do this as it will not provide any type safety. We have to typecast the object to the required type which can lead to ClassCastException at runtime.

Let's understand this using class Phone:

```java

public class Phone {

    private Object processor;
    private Object ram;

    // constructor with processor and ram parameter, setters and getters here

}

// cliet code

public class Client {
    
    public static void main(String[] args) {

        Phone phone = new Phone("snapdragon", 8);

        String  processor = (String) phone.getProcessor(); // required typecasting
        int ram = (int) phone.getRam(); // required typecasting
    }
}

```

To avoid typecasting we can use generics.

```java

public class Phone<T, R> {
    private T processor;
    private R ram;
}

// In client code

public class Client {

    public static void main(String [] args){

        Phone <String, Integer> phone = new Phone<>("Snapdragon", 8);

        // No need for typecasting

        String processor = phone.getProcessor();
        int ram = phone.getRam();

    }
}
```

We can also use generics in method also.

```java

public class Main {

    public static void main(String [] args){

        String [] names = {"Alamin", "Arafat", "Rakib"};
        
        printTheArray();

        int [] nums = {1, 2, 3, 4, 5};

        printTheArray();

    }

    public static <T> void printTheArray(T [] array){

        for (T element : array) {
            System.out.println(element);
        }
    }
}
```

In collection we can use generics to make the collection more flexible and safe.

Without generics:

```java

List list = new ArrayList(); 

// here we can add any type of object
list.add("Alamin");
list.add(123);
list.add(true);

// so we need to check the type of object at runtime

```

With generics:

```java

List<String> list = new ArrayList<>();

// here we can only add String type object
list.add("Alamin");
list.add(123); // compile time error

// so we don't need to check the type of object at runtime

```
Covariance: Covariance is a feature of generics in Java that a child reference can be assigned to a parent refernce. But this is not allowed in collections. But we can use wildcard ? to achieve this.

```java

String s = "Hello";
Object o = s; // allowed

List<String> list = new ArrayList<>();
List<Object> objList = list; // not allowed

// but we can use wildcard ? to achieve this

List<? extends Object> list = new ArrayList<>();
List<Object> objList = (List<Object>)list; // allowed

// this is upper bound wildcard

```
There is a drawback in upper bound wildcards. We can't add any object to the list. We can only read the list.

To add any object to the list we can use lower bound wildcard. But we can't use lower bound wildcard with raw type. We can only use it with parameterized type.

Say we have a method called addNumbers which will add Integer type of numbers and all super type of Interger object like Number, Object.

```java

addNumbers(new ArrayList<>());

public void addNumbers(List<? super Integer> list) {

    list.add(1);
    list.add(2);

    // list.add(1.23)  compile time error because 1.23 is not Integer type object

}
```