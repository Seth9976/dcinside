package com.facebook.common.references;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k1.n.a;
import k1.n;
import k1.u;

@n(a.a)
public abstract class com.facebook.common.references.a implements Closeable, Cloneable {
    class com.facebook.common.references.a.a implements h {
        com.facebook.common.references.a.a() {
            super();
        }

        @Override  // com.facebook.common.references.h
        public void a(Object object0) {
            this.b(((Closeable)object0));
        }

        public void b(Closeable closeable0) {
            try {
                d.a(closeable0, true);
            }
            catch(IOException unused_ex) {
            }
        }
    }

    class b implements com.facebook.common.references.a.d {
        b() {
            super();
        }

        @Override  // com.facebook.common.references.a$d
        public boolean a() {
            return false;
        }

        @Override  // com.facebook.common.references.a$d
        public void b(i i0, @o3.h Throwable throwable0) {
            Object object0 = i0.h();
            x0.a.m0(com.facebook.common.references.a.i, "Finalized without closing: %x %x (type = %s)", new Object[]{System.identityHashCode(this), System.identityHashCode(i0), (object0 == null ? null : object0.getClass().getName())});
        }
    }

    public @interface c {
    }

    public interface com.facebook.common.references.a.d {
        boolean a();

        void b(i arg1, @o3.h Throwable arg2);
    }

    @p3.a("this")
    protected boolean a;
    protected final i b;
    @o3.h
    protected final com.facebook.common.references.a.d c;
    @o3.h
    protected final Throwable d;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    private static Class i;
    @c
    private static int j;
    private static final h k;
    private static final com.facebook.common.references.a.d l;

    static {
        com.facebook.common.references.a.i = com.facebook.common.references.a.class;
        com.facebook.common.references.a.k = new com.facebook.common.references.a.a();
        com.facebook.common.references.a.l = new b();
    }

    protected com.facebook.common.references.a(i i0, @o3.h com.facebook.common.references.a.d a$d0, @o3.h Throwable throwable0) {
        this.a = false;
        this.b = (i)com.facebook.common.internal.n.i(i0);
        i0.b();
        this.c = a$d0;
        this.d = throwable0;
    }

    protected com.facebook.common.references.a(Object object0, @o3.h h h0, @o3.h com.facebook.common.references.a.d a$d0, @o3.h Throwable throwable0, boolean z) {
        this.a = false;
        this.b = new i(object0, h0, z);
        this.c = a$d0;
        this.d = throwable0;
    }

    public static com.facebook.common.references.a L(@u Object object0, h h0, com.facebook.common.references.a.d a$d0, @o3.h Throwable throwable0) {
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof Bitmap || object0 instanceof com.facebook.common.references.d) {
            switch(com.facebook.common.references.a.j) {
                case 1: {
                    return new com.facebook.common.references.c(object0, h0, a$d0, throwable0);
                }
                case 2: {
                    return new g(object0, h0, a$d0, throwable0);
                }
                case 3: {
                    return new e(object0);
                }
                default: {
                    return new com.facebook.common.references.b(object0, h0, a$d0, throwable0);
                }
            }
        }
        return new com.facebook.common.references.b(object0, h0, a$d0, throwable0);
    }

    public static void Q(@c int v) {
        com.facebook.common.references.a.j = v;
    }

    public abstract com.facebook.common.references.a b();

    @o3.h
    public com.facebook.common.references.a c() {
        synchronized(this) {
            return this.q() ? this.b() : null;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    @Override
    public void close() {
        synchronized(this) {
            if(this.a) {
                return;
            }
            this.a = true;
        }
        this.b.e();
    }

    @o3.h
    public static com.facebook.common.references.a e(@o3.h com.facebook.common.references.a a0) {
        return a0 == null ? null : a0.c();
    }

    public static List f(@u Collection collection0) {
        if(collection0 == null) {
            return null;
        }
        List list0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            list0.add(com.facebook.common.references.a.e(((com.facebook.common.references.a)object0)));
        }
        return list0;
    }

    public static void j(@o3.h com.facebook.common.references.a a0) {
        if(a0 != null) {
            a0.close();
        }
    }

    public static void k(@o3.h Iterable iterable0) {
        if(iterable0 != null) {
            for(Object object0: iterable0) {
                com.facebook.common.references.a.j(((com.facebook.common.references.a)object0));
            }
        }
    }

    public Object n() {
        synchronized(this) {
            com.facebook.common.internal.n.o(!this.a);
            return com.facebook.common.internal.n.i(this.b.h());
        }
    }

    @VisibleForTesting
    public i o() {
        synchronized(this) {
        }
        return this.b;
    }

    // 去混淆评级： 低(20)
    public int p() {
        return this.q() ? System.identityHashCode(this.b.h()) : 0;
    }

    public boolean q() {
        synchronized(this) {
        }
        return !this.a;
    }

    @k1.d
    public static boolean s(@o3.h com.facebook.common.references.a a0) {
        return a0 != null && a0.q();
    }

    public static com.facebook.common.references.a t(@u Closeable closeable0) {
        return com.facebook.common.references.a.w(closeable0, com.facebook.common.references.a.k);
    }

    public static com.facebook.common.references.a v(@u @o3.h Closeable closeable0, com.facebook.common.references.a.d a$d0) {
        Throwable throwable0 = null;
        if(closeable0 == null) {
            return null;
        }
        h h0 = com.facebook.common.references.a.k;
        if(a$d0.a()) {
            throwable0 = new Throwable();
        }
        return com.facebook.common.references.a.L(closeable0, h0, a$d0, throwable0);
    }

    public static com.facebook.common.references.a w(@u Object object0, h h0) {
        return com.facebook.common.references.a.x(object0, h0, com.facebook.common.references.a.l);
    }

    public static com.facebook.common.references.a x(@u Object object0, h h0, com.facebook.common.references.a.d a$d0) {
        Throwable throwable0 = null;
        if(object0 == null) {
            return null;
        }
        if(a$d0.a()) {
            throwable0 = new Throwable();
        }
        return com.facebook.common.references.a.L(object0, h0, a$d0, throwable0);
    }
}

