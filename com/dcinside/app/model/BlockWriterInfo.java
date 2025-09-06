package com.dcinside.app.model;

import O3.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@d
public final class BlockWriterInfo implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public final BlockWriterInfo a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new BlockWriterInfo(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString());
        }

        @l
        public final BlockWriterInfo[] b(int v) {
            return new BlockWriterInfo[v];
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
    public static final Parcelable.Creator CREATOR;
    @l
    private String a;
    @l
    private String b;
    @l
    private String c;
    @l
    private String d;

    static {
        BlockWriterInfo.CREATOR = new a();
    }

    public BlockWriterInfo(@l String s, @l String s1, @l String s2, @l String s3) {
        L.p(s, "galleryId");
        L.p(s1, "blockId");
        L.p(s2, "blockIp");
        L.p(s3, "blockName");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    public BlockWriterInfo(String s, String s1, String s2, String s3, int v, w w0) {
        if((v & 2) != 0) {
            s1 = "";
        }
        if((v & 4) != 0) {
            s2 = "";
        }
        if((v & 8) != 0) {
            s3 = "";
        }
        this(s, s1, s2, s3);
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final String c() {
        return this.b;
    }

    @l
    public final String d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlockWriterInfo)) {
            return false;
        }
        if(!L.g(this.a, ((BlockWriterInfo)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((BlockWriterInfo)object0).b)) {
            return false;
        }
        return L.g(this.c, ((BlockWriterInfo)object0).c) ? L.g(this.d, ((BlockWriterInfo)object0).d) : false;
    }

    @l
    public final BlockWriterInfo f(@l String s, @l String s1, @l String s2, @l String s3) {
        L.p(s, "galleryId");
        L.p(s1, "blockId");
        L.p(s2, "blockIp");
        L.p(s3, "blockName");
        return new BlockWriterInfo(s, s1, s2, s3);
    }

    public static BlockWriterInfo g(BlockWriterInfo blockWriterInfo0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = blockWriterInfo0.a;
        }
        if((v & 2) != 0) {
            s1 = blockWriterInfo0.b;
        }
        if((v & 4) != 0) {
            s2 = blockWriterInfo0.c;
        }
        if((v & 8) != 0) {
            s3 = blockWriterInfo0.d;
        }
        return blockWriterInfo0.f(s, s1, s2, s3);
    }

    @l
    public final String h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @l
    public final String i() {
        return this.c;
    }

    @l
    public final String l() {
        return this.d;
    }

    @l
    public final String m() {
        return this.a;
    }

    public final void o(@l String s) {
        L.p(s, "<set-?>");
        this.b = s;
    }

    public final void q(@l String s) {
        L.p(s, "<set-?>");
        this.c = s;
    }

    public final void r(@l String s) {
        L.p(s, "<set-?>");
        this.d = s;
    }

    public final void s(@l String s) {
        L.p(s, "<set-?>");
        this.a = s;
    }

    @Override
    @l
    public String toString() {
        return "BlockWriterInfo(galleryId=" + this.a + ", blockId=" + this.b + ", blockIp=" + this.c + ", blockName=" + this.d + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
    }
}

