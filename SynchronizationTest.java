class Counter {

    private int count = 0;

    public synchronized void countIncrement(){
        this.count++;
    }

    int getCount () {
        return this.count;
    }
 }



class Employee{

    synchronized static void printEmployeeNumber(int n){

        for(int i = 1; i <= 5; i++){
            System.out.println(n*i);

            try{
                Thread.sleep(400);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {

    public void run(){
        Employee.printEmployeeNumber(5);
    }
}

class Thread2 extends Thread {

    public void run(){
        Employee.printEmployeeNumber(10);
    }
}

class Thread3 extends Thread {

    public void run(){
        Employee.printEmployeeNumber(15);
    }
}

class Thread4 extends Thread {

    public void run(){
        Employee.printEmployeeNumber(20);
    }
}


public class Main {
    public static void main (String t[]) throws InterruptedException{

        //   --------------  Using Synchronize method ----------

       /* Thread t1 = new Thread(){
            public void run(){
                employee1.printEmployeeNumer(5);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                employee1.printEmployeeNumer(10);
            }
        };

        Thread t3 = new Thread(){
            public void run(){
                employee2.printEmployeeNumer(6);
            }
        };

        Thread t4 = new Thread(){
            public void run(){
                employee2.printEmployeeNumer(11);
            }
        };


----------------------------------------------------------

 --------------- static Synchronize -------------------------- */

      /*  Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3= new Thread3();
        Thread4 t4= new Thread4();

        t1.start();
        System.out.println("Main thread");
        t2.start();
        t3.start();
        t4.start();*/

        Counter counter = new Counter();

        Thread t1 = new Thread(counter::countIncrement);
        Thread t2 = new Thread(counter::countIncrement);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: "+counter.getCount());

    }

}
