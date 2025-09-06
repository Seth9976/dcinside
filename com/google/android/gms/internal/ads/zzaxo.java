package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.reflect.InvocationTargetException;

public final class zzaxo extends zzaxr {
    private final View zzh;

    public zzaxo(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1, View view0) {
        super(zzawd0, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", zzasc0, v, 57);
        this.zzh = view0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if(this.zzh != null) {
            Boolean boolean0 = (Boolean)zzbe.zzc().zza(zzbcl.zzdy);
            Boolean boolean1 = (Boolean)zzbe.zzc().zza(zzbcl.zzkP);
            DisplayMetrics displayMetrics0 = this.zza.zzb().getResources().getDisplayMetrics();
            zzawh zzawh0 = new zzawh(((String)this.zze.invoke(null, this.zzh, displayMetrics0, boolean0, boolean1)));
            zzasw zzasw0 = zzasx.zza();
            zzasw0.zzb(((long)zzawh0.zza));
            zzasw0.zzd(((long)zzawh0.zzb));
            zzasw0.zze(((long)zzawh0.zzc));
            if(boolean1.booleanValue()) {
                zzasw0.zzc(((long)zzawh0.zze));
            }
            if(boolean0.booleanValue()) {
                zzasw0.zza(((long)zzawh0.zzd));
            }
            zzasx zzasx0 = (zzasx)zzasw0.zzbn();
            this.zzd.zzY(zzasx0);
        }
    }
}

