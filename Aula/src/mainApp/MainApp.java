package mainApp;

import domain.*;


public class MainApp
{

    public static void main(String[] args)
    {

        Nacional fornecedorNacional = new Nacional();
        fornecedorNacional.setId(1);
        fornecedorNacional.setNome("abc");
        fornecedorNacional.setEmail("abc@contato.com");
        fornecedorNacional.setFone("123321");
        fornecedorNacional.setCnpj("343433434");
        printFornecedorNacional(fornecedorNacional);


        Internacinal fornecedorInternacional = new Internacinal();
        fornecedorInternacional.setId(2);
        fornecedorInternacional.setNome("def");
        fornecedorInternacional.setEmail("def@contato.com");
        fornecedorInternacional.setFone("345543");
        fornecedorInternacional.setPais("USA");
        fornecedorInternacional.setNif("343434343");
        printFornecedorInternacional(fornecedorInternacional);

    }

    public static void printFornecedorNacional(Nacional nacional)
    {
        System.out.println("-------Fornecedor Nacional-------");
        System.out.println("ID...: " + nacional.getId());
        System.out.println("Nome.: " + nacional.getNome());
        System.out.println("Email: " + nacional.getEmail());
        System.out.println("Fone.: " + nacional.getFone());
        System.out.println("CNPJ.: " + nacional.getCnpj());
        System.out.println("----------------------------------");
    }

    public static void printFornecedorInternacional(Internacinal internacional)
    {
        System.out.println("-------Fornecedor Internacional-------");
        System.out.println("ID...: " + internacional.getId());
        System.out.println("Nome.: " + internacional.getNome());
        System.out.println("Email: " + internacional.getEmail());
        System.out.println("Fone.: " + internacional.getFone());
        System.out.println("Pais.: " + internacional.getPais());
        System.out.println("NIF..: " + internacional.getNif());
        System.out.println("--------------------------------------");
    }

}
