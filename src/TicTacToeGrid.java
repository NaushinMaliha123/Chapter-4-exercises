public class TicTacToeGrid {
    public static void main(String[] args) {

        String horizontal = "+--+--+--+\n";
        String vertical = "|  |  |  |\n";

        for (int i = 0; i < 3; i++) {
            System.out.print(horizontal);
            System.out.print(vertical);
        }
        //System.out.print(horizontal);
    }
}
