package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzddm extends zzdbj implements zzayk {
    private final Map zzb;
    private final Context zzc;
    private final zzfbo zzd;

    public zzddm(Context context0, Set set0, zzfbo zzfbo0) {
        super(set0);
        this.zzb = new WeakHashMap(1);
        this.zzc = context0;
        this.zzd = zzfbo0;
    }

    public final void zza(View view0) {
        synchronized(this) {
            zzayl zzayl0 = (zzayl)this.zzb.get(view0);
            if(zzayl0 == null) {
                zzayl zzayl1 = new zzayl(this.zzc, view0);
                zzayl1.zzc(this);
                this.zzb.put(view0, zzayl1);
                zzayl0 = zzayl1;
            }
            if(this.zzd.zzX && ((Boolean)zzbe.zzc().zza(zzbcl.zzbx)).booleanValue()) {
                zzayl0.zzg(((long)(((Long)zzbe.zzc().zza(zzbcl.zzbw)))));
                return;
            }
            zzayl0.zzf();
        }
    }

    public final void zzb(View view0) {
        synchronized(this) {
            if(this.zzb.containsKey(view0)) {
                ((zzayl)this.zzb.get(view0)).zze(this);
                this.zzb.remove(view0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        synchronized(this) {
            this.zzq(new zzddl(zzayj0));
        }
    }
}

