package com.iab.omid.library.unity3d.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.p;
import com.iab.omid.library.unity3d.utils.e;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

public class c implements a {
    private final a a;

    public c(a a0) {
        this.a = a0;
    }

    @Override  // com.iab.omid.library.unity3d.processor.a
    public JSONObject a(View view0) {
        JSONObject jSONObject0 = com.iab.omid.library.unity3d.utils.c.c(0, 0, 0, 0);
        com.iab.omid.library.unity3d.utils.c.e(jSONObject0, e.a());
        return jSONObject0;
    }

    @Override  // com.iab.omid.library.unity3d.processor.a
    public void a(View view0, JSONObject jSONObject0, com.iab.omid.library.unity3d.processor.a.a a$a0, boolean z, boolean z1) {
        for(Object object0: this.b()) {
            a$a0.a(((View)object0), this.a, jSONObject0, z1);
        }
    }

    @NonNull
    ArrayList b() {
        ArrayList arrayList0 = new ArrayList();
        com.iab.omid.library.unity3d.internal.c c0 = com.iab.omid.library.unity3d.internal.c.e();
        if(c0 != null) {
            Collection collection0 = c0.a();
            IdentityHashMap identityHashMap0 = new IdentityHashMap(collection0.size() * 2 + 3);
            for(Object object0: collection0) {
                View view0 = ((p)object0).s();
                if(view0 != null && h.e(view0)) {
                    View view1 = view0.getRootView();
                    if(view1 != null && !identityHashMap0.containsKey(view1)) {
                        identityHashMap0.put(view1, view1);
                        float f = h.c(view1);
                        int v;
                        for(v = arrayList0.size(); v > 0 && h.c(((View)arrayList0.get(v - 1))) > f; --v) {
                        }
                        arrayList0.add(v, view1);
                    }
                }
            }
        }
        return arrayList0;
    }
}

