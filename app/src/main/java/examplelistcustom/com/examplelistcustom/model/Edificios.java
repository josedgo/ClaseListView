package examplelistcustom.com.examplelistcustom.model;

import android.graphics.Bitmap;

public class Edificios {

    public Bitmap imagBuilding;
    public String nameBulding;

    public Edificios(Bitmap imagBuilding, String nameBulding) {
        this.imagBuilding = imagBuilding;
        this.nameBulding = nameBulding;
    }

    public Bitmap getImagBuilding() {
        return imagBuilding;
    }

    public void setImagBuilding(Bitmap imagBuilding) {
        this.imagBuilding = imagBuilding;
    }

    public String getNameBulding() {
        return nameBulding;
    }

    public void setNameBulding(String nameBulding) {
        this.nameBulding = nameBulding;
    }



}
