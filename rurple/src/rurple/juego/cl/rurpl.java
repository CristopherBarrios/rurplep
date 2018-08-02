package rurple.juego.cl;

public class rurpl {
    private Cell[][] board;
    private boolean isPlayersOneTurn;

    public rurpl() {
        this.board = new Cell[3][3];
        isPlayersOneTurn = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            }
        }
    }
    public boolean wall(int x, int y) {
        if ((0<=x && x <=2) && (0<=x && x<= 2)){
            System.out.println("No se pude caminar");
        }
    }
    public boolean coinsPile(int x, int y){
        if ((0<=x && x <=2) && (0<=x && x<= 2)){
            System.out.println("No se pude caminar");
        }
    }
    public boolean robot(int x, int y){
        if ((0<=x && x <=2) && (0<=x && x<= 2)){
            System.out.println("No se pude caminar");
        }
    }
}