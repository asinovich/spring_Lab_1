package com.example.springLab.service;


import com.example.springLab.classes.ResultOfTriangle;
import com.example.springLab.classes.Triangle;
import org.springframework.stereotype.Service;

@Service
public class TriangleServiceImpl implements TriangleService {

    public ResultOfTriangle calculate(Triangle triangle) {

        if(triangle.checkingTriangle()) {
            return new ResultOfTriangle(
                    true,
                    triangle.findPerimeter(),
                    triangle.findSquare()

            );
        }
        else{
            return new ResultOfTriangle(
                    false,
                    0,
                    0
            );
        }

    }
}
