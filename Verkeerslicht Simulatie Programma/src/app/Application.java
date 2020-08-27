package app;

import dstructures.LinkStack;
import dstructures.Queue;
import model.Voertuig;
import model.Wegdek;
import service.Service;


public class Application {

    Service service = new Service();
    static Wegdek noord;
    static Wegdek zuid;
    static Wegdek oost;
    static Wegdek west;
    static Queue prioriteitsVoertuigen;
    static Queue reversePrioriteitsVoertuigen;
    static LinkStack reversePlayback;

    public void init() {
        Queue voertuigQueN = new Queue(service.insertNoord());
        Queue voertuigQueZ = new Queue(service.insertZuid());
        Queue voertuigQueO = new Queue(service.insertOost());
        Queue voertuigQueW = new Queue(service.insertWest());

        noord = new Wegdek(voertuigQueN, "N");
        zuid = new Wegdek(voertuigQueZ, "Z");
        oost = new Wegdek(voertuigQueO, "O");
        west = new Wegdek(voertuigQueW, "W");
    }

    public void priorityQueInit() {
        prioriteitsVoertuigen = new Queue();
        reversePrioriteitsVoertuigen = new Queue();
        reversePlayback = new LinkStack();
        while (noord.getVoertuigenQueue().peekFirst().getPrNumr() < 3) {
            Voertuig voertuig = noord.getVoertuigenQueue().remove();
            prioriteitsVoertuigen.insert(voertuig);
            reversePrioriteitsVoertuigen.insert(voertuig);
            reversePlayback.push(voertuig);
        }

        while (zuid.getVoertuigenQueue().peekFirst().getPrNumr() < 3) {
            Voertuig voertuig = zuid.getVoertuigenQueue().remove();
            prioriteitsVoertuigen.insert(voertuig);
            reversePrioriteitsVoertuigen.insert(voertuig);
            reversePlayback.push(voertuig);
        }

        while (oost.getVoertuigenQueue().peekFirst().getPrNumr() < 3) {
            Voertuig voertuig = oost.getVoertuigenQueue().remove();
            prioriteitsVoertuigen.insert(voertuig);
            reversePrioriteitsVoertuigen.insert(voertuig);
            reversePlayback.push(voertuig);
        }

        while (west.getVoertuigenQueue().peekFirst().getPrNumr() < 3) {
            Voertuig voertuig = west.getVoertuigenQueue().remove();
            prioriteitsVoertuigen.insert(voertuig);
            reversePrioriteitsVoertuigen.insert(voertuig);
            reversePlayback.push(voertuig);
        }
    }

    public void prioVoertuigOprijden() {
        int countPrio = prioriteitsVoertuigen.getCount();
        for (int x = 0; x < countPrio; x++) {
            if (x == 0) {
                System.out.println("Politie rijdt op!");
                prioriteitsVoertuigen.remove();
            } else if (x == 1) {
                System.out.println("Brandweer rijdt op!");
                prioriteitsVoertuigen.remove();
            } else if (x == 2) {
                System.out.println("Ambulance rijdt op!\n");
                prioriteitsVoertuigen.remove();
            }
        }
    }

    public void reversePrio(){
        reversePrioriteitsVoertuigen.reverse();
    }

    public void rijRonde() {
        noord = service.oprijden(noord);
        zuid = service.oprijden(zuid);
        oost = service.oprijden(oost);
        west = service.oprijden(west);
    }

    public static void main(String[] args) {
        Application start = new Application();
        start.init();
        start.priorityQueInit();
        int count=0;

        while(!noord.getVoertuigenQueue().isEmpty()
                || !zuid.getVoertuigenQueue().isEmpty()
                || !oost.getVoertuigenQueue().isEmpty()
                || !west.getVoertuigenQueue().isEmpty()){

            start.prioVoertuigOprijden();
            start.rijRonde();
            count++;
        }

        System.out.println("Totaal aantal ronden: " + count + "\n");
        System.out.println("~~~~~~~~~ Reverse Playback ~~~~~~~~~");

        int countPrio = reversePrioriteitsVoertuigen.getCount();
        for (int x = countPrio; x > -1; x--) {
            if (x == 0) {
                System.out.println("Politie rijdt terug!");
                reversePrioriteitsVoertuigen.remove();
            } else if (x == 1) {
                System.out.println("Brandweer rijdt terug!");
                reversePrioriteitsVoertuigen.remove();
            } else if (x == 2) {
                System.out.println("Ambulance rijdt terug!");
                reversePrioriteitsVoertuigen.remove();
            }
        }
        reversePlayback.pop();


    }
}
