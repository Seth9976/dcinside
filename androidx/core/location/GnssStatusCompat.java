package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class GnssStatusCompat {
    public static abstract class Callback {
        public void a(@IntRange(from = 0L) int v) {
        }

        public void b(GnssStatusCompat gnssStatusCompat0) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConstellationType {
    }

    @SuppressLint({"InlinedApi"})
    public static final int a = 0;
    @SuppressLint({"InlinedApi"})
    public static final int b = 1;
    @SuppressLint({"InlinedApi"})
    public static final int c = 2;
    @SuppressLint({"InlinedApi"})
    public static final int d = 3;
    @SuppressLint({"InlinedApi"})
    public static final int e = 4;
    @SuppressLint({"InlinedApi"})
    public static final int f = 5;
    @SuppressLint({"InlinedApi"})
    public static final int g = 6;
    @SuppressLint({"InlinedApi"})
    public static final int h = 7;

    @FloatRange(from = 0.0, to = 360.0)
    public abstract float a(@IntRange(from = 0L) int arg1);

    @FloatRange(from = 0.0, to = 63.0)
    public abstract float b(@IntRange(from = 0L) int arg1);

    @FloatRange(from = 0.0)
    public abstract float c(@IntRange(from = 0L) int arg1);

    @FloatRange(from = 0.0, to = 63.0)
    public abstract float d(@IntRange(from = 0L) int arg1);

    public abstract int e(@IntRange(from = 0L) int arg1);

    @FloatRange(from = -90.0, to = 90.0)
    public abstract float f(@IntRange(from = 0L) int arg1);

    @IntRange(from = 0L)
    public abstract int g();

    @IntRange(from = 1L, to = 200L)
    public abstract int h(@IntRange(from = 0L) int arg1);

    public abstract boolean i(@IntRange(from = 0L) int arg1);

    public abstract boolean j(@IntRange(from = 0L) int arg1);

    public abstract boolean k(@IntRange(from = 0L) int arg1);

    public abstract boolean l(@IntRange(from = 0L) int arg1);

    public abstract boolean m(@IntRange(from = 0L) int arg1);

    @RequiresApi(24)
    public static GnssStatusCompat n(GnssStatus gnssStatus0) {
        return new GnssStatusWrapper(gnssStatus0);
    }

    @SuppressLint({"ReferencesDeprecated"})
    public static GnssStatusCompat o(GpsStatus gpsStatus0) {
        return new GpsStatusWrapper(gpsStatus0);
    }
}

