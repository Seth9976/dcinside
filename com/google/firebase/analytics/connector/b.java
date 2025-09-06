package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.internal.e;
import com.google.firebase.analytics.connector.internal.g;
import com.google.firebase.h;
import e2.d;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class b implements a {
    @VisibleForTesting
    private final AppMeasurementSdk a;
    @VisibleForTesting
    final Map b;
    private static volatile a c;

    private b(AppMeasurementSdk appMeasurementSdk0) {
        Preconditions.checkNotNull(appMeasurementSdk0);
        this.a = appMeasurementSdk0;
        this.b = new ConcurrentHashMap();
    }

    @Override  // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void a(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        if(!com.google.firebase.analytics.connector.internal.b.m(s)) {
            return;
        }
        if(!com.google.firebase.analytics.connector.internal.b.e(s1, bundle0)) {
            return;
        }
        if(!com.google.firebase.analytics.connector.internal.b.i(s, s1, bundle0)) {
            return;
        }
        com.google.firebase.analytics.connector.internal.b.d(s, s1, bundle0);
        this.a.logEvent(s, s1, bundle0);
    }

    @Override  // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void b(@NonNull String s, @NonNull String s1, @NonNull Object object0) {
        if(!com.google.firebase.analytics.connector.internal.b.m(s)) {
            return;
        }
        if(!com.google.firebase.analytics.connector.internal.b.f(s, s1)) {
            return;
        }
        this.a.setUserProperty(s, s1, object0);
    }

    @Override  // com.google.firebase.analytics.connector.a
    @WorkerThread
    @KeepForSdk
    public int c(@NonNull @Size(min = 1L) String s) {
        return this.a.getMaxUserProperties(s);
    }

    @Override  // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size(max = 24L, min = 1L) String s, @NonNull String s1, @NonNull Bundle bundle0) {
        if(s1 != null && !com.google.firebase.analytics.connector.internal.b.e(s1, bundle0)) {
            return;
        }
        this.a.clearConditionalUserProperty(s, s1, bundle0);
    }

    @Override  // com.google.firebase.analytics.connector.a
    @NonNull
    @WorkerThread
    @KeepForSdk
    public List d(@NonNull String s, @NonNull @Size(max = 23L, min = 1L) String s1) {
        List list0 = new ArrayList();
        for(Object object0: this.a.getConditionalUserProperties(s, s1)) {
            list0.add(com.google.firebase.analytics.connector.internal.b.b(((Bundle)object0)));
        }
        return list0;
    }

    @Override  // com.google.firebase.analytics.connector.a
    @NonNull
    @WorkerThread
    @KeepForSdk
    public com.google.firebase.analytics.connector.a.a e(@NonNull String s, @NonNull com.google.firebase.analytics.connector.a.b a$b0) {
        class com.google.firebase.analytics.connector.b.a implements com.google.firebase.analytics.connector.a.a {
            private final String a;
            private final b b;

            com.google.firebase.analytics.connector.b.a(String s) {
                this.a = s;
                this.b = b0;
                super();
            }

            @Override  // com.google.firebase.analytics.connector.a$a
            public void a() {
                if(!this.b.m(this.a)) {
                    return;
                }
                com.google.firebase.analytics.connector.a.b a$b0 = ((com.google.firebase.analytics.connector.internal.a)this.b.b.get(this.a)).zza();
                if(a$b0 != null) {
                    a$b0.a(0, null);
                }
                this.b.b.remove(this.a);
            }

            @Override  // com.google.firebase.analytics.connector.a$a
            @KeepForSdk
            public void b() {
                if(this.b.m(this.a) && this.a.equals("fiam")) {
                    ((com.google.firebase.analytics.connector.internal.a)this.b.b.get(this.a)).zzb();
                }
            }

            @Override  // com.google.firebase.analytics.connector.a$a
            @KeepForSdk
            public void c(Set set0) {
                if(this.b.m(this.a) && this.a.equals("fiam") && set0 != null && !set0.isEmpty()) {
                    ((com.google.firebase.analytics.connector.internal.a)this.b.b.get(this.a)).a(set0);
                }
            }
        }

        e e0;
        Preconditions.checkNotNull(a$b0);
        if(!com.google.firebase.analytics.connector.internal.b.m(s)) {
            return null;
        }
        if(this.m(s)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk0 = this.a;
        if("fiam".equals(s)) {
            e0 = new e(appMeasurementSdk0, a$b0);
        }
        else if("clx".equals(s)) {
            e0 = new g(appMeasurementSdk0, a$b0);
        }
        else {
            e0 = null;
        }
        if(e0 != null) {
            this.b.put(s, e0);
            return new com.google.firebase.analytics.connector.b.a(this, s);
        }
        return null;
    }

    @Override  // com.google.firebase.analytics.connector.a
    @KeepForSdk
    public void f(@NonNull c a$c0) {
        if(!com.google.firebase.analytics.connector.internal.b.h(a$c0)) {
            return;
        }
        Bundle bundle0 = com.google.firebase.analytics.connector.internal.b.a(a$c0);
        this.a.setConditionalUserProperty(bundle0);
    }

    @Override  // com.google.firebase.analytics.connector.a
    @NonNull
    @WorkerThread
    @KeepForSdk
    public Map g(boolean z) {
        return this.a.getUserProperties(null, null, z);
    }

    @NonNull
    @KeepForSdk
    public static a h() {
        return b.i(h.p());
    }

    @NonNull
    @KeepForSdk
    public static a i(@NonNull h h0) {
        return (a)h0.l(a.class);
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    public static a j(@NonNull h h0, @NonNull Context context0, @NonNull d d0) {
        Preconditions.checkNotNull(h0);
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(d0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(b.c == null) {
            synchronized(b.class) {
                if(b.c == null) {
                    Bundle bundle0 = new Bundle(1);
                    if(h0.B()) {
                        com.google.firebase.analytics.connector.d d1 = new com.google.firebase.analytics.connector.d();
                        com.google.firebase.analytics.connector.e e0 = (e2.a a0) -> synchronized(b.class) {
                            ((b)Preconditions.checkNotNull(b.c)).a.zza(((com.google.firebase.c)a0.a()).a);
                        };
                        d0.a(com.google.firebase.c.class, d1, e0);
                        bundle0.putBoolean("dataCollectionDefaultEnabled", h0.A());
                    }
                    b.c = new b(zzdy.zza(context0, null, null, null, bundle0).zzb());
                }
            }
        }
        return b.c;
    }

    // 检测为 Lambda 实现
    static void k(e2.a a0) [...]

    // 去混淆评级： 低(20)
    private final boolean m(@NonNull String s) {
        return !s.isEmpty() && this.b.containsKey(s) && this.b.get(s) != null;
    }
}

