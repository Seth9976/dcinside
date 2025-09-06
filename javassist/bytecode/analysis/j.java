package javassist.bytecode.analysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javassist.bytecode.A;
import javassist.bytecode.T;
import javassist.bytecode.c0;
import javassist.bytecode.e;
import javassist.bytecode.p;
import javassist.bytecode.q;

public class j implements c0 {
    private i[] a;
    Map b;
    Set c;

    public j() {
        this.b = new HashMap();
        this.c = new HashSet();
    }

    private void a(int v, q q0, i i0) throws e {
        if(this.c.contains(v)) {
            return;
        }
        this.c.add(v);
        int v1 = q0.E();
        q0.H(v);
        while(this.d(q0.J(), q0, i0) && q0.l()) {
        }
        q0.H(v1);
    }

    public i[] b(T t0) throws e {
        p p0 = t0.f();
        q q0 = p0.G();
        this.a = new i[p0.A()];
        this.b.clear();
        this.c.clear();
        this.a(0, q0, null);
        A a0 = p0.C();
        for(int v = 0; v < a0.p(); ++v) {
            int v1 = a0.g(v);
            i[] arr_i = this.a;
            this.a(v1, q0, arr_i[a0.q(v)]);
        }
        return this.a;
    }

    private void c(int v, q q0, i i0) throws e {
        this.a(q0.M((v & -4) + 4) + v, q0, i0);
        int v1 = q0.M((v & -4) + 8);
        for(int v2 = (v & -4) + 16; v2 < v1 * 8 + ((v & -4) + 12); v2 += 8) {
            this.a(q0.M(v2) + v, q0, i0);
        }
    }

    private boolean d(int v, q q0, i i0) throws e {
        this.a[v] = i0;
        int v1 = q0.f(v);
        if(v1 == 170) {
            this.e(v, q0, i0);
            return false;
        }
        if(v1 == 0xAB) {
            this.c(v, q0, i0);
            return false;
        }
        if(!l.e(v1) && (v1 != 0xA9 && v1 != 0xBF)) {
            if(l.d(v1)) {
                int v2 = l.a(v, q0);
                if(v1 != 0xA8 && v1 != 201) {
                    this.a(v2, q0, i0);
                    return !l.b(v1);
                }
                i i1 = (i)this.b.get(v2);
                if(i1 == null) {
                    i i2 = new i(v2, v);
                    this.b.put(v2, i2);
                    this.a(v2, q0, i2);
                    return true;
                }
                i1.c(v);
            }
            return true;
        }
        return false;
    }

    private void e(int v, q q0, i i0) throws e {
        this.a(q0.M((v & -4) + 4) + v, q0, i0);
        int v1 = (v & -4) + 16;
        int v2 = (q0.M((v & -4) + 12) - q0.M((v & -4) + 8) + 1) * 4 + v1;
        while(v1 < v2) {
            this.a(q0.M(v1) + v, q0, i0);
            v1 += 4;
        }
    }
}

