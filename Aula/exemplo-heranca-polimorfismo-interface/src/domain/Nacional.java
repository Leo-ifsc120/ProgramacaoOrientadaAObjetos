package domain;

public class Nacional extends Fornecedor
{

    private String cnpj;

    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }

    @Override
    public String getDados()
    {
        StringBuilder dados = new StringBuilder();
        dados.append("CNPJ.....: ").append(this.cnpj).append("\n");


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
