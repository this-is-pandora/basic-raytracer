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

    // u + v
    public Vector3 add(Vector3 v) {
        double _x = this.x + v.x;
        double _y = this.y + v.y;
        double _z = this.z + v.z;
        return new Vector3(_x, _y, _z);
    }

    // u -v
    public Vector3 sub(Vector3 v) {
        double _x = this.x - v.x;
        double _y = this.y - v.y;
        double _z = this.z - v.z;
        return new Vector3(_x, _y, _z);
    }

    // example: 10 * <1,2,3> = <10*1, 10*2, 10*3> = <10, 20, 30>
    public Vector3 scalar_product(double t) {
        return new Vector3(t * this.x, t * this.y, t * this.z);
    }

    public double dot_product(Vector3 v, double theta) {
        return this.length() * v.length() * Math.cos(theta);
    }

    public Vector3 cross_product(Vector3 v) {
        return new Vector3(
                this.y * v.z - this.z * v.y,
                this.z * v.x - this.x * v.z,
                this.x * v.y - this.y * v.x);
    }

    // u / t
    public Vector3 quotient(double t) {
        return this.scalar_product(1 / t);
    }

    // u / u.length()
    public Vector3 get_unit_vector() {
        return this.quotient(this.length());
    }

    public double length() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }
}
