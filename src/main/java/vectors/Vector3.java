package main.java.vectors;

import java.lang.Math;

// 3D vector (x,y,z)
public class Vector3 {
    double x, y, z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // gives the 0-vector
    public Vector3() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3 add(Vector3 v) {
        double _x = this.x + v.x;
        double _y = this.y + v.y;
        double _z = this.z + v.z;
        return new Vector3(_x, _y, _z);
    }

    public Vector3 sub(Vector3 v) {
        double _x = this.x - v.x;
        double _y = this.y - v.y;
        double _z = this.z - v.z;
        return new Vector3(_x, _y, _z);
    }

    public double dot_product(Vector3 v, double theta) {
        return this.length() * v.length() * Math.cos(theta);
    }

    public Vector3 cross_product(Vector3 v) {
        // TODO
        return new Vector3();
    }

    public Vector3 get_unit_vector() {
        // TODO
        return new Vector3();
    }

    public double length() {
        return 0.0;
    }
}
