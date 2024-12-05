package domain;

public class Internacinal extends Fornecedor
{

    private String pais;
    private String nif;


    public String getPais()
    {
        return pais;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }

    public String getNif()
    {
        return nif;
    }

    public void setNif(String nif)
    {
        this.nif = nif;
    }

    @Override
    public String getDados()
    {
        StringBuilder dados = new StringBuilder();
        dados.append("Nif......: ").append(this.nif).append("\n");
        dados.append("Pais.....: ").append(this.pais).append("\n");




        return dados.toString();
    }

    @Override
    public String getDados(String msg)
    {
        StringBuilder dados = new StringBuilder();
        dados.append(getDados()).append("\n").append("Mensagem: ").append(msg);

        return dados.toString();
    }

}
