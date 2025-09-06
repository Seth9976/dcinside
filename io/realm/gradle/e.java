package io.realm.gradle;

import java.util.Comparator;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class e implements Comparable {
    static final class a extends N implements A3.a {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(0);
        }

        @l
        public final e b() {
            b e$b0 = e.c;
            Class class0 = e$b0.c("com.android.Version");
            if(class0 == null) {
                class0 = e$b0.c("com.android.builder.model.Version");
            }
            if(class0 == null) {
                throw new IllegalStateException("Unable to obtain AGP version. It is likely that the AGP version being used is too old.");
            }
            Object object0 = class0.getField("ANDROID_GRADLE_PLUGIN_VERSION").get(null);
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return e$b0.e(((String)object0));
        }

        @Override  // A3.a
        public Object invoke() {
            return this.b();
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        private final Class c(String s) {
            try {
                return Class.forName(s);
            }
            catch(ClassNotFoundException unused_ex) {
                return null;
            }
        }

        @l
        public final e d() {
            return (e)e.d.getValue();
        }

        private final e e(String s) {
            e e0 = this.f(s);
            if(e0 == null) {
                throw new IllegalStateException(("Unable to parse AGP version: " + s).toString());
            }
            return e0;
        }

        private final e f(String s) {
            if(s == null) {
                return null;
            }
            List list0 = v.U4(s, new char[]{'.'}, false, 0, 6, null);
            return list0.size() == 1 ? new e(Integer.parseInt(((String)list0.get(0))), 0) : new e(Integer.parseInt(((String)list0.get(0))), Integer.parseInt(((String)list0.get(1))));
        }
    }

    private final int a;
    private final int b;
    @l
    public static final b c;
    @l
    private static final D d;

    static {
        e.c = new b(null);
        e.d = E.a(a.e);
    }

    public e(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public int b(@l e e0) {
        public static final class c implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((e)object0).g(), ((e)object1).g());
            }
        }


        public static final class d implements Comparator {
            final Comparator a;

            public d(Comparator comparator0) {
                this.a = comparator0;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v = this.a.compare(object0, object1);
                return v == 0 ? kotlin.comparisons.a.l(((e)object0).h(), ((e)object1).h()) : v;
            }
        }

        L.p(e0, "other");
        return new d(new c()).compare(this, e0);
    }

    public final int c() {
        return this.a;
    }

    @Override
    public int compareTo(Object object0) {
        return this.b(((e)object0));
    }

    public final int d() {
        return this.b;
    }

    @l
    public final e e(int v, int v1) {
        return new e(v, v1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        return this.a == ((e)object0).a ? this.b == ((e)object0).b : false;
    }

    public static e f(e e0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = e0.a;
        }
        if((v2 & 2) != 0) {
            v1 = e0.b;
        }
        return e0.e(v, v1);
    }

    public final int g() {
        return this.a;
    }

    public final int h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "SimpleAGPVersion(major=" + this.a + ", minor=" + this.b + ')';
    }
}

