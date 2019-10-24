package FactoryPattern;

public abstract class Araba {
    private String marka=null;
    private String model=null;
    private int beygirGucu=0;


    public Araba(String marka, String model, int beygirGucu) {
        this.marka = marka;
        this.model = model;
        this.beygirGucu = beygirGucu;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }
}
