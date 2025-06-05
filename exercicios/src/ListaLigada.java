public class ListaLigada {
    Noh nohInicio;
    int produto = 1;

    int calcularProduto(int valor){

        while(atual.proximo != null){
            produto *= atual.valor;
            atual = atual.proximo;
        }
        return produto;
    }
}
