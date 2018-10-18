public class Robot
{
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Picture pic;
    private boolean crashed;
    private boolean snapshots;

    private static final int MARGIN = 10;

    /**
        Constructs a robot at grid location (0, 0). The robot faces east.
    */
    public Robot()
    {
        x = 0;
        y = 0;
        dx = 1;
        dy = 0;
        pic = new Picture("robot.png");
        pic.translate(MARGIN, MARGIN);
        pic.draw();
        snapshots = true;
    }

    /**
        Constructs a robot at a given grid location. The robot faces east.
        @param x the horizontal grid location of the robot
        @param y the vertical grid location of the robot
        @param imageFile the Robot image
    */
    public Robot(int x, int y, String imageFile)
    {
        this.x = x;
        this.y = y;
        dx = 1;
        dy = 0;
        pic = new Picture(imageFile);
        pic.translate(MARGIN, MARGIN);
        pic.translate(x * pic.getWidth(), y * pic.getHeight());
        pic.draw();
        snapshots = true;
    }


    /**
        Moves this robot one step in the direction that it is facing.
    */
    public void moveForward()
    {
        snapshot();
        if (crashed) return;
        if (frontHasWallorWindow())
        {
            pic.tint(Color.GRAY);
            crashed = true;
            return;
        }

        x = x + dx;
        y = y + dy;
        pic.translate(dx * pic.getWidth(), dy * pic.getHeight());
    }

    private void snapshot()
    {
        if (snapshots) Canvas.snapshot();
        else Canvas.delay(750);
    }

    /**
        Turns this robot 90 degrees right.
    */
    public void turnRight()
    {
        snapshot();
        if (crashed) return;
        int newDx = -dy;
        dy = dx;
        dx = newDx;
        pic.turn(1);
    }

    /**
        Turns this robot 90 degrees left.
    */
    public void turnLeft()
    {
        snapshot();
        if (crashed) return;
        int newDx = dy;
        dy = -dx;
        dx = newDx;
        pic.turn(-1);
    }

    /**
        Makes this robot say something.
        @param message the text that the robot says
    */
    public void say(String message)
    {
        snapshot();
        Text text = new Text((x + 1.2) * pic.getWidth() + MARGIN, (y + 0.5) * pic.getHeight() + MARGIN, message);
        text.draw();
        int height = text.getHeight();
        Ellipse bubble = new Ellipse(text.getX() - height / 2,
                                     text.getY() - height / 2,
                                     text.getWidth() + height,
                                     2 * height);
        bubble.draw();
        double y = bubble.getY() + height;
        Line line = new Line(pic.getX() + pic.getWidth(),
                             y + height / 4, bubble.getX(), y);
        line.draw();
    }

    /**
        Checks whether there is a wall or window in front of this robot.
        @return true if there is a wall or window, false if there is neither.
    */
    public boolean frontHasWallorWindow()
    {
        for (Shape s : Canvas.getInstance().getShapes())
        {
            if (s instanceof Wall || s instanceof Window)
            {
                double cx = (x + 0.5 + 0.5 * dx) * pic.getWidth() + MARGIN;
                double cy = (y + 0.5 + 0.5 * dy) * pic.getHeight() + MARGIN;
                if (s.getX() <= cx && cx < s.getX() + s.getWidth()
                        && s.getY() <= cy && cy < s.getY() + s.getHeight())
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
        Checks whether there is a wall to the right of this robot.
        @return true if there is a wall, false if there isn't a wall.
    */
    public boolean rightHasWall()
    {
        for (Shape s : Canvas.getInstance().getShapes())
        {
            if (s instanceof Wall)
            {
                double cx = (x + 0.5 - 0.5 * dy) * pic.getWidth() + MARGIN;
                double cy = (y + 0.5 + 0.5 * dx) * pic.getHeight() + MARGIN;
                if (s.getX() <= cx && cx < s.getX() + s.getWidth()
                        && s.getY() <= cy && cy < s.getY() + s.getHeight())
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static double LENGTH_FACTOR = 0.9;
    private static double THICKNESS_FACTOR = 0.05;

    private class Wall extends Rectangle {}
    private class Window extends Rectangle {}

    /**
        Creates a horizontal wall at a given grid location.
        @param x the horizontal grid location of the starting point of the wall
        @param y the vertical grid location of the starting point of the wall
    */
    public void createHorizontalWall(double x, double y)
    {
        Wall wall = new Wall();
        wall.translate((x + 0.5) * pic.getWidth(), y * pic.getHeight());
        wall.grow(pic.getWidth() * LENGTH_FACTOR / 2, pic.getHeight() * THICKNESS_FACTOR / 2);
        wall.translate(MARGIN, MARGIN);
        wall.setColor(Color.BLACK);
        wall.fill();
    }

    /**
        Creates a vertical wall at a given grid location.
        @param x the horizontal grid location of the starting point of the wall
        @param y the vertical grid location of the starting point of the wall
    */
    public void createVerticalWall(double x, double y)
    {
        Wall wall = new Wall();
        wall.translate(x * pic.getWidth(), (y + 0.5) * pic.getHeight());
        wall.grow(pic.getWidth() * THICKNESS_FACTOR / 2, pic.getHeight() * LENGTH_FACTOR / 2);
        wall.translate(MARGIN, MARGIN);
        wall.setColor(Color.BLACK);
        wall.fill();
    }

    /**
        Creates a horizontal window at a given grid location.
        @param x the horizontal grid location of the starting point of the window
        @param y the vertical grid location of the starting point of the window
    */
    public void createHorizontalWindow(double x, double y)
    {
        Window window = new Window();
        window.translate((x + 0.5) * pic.getWidth(), y * pic.getHeight());
        window.grow(pic.getWidth() * LENGTH_FACTOR / 2, pic.getHeight() * THICKNESS_FACTOR / 2);
        window.translate(MARGIN, MARGIN);
        window.setColor(Color.BLACK);
        window.draw();
    }

    /**
        Creates a vertical window at a given grid location.
        @param x the horizontal grid location of the starting point of the window
        @param y the vertical grid location of the starting point of the window
    */
    public void createVerticalWindow(double x, double y)
    {
        Window window = new Window();
        window.translate(x * pic.getWidth(), (y + 0.5) * pic.getHeight());
        window.grow(pic.getWidth() * THICKNESS_FACTOR / 2, pic.getHeight() * LENGTH_FACTOR / 2);
        window.translate(MARGIN, MARGIN);
        window.setColor(Color.BLACK);
        window.draw();
    }

    /**
        Turns snapshots on or off.
        @param snapshots true to take snapshots before every move and turn
    */
    public void setSnapshots(boolean snapshots)
    {
        this.snapshots = snapshots;
    }
}
