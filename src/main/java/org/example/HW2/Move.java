package org.example.HW2;

public class Move {
    int maxDistance;
    int maxHeight;

    public Move(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public void Jump(Obstacle obstacle){
        if(obstacle.HeightObstacle() <= maxHeight && obstacle.HeightObstacle() > 0){
            System.out.println("Я прыгнул на " + obstacle.HeightObstacle() + " метров.");
        }
    };
    public void Run(Obstacle obstacle){
        if(obstacle.LengthObstacle() <= maxDistance && obstacle.LengthObstacle() > 0){
            System.out.println("Я пробежал " + obstacle.LengthObstacle() + " метров.");
        }
    };
}
