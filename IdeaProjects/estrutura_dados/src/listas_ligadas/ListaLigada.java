package listas_ligadas;

public class ListaLigada {

    Noh inicioLista = null;

    boolean inserir(Pessoa p){
        Noh novo = new Noh();
        novo.info = p;

        novo.proximo = inicioLista;
        inicioLista = novo;
        return  true;
    }

    void imprimir(){
        Noh percorre = inicioLista;
        while (percorre != null){
            System.out.println(percorre.info.nome);
            percorre = percorre.proximo;
        }
    }
}
