import java.util.Scanner;

public class Ativ19_Vetores_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] numeros=new int[5];
        System.out.println("Digite o valor dos cinco números:");
        int resultado=0;
        for (int contador=0;contador<5;contador++){
            numeros[contador]= sc.nextInt();
            resultado+=numeros[contador];
            System.out.println("O valor do vetore será"+resultado);
        }
    }
}
