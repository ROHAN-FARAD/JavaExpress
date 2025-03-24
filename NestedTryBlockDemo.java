public class NestedTryBlockDemo {
    @SuppressWarnings("null")//optional.
    public static void main(String[] args) {
        try {
            String a1=null;
            System.out.println(a1.length());
            try {
                int a=10/0;
                System.out.println(a);
                
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } catch (NullPointerException ee) {
            System.out.println(ee);
        }
    }
    
}
