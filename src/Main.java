
public class Main {


    public static void main(String[] args) {

//        AteNumero(5);
//        AteNumeroZero(5);

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

    static void ContadorRecursivo(int numero) {
       
        if (numero == 1) {
            System.out.println(numero);
        } else {
            System.out.println(numero );
            ContadorRecursivo(numero - 1);
            System.out.println(numero);
        }
    }
}


