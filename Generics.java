

class Employee<S, T>{
    Student name;
    Teacher ID;

    void displayName(){
        System.out.println();
    }

    void displayID(){
        System.out.println(ID.getClass().getName());
    }
}

class Student {
    int id;
    String name;

    public Student(String name){
        this.name = name;
    }

    void displayName(){
        System.out.println(this.name);
    }
}

class Teacher {
    int id;
    String name;

    Teacher(int id){
        this.id = id;
    }

    void displayID(){
        System.out.println(this.id);
    }
}




public class Generics {
    public static void main(String[] args) {

        Employee<Student, Teacher> employee = new Employee<>();
        employee.name = new Student("Alamin");
        employee.ID = new Teacher(101);

        employee.name.displayName();
        employee.ID.displayID();
    }
}
