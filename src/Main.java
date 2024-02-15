public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua A, 123", "123456789", "123.456.789-00");
        System.out.println("Imposto para pessoa física: " + pessoaFisica.calcularImposto());

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Rua B, 456", "987654321", "12.345.678/0001-00");
        System.out.println("Imposto para pessoa jurídica: " + pessoaJuridica.calcularImposto());
    }
}