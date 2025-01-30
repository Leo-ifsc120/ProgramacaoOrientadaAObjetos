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

        Marca marca2 = new Marca();
        Modelo modelo2 = new Modelo();
        Veiculo veiculo2 = new Veiculo();
        Cor cor2 = new Cor();



        System.out.print("Informe a marca do carro: ");
        marca = leia.next();
        marca2.setNome(marca);
        modelo2.setMarca(marca2);

        System.out.print("Informe o modelo do carro: ");
        descricao = leia.next();
        modelo2.setDescricao(descricao);
        veiculo2.setModelo(modelo2);

        System.out.print("Informe a cor do carro: ");
        cor = leia.next();
        cor2.setNome(cor);
        veiculo2.setCor(cor2);


        System.out.println("Informe a categoria do carro\n2 - Pequeno\n2 - Medio\n3 - Grande\n4 - Moto\n5 - Padrao");
        categoria = leia.next();
        switch(categoria)
        {
            case "1":
                veiculo2.getModelo().setCategoria(ECategoria.PEQUENO);
                break;
            case "2":
                veiculo2.getModelo().setCategoria(ECategoria.MEDIO);
                break;
            case "3":
                veiculo2.getModelo().setCategoria(ECategoria.GRANDE);
                break;
            case "4":
                veiculo2.getModelo().setCategoria(ECategoria.MOTO);
                break;
            case "5":
                veiculo2.getModelo().setCategoria(ECategoria.PADRAO);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.print("Informe a potência do motor: ");
        potencia = leia.nextInt();
        leia.nextLine();
        veiculo2.getModelo().getMotor().setPotencia(potencia);

        System.out.println("Selecione o tipo de combustivel do carro\n2 - Gasolina\n2 - Etanol\n3 - Flex\n4 - Diesel\n5 - GNV\n6 - Outro");
        combustivel = leia.next();
        switch(combustivel)
        {
            case "1":
                veiculo2.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.GASOLINA);
                break;
            case "2":
                veiculo2.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.ETANOL);
                break;
            case "3":
                veiculo2.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.FLEX);
                break;
            case "4":
                veiculo2.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.DIESEL);
                break;
            case "5":
                veiculo2.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.GNV);
                break;
            case "6":
                veiculo2.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.OUTRO);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.print("Informe a placa do carro: ");
        placa = leia.next();
        veiculo2.setPlaca(placa);


        Marca marca3 = new Marca();
        Modelo modelo3 = new Modelo();
        Veiculo veiculo3 = new Veiculo();
        Cor cor3 = new Cor();



        System.out.print("Informe a marca do carro: ");
        marca = leia.next();
        marca3.setNome(marca);
        modelo3.setMarca(marca3);

        System.out.print("Informe o modelo do carro: ");
        descricao = leia.next();
        modelo3.setDescricao(descricao);
        veiculo3.setModelo(modelo3);

        System.out.print("Informe a cor do carro: ");
        cor = leia.next();
        cor3.setNome(cor);
        veiculo3.setCor(cor3);


        System.out.println("Informe a categoria do carro\n3 - Pequeno\n2 - Medio\n3 - Grande\n4 - Moto\n5 - Padrao");
        categoria = leia.next();
        switch(categoria)
        {
            case "1":
                veiculo3.getModelo().setCategoria(ECategoria.PEQUENO);
                break;
            case "2":
                veiculo3.getModelo().setCategoria(ECategoria.MEDIO);
                break;
            case "3":
                veiculo3.getModelo().setCategoria(ECategoria.GRANDE);
                break;
            case "4":
                veiculo3.getModelo().setCategoria(ECategoria.MOTO);
                break;
            case "5":
                veiculo3.getModelo().setCategoria(ECategoria.PADRAO);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.print("Informe a potência do motor: ");
        potencia = leia.nextInt();
        leia.nextLine();
        veiculo3.getModelo().getMotor().setPotencia(potencia);

        System.out.println("Selecione o tipo de combustivel do carro\n3 - Gasolina\n2 - Etanol\n3 - Flex\n4 - Diesel\n5 - GNV\n6 - Outro");
        combustivel = leia.next();
        switch(combustivel)
        {
            case "1":
                veiculo3.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.GASOLINA);
                break;
            case "2":
                veiculo3.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.ETANOL);
                break;
            case "3":
                veiculo3.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.FLEX);
                break;
            case "4":
                veiculo3.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.DIESEL);
                break;
            case "5":
                veiculo3.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.GNV);
                break;
            case "6":
                veiculo3.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.OUTRO);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.print("Informe a placa do carro: ");
        placa = leia.next();
        veiculo3.setPlaca(placa);

        print(veiculo1);

        print(veiculo2);

        print(veiculo3);

        leia.close();

    }

    public static void print(Veiculo veiculo)
    {

        System.out.println("Placa.......: " + veiculo.getPlaca());
        System.out.println("Modelo......: " + veiculo.getModelo().getDescricao());
        System.out.println("Categoria...: " + veiculo.getModelo().getCategoria().getId() + veiculo.getModelo().getCategoria().getDescricao());
        System.out.println("Cor.........: " + veiculo.getCor().getNome());
        System.out.println("Marca.......: " + veiculo.getModelo().getMarca().getNome());
        System.out.println("Motor.......: cv " + veiculo.getModelo().getMotor().getPotencia());
        System.out.println("Combustível.: " + veiculo.getModelo().getMotor().getTipoCombustivel().getId() + veiculo.getModelo().getMotor().getTipoCombustivel().getDescricao());

    }

}
