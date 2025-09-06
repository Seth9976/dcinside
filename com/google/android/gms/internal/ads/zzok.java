package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class zzok extends ContentObserver {
    final zzon zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    public zzok(zzon zzon0, Handler handler0, ContentResolver contentResolver0, Uri uri0) {
        this.zza = zzon0;
        super(handler0);
        this.zzb = contentResolver0;
        this.zzc = uri0;
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzoi zzoi0 = zzoi.zzc(this.zza.zza, this.zza.zzh, this.zza.zzg);
        this.zza.zzj(zzoi0);
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}

