package com.dcinside.app.settings.image;

import O3.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.foundation.c;
import com.dcinside.app.settings.image.model.AutoImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@d
public final class AutoImageData implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public final AutoImageData a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            int v = parcel0.readInt();
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 != v; ++v1) {
                arrayList0.add(AutoImage.CREATOR.createFromParcel(parcel0));
            }
            String s = parcel0.readString();
            boolean z = parcel0.readInt() != 0;
            boolean z1 = parcel0.readInt() != 0;
            return parcel0.readInt() == 0 ? new AutoImageData(arrayList0, s, z, z1, false, parcel0.readInt(), parcel0.readString(), parcel0.readString()) : new AutoImageData(arrayList0, s, z, z1, true, parcel0.readInt(), parcel0.readString(), parcel0.readString());
        }

        @l
        public final AutoImageData[] b(int v) {
            return new AutoImageData[v];
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
    private final List a;
    @l
    private String b;
    private boolean c;
    private final boolean d;
    private final boolean e;
    private final int f;
    @l
    private final String g;
    @l
    private final String h;

    static {
        AutoImageData.CREATOR = new a();
    }

    public AutoImageData() {
        this(null, null, false, false, false, 0, null, null, 0xFF, null);
    }

    public AutoImageData(@l List list0, @l String s, boolean z, boolean z1, boolean z2, int v, @l String s1, @l String s2) {
        L.p(list0, "autoImage");
        L.p(s, "prompt");
        L.p(s1, "galleryId");
        L.p(s2, "galleryName");
        super();
        this.a = list0;
        this.b = s;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = v;
        this.g = s1;
        this.h = s2;
    }

    public AutoImageData(List list0, String s, boolean z, boolean z1, boolean z2, int v, String s1, String s2, int v1, w w0) {
        this(((v1 & 1) == 0 ? list0 : u.H()), ((v1 & 2) == 0 ? s : ""), ((v1 & 4) == 0 ? z : false), ((v1 & 8) == 0 ? z1 : true), ((v1 & 16) == 0 ? z2 : true), ((v1 & 0x20) == 0 ? v : 0), ((v1 & 0x40) == 0 ? s1 : ""), ((v1 & 0x80) == 0 ? s2 : ""));
    }

    @l
    public final List a() {
        return this.a;
    }

    @l
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
        if(!(object0 instanceof AutoImageData)) {
            return false;
        }
        if(!L.g(this.a, ((AutoImageData)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((AutoImageData)object0).b)) {
            return false;
        }
        if(this.c != ((AutoImageData)object0).c) {
            return false;
        }
        if(this.d != ((AutoImageData)object0).d) {
            return false;
        }
        if(this.e != ((AutoImageData)object0).e) {
            return false;
        }
        if(this.f != ((AutoImageData)object0).f) {
            return false;
        }
        return L.g(this.g, ((AutoImageData)object0).g) ? L.g(this.h, ((AutoImageData)object0).h) : false;
    }

    public final boolean f() {
        return this.e;
    }

    public final int g() {
        return this.f;
    }

    @l
    public final String h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return ((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + c.a(this.c)) * 0x1F + c.a(this.d)) * 0x1F + c.a(this.e)) * 0x1F + this.f) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode();
    }

    @l
    public final String i() {
        return this.h;
    }

    @l
    public final AutoImageData l(@l List list0, @l String s, boolean z, boolean z1, boolean z2, int v, @l String s1, @l String s2) {
        L.p(list0, "autoImage");
        L.p(s, "prompt");
        L.p(s1, "galleryId");
        L.p(s2, "galleryName");
        return new AutoImageData(list0, s, z, z1, z2, v, s1, s2);
    }

    public static AutoImageData m(AutoImageData autoImageData0, List list0, String s, boolean z, boolean z1, boolean z2, int v, String s1, String s2, int v1, Object object0) {
        List list1 = (v1 & 1) == 0 ? list0 : autoImageData0.a;
        String s3 = (v1 & 2) == 0 ? s : autoImageData0.b;
        boolean z3 = (v1 & 4) == 0 ? z : autoImageData0.c;
        boolean z4 = (v1 & 8) == 0 ? z1 : autoImageData0.d;
        boolean z5 = (v1 & 16) == 0 ? z2 : autoImageData0.e;
        int v2 = (v1 & 0x20) == 0 ? v : autoImageData0.f;
        String s4 = (v1 & 0x40) == 0 ? s1 : autoImageData0.g;
        return (v1 & 0x80) == 0 ? autoImageData0.l(list1, s3, z3, z4, z5, v2, s4, s2) : autoImageData0.l(list1, s3, z3, z4, z5, v2, s4, autoImageData0.h);
    }

    @l
    public final List o() {
        return this.a;
    }

    @l
    public final String q() [...] // 潜在的解密器

    @l
    public final String r() [...] // 潜在的解密器

    public final boolean s() {
        return this.c;
    }

    public final int t() {
        return this.f;
    }

    @Override
    @l
    public String toString() {
        return "AutoImageData(autoImage=" + this.a + ", prompt=" + this.b + ", localExist=" + this.c + ", useGalleryImage=" + this.d + ", isRandom=" + this.e + ", mainImageIndex=" + this.f + ", galleryId=" + this.g + ", galleryName=" + this.h + ")";
    }

    @l
    public final String u() [...] // 潜在的解密器

    public final boolean v() {
        return this.d;
    }

    public final boolean w() {
        return this.e;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeInt(this.a.size());
        for(Object object0: this.a) {
            ((AutoImage)object0).writeToParcel(parcel0, v);
        }
        parcel0.writeString(this.b);
        parcel0.writeInt(((int)this.c));
        parcel0.writeInt(((int)this.d));
        parcel0.writeInt(((int)this.e));
        parcel0.writeInt(this.f);
        parcel0.writeString(this.g);
        parcel0.writeString(this.h);
    }

    public final void x(boolean z) {
        this.c = z;
    }

    public final void y(@l String s) {
        L.p(s, "<set-?>");
        this.b = s;
    }
}

