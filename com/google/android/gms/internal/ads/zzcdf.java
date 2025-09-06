package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcdf implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcde zzcde0;
        zzccw zzccw0;
        if(zzo.zzm(3)) {
            JSONObject jSONObject0 = new JSONObject(map0);
            jSONObject0.remove("google.afma.Notify_dt");
            zzo.zze(("Precache GMSG: " + jSONObject0.toString()));
        }
        zzccx zzccx0 = zzv.zzz();
        if(map0.containsKey("abort")) {
            if(zzccx0.zzd(((zzcbs)object0))) {
                return;
            }
            zzo.zzj("Precache abort but no precache task running.");
            return;
        }
        String s = (String)map0.get("src");
        Integer integer0 = zzcdf.zzb(map0, "periodicReportIntervalMs");
        Integer integer1 = zzcdf.zzb(map0, "exoPlayerRenderingIntervalMs");
        Integer integer2 = zzcdf.zzb(map0, "exoPlayerIdleIntervalMs");
        zzcbr zzcbr0 = new zzcbr(((String)map0.get("flags")));
        boolean z = zzcbr0.zzk;
        if(s != null) {
            String[] arr_s = {s};
            String s1 = (String)map0.get("demuxed");
            if(s1 != null) {
                try {
                    JSONArray jSONArray0 = new JSONArray(s1);
                    String[] arr_s1 = new String[jSONArray0.length()];
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        arr_s1[v] = jSONArray0.getString(v);
                    }
                    arr_s = arr_s1;
                }
                catch(JSONException unused_ex) {
                    zzo.zzj(("Malformed demuxed URL list for precache: " + s1));
                    arr_s = null;
                }
            }
            if(arr_s == null) {
                arr_s = new String[]{s};
            }
            if(z) {
                zzccw0 = null;
                for(Object object1: zzccx0) {
                    zzccw zzccw1 = (zzccw)object1;
                    if(zzccw1.zza == ((zzcbs)object0) && s.equals(zzccw1.zze())) {
                        zzccw0 = zzccw1;
                        break;
                    }
                }
            }
            else {
                zzccw0 = zzccx0.zza(((zzcbs)object0));
            }
            if(zzccw0 != null) {
                zzo.zzj("Precache task is already running.");
                return;
            }
            if(((zzcbs)object0).zzj() == null) {
                zzo.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer integer3 = zzcdf.zzb(map0, "player");
            if(integer3 == null) {
                integer3 = 0;
            }
            if(integer0 != null) {
                ((zzcbs)object0).zzA(((int)integer0));
            }
            if(integer1 != null) {
                ((zzcbs)object0).zzy(((int)integer1));
            }
            if(integer2 != null) {
                ((zzcbs)object0).zzx(((int)integer2));
            }
            ((zzcbs)object0).zzj();
            if(((int)integer3) > 0) {
                int v1 = zzcbj.zzu();
                if(v1 < zzcbr0.zzg) {
                    zzcde0 = new zzcdn(((zzcbs)object0), zzcbr0);
                }
                else {
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzn)).booleanValue()) {
                        v1 = zzcdk.zzi();
                    }
                    zzcde0 = v1 < zzcbr0.zzb ? new zzcdk(((zzcbs)object0), zzcbr0) : new zzcdi(((zzcbs)object0));
                }
            }
            else {
                zzcde0 = new zzcdh(((zzcbs)object0));
            }
            new zzccw(((zzcbs)object0), zzcde0, s, arr_s).zzb();
            goto label_76;
        }
        zzccw zzccw2 = zzccx0.zza(((zzcbs)object0));
        if(zzccw2 != null) {
            zzcde0 = zzccw2.zzb;
        label_76:
            Integer integer4 = zzcdf.zzb(map0, "minBufferMs");
            if(integer4 != null) {
                zzcde0.zzs(((int)integer4));
            }
            Integer integer5 = zzcdf.zzb(map0, "maxBufferMs");
            if(integer5 != null) {
                zzcde0.zzr(((int)integer5));
            }
            Integer integer6 = zzcdf.zzb(map0, "bufferForPlaybackMs");
            if(integer6 != null) {
                zzcde0.zzp(((int)integer6));
            }
            Integer integer7 = zzcdf.zzb(map0, "bufferForPlaybackAfterRebufferMs");
            if(integer7 != null) {
                zzcde0.zzq(((int)integer7));
            }
            return;
        }
        zzo.zzj("Precache must specify a source.");
    }

    @Nullable
    private static final Integer zzb(Map map0, String s) {
        if(!map0.containsKey(s)) {
            return null;
        }
        try {
            return Integer.parseInt(((String)map0.get(s)));
        }
        catch(NumberFormatException unused_ex) {
            zzo.zzj(("Precache invalid numeric parameter \'" + s + "\': " + ((String)map0.get(s))));
            return null;
        }
    }
}

