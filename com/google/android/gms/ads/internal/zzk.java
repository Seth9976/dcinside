package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzfni;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzgch;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzk implements zzauv, Runnable {
    @VisibleForTesting
    protected boolean zza;
    final CountDownLatch zzb;
    private final List zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfni zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;

    public zzk(Context context0, VersionInfoParcel versionInfoParcel0) {
        this.zzc = new Vector();
        this.zzd = new AtomicReference();
        this.zze = new AtomicReference();
        this.zzb = new CountDownLatch(1);
        this.zzj = context0;
        this.zzk = context0;
        this.zzl = versionInfoParcel0;
        this.zzm = versionInfoParcel0;
        ExecutorService executorService0 = Executors.newCachedThreadPool();
        this.zzh = executorService0;
        boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzcy)).booleanValue();
        this.zzn = z;
        this.zzi = zzfni.zza(context0, executorService0, z);
        this.zzf = ((Boolean)zzbe.zzc().zza(zzbcl.zzcv)).booleanValue();
        this.zzg = ((Boolean)zzbe.zzc().zza(zzbcl.zzcz)).booleanValue();
        this.zzo = ((Boolean)zzbe.zzc().zza(zzbcl.zzcx)).booleanValue() ? 2 : 1;
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzdA)).booleanValue()) {
            this.zza = this.zzi();
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdu)).booleanValue()) {
            zzbzw.zza.execute(this);
            return;
        }
        if(zzf.zzu()) {
            zzbzw.zza.execute(this);
            return;
        }
        this.run();
    }

    @Override
    public final void run() {
        long v1;
        try {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzdA)).booleanValue()) {
                this.zza = this.zzi();
            }
            boolean z = this.zzl.isClientJar;
            boolean z1 = !((Boolean)zzbe.zzc().zza(zzbcl.zzbf)).booleanValue() && z;
            if(this.zzm() == 1) {
                this.zzs(z1);
                if(this.zzo == 2) {
                    zzi zzi0 = () -> {
                        long v;
                        try {
                            v = System.currentTimeMillis();
                            zzk.zzu(this.zzk, this.zzm, z1, this.zzn).zzp();
                        }
                        catch(NullPointerException nullPointerException0) {
                            this.zzi.zzc(2027, System.currentTimeMillis() - v, nullPointerException0);
                        }
                    };
                    this.zzh.execute(zzi0);
                }
            }
            else {
                try {
                    v1 = System.currentTimeMillis();
                    zzaus zzaus0 = zzk.zzu(this.zzj, this.zzl, z1, this.zzn);
                    this.zze.set(zzaus0);
                    if(this.zzg && !zzaus0.zzr()) {
                        this.zzo = 1;
                        this.zzs(z1);
                    }
                }
                catch(NullPointerException nullPointerException0) {
                    this.zzo = 1;
                    this.zzs(z1);
                    this.zzi.zzc(0x7EF, System.currentTimeMillis() - v1, nullPointerException0);
                }
            }
        }
        finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    // 检测为 Lambda 实现
    public final String zzb(Context context0, byte[] arr_b) [...]

    // 检测为 Lambda 实现
    final void zzc(boolean z) [...]

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzd(Context context0, String s, View view0) {
        return this.zze(context0, s, view0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zze(Context context0, String s, View view0, Activity activity0) {
        if(this.zzj()) {
            zzauv zzauv0 = this.zzq();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
                zzs.zzK(view0, 4, null);
            }
            if(zzauv0 != null) {
                this.zzr();
                return zzauv0.zze(zzk.zzt(context0), s, view0, activity0);
            }
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzf(Context context0) {
        return this.zzb(context0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzg(Context context0) {
        t0 t00 = zzgch.zzj(() -> {
            if(this.zzj()) {
                zzauv zzauv0 = this.zzq();
                if(zzauv0 != null) {
                    this.zzr();
                    return zzauv0.zzf(zzk.zzt(context0));
                }
            }
            return "";
        }, this.zzh);
        try {
            return (String)t00.get(((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzcP)))))), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return "17";
        }
        catch(TimeoutException unused_ex) {
            return zzauo.zza(context0, this.zzm.afmaVersion, true);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzh(Context context0, View view0, Activity activity0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzky)).booleanValue()) {
            if(this.zzj()) {
                zzauv zzauv0 = this.zzq();
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
                    zzs.zzK(view0, 2, null);
                }
                return zzauv0 == null ? "" : zzauv0.zzh(context0, view0, activity0);
            }
            return "";
        }
        zzauv zzauv1 = this.zzq();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
            zzs.zzK(view0, 2, null);
        }
        return zzauv1 == null ? "" : zzauv1.zzh(context0, view0, activity0);
    }

    protected final boolean zzi() {
        Context context0 = this.zzj;
        zzj zzj0 = new zzj(this);
        return new zzfpe(this.zzj, zzfok.zzb(context0, this.zzi), zzj0, ((Boolean)zzbe.zzc().zza(zzbcl.zzcw)).booleanValue()).zzd(1);
    }

    public final boolean zzj() {
        try {
            this.zzb.await();
            return true;
        }
        catch(InterruptedException interruptedException0) {
            zzo.zzk("Interrupted during GADSignals creation.", interruptedException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzk(MotionEvent motionEvent0) {
        zzauv zzauv0 = this.zzq();
        if(zzauv0 != null) {
            this.zzr();
            zzauv0.zzk(motionEvent0);
            return;
        }
        this.zzc.add(new Object[]{motionEvent0});
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzl(int v, int v1, int v2) {
        zzauv zzauv0 = this.zzq();
        if(zzauv0 != null) {
            this.zzr();
            zzauv0.zzl(v, v1, v2);
            return;
        }
        this.zzc.add(new Object[]{v, v1, v2});
    }

    // 去混淆评级： 低(20)
    protected final int zzm() {
        return !this.zzf || this.zza ? this.zzo : 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzn(StackTraceElement[] arr_stackTraceElement) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcU)).booleanValue()) {
            if(this.zzb.getCount() == 0L) {
                zzauv zzauv0 = this.zzq();
                if(zzauv0 != null) {
                    zzauv0.zzn(arr_stackTraceElement);
                }
            }
        }
        else if(this.zzj()) {
            zzauv zzauv1 = this.zzq();
            if(zzauv1 != null) {
                zzauv1.zzn(arr_stackTraceElement);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzo(View view0) {
        zzauv zzauv0 = this.zzq();
        if(zzauv0 != null) {
            zzauv0.zzo(view0);
        }
    }

    public final int zzp() {
        return this.zzo;
    }

    @Nullable
    private final zzauv zzq() {
        return this.zzm() == 2 ? ((zzauv)this.zze.get()) : ((zzauv)this.zzd.get());
    }

    private final void zzr() {
        zzauv zzauv0 = this.zzq();
        if(!this.zzc.isEmpty() && zzauv0 != null) {
            for(Object object0: this.zzc) {
                Object[] arr_object = (Object[])object0;
                int v = arr_object.length;
                if(v == 1) {
                    zzauv0.zzk(((MotionEvent)arr_object[0]));
                }
                else if(v == 3) {
                    zzauv0.zzl(((int)(((Integer)arr_object[0]))), ((int)(((Integer)arr_object[1]))), ((int)(((Integer)arr_object[2]))));
                }
            }
            this.zzc.clear();
        }
    }

    private final void zzs(boolean z) {
        String s = this.zzl.afmaVersion;
        Context context0 = zzk.zzt(this.zzj);
        zzare zzare0 = zzarg.zza();
        zzare0.zza(z);
        zzare0.zzb(s);
        zzauz zzauz0 = zzauz.zzu(context0, new zzaux(((zzarg)zzare0.zzbn())));
        this.zzd.set(zzauz0);
    }

    private static final Context zzt(Context context0) {
        Context context1 = context0.getApplicationContext();
        return context1 == null ? context0 : context1;
    }

    private static final zzaus zzu(Context context0, VersionInfoParcel versionInfoParcel0, boolean z, boolean z1) {
        zzare zzare0 = zzarg.zza();
        zzare0.zza(z);
        zzare0.zzb(versionInfoParcel0.afmaVersion);
        zzarg zzarg0 = (zzarg)zzare0.zzbn();
        return zzaus.zza(zzk.zzt(context0), zzarg0, z1);
    }
}

