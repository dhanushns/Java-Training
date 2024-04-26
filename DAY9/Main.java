package DAY9;

public class Main {

    public static void main(String[] args){

        try{
            //int a = 10/0;
            //int[] b = new int[5];
            //b[5] = 5/0;
            //System.out.println("Result : " + b[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is occured");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Error");
        }
        catch(Exception e) {
            System.out.print("Parent Class Exception");
        }



        //.............

        try{
            displayException();
            throw new ArithmeticException("New Exception occurred");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //...........

    }

    public static int displayException() throws ArithmeticException{
        int a= 5/0;
        return a;
    }

}
