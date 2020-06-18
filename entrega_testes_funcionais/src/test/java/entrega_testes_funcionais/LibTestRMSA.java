package entrega_testes_funcionais;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibTestRMSA {

    //testes do dia 1
    @Test
    public void testDia0RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00,0));
        assertEquals(-1, request.createRequest(data));
    }
    @Test
    public void testDia1RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00,1));
        assertEquals(270.0, request.createRequest(data));
    }
    @Test
    public void testDia2RMSA() {
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00,2));
        assertEquals(270.0, request.createRequest(data));
    }

    //testes do dia 5
    @Test
    public void testDia4RMSA() {
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 4));
        assertEquals(270.0, request.createRequest(data));
    }
    @Test
    public void testDia5RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 5));
        assertEquals(270.0, request.createRequest(data));
    }

    //testes do dia 6
    @Test
    public void testDia6RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 6));
        assertEquals(285.0, request.createRequest(data));
    }
    @Test
    public void testDia7RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 7));
        assertEquals(285.0, request.createRequest(data));
    }

    //testes do dia 10
    @Test
    public void testDia9RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 9));
        assertEquals(285.0, request.createRequest(data));
    }
    @Test
    public void testDia10RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 10));
        assertEquals(285.0, request.createRequest(data));
    }

    //testes do dia 11
    @Test
    public void testDia11RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 11));
        assertEquals(300.0, request.createRequest(data));
    }
    @Test
    public void testDia12RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 12));
        assertEquals(300.0, request.createRequest(data));
    }

    //testes do dia 15
    @Test
    public void testDia14RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 14));
        assertEquals(300.0, request.createRequest(data));
    }
    @Test
    public void testDia15RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 15));
        assertEquals(300.0, request.createRequest(data));
    }

    //testes do dia 16
    @Test
    public void testDia16RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 16));
        assertEquals(306.3, request.createRequest(data));
    }
    @Test
    public void testDia17RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 17));
        assertEquals(306.6, request.createRequest(data));
    }

    //testes do dia 30
    @Test
    public void testDia29RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 29));
        assertEquals(310.2, request.createRequest(data));
    }
    @Test
    public void testDia30RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 30));
        assertEquals(310.5, request.createRequest(data));
    }
    @Test
    public void testDia31RMSA(){
        Request request = new Request();
        String data = request.jsonRent(new Rent(300.00, 31));
        assertEquals(-1, request.createRequest(data));
    }
}
