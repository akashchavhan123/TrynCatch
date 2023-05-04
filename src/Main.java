class AgeException extends Exception{
    public AgeException(String s){
        super(s);
    }
}


public class Main {
    void ageChecker(int a) throws AgeException{
        if(a<18){
            throw new AgeException("Runtime exception");
        }else{
            System.out.println("Eligible Age");
        }

    }
    public static void main(String[] args) {
        Main m = new Main();
        try{
            m.ageChecker(10);
            m.ageChecker(40);
        }catch (AgeException e){
            e.printStackTrace();
        }
        System.out.println("Handled");
    }
}
