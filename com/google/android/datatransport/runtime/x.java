package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.h;
import com.google.android.datatransport.runtime.time.d;
import java.io.Closeable;
import java.io.IOException;
import r3.f;
import y1.b;
import y1.c.a;
import y1.c;

@f
@c(modules = {com.google.android.datatransport.runtime.backends.f.class, com.google.android.datatransport.runtime.scheduling.persistence.f.class, k.class, h.class, com.google.android.datatransport.runtime.scheduling.f.class, d.class})
abstract class x implements Closeable {
    @a
    interface com.google.android.datatransport.runtime.x.a {
        @b
        com.google.android.datatransport.runtime.x.a a(Context arg1);

        x build();
    }

    abstract com.google.android.datatransport.runtime.scheduling.persistence.d a();

    abstract w b();

    @Override
    public void close() throws IOException {
        this.a().close();
    }
}

