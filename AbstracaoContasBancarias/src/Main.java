import java.util.Scanner;
void main() {
//    Criando o Scanner
    Scanner sc = new Scanner(System.in);
// Criando classe

    ContaCorrente contaCorrente = new ContaCorrente();
    ContaPoupanca contaPoupanca = new ContaPoupanca();
    ContaPessoaJuridica contaPessoaJuridica = new ContaPessoaJuridica();

    

//    Recebendo o tipo de conta
    IO.println("Bem vindo ao Banco Java, qual seu tipo de conta: ");
    String tipoConta = sc.nextLine();

    if (tipoConta.equals("CC")){
        IO.println("Conta corrente, deseja sacar, depositar ou olhar saldo ");
        String escolhaAcao = sc.nextLine();
        if (escolhaAcao.equals("sacar")) {
            IO.println("Você pode sacar 20, 40, 60, 80, 100, 150 ou 200");
            int saque = sc.nextInt();
            contaCorrente.sacar(saque);
        } else if (escolhaAcao.equals("depositar")){
            IO.println("Você pode depositar 20, 40, 60, 80, 100, 150 ou 200");
            int deposito = sc.nextInt();
            contaCorrente.depositar(deposito);
        } else if (escolhaAcao.equals("olhar saldo")){
            IO.println("Seu saldo atual é "+ contaCorrente.getSaldo());
        }
    }else if (tipoConta.equals("CP")){
            IO.println("Conta corrente, deseja sacar, depositar ou olhar saldo ");
            String escolhaAcao = sc.nextLine();
            if (escolhaAcao.equals("sacar")){
                IO.println("Você pode sacar 20, 40, 60, 80, 100, 150 ou 200");
                int saque = sc.nextInt();
                contaPoupanca.sacar(saque);
            } else if (escolhaAcao.equals("sacar")){
                IO.println("Você pode depositar 20, 40, 60, 80, 100, 150 ou 200");
                int deposito = sc.nextInt();
                contaPoupanca.depositar(deposito);
            } else if (escolhaAcao.equals("olhar saldo")){
                IO.println("Seu saldo atual é "+ contaPoupanca.getSaldo());
            }
    }else if (tipoConta.equals("PJ")){
        IO.println("Conta corrente, deseja sacar, depositar ou olhar saldo ");
        String escolhaAcao = sc.nextLine();
        if (escolhaAcao.equals("sacar")){
            IO.println("Você pode sacar 20, 40, 60, 80, 100, 150 ou 200");
            int saque = sc.nextInt();
            double taxasacar = saque - 1.50;
            contaPessoaJuridica.sacar(taxasacar);
        } else if (escolhaAcao.equals("depositar")){
            IO.println("Você pode depositar 20, 40, 60, 80, 100, 150 ou 200");
            int deposito = sc.nextInt();
            contaPessoaJuridica.depositar(deposito);
        } else if (escolhaAcao.equals("olhar saldo")){
            IO.println("Seu saldo atual é "+ contaPessoaJuridica.getSaldo());
        }
    }else{
        IO.println("Conta selecionado não existente");
    }

}
