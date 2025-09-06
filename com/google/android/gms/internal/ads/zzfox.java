package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Hex;
import java.io.File;

public final class zzfox {
    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfox(@NonNull Context context0, int v) {
        this.zzc = context0.getSharedPreferences("pcvmspf", 0);
        File file0 = context0.getDir("pccache", 0);
        zzfoy.zza(file0, false);
        this.zzb = file0;
        File file1 = context0.getDir("tmppccache", 0);
        zzfoy.zza(file1, true);
        this.zza = file1;
        this.zzd = v;
    }

    // 去混淆评级： 中等(123)
    public final boolean zza(@NonNull zzaxw zzaxw0, @Nullable zzfpd zzfpd0) {
        zzaxw0.zzf().zzA();
        zzaxw0.zzd().zzA();
        return false;
    }

    @Nullable
    @VisibleForTesting
    final zzaxz zzb(int v) {
        String s = v == 1 ? this.zzc.getString(this.zzf(), null) : this.zzc.getString(this.zze(), null);
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            byte[] arr_b = Hex.stringToBytes(s);
            zzaxz zzaxz0 = zzaxz.zzh(zzgwj.zzv(arr_b, 0, arr_b.length));
            File file0 = zzfoy.zzb("", "pcam.jar", this.zzd());
            if(!file0.exists()) {
                file0 = zzfoy.zzb("", "pcam", this.zzd());
            }
            File file1 = zzfoy.zzb("", "pcbc", this.zzd());
            if(file0.exists() && file1.exists()) {
                return zzaxz0;
            }
        }
        catch(zzgyg unused_ex) {
        }
        return null;
    }

    @Nullable
    public final zzfow zzc(int v) {
        zzaxz zzaxz0 = this.zzb(1);
        if(zzaxz0 == null) {
            return null;
        }
        String s = zzaxz0.zzk();
        File file0 = zzfoy.zzb(s, "pcam.jar", this.zzd());
        if(!file0.exists()) {
            file0 = zzfoy.zzb(s, "pcam", this.zzd());
        }
        File file1 = zzfoy.zzb(s, "pcopt", this.zzd());
        return new zzfow(zzaxz0, file0, zzfoy.zzb(s, "pcbc", this.zzd()), file1);
    }

    private final File zzd() {
        File file0 = new File(this.zzb, Integer.toString(this.zzd - 1));
        if(!file0.exists()) {
            file0.mkdir();
        }
        return file0;
    }

    private final String zze() {
        return "FBAMTD" + (this.zzd - 1);
    }

    private final String zzf() {
        return "LATMTD" + (this.zzd - 1);
    }
}

