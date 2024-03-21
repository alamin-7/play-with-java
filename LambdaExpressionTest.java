@FunctionalInterface
interface A{
    void display();
}



public class LambdaExpressionTest {
    public static void main(String[] args) {
        A a = () -> {
            
                System.out.println("This lambda expression");
        };

        A b = new A() {
            public void display(){
                System.out.println("This a anonymous class");
            }
        };
        

        a.display();
        b.display();
    }
}
