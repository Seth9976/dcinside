package kotlin.text;

import java.util.List;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface p {
    public static final class a {
        @l
        public static b a(@l p p0) {
            return new b(p0);
        }
    }

    public static final class b {
        @l
        private final p a;

        public b(@l p p0) {
            L.p(p0, "match");
            super();
            this.a = p0;
        }

        @f
        private final String a() {
            return (String)this.k().c().get(1);
        }

        @f
        private final String b() {
            return (String)this.k().c().get(10);
        }

        @f
        private final String c() {
            return (String)this.k().c().get(2);
        }

        @f
        private final String d() {
            return (String)this.k().c().get(3);
        }

        @f
        private final String e() {
            return (String)this.k().c().get(4);
        }

        @f
        private final String f() {
            return (String)this.k().c().get(5);
        }

        @f
        private final String g() {
            return (String)this.k().c().get(6);
        }

        @f
        private final String h() {
            return (String)this.k().c().get(7);
        }

        @f
        private final String i() {
            return (String)this.k().c().get(8);
        }

        @f
        private final String j() {
            return (String)this.k().c().get(9);
        }

        @l
        public final p k() {
            return this.a;
        }

        @l
        public final List l() {
            return this.a.c().subList(1, this.a.c().size());
        }
    }

    @l
    kotlin.ranges.l N0();

    @l
    b a();

    @l
    n b();

    @l
    List c();

    @l
    String getValue();

    @m
    p next();
}

