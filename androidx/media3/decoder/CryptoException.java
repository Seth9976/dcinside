package androidx.media3.decoder;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public class CryptoException extends Exception {
    public final int a;

    public CryptoException(int v, String s) {
        super(s);
        this.a = v;
    }
}

