package com.dcinside.app.rx.bus;

import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class m0 {
    @m
    private final String a;
    private final int b;
    @m
    private final String c;
    @m
    private final String d;
    @m
    private final ArrayList e;
    @m
    private final ArrayList f;
    private final boolean g;
    private final int h;
    @m
    private final ArrayList i;
    private final boolean j;
    @m
    private final Integer k;
    @l
    private final int[] l;

    public m0(@m String s, int v, @m String s1, @m String s2, @m ArrayList arrayList0, @m ArrayList arrayList1, boolean z, int v1, @m ArrayList arrayList2, boolean z1, @m Integer integer0, @l int[] arr_v) {
        L.p(arr_v, "selectedImgPositions");
        super();
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = s2;
        this.e = arrayList0;
        this.f = arrayList1;
        this.g = z;
        this.h = v1;
        this.i = arrayList2;
        this.j = z1;
        this.k = integer0;
        this.l = arr_v;
    }

    public m0(String s, int v, String s1, String s2, ArrayList arrayList0, ArrayList arrayList1, boolean z, int v1, ArrayList arrayList2, boolean z1, Integer integer0, int[] arr_v, int v2, w w0) {
        this(s, v, s1, s2, arrayList0, arrayList1, z, ((v2 & 0x80) == 0 ? v1 : 0), ((v2 & 0x100) == 0 ? arrayList2 : null), ((v2 & 0x200) == 0 ? z1 : false), ((v2 & 0x400) == 0 ? integer0 : null), ((v2 & 0x800) == 0 ? arr_v : new int[0]));
    }

    @m
    public final Integer a() {
        return this.k;
    }

    public final boolean b() {
        return this.j;
    }

    @m
    public final String c() {
        return this.a;
    }

    @m
    public final ArrayList d() {
        return this.i;
    }

    public final int e() {
        return this.h;
    }

    @m
    public final ArrayList f() {
        return this.f;
    }

    public final int g() {
        return this.b;
    }

    @m
    public final ArrayList h() {
        return this.e;
    }

    @l
    public final int[] i() {
        return this.l;
    }

    public final boolean j() {
        return this.g;
    }

    @m
    public final String k() {
        return this.c;
    }

    @m
    public final String l() {
        return this.d;
    }
}

