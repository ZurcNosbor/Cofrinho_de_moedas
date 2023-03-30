package atv_pra_cofrinho;

import java.util.ArrayList;

public class Cofrinho {

    //ATRIBUTO COLEÇÃO DE MOEDAS
    private ArrayList<Moeda> listaMoedas;


    //CONSTRUTOR
    public Cofrinho() {

        this.listaMoedas = new ArrayList<>();
    }

    //METODO ADICIONAR MOEDA
    public void adicionarMoeda(Moeda moedaAdd){

        this.listaMoedas.add(moedaAdd);
    }

    //METODO REMOVER MOEDA
    public boolean removerMoeda(Moeda moedaDelete){

        return this.listaMoedas.remove(moedaDelete);
    }

    //METODO LISTAR MOEDA
    public void listagemMoedas(){

        if(this.listaMoedas.isEmpty()){
            System.out.println("O cofrinho não contem moedas!!");
        } else  {
            System.out.println("-----LISTA DE MOEDAS-----");
            System.out.println("-------------------------");
            for(Moeda m: this.listaMoedas){
                m.info();
            }
        }
    }

    //METODO CONVERTE MOEDA
    double totalConvertido(){

        if (this.listaMoedas.isEmpty()){
            System.out.println("O cofrinho não contem moedas!!");
        }

        double totalCofrinho = 0;

        for (Moeda m : listaMoedas){
            totalCofrinho += m.converter();
        }

        return totalCofrinho;
    }


}
