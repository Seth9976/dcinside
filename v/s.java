package V;

import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.m;

public final class s {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final boolean a(int v) {
            return v == 1 || v == 2 || v == 3;
        }

        public final boolean b(int v) {
            return v == 4;
        }
    }

    @c("appSettingList")
    @m
    private List a;
    @c("recentGalleryList")
    @m
    private List b;
    @c("pushAltConfig")
    @m
    private l c;
    @c("userMemoList")
    @m
    private List d;
    @c("userBlockList")
    @m
    private List e;
    @c("hateWordList")
    @m
    private List f;
    @c("archiveFolderList")
    @m
    private List g;
    @c("postArchiveList")
    @m
    private List h;
    @c("voiceArchiveList")
    @m
    private List i;
    @c("favoriteList")
    @m
    private List j;
    @c("userGalleryHeaderFooterList")
    @m
    private List k;
    @c("userBlockDcConList")
    @m
    private List l;
    @c("seriesList")
    @m
    private List m;
    @c("userTagDcConList")
    @m
    private List n;
    @c("version")
    private final int o;
    @c("unique")
    @y4.l
    private final String p;
    @y4.l
    public static final a q;

    static {
        s.q = new a(null);
    }

    public s(@m List list0, @m List list1, @m l l0, @m List list2, @m List list3, @m List list4, @m List list5, @m List list6, @m List list7, @m List list8, @m List list9, @m List list10, @m List list11, @m List list12, int v, @y4.l String s) {
        L.p(s, "unique");
        super();
        this.a = list0;
        this.b = list1;
        this.c = l0;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = list5;
        this.h = list6;
        this.i = list7;
        this.j = list8;
        this.k = list9;
        this.l = list10;
        this.m = list11;
        this.n = list12;
        this.o = v;
        this.p = s;
    }

    public final void A(@m l l0) {
        this.c = l0;
    }

    public final void B(@m List list0) {
        this.b = list0;
    }

    public final void C(@m List list0) {
        this.m = list0;
    }

    public final void D(@m List list0) {
        this.e = list0;
    }

    public final void E(@m List list0) {
        this.l = list0;
    }

    public final void F(@m List list0) {
        this.d = list0;
    }

    public final void G(@m List list0) {
        this.n = list0;
    }

    public final void H(@m List list0) {
        this.i = list0;
    }

    public final int a() {
        int v = 0;
        int v1 = this.h == null ? 0 : this.h.size();
        List list0 = this.i;
        if(list0 != null) {
            v = list0.size();
        }
        return v1 + v;
    }

    public final int b() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.size();
        int v2 = this.b == null ? 0 : this.b.size();
        int v3 = this.c == null ? 0 : 1;
        int v4 = this.d == null ? 0 : this.d.size();
        int v5 = this.e == null ? 0 : this.e.size();
        int v6 = this.f == null ? 0 : this.f.size();
        int v7 = this.g == null ? 0 : this.g.size();
        int v8 = this.h == null ? 0 : this.h.size();
        int v9 = this.i == null ? 0 : this.i.size();
        int v10 = this.j == null ? 0 : this.j.size();
        int v11 = this.k == null ? 0 : this.k.size();
        int v12 = this.l == null ? 0 : this.l.size();
        int v13 = this.m == null ? 0 : this.m.size();
        List list0 = this.n;
        if(list0 != null) {
            v = list0.size();
        }
        return v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10 + v11 + v12 + v13 + v;
    }

    @m
    public final List c() {
        return this.a;
    }

    @m
    public final List d() {
        return this.g;
    }

    @m
    public final List e() {
        return this.j;
    }

    @m
    public final List f() {
        return this.k;
    }

    @m
    public final List g() {
        return this.f;
    }

    @m
    public final List h() {
        return this.h;
    }

    @m
    public final l i() {
        return this.c;
    }

    @m
    public final List j() {
        return this.b;
    }

    @m
    public final List k() {
        return this.m;
    }

    @y4.l
    public final String l() {
        return this.p;
    }

    @m
    public final List m() {
        return this.e;
    }

    @m
    public final List n() {
        return this.l;
    }

    @m
    public final List o() {
        return this.d;
    }

    @m
    public final List p() {
        return this.n;
    }

    public final int q() {
        return this.o;
    }

    @m
    public final List r() {
        return this.i;
    }

    public final boolean s() {
        return s.q.a(this.o);
    }

    public final boolean t() {
        return s.q.b(this.o);
    }

    public final void u(@m List list0) {
        this.a = list0;
    }

    public final void v(@m List list0) {
        this.g = list0;
    }

    public final void w(@m List list0) {
        this.j = list0;
    }

    public final void x(@m List list0) {
        this.k = list0;
    }

    public final void y(@m List list0) {
        this.f = list0;
    }

    public final void z(@m List list0) {
        this.h = list0;
    }
}

