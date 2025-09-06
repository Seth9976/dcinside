package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcmw implements zza, zzcvt, zzcwj, zzcwn, zzcxh, zzddj {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfca zze;
    private final zzfbo zzf;
    private final zzfiv zzg;
    private final zzfcv zzh;
    private final zzava zzi;
    private final zzbds zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    @Nullable
    private final zzcut zzm;
    private boolean zzn;
    private final AtomicBoolean zzo;

    zzcmw(Context context0, Executor executor0, Executor executor1, ScheduledExecutorService scheduledExecutorService0, zzfca zzfca0, zzfbo zzfbo0, zzfiv zzfiv0, zzfcv zzfcv0, @Nullable View view0, @Nullable zzcex zzcex0, zzava zzava0, zzbds zzbds0, zzbdu zzbdu0, zzfhh zzfhh0, @Nullable zzcut zzcut0) {
        this.zzo = new AtomicBoolean();
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = executor1;
        this.zzd = scheduledExecutorService0;
        this.zze = zzfca0;
        this.zzf = zzfbo0;
        this.zzg = zzfiv0;
        this.zzh = zzfcv0;
        this.zzi = zzava0;
        this.zzk = new WeakReference(view0);
        this.zzl = new WeakReference(zzcex0);
        this.zzj = zzbds0;
        this.zzm = zzcut0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if((!((Boolean)zzbe.zzc().zza(zzbcl.zzaB)).booleanValue() || !this.zze.zzb.zzb.zzh) && ((Boolean)zzbek.zzd.zze()).booleanValue()) {
            zzgby zzgby0 = zzgby.zzu(this.zzj.zza());
            zzcmq zzcmq0 = new zzcmq();
            zzgch.zzr(((zzgby)zzgch.zze(zzgby0, Throwable.class, zzcmq0, zzbzw.zzg)), new zzcmu(this), this.zzb);
            return;
        }
        List list0 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzc);
        int v = zzv.zzp().zzA(this.zza) ? 2 : 1;
        this.zzh.zzc(list0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvw0, String s, String s1) {
        List list0 = this.zzg.zze(this.zzf, this.zzf.zzh, zzbvw0);
        this.zzh.zza(list0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        List list0 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzi);
        this.zzh.zza(list0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        List list0 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzg);
        this.zzh.zza(list0);
    }

    // 检测为 Lambda 实现
    final void zzn() [...]

    // 检测为 Lambda 实现
    final void zzo(int v, int v1) [...]

    // 检测为 Lambda 实现
    final void zzp(int v, int v1) [...]

    @Override  // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(zze zze0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbD)).booleanValue()) {
            List list0 = zzfiv.zzf(2, zze0.zza, this.zzf.zzo);
            List list1 = this.zzg.zzc(this.zze, this.zzf, list0);
            this.zzh.zza(list1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if(!this.zzo.compareAndSet(false, true)) {
            return;
        }
        int v = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzdN)));
        if(v > 0) {
            this.zzw(v, ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzdO)))));
            return;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdM)).booleanValue()) {
            zzcmp zzcmp0 = () -> {
                zzcmr zzcmr0 = () -> {
                    String s;
                    List list0 = this.zzf.zzd;
                    if(list0 != null && !list0.isEmpty()) {
                        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdE)).booleanValue()) {
                            View view0 = (View)this.zzk.get();
                            s = this.zzi.zzc().zzh(this.zza, view0, null);
                        }
                        else {
                            s = null;
                        }
                        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaB)).booleanValue() && this.zze.zzb.zzb.zzh || !((Boolean)zzbek.zzh.zze()).booleanValue()) {
                            List list1 = this.zzu();
                            List list2 = this.zzg.zzd(this.zze, this.zzf, false, s, null, list1);
                            this.zzh.zza(list2);
                            return;
                        }
                        if(((Boolean)zzbek.zzg.zze()).booleanValue() && (this.zzf.zzb == 1 || this.zzf.zzb == 2 || this.zzf.zzb == 5)) {
                            zzcex zzcex0 = (zzcex)this.zzl.get();
                        }
                        zzgch.zzr(((zzgby)zzgch.zzo(zzgby.zzu(zzgch.zzh(null)), ((long)(((Long)zzbe.zzc().zza(zzbcl.zzbe)))), TimeUnit.MILLISECONDS, this.zzd)), new zzcmv(this, s), this.zzb);
                    }
                };
                this.zzb.execute(zzcmr0);
            };
            this.zzc.execute(zzcmp0);
            return;
        }
        this.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        synchronized(this) {
            if(this.zzn) {
                ArrayList arrayList0 = new ArrayList(this.zzu());
                arrayList0.addAll(this.zzf.zzf);
                List list0 = this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList0);
                this.zzh.zza(list0);
            }
            else {
                List list1 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzm);
                this.zzh.zza(list1);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzdJ)).booleanValue()) {
                    zzcut zzcut0 = this.zzm;
                    if(zzcut0 != null) {
                        String s = zzcut0.zza().zzg();
                        List list2 = zzfiv.zzh(zzfiv.zzg(zzcut0.zzb().zzm, s), this.zzm.zza().zza());
                        List list3 = this.zzg.zzc(this.zzm.zzc(), this.zzm.zzb(), list2);
                        this.zzh.zza(list3);
                    }
                }
                List list4 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzf);
                this.zzh.zza(list4);
            }
            this.zzn = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddj
    public final void zzt() {
        List list0 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzau);
        this.zzh.zza(list0);
    }

    private final List zzu() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzll)).booleanValue() && zzs.zzC(this.zza)) {
            Integer integer0 = zzs.zzt(this.zza);
            if(integer0 != null) {
                int v = Math.min(((int)integer0), 20);
                List list0 = new ArrayList();
                for(Object object0: this.zzf.zzd) {
                    list0.add(Uri.parse(((String)object0)).buildUpon().appendQueryParameter("dspct", Integer.toString(v)).toString());
                }
                return list0;
            }
        }
        return this.zzf.zzd;
    }

    // 检测为 Lambda 实现
    private final void zzv() [...]

    private final void zzw(int v, int v1) {
        if(v > 0) {
            View view0 = (View)this.zzk.get();
            if(view0 == null || view0.getHeight() == 0 || view0.getWidth() == 0) {
                zzcms zzcms0 = () -> {
                    zzcmt zzcmt0 = () -> this.zzw(v - 1, v1);
                    this.zzb.execute(zzcmt0);
                };
                this.zzd.schedule(zzcms0, ((long)v1), TimeUnit.MILLISECONDS);
                return;
            }
        }
        this.zzv();
    }
}

