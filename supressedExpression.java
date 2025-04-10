import java.util.Scanner;
class supressedExpression{
    public static void main(String[] args){
        try(MyResource resource=new MyResource()){
            throw new RuntimeException("Exception in try Block");

        }catch (Exception e){
            System.out.println("Main exception : "+e.getMessage());
            for(Throwable supressed : e.getSuppressed()){
                System.out.println("supressed :"+supressed.getMessage());
            }
        }

    }
}
class MyResource implements AutoCloseable{
    public void close() throws Exception{
        throw new Exception("Error in close method");
    }
}