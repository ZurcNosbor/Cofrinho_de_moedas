package atv_pra_cofrinho;

public class Real extends Moeda{

    //CONSTRUTOR
    public Real(double valor) {
        super(valor);
    }

    //METODO INFO SOBREESCRITO DA CLASSE MOEDA
    @Override
    public void info() {
        System.out.println("Moeda Real (R$): " + valor);
        System.out.println("-------------------------");
    }

    //METODO CONVERTER SOBREESCRITO DA CLASSE MOEDA
    @Override
    public double converter() {
        double valorConvertidoReal = valor;
        return valorConvertidoReal;
    }

    //METODO PARA VERIFICAR A REMOÇÃO DA MOEDA ESCOLHIDA
    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()){
            return false;
        }

        Real objDeReal = (Real) obj;

        if(this.valor != objDeReal.valor){
            return false;

        }
        return true;
    }
}
