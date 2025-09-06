package com.dcinside.app.settings.image.model;

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
public final class AutoImage implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public final AutoImage a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new AutoImage(parcel0.readString(), parcel0.readInt(), parcel0.readString(), parcel0.readString());
        }

        @l
        public final AutoImage[] b(int v) {
            return new AutoImage[v];
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
    @c("thumb")
    @l
    private final String a;
    @c("idx")
    private final int b;
    @c("img")
    @l
    private final String c;
    @c("extension")
    @l
    private final String d;

    static {
        AutoImage.CREATOR = new a();
    }

    public AutoImage() {
        this(null, 0, null, null, 15, null);
    }

    public AutoImage(@l String s, int v, @l String s1, @l String s2) {
        L.p(s, "thumb");
        L.p(s1, "image");
        L.p(s2, "extension");
        super();
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = s2;
    }

    public AutoImage(String s, int v, String s1, String s2, int v1, w w0) {
        if((v1 & 1) != 0) {
            s = "";
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            s1 = "";
        }
        if((v1 & 8) != 0) {
            s2 = "";
        }
        this(s, v, s1, s2);
    }

    @l
    public final String a() {
        return this.a;
    }

    public final int c() {
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
        if(!(object0 instanceof AutoImage)) {
            return false;
        }
        if(!L.g(this.a, ((AutoImage)object0).a)) {
            return false;
        }
        if(this.b != ((AutoImage)object0).b) {
            return false;
        }
        return L.g(this.c, ((AutoImage)object0).c) ? L.g(this.d, ((AutoImage)object0).d) : false;
    }

    @l
    public final AutoImage f(@l String s, int v, @l String s1, @l String s2) {
        L.p(s, "thumb");
        L.p(s1, "image");
        L.p(s2, "extension");
        return new AutoImage(s, v, s1, s2);
    }

    public static AutoImage g(AutoImage autoImage0, String s, int v, String s1, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = autoImage0.a;
        }
        if((v1 & 2) != 0) {
            v = autoImage0.b;
        }
        if((v1 & 4) != 0) {
            s1 = autoImage0.c;
        }
        if((v1 & 8) != 0) {
            s2 = autoImage0.d;
        }
        return autoImage0.f(s, v, s1, s2);
    }

    @l
    public final String h() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @l
    public final String i() [...] // 潜在的解密器

    public final int l() {
        return this.b;
    }

    @l
    public final String m() [...] // 潜在的解密器

    @Override
    @l
    public String toString() {
        return "AutoImage(thumb=" + this.a + ", index=" + this.b + ", image=" + this.c + ", extension=" + this.d + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeString(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
    }
}

