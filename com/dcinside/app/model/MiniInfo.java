package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class MiniInfo implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public MiniInfo a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new MiniInfo(parcel0);
        }

        @l
        public MiniInfo[] b(int v) {
            return new MiniInfo[v];
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
    @c("gall_hide")
    private int a;
    @c("total_member")
    private int b;
    @c("member_limit")
    private int c;
    @c("list_scope")
    @m
    private final String d;
    @c("view_scope")
    @m
    private final String e;
    @c("write_scope")
    @m
    private final String f;
    @l
    public static final b g;

    static {
        MiniInfo.g = new b(null);
        MiniInfo.CREATOR = new a();
    }

    public MiniInfo() {
        this(0, 0, 0, null, null, null, 0x3F, null);
    }

    public MiniInfo(int v, int v1, int v2, @m String s, @m String s1, @m String s2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
        this.e = s1;
        this.f = s2;
    }

    public MiniInfo(int v, int v1, int v2, String s, String s1, String s2, int v3, w w0) {
        this(((v3 & 1) == 0 ? v : 0), ((v3 & 2) == 0 ? v1 : 0), ((v3 & 4) == 0 ? v2 : 0), ((v3 & 8) == 0 ? s : null), ((v3 & 16) == 0 ? s1 : null), ((v3 & 0x20) == 0 ? s2 : null));
    }

    public MiniInfo(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString());
    }

    public final int a() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final String e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MiniInfo)) {
            return false;
        }
        if(this.a != ((MiniInfo)object0).a) {
            return false;
        }
        if(this.b != ((MiniInfo)object0).b) {
            return false;
        }
        if(this.c != ((MiniInfo)object0).c) {
            return false;
        }
        if(!L.g(this.d, ((MiniInfo)object0).d)) {
            return false;
        }
        return L.g(this.e, ((MiniInfo)object0).e) ? L.g(this.f, ((MiniInfo)object0).f) : false;
    }

    @m
    public final String f() {
        return this.e;
    }

    @m
    public final String g() {
        return this.f;
    }

    @l
    public final MiniInfo h(int v, int v1, int v2, @m String s, @m String s1, @m String s2) {
        return new MiniInfo(v, v1, v2, s, s1, s2);
    }

    @Override
    public int hashCode() {
        int v = ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F;
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = this.e == null ? 0 : this.e.hashCode();
        String s = this.f;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    public static MiniInfo i(MiniInfo miniInfo0, int v, int v1, int v2, String s, String s1, String s2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = miniInfo0.a;
        }
        if((v3 & 2) != 0) {
            v1 = miniInfo0.b;
        }
        if((v3 & 4) != 0) {
            v2 = miniInfo0.c;
        }
        if((v3 & 8) != 0) {
            s = miniInfo0.d;
        }
        if((v3 & 16) != 0) {
            s1 = miniInfo0.e;
        }
        if((v3 & 0x20) != 0) {
            s2 = miniInfo0.f;
        }
        return miniInfo0.h(v, v1, v2, s, s1, s2);
    }

    public final int l() {
        return this.c;
    }

    @m
    public final String m() {
        return this.d;
    }

    public final int o() {
        return this.b;
    }

    public final int q() {
        return this.a;
    }

    @m
    public final String r() {
        return this.e;
    }

    @m
    public final String s() {
        return this.f;
    }

    public final void t(int v) {
        this.c = v;
    }

    @Override
    @l
    public String toString() {
        return "MiniInfo(privateStatus=" + this.a + ", memberAmount=" + this.b + ", limitMemberAmount=" + this.c + ", listTarget=" + this.d + ", readTarget=" + this.e + ", writeTarget=" + this.f + ")";
    }

    public final void u(int v) {
        this.b = v;
    }

    public final void v(int v) {
        this.a = v;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
        parcel0.writeString(this.f);
    }
}

