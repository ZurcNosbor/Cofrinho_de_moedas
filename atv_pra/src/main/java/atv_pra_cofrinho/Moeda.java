package atv_pra_cofrinho;

//CLASSE ABSTRATA MOEDA
public abstract class Moeda {

    protected double valor;

    public Moeda(double valor) {

        this.valor = valor;
    }

    //METODO ABSTRATO INFORMÇOES
    public abstract void info();

    //METODOD ABSTRATO PARA CONVERTER
    public abstract double converter();
}
