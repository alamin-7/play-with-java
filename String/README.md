# String in java

String is a sequence of characters represented as object in java.

We can create a string in java in two ways:

1. using String literal: `String str = "Hello";`

2. uing new keyword: `String str = new String("Hello");`

When we use String literal, java create a string object in the string constant pool which is a seperate portion of Heap area. This string constant pool help reuse the string object and reduce the memory usage.


`String str1 = "Hello";`

`String str2 = "Hello";`

In this case, there will be one object in the string constant pool with the value "Hello" and both str1 and str2 will point to this object.
While using new keyword, everytime we create a new object in the heap area. So, in this case, there will be two objects in the heap area with the value "Hello" and both str1 and str2 will point to different objects.

In this way, using literal is more efficient than using new keyword beacuse whenever we will create object "Hello" with another variable , it will point to the same object in the string constant pool. But when we use new keyword , it will create a new object in the heap area. So, it will increase the memory usage.

`str1 = str1+ " World";` // This will create a new object "Hello World" in the heap area not in the string constant pool. This concatenation happened
using StringBuilder.

`str2 = "Hello World";`

`str1 == str2 // false`

Creating a new object while concatenating a string make the string immutable in java.

For better performance, we should use string literal for creating a string object in java.

We can forcefully create a string object in the string constant pool using intern() method.

String str1 = new String("Hello").intern();
string str2 = "Hello";

str1 == str2 // true

