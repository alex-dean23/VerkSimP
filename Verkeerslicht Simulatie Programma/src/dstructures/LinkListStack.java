package dstructures;

import model.Voertuig;

public class LinkListStack {

    private Link first;

    public LinkListStack() {
        this.first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(Voertuig voertuig) {

        Link newLink = new Link(voertuig);
        newLink.setNext(first);
        first = newLink;
    }

    public void insertLast(Voertuig voertuig){
        Link current = first;
        Link next = null;
        Link newLink = new Link(voertuig);

        if (current == null) {
            first = newLink;
        } else if (current.getNext() != null) {
            next = current.getNext();
            while (next.getNext() != null) {
                current = next;
                next = current.getNext();

            }
            next.setNext(newLink);
        }else {
            first.setNext(newLink);

        }
    }

    public void insert(Voertuig voertuig) {
        Link newLink = new Link(voertuig);
        Link previous = null;
        Link current = first;

        while (current != null && voertuig.getPrNumr() >= current.getVoertuigData().getPrNumr()) {
            previous = current;
            current = current.getNext();
        }
        if (previous == null) {
            newLink.setNext(first);
            first = newLink;
        } else {
            previous.setNext(newLink);
            newLink.setNext(current);
        }
    }

    public Voertuig deleteFirst() {
        if (isEmpty()) {

            System.out.println("Lijst is leeg");
            return null;

        } else {
            Link temp = first;
            first = first.getNext();
            return temp.getVoertuigData();
        }
    }

    public Voertuig deleteLast() {

        Link current = first;
        Link next = null;

        if (isEmpty()) {

            System.out.println("Lijst is leeg");
            return null;
        } else if (current.getNext() != null) {
            next = current.getNext();
            while (next.getNext() != null) {
                current = next;
                next = current.getNext();

            }
            current.setNext(null);
            return next.getVoertuigData();
        }else {
            next = first;
            first = null;
            return next.getVoertuigData();
        }
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("");
    }

    public int getCount() {
        Link temp = first;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

}
