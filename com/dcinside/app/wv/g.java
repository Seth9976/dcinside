package com.dcinside.app.wv;

import android.content.Context;
import com.dcinside.app.internal.c;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.vk;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nWebViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViews.kt\ncom/dcinside/app/wv/ImageStyleOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1245:1\n1#2:1246\n*E\n"})
final class g {
    @l
    private final String a;
    @l
    private final String b;
    @m
    private final String c;
    @m
    private final String d;
    @l
    private final String e;
    @l
    private final String f;
    @l
    private final String g;
    private final boolean h;
    private final int i;
    private final boolean j;

    public g(@l Context context0) {
        L.p(context0, "context");
        super();
        String s = c.i(vk.b(context0, 0x7F04020E));  // attr:dcReadManagerColor
        this.a = s;
        String s1 = c.i(vk.b(context0, 0x7F0401FB));  // attr:dcManagerImageBlockBg
        this.b = s1;
        this.c = vk.g(context0, 0x7F040240);  // attr:displayWebIcName
        this.d = vk.g(context0, 0x7F04023F);  // attr:displayWebIcAllName
        Locale locale0 = Locale.ENGLISH;
        boolean z = true;
        String s2 = String.format(locale0, "display:inline-block; padding-left:10px; vertical-align: middle; color:%s;", Arrays.copyOf(new Object[]{s}, 1));
        L.o(s2, "format(...)");
        this.e = s2;
        String s3 = String.format(locale0, "margin-left: auto; margin-right:auto; vertical-align: middle; color:%s; border: 1px solid #EEEEEE; border-radius: 5px; width: 240px; height: 50px; line-height: 50px; text-align: center;", Arrays.copyOf(new Object[]{s}, 1));
        L.o(s3, "format(...)");
        this.f = s3;
        String s4 = String.format(locale0, "margin-left: auto; margin-right:auto; vertical-align: middle; color:%s; background-color: %s; border: 1px solid #EEEEEE; border-radius: 5px; width: 240px; height: 50px; line-height: 50px; text-align: center;", Arrays.copyOf(new Object[]{s, s1}, 2));
        L.o(s4, "format(...)");
        this.g = s4;
        boolean z1 = Al.a.t(context0);
        this.h = z1;
        int v = ll.a0();
        if(v != 0x7FFFFFFF && dl.a.v0() && !z1) {
            v = 0x7FFFFFFF;
        }
        this.i = v;
        long v1 = dl.a.k0();
        if(v1 != 0L && (v1 != 1L || !z1)) {
            z = false;
        }
        this.j = z;
    }

    @l
    public final String a() {
        return this.b;
    }

    @l
    public final String b() {
        return this.f;
    }

    public final boolean c() {
        return this.j;
    }

    public final int d() {
        return this.i;
    }

    @m
    public final String e() {
        return this.d;
    }

    @m
    public final String f() {
        return this.c;
    }

    @l
    public final String g() {
        return this.g;
    }

    @l
    public final String h() {
        return this.a;
    }

    @l
    public final String i() {
        return this.e;
    }

    public final boolean j() {
        return this.h;
    }
}

