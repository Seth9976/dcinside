package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

public final class zzcfz extends zzea {
    private final zzcbs zza;
    private final Object zzb;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    @Nullable
    private zzee zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbhe zzn;

    public zzcfz(zzcbs zzcbs0, float f, boolean z, boolean z1) {
        this.zzb = new Object();
        this.zzh = true;
        this.zza = zzcbs0;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z1;
    }

    public final void zzc(float f, float f1, int v, boolean z, float f2) {
        int v2;
        boolean z2;
        boolean z1 = true;
        synchronized(this.zzb) {
            if(f1 == this.zzi && f2 == this.zzk) {
                z1 = false;
            }
            this.zzi = f1;
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzmF)).booleanValue()) {
                this.zzj = f;
            }
            z2 = this.zzh;
            this.zzh = z;
            v2 = this.zze;
            this.zze = v;
            float f3 = this.zzk;
            this.zzk = f2;
            if(Math.abs(f2 - f3) > 0.0001f) {
                this.zza.zzF().invalidate();
            }
        }
        if(z1) {
            zzbhe zzbhe0 = this.zzn;
            if(zzbhe0 != null) {
                try {
                    zzbhe0.zze();
                }
                catch(RemoteException remoteException0) {
                    zzo.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
        this.zzw(v2, v, z2, z);
    }

    // 检测为 Lambda 实现
    final void zzd(int v, int v1, boolean z, boolean z1) [...]

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() {
        synchronized(this.zzb) {
        }
        return this.zzk;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
        synchronized(this.zzb) {
        }
        return this.zzj;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
        synchronized(this.zzb) {
        }
        return this.zzi;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() {
        synchronized(this.zzb) {
        }
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    @Nullable
    public final zzee zzi() throws RemoteException {
        synchronized(this.zzb) {
        }
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) {
        this.zzx((z ? "mute" : "unmute"), null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() {
        this.zzx("pause", null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() {
        this.zzx("play", null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(@Nullable zzee zzee0) {
        synchronized(this.zzb) {
            this.zzf = zzee0;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() {
        this.zzx("stop", null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() {
        boolean z;
        synchronized(this.zzb) {
            z = !this.zzp() && this.zzm && this.zzd;
        }
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() {
        boolean z = false;
        synchronized(this.zzb) {
            if(this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() {
        synchronized(this.zzb) {
        }
        return this.zzh;
    }

    // 检测为 Lambda 实现
    final void zzr(Map map0) [...]

    public final void zzs(zzga zzga0) {
        synchronized(this.zzb) {
            this.zzl = zzga0.zzb;
            this.zzm = zzga0.zzc;
        }
        this.zzx("initialState", CollectionUtils.mapOf("muteStart", (zzga0.zza ? "1" : "0"), "customControlsRequested", (zzga0.zzb ? "1" : "0"), "clickToExpandRequested", (zzga0.zzc ? "1" : "0")));
    }

    public final void zzt(float f) {
        synchronized(this.zzb) {
            this.zzj = f;
        }
    }

    public final void zzu() {
        int v;
        synchronized(this.zzb) {
            v = this.zze;
            this.zze = 3;
        }
        this.zzw(v, 3, this.zzh, this.zzh);
    }

    public final void zzv(zzbhe zzbhe0) {
        synchronized(this.zzb) {
            this.zzn = zzbhe0;
        }
    }

    private final void zzw(int v, int v1, boolean z, boolean z1) {
        zzcfy zzcfy0 = () -> {
            boolean z6;
            boolean z4;
            int v3;
            synchronized(this.zzb) {
                boolean z2 = this.zzg;
                boolean z3 = false;
                if(z2 || v1 != 1) {
                    v3 = v1;
                    z4 = false;
                }
                else {
                    v1 = 1;
                    v3 = 1;
                    z4 = true;
                }
                boolean z5 = v != v1;
                if(!z5 || v3 != 1) {
                    z6 = false;
                }
                else {
                    z6 = true;
                    v3 = 1;
                }
                if(z2 || z4) {
                    z3 = true;
                }
                try {
                    this.zzg = z3;
                    if(z4) {
                        zzee zzee0 = this.zzf;
                        if(zzee0 != null) {
                            zzee0.zzi();
                        }
                    }
                    if(z6) {
                        zzee zzee1 = this.zzf;
                        if(zzee1 != null) {
                            zzee1.zzh();
                        }
                    }
                    if(z5 && v3 == 2) {
                        zzee zzee2 = this.zzf;
                        if(zzee2 != null) {
                            zzee2.zzg();
                        }
                    }
                    if(z5 && v3 == 3) {
                        zzee zzee3 = this.zzf;
                        if(zzee3 != null) {
                            zzee3.zze();
                        }
                        this.zza.zzw();
                    }
                    if(z != z1) {
                        zzee zzee4 = this.zzf;
                        if(zzee4 != null) {
                            zzee4.zzf(z1);
                        }
                    }
                }
                catch(RemoteException remoteException0) {
                    zzo.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        };
        zzbzw.zzf.execute(zzcfy0);
    }

    private final void zzx(String s, @Nullable Map map0) {
        HashMap hashMap0 = map0 == null ? new HashMap() : new HashMap(map0);
        hashMap0.put("action", s);
        zzcfx zzcfx0 = () -> this.zza.zzd("pubVideoCmd", hashMap0);
        zzbzw.zzf.execute(zzcfx0);
    }
}

