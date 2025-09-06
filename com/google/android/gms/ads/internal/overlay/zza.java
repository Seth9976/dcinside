package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzdrw;

public final class zza {
    public static final boolean zza(Context context0, Intent intent0, zzac zzac0, @Nullable zzaa zzaa0, boolean z, @Nullable zzdrw zzdrw0, String s) {
        if(z) {
            return zza.zzc(context0, intent0.getData(), zzac0, zzaa0);
        }
        try {
            zze.zza(("Launching an intent: " + intent0.toURI()));
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzmU)).booleanValue()) {
                zzs.zzX(context0, intent0, zzdrw0, s);
            }
            else {
                zzs.zzT(context0, intent0);
            }
            if(zzac0 != null) {
                zzac0.zzg();
            }
            if(zzaa0 != null) {
                zzaa0.zza(true);
            }
            return true;
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
        }
        zzo.zzj(activityNotFoundException0.getMessage());
        if(zzaa0 != null) {
            zzaa0.zza(false);
        }
        return false;
    }

    public static final boolean zzb(Context context0, @Nullable zzc zzc0, zzac zzac0, @Nullable zzaa zzaa0, @Nullable zzdrw zzdrw0, String s) {
        int v = 0;
        if(zzc0 == null) {
            zzo.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbcl.zza(context0);
        Intent intent0 = zzc0.zzh;
        if(intent0 != null) {
            return zza.zza(context0, intent0, zzac0, zzaa0, zzc0.zzj, zzdrw0, s);
        }
        Intent intent1 = new Intent();
        if(TextUtils.isEmpty(zzc0.zzb)) {
            zzo.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if(TextUtils.isEmpty(zzc0.zzc)) {
            intent1.setData(Uri.parse(zzc0.zzb));
        }
        else {
            intent1.setDataAndType(Uri.parse(zzc0.zzb), zzc0.zzc);
        }
        intent1.setAction("android.intent.action.VIEW");
        if(!TextUtils.isEmpty(zzc0.zzd)) {
            intent1.setPackage(zzc0.zzd);
        }
        if(!TextUtils.isEmpty(zzc0.zze)) {
            String[] arr_s = zzc0.zze.split("/", 2);
            if(arr_s.length < 2) {
                zzo.zzj(("Could not parse component name from open GMSG: " + zzc0.zze));
                return false;
            }
            intent1.setClassName(arr_s[0], arr_s[1]);
        }
        String s1 = zzc0.zzf;
        if(!TextUtils.isEmpty(s1)) {
            try {
                v = Integer.parseInt(s1);
            }
            catch(NumberFormatException unused_ex) {
                zzo.zzj("Could not parse intent flags.");
            }
            intent1.addFlags(v);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeD)).booleanValue()) {
            intent1.addFlags(0x10000000);
            intent1.putExtra("android.support.customtabs.extra.user_opt_out", true);
            return zza.zza(context0, intent1, zzac0, zzaa0, zzc0.zzj, zzdrw0, s);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeC)).booleanValue()) {
            zzs.zzp(context0, intent1);
        }
        return zza.zza(context0, intent1, zzac0, zzaa0, zzc0.zzj, zzdrw0, s);
    }

    private static final boolean zzc(Context context0, Uri uri0, zzac zzac0, zzaa zzaa0) {
        int v;
        try {
            v = zzv.zzq().zzn(context0, uri0);
            if(zzac0 != null) {
                zzac0.zzg();
            }
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            zzo.zzj(activityNotFoundException0.getMessage());
            v = 6;
        }
        if(zzaa0 != null) {
            zzaa0.zzb(v);
        }
        return v == 5;
    }
}

