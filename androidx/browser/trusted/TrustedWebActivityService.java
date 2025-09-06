package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.b.b;
import androidx.annotation.BinderThread;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;

public abstract class TrustedWebActivityService extends Service {
    private NotificationManager a;
    int b;
    private final b c;
    @SuppressLint({"ActionValue", "ServiceName"})
    public static final String d = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String e = "android.support.customtabs.trusted.SMALL_ICON";
    public static final String f = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String g = "androidx.browser.trusted.SUCCESS";
    public static final int h = -1;

    public TrustedWebActivityService() {
        this.b = -1;
        this.c = new b() {
            final TrustedWebActivityService h;

            @Override  // android.support.customtabs.trusted.b
            @RequiresPermission("android.permission.POST_NOTIFICATIONS")
            public Bundle G(Bundle bundle0) {
                this.j1();
                NotifyNotificationArgs trustedWebActivityServiceConnection$NotifyNotificationArgs0 = NotifyNotificationArgs.a(bundle0);
                return new ResultArgs(TrustedWebActivityService.this.j(trustedWebActivityServiceConnection$NotifyNotificationArgs0.a, trustedWebActivityServiceConnection$NotifyNotificationArgs0.b, trustedWebActivityServiceConnection$NotifyNotificationArgs0.c, trustedWebActivityServiceConnection$NotifyNotificationArgs0.d)).b();
            }

            @Override  // android.support.customtabs.trusted.b
            public Bundle I0() {
                this.j1();
                return new ActiveNotificationsArgs(TrustedWebActivityService.this.g()).b();
            }

            @Override  // android.support.customtabs.trusted.b
            public int X0() {
                this.j1();
                return TrustedWebActivityService.this.i();
            }

            @Override  // android.support.customtabs.trusted.b
            public Bundle Y0(Bundle bundle0) {
                this.j1();
                NotificationsEnabledArgs trustedWebActivityServiceConnection$NotificationsEnabledArgs0 = NotificationsEnabledArgs.a(bundle0);
                return new ResultArgs(TrustedWebActivityService.this.d(trustedWebActivityServiceConnection$NotificationsEnabledArgs0.a)).b();
            }

            @Override  // android.support.customtabs.trusted.b
            public void Z0(Bundle bundle0) {
                this.j1();
                CancelNotificationArgs trustedWebActivityServiceConnection$CancelNotificationArgs0 = CancelNotificationArgs.a(bundle0);
                TrustedWebActivityService.this.e(trustedWebActivityServiceConnection$CancelNotificationArgs0.a, trustedWebActivityServiceConnection$CancelNotificationArgs0.b);
            }

            private void j1() {
                TrustedWebActivityService trustedWebActivityService0 = TrustedWebActivityService.this;
                if(trustedWebActivityService0.b == -1) {
                    String[] arr_s = trustedWebActivityService0.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                    if(arr_s == null) {
                        arr_s = new String[0];
                    }
                    Token token0 = TrustedWebActivityService.this.c().w();
                    PackageManager packageManager0 = TrustedWebActivityService.this.getPackageManager();
                    if(token0 != null) {
                        for(int v = 0; v < arr_s.length; ++v) {
                            if(token0.c(arr_s[v], packageManager0)) {
                                TrustedWebActivityService.this.b = Binder.getCallingUid();
                                break;
                            }
                        }
                    }
                }
                if(TrustedWebActivityService.this.b != Binder.getCallingUid()) {
                    throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
                }
            }

            @Override  // android.support.customtabs.trusted.b
            public Bundle q0(String s, Bundle bundle0, IBinder iBinder0) {
                this.j1();
                TrustedWebActivityCallbackRemote.a(iBinder0);
                return null;
            }

            @Override  // android.support.customtabs.trusted.b
            public Bundle t0() {
                this.j1();
                return TrustedWebActivityService.this.h();
            }
        };
    }

    private static String a(String s) {
        return s.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void b() {
        if(this.a == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @BinderThread
    @NonNull
    public abstract TokenStore c();

    @BinderThread
    public boolean d(@NonNull String s) {
        this.b();
        if(!NotificationManagerCompat.q(this).a()) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 26 ? NotificationApiHelperForO.b(this.a, TrustedWebActivityService.a(s)) : true;
    }

    @BinderThread
    public void e(@NonNull String s, int v) {
        this.b();
        this.a.cancel(s, v);
    }

    @BinderThread
    @Nullable
    public Bundle f(@NonNull String s, @NonNull Bundle bundle0, @Nullable TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote0) [...] // Inlined contents

    @BinderThread
    @NonNull
    @RestrictTo({Scope.a})
    public Parcelable[] g() {
        this.b();
        if(Build.VERSION.SDK_INT < 23) {
            throw new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
        }
        return NotificationApiHelperForM.a(this.a);
    }

    @BinderThread
    @NonNull
    public Bundle h() {
        int v = this.i();
        Bundle bundle0 = new Bundle();
        if(v == -1) {
            return bundle0;
        }
        bundle0.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(this.getResources(), v));
        return bundle0;
    }

    @BinderThread
    public int i() {
        try {
            Bundle bundle0 = this.getPackageManager().getServiceInfo(new ComponentName(this, this.getClass()), 0x80).metaData;
            return bundle0 == null ? -1 : bundle0.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return -1;
        }
    }

    @BinderThread
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public boolean j(@NonNull String s, int v, @NonNull Notification notification0, @NonNull String s1) {
        this.b();
        if(!NotificationManagerCompat.q(this).a()) {
            return false;
        }
        if(Build.VERSION.SDK_INT >= 26) {
            String s2 = TrustedWebActivityService.a(s1);
            notification0 = NotificationApiHelperForO.a(this, this.a, notification0, s2, s1);
            if(!NotificationApiHelperForO.b(this.a, s2)) {
                return false;
            }
        }
        this.a.notify(s, v, notification0);
        return true;
    }

    @Override  // android.app.Service
    @MainThread
    @Nullable
    public final IBinder onBind(@Nullable Intent intent0) {
        return this.c;
    }

    @Override  // android.app.Service
    @CallSuper
    @MainThread
    public void onCreate() {
        super.onCreate();
        this.a = (NotificationManager)this.getSystemService("notification");
    }

    @Override  // android.app.Service
    @MainThread
    public final boolean onUnbind(@Nullable Intent intent0) {
        this.b = -1;
        return super.onUnbind(intent0);
    }
}

