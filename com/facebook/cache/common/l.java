package com.facebook.cache.common;

import android.net.Uri;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class l implements e {
    final String a;
    final boolean b;

    public l(String s) {
        this(s, false);
    }

    public l(String s, boolean z) {
        this.a = (String)com.facebook.common.internal.n.i(s);
        this.b = z;
    }

    @Override  // com.facebook.cache.common.e
    public String a() {
        return this.a;
    }

    @Override  // com.facebook.cache.common.e
    public boolean b() {
        return this.b;
    }

    @Override  // com.facebook.cache.common.e
    public boolean c(Uri uri0) {
        return this.a.contains(uri0.toString());
    }

    @Override  // com.facebook.cache.common.e
    public boolean equals(@h Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof l ? this.a.equals(((l)object0).a) : false;
    }

    @Override  // com.facebook.cache.common.e
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.facebook.cache.common.e
    public String toString() {
        return this.a;
    }
}

