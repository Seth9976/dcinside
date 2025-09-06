package com.dcinside.app.write;

import android.util.SparseArray;
import androidx.compose.foundation.c;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class g {
    @l
    private final List a;
    @l
    private final List b;
    @l
    private final SparseArray c;
    private final boolean d;
    private final int e;
    private final int f;
    @m
    private final String g;
    @l
    private final List h;
    @l
    private final List i;

    public g(@l List list0, @l List list1, @l SparseArray sparseArray0, boolean z, int v, int v1, @m String s, @l List list2, @l List list3) {
        L.p(list0, "memos");
        L.p(list1, "files");
        L.p(sparseArray0, "detailIndexes");
        L.p(list2, "videos");
        L.p(list3, "aiImages");
        super();
        this.a = list0;
        this.b = list1;
        this.c = sparseArray0;
        this.d = z;
        this.e = v;
        this.f = v1;
        this.g = s;
        this.h = list2;
        this.i = list3;
    }

    @l
    public final List a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.b;
    }

    @l
    public final SparseArray c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        if(!L.g(this.a, ((g)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((g)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((g)object0).c)) {
            return false;
        }
        if(this.d != ((g)object0).d) {
            return false;
        }
        if(this.e != ((g)object0).e) {
            return false;
        }
        if(this.f != ((g)object0).f) {
            return false;
        }
        if(!L.g(this.g, ((g)object0).g)) {
            return false;
        }
        return L.g(this.h, ((g)object0).h) ? L.g(this.i, ((g)object0).i) : false;
    }

    public final int f() {
        return this.f;
    }

    @m
    public final String g() {
        return this.g;
    }

    @l
    public final List h() {
        return this.h;
    }

    @Override
    public int hashCode() {
        int v = (((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + c.a(this.d)) * 0x1F + this.e) * 0x1F + this.f) * 0x1F;
        return this.g == null ? (v * 0x1F + this.h.hashCode()) * 0x1F + this.i.hashCode() : ((v + this.g.hashCode()) * 0x1F + this.h.hashCode()) * 0x1F + this.i.hashCode();
    }

    @l
    public final List i() {
        return this.i;
    }

    @l
    public final g j(@l List list0, @l List list1, @l SparseArray sparseArray0, boolean z, int v, int v1, @m String s, @l List list2, @l List list3) {
        L.p(list0, "memos");
        L.p(list1, "files");
        L.p(sparseArray0, "detailIndexes");
        L.p(list2, "videos");
        L.p(list3, "aiImages");
        return new g(list0, list1, sparseArray0, z, v, v1, s, list2, list3);
    }

    public static g k(g g0, List list0, List list1, SparseArray sparseArray0, boolean z, int v, int v1, String s, List list2, List list3, int v2, Object object0) {
        List list4 = (v2 & 1) == 0 ? list0 : g0.a;
        List list5 = (v2 & 2) == 0 ? list1 : g0.b;
        SparseArray sparseArray1 = (v2 & 4) == 0 ? sparseArray0 : g0.c;
        boolean z1 = (v2 & 8) == 0 ? z : g0.d;
        int v3 = (v2 & 16) == 0 ? v : g0.e;
        int v4 = (v2 & 0x20) == 0 ? v1 : g0.f;
        String s1 = (v2 & 0x40) == 0 ? s : g0.g;
        List list6 = (v2 & 0x80) == 0 ? list2 : g0.h;
        return (v2 & 0x100) == 0 ? g0.j(list4, list5, sparseArray1, z1, v3, v4, s1, list6, list3) : g0.j(list4, list5, sparseArray1, z1, v3, v4, s1, list6, g0.i);
    }

    @l
    public final List l() {
        return this.i;
    }

    public final int m() {
        return this.f;
    }

    @l
    public final SparseArray n() {
        return this.c;
    }

    public final boolean o() {
        return this.d;
    }

    @l
    public final List p() {
        return this.b;
    }

    @l
    public final List q() {
        return this.a;
    }

    @m
    public final String r() {
        return this.g;
    }

    public final int s() {
        return this.e;
    }

    @l
    public final List t() {
        return this.h;
    }

    @Override
    @l
    public String toString() {
        return "MemoData(memos=" + this.a + ", files=" + this.b + ", detailIndexes=" + this.c + ", existsYoutube=" + this.d + ", textLength=" + this.e + ", bodyCount=" + this.f + ", pollCode=" + this.g + ", videos=" + this.h + ", aiImages=" + this.i + ")";
    }
}

