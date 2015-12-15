package com.myatminsoe.mmunitsconverter.model;

import java.text.DecimalFormat;

/**
 * Created by myatminsoe on 12/7/15.
 */
public class Weight {

    private double g, kg, oz, lb, ywaylay, ywaygyi, kyattha, peittha;

    private void setImperial(double oz) {
        this.oz = oz;
        lb = oz / 16;
    }

    private void setSI(double g) {
        this.g = g;
        kg = g / 1000;
    }

    private void setMU(double kyattha) {
        this.kyattha = kyattha;
        ywaylay = kyattha * 120;
        ywaygyi = kyattha * 60;
        peittha = kyattha / 100;
    }

    private void MUConvert() {
        setImperial(peittha * 57.6);
        setSI(kyattha * 16.3293);
    }

    private void SIConvert() {
        setImperial(g / 28.3495);
        setMU(g / 16.3293);
    }

    private void ImperialConvert() {
        setSI(oz * 28.3495);
        setMU(oz * 1.7361);
    }

    public void setG(double g) {
        setSI(g);
        SIConvert();
    }

    public void setKg(double kg) {
        setSI(kg * 1000);
        SIConvert();
    }

    public void setOz(double oz) {
        setImperial(oz);
        ImperialConvert();
    }

    public void setLb(double lb) {
        setImperial(lb * 16);
        ImperialConvert();
    }

    public void setYwaylay(double ywaylay) {
        setMU(ywaylay / 120);
        MUConvert();
    }

    public void setYwaygyi(double ywaygyi) {
        setMU(ywaygyi / 60);
        MUConvert();
    }

    public void setKyattha(double kyattha) {
        setMU(kyattha);
        MUConvert();
    }

    public void setPeittha(double peittha) {
        setKyattha(peittha * 100);
        MUConvert();
    }

    public String getG() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return df.format(g);
    }

    public String getKg() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return df.format(kg);
    }

    public String getOz() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return df.format(oz);
    }

    public String getLb() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return df.format(lb);
    }

    public String getYwaylay() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return df.format(ywaylay);
    }

    public String getYwaygyi() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return df.format(ywaygyi);
    }

    public String getKyattha() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return df.format(kyattha);
    }

    public String getPeittha() {
        DecimalFormat df = new DecimalFormat("0.000000");
        return df.format(peittha);
    }
}
