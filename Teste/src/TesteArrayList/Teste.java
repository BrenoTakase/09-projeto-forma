package TesteArrayList;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        //INSTANCIAR O OBJETO
        ArrayList<Produto> lista = new ArrayList<Produto>();
        lista.add(new Produto("A", 1));
        lista.add(new Produto("B", 2));
        lista.add(0,new Produto("C", 3));


        //REPETIÇÃO DA LISTA
        for(int i=0;i<lista.size(); i++){
            System.out.println(lista.get(i).id);
        }

        System.out.println("-----------------");

        //OUTRA FORMA DE REPETIÇÃO (PARA CADA)
        for (Produto p: lista){
            System.out.println(p.nome);
        }

        System.out.println("-----------------");

        //COM O TO STRING, O OBJETO DEIXA DE MOSTRAR O ENDEREÇO E COMEÇA A MOSTRAR
        //O QUE VOCÊ CONFIGUROU; NO CASO, "return id + " "+ nome;"
        System.out.println(lista);

    }

}
