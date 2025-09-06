package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

public final class zzbii implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        long v2;
        long v1;
        long v;
        String s = (String)map0.get("action");
        if("tick".equals(s)) {
            String s1 = (String)map0.get("label");
            String s2 = (String)map0.get("start_label");
            String s3 = (String)map0.get("timestamp");
            if(TextUtils.isEmpty(s1)) {
                zzo.zzj("No label given for CSI tick.");
                return;
            }
            if(TextUtils.isEmpty(s3)) {
                zzo.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                v = Long.parseLong(s3);
                v1 = zzv.zzC().currentTimeMillis();
                v2 = zzv.zzC().elapsedRealtime();
            }
            catch(NumberFormatException numberFormatException0) {
                zzo.zzk("Malformed timestamp for CSI tick.", numberFormatException0);
                return;
            }
            if(TextUtils.isEmpty(s2)) {
                s2 = "native:view_load";
            }
            ((zzcex)object0).zzm().zzc(s1, s2, v2 + (v - v1));
            return;
        }
        if("experiment".equals(s)) {
            String s4 = (String)map0.get("value");
            if(TextUtils.isEmpty(s4)) {
                zzo.zzj("No value given for CSI experiment.");
                return;
            }
            ((zzcex)object0).zzm().zza().zzd("e", s4);
            return;
        }
        if("extra".equals(s)) {
            String s5 = (String)map0.get("name");
            String s6 = (String)map0.get("value");
            if(TextUtils.isEmpty(s6)) {
                zzo.zzj("No value given for CSI extra.");
                return;
            }
            if(TextUtils.isEmpty(s5)) {
                zzo.zzj("No name given for CSI extra.");
                return;
            }
            ((zzcex)object0).zzm().zza().zzd(s5, s6);
        }
    }
}

