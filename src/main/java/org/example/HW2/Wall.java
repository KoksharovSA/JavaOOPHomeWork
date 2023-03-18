package org.example.HW2;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public int HeightObstacle() {
        return height;
    }

    @Override
    public int LengthObstacle() {
        return 0;
    }
}
