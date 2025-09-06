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

public final class AiPromptLoadItem implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public AiPromptLoadItem a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new AiPromptLoadItem(parcel0);
        }

        @l
        public AiPromptLoadItem[] b(int v) {
            return new AiPromptLoadItem[v];
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
    @c("idx")
    private final long a;
    @c("mno")
    private final long b;
    @c("title")
    @m
    private final String c;
    @c("prompt")
    @m
    private final String d;
    @c("negative_prompt")
    @m
    private final String e;
    @l
    public static final b f;

    static {
        AiPromptLoadItem.f = new b(null);
        AiPromptLoadItem.CREATOR = new a();
    }

    public AiPromptLoadItem() {
        this(0L, 0L, null, null, null, 0x1F, null);
    }

    public AiPromptLoadItem(long v, long v1, @m String s, @m String s1, @m String s2) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
        this.e = s2;
    }

    public AiPromptLoadItem(long v, long v1, String s, String s1, String s2, int v2, w w0) {
        this(((v2 & 1) == 0 ? v : 0L), ((v2 & 2) == 0 ? v1 : 0L), ((v2 & 4) == 0 ? s : null), ((v2 & 8) == 0 ? s1 : null), ((v2 & 16) == 0 ? s2 : null));
    }

    public AiPromptLoadItem(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readLong(), parcel0.readLong(), parcel0.readString(), parcel0.readString(), parcel0.readString());
    }

    public final long a() {
        return this.a;
    }

    public final long c() {
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
        if(!(object0 instanceof AiPromptLoadItem)) {
            return false;
        }
        if(this.a != ((AiPromptLoadItem)object0).a) {
            return false;
        }
        if(this.b != ((AiPromptLoadItem)object0).b) {
            return false;
        }
        if(!L.g(this.c, ((AiPromptLoadItem)object0).c)) {
            return false;
        }
        return L.g(this.d, ((AiPromptLoadItem)object0).d) ? L.g(this.e, ((AiPromptLoadItem)object0).e) : false;
    }

    @m
    public final String f() {
        return this.e;
    }

    @l
    public final AiPromptLoadItem g(long v, long v1, @m String s, @m String s1, @m String s2) {
        return new AiPromptLoadItem(v, v1, s, s1, s2);
    }

    public static AiPromptLoadItem h(AiPromptLoadItem aiPromptLoadItem0, long v, long v1, String s, String s1, String s2, int v2, Object object0) {
        long v3 = (v2 & 1) == 0 ? v : aiPromptLoadItem0.a;
        long v4 = (v2 & 2) == 0 ? v1 : aiPromptLoadItem0.b;
        String s3 = (v2 & 4) == 0 ? s : aiPromptLoadItem0.c;
        String s4 = (v2 & 8) == 0 ? s1 : aiPromptLoadItem0.d;
        return (v2 & 16) == 0 ? aiPromptLoadItem0.g(v3, v4, s3, s4, s2) : aiPromptLoadItem0.g(v3, v4, s3, s4, aiPromptLoadItem0.e);
    }

    @Override
    public int hashCode() {
        int v = (int)(this.a ^ this.a >>> 0x20);
        int v1 = (int)(this.b ^ this.b >>> 0x20);
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v2 = s.hashCode();
        }
        return (((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v2;
    }

    public final long i() {
        return this.a;
    }

    public final long l() {
        return this.b;
    }

    @m
    public final String m() {
        return this.e;
    }

    @m
    public final String o() {
        return this.d;
    }

    @m
    public final String q() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "AiPromptLoadItem(idx=" + this.a + ", mno=" + this.b + ", title=" + this.c + ", prompt=" + this.d + ", negativePrompt=" + this.e + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeLong(this.a);
        parcel0.writeLong(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
    }
}

