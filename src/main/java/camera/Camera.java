package main.java.camera;

import main.java.vectors.Vector3;

/*
 * The viewport differs from our xyz plane
 * for the xyz plane, up is positive and down is negative
 * and the origin is at (0, 0, 0)
 * 
 * but for our viewport (what we will shoot rays through)
 * the upper left pixel is (0,0)
 */
public class Camera {
    private Vector3 position, rotation, viewport_x, viewport_y,
            pixel_delta_x, pixel_delta_y;
    private double focal_length;
    private int i_width, i_height; // image width and height
    private double viewport_width, viewport_height;

    public Camera() {
        position = new Vector3();
        rotation = new Vector3();
        // we are going with a 1:1 aspect ratio
        i_width = 256;
        i_height = 256;
        viewport_height = 2.0;
        viewport_width = 2.0;
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
