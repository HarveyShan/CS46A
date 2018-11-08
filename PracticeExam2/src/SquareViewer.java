import java.util.Random;
public class SquareViewer {
    public static void main(String[] args) {
        final int MAX_X = 300;
        final int MAX_Y = 150;
        final int MIN_X = 0;
        final int MIN_Y = 0;
        final int NUMBER_OF_SQUARES = 25;
        final int SQUARE_SIDE = 30;
        Random gen = new Random(24682469);
        for(int i = 0; i < NUMBER_OF_SQUARES; i++)
        {
            int boxX = gen.nextInt(MAX_X);
            int boxY = gen.nextInt(MAX_Y);
            Rectangle newRectangle = new Rectangle(boxX, boxY, SQUARE_SIDE, SQUARE_SIDE);
            newRectangle.setColor(Color.BLUE);
            newRectangle.draw();
        }
    }
}
