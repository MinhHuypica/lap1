package com.vn.lap1_ar2;

public class model {
    private String tilte, des;

    public model(String tilte, String des) {
        this.tilte = tilte;
        this.des = des;
    }

    public model() {
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }


    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
