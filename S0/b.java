package S0;

import android.net.Uri;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import k1.u;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public interface b {
    public static final class a {
        @s0({"SMAP\nControllerListener2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControllerListener2.kt\ncom/facebook/fresco/ui/common/ControllerListener2$Extras$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
        public static final class S0.b.a.a {
            private S0.b.a.a() {
            }

            public S0.b.a.a(w w0) {
            }

            private final Map b(@u Map map0) {
                return map0 != null ? new ConcurrentHashMap(map0) : null;
            }

            @l
            @n
            public final a c(@m Map map0) {
                a b$a0 = new a();
                b$a0.a = map0;
                return b$a0;
            }
        }

        @m
        @f
        public Map a;
        @m
        @f
        public Map b;
        @m
        @f
        public Map c;
        @m
        @f
        public Map d;
        @m
        @f
        public Map e;
        @m
        @f
        public Object f;
        @m
        @f
        public Uri g;
        @f
        public int h;
        @f
        public int i;
        @m
        @f
        public Object j;
        @m
        @f
        public Float k;
        @m
        @f
        public Float l;
        @f
        public boolean m;
        @m
        @f
        public String n;
        @m
        @f
        public Uri o;
        @m
        @f
        public String p;
        @l
        public static final S0.b.a.a q;

        static {
            a.q = new S0.b.a.a(null);
        }

        public a() {
            this.h = -1;
            this.i = -1;
        }

        @l
        public final a a() {
            a b$a0 = new a();
            b$a0.a = a.q.b(this.a);
            b$a0.b = a.q.b(this.b);
            b$a0.c = a.q.b(this.c);
            b$a0.d = a.q.b(this.d);
            b$a0.f = this.f;
            b$a0.g = this.g;
            b$a0.h = this.h;
            b$a0.i = this.i;
            b$a0.j = this.j;
            b$a0.k = this.k;
            b$a0.l = this.l;
            b$a0.p = this.p;
            return b$a0;
        }

        @l
        @n
        public static final a b(@m Map map0) {
            return a.q.c(map0);
        }
    }

    void a(@l String arg1, @m Object arg2);

    void b(@l String arg1, @m Throwable arg2, @m a arg3);

    void c(@l String arg1, @m a arg2);

    void e(@l String arg1, @m Object arg2, @m a arg3);

    void f(@l String arg1);

    void k(@m Object arg1);

    void p(@l String arg1, @m Object arg2, @m a arg3);
}

