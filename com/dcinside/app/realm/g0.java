package com.dcinside.app.realm;

import V.p;
import android.content.Context;
import com.dcinside.app.Application;
import com.dcinside.app.util.uk;
import io.realm.F0;
import io.realm.R2;
import io.realm.T0;
import io.realm.W;
import io.realm.d1;
import io.realm.internal.s;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import org.jsoup.g;
import org.jsoup.nodes.f;
import org.jsoup.nodes.o;
import y4.l;
import y4.m;

public class g0 extends d1 implements R2 {
    @s0({"SMAP\nPostSeries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostSeries.kt\ncom/dcinside/app/realm/PostSeries$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n120#2,3:166\n124#2:170\n112#2,3:171\n129#2,3:175\n132#2,12:179\n116#2:191\n129#2,15:192\n112#2,3:207\n129#2,15:211\n116#2:226\n129#2,15:227\n112#2,3:242\n129#2,3:246\n132#2,12:250\n116#2:262\n129#2,15:263\n120#2,3:278\n124#2:282\n177#2,9:287\n1#3:169\n1#3:174\n1#3:178\n1#3:210\n1#3:245\n1#3:249\n1#3:281\n1#3:286\n1872#4,3:283\n1863#4,2:296\n*S KotlinDebug\n*F\n+ 1 PostSeries.kt\ncom/dcinside/app/realm/PostSeries$Companion\n*L\n43#1:166,3\n43#1:170\n49#1:171,3\n49#1:175,3\n49#1:179,12\n49#1:191\n49#1:192,15\n65#1:207,3\n65#1:211,15\n65#1:226\n65#1:227,15\n71#1:242,3\n71#1:246,3\n71#1:250,12\n71#1:262\n71#1:263,15\n103#1:278,3\n103#1:282\n138#1:287,9\n43#1:169\n49#1:174\n65#1:210\n71#1:245\n103#1:281\n113#1:283,3\n157#1:296,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l g0 g00) {
            L.p(g00, "item");
            F0 f00 = F0.g4();
            L.m(f00);
            if(f00.E0()) {
                g0 g01 = (g0)f00.o2(g00, new W[0]);
            }
            else {
                f00.beginTransaction();
                goto label_7;
            }
            goto label_19;
            try {
            label_7:
                g0 g02 = (g0)f00.o2(g00, new W[0]);
                f00.p();
                goto label_19;
            }
            catch(Throwable throwable1) {
                try {
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                }
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable2) {
                c.a(f00, throwable0);
                throw throwable2;
            }
        label_19:
            c.a(f00, null);
        }

        public final long b(@m String s, @l ArrayList arrayList0) {
            long v;
            L.p(arrayList0, "postList");
            F0 f00 = F0.g4();
            L.m(f00);
            if(f00.E0()) {
                goto label_27;
            }
            else {
                f00.beginTransaction();
                goto label_5;
            }
            goto label_51;
            try {
            label_5:
                v = System.currentTimeMillis();
                g0 g00 = new g0();
                if(s == null || s.length() == 0) {
                    ArrayList arrayList1 = arrayList0.size() <= 0 ? null : arrayList0;
                    if(arrayList1 == null) {
                        s = null;
                    }
                    else {
                        h0 h00 = (h0)arrayList1.get(0);
                        s = h00 == null ? null : h00.V5();
                    }
                }
                g00.V5(s);
                g00.T5(v);
                g00.R5().addAll(arrayList0);
                f00.o2(g00, new W[0]);
                f00.p();
                goto label_51;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_27:
                v = System.currentTimeMillis();
                g0 g01 = new g0();
                if(s == null || s.length() == 0) {
                    ArrayList arrayList2 = arrayList0.size() <= 0 ? null : arrayList0;
                    if(arrayList2 == null) {
                        s = null;
                    }
                    else {
                        h0 h01 = (h0)arrayList2.get(0);
                        s = h01 == null ? null : h01.V5();
                    }
                }
                g01.V5(s);
                g01.T5(v);
                g01.R5().addAll(arrayList0);
                f00.o2(g01, new W[0]);
                goto label_51;
            }
            catch(Throwable throwable2) {
            }
            try {
                throw throwable2;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable3) {
                c.a(f00, throwable0);
                throw throwable3;
            }
        label_51:
            c.a(f00, null);
            return v;
        }

        @l
        public final String c(@m String s, @l ArrayList arrayList0) {
            String s1;
            L.p(arrayList0, "postList");
            StringBuilder stringBuilder0 = new StringBuilder();
            Context context0 = Application.e.c();
            f f0 = g.m("");
            o o0 = f0.j3("div");
            if(s == null || s.length() == 0) {
                ArrayList arrayList1 = arrayList0.size() <= 0 ? null : arrayList0;
                if(arrayList1 == null) {
                    s1 = null;
                }
                else {
                    h0 h00 = (h0)arrayList1.get(0);
                    s1 = h00 == null ? null : h00.V5();
                }
            }
            else {
                s1 = context0.getString(0x7F150955, new Object[]{s});  // string:series_title_subject "[시리즈] %s"
            }
            o o1 = f0.j3("div").L0("style", "font-weight: bold;").T2(s1);
            o0.z0("dc_series").L0("style", "border: 1px solid #dfe1ee; line-height: 1.8; padding: 10px 15px; font-size: 95%;").D0(o1);
            for(Object object0: arrayList0) {
                L.m(f0);
                o0.D0(h0.k.a(((h0)object0), f0)).C0("<br/>");
            }
            String s2 = o0.S();
            L.o(s2, "outerHtml(...)");
            stringBuilder0.append(v.l2(s2, "\n", "", false, 4, null));
            String s3 = stringBuilder0.toString();
            L.o(s3, "toString(...)");
            return s3;
        }

        @l
        public final String d(@m String s, @l ArrayList arrayList0) {
            L.p(arrayList0, "postList");
            g0 g00 = new g0();
            if(s == null || s.length() == 0) {
                ArrayList arrayList1 = arrayList0.size() <= 0 ? null : arrayList0;
                if(arrayList1 == null) {
                    s = null;
                }
                else {
                    h0 h00 = (h0)arrayList1.get(0);
                    s = h00 == null ? null : h00.V5();
                }
            }
            g00.V5(s);
            g00.R5().addAll(arrayList0);
            p p0 = com.dcinside.app.backup.process.g.a.u(g00);
            String s1 = uk.a.D(p0);
            L.o(s1, "toJson(...)");
            return s1;
        }

        @m
        public final g0 e(@m String s) {
            try {
                Object object0 = uk.a.r(s, p.class);
                L.o(object0, "fromJson(...)");
                return com.dcinside.app.backup.process.g.a.G(((p)object0));
            }
            catch(Exception unused_ex) {
                return null;
            }
        }

        @m
        public final g0 f(@m Long long0) {
            g0 g00;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                g00 = (g0)f00.C4(g0.class).g0("saveDate", long0).r0();
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return g00;
        }

        public final boolean g() {
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                if(f00.C4(g0.class).p0().size() > 0) {
                    goto label_7;
                }
                else {
                    goto label_9;
                }
                goto label_10;
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
        label_7:
            boolean z = true;
            goto label_10;
        label_9:
            z = false;
        label_10:
            c.a(f00, null);
            return z;
        }

        public final boolean h(@m T0 t00, @l ArrayList arrayList0) {
            L.p(arrayList0, "new");
            if(t00 == null) {
                return false;
            }
            if(t00.size() != arrayList0.size()) {
                return true;
            }
            int v = 0;
            for(Object object0: t00) {
                if(v < 0) {
                    u.Z();
                }
                Object object1 = arrayList0.get(v);
                L.o(object1, "get(...)");
                if(!L.g(((h0)object0).Q5(), ((h0)object1).Q5())) {
                    return true;
                }
                if(!L.g(((h0)object0).R5(), ((h0)object1).R5())) {
                    return true;
                }
                if(!L.g(((h0)object0).T5(), ((h0)object1).T5())) {
                    return true;
                }
                if(!L.g(((h0)object0).V5(), ((h0)object1).V5())) {
                    return true;
                }
                if(!L.g(((h0)object0).S5(), ((h0)object1).S5())) {
                    return true;
                }
                if(((h0)object0).W5() != ((h0)object1).W5()) {
                    return true;
                }
                if(((h0)object0).U5() != ((h0)object1).U5()) {
                    return true;
                }
                ++v;
            }
            return false;
        }

        public final long i(@m Long long0, @m String s, @l ArrayList arrayList0) {
            long v2;
            int v;
            Class class0;
            L.p(arrayList0, "postList");
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z = f00.E0();
            class0 = g0.class;
            v = 1;
            if(z) {
                goto label_41;
            }
            else {
                f00.beginTransaction();
                goto label_8;
            }
            goto label_76;
            try {
            label_8:
                g0 g00 = (g0)f00.C4(class0).g0("saveDate", long0).r0();
                if(g00 == null) {
                    v2 = g0.g.b(s, arrayList0);
                }
                else {
                    long v1 = System.currentTimeMillis();
                    if(s == null || s.length() == 0) {
                        ArrayList arrayList1 = arrayList0.size() <= 0 ? null : arrayList0;
                        if(arrayList1 == null) {
                            s = null;
                        }
                        else {
                            h0 h00 = (h0)arrayList1.get(0);
                            s = h00 == null ? null : h00.V5();
                        }
                    }
                    boolean z1 = L.g(g00.S5(), s);
                    T0 t00 = g00.R5();
                    if(!g0.g.h(t00, arrayList0)) {
                        v = !z1;
                    }
                    g00.V5(s);
                    g00.R5().clear();
                    g00.R5().addAll(arrayList0);
                    if(v == 0) {
                        v1 = g00.Q5();
                    }
                    else {
                        g00.T5(v1);
                    }
                    v2 = v1;
                }
                f00.p();
                goto label_76;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_41:
                g0 g01 = (g0)f00.C4(class0).g0("saveDate", long0).r0();
                if(g01 == null) {
                    v2 = g0.g.b(s, arrayList0);
                }
                else {
                    long v3 = System.currentTimeMillis();
                    if(s == null || s.length() == 0) {
                        ArrayList arrayList2 = arrayList0.size() <= 0 ? null : arrayList0;
                        if(arrayList2 == null) {
                            s = null;
                        }
                        else {
                            h0 h01 = (h0)arrayList2.get(0);
                            s = h01 == null ? null : h01.V5();
                        }
                    }
                    boolean z2 = L.g(g01.S5(), s);
                    T0 t01 = g01.R5();
                    if(!g0.g.h(t01, arrayList0)) {
                        v = !z2;
                    }
                    g01.V5(s);
                    g01.R5().clear();
                    g01.R5().addAll(arrayList0);
                    if(v == 0) {
                        v2 = g01.Q5();
                    }
                    else {
                        g01.T5(v3);
                        v2 = v3;
                    }
                }
                goto label_76;
            }
            catch(Throwable throwable2) {
            }
            try {
                throw throwable2;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable3) {
                c.a(f00, throwable0);
                throw throwable3;
            }
        label_76:
            c.a(f00, null);
            return v2;
        }
    }

    @m
    private String d;
    @l
    private T0 e;
    private long f;
    @l
    public static final a g = null;
    @l
    public static final String h = "dc_series";
    @l
    private static final String i = "border: 1px solid #dfe1ee; line-height: 1.8; padding: 10px 15px; font-size: 95%;";

    static {
        g0.g = new a(null);
    }

    public g0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.F0(new T0());
    }

    @Override  // io.realm.R2
    public void F0(T0 t00) {
        this.e = t00;
    }

    public long Q5() {
        return this.b0();
    }

    @l
    public T0 R5() {
        return this.l2();
    }

    @m
    public String S5() {
        return this.k();
    }

    public void T5(long v) {
        this.V(v);
    }

    public void U5(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.F0(t00);
    }

    @Override  // io.realm.R2
    public void V(long v) {
        this.f = v;
    }

    public void V5(@m String s) {
        this.l(s);
    }

    @Override  // io.realm.R2
    public long b0() {
        return this.f;
    }

    @Override  // io.realm.R2
    public String k() {
        return this.d;
    }

    @Override  // io.realm.R2
    public void l(String s) {
        this.d = s;
    }

    @Override  // io.realm.R2
    public T0 l2() {
        return this.e;
    }
}

