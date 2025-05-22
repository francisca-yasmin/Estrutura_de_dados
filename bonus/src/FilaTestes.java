//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FilaTestes {
    public static void main(String[] args) {
            FilaTestes filaClientes = new FilaTestes();

            Cliente c1 = new Cliente();
            c1.nome = "camilly";
            c1.cpf = "123.456.789-00";
            c1.idade = 19;

            filaClientes.enfileirarComPrioridade(c1);
    }
}