package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.a.b;
import android.support.customtabs.a;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public class CustomTabsSessionToken {
    static class MockCallback extends b {
        @Override  // android.support.customtabs.a
        public void A0(Bundle bundle0) {
        }

        @Override  // android.support.customtabs.a
        public void N(int v, int v1, Bundle bundle0) {
        }

        @Override  // android.support.customtabs.a
        public void R0(@NonNull Bundle bundle0) {
        }

        @Override  // android.support.customtabs.a
        public void S0(@NonNull Bundle bundle0) {
        }

        @Override  // android.support.customtabs.a$b
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.support.customtabs.a
        public void d(String s, Bundle bundle0) {
        }

        @Override  // android.support.customtabs.a
        public void d1(Bundle bundle0) {
        }

        @Override  // android.support.customtabs.a
        public void e1(int v, Uri uri0, boolean z, Bundle bundle0) {
        }

        @Override  // android.support.customtabs.a
        public void g(int v, int v1, int v2, int v3, int v4, @NonNull Bundle bundle0) {
        }

        @Override  // android.support.customtabs.a
        public void h0(int v, Bundle bundle0) {
        }

        @Override  // android.support.customtabs.a
        public Bundle k(String s, Bundle bundle0) {
            return null;
        }

        @Override  // android.support.customtabs.a
        public void z0(String s, Bundle bundle0) {
        }
    }

    @Nullable
    final a a;
    @Nullable
    private final PendingIntent b;
    @Nullable
    private final CustomTabsCallback c;
    private static final String d = "CustomTabsSessionToken";

    CustomTabsSessionToken(@Nullable a a0, @Nullable PendingIntent pendingIntent0) {
        if(a0 == null && pendingIntent0 == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.a = a0;
        this.b = pendingIntent0;
        this.c = a0 == null ? null : new CustomTabsCallback() {
            final CustomTabsSessionToken a;

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void extraCallback(@NonNull String s, @Nullable Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.z0(s, bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            @NonNull
            public Bundle extraCallbackWithResult(@NonNull String s, @Nullable Bundle bundle0) {
                try {
                    return CustomTabsSessionToken.this.a.k(s, bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    return null;
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void onActivityLayout(int v, int v1, int v2, int v3, int v4, @NonNull Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.g(v, v1, v2, v3, v4, bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void onActivityResized(int v, int v1, @NonNull Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.N(v, v1, bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void onMessageChannelReady(@Nullable Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.d1(bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void onMinimized(@NonNull Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.R0(bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void onNavigationEvent(int v, @Nullable Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.h0(v, bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void onPostMessage(@NonNull String s, @Nullable Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.d(s, bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void onRelationshipValidationResult(int v, @NonNull Uri uri0, boolean z, @Nullable Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.e1(v, uri0, z, bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void onUnminimized(@NonNull Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.S0(bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            @Override  // androidx.browser.customtabs.CustomTabsCallback
            public void onWarmupCompleted(@NonNull Bundle bundle0) {
                try {
                    CustomTabsSessionToken.this.a.A0(bundle0);
                }
                catch(RemoteException unused_ex) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }
        };
    }

    @NonNull
    public static CustomTabsSessionToken a() {
        return new CustomTabsSessionToken(new MockCallback(), null);
    }

    @Nullable
    public CustomTabsCallback b() {
        return this.c;
    }

    @Nullable
    IBinder c() {
        return this.a == null ? null : this.a.asBinder();
    }

    private IBinder d() {
        a a0 = this.a;
        if(a0 == null) {
            throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
        }
        return a0.asBinder();
    }

    @Nullable
    PendingIntent e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof CustomTabsSessionToken)) {
            return false;
        }
        PendingIntent pendingIntent0 = ((CustomTabsSessionToken)object0).e();
        PendingIntent pendingIntent1 = this.b;
        if((pendingIntent1 == null ? 1 : 0) != (pendingIntent0 == null ? 1 : 0)) {
            return false;
        }
        return pendingIntent1 == null ? this.d().equals(((CustomTabsSessionToken)object0).d()) : pendingIntent1.equals(pendingIntent0);
    }

    @Nullable
    public static CustomTabsSessionToken f(@NonNull Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        a a0 = null;
        if(bundle0 == null) {
            return null;
        }
        IBinder iBinder0 = bundle0.getBinder("android.support.customtabs.extra.SESSION");
        PendingIntent pendingIntent0 = (PendingIntent)intent0.getParcelableExtra("android.support.customtabs.extra.SESSION_ID");
        if(iBinder0 == null && pendingIntent0 == null) {
            return null;
        }
        if(iBinder0 != null) {
            a0 = b.i1(iBinder0);
        }
        return new CustomTabsSessionToken(a0, pendingIntent0);
    }

    @RestrictTo({Scope.a})
    public boolean g() {
        return this.a != null;
    }

    @RestrictTo({Scope.a})
    public boolean h() {
        return this.b != null;
    }

    @Override
    public int hashCode() {
        return this.b == null ? this.d().hashCode() : this.b.hashCode();
    }

    public boolean i(@NonNull CustomTabsSession customTabsSession0) {
        return customTabsSession0.g().equals(this.a);
    }
}

