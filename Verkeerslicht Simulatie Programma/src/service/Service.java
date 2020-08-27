package service;

import dstructures.LinkList;
import dstructures.Stack;
import model.Afkomst;
import model.Voertuig;
import model.Wegdek;

public class Service {

    public LinkList insertNoord() {
        //NOORD
        LinkList linkList = new LinkList();
        linkList.insert(new Voertuig(1, "PD 85-29", 3));
        linkList.insert(new Voertuig(2, "PG 22-88", 3));
        linkList.insert(new Voertuig(3, "AM 07-77", 2));
        linkList.insert(new Voertuig(4, "PJ 23-90", 3));
        return linkList;


    }
    public LinkList insertZuid() {
        //ZUID
        LinkList linkList = new LinkList();
        linkList.insert(new Voertuig(1, "PK 14-44", 3));
        linkList.insert(new Voertuig(2, "PA 12-99", 3));
        linkList.insert(new Voertuig(3, "PG 54-77", 3));
        linkList.insert(new Voertuig(4, "PL 88-20", 3));
        linkList.insert(new Voertuig(5, "PJ 77-11", 3));
        linkList.insert(new Voertuig(6, "PD 45-22", 3));
        linkList.insert(new Voertuig(7, "PL 44-88", 3));
        linkList.insert(new Voertuig(8, "PL 55-99", 3));
        linkList.insert(new Voertuig(9, "PL 23-55", 3));
        linkList.insert(new Voertuig(10, "PG 25-25", 3));
        linkList.insert(new Voertuig(11, "PA 88-00", 3));
        linkList.insert(new Voertuig(12, "PF 00-58", 3));
        linkList.insert(new Voertuig(13, "PK 85-45", 3));
        linkList.insert(new Voertuig(14, "PB 84-57", 3));
        linkList.insert(new Voertuig(15, "PB 45-85", 3));
        linkList.insert(new Voertuig(16, "PH 45-78", 3));
        linkList.insert(new Voertuig(17, "01-10 BW", 1));
        linkList.insert(new Voertuig(18, "PF 56-56", 3));
        return linkList;
    }
    public LinkList insertOost() {
        //OOST
        LinkList linkList = new LinkList();
        linkList.insert(new Voertuig(1, "PA 45-59", 3));
        linkList.insert(new Voertuig(2, "PB 56-45", 3));
        linkList.insert(new Voertuig(3, "PC 98-12", 3));
        linkList.insert(new Voertuig(4, "PL 54-86", 3));
        linkList.insert(new Voertuig(5, "PD 98-45", 3));
        return linkList;
    }
    public LinkList insertWest(){
        //WEST
        LinkList linkList = new LinkList();
        linkList.insert(new Voertuig(1,"PA 21-98", 3));
        linkList.insert(new Voertuig(2,"PA 56-54", 3));
        linkList.insert(new Voertuig(3,"PD 87-32", 3));
        linkList.insert(new Voertuig(4,"PF 62-32", 3));
        linkList.insert(new Voertuig(5,"PA 52-20", 3));
        linkList.insert(new Voertuig(6,"PL 56-12", 3));
        linkList.insert(new Voertuig(7,"PZ 45-45", 3));
        linkList.insert(new Voertuig(8,"PW 54-21", 3));
        linkList.insert(new Voertuig(9,"01-15 PS", 0));
        linkList.insert(new Voertuig(10,"PA 45-54", 3));
        linkList.insert(new Voertuig(11,"PC 65-12", 3));
        linkList.insert(new Voertuig(12,"PD 65-12", 3));
        linkList.insert(new Voertuig(13,"PF 87-65", 3));
        linkList.insert(new Voertuig(14,"PK 32-54", 3));
        return linkList;
    }
    public Wegdek oprijden(Wegdek wegdek){
        int times = wegdek.getVoertuigenQueue().getCount();
        switch (wegdek.getWegdekCode()) {
            case "O":
                System.out.println("~~~~~~~~~GROENLICHT Wegdek Oost! de voertuigen mogen oprijden~~~~~~~~~");
                if (wegdek.getVoertuigenQueue().isEmpty()) {
                    System.out.println("Sensor Oost treed in werking! Beurt overgeslagen \n");
                    break;
                }else {
                    for(int x = 0; x < 5;x++){
                        if(wegdek.getVoertuigenQueue().peekFirst() != null) {
                            System.out.println("Voertuig " + wegdek.getVoertuigenQueue().peekFirst().getAutoNumr() + " Kenteken nummer : "+ wegdek.getVoertuigenQueue().peekFirst().getKentNumr() + " rijdt op.");
                            wegdek.getReverseVoertuigen().push(wegdek.getVoertuigenQueue().remove());
                        }
                    }
                }
                System.out.println("\n");
                break;
            case "Z":
                System.out.println("~~~~~~~~~GROENLICHT Wegdek Zuid! de voertuigen mogen oprijden~~~~~~~~~");
                if (wegdek.getVoertuigenQueue().isEmpty()) {
                    System.out.println("Wegdek Zuid is leeg");
                    break;
                }

                if (wegdek.getVoertuigenQueue().getCount() > 10) {
                    System.out.println("Wegdek Zuid telt meer dan 10 voertuigen \n");
                    times = 10;
                }
                else if (wegdek.getVoertuigenQueue().getCount() >= 5) {
                    times = 5;
                }

                for (int x = 0; x < times; x++) {
                    if(wegdek.getVoertuigenQueue().peekFirst() != null) {
                        System.out.println("Voertuig " + wegdek.getVoertuigenQueue().peekFirst().getAutoNumr() + " Kenteken nummer : "+ wegdek.getVoertuigenQueue().peekFirst().getKentNumr() + " rijdt op.");
                        wegdek.getReverseVoertuigen().push(wegdek.getVoertuigenQueue().remove());
                    }
                }

                System.out.println("\n");
                break;

            case "W":
                System.out.println("~~~~~~~~~GROENLICHT Wegdek West mag oprijden~~~~~~~~~");
                if (wegdek.getVoertuigenQueue().isEmpty()) {
                    System.out.println("Wegdek West is leeg \n");
                    break;
                }

                if (wegdek.getVoertuigenQueue().getCount() > 10) {
                    //System.out.println("Er zijn meer dan 10 voertuigen aanwezig in West!");
                    times = 10;
                }
                else if (wegdek.getVoertuigenQueue().getCount() >= 5) {
                    times = 5;
                }

                for (int x = 0; x < times; x++) {
                    if(wegdek.getVoertuigenQueue().peekFirst() != null) {
                        System.out.println("Voertuig " + wegdek.getVoertuigenQueue().peekFirst().getAutoNumr() + " Kenteken nummer : "+ wegdek.getVoertuigenQueue().peekFirst().getKentNumr() + " rijdt op.");
                        wegdek.getReverseVoertuigen().push(wegdek.getVoertuigenQueue().remove());
                    }
                }

                System.out.println("\n");
                break;

            case "N":
                System.out.println("~~~~~~~~~GROENLICHR Wegdek Noord mag oprijden~~~~~~~~~");
                if (wegdek.getVoertuigenQueue().isEmpty()) {
                    System.out.println("Wegdek Noord is leeg \n");
                    break;
                }else{
                    for(int x = 0; x < 5;x++){
                        if(wegdek.getVoertuigenQueue().peekFirst() != null) {
                            System.out.println("Voertuig " + wegdek.getVoertuigenQueue().peekFirst().getAutoNumr() + " Kenteken nummer : "+ wegdek.getVoertuigenQueue().peekFirst().getKentNumr() + " rijdt op.");
                            wegdek.getReverseVoertuigen().push(wegdek.getVoertuigenQueue().remove());
                        }
                    }
                }
                System.out.println("\n");
                break;



        }
        return wegdek;




    }



}

