package org.example.HW2;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Obstacle> GetObstacleСourse(){
        ArrayList<Obstacle> obstacleСourse = new ArrayList<>();
        obstacleСourse.add(new Treadmill(11));
        obstacleСourse.add(new Wall(5));
        obstacleСourse.add(new Treadmill(22));
        obstacleСourse.add(new Wall(15));
        obstacleСourse.add(new Treadmill(33));
        obstacleСourse.add(new Wall(25));
        return obstacleСourse;
    }

    public static ArrayList<Move> GetParticipants(){
        ArrayList<Move> participants = new ArrayList<>();
        participants.add(new Cat(22, 5));
        participants.add(new Human(33, 15));
        participants.add(new Robot(33,25));
        return participants;
    }
}
