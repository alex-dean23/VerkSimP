package model;

public class Afkomst {

    private Voertuig voertuig;
    private Wegdek wegdek;

    public Afkomst(Wegdek wegdek, Voertuig voertuig) {
        this.wegdek = wegdek;
        this.voertuig = voertuig;
    }

    public Voertuig getVoertuig() {
        return voertuig;
    }

    public Wegdek getWegdek() {
        return wegdek;
    }
}

