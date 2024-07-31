package main.java.objects;

import main.java.objects.Object;
import main.java.vectors.Vector3;

public class Cube extends Object {
    public double side;

    public Cube() {
        this.position = new Vector3();
        this.side = 1;
        this.volume = 1;
    }

    public Cube(double a) {
        this.position = new Vector3();
        this.side = a;
        this.volume = Math.pow(a, 3);
    }

    public Cube(double a, Vector3 p) {
        this.position = p;
        this.side = a;
        this.volume = Math.pow(a, 3);
    }

}
