package client;

public class Pontuacao
{

    private int quantidade;


    public int saldo()
    {
        return quantidade;
    }

    public void adicionar(int valor)
    {

        this.quantidade = this.quantidade + valor;

    }

    public void subtrair(int valor)
    {

        this.quantidade = this.quantidade - valor;

    }

}
