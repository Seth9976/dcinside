package com.dcinside.app.realm;

import com.dcinside.app.util.wk;
import h3.e;
import io.realm.F0;
import io.realm.T0;
import io.realm.T2;
import io.realm.d1;
import io.realm.internal.s;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import timber.log.b;
import y4.l;
import y4.m;

public class j0 extends d1 implements T2 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void b(@l F0 f00, @l List list0) {
            L.p(f00, "realm");
            L.p(list0, "results");
            if(f00.E0()) {
                a.e(list0);
                return;
            }
            f00.Y3((F0 f00) -> {
                L.p(list0, "$results");
                a.e(list0);
            });
        }

        private static final void c(List list0) throws Exception {
            String s = wk.d.d();
            if(s == null) {
                return;
            }
            for(Object object0: list0) {
                k0 k00 = (k0)object0;
                if(k0.r.B(k00)) {
                    String s1 = k00.V5();
                    if(s1 != null && v.v2(s1, s, false, 2, null)) {
                        String s2 = k00.V5();
                        L.m(s2);
                        File file0 = new File(s2);
                        if(file0.exists()) {
                            file0.delete();
                        }
                    }
                }
            }
        }

        // 检测为 Lambda 实现
        private static final void d(List list0, F0 f00) [...]

        private static final void e(List list0) {
            for(Object object0: list0) {
                j0 j00 = (j0)object0;
                try {
                    a.c(j00.Q5());
                }
                catch(Exception exception0) {
                    b.a.e(exception0);
                }
                j00.Q5().L0();
                j00.z5();
            }
        }
    }

    @e
    private long d;
    @m
    private String e;
    @l
    private T0 f;
    private long g;
    @l
    public static final a h = null;
    public static final long i = 0L;
    public static final long j = 1L;

    static {
        j0.h = new a(null);
    }

    public j0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.U2(new T0());
    }

    @l
    public T0 Q5() {
        return this.o1();
    }

    @m
    public String R5() {
        return this.k();
    }

    @Override  // io.realm.T2
    public void S2(long v) {
        this.g = v;
    }

    public long S5() {
        return this.w0();
    }

    public long T5() {
        return this.d();
    }

    @Override  // io.realm.T2
    public void U2(T0 t00) {
        this.f = t00;
    }

    public void U5(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.U2(t00);
    }

    public void V5(@m String s) {
        this.l(s);
    }

    public void W5(long v) {
        this.S2(v);
    }

    public void X5(long v) {
        this.c(v);
    }

    @Override  // io.realm.T2
    public void c(long v) {
        this.d = v;
    }

    @Override  // io.realm.T2
    public long d() {
        return this.d;
    }

    @Override  // io.realm.T2
    public String k() {
        return this.e;
    }

    @Override  // io.realm.T2
    public void l(String s) {
        this.e = s;
    }

    @Override  // io.realm.T2
    public T0 o1() {
        return this.f;
    }

    @Override  // io.realm.T2
    public long w0() {
        return this.g;
    }
}

