package Q;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.random.f;
import y4.l;
import z3.n;

public final class a {
    @s0({"SMAP\nAdConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdConfig.kt\ncom/dcinside/app/ad/AdConfig$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n774#2:22\n865#2,2:23\n*S KotlinDebug\n*F\n+ 1 AdConfig.kt\ncom/dcinside/app/ad/AdConfig$Companion\n*L\n17#1:22\n17#1:23,2\n*E\n"})
    public static final class Q.a.a {
        private Q.a.a() {
        }

        public Q.a.a(w w0) {
        }

        @l
        @n
        public final List a(@l List list0) {
            L.p(list0, "config");
            List list1 = new ArrayList();
            for(Object object0: list0) {
                if(((a)object0).b() >= 100 || ((a)object0).b() > f.a.m(100)) {
                    list1.add(object0);
                }
            }
            return list1;
        }
    }

    @l
    private final e a;
    @l
    private final String b;
    private final int c;
    @l
    public static final Q.a.a d;

    static {
        a.d = new Q.a.a(null);
    }

    public a(@l e e0, @l String s, int v) {
        L.p(e0, "type");
        L.p(s, "id");
        super();
        this.a = e0;
        this.b = s;
        this.c = v;
    }

    @l
    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    @l
    public final e c() {
        return this.a;
    }

    @l
    @n
    public static final List d(@l List list0) {
        return a.d.a(list0);
    }
}

