package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class j0 extends r {
    int b;
    static final int c = 8;

    public j0(int v, int v1) {
        super(v1);
        this.b = v;
    }

    public j0(DataInputStream dataInputStream0, int v) throws IOException {
        super(v);
        this.b = dataInputStream0.readUnsignedShort();
    }

    @Override  // javassist.bytecode.r
    public int a(t t0, t t1, Map map0) {
        return t1.w(t0.p0(this.b));
    }

    @Override  // javassist.bytecode.r
    public int c() {
        return 8;
    }

    @Override  // javassist.bytecode.r
    public void d(PrintWriter printWriter0) {
        printWriter0.print("String #");
        printWriter0.println(this.b);
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof j0 && ((j0)object0).b == this.b;
    }

    @Override  // javassist.bytecode.r
    public void g(DataOutputStream dataOutputStream0) throws IOException {
        dataOutputStream0.writeByte(8);
        dataOutputStream0.writeShort(this.b);
    }

    @Override
    public int hashCode() {
        return this.b;
    }
}

