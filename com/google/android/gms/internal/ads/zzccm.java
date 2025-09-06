package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class zzccm implements zzfy {
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
    private zzgd zzl;

    public zzccm(Context context0, zzfy zzfy0, String s, int v, zzgy zzgy0, zzccl zzccl0) {
        this.zza = context0;
        this.zzb = zzfy0;
        this.zzc = s;
        this.zzd = v;
        this.zzj = false;
        this.zzk = false;
        new AtomicLong(-1L);
        this.zze = ((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        if(!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream0 = this.zzf;
        return inputStream0 == null ? this.zzb.zza(arr_b, v, v1) : inputStream0.read(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws IOException {
        if(this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        this.zzh = zzgd0.zza;
        this.zzl = zzgd0;
        this.zzi = zzbav.zza(zzgd0.zza);
        zzbas zzbas0 = null;
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzeq)).booleanValue()) {
            if(this.zzi != null) {
                this.zzi.zzh = zzgd0.zze;
                this.zzi.zzi = zzfve.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbas0 = zzv.zzc().zzb(this.zzi);
            }
            if(zzbas0 != null && zzbas0.zze()) {
                this.zzj = zzbas0.zzg();
                this.zzk = zzbas0.zzf();
                if(!this.zzg()) {
                    this.zzf = zzbas0.zzc();
                    return -1L;
                }
            }
        }
        else if(this.zzi != null) {
            this.zzi.zzh = zzgd0.zze;
            this.zzi.zzi = zzfve.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            long v = (long)(this.zzi.zzg ? ((Long)zzbe.zzc().zza(zzbcl.zzes)) : ((Long)zzbe.zzc().zza(zzbcl.zzer)));
            zzv.zzC().elapsedRealtime();
            Future future0 = zzbbg.zza(this.zza, this.zzi);
            try {
                try {
                    zzbbh zzbbh0 = (zzbbh)future0.get(v, TimeUnit.MILLISECONDS);
                    this.zzj = zzbbh0.zzf();
                    this.zzk = zzbbh0.zze();
                    if(!this.zzg()) {
                        this.zzf = zzbbh0.zzc();
                    }
                }
                catch(ExecutionException | TimeoutException unused_ex) {
                    future0.cancel(false);
                }
                catch(InterruptedException unused_ex) {
                    future0.cancel(false);
                    Thread.currentThread().interrupt();
                }
            }
            catch(Throwable unused_ex) {
            }
            zzv.zzC().elapsedRealtime();
            throw null;
        }
        if(this.zzi != null) {
            zzgb zzgb0 = zzgd0.zza();
            zzgb0.zzd(Uri.parse(this.zzi.zza));
            this.zzl = zzgb0.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final Uri zzc() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        if(!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream0 = this.zzf;
        if(inputStream0 != null) {
            IOUtils.closeQuietly(inputStream0);
            this.zzf = null;
            return;
        }
        this.zzb.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        return Collections.emptyMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgy0) {
    }

    private final boolean zzg() {
        if(!this.zze) {
            return false;
        }
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzet)).booleanValue() || this.zzj ? ((Boolean)zzbe.zzc().zza(zzbcl.zzeu)).booleanValue() && !this.zzk : true;
    }
}

