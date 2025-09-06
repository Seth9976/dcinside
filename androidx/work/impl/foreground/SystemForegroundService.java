package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;

@RestrictTo({Scope.b})
public class SystemForegroundService extends LifecycleService implements Callback {
    @RequiresApi(29)
    static class Api29Impl {
        static void a(Service service0, int v, Notification notification0, int v1) {
            service0.startForeground(v, notification0, v1);
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        static void a(Service service0, int v, Notification notification0, int v1) {
            try {
                service0.startForeground(v, notification0, v1);
            }
            catch(ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException0) {
                Logger.e().m("WM-SystemFgService", "Unable to start foreground service", foregroundServiceStartNotAllowedException0);
            }
            catch(SecurityException securityException0) {
                Logger.e().m("WM-SystemFgService", "Unable to start foreground service", securityException0);
            }
        }
    }

    private boolean b;
    SystemForegroundDispatcher c;
    NotificationManager d;
    private static final String e;
    @Nullable
    private static SystemForegroundService f;

    static {
        SystemForegroundService.e = "WM-SystemFgService";
        SystemForegroundService.f = null;
    }

    @Override  // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    @MainThread
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void a(int v, @NonNull Notification notification0) {
        this.d.notify(v, notification0);
    }

    @Override  // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    @MainThread
    public void c(int v, int v1, @NonNull Notification notification0) {
        int v2 = Build.VERSION.SDK_INT;
        if(v2 >= 0x1F) {
            Api31Impl.a(this, v, notification0, v1);
            return;
        }
        if(v2 >= 29) {
            Api29Impl.a(this, v, notification0, v1);
            return;
        }
        this.startForeground(v, notification0);
    }

    @Override  // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    @MainThread
    public void d(int v) {
        this.d.cancel(v);
    }

    // 去混淆评级： 低(20)
    static String e() [...] // 潜在的解密器

    @Nullable
    public static SystemForegroundService f() {
        return SystemForegroundService.f;
    }

    @MainThread
    private void g() {
        this.d = (NotificationManager)this.getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher0 = new SystemForegroundDispatcher(this.getApplicationContext());
        this.c = systemForegroundDispatcher0;
        systemForegroundDispatcher0.p(this);
    }

    @Override  // androidx.lifecycle.LifecycleService
    public void onCreate() {
        super.onCreate();
        SystemForegroundService.f = this;
        this.g();
    }

    @Override  // androidx.lifecycle.LifecycleService
    public void onDestroy() {
        super.onDestroy();
        this.c.m();
    }

    @Override  // androidx.lifecycle.LifecycleService
    public int onStartCommand(@Nullable Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        if(this.b) {
            Logger.e().f("WM-SystemFgService", "Re-initializing SystemForegroundService after a request to shut-down.");
            this.c.m();
            this.g();
            this.b = false;
        }
        if(intent0 != null) {
            this.c.n(intent0);
        }
        return 3;
    }

    @Override  // android.app.Service
    public void onTimeout(int v) {
        if(Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.o(v, 0x800);
    }

    @Override  // android.app.Service
    public void onTimeout(int v, int v1) {
        this.c.o(v, v1);
    }

    @Override  // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    @MainThread
    public void stop() {
        this.b = true;
        Logger.e().a("WM-SystemFgService", "Shutting down.");
        if(Build.VERSION.SDK_INT >= 26) {
            this.stopForeground(true);
        }
        SystemForegroundService.f = null;
        this.stopSelf();
    }
}

