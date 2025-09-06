package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ServiceCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static void a(Service service0, int v) {
            service0.stopForeground(v);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static void a(Service service0, int v, Notification notification0, int v1) {
            if(v1 != -1 && v1 != 0) {
                service0.startForeground(v, notification0, v1 & 0xFF);
                return;
            }
            service0.startForeground(v, notification0, v1);
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        static void a(Service service0, int v, Notification notification0, int v1) {
            if(v1 != -1 && v1 != 0) {
                service0.startForeground(v, notification0, v1 & 0x40000FFF);
                return;
            }
            service0.startForeground(v, notification0, v1);
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    public static final int a = 1;
    public static final int b = 1;
    public static final int c = 2;
    private static final int d = 0xFF;
    private static final int e = 0x40000FFF;

    public static void a(Service service0, int v, Notification notification0, int v1) {
        int v2 = Build.VERSION.SDK_INT;
        if(v2 >= 34) {
            Api34Impl.a(service0, v, notification0, v1);
            return;
        }
        if(v2 >= 29) {
            Api29Impl.a(service0, v, notification0, v1);
            return;
        }
        service0.startForeground(v, notification0);
    }

    public static void b(Service service0, int v) {
        boolean z = true;
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.a(service0, v);
            return;
        }
        if((v & 1) == 0) {
            z = false;
        }
        service0.stopForeground(z);
    }
}

