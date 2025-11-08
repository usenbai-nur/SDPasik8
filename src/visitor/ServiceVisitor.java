package visitor;

import model.*;

public class ServiceVisitor implements CarVisitor{
    @Override
    public void visit(Engine engine){
        System.out.println("checking engine oil");
    }
    @Override
    public void visit(Wheel wheel){
        System.out.println("checking tire pressure");
    }
    @Override
    public void visit(Body body){
        System.out.println("cleaning car body");
    }
    @Override
    public void visit(Brake brake){
        System.out.println("checking brake pads");
    }
}
