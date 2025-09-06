package javassist.scopedpool;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.WeakHashMap;
import javassist.C;
import javassist.g;

public class e implements d {
    private boolean a;
    boolean b;
    protected Map c;
    protected g d;
    protected b e;
    private static final e f;

    static {
        e.f = new e();
    }

    private e() {
        this.a = true;
        this.c = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.e = new c();
        this.d = g.T();
        ClassLoader classLoader0 = Thread.currentThread().getContextClassLoader();
        this.d.l0(new C(classLoader0));
    }

    @Override  // javassist.scopedpool.d
    public void a(ClassLoader classLoader0) {
        synchronized(this.c) {
            a a0 = (a)this.c.remove(classLoader0);
            if(a0 != null) {
                a0.close();
            }
        }
    }

    @Override  // javassist.scopedpool.d
    public Map b() {
        this.i();
        return this.c;
    }

    @Override  // javassist.scopedpool.d
    public g c(ClassLoader classLoader0) {
        synchronized(this.c) {
            if(this.c.containsKey(classLoader0)) {
                return (g)this.c.get(classLoader0);
            }
            g g0 = this.d(classLoader0, this.d);
            this.c.put(classLoader0, g0);
            return g0;
        }
    }

    @Override  // javassist.scopedpool.d
    public a d(ClassLoader classLoader0, g g0) {
        return this.e.a(classLoader0, g0, this);
    }

    @Override  // javassist.scopedpool.d
    public b e() {
        return this.e;
    }

    @Override  // javassist.scopedpool.d
    public void f(b b0) {
        this.e = b0;
    }

    @Override  // javassist.scopedpool.d
    public void g(boolean z) {
        this.a = z;
    }

    @Override  // javassist.scopedpool.d
    public boolean h() {
        return this.a;
    }

    @Override  // javassist.scopedpool.d
    public void i() {
        synchronized(this.c) {
            List list0 = null;
            for(Object object0: this.c.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((a)map$Entry0.getValue()).I2()) {
                    ClassLoader classLoader0 = ((a)map$Entry0.getValue()).L();
                    if(classLoader0 != null) {
                        if(list0 == null) {
                            list0 = new ArrayList();
                        }
                        list0.add(classLoader0);
                    }
                    this.c.remove(map$Entry0.getKey());
                }
            }
            if(list0 != null) {
                for(Object object1: list0) {
                    this.a(((ClassLoader)object1));
                }
            }
        }
    }

    @Override  // javassist.scopedpool.d
    public g j(ClassLoader classLoader0) {
        return classLoader0 == null ? this.c(ClassLoader.getSystemClassLoader()) : this.c(classLoader0);
    }

    public static d k() {
        return e.f;
    }

    public void l(d d0) {
    }
}

