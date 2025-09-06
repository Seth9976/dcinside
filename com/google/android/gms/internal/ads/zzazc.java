package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzazc implements Application.ActivityLifecycleCallbacks {
    @Nullable
    private Activity zza;
    private Context zzb;
    private final Object zzc;
    private boolean zzd;
    private boolean zze;
    private final List zzf;
    private final List zzg;
    private Runnable zzh;
    private boolean zzi;
    private long zzj;

    zzazc() {
        this.zzc = new Object();
        this.zzd = true;
        this.zze = false;
        this.zzf = new ArrayList();
        this.zzg = new ArrayList();
        this.zzi = false;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        synchronized(this.zzc) {
            Activity activity1 = this.zza;
            if(activity1 == null) {
                return;
            }
            if(activity1.equals(activity0)) {
                this.zza = null;
            }
            Iterator iterator0 = this.zzg.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                zzazr zzazr0 = (zzazr)object1;
                try {
                    if(!zzazr0.zza()) {
                        continue;
                    }
                    iterator0.remove();
                }
                catch(Exception exception0) {
                    zzv.zzp().zzw(exception0, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzo.zzh("", exception0);
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.zzk(activity0);
        synchronized(this.zzc) {
            for(Object object1: this.zzg) {
                zzazr zzazr0 = (zzazr)object1;
                try {
                    zzazr0.zzb();
                }
                catch(Exception exception0) {
                    zzv.zzp().zzw(exception0, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzo.zzh("", exception0);
                }
            }
        }
        this.zze = true;
        Runnable runnable0 = this.zzh;
        if(runnable0 != null) {
            zzs.zza.removeCallbacks(runnable0);
        }
        zzazb zzazb0 = new zzazb(this);
        this.zzh = zzazb0;
        zzs.zza.postDelayed(zzazb0, this.zzj);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.zzk(activity0);
        this.zze = false;
        boolean z = this.zzd;
        this.zzd = true;
        Runnable runnable0 = this.zzh;
        if(runnable0 != null) {
            zzs.zza.removeCallbacks(runnable0);
        }
        synchronized(this.zzc) {
            for(Object object1: this.zzg) {
                zzazr zzazr0 = (zzazr)object1;
                try {
                    zzazr0.zzc();
                }
                catch(Exception exception0) {
                    zzv.zzp().zzw(exception0, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzo.zzh("", exception0);
                }
            }
            if(z) {
                zzo.zze("App is still foreground.");
            }
            else {
                for(Object object2: this.zzf) {
                    zzazd zzazd0 = (zzazd)object2;
                    try {
                        zzazd0.zza(true);
                    }
                    catch(Exception exception1) {
                        zzo.zzh("", exception1);
                    }
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.zzk(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }

    @Nullable
    public final Activity zza() {
        return this.zza;
    }

    @Nullable
    public final Context zzb() {
        return this.zzb;
    }

    static void zze(zzazc zzazc0, boolean z) {
        zzazc0.zzd = false;
    }

    public final void zzf(zzazd zzazd0) {
        synchronized(this.zzc) {
            this.zzf.add(zzazd0);
        }
    }

    public final void zzg(Application application0, Context context0) {
        if(!this.zzi) {
            application0.registerActivityLifecycleCallbacks(this);
            if(context0 instanceof Activity) {
                this.zzk(((Activity)context0));
            }
            this.zzb = application0;
            this.zzj = (long)(((Long)zzbe.zzc().zza(zzbcl.zzbc)));
            this.zzi = true;
        }
    }

    public final void zzh(zzazd zzazd0) {
        synchronized(this.zzc) {
            this.zzf.remove(zzazd0);
        }
    }

    private final void zzk(Activity activity0) {
        synchronized(this.zzc) {
            if(!activity0.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.zza = activity0;
            }
        }
    }
}

