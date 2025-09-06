package com.facebook.drawee.backends.pipeline.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.drawee.backends.pipeline.info.a implements d {
    private final List a;
    private static final String b = "ForwardingImageOriginListener";

    public com.facebook.drawee.backends.pipeline.info.a(Set set0) {
        this.a = new ArrayList(set0);
    }

    public com.facebook.drawee.backends.pipeline.info.a(d[] arr_d) {
        ArrayList arrayList0 = new ArrayList(arr_d.length);
        this.a = arrayList0;
        Collections.addAll(arrayList0, arr_d);
    }

    @Override  // com.facebook.drawee.backends.pipeline.info.d
    public void a(String s, int v, boolean z, @h String s1) {
        synchronized(this) {
            int v2 = this.a.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                d d0 = (d)this.a.get(v3);
                if(d0 != null) {
                    try {
                        d0.a(s, v, z, s1);
                    }
                    catch(Exception exception0) {
                        x0.a.v("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", exception0);
                    }
                }
            }
        }
    }

    public void b(d d0) {
        synchronized(this) {
            this.a.add(d0);
        }
    }

    public void c(d d0) {
        synchronized(this) {
            this.a.remove(d0);
        }
    }
}

