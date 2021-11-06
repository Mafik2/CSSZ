package com.company;

public class Employee {
    private int voscounter;
    private int vscounter;
    private int zakcounter;
    private int socounter;
    private int usocounter;

    public Employee( int voscounter, int vscounter, int zakcounter, int socounter, int usocounter) {

        this.voscounter = voscounter;
        this.vscounter = vscounter;
        this.zakcounter = zakcounter;
        this.socounter = socounter;
        this.usocounter = usocounter;
    }


    public double getRatio(String shortcut) {
        double total = getvoscounter() + getvscounter() + getzakcounter() + getsocounter() + getusocounter();
        if (shortcut.equals("VOS")) return (getvoscounter() / total);
        if (shortcut.equals("VS")) return (getvscounter() / total);
        if (shortcut.equals("ZAK"))return (getzakcounter() / total);
        if (shortcut.equals("SO")) return (getsocounter() / total);
        if (shortcut.equals("USO")) return (getusocounter() / total);
        return 0;
    }


    public int getvoscounter() {
        return voscounter;
    }
    public int getvscounter() {
        return vscounter;
    }
    public int getzakcounter() {
        return zakcounter;
    }
    public int getsocounter() {
        return socounter;
    }
    public int getusocounter() {
        return usocounter;
    }
}