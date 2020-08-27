package model;

import dstructures.LinkStack;
import dstructures.Queue;


public class Wegdek {

    private String wegdekCode;
    private Queue voertuigenQueue;
    private LinkStack reverseVoertuigen;

    public Wegdek(Queue voertuigenQueue, String wegdekCode) {
        this.voertuigenQueue = voertuigenQueue;
        this.reverseVoertuigen = new LinkStack();
        this.wegdekCode = wegdekCode;
    }

    public Queue getVoertuigenQueue() {
        return voertuigenQueue;
    }

    public void setVoertuigenQueue(Queue voertuigenQueue) {
        this.voertuigenQueue = voertuigenQueue;
    }

    public LinkStack getReverseVoertuigen() {
        return reverseVoertuigen;
    }
    public void setReverseVoertuigen(LinkStack reverseVoertuigen) {
        this.voertuigenQueue = voertuigenQueue;
    }


    public String getWegdekCode() {
        return wegdekCode;
    }

    public void setWegdekCode(String wegdekCode) {
        this.wegdekCode = wegdekCode;
    }
}



   /* public void setReverseVoertuigen(LinkStack reverseVoertuigen) {
        this.reverseVoertuigen = reverseVoertuigen;
    }

    */

        /*public Wegdek(String wegdekCode) {
            this.wegdekCode = wegdekCode;
        }

        public void enqueue(Voertuig voertuigenQueue) { Queue.(voertuigenQueue); }

        public String getWegdekCode() {return wegdekCode; }

        public LinkQueue getVoertuigenQueue() { return voertuigenQueue; }

        public LinkStack getVoertuigenStack() { return voertuigenStack; }
    }

     */




