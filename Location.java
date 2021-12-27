public class Location {

    private char x;  // x axis
    private char y;  // y axis

    public Location()
    {
        this.x = 0;
        this.y = 0;
    }

    public Location(char x, char y) {
        this.x = x;
        this.y = y;
    }

    public char getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }

    public char getY() {
        return y;
    }

    public void setY(char y) {
        this.y = y;
    }

    public boolean equals(Location l2) {
        // returns true, if locations are equal
        return (this.x == l2.x) && (this.y == l2.y);
    }
}
