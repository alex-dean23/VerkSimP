package dstructures;

import model.Voertuig;

public class Queue {

    private LinkList theList;

    public Queue() {
        theList = new LinkList();
    }

    public Queue(LinkList theList) {
        this.theList = theList;
    }

    // true if queue empty
    public boolean isEmpty(){ return theList.isEmpty(); }

    public void insert(Voertuig voertuig){
        theList.insert(voertuig);
    }

    public void insertVoertuigLinkList(LinkList linkList){
        theList = linkList;
    }

    public int getCount(){
        return theList.getCount();
    }

    // remove, front of queue
    public Voertuig remove() {
        return theList.deleteFirst(); }


    public void displayQueue() {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }

    public Voertuig peekFirst(){
        if(theList.peekFirst()!= null){
            return theList.peekFirst().getVoertuigData();
        }else {
            return null;
        }
    }

    public Voertuig peekLast(){
        if(theList.peekLast()!= null){
            return theList.peekLast().getVoertuigData();
        }else {
            return null;
        }

    }

    //Reworshhh
    public Link reverse(Link link){
        return theList.reverse(link);
    }

    public void reverse(){
        theList.reverse();
    }
}




/*public class Queue<S> {
    private LinkList<String> list = new LinkList<>();
    public Queue(){}
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void enqueue(String element) {
        list.addLast(element);
    }
    public String dequeue() {
        return list.first();
    }

}

 */
