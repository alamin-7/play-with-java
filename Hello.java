class Employye{
    int bonus = 1000;

    String getNotification(){
        return "Holiday!";
    }

    void add(){
        System.out.println("Employye");
    }

    public void test(int a){
        System.out.println("Int");
    }

    public void test(double a){
        System.out.println("Double");
    }
}

class Engineer extends Employye{
    int salary;
    int id;
    String name;

    public Engineer(){
        System.out.println("Engineer constructor");
        add(); // overriden method will be called. class c add() will be called
        super.add();
    }

    void add(){
        System.out.println("Engineer");
    }

    void setID(int id){
        this.id = id;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    void setName(String name){
        this.name = name;
    }
    void getEngg(){
        System.out.println("From class Engineer");
    }
}

class Software extends Engineer{
    int salary;
    int id;
    String name;

    // public Software(){
        //super.add();
    //}

    void add(){
        System.out.println("Software");
    }

    void getTest(){
        System.out.println("From Software");
    }
}

class Manager extends Employye{
    int id;
    String name;
    int salary;

    void setID(int id){
        this.id = id;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    void setName(String name){
        this.name = name;
    }
}


class Hello{

    public static void main(String args[]){

       /*  Engineer engineer1 = new Engineer();
        engineer1.setID(1);
        engineer1.setName("Alamin");
        engineer1.setSalary(1000);

        Manager manager1 = new Manager();

        manager1.setID(1);
        manager1.setName("Russel");
        manager1.setSalary(10000);*/

        //System.out.println(engineer1.getNotification());

        Software software1 = new Software();

        //software1.add();

        Employye employye = new Employye();

        employye.test(10);

    }
}