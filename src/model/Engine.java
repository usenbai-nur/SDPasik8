package model;

import visitor.CarVisitor;

public class Engine implements Car {
    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String getName(){
        return "Engine";
    }
}
