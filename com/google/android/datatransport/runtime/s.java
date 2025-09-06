package com.google.android.datatransport.runtime;

import com.google.android.datatransport.e;
import com.google.android.datatransport.k;
import com.google.android.datatransport.l;
import com.google.android.datatransport.m;
import java.util.Set;

final class s implements m {
    private final Set a;
    private final r b;
    private final v c;

    s(Set set0, r r0, v v0) {
        this.a = set0;
        this.b = r0;
        this.c = v0;
    }

    @Override  // com.google.android.datatransport.m
    public l a(String s, Class class0, k k0) {
        return this.b(s, class0, e.b("proto"), k0);
    }

    @Override  // com.google.android.datatransport.m
    public l b(String s, Class class0, e e0, k k0) {
        if(!this.a.contains(e0)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", e0, this.a));
        }
        return new u(this.b, s, e0, k0, this.c);
    }
}

