package atv_pra_cofrinho;

public class Euro extends Moeda{

    //CONSTRUTOR
    public Euro(double valor) {
        super(valor);
    }

    //METODO INFO SOBREESCRITO DA CLASSE MOEDA
    @Override
    public void info() {
        System.out.println("Moeda Euro (€): " + valor);
        System.out.println("-------------------------");
    }

    //METODO CONVERTER SOBREESCRITO DA CLASSE MOEDA
    @Override
    public double converter() {
        double valorConvertidoEuro = valor * 5.65;
        return valorConvertidoEuro;
    }

    //METODO PARA VERIFICAR A REMOÇÃO DA MOEDA ESCOLHIDA
    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()){
            return false;
        }

        Euro objDeEuro = (Euro) obj;

        if(this.valor != objDeEuro.valor){
            return false;
        }
        return true;
    }
}
