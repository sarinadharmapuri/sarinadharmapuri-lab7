

public class Station {

    public String name;
    public String color;
    public boolean inService;
    public Station prev;
    public Station next;

    public Station(String color, String name) {
        this.name = name;
        this.color = color;
        inService = true;
        prev = null;
        next = null;
    }

    public void addNext(Station a) {
        next = a;
        if (a != null) {
            a.prev = this;
        }
    }

    public void addPrev(Station b) {
        prev = b;
        if (b != null) {
            b.next = this;
        }
    }

    public boolean isAvailable() {
        return inService;
    }

    public void switchAvailable() {
        inService = !inService;
    }

    public void connect(Station c) {
        addNext(c);
    }

    public boolean equals(Station d) {
        if (this.name.equals(d.name) && this.color.equals(d.color)) {
            return true;
        }

        return false;
    }

    public int tripLength(Station dest) {
        return -1;
    }

    // "STATION Museum: pink line, in service: true, previous station: none, next station: none";
    public String toString() {
        String prevName;
        String nextName;
        if (prev != null) {
            prevName = prev.name;
        } else {
            prevName = "none";
        }
        if (next != null) {
            nextName = next.name;
        } else {
            nextName = "none";
        }
        return "STATION " + name + ": " + color + " line, in service: " + inService + ", previous station: " + prevName + ", next station: " + nextName;
    }
}