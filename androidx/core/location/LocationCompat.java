package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public final class LocationCompat {
    @RequiresApi(26)
    static class Api26Impl {
        static float a(Location location0) {
            return location0.getBearingAccuracyDegrees();
        }

        static float b(Location location0) {
            return location0.getSpeedAccuracyMetersPerSecond();
        }

        static float c(Location location0) {
            return location0.getVerticalAccuracyMeters();
        }

        static boolean d(Location location0) {
            return location0.hasBearingAccuracy();
        }

        static boolean e(Location location0) {
            return location0.hasSpeedAccuracy();
        }

        static boolean f(Location location0) {
            return location0.hasVerticalAccuracy();
        }

        static void g(Location location0) {
            try {
                int v = LocationCompat.e().getByte(location0);
                int v1 = LocationCompat.f();
                LocationCompat.e().setByte(location0, ((byte)(v & ~v1)));
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                NoSuchFieldError noSuchFieldError0 = new NoSuchFieldError();
                noSuchFieldError0.initCause(noSuchFieldException0);
                throw noSuchFieldError0;
            }
            catch(IllegalAccessException illegalAccessException0) {
                IllegalAccessError illegalAccessError0 = new IllegalAccessError();
                illegalAccessError0.initCause(illegalAccessException0);
                throw illegalAccessError0;
            }
        }

        static void h(Location location0) {
            try {
                int v = LocationCompat.e().getByte(location0);
                int v1 = LocationCompat.g();
                LocationCompat.e().setByte(location0, ((byte)(v & ~v1)));
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                NoSuchFieldError noSuchFieldError0 = new NoSuchFieldError();
                noSuchFieldError0.initCause(noSuchFieldException0);
                throw noSuchFieldError0;
            }
            catch(IllegalAccessException illegalAccessException0) {
                IllegalAccessError illegalAccessError0 = new IllegalAccessError();
                illegalAccessError0.initCause(illegalAccessException0);
                throw illegalAccessError0;
            }
        }

        static void i(Location location0) {
            try {
                int v = LocationCompat.e().getByte(location0);
                int v1 = LocationCompat.h();
                LocationCompat.e().setByte(location0, ((byte)(v & ~v1)));
            }
            catch(NoSuchFieldException | IllegalAccessException noSuchFieldException0) {
                IllegalAccessError illegalAccessError0 = new IllegalAccessError();
                illegalAccessError0.initCause(noSuchFieldException0);
                throw illegalAccessError0;
            }
        }

        static void j(Location location0, float f) {
            location0.setBearingAccuracyDegrees(f);
        }

        static void k(Location location0, float f) {
            location0.setSpeedAccuracyMetersPerSecond(f);
        }

        static void l(Location location0, float f) {
            location0.setVerticalAccuracyMeters(f);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static void a(Location location0) {
            if(!location0.hasBearingAccuracy()) {
                return;
            }
            String s = location0.getProvider();
            long v = location0.getTime();
            long v1 = location0.getElapsedRealtimeNanos();
            double f = location0.getLatitude();
            double f1 = location0.getLongitude();
            boolean z = location0.hasAltitude();
            double f2 = location0.getAltitude();
            boolean z1 = location0.hasSpeed();
            float f3 = location0.getSpeed();
            boolean z2 = location0.hasBearing();
            float f4 = location0.getBearing();
            boolean z3 = location0.hasAccuracy();
            float f5 = location0.getAccuracy();
            boolean z4 = location0.hasVerticalAccuracy();
            float f6 = location0.getVerticalAccuracyMeters();
            boolean z5 = location0.hasSpeedAccuracy();
            float f7 = location0.getSpeedAccuracyMetersPerSecond();
            Bundle bundle0 = location0.getExtras();
            location0.reset();
            location0.setProvider(s);
            location0.setTime(v);
            location0.setElapsedRealtimeNanos(v1);
            location0.setLatitude(f);
            location0.setLongitude(f1);
            if(z) {
                location0.setAltitude(f2);
            }
            if(z1) {
                location0.setSpeed(f3);
            }
            if(z2) {
                location0.setBearing(f4);
            }
            if(z3) {
                location0.setAccuracy(f5);
            }
            if(z4) {
                location0.setVerticalAccuracyMeters(f6);
            }
            if(z5) {
                location0.setBearingAccuracyDegrees(f7);
            }
            if(bundle0 != null) {
                location0.setExtras(bundle0);
            }
        }

        static void b(Location location0) {
            if(!location0.hasSpeedAccuracy()) {
                return;
            }
            String s = location0.getProvider();
            long v = location0.getTime();
            long v1 = location0.getElapsedRealtimeNanos();
            double f = location0.getLatitude();
            double f1 = location0.getLongitude();
            boolean z = location0.hasAltitude();
            double f2 = location0.getAltitude();
            boolean z1 = location0.hasSpeed();
            float f3 = location0.getSpeed();
            boolean z2 = location0.hasBearing();
            float f4 = location0.getBearing();
            boolean z3 = location0.hasAccuracy();
            float f5 = location0.getAccuracy();
            boolean z4 = location0.hasVerticalAccuracy();
            float f6 = location0.getVerticalAccuracyMeters();
            boolean z5 = location0.hasBearingAccuracy();
            float f7 = location0.getBearingAccuracyDegrees();
            Bundle bundle0 = location0.getExtras();
            location0.reset();
            location0.setProvider(s);
            location0.setTime(v);
            location0.setElapsedRealtimeNanos(v1);
            location0.setLatitude(f);
            location0.setLongitude(f1);
            if(z) {
                location0.setAltitude(f2);
            }
            if(z1) {
                location0.setSpeed(f3);
            }
            if(z2) {
                location0.setBearing(f4);
            }
            if(z3) {
                location0.setAccuracy(f5);
            }
            if(z4) {
                location0.setVerticalAccuracyMeters(f6);
            }
            if(z5) {
                location0.setBearingAccuracyDegrees(f7);
            }
            if(bundle0 != null) {
                location0.setExtras(bundle0);
            }
        }

        static void c(Location location0) {
            if(!location0.hasVerticalAccuracy()) {
                return;
            }
            String s = location0.getProvider();
            long v = location0.getTime();
            long v1 = location0.getElapsedRealtimeNanos();
            double f = location0.getLatitude();
            double f1 = location0.getLongitude();
            boolean z = location0.hasAltitude();
            double f2 = location0.getAltitude();
            boolean z1 = location0.hasSpeed();
            float f3 = location0.getSpeed();
            boolean z2 = location0.hasBearing();
            float f4 = location0.getBearing();
            boolean z3 = location0.hasAccuracy();
            float f5 = location0.getAccuracy();
            boolean z4 = location0.hasSpeedAccuracy();
            float f6 = location0.getSpeedAccuracyMetersPerSecond();
            boolean z5 = location0.hasBearingAccuracy();
            float f7 = location0.getBearingAccuracyDegrees();
            Bundle bundle0 = location0.getExtras();
            location0.reset();
            location0.setProvider(s);
            location0.setTime(v);
            location0.setElapsedRealtimeNanos(v1);
            location0.setLatitude(f);
            location0.setLongitude(f1);
            if(z) {
                location0.setAltitude(f2);
            }
            if(z1) {
                location0.setSpeed(f3);
            }
            if(z2) {
                location0.setBearing(f4);
            }
            if(z3) {
                location0.setAccuracy(f5);
            }
            if(z4) {
                location0.setSpeedAccuracyMetersPerSecond(f6);
            }
            if(z5) {
                location0.setBearingAccuracyDegrees(f7);
            }
            if(bundle0 != null) {
                location0.setExtras(bundle0);
            }
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static void a(Location location0) {
            if(!location0.hasBearingAccuracy()) {
                return;
            }
            double f = location0.getElapsedRealtimeUncertaintyNanos();
            Api28Impl.a(location0);
            location0.setElapsedRealtimeUncertaintyNanos(f);
        }

        static void b(Location location0) {
            if(!location0.hasSpeedAccuracy()) {
                return;
            }
            double f = location0.getElapsedRealtimeUncertaintyNanos();
            Api28Impl.b(location0);
            location0.setElapsedRealtimeUncertaintyNanos(f);
        }

        static void c(Location location0) {
            if(!location0.hasVerticalAccuracy()) {
                return;
            }
            double f = location0.getElapsedRealtimeUncertaintyNanos();
            Api28Impl.c(location0);
            location0.setElapsedRealtimeUncertaintyNanos(f);
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        static boolean a(Location location0) {
            return location0.isMock();
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        static void a(Location location0) {
            location0.removeBearingAccuracy();
        }

        static void b(Location location0) {
            location0.removeSpeedAccuracy();
        }

        static void c(Location location0) {
            location0.removeVerticalAccuracy();
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        static float a(Location location0) {
            return location0.getMslAltitudeAccuracyMeters();
        }

        static double b(Location location0) {
            return location0.getMslAltitudeMeters();
        }

        static boolean c(Location location0) {
            return location0.hasMslAltitude();
        }

        static boolean d(Location location0) {
            return location0.hasMslAltitudeAccuracy();
        }

        static void e(Location location0) {
            location0.removeMslAltitude();
        }

        static void f(Location location0) {
            location0.removeMslAltitudeAccuracy();
        }

        static void g(Location location0, float f) {
            location0.setMslAltitudeAccuracyMeters(f);
        }

        static void h(Location location0, double f) {
            location0.setMslAltitudeMeters(f);
        }
    }

    public static final String a = "mockLocation";
    public static final String b = "verticalAccuracy";
    public static final String c = "speedAccuracy";
    public static final String d = "bearingAccuracy";
    public static final String e = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final String f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    private static Method g;
    private static Field h;
    private static Integer i;
    private static Integer j;
    private static Integer k;

    public static void A(Location location0, float f) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.j(location0, f);
            return;
        }
        LocationCompat.k(location0).putFloat("bearingAccuracy", f);
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void B(Location location0, boolean z) {
        try {
            LocationCompat.l().invoke(location0, Boolean.valueOf(z));
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            NoSuchMethodError noSuchMethodError0 = new NoSuchMethodError();
            noSuchMethodError0.initCause(noSuchMethodException0);
            throw noSuchMethodError0;
        }
        catch(IllegalAccessException illegalAccessException0) {
            IllegalAccessError illegalAccessError0 = new IllegalAccessError();
            illegalAccessError0.initCause(illegalAccessException0);
            throw illegalAccessError0;
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }

    public static void C(Location location0, @FloatRange(from = 0.0) float f) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.g(location0, f);
            return;
        }
        LocationCompat.k(location0).putFloat("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY", f);
    }

    public static void D(Location location0, double f) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.h(location0, f);
            return;
        }
        LocationCompat.k(location0).putDouble("androidx.core.location.extra.MSL_ALTITUDE", f);
    }

    public static void E(Location location0, float f) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.k(location0, f);
            return;
        }
        LocationCompat.k(location0).putFloat("speedAccuracy", f);
    }

    public static void F(Location location0, float f) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.l(location0, f);
            return;
        }
        LocationCompat.k(location0).putFloat("verticalAccuracy", f);
    }

    private static boolean a(Location location0, String s) {
        Bundle bundle0 = location0.getExtras();
        return bundle0 != null && bundle0.containsKey(s);
    }

    public static float b(Location location0) {
        if(Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.a(location0);
        }
        Bundle bundle0 = location0.getExtras();
        return bundle0 == null ? 0.0f : bundle0.getFloat("bearingAccuracy", 0.0f);
    }

    public static long c(Location location0) {
        return TimeUnit.NANOSECONDS.toMillis(location0.getElapsedRealtimeNanos());
    }

    @ReplaceWith(expression = "location.getElapsedRealtimeNanos()")
    @Deprecated
    public static long d(Location location0) {
        return location0.getElapsedRealtimeNanos();
    }

    @SuppressLint({"BlockedPrivateApi"})
    static Field e() throws NoSuchFieldException {
        if(LocationCompat.h == null) {
            Field field0 = Location.class.getDeclaredField("mFieldsMask");
            LocationCompat.h = field0;
            field0.setAccessible(true);
        }
        return LocationCompat.h;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static int f() throws NoSuchFieldException, IllegalAccessException {
        if(LocationCompat.j == null) {
            Field field0 = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            field0.setAccessible(true);
            LocationCompat.j = field0.getInt(null);
        }
        return (int)LocationCompat.j;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static int g() throws NoSuchFieldException, IllegalAccessException {
        if(LocationCompat.i == null) {
            Field field0 = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            field0.setAccessible(true);
            LocationCompat.i = field0.getInt(null);
        }
        return (int)LocationCompat.i;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static int h() throws NoSuchFieldException, IllegalAccessException {
        if(LocationCompat.k == null) {
            Field field0 = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            field0.setAccessible(true);
            LocationCompat.k = field0.getInt(null);
        }
        return (int)LocationCompat.k;
    }

    @FloatRange(from = 0.0)
    public static float i(Location location0) {
        return Build.VERSION.SDK_INT < 34 ? LocationCompat.k(location0).getFloat("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY") : Api34Impl.a(location0);
    }

    public static double j(Location location0) {
        return Build.VERSION.SDK_INT < 34 ? LocationCompat.k(location0).getDouble("androidx.core.location.extra.MSL_ALTITUDE") : Api34Impl.b(location0);
    }

    private static Bundle k(Location location0) {
        Bundle bundle0 = location0.getExtras();
        if(bundle0 == null) {
            location0.setExtras(new Bundle());
            return location0.getExtras();
        }
        return bundle0;
    }

    private static Method l() throws NoSuchMethodException {
        if(LocationCompat.g == null) {
            Method method0 = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            LocationCompat.g = method0;
            method0.setAccessible(true);
        }
        return LocationCompat.g;
    }

    public static float m(Location location0) {
        if(Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.b(location0);
        }
        Bundle bundle0 = location0.getExtras();
        return bundle0 == null ? 0.0f : bundle0.getFloat("speedAccuracy", 0.0f);
    }

    public static float n(Location location0) {
        if(Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.c(location0);
        }
        Bundle bundle0 = location0.getExtras();
        return bundle0 == null ? 0.0f : bundle0.getFloat("verticalAccuracy", 0.0f);
    }

    public static boolean o(Location location0) {
        return Build.VERSION.SDK_INT < 26 ? LocationCompat.a(location0, "bearingAccuracy") : Api26Impl.d(location0);
    }

    public static boolean p(Location location0) {
        return Build.VERSION.SDK_INT < 34 ? LocationCompat.a(location0, "androidx.core.location.extra.MSL_ALTITUDE") : Api34Impl.c(location0);
    }

    public static boolean q(Location location0) {
        return Build.VERSION.SDK_INT < 34 ? LocationCompat.a(location0, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY") : Api34Impl.d(location0);
    }

    public static boolean r(Location location0) {
        return Build.VERSION.SDK_INT < 26 ? LocationCompat.a(location0, "speedAccuracy") : Api26Impl.e(location0);
    }

    public static boolean s(Location location0) {
        return Build.VERSION.SDK_INT < 26 ? LocationCompat.a(location0, "verticalAccuracy") : Api26Impl.f(location0);
    }

    public static boolean t(Location location0) {
        return Build.VERSION.SDK_INT < 0x1F ? location0.isFromMockProvider() : Api31Impl.a(location0);
    }

    public static void u(Location location0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            Api33Impl.a(location0);
            return;
        }
        if(v >= 29) {
            Api29Impl.a(location0);
            return;
        }
        if(v >= 28) {
            Api28Impl.a(location0);
            return;
        }
        if(v >= 26) {
            Api26Impl.g(location0);
            return;
        }
        LocationCompat.v(location0, "bearingAccuracy");
    }

    private static void v(Location location0, String s) {
        Bundle bundle0 = location0.getExtras();
        if(bundle0 != null) {
            bundle0.remove(s);
            if(bundle0.isEmpty()) {
                location0.setExtras(null);
            }
        }
    }

    public static void w(Location location0) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.e(location0);
            return;
        }
        LocationCompat.v(location0, "androidx.core.location.extra.MSL_ALTITUDE");
    }

    public static void x(Location location0) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.f(location0);
            return;
        }
        LocationCompat.v(location0, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY");
    }

    public static void y(Location location0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            Api33Impl.b(location0);
            return;
        }
        if(v >= 29) {
            Api29Impl.b(location0);
            return;
        }
        if(v >= 28) {
            Api28Impl.b(location0);
            return;
        }
        if(v >= 26) {
            Api26Impl.h(location0);
            return;
        }
        LocationCompat.v(location0, "speedAccuracy");
    }

    public static void z(Location location0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            Api33Impl.c(location0);
            return;
        }
        if(v >= 29) {
            Api29Impl.c(location0);
            return;
        }
        if(v >= 28) {
            Api28Impl.c(location0);
            return;
        }
        if(v >= 26) {
            Api26Impl.i(location0);
            return;
        }
        LocationCompat.v(location0, "verticalAccuracy");
    }
}

