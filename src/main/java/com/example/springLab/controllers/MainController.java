package com.example.springLab.controllers;



import com.example.springLab.classes.ResultOfTriangle;
import com.example.springLab.classes.Triangle;
import com.example.springLab.service.TriangleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.ConstraintViolationException;
import javax.validation.constraints.Min;

@Validated
@RestController
public class MainController {

    private TriangleService service;

    @Autowired
    public MainController(TriangleService service) {
        this.service = service;
    }

    @GetMapping("/Triangle")
    public ResultOfTriangle getParameters(@RequestParam @Min(1) float sideFirst,
                                          @RequestParam @Min(1) float sideSecond,
                                          @RequestParam @Min(1) float sideThird) throws ConstraintViolationException{

        return service.calculate(new Triangle(sideFirst, sideSecond, sideThird));
    }
}