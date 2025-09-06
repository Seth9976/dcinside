package com.facebook.common.references;

import java.util.IdentityHashMap;
import java.util.Map;
import k1.d;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class i {
    public static class com.facebook.common.references.i.a extends RuntimeException {
        public com.facebook.common.references.i.a() {
            super("Null shared reference");
        }
    }

    @h
    @p3.a("this")
    private Object a;
    @p3.a("this")
    private int b;
    @h
    private final com.facebook.common.references.h c;
    @p3.a("itself")
    private static final Map d;

    static {
        i.d = new IdentityHashMap();
    }

    public i(Object object0, com.facebook.common.references.h h0) {
        this(object0, h0, false);
    }

    public i(Object object0, @h com.facebook.common.references.h h0, boolean z) {
        this.a = com.facebook.common.internal.n.i(object0);
        this.c = h0;
        this.b = 1;
        if(z) {
            i.a(object0);
        }
    }

    private static void a(Object object0) {
        Map map0 = i.d;
        synchronized(map0) {
            Integer integer0 = (Integer)map0.get(object0);
            if(integer0 == null) {
                map0.put(object0, 1);
            }
            else {
                map0.put(object0, ((int)(((int)integer0) + 1)));
            }
        }
    }

    public void b() {
        synchronized(this) {
            this.g();
            ++this.b;
        }
    }

    public boolean c() {
        synchronized(this) {
            if(this.j()) {
                this.b();
                return true;
            }
            return false;
        }
    }

    private int d() {
        synchronized(this) {
            this.g();
            com.facebook.common.internal.n.d(Boolean.valueOf(this.b > 0));
            int v1 = this.b - 1;
            this.b = v1;
            return v1;
        }
    }

    public void e() {
        Object object0;
        if(this.d() == 0) {
            synchronized(this) {
                object0 = this.a;
                this.a = null;
            }
            if(object0 != null) {
                com.facebook.common.references.h h0 = this.c;
                if(h0 != null) {
                    h0.a(object0);
                }
                i.l(object0);
            }
        }
    }

    public boolean f() {
        synchronized(this) {
            if(this.j()) {
                this.e();
                return true;
            }
            return false;
        }
    }

    private void g() {
        if(!i.k(this)) {
            throw new com.facebook.common.references.i.a();
        }
    }

    @h
    public Object h() {
        synchronized(this) {
        }
        return this.a;
    }

    public int i() {
        synchronized(this) {
        }
        return this.b;
    }

    public boolean j() {
        synchronized(this) {
        }
        return this.b > 0;
    }

    @d
    public static boolean k(@h i i0) {
        return i0 != null && i0.j();
    }

    private static void l(Object object0) {
        Map map0 = i.d;
        synchronized(map0) {
            Integer integer0 = (Integer)map0.get(object0);
            if(integer0 == null) {
                x0.a.y0("SharedReference", "No entry in sLiveObjects for value of type %s", new Object[]{object0.getClass()});
            }
            else if(((int)integer0) == 1) {
                map0.remove(object0);
            }
            else {
                map0.put(object0, ((int)(((int)integer0) - 1)));
            }
        }
    }

    // 去混淆评级： 低(20)
    public static String m() {
        return "SharedReference{live_objects_count=0}";
    }
}

