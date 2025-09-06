package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhs;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

public class zzdy {
    abstract class zza implements Runnable {
        final long zza;
        final long zzb;
        private final boolean zzc;
        private final zzdy zzd;

        zza() {
            this(true);
        }

        zza(boolean z) {
            this.zza = zzdy0.zza.currentTimeMillis();
            this.zzb = zzdy0.zza.elapsedRealtime();
            this.zzc = z;
        }

        @Override
        public void run() {
            if(zzdy.this.zzh) {
                this.zzb();
                return;
            }
            try {
                this.zza();
            }
            catch(Exception exception0) {
                zzdy.this.zza(exception0, false, this.zzc);
                this.zzb();
            }
        }

        abstract void zza() throws RemoteException;

        protected void zzb() {
        }
    }

    static final class zzb extends zzds {
        private final zzjl zza;

        zzb(zzjl zzjl0) {
            this.zza = zzjl0;
        }

        @Override  // com.google.android.gms.internal.measurement.zzdp
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override  // com.google.android.gms.internal.measurement.zzdp
        public final void zza(String s, String s1, Bundle bundle0, long v) {
            this.zza.onEvent(s, s1, bundle0, v);
        }
    }

    static final class zzc extends zzds {
        private final zzjm zza;

        zzc(zzjm zzjm0) {
            this.zza = zzjm0;
        }

        @Override  // com.google.android.gms.internal.measurement.zzdp
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override  // com.google.android.gms.internal.measurement.zzdp
        public final void zza(String s, String s1, Bundle bundle0, long v) {
            this.zza.interceptEvent(s, s1, bundle0, v);
        }
    }

    final class zzd implements Application.ActivityLifecycleCallbacks {
        final zzdy zza;

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity0, Bundle bundle0) {
            zzfg zzfg0 = new zzfg(this, bundle0, activity0);
            zzdy.this.zza(zzfg0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity0) {
            zzfl zzfl0 = new zzfl(this, activity0);
            zzdy.this.zza(zzfl0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity0) {
            zzfk zzfk0 = new zzfk(this, activity0);
            zzdy.this.zza(zzfk0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity0) {
            zzfh zzfh0 = new zzfh(this, activity0);
            zzdy.this.zza(zzfh0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
            zzdk zzdk0 = new zzdk();
            zzfm zzfm0 = new zzfm(this, activity0, zzdk0);
            zzdy.this.zza(zzfm0);
            Bundle bundle1 = zzdk0.zza(50L);
            if(bundle1 != null) {
                bundle0.putAll(bundle1);
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity0) {
            zzfi zzfi0 = new zzfi(this, activity0);
            zzdy.this.zza(zzfi0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity0) {
            zzfj zzfj0 = new zzfj(this, activity0);
            zzdy.this.zza(zzfj0);
        }
    }

    protected final Clock zza;
    private static volatile zzdy zzb;
    private final String zzc;
    private final ExecutorService zzd;
    private final AppMeasurementSdk zze;
    @GuardedBy("listenerList")
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    private volatile zzdj zzj;

    private zzdy(Context context0, String s, String s1, String s2, Bundle bundle0) {
        this.zzc = s == null || !this.zzc(s1, s2) ? "FA" : s;
        this.zza = DefaultClock.getInstance();
        int v = 1;
        this.zzd = zzdc.zza().zza(new zzek(this), 1);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        if(zzdy.zzb(context0) && !this.zzk()) {
            this.zzi = null;
            this.zzh = true;
            Log.w(this.zzc, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if(this.zzc(s1, s2)) {
            this.zzi = s1;
        }
        else {
            this.zzi = "fa";
            if(s1 == null || s2 == null) {
                if(s2 != null) {
                    v = 0;
                }
                if(((s1 == null ? 1 : 0) ^ v) != 0) {
                    Log.w(this.zzc, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
            else {
                Log.v(this.zzc, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        this.zza(new zzdx(this, s1, s2, context0, bundle0));
        Application application0 = (Application)context0.getApplicationContext();
        if(application0 == null) {
            Log.w(this.zzc, "Unable to register lifecycle notifications. Application null.");
            return;
        }
        application0.registerActivityLifecycleCallbacks(new zzd(this));
    }

    public static zzdy zza(@NonNull Context context0) {
        return zzdy.zza(context0, null, null, null, null);
    }

    public static zzdy zza(Context context0, String s, String s1, String s2, Bundle bundle0) {
        Preconditions.checkNotNull(context0);
        if(zzdy.zzb == null) {
            synchronized(zzdy.class) {
                if(zzdy.zzb == null) {
                    zzdy.zzb = new zzdy(context0, s, s1, s2, bundle0);
                }
            }
        }
        return zzdy.zzb;
    }

    private final void zza(zza zzdy$zza0) {
        this.zzd.execute(zzdy$zza0);
    }

    private final void zza(Exception exception0, boolean z, boolean z1) {
        this.zzh |= z;
        if(z) {
            Log.w(this.zzc, "Data collection startup failed. No data will be collected.", exception0);
            return;
        }
        if(z1) {
            this.zza(5, "Error with data collection. Data lost.", exception0, null, null);
        }
        Log.w(this.zzc, "Error with data collection. Data lost.", exception0);
    }

    private final void zza(String s, String s1, Bundle bundle0, boolean z, boolean z1, Long long0) {
        this.zza(new zzff(this, long0, s, s1, bundle0, z, z1));
    }

    public final int zza(String s) {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzev(this, s, zzdk0));
        Integer integer0 = (Integer)zzdk.zza(zzdk0.zza(10000L), Integer.class);
        return integer0 == null ? 25 : ((int)integer0);
    }

    public final long zza() {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzeq(this, zzdk0));
        Long long0 = zzdk0.zzb(500L);
        if(long0 == null) {
            long v = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
            int v1 = this.zzg + 1;
            this.zzg = v1;
            return v + ((long)v1);
        }
        return (long)long0;
    }

    public final Bundle zza(Bundle bundle0, boolean z) {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzew(this, bundle0, zzdk0));
        return z ? zzdk0.zza(5000L) : null;
    }

    protected final zzdj zza(Context context0, boolean z) {
        try {
            return zzdm.asInterface(DynamiteModule.load(context0, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        }
        catch(LoadingException dynamiteModule$LoadingException0) {
            this.zza(dynamiteModule$LoadingException0, true, false);
            return null;
        }
    }

    public final Object zza(int v) {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzfa(this, zzdk0, v));
        return zzdk.zza(zzdk0.zza(15000L), Object.class);
    }

    public final List zza(String s, String s1) {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzeb(this, s, s1, zzdk0));
        List list0 = (List)zzdk.zza(zzdk0.zza(5000L), List.class);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public final Map zza(String s, String s1, boolean z) {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzer(this, s, s1, z, zzdk0));
        Bundle bundle0 = zzdk0.zza(5000L);
        if(bundle0 != null && bundle0.size() != 0) {
            Map map0 = new HashMap(bundle0.size());
            for(Object object0: bundle0.keySet()) {
                String s2 = (String)object0;
                Object object1 = bundle0.get(s2);
                if(object1 instanceof Double || object1 instanceof Long || object1 instanceof String) {
                    map0.put(s2, object1);
                }
            }
            return map0;
        }
        return Collections.emptyMap();
    }

    public final void zza(int v, String s, Object object0, Object object1, Object object2) {
        this.zza(new zzeu(this, false, 5, s, object0, null, null));
    }

    public final void zza(long v) {
        this.zza(new zzej(this, v));
    }

    public final void zza(Activity activity0, String s, String s1) {
        this.zza(new zzed(this, activity0, s, s1));
    }

    public final void zza(Intent intent0) {
        this.zza(new zzfb(this, intent0));
    }

    public final void zza(Bundle bundle0) {
        this.zza(new zzdz(this, bundle0));
    }

    public final void zza(zzjl zzjl0) {
        zzb zzdy$zzb0;
        Preconditions.checkNotNull(zzjl0);
        synchronized(this.zzf) {
            for(int v1 = 0; v1 < this.zzf.size(); ++v1) {
                if(zzjl0.equals(((Pair)this.zzf.get(v1)).first)) {
                    Log.w(this.zzc, "OnEventListener already registered.");
                    return;
                }
            }
            zzdy$zzb0 = new zzb(zzjl0);
            Pair pair0 = new Pair(zzjl0, zzdy$zzb0);
            this.zzf.add(pair0);
        }
        if(this.zzj != null) {
            try {
                this.zzj.registerOnMeasurementEventListener(zzdy$zzb0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w(this.zzc, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.zza(new zzfe(this, zzdy$zzb0));
    }

    public final void zza(zzjm zzjm0) {
        zzc zzdy$zzc0 = new zzc(zzjm0);
        if(this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzdy$zzc0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w(this.zzc, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.zza(new zzet(this, zzdy$zzc0));
    }

    public final void zza(Boolean boolean0) {
        this.zza(new zzeg(this, boolean0));
    }

    public final void zza(@NonNull String s, Bundle bundle0) {
        this.zza(null, s, bundle0, false, true, null);
    }

    public final void zza(String s, String s1, Bundle bundle0) {
        this.zza(new zzec(this, s, s1, bundle0));
    }

    public final void zza(String s, String s1, Bundle bundle0, long v) {
        this.zza(s, s1, bundle0, true, false, v);
    }

    public final void zza(String s, String s1, Object object0, boolean z) {
        this.zza(new zzea(this, s, s1, object0, z));
    }

    public final void zza(boolean z) {
        this.zza(new zzez(this, z));
    }

    private static boolean zzb(Context context0) {
        try {
            if(new zzhs(context0, zzhs.zza(context0)).zza("google_app_id") != null) {
                return true;
            }
        }
        catch(IllegalStateException unused_ex) {
        }
        return false;
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    public final void zzb(Bundle bundle0) {
        this.zza(new zzef(this, bundle0));
    }

    public final void zzb(zzjl zzjl0) {
        zzb zzdy$zzb0;
        Pair pair0;
        Preconditions.checkNotNull(zzjl0);
        synchronized(this.zzf) {
            for(int v1 = 0; true; ++v1) {
                pair0 = null;
                if(v1 >= this.zzf.size()) {
                    break;
                }
                if(zzjl0.equals(((Pair)this.zzf.get(v1)).first)) {
                    pair0 = (Pair)this.zzf.get(v1);
                    break;
                }
            }
            if(pair0 == null) {
                Log.w(this.zzc, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair0);
            zzdy$zzb0 = (zzb)pair0.second;
        }
        if(this.zzj != null) {
            try {
                this.zzj.unregisterOnMeasurementEventListener(zzdy$zzb0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w(this.zzc, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.zza(new zzfd(this, zzdy$zzb0));
    }

    public final void zzb(String s) {
        this.zza(new zzem(this, s));
    }

    public final void zzb(String s, String s1) {
        this.zza(null, s, s1, false);
    }

    public final void zzb(String s, String s1, Bundle bundle0) {
        this.zza(s, s1, bundle0, true, true, null);
    }

    private final boolean zzc(String s, String s1) {
        return s1 != null && s != null && !this.zzk();
    }

    @WorkerThread
    public final Long zzc() {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzex(this, zzdk0));
        return zzdk0.zzb(120000L);
    }

    public final void zzc(Bundle bundle0) {
        this.zza(new zzei(this, bundle0));
    }

    public final void zzc(String s) {
        this.zza(new zzel(this, s));
    }

    public final String zzd() {
        return this.zzi;
    }

    public final void zzd(Bundle bundle0) {
        this.zza(new zzfc(this, bundle0));
    }

    public final void zzd(String s) {
        this.zza(new zzee(this, s));
    }

    @WorkerThread
    public final String zze() {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzey(this, zzdk0));
        return zzdk0.zzc(120000L);
    }

    public final String zzf() {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzen(this, zzdk0));
        return zzdk0.zzc(50L);
    }

    public final String zzg() {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzes(this, zzdk0));
        return zzdk0.zzc(500L);
    }

    public final String zzh() {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzep(this, zzdk0));
        return zzdk0.zzc(500L);
    }

    public final String zzi() {
        zzdk zzdk0 = new zzdk();
        this.zza(new zzeo(this, zzdk0));
        return zzdk0.zzc(500L);
    }

    public final void zzj() {
        this.zza(new zzeh(this));
    }

    private final boolean zzk() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, this.getClass().getClassLoader());
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }
}

