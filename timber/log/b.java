package timber.log;

import android.os.Build.VERSION;
import android.util.Log;
import j..util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.k;
import y4.l;
import y4.m;
import z3.i;
import z3.n;

public final class b {
    public static class a extends c {
        public static final class timber.log.b.a.a {
            private timber.log.b.a.a() {
            }

            public timber.log.b.a.a(w w0) {
            }
        }

        @l
        private final List b;
        @l
        public static final timber.log.b.a.a c = null;
        private static final int d = 4000;
        private static final int e = 23;
        private static final Pattern f;

        static {
            a.c = new timber.log.b.a.a(null);
            a.f = Pattern.compile("(\\$\\d+)+$");
        }

        // 去混淆评级： 低(26)
        public a() {
            this.b = u.O(new String[]{"timber.log.b", "timber.log.b$b", "timber.log.b$c", "timber.log.b$a"});
        }

        @m
        protected String D(@l StackTraceElement stackTraceElement0) {
            L.p(stackTraceElement0, "element");
            String s = stackTraceElement0.getClassName();
            L.o(s, "element.className");
            String s1 = v.u5(s, '.', null, 2, null);
            Matcher matcher0 = a.f.matcher(s1);
            if(matcher0.find()) {
                s1 = matcher0.replaceAll("");
                L.o(s1, "m.replaceAll(\"\")");
            }
            if(s1.length() > 23 && Build.VERSION.SDK_INT < 26) {
                s1 = s1.substring(0, 23);
                L.o(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            return s1;
        }

        @Override  // timber.log.b$c
        @m
        public String j() {
            String s = super.j();
            if(s == null) {
                StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
                L.o(arr_stackTraceElement, "Throwable().stackTrace");
                for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                    StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                    String s1 = stackTraceElement0.getClassName();
                    if(!this.b.contains(s1)) {
                        return this.D(stackTraceElement0);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return s;
        }

        @Override  // timber.log.b$c
        protected void p(int v, @m String s, @l String s1, @m Throwable throwable0) {
            L.p(s1, "message");
            if(s1.length() < 4000) {
                if(v == 7) {
                    Log.wtf(s, s1);
                    return;
                }
                Log.println(v, s, s1);
                return;
            }
            int v1 = s1.length();
            for(int v2 = 0; v2 < v1; v2 = v4 + 1) {
                int v3 = v.r3(s1, '\n', v2, false, 4, null);
                if(v3 == -1) {
                    v3 = v1;
                }
                while(true) {
                    int v4 = Math.min(v3, v2 + 4000);
                    String s2 = s1.substring(v2, v4);
                    L.o(s2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if(v == 7) {
                        Log.wtf(s, s2);
                    }
                    else {
                        Log.println(v, s, s2);
                    }
                    if(v4 >= v3) {
                        break;
                    }
                    v2 = v4;
                }
            }
        }
    }

    public static final class timber.log.b.b extends c {
        private timber.log.b.b() {
        }

        public timber.log.b.b(w w0) {
        }

        @Override  // timber.log.b$c
        @n
        public void A(@k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].A(s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void B(@m Throwable throwable0) {
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].B(throwable0);
            }
        }

        @Override  // timber.log.b$c
        @n
        public void C(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].C(throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @l
        @n
        public c D() [...] // Inlined contents

        @l
        @n
        public final List E() {
            synchronized(b.b) {
                List list0 = DesugarCollections.unmodifiableList(u.V5(b.b));
                L.o(list0, "unmodifiableList(trees.toList())");
                return list0;
            }
        }

        @n
        public final void F(@l c b$c0) {
            L.p(b$c0, "tree");
            if(b$c0 == this) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            synchronized(b.b) {
                b.b.add(b$c0);
                Object[] arr_object = b.b.toArray(new c[0]);
                if(arr_object != null) {
                    b.c = (c[])arr_object;
                    return;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @n
        public final void G(@l c[] arr_b$c) {
            L.p(arr_b$c, "trees");
            int v = 0;
            while(v < arr_b$c.length) {
                c b$c0 = arr_b$c[v];
                ++v;
                if(b$c0 == null) {
                    throw new IllegalArgumentException("trees contained null");
                }
                if(b$c0 == this) {
                    throw new IllegalArgumentException("Cannot plant Timber into itself.");
                }
            }
            synchronized(b.b) {
                Collections.addAll(b.b, Arrays.copyOf(arr_b$c, arr_b$c.length));
                Object[] arr_object = b.b.toArray(new c[0]);
                if(arr_object != null) {
                    b.c = (c[])arr_object;
                    return;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @l
        @n
        public final c H(@l String s) {
            L.p(s, "tag");
            c[] arr_b$c = b.c;
            int v = 0;
            while(v < arr_b$c.length) {
                c b$c0 = arr_b$c[v];
                ++v;
                b$c0.h().set(s);
            }
            return this;
        }

        @i(name = "treeCount")
        @n
        public final int I() [...] // 潜在的解密器

        @n
        public final void J(@l c b$c0) {
            L.p(b$c0, "tree");
            synchronized(b.b) {
                if(b.b.remove(b$c0)) {
                    Object[] arr_object = b.b.toArray(new c[0]);
                    if(arr_object == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    b.c = (c[])arr_object;
                    return;
                }
            }
            throw new IllegalArgumentException(("Cannot uproot tree which is not planted: " + b$c0).toString());
        }

        @n
        public final void K() {
            synchronized(b.b) {
                b.b.clear();
                b.c = new c[0];
            }
        }

        @Override  // timber.log.b$c
        @n
        public void a(@k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].a(s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void b(@m Throwable throwable0) {
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].b(throwable0);
            }
        }

        @Override  // timber.log.b$c
        @n
        public void c(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].c(throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void d(@k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].d(s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void e(@m Throwable throwable0) {
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].e(throwable0);
            }
        }

        @Override  // timber.log.b$c
        @n
        public void f(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].f(throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void k(@k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].k(s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void l(@m Throwable throwable0) {
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].l(throwable0);
            }
        }

        @Override  // timber.log.b$c
        @n
        public void m(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].m(throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        protected void p(int v, @m String s, @l String s1, @m Throwable throwable0) {
            L.p(s1, "message");
            throw new AssertionError();
        }

        @Override  // timber.log.b$c
        @n
        public void q(int v, @k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v1 = 0; v1 < arr_b$c.length; ++v1) {
                arr_b$c[v1].q(v, s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void r(int v, @m Throwable throwable0) {
            c[] arr_b$c = b.c;
            for(int v1 = 0; v1 < arr_b$c.length; ++v1) {
                arr_b$c[v1].r(v, throwable0);
            }
        }

        @Override  // timber.log.b$c
        @n
        public void s(int v, @m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v1 = 0; v1 < arr_b$c.length; ++v1) {
                arr_b$c[v1].s(v, throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void u(@k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].u(s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void v(@m Throwable throwable0) {
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].v(throwable0);
            }
        }

        @Override  // timber.log.b$c
        @n
        public void w(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].w(throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void x(@k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].x(s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }

        @Override  // timber.log.b$c
        @n
        public void y(@m Throwable throwable0) {
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].y(throwable0);
            }
        }

        @Override  // timber.log.b$c
        @n
        public void z(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            c[] arr_b$c = b.c;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].z(throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
            }
        }
    }

    public static abstract class c {
        @l
        private final ThreadLocal a;

        public c() {
            this.a = new ThreadLocal();
        }

        public void A(@m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(7, null, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void B(@m Throwable throwable0) {
            this.t(7, throwable0, null, new Object[0]);
        }

        public void C(@m Throwable throwable0, @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(7, throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void a(@m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(3, null, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void b(@m Throwable throwable0) {
            this.t(3, throwable0, null, new Object[0]);
        }

        public void c(@m Throwable throwable0, @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(3, throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void d(@m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(6, null, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void e(@m Throwable throwable0) {
            this.t(6, throwable0, null, new Object[0]);
        }

        public void f(@m Throwable throwable0, @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(6, throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        @l
        protected String g(@l String s, @l Object[] arr_object) {
            L.p(s, "message");
            L.p(arr_object, "args");
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
            String s1 = String.format(s, Arrays.copyOf(arr_object1, arr_object1.length));
            L.o(s1, "java.lang.String.format(this, *args)");
            return s1;
        }

        public final ThreadLocal h() {
            return this.a;
        }

        private final String i(Throwable throwable0) {
            StringWriter stringWriter0 = new StringWriter(0x100);
            PrintWriter printWriter0 = new PrintWriter(stringWriter0, false);
            throwable0.printStackTrace(printWriter0);
            printWriter0.flush();
            String s = stringWriter0.toString();
            L.o(s, "sw.toString()");
            return s;
        }

        public String j() {
            String s = (String)this.a.get();
            if(s != null) {
                this.a.remove();
            }
            return s;
        }

        public void k(@m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(4, null, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void l(@m Throwable throwable0) {
            this.t(4, throwable0, null, new Object[0]);
        }

        public void m(@m Throwable throwable0, @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(4, throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        @kotlin.k(message = "Use isLoggable(String, int)", replaceWith = @c0(expression = "this.isLoggable(null, priority)", imports = {}))
        protected boolean n(int v) [...] // Inlined contents

        protected boolean o(@m String s, int v) {
            return true;
        }

        protected abstract void p(int arg1, @m String arg2, @l String arg3, @m Throwable arg4);

        public void q(int v, @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(v, null, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void r(int v, @m Throwable throwable0) {
            this.t(v, throwable0, null, new Object[0]);
        }

        public void s(int v, @m Throwable throwable0, @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(v, throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        private final void t(int v, Throwable throwable0, String s, Object[] arr_object) {
            String s1 = this.j();
            if(!this.o(s1, v)) {
                return;
            }
            if(s == null || s.length() == 0) {
                if(throwable0 == null) {
                    return;
                }
                s = this.i(throwable0);
            }
            else {
                if(arr_object.length != 0) {
                    s = this.g(s, arr_object);
                }
                if(throwable0 != null) {
                    s = s + '\n' + this.i(throwable0);
                }
            }
            this.p(v, s1, s, throwable0);
        }

        public void u(@m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(2, null, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void v(@m Throwable throwable0) {
            this.t(2, throwable0, null, new Object[0]);
        }

        public void w(@m Throwable throwable0, @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(2, throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void x(@m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(5, null, s, Arrays.copyOf(arr_object, arr_object.length));
        }

        public void y(@m Throwable throwable0) {
            this.t(5, throwable0, null, new Object[0]);
        }

        public void z(@m Throwable throwable0, @m String s, @l Object[] arr_object) {
            L.p(arr_object, "args");
            this.t(5, throwable0, s, Arrays.copyOf(arr_object, arr_object.length));
        }
    }

    @l
    public static final timber.log.b.b a;
    @l
    private static final ArrayList b;
    @l
    private static volatile c[] c;

    static {
        b.a = new timber.log.b.b(null);
        b.b = new ArrayList();
        b.c = new c[0];
    }

    private b() {
        throw new AssertionError();
    }

    @n
    public static void A(@k @m String s, @l Object[] arr_object) {
        b.a.x(s, arr_object);
    }

    @n
    public static void B(@m Throwable throwable0) {
        b.a.y(throwable0);
    }

    @n
    public static void C(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
        b.a.z(throwable0, s, arr_object);
    }

    @n
    public static void D(@k @m String s, @l Object[] arr_object) {
        b.a.A(s, arr_object);
    }

    @n
    public static void E(@m Throwable throwable0) {
        b.a.B(throwable0);
    }

    @n
    public static void F(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
        b.a.C(throwable0, s, arr_object);
    }

    @l
    @n
    public static c d() {
        return b.a;
    }

    @n
    public static void e(@k @m String s, @l Object[] arr_object) {
        b.a.a(s, arr_object);
    }

    @n
    public static void f(@m Throwable throwable0) {
        b.a.b(throwable0);
    }

    @n
    public static void g(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
        b.a.c(throwable0, s, arr_object);
    }

    @n
    public static void h(@k @m String s, @l Object[] arr_object) {
        b.a.d(s, arr_object);
    }

    @n
    public static void i(@m Throwable throwable0) {
        b.a.e(throwable0);
    }

    @n
    public static void j(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
        b.a.f(throwable0, s, arr_object);
    }

    @l
    @n
    public static final List k() {
        return b.a.E();
    }

    @n
    public static void l(@k @m String s, @l Object[] arr_object) {
        b.a.k(s, arr_object);
    }

    @n
    public static void m(@m Throwable throwable0) {
        b.a.l(throwable0);
    }

    @n
    public static void n(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
        b.a.m(throwable0, s, arr_object);
    }

    @n
    public static void o(int v, @k @m String s, @l Object[] arr_object) {
        b.a.q(v, s, arr_object);
    }

    @n
    public static void p(int v, @m Throwable throwable0) {
        b.a.r(v, throwable0);
    }

    @n
    public static void q(int v, @m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
        b.a.s(v, throwable0, s, arr_object);
    }

    @n
    public static final void r(@l c b$c0) {
        b.a.F(b$c0);
    }

    @n
    public static final void s(@l c[] arr_b$c) {
        b.a.G(arr_b$c);
    }

    @l
    @n
    public static final c t(@l String s) {
        return b.a.H(s);
    }

    // 去混淆评级： 低(20)
    @i(name = "treeCount")
    @n
    public static final int u() {
        return 0;
    }

    @n
    public static final void v(@l c b$c0) {
        b.a.J(b$c0);
    }

    @n
    public static final void w() {
        b.a.K();
    }

    @n
    public static void x(@k @m String s, @l Object[] arr_object) {
        b.a.u(s, arr_object);
    }

    @n
    public static void y(@m Throwable throwable0) {
        b.a.v(throwable0);
    }

    @n
    public static void z(@m Throwable throwable0, @k @m String s, @l Object[] arr_object) {
        b.a.w(throwable0, s, arr_object);
    }
}

