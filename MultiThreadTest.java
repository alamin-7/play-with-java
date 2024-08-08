class Test extends Thread{

}

/*class Person implements Runnable{

    public void run(){

        for(int i = 1; i <= 5; i++){
            System.out.println("Person "+i);
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}*/

/*class Employee implements Runnable {

    public void run(){

        for(int i = 1; i <= 5; i++){
            System.out.println("Employee "+i);
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}*/


public class Main {
    public static void main(String args []){

      /* Person person1 = new Person();
       Employee employee1 = new Employee();*/

    /*    Runnable obj1 = () ->
           {
                for(int i = 1; i <= 5; i++){
                    System.out.println("Person "+i);
                    try{Thread.sleep(100);}catch(Exception e){}
                }
           };*/

  /*      Runnable obj2 = () ->
            {

                for(int i = 1; i <= 5; i++){
                    System.out.println("Employee "+i);
                    try{Thread.sleep(100);}catch(Exception e){}
                }
            };*/


        Thread p1 = new Thread(() ->
        {
            for(int i = 1; i <= 5; i++){
                System.out.println("Person "+i);
                try{Thread.sleep(100);}catch(Exception e){}
            }
        });
        Thread e1 = new Thread(() ->{
            for(int i = 1; i <= 5; i++){
                System.out.println("Employee "+i);
                try{Thread.sleep(100);}catch(Exception e){}
            }
        });

        p1.start();
        try{Thread.sleep(100);}catch(Exception e){}
        e1.start();
    }
}
