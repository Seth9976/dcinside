package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.common.util.concurrent.t0;

public final class zzetf implements zzetr {
    private final zzgcs zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    @Nullable
    private final String zzd;

    zzetf(zzgcs zzgcs0, Context context0, VersionInfoParcel versionInfoParcel0, @Nullable String s) {
        this.zza = zzgcs0;
        this.zzb = context0;
        this.zzc = versionInfoParcel0;
        this.zzd = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 35;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzete zzete0 = () -> {
            boolean z = Wrappers.packageManager(this.zzb).isCallerInstantApp();
            boolean z1 = zzs.zzF(this.zzb);
            String s = this.zzc.afmaVersion;
            boolean z2 = zzs.zzG();
            return this.zzb.getApplicationInfo() == null ? new zzetg(z, z1, s, z2, 0, DynamiteModule.getRemoteVersion(this.zzb, "com.google.android.gms.ads.dynamite"), DynamiteModule.getLocalVersion(this.zzb, "com.google.android.gms.ads.dynamite"), this.zzd) : new zzetg(z, z1, s, z2, 35, DynamiteModule.getRemoteVersion(this.zzb, "com.google.android.gms.ads.dynamite"), DynamiteModule.getLocalVersion(this.zzb, "com.google.android.gms.ads.dynamite"), this.zzd);
        };
        return this.zza.zzb(zzete0);
    }

    // 检测为 Lambda 实现
    final zzetg zzc() throws Exception [...]
}

