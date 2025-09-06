package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest.Builder;
import android.location.LocationRequest;
import android.os.Build.VERSION;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class LocationRequestCompat {
    static class Api19Impl {
        private static Class a;
        private static Method b;
        private static Method c;
        private static Method d;
        private static Method e;
        private static Method f;

        @SuppressLint({"BanUncheckedReflection"})
        public static Object a(LocationRequestCompat locationRequestCompat0, String s) {
            try {
                if(Api19Impl.a == null) {
                    Api19Impl.a = LocationRequest.class;
                }
                if(Api19Impl.b == null) {
                    Method method0 = Api19Impl.a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    Api19Impl.b = method0;
                    method0.setAccessible(true);
                }
                Object object0 = Api19Impl.b.invoke(null, s, locationRequestCompat0.b(), locationRequestCompat0.e(), Boolean.FALSE);
                if(object0 == null) {
                    return null;
                }
                if(Api19Impl.c == null) {
                    Method method1 = Api19Impl.a.getDeclaredMethod("setQuality", Integer.TYPE);
                    Api19Impl.c = method1;
                    method1.setAccessible(true);
                }
                Api19Impl.c.invoke(object0, locationRequestCompat0.g());
                if(Api19Impl.d == null) {
                    Method method2 = Api19Impl.a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    Api19Impl.d = method2;
                    method2.setAccessible(true);
                }
                Api19Impl.d.invoke(object0, locationRequestCompat0.f());
                if(locationRequestCompat0.d() < 0x7FFFFFFF) {
                    if(Api19Impl.e == null) {
                        Method method3 = Api19Impl.a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        Api19Impl.e = method3;
                        method3.setAccessible(true);
                    }
                    Api19Impl.e.invoke(object0, locationRequestCompat0.d());
                }
                if(locationRequestCompat0.a() < 0x7FFFFFFFFFFFFFFFL) {
                    if(Api19Impl.f == null) {
                        Method method4 = Api19Impl.a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        Api19Impl.f = method4;
                        method4.setAccessible(true);
                    }
                    Api19Impl.f.invoke(object0, locationRequestCompat0.a());
                }
                return object0;
            }
            catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException unused_ex) {
                return null;
            }
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        public static LocationRequest a(LocationRequestCompat locationRequestCompat0) {
            return new LocationRequest.Builder(locationRequestCompat0.b()).setQuality(locationRequestCompat0.g()).setMinUpdateIntervalMillis(locationRequestCompat0.f()).setDurationMillis(locationRequestCompat0.a()).setMaxUpdates(locationRequestCompat0.d()).setMinUpdateDistanceMeters(locationRequestCompat0.e()).setMaxUpdateDelayMillis(locationRequestCompat0.c()).build();
        }
    }

    public static final class Builder {
        private long a;
        private int b;
        private long c;
        private int d;
        private long e;
        private float f;
        private long g;

        public Builder(long v) {
            this.d(v);
            this.b = 102;
            this.c = 0x7FFFFFFFFFFFFFFFL;
            this.d = 0x7FFFFFFF;
            this.e = -1L;
            this.f = 0.0f;
            this.g = 0L;
        }

        public Builder(LocationRequestCompat locationRequestCompat0) {
            this.a = locationRequestCompat0.b;
            this.b = locationRequestCompat0.a;
            this.c = locationRequestCompat0.d;
            this.d = locationRequestCompat0.e;
            this.e = locationRequestCompat0.c;
            this.f = locationRequestCompat0.f;
            this.g = locationRequestCompat0.g;
        }

        public LocationRequestCompat a() {
            Preconditions.o(this.a != 0x7FFFFFFFFFFFFFFFL || this.e != -1L, "passive location requests must have an explicit minimum update interval");
            return new LocationRequestCompat(this.a, this.b, this.c, this.d, Math.min(this.e, this.a), this.f, this.g);
        }

        public Builder b() {
            this.e = -1L;
            return this;
        }

        public Builder c(@IntRange(from = 1L) long v) {
            this.c = Preconditions.h(v, 1L, 0x7FFFFFFFFFFFFFFFL, "durationMillis");
            return this;
        }

        public Builder d(@IntRange(from = 0L) long v) {
            this.a = Preconditions.h(v, 0L, 0x7FFFFFFFFFFFFFFFL, "intervalMillis");
            return this;
        }

        public Builder e(@IntRange(from = 0L) long v) {
            this.g = Preconditions.h(v, 0L, 0x7FFFFFFFFFFFFFFFL, "maxUpdateDelayMillis");
            return this;
        }

        public Builder f(@IntRange(from = 1L, to = 0x7FFFFFFFL) int v) {
            this.d = Preconditions.g(v, 1, 0x7FFFFFFF, "maxUpdates");
            return this;
        }

        public Builder g(@FloatRange(from = 0.0, to = 3.402823E+38) float f) {
            this.f = Preconditions.f(f, 0.0f, 3.402823E+38f, "minUpdateDistanceMeters");
            return this;
        }

        public Builder h(@IntRange(from = 0L) long v) {
            this.e = Preconditions.h(v, 0L, 0x7FFFFFFFFFFFFFFFL, "minUpdateIntervalMillis");
            return this;
        }

        public Builder i(int v) {
            Preconditions.c(v == 100 || v == 102 || v == 104, "quality must be a defined QUALITY constant, not %d", new Object[]{v});
            this.b = v;
            return this;
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Quality {
    }

    final int a;
    final long b;
    final long c;
    final long d;
    final int e;
    final float f;
    final long g;
    public static final long h = 0x7FFFFFFFFFFFFFFFL;
    public static final int i = 100;
    public static final int j = 102;
    public static final int k = 104;
    private static final long l = -1L;

    LocationRequestCompat(long v, int v1, long v2, int v3, long v4, float f, long v5) {
        this.b = v;
        this.a = v1;
        this.c = v4;
        this.d = v2;
        this.e = v3;
        this.f = f;
        this.g = v5;
    }

    @IntRange(from = 1L)
    public long a() {
        return this.d;
    }

    @IntRange(from = 0L)
    public long b() {
        return this.b;
    }

    @IntRange(from = 0L)
    public long c() {
        return this.g;
    }

    @IntRange(from = 1L, to = 0x7FFFFFFFL)
    public int d() {
        return this.e;
    }

    @FloatRange(from = 0.0, to = 3.402823E+38)
    public float e() {
        return this.f;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LocationRequestCompat ? this.a == ((LocationRequestCompat)object0).a && this.b == ((LocationRequestCompat)object0).b && this.c == ((LocationRequestCompat)object0).c && this.d == ((LocationRequestCompat)object0).d && this.e == ((LocationRequestCompat)object0).e && Float.compare(((LocationRequestCompat)object0).f, this.f) == 0 && this.g == ((LocationRequestCompat)object0).g : false;
    }

    @IntRange(from = 0L)
    public long f() {
        return this.c == -1L ? this.b : this.c;
    }

    public int g() {
        return this.a;
    }

    @RequiresApi(0x1F)
    public LocationRequest h() {
        return Api31Impl.a(this);
    }

    @Override
    public int hashCode() {
        return (this.a * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
    }

    @SuppressLint({"NewApi"})
    public LocationRequest i(String s) {
        return Build.VERSION.SDK_INT < 0x1F ? N.a(Api19Impl.a(this, s)) : this.h();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Request[");
        if(this.b == 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append("PASSIVE");
        }
        else {
            stringBuilder0.append("@");
            TimeUtils.e(this.b, stringBuilder0);
            switch(this.a) {
                case 100: {
                    stringBuilder0.append(" HIGH_ACCURACY");
                    break;
                }
                case 102: {
                    stringBuilder0.append(" BALANCED");
                    break;
                }
                case 104: {
                    stringBuilder0.append(" LOW_POWER");
                }
            }
        }
        if(this.d != 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append(", duration=");
            TimeUtils.e(this.d, stringBuilder0);
        }
        if(this.e != 0x7FFFFFFF) {
            stringBuilder0.append(", maxUpdates=");
            stringBuilder0.append(this.e);
        }
        if(this.c != -1L && this.c < this.b) {
            stringBuilder0.append(", minUpdateInterval=");
            TimeUtils.e(this.c, stringBuilder0);
        }
        if(((double)this.f) > 0.0) {
            stringBuilder0.append(", minUpdateDistance=");
            stringBuilder0.append(this.f);
        }
        if(this.g / 2L > this.b) {
            stringBuilder0.append(", maxUpdateDelay=");
            TimeUtils.e(this.g, stringBuilder0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

