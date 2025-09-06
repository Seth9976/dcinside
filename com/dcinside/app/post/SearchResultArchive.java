package com.dcinside.app.post;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.dcinside.app.type.I;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nSearchResultArchive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultArchive.kt\ncom/dcinside/app/post/SearchResultArchive\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class SearchResultArchive implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public SearchResultArchive a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new SearchResultArchive(parcel0);
        }

        @l
        public SearchResultArchive[] b(int v) {
            return new SearchResultArchive[v];
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

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @l
    private final List a;
    @l
    private final Set b;
    @m
    private I c;
    @m
    private String d;
    private boolean e;
    @m
    private String f;
    @m
    private String g;
    @m
    private String h;
    private int i;
    @m
    private String j;
    private int k;
    private int l;
    @l
    public static final b m;

    static {
        SearchResultArchive.m = new b(null);
        SearchResultArchive.CREATOR = new a();
    }

    public SearchResultArchive() {
        this(null, null, null, null, false, null, null, null, 0, null, 0, 0, 0xFFF, null);
    }

    public SearchResultArchive(@l Parcel parcel0) {
        L.p(parcel0, "source");
        Set set0;
        ArrayList arrayList0 = parcel0.createTypedArrayList(SearchItem.CREATOR);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
        }
        int[] arr_v = parcel0.createIntArray();
        if(arr_v == null) {
            set0 = new LinkedHashSet();
        }
        else {
            set0 = kotlin.collections.l.bz(arr_v);
            if(set0 == null) {
                set0 = new LinkedHashSet();
            }
        }
        this(arrayList0, set0, I.values()[parcel0.readInt()], parcel0.readString(), 1 == parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readInt(), parcel0.readString(), parcel0.readInt(), parcel0.readInt());
    }

    public SearchResultArchive(@l List list0, @l Set set0, @m I i0, @m String s, boolean z, @m String s1, @m String s2, @m String s3, int v, @m String s4, int v1, int v2) {
        L.p(list0, "items");
        L.p(set0, "postNumbers");
        super();
        this.a = list0;
        this.b = set0;
        this.c = i0;
        this.d = s;
        this.e = z;
        this.f = s1;
        this.g = s2;
        this.h = s3;
        this.i = v;
        this.j = s4;
        this.k = v1;
        this.l = v2;
    }

    public SearchResultArchive(List list0, Set set0, I i0, String s, boolean z, String s1, String s2, String s3, int v, String s4, int v1, int v2, int v3, w w0) {
        List list1 = (v3 & 1) == 0 ? list0 : new ArrayList();
        Set set1 = (v3 & 2) == 0 ? set0 : new LinkedHashSet();
        String s5 = null;
        int v4 = 0;
        if((v3 & 0x200) == 0) {
            s5 = s4;
        }
        if((v3 & 0x800) == 0) {
            v4 = v2;
        }
        this(list1, set1, ((v3 & 4) == 0 ? i0 : null), ((v3 & 8) == 0 ? s : null), ((v3 & 16) == 0 ? z : false), ((v3 & 0x20) == 0 ? s1 : null), ((v3 & 0x40) == 0 ? s2 : null), ((v3 & 0x80) == 0 ? s3 : null), ((v3 & 0x100) == 0 ? v : 0), s5, ((v3 & 0x400) == 0 ? v1 : 0), v4);
    }

    public final void A(@m String s) {
        this.g = s;
    }

    public final int a() {
        return this.l;
    }

    public final int c() {
        return this.k;
    }

    @m
    public final String d() {
        return this.f;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final String e() {
        return this.j;
    }

    @l
    public final List f() {
        return this.a;
    }

    @m
    public final String g() {
        return this.d;
    }

    @m
    public final I h() {
        return this.c;
    }

    public final int i() {
        return this.i;
    }

    @l
    public final Set l() {
        return this.b;
    }

    @m
    public final String m() {
        return this.h;
    }

    @m
    public final String o() {
        return this.g;
    }

    public final boolean q() {
        return this.e;
    }

    public final void r(int v) {
        this.l = v;
    }

    public final void s(int v) {
        this.k = v;
    }

    public final void t(boolean z) {
        this.e = z;
    }

    public final void u(@m String s) {
        this.f = s;
    }

    public final void v(@m String s) {
        this.j = s;
    }

    public final void w(@m String s) {
        this.d = s;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeTypedList(this.a);
        parcel0.writeIntArray(u.U5(this.b));
        parcel0.writeInt((this.c == null ? 0 : this.c.ordinal()));
        parcel0.writeString(this.d);
        parcel0.writeInt(((int)this.e));
        parcel0.writeString(this.f);
        parcel0.writeString(this.g);
        parcel0.writeString(this.h);
        parcel0.writeInt(this.i);
        parcel0.writeString(this.j);
        parcel0.writeInt(this.k);
        parcel0.writeInt(this.l);
    }

    public final void x(@m I i0) {
        this.c = i0;
    }

    public final void y(int v) {
        this.i = v;
    }

    public final void z(@m String s) {
        this.h = s;
    }
}

