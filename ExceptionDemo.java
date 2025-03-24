/*Handle The RunTime Error  Destrub The Normal Flow Of Program...
 * Java.lang....
 * The Throwable Class Is The Root Class it Inherits 2 Sub-classes i.e. Exception & Error.
 * In Exception class:-((Checked Exception(CompileTime)(Throw):-)IoException,SQLException,ClassNotFoundException),RunTimeException:-
((UnChecked Exception(RunTime)(Throws):-)ArithmeticException,NullPointerException,NumberFormatException),IndexOutOfBoundException:-
    ArrayIndexOutOfBoundException,StringIndexOutOfBoundException.
 * In Error:-StackOverFlowError,VertualMatchineError,OutOfMemoryError. 
 * Exception KeyWords:-1)try 2)catch 3)finally 4)throw 5)throws
 *   
*/
class ExceptionDemo{
    public static void main(String[] args) {
         try{

            int a=10/0;
            System.out.println(a);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }finally{
            System.out.println("I Am Always Executed If Exception Occures Or Not.... ");
        }
        
    }
} 