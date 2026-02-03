package aula3;

import java.util.Scanner;
public class ifElse {
    static void main() {
        IO.println("Digite a primeira nota");
        Scanner notas = new Scanner(System.in);
        double nota1 = notas.nextDouble();
        IO.println("Digite a segunda nota");
        double nota2 = notas.nextDouble();
        IO.println("Digite a terceira nota");
        double nota3 = notas.nextDouble();

        double somaNotas = (nota1+nota2+nota3)/3;

        if (somaNotas < 4){
            IO.println("Você foi reprovado ");
            return;
        }
        if (somaNotas <= 6) {
            IO.println("Você está de recuperação");
            return;
        }if (somaNotas > 6){
            IO.println("Você foi aprovado");
            return;
        } else {
            System.out.println("erro");
            IO.println("erro");
        }
    }
}
