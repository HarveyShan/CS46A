public class tester
{
    public static void main(String[] args)
    {
        final int GRID_SIZE = 10;
        Robot carol = new Robot(10, 10, "roomba.png");

        for (int n = 0; n < 5; n++)
        {
            for(int j = 0;j < 2; j++)
            {
                for(int i = 0; i < 1 + n; i++)
                {
                    carol.moveForward();
                }
                carol.turnLeft();
            }
        }
    }
}

// public class SpiralViewer
// {
    // public static void main(String[] args)
    // {
        // final int GRID_SIZE = 10;
        // int endX = 100;
        // int endY = 100;
        // int startX;
        // int startY;

        // startX = endX;
        // startY = endY;
        // for (int n = 0; n < 40; n++)
        // {
            // for(int j = 0;j < 2; j++)
            // {
                // for(int i = 0; i < 1 + n; i++)
                // {
                    
                // }
            // }

            // Line line = new Line(startX, startY, endX, endY);
            // line.draw();
            // //each iteration draws one segment of the line
        // }
    // }
// }