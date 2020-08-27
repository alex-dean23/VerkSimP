package dstructures;

import model.Voertuig;
//import model.Wegdek;


public class LinkStack {
    private LinkListStack reverseList;

    public LinkStack() {
        reverseList = new LinkListStack();
    }

    public void push(Voertuig voertuig) {
        reverseList.insertLast(voertuig);
    }

    public Voertuig pop() {
        Voertuig voertuig = reverseList.deleteLast();
        if (voertuig.equals(null)){
            System.out.println("geen voertuig");
        }
        return voertuig;
    }

    public boolean isEmpty() {
        return (reverseList.isEmpty() );
    }

    public void displayStack() {
        System.out.print("stack : ");
        reverseList.displayList();
    }

    public void insertList(LinkListStack list){
        this.reverseList = list;
    }
}


/*public class Stack <S>{
    private LinkList<String> list = new LinkList<>();
    public Stack(){}
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void push(String element){
        list.addFirst(element);
    }
    public String pop() {
        return list.removeFirst();
    }
    public String top() {
        return list.first();
    }
}

 */
