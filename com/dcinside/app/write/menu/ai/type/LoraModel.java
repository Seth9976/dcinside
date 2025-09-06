package com.dcinside.app.write.menu.ai.type;

import O3.d;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@d
public final class LoraModel implements Parcelable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final String a(@l Context context0, @l LoraModel loraModel0) {
            String s3;
            L.p(context0, "context");
            L.p(loraModel0, "model");
            String s = loraModel0.a();
            String s1 = loraModel0.g();
            String s2 = loraModel0.h();
            if(s != null && s.length() != 0) {
                s3 = context0.getString(0x7F1505A4, new Object[]{s, s1, s2});  // string:make_ai_image_lora_prompt_add "%1$s\n<lora:%2$s:%3$s>"
                L.m(s3);
                return s3;
            }
            s3 = context0.getString(0x7F1505A3, new Object[]{s1, s2});  // string:make_ai_image_lora_prompt "<lora:%1$s:%2$s>"
            L.m(s3);
            return s3;
        }

        public final boolean b(@l LoraModel loraModel0) {
            L.p(loraModel0, "model");
            String s = loraModel0.i();
            return L.g(s, "prompt") || !L.g(s, "negative");
        }
    }

    public static final class b implements Parcelable.Creator {
        @l
        public final LoraModel a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new LoraModel(parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString());
        }

        @l
        public final LoraModel[] b(int v) {
            return new LoraModel[v];
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
    @c("idx")
    private final int a;
    @c("type")
    @m
    private final String b;
    @c("prompt_type")
    @m
    private final String c;
    @c("default")
    @m
    private final String d;
    @c("prompt")
    @m
    private final String e;
    @c("add_prompt")
    @m
    private final String f;
    @c("image_src")
    @m
    private final String g;
    @com.google.gson.annotations.a
    @c("name")
    @m
    private String h;
    @com.google.gson.annotations.a
    @c("promptAccent")
    @m
    private String i;
    @l
    public static final a j;

    static {
        LoraModel.j = new a(null);
        LoraModel.CREATOR = new b();
    }

    public LoraModel() {
        this(0, null, null, null, null, null, null, null, null, 0x1FF, null);
    }

    public LoraModel(int v, @m String s, @m String s1, @m String s2, @m String s3, @m String s4, @m String s5, @m String s6, @m String s7) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = s6;
        this.i = s7;
    }

    public LoraModel(int v, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v1, w w0) {
        this(((v1 & 1) == 0 ? v : 10000), ((v1 & 2) == 0 ? s : null), ((v1 & 4) == 0 ? s1 : null), ((v1 & 8) == 0 ? s2 : null), ((v1 & 16) == 0 ? s3 : null), ((v1 & 0x20) == 0 ? s4 : null), ((v1 & 0x40) == 0 ? s5 : null), ((v1 & 0x80) == 0 ? s6 : null), ((v1 & 0x100) == 0 ? s7 : null));
    }

    @m
    public final String a() {
        return this.f;
    }

    @m
    public final String c() {
        return this.d;
    }

    @m
    public final String d() {
        return this.g;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.a;
    }

    @m
    public final String f() {
        return this.h;
    }

    @m
    public final String g() {
        return this.e;
    }

    @m
    public final String h() {
        return this.i;
    }

    @m
    public final String i() {
        return this.c;
    }

    @m
    public final String l() {
        return this.b;
    }

    public final void m(@m String s) {
        this.h = s;
    }

    public final void o(@m String s) {
        this.i = s;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
        parcel0.writeString(this.f);
        parcel0.writeString(this.g);
        parcel0.writeString(this.h);
        parcel0.writeString(this.i);
    }
}

