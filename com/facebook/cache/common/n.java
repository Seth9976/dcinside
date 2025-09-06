package com.facebook.cache.common;

import com.facebook.common.internal.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import k1.n.a;
import k1.n;

@n(a.a)
public class com.facebook.cache.common.n {
    public static m a(InputStream inputStream0) {
        class com.facebook.cache.common.n.a implements m {
            final InputStream a;

            com.facebook.cache.common.n.a(InputStream inputStream0) {
            }

            @Override  // com.facebook.cache.common.m
            public void a(OutputStream outputStream0) throws IOException {
                b.a(this.a, outputStream0);
            }
        }

        return new com.facebook.cache.common.n.a(inputStream0);
    }

    public static m b(byte[] arr_b) {
        class com.facebook.cache.common.n.b implements m {
            final byte[] a;

            com.facebook.cache.common.n.b(byte[] arr_b) {
            }

            @Override  // com.facebook.cache.common.m
            public void a(OutputStream outputStream0) throws IOException {
                outputStream0.write(this.a);
            }
        }

        return new com.facebook.cache.common.n.b(arr_b);
    }
}

