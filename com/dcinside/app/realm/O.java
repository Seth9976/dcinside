package com.dcinside.app.realm;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import h3.e;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.W;
import io.realm.X0;
import io.realm.d1;
import io.realm.internal.s;
import io.realm.l2;
import java.util.Arrays;
import kotlin.V;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import y4.l;
import y4.m;

public class o extends d1 implements l2 {
    @s0({"SMAP\nGalleryOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryOptions.kt\ncom/dcinside/app/realm/GalleryOptions$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,222:1\n112#2,3:223\n129#2,3:227\n132#2,12:231\n116#2:243\n129#2,15:244\n112#2,3:259\n129#2,3:263\n132#2,12:269\n116#2:281\n129#2,15:282\n120#2,3:297\n124#2:302\n120#2,3:304\n129#2,15:310\n124#2:325\n129#2,15:326\n120#2,3:341\n124#2:347\n177#2,9:348\n177#2,9:357\n1#3:226\n1#3:262\n1#3:268\n1#3:300\n1#3:307\n1#3:309\n1#3:344\n1#3:346\n37#4:230\n37#4:266\n81#4:267\n37#4:301\n37#4:303\n37#4:308\n37#4:345\n*S KotlinDebug\n*F\n+ 1 GalleryOptions.kt\ncom/dcinside/app/realm/GalleryOptions$Companion\n*L\n53#1:223,3\n53#1:227,3\n53#1:231,12\n53#1:243\n53#1:244,15\n74#1:259,3\n74#1:263,3\n74#1:269,12\n74#1:281\n74#1:282,15\n107#1:297,3\n107#1:302\n128#1:304,3\n146#1:310,15\n128#1:325\n146#1:326,15\n156#1:341,3\n156#1:347\n211#1:348,9\n213#1:357,9\n53#1:226\n74#1:262\n107#1:300\n128#1:307\n156#1:344\n54#1:230\n75#1:266\n80#1:267\n108#1:301\n115#1:303\n129#1:308\n157#1:345\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final int a(@m String s, @l String s1) {
            Integer integer0 = null;
            L.p(s1, "defaultHexColor");
            if(s != null && s.length() == 6) {
                if(v.f5(s, '#', false, 2, null)) {
                    try {
                        integer0 = Color.parseColor(s);
                    }
                    catch(Exception unused_ex) {
                    }
                    return integer0 == null ? Color.parseColor(s1) : ((int)integer0);
                }
                try {
                    integer0 = Color.parseColor(("#" + s));
                }
                catch(Exception unused_ex) {
                }
                return integer0 == null ? Color.parseColor(s1) : ((int)integer0);
            }
            return Color.parseColor(s1);
        }

        public static int b(a o$a0, String s, String s1, int v, Object object0) {
            if((v & 2) != 0) {
                s1 = "#ABABAB";
            }
            return o$a0.a(s, s1);
        }

        @l
        public final String c(int v) {
            String s = String.format("%06X", Arrays.copyOf(new Object[]{((int)(v & 0xFFFFFF))}, 1));
            L.o(s, "format(...)");
            return s;
        }

        public final boolean d(@m String s, @l Function1 function10) {
            L.p(function10, "check");
            boolean z = false;
            if(TextUtils.isEmpty(s)) {
                return false;
            }
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                RealmQuery realmQuery0 = f00.C4(o.class);
                L.o(realmQuery0, "this.where(T::class.java)");
                o o0 = (o)realmQuery0.i0("galleryId", s).r0();
                if(o0 != null) {
                    L.m(o0);
                    z = ((Boolean)function10.invoke(o0)).booleanValue();
                }
            }
            catch(Throwable throwable0) {
                c.a(f00, throwable0);
                throw throwable0;
            }
            c.a(f00, null);
            return z;
        }

        @m
        public final o e(@m String s, @l F0 f00) {
            L.p(f00, "realm");
            RealmQuery realmQuery0 = f00.C4(o.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            return (o)realmQuery0.i0("galleryId", s).r0();
        }

        @l
        public final o f(@m String s, @m String s1, boolean z) {
            o o1;
            if(TextUtils.isEmpty(s)) {
                throw new NullPointerException("Unknown gallery " + s);
            }
            F0 f00 = F0.g4();
            L.m(f00);
            RealmQuery realmQuery0 = f00.C4(o.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            o o0 = (o)realmQuery0.i0("galleryId", s).r0();
            o1 = o0 == null ? null : ((o)f00.d2(o0));
            if(o1 == null) {
                String s2 = "";
                o1 = new o();
                o1.U5(s);
                o1.V5(s1);
                r r0 = new r();
                r0.Z5(L.g(s, "__DC_GLOBAL_DEF_IMAGE_ID"));
                r0.X5(L.g(s, "__DC_GLOBAL_DEF_IMAGE_ID"));
                r0.c6((L.g(s, "__DC_GLOBAL_DEF_IMAGE_ID") ? " - dc official App" : ""));
                if(L.g(s, "__DC_GLOBAL_DEF_IMAGE_ID")) {
                    s2 = " - dc App";
                }
                r0.Y5(s2);
                r0.b6("#ABABAB");
                r0.d6("#ABABAB");
                o1.W5(r0);
                if(z) {
                    if(f00.E0()) {
                        o o2 = (o)f00.t2(o1, new W[0]);
                    }
                    else {
                        f00.beginTransaction();
                        goto label_27;
                    }
                }
            }
            goto label_39;
            try {
            label_27:
                o o3 = (o)f00.t2(o1, new W[0]);
                f00.p();
                goto label_39;
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
        label_39:
            c.a(f00, null);
            return o1;
        }

        public static o g(a o$a0, String s, String s1, boolean z, int v, Object object0) {
            if((v & 4) != 0) {
                z = true;
            }
            return o$a0.f(s, s1, z);
        }

        @l
        public final String h(@l Context context0) {
            L.p(context0, "ctx");
            L.o("기본", "getString(...)");
            return "기본";
        }

        private final r i(String s, Function1 function10) {
            r r1;
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                RealmQuery realmQuery0 = f00.C4(o.class);
                L.o(realmQuery0, "this.where(T::class.java)");
                o o0 = (o)realmQuery0.i0("galleryId", s).r0();
                if(o0 == null) {
                label_13:
                    r1 = a.g(o.h, "__DC_GLOBAL_DEF_IMAGE_ID", "기본", false, 4, null).S5();
                    if(r1 == null || !((Boolean)function10.invoke(r1)).booleanValue()) {
                        goto label_21;
                    }
                }
                else {
                    r r0 = o0.S5();
                    if(r0 == null) {
                        goto label_13;
                    }
                    else {
                        if(!((Boolean)function10.invoke(r0)).booleanValue()) {
                            r0 = null;
                        }
                        if(r0 == null) {
                            goto label_13;
                        }
                        else {
                            r1 = (r)f00.d2(r0);
                            if(r1 == null) {
                                goto label_13;
                            }
                        }
                    }
                }
                goto label_22;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                c.a(f00, throwable0);
                throw throwable1;
            }
        label_21:
            r1 = null;
        label_22:
            c.a(f00, null);
            return r1;
        }

        @l
        public final String j(@m String s) {
            static final class com.dcinside.app.realm.o.a.a extends N implements Function1 {
                public static final com.dcinside.app.realm.o.a.a e;

                static {
                    com.dcinside.app.realm.o.a.a.e = new com.dcinside.app.realm.o.a.a();
                }

                com.dcinside.app.realm.o.a.a() {
                    super(1);
                }

                @l
                public final Boolean a(@l r r0) {
                    L.p(r0, "it");
                    return Boolean.valueOf(r0.Q5());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((r)object0));
                }
            }

            if(TextUtils.isEmpty(s)) {
                return "";
            }
            r r0 = this.i(s, com.dcinside.app.realm.o.a.a.e);
            if(r0 == null) {
                return "";
            }
            if(!r0.Q5()) {
                return "";
            }
            String s1 = r0.R5();
            return s1 == null ? "" : s1;
        }

        @l
        public final V k(@m String s) {
            static final class b extends N implements Function1 {
                public static final b e;

                static {
                    b.e = new b();
                }

                b() {
                    super(1);
                }

                @l
                public final Boolean a(@l r r0) {
                    L.p(r0, "it");
                    return Boolean.valueOf(r0.S5());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((r)object0));
                }
            }

            String s5;
            String s1 = "";
            if(TextUtils.isEmpty(s)) {
                return r0.a("", "");
            }
            r r0 = this.i(s, b.e);
            if(r0 == null) {
                return r0.a("", "");
            }
            String s2 = null;
            String s3 = this.c(a.b(this, r0.U5(), null, 2, null));
            String s4 = r0.T5();
            if(s4 == null) {
                s5 = "";
            }
            else {
                if(!m0.a.a.j(s4)) {
                    s4 = null;
                }
                if(s4 == null) {
                    s5 = "";
                }
                else {
                    s5 = "<span id=\'dcappheader\' style=\'color:#" + s3 + ";\'>" + s4 + "</span>";
                    if(s5 == null) {
                        s5 = "";
                    }
                }
            }
            String s6 = this.c(a.b(this, r0.W5(), null, 2, null));
            String s7 = r0.V5();
            if(s7 != null) {
                if(m0.a.a.j(s7)) {
                    s2 = s7;
                }
                if(s2 != null) {
                    String s8 = "<span id=\'dcappfooter\' style=\'color:#" + s6 + ";\'>" + s2 + "</span>";
                    if(s8 != null) {
                        s1 = s8;
                    }
                }
            }
            return r0.a(s5, s1);
        }

        public final void l(@m String s, @l Class class0) {
            Class class1;
            L.p(class0, "type");
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(L.g(class0, r.class)) {
                F0 f00 = F0.g4();
                L.m(f00);
                boolean z = f00.E0();
                class1 = o.class;
                if(z) {
                    goto label_25;
                }
                else {
                    f00.beginTransaction();
                    goto label_10;
                }
                goto label_42;
                try {
                label_10:
                    RealmQuery realmQuery0 = f00.C4(class1);
                    L.o(realmQuery0, "this.where(T::class.java)");
                    o o0 = (o)realmQuery0.i0("galleryId", s).r0();
                    if(o0 != null) {
                        L.m(o0);
                        if(o0.S5() != null) {
                            r r0 = o0.S5();
                            if(r0 != null) {
                                r0.z5();
                            }
                        }
                    }
                    f00.p();
                    goto label_42;
                }
                catch(Throwable throwable1) {
                }
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable1;
                try {
                label_25:
                    RealmQuery realmQuery1 = f00.C4(class1);
                    L.o(realmQuery1, "this.where(T::class.java)");
                    o o1 = (o)realmQuery1.i0("galleryId", s).r0();
                    if(o1 != null) {
                        L.m(o1);
                        if(o1.S5() != null) {
                            r r1 = o1.S5();
                            if(r1 != null) {
                                r1.z5();
                            }
                        }
                    }
                    goto label_42;
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
            label_42:
                c.a(f00, null);
            }
        }

        public final void m(@l String s, @l String s1, @l r r0, boolean z) {
            Class class0;
            L.p(s, "galleryId");
            L.p(s1, "galleryName");
            L.p(r0, "textOption");
            if(TextUtils.isEmpty(s) || TextUtils.isEmpty(s1)) {
                throw new NullPointerException("Unknown gallery " + s + ", " + s1);
            }
            F0 f00 = F0.g4();
            L.m(f00);
            boolean z1 = f00.E0();
            class0 = o.class;
            if(!z1) {
                f00.beginTransaction();
                goto label_10;
            }
            goto label_40;
            try {
            label_10:
                RealmQuery realmQuery0 = f00.C4(class0);
                L.o(realmQuery0, "this.where(T::class.java)");
                o o0 = (o)realmQuery0.i0("galleryId", s).r0();
                if(o0 == null || z) {
                    if(o0 == null) {
                        X0 x00 = f00.n3(class0, s);
                        L.o(x00, "this.createObject(T::class.java, primaryKeyValue)");
                        ((o)x00).V5(s1);
                        o0 = (o)x00;
                    }
                    o0.X5(System.currentTimeMillis());
                    if(o0.S5() == null) {
                        o0.W5(((r)f00.o2(r0, new W[0])));
                    }
                    else {
                        r r1 = o0.S5();
                        L.m(r1);
                        r1.Z5(r0.S5());
                        r1.X5(r0.Q5());
                        r1.a6(r0.T5());
                        r1.c6(r0.V5());
                        r1.Y5(r0.R5());
                        r1.b6(r0.U5());
                        r1.d6(r0.W5());
                    }
                    f00.p();
                    goto label_70;
                }
                goto label_38;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
        label_38:
            c.a(f00, null);
            return;
            try {
            label_40:
                RealmQuery realmQuery1 = f00.C4(class0);
                L.o(realmQuery1, "this.where(T::class.java)");
                o o1 = (o)realmQuery1.i0("galleryId", s).r0();
                if(o1 == null || z) {
                    if(o1 == null) {
                        X0 x01 = f00.n3(class0, s);
                        L.o(x01, "this.createObject(T::class.java, primaryKeyValue)");
                        ((o)x01).V5(s1);
                        o1 = (o)x01;
                    }
                    o1.X5(System.currentTimeMillis());
                    if(o1.S5() == null) {
                        o1.W5(((r)f00.o2(r0, new W[0])));
                    }
                    else {
                        r r2 = o1.S5();
                        L.m(r2);
                        r2.Z5(r0.S5());
                        r2.X5(r0.Q5());
                        r2.a6(r0.T5());
                        r2.c6(r0.V5());
                        r2.Y5(r0.R5());
                        r2.b6(r0.U5());
                        r2.d6(r0.W5());
                    }
                    goto label_70;
                }
                goto label_72;
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
        label_70:
            c.a(f00, null);
            return;
        label_72:
            c.a(f00, null);
        }

        public static void n(a o$a0, String s, String s1, r r0, boolean z, int v, Object object0) {
            if((v & 8) != 0) {
                z = true;
            }
            o$a0.m(s, s1, r0, z);
        }
    }

    @e
    @m
    private String d;
    @m
    private String e;
    @h3.c
    private long f;
    @m
    private r g;
    @l
    public static final a h = null;
    @l
    public static final String i = "__DC_GLOBAL_DEF_IMAGE_ID";

    static {
        o.h = new a(null);
    }

    public o() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.l2
    public void F4(r r0) {
        this.g = r0;
    }

    @m
    public String Q5() {
        return this.a();
    }

    @m
    public String R5() {
        return this.j();
    }

    @m
    public r S5() {
        return this.d3();
    }

    public long T5() {
        return this.d();
    }

    public void U5(@m String s) {
        this.b(s);
    }

    public void V5(@m String s) {
        this.h(s);
    }

    public void W5(@m r r0) {
        this.F4(r0);
    }

    public void X5(long v) {
        this.c(v);
    }

    @Override  // io.realm.l2
    public String a() {
        return this.d;
    }

    @Override  // io.realm.l2
    public void b(String s) {
        this.d = s;
    }

    @Override  // io.realm.l2
    public void c(long v) {
        this.f = v;
    }

    @Override  // io.realm.l2
    public long d() {
        return this.f;
    }

    @Override  // io.realm.l2
    public r d3() {
        return this.g;
    }

    @Override  // io.realm.l2
    public void h(String s) {
        this.e = s;
    }

    @Override  // io.realm.l2
    public String j() {
        return this.e;
    }
}

