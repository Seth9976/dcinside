package com.iab.omid.library.bytedance2.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.utils.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

public class c implements a {
    private final a a;

    public c(a a0) {
        this.a = a0;
    }

    @NonNull
    ArrayList a() {
        ArrayList arrayList0 = new ArrayList();
        com.iab.omid.library.bytedance2.internal.c c0 = com.iab.omid.library.bytedance2.internal.c.c();
        if(c0 != null) {
            Collection collection0 = c0.a();
            IdentityHashMap identityHashMap0 = new IdentityHashMap(collection0.size() * 2 + 3);
            for(Object object0: collection0) {
                View view0 = ((com.iab.omid.library.bytedance2.adsession.a)object0).c();
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

    @Override  // com.iab.omid.library.bytedance2.processor.a
    public JSONObject a(View view0) {
        JSONObject jSONObject0 = com.iab.omid.library.bytedance2.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject0, e.a());
        return jSONObject0;
    }

    @Override  // com.iab.omid.library.bytedance2.processor.a
    public void a(View view0, JSONObject jSONObject0, com.iab.omid.library.bytedance2.processor.a.a a$a0, boolean z, boolean z1) {
        for(Object object0: this.a()) {
            a$a0.a(((View)object0), this.a, jSONObject0, z1);
        }
    }
}

