import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);


    try{
        IO.println("Digite a primeira nota do aluno");
        int nota1 = sc.nextInt();
        IO.println("Digite a segunda nota do aluno");
        int nota2 = sc.nextInt();

        int media = (nota1 + nota2)/2;

        if ( media >= 6){
            IO.println("Aluno está na média");
        } else if (media <=4) {
            IO.println("Aluno está de recuperação");
        } else if (media >=0) {
            IO.println("Aluno está reprovado");
        }
    } catch (Exception e) {
        IO.println("Digite um número");
    }
}
