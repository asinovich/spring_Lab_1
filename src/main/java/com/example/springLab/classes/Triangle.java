package com.example.springLab.classes;


public class Triangle {

    private float sideFirst;
    private float sideSecond;
    private float sideThird;

    public Triangle(float sideFirst,float sideSecond, float sideThird){

        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.sideThird = sideThird;
    }

    public boolean checkingTriangle(){
        if(sideFirst + sideSecond < sideThird ||
                sideFirst + sideThird < sideSecond || sideSecond + sideThird < sideFirst) {
            return false;
        }
        else
            return true;
    }

    public float findSquare(){
        float perimeter = findPerimeter()/2;
        return (float)Math.sqrt(perimeter*(perimeter - sideFirst)*(perimeter - sideSecond)*(perimeter - sideThird));
    }

    public float findPerimeter(){
        return sideFirst + sideSecond + sideThird;
    }

    public float getSideFirst() {
        return sideFirst;
    }

    public float getSideSecond() {
        return sideSecond;
    }

    public float getSideThird() {
        return sideThird;
    }
}
