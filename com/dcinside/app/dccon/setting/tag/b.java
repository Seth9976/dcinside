package com.dcinside.app.dccon.setting.tag;

import io.realm.F0;
import io.realm.F1;
import io.realm.d1;
import io.realm.g1;
import io.realm.internal.s;
import io.realm.r1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.V;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

public class b extends d1 implements F1 {
    @s0({"SMAP\nDcconTagItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconTagItem.kt\ncom/dcinside/app/dccon/setting/tag/DcconTagItem$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n120#2,3:75\n124#2:83\n120#2,3:84\n124#2:92\n1#3:78\n1#3:87\n1557#4:79\n1628#4,3:80\n1557#4:88\n1628#4,3:89\n*S KotlinDebug\n*F\n+ 1 DcconTagItem.kt\ncom/dcinside/app/dccon/setting/tag/DcconTagItem$Companion\n*L\n52#1:75,3\n52#1:83\n62#1:84,3\n62#1:92\n52#1:78\n62#1:87\n54#1:79\n54#1:80,3\n68#1:88\n68#1:89,3\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final List a() {
            List list0;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                g1 g10 = f00.C4(b.class).g2("date", r1.c).T("customTag", new String[0]).F1(20L).p0();
                L.m(g10);
                list0 = new ArrayList(u.b0(g10, 10));
                Iterator iterator0 = g10.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    list0.add("");
                }
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return list0;
        }

        @l
        public final List b(@l String s) {
            List list0;
            L.p(s, "customTag");
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                g1 g10 = f00.C4(b.class).u("customTag", s).p0();
                L.m(g10);
                list0 = new ArrayList(u.b0(g10, 10));
                for(Object object0: g10) {
                    list0.add(new V(((b)object0).T5(), ((b)object0).S5()));
                }
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return list0;
        }

        public final void c(@l F0 f00, int v) {
            L.p(f00, "r");
            b b0 = (b)f00.C4(b.class).f0("detailIdx", v).r0();
            if(b0 == null) {
                return;
            }
            b0.z5();
        }
    }

    private int d;
    @h3.c
    private int e;
    @h3.c
    @l
    private String f;
    @h3.c
    @l
    private Date g;
    @l
    public static final a h;

    static {
        b.h = new a(null);
    }

    public b() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.H1("");
        this.O(new Date());
    }

    @Override  // io.realm.F1
    public int A() {
        return this.e;
    }

    @Override  // io.realm.F1
    public int B() {
        return this.d;
    }

    @Override  // io.realm.F1
    public void H1(String s) {
        this.f = s;
    }

    @Override  // io.realm.F1
    public void O(Date date0) {
        this.g = date0;
    }

    // 去混淆评级： 低(20)
    @l
    public String Q5() [...] // 潜在的解密器

    @l
    public Date R5() {
        return this.p();
    }

    public int S5() {
        return this.A();
    }

    public int T5() {
        return this.B();
    }

    public void U5(@l String s) {
        L.p(s, "<set-?>");
        this.H1(s);
    }

    public void V5(@l Date date0) {
        L.p(date0, "<set-?>");
        this.O(date0);
    }

    public void W5(int v) {
        this.x(v);
    }

    public void X5(int v) {
        this.t(v);
    }

    @Override  // io.realm.F1
    public String k5() [...] // 潜在的解密器

    @Override  // io.realm.F1
    public Date p() {
        return this.g;
    }

    @Override  // io.realm.F1
    public void t(int v) {
        this.d = v;
    }

    @Override  // io.realm.F1
    public void x(int v) {
        this.e = v;
    }
}

