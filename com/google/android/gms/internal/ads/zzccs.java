package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcj;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzccs implements zzbjp {
    private boolean zza;

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        int v10;
        int v9;
        int v7;
        Integer integer2;
        zzcbs zzcbs0 = (zzcbs)object0;
        String s = (String)map0.get("action");
        if(s == null) {
            zzo.zzj("Action missing from video GMSG.");
            return;
        }
        Integer integer0 = map0.containsKey("playerId") ? Integer.parseInt(((String)map0.get("playerId"))) : null;
        Integer integer1 = zzcbs0.zzo() == null ? null : zzcbs0.zzo().zzb();
        if(integer0 != null && integer1 != null && !integer0.equals(integer1) && !s.equals("load")) {
            zzo.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", integer0, integer1));
            return;
        }
        if(zzo.zzm(3)) {
            JSONObject jSONObject0 = new JSONObject(map0);
            jSONObject0.remove("google.afma.Notify_dt");
            zzo.zze(("Video GMSG: " + s + " " + jSONObject0.toString()));
        }
        if(s.equals("background")) {
            String s1 = (String)map0.get("color");
            if(TextUtils.isEmpty(s1)) {
                zzo.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcbs0.setBackgroundColor(Color.parseColor(s1));
            }
            catch(IllegalArgumentException unused_ex) {
                zzo.zzj("Invalid color parameter in background video GMSG.");
            }
            return;
        }
        if(s.equals("playerBackground")) {
            String s2 = (String)map0.get("color");
            if(TextUtils.isEmpty(s2)) {
                zzo.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcbs0.zzB(Color.parseColor(s2));
            }
            catch(IllegalArgumentException unused_ex) {
                zzo.zzj("Invalid color parameter in playerBackground video GMSG.");
            }
            return;
        }
        if(s.equals("decoderProps")) {
            String s3 = (String)map0.get("mimeTypes");
            if(s3 == null) {
                zzo.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap0 = new HashMap();
                hashMap0.put("event", "decoderProps");
                hashMap0.put("error", "missingMimeTypes");
                zzcbs0.zzd("onVideoEvent", hashMap0);
                return;
            }
            HashMap hashMap1 = new HashMap();
            String[] arr_s = s3.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                String s4 = arr_s[v];
                hashMap1.put(s4, zzcj.zza(s4.trim()));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event", "decoderProps");
            hashMap2.put("mimeTypes", hashMap1);
            zzcbs0.zzd("onVideoEvent", hashMap2);
            return;
        }
        zzcbh zzcbh0 = zzcbs0.zzo();
        if(zzcbh0 == null) {
            zzo.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean z = s.equals("new");
        if(!z && !s.equals("position")) {
            zzcfz zzcfz0 = zzcbs0.zzq();
            if(zzcfz0 != null) {
                if(s.equals("timeupdate")) {
                    String s5 = (String)map0.get("currentTime");
                    if(s5 == null) {
                        zzo.zzj("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzcfz0.zzt(Float.parseFloat(s5));
                    }
                    catch(NumberFormatException unused_ex) {
                        zzo.zzj(("Could not parse currentTime parameter from timeupdate video GMSG: " + s5));
                    }
                    return;
                }
                if(s.equals("skip")) {
                    zzcfz0.zzu();
                    return;
                }
            }
            zzcbg zzcbg0 = zzcbh0.zza();
            if(zzcbg0 == null) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "no_video_view");
                zzcbs0.zzd("onVideoEvent", hashMap3);
                return;
            }
            if(s.equals("click")) {
                Context context0 = zzcbs0.getContext();
                int v1 = zzccs.zzb(context0, map0, "x", 0);
                float f = (float)zzccs.zzb(context0, map0, "y", 0);
                long v2 = SystemClock.uptimeMillis();
                MotionEvent motionEvent0 = MotionEvent.obtain(v2, v2, 0, ((float)v1), f, 0);
                zzcbg0.zzx(motionEvent0);
                motionEvent0.recycle();
                return;
            }
            if(s.equals("currentTime")) {
                String s6 = (String)map0.get("time");
                if(s6 == null) {
                    zzo.zzj("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    zzcbg0.zzw(((int)(Float.parseFloat(s6) * 1000.0f)));
                }
                catch(NumberFormatException unused_ex) {
                    zzo.zzj(("Could not parse time parameter from currentTime video GMSG: " + s6));
                }
                return;
            }
            if(s.equals("hide")) {
                zzcbg0.setVisibility(4);
                return;
            }
            if(s.equals("remove")) {
                zzcbg0.setVisibility(8);
                return;
            }
            if(s.equals("load")) {
                zzcbg0.zzr(integer0);
                return;
            }
            if(s.equals("loadControl")) {
                zzccs.zzc(zzcbg0, map0);
                return;
            }
            if(s.equals("muted")) {
                if(Boolean.parseBoolean(((String)map0.get("muted")))) {
                    zzcbg0.zzs();
                    return;
                }
                zzcbg0.zzI();
                return;
            }
            if(s.equals("pause")) {
                zzcbg0.zzu();
                return;
            }
            if(s.equals("play")) {
                zzcbg0.zzv();
                return;
            }
            if(s.equals("show")) {
                zzcbg0.setVisibility(0);
                return;
            }
            if(s.equals("src")) {
                String s7 = (String)map0.get("src");
                if(map0.containsKey("periodicReportIntervalMs")) {
                    try {
                        integer2 = Integer.parseInt(((String)map0.get("periodicReportIntervalMs")));
                    }
                    catch(NumberFormatException unused_ex) {
                        zzo.zzj(("Video gmsg invalid numeric parameter \'periodicReportIntervalMs\': " + ((String)map0.get("periodicReportIntervalMs"))));
                        integer2 = null;
                    }
                }
                else {
                    integer2 = null;
                }
                String[] arr_s1 = {s7};
                String s8 = (String)map0.get("demuxed");
                if(s8 != null) {
                    try {
                        JSONArray jSONArray0 = new JSONArray(s8);
                        String[] arr_s2 = new String[jSONArray0.length()];
                        for(int v3 = 0; v3 < jSONArray0.length(); ++v3) {
                            arr_s2[v3] = jSONArray0.getString(v3);
                        }
                        arr_s1 = arr_s2;
                    }
                    catch(JSONException unused_ex) {
                        zzo.zzj(("Malformed demuxed URL list for playback: " + s8));
                        arr_s1 = new String[]{s7};
                    }
                }
                if(integer2 != null) {
                    zzcbs0.zzA(((int)integer2));
                }
                zzcbg0.zzE(s7, arr_s1);
                return;
            }
            if(s.equals("touchMove")) {
                Context context1 = zzcbs0.getContext();
                zzcbg0.zzH(((float)zzccs.zzb(context1, map0, "dx", 0)), ((float)zzccs.zzb(context1, map0, "dy", 0)));
                if(this.zza) {
                    return;
                }
                zzcbs0.zzdg();
                this.zza = true;
                return;
            }
            if(s.equals("volume")) {
                String s9 = (String)map0.get("volume");
                if(s9 == null) {
                    zzo.zzj("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    zzcbg0.zzG(Float.parseFloat(s9));
                }
                catch(NumberFormatException unused_ex) {
                    zzo.zzj(("Could not parse volume parameter from volume video GMSG: " + s9));
                }
                return;
            }
            if(s.equals("watermark")) {
                zzcbg0.zzn();
                return;
            }
            zzo.zzj(("Unknown video action: " + s));
            return;
        }
        Context context2 = zzcbs0.getContext();
        int v4 = zzccs.zzb(context2, map0, "x", 0);
        int v5 = zzccs.zzb(context2, map0, "y", 0);
        int v6 = zzccs.zzb(context2, map0, "w", -1);
        zzbcc zzbcc0 = zzbcl.zzdW;
        if(!((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
            if(zze.zzc()) {
                zze.zza(("Calculate width with original width " + v6 + ", videoHost.getVideoBoundingWidth() " + zzcbs0.zzh() + ", x " + v4 + "."));
            }
            v7 = Math.min(v6, zzcbs0.zzh() - v4);
        }
        else if(v6 == -1) {
            v7 = zzcbs0.zzh();
        }
        else {
            v7 = Math.min(v6, zzcbs0.zzh());
        }
        int v8 = zzccs.zzb(context2, map0, "h", -1);
        if(!((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
            if(zze.zzc()) {
                zze.zza(("Calculate height with original height " + v8 + ", videoHost.getVideoBoundingHeight() " + zzcbs0.zzg() + ", y " + v5 + "."));
            }
            v9 = Math.min(v8, zzcbs0.zzg() - v5);
        }
        else if(v8 == -1) {
            v9 = zzcbs0.zzg();
        }
        else {
            v9 = Math.min(v8, zzcbs0.zzg());
        }
        try {
            v10 = 0;
            v10 = Integer.parseInt(((String)map0.get("player")));
        }
        catch(NumberFormatException unused_ex) {
        }
        boolean z1 = Boolean.parseBoolean(((String)map0.get("spherical")));
        if(z && zzcbh0.zza() == null) {
            zzcbh0.zzd(v4, v5, v7, v9, v10, z1, new zzcbr(((String)map0.get("flags"))));
            zzcbg zzcbg1 = zzcbh0.zza();
            if(zzcbg1 != null) {
                zzccs.zzc(zzcbg1, map0);
            }
            return;
        }
        zzcbh0.zzc(v4, v5, v7, v9);
    }

    private static int zzb(Context context0, Map map0, String s, int v) {
        String s1 = (String)map0.get(s);
        if(s1 != null) {
            try {
                v = zzf.zzx(context0, Integer.parseInt(s1));
            }
            catch(NumberFormatException unused_ex) {
                zzo.zzj(("Could not parse " + s + " in a video GMSG: " + s1));
            }
        }
        if(zze.zzc()) {
            zze.zza(("Parse pixels for " + s + ", got string " + s1 + ", int " + v + "."));
        }
        return v;
    }

    private static void zzc(zzcbg zzcbg0, Map map0) {
        String s = (String)map0.get("minBufferMs");
        String s1 = (String)map0.get("maxBufferMs");
        String s2 = (String)map0.get("bufferForPlaybackMs");
        String s3 = (String)map0.get("bufferForPlaybackAfterRebufferMs");
        String s4 = (String)map0.get("socketReceiveBufferSize");
        try {
            if(s != null) {
                zzcbg0.zzB(Integer.parseInt(s));
            }
            if(s1 != null) {
                zzcbg0.zzA(Integer.parseInt(s1));
            }
            if(s2 != null) {
                zzcbg0.zzy(Integer.parseInt(s2));
            }
            if(s3 != null) {
                zzcbg0.zzz(Integer.parseInt(s3));
            }
            if(s4 != null) {
                zzcbg0.zzD(Integer.parseInt(s4));
            }
        }
        catch(NumberFormatException unused_ex) {
            zzo.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", s, s1));
        }
    }
}

