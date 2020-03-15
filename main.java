package lista02;
//aluno IAGO DA SILVA OLIVEIRA;

import java.util.Scanner;
import javafx.scene.chart.XYChart.Data;
import static lista02.Conta.TipoOperacao.DEPOSITO;
import static lista02.Conta.TipoOperacao.SAQUE;


public class main {

    public static void main(String[] args) {
        double valor = 0;
        double saldo = 0;
        int numeroConta;
        int opcao;
        Scanner leia = new Scanner(System.in);

        Conta conta = new Conta();
        Conta conta2 = new Conta();
        Data data = new Data("maio", 20, 2020);
        Operacao saque = new Operacao(valor, SAQUE, conta, data);
        Banco banco = new Banco();//preciso iniciar a funçao para imprimir novo saldo
        Operacao deposito = new Operacao(valor, DEPOSITO, conta, data);

        System.out.println("Dados conta 1");
        System.out.println("Qual o numero da conta?");
        numeroConta = leia.nextInt();
        conta.setGeradorNumero(numeroConta);

        System.out.println(conta2.getGeradorNumero() + "\n ");

        System.out.println("Qual o saldo inicial da conta?");
        saldo = leia.nextDouble();
        conta.setSaldo(saldo);
        System.out.println(conta.getSaldo());
        
        System.out.println("---------------------");
        System.out.println("Dados conta 2");
         System.out.println("Qual o numero da conta?");
        numeroConta = leia.nextInt();
        conta2.setGeradorNumero(numeroConta);
        System.out.println(conta2.getGeradorNumero() + "\n ");

        System.out.println("Qual o saldo inicial da conta?");
        saldo = leia.nextDouble();
        conta2.setSaldo(saldo);
        System.out.println(conta2.getSaldo());

        //MENU E OPERAÇÕES DE CONTA...
        System.out.println("MENU DE OPÇÃO \n 1-DEPOSITO \n 2-SAQUE \n 3-TRANSFERENCIA");
        opcao = leia.nextInt();
        switch (opcao) {

            case 1: {
                int sair = 0;
                do {
                    System.out.println("Qual o numero da conta?");
                    numeroConta = leia.nextInt();

                    if (conta.getGeradorNumero() == numeroConta) {
//esta sobscrevendo conta com 
                       
                        System.out.println("Qual o valor que deseja depositar?");
                        valor = leia.nextDouble();

                        conta.setNumeroConta(numeroConta);
                        conta.setSaldo(saldo);
                        deposito.setConta(conta);
                        deposito.setData(data);
                        deposito.setTipo(DEPOSITO);
                        deposito.setValor(valor);

                        System.out.println("\n numero da conta " + deposito.getConta().toString() + "\n Saldo da conta " + Operacao.getSaldo() + "\n " + Banco.Deposito(conta, valor) + banco.getSaldoNovo());
                        System.out.println("-----------------------------");
                        deposito.gravar();
                    
                    } else if (conta2.getGeradorNumero() == numeroConta){
                        System.out.println("oewiwjijeiwje");

                        System.out.println("Qual o valor que deseja depositar?");
                        valor = leia.nextDouble();

                        conta2.setNumeroConta(numeroConta);
                        conta2.setSaldo(saldo);
                        deposito.setConta(conta2);
                        deposito.setData(data);
                        deposito.setTipo(DEPOSITO);
                        deposito.setValor(valor);

                        System.out.println("\n numero da conta " + deposito.getConta().toString() + "\n Saldo da conta " + Operacao.getSaldo() + "\n " + Banco.Deposito(conta, valor) + banco.getSaldoNovo());
                        System.out.println("-----------------------------");
                        deposito.gravar();
                        
                        
                    }else{
                        System.out.println("CONTA INEXISTENTE! \n FAVOR DIGITE CONTA VALIDA..: ");
                    }

                } while (conta2.getGeradorNumero() != numeroConta);
                break;
            }

            case 2: {

                int sair = 0;
                do {
                    System.out.println("Qual o numero da conta?");
                    numeroConta = leia.nextInt();

                    if (conta2.getGeradorNumero() == numeroConta) {

                                               
                        System.out.println("Qual o valor que deseja sacar?");
                        valor = leia.nextDouble();

                        conta.setNumeroConta(numeroConta);

                        conta.setSaldo(saldo);
                        System.out.println("");
                        saque.setConta(conta);
                        saque.setTipo(SAQUE);
                        saque.setData(data);
                        saque.setValor(valor);

                        Operacao.getSaldo();

                        System.out.println(Operacao.getSaldo());
                        System.out.println("\n numero da conta " + saque.getConta().toString() + "\n Saldo da conta " + Operacao.getSaldo() + "\n " + Banco.Saque(conta, valor) + banco.getSaldoNovo());
                        System.out.println("-----------------------------");
                        saque.gravar();
                    }else  System.out.println("CONTA INEXISTENTE! \n FAVOR DIGITE CONTA VALIDA..: ");
                } while (conta2.getGeradorNumero() != numeroConta);
                break;
            }
            case 3: {
                Conta aux;
                System.out.println("Tranferencia...");
                 //aux = conta.();
                System.out.println(conta2.getGeradorNumero());
                break;
            }

        }

    }
}
