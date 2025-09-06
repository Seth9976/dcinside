package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.geckox.h.a;
import java.io.IOException;
import java.io.StringWriter;

public abstract class i {
    public Number a() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String b() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public boolean c() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        try {
            StringWriter stringWriter0 = new StringWriter();
            c c0 = new c(stringWriter0);
            c0.a(true);
            a.a(this, c0);
            return stringWriter0.toString();
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

