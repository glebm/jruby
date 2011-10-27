package org.jruby.compiler.ir.instructions;

import org.jruby.compiler.ir.Operation;
import org.jruby.compiler.ir.operands.Label;
import org.jruby.compiler.ir.operands.Operand;

public abstract class BranchInstr extends TwoOperandInstr {
    private Label target;

    public BranchInstr(Operation op, Operand v1, Operand v2, Label jmpTarget) {
        super(op, null, v1, v2);
        target = jmpTarget;
    }

    public Label getJumpTarget() {
        return target;
    }

    // Can this instruction raise exceptions?
    @Override
    public boolean canRaiseException() {
        return false;
    }

    @Override
    public String toString() {
        return "" + getOperation() + "(" + operand1 + ", " + operand2 + ", " + target + ")";
    }
}
