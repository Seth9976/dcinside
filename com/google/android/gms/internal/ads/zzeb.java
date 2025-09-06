package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

final class zzeb implements zzdg {
    @Nullable
    private Message zza;

    private zzeb() {
        throw null;
    }

    zzeb(zzec zzec0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final void zza() {
        Message message0 = this.zza;
        message0.getClass();
        message0.sendToTarget();
        this.zza = null;
        zzed.zzl(this);
    }

    public final zzeb zzb(Message message0, zzed zzed0) {
        this.zza = message0;
        return this;
    }

    public final boolean zzc(Handler handler0) {
        Message message0 = this.zza;
        message0.getClass();
        boolean z = handler0.sendMessageAtFrontOfQueue(message0);
        this.zza = null;
        zzed.zzl(this);
        return z;
    }
}

