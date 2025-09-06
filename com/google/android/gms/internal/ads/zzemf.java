package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.common.util.concurrent.t0;

public final class zzemf implements zzetr {
    private final zzetr zza;
    private final zzfcj zzb;
    private final Context zzc;
    private final zzbzm zzd;

    zzemf(zzeoj zzeoj0, zzfcj zzfcj0, Context context0, zzbzm zzbzm0) {
        this.zza = zzeoj0;
        this.zzb = zzfcj0;
        this.zzc = context0;
        this.zzd = zzbzm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 7;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        return zzgch.zzm(this.zza.zzb(), (zzeua zzeua0) -> {
            String s1;
            int v2;
            int v1;
            float f;
            boolean z;
            String s;
            zzs zzs0 = this.zzb.zze;
            zzs[] arr_zzs = zzs0.zzg;
            if(arr_zzs == null) {
                s = zzs0.zza;
                z = zzs0.zzi;
            }
            else {
                s = null;
                boolean z1 = false;
                boolean z2 = false;
                z = false;
                for(int v = 0; v < arr_zzs.length; ++v) {
                    zzs zzs1 = arr_zzs[v];
                    boolean z3 = zzs1.zzi;
                    if(!z3 && !z1) {
                        s = zzs1.zza;
                        z1 = true;
                    }
                    if(z3) {
                        if(z2) {
                            z2 = true;
                        }
                        else {
                            z2 = true;
                            z = true;
                        }
                    }
                    if(z1 && z2) {
                        break;
                    }
                }
            }
            Resources resources0 = this.zzc.getResources();
            if(resources0 == null) {
            label_35:
                s1 = null;
                v2 = 0;
                f = 0.0f;
                v1 = 0;
            }
            else {
                DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                if(displayMetrics0 != null) {
                    f = displayMetrics0.density;
                    v1 = displayMetrics0.widthPixels;
                    v2 = displayMetrics0.heightPixels;
                    s1 = this.zzd.zzi().zzj();
                    goto label_39;
                }
                goto label_35;
            }
        label_39:
            StringBuilder stringBuilder0 = new StringBuilder();
            zzs[] arr_zzs1 = zzs0.zzg;
            if(arr_zzs1 != null) {
                boolean z4 = false;
                for(int v3 = 0; v3 < arr_zzs1.length; ++v3) {
                    zzs zzs2 = arr_zzs1[v3];
                    if(zzs2.zzi) {
                        z4 = true;
                    }
                    else {
                        if(stringBuilder0.length() != 0) {
                            stringBuilder0.append("|");
                        }
                        int v4 = zzs2.zze;
                        if(v4 == -1) {
                            v4 = f == 0.0f ? -1 : ((int)(((float)zzs2.zzf) / f));
                        }
                        stringBuilder0.append(v4);
                        stringBuilder0.append("x");
                        int v5 = zzs2.zzb;
                        if(v5 == -2) {
                            v5 = f == 0.0f ? -2 : ((int)(((float)zzs2.zzc) / f));
                        }
                        stringBuilder0.append(v5);
                    }
                }
                if(z4) {
                    if(stringBuilder0.length() != 0) {
                        stringBuilder0.insert(0, "|");
                    }
                    stringBuilder0.insert(0, "320x50");
                }
            }
            return new zzemg(zzs0, s, z, stringBuilder0.toString(), f, v1, v2, s1, this.zzb.zzq);
        }, zzbzw.zzg);
    }

    // 检测为 Lambda 实现
    final zzemg zzc(zzeua zzeua0) [...]
}

