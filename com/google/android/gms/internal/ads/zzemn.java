package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class zzemn implements zzetr {
    private final zzgcs zza;
    private final zzdpm zzb;
    private final zzdua zzc;
    private final zzemp zzd;

    public zzemn(zzgcs zzgcs0, zzdpm zzdpm0, zzdua zzdua0, zzemp zzemp0) {
        this.zza = zzgcs0;
        this.zzb = zzdpm0;
        this.zzc = zzdua0;
        this.zzd = zzemp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzbcc zzbcc0 = zzbcl.zzlx;
        if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue() && this.zzd.zza() != null) {
            zzemo zzemo0 = this.zzd.zza();
            zzemo0.getClass();
            return zzgch.zzh(zzemo0);
        }
        if(!zzfve.zzd(((String)zzbe.zzc().zza(zzbcl.zzbz))) && (((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue() || !this.zzd.zzd() && this.zzc.zzt())) {
            this.zzd.zzc(true);
            zzemm zzemm0 = () -> {
                List list0 = Arrays.asList(((String)zzbe.zzc().zza(zzbcl.zzbz)).split(";"));
                Bundle bundle0 = new Bundle();
                for(Object object0: list0) {
                    String s = (String)object0;
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        zzfdh zzfdh0 = this.zzb.zzc(s, jSONObject0);
                        zzfdh0.zzC();
                        Bundle bundle1 = new Bundle();
                        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzlx)).booleanValue() || this.zzc.zzt()) {
                            try {
                                zzbrs zzbrs0 = zzfdh0.zzf();
                                if(zzbrs0 != null) {
                                    bundle1.putString("sdk_version", zzbrs0.toString());
                                }
                            }
                            catch(zzfcq unused_ex) {
                            }
                        }
                        try {
                            zzbrs zzbrs1 = zzfdh0.zze();
                            if(zzbrs1 != null) {
                                bundle1.putString("adapter_version", zzbrs1.toString());
                            }
                        }
                        catch(zzfcq unused_ex) {
                        }
                        bundle0.putBundle(s, bundle1);
                    }
                    catch(zzfcq unused_ex) {
                    }
                }
                zzemo zzemo0 = new zzemo(bundle0);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzlx)).booleanValue()) {
                    this.zzd.zzb(zzemo0);
                }
                return zzemo0;
            };
            return this.zza.zzb(zzemm0);
        }
        return zzgch.zzh(new zzemo(new Bundle()));
    }

    // 检测为 Lambda 实现
    final zzemo zzc() throws Exception [...]
}

