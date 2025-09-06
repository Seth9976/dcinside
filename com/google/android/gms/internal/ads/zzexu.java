package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzexu extends zzbx implements zzr, zzazx {
    @Nullable
    protected zzcog zza;
    private final zzcgx zzb;
    private final Context zzc;
    private AtomicBoolean zzd;
    private final String zze;
    private final zzexo zzf;
    private final zzexm zzg;
    private final VersionInfoParcel zzh;
    private final zzdrw zzi;
    private long zzj;
    @Nullable
    private zzcnt zzk;

    public zzexu(zzcgx zzcgx0, Context context0, String s, zzexo zzexo0, zzexm zzexm0, VersionInfoParcel versionInfoParcel0, zzdrw zzdrw0) {
        this.zzd = new AtomicBoolean();
        this.zzj = -1L;
        this.zzb = zzcgx0;
        this.zzc = context0;
        this.zze = s;
        this.zzf = zzexo0;
        this.zzg = zzexm0;
        this.zzh = versionInfoParcel0;
        this.zzi = zzdrw0;
        zzexm0.zzm(this);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbi0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzbl0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzcc0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzs0) {
        synchronized(this) {
            Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcm0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbag zzbag0) {
        this.zzg.zzo(zzbag0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzy0) {
        this.zzf.zzl(zzy0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzct0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzef0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtn zzbtn0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdg zzbdg0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdr0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbtq zzbtq0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwc zzbwc0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzga0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() {
        synchronized(this) {
        }
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() {
        synchronized(this) {
            return this.zzf.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzazx
    public final void zza() {
        this.zzq(3);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzm0) throws RemoteException {
        synchronized(this) {
            if(!zzm0.zzb()) {
                boolean z = ((Boolean)zzbej.zzd.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue();
                if(this.zzh.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlb)))) || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
            }
            if(com.google.android.gms.ads.internal.util.zzs.zzI(this.zzc) && zzm0.zzs == null) {
                zzo.zzg("Failed to load the ad because app ID is missing.");
                zze zze0 = zzfdk.zzd(4, null, null);
                this.zzg.zzdz(zze0);
                return false;
            }
            if(this.zzZ()) {
                return false;
            }
            this.zzd = new AtomicBoolean();
            zzexs zzexs0 = new zzexs(this);
            zzext zzext0 = new zzext(this);
            return this.zzf.zzb(zzm0, this.zze, zzexs0, zzext0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcq0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        synchronized(this) {
            if(this.zza != null) {
                this.zzj = zzv.zzC().elapsedRealtime();
                int v1 = this.zza.zza();
                if(v1 > 0) {
                    zzcnt zzcnt0 = new zzcnt(this.zzb.zzD(), zzv.zzC());
                    this.zzk = zzcnt0;
                    zzcnt0.zzd(v1, () -> this.zzb.zzC().execute(() -> this.zzq(5)));
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        synchronized(this) {
            zzcog zzcog0 = this.zza;
            if(zzcog0 != null) {
                zzcog0.zze(zzv.zzC().elapsedRealtime() - this.zzj, 1);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        if(v == 0) {
            throw null;
        }
        if(v - 1 != 0) {
            switch(v - 1) {
                case 1: {
                    this.zzq(4);
                    return;
                }
                case 2: {
                    this.zzq(3);
                    return;
                }
                default: {
                    this.zzq(6);
                    return;
                }
            }
        }
        this.zzq(2);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzdy zzk() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() {
        return null;
    }

    // 检测为 Lambda 实现
    final void zzo() [...]

    // 检测为 Lambda 实现
    @VisibleForTesting
    public final void zzp() [...]

    private final void zzq(int v) {
        synchronized(this) {
            if(this.zzd.compareAndSet(false, true)) {
                this.zzg.zzj();
                zzcnt zzcnt0 = this.zzk;
                if(zzcnt0 != null) {
                    zzv.zzb().zze(zzcnt0);
                }
                long v2 = -1L;
                if(this.zza != null) {
                    if(this.zzj != -1L) {
                        v2 = zzv.zzC().elapsedRealtime() - this.zzj;
                    }
                    this.zza.zze(v2, v);
                }
                this.zzx();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        synchronized(this) {
        }
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzs() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzt() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            zzcog zzcog0 = this.zza;
            if(zzcog0 != null) {
                zzcog0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzm0, zzbo zzbo0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
        }
    }
}

