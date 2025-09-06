package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;

public abstract class zzto extends zztf {
    private final HashMap zza;
    @Nullable
    private Handler zzb;
    @Nullable
    private zzgy zzc;

    protected zzto() {
        this.zza = new HashMap();
    }

    // 检测为 Lambda 实现
    protected abstract void zzA(Object arg1, zzui arg2, zzbq arg3);

    protected final void zzB(Object object0, zzui zzui0) {
        zzcw.zzd(!this.zza.containsKey(object0));
        zztl zztl0 = (zzui arg2, zzbq arg3) -> ;;
        zztm zztm0 = new zztm(this, object0);
        zztn zztn0 = new zztn(zzui0, zztl0, zztm0);
        this.zza.put(object0, zztn0);
        Handler handler0 = this.zzb;
        handler0.getClass();
        zzui0.zzh(handler0, zztm0);
        Handler handler1 = this.zzb;
        handler1.getClass();
        zzui0.zzg(handler1, zztm0);
        zzui0.zzm(zztl0, this.zzc, this.zzb());
        if(!this.zzu()) {
            zzui0.zzi(zztl0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztf
    @CallSuper
    protected final void zzj() {
        for(Object object0: this.zza.values()) {
            ((zztn)object0).zza.zzi(((zztn)object0).zzb);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztf
    @CallSuper
    protected final void zzl() {
        for(Object object0: this.zza.values()) {
            ((zztn)object0).zza.zzk(((zztn)object0).zzb);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztf
    @CallSuper
    protected void zzn(@Nullable zzgy zzgy0) {
        this.zzc = zzgy0;
        this.zzb = zzei.zzy(null);
    }

    @Override  // com.google.android.gms.internal.ads.zztf
    @CallSuper
    protected void zzq() {
        for(Object object0: this.zza.values()) {
            ((zztn)object0).zza.zzp(((zztn)object0).zzb);
            ((zztn)object0).zza.zzs(((zztn)object0).zzc);
            ((zztn)object0).zza.zzr(((zztn)object0).zzc);
        }
        this.zza.clear();
    }

    protected int zzw(Object object0, int v) {
        return 0;
    }

    protected long zzx(Object object0, long v, @Nullable zzug zzug0) {
        return v;
    }

    @Nullable
    protected zzug zzy(Object object0, zzug zzug0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    @CallSuper
    public void zzz() throws IOException {
        for(Object object0: this.zza.values()) {
            ((zztn)object0).zza.zzz();
        }
    }
}

