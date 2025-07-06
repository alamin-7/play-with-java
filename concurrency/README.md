# Java Concurrency

## In this section, we will cover the basics of concurrency. Why do we need concurrency. How our computer handles multiple tasks at the same time. What are threads and how they are used in concurrency.

Before we dive into the concurrency, let's some basic concepts.

Process: A process is an instance of a program that is being executed by the operating system. Each process has its own memory space and resources.

Thread: A thread is a lightweight process that shares the same memory space as other threads in the same process.

So, when we start an application, say intelidj we start a process. This process has its own memory space and resources. Now, if we want to perform some task in the background, we can create a new thread. This new thread will run in the same memory spac as the main process. This is where concurrency comes in.

Concurrency: Concurrency is the ability of a program to execute multiple tasks at the same time. This is achieved by using threads. Here same time means that the tasks are executed in a way that they appear to be executed at the same time. But, in reality, the tasks are executed one after the other by the CPU which is called context switching.

Parallelism: Parallelism is the ability of a program to execute multiple tasks at the same time on multiple processors.

As using multiple threads can improve the performance of an application, it is a good practice to use threads in our application. But, we need to be careful while using threads. Because, threads can make our application more complex and difficult to debug. Also context switching can lead to performance issues.

## How can we deceide when to use threads? or how many threads to create?

In our computer or application we can devide the tasks into two categories: CPU bound tasks and I/O bound tasks.

CPU bound tasks: These are the tasks that require a lot of CPU power. like encryption, compression, etc.
I/O bound tasks: These are the tasks that require a lot of I/O operations. Like reading from a file or network.

Say we have a 4 core CPU and we have a task that requires a lot of CPU power.

In this case, we can create 4 threads. Each thread will run on a different core. This will improve the performance of our application beacsue there will be no context switching.

Now in the same machine, say we have a task that requires a lot of I/O operations. Like fetching large dataset from a database. Then compute the result and store it in database may be. And then send the result to a remote server. In this case, if we have more than 4 threads, may be say 10 threads, that time one thread will be waiting for I/O operation to complete and another thread will have have some CPU time to execute. In this way, we can improve the performance of our application.

## Creating threads in java

In thread can be create in two ways: using Thread class or using Runnable interface.

Using Thread class:

```java

public class MyThread extends Thread {
    public void run() {
        System.out.println("Hello from MyThread");
        }


public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();
    }
}

```

Using Runnable interface:

```java

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from MyRunnable");
        }

    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
```
We should use Runnable interface instead of Thread class beacuse it is more flexible and efficient. Below there is some points that why we should use Runnable interface:

i. When a class extends Thread, it can only extend one class. That class can not extend any other class. But when a class implements Runnable, it can extend any class. So it is more flexible.

ii. We can seperate the taks that a thread will perform from the thread itself. That means we can create a class that implements Runnable and then pass that class to a Thread object. This is more efficient because we can reuse the same class in different threads.
