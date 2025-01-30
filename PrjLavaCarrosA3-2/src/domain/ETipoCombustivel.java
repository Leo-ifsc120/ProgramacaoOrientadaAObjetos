package domain;

public enum ETipoCombustivel
{

    GASOLINA(1, "Gasolina"),
    ETANOL(2, "Etanol"),
    FLEX(3, "Flex"),
    DIESEL(4, "Diesel"),
    GNV(5, "GNV"),
    OUTRO(6, "Outro");

    private String descricao;
    private int id;

    private ETipoCombustivel(int id,String descricao)
    {
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public int getId()
    {
        return id;
    }
}
