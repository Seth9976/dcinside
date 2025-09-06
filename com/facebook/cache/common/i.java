package com.facebook.cache.common;

import android.net.Uri;
import java.util.List;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class i implements e {
    final List a;

    public i(List list0) {
        this.a = (List)com.facebook.common.internal.n.i(list0);
    }

    @Override  // com.facebook.cache.common.e
    public String a() {
        return ((e)this.a.get(0)).a();
    }

    @Override  // com.facebook.cache.common.e
    public boolean b() {
        return false;
    }

    @Override  // com.facebook.cache.common.e
    public boolean c(Uri uri0) {
        for(int v = 0; v < this.a.size(); ++v) {
            if(((e)this.a.get(v)).c(uri0)) {
                return true;
            }
        }
        return false;
    }

    public List d() {
        return this.a;
    }

    @Override  // com.facebook.cache.common.e
    public boolean equals(@h Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof i ? this.a.equals(((i)object0).a) : false;
    }

    @Override  // com.facebook.cache.common.e
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.facebook.cache.common.e
    public String toString() {
        return "MultiCacheKey:" + this.a.toString();
    }
}

