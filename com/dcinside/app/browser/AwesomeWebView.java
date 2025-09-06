package com.dcinside.app.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.webkit.WebSettings.LayoutAlgorithm;
import androidx.annotation.AnimRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.Application;
import com.dcinside.app.browser.objects.CustomMenu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

public final class AwesomeWebView {
    @s0({"SMAP\nAwesomeWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwesomeWebView.kt\ncom/dcinside/app/browser/AwesomeWebView$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1325:1\n1#2:1326\n*E\n"})
    public static final class Builder implements Parcelable {
        public static final class a implements Parcelable.Creator {
            @l
            public Builder a(@l Parcel parcel0) {
                L.p(parcel0, "source");
                return new Builder(parcel0);
            }

            @l
            public Builder[] b(int v) {
                return new Builder[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final class b {
            private b() {
            }

            public b(w w0) {
            }
        }

        @m
        private Integer A;
        @m
        private WebSettings.LayoutAlgorithm A9;
        @m
        private Float B;
        @m
        private String B9;
        @m
        private Boolean C;
        @m
        private String C9;
        @l
        @f
        public static final Parcelable.Creator CREATOR = null;
        @m
        private Integer D;
        @m
        private String D9;
        @m
        private Float E;
        @m
        private String E9;
        @m
        private X.a F;
        @m
        private String F9;
        @m
        private String G;
        @m
        private String G9;
        @m
        private Boolean H;
        @m
        private Integer H9;
        @m
        private Float I;
        @m
        private Integer I9;
        @m
        private String J;
        @m
        private Integer J9;
        @m
        private Integer K;
        @m
        private Integer K9;
        @m
        private Boolean L;
        @m
        private Boolean L9;
        @m
        private Float M;
        @m
        private String M8;
        @m
        private Boolean M9;
        @m
        private String N;
        @m
        private Integer N8;
        @m
        private Boolean N9;
        @m
        private Integer O;
        @m
        private Integer O8;
        @m
        private Boolean O9;
        @m
        private Integer P;
        @m
        private Float P8;
        @m
        private Boolean P9;
        @m
        private Integer Q;
        @m
        private Float Q8;
        @m
        private Boolean Q9;
        @m
        private Boolean R8;
        @m
        private String R9;
        @m
        private Integer S8;
        @m
        private Boolean S9;
        @m
        private Boolean T8;
        @m
        private String T9;
        @m
        private Integer U8;
        @m
        private Boolean U9;
        @m
        private Boolean V8;
        @m
        private Boolean V9;
        @m
        private Integer W8;
        @m
        private Boolean W9;
        @m
        private Float X;
        @m
        private Boolean X8;
        @m
        private Boolean X9;
        @m
        private Integer Y;
        @m
        private Integer Y8;
        @m
        private String Y9;
        @m
        private Float Z;
        @m
        private Boolean Z8;
        @m
        private String Z9;
        @l
        private final transient Context a;
        @m
        private Integer a9;
        @m
        private Boolean aa;
        @l
        private transient List b;
        @m
        private Boolean b9;
        @m
        private Boolean ba;
        @m
        private transient Activity c;
        @m
        private Integer c9;
        @m
        private Integer ca;
        @m
        private transient Fragment d;
        @m
        private Boolean d9;
        @m
        private Integer da;
        private int e;
        @m
        private Integer e9;
        @m
        private Boolean ea;
        private int f;
        @m
        private Integer f9;
        @m
        private Boolean fa;
        @m
        private Boolean g;
        @m
        private Boolean g9;
        @m
        private Boolean ga;
        @m
        private Integer h;
        @m
        private Integer h9;
        @m
        private Boolean ha;
        @m
        private Integer i;
        @m
        private List i9;
        @m
        private Boolean ia;
        @m
        private Boolean j;
        @m
        private Integer j9;
        @m
        private String ja;
        @m
        private Integer k;
        @m
        private Integer k9;
        @m
        private Boolean ka;
        @m
        private Boolean l;
        @m
        private Integer l9;
        @m
        private String la;
        @m
        private Integer m;
        @m
        private Integer m9;
        @m
        private String ma;
        @m
        private Integer n;
        @m
        private Boolean n9;
        @m
        private String na;
        @m
        private Integer o;
        @m
        private Integer o9;
        @m
        private String oa;
        @m
        private Integer p;
        @m
        private Boolean p9;
        @m
        private Map pa;
        @m
        private Boolean q;
        @m
        private Boolean q9;
        @m
        private Boolean qa;
        @m
        private Boolean r;
        @m
        private Boolean r9;
        @l
        public static final b ra = null;
        @m
        private Boolean s;
        @m
        private Boolean s9;
        @l
        public static final String sa = "actionLoadUrlPost";
        @m
        private Boolean t;
        @m
        private Boolean t9;
        @l
        public static final String ta = "extraPostArguments";
        @m
        private Boolean u;
        @m
        private Boolean u9;
        @l
        public static final String ua = "extraSecurityUser";
        @m
        private Boolean v;
        @m
        private Boolean v9;
        @m
        private Boolean w;
        @m
        private Boolean w9;
        @m
        private Boolean x;
        @m
        private Integer x9;
        @m
        private Boolean y;
        @m
        private Boolean y9;
        @m
        private Boolean z;
        @m
        private Boolean z9;

        static {
            Builder.ra = new b(null);
            Builder.CREATOR = new a();
        }

        public Builder(@l Context context0, @l List list0, @m Activity activity0, @m Fragment fragment0, int v, int v1, @m Boolean boolean0, @m Integer integer0, @m Integer integer1, @m Boolean boolean1, @m Integer integer2, @m Boolean boolean2, @m Integer integer3, @m Integer integer4, @m Integer integer5, @m Integer integer6, @m Boolean boolean3, @m Boolean boolean4, @m Boolean boolean5, @m Boolean boolean6, @m Boolean boolean7, @m Boolean boolean8, @m Boolean boolean9, @m Boolean boolean10, @m Boolean boolean11, @m Boolean boolean12, @m Integer integer7, @m Float float0, @m Boolean boolean13, @m Integer integer8, @m Float float1, @m X.a a0, @m String s, @m Boolean boolean14, @m Float float2, @m String s1, @m Integer integer9, @m Boolean boolean15, @m Float float3, @m String s2, @m Integer integer10, @m Integer integer11, @m Integer integer12, @m Float float4, @m Integer integer13, @m Float float5, @m String s3, @m Integer integer14, @m Integer integer15, @m Float float6, @m Float float7, @m Boolean boolean16, @m Integer integer16, @m Boolean boolean17, @m Integer integer17, @m Boolean boolean18, @m Integer integer18, @m Boolean boolean19, @m Integer integer19, @m Boolean boolean20, @m Integer integer20, @m Boolean boolean21, @m Integer integer21, @m Boolean boolean22, @m Integer integer22, @m Integer integer23, @m Boolean boolean23, @m Integer integer24, @m List list1, @m Integer integer25, @m Integer integer26, @m Integer integer27, @m Integer integer28, @m Boolean boolean24, @m Integer integer29, @m Boolean boolean25, @m Boolean boolean26, @m Boolean boolean27, @m Boolean boolean28, @m Boolean boolean29, @m Boolean boolean30, @m Boolean boolean31, @m Boolean boolean32, @m Integer integer30, @m Boolean boolean33, @m Boolean boolean34, @m WebSettings.LayoutAlgorithm webSettings$LayoutAlgorithm0, @m String s4, @m String s5, @m String s6, @m String s7, @m String s8, @m String s9, @m Integer integer31, @m Integer integer32, @m Integer integer33, @m Integer integer34, @m Boolean boolean35, @m Boolean boolean36, @m Boolean boolean37, @m Boolean boolean38, @m Boolean boolean39, @m Boolean boolean40, @m String s10, @m Boolean boolean41, @m String s11, @m Boolean boolean42, @m Boolean boolean43, @m Boolean boolean44, @m Boolean boolean45, @m String s12, @m String s13, @m Boolean boolean46, @m Boolean boolean47, @m Integer integer35, @m Integer integer36, @m Boolean boolean48, @m Boolean boolean49, @m Boolean boolean50, @m Boolean boolean51, @m Boolean boolean52, @m String s14, @m Boolean boolean53, @m String s15, @m String s16, @m String s17, @m String s18, @m Map map0, @m Boolean boolean54) {
            L.p(context0, "context");
            L.p(list0, "listeners");
            super();
            this.a = context0;
            this.b = list0;
            this.c = activity0;
            this.d = fragment0;
            this.e = v;
            this.f = v1;
            this.g = boolean0;
            this.h = integer0;
            this.i = integer1;
            this.j = boolean1;
            this.k = integer2;
            this.l = boolean2;
            this.m = integer3;
            this.n = integer4;
            this.o = integer5;
            this.p = integer6;
            this.q = boolean3;
            this.r = boolean4;
            this.s = boolean5;
            this.t = boolean6;
            this.u = boolean7;
            this.v = boolean8;
            this.w = boolean9;
            this.x = boolean10;
            this.y = boolean11;
            this.z = boolean12;
            this.A = integer7;
            this.B = float0;
            this.C = boolean13;
            this.D = integer8;
            this.E = float1;
            this.F = a0;
            this.G = s;
            this.H = boolean14;
            this.I = float2;
            this.J = s1;
            this.K = integer9;
            this.L = boolean15;
            this.M = float3;
            this.N = s2;
            this.O = integer10;
            this.P = integer11;
            this.Q = integer12;
            this.X = float4;
            this.Y = integer13;
            this.Z = float5;
            this.M8 = s3;
            this.N8 = integer14;
            this.O8 = integer15;
            this.P8 = float6;
            this.Q8 = float7;
            this.R8 = boolean16;
            this.S8 = integer16;
            this.T8 = boolean17;
            this.U8 = integer17;
            this.V8 = boolean18;
            this.W8 = integer18;
            this.X8 = boolean19;
            this.Y8 = integer19;
            this.Z8 = boolean20;
            this.a9 = integer20;
            this.b9 = boolean21;
            this.c9 = integer21;
            this.d9 = boolean22;
            this.e9 = integer22;
            this.f9 = integer23;
            this.g9 = boolean23;
            this.h9 = integer24;
            this.i9 = list1;
            this.j9 = integer25;
            this.k9 = integer26;
            this.l9 = integer27;
            this.m9 = integer28;
            this.n9 = boolean24;
            this.o9 = integer29;
            this.p9 = boolean25;
            this.q9 = boolean26;
            this.r9 = boolean27;
            this.s9 = boolean28;
            this.t9 = boolean29;
            this.u9 = boolean30;
            this.v9 = boolean31;
            this.w9 = boolean32;
            this.x9 = integer30;
            this.y9 = boolean33;
            this.z9 = boolean34;
            this.A9 = webSettings$LayoutAlgorithm0;
            this.B9 = s4;
            this.C9 = s5;
            this.D9 = s6;
            this.E9 = s7;
            this.F9 = s8;
            this.G9 = s9;
            this.H9 = integer31;
            this.I9 = integer32;
            this.J9 = integer33;
            this.K9 = integer34;
            this.L9 = boolean35;
            this.M9 = boolean36;
            this.N9 = boolean37;
            this.O9 = boolean38;
            this.P9 = boolean39;
            this.Q9 = boolean40;
            this.R9 = s10;
            this.S9 = boolean41;
            this.T9 = s11;
            this.U9 = boolean42;
            this.V9 = boolean43;
            this.W9 = boolean44;
            this.X9 = boolean45;
            this.Y9 = s12;
            this.Z9 = s13;
            this.aa = boolean46;
            this.ba = boolean47;
            this.ca = integer35;
            this.da = integer36;
            this.ea = boolean48;
            this.fa = boolean49;
            this.ga = boolean50;
            this.ha = boolean51;
            this.ia = boolean52;
            this.ja = s14;
            this.ka = boolean53;
            this.la = s15;
            this.ma = s16;
            this.na = s17;
            this.oa = s18;
            this.pa = map0;
            this.qa = boolean54;
        }

        public Builder(Context context0, List list0, Activity activity0, Fragment fragment0, int v, int v1, Boolean boolean0, Integer integer0, Integer integer1, Boolean boolean1, Integer integer2, Boolean boolean2, Integer integer3, Integer integer4, Integer integer5, Integer integer6, Boolean boolean3, Boolean boolean4, Boolean boolean5, Boolean boolean6, Boolean boolean7, Boolean boolean8, Boolean boolean9, Boolean boolean10, Boolean boolean11, Boolean boolean12, Integer integer7, Float float0, Boolean boolean13, Integer integer8, Float float1, X.a a0, String s, Boolean boolean14, Float float2, String s1, Integer integer9, Boolean boolean15, Float float3, String s2, Integer integer10, Integer integer11, Integer integer12, Float float4, Integer integer13, Float float5, String s3, Integer integer14, Integer integer15, Float float6, Float float7, Boolean boolean16, Integer integer16, Boolean boolean17, Integer integer17, Boolean boolean18, Integer integer18, Boolean boolean19, Integer integer19, Boolean boolean20, Integer integer20, Boolean boolean21, Integer integer21, Boolean boolean22, Integer integer22, Integer integer23, Boolean boolean23, Integer integer24, List list1, Integer integer25, Integer integer26, Integer integer27, Integer integer28, Boolean boolean24, Integer integer29, Boolean boolean25, Boolean boolean26, Boolean boolean27, Boolean boolean28, Boolean boolean29, Boolean boolean30, Boolean boolean31, Boolean boolean32, Integer integer30, Boolean boolean33, Boolean boolean34, WebSettings.LayoutAlgorithm webSettings$LayoutAlgorithm0, String s4, String s5, String s6, String s7, String s8, String s9, Integer integer31, Integer integer32, Integer integer33, Integer integer34, Boolean boolean35, Boolean boolean36, Boolean boolean37, Boolean boolean38, Boolean boolean39, Boolean boolean40, String s10, Boolean boolean41, String s11, Boolean boolean42, Boolean boolean43, Boolean boolean44, Boolean boolean45, String s12, String s13, Boolean boolean46, Boolean boolean47, Integer integer35, Integer integer36, Boolean boolean48, Boolean boolean49, Boolean boolean50, Boolean boolean51, Boolean boolean52, String s14, Boolean boolean53, String s15, String s16, String s17, String s18, Map map0, Boolean boolean54, int v2, int v3, int v4, int v5, int v6, w w0) {
            List list2 = (v2 & 2) == 0 ? list0 : new ArrayList();
            List list3 = (v4 & 16) == 0 ? list1 : new ArrayList();
            this(context0, list2, ((v2 & 4) == 0 ? activity0 : null), ((v2 & 8) == 0 ? fragment0 : null), ((v2 & 16) == 0 ? v : 0), ((v2 & 0x20) == 0 ? v1 : 0), ((v2 & 0x40) == 0 ? boolean0 : null), ((v2 & 0x80) == 0 ? integer0 : null), ((v2 & 0x100) == 0 ? integer1 : null), ((v2 & 0x200) == 0 ? boolean1 : null), ((v2 & 0x400) == 0 ? integer2 : null), ((v2 & 0x800) == 0 ? boolean2 : null), ((v2 & 0x1000) == 0 ? integer3 : null), ((v2 & 0x2000) == 0 ? integer4 : null), ((v2 & 0x4000) == 0 ? integer5 : null), ((v2 & 0x8000) == 0 ? integer6 : null), ((v2 & 0x10000) == 0 ? boolean3 : null), ((v2 & 0x20000) == 0 ? boolean4 : null), ((v2 & 0x40000) == 0 ? boolean5 : null), ((v2 & 0x80000) == 0 ? boolean6 : null), ((v2 & 0x100000) == 0 ? boolean7 : null), ((v2 & 0x200000) == 0 ? boolean8 : null), ((v2 & 0x400000) == 0 ? boolean9 : null), ((v2 & 0x800000) == 0 ? boolean10 : null), ((v2 & 0x1000000) == 0 ? boolean11 : null), ((v2 & 0x2000000) == 0 ? boolean12 : null), ((v2 & 0x4000000) == 0 ? integer7 : null), ((v2 & 0x8000000) == 0 ? float0 : null), ((v2 & 0x10000000) == 0 ? boolean13 : null), ((v2 & 0x20000000) == 0 ? integer8 : null), ((v2 & 0x40000000) == 0 ? float1 : null), ((v2 & 0x80000000) == 0 ? a0 : null), ((v3 & 1) == 0 ? s : null), ((v3 & 2) == 0 ? boolean14 : null), ((v3 & 4) == 0 ? float2 : null), ((v3 & 8) == 0 ? s1 : null), ((v3 & 16) == 0 ? integer9 : null), ((v3 & 0x20) == 0 ? boolean15 : null), ((v3 & 0x40) == 0 ? float3 : null), ((v3 & 0x80) == 0 ? s2 : null), ((v3 & 0x100) == 0 ? integer10 : null), ((v3 & 0x200) == 0 ? integer11 : null), ((v3 & 0x400) == 0 ? integer12 : null), ((v3 & 0x800) == 0 ? float4 : null), ((v3 & 0x1000) == 0 ? integer13 : null), ((v3 & 0x2000) == 0 ? float5 : null), ((v3 & 0x4000) == 0 ? s3 : null), ((v3 & 0x8000) == 0 ? integer14 : null), ((v3 & 0x10000) == 0 ? integer15 : null), ((v3 & 0x20000) == 0 ? float6 : null), ((v3 & 0x40000) == 0 ? float7 : null), ((v3 & 0x80000) == 0 ? boolean16 : null), ((v3 & 0x100000) == 0 ? integer16 : null), ((v3 & 0x200000) == 0 ? boolean17 : null), ((v3 & 0x400000) == 0 ? integer17 : null), ((v3 & 0x800000) == 0 ? boolean18 : null), ((v3 & 0x1000000) == 0 ? integer18 : null), ((v3 & 0x2000000) == 0 ? boolean19 : null), ((v3 & 0x4000000) == 0 ? integer19 : null), ((v3 & 0x8000000) == 0 ? boolean20 : null), ((v3 & 0x10000000) == 0 ? integer20 : null), ((v3 & 0x20000000) == 0 ? boolean21 : null), ((v3 & 0x40000000) == 0 ? integer21 : null), ((v3 & 0x80000000) == 0 ? boolean22 : null), ((v4 & 1) == 0 ? integer22 : null), ((v4 & 2) == 0 ? integer23 : null), ((v4 & 4) == 0 ? boolean23 : null), ((v4 & 8) == 0 ? integer24 : null), list3, ((v4 & 0x20) == 0 ? integer25 : 0x7F010046), ((v4 & 0x40) == 0 ? integer26 : 0x7F010047), ((v4 & 0x80) == 0 ? integer27 : null), ((v4 & 0x100) == 0 ? integer28 : null), ((v4 & 0x200) == 0 ? boolean24 : null), ((v4 & 0x400) == 0 ? integer29 : null), ((v4 & 0x800) == 0 ? boolean25 : null), ((v4 & 0x1000) == 0 ? boolean26 : null), ((v4 & 0x2000) == 0 ? boolean27 : null), ((v4 & 0x4000) == 0 ? boolean28 : null), ((v4 & 0x8000) == 0 ? boolean29 : null), ((v4 & 0x10000) == 0 ? boolean30 : null), ((v4 & 0x20000) == 0 ? boolean31 : null), ((v4 & 0x40000) == 0 ? boolean32 : null), ((v4 & 0x80000) == 0 ? integer30 : null), ((v4 & 0x100000) == 0 ? boolean33 : null), ((v4 & 0x200000) == 0 ? boolean34 : null), ((v4 & 0x400000) == 0 ? webSettings$LayoutAlgorithm0 : null), ((v4 & 0x800000) == 0 ? s4 : null), ((v4 & 0x1000000) == 0 ? s5 : null), ((v4 & 0x2000000) == 0 ? s6 : null), ((v4 & 0x4000000) == 0 ? s7 : null), ((v4 & 0x8000000) == 0 ? s8 : null), ((v4 & 0x10000000) == 0 ? s9 : null), ((v4 & 0x20000000) == 0 ? integer31 : null), ((v4 & 0x40000000) == 0 ? integer32 : null), ((v4 & 0x80000000) == 0 ? integer33 : null), ((v5 & 1) == 0 ? integer34 : null), ((v5 & 2) == 0 ? boolean35 : null), ((v5 & 4) == 0 ? boolean36 : null), ((v5 & 8) == 0 ? boolean37 : null), ((v5 & 16) == 0 ? boolean38 : null), ((v5 & 0x20) == 0 ? boolean39 : null), ((v5 & 0x40) == 0 ? boolean40 : null), ((v5 & 0x80) == 0 ? s10 : null), ((v5 & 0x100) == 0 ? boolean41 : null), ((v5 & 0x200) == 0 ? s11 : null), ((v5 & 0x400) == 0 ? boolean42 : null), ((v5 & 0x800) == 0 ? boolean43 : null), ((v5 & 0x1000) == 0 ? boolean44 : null), ((v5 & 0x2000) == 0 ? boolean45 : null), ((v5 & 0x4000) == 0 ? s12 : null), ((v5 & 0x8000) == 0 ? s13 : null), ((v5 & 0x10000) == 0 ? boolean46 : null), ((v5 & 0x20000) == 0 ? boolean47 : null), ((v5 & 0x40000) == 0 ? integer35 : null), ((v5 & 0x80000) == 0 ? integer36 : null), ((v5 & 0x100000) == 0 ? boolean48 : null), ((v5 & 0x200000) == 0 ? boolean49 : null), ((v5 & 0x400000) == 0 ? boolean50 : null), ((v5 & 0x800000) == 0 ? boolean51 : null), ((v5 & 0x1000000) == 0 ? boolean52 : null), ((v5 & 0x2000000) == 0 ? s14 : null), ((v5 & 0x4000000) == 0 ? boolean53 : null), ((v5 & 0x8000000) == 0 ? s15 : null), ((v5 & 0x10000000) == 0 ? s16 : null), ((v5 & 0x20000000) == 0 ? s17 : null), ((v5 & 0x40000000) == 0 ? s18 : null), ((v5 & 0x80000000) == 0 ? map0 : null), ((v6 & 1) == 0 ? boolean54 : null));  // anim:modal_activity_open_enter
        }

        public Builder(@l Parcel parcel0) {
            L.p(parcel0, "source");
            Context context0 = Application.e.c();
            ArrayList arrayList0 = new ArrayList();
            int v = parcel0.readInt();
            int v1 = parcel0.readInt();
            Class class0 = Boolean.TYPE;
            Object object0 = parcel0.readValue(class0.getClassLoader());
            Class class1 = Integer.TYPE;
            Object object1 = parcel0.readValue(class1.getClassLoader());
            Object object2 = parcel0.readValue(class1.getClassLoader());
            Object object3 = parcel0.readValue(class0.getClassLoader());
            Object object4 = parcel0.readValue(class1.getClassLoader());
            Object object5 = parcel0.readValue(class0.getClassLoader());
            Object object6 = parcel0.readValue(class1.getClassLoader());
            Object object7 = parcel0.readValue(class1.getClassLoader());
            Object object8 = parcel0.readValue(class1.getClassLoader());
            Object object9 = parcel0.readValue(class1.getClassLoader());
            Object object10 = parcel0.readValue(class0.getClassLoader());
            Object object11 = parcel0.readValue(class0.getClassLoader());
            Object object12 = parcel0.readValue(class0.getClassLoader());
            Object object13 = parcel0.readValue(class0.getClassLoader());
            Object object14 = parcel0.readValue(class0.getClassLoader());
            Object object15 = parcel0.readValue(class0.getClassLoader());
            Object object16 = parcel0.readValue(class0.getClassLoader());
            Object object17 = parcel0.readValue(class0.getClassLoader());
            Object object18 = parcel0.readValue(class0.getClassLoader());
            Object object19 = parcel0.readValue(class0.getClassLoader());
            Object object20 = parcel0.readValue(class1.getClassLoader());
            Class class2 = Float.TYPE;
            Object object21 = parcel0.readValue(class2.getClassLoader());
            Object object22 = parcel0.readValue(class0.getClassLoader());
            Object object23 = parcel0.readValue(class1.getClassLoader());
            Object object24 = parcel0.readValue(class2.getClassLoader());
            Integer integer0 = parcel0.readInt();
            if(integer0.intValue() < 0) {
                integer0 = null;
            }
            X.a a0 = integer0 == null ? null : X.a.values()[integer0.intValue()];
            String s = parcel0.readString();
            Object object25 = parcel0.readValue(class0.getClassLoader());
            Object object26 = parcel0.readValue(class2.getClassLoader());
            String s1 = parcel0.readString();
            Object object27 = parcel0.readValue(class1.getClassLoader());
            Object object28 = parcel0.readValue(class0.getClassLoader());
            Object object29 = parcel0.readValue(class2.getClassLoader());
            String s2 = parcel0.readString();
            Object object30 = parcel0.readValue(class1.getClassLoader());
            Object object31 = parcel0.readValue(class1.getClassLoader());
            Object object32 = parcel0.readValue(class1.getClassLoader());
            Object object33 = parcel0.readValue(class2.getClassLoader());
            Object object34 = parcel0.readValue(class1.getClassLoader());
            Object object35 = parcel0.readValue(class2.getClassLoader());
            String s3 = parcel0.readString();
            Object object36 = parcel0.readValue(class1.getClassLoader());
            Object object37 = parcel0.readValue(class1.getClassLoader());
            Object object38 = parcel0.readValue(class2.getClassLoader());
            Object object39 = parcel0.readValue(class2.getClassLoader());
            Object object40 = parcel0.readValue(class0.getClassLoader());
            Object object41 = parcel0.readValue(class1.getClassLoader());
            Object object42 = parcel0.readValue(class0.getClassLoader());
            Object object43 = parcel0.readValue(class1.getClassLoader());
            Object object44 = parcel0.readValue(class0.getClassLoader());
            Object object45 = parcel0.readValue(class1.getClassLoader());
            Object object46 = parcel0.readValue(class0.getClassLoader());
            Object object47 = parcel0.readValue(class1.getClassLoader());
            Object object48 = parcel0.readValue(class0.getClassLoader());
            Object object49 = parcel0.readValue(class1.getClassLoader());
            Object object50 = parcel0.readValue(class0.getClassLoader());
            Object object51 = parcel0.readValue(class1.getClassLoader());
            Object object52 = parcel0.readValue(class0.getClassLoader());
            Object object53 = parcel0.readValue(class1.getClassLoader());
            Object object54 = parcel0.readValue(class1.getClassLoader());
            Object object55 = parcel0.readValue(class0.getClassLoader());
            Object object56 = parcel0.readValue(class1.getClassLoader());
            ArrayList arrayList1 = parcel0.createTypedArrayList(CustomMenu.CREATOR);
            Object object57 = parcel0.readValue(class1.getClassLoader());
            Object object58 = parcel0.readValue(class1.getClassLoader());
            Object object59 = parcel0.readValue(class1.getClassLoader());
            Object object60 = parcel0.readValue(class1.getClassLoader());
            Object object61 = parcel0.readValue(class0.getClassLoader());
            Object object62 = parcel0.readValue(class1.getClassLoader());
            Object object63 = parcel0.readValue(class0.getClassLoader());
            Object object64 = parcel0.readValue(class0.getClassLoader());
            Object object65 = parcel0.readValue(class0.getClassLoader());
            Object object66 = parcel0.readValue(class0.getClassLoader());
            Object object67 = parcel0.readValue(class0.getClassLoader());
            Object object68 = parcel0.readValue(class0.getClassLoader());
            Object object69 = parcel0.readValue(class0.getClassLoader());
            Object object70 = parcel0.readValue(class0.getClassLoader());
            Object object71 = parcel0.readValue(class1.getClassLoader());
            Object object72 = parcel0.readValue(class0.getClassLoader());
            Object object73 = parcel0.readValue(class0.getClassLoader());
            Integer integer1 = parcel0.readInt();
            if(integer1.intValue() < 0) {
                integer1 = null;
            }
            WebSettings.LayoutAlgorithm webSettings$LayoutAlgorithm0 = integer1 == null ? null : WebSettings.LayoutAlgorithm.values()[integer1.intValue()];
            String s4 = parcel0.readString();
            String s5 = parcel0.readString();
            String s6 = parcel0.readString();
            String s7 = parcel0.readString();
            String s8 = parcel0.readString();
            String s9 = parcel0.readString();
            Object object74 = parcel0.readValue(class1.getClassLoader());
            Object object75 = parcel0.readValue(class1.getClassLoader());
            Object object76 = parcel0.readValue(class1.getClassLoader());
            Object object77 = parcel0.readValue(class1.getClassLoader());
            Object object78 = parcel0.readValue(class0.getClassLoader());
            Object object79 = parcel0.readValue(class0.getClassLoader());
            Object object80 = parcel0.readValue(class0.getClassLoader());
            Object object81 = parcel0.readValue(class0.getClassLoader());
            Object object82 = parcel0.readValue(class0.getClassLoader());
            Object object83 = parcel0.readValue(class0.getClassLoader());
            String s10 = parcel0.readString();
            Object object84 = parcel0.readValue(class0.getClassLoader());
            String s11 = parcel0.readString();
            Object object85 = parcel0.readValue(class0.getClassLoader());
            Object object86 = parcel0.readValue(class0.getClassLoader());
            Object object87 = parcel0.readValue(class0.getClassLoader());
            Object object88 = parcel0.readValue(class0.getClassLoader());
            String s12 = parcel0.readString();
            String s13 = parcel0.readString();
            Object object89 = parcel0.readValue(class0.getClassLoader());
            Object object90 = parcel0.readValue(class0.getClassLoader());
            Object object91 = parcel0.readValue(class1.getClassLoader());
            Object object92 = parcel0.readValue(class1.getClassLoader());
            Object object93 = parcel0.readValue(class0.getClassLoader());
            Object object94 = parcel0.readValue(class0.getClassLoader());
            Object object95 = parcel0.readValue(class0.getClassLoader());
            Object object96 = parcel0.readValue(class0.getClassLoader());
            Object object97 = parcel0.readValue(class0.getClassLoader());
            String s14 = parcel0.readString();
            Boolean boolean0 = (Boolean)parcel0.readValue(class0.getClassLoader());
            String s15 = parcel0.readString();
            String s16 = parcel0.readString();
            String s17 = parcel0.readString();
            String s18 = parcel0.readString();
            HashMap hashMap0 = new HashMap();
            int v2 = parcel0.readInt();
            for(int v3 = 0; v3 < v2; ++v3) {
                String s19 = parcel0.readString();
                String s20 = parcel0.readString();
                if(s19 != null && s20 != null) {
                    hashMap0.put(s19, s20);
                }
            }
            this(context0, arrayList0, null, null, v, v1, ((Boolean)object0), ((Integer)object1), ((Integer)object2), ((Boolean)object3), ((Integer)object4), ((Boolean)object5), ((Integer)object6), ((Integer)object7), ((Integer)object8), ((Integer)object9), ((Boolean)object10), ((Boolean)object11), ((Boolean)object12), ((Boolean)object13), ((Boolean)object14), ((Boolean)object15), ((Boolean)object16), ((Boolean)object17), ((Boolean)object18), ((Boolean)object19), ((Integer)object20), ((Float)object21), ((Boolean)object22), ((Integer)object23), ((Float)object24), a0, s, ((Boolean)object25), ((Float)object26), s1, ((Integer)object27), ((Boolean)object28), ((Float)object29), s2, ((Integer)object30), ((Integer)object31), ((Integer)object32), ((Float)object33), ((Integer)object34), ((Float)object35), s3, ((Integer)object36), ((Integer)object37), ((Float)object38), ((Float)object39), ((Boolean)object40), ((Integer)object41), ((Boolean)object42), ((Integer)object43), ((Boolean)object44), ((Integer)object45), ((Boolean)object46), ((Integer)object47), ((Boolean)object48), ((Integer)object49), ((Boolean)object50), ((Integer)object51), ((Boolean)object52), ((Integer)object53), ((Integer)object54), ((Boolean)object55), ((Integer)object56), arrayList1, ((Integer)object57), ((Integer)object58), ((Integer)object59), ((Integer)object60), ((Boolean)object61), ((Integer)object62), ((Boolean)object63), ((Boolean)object64), ((Boolean)object65), ((Boolean)object66), ((Boolean)object67), ((Boolean)object68), ((Boolean)object69), ((Boolean)object70), ((Integer)object71), ((Boolean)object72), ((Boolean)object73), webSettings$LayoutAlgorithm0, s4, s5, s6, s7, s8, s9, ((Integer)object74), ((Integer)object75), ((Integer)object76), ((Integer)object77), ((Boolean)object78), ((Boolean)object79), ((Boolean)object80), ((Boolean)object81), ((Boolean)object82), ((Boolean)object83), s10, ((Boolean)object84), s11, ((Boolean)object85), ((Boolean)object86), ((Boolean)object87), ((Boolean)object88), s12, s13, ((Boolean)object89), ((Boolean)object90), ((Integer)object91), ((Integer)object92), ((Boolean)object93), ((Boolean)object94), ((Boolean)object95), ((Boolean)object96), ((Boolean)object97), s14, boolean0, s15, s16, s17, s18, hashMap0, ((Boolean)parcel0.readValue(Boolean.TYPE.getClassLoader())));
        }

        @m
        public final String A() {
            return this.na;
        }

        @m
        public final Boolean A0() {
            return this.d9;
        }

        @m
        public final String A1() {
            return this.G9;
        }

        @l
        public final Builder A2(@l String s) {
            L.p(s, "menuTextFont");
            this.M8 = s;
            return this;
        }

        public final void A3(@m Float float0) {
            this.X = float0;
        }

        public final void A4(@m String s) {
            this.N = s;
        }

        public final void A5(@m String s, @m String s1, @m String s2, @m String s3, @m String s4) {
            this.oa = s;
            this.na = s1;
            this.f = System.identityHashCode(this);
            if(!this.b.isEmpty()) {
                new com.dcinside.app.browser.listeners.a(this.a, this.f, this.b);
            }
            Fragment fragment0 = this.d;
            Class class0 = AwesomeWebViewActivity.class;
            if(fragment0 != null) {
                L.m(fragment0);
                FragmentActivity fragmentActivity0 = fragment0.getActivity();
                Intent intent0 = new Intent(fragmentActivity0, class0);
                intent0.putExtra("builder", this);
                if(s2 != null) {
                    intent0.setAction(s2);
                }
                if(s3 != null) {
                    intent0.putExtra("extraPostArguments", s3);
                }
                if(s4 != null) {
                    intent0.putExtra("extraSecurityUser", s4);
                }
                Fragment fragment1 = this.d;
                L.m(fragment1);
                fragment1.startActivityForResult(intent0, this.e);
                if(fragmentActivity0 != null) {
                    Integer integer0 = this.j9;
                    L.m(integer0);
                    Integer integer1 = this.k9;
                    L.m(integer1);
                    fragmentActivity0.overridePendingTransition(((int)integer0), ((int)integer1));
                }
                this.d = null;
                return;
            }
            if(this.c != null) {
                Intent intent1 = new Intent(this.c, class0);
                intent1.putExtra("builder", this);
                if(s2 != null) {
                    intent1.setAction(s2);
                }
                if(s3 != null) {
                    intent1.putExtra("extraPostArguments", s3);
                }
                if(s4 != null) {
                    intent1.putExtra("extraSecurityUser", s4);
                }
                Activity activity0 = this.c;
                L.m(activity0);
                activity0.startActivityForResult(intent1, this.e);
                Activity activity1 = this.c;
                L.m(activity1);
                Integer integer2 = this.j9;
                L.m(integer2);
                Integer integer3 = this.k9;
                L.m(integer3);
                activity1.overridePendingTransition(((int)integer2), ((int)integer3));
                this.c = null;
                return;
            }
            Intent intent2 = new Intent(this.a, class0);
            intent2.putExtra("builder", this);
            intent2.addFlags(0x10000000);
            intent2.setAction(s2);
            intent2.putExtra("extraPostArguments", s3);
            if(s4 != null) {
                intent2.putExtra("extraSecurityUser", s4);
            }
            Application.e.c().startActivity(intent2);
            Context context0 = this.a;
            if(context0 instanceof Activity) {
                Integer integer4 = this.j9;
                L.m(integer4);
                Integer integer5 = this.k9;
                L.m(integer5);
                ((Activity)context0).overridePendingTransition(((int)integer4), ((int)integer5));
            }
        }

        @l
        public final Builder A6(boolean z) {
            this.t9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Boolean B() {
            return this.t;
        }

        @m
        public final Boolean B0() {
            return this.L;
        }

        @m
        public final String B1() {
            return this.C9;
        }

        @l
        public final Builder B2(int v) {
            this.O8 = v;
            return this;
        }

        public final void B3(@m Integer integer0) {
            this.Y = integer0;
        }

        public final void B4(@m Float float0) {
            this.M = float0;
        }

        public static void B5(Builder awesomeWebView$Builder0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
            awesomeWebView$Builder0.A5(s, s1, ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null));
        }

        @l
        public final Builder B6(boolean z) {
            this.Q9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Boolean C() {
            return this.r;
        }

        @m
        public final Activity C0() {
            return this.c;
        }

        @m
        public final String C1() {
            return this.R9;
        }

        @l
        public final Builder C2(float f) {
            this.P8 = f;
            return this;
        }

        public final void C3(@m Integer integer0) {
            this.N8 = integer0;
        }

        public final void C4(@m Boolean boolean0) {
            this.u9 = boolean0;
        }

        @l
        public final Builder C5(boolean z) {
            this.y = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder C6(boolean z) {
            this.P9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Boolean D() {
            return this.v;
        }

        @m
        public final Fragment D0() {
            return this.d;
        }

        @m
        public final Boolean D1() {
            return this.W9;
        }

        @l
        public final Builder D2(int v) {
            this.P8 = (float)v;
            return this;
        }

        public final void D3(@m String s) {
            this.M8 = s;
        }

        public final void D4(@m Boolean boolean0) {
            this.t9 = boolean0;
        }

        @l
        public final Builder D5(boolean z) {
            this.s = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder D6(boolean z) {
            this.S9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Boolean E() {
            return this.x;
        }

        @m
        public final Boolean E1() {
            return this.X9;
        }

        @l
        public final Builder E2(@DimenRes int v) {
            this.P8 = this.a.getResources().getDimension(v);
            return this;
        }

        public final void E3(@m Integer integer0) {
            this.O8 = integer0;
        }

        public final void E4(@m Boolean boolean0) {
            this.Q9 = boolean0;
        }

        @l
        public final Builder E5(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder E6(@l String s) {
            L.p(s, "webViewAppCachePath");
            this.T9 = s;
            return this;
        }

        @m
        public final Integer F() {
            return this.A;
        }

        @m
        public final Integer F0() {
            return this.i;
        }

        @m
        public final Boolean F1() {
            return this.O9;
        }

        @l
        public final Builder F2(float f) {
            this.Q8 = f;
            return this;
        }

        public final void F3(@m Float float0) {
            this.P8 = float0;
        }

        public final void F4(@m Boolean boolean0) {
            this.P9 = boolean0;
        }

        @l
        public final Builder F5(boolean z) {
            this.u = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder F6(boolean z) {
            this.fa = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Float G() {
            return this.B;
        }

        @m
        public final Boolean G0() {
            return this.j;
        }

        @m
        public final WebSettings.LayoutAlgorithm G1() {
            return this.A9;
        }

        @l
        public final Builder G2(int v) {
            this.Q8 = (float)v;
            return this;
        }

        public final void G3(@m Float float0) {
            this.Q8 = float0;
        }

        public final void G4(@m Boolean boolean0) {
            this.S9 = boolean0;
        }

        @l
        public final Builder G5(boolean z) {
            this.w = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder G6(boolean z) {
            this.ia = Boolean.valueOf(z);
            return this;
        }

        @m
        public final String H() {
            return this.ma;
        }

        @m
        public final Integer H0() {
            return this.o9;
        }

        @m
        public final Boolean H1() {
            return this.v9;
        }

        @l
        public final Builder H2(@DimenRes int v) {
            this.Q8 = this.a.getResources().getDimension(v);
            return this;
        }

        public final void H3(@m Float float0) {
            this.Z = float0;
        }

        public final void H4(@m String s) {
            this.T9 = s;
        }

        @l
        public final Builder H5(boolean z) {
            this.X8 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder H6(boolean z) {
            this.M9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Map I() {
            return this.pa;
        }

        @m
        public final Integer I0() {
            return this.Y8;
        }

        @m
        public final Boolean I1() {
            return this.L9;
        }

        @l
        public final Builder I2(float f) {
            this.Z = f;
            return this;
        }

        public final void I3(@m String s) {
            this.la = s;
        }

        public final void I4(@m Boolean boolean0) {
            this.fa = boolean0;
        }

        @l
        public final Builder I5(boolean z) {
            this.T8 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder I6(boolean z) {
            this.N9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Boolean J() {
            return this.qa;
        }

        @m
        public final Integer J0() {
            return this.h9;
        }

        @m
        public final Boolean J1() {
            return this.q9;
        }

        @l
        public final Builder J2(int v) {
            this.Z = (float)v;
            return this;
        }

        public final void J3(@m Integer integer0) {
            this.D = integer0;
        }

        public final void J4(@m Boolean boolean0) {
            this.ia = boolean0;
        }

        @l
        public final Builder J5(boolean z) {
            this.Z8 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder J6(boolean z) {
            this.r9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Boolean K() {
            return this.g9;
        }

        @m
        public final Integer K0() {
            return this.U8;
        }

        @m
        public final Integer K1() {
            return this.H9;
        }

        @l
        public final Builder K2(@DimenRes int v) {
            this.Z = this.a.getResources().getDimension(v);
            return this;
        }

        public final void K3(@m Float float0) {
            this.E = float0;
        }

        public final void K4(@m Boolean boolean0) {
            this.M9 = boolean0;
        }

        @l
        public final Builder K5(boolean z) {
            this.R8 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder K6(int v) {
            this.ca = v;
            return this;
        }

        @m
        public final Boolean L() {
            return this.z;
        }

        @m
        public final Integer L0() {
            return this.a9;
        }

        @m
        public final Integer L1() {
            return this.I9;
        }

        @l
        public final Builder L2(@ColorInt int v) {
            this.D = v;
            return this;
        }

        public final void L3(@m X.a a0) {
            this.F = a0;
        }

        public final void L4(@m Boolean boolean0) {
            this.N9 = boolean0;
        }

        @l
        public final Builder L5(boolean z) {
            this.b9 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder L6(boolean z) {
            this.ha = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Integer M() {
            return this.m;
        }

        @m
        public final Integer M0() {
            return this.f9;
        }

        @m
        public final Integer M1() {
            return this.da;
        }

        @l
        public final Builder M2(@ColorRes int v) {
            this.D = ContextCompat.getColor(this.a, v);
            return this;
        }

        public final void M3(int v) {
            this.e = v;
        }

        public final void M4(@m Boolean boolean0) {
            this.r9 = boolean0;
        }

        @l
        public final Builder M5(boolean z) {
            this.V8 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder M6(boolean z) {
            this.ga = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Integer N() {
            return this.n;
        }

        @m
        public final Integer N0() {
            return this.e9;
        }

        @m
        public final Boolean N1() {
            return this.ba;
        }

        @l
        public final Builder N2(float f) {
            this.E = f;
            return this;
        }

        public final void N3(@m Boolean boolean0) {
            this.g = boolean0;
        }

        public final void N4(@m Integer integer0) {
            this.ca = integer0;
        }

        @l
        public final Builder N5(boolean z) {
            this.C = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder N6(@l String s) {
            L.p(s, "webViewCursiveFontFamily");
            this.F9 = s;
            return this;
        }

        @m
        public final Integer O() {
            return this.o;
        }

        @m
        public final Integer O0() {
            return this.S8;
        }

        @m
        public final Boolean O1() {
            return this.ea;
        }

        @l
        public final Builder O2(int v) {
            this.E = (float)v;
            return this;
        }

        public final void O3(@m Boolean boolean0) {
            this.y = boolean0;
        }

        public final void O4(@m Boolean boolean0) {
            this.ha = boolean0;
        }

        @l
        public final Builder O5(boolean z) {
            this.d9 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder O6(boolean z) {
            this.U9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Integer P() {
            return this.p;
        }

        @m
        public final Integer P0() {
            return this.c9;
        }

        @m
        public final String P1() {
            return this.D9;
        }

        public final void P3(@m Boolean boolean0) {
            this.s = boolean0;
        }

        public final void P4(@m Boolean boolean0) {
            this.ga = boolean0;
        }

        @l
        public final Builder P5(boolean z) {
            this.L = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder P6(int v) {
            this.K9 = v;
            return this;
        }

        @m
        public final Integer Q0() {
            return this.W8;
        }

        @l
        public final Builder Q2(@DimenRes int v) {
            this.E = this.a.getResources().getDimension(v);
            return this;
        }

        public final void Q3(@m Boolean boolean0) {
            this.q = boolean0;
        }

        public final void Q4(@m String s) {
            this.F9 = s;
        }

        public final void Q5(@l String s, @l String s1) {
            L.p(s, "url");
            L.p(s1, "userId");
            this.A5(s, null, null, null, s1);
        }

        @l
        public final Builder Q6(int v) {
            this.J9 = v;
            return this;
        }

        @m
        public final Integer R0() {
            return this.h;
        }

        @m
        public final Boolean R1() {
            return this.w9;
        }

        @l
        public final Builder R2(@l X.a a0) {
            L.p(a0, "position");
            this.F = a0;
            return this;
        }

        public final void R3(@m Boolean boolean0) {
            this.u = boolean0;
        }

        public final void R4(@m Boolean boolean0) {
            this.U9 = boolean0;
        }

        @l
        public final Builder R5(@l Activity activity0, int v) {
            L.p(activity0, "startByActivity");
            this.d = null;
            this.c = activity0;
            this.e = v;
            return this;
        }

        @l
        public final Builder R6(@l String s) {
            L.p(s, "webViewDefaultTextEncodingName");
            this.Y9 = s;
            return this;
        }

        @m
        public final String S() {
            return this.ja;
        }

        @m
        public final Integer S0() {
            return this.K;
        }

        @m
        public final String S1() {
            return this.E9;
        }

        @l
        public final Builder S2(@l com.dcinside.app.browser.listeners.b b0) {
            L.p(b0, "listener");
            this.b.remove(b0);
            return this;
        }

        public final void S3(@m Boolean boolean0) {
            this.w = boolean0;
        }

        public final void S4(@m Integer integer0) {
            this.K9 = integer0;
        }

        @l
        public final Builder S5(@l Fragment fragment0, int v) {
            L.p(fragment0, "startByFragment");
            this.c = null;
            this.d = fragment0;
            this.e = v;
            return this;
        }

        @l
        public final Builder S6(boolean z) {
            this.s9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final String T0() {
            return this.G;
        }

        @m
        public final String T1() {
            return this.B9;
        }

        @l
        public final Builder T2(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final void T3(@m Boolean boolean0) {
            this.X8 = boolean0;
        }

        public final void T4(@m Integer integer0) {
            this.J9 = integer0;
        }

        @l
        public final Builder T5(@ColorInt int v) {
            this.i = v;
            return this;
        }

        @l
        public final Builder T6(boolean z) {
            this.V9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Boolean U() {
            return this.ka;
        }

        @m
        public final String U0() {
            return this.J;
        }

        @m
        public final Boolean U1() {
            return this.z9;
        }

        public final void U2(@m Integer integer0) {
            this.l9 = integer0;
        }

        public final void U3(@m Boolean boolean0) {
            this.T8 = boolean0;
        }

        public final void U4(@m String s) {
            this.Y9 = s;
        }

        @l
        public final Builder U5(@ColorRes int v) {
            this.i = ContextCompat.getColor(this.a, v);
            return this;
        }

        @l
        public final Builder U6(@l String s) {
            L.p(s, "webViewFantasyFontFamily");
            this.G9 = s;
            return this;
        }

        public final int V() {
            return this.f;
        }

        @m
        public final Float V0() {
            return this.I;
        }

        @m
        public final Boolean V1() {
            return this.p9;
        }

        public final void V2(@m Integer integer0) {
            this.m9 = integer0;
        }

        public final void V3(@m Boolean boolean0) {
            this.Z8 = boolean0;
        }

        public final void V4(@m Boolean boolean0) {
            this.s9 = boolean0;
        }

        @l
        public final Builder V5(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder V6(@l String s) {
            L.p(s, "webViewFixedFontFamily");
            this.C9 = s;
            return this;
        }

        @l
        public final List W() {
            return this.b;
        }

        @m
        public final Integer W0() {
            return this.k;
        }

        @m
        public final Integer W1() {
            return this.x9;
        }

        public final void W2(@m Integer integer0) {
            this.j9 = integer0;
        }

        public final void W3(@m Boolean boolean0) {
            this.R8 = boolean0;
        }

        public final void W4(@m Boolean boolean0) {
            this.V9 = boolean0;
        }

        @l
        public final Builder W5(@StringRes int v) {
            this.o9 = v;
            return this;
        }

        @l
        public final Builder W6(@l String s) {
            L.p(s, "webViewGeolocationDatabasePath");
            this.R9 = s;
            return this;
        }

        @m
        public final Integer X() {
            return this.P;
        }

        @m
        public final Boolean X0() {
            return this.l;
        }

        @m
        public final Boolean X1() {
            return this.y9;
        }

        public final void X2(@m Integer integer0) {
            this.k9 = integer0;
        }

        public final void X3(@m Boolean boolean0) {
            this.b9 = boolean0;
        }

        public final void X4(@m String s) {
            this.G9 = s;
        }

        @l
        public final Builder X5(@StringRes int v) {
            this.Y8 = v;
            return this;
        }

        @l
        public final Builder X6(boolean z) {
            this.W9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Integer Y() {
            return this.Q;
        }

        @m
        public final Boolean Y0() {
            return this.H;
        }

        @m
        public final Boolean Y1() {
            return this.aa;
        }

        public final void Y2(@m Boolean boolean0) {
            this.n9 = boolean0;
        }

        public final void Y3(@m Boolean boolean0) {
            this.V8 = boolean0;
        }

        public final void Y4(@m String s) {
            this.C9 = s;
        }

        @l
        public final Builder Y5(@StringRes int v) {
            this.h9 = v;
            return this;
        }

        @l
        public final Builder Y6(boolean z) {
            this.X9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Float Z() {
            return this.X;
        }

        @m
        public final String Z0() {
            return this.oa;
        }

        @m
        public final String Z1() {
            return this.Z9;
        }

        @l
        public final Builder Z2(@AnimRes int v, @AnimRes int v1, @AnimRes int v2, @AnimRes int v3) {
            this.j9 = v;
            this.k9 = v1;
            this.l9 = v2;
            this.m9 = v3;
            return this;
        }

        public final void Z3(@m Boolean boolean0) {
            this.C = boolean0;
        }

        public final void Z4(@m String s) {
            this.R9 = s;
        }

        @l
        public final Builder Z5(@StringRes int v) {
            this.U8 = v;
            return this;
        }

        @l
        public final Builder Z6(boolean z) {
            this.O9 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder a(@l CustomMenu customMenu0) {
            L.p(customMenu0, "customMenu");
            if(this.i9 == null) {
                this.i9 = new ArrayList(1);
            }
            List list0 = this.i9;
            L.m(list0);
            list0.add(customMenu0);
            return this;
        }

        @m
        public final Integer a0() {
            return this.Y;
        }

        @l
        public final Builder a2(boolean z) {
            this.z = Boolean.valueOf(z);
            return this;
        }

        public final void a3(@m List list0) {
            this.i9 = list0;
        }

        public final void a4(@m Boolean boolean0) {
            this.d9 = boolean0;
        }

        public final void a5(@m Boolean boolean0) {
            this.W9 = boolean0;
        }

        @l
        public final Builder a6(@StringRes int v) {
            this.a9 = v;
            return this;
        }

        @l
        public final Builder a7(@l WebSettings.LayoutAlgorithm webSettings$LayoutAlgorithm0) {
            L.p(webSettings$LayoutAlgorithm0, "webViewLayoutAlgorithm");
            this.A9 = webSettings$LayoutAlgorithm0;
            return this;
        }

        @m
        public final Integer b0() {
            return this.N8;
        }

        @m
        public final Integer b1() {
            return this.O;
        }

        @l
        public final Builder b2(boolean z) {
            this.qa = Boolean.valueOf(z);
            return this;
        }

        public final void b3(@m String s) {
            this.na = s;
        }

        public final void b4(@m Boolean boolean0) {
            this.L = boolean0;
        }

        public final void b5(@m Boolean boolean0) {
            this.X9 = boolean0;
        }

        @l
        public final Builder b6(@StringRes int v) {
            this.f9 = v;
            return this;
        }

        @l
        public final Builder b7(boolean z) {
            this.v9 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder c(@l com.dcinside.app.browser.listeners.b b0) {
            L.p(b0, "listener");
            this.b.add(b0);
            return this;
        }

        @m
        public final String c0() {
            return this.M8;
        }

        @m
        public final String c1() {
            return this.N;
        }

        @l
        public final Builder c2(@ColorInt int v) {
            this.m = v;
            return this;
        }

        public final void c3(@m Boolean boolean0) {
            this.t = boolean0;
        }

        public final void c4(@m Activity activity0) {
            this.c = activity0;
        }

        public final void c5(@m Boolean boolean0) {
            this.O9 = boolean0;
        }

        @l
        public final Builder c6(@StringRes int v) {
            this.e9 = v;
            return this;
        }

        @l
        public final Builder c7(boolean z) {
            this.L9 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder d(boolean z) {
            this.n9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Integer d0() {
            return this.O8;
        }

        @m
        public final Float d1() {
            return this.M;
        }

        @l
        public final Builder d2(@ColorRes int v) {
            this.m = ContextCompat.getColor(this.a, v);
            return this;
        }

        public final void d3(@m Boolean boolean0) {
            this.r = boolean0;
        }

        public final void d4(@m Fragment fragment0) {
            this.d = fragment0;
        }

        public final void d5(@m WebSettings.LayoutAlgorithm webSettings$LayoutAlgorithm0) {
            this.A9 = webSettings$LayoutAlgorithm0;
        }

        @l
        public final Builder d6(@StringRes int v) {
            this.S8 = v;
            return this;
        }

        @l
        public final Builder d7(boolean z) {
            this.q9 = Boolean.valueOf(z);
            return this;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Builder e(@l List list0) {
            L.p(list0, "customMenus");
            this.i9 = list0;
            return this;
        }

        @m
        public final Float e0() {
            return this.P8;
        }

        @m
        public final Boolean e1() {
            return this.u9;
        }

        @l
        public final Builder e2(@ColorInt int v) {
            this.n = v;
            return this;
        }

        public final void e4(@m Integer integer0) {
            this.i = integer0;
        }

        @l
        public final Builder e5(@l com.dcinside.app.browser.listeners.b b0) {
            L.p(b0, "listener");
            this.b.clear();
            this.b.add(b0);
            return this;
        }

        @l
        public final Builder e6(@StringRes int v) {
            this.c9 = v;
            return this;
        }

        @l
        public final Builder e7(int v) {
            this.H9 = v;
            return this;
        }

        @l
        public final Builder f(boolean z) {
            this.t = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Float f0() {
            return this.Q8;
        }

        @m
        public final Boolean f1() {
            return this.t9;
        }

        @l
        public final Builder f2(@ColorRes int v) {
            this.n = ContextCompat.getColor(this.a, v);
            return this;
        }

        public final void f3(@m Boolean boolean0) {
            this.v = boolean0;
        }

        public final void f4(@m Boolean boolean0) {
            this.j = boolean0;
        }

        public final void f5(@m Boolean boolean0) {
            this.v9 = boolean0;
        }

        @l
        public final Builder f6(@StringRes int v) {
            this.W8 = v;
            return this;
        }

        @l
        public final Builder f7(int v) {
            this.I9 = v;
            return this;
        }

        @l
        public final Builder g(boolean z) {
            this.r = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Float g0() {
            return this.Z;
        }

        @m
        public final Boolean g1() {
            return this.Q9;
        }

        @l
        public final Builder g2(@ColorInt int v) {
            this.o = v;
            return this;
        }

        public final void g3(@m Boolean boolean0) {
            this.x = boolean0;
        }

        public final void g4(@m Integer integer0) {
            this.o9 = integer0;
        }

        public final void g5(@m Boolean boolean0) {
            this.L9 = boolean0;
        }

        @l
        public final Builder g6(@StyleRes int v) {
            this.h = v;
            return this;
        }

        @l
        public final Builder g7(int v) {
            this.da = v;
            return this;
        }

        @l
        public final Builder h(boolean z) {
            this.v = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder h2(@ColorRes int v) {
            this.o = ContextCompat.getColor(this.a, v);
            return this;
        }

        public final void h3(@m Integer integer0) {
            this.A = integer0;
        }

        public final void h4(@m Integer integer0) {
            this.Y8 = integer0;
        }

        public final void h5(@m Boolean boolean0) {
            this.q9 = boolean0;
        }

        @l
        public final Builder h6(@ColorInt int v) {
            this.K = v;
            return this;
        }

        @l
        public final Builder h7(boolean z) {
            this.ba = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder i(boolean z) {
            this.x = Boolean.valueOf(z);
            return this;
        }

        @m
        public final String i0() {
            return this.la;
        }

        @m
        public final Boolean i1() {
            return this.P9;
        }

        @l
        public final Builder i2(@DrawableRes int v) {
            this.p = v;
            return this;
        }

        public final void i3(@m Float float0) {
            this.B = float0;
        }

        public final void i4(@m Integer integer0) {
            this.h9 = integer0;
        }

        public final void i5(@m Integer integer0) {
            this.H9 = integer0;
        }

        @l
        public final Builder i6(@ColorRes int v) {
            this.K = ContextCompat.getColor(this.a, v);
            return this;
        }

        @l
        public final Builder i7(boolean z) {
            this.ea = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Integer j0() {
            return this.D;
        }

        @m
        public final Boolean j1() {
            return this.S9;
        }

        @l
        public final Builder j2(@l String s) {
            L.p(s, "injectJavaScript");
            this.ja = s;
            return this;
        }

        public final void j3(@m String s) {
            this.ma = s;
        }

        public final void j4(@m Integer integer0) {
            this.U8 = integer0;
        }

        public final void j5(@m Integer integer0) {
            this.I9 = integer0;
        }

        @l
        public final Builder j6(@l String s) {
            L.p(s, "title");
            this.G = s;
            return this;
        }

        @l
        public final Builder j7(@l String s) {
            L.p(s, "webViewSansSerifFontFamily");
            this.D9 = s;
            return this;
        }

        @m
        public final Float k0() {
            return this.E;
        }

        @m
        public final String k1() {
            return this.T9;
        }

        @l
        public final Builder k2(boolean z) {
            this.ka = Boolean.valueOf(z);
            return this;
        }

        public final void k3(@m Map map0) {
            this.pa = map0;
        }

        public final void k4(@m Integer integer0) {
            this.a9 = integer0;
        }

        public final void k5(@m Integer integer0) {
            this.da = integer0;
        }

        @l
        public final Builder k6(@StringRes int v) {
            this.G = this.a.getString(v);
            return this;
        }

        @l
        public final Builder k7(boolean z) {
            this.w9 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder l(@ColorInt int v) {
            this.A = v;
            return this;
        }

        @m
        public final X.a l0() {
            return this.F;
        }

        @m
        public final Boolean l1() {
            return this.fa;
        }

        public final void l2(@StringRes int v) {
            String s = this.a.getString(v);
            L.o(s, "getString(...)");
            Builder.p2(this, s, null, null, 6, null);
        }

        public final void l3(@m Boolean boolean0) {
            this.qa = boolean0;
        }

        public final void l4(@m Integer integer0) {
            this.f9 = integer0;
        }

        public final void l5(@m Boolean boolean0) {
            this.ba = boolean0;
        }

        @l
        public final Builder l6(@l String s) {
            L.p(s, "titleFont");
            this.J = s;
            return this;
        }

        @l
        public final Builder l7(@l String s) {
            L.p(s, "webViewSerifFontFamily");
            this.E9 = s;
            return this;
        }

        @l
        public final Builder m(@ColorRes int v) {
            this.A = ContextCompat.getColor(this.a, v);
            return this;
        }

        public final int m0() {
            return this.e;
        }

        @m
        public final Boolean m1() {
            return this.ia;
        }

        @j
        public final void m2(@l String s) {
            L.p(s, "data");
            Builder.p2(this, s, null, null, 6, null);
        }

        public final void m3(@m Boolean boolean0) {
            this.g9 = boolean0;
        }

        public final void m4(@m Integer integer0) {
            this.e9 = integer0;
        }

        public final void m5(@m Boolean boolean0) {
            this.ea = boolean0;
        }

        @l
        public final Builder m6(float f) {
            this.I = f;
            return this;
        }

        @l
        public final Builder m7(@l String s) {
            L.p(s, "webViewStandardFontFamily");
            this.B9 = s;
            return this;
        }

        @m
        public final Boolean n0() {
            return this.g;
        }

        @m
        public final Boolean n1() {
            return this.M9;
        }

        @j
        public final void n2(@l String s, @l String s1) {
            L.p(s, "data");
            L.p(s1, "mimeType");
            Builder.p2(this, s, s1, null, 4, null);
        }

        public final void n3(@m Boolean boolean0) {
            this.z = boolean0;
        }

        public final void n4(@m Integer integer0) {
            this.S8 = integer0;
        }

        public final void n5(@m String s) {
            this.D9 = s;
        }

        @l
        public final Builder n6(int v) {
            this.I = (float)v;
            return this;
        }

        @l
        public final Builder n7(boolean z) {
            this.z9 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder o(float f) {
            this.B = f;
            return this;
        }

        @m
        public final Boolean o0() {
            return this.y;
        }

        @m
        public final Boolean o1() {
            return this.N9;
        }

        @j
        public final void o2(@l String s, @l String s1, @l String s2) {
            L.p(s, "data");
            L.p(s1, "mimeType");
            L.p(s2, "encoding");
            this.la = s1;
            this.ma = s2;
            Builder.B5(this, null, s, null, null, null, 28, null);
        }

        @l
        public final Builder o3(@l Map map0) {
            L.p(map0, "extraHeaders");
            this.pa = map0;
            return this;
        }

        public final void o4(@m Integer integer0) {
            this.c9 = integer0;
        }

        public final void o5(@m Boolean boolean0) {
            this.w9 = boolean0;
        }

        @l
        public final Builder o6(@DimenRes int v) {
            this.I = this.a.getResources().getDimension(v);
            return this;
        }

        @l
        public final Builder o7(boolean z) {
            this.p9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Boolean p0() {
            return this.s;
        }

        @m
        public final Boolean p1() {
            return this.r9;
        }

        public static void p2(Builder awesomeWebView$Builder0, String s, String s1, String s2, int v, Object object0) {
            if((v & 2) != 0) {
                s1 = "text/html";
            }
            if((v & 4) != 0) {
                s2 = "UTF-8";
            }
            awesomeWebView$Builder0.o2(s, s1, s2);
        }

        public final void p3(@m Integer integer0) {
            this.m = integer0;
        }

        public final void p4(@m Integer integer0) {
            this.W8 = integer0;
        }

        public final void p5(@m String s) {
            this.E9 = s;
        }

        @l
        public final Builder p6(@ColorInt int v) {
            this.k = v;
            return this;
        }

        @l
        public final Builder p7(int v) {
            this.x9 = v;
            return this;
        }

        @l
        public final Builder q(int v) {
            this.B = (float)v;
            return this;
        }

        @m
        public final Boolean q0() {
            return this.q;
        }

        @m
        public final Integer q1() {
            return this.ca;
        }

        @l
        public final Builder q2(@ColorInt int v) {
            this.P = v;
            return this;
        }

        public final void q3(@m Integer integer0) {
            this.n = integer0;
        }

        public final void q4(@m Integer integer0) {
            this.h = integer0;
        }

        public final void q5(@m String s) {
            this.B9 = s;
        }

        @l
        public final Builder q6(@ColorRes int v) {
            this.k = ContextCompat.getColor(this.a, v);
            return this;
        }

        @l
        public final Builder q7(boolean z) {
            this.y9 = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder r(@DimenRes int v) {
            this.B = this.a.getResources().getDimension(v);
            return this;
        }

        @m
        public final Boolean r0() {
            return this.u;
        }

        @m
        public final Boolean r1() {
            return this.ha;
        }

        @l
        public final Builder r2(@ColorRes int v) {
            this.P = ContextCompat.getColor(this.a, v);
            return this;
        }

        public final void r4(@m Integer integer0) {
            this.K = integer0;
        }

        public final void r5(@m Boolean boolean0) {
            this.z9 = boolean0;
        }

        @l
        public final Builder r6(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder r7(boolean z) {
            this.aa = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder s(boolean z) {
            this.g9 = Boolean.valueOf(z);
            return this;
        }

        @m
        public final Boolean s0() {
            return this.w;
        }

        @m
        public final Boolean s1() {
            return this.ga;
        }

        @l
        public final Builder s2(@ColorInt int v) {
            this.Q = v;
            return this;
        }

        public final void s3(@m Integer integer0) {
            this.o = integer0;
        }

        public final void s4(@m String s) {
            this.G = s;
        }

        public final void s5(@m Boolean boolean0) {
            this.p9 = boolean0;
        }

        @l
        public final Builder s6(boolean z) {
            this.H = Boolean.valueOf(z);
            return this;
        }

        @l
        public final Builder s7(@l String s) {
            L.p(s, "webViewUserAgentString");
            this.Z9 = s;
            return this;
        }

        @m
        public final Integer t() {
            return this.l9;
        }

        @m
        public final Boolean t0() {
            return this.X8;
        }

        @m
        public final String t1() {
            return this.F9;
        }

        @l
        public final Builder t2(@ColorRes int v) {
            this.Q = ContextCompat.getColor(this.a, v);
            return this;
        }

        public final void t3(@m Integer integer0) {
            this.p = integer0;
        }

        public final void t4(@m String s) {
            this.J = s;
        }

        public final void t5(@m Integer integer0) {
            this.x9 = integer0;
        }

        @l
        public final Builder t6(@ColorInt int v) {
            this.O = v;
            return this;
        }

        @m
        public final Integer u() {
            return this.m9;
        }

        @m
        public final Boolean u0() {
            return this.T8;
        }

        @m
        public final Boolean u1() {
            return this.U9;
        }

        @l
        public final Builder u2(float f) {
            this.X = f;
            return this;
        }

        public final void u3(@m String s) {
            this.ja = s;
        }

        public final void u4(@m Float float0) {
            this.I = float0;
        }

        public final void u5(@m Boolean boolean0) {
            this.y9 = boolean0;
        }

        @l
        public final Builder u6(@ColorRes int v) {
            this.O = ContextCompat.getColor(this.a, v);
            return this;
        }

        @m
        public final Integer v() {
            return this.j9;
        }

        @m
        public final Boolean v0() {
            return this.Z8;
        }

        @m
        public final Integer v1() {
            return this.K9;
        }

        @l
        public final Builder v2(int v) {
            this.X = (float)v;
            return this;
        }

        public final void v3(@m Boolean boolean0) {
            this.ka = boolean0;
        }

        public final void v4(@m Integer integer0) {
            this.k = integer0;
        }

        public final void v5(@m Boolean boolean0) {
            this.aa = boolean0;
        }

        @l
        public final Builder v6(@l String s) {
            L.p(s, "urlFont");
            this.N = s;
            return this;
        }

        @m
        public final Integer w() {
            return this.k9;
        }

        @m
        public final Boolean w0() {
            return this.R8;
        }

        @m
        public final Integer w1() {
            return this.J9;
        }

        @l
        public final Builder w2(@DimenRes int v) {
            this.X = this.a.getResources().getDimension(v);
            return this;
        }

        public final void w3(int v) {
            this.f = v;
        }

        public final void w4(@m Boolean boolean0) {
            this.l = boolean0;
        }

        public final void w5(@m String s) {
            this.Z9 = s;
        }

        @l
        public final Builder w6(float f) {
            this.M = f;
            return this;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@l Parcel parcel0, int v) {
            L.p(parcel0, "dest");
            parcel0.writeInt(this.e);
            parcel0.writeInt(this.f);
            parcel0.writeValue(this.g);
            parcel0.writeValue(this.h);
            parcel0.writeValue(this.i);
            parcel0.writeValue(this.j);
            parcel0.writeValue(this.k);
            parcel0.writeValue(this.l);
            parcel0.writeValue(this.m);
            parcel0.writeValue(this.n);
            parcel0.writeValue(this.o);
            parcel0.writeValue(this.p);
            parcel0.writeValue(this.q);
            parcel0.writeValue(this.r);
            parcel0.writeValue(this.s);
            parcel0.writeValue(this.t);
            parcel0.writeValue(this.u);
            parcel0.writeValue(this.v);
            parcel0.writeValue(this.w);
            parcel0.writeValue(this.x);
            parcel0.writeValue(this.y);
            parcel0.writeValue(this.z);
            parcel0.writeValue(this.A);
            parcel0.writeValue(this.B);
            parcel0.writeValue(this.C);
            parcel0.writeValue(this.D);
            parcel0.writeValue(this.E);
            int v1 = -1;
            parcel0.writeInt((this.F == null ? -1 : this.F.ordinal()));
            parcel0.writeString(this.G);
            parcel0.writeValue(this.H);
            parcel0.writeValue(this.I);
            parcel0.writeString(this.J);
            parcel0.writeValue(this.K);
            parcel0.writeValue(this.L);
            parcel0.writeValue(this.M);
            parcel0.writeString(this.N);
            parcel0.writeValue(this.O);
            parcel0.writeValue(this.P);
            parcel0.writeValue(this.Q);
            parcel0.writeValue(this.X);
            parcel0.writeValue(this.Y);
            parcel0.writeValue(this.Z);
            parcel0.writeString(this.M8);
            parcel0.writeValue(this.N8);
            parcel0.writeValue(this.O8);
            parcel0.writeValue(this.P8);
            parcel0.writeValue(this.Q8);
            parcel0.writeValue(this.R8);
            parcel0.writeValue(this.S8);
            parcel0.writeValue(this.T8);
            parcel0.writeValue(this.U8);
            parcel0.writeValue(this.V8);
            parcel0.writeValue(this.W8);
            parcel0.writeValue(this.X8);
            parcel0.writeValue(this.Y8);
            parcel0.writeValue(this.Z8);
            parcel0.writeValue(this.a9);
            parcel0.writeValue(this.b9);
            parcel0.writeValue(this.c9);
            parcel0.writeValue(this.d9);
            parcel0.writeValue(this.e9);
            parcel0.writeValue(this.f9);
            parcel0.writeValue(this.g9);
            parcel0.writeValue(this.h9);
            parcel0.writeTypedList(this.i9);
            parcel0.writeValue(this.j9);
            parcel0.writeValue(this.k9);
            parcel0.writeValue(this.l9);
            parcel0.writeValue(this.m9);
            parcel0.writeValue(this.n9);
            parcel0.writeValue(this.o9);
            parcel0.writeValue(this.p9);
            parcel0.writeValue(this.q9);
            parcel0.writeValue(this.r9);
            parcel0.writeValue(this.s9);
            parcel0.writeValue(this.t9);
            parcel0.writeValue(this.u9);
            parcel0.writeValue(this.v9);
            parcel0.writeValue(this.w9);
            parcel0.writeValue(this.x9);
            parcel0.writeValue(this.y9);
            parcel0.writeValue(this.z9);
            WebSettings.LayoutAlgorithm webSettings$LayoutAlgorithm0 = this.A9;
            if(webSettings$LayoutAlgorithm0 != null) {
                v1 = webSettings$LayoutAlgorithm0.ordinal();
            }
            parcel0.writeInt(v1);
            parcel0.writeString(this.B9);
            parcel0.writeString(this.C9);
            parcel0.writeString(this.D9);
            parcel0.writeString(this.E9);
            parcel0.writeString(this.F9);
            parcel0.writeString(this.G9);
            parcel0.writeValue(this.H9);
            parcel0.writeValue(this.I9);
            parcel0.writeValue(this.J9);
            parcel0.writeValue(this.K9);
            parcel0.writeValue(this.L9);
            parcel0.writeValue(this.M9);
            parcel0.writeValue(this.N9);
            parcel0.writeValue(this.O9);
            parcel0.writeValue(this.P9);
            parcel0.writeValue(this.Q9);
            parcel0.writeString(this.R9);
            parcel0.writeValue(this.S9);
            parcel0.writeString(this.T9);
            parcel0.writeValue(this.U9);
            parcel0.writeValue(this.V9);
            parcel0.writeValue(this.W9);
            parcel0.writeValue(this.X9);
            parcel0.writeString(this.Y9);
            parcel0.writeString(this.Z9);
            parcel0.writeValue(this.aa);
            parcel0.writeValue(this.ba);
            parcel0.writeValue(this.ca);
            parcel0.writeValue(this.da);
            parcel0.writeValue(this.ea);
            parcel0.writeValue(this.fa);
            parcel0.writeValue(this.ga);
            parcel0.writeValue(this.ha);
            parcel0.writeValue(this.ia);
            parcel0.writeString(this.ja);
            parcel0.writeValue(this.ka);
            parcel0.writeString(this.la);
            parcel0.writeString(this.ma);
            parcel0.writeString(this.na);
            parcel0.writeString(this.oa);
            Set set0 = this.pa == null ? null : this.pa.entrySet();
            parcel0.writeInt((set0 == null ? 0 : set0.size()));
            if(set0 != null) {
                for(Object object0: set0) {
                    parcel0.writeString(((String)((Map.Entry)object0).getKey()));
                    parcel0.writeString(((String)((Map.Entry)object0).getValue()));
                }
            }
            parcel0.writeValue(this.qa);
        }

        @m
        public final Boolean x() {
            return this.n9;
        }

        @m
        public final Boolean x0() {
            return this.b9;
        }

        @m
        public final String x1() {
            return this.Y9;
        }

        @l
        public final Builder x2(@DrawableRes int v) {
            this.Y = v;
            return this;
        }

        public final void x3(@l List list0) {
            L.p(list0, "<set-?>");
            this.b = list0;
        }

        public final void x4(@m Boolean boolean0) {
            this.H = boolean0;
        }

        public final void x5(@StringRes int v) {
            String s = this.a.getString(v);
            L.o(s, "getString(...)");
            this.y5(s);
        }

        @l
        public final Builder x6(int v) {
            this.M = (float)v;
            return this;
        }

        @l
        public final Context y() {
            return this.a;
        }

        @m
        public final Boolean y0() {
            return this.V8;
        }

        @m
        public final Boolean y1() {
            return this.s9;
        }

        @l
        public final Builder y2(@ColorInt int v) {
            this.N8 = v;
            return this;
        }

        public final void y3(@m Integer integer0) {
            this.P = integer0;
        }

        public final void y4(@m String s) {
            this.oa = s;
        }

        public final void y5(@l String s) {
            L.p(s, "url");
            Builder.B5(this, s, null, null, null, null, 28, null);
        }

        @l
        public final Builder y6(@DimenRes int v) {
            this.M = this.a.getResources().getDimension(v);
            return this;
        }

        @m
        public final List z() {
            return this.i9;
        }

        @m
        public final Boolean z0() {
            return this.C;
        }

        @m
        public final Boolean z1() {
            return this.V9;
        }

        @l
        public final Builder z2(@ColorRes int v) {
            this.N8 = ContextCompat.getColor(this.a, v);
            return this;
        }

        public final void z3(@m Integer integer0) {
            this.Q = integer0;
        }

        public final void z4(@m Integer integer0) {
            this.O = integer0;
        }

        public final void z5(@l String s, @l String s1) {
            L.p(s, "url");
            L.p(s1, "postArgs");
            Builder.B5(this, s, null, "actionLoadUrlPost", s1, null, 16, null);
        }

        @l
        public final Builder z6(boolean z) {
            this.u9 = Boolean.valueOf(z);
            return this;
        }
    }

    @l
    public static final AwesomeWebView a;

    static {
        AwesomeWebView.a = new AwesomeWebView();
    }
}

