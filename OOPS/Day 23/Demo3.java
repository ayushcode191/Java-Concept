public class Demo3 {
    public static void main(String[] args) {
        Direction d = Direction.NORTH;

        System.out.println(d.getDegree());
    }
}

enum Direction {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);

    private int degree;

    Direction(int degree){
        this.degree = degree;
    }

    public int getDegree(){
        return this.degree;
    }
}

/**
 * Compiler Generated Code
 * final class Direction extends Enum<Directin>{
      public static final Direction NORTH = new Direction(0);
        public static final Direction SOUTH = new Direction(180);
        public static final Direction EAST = new Direction(90);
        public static final Direction WEST = new Direction(270);

        private int degree;

        private Direction(int degree){
            this.degree = degree;}
      }
        public int getDegree() {
            return degree; 
        }
    }
 */

