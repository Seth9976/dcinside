package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import java.util.List;

public final class m {
    public static void a(LocationListenerCompat locationListenerCompat0, int v) {
    }

    public static void b(LocationListenerCompat locationListenerCompat0, List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            locationListenerCompat0.onLocationChanged(((Location)list0.get(v1)));
        }
    }

    public static void c(LocationListenerCompat locationListenerCompat0, String s) {
    }

    public static void d(LocationListenerCompat locationListenerCompat0, String s) {
    }

    public static void e(LocationListenerCompat locationListenerCompat0, String s, int v, Bundle bundle0) {
    }
}

