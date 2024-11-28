package mainApp;

import domain.*;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        String marca, descricao, cor, placa, combustivel, categoria;
        int potencia;
        Scanner leia = new Scanner(System.in);
        Marca marca1 = new Marca();
        Modelo modelo1 = new Modelo();
        Veiculo veiculo1 = new Veiculo();
        Cor cor1 = new Cor();



        System.out.print("Informe a marca do carro: ");
        marca = leia.next();
        marca1.setNome(marca);
        modelo1.setMarca(marca1);

        System.out.print("Informe o modelo do carro: ");
        descricao = leia.next();
        modelo1.setDescricao(descricao);
        veiculo1.setModelo(modelo1);

        System.out.print("Informe a cor do carro: ");
        cor = leia.next();
        cor1.setNome(cor);
        veiculo1.setCor(cor1);

        System.out.println("Informe a categoria do carro\n1 - Pequeno\n2 - Medio\n3 - Grande\n4 - Moto\n5 - Padrao");
        categoria = leia.next();
        switch(categoria)
        {
            case "1":
                veiculo1.getModelo().setCategoria(ECategoria.PEQUENO);
                break;
            case "2":
                veiculo1.getModelo().setCategoria(ECategoria.MEDIO);
                break;
            case "3":
                veiculo1.getModelo().setCategoria(ECategoria.GRANDE);
                break;
            case "4":
                veiculo1.getModelo().setCategoria(ECategoria.MOTO);
                break;
            case "5":
                veiculo1.getModelo().setCategoria(ECategoria.PADRAO);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.print("Informe a potência do motor: ");
        potencia = leia.nextInt();
        leia.nextLine();
        veiculo1.getModelo().getMotor().setPotencia(potencia);

        System.out.println("Selecione o tipo de combustivel do carro\n1 - Gasolina\n2 - Etanol\n3 - Flex\n4 - Diesel\n5 - GNV\n6 - Outro");
        combustivel = leia.next();
        switch(combustivel)
        {
            case "1":
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.GASOLINA);
                break;
            case "2":
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.ETANOL);
                break;
            case "3":
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.FLEX);
                break;
            case "4":
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.DIESEL);
                break;
            case "5":
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.GNV);
                break;
            case "6":
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.OUTRO);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.print("Informe a placa do carro: ");
        placa = leia.next();
        veiculo1.setPlaca(placa);

        print(veiculo1);

    }

    public static void print(Veiculo veiculo)
    {

        System.out.println("Placa.......: " + veiculo.getPlaca());
        System.out.println("Modelo......: " + veiculo.getModelo().getDescricao());
        System.out.println("Cor.........: " + veiculo.getCor().getNome());
        System.out.println("Marca.......: " + veiculo.getModelo().getMarca().getNome());
        System.out.println("Motor.......: cv " + veiculo.getModelo().getMotor().getPotencia());
        System.out.println("Combustivel.: " + veiculo.getModelo().getMotor().getTipoCombustivel());

    }

}
