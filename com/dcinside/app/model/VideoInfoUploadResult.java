package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class VideoInfoUploadResult implements Parcelable {
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public VideoInfoUploadResult a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new VideoInfoUploadResult(parcel0);
        }

        @l
        public VideoInfoUploadResult[] b(int v) {
            return new VideoInfoUploadResult[v];
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
    public static final a CREATOR;
    @c("result")
    @m
    private final String a;
    @c("cause")
    @m
    private final String b;
    @c("mv_token")
    @m
    private final String c;
    @c("mv_no")
    @m
    private final String d;

    static {
        VideoInfoUploadResult.CREATOR = new a(null);
    }

    public VideoInfoUploadResult() {
        this(null, null, null, null, 15, null);
    }

    public VideoInfoUploadResult(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString());
    }

    public VideoInfoUploadResult(@m String s, @m String s1, @m String s2, @m String s3) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    public VideoInfoUploadResult(String s, String s1, String s2, String s3, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        this(s, s1, s2, s3);
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
    public final String d() {
        return this.d;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final String e() {
        return this.c;
    }

    public final boolean f() {
        return v.O1("true", this.a, true);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
    }
}

