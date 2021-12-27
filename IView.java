public interface IView {

    // moves player from src to dest
    public void move(Object disk, Location src, Location dest);

    // removes disk from board
    public void removeDisk(Object disk);

    // makes a player a queen
    public void makeQueen(Object disk);

    // shows board on screen
    public void presentBoard();

    // presents win message
    public void winMessage();

    // presents lose message
    public void loseMessage();

    // sends request to presenter
    public String playerRequest();
}
