package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.b;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;

public class CustomTabsClient {
    private final b a;
    private final ComponentName b;
    private final Context c;
    private static final String d = "CustomTabsClient";

    CustomTabsClient(b b0, ComponentName componentName0, Context context0) {
        this.a = b0;
        this.b = componentName0;
        this.c = context0;
    }

    @Nullable
    @RestrictTo({Scope.a})
    public CustomTabsSession a(@NonNull PendingSession customTabsSession$PendingSession0) {
        return this.m(customTabsSession$PendingSession0.a(), customTabsSession$PendingSession0.b());
    }

    public static boolean b(@NonNull Context context0, @Nullable String s, @NonNull CustomTabsServiceConnection customTabsServiceConnection0) {
        customTabsServiceConnection0.setApplicationContext(context0.getApplicationContext());
        Intent intent0 = new Intent("android.support.customtabs.action.CustomTabsService");
        if(!TextUtils.isEmpty(s)) {
            intent0.setPackage(s);
        }
        return context0.bindService(intent0, customTabsServiceConnection0, 33);
    }

    public static boolean c(@NonNull Context context0, @Nullable String s, @NonNull CustomTabsServiceConnection customTabsServiceConnection0) {
        customTabsServiceConnection0.setApplicationContext(context0.getApplicationContext());
        Intent intent0 = new Intent("android.support.customtabs.action.CustomTabsService");
        if(!TextUtils.isEmpty(s)) {
            intent0.setPackage(s);
        }
        return context0.bindService(intent0, customTabsServiceConnection0, 1);
    }

    public static boolean d(@NonNull Context context0, @NonNull String s) {
        if(s == null) {
            return false;
        }
        Context context1 = context0.getApplicationContext();
        androidx.browser.customtabs.CustomTabsClient.1 customTabsClient$10 = new CustomTabsServiceConnection() {
            @Override  // androidx.browser.customtabs.CustomTabsServiceConnection
            public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName0, @NonNull CustomTabsClient customTabsClient0) {
                customTabsClient0.n(0L);
                context1.unbindService(this);
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName0) {
            }
        };
        try {
            return CustomTabsClient.b(context1, s, customTabsClient$10);
        }
        catch(SecurityException unused_ex) {
            return false;
        }
    }

    private android.support.customtabs.a.b e(@Nullable CustomTabsCallback customTabsCallback0) {
        return new android.support.customtabs.a.b() {
            private Handler l;
            final CustomTabsClient n;

            {
                CustomTabsCallback customTabsCallback0 = customTabsCallback0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.l = new Handler(Looper.getMainLooper());
            }

            @Override  // android.support.customtabs.a
            public void A0(@NonNull Bundle bundle0) throws RemoteException {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 b;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.onWarmupCompleted(bundle0);
                    }
                });
            }

            @Override  // android.support.customtabs.a
            public void N(int v, int v1, @Nullable Bundle bundle0) throws RemoteException {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 d;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.onActivityResized(v, v1, bundle0);
                    }
                });
            }

            @Override  // android.support.customtabs.a
            public void R0(@NonNull Bundle bundle0) throws RemoteException {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 b;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.onMinimized(bundle0);
                    }
                });
            }

            @Override  // android.support.customtabs.a
            public void S0(@NonNull Bundle bundle0) throws RemoteException {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 b;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.onUnminimized(bundle0);
                    }
                });
            }

            @Override  // android.support.customtabs.a
            public void d(String s, Bundle bundle0) throws RemoteException {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 c;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.onPostMessage(s, bundle0);
                    }
                });
            }

            @Override  // android.support.customtabs.a
            public void d1(Bundle bundle0) throws RemoteException {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 b;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.onMessageChannelReady(bundle0);
                    }
                });
            }

            @Override  // android.support.customtabs.a
            public void e1(int v, Uri uri0, boolean z, @Nullable Bundle bundle0) throws RemoteException {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 e;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.onRelationshipValidationResult(v, uri0, z, bundle0);
                    }
                });
            }

            @Override  // android.support.customtabs.a
            public void g(int v, int v1, int v2, int v3, int v4, @NonNull Bundle bundle0) throws RemoteException {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 g;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.onActivityLayout(v, v1, v2, v3, v4, bundle0);
                    }
                });
            }

            @Override  // android.support.customtabs.a
            public void h0(int v, Bundle bundle0) {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 c;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.onNavigationEvent(v, bundle0);
                    }
                });
            }

            @Override  // android.support.customtabs.a
            public Bundle k(@NonNull String s, @Nullable Bundle bundle0) throws RemoteException {
                return customTabsCallback0 == null ? null : customTabsCallback0.extraCallbackWithResult(s, bundle0);
            }

            @Override  // android.support.customtabs.a
            public void z0(String s, Bundle bundle0) throws RemoteException {
                if(customTabsCallback0 == null) {
                    return;
                }
                this.l.post(new Runnable() {
                    final androidx.browser.customtabs.CustomTabsClient.2 c;

                    @Override
                    public void run() {
                        androidx.browser.customtabs.CustomTabsClient.2.this.m.extraCallback(s, bundle0);
                    }
                });
            }
        };
    }

    private static PendingIntent f(Context context0, int v) {
        return PendingIntent.getActivity(context0, v, new Intent(), 0x4000000);
    }

    @Nullable
    public Bundle g(@NonNull String s, @Nullable Bundle bundle0) {
        try {
            return this.a.o0(s, bundle0);
        }
        catch(RemoteException unused_ex) {
            return null;
        }
    }

    @Nullable
    public static String h(@NonNull Context context0, @Nullable List list0) {
        return CustomTabsClient.i(context0, list0, false);
    }

    @Nullable
    public static String i(@NonNull Context context0, @Nullable List list0, boolean z) {
        PackageManager packageManager0 = context0.getPackageManager();
        List list1 = list0 == null ? new ArrayList() : list0;
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if(!z) {
            ResolveInfo resolveInfo0 = packageManager0.resolveActivity(intent0, 0);
            if(resolveInfo0 != null) {
                String s = resolveInfo0.activityInfo.packageName;
                ArrayList arrayList0 = new ArrayList(list1.size() + 1);
                arrayList0.add(s);
                if(list0 != null) {
                    arrayList0.addAll(list0);
                }
                list1 = arrayList0;
            }
        }
        Intent intent1 = new Intent("android.support.customtabs.action.CustomTabsService");
        for(Object object0: list1) {
            String s1 = (String)object0;
            intent1.setPackage(s1);
            if(packageManager0.resolveService(intent1, 0) != null) {
                return s1;
            }
            if(false) {
                break;
            }
        }
        if(Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        }
        return null;
    }

    @NonNull
    @RestrictTo({Scope.a})
    public static PendingSession j(@NonNull Context context0, @Nullable CustomTabsCallback customTabsCallback0, int v) {
        return new PendingSession(customTabsCallback0, CustomTabsClient.f(context0, v));
    }

    @Nullable
    public CustomTabsSession k(@Nullable CustomTabsCallback customTabsCallback0) {
        return this.m(customTabsCallback0, null);
    }

    @Nullable
    public CustomTabsSession l(@Nullable CustomTabsCallback customTabsCallback0, int v) {
        return this.m(customTabsCallback0, CustomTabsClient.f(this.c, v));
    }

    @Nullable
    private CustomTabsSession m(@Nullable CustomTabsCallback customTabsCallback0, @Nullable PendingIntent pendingIntent0) {
        android.support.customtabs.a.b a$b0 = this.e(customTabsCallback0);
        try {
            if(pendingIntent0 != null) {
                Bundle bundle0 = new Bundle();
                bundle0.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent0);
                return this.a.x0(a$b0, bundle0) ? new CustomTabsSession(this.a, a$b0, this.b, pendingIntent0) : null;
            }
            return this.a.g0(a$b0) ? new CustomTabsSession(this.a, a$b0, this.b, null) : null;
        }
        catch(RemoteException unused_ex) {
            return null;
        }
    }

    public boolean n(long v) {
        try {
            return this.a.M(v);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }
}

