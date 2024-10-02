package org.example;

import java.util.ArrayList;

import exceptions.BadNumberExceptionCylinder;
import exceptions.BadNumberExceptionFigure;
import geometry2d.*;
import geometry3d.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Button ");
        System.out.println("------");
        Button button = new Button();
        button.click();
        button.click();
        System.out.println("------");
        System.out.println("Balance ");
        System.out.println("------");
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(6);
        balance.result();
        System.out.println("------");
        System.out.println("Bell ");
        System.out.println("------");
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        System.out.println("------");
        System.out.println("OddEvenSeparator");
        System.out.println("------");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(5);
        separator.addNumber(3);
        separator.addNumber(2);
        separator.odd();
        separator.even();
        System.out.println();
        System.out.println("------");
        System.out.println("Table");
        System.out.println("------");
        Table table = new Table(3,3);
        table.setValue(0,0,5);
        table.setValue(1,1,3);
        table.setValue(2,2,1);
        System.out.println("Value at 0,0: " + table.getValue(0, 0));
        System.out.println("Rows: " + table.rows());
        System.out.println("Cols: " + table.cols());
        System.out.println("Row 0 : " + table.toString(0));
        System.out.println("Table average : " + table.average());
        System.out.println("------");
        System.out.println("Circle radius 5");
        System.out.println("------");
        try {
            Figure circle = new Circle(5);
            System.out.println("Perimeter " + circle.perimeter());
            System.out.println("Area " + circle.area());
        } catch(BadNumberExceptionFigure e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------");
        System.out.println("Rectangle a = 5 b = 3");
        System.out.println("------");
        try {
            Figure rectangle = new Rectangle(5, 3);
            System.out.println("Perimeter " + rectangle.perimeter());
            System.out.println("Area " + rectangle.area());
        } catch(BadNumberExceptionFigure e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------");
        System.out.println("Cylinder radius = 5 height = 3");
        System.out.println("------");
        try {
            Figure circleBase = new Circle(5);
            Cylinder cylinder = new Cylinder(circleBase, 3);
            System.out.println("Volume " + cylinder.volume());
        } catch(BadNumberExceptionFigure | BadNumberExceptionCylinder e) {
            System.out.println(e.getMessage());
        }


    }
}
class Button {
    public int clicks;
    public Button() {
        this.clicks = 0;
    }
    public void click() {
        this.clicks++;
        System.out.println("clicks=" + this.clicks);
    }
}

class Balance {
    public int weightLeft;
    public int weightRight;
    public Balance() {
        this.weightLeft = 0;
        this.weightRight = 0;
    }
    public void addRight(int weight) {
        this.weightRight += weight;
    }
    public void addLeft(int weight) {
        this.weightLeft += weight;
    }
    public void result() {
        if (this.weightRight > this.weightLeft) {
            System.out.println("R");
        } else if (this.weightRight < this.weightLeft) {
            System.out.println("L");
        } else {
            System.out.println("=");
        }
    }
}

class Bell {
    boolean soundFlag = true;
    public void sound() {
        if (this.soundFlag) {
            System.out.println("ding");
            this.soundFlag= false;
        } else {
            System.out.println("dong");
            this.soundFlag = true;
        }
    }
}

class OddEvenSeparator {
    ArrayList<Integer> numbers = new ArrayList<>();
    public void addNumber(int number) {
        this.numbers.add(number);
    }
    public void even()
    {
        System.out.print("Even: ");
        for (Integer number : this.numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
    public void odd() {
        System.out.print("odd: ");
        for (Integer number : this.numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
class Table {
    int[][] table;
    int rows;
    int cols;
    Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.table = new int[rows][cols];
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table.length; j++) {
                this.table[i][j] = 0;
            }
        }
    }
    public int getValue(int row, int col) {
        return table[row][col];
    }
    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }
    public int rows() {
        return rows;
    }
    public int cols() {
        return cols;
    }

    public String toString(int row) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i<cols; i++) {
            str.append(table[row][i]);
            str.append(" ");
        }
        return str.toString();
    }
    public double average() {
        double allSum = 0;
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<cols; j++) {
                allSum += table[i][j];
            }
        }
        return allSum/(table.length*table.length);
    }
}
