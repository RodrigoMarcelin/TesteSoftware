package entrega_testes_funcionais;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Request {

    public String jsonRent(Rent rent) {
        JSONObject json = new JSONObject(rent);
        String string = json.toString();
        return string;
    }
    

    public double createRequest(String jsonRent) {
       CloseableHttpClient client = HttpClients.createDefault();
       try {
           URIBuilder builder = new URIBuilder("https://aluguebug.herokuapp.com/calc");
           builder.setParameter("dados", jsonRent);
           HttpGet request = new HttpGet(builder.build());
           CloseableHttpResponse response = client.execute(request);
           HttpEntity entity = response.getEntity();
           if (entity != null) {
               String result = EntityUtils.toString(entity);
               System.out.println(result);
               result = result.replace("\\", "");
               result = result.replace("\"{", "{");
               JSONObject obj = new JSONObject(result);
               return (double) obj.get("valor_calculado");               
           }
       } catch (Exception e) {
           System.out.println("Não deu");
       }
       return -1;
    }
}