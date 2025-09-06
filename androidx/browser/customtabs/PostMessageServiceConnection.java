package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.a.b;
import android.support.customtabs.a;
import android.support.customtabs.d;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public abstract class PostMessageServiceConnection implements ServiceConnection, PostMessageBackend {
    private final Object a;
    private final a b;
    @Nullable
    private d c;
    @Nullable
    private String d;
    private boolean e;
    private static final String f = "PostMessageServConn";

    public PostMessageServiceConnection(@NonNull CustomTabsSessionToken customTabsSessionToken0) {
        this.a = new Object();
        IBinder iBinder0 = customTabsSessionToken0.c();
        if(iBinder0 == null) {
            throw new IllegalArgumentException("Provided session must have binder.");
        }
        this.b = b.i1(iBinder0);
    }

    @Override  // androidx.browser.customtabs.PostMessageBackend
    @RestrictTo({Scope.a})
    public final boolean a(@Nullable Bundle bundle0) {
        return this.h(bundle0);
    }

    @Override  // androidx.browser.customtabs.PostMessageBackend
    @RestrictTo({Scope.a})
    public void b(@NonNull Context context0) {
        this.n(context0);
    }

    @RestrictTo({Scope.a})
    public boolean c(@NonNull Context context0) {
        String s = this.d;
        if(s == null) {
            throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
        }
        return this.e(context0, s);
    }

    @Override  // androidx.browser.customtabs.PostMessageBackend
    @RestrictTo({Scope.a})
    public final boolean d(@NonNull String s, @Nullable Bundle bundle0) {
        return this.l(s, bundle0);
    }

    public boolean e(@NonNull Context context0, @NonNull String s) {
        Intent intent0 = new Intent();
        intent0.setClassName(s, "androidx.browser.customtabs.PostMessageService");
        boolean z = context0.bindService(intent0, this, 1);
        if(!z) {
            Log.w("PostMessageServConn", "Could not bind to PostMessageService in client.");
        }
        return z;
    }

    @RestrictTo({Scope.a})
    public void f(@NonNull Context context0) {
        if(this.g()) {
            this.n(context0);
        }
    }

    private boolean g() {
        return this.c != null;
    }

    public final boolean h(@Nullable Bundle bundle0) {
        this.e = true;
        return this.i(bundle0);
    }

    private boolean i(@Nullable Bundle bundle0) {
        if(this.c == null) {
            return false;
        }
        synchronized(this.a) {
            try {
                this.c.m(this.b, bundle0);
                return true;
            }
            catch(RemoteException unused_ex) {
                return false;
            }
        }
    }

    public void j() {
        if(this.e) {
            this.i(null);
        }
    }

    public void k() {
    }

    public final boolean l(@NonNull String s, @Nullable Bundle bundle0) {
        if(this.c == null) {
            return false;
        }
        synchronized(this.a) {
            try {
                this.c.T0(this.b, s, bundle0);
                return true;
            }
            catch(RemoteException unused_ex) {
                return false;
            }
        }
    }

    @RestrictTo({Scope.a})
    public void m(@NonNull String s) {
        this.d = s;
    }

    public void n(@NonNull Context context0) {
        if(this.g()) {
            context0.unbindService(this);
            this.c = null;
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName0, @NonNull IBinder iBinder0) {
        this.c = android.support.customtabs.d.b.i1(iBinder0);
        this.j();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName0) {
        this.c = null;
    }
}

