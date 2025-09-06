package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public static void a() {
        }

        @l
        @n
        public final String b(int v) {
            switch(v) {
                case -1: {
                    return "RESULT_OK";
                }
                case 0: {
                    return "RESULT_CANCELED";
                }
                default: {
                    return String.valueOf(v);
                }
            }
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    private final int a;
    @m
    private final Intent b;
    @l
    public static final Companion c;

    static {
        ActivityResult.c = new Companion(null);
        ActivityResult.CREATOR = new ActivityResult.Companion.CREATOR.1();
    }

    public ActivityResult(int v, @m Intent intent0) {
        this.a = v;
        this.b = intent0;
    }

    public ActivityResult(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readInt(), (parcel0.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel0))));
    }

    @m
    public final Intent a() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    @l
    @n
    public static final String d(int v) {
        return ActivityResult.c.b(v);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    @l
    public String toString() {
        return "ActivityResult{resultCode=" + ActivityResult.c.b(this.a) + ", data=" + this.b + '}';
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeInt(this.a);
        parcel0.writeInt((this.b == null ? 0 : 1));
        Intent intent0 = this.b;
        if(intent0 != null) {
            intent0.writeToParcel(parcel0, v);
        }
    }
}

