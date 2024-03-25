// class Emp{

//     public Emp(int x, int y){
//         x = 5;
//         y = 9;
//     }
//     void show(){

//     }
// }

//////////////////  losse cupling //////////////

interface Emp{
    void show();
}

class Engi implements Emp{

    public Engi(int x, int y){

    }

    public void show(){
        System.out.println("Engineer");
    }
}

//////////////// tight cupling ////////////////////

class Address{
    int road;
    String house;

    public void setHouse(String house) {
        this.house = house;
    }
    public void setRoad(int road) {
        this.road = road;
    }
    public String getHouse() {
        return house;
    }
    public int getRoad() {
        return road;
    }
    

}

class St {
    Address address;
    String name;
    int id;

    public St(){

    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void show(){
        System.out.println("Student name is "+ this.name +" and address is" + address.getHouse());
    }
}


public class DependencyInjection {
    
    public static void main(String[] args) {

        Emp eng = new Engi(5, 8);

        eng.show();

        Address address1 = new Address();

        address1.setHouse("House 1461");

        St student = new St();
        student.setId(10);
        student.setName("Alamin");
        student.setAddress(address1); // setter injection

        student.show();
        
    }
}
