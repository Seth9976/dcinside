package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzctj implements zzcyq, zzdee {
    private zzbve zza;
    private final AtomicBoolean zzb;
    private final Context zzc;
    private final zzfhk zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg;
    private boolean zzh;

    zzctj(Context context0, zzfhk zzfhk0, VersionInfoParcel versionInfoParcel0, Executor executor0) {
        this.zzg = false;
        this.zzh = false;
        this.zzb = new AtomicBoolean();
        this.zzc = context0;
        this.zzd = zzfhk0;
        this.zze = versionInfoParcel0;
        this.zzf = executor0;
    }

    // 检测为 Lambda 实现
    final void zzc() [...]

    public final void zzd() {
        zzbog zzbog0;
        int v = 3;
        if(!this.zzb.getAndSet(true)) {
            if(((Boolean)zzbel.zzj.zze()).booleanValue()) {
                goto label_12;
            label_14:
                v = 1;
            }
            else if(!((Boolean)zzbel.zzk.zze()).booleanValue()) {
                if(((Boolean)zzbel.zzi.zze()).booleanValue()) {
                    String s = zzv.zzp().zzi().zzg().zzc();
                    try {
                        String s1 = new JSONObject(s).optString("local_flag_write");
                        if(TextUtils.equals(s1, "client")) {
                            v = 2;
                            goto label_15;
                        label_12:
                            v = 2;
                        }
                        else if(!TextUtils.equals(s1, "service")) {
                            goto label_14;
                        }
                    }
                    catch(JSONException unused_ex) {
                        goto label_14;
                    }
                }
                else {
                    goto label_14;
                }
            }
        label_15:
            switch(v - 1) {
                case 1: {
                    VersionInfoParcel versionInfoParcel0 = VersionInfoParcel.forPackage();
                    zzbog0 = zzv.zzg().zza(this.zzc, versionInfoParcel0, this.zzd);
                    goto label_22;
                }
                case 2: {
                    VersionInfoParcel versionInfoParcel1 = VersionInfoParcel.forPackage();
                    zzbog0 = zzv.zzg().zzb(this.zzc, versionInfoParcel1, this.zzd);
                label_22:
                    zzbnw zzbnw0 = zzbog0.zza("google.afma.sdkConstants.getSdkConstants", zzbod.zza, zzbod.zza);
                    this.zza = new zzbvg(this.zzc, zzbnw0, this.zze);
                    this.zzg = true;
                }
            }
        }
        if(this.zzg) {
            zzbve zzbve0 = this.zza;
            if(zzbve0 != null) {
                t0 t00 = zzbve0.zza();
                if(!this.zzh && ((Boolean)zzbed.zzi.zze()).booleanValue()) {
                    t00.addListener(() -> {
                        zzbbv.zze(this.zzc);
                        this.zzh = true;
                    }, this.zzf);
                }
                zzbzz.zza(t00, "persistFlagsClient");
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
        this.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable zzbk zzbk0) {
        this.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String s) {
        this.zzd();
    }
}

