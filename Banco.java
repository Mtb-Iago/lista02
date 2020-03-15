package lista02;
//ALUNO IAGO DA SILVA OLIVEIRA
public class Banco extends Conta {
   public static double SaldoNovo;
   
    public Banco() {
        super();

    }

    public static ResultadoOperacao Saque(Conta saldo, double valor) {
        
        if (getSaldo() < valor) {
             SaldoNovo = getSaldo();
            return ResultadoOperacao.INSUFICIENTE;
        }else
          SaldoNovo = getSaldo() - valor;
            return ResultadoOperacao.SUCESSO;

    }
    public static ResultadoOperacao Deposito(Conta saldo,double valor){
        SaldoNovo = getSaldo() + valor;
        return ResultadoOperacao.SUCESSO;
    }

    public double getSaldoNovo() {
        return SaldoNovo;
    }

}
