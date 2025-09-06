package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.d;
import com.google.android.datatransport.runtime.backends.i;
import com.google.android.datatransport.runtime.backends.n;

@Keep
public class CctBackendFactory implements d {
    @Override  // com.google.android.datatransport.runtime.backends.d
    public n create(i i0) {
        return new com.google.android.datatransport.cct.d(i0.c(), i0.f(), i0.e());
    }
}

