package main.java.objects;

import main.java.objects.Object;
import main.java.vectors.Vector3;

public class Pyramid extends Object {
    public double length, width, height;

    public Pyramid() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
        this.position = new Vector3();
        this.volume = 1 / 3.0;
    }

    public Pyramid(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
        this.position = new Vector3();
        this.volume = (l * w * h) / 3.0;
    }

    public Pyramid(double l, double w, double h, Vector3 p) {
        this.length = l;
        this.width = w;
        this.height = h;
        this.position = p;
        this.volume = (l * w * h) / 3.0;
    }
}
