

public class Demo5 {
    public static void main(String[] args) {
        // Direction[] direction = Direction.values();

        // for(Direction d : direction){
        //     System.out.println(d.name());
        // }
        // Case sensitive
        Direction d = Direction.valueOf("EAST");
        System.out.println(d.name());
        System.out.println(d);

        System.out.println(d.ordinal());






    }
}

// values() => we can iterate in enum
// valueOf() = Convert an String into an enum constant.
/// name() => name of constant
// we can not extend any class by enum

enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    @Override
    public String toString(){
        return this.name()+" Direction";
    }
}
