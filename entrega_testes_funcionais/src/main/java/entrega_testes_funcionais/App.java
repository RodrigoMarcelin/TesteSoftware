/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package entrega_testes_funcionais;

import entrega_testes_funcionais.Rent;
import entrega_testes_funcionais.Request;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Rodrigo Marcelino Silva Amorim");
        System.out.println("A aplicação está utilizando a API Web - https://aluguebug.herokuapp.com/calc");
        Scanner sc = new Scanner(System.in);
        
        // Entrando com dados
        System.out.println("Informe o valor do aluguel");
        Double valor_nominal = sc.nextDouble();
        System.out.println("Informe o dia do pagamento");
        Integer dia = sc.nextInt();

        //chamando a class Rent
        Rent rent = new Rent(valor_nominal, dia);

        //transformando em Json
        Request request = new Request();
        String data = request.jsonRent(rent);
        double teste = request.createRequest(data);
        System.out.println(teste);

    }
}
