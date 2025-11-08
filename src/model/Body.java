package model;

import visitor.CarVisitor;

public class Body implements Car{
    @Override
    public void accept(CarVisitor visitor){
        visitor.visit(this);
    }
    @Override
    public String getName(){
        return "Body";
    }
}
