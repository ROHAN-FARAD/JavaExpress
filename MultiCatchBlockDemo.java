

public class MultiCatchBlockDemo {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            int x=a[5]=30/0;
            System.out.println(a[x]);
        } catch (ArithmeticException a) {
            System.out.println(a);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch(Exception ee){
            System.out.println(ee);
        }
    }
    
}
