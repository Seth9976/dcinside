package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class p extends d implements c0 {
    static class a {
        a a;
        int b;
        int c;

        static byte[] a(byte[] arr_b, a p$a0, A a0, p p0) throws e {
            return p$a0 == null ? arr_b : q.g(arr_b, a0, p0, p$a0);
        }
    }

    public static class b extends RuntimeException {
        private static final long a = 1L;

        public b(String s) {
            super(s);
        }
    }

    private int d;
    private int e;
    private A f;
    private List g;
    public static final String h = "Code";

    public p(t t0, int v, int v1, byte[] arr_b, A a0) {
        super(t0, "Code");
        this.d = v;
        this.e = v1;
        this.c = arr_b;
        this.f = a0;
        this.g = new ArrayList();
    }

    p(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, null);
        dataInputStream0.readInt();
        this.d = dataInputStream0.readUnsignedShort();
        this.e = dataInputStream0.readUnsignedShort();
        byte[] arr_b = new byte[dataInputStream0.readInt()];
        this.c = arr_b;
        dataInputStream0.readFully(arr_b);
        this.f = new A(t0, dataInputStream0);
        this.g = new ArrayList();
        int v1 = dataInputStream0.readUnsignedShort();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.g.add(d.k(t0, dataInputStream0));
        }
    }

    private p(t t0, p p0, Map map0) throws e {
        super(t0, "Code");
        this.d = p0.E();
        this.e = p0.D();
        this.f = p0.C().e(t0, map0);
        this.g = new ArrayList();
        List list0 = p0.y();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            d d0 = (d)list0.get(v1);
            this.g.add(d0.a(t0, map0));
        }
        this.c = p0.v(t0, map0, this.f, this);
    }

    public int A() {
        return this.c.length;
    }

    public String B() {
        return this.d().C();
    }

    public A C() {
        return this.f;
    }

    public int D() {
        return this.e;
    }

    public int E() {
        return this.d;
    }

    public void F(int v, int v1) throws e {
        q q0 = this.G();
        while(q0.l()) {
            p.M(q0, v, v1);
        }
        this.K(this.D() + v1);
    }

    public q G() {
        return new q(this);
    }

    public void H(h0 h00) {
        d.l(this.g, "StackMap");
        if(h00 != null) {
            this.g.add(h00);
        }
    }

    public void I(i0 i00) {
        d.l(this.g, "StackMapTable");
        if(i00 != null) {
            this.g.add(i00);
        }
    }

    void J(byte[] arr_b) {
        super.q(arr_b);
    }

    public void K(int v) {
        this.e = v;
    }

    public void L(int v) {
        this.d = v;
    }

    private static void M(q q0, int v, int v1) throws e {
        int v2 = q0.J();
        int v3 = q0.f(v2);
        if(v3 < 21) {
            return;
        }
        if(v3 < 0x4F) {
            if(v3 < 26) {
                p.O(q0, v2, v3, v, v1);
                return;
            }
            if(v3 < 46) {
                p.N(q0, v2, v3, v, v1, 26, 21);
                return;
            }
            if(v3 < 54) {
                return;
            }
            if(v3 < 59) {
                p.O(q0, v2, v3, v, v1);
                return;
            }
            p.N(q0, v2, v3, v, v1, 59, 54);
            return;
        }
        switch(v3) {
            case 0x84: {
                int v4 = q0.f(v2 + 1);
                if(v4 < v) {
                    return;
                }
                int v5 = v4 + v1;
                if(v5 < 0x100) {
                    q0.Y(v5, v2 + 1);
                    return;
                }
                int v6 = (byte)q0.f(v2 + 2);
                int v7 = q0.u(3);
                q0.Y(0xC4, v7 - 3);
                q0.Y(0x84, v7 - 2);
                q0.W(v5, v7 - 1);
                q0.W(v6, v7 + 1);
                return;
            }
            case 0xA9: {
                p.O(q0, v2, 0xA9, v, v1);
                return;
            }
            case 0xC4: {
                int v8 = q0.T(v2 + 2);
                if(v8 < v) {
                    return;
                }
                q0.W(v8 + v1, v2 + 2);
            }
        }
    }

    private static void N(q q0, int v, int v1, int v2, int v3, int v4, int v5) throws e {
        int v6 = v1 - v4;
        if(v6 % 4 < v2) {
            return;
        }
        int v7 = v6 % 4 + v3;
        if(v7 < 4) {
            q0.Y(v1 + v3, v);
            return;
        }
        int v8 = v6 / 4 + v5;
        if(v7 < 0x100) {
            int v9 = q0.u(1);
            q0.Y(v8, v9 - 1);
            q0.Y(v7, v9);
            return;
        }
        int v10 = q0.u(3);
        q0.Y(0xC4, v10 - 1);
        q0.Y(v8, v10);
        q0.W(v7, v10 + 1);
    }

    private static void O(q q0, int v, int v1, int v2, int v3) throws e {
        int v4 = q0.f(v + 1);
        if(v4 < v2) {
            return;
        }
        int v5 = v4 + v3;
        if(v5 < 0x100) {
            q0.Y(v5, v + 1);
            return;
        }
        int v6 = q0.u(2);
        q0.Y(0xC4, v6 - 2);
        q0.Y(v1, v6 - 1);
        q0.W(v5, v6);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) throws b {
        try {
            return new p(t0, this, map0);
        }
        catch(e unused_ex) {
            throw new b("bad bytecode. fatal?");
        }
    }

    @Override  // javassist.bytecode.d
    public byte[] c() {
        throw new UnsupportedOperationException("CodeAttribute.get()");
    }

    @Override  // javassist.bytecode.d
    void h(Map map0) {
        d.g(this.g, map0);
    }

    @Override  // javassist.bytecode.d
    public int i() {
        return this.c.length + 18 + this.f.p() * 8 + d.e(this.g);
    }

    @Override  // javassist.bytecode.d
    void m(String s, String s1) {
        d.n(this.g, s, s1);
    }

    @Override  // javassist.bytecode.d
    void p(Map map0) {
        d.o(this.g, map0);
    }

    @Override  // javassist.bytecode.d
    public void q(byte[] arr_b) {
        throw new UnsupportedOperationException("CodeAttribute.set()");
    }

    @Override  // javassist.bytecode.d
    void r(DataOutputStream dataOutputStream0) throws IOException {
        dataOutputStream0.writeShort(this.b);
        dataOutputStream0.writeInt(this.i() - 6);
        dataOutputStream0.writeShort(this.d);
        dataOutputStream0.writeShort(this.e);
        dataOutputStream0.writeInt(this.c.length);
        dataOutputStream0.write(this.c);
        this.f.r(dataOutputStream0);
        dataOutputStream0.writeShort(this.g.size());
        d.s(this.g, dataOutputStream0);
    }

    public int t() throws e {
        int v = new o(this).b();
        this.d = v;
        return v;
    }

    private static a u(byte[] arr_b, int v, int v1, t t0, byte[] arr_b1, t t1, Map map0) throws e {
        a p$a0 = null;
        while(v < v1) {
            int v2 = q.K(arr_b, v);
            byte b = arr_b[v];
            arr_b1[v] = b;
            switch(b & 0xFF) {
                case 18: {
                    int v3 = t0.y(arr_b[v + 1] & 0xFF, t1, map0);
                    if(v3 < 0x100) {
                        arr_b1[v + 1] = (byte)v3;
                    }
                    else {
                        arr_b1[v] = 0;
                        arr_b1[v + 1] = 0;
                        a p$a1 = new a();
                        p$a1.b = v;
                        p$a1.c = v3;
                        p$a1.a = p$a0;
                        p$a0 = p$a1;
                    }
                    break;
                }
                case 0xB9: {
                    p.w(v + 1, arr_b, t0, arr_b1, t1, map0);
                    arr_b1[v + 3] = arr_b[v + 3];
                    arr_b1[v + 4] = arr_b[v + 4];
                    break;
                }
                case 0xBA: {
                    p.w(v + 1, arr_b, t0, arr_b1, t1, map0);
                    arr_b1[v + 3] = 0;
                    arr_b1[v + 4] = 0;
                    break;
                }
                case 19: 
                case 20: 
                case 0xB2: 
                case 0xB3: 
                case 180: 
                case 0xB5: 
                case 0xB6: 
                case 0xB7: 
                case 0xB8: 
                case 0xBB: 
                case 0xBD: 
                case 0xC0: 
                case 0xC1: {
                    p.w(v + 1, arr_b, t0, arr_b1, t1, map0);
                    break;
                }
                case 0xC5: {
                    p.w(v + 1, arr_b, t0, arr_b1, t1, map0);
                    arr_b1[v + 3] = arr_b[v + 3];
                    break;
                }
                default: {
                    while(true) {
                        ++v;
                        if(v >= v2) {
                            break;
                        }
                        arr_b1[v] = arr_b[v];
                    }
                }
            }
            v = v2;
        }
        return p$a0;
    }

    private byte[] v(t t0, Map map0, A a0, p p0) throws e {
        int v = this.A();
        byte[] arr_b = new byte[v];
        p0.c = arr_b;
        return a.a(arr_b, p.u(this.c, 0, v, this.d(), arr_b, t0, map0), a0, p0);
    }

    private static void w(int v, byte[] arr_b, t t0, byte[] arr_b1, t t1, Map map0) {
        int v1 = t0.y(arr_b[v + 1] & 0xFF | (arr_b[v] & 0xFF) << 8, t1, map0);
        arr_b1[v] = (byte)(v1 >> 8);
        arr_b1[v + 1] = (byte)v1;
    }

    public d x(String s) {
        return d.j(this.g, s);
    }

    public List y() {
        return this.g;
    }

    public byte[] z() {
        return this.c;
    }
}

