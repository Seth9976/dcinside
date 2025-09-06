package com.facebook.common.time;

import android.os.SystemClock;
import k1.n.a;
import k1.n;

@n(a.a)
public class b implements com.facebook.common.time.a {
    @Override  // com.facebook.common.time.a
    public long now() {
        return SystemClock.currentThreadTimeMillis();
    }
}

