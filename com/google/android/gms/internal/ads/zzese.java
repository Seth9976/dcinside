package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.t0;

public final class zzese implements zzetr {
    private final ApplicationInfo zza;
    @Nullable
    private final PackageInfo zzb;
    private final Context zzc;

    zzese(ApplicationInfo applicationInfo0, @Nullable PackageInfo packageInfo0, Context context0) {
        this.zza = applicationInfo0;
        this.zzb = packageInfo0;
        this.zzc = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 29;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        String s4;
        PackageManager.NameNotFoundException packageManager$NameNotFoundException1;
        String s3;
        InstallSourceInfo installSourceInfo0;
        String s2;
        String s1;
        Integer integer0;
        String s;
        try {
            s = this.zza.packageName;
            integer0 = this.zzb == null ? null : this.zzb.versionCode;
            s1 = this.zzb == null ? null : this.zzb.versionName;
            s2 = null;
            s2 = String.valueOf(Wrappers.packageManager(this.zzc).getApplicationLabel(s));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        if(Build.VERSION.SDK_INT >= 30 && ((Boolean)zzbe.zzc().zza(zzbcl.zzmD)).booleanValue()) {
            try {
                installSourceInfo0 = this.zzc.getPackageManager().getInstallSourceInfo(s);
                if(installSourceInfo0 != null) {
                    s3 = installSourceInfo0.getInstallingPackageName();
                    goto label_15;
                }
                return zzgch.zzh(new zzesf(s, integer0, s1, s2, null, null));
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                s3 = null;
                packageManager$NameNotFoundException1 = packageManager$NameNotFoundException0;
                s4 = null;
                zzv.zzp().zzw(packageManager$NameNotFoundException1, "PackageInfoSignalSource.getInstallSourceInfo");
                return zzgch.zzh(new zzesf(s, integer0, s1, s2, s3, s4));
            }
            try {
            label_15:
                if(TextUtils.isEmpty(s3)) {
                    zze.zza("No installing package name found");
                    s3 = null;
                }
                s4 = installSourceInfo0.getInitiatingPackageName();
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException2) {
                packageManager$NameNotFoundException1 = packageManager$NameNotFoundException2;
                s4 = null;
                zzv.zzp().zzw(packageManager$NameNotFoundException1, "PackageInfoSignalSource.getInstallSourceInfo");
                return zzgch.zzh(new zzesf(s, integer0, s1, s2, s3, s4));
            }
            try {
                if(TextUtils.isEmpty(s4)) {
                    zze.zza("No initiating package name found");
                    return zzgch.zzh(new zzesf(s, integer0, s1, s2, s3, null));
                }
                return zzgch.zzh(new zzesf(s, integer0, s1, s2, s3, s4));
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
            }
            zzv.zzp().zzw(packageManager$NameNotFoundException1, "PackageInfoSignalSource.getInstallSourceInfo");
            return zzgch.zzh(new zzesf(s, integer0, s1, s2, s3, s4));
        }
        return zzgch.zzh(new zzesf(s, integer0, s1, s2, null, null));
    }
}

