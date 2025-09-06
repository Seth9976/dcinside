package javassist.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class s extends r {
    public s(int v) {
        super(v);
    }

    @Override  // javassist.bytecode.r
    public int a(t t0, t t1, Map map0) {
        return t1.c();
    }

    @Override  // javassist.bytecode.r
    public int c() {
        return 0;
    }

    @Override  // javassist.bytecode.r
    public void d(PrintWriter printWriter0) {
        printWriter0.println("padding");
    }

    @Override  // javassist.bytecode.r
    public void g(DataOutputStream dataOutputStream0) throws IOException {
    }
}

