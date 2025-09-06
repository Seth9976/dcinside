package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdgz implements zzbjp {
    private final WeakReference zza;
    private final WeakReference zzb;

    zzdgz(zzdhb zzdhb0, View view0, zzdha zzdha0) {
        this.zza = new WeakReference(zzdhb0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmK)).booleanValue()) {
            this.zzb = new WeakReference(view0);
            return;
        }
        this.zzb = new WeakReference(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzdhb zzdhb0 = (zzdhb)this.zza.get();
        if(zzdhb0 != null) {
            zzdhb0.zzg.zza();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzmK)).booleanValue()) {
                zzdhb.zzg(zzdhb0, ((View)this.zzb.get()));
            }
        }
    }
}

