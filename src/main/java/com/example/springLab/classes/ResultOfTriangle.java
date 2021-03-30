package com.example.springLab.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultOfTriangle {

    @JsonProperty
    final private boolean isTriangleExist;
    @JsonProperty
    final private float perimeter;
    @JsonProperty
    final private float square;

    public ResultOfTriangle(boolean isTriangleExist, float perimeter, float square) {
        this.isTriangleExist = isTriangleExist;
        this.perimeter = perimeter;
        this.square = square;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ResultOfTriangle that = (ResultOfTriangle) obj;
        return Boolean.compare(that.isTriangleExist, isTriangleExist) == 0 && Float.compare(that.perimeter, perimeter) == 0 && Float.compare(that.square, square) == 0;
    }

    public boolean getIsTriangleExist() {
        return isTriangleExist;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public float getSquare() {
        return square;
    }
}
