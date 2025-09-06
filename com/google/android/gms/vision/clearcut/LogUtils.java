package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.vision.zzfi.zza;
import com.google.android.gms.internal.vision.zzfi.zzf.zzb;
import com.google.android.gms.internal.vision.zzfi.zzf;
import com.google.android.gms.internal.vision.zzfi.zzi;
import com.google.android.gms.internal.vision.zzfi.zzj;
import com.google.android.gms.internal.vision.zzfi.zzo;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.L;
import java.util.ArrayList;
import java.util.List;

@Keep
public class LogUtils {
    public static zza zza(Context context0) {
        com.google.android.gms.internal.vision.zzfi.zza.zza zzfi$zza$zza0 = zza.zza().zza("com.dcinside.app.android");
        String s = LogUtils.zzb(context0);
        if(s != null) {
            zzfi$zza$zza0.zzb(s);
        }
        return (zza)(((zzjb)zzfi$zza$zza0.zzf()));
    }

    public static zzo zza(long v, int v1, @Nullable String s, String s1, @Nullable List list0, zzs zzs0) {
        com.google.android.gms.internal.vision.zzfi.zzi.zza zzfi$zzi$zza0 = zzi.zza();
        zzb zzfi$zzf$zzb0 = zzf.zza().zza(s1).zza(v).zzb(((long)v1));
        zzfi$zzf$zzb0.zza(list0);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(((zzf)(((zzjb)zzfi$zzf$zzb0.zzf()))));
        zzi zzfi$zzi0 = (zzi)(((zzjb)zzfi$zzi$zza0.zza(arrayList0).zza(((zzj)(((zzjb)zzj.zza().zzb(((long)zzs0.zzb)).zza(((long)zzs0.zza)).zzc(((long)zzs0.zzc)).zzd(zzs0.zzd).zzf())))).zzf()));
        return (zzo)(((zzjb)zzo.zza().zza(zzfi$zzi0).zzf()));
    }

    @Nullable
    private static String zzb(Context context0) {
        try {
            return Wrappers.packageManager(context0).getPackageInfo("com.dcinside.app.android", 0).versionName;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            L.e(packageManager$NameNotFoundException0, "Unable to find calling package info for %s", new Object[]{"com.dcinside.app.android"});
            return null;
        }
    }
}

