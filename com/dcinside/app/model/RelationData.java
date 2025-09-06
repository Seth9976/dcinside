package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class RelationData {
    public static final class Follow implements Parcelable {
        public static final class a implements Parcelable.Creator {
            @l
            public Follow a(@l Parcel parcel0) {
                L.p(parcel0, "source");
                return new Follow(parcel0);
            }

            @l
            public Follow[] b(int v) {
                return new Follow[v];
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

            @n
            public final boolean a(@m String s) {
                return s != null && v.W2(s, "A_NEW", false, 2, null);
            }
        }

        @l
        @f
        public static final Parcelable.Creator CREATOR;
        @c("ko_name")
        @m
        private String a;
        @c("id")
        @m
        private String b;
        @c("minor")
        private boolean c;
        @c("mini")
        private boolean d;
        @c("gall_state")
        @m
        private String e;
        @c("is_new")
        @m
        private String f;
        @l
        public static final b g;

        static {
            Follow.g = new b(null);
            Follow.CREATOR = new a();
        }

        public Follow() {
            this(null, null, false, false, null, null, 0x3F, null);
        }

        public Follow(@l Parcel parcel0) {
            L.p(parcel0, "source");
            this(parcel0.readString(), parcel0.readString(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), parcel0.readString(), parcel0.readString());
        }

        public Follow(@m String s, @m String s1, boolean z, boolean z1, @m String s2, @m String s3) {
            this.a = s;
            this.b = s1;
            this.c = z;
            this.d = z1;
            this.e = s2;
            this.f = s3;
        }

        public Follow(String s, String s1, boolean z, boolean z1, String s2, String s3, int v, w w0) {
            this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? z : false), ((v & 8) == 0 ? z1 : false), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null));
        }

        @m
        public final String a() {
            return this.a;
        }

        @m
        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.d;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Follow)) {
                return false;
            }
            if(!L.g(this.a, ((Follow)object0).a)) {
                return false;
            }
            if(!L.g(this.b, ((Follow)object0).b)) {
                return false;
            }
            if(this.c != ((Follow)object0).c) {
                return false;
            }
            if(this.d != ((Follow)object0).d) {
                return false;
            }
            return L.g(this.e, ((Follow)object0).e) ? L.g(this.f, ((Follow)object0).f) : false;
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
        public final Follow h(@m String s, @m String s1, boolean z, boolean z1, @m String s2, @m String s3) {
            return new Follow(s, s1, z, z1, s2, s3);
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            int v3 = androidx.compose.foundation.c.a(this.c);
            int v4 = androidx.compose.foundation.c.a(this.d);
            int v5 = this.e == null ? 0 : this.e.hashCode();
            String s = this.f;
            if(s != null) {
                v = s.hashCode();
            }
            return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
        }

        public static Follow i(Follow relationData$Follow0, String s, String s1, boolean z, boolean z1, String s2, String s3, int v, Object object0) {
            if((v & 1) != 0) {
                s = relationData$Follow0.a;
            }
            if((v & 2) != 0) {
                s1 = relationData$Follow0.b;
            }
            if((v & 4) != 0) {
                z = relationData$Follow0.c;
            }
            if((v & 8) != 0) {
                z1 = relationData$Follow0.d;
            }
            if((v & 16) != 0) {
                s2 = relationData$Follow0.e;
            }
            if((v & 0x20) != 0) {
                s3 = relationData$Follow0.f;
            }
            return relationData$Follow0.h(s, s1, z, z1, s2, s3);
        }

        @m
        public final String l() {
            return this.b;
        }

        @m
        public final String m() {
            return this.a;
        }

        @m
        public final String o() {
            return this.f;
        }

        @m
        public final String q() {
            return this.e;
        }

        public final boolean r() {
            return this.d;
        }

        public final boolean s() {
            return this.c;
        }

        @n
        public static final boolean t(@m String s) {
            return Follow.g.a(s);
        }

        @Override
        @l
        public String toString() {
            return "Follow(name=" + this.a + ", id=" + this.b + ", isMinor=" + this.c + ", isMini=" + this.d + ", state=" + this.e + ", newRelation=" + this.f + ")";
        }

        public final void u(@m String s) {
            this.b = s;
        }

        public final void v(boolean z) {
            this.d = z;
        }

        public final void w(boolean z) {
            this.c = z;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@l Parcel parcel0, int v) {
            L.p(parcel0, "dest");
            parcel0.writeString(this.a);
            parcel0.writeString(this.b);
            parcel0.writeInt(((int)this.c));
            parcel0.writeInt(((int)this.d));
            parcel0.writeString(this.e);
            parcel0.writeString(this.f);
        }

        public final void x(@m String s) {
            this.a = s;
        }

        public final void y(@m String s) {
            this.f = s;
        }

        public final void z(@m String s) {
            this.e = s;
        }
    }

    public static final class com.dcinside.app.model.RelationData.a {
        @c("fwingList")
        @m
        private final List a;
        @c("followingList")
        @m
        private final List b;

        @m
        public final List a() {
            return this.a;
        }

        @m
        public final List b() {
            return this.b;
        }
    }

    public static final class com.dcinside.app.model.RelationData.b {
        @c("package_idx")
        private final int a;
        @c("title")
        @m
        private final String b;
        @c("img")
        @m
        private final String c;
        @c("nick_name")
        @m
        private final String d;
        @c("description")
        @m
        private final String e;

        @m
        public final String a() {
            return this.e;
        }

        @m
        public final String b() {
            return this.c;
        }

        @m
        public final String c() {
            return this.d;
        }

        public final int d() {
            return this.a;
        }

        @m
        public final String e() {
            return this.b;
        }
    }

    public static final class com.dcinside.app.model.RelationData.c {
        @c("board_cnt")
        @m
        private final String a;

        @m
        public final String a() {
            return this.a;
        }
    }

    @c("result")
    @m
    private final String a;
    @c("cause")
    @m
    private final String b;
    @c("total")
    @m
    private final List c;
    @c("gallery")
    @m
    private final List d;
    @c("dccon")
    @m
    private final List e;

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final List b() {
        return this.e;
    }

    @m
    public final List c() {
        return this.d;
    }

    @m
    public final String d() {
        return this.a;
    }

    @m
    public final List e() {
        return this.c;
    }
}

