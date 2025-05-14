import java.util.LinkedList;
public class ListaLigadaClientes {

    Noh inicioLista = null;

    //metodo inserir
    boolean inserir(Cliente c){
        Noh novo = new Noh();
        novo.info = c;

        novo.proximo = inicioLista;
        inicioLista = novo;
        return  true;
    }

    //inserir no final
    void inserirNoFinal(Cliente c){
        Noh novoNoh = new Noh();
        novoNoh.info.add = c; //adiciona no final da lista

    }

    void imprimir(){
        Noh percorre = inicioLista;
        while (percorre != null){
            System.out.println(percorre.info.nome);
            percorre = percorre.proximo;
        }
    }
}
