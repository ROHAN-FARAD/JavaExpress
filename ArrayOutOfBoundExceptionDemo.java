public class ArrayOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        int a[]={1,2,3,4};

        try {
            int index=10;
            int val=a[index];
            System.out.println("Value At Index"+index+":"+val);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    
}
