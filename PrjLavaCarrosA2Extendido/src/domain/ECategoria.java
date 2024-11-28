package domain;

public enum ECategoria
{
    PEQUENO(1, "Pequeno"),
    MEDIO(2, "Médio"),
    GRANDE(3, "Grande"),
    MOTO(4, "Moto"),
    PADRAO(5, "Padrão");

    private String descricao;
    private int id;

    private ECategoria(int id, String descricao)
    {
        this.id = id;
        this.descricao = descricao;
    }
}

