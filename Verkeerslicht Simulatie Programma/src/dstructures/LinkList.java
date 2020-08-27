package dstructures;

import model.Voertuig;

public class LinkList {

    private Link first;
    private Link last;

    public LinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first==null;
    }

    public void insert(Voertuig voertuigData) {
        Link newNode = new Link(voertuigData);
        Link previous = null;
        Link current = first;

        while (current != null && voertuigData.getPrNumr() >= current.getVoertuigData().getPrNumr()) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null) {
            newNode.setNext(first);
            first = newNode;
        }

        else {
            previous.setNext(newNode);
            newNode.setNext(current);
        }
    }

    public void insertLast(Voertuig voertuig) {
        Link newLink = new Link(voertuig);
        if( isEmpty() )
            first = newLink;
        else
            last.setNext(newLink);
        last = newLink;

    }

    public Voertuig deleteFirst() {
        Voertuig temp = first.getVoertuigData();
        if(first.getNext() == null)
            last = null;
        first = first.getNext();
        return temp;
    }

    public void displayList() {
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("");
    }


    public int getCount(){
        Link temp = first;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public Link peekFirst(){
        if(first != null){
            return first;
        }else{
            return null;
        }
    }

    public Link peekLast(){
        if(last != null){
            return last;
        }else{
            return null;
        }
    }

    //REWORSE DENG WAGIE !!!
    public Link reverse(Link voertuigLink){
        if(voertuigLink == null){
            return null;
        }
        if(voertuigLink.getNext() == null){
            return voertuigLink;
        }
        Link ret = reverse(voertuigLink.getNext());
        voertuigLink.getNext().getNext().setNext(voertuigLink);
        voertuigLink.setNext(null);
        return ret;
    }

    public void reverse(){
        reverse(this.peekFirst());
    }
}




    /*public void reverseList() {
        if (size <= 1) {

        }else
            if(size ==2) {
                last.first();
                current = previous;
                previous = current.getNext();
                previous.setNetxt(null);

            }else {
                Link
            }
    }
}

     */




