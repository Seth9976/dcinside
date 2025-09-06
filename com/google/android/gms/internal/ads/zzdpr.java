package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o3.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdpr {
    private final Map zza;
    @Nullable
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    @Nullable
    private JSONObject zze;
    private final AtomicBoolean zzf;

    public zzdpr(Executor executor0) {
        this.zza = new ConcurrentHashMap();
        this.zzf = new AtomicBoolean(false);
        this.zzc = executor0;
    }

    @a
    public final JSONObject zza() {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzef)).booleanValue() ? this.zzb : null;
    }

    @a
    public final JSONObject zzb(String s, String s1) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzed)).booleanValue() && s != null && s1 != null) {
            if(!this.zzd) {
                this.zzh();
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzee)).booleanValue()) {
                    this.zzg();
                }
            }
            Map map0 = (Map)this.zza.get(s1);
            if(map0 != null) {
                JSONObject jSONObject0 = (JSONObject)map0.get(s);
                if(jSONObject0 != null) {
                    return jSONObject0;
                }
                String s2 = zzdpt.zza(this.zze, s, s1);
                return s2 == null ? null : ((JSONObject)map0.get(s2));
            }
        }
        return null;
    }

    public final void zzd() {
        this.zzg();
        zzdpo zzdpo0 = () -> this.zzh();
        this.zzc.execute(zzdpo0);
    }

    // 检测为 Lambda 实现
    final void zze() [...]

    // 检测为 Lambda 实现
    final void zzf() [...]

    private final void zzg() {
        if(!this.zzf.getAndSet(true)) {
            zzv.zzp().zzi().zzo(() -> {
                zzdpq zzdpq0 = () -> {
                    Map map0;
                    synchronized(this) {
                        this.zzd = true;
                        zzbzg zzbzg0 = zzv.zzp().zzi().zzg();
                        if(zzbzg0 != null) {
                            JSONObject jSONObject0 = zzbzg0.zzf();
                            if(jSONObject0 != null) {
                                this.zzb = ((Boolean)zzbe.zzc().zza(zzbcl.zzef)).booleanValue() ? jSONObject0.optJSONObject("common_settings") : null;
                                this.zze = jSONObject0.optJSONObject("ad_unit_patterns");
                                JSONArray jSONArray0 = jSONObject0.optJSONArray("ad_unit_id_settings");
                                if(jSONArray0 != null) {
                                    for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                                        JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                                        if(jSONObject1 != null) {
                                            String s = jSONObject1.optString("ad_unit_id");
                                            String s1 = jSONObject1.optString("format");
                                            JSONObject jSONObject2 = jSONObject1.optJSONObject("request_signals");
                                            if(s != null && jSONObject2 != null && s1 != null) {
                                                if(this.zza.containsKey(s1)) {
                                                    map0 = (Map)this.zza.get(s1);
                                                }
                                                else {
                                                    ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                                                    this.zza.put(s1, concurrentHashMap0);
                                                    map0 = concurrentHashMap0;
                                                }
                                                map0.put(s, jSONObject2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                };
                this.zzc.execute(zzdpq0);
            });
        }
    }

    // 检测为 Lambda 实现
    private final void zzh() [...]
}

