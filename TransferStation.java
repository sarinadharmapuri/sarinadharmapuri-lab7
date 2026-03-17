import java.util.*;

public class TransferStation extends Station {

    private ArrayList<Station> transferStations;

    public TransferStation(String color, String name) {
        super(color, name);
        transferStations = new ArrayList<>();

    }

    public void addTransferStationPrev(Station a) {
        transferStations.add(a);
        if (a != null) {
            a.next = this;
        }
    }

    public void addTransferStationNext(Station b) {
        transferStations.add(b);
        if (b != null) {
            b.next = this;
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < transferStations.size(); i++) {
            result = result + transferStations.get(i).toString();
        }

        return "TRANSFER" + super.toString() + result;
    }
}