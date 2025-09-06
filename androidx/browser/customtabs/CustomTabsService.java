package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.a;
import android.support.customtabs.b.b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    final SimpleArrayMap a;
    private b b;
    public static final String c = "android.support.customtabs.action.CustomTabsService";
    public static final String d = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String e = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String f = "androidx.browser.trusted.category.TrustedWebActivities";
    public static final String g = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final String h = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String i = "android.support.customtabs.otherurls.URL";
    public static final String j = "androidx.browser.customtabs.SUCCESS";
    public static final int k = 0;
    public static final int l = -1;
    public static final int m = -2;
    public static final int n = -3;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 1;
    private static final String r = "CustomTabsService";

    public CustomTabsService() {
        this.a = new SimpleArrayMap();
        this.b = new b() {
            final CustomTabsService n;

            @Override  // android.support.customtabs.b
            public boolean F(@NonNull a a0, @NonNull IBinder iBinder0, @NonNull Bundle bundle0) {
                EngagementSignalsCallbackRemote.a(iBinder0);
                new CustomTabsSessionToken(a0, this.k1(bundle0));
                return false;
            }

            @Override  // android.support.customtabs.b
            public boolean H(@NonNull a a0, @Nullable Bundle bundle0) {
                CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(a0, this.k1(bundle0));
                return CustomTabsService.this.k(customTabsSessionToken0, bundle0);
            }

            @Override  // android.support.customtabs.b
            public boolean L(@Nullable a a0, @Nullable Uri uri0, @Nullable Bundle bundle0, @Nullable List list0) {
                CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(a0, this.k1(bundle0));
                return CustomTabsService.this.d(customTabsSessionToken0, uri0, bundle0, list0);
            }

            @Override  // android.support.customtabs.b
            public boolean M(long v) {
                return CustomTabsService.this.m(v);
            }

            @Override  // android.support.customtabs.b
            public int O(@NonNull a a0, @NonNull String s, @Nullable Bundle bundle0) {
                CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(a0, this.k1(bundle0));
                return CustomTabsService.this.f(customTabsSessionToken0, s, bundle0);
            }

            @Override  // android.support.customtabs.b
            public boolean b1(@NonNull a a0, @NonNull Uri uri0) {
                CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(a0, null);
                Bundle bundle0 = new Bundle();
                return CustomTabsService.this.i(customTabsSessionToken0, uri0, null, bundle0);
            }

            @Override  // android.support.customtabs.b
            public boolean f(@NonNull a a0, int v, @NonNull Uri uri0, @Nullable Bundle bundle0) {
                CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(a0, this.k1(bundle0));
                return CustomTabsService.this.l(customTabsSessionToken0, v, uri0, bundle0);
            }

            @Override  // android.support.customtabs.b
            public boolean f1(a a0, @NonNull Bundle bundle0) {
                new CustomTabsSessionToken(a0, this.k1(bundle0));
                return false;
            }

            @Override  // android.support.customtabs.b
            public boolean g0(@NonNull a a0) {
                return this.n1(a0, null);
            }

            @Override  // android.support.customtabs.b
            public boolean j(@NonNull a a0, @NonNull Uri uri0, int v, @Nullable Bundle bundle0) {
                CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(a0, this.k1(bundle0));
                return CustomTabsService.this.g(customTabsSessionToken0, uri0, v, bundle0);
            }

            @Nullable
            private PendingIntent k1(@Nullable Bundle bundle0) {
                if(bundle0 == null) {
                    return null;
                }
                PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("android.support.customtabs.extra.SESSION_ID");
                bundle0.remove("android.support.customtabs.extra.SESSION_ID");
                return pendingIntent0;
            }

            @Nullable
            private Uri l1(@Nullable Bundle bundle0) {
                if(bundle0 == null) {
                    return null;
                }
                return Build.VERSION.SDK_INT < 33 ? ((Uri)bundle0.getParcelable("target_origin")) : ((Uri)Api33Impl.a(bundle0, "target_origin", Uri.class));
            }

            // 检测为 Lambda 实现
            private void m1(CustomTabsSessionToken customTabsSessionToken0) [...]

            private boolean n1(@NonNull a a0, @Nullable PendingIntent pendingIntent0) {
                CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(a0, pendingIntent0);
                try {
                    androidx.browser.customtabs.a a1 = () -> CustomTabsService.this.a(customTabsSessionToken0);
                    synchronized(CustomTabsService.this.a) {
                        a0.asBinder().linkToDeath(a1, 0);
                        IBinder iBinder0 = a0.asBinder();
                        CustomTabsService.this.a.put(iBinder0, a1);
                    }
                    return CustomTabsService.this.e(customTabsSessionToken0);
                }
                catch(RemoteException unused_ex) {
                    return false;
                }
            }

            @Override  // android.support.customtabs.b
            public Bundle o0(@NonNull String s, @Nullable Bundle bundle0) {
                return CustomTabsService.this.b(s, bundle0);
            }

            @Override  // android.support.customtabs.b
            public boolean w0(@NonNull a a0, @NonNull Uri uri0, @NonNull Bundle bundle0) {
                CustomTabsSessionToken customTabsSessionToken0 = new CustomTabsSessionToken(a0, this.k1(bundle0));
                Uri uri1 = this.l1(bundle0);
                return CustomTabsService.this.i(customTabsSessionToken0, uri0, uri1, bundle0);
            }

            @Override  // android.support.customtabs.b
            public boolean x0(@NonNull a a0, @Nullable Bundle bundle0) {
                return this.n1(a0, this.k1(bundle0));
            }
        };
    }

    protected boolean a(@NonNull CustomTabsSessionToken customTabsSessionToken0) {
        try {
            SimpleArrayMap simpleArrayMap0 = this.a;
            synchronized(simpleArrayMap0) {
                IBinder iBinder0 = customTabsSessionToken0.c();
                if(iBinder0 == null) {
                    return false;
                }
                iBinder0.unlinkToDeath(((IBinder.DeathRecipient)this.a.get(iBinder0)), 0);
                this.a.remove(iBinder0);
                return true;
            }
        }
        catch(NoSuchElementException unused_ex) {
            return false;
        }
    }

    @Nullable
    protected abstract Bundle b(@NonNull String arg1, @Nullable Bundle arg2);

    protected boolean c(@NonNull CustomTabsSessionToken customTabsSessionToken0, @NonNull Bundle bundle0) [...] // Inlined contents

    protected abstract boolean d(@NonNull CustomTabsSessionToken arg1, @Nullable Uri arg2, @Nullable Bundle arg3, @Nullable List arg4);

    protected abstract boolean e(@NonNull CustomTabsSessionToken arg1);

    protected abstract int f(@NonNull CustomTabsSessionToken arg1, @NonNull String arg2, @Nullable Bundle arg3);

    protected abstract boolean g(@NonNull CustomTabsSessionToken arg1, @NonNull Uri arg2, int arg3, @Nullable Bundle arg4);

    protected abstract boolean h(@NonNull CustomTabsSessionToken arg1, @NonNull Uri arg2);

    protected boolean i(@NonNull CustomTabsSessionToken customTabsSessionToken0, @NonNull Uri uri0, @Nullable Uri uri1, @NonNull Bundle bundle0) {
        return this.h(customTabsSessionToken0, uri0);
    }

    protected boolean j(@NonNull CustomTabsSessionToken customTabsSessionToken0, @NonNull EngagementSignalsCallback engagementSignalsCallback0, @NonNull Bundle bundle0) [...] // Inlined contents

    protected abstract boolean k(@NonNull CustomTabsSessionToken arg1, @Nullable Bundle arg2);

    protected abstract boolean l(@NonNull CustomTabsSessionToken arg1, int arg2, @NonNull Uri arg3, @Nullable Bundle arg4);

    protected abstract boolean m(long arg1);

    @Override  // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent0) {
        return this.b;
    }
}

