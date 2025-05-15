
public class ListaLigadaClientes {

    Noh inicioLista = null;

    //metodo inserir
    boolean inserir(Cliente c){
        Noh novo = new Noh();
        novo.dado = c;

        novo.proximo = inicioLista;
        inicioLista = novo;
        return  true;
    }

    //inserir no final da lista
    void inserirNoFinal(Cliente c){
        Noh novoNoh = new Noh();
        novoNoh.dado = c;
        novoNoh.proximo = null; // último elemento aponta para null

        if(inicioLista == null){
            // Lista está vazia, o novo nó será o primeiro
            inicioLista = novoNoh;
        } else {
            // Percorre até o último nó
            Noh atual = inicioLista;
            while(atual.proximo != null){
                atual = atual.proximo;
            }
            // O último nó agora aponta para o novo nó
            atual.proximo = novoNoh;
        }
    }


    void imprimir(){
        Noh percorre = inicioLista;
        while (percorre != null){
            System.out.println(percorre.dado.nome);
            percorre = percorre.proximo;
        }
    }
}
