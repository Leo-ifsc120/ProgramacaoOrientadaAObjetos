package domain;

public class Funcionario
{

    private int matricula;
    private String nome;
    private float salarioBase;
    private static float valeRefeicao;

    public Funcionario(int matricula, String nome, float salarioBase)
    {



    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getValeRefeicao() {
        return valeRefeicao;
    }

    public static void valeRefeicao(float valeRefeicao) {
        Funcionario.valeRefeicao = valeRefeicao;
    }
}
