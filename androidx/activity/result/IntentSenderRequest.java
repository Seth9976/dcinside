package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import s3.a;
import s3.e;
import y4.l;
import y4.m;
import z3.f;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final class Builder {
        @Retention(RetentionPolicy.SOURCE)
        @e(a.a)
        @interface Flag {
        }

        @l
        private final IntentSender a;
        @m
        private Intent b;
        private int c;
        private int d;

        public Builder(@l PendingIntent pendingIntent0) {
            L.p(pendingIntent0, "pendingIntent");
            IntentSender intentSender0 = pendingIntent0.getIntentSender();
            L.o(intentSender0, "pendingIntent.intentSender");
            this(intentSender0);
        }

        public Builder(@l IntentSender intentSender0) {
            L.p(intentSender0, "intentSender");
            super();
            this.a = intentSender0;
        }

        @l
        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.a, this.b, this.c, this.d);
        }

        @l
        public final Builder b(@m Intent intent0) {
            this.b = intent0;
            return this;
        }

        @l
        public final Builder c(int v, int v1) {
            this.d = v;
            this.c = v1;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public static void a() {
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @l
    private final IntentSender a;
    @m
    private final Intent b;
    private final int c;
    private final int d;
    @l
    public static final Companion e;

    static {
        IntentSenderRequest.e = new Companion(null);
        IntentSenderRequest.CREATOR = new IntentSenderRequest.Companion.CREATOR.1();
    }

    public IntentSenderRequest(@l IntentSender intentSender0, @m Intent intent0, int v, int v1) {
        L.p(intentSender0, "intentSender");
        super();
        this.a = intentSender0;
        this.b = intent0;
        this.c = v;
        this.d = v1;
    }

    public IntentSenderRequest(IntentSender intentSender0, Intent intent0, int v, int v1, int v2, w w0) {
        if((v2 & 2) != 0) {
            intent0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        this(intentSender0, intent0, v, v1);
    }

    public IntentSenderRequest(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        Parcelable parcelable0 = parcel0.readParcelable(IntentSender.class.getClassLoader());
        L.m(parcelable0);
        this(((IntentSender)parcelable0), ((Intent)parcel0.readParcelable(Intent.class.getClassLoader())), parcel0.readInt(), parcel0.readInt());
    }

    @m
    public final Intent a() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final IntentSender e() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeParcelable(this.a, v);
        parcel0.writeParcelable(this.b, v);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
    }
}

