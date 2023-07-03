import java.util.Random;

public class PlayerQueue {
    private static final int MAX_SIZE = 100;
    private String[] elements;
    private int size;
    private Random random;

    public PlayerQueue() {
        elements = new String[MAX_SIZE];
        size = 0;
        random = new Random();
    }

    public void addPlayer(String player) {
        if (size < MAX_SIZE) {
            elements[size] = player;
            size++;
        } else {
            System.out.println("Queue is full. Cannot add more players.");
        }
    }

    public String removePlayer() {
        if (size > 0) {
            String removedPlayer = elements[0];
            for (int i = 0; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            return removedPlayer;
        } else {
            System.out.println("Queue is empty. Cannot remove player.");
            return null;
        }
    }

    public int size() {
        return size;
    }

    public int getRandomPlayersToEnqueue() {
        return random.nextInt(7) + 1; // Random number of players to enqueue (1-7)
    }
}