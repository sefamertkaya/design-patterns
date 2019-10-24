package BuilderPattern;

public class SiparisManager {

    private SiparisBuilder builder;

    public Araba createOrder(String marka,String model,String renk,int beygirgucu){

        if(marka.equals("Ford")){
            builder =new FordSiparisBuilder();
        }
        else if(marka.equals("Audi")){
            builder=new AudiSiparisBuilder();
        }
        this.builder.setMarka(marka);
        this.builder.setBeygirGucu(beygirgucu);
        this.builder.setModel(model);
        this.builder.setRenk(renk);
        return this.builder.getAraba();

    }

    public void printOrder(){

        System.out.println(this.builder.getAraba().toString());

    }


}
