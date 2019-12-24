package prototype;

/**
 * @author sefamertkaya
 */
public class Client {

    public static void main(String[] args) {
        PersonelIsleri.personelDetay("ep").personelMesai();
        PersonelIsleri.personelDetay("ep").personelMesai();
        PersonelIsleri.personelDetay("ip").personelMesai();
        PersonelIsleri.personelListesi();
        Personel ep1 = PersonelIsleri.personelDetay("ep");
        Personel ep2 = PersonelIsleri.personelDetay("ep");
        Personel ep3 = PersonelIsleri.personelDetay("ep");
        System.out.println(ep1);
        System.out.println(ep2);
        System.out.println(ep3);
    }


}

