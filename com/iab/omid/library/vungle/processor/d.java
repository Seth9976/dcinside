package com.iab.omid.library.vungle.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.vungle.utils.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

public class d implements a {
    private final int[] a;

    public d() {
        this.a = new int[2];
    }

    @Override  // com.iab.omid.library.vungle.processor.a
    public JSONObject a(View view0) {
        if(view0 == null) {
            return c.c(0, 0, 0, 0);
        }
        int v = view0.getWidth();
        int v1 = view0.getHeight();
        view0.getLocationOnScreen(this.a);
        return c.c(this.a[0], this.a[1], v, v1);
    }

    @Override  // com.iab.omid.library.vungle.processor.a
    public void a(View view0, JSONObject jSONObject0, com.iab.omid.library.vungle.processor.a.a a$a0, boolean z, boolean z1) {
        if(!(view0 instanceof ViewGroup)) {
            return;
        }
        if(z) {
            this.c(((ViewGroup)view0), jSONObject0, a$a0, z1);
            return;
        }
        this.b(((ViewGroup)view0), jSONObject0, a$a0, z1);
    }

    private void b(ViewGroup viewGroup0, JSONObject jSONObject0, com.iab.omid.library.vungle.processor.a.a a$a0, boolean z) {
        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
            a$a0.a(viewGroup0.getChildAt(v), this, jSONObject0, z);
        }
    }

    @TargetApi(21)
    private void c(ViewGroup viewGroup0, JSONObject jSONObject0, com.iab.omid.library.vungle.processor.a.a a$a0, boolean z) {
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
            View view0 = viewGroup0.getChildAt(v);
            ArrayList arrayList0 = (ArrayList)hashMap0.get(view0.getZ());
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                hashMap0.put(view0.getZ(), arrayList0);
            }
            arrayList0.add(view0);
        }
        ArrayList arrayList1 = new ArrayList(hashMap0.keySet());
        Collections.sort(arrayList1);
        for(Object object0: arrayList1) {
            for(Object object1: ((ArrayList)hashMap0.get(((Float)object0)))) {
                a$a0.a(((View)object1), this, jSONObject0, z);
            }
        }
    }
}

