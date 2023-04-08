package S1_04_N2;

import java.util.Scanner;

public class MainCalculoDNI {
    static char[] abc = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    //Variables
    static String dni = "";
    static int numeroDni = 0;
    static char letra = ' ';
    static char rightLetter = ' ';
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("✏️Introduce tu DNI: ");
        dni = sc.nextLine();
        output(allCheck(dni));

    }

    static int keepNumber(String dni){
        return numeroDni = Integer.parseInt(dni.substring(0, (dni.length() - 1)));
    }

    static char keeoLetter(String dni){
        letra = dni.charAt(dni.length() - 1);
        return letra = Character.toUpperCase(letra); //Imponemos que sea letra mayusucla
    }

    static char checkLetterRightMethod(int number) {
        int residu = 0;
        residu = (int) number % 23;
        return abc[residu];
    }

    static boolean allCheck(String dni){
        int number = keepNumber(dni);
        char letra = keeoLetter(dni);
        char rightLetter = checkLetterRightMethod(number);
        return (letra == rightLetter);
    }

    static void output(Boolean asnwer){
        if(asnwer){
            System.out.println("✅ DNI Correcto");
        }else{
            System.out.println("❌ DNI Incorrecto");
            System.out.println("La letra correcta es: " + checkLetterRightMethod(numeroDni));
        }
    }

}