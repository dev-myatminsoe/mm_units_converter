package com.myatminsoe.mmunitsconverter.model;

import java.text.DecimalFormat;

/**
 * Created by myatminsoe on 12/7/15.
 */
public class Length {

    private double in = 0, ft = 0, yard = 0, mile = 0, cm = 0, m = 0, km = 0, sanchi = 0, hnan = 0, mayaw = 0, letthit = 0, maik = 0, htwa = 0, taung = 0, lan = 0, ta = 0, outhaba = 0, kawtha = 0, gawout = 0, yuzana = 0;

    private void setImperial(double in) {
        this.in = in;
        ft = this.in / 12;
        yard = ft / 3;
        mile = yard / 1760;
    }

    private void setSI(double cm) {
        this.cm = cm;
        m = this.cm / 100;
        km = m / 1000;
    }

    private void setMU(double htwa) {
        this.htwa = htwa;
        maik = this.htwa * 1.5;
        letthit = maik * 8;
        mayaw = letthit * 4;
        hnan = mayaw * 6;
        sanchi = hnan * 10;
        taung = this.htwa / 2;
        lan = taung / 4;
        ta = lan / 1.75;
        outhaba = ta / 20;
        kawtha = outhaba / 20;
        gawout = kawtha / 4;
        yuzana = gawout / 4;
    }

    private void MUConvert() {
        setImperial(htwa * 9);
        setSI(htwa * 22.86);
    }

    private void SIConvert() {
        setImperial(.0254 * m);
        setMU(cm / 22.86);
    }

    private void ImperialConvert() {
        setSI(ft * 30.48);
        setMU(in / 9);
    }


    public void setCm(double cm) {
        setSI(cm);
        SIConvert();
    }


    public void setM(double m) {
        setSI(m * 100);
        SIConvert();
    }

    public void setKm(double km) {
        setSI(km * 100000);
        SIConvert();
    }

    public void setSanchi(double sanchi) {
        setMU(sanchi / 2880);
        MUConvert();
    }

    public void setHnan(double hnan) {
        setMU(hnan / 288);
        MUConvert();
    }

    public void setMayaw(double mayaw) {
        setMU(mayaw / 48);
        MUConvert();
    }

    public void setLetthit(double letthit) {
        setMU(letthit / 12);
        MUConvert();
    }

    public void setMaik(double maik) {
        setMU(maik / 1.5);
        MUConvert();
    }

    public void setHtwa(double htwa) {
        setMU(htwa);
        MUConvert();
    }

    public void setTaung(double taung) {
        setMU(taung * 2);
        MUConvert();
    }

    public void setLan(double lan) {
        setMU(lan * 8);
        MUConvert();
    }

    public void setTa(double ta) {
        setMU(ta * 14);
        MUConvert();
    }

    public void setOuthaba(double outhaba) {
        setMU(outhaba * 280);
        MUConvert();
    }

    public void setGawout(double gawout) {
        setMU(gawout * 5600 * 4);
        MUConvert();
    }

    public void setYuzana(double yuzana) {
        setMU(yuzana * 22400 * 4);
        MUConvert();
    }

    public void setKawtha(double kawtha) {
        setMU(kawtha * 5600);
        MUConvert();
    }

    public void setIn(double in) {
        setImperial(in);
        ImperialConvert();
    }

    public void setFt(double ft) {
        setImperial(ft * 12);
        ImperialConvert();
    }

    public void setYard(double yard) {
        setImperial(yard * 3 * 12);
        ImperialConvert();
    }

    public void setMile(double mile) {
        setImperial(mile * 63360);
        ImperialConvert();
    }

    public String getIn() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(in);
    }

    public String getFt() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(ft);
    }

    public String getYard() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(yard);
    }

    public String getMile() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(mile);
    }

    public String getM() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(m);
    }

    public String getKm() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(km);
    }

    public String getSanchi() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(sanchi);
    }

    public String getHnan() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(hnan);
    }

    public String getMayaw() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(mayaw);
    }

    public String getLetthit() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(letthit);
    }

    public String getMaik() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(maik);
    }

    public String getHtwa() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(htwa);
    }

    public String getTaung() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(taung);
    }

    public String getLan() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(lan);
    }

    public String getTa() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(ta);
    }

    public String getOuthaba() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(outhaba);
    }

    public String getKawtha() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(kawtha);
    }

    public String getGawout() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(gawout);
    }

    public String getYuzana() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(yuzana);
    }

    public String getCm() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(cm);
    }
}
