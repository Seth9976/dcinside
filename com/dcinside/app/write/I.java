package com.dcinside.app.write;

import com.dcinside.app.model.N;
import com.dcinside.app.util.uk;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import rx.g;
import y4.l;
import y4.m;

@s0({"SMAP\nOgTagUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OgTagUtils.kt\ncom/dcinside/app/write/OgTagUtils\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,105:1\n177#2,9:106\n177#2,9:115\n*S KotlinDebug\n*F\n+ 1 OgTagUtils.kt\ncom/dcinside/app/write/OgTagUtils\n*L\n39#1:106,9\n51#1:115,9\n*E\n"})
public final class i {
    @l
    public static final i a = null;
    @l
    public static final String b = "{{_OG_START::";
    @l
    private static final String c = "::OG_END_}}";
    @l
    private static final String d = "^#^";
    @l
    private static final HashMap e;

    static {
        i.a = new i();
        i.e = new HashMap();
    }

    @m
    public final N c(@l String s) {
        L.p(s, "data");
        try {
            return (N)uk.a.r(s, N.class);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @l
    public final String d(@m String s) {
        if(s == null) {
            return "";
        }
        N n0 = this.c(s);
        if(n0 == null) {
            return "";
        }
        String s1 = "{{_OG_START::" + n0.n() + "^#^" + n0.m() + "^#^" + n0.i() + "^#^" + n0.k() + "::OG_END_}}";
        L.o(s1, "toString(...)");
        return s1;
    }

    @l
    public final String e(@l N n0, @l String s) {
        String s1;
        L.p(n0, "info");
        L.p(s, "url");
        N n1 = new N(Boolean.TRUE, n0.m(), n0.i(), n0.k(), n0.j(), s);
        try {
            s1 = null;
            s1 = uk.a.D(n1);
        }
        catch(Exception unused_ex) {
        }
        return s1 == null ? "" : s1;
    }

    @m
    public final N f(@l String s) {
        L.p(s, "data");
        List list0 = v.V4(v.l2(v.l2(v.l2(s, "{{_OG_START::", "", false, 4, null), "::OG_END_}}", "", false, 4, null), "&amp;", "&", false, 4, null), new String[]{"^#^"}, false, 0, 6, null);
        if(list0.size() == 4) {
            Object object0 = list0.get(0);
            Object object1 = list0.get(1);
            Object object2 = list0.get(2);
            Object object3 = list0.get(3);
            String s1 = this.g(((String)object0));
            return new N(Boolean.TRUE, ((String)object1), ((String)object2), ((String)object3), s1, ((String)object0));
        }
        return null;
    }

    private final String g(String s) {
        URL uRL0 = v.v2(s, "http", false, 2, null) ? new URL(s) : new URL("http://" + s);
        String s1 = uRL0.getHost();
        L.m(s1);
        if(v.W2(s1, " ", false, 2, null)) {
            return "";
        }
        if(v.V4(s1, new String[]{"."}, false, 0, 6, null).size() <= 1) {
            return "";
        }
        if(s1.length() == 0) {
            s1 = uRL0.toString();
            L.m(s1);
        }
        return s1;
    }

    public final boolean h(@l String s) {
        L.p(s, "url");
        N n0 = (N)i.e.get(s);
        if(n0 != null) {
            Boolean boolean0 = n0.l();
            return boolean0 == null ? true : boolean0.booleanValue();
        }
        return true;
    }

    @l
    public final g i(@l String s) {
        static final class a extends kotlin.jvm.internal.N implements Function1 {
            final String e;

            a(String s) {
                this.e = s;
                super(1);
            }

            public final N a(N n0) {
                HashMap hashMap0 = i.e;
                L.m(n0);
                hashMap0.put(this.e, n0);
                return n0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((N)object0));
            }
        }

        g g0;
        L.p(s, "url");
        N n0 = (N)i.e.get(s);
        if(n0 == null) {
            g0 = uk.Ek(s).g3((Object object0) -> {
                L.p(new a(s), "$tmp0");
                return (N)new a(s).invoke(object0);
            });
            L.m(g0);
            return g0;
        }
        g0 = g.Q2(n0);
        L.m(g0);
        return g0;
    }

    // 检测为 Lambda 实现
    private static final N j(Function1 function10, Object object0) [...]
}

