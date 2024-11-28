package domain;

public class Motor
{

    private int potencia;
    private ETipoCombustivel tipoCombustivel;

    public int getPotencia()
    {
        return potencia;
    }

    public void setPotencia(int potencia)
    {
        this.potencia = potencia;
    }

    public ETipoCombustivel getTipoCombustivel()
    {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(ETipoCombustivel tipoCombustivel)
    {
        this.tipoCombustivel = tipoCombustivel;
    }
}
