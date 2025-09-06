package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzgf implements zzfy {
    private final Context zza;
    private final List zzb;
    private final zzfy zzc;
    @Nullable
    private zzfy zzd;
    @Nullable
    private zzfy zze;
    @Nullable
    private zzfy zzf;
    @Nullable
    private zzfy zzg;
    @Nullable
    private zzfy zzh;
    @Nullable
    private zzfy zzi;
    @Nullable
    private zzfy zzj;
    @Nullable
    private zzfy zzk;

    public zzgf(Context context0, zzfy zzfy0) {
        this.zza = context0.getApplicationContext();
        this.zzc = zzfy0;
        this.zzb = new ArrayList();
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        zzfy zzfy0 = this.zzk;
        zzfy0.getClass();
        return zzfy0.zza(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws IOException {
        zzfy zzfy1;
        zzcw.zzf(this.zzk == null);
        String s = zzgd0.zza.getScheme();
        String s1 = zzgd0.zza.getScheme();
        if(!TextUtils.isEmpty(s1) && !"file".equals(s1)) {
            if("asset".equals(s)) {
                this.zzk = this.zzg();
                return this.zzk.zzb(zzgd0);
            }
            if("content".equals(s)) {
                if(this.zzf == null) {
                    zzfv zzfv0 = new zzfv(this.zza);
                    this.zzf = zzfv0;
                    this.zzh(zzfv0);
                }
                this.zzk = this.zzf;
                return this.zzk.zzb(zzgd0);
            }
            if("rtmp".equals(s)) {
                if(this.zzg == null) {
                    try {
                        zzfy zzfy0 = (zzfy)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.zzg = zzfy0;
                        this.zzh(zzfy0);
                    }
                    catch(ClassNotFoundException unused_ex) {
                        zzdo.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    }
                    catch(Exception exception0) {
                        throw new RuntimeException("Error instantiating RTMP extension", exception0);
                    }
                    if(this.zzg == null) {
                        this.zzg = this.zzc;
                    }
                }
                this.zzk = this.zzg;
                return this.zzk.zzb(zzgd0);
            }
            if("udp".equals(s)) {
                if(this.zzh == null) {
                    zzha zzha0 = new zzha(2000);
                    this.zzh = zzha0;
                    this.zzh(zzha0);
                }
                this.zzk = this.zzh;
                return this.zzk.zzb(zzgd0);
            }
            if("data".equals(s)) {
                if(this.zzi == null) {
                    zzfw zzfw0 = new zzfw();
                    this.zzi = zzfw0;
                    this.zzh(zzfw0);
                }
                this.zzk = this.zzi;
                return this.zzk.zzb(zzgd0);
            }
            if("rawresource".equals(s) || "android.resource".equals(s)) {
                if(this.zzj == null) {
                    zzgw zzgw0 = new zzgw(this.zza);
                    this.zzj = zzgw0;
                    this.zzh(zzgw0);
                }
                zzfy1 = this.zzj;
            }
            else {
                zzfy1 = this.zzc;
            }
            this.zzk = zzfy1;
            return this.zzk.zzb(zzgd0);
        }
        String s2 = zzgd0.zza.getPath();
        if(s2 != null && s2.startsWith("/android_asset/")) {
            this.zzk = this.zzg();
            return this.zzk.zzb(zzgd0);
        }
        if(this.zzd == null) {
            zzgn zzgn0 = new zzgn();
            this.zzd = zzgn0;
            this.zzh(zzgn0);
        }
        this.zzk = this.zzd;
        return this.zzk.zzb(zzgd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzk == null ? null : this.zzk.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        zzfy zzfy0 = this.zzk;
        if(zzfy0 != null) {
            try {
                zzfy0.zzd();
                this.zzk = null;
            }
            catch(Throwable throwable0) {
                this.zzk = null;
                throw throwable0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        return this.zzk == null ? Collections.emptyMap() : this.zzk.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgy0) {
        zzgy0.getClass();
        this.zzc.zzf(zzgy0);
        this.zzb.add(zzgy0);
        zzgf.zzi(this.zzd, zzgy0);
        zzgf.zzi(this.zze, zzgy0);
        zzgf.zzi(this.zzf, zzgy0);
        zzgf.zzi(this.zzg, zzgy0);
        zzgf.zzi(this.zzh, zzgy0);
        zzgf.zzi(this.zzi, zzgy0);
        zzgf.zzi(this.zzj, zzgy0);
    }

    private final zzfy zzg() {
        if(this.zze == null) {
            zzfq zzfq0 = new zzfq(this.zza);
            this.zze = zzfq0;
            this.zzh(zzfq0);
        }
        return this.zze;
    }

    private final void zzh(zzfy zzfy0) {
        for(int v = 0; v < this.zzb.size(); ++v) {
            zzfy0.zzf(((zzgy)this.zzb.get(v)));
        }
    }

    private static final void zzi(@Nullable zzfy zzfy0, zzgy zzgy0) {
        if(zzfy0 != null) {
            zzfy0.zzf(zzgy0);
        }
    }
}

