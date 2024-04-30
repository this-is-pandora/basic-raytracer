package main.java.camera;

import main.java.vectors.Vector3;

public class Camera {
    private Vector3 position;
    private Vector3 rotation;

    public Camera() {
        position = new Vector3();
        rotation = new Vector3();
    }

    public Camera(Vector3 pos, Vector3 rot) {
        this.position = pos;
        this.rotation = rot;
    }

    // getters/setters
    public Vector3 getPosition() {
        return position;
    }

    public void setPosition(Vector3 pos) {
        this.position = pos;
    }

    public Vector3 getRotation() {
        return rotation;
    }

    public void setRotation(Vector3 rot) {
        this.rotation = rot;
    }
}
