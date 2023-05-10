import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int ano;

        System.out.print("Informe o ano: ");
        ano = teclado.nextInt();

        if((ano % 400 == 0 && ano % 4 == 0) || (ano % 4 == 0 && ano % 100 != 0))  {
            System.out.println(ano + " é Bissexto");
        } else {
            System.out.println("O ano não é Bissexto!");
        }
        teclado.close();
        }
    }
