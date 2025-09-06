package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Map.Entry;

final class zzdu implements zzef {
    private final zzdo zzmn;
    private final boolean zzmo;
    private final zzex zzmx;
    private final zzbu zzmy;

    private zzdu(zzex zzex0, zzbu zzbu0, zzdo zzdo0) {
        this.zzmx = zzex0;
        this.zzmo = zzbu0.zze(zzdo0);
        this.zzmy = zzbu0;
        this.zzmn = zzdo0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final boolean equals(Object object0, Object object1) {
        if(!this.zzmx.zzq(object0).equals(this.zzmx.zzq(object1))) {
            return false;
        }
        return this.zzmo ? this.zzmy.zza(object0).equals(this.zzmy.zza(object1)) : true;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final int hashCode(Object object0) {
        int v = this.zzmx.zzq(object0).hashCode();
        return this.zzmo ? v * 53 + this.zzmy.zza(object0).hashCode() : v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final Object newInstance() {
        return this.zzmn.zzbd().zzbi();
    }

    static zzdu zza(zzex zzex0, zzbu zzbu0, zzdo zzdo0) {
        return new zzdu(zzex0, zzbu0, zzdo0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final void zza(Object object0, zzfr zzfr0) throws IOException {
        for(Object object1: this.zzmy.zza(object0)) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            zzca zzca0 = (zzca)map$Entry0.getKey();
            if(zzca0.zzav() != zzfq.zzrf || zzca0.zzaw() || zzca0.zzax()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            int v = zzca0.zzc();
            zzbb zzbb0 = map$Entry0 instanceof zzct ? ((zzct)map$Entry0).zzbs().zzr() : map$Entry0.getValue();
            zzfr0.zza(v, zzbb0);
        }
        Object object2 = this.zzmx.zzq(object0);
        this.zzmx.zzc(object2, zzfr0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final void zza(Object object0, byte[] arr_b, int v, int v1, zzay zzay0) throws IOException {
        zzey zzey0 = ((zzcg)object0).zzjp;
        if(zzey0 == zzey.zzea()) {
            zzey0 = zzey.zzeb();
            ((zzcg)object0).zzjp = zzey0;
        }
        while(v < v1) {
            int v2 = zzax.zza(arr_b, v, zzay0);
            int v3 = zzay0.zzfd;
            if(v3 == 11) {
                int v4 = 0;
                zzbb zzbb0 = null;
                while(v2 < v1) {
                    v2 = zzax.zza(arr_b, v2, zzay0);
                    int v5 = zzay0.zzfd;
                    int v6 = v5 & 7;
                    switch(v5 >>> 3) {
                        case 2: {
                            if(v6 == 0) {
                                v2 = zzax.zza(arr_b, v2, zzay0);
                                v4 = zzay0.zzfd;
                                continue;
                            }
                            break;
                        }
                        case 3: {
                            if(v6 == 2) {
                                v2 = zzax.zze(arr_b, v2, zzay0);
                                zzbb0 = (zzbb)zzay0.zzff;
                                continue;
                            }
                        }
                    }
                    if(v5 == 12) {
                        break;
                    }
                    v2 = zzax.zza(v5, arr_b, v2, v1, zzay0);
                }
                if(zzbb0 != null) {
                    zzey0.zzb(v4 << 3 | 2, zzbb0);
                }
                v = v2;
            }
            else {
                v = (v3 & 7) == 2 ? zzax.zza(v3, arr_b, v2, v1, zzey0, zzay0) : zzax.zza(v3, arr_b, v2, v1, zzay0);
            }
        }
        if(v != v1) {
            throw zzco.zzbo();
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(Object object0) {
        this.zzmx.zzc(object0);
        this.zzmy.zzc(object0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(Object object0, Object object1) {
        zzeh.zza(this.zzmx, object0, object1);
        if(this.zzmo) {
            zzeh.zza(this.zzmy, object0, object1);
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final int zzm(Object object0) {
        Object object1 = this.zzmx.zzq(object0);
        int v = this.zzmx.zzr(object1);
        return this.zzmo ? v + this.zzmy.zza(object0).zzat() : v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzef
    public final boolean zzo(Object object0) {
        return this.zzmy.zza(object0).isInitialized();
    }
}

