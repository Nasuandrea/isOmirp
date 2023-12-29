// Ejercicio 9 - Omirp

public class Main {
    public static void main(String[] args) {

        System.out.println(isOmirp(100));

    }
    public static Boolean isPrime(int numero){
        if (numero < 2) {
            return false;
        }
        for (int n = 2; n <= Math.sqrt(numero); n++) {
            if (numero % n == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isOmirp (int numero){
        String number = String.valueOf(numero);
        int cont=0;
        char[] digitos = number.toCharArray();
        char[] digitos2 =new char [digitos.length];
        //intento de invertir el array de digitos
        for (int i = digitos.length-1; i==0; i--) {
            digitos2[cont] = digitos[i];
            System.out.println(digitos2[cont]);
            //esto no imprime nada no se porque
            cont++;
        }


        return true;
    }
}