public class Main {
    public static void main(String[] args) {

        String str = "hola";
//        System.out.println(invertirPalabra(str, str.length()-1));

        int[] list = new int[]{1,2,3,4,5};
        int aBuscar = 4;
        recorrerArreglo(list,0);
    }

    public static int factorialIterativo(int n){
        int result = 1;
        for (int i = 2; i <= n ; i++) {
            result = result*i;
        }
        return result;
    }

    public static int factorialRecursivo(int n){
        if(n==1){ // Caso base
            return 1;
        } else {
            return n*factorialRecursivo(n-1);
        }
    }

    public static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static String printNums(int n){
        if(n==1){
            return ""+1;
        } else {
            return n+" "+printNums(n-1);
        }
    }

    public static String invertirPalabra(String str, int posicion){
        if(posicion==0){
            return str.charAt(posicion)+"";
        } else {
            return str.charAt(posicion)+invertirPalabra(str,posicion-1);
        }
    }

    public static void recorrerArreglo(int[] list, int i){
        System.out.print(list[i]+" ");
        if(i != list.length-1) recorrerArreglo(list,i+1);

    }
}