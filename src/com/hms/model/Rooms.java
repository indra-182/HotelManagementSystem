package com.hms.model;

public class Rooms {

    private String nomorKamar;
    private String tipeKamar;
    private String tipeKasur;
    private int harga;
    private String status;

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public String getTipeKasur() {
        return tipeKasur;
    }

    public void setTipeKasur(String tipeKasur) {
        this.tipeKasur = tipeKasur;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
