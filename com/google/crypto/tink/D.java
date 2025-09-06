package com.google.crypto.tink;

import O1.l;
import com.google.crypto.tink.proto.W0;
import com.google.crypto.tink.proto.r2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class d implements z {
    private final OutputStream a;

    private d(OutputStream outputStream0) {
        this.a = outputStream0;
    }

    @Override  // com.google.crypto.tink.z
    public void a(r2 r20) throws IOException {
        try {
            r20.writeTo(this.a);
        }
        finally {
            this.a.close();
        }
    }

    @Override  // com.google.crypto.tink.z
    public void b(W0 w00) throws IOException {
        try {
            w00.writeTo(this.a);
        }
        finally {
            this.a.close();
        }
    }

    @l(imports = {"com.google.crypto.tink.BinaryKeysetWriter", "java.io.FileOutputStream"}, replacement = "BinaryKeysetWriter.withOutputStream(new FileOutputStream(file))")
    @Deprecated
    public static z c(File file0) throws IOException {
        return d.d(new FileOutputStream(file0));
    }

    public static z d(OutputStream outputStream0) {
        return new d(outputStream0);
    }
}

