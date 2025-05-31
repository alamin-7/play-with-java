# Garbage Collection in Java

When an object is not being referenced by any variable, it is eligible for garbage collection. The garbage collector periodically collects these objects to free up memory.

We can forcefully call the garbage collector using the `System.gc()` method, but it's not guaranteed to run immediately.

Also we can make an object as eligible for garbage collection by setting it to null. But it's not a good practice to do so because it can lead to unexpected behavior if the object is still being used somewhere in the code.

`object = null`

Type of garbage collection in Java is:

1. Serial gc
2. Parallel gc
3. Concurrent mark and sweep gc
4. G1 gc
5. Z gc/ Shenandoah 
