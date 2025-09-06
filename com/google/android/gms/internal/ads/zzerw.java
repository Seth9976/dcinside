package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzerw implements zzetq {
    private final zzfcj zza;
    @Nullable
    private final PackageInfo zzb;
    private final zzg zzc;

    public zzerw(zzfcj zzfcj0, @Nullable PackageInfo packageInfo0, zzg zzg0) {
        this.zza = zzfcj0;
        this.zzb = packageInfo0;
        this.zzc = zzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        ArrayList arrayList0 = this.zza.zzg;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            this.zzc(((zzcuv)object0).zzb);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        String s1;
        int v = 0;
        ArrayList arrayList0 = this.zza.zzg;
        if(arrayList0 != null) {
            if(arrayList0.isEmpty()) {
                ((zzcuv)object0).zza.putInt("native_version", 0);
                return;
            }
            String s = "any";
            Bundle bundle0 = ((zzcuv)object0).zza;
            bundle0.putInt("native_version", 3);
            bundle0.putStringArrayList("native_templates", arrayList0);
            bundle0.putStringArrayList("native_custom_templates", this.zza.zzh);
            zzbfl zzbfl0 = this.zza.zzi;
            if(zzbfl0 != null) {
                if(zzbfl0.zza > 3) {
                    bundle0.putBoolean("enable_native_media_orientation", true);
                    int v1 = this.zza.zzi.zzh;
                    switch(v1) {
                        case 1: {
                            s1 = "any";
                            break;
                        }
                        case 2: {
                            s1 = "landscape";
                            break;
                        }
                        case 3: {
                            s1 = "portrait";
                            break;
                        }
                        default: {
                            s1 = v1 == 4 ? "square" : "unknown";
                        }
                    }
                    if(!"unknown".equals(s1)) {
                        bundle0.putString("native_media_orientation", s1);
                    }
                }
                switch(this.zza.zzi.zzc) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        s = "portrait";
                        break;
                    }
                    case 2: {
                        s = "landscape";
                        break;
                    }
                    default: {
                        s = "unknown";
                    }
                }
                if(!"unknown".equals(s)) {
                    bundle0.putString("native_image_orientation", s);
                }
                bundle0.putBoolean("native_multiple_images", this.zza.zzi.zzd);
                bundle0.putBoolean("use_custom_mute", this.zza.zzi.zzg);
                this.zzc(((zzcuv)object0).zza);
            }
            PackageInfo packageInfo0 = this.zzb;
            if(packageInfo0 != null) {
                v = packageInfo0.versionCode;
            }
            if(v > this.zzc.zza()) {
                this.zzc.zzq();
                this.zzc.zzt(v);
            }
            JSONObject jSONObject0 = this.zzc.zzn();
            CharSequence charSequence0 = null;
            if(jSONObject0 != null) {
                JSONArray jSONArray0 = jSONObject0.optJSONArray(this.zza.zzf);
                if(jSONArray0 != null) {
                    charSequence0 = jSONArray0.toString();
                }
            }
            if(!TextUtils.isEmpty(charSequence0)) {
                bundle0.putString("native_advanced_settings", ((String)charSequence0));
            }
            int v2 = this.zza.zzk;
            if(v2 > 1) {
                bundle0.putInt("max_num_ads", v2);
            }
            String s2 = "p";
            zzblz zzblz0 = this.zza.zzb;
            if(zzblz0 != null) {
                if(TextUtils.isEmpty(zzblz0.zzc)) {
                    if(zzblz0.zza < 2) {
                        int v3 = zzblz0.zzb;
                        if(v3 == 1) {
                            s2 = "l";
                        }
                        else if(v3 != 2) {
                            zzo.zzg(("Instream ad video aspect ratio " + v3 + " is wrong."));
                            s2 = "l";
                        }
                    }
                    else if(zzblz0.zzd == 2 || zzblz0.zzd != 3) {
                        s2 = "l";
                    }
                    bundle0.putString("ia_var", s2);
                }
                else {
                    bundle0.putString("ad_tag", zzblz0.zzc);
                }
                bundle0.putBoolean("instr", true);
            }
            if(this.zza.zza() != null) {
                bundle0.putBoolean("has_delayed_banner_listener", true);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzlJ)).booleanValue()) {
                zzbfl zzbfl1 = this.zza.zzi;
                if(zzbfl1 != null) {
                    if(zzbfl1.zzf != null) {
                        Bundle bundle1 = new Bundle();
                        bundle1.putBoolean("startMuted", this.zza.zzi.zzf.zza);
                        bundle1.putBoolean("clickToExpandRequested", this.zza.zzi.zzf.zzc);
                        bundle1.putBoolean("customControlsRequested", this.zza.zzi.zzf.zzb);
                        bundle0.putBundle("video", bundle1);
                    }
                    bundle0.putBoolean("disable_image_loading", this.zza.zzi.zzb);
                    bundle0.putInt("preferred_ad_choices_position", this.zza.zzi.zze);
                }
            }
        }
    }

    private final void zzc(Bundle bundle0) {
        zzbfl zzbfl0 = this.zza.zzi;
        if(zzbfl0 != null && zzbfl0.zzi != 0) {
            bundle0.putBoolean("sccg_tap", zzbfl0.zzj);
            bundle0.putInt("sccg_dir", this.zza.zzi.zzi);
        }
    }
}

