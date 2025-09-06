package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

public final class zzflz implements zzflw {
    private final int[] zza;

    public zzflz() {
        this.zza = new int[2];
    }

    @Override  // com.google.android.gms.internal.ads.zzflw
    public final JSONObject zza(View view0) {
        if(view0 == null) {
            return zzfmg.zza(0, 0, 0, 0);
        }
        int v = view0.getWidth();
        int v1 = view0.getHeight();
        view0.getLocationOnScreen(this.zza);
        return zzfmg.zza(this.zza[0], this.zza[1], v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzflw
    public final void zzb(View view0, JSONObject jSONObject0, zzflv zzflv0, boolean z, boolean z1) {
        if(view0 instanceof ViewGroup) {
            if(z) {
                HashMap hashMap0 = new HashMap();
                for(int v1 = 0; v1 < ((ViewGroup)view0).getChildCount(); ++v1) {
                    View view1 = ((ViewGroup)view0).getChildAt(v1);
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(view1.getZ());
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                        hashMap0.put(view1.getZ(), arrayList0);
                    }
                    arrayList0.add(view1);
                }
                ArrayList arrayList1 = new ArrayList(hashMap0.keySet());
                Collections.sort(arrayList1);
                int v2 = arrayList1.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    ArrayList arrayList2 = (ArrayList)hashMap0.get(((Float)arrayList1.get(v3)));
                    int v4 = arrayList2.size();
                    for(int v5 = 0; v5 < v4; ++v5) {
                        zzflv0.zza(((View)arrayList2.get(v5)), this, jSONObject0, z1);
                    }
                }
                return;
            }
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                zzflv0.zza(((ViewGroup)view0).getChildAt(v), this, jSONObject0, z1);
            }
        }
    }
}

