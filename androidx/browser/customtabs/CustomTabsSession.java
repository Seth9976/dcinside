package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.a;
import android.support.customtabs.b.b;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.concurrent.Executor;

public final class CustomTabsSession {
    static class MockSession extends b {
        @Override  // android.support.customtabs.b
        public boolean F(a a0, IBinder iBinder0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean H(a a0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean L(a a0, Uri uri0, Bundle bundle0, List list0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean M(long v) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public int O(a a0, String s, Bundle bundle0) throws RemoteException {
            return 0;
        }

        @Override  // android.support.customtabs.b
        public boolean b1(a a0, Uri uri0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean f(a a0, int v, Uri uri0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean f1(a a0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean g0(a a0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean j(a a0, Uri uri0, int v, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public Bundle o0(String s, Bundle bundle0) throws RemoteException {
            return null;
        }

        @Override  // android.support.customtabs.b
        public boolean w0(a a0, Uri uri0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean x0(a a0, Bundle bundle0) throws RemoteException {
            return false;
        }
    }

    @RestrictTo({Scope.a})
    public static class PendingSession {
        @Nullable
        private final CustomTabsCallback a;
        @Nullable
        private final PendingIntent b;

        PendingSession(@Nullable CustomTabsCallback customTabsCallback0, @Nullable PendingIntent pendingIntent0) {
            this.a = customTabsCallback0;
            this.b = pendingIntent0;
        }

        @Nullable
        CustomTabsCallback a() {
            return this.a;
        }

        @Nullable
        PendingIntent b() {
            return this.b;
        }
    }

    private final Object a;
    private final android.support.customtabs.b b;
    private final a c;
    private final ComponentName d;
    @Nullable
    private final PendingIntent e;
    private static final String f = "CustomTabsSession";
    static final String g = "target_origin";

    CustomTabsSession(android.support.customtabs.b b0, a a0, ComponentName componentName0, @Nullable PendingIntent pendingIntent0) {
        this.a = new Object();
        this.b = b0;
        this.c = a0;
        this.d = componentName0;
        this.e = pendingIntent0;
    }

    private void a(Bundle bundle0) {
        PendingIntent pendingIntent0 = this.e;
        if(pendingIntent0 != null) {
            bundle0.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent0);
        }
    }

    private Bundle b(@Nullable Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        if(bundle0 != null) {
            bundle1.putAll(bundle0);
        }
        this.a(bundle1);
        return bundle1;
    }

    private android.support.customtabs.c.b c(@NonNull EngagementSignalsCallback engagementSignalsCallback0) {
        return new android.support.customtabs.c.b() {
            private final Handler d;
            final CustomTabsSession f;

            {
                EngagementSignalsCallback engagementSignalsCallback0 = engagementSignalsCallback0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.d = new Handler(Looper.getMainLooper());
            }

            @Override  // android.support.customtabs.c
            public void onGreatestScrollPercentageIncreased(int v, Bundle bundle0) {
                c c0 = new c(engagementSignalsCallback0, v, bundle0);
                this.d.post(c0);
            }

            @Override  // android.support.customtabs.c
            public void onSessionEnded(boolean z, Bundle bundle0) {
                androidx.browser.customtabs.b b0 = new androidx.browser.customtabs.b(engagementSignalsCallback0, z, bundle0);
                this.d.post(b0);
            }

            @Override  // android.support.customtabs.c
            public void onVerticalScrollEvent(boolean z, Bundle bundle0) {
                d d0 = new d(engagementSignalsCallback0, z, bundle0);
                this.d.post(d0);
            }
        };
    }

    private android.support.customtabs.c.b d(@NonNull EngagementSignalsCallback engagementSignalsCallback0, @NonNull Executor executor0) {
        return new android.support.customtabs.c.b() {
            private final Executor d;
            final CustomTabsSession g;

            {
                Executor executor0 = executor0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                EngagementSignalsCallback engagementSignalsCallback0 = engagementSignalsCallback0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.d = executor0;
            }

            @Override  // android.support.customtabs.c
            public void onGreatestScrollPercentageIncreased(int v, Bundle bundle0) {
                long v1 = Binder.clearCallingIdentity();
                try {
                    f f0 = new f(engagementSignalsCallback0, v, bundle0);
                    this.d.execute(f0);
                }
                finally {
                    Binder.restoreCallingIdentity(v1);
                }
            }

            @Override  // android.support.customtabs.c
            public void onSessionEnded(boolean z, Bundle bundle0) {
                long v = Binder.clearCallingIdentity();
                try {
                    g g0 = new g(engagementSignalsCallback0, z, bundle0);
                    this.d.execute(g0);
                }
                finally {
                    Binder.restoreCallingIdentity(v);
                }
            }

            @Override  // android.support.customtabs.c
            public void onVerticalScrollEvent(boolean z, Bundle bundle0) {
                long v = Binder.clearCallingIdentity();
                try {
                    e e0 = new e(engagementSignalsCallback0, z, bundle0);
                    this.d.execute(e0);
                }
                finally {
                    Binder.restoreCallingIdentity(v);
                }
            }
        };
    }

    @NonNull
    @VisibleForTesting
    public static CustomTabsSession e(@NonNull ComponentName componentName0) {
        return new CustomTabsSession(new MockSession(), new MockCallback(), componentName0, null);
    }

    @Nullable
    private Bundle f(@Nullable Uri uri0) {
        Bundle bundle0 = new Bundle();
        if(uri0 != null) {
            bundle0.putParcelable("target_origin", uri0);
        }
        if(this.e != null) {
            this.a(bundle0);
        }
        return bundle0.isEmpty() ? null : bundle0;
    }

    IBinder g() {
        return this.c.asBinder();
    }

    ComponentName h() {
        return this.d;
    }

    @Nullable
    PendingIntent i() {
        return this.e;
    }

    public boolean j(@NonNull Bundle bundle0) throws RemoteException {
        Bundle bundle1 = this.b(bundle0);
        try {
            return this.b.f1(this.c, bundle1);
        }
        catch(SecurityException securityException0) {
            throw new UnsupportedOperationException("This method isn\'t supported by the Custom Tabs implementation.", securityException0);
        }
    }

    public boolean k(@Nullable Uri uri0, @Nullable Bundle bundle0, @Nullable List list0) {
        Bundle bundle1 = this.b(bundle0);
        try {
            return this.b.L(this.c, uri0, bundle1, list0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public int l(@NonNull String s, @Nullable Bundle bundle0) {
        Bundle bundle1 = this.b(bundle0);
        synchronized(this.a) {
            try {
                return this.b.O(this.c, s, bundle1);
            }
            catch(RemoteException unused_ex) {
                return -2;
            }
        }
    }

    public boolean m(@NonNull Uri uri0, int v, @Nullable Bundle bundle0) {
        Bundle bundle1 = this.b(bundle0);
        try {
            return this.b.j(this.c, uri0, v, bundle1);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public boolean n(@NonNull Uri uri0) {
        return this.o(uri0, null, new Bundle());
    }

    public boolean o(@NonNull Uri uri0, @Nullable Uri uri1, @NonNull Bundle bundle0) {
        try {
            Bundle bundle1 = this.f(uri1);
            if(bundle1 != null) {
                bundle0.putAll(bundle1);
                return this.b.w0(this.c, uri0, bundle0);
            }
            return this.b.b1(this.c, uri0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public boolean p(@NonNull Bitmap bitmap0, @NonNull String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("android.support.customtabs.customaction.ICON", bitmap0);
        bundle0.putString("android.support.customtabs.customaction.DESCRIPTION", s);
        Bundle bundle1 = new Bundle();
        bundle1.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle0);
        this.a(bundle0);
        try {
            return this.b.H(this.c, bundle1);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public boolean q(@NonNull EngagementSignalsCallback engagementSignalsCallback0, @NonNull Bundle bundle0) throws RemoteException {
        Bundle bundle1 = this.b(bundle0);
        android.support.customtabs.c.b c$b0 = this.c(engagementSignalsCallback0);
        try {
            IBinder iBinder0 = c$b0.asBinder();
            return this.b.F(this.c, iBinder0, bundle1);
        }
        catch(SecurityException securityException0) {
            throw new UnsupportedOperationException("This method isn\'t supported by the Custom Tabs implementation.", securityException0);
        }
    }

    public boolean r(@NonNull Executor executor0, @NonNull EngagementSignalsCallback engagementSignalsCallback0, @NonNull Bundle bundle0) throws RemoteException {
        Bundle bundle1 = this.b(bundle0);
        android.support.customtabs.c.b c$b0 = this.d(engagementSignalsCallback0, executor0);
        try {
            IBinder iBinder0 = c$b0.asBinder();
            return this.b.F(this.c, iBinder0, bundle1);
        }
        catch(SecurityException securityException0) {
            throw new UnsupportedOperationException("This method isn\'t supported by the Custom Tabs implementation.", securityException0);
        }
    }

    public boolean s(@Nullable PendingIntent pendingIntent0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE", pendingIntent0);
        this.a(bundle0);
        try {
            return this.b.H(this.c, bundle0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public boolean t(@Nullable RemoteViews remoteViews0, @Nullable int[] arr_v, @Nullable PendingIntent pendingIntent0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews0);
        bundle0.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", arr_v);
        bundle0.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent0);
        this.a(bundle0);
        try {
            return this.b.H(this.c, bundle0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    @Deprecated
    public boolean u(int v, @NonNull Bitmap bitmap0, @NonNull String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("android.support.customtabs.customaction.ID", v);
        bundle0.putParcelable("android.support.customtabs.customaction.ICON", bitmap0);
        bundle0.putString("android.support.customtabs.customaction.DESCRIPTION", s);
        Bundle bundle1 = new Bundle();
        bundle1.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle0);
        this.a(bundle1);
        try {
            return this.b.H(this.c, bundle1);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    public boolean v(int v, @NonNull Uri uri0, @Nullable Bundle bundle0) {
        if(v >= 1 && v <= 2) {
            Bundle bundle1 = this.b(bundle0);
            try {
                return this.b.f(this.c, v, uri0, bundle1);
            }
            catch(RemoteException unused_ex) {
            }
        }
        return false;
    }
}

