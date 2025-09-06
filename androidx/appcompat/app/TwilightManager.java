package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

class TwilightManager {
    static class TwilightState {
        boolean a;
        long b;

    }

    private final Context a;
    private final LocationManager b;
    private final TwilightState c;
    private static final String d = "TwilightManager";
    private static final int e = 6;
    private static final int f = 22;
    private static TwilightManager g;

    @VisibleForTesting
    TwilightManager(@NonNull Context context0, @NonNull LocationManager locationManager0) {
        this.c = new TwilightState();
        this.a = context0;
        this.b = locationManager0;
    }

    static TwilightManager a(@NonNull Context context0) {
        if(TwilightManager.g == null) {
            Context context1 = context0.getApplicationContext();
            TwilightManager.g = new TwilightManager(context1, ((LocationManager)context1.getSystemService("location")));
        }
        return TwilightManager.g;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location0 = null;
        Location location1 = PermissionChecker.d(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? this.c("network") : null;
        if(PermissionChecker.d(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location0 = this.c("gps");
        }
        if(location0 != null && location1 != null) {
            return location0.getTime() <= location1.getTime() ? location1 : location0;
        }
        return location0 == null ? location1 : location0;
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location c(String s) {
        try {
            if(this.b.isProviderEnabled(s)) {
                return this.b.getLastKnownLocation(s);
            }
        }
        catch(Exception exception0) {
            Log.d("TwilightManager", "Failed to get last known location", exception0);
        }
        return null;
    }

    boolean d() {
        TwilightState twilightManager$TwilightState0 = this.c;
        if(this.e()) {
            return twilightManager$TwilightState0.a;
        }
        Location location0 = this.b();
        if(location0 != null) {
            this.g(location0);
            return twilightManager$TwilightState0.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int v = Calendar.getInstance().get(11);
        return v < 6 || v >= 22;
    }

    private boolean e() {
        return this.c.b > System.currentTimeMillis();
    }

    @VisibleForTesting
    static void f(TwilightManager twilightManager0) {
        TwilightManager.g = twilightManager0;
    }

    private void g(@NonNull Location location0) {
        long v4;
        TwilightState twilightManager$TwilightState0 = this.c;
        long v = System.currentTimeMillis();
        TwilightCalculator twilightCalculator0 = TwilightCalculator.b();
        twilightCalculator0.a(v - 86400000L, location0.getLatitude(), location0.getLongitude());
        twilightCalculator0.a(v, location0.getLatitude(), location0.getLongitude());
        boolean z = twilightCalculator0.c == 1;
        long v1 = twilightCalculator0.b;
        long v2 = twilightCalculator0.a;
        twilightCalculator0.a(v + 86400000L, location0.getLatitude(), location0.getLongitude());
        long v3 = twilightCalculator0.b;
        if(v1 == -1L || v2 == -1L) {
            v4 = v + 43200000L;
        }
        else {
            if(v <= v2) {
                v3 = v <= v1 ? v1 : v2;
            }
            v4 = v3 + 60000L;
        }
        twilightManager$TwilightState0.a = z;
        twilightManager$TwilightState0.b = v4;
    }
}

