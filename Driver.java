import javax.crypto.interfaces.PBEKey;

public class Driver {
    public static void main(String[] args) {
        PaperBag paperBag = new PaperBag();
        paperBag.setLength(10.0);
        paperBag.setWidth(10.0);
        System.out.println(paperBag.getPrice());
        PlasticBag plasticBag = new PlasticBag();
        plasticBag.setLength(40.0);
        plasticBag.setWidth(10.0);
        plasticBag.setTax(0.2);
        System.out.println(plasticBag.getTax());
        System.out.println(plasticBag.getPrice());
    }
}