package visitor;

import model.*;

public class PriceVisitor implements CarVisitor{
    private double price=0;
    @Override
    public void visit(Engine engine) {
        System.out.println("Engine serve cost: 25000");
        price+=25000;
    }
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Wheel serve cost: 2000");
        price+=2000;
    }
    @Override
    public void visit(Body body) {
        System.out.println("Body serve cost: 15000");
        price+=15000;
    }
    @Override
    public void visit(Brake brake) {
        System.out.println("Brake serve cost: 20000");
        price+=20000;
    }
    public double getPrice(){
        return price;
    }
    public void resetCost(){
        price=0;
    }
}
