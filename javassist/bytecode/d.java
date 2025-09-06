package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class D {
    t a;
    int b;
    int c;
    String d;
    String e;
    int f;
    List g;

    private D(t t0) {
        this.a = t0;
        this.b = 0;
        this.g = null;
    }

    D(t t0, DataInputStream dataInputStream0) throws IOException {
        this(t0);
        this.k(dataInputStream0);
    }

    public D(t t0, String s, String s1) {
        this(t0);
        this.c = t0.x(s);
        this.d = s;
        this.f = t0.x(s1);
    }

    public void a(d d0) {
        if(this.g == null) {
            this.g = new ArrayList();
        }
        d.l(this.g, d0.f());
        this.g.add(d0);
    }

    void b(t t0) {
        this.c = t0.x(this.i());
        this.f = t0.x(this.h());
        this.g = d.b(this.g, t0);
        this.a = t0;
    }

    public int c() {
        return this.b;
    }

    public d d(String s) {
        return d.j(this.g, s);
    }

    public List e() {
        if(this.g == null) {
            this.g = new ArrayList();
        }
        return this.g;
    }

    public t f() {
        return this.a;
    }

    public int g() {
        if((this.b & 8) == 0) {
            return 0;
        }
        u u0 = (u)this.d("ConstantValue");
        return u0 == null ? 0 : u0.t();
    }

    public String h() {
        return this.a.p0(this.f);
    }

    public String i() {
        if(this.d == null) {
            this.d = this.a.p0(this.c);
        }
        return this.d;
    }

    void j(t t0) {
        ArrayList arrayList0 = new ArrayList();
        d d0 = this.d("RuntimeInvisibleAnnotations");
        if(d0 != null) {
            arrayList0.add(d0.a(t0, null));
        }
        d d1 = this.d("RuntimeVisibleAnnotations");
        if(d1 != null) {
            arrayList0.add(d1.a(t0, null));
        }
        d d2 = this.d("Signature");
        if(d2 != null) {
            arrayList0.add(d2.a(t0, null));
        }
        int v = this.g();
        if(v != 0) {
            arrayList0.add(new u(t0, this.a.y(v, t0, null)));
        }
        this.g = arrayList0;
        this.c = t0.x(this.i());
        this.f = t0.x(this.h());
        this.a = t0;
    }

    private void k(DataInputStream dataInputStream0) throws IOException {
        this.b = dataInputStream0.readUnsignedShort();
        this.c = dataInputStream0.readUnsignedShort();
        this.f = dataInputStream0.readUnsignedShort();
        int v = dataInputStream0.readUnsignedShort();
        this.g = new ArrayList();
        for(int v1 = 0; v1 < v; ++v1) {
            this.g.add(d.k(this.a, dataInputStream0));
        }
    }

    public d l(String s) {
        return d.l(this.g, s);
    }

    public void m(int v) {
        this.b = v;
    }

    public void n(String s) {
        if(!s.equals(this.h())) {
            this.f = this.a.x(s);
        }
    }

    public void o(String s) {
        this.c = this.a.x(s);
        this.d = s;
    }

    void p(DataOutputStream dataOutputStream0) throws IOException {
        dataOutputStream0.writeShort(this.b);
        dataOutputStream0.writeShort(this.c);
        dataOutputStream0.writeShort(this.f);
        List list0 = this.g;
        if(list0 == null) {
            dataOutputStream0.writeShort(0);
            return;
        }
        dataOutputStream0.writeShort(list0.size());
        d.s(this.g, dataOutputStream0);
    }

    @Override
    public String toString() {
        return this.i() + " " + this.h();
    }
}

