package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

@SuppressLint({"BanParcelableUsage"})
final class DefaultLazyKey implements Parcelable {
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
    private final int a;
    @l
    public static final Companion b;

    static {
        DefaultLazyKey.b = new Companion(null);
        DefaultLazyKey.CREATOR = new DefaultLazyKey.Companion.CREATOR.1();
    }

    public DefaultLazyKey(int v) {
        this.a = v;
    }

    private final int a() {
        return this.a;
    }

    @l
    public final DefaultLazyKey c(int v) {
        return new DefaultLazyKey(v);
    }

    public static DefaultLazyKey d(DefaultLazyKey defaultLazyKey0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = defaultLazyKey0.a;
        }
        return defaultLazyKey0.c(v);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DefaultLazyKey ? this.a == ((DefaultLazyKey)object0).a : false;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "DefaultLazyKey(index=" + this.a + ')';
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeInt(this.a);
    }
}

