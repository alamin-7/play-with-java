# Java Memory

Java memory is part of the java virtual machine(JVM). It has five areas:

1. Heap area: This is the area where all the objects and instance variable are stored. It is divided into two sub-areas:

- Young Generation: This is the area where new objects are stored. 
   Young Generation is further divided into two sub-areas: Edgen Generation and Survivor Generation.
  i. Edgen Generation: This is the area where new objects are stored.
  ii. Survivor Generation: This is the area where objects that have survived the garbage collection process are stored.

- Old Generation: This is the area where objects that are not garbage collected are stored.

 `Phone phone = new Phone();` // object creation in Eden Space (Heap)

 2. Stack area: This is the area where all the primitive data types and method call stack are stored.

 Say there is a method name createObject in class Phone.

 `Phone phone = new Phone();`

 When this createObject methid is being called , a method frame will be pushed into the stack and the reference varible will be inside the method 
frame. After method execution, the method frame will be popped out from the stack and the object will be eligible for garbage collection.

3. Method arae: Class metadata, static variables, method bytecode

4. Native area: Native code, native method, native library

5. PC register: Program counter register, it points to the current instruction being executed.


