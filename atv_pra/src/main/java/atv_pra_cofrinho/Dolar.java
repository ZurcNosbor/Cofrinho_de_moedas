package atv_pra_cofrinho;

public class Dolar extends Moeda{

    //CONSTRUTOR
    public Dolar(double valor) {
        super(valor);
    }

    //METODO INFO SOBREESCRITO DA CLASSE MOEDA
    @Override
    public void info() {
        System.out.println("Moeda Dolar ($): " + valor);
        System.out.println("-------------------------");
    }

    //METODO CONVERTER SOBREESCRITO DA CLASSE MOEDA
    @Override
    public double converter() {
        double valorConvertidoDolar = valor * 5.24;
        return valorConvertidoDolar;
    }

    //METODO PARA VERIFICAR A REMOÇÃO DA MOEDA ESCOLHIDA
    @Override
    public boolean equals(Object obj){

        if(this.getClass() != obj.getClass()){
            return false;
        }

        Dolar objDeDolar = (Dolar) obj;

        if(this.valor != objDeDolar.valor){
            return false;
        }
        return true;
    }
}
