package BootCamp_Odevler.odev_1_1;


import java.awt.Color;
import java.util.Date;

public final class Car {
    private Model model;
    private int yil;
    private int kacKisilik;
    private Date uretimTarihi;
    private int km;
    private Color color;

    public Car(Model model, int yil, int kacKisilik, Date uretimTarihi, int km, Color color) {
        this.model = model;
        this.yil = yil;
        this.kacKisilik = kacKisilik;
        this.uretimTarihi = uretimTarihi;
        this.km = km;
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public int getYil() {
        return yil;
    }

    public int getKacKisilik() {
        return kacKisilik;
    }

    public Date getUretimTarihi() {
        return uretimTarihi;
    }

    public int getKm() {
        return km;
    }

    public Color getColor() {
        return color;
    }
}

enum Model {
    TOYOTA(1),
    FORD(2);

    private int model;

    Model(int i) {
        this.model = i;
    }

    public int getModel() {
        return model;
    }

    public String getModelName() {
        String modelName = null;
        switch (this){
            case TOYOTA -> {
                modelName = "TOYOTA";
                break;
            }
            case FORD -> {
                modelName = "FORD";
                break;
            }
        }
        return modelName;
    }
}
