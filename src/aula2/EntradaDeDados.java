package aula2;
import java.util.Scanner;
public class EntradaDeDados {
    void main (){

        Scanner entradaDeDaados = new Scanner(System.in);

        IO.println("Digite seu nome: ");
        String nome = entradaDeDaados.nextLine();

        IO.println("Digite sua idade: ");
        int idade = entradaDeDaados.nextInt();

        IO.println("Digite seu peso:");
        float peso = entradaDeDaados.nextFloat();

        IO.println("Digite sua altura:  ");
        float altura = entradaDeDaados.nextFloat();

        float imc = peso/(altura*altura);

        IO.println(nome);
        IO.println(idade);
        IO.println(peso);
        IO.println(altura);
        IO.println("Seu imc é: " + imc);

        if (imc <18){
            IO.println(nome +" Seu peso esta abaixo do normal");
        } else if (imc > 18.5 && imc <24.9){
            IO.println(nome +" Seu peso é normal");
        } else if (imc >= 25 && imc <29.9){
            IO.println(nome +" Seu peso esta acima normal, Sobrepeso");
        } else if(imc >= 30 && imc <= 34.9){
            IO.println(nome +" Obesidade grau 1");
        } else if(imc >= 35 && imc <= 39.9){
            IO.println(nome +" Obesidade grau 2");
        } else if(imc >= 40){
            IO.println(nome +" Obesidade grau 3");
        }else{
            IO.println("Peso desconhecido");
        }
    }
}
