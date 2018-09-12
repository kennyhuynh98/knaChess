import java.util.ArrayList;

public class PieceInfo {
    
    // infoArray indices: pawn = 0, castle = 1, horses = 2, bishop = 3, queen = 4, king = 5.
    private ArrayList<Integer> infoArray = new ArrayList<Integer>(5);
    private static final int NUM_PIECES = 6;

    public PieceInfo() {
        this.initializePieceInfo();
    }

    public void initializePieceInfo() {
        for (int i = 0; i < NUM_PIECES; i++) {
            infoArray.add(0);
        }
    }

    public void increment(int index) {
        int value = infoArray.get(index);
        value++;
        infoArray.set(index, value);
    }

    public void decrement(int index) {
        int value = infoArray.get(index);
        value--;
        infoArray.set(index, value);
    }

    public int getNumber(int index) {
        int tempNum = infoArray.get(index);
        return tempNum;
    }

    public void viewInfo() {
        String printArray[] = {"Pawn", "Castle", "Horse", "Bishop", "Queen", "King"};
        for (int i = 0; i < NUM_PIECES; i++) {
            int value = infoArray.get(i);
            System.out.println("Number of " + printArray[i] + "(s) = " + value);
        }
    }
}