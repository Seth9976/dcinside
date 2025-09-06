package com.facebook.common.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import k1.n.a;
import k1.n;

@n(a.a)
public class g {
    static byte[] a(InputStream inputStream0, long v) throws IOException {
        if(v > 0x7FFFFFFFL) {
            throw new OutOfMemoryError("file is too large to fit in a byte array: " + v + " bytes");
        }
        return v == 0L ? b.d(inputStream0) : b.e(inputStream0, ((int)v));
    }

    public static byte[] b(File file0) throws IOException {
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            return g.a(fileInputStream0, fileInputStream0.getChannel().size());
        }
    }
}

