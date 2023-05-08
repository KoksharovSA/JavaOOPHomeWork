package org.example.ControlWork.Controller;

import org.example.ControlWork.Model.Toy;

import java.util.List;

public interface Draws {
    public Toy RunDraw(List<Toy> toys);

    public float getLastTry();
}
