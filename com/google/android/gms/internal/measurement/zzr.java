package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzr extends zzal {
    private final zzv zzk;

    public zzr(zzv zzv0) {
        super("internal.logger");
        this.zzk = zzv0;
        zzu zzu0 = new zzu(this, false, true);
        this.zzb.put("log", zzu0);
        zzq zzq0 = new zzq(this, "silent");
        this.zzb.put("silent", zzq0);
        ((zzal)this.zzb.get("silent")).zza("log", new zzu(this, true, true));
        zzt zzt0 = new zzt(this, "unmonitored");
        this.zzb.put("unmonitored", zzt0);
        ((zzal)this.zzb.get("unmonitored")).zza("log", new zzu(this, false, false));
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzh0, List list0) {
        return zzaq.zzc;
    }
}

