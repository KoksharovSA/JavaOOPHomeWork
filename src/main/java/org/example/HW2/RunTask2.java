package org.example.HW2;

import java.util.ArrayList;

public class RunTask2 {
    public static void Run() {
        for (Move participant: Data.GetParticipants()) {
            System.out.println();
            System.out.println(participant.getClass().getSimpleName());
            RunObstacleCourse(Data.GetObstacleСourse(), participant);
        }
    }
    public static void RunObstacleCourse(ArrayList<Obstacle> obstacleСourse, Move participant){
        for (Obstacle obstacle: obstacleСourse) {
            if (obstacle.HeightObstacle() > 0){
                participant.Jump(obstacle);
            } else if (obstacle.LengthObstacle() > 0) {
                participant.Run(obstacle);
            }
        }
    }
}
