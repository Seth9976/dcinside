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

public final class VideoUploadResult implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public VideoUploadResult a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new VideoUploadResult(parcel0);
        }

        @l
        public VideoUploadResult[] b(int v) {
            return new VideoUploadResult[v];
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
    @c("msg")
    @m
    private final String a;
    @c("file_no")
    @m
    private final String b;
    @c("thum_url_arr")
    @m
    private final String[] c;
    @c("width")
    private final int d;
    @c("height")
    private final int e;
    @l
    public static final b f;

    static {
        VideoUploadResult.f = new b(null);
        VideoUploadResult.CREATOR = new a();
    }

    public VideoUploadResult() {
        this(null, null, null, 0, 0, 0x1F, null);
    }

    public VideoUploadResult(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readString(), parcel0.readString(), parcel0.createStringArray(), parcel0.readInt(), parcel0.readInt());
    }

    public VideoUploadResult(@m String s, @m String s1, @m String[] arr_s, int v, int v1) {
        this.a = s;
        this.b = s1;
        this.c = arr_s;
        this.d = v;
        this.e = v1;
    }

    public VideoUploadResult(String s, String s1, String[] arr_s, int v, int v1, int v2, w w0) {
        this(((v2 & 1) == 0 ? s : null), ((v2 & 2) == 0 ? s1 : null), ((v2 & 4) == 0 ? arr_s : null), ((v2 & 8) == 0 ? v : 0), ((v2 & 16) == 0 ? v1 : 0));
    }

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String c() {
        return this.a;
    }

    @m
    public final String[] d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.d;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeStringArray(this.c);
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
    }
}

