package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import android.service.quicksettings.TileService;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public class TileServiceCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static void a(TileService tileService0, Intent intent0) {
            tileService0.startActivityAndCollapse(intent0);
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        static void a(TileService tileService0, PendingIntent pendingIntent0) {
            tileService0.startActivityAndCollapse(pendingIntent0);
        }
    }

    interface TileServiceWrapper {
        void a(Intent arg1);

        void b(PendingIntent arg1);
    }

    private static TileServiceWrapper a;

    @RestrictTo({Scope.a})
    public static void a() {
        TileServiceCompat.a = null;
    }

    @RestrictTo({Scope.a})
    public static void b(TileServiceWrapper tileServiceCompat$TileServiceWrapper0) {
        TileServiceCompat.a = tileServiceCompat$TileServiceWrapper0;
    }

    public static void c(TileService tileService0, PendingIntentActivityWrapper pendingIntentActivityWrapper0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            TileServiceWrapper tileServiceCompat$TileServiceWrapper0 = TileServiceCompat.a;
            if(tileServiceCompat$TileServiceWrapper0 != null) {
                tileServiceCompat$TileServiceWrapper0.b(pendingIntentActivityWrapper0.f());
                return;
            }
            Api34Impl.a(tileService0, pendingIntentActivityWrapper0.f());
            return;
        }
        if(v >= 24) {
            TileServiceWrapper tileServiceCompat$TileServiceWrapper1 = TileServiceCompat.a;
            if(tileServiceCompat$TileServiceWrapper1 != null) {
                tileServiceCompat$TileServiceWrapper1.a(pendingIntentActivityWrapper0.d());
                return;
            }
            Api24Impl.a(tileService0, pendingIntentActivityWrapper0.d());
        }
    }
}

