package model;

import visitor.CarVisitor;

public interface Car {
    void accept(CarVisitor visitor);
    String  getName();
}