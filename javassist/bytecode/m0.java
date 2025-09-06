package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class m0 extends r {
    String b;
    static final int c = 1;

    public m0(DataInputStream dataInputStream0, int v) throws IOException {
        super(v);
        this.b = dataInputStream0.readUTF();
    }

    public m0(String s, int v) {
        super(v);
        this.b = s;
    }

    @Override  // javassist.bytecode.r
    public int a(t t0, t t1, Map map0) {
        return t1.x(this.b);
    }

    @Override  // javassist.bytecode.r
    public int c() {
        return 1;
    }

    @Override  // javassist.bytecode.r
    public void d(PrintWriter printWriter0) {
        printWriter0.print("UTF8 \"");
        printWriter0.print(this.b);
        printWriter0.println("\"");
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof m0 && ((m0)object0).b.equals(this.b);
    }

    @Override  // javassist.bytecode.r
    public void g(DataOutputStream dataOutputStream0) throws IOException {
        dataOutputStream0.writeByte(1);
        dataOutputStream0.writeUTF(this.b);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
}

