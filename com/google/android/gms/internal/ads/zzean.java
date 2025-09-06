package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzean implements zzgcd {
    final boolean zza;
    final zzeao zzb;

    zzean(zzeao zzeao0, boolean z) {
        this.zza = z;
        this.zzb = zzeao0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzo.zzg("Failed to get signals bundle");
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        zzbbq.zzd.zza zzbbq$zzd$zza0;
        List list1;
        Iterator iterator0;
        ArrayList arrayList0;
        if(this.zzb.zzf()) {
            return;
        }
        Bundle bundle0 = ((zzcuv)object0).zza;
        Object object1 = bundle0.get("ad_types");
        if(object1 instanceof List) {
            arrayList0 = new ArrayList(((List)object1).size());
            iterator0 = ((List)object1).iterator();
            goto label_12;
        }
        else if(object1 instanceof String[]) {
            List list0 = Arrays.asList(((String[])object1));
            arrayList0 = new ArrayList(list0.size());
            iterator0 = list0.iterator();
        label_12:
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                if(object2 instanceof String) {
                    arrayList0.add(((String)object2));
                }
            }
            list1 = DesugarCollections.unmodifiableList(arrayList0);
        }
        else {
            list1 = Collections.emptyList();
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object3: list1) {
            switch(((String)object3)) {
                case "banner": {
                    zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzb;
                    break;
                }
                case "interstitial": {
                    zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzc;
                    break;
                }
                case "native": {
                    zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzf;
                    break;
                }
                case "rewarded": {
                    zzbbq$zzd$zza0 = zzbbq.zzd.zza.zzj;
                    break;
                }
                default: {
                    zzbbq$zzd$zza0 = zzbbq.zzd.zza.zza;
                }
            }
            arrayList1.add(zzbbq$zzd$zza0);
        }
        zzbbq.zzaf.zzd zzbbq$zzaf$zzd0 = zzeao.zzb(this.zzb, bundle0);
        zzbbq.zzab zzbbq$zzab0 = zzeao.zza(this.zzb, bundle0);
        zzeam zzeam0 = new zzeam(this, this.zza, arrayList1, zzbbq$zzab0, zzbbq$zzaf$zzd0);
        this.zzb.zza.zza(zzeam0);
    }
}

