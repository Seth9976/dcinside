package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

abstract class r {
    int a;

    public r(int v) {
        this.a = v;
    }

    public abstract int a(t arg1, t arg2, Map arg3);

    public String b(t t0) {
        return null;
    }

    public abstract int c();

    public abstract void d(PrintWriter arg1);

    public void e(t t0, String s, String s1, Map map0) {
    }

    public void f(t t0, Map map0, Map map1) {
    }

    public abstract void g(DataOutputStream arg1) throws IOException;

    @Override
    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        this.d(new PrintWriter(byteArrayOutputStream0));
        return byteArrayOutputStream0.toString();
    }
}

