import java.util.*;

public class TransferStation extends Station {

    public ArrayList<Station> otherStations;

    public TransferStation(String color, String name) {
        super(color, name);
        otherStations = new ArrayList<>();

    }

    public void addTransferStationPrev(Station a) {
        otherStations.add(a);
        if (a != null) {
            a.next = this;
        }
    }

    public void addTransferStationNext(Station b) {
        otherStations.add(b);
        if (b != null) {
            b.prev = this;
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < otherStations.size(); i++) {
            result = result + "\t" + otherStations.get(i).toString() + "\n";
        }
        // "STATION Museum: pink line, in service: true, previous station: none, next station: none";
        // "TRANSFERSTATION Museum: pink line, in service: true, previous station: none, next station: none\n\tTransfers: \n"
        // "TRANSFERSTATION Museum: pink line, in service: true, previous station: none, next station: none\n\tTransfers: \n" + 
                         // "\tSTATION Square: blue line, in service: true, previous station: none, next station: Museum\n" + 
                         // "\tENDSTATION Plaza: green line, in service: true, previous station: Museum, next station: none\n";
        return "TRANSFERSTATION" + super.toString().substring(7) + "\n" + "\t" + "Transfers: " + "\n" + result;
    }
}