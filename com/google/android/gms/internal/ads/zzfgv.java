package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;

public final class zzfgv {
    public static zzfgw zza(Context context0, int v) {
        boolean z;
        if(zzfhk.zza()) {
            if(v - 2 == 20 || v - 2 == 21) {
                z = ((Boolean)zzbee.zze.zze()).booleanValue();
            }
            else {
                switch(v - 2) {
                    case 5: {
                        z = ((Boolean)zzbee.zzb.zze()).booleanValue();
                        break;
                    }
                    case 2: 
                    case 3: 
                    case 6: 
                    case 7: 
                    case 8: {
                        z = ((Boolean)zzbee.zzc.zze()).booleanValue();
                        break;
                    }
                    case 4: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: {
                        z = ((Boolean)zzbee.zzd.zze()).booleanValue();
                        break;
                    }
                    default: {
                        return new zzfid();
                    }
                }
            }
            if(z) {
                return new zzfgy(context0, v);
            }
        }
        return new zzfid();
    }

    public static zzfgw zzb(Context context0, int v, int v1, zzm zzm0) {
        zzfgw zzfgw0 = zzfgv.zza(context0, v);
        if(zzfgw0 instanceof zzfgy) {
            zzfgw0.zzi();
            zzfgw0.zzn(v1);
            zzfgw0.zzf(zzaa.zza(zzm0.zzm));
            if(zzfhg.zze(zzm0.zzp)) {
                zzfgw0.zze(zzm0.zzp);
            }
        }
        return zzfgw0;
    }
}

