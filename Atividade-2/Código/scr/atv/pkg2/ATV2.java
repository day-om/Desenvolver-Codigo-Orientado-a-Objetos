package atv.pkg2;

import entidades.Hospedagem;
import entidades.Pacotedeviagem;
import entidades.Transporte;
import entidades.Venda;
import java.util.Scanner;

public class ATV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tipo de transporte (Aéreo, Rodoviário, etc): ");
        String tipoTransporte = scanner.nextLine();

        System.out.print("Informe o valor do transporte: ");
        float valorTransporte = scanner.nextFloat();

        System.out.print("Informe o tipo de hospedagem (Hotel, Pousada, etc): ");
        scanner.nextLine();
        String tipoHospedagem = scanner.nextLine();

        System.out.print("Informe o valor da diária da hospedagem: ");
        float valorDiaria = scanner.nextFloat();

        System.out.print("Informe o destino do pacote de viagem: ");
        scanner.nextLine();
        String destino = scanner.nextLine();

        System.out.print("Informe a quantidade de dias da viagem: ");
        int dias = scanner.nextInt();

        System.out.print("Informe o nome do cliente: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.print("Informe a forma de pagamento: ");
        String formaPagamento = scanner.nextLine();

        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);
        Hospedagem hospedagem = new Hospedagem(tipoHospedagem, valorDiaria);
        Pacotedeviagem pacotedeviagem = new Pacotedeviagem(destino, dias, hospedagem, transporte);
        Venda venda = new Venda(nomeCliente, formaPagamento, pacotedeviagem, hospedagem);

        System.out.print("Informe a margem de lucro em porcentagem: ");
        float margemLucro = scanner.nextFloat();

        System.out.print("Informe as taxas adicionais: ");
        float taxasAdicionais = scanner.nextFloat();

        System.out.print("Informe a cotação do dólar: ");
        float cotacao = scanner.nextFloat();

        venda.mostrarInformacoes(margemLucro, taxasAdicionais, cotacao);

        scanner.close();
    }
}
