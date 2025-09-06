package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class zzaus implements zzauv {
    @VisibleForTesting
    volatile long zza;
    @Nullable
    private static zzaus zzb;
    private final Context zzc;
    private final zzfox zzd;
    private final zzfpe zze;
    private final zzfpg zzf;
    private final zzavx zzg;
    private final zzfni zzh;
    private final Executor zzi;
    private final zzfpd zzj;
    private final CountDownLatch zzk;
    private final zzawm zzl;
    @Nullable
    private final zzawe zzm;
    @Nullable
    private final zzavv zzn;
    private final Object zzo;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;

    @VisibleForTesting
    zzaus(@NonNull Context context0, @NonNull zzfni zzfni0, @NonNull zzfox zzfox0, @NonNull zzfpe zzfpe0, @NonNull zzfpg zzfpg0, @NonNull zzavx zzavx0, @NonNull Executor executor0, @NonNull zzfnd zzfnd0, int v, @Nullable zzawm zzawm0, @Nullable zzawe zzawe0, @Nullable zzavv zzavv0) {
        this.zza = 0L;
        this.zzo = new Object();
        this.zzc = context0;
        this.zzh = zzfni0;
        this.zzd = zzfox0;
        this.zze = zzfpe0;
        this.zzf = zzfpg0;
        this.zzg = zzavx0;
        this.zzi = executor0;
        this.zzr = v;
        this.zzl = zzawm0;
        this.zzm = zzawe0;
        this.zzn = zzavv0;
        this.zzq = false;
        this.zzk = new CountDownLatch(1);
        this.zzj = new zzauq(this, zzfnd0);
    }

    public static zzaus zza(@NonNull Context context0, @NonNull zzarg zzarg0, boolean z) {
        synchronized(zzaus.class) {
            zzfnj zzfnj0 = zzfnk.zzc();
            zzfnj0.zza("unknown_host");
            zzfnj0.zzg(zzarg0.zzi());
            zzfnk zzfnk0 = zzfnj0.zzh();
            return zzaus.zzs(context0, Executors.newCachedThreadPool(), zzfnk0, z);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzd(Context context0, @Nullable String s, @Nullable View view0) {
        return this.zze(context0, s, view0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zze(Context context0, String s, @Nullable View view0, @Nullable Activity activity0) {
        this.zzt();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzi();
        }
        this.zzp();
        zzfnl zzfnl0 = this.zzf.zza();
        if(zzfnl0 != null) {
            String s1 = zzfnl0.zza(context0, null, s, view0, activity0);
            this.zzh.zzf(5000, 0L, s1, null);
            return s1;
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzf(Context context0) {
        this.zzt();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzj();
        }
        this.zzp();
        zzfnl zzfnl0 = this.zzf.zza();
        if(zzfnl0 != null) {
            String s = zzfnl0.zzc(context0, null);
            this.zzh.zzf(5001, 0L, s, null);
            return s;
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzg(Context context0) {
        return "19";
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final String zzh(Context context0, @Nullable View view0, @Nullable Activity activity0) {
        this.zzt();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzk(context0, view0);
        }
        this.zzp();
        zzfnl zzfnl0 = this.zzf.zza();
        if(zzfnl0 != null) {
            String s = zzfnl0.zzb(context0, null, view0, activity0);
            this.zzh.zzf(5002, 0L, s, null);
            return s;
        }
        return "";
    }

    static void zzj(zzaus zzaus0) {
        String s1;
        String s;
        long v = System.currentTimeMillis();
        if(zzaus0.zzu(1) == null) {
            s1 = null;
            s = null;
        }
        else {
            s = "";
            s1 = "";
        }
        try {
            byte[] arr_b = zzfns.zza(zzaus0.zzc, 1, zzaus0.zzr, s1, s, "1", zzaus0.zzh).zzb;
            if(arr_b == null) {
                zzaus0.zzh.zzd(5009, System.currentTimeMillis() - v);
            }
            else if(arr_b.length == 0) {
                zzaus0.zzh.zzd(5009, System.currentTimeMillis() - v);
            }
            else {
                try {
                    zzaxw.zzb(zzgwj.zzv(arr_b, 0, arr_b.length), zzgxb.zza());
                }
                catch(NullPointerException unused_ex) {
                    zzaus0.zzh.zzd(2030, System.currentTimeMillis() - v);
                    return;
                }
                zzaus0.zzh.zzd(5010, System.currentTimeMillis() - v);
            }
        }
        catch(zzgyg zzgyg0) {
            zzaus0.zzh.zzc(4002, System.currentTimeMillis() - v, zzgyg0);
        }
        finally {
            zzaus0.zzk.countDown();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzk(@Nullable MotionEvent motionEvent0) {
        zzfnl zzfnl0 = this.zzf.zza();
        if(zzfnl0 != null) {
            try {
                zzfnl0.zzd(null, motionEvent0);
            }
            catch(zzfpf zzfpf0) {
                this.zzh.zzc(zzfpf0.zza(), -1L, zzfpf0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzl(int v, int v1, int v2) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlP)).booleanValue()) {
            DisplayMetrics displayMetrics0 = this.zzc.getResources().getDisplayMetrics();
            if(displayMetrics0 != null) {
                MotionEvent motionEvent0 = MotionEvent.obtain(0L, 0L, 0, ((float)v) * displayMetrics0.density, ((float)v1) * displayMetrics0.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
                this.zzk(motionEvent0);
                motionEvent0.recycle();
                MotionEvent motionEvent1 = MotionEvent.obtain(0L, 0L, 2, ((float)v) * displayMetrics0.density, ((float)v1) * displayMetrics0.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
                this.zzk(motionEvent1);
                motionEvent1.recycle();
                MotionEvent motionEvent2 = MotionEvent.obtain(0L, v2, 1, ((float)v) * displayMetrics0.density, ((float)v1) * displayMetrics0.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
                this.zzk(motionEvent2);
                motionEvent2.recycle();
            }
        }
    }

    final void zzm() {
        synchronized(this) {
            long v1 = System.currentTimeMillis();
            zzfow zzfow0 = this.zzu(1);
            if(zzfow0 != null) {
                if(this.zzf.zzc(zzfow0)) {
                    this.zzq = true;
                    this.zzk.countDown();
                    return;
                }
                return;
            }
            this.zzh.zzd(0xFAD, System.currentTimeMillis() - v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzn(StackTraceElement[] arr_stackTraceElement) {
        zzavv zzavv0 = this.zzn;
        if(zzavv0 != null) {
            zzavv0.zzb(Arrays.asList(arr_stackTraceElement));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauv
    public final void zzo(@Nullable View view0) {
        this.zzg.zzd(view0);
    }

    public final void zzp() {
        if(!this.zzp) {
            Object object0 = this.zzo;
            synchronized(object0) {
                if(!this.zzp) {
                    if(System.currentTimeMillis() / 1000L - this.zza < 3600L) {
                        return;
                    }
                    zzfow zzfow0 = this.zzf.zzb();
                    if((zzfow0 == null || zzfow0.zzd(3600L)) && zzfok.zza(this.zzr)) {
                        zzaur zzaur0 = new zzaur(this);
                        this.zzi.execute(zzaur0);
                    }
                }
            }
        }
    }

    public final boolean zzr() {
        synchronized(this) {
        }
        return this.zzq;
    }

    private static zzaus zzs(@NonNull Context context0, @NonNull Executor executor0, zzfnk zzfnk0, boolean z) {
        synchronized(zzaus.class) {
            if(zzaus.zzb == null) {
                zzfni zzfni0 = zzfni.zza(context0, executor0, z);
                zzavg zzavg0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzdw)).booleanValue() ? zzavg.zzc(context0) : null;
                zzawm zzawm0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzdx)).booleanValue() ? zzawm.zzd(context0, executor0) : null;
                zzawe zzawe0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzcM)).booleanValue() ? new zzawe() : null;
                zzavv zzavv0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzcT)).booleanValue() ? new zzavv() : null;
                zzfob zzfob0 = zzfob.zze(context0, executor0, zzfni0, zzfnk0);
                zzavw zzavw0 = new zzavw(context0);
                zzavx zzavx0 = new zzavx(zzfnk0, zzfob0, new zzawk(context0, zzavw0), zzavw0, zzavg0, zzawm0, zzawe0, zzavv0);
                int v1 = zzfok.zzb(context0, zzfni0);
                zzfnd zzfnd0 = new zzfnd();
                zzaus zzaus0 = new zzaus(context0, zzfni0, new zzfox(context0, v1), new zzfpe(context0, v1, new zzaup(zzfni0), ((Boolean)zzbe.zzc().zza(zzbcl.zzcw)).booleanValue()), new zzfpg(context0, zzavx0, zzfni0, zzfnd0), zzavx0, executor0, zzfnd0, v1, zzawm0, zzawe0, zzavv0);
                zzaus.zzb = zzaus0;
                zzaus0.zzm();
                zzaus.zzb.zzp();
            }
            return zzaus.zzb;
        }
    }

    private final void zzt() {
        zzawm zzawm0 = this.zzl;
        if(zzawm0 != null) {
            zzawm0.zzh();
        }
    }

    private final zzfow zzu(int v) {
        if(!zzfok.zza(this.zzr)) {
            return null;
        }
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzcu)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
    }
}

