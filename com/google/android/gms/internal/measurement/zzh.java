package com.google.android.gms.internal.measurement;

import J1.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzh {
    @e
    private final zzh zza;
    @e
    private zzbb zzb;
    @e
    private Map zzc;
    @e
    private Map zzd;

    public zzh(zzh zzh0, zzbb zzbb0) {
        this.zzc = new HashMap();
        this.zzd = new HashMap();
        this.zza = zzh0;
        this.zzb = zzbb0;
    }

    public final zzaq zza(zzaf zzaf0) {
        zzaq zzaq0 = zzaq.zzc;
        Iterator iterator0 = zzaf0.zzg();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            zzaq0 = this.zzb.zza(this, zzaf0.zza(((int)(((Integer)object0)))));
            if(zzaq0 instanceof zzaj) {
                break;
            }
        }
        return zzaq0;
    }

    public final zzaq zza(zzaq zzaq0) {
        return this.zzb.zza(this, zzaq0);
    }

    public final zzaq zza(String s) {
        do {
            if(this.zzc.containsKey(s)) {
                return (zzaq)this.zzc.get(s);
            }
            this = this.zza;
        }
        while(this != null);
        throw new IllegalArgumentException(String.format("%s is not defined", s));
    }

    public final zzh zza() {
        return new zzh(this, this.zzb);
    }

    public final void zza(String s, zzaq zzaq0) {
        if(!this.zzd.containsKey(s)) {
            if(zzaq0 == null) {
                this.zzc.remove(s);
                return;
            }
            this.zzc.put(s, zzaq0);
        }
    }

    public final void zzb(String s, zzaq zzaq0) {
        this.zza(s, zzaq0);
        this.zzd.put(s, Boolean.TRUE);
    }

    public final boolean zzb(String s) {
        do {
            if(this.zzc.containsKey(s)) {
                return true;
            }
            this = this.zza;
        }
        while(this != null);
        return false;
    }

    public final void zzc(String s, zzaq zzaq0) {
        while(!this.zzc.containsKey(s) && (this.zza != null && this.zza.zzb(s))) {
            this = this.zza;
        }
        if(!this.zzd.containsKey(s)) {
            if(zzaq0 == null) {
                this.zzc.remove(s);
                return;
            }
            this.zzc.put(s, zzaq0);
        }
    }
}

