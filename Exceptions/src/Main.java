import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        tryDivision();

//        try {
//            function1();
//        } catch (Exception e){
//            e.printStackTrace();
//        }

        askForAge();


    }

    private static void askForAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int a = Integer.parseInt(scanner.nextLine());
        try{
            if(a<0 || a>120){
                throw new AgeException("Edad no valida");
            }
            System.out.println("Edad valida");
        } catch (AgeException e){
            System.out.println(e);
        }


    }

    private static void function1() throws Exception{
        function2();
    }

    private static void function2() throws Exception{
//        try{
            function3();
//        } catch (Exception e){
//            throw new Exception("excepcion capturada en la funcion 2");
//        }

    }

    private static void function3() throws Exception{
        throw new Exception("excepcion generada en la funcion 3");
    }

    public static void tryDivision(){
        boolean flag = true;
        while (flag){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el numerador");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Ingrese el denominador");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Resultado: "+dividir(a,b));
                flag=false;
            } catch (NumberFormatException exception){
                System.out.println(exception);
                System.out.println("Ingrese enteros validos para la division");
            } catch (ArithmeticException exception){
                System.out.println(exception);
                System.out.println("Imposible dividir por cero");
            } catch (Exception exception){
                System.out.println(exception);
                System.out.println("Error");
            }
        }
    }

    public static double dividirNoException(int a, int b){
        return a/b;
    }

    public static double dividir(int a, int b) throws Exception{
        return a/b;
    }
}