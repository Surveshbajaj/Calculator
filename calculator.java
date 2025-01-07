
public class calculator{
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        subtraction obj= new subtraction();
        int a=obj.sub(5, 2);
        System.out.println(a);
        addition obj2= new addition();
        int b=obj2.add(5, 7);
        System.out.println(b);

    }
}