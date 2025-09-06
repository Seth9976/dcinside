package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.t0;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class zzcds extends zzfr {
    private final Context zza;
    private final zzfy zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbav zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private t0 zzo;
    private final AtomicLong zzp;
    private final zzcec zzq;

    public zzcds(Context context0, zzfy zzfy0, String s, int v, zzgy zzgy0, zzcec zzcec0) {
        super(false);
        this.zza = context0;
        this.zzb = zzfy0;
        this.zzq = zzcec0;
        this.zzc = s;
        this.zzd = v;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
        this.zzf(zzgy0);
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        if(!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream0 = this.zzf;
        int v2 = inputStream0 == null ? this.zzb.zza(arr_b, v, v1) : inputStream0.read(arr_b, v, v1);
        if(!this.zze || this.zzf != null) {
            this.zzg(v2);
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws IOException {
        boolean z1;
        zzbbh zzbbh0;
        zzbas zzbas0;
        if(this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z = true;
        this.zzg = true;
        this.zzh = zzgd0.zza;
        if(!this.zze) {
            this.zzj(zzgd0);
        }
        this.zzi = zzbav.zza(zzgd0.zza);
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzeq)).booleanValue()) {
            if(this.zzi == null) {
                zzbas0 = null;
            }
            else {
                this.zzi.zzh = zzgd0.zze;
                this.zzi.zzi = zzfve.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbas0 = zzv.zzc().zzb(this.zzi);
            }
            if(zzbas0 != null && zzbas0.zze()) {
                this.zzj = zzbas0.zzd();
                this.zzl = zzbas0.zzg();
                this.zzm = zzbas0.zzf();
                this.zzn = zzbas0.zza();
                this.zzk = true;
                if(!this.zzr()) {
                    this.zzf = zzbas0.zzc();
                    if(this.zze) {
                        this.zzj(zzgd0);
                    }
                    return -1L;
                }
            }
        }
        else if(this.zzi != null) {
            this.zzi.zzh = zzgd0.zze;
            this.zzi.zzi = zzfve.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            long v = (long)(this.zzi.zzg ? ((Long)zzbe.zzc().zza(zzbcl.zzes)) : ((Long)zzbe.zzc().zza(zzbcl.zzer)));
            long v1 = zzv.zzC().elapsedRealtime();
            Future future0 = zzbbg.zza(this.zza, this.zzi);
            try {
                zzbbh0 = (zzbbh)future0.get(v, TimeUnit.MILLISECONDS);
            }
            catch(ExecutionException | TimeoutException unused_ex) {
                z1 = false;
                goto label_34;
            }
            catch(InterruptedException unused_ex) {
                z1 = false;
                goto label_37;
            }
            catch(Throwable throwable0) {
                z = false;
                goto label_49;
            }
            try {
                this.zzj = zzbbh0.zzd();
                this.zzl = zzbbh0.zzf();
                this.zzm = zzbbh0.zze();
                this.zzn = zzbbh0.zza();
                if(!this.zzr()) {
                    this.zzf = zzbbh0.zzc();
                    if(this.zze) {
                        this.zzj(zzgd0);
                    }
                    goto label_54;
                }
                goto label_59;
            }
            catch(ExecutionException | TimeoutException unused_ex) {
            }
            catch(InterruptedException unused_ex) {
                goto label_36;
            }
            catch(Throwable throwable0) {
                goto label_49;
            }
            z1 = true;
            try {
            label_34:
                future0.cancel(true);
                goto label_43;
            label_36:
                z1 = true;
            label_37:
                future0.cancel(true);
                Thread.currentThread().interrupt();
            }
            catch(Throwable throwable0) {
                z = z1;
                goto label_49;
            }
        label_43:
            long v2 = zzv.zzC().elapsedRealtime() - v1;
            this.zzq.zza.zzab(z1, v2);
            this.zzk = z1;
            String s = "Cache connection took " + v2 + "ms";
            goto label_63;
        label_49:
            long v3 = zzv.zzC().elapsedRealtime() - v1;
            this.zzq.zza.zzab(z, v3);
            this.zzk = z;
            zze.zza(("Cache connection took " + v3 + "ms"));
            throw throwable0;
        label_54:
            long v4 = zzv.zzC().elapsedRealtime() - v1;
            this.zzq.zza.zzab(true, v4);
            this.zzk = true;
            zze.zza(("Cache connection took " + v4 + "ms"));
            return -1L;
        label_59:
            long v5 = zzv.zzC().elapsedRealtime() - v1;
            this.zzq.zza.zzab(true, v5);
            this.zzk = true;
            s = "Cache connection took " + v5 + "ms";
        label_63:
            zze.zza(s);
        }
        this.zzk = false;
        if(this.zzi != null) {
            zzgb zzgb0 = zzgd0.zza();
            zzgb0.zzd(Uri.parse(this.zzi.zza));
            zzgd0 = zzgb0.zze();
        }
        return this.zzb.zzb(zzgd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final Uri zzc() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        if(!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z = false;
        this.zzg = false;
        this.zzh = null;
        if(!this.zze || this.zzf != null) {
            z = true;
        }
        InputStream inputStream0 = this.zzf;
        if(inputStream0 == null) {
            this.zzb.zzd();
        }
        else {
            IOUtils.closeQuietly(inputStream0);
            this.zzf = null;
        }
        if(z) {
            this.zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if(this.zzi != null) {
            if(this.zzp.get() != -1L) {
                return this.zzp.get();
            }
            synchronized(this) {
                if(this.zzo == null) {
                    zzcdr zzcdr0 = () -> zzv.zzc().zza(this.zzi);
                    this.zzo = zzbzw.zza.zzb(zzcdr0);
                }
            }
            if(this.zzo.isDone()) {
                try {
                    long v1 = (long)(((Long)this.zzo.get()));
                    this.zzp.compareAndSet(-1L, v1);
                }
                catch(ExecutionException | InterruptedException unused_ex) {
                    return -1L;
                }
                return this.zzp.get();
            }
        }
        return -1L;
    }

    // 检测为 Lambda 实现
    final Long zzm() throws Exception [...]

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }

    private final boolean zzr() {
        if(!this.zze) {
            return false;
        }
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzet)).booleanValue() || this.zzl ? ((Boolean)zzbe.zzc().zza(zzbcl.zzeu)).booleanValue() && !this.zzm : true;
    }
}

