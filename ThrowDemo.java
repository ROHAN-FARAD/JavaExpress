
public class ThrowDemo {

   public static void valid(int age){
        if(age<18)
        {
            throw new ArithmeticException("Person is not vallid for vote...");
        }else{
            System.out.println("Person is valid for vote...");
        }
    }
    public static void main(String[] args) {
        ThrowDemo.valid(15);

    }
    
}
