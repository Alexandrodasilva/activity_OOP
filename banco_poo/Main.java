public class Main {
    public static void main(String[] args){
        Banco b = new Banco();
        b.setNumConta(1111);
        b.setDono("jubileu");
        b.AbrirConta("CC");
        b.estadoAtual();

        Banco b1 = new Banco();
        b1.setNumConta(2222);
        b1.setDono("creuza");
        b1.AbrirConta("CP");
        b1.estadoAtual();

        b.Depositar(100);
        b1.Depositar(500);
    }
}
