package domain;

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

    public int subtrair(int valor)
    {

            if(this.quantidade - valor > 0)
            {

                this.quantidade = this.quantidade - valor;

            }

            return this.quantidade;
    }

}
