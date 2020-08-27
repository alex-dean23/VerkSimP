package dstructures;


import model.Voertuig;

public class Link {

    private Voertuig voertuigData;
    private Link next;

    public Link(Voertuig voertuigData) {
        this.voertuigData = voertuigData;
    }

    public Voertuig getVoertuigData() {
        return voertuigData;
    }

    public void setVoertuigData(Voertuig voertuigData) {
        this.voertuigData = voertuigData;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public void displayLink(){
        System.out.print("Display voertuig " + voertuigData);
    }
}


