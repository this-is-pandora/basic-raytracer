package main.java.objects;

import main.java.objects.Object;
import main.java.vectors.Vector3;
import java.lang.Math;
/* 
* equation for a sphere: x^2 + y^2 + z^2 = r^2

* if a given point (x,y,z) is on the surface of the sphere:
* x^2 + y^2 + z^2 = r^2 

* if, the point is inside the sphere:
* x^2 + y^2 + z^2 < r^2

* and if it is outside the sphere:
* x^2 + y^2 + z^2 > r^2
*/

public class Sphere extends Object {
    public double radius, diameter;

    // create a sphere of radius r at position p
    public Sphere(double r, Vector3 p) {
        this.radius = r;
        this.volume = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        this.position = p;
    }

    // creates a sphere of radius r at the origin
    public Sphere(double r) {
        this.radius = r;
        this.volume = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        this.position = new Vector3();
    }

    // creates a sphere of radius 1 at the origin
    public Sphere() {
        this.radius = 1;
        this.volume = (4.0 / 3) * Math.PI * Math.pow(1, 3);
        this.position = new Vector3();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void setDiameter(double d) {
        this.diameter = d;
    }

}
