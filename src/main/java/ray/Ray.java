package main.java.ray;

import main.java.vectors.Vector3;

/*
 * A ray is mathematically defined as: P(t) = A + tb
 * P: position on the xyz plane
 * A: origin of the ray
 * b: direction of the ray
 * t: double that moves a point along the ray.
 *  - Positives moves the point in front of A. 
 *  - Negatives move the point behind A
 */
public class Ray {
    private Vector3 origin;
    private Vector3 direction;

    public Ray(Vector3 origin, Vector3 direction) {
        this.origin = origin;
        this.direction = direction;
    }

    // implements the formula: P(t) = A + tb
    public Vector3 At(double t) {
        return this.origin.add(direction.scalar_product(t));
    }
}
