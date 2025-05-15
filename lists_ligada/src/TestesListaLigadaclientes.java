public class TestesListaLigadaclientes {
    public static void main(String[] args) {
        ListaLigadaClientes lista = new ListaLigadaClientes();

        Cliente c1 = new Cliente();
        c1.nome = "João";
        c1.cpf = "111.111.111-11";
        c1.email = "joao@gmail.com";

        lista.inserir(c1);


    }
}
