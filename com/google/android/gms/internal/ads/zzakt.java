package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

public final class zzakt implements zzakf {
    private final zzdy zza;
    private final zzdy zzb;
    private final zzaks zzc;
    @Nullable
    private Inflater zzd;

    public zzakt() {
        this.zza = new zzdy();
        this.zzb = new zzdy();
        this.zzc = new zzaks();
    }

    @Override  // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] arr_b, int v, int v1, zzake zzake0, zzdb zzdb0) {
        this.zza.zzJ(arr_b, v1 + v);
        this.zza.zzL(v);
        zzdy zzdy0 = this.zza;
        if(zzdy0.zzb() > 0 && zzdy0.zzf() == 120) {
            if(this.zzd == null) {
                this.zzd = new Inflater();
            }
            if(zzei.zzH(zzdy0, this.zzb, this.zzd)) {
                zzdy0.zzJ(this.zzb.zzN(), this.zzb.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList0 = new ArrayList();
        while(true) {
            zzdy zzdy1 = this.zza;
            if(zzdy1.zzb() < 3) {
                break;
            }
            zzaks zzaks0 = this.zzc;
            int v2 = zzdy1.zze();
            int v3 = zzdy1.zzm();
            int v4 = zzdy1.zzq();
            int v5 = zzdy1.zzd() + v4;
            zzco zzco0 = null;
            if(v5 > v2) {
                zzdy1.zzL(v2);
            }
            else {
                if(v3 == 0x80) {
                    zzco0 = zzaks0.zza();
                    zzaks0.zze();
                }
                else {
                    switch(v3) {
                        case 20: {
                            zzaks.zzd(zzaks0, zzdy1, v4);
                            break;
                        }
                        case 21: {
                            zzaks.zzb(zzaks0, zzdy1, v4);
                            break;
                        }
                        case 22: {
                            zzaks.zzc(zzaks0, zzdy1, v4);
                        }
                    }
                }
                zzdy1.zzL(v5);
            }
            if(zzco0 != null) {
                arrayList0.add(zzco0);
            }
        }
        zzdb0.zza(new zzajx(arrayList0, 0x8000000000000001L, 0x8000000000000001L));
    }
}

