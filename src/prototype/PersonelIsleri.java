package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sefamertkaya
 */
public class PersonelIsleri {

    private static Map<String, Personel> personelMap =
            new HashMap<String, Personel>();

    static {
        personelMap.put("ep", new EgitimPersoneli());
        personelMap.put("ip", new IdariPersonel());
    }

    public static Personel personelDetay(String personelAdi) {
        return (Personel) personelMap.get(personelAdi).clone();
    }

    public static void personelListesi() {
        for (Map.Entry<String, Personel> entry : personelMap.entrySet()) {
            String key = entry.getKey();
            Personel value = entry.getValue();
            System.out.print(key);
            System.out.print(" ");
            System.out.println(value);
        }
    }


}
