package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import com.google.android.datatransport.runtime.scheduling.persistence.d;
import com.google.android.datatransport.runtime.time.b;
import y1.a;
import y1.e;
import y1.f;

@e
public abstract class h {
    @a
    abstract com.google.android.datatransport.runtime.scheduling.e a(c arg1);

    @f
    static y b(Context context0, d d0, g g0, @b com.google.android.datatransport.runtime.time.a a0) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(context0, d0, g0);
    }
}

