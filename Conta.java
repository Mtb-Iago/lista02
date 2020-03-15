package lista02;
//ALUNO IAGO DA SILVA OLIVEIRA;
import static lista02.Conta.getGeradorNumero;

public class Conta {

    private static int numeroConta;
    private static double saldo;
    private static int geradorNumero = 0;
    public final static String INSUFICIENTE="";
    public final static String SUCESSO="";

    public Conta() {

    }

    @Override
    public String toString() {
        return Integer.toString(getNumeroConta());
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public static double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getGeradorNumero() {
        return geradorNumero;
    }

    public static void setGeradorNumero(int geradorNumero) {
        Conta.geradorNumero = geradorNumero;
    }

    enum TipoOperacao {
        SAQUE, DEPOSITO;

    }
}

enum ResultadoOperacao {
    INSUFICIENTE("Saldo insuficiente - Saldo..: "),
    SUCESSO("Operação efetuado com sucesso - Novo Saldo..: ");

    private final String msg;

    ResultadoOperacao(String msg) {
        this.msg = msg;

    }

    @Override
    public String toString() {
        return msg;

    }

   
}
