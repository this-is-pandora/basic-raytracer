package main.java.objects;

import main.java.vectors.Vector3;

public class Object {
    public Vector3 position;
    public double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double v) {
        this.volume = v;
    }

    public Vector3 getPosition() {
        return this.position;
    }

    public void setPosition(Vector3 p) {
        this.position = p;
    }

    public void translate() {
        // TODO:
    }

    public void transform() {
        // TODO:
    }

    public void rotate() {
        // TODO:
    }
}
