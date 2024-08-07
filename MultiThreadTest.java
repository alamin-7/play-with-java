class Person extends Thread{

     public void run(){
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Person "+i);
            try{Thread.sleep(100);}catch(Exception e){}
        }
     }
}

class Employee extends Thread {

    public void run(){

        for(int i = 1; i <= 5; i++){
            System.out.println("Employee "+i);
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}


public class MultiThreadTest {
    public static void main(String args []){

        Person person1 = new Person();
        Employee employee1 = new Employee();

        person1.start();
        try{Thread.sleep(100);}catch(Exception e){}
        employee1.start();
    }
}
