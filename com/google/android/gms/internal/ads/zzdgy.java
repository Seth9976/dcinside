package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdgy implements zzbjp {
    private final WeakReference zza;

    zzdgy(zzdhb zzdhb0, zzdha zzdha0) {
        this.zza = new WeakReference(zzdhb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzdhb zzdhb0 = (zzdhb)this.zza.get();
        if(zzdhb0 != null) {
            zzdhb0.zzh.onAdClicked();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                zzdhb0.zzi.zzdd();
                if(!TextUtils.isEmpty(((CharSequence)map0.get("sccg")))) {
                    zzdhb0.zzi.zzu();
                }
            }
        }
    }
}

