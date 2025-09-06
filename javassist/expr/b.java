package javassist.expr;

import javassist.E;
import javassist.bytecode.T;
import javassist.bytecode.q;
import javassist.l;
import javassist.n;

public class b extends h {
    protected b(int v, q q0, l l0, T t0) {
        super(v, q0, l0, t0);
    }

    public n A() throws E {
        return this.u().y(this.y());
    }

    @Override  // javassist.expr.h
    public javassist.q v() throws E {
        throw new E("this is a constructor call.  Call getConstructor().");
    }

    // 去混淆评级： 低(20)
    @Override  // javassist.expr.h
    public String w() {
        return this.z() ? "super" : "this";
    }

    @Override  // javassist.expr.h
    public boolean z() {
        return super.z();
    }
}

