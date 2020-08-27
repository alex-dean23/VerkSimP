package model;

public class Voertuig {

    private int autoNumr;
    private String kentNumr;
    int PrNumr;

    public Voertuig(int autoNumr, String kentNumr, int PrNumr) {
        this.autoNumr = autoNumr;
        this.kentNumr = kentNumr;
        this.PrNumr = PrNumr;
    }

    public int getAutoNumr() {
        return autoNumr;
    }

    public void setAutoNumr(int autoNumr) {
        this.autoNumr = autoNumr;
    }

    public String getKentNumr() {
        return kentNumr;
    }

    public void setKentNumr(String kentNumr) {
        this.kentNumr = kentNumr;
    }

    public int getPrNumr() {
        return PrNumr;
    }

    public void setPrNumr(int prNumr) {
        this.PrNumr = prNumr;
    }

    @Override
    public String toString() {
        return "Voertuig{" +
                "autoNumr=" + autoNumr +
                ", kentNumr='" + kentNumr + '\'' +
                ", PrNumr=" + PrNumr +
                '}';
    }
}





    //public Voertuig voertuigen;

    //char array[] = {1,2,3,4,5,6};


    /*public void setVoertuigenQueue(array[] voertuigen) {
        this.voertuigen = voertuigen;
    }

    public array[] getVoertuigenQueue() {
        return voertuigen;
    }*/