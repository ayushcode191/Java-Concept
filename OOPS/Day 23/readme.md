# Enum 
enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

=> look like
final class Direction extends Enum <Direction> {
    public static final Direction NORTH = new Direction();
    public static final Direction SOUTH = new Direction();
    public static final Direction EAST = new Direction();
    public static final Direction WEST = new Direction();

    // New Object nahi bana sakte because Constructor Private hai.
    private Direction() {

    }
}

=> It is a seprate keyword
=> Internally comiple hokar ek class hi hoti hai.
=> ek class java.lang package me Enum hai ko extends krti hai.
=> Each constant by default static and final and are the actually objects of class Direction.


=> Enums => existing functionality
=> Enum (Java.lang) 
=> values() - compile generated
=> valueOf(String) - compile generated
=> name() - Enum class
=> ordinal() - Enum class