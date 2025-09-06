package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfly implements zzflw {
    private final zzflw zza;

    public zzfly(zzflw zzflw0) {
        this.zza = zzflw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzflw
    public final JSONObject zza(View view0) {
        boolean z = false;
        JSONObject jSONObject0 = zzfmg.zza(0, 0, 0, 0);
        int v = zzfmj.zzb();
        if(v == 0) {
            throw null;
        }
        if(v - 1 == 0) {
            z = true;
        }
        try {
            jSONObject0.put("noOutputDevice", z);
        }
        catch(JSONException jSONException0) {
            zzfmh.zza("Error with setting output device status", jSONException0);
        }
        return jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzflw
    public final void zzb(View view0, JSONObject jSONObject0, zzflv zzflv0, boolean z, boolean z1) {
        int v2;
        int v1;
        ArrayList arrayList0 = new ArrayList();
        zzflk zzflk0 = zzflk.zza();
        if(zzflk0 != null) {
            Collection collection0 = zzflk0.zzb();
            IdentityHashMap identityHashMap0 = new IdentityHashMap(collection0.size() * 2 + 3);
            Iterator iterator0 = collection0.iterator();
        label_6:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                View view1 = ((zzfkt)object0).zzf();
                if(view1 != null && view1.isAttachedToWindow() && view1.isShown()) {
                    View view2 = view1;
                    while(view2 != null) {
                        if(view2.getAlpha() == 0.0f) {
                            continue label_6;
                        }
                        ViewParent viewParent0 = view2.getParent();
                        view2 = viewParent0 instanceof View ? ((View)viewParent0) : null;
                    }
                    View view3 = view1.getRootView();
                    if(view3 != null && !identityHashMap0.containsKey(view3)) {
                        identityHashMap0.put(view3, view3);
                        float f = view3.getZ();
                        int v;
                        for(v = arrayList0.size(); v > 0 && ((View)arrayList0.get(v - 1)).getZ() > f; --v) {
                        }
                        arrayList0.add(v, view3);
                    }
                }
            }
        }
        v1 = arrayList0.size();
        for(v2 = 0; v2 < v1; ++v2) {
            zzflv0.zza(((View)arrayList0.get(v2)), this.zza, jSONObject0, z1);
        }
    }
}

