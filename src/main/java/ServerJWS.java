import com.sun.xml.fastinfoset.sax.SystemIdResolver;
import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

import java.util.function.DoubleToIntFunction;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("webservice deployer sur http://0.0.0.0:9191/");
    }
}
