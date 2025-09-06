package com.google.crypto.tink;

import O1.l;
import com.google.crypto.tink.proto.W0;
import com.google.crypto.tink.proto.r2;
import com.google.crypto.tink.shaded.protobuf.V;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c implements y {
    private final InputStream a;

    private c(InputStream inputStream0) {
        this.a = inputStream0;
    }

    @Override  // com.google.crypto.tink.y
    public W0 a() throws IOException {
        try {
            V v1 = V.d();
            return W0.W2(this.a, v1);
        }
        finally {
            this.a.close();
        }
    }

    public static y b(byte[] arr_b) {
        return new c(new ByteArrayInputStream(arr_b));
    }

    @l(imports = {"com.google.crypto.tink.BinaryKeysetReader", "java.io.FileInputStream"}, replacement = "BinaryKeysetReader.withInputStream(new FileInputStream(file))")
    @Deprecated
    public static y c(File file0) throws IOException {
        return c.d(new FileInputStream(file0));
    }

    public static y d(InputStream inputStream0) {
        return new c(inputStream0);
    }

    @Override  // com.google.crypto.tink.y
    public r2 read() throws IOException {
        try {
            V v1 = V.d();
            return r2.e3(this.a, v1);
        }
        finally {
            this.a.close();
        }
    }
}

