package com.dcinside.app.write.menu.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class VideoInfoData implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public VideoInfoData a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new VideoInfoData(parcel0);
        }

        @l
        public VideoInfoData[] b(int v) {
            return new VideoInfoData[v];
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
    @c("width")
    private final int a;
    @c("height")
    private final int b;
    @c("fileNum")
    @m
    private final String c;
    @c("videoToken")
    @m
    private final String d;
    @c("videoNumber")
    @m
    private final String e;
    @c("thumbnailUrl")
    @m
    private final String f;
    @c("description")
    @m
    private final String g;
    @c("tags")
    @m
    private final String h;
    @c("allowDownload")
    private final boolean i;
    @l
    public static final b j;

    static {
        VideoInfoData.j = new b(null);
        VideoInfoData.CREATOR = new a();
    }

    public VideoInfoData() {
        this(0, 0, null, null, null, null, null, null, false, 0x1FF, null);
    }

    public VideoInfoData(int v, int v1, @m String s, @m String s1, @m String s2, @m String s3, @m String s4, @m String s5, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = z;
    }

    public VideoInfoData(int v, int v1, String s, String s1, String s2, String s3, String s4, String s5, boolean z, int v2, w w0) {
        this(((v2 & 1) == 0 ? v : 0), ((v2 & 2) == 0 ? v1 : 0), ((v2 & 4) == 0 ? s : null), ((v2 & 8) == 0 ? s1 : null), ((v2 & 16) == 0 ? s2 : null), ((v2 & 0x20) == 0 ? s3 : null), ((v2 & 0x40) == 0 ? s4 : null), ((v2 & 0x80) == 0 ? s5 : null), ((v2 & 0x100) == 0 ? z : false));
    }

    public VideoInfoData(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readInt(), parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readByte() != 0);
    }

    public final int a() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    @m
    public final String d() {
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
        if(!(object0 instanceof VideoInfoData)) {
            return false;
        }
        if(this.a != ((VideoInfoData)object0).a) {
            return false;
        }
        if(this.b != ((VideoInfoData)object0).b) {
            return false;
        }
        if(!L.g(this.c, ((VideoInfoData)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((VideoInfoData)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((VideoInfoData)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((VideoInfoData)object0).f)) {
            return false;
        }
        if(!L.g(this.g, ((VideoInfoData)object0).g)) {
            return false;
        }
        return L.g(this.h, ((VideoInfoData)object0).h) ? this.i == ((VideoInfoData)object0).i : false;
    }

    @m
    public final String f() {
        return this.e;
    }

    @m
    public final String g() {
        return this.f;
    }

    @m
    public final String h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        int v = (this.a * 0x1F + this.b) * 0x1F;
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        int v4 = this.e == null ? 0 : this.e.hashCode();
        int v5 = this.f == null ? 0 : this.f.hashCode();
        int v6 = this.g == null ? 0 : this.g.hashCode();
        String s = this.h;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1) * 0x1F + androidx.compose.foundation.c.a(this.i);
    }

    @m
    public final String i() {
        return this.h;
    }

    public final boolean l() {
        return this.i;
    }

    @l
    public final VideoInfoData m(int v, int v1, @m String s, @m String s1, @m String s2, @m String s3, @m String s4, @m String s5, boolean z) {
        return new VideoInfoData(v, v1, s, s1, s2, s3, s4, s5, z);
    }

    public static VideoInfoData o(VideoInfoData videoInfoData0, int v, int v1, String s, String s1, String s2, String s3, String s4, String s5, boolean z, int v2, Object object0) {
        int v3 = (v2 & 1) == 0 ? v : videoInfoData0.a;
        int v4 = (v2 & 2) == 0 ? v1 : videoInfoData0.b;
        String s6 = (v2 & 4) == 0 ? s : videoInfoData0.c;
        String s7 = (v2 & 8) == 0 ? s1 : videoInfoData0.d;
        String s8 = (v2 & 16) == 0 ? s2 : videoInfoData0.e;
        String s9 = (v2 & 0x20) == 0 ? s3 : videoInfoData0.f;
        String s10 = (v2 & 0x40) == 0 ? s4 : videoInfoData0.g;
        String s11 = (v2 & 0x80) == 0 ? s5 : videoInfoData0.h;
        return (v2 & 0x100) == 0 ? videoInfoData0.m(v3, v4, s6, s7, s8, s9, s10, s11, z) : videoInfoData0.m(v3, v4, s6, s7, s8, s9, s10, s11, videoInfoData0.i);
    }

    public final boolean q() {
        return this.i;
    }

    @m
    public final String r() {
        return this.g;
    }

    @m
    public final String s() {
        return this.c;
    }

    public final int t() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "VideoInfoData(width=" + this.a + ", height=" + this.b + ", fileNum=" + this.c + ", videoToken=" + this.d + ", videoNumber=" + this.e + ", thumbnailUrl=" + this.f + ", description=" + this.g + ", tags=" + this.h + ", allowDownload=" + this.i + ")";
    }

    @m
    public final String u() {
        return this.h;
    }

    @m
    public final String v() {
        return this.f;
    }

    @m
    public final String w() {
        return this.e;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
        parcel0.writeString(this.f);
        parcel0.writeString(this.g);
        parcel0.writeString(this.h);
        parcel0.writeByte(((byte)this.i));
    }

    @m
    public final String x() {
        return this.d;
    }

    public final int y() {
        return this.a;
    }
}

