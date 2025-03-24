public class NumberFormatExceptionDemo {//Formating Of Any Vriable Is Mismatched...
    public static void main(String[] args) {
        
        String a="Rohan";

        try {
            int x=Integer.parseInt(a);
            System.out.println(x);
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage());//This Method Show You What iS Exception.
        }
    }
    
}
