
package lista02;
//ALUNO IAGO DA SILVA OLIVEIRA;

import javafx.scene.chart.XYChart.Data;
import lista02.Conta.TipoOperacao;

public class Operacao extends Conta{
private double valor;
private TipoOperacao tipo;
private Conta conta;
private Data data; 

    public Operacao(double valor, TipoOperacao tipo, Conta conta, Data data) {
        super();
        this.valor = valor;
        this.tipo = tipo;
        this.conta = conta;
        this.data = data;
        
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacao tipo) {
        this.tipo = tipo;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

@Override
    public String toString(){
       return " numero da conta "+ getConta()+ "\n "+getData()+"\n Valor "+getValor()+"\n Tipo de operação "+getTipo(); 
    }

public void gravar(){
System.out.println("\n Operação persistida...."+toString());
} 

    void setData(int i) {
     
    }

}
