
public class Main {


    public static void main(String[] args) {

//        AteNumero(5);
       AteNumeroZero(5);
//        contadorRecursivo(1,4);

    }
    static void AteNumero(int numero) {

        if (numero < 2) {
            System.out.println(numero);
        }else{
            AteNumero(numero - 1);
            System.out.println(numero);
        }
    }

    static void AteNumeroZero(int numeroAteZero) {

        if (numeroAteZero < 1) {

            System.out.println(numeroAteZero);
        }else{
            System.out.println(numeroAteZero);
            AteNumeroZero(numeroAteZero - 1);


        }
    }

    static void contadorRecursivo(int n, int numero){
        if (n <= numero) {
            System.out.println(n);
            contadorRecursivo(n + 1, numero);
        }
        if (n < numero){
            System.out.println(n);
        }
    }
}


