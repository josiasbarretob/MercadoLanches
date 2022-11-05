package src.model;

import java.util.Scanner;

public class Pedido extends Produto {
    Scanner leia = new Scanner(System.in);

    public Pedido(String nome, double preco, Scanner leia) {
        super(nome, preco);
        this.leia = leia;
    }

    public void VisualizarPedido() {
        super.visualizar();
    }
    public Produto produto(Produto produto) {
      // produto.setPreco();
        return produto;
    }
}
