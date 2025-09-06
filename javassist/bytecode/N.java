package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class n extends r {
    int b;
    static final int c = 7;

    public n(int v, int v1) {
        super(v1);
        this.b = v;
    }

    public n(DataInputStream dataInputStream0, int v) throws IOException {
        super(v);
        this.b = dataInputStream0.readUnsignedShort();
    }

    @Override  // javassist.bytecode.r
    public int a(t t0, t t1, Map map0) {
        String s = t0.p0(this.b);
        if(map0 != null) {
            String s1 = (String)map0.get(s);
            if(s1 != null) {
                s = s1;
            }
        }
        return t1.a(s);
    }

    @Override  // javassist.bytecode.r
    public String b(t t0) {
        return t0.p0(this.b);
    }

    @Override  // javassist.bytecode.r
    public int c() {
        return 7;
    }

    @Override  // javassist.bytecode.r
    public void d(PrintWriter printWriter0) {
        printWriter0.print("Class #");
        printWriter0.println(this.b);
    }

    @Override  // javassist.bytecode.r
    public void e(t t0, String s, String s1, Map map0) {
        String s2 = t0.p0(this.b);
        if(!s2.equals(s)) {
            if(s2.charAt(0) == 91) {
                s1 = w.t(s2, s, s1);
                if(s2 == s1) {
                    s1 = null;
                }
            }
            else {
                s1 = null;
            }
        }
        if(s1 != null) {
            if(map0 == null) {
                this.b = t0.x(s1);
                return;
            }
            map0.remove(this);
            this.b = t0.x(s1);
            map0.put(this, this);
        }
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof n && ((n)object0).b == this.b;
    }

    @Override  // javassist.bytecode.r
    public void f(t t0, Map map0, Map map1) {
        String s2;
        String s = t0.p0(this.b);
        String s1 = null;
        if(s.charAt(0) == 91) {
            s2 = w.u(s, map0);
            if(s != s2) {
                s1 = s2;
            }
        }
        else {
            s2 = (String)map0.get(s);
            if(s2 != null && !s2.equals(s)) {
                s1 = s2;
            }
        }
        if(s1 != null) {
            if(map1 == null) {
                this.b = t0.x(s1);
                return;
            }
            map1.remove(this);
            this.b = t0.x(s1);
            map1.put(this, this);
        }
    }

    @Override  // javassist.bytecode.r
    public void g(DataOutputStream dataOutputStream0) throws IOException {
        dataOutputStream0.writeByte(7);
        dataOutputStream0.writeShort(this.b);
    }

    @Override
    public int hashCode() {
        return this.b;
    }
}

