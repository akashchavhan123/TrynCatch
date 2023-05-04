public class A {
    static {
        System.out.println("Static Block A");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            throw new ClassNotFoundException("This only Msg ");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
