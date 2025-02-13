package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Cliente implements ICliente
{

    protected int id;
    protected String nome;
    protected String celular;
    protected String email;
    protected Date dataCadastro;
    protected Pontuacao pontuacao;
    protected List<Veiculo> veiculos = new ArrayList<>();

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCelular()
    {
        return celular;
    }

    public void setCelular(String celular)
    {
        this.celular = celular;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Date getDataCadastro()
    {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro)
    {
        this.dataCadastro = dataCadastro;
    }

    public Pontuacao getPontuacao()
    {
        return pontuacao;
    }

    public void add(Veiculo veiculo)
    {
        this.veiculos.add(veiculo);
        veiculo.setCliente(this);
    }

    public void remove(Veiculo veiculo)
    {
        this.veiculos.remove(veiculo);
        veiculo.setCliente(null);
    }

    public String getDados()
    {
        StringBuilder dados = new StringBuilder();
        dados.append("ID................: ").append(this.getId()).append("\n");
        dados.append("Nome..............: ").append(this.getNome()).append("\n");
        dados.append("celular...........: ").append(this.getCelular()).append("\n");
        dados.append("Email.............: ").append(this.getEmail()).append("\n");
        dados.append("Data de cadastro..: ").append(this.getDataCadastro()).append("\n");
        dados.append("Pontuação.........: ").append(this.getPontuacao()).append("\n");
        return dados.toString();
    }

    @Override
    public String getDados(String obs)
    {
        StringBuilder dados = new StringBuilder();
        dados.append(getDados()).append("\n").append("Obsevação.........: ").append(obs);
        return dados.toString();
    }

    public String getDadosVeiculos()
    {
        StringBuilder dados = new StringBuilder();
        dados.append("-------------Lista de veiculos-------------").append("\n");
        if(this.veiculos != null && !this.veiculos.isEmpty())
        {
            dados.append("-------------------carro-------------------").append("\n");
            for(Veiculo veiculo : this.veiculos)
            {
                dados.append("Id......: ").append(veiculo.getId()).append("\n");
                dados.append("Placa...: ").append(veiculo.getPlaca()).append("\n");
                dados.append("Modelo..: ").append(veiculo.getModelo().getDescricao()).append("\n");
                dados.append("Marca...: ").append(veiculo.getModelo().getMarca().getNome()).append("\n");
                dados.append("Cor.....: ").append(veiculo.getCor().getNome()).append("\n");
                dados.append("\n");
            }
        }
        else
        {
            dados.append("Nenhum veiculo cadastrado");
        }
        return getDados().toString();
    }


}
