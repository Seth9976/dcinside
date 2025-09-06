package com.dcinside.app.internal;

import A3.a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.Base64;
import android.view.ViewParent;
import androidx.annotation.ColorInt;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.Dl;
import io.realm.F0;
import io.realm.d1;
import java.util.Arrays;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.f;
import y4.l;
import y4.m;

@s0({"SMAP\nDcInternals.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n129#1,15:222\n129#1,15:237\n129#1,15:252\n129#1,15:267\n129#1,15:282\n155#1:297\n129#1,15:298\n181#1,5:313\n1#2:221\n*S KotlinDebug\n*F\n+ 1 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n114#1:222,15\n116#1:237,15\n114#1:252,15\n116#1:267,15\n155#1:282,15\n163#1:297\n163#1:298,15\n177#1:313,5\n*E\n"})
public final class c {
    public static final void A(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "<this>");
        ViewParent viewParent0 = recyclerView$ViewHolder0.itemView.getParent();
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        if(!recyclerView0.isLayoutSuppressed()) {
            recyclerView0.stopScroll();
        }
    }

    public static final Object B(F0 f00, Function1 function10) {
        L.p(f00, "<this>");
        L.p(function10, "transaction");
        if(f00.E0()) {
            return function10.invoke(f00);
        }
        f00.beginTransaction();
        try {
            Object object0 = function10.invoke(f00);
            f00.p();
            return object0;
        }
        catch(Throwable throwable0) {
            if(f00.E0()) {
                f00.e();
            }
            throw throwable0;
        }
    }

    public static final Object C(d1 d10, Function1 function10) {
        L.p(d10, "<this>");
        L.p(function10, "transaction");
        F0 f00 = d10.D5();
        L.o(f00, "getRealm(...)");
        if(f00.E0()) {
            return function10.invoke(f00);
        }
        f00.beginTransaction();
        try {
            Object object0 = function10.invoke(f00);
            f00.p();
            return object0;
        }
        catch(Throwable throwable0) {
            if(f00.E0()) {
                f00.e();
            }
            throw throwable0;
        }
    }

    public static final Object D(a a0) {
        L.p(a0, "tryIt");
        try {
            return a0.invoke();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static final Object E(a a0, Function1 function10) {
        L.p(a0, "tryIt");
        L.p(function10, "error");
        try {
            return a0.invoke();
        }
        catch(Exception exception0) {
            return function10.invoke(exception0);
        }
    }

    @l
    public static final String b(@m String s) throws Exception {
        if(s == null) {
            s = "";
        }
        byte[] arr_b = s.getBytes(f.b);
        L.o(arr_b, "getBytes(...)");
        byte[] arr_b1 = Base64.decode(arr_b, 2);
        L.o(arr_b1, "decode(...)");
        return new String(arr_b1, f.b);
    }

    @m
    public static final String c(@m String s) throws Exception [...] // 潜在的解密器

    public static final void d(d1 d10) {
        L.p(d10, "<this>");
        F0 f00 = d10.D5();
        L.o(f00, "getRealm(...)");
        if(f00.E0()) {
            d10.z5();
            return;
        }
        f00.beginTransaction();
        try {
            d10.z5();
            f00.p();
        }
        catch(Throwable throwable0) {
            if(f00.E0()) {
                f00.e();
            }
            throw throwable0;
        }
    }

    public static final DialogFragment e(AppCompatActivity appCompatActivity0) {
        L.p(appCompatActivity0, "<this>");
        FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
        L.y(4, "T");
        Fragment fragment0 = fragmentManager0.s0("androidx.fragment.app.DialogFragment");
        L.y(2, "T");
        return (DialogFragment)fragment0;
    }

    public static final DialogFragment f(Fragment fragment0) {
        L.p(fragment0, "<this>");
        FragmentManager fragmentManager0 = fragment0.getChildFragmentManager();
        L.y(4, "T");
        Fragment fragment1 = fragmentManager0.s0("androidx.fragment.app.DialogFragment");
        L.y(2, "T");
        return (DialogFragment)fragment1;
    }

    @l
    public static final String g(@ColorInt int v) {
        String s = "#" + c.m(Color.alpha(v)) + c.m(Color.red(v)) + c.m(Color.green(v)) + c.m(Color.blue(v));
        L.o(s, "toString(...)");
        return s;
    }

    public static void h(int v) {
    }

    @l
    public static final String i(@ColorInt int v) {
        String s = "#" + c.m(Color.red(v)) + c.m(Color.green(v)) + c.m(Color.blue(v));
        L.o(s, "toString(...)");
        return s;
    }

    public static void j(int v) {
    }

    @l
    public static final String k(@ColorInt int v) {
        String s = "#" + c.m(Color.red(v)) + c.m(Color.green(v)) + c.m(Color.blue(v)) + c.m(Color.alpha(v));
        L.o(s, "toString(...)");
        return s;
    }

    public static void l(int v) {
    }

    private static final String m(int v) {
        String s = String.format("%02X", Arrays.copyOf(new Object[]{((int)(v & 0xFF))}, 1));
        L.o(s, "format(...)");
        return s;
    }

    public static final boolean n(@l Activity activity0) {
        L.p(activity0, "<this>");
        return !c.o(activity0);
    }

    public static final boolean o(@l Activity activity0) {
        L.p(activity0, "<this>");
        return activity0.isFinishing() || activity0.isDestroyed();
    }

    @m
    public static final i p(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "<this>");
        Integer integer0 = recyclerView$ViewHolder0.getAdapterPosition();
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            ViewParent viewParent0 = recyclerView$ViewHolder0.itemView.getParent();
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return null;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(!(recyclerView$Adapter0 instanceof Adapter)) {
                recyclerView$Adapter0 = null;
            }
            if(recyclerView$Adapter0 == null) {
                return null;
            }
            Context context0 = Dl.b(recyclerView0);
            AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
            return appCompatActivity0 == null ? null : new i(appCompatActivity0, recyclerView0, recyclerView$Adapter0, v);
        }
        return null;
    }

    @m
    public static final i q(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "<this>");
        Integer integer0 = recyclerView$ViewHolder0.getAdapterPosition();
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            ViewParent viewParent0 = recyclerView$ViewHolder0.itemView.getParent();
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return null;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(!(recyclerView$Adapter0 instanceof Adapter)) {
                recyclerView$Adapter0 = null;
            }
            if(recyclerView$Adapter0 == null) {
                return null;
            }
            Context context0 = Dl.b(recyclerView0);
            AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
            return appCompatActivity0 == null ? null : new i(appCompatActivity0, recyclerView0, recyclerView$Adapter0, v);
        }
        return null;
    }

    public static final Object r(F0 f00, Function1 function10) {
        Object object0;
        L.p(function10, "realmUse");
        if(f00 != null && !f00.isClosed()) {
            return function10.invoke(f00);
        }
        F0 f01 = F0.g4();
        try {
            L.m(f01);
            object0 = function10.invoke(f01);
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(f01, throwable0);
            throw throwable0;
        }
        kotlin.io.c.a(f01, null);
        return object0;
    }

    public static Object s(F0 f00, Function1 function10, int v, Object object0) {
        Object object1;
        if((v & 1) != 0) {
            f00 = null;
        }
        L.p(function10, "realmUse");
        if(f00 != null && !f00.isClosed()) {
            return function10.invoke(f00);
        }
        F0 f01 = F0.g4();
        try {
            L.m(f01);
            object1 = function10.invoke(f01);
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(f01, throwable0);
            throw throwable0;
        }
        kotlin.io.c.a(f01, null);
        return object1;
    }

    public static final Object t(F0 f00, Function1 function10) {
        Object object0;
        L.p(function10, "transaction");
        if(f00 != null && !f00.isClosed()) {
            if(f00.E0()) {
                return function10.invoke(f00);
            }
            f00.beginTransaction();
            try {
                object0 = function10.invoke(f00);
                f00.p();
                return object0;
            }
            catch(Throwable throwable0) {
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable0;
            }
        }
        F0 f01 = F0.g4();
        L.m(f01);
        if(f01.E0()) {
            object0 = function10.invoke(f01);
        }
        else {
            f01.beginTransaction();
            goto label_18;
        }
        goto label_30;
        try {
        label_18:
            object0 = function10.invoke(f01);
            f01.p();
            goto label_30;
        }
        catch(Throwable throwable2) {
            try {
                if(f01.E0()) {
                    f01.e();
                }
                throw throwable2;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable3) {
            kotlin.io.c.a(f01, throwable1);
            throw throwable3;
        }
    label_30:
        kotlin.io.c.a(f01, null);
        return object0;
    }

    public static Object u(F0 f00, Function1 function10, int v, Object object0) {
        Object object1;
        if((v & 1) != 0) {
            f00 = null;
        }
        L.p(function10, "transaction");
        if(f00 != null && !f00.isClosed()) {
            if(f00.E0()) {
                return function10.invoke(f00);
            }
            f00.beginTransaction();
            try {
                object1 = function10.invoke(f00);
                f00.p();
                return object1;
            }
            catch(Throwable throwable0) {
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable0;
            }
        }
        F0 f01 = F0.g4();
        L.m(f01);
        if(f01.E0()) {
            object1 = function10.invoke(f01);
        }
        else {
            f01.beginTransaction();
            goto label_20;
        }
        goto label_32;
        try {
        label_20:
            object1 = function10.invoke(f01);
            f01.p();
            goto label_32;
        }
        catch(Throwable throwable2) {
            try {
                if(f01.E0()) {
                    f01.e();
                }
                throw throwable2;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable3) {
            kotlin.io.c.a(f01, throwable1);
            throw throwable3;
        }
    label_32:
        kotlin.io.c.a(f01, null);
        return object1;
    }

    public static final void v(@l AppCompatActivity appCompatActivity0, @StringRes int v) {
        L.p(appCompatActivity0, "<this>");
        String s = appCompatActivity0.getString(v);
        L.o(s, "getString(...)");
        c.w(appCompatActivity0, s);
    }

    public static final void w(@l AppCompatActivity appCompatActivity0, @l String s) {
        static final class com.dcinside.app.internal.c.a extends N implements Function1 {
            final String e;

            com.dcinside.app.internal.c.a(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            public final Boolean a(Throwable throwable0) {
                return false;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        L.p(appCompatActivity0, "<this>");
        L.p(s, "message");
        e.e.a(appCompatActivity0).n(new com.dcinside.app.internal.c.a(s)).z(0x104000A).b().a4((Object object0) -> {
            L.p(b.e, "$tmp0");
            return (Boolean)b.e.invoke(object0);
        }).t5();
    }

    // 检测为 Lambda 实现
    private static final Boolean x(Function1 function10, Object object0) [...]

    public static final DialogFragment y(AppCompatActivity appCompatActivity0, V[] arr_v) {
        L.p(appCompatActivity0, "<this>");
        L.p(arr_v, "args");
        L.y(4, "T");
        FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = DialogFragment.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "androidx.fragment.app.DialogFragment");
        L.y(1, "T");
        ((DialogFragment)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, arr_v.length))));
        ((DialogFragment)fragment0).show(fragmentManager0, "androidx.fragment.app.DialogFragment");
        return (DialogFragment)fragment0;
    }

    public static final DialogFragment z(Fragment fragment0, V[] arr_v) {
        L.p(fragment0, "<this>");
        L.p(arr_v, "args");
        L.y(4, "T");
        FragmentManager fragmentManager0 = fragment0.getChildFragmentManager();
        L.o(fragmentManager0, "getChildFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = DialogFragment.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment1 = fragmentFactory0.a(classLoader0, "androidx.fragment.app.DialogFragment");
        L.y(1, "T");
        ((DialogFragment)fragment1).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, arr_v.length))));
        ((DialogFragment)fragment1).show(fragmentManager0, "androidx.fragment.app.DialogFragment");
        return (DialogFragment)fragment1;
    }
}

