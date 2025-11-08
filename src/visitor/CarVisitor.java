package visitor;

import model.*;

public interface CarVisitor {
    void visit(Engine engine);
    void visit(Wheel wheel);
    void visit(Body body);
    void visit(Brake brake);
}
