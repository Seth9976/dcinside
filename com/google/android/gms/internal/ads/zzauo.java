package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public final class zzauo {
    public static final String zza(@NonNull Context context0, @NonNull String s, boolean z) {
        try {
            zzatf zzatf0 = zzatg.zza();
            zzatf0.zzb(s);
            zzatf0.zza("1.671910402");
            zzatf0.zzc("com.dcinside.app.android");
            zzatf0.zzd(System.currentTimeMillis() / 1000L);
            try {
                zzatf0.zze(((long)context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionCode));
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                zzatf0.zze(-1L);
            }
            zzatm zzatm0 = zzaty.zza(((zzatg)zzatf0.zzbn()).zzaV(), null);
            zzatm0.zzd(5);
            zzatm0.zzc(2);
            return Base64.encodeToString(((zzatn)zzatm0.zzbn()).zzaV(), 11);
        }
        catch(GeneralSecurityException | UnsupportedEncodingException unused_ex) {
            return "7";
        }
    }
}

