package com.dcinside.app.model;

import O3.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@d
public final class BigDcconResult implements Parcelable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static final class b implements Parcelable.Creator {
        @l
        public final BigDcconResult a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            if(parcel0.readInt() == 0) {
                return new BigDcconResult(null, parcel0.readLong(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readString(), parcel0.readString());
            }
            return parcel0.readInt() == 0 ? new BigDcconResult(Boolean.FALSE, parcel0.readLong(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readString(), parcel0.readString()) : new BigDcconResult(Boolean.TRUE, parcel0.readLong(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readString(), parcel0.readString());
        }

        @l
        public final BigDcconResult[] b(int v) {
            return new BigDcconResult[v];
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

    @l
    public static final Parcelable.Creator CREATOR = null;
    @c("result")
    @m
    private final Boolean a;
    @c("expire")
    private final long b;
    @c("article_limit")
    private final int c;
    @c("comment_limit")
    private final int d;
    @c("day_limit")
    private final int e;
    @c("article_cnt")
    private final int f;
    @c("comment_cnt")
    private final int g;
    @c("result_status")
    @l
    private final String h;
    @c("cause")
    @l
    private final String i;
    @l
    public static final a j = null;
    @l
    public static final String k = "updated";
    @l
    public static final String l = "already";
    @l
    public static final String m = "not enabled";

    static {
        BigDcconResult.j = new a(null);
        BigDcconResult.CREATOR = new b();
    }

    public BigDcconResult() {
        this(null, 0L, 0, 0, 0, 0, 0, null, null, 0x1FF, null);
    }

    public BigDcconResult(@m Boolean boolean0, long v, int v1, int v2, int v3, int v4, int v5, @l String s, @l String s1) {
        L.p(s, "resultStatus");
        L.p(s1, "cause");
        super();
        this.a = boolean0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = s;
        this.i = s1;
    }

    public BigDcconResult(Boolean boolean0, long v, int v1, int v2, int v3, int v4, int v5, String s, String s1, int v6, w w0) {
        this(((v6 & 1) == 0 ? boolean0 : null), ((v6 & 2) == 0 ? v : 0L), ((v6 & 4) == 0 ? v1 : 0), ((v6 & 8) == 0 ? v2 : 0), ((v6 & 16) == 0 ? v3 : 0), ((v6 & 0x20) == 0 ? v4 : 0), ((v6 & 0x40) == 0 ? v5 : 0), ((v6 & 0x80) == 0 ? s : ""), ((v6 & 0x100) == 0 ? s1 : ""));
    }

    @m
    public final Boolean a() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BigDcconResult)) {
            return false;
        }
        if(!L.g(this.a, ((BigDcconResult)object0).a)) {
            return false;
        }
        if(this.b != ((BigDcconResult)object0).b) {
            return false;
        }
        if(this.c != ((BigDcconResult)object0).c) {
            return false;
        }
        if(this.d != ((BigDcconResult)object0).d) {
            return false;
        }
        if(this.e != ((BigDcconResult)object0).e) {
            return false;
        }
        if(this.f != ((BigDcconResult)object0).f) {
            return false;
        }
        if(this.g != ((BigDcconResult)object0).g) {
            return false;
        }
        return L.g(this.h, ((BigDcconResult)object0).h) ? L.g(this.i, ((BigDcconResult)object0).i) : false;
    }

    public final int f() {
        return this.e;
    }

    public final int g() {
        return this.f;
    }

    public final int h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return this.a == null ? ((((((((int)(this.b ^ this.b >>> 0x20)) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h.hashCode()) * 0x1F + this.i.hashCode() : (((((((this.a.hashCode() * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h.hashCode()) * 0x1F + this.i.hashCode();
    }

    @l
    public final String i() {
        return this.h;
    }

    @l
    public final String l() {
        return this.i;
    }

    @l
    public final BigDcconResult m(@m Boolean boolean0, long v, int v1, int v2, int v3, int v4, int v5, @l String s, @l String s1) {
        L.p(s, "resultStatus");
        L.p(s1, "cause");
        return new BigDcconResult(boolean0, v, v1, v2, v3, v4, v5, s, s1);
    }

    public static BigDcconResult o(BigDcconResult bigDcconResult0, Boolean boolean0, long v, int v1, int v2, int v3, int v4, int v5, String s, String s1, int v6, Object object0) {
        Boolean boolean1 = (v6 & 1) == 0 ? boolean0 : bigDcconResult0.a;
        long v7 = (v6 & 2) == 0 ? v : bigDcconResult0.b;
        int v8 = (v6 & 4) == 0 ? v1 : bigDcconResult0.c;
        int v9 = (v6 & 8) == 0 ? v2 : bigDcconResult0.d;
        int v10 = (v6 & 16) == 0 ? v3 : bigDcconResult0.e;
        int v11 = (v6 & 0x20) == 0 ? v4 : bigDcconResult0.f;
        int v12 = (v6 & 0x40) == 0 ? v5 : bigDcconResult0.g;
        String s2 = (v6 & 0x80) == 0 ? s : bigDcconResult0.h;
        return (v6 & 0x100) == 0 ? bigDcconResult0.m(boolean1, v7, v8, v9, v10, v11, v12, s2, s1) : bigDcconResult0.m(boolean1, v7, v8, v9, v10, v11, v12, s2, bigDcconResult0.i);
    }

    public final int q() {
        return this.f;
    }

    public final int r() {
        return this.c;
    }

    @l
    public final String s() {
        return this.i;
    }

    public final int t() {
        return this.g;
    }

    @Override
    @l
    public String toString() {
        return "BigDcconResult(result=" + this.a + ", expireTime=" + this.b + ", articleLimit=" + this.c + ", commentLimit=" + this.d + ", dayLimit=" + this.e + ", articleCount=" + this.f + ", commentCount=" + this.g + ", resultStatus=" + this.h + ", cause=" + this.i + ")";
    }

    public final int u() {
        return this.d;
    }

    public final int v() {
        return this.e;
    }

    public final long w() {
        return this.b;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        boolean z;
        L.p(parcel0, "out");
        Boolean boolean0 = this.a;
        if(boolean0 == null) {
            z = false;
        }
        else {
            parcel0.writeInt(1);
            z = boolean0.booleanValue();
        }
        parcel0.writeInt(((int)z));
        parcel0.writeLong(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeInt(this.g);
        parcel0.writeString(this.h);
        parcel0.writeString(this.i);
    }

    @m
    public final Boolean x() {
        return this.a;
    }

    @l
    public final String y() [...] // 潜在的解密器
}

