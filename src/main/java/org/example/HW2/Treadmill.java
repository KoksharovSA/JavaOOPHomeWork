package org.example.HW2;

public class Treadmill implements Obstacle {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public int HeightObstacle() {
        return 0;
    }

    @Override
    public int LengthObstacle() {
        return distance;
    }
}
