package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class x extends r {
    double b;
    static final int c = 6;

    public x(double f, int v) {
        super(v);
        this.b = f;
    }

    public x(DataInputStream dataInputStream0, int v) throws IOException {
        super(v);
        this.b = dataInputStream0.readDouble();
    }

    @Override  // javassist.bytecode.r
    public int a(t t0, t t1, Map map0) {
        return t1.d(this.b);
    }

    @Override  // javassist.bytecode.r
    public int c() {
        return 6;
    }

    @Override  // javassist.bytecode.r
    public void d(PrintWriter printWriter0) {
        printWriter0.print("Double ");
        printWriter0.println(this.b);
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof x && ((x)object0).b == this.b;
    }

    @Override  // javassist.bytecode.r
    public void g(DataOutputStream dataOutputStream0) throws IOException {
        dataOutputStream0.writeByte(6);
        dataOutputStream0.writeDouble(this.b);
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.b);
        return (int)(v ^ v >>> 0x20);
    }
}

