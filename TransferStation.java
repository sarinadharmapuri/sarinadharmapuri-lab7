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
            b.next = this;
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < otherStations.size(); i++) {
            result = result + otherStations.get(i).toString();
        }

        return "TRANSFER" + super.toString() + result;
    }
}