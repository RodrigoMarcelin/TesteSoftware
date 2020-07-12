package App;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Disabled;

public class LibTestRMSA {

    //Análise de valores limites
    @ParameterizedTest(name="Teste dia {1}")
    @CsvFileSource(resources="/teste_api.csv", delimiter=',')
    public void testDiaApiRMSA(double x, int y, double result){
        Request request = new Request();
        String data = request.jsonRent(new Rent(x,y));
        assertEquals(result, request.createRequest(data));
    }

    //Testes funcionais sistemáticos
    @ParameterizedTest(name="Teste dia {1}")
    @CsvSource(value={"300.00; 3; 270.00", "300.00; 8; 285.00", "300.00; 13; 300.00", "300.00; 23; 308.40", "300.00; 24; 308.70"},
                delimiter=';')
    public void testSisDiaApiRMSA(double x, int y, double result){
        Request request = new Request();
        String data = request.jsonRent(new Rent(x,y));
        assertEquals(result, request.createRequest(data));
    }
    
}
