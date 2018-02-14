package com.company.Question_1;

public class Square extends Shape{
    private int formulaForArea;
    private int formulaForPerimeter;

    public Square(int formulaForArea, int formulaForPerimeter) {
        this.formulaForArea = formulaForArea;
        this.formulaForPerimeter = formulaForPerimeter;
    }

    public int getFormulaForArea() {
        return formulaForArea;
    }

    public void setFormulaForArea(int formulaForArea) {
        this.formulaForArea = formulaForArea;
    }

    public int getFormulaForPerimeter() {
        return formulaForPerimeter;
    }

    public void setFormulaForPerimeter(int formulaForPerimeter) {
        this.formulaForPerimeter = formulaForPerimeter;
    }
}
