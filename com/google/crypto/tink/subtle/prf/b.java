package com.google.crypto.tink.subtle.prf;

import O1.j;
import com.google.crypto.tink.prf.k;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

@j
public class b implements k {
    private final c a;

    private b(c c0) {
        this.a = c0;
    }

    @Override  // com.google.crypto.tink.prf.k
    public byte[] a(byte[] arr_b, int v) throws GeneralSecurityException {
        if(arr_b == null) {
            throw new GeneralSecurityException("Invalid input provided.");
        }
        if(v <= 0) {
            throw new GeneralSecurityException("Invalid outputLength specified.");
        }
        return b.b(this.a.a(arr_b), v);
    }

    private static byte[] b(InputStream inputStream0, int v) throws GeneralSecurityException {
        try {
            byte[] arr_b = new byte[v];
            for(int v1 = 0; v1 < v; v1 += v2) {
                int v2 = inputStream0.read(arr_b, v1, v - v1);
                if(v2 <= 0) {
                    throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                }
            }
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new GeneralSecurityException(iOException0);
        }
    }

    public static b c(c c0) {
        return new b(c0);
    }
}

