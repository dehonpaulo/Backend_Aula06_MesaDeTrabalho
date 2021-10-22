import server.impl.SerieNaoHabilitadaException;
import server.impl.SerieProxy;
import server.impl.SerieService;

public class Teste {
    public static void main(String[] args) {
        SerieService service = new SerieService();
        SerieProxy proxy = new SerieProxy(service);

        try {
            System.out.println(proxy.getSerie("House of Cards"));
            System.out.println(proxy.getSerie("Vikings"));
            System.out.println(proxy.getSerie("Breaking Bad"));
            System.out.println(proxy.getSerie("Game of Thrones"));
            System.out.println(proxy.getSerie("The Boys"));
            System.out.println(proxy.getSerie("The Office"));
        } catch(SerieNaoHabilitadaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
