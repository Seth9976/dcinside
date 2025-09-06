package javassist.scopedpool;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.security.ProtectionDomain;
import java.util.Map;
import javassist.C;
import javassist.E;
import javassist.b;
import javassist.g;
import javassist.l;

public class a extends g {
    protected d m;
    protected Reference n;
    protected C o;
    protected Map p;
    boolean q;

    static {
        g.h = false;
        g.j = false;
    }

    protected a(ClassLoader classLoader0, g g0, d d0) {
        this(classLoader0, g0, d0, false);
    }

    protected a(ClassLoader classLoader0, g g0, d d0, boolean z) {
        super(g0);
        this.p = new f();
        this.q = true;
        this.m = d0;
        this.n = new WeakReference(classLoader0);
        if(classLoader0 != null) {
            C c0 = new C(classLoader0);
            this.o = c0;
            this.l0(c0);
        }
        this.a = true;
        if(!z && classLoader0 == null) {
            this.q = true;
        }
    }

    protected ClassLoader A2() {
        return (ClassLoader)this.n.get();
    }

    public l C2(String s) throws E {
        synchronized(this) {
            this.p.remove(s);
            l l0 = (l)this.e.get(s);
            if(l0 == null) {
                l0 = this.p(s, true);
                if(l0 == null) {
                    throw new E(s);
                }
                super.f(s, l0, false);
                return l0;
            }
            return l0;
        }
    }

    public boolean I2() [...] // Inlined contents

    @Override  // javassist.g
    public ClassLoader L() {
        ClassLoader classLoader0 = this.A2();
        if(classLoader0 == null && !this.q) {
            throw new IllegalStateException("ClassLoader has been garbage collected");
        }
        return classLoader0;
    }

    public void L2(l l0) {
        super.f(l0.X(), l0, false);
    }

    public void P2(l l0) {
        synchronized(this) {
            if(this.m.h()) {
                l0.v0();
            }
            this.e.remove(l0.X());
            this.p.put(l0.X(), l0);
        }
    }

    public void close() {
        this.N1(this.o);
        this.e.clear();
        this.p.clear();
    }

    @Override  // javassist.g
    protected void f(String s, l l0, boolean z) {
        if(z) {
            super.f(s, l0, true);
            return;
        }
        if(this.m.h()) {
            l0.v0();
        }
        this.p.put(s, l0);
    }

    @Override  // javassist.g
    public Class i2(l l0, ClassLoader classLoader0, ProtectionDomain protectionDomain0) throws b {
        this.L2(l0);
        return super.i2(l0, this.A2(), protectionDomain0);
    }

    public void p2(String s) {
        synchronized(this) {
            this.e.remove(s);
            this.p.remove(s);
        }
    }

    protected l t2(String s) {
        l l0 = (l)this.e.get(s);
        if(l0 != null) {
            return l0;
        }
        Map map0 = this.p;
        return (l)this.p.get(s);
    }

    @Override  // javassist.g
    protected l x(String s) {
        l l0 = this.t2(s);
        if(l0 == null) {
            ClassLoader classLoader0 = this.A2();
            if(classLoader0 == null) {
            label_6:
                Map map0 = this.m.b();
                synchronized(map0) {
                    for(Object object0: map0.values()) {
                        l0 = ((a)object0).t2(s);
                        if(l0 != null) {
                            return l0;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
            else {
                int v = s.lastIndexOf(36);
                if(classLoader0.getResource((v >= 0 ? s.substring(0, v).replaceAll("[\\.]", "/") + s.substring(v) + ".class" : s.replaceAll("[\\.]", "/") + ".class")) == null) {
                    goto label_6;
                }
            }
        }
        return l0;
    }
}

