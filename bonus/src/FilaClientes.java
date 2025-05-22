public class FilaClientes {
    Cliente[] fila;
    int inicio;
    int fim;

    void enfileirarComPrioridade(Cliente cliente) {
         //pega a idade do meu cliente verifica se eh menor que 70 anos
        int idade = cliente.idade;
        if(idade < 70){
            inicio++;
        }else{
            fim++;
        }

    }

}

