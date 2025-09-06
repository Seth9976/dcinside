package com.dcinside.app.post;

import com.dcinside.app.util.uk;
import g0.f.b;
import g0.f;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import rx.g;
import y4.l;
import y4.m;

public final class b1 {
    @l
    public static final b1 a;
    @m
    private static g b;

    static {
        b1.a = new b1();
    }

    private final g b() {
        if(b1.b == null) {
            b1.b = uk.Ik(null).g0();
        }
        g g0 = b1.b;
        L.m(g0);
        return g0;
    }

    @l
    public final g c(@l String s, @l String s1) {
        static final class a extends N implements Function1 {
            final String e;
            final String f;

            a(String s, String s1) {
                this.e = s;
                this.f = s1;
                super(1);
            }

            public final g a(f f0) {
                if(f0.b() >= 50) {
                    return g.Q2(Boolean.FALSE);
                }
                Map map0 = f0.a();
                b f$b0 = map0 == null ? null : ((b)map0.get(this.e));
                if(f$b0 != null) {
                    List list0 = f$b0.f();
                    if(list0 != null) {
                        return list0.indexOf(this.f) >= 0 ? g.Q2(Boolean.FALSE) : g.Q2(Boolean.TRUE);
                    }
                }
                return g.Q2(Boolean.TRUE);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((f)object0));
            }
        }

        L.p(s, "galleryId");
        L.p(s1, "keyword");
        g g0 = this.b().f2((Object object0) -> {
            L.p(new a(s, s1), "$tmp0");
            return (g)new a(s, s1).invoke(object0);
        });
        L.o(g0, "flatMap(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final g d(Function1 function10, Object object0) [...]
}

