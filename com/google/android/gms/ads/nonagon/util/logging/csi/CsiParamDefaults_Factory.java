package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

public final class CsiParamDefaults_Factory implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public CsiParamDefaults_Factory(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    public static CsiParamDefaults_Factory create(zzhfj zzhfj0, zzhfj zzhfj1) {
        return new CsiParamDefaults_Factory(zzhfj0, zzhfj1);
    }

    @NonNull
    public CsiParamDefaults get() {
        return CsiParamDefaults_Factory.newInstance(((Context)this.zza.zzb()), ((VersionInfoParcel)this.zzb.zzb()));
    }

    @NonNull
    public static CsiParamDefaults newInstance(@NonNull Context context0, @NonNull VersionInfoParcel versionInfoParcel0) {
        return new CsiParamDefaults(context0, versionInfoParcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @NonNull
    public final Object zzb() {
        return this.get();
    }
}

