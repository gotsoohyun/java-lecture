public class hw6_2 {
    public static void main(String[] args) {
        Position62 p1 = new Position62();
        Position62 p2 = new Position62(3, 5);

        System.out.println("p1: " + p1);
        p1.move(Position62.Direction.valueOf("EAST"));
        System.out.println("p1: " + p1);
        p1.move(Position62.Direction.valueOf("SOUTH"));
        System.out.println("p1: " + p1);
        p1.move(Position62.Direction.valueOf("EAST"));
        System.out.println("p1: " + p1);
        p1.move(Position62.Direction.valueOf("SOUTH"));
        System.out.println("p1: " + p1);
        p1.move(Position62.Direction.valueOf("WEST"));
        System.out.println("p1: " + p1);
        p1.move(Position62.Direction.valueOf("NORTH"));
        System.out.println("p1: " + p1);

        System.out.println("p2: " + p2);
        p2.move(Position62.Direction.valueOf("WEST"));
        System.out.println("p2: " + p2);
        p2.move(Position62.Direction.valueOf("SOUTH"));
        System.out.println("p2: " + p2);

    }
}

// write class Position62 here
class Position62 {
    int x, y;
    int start_x, start_y;

    enum Direction {
        NORTH, EAST, SOUTH, WEST
    };

    public String toString() {
        return ("Start " + start_x + " " + start_y + " Current " + x + " " + y);
    }

    public Position62() {
        x = 0;
        start_x = 0;
        y = 0;
        start_y = 0;
    }

    public Position62(int a, int b) {
        x = a;
        start_x = a;
        y = b;
        start_y = b;
    }

    public void move(Position62.Direction where) {
        if (where == Position62.Direction.valueOf("NORTH")) {
            this.y = y + 1;
        } else if (where == Position62.Direction.valueOf("EAST")) {
            this.x = x + 1;
        } else if (where == Position62.Direction.valueOf("SOUTH")) {
            this.y = y - 1;
        } else if (where == Position62.Direction.valueOf("WEST")) {
            this.x = x - 1;
        }

    }

}
