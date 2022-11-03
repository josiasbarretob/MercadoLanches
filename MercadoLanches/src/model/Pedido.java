package model;

import java.io.StringReader;
import java.util.Scanner;

public class Pedido extends Produto {
    Scanner leia = new Scanner(System.in);

    public Pedido(String nome, double preco, double quantidade) {
        super(nome, preco, quantidade);

    }

    public void VisualizarPedido() {
        super.VisualizarPedido();
    }
    public Produto produto(Produto produto) {
       produto.setPreco();
        return produto;
    }
}
