

public class EndStation extends Station {

    public EndStation(String color, String name) {
        super(color, name);
    }

    public void makeEnd() {
        if (prev != null) {
            next = prev;
        } else if (next != null) {
            prev = next;
        }
    }

    public String toString() {
        return "END" + super.toString();
    }
}