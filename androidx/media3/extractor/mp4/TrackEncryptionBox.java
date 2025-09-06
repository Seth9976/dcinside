package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput.CryptoData;

@UnstableApi
public final class TrackEncryptionBox {
    public final boolean a;
    @Nullable
    public final String b;
    public final CryptoData c;
    public final int d;
    @Nullable
    public final byte[] e;
    private static final String f = "TrackEncryptionBox";

    public TrackEncryptionBox(boolean z, @Nullable String s, int v, byte[] arr_b, int v1, int v2, @Nullable byte[] arr_b1) {
        Assertions.a(((boolean)((arr_b1 == null ? 1 : 0) ^ (v == 0 ? 1 : 0))));
        this.a = z;
        this.b = s;
        this.d = v;
        this.e = arr_b1;
        this.c = new CryptoData(TrackEncryptionBox.a(s), arr_b, v1, v2);
    }

    private static int a(@Nullable String s) {
        if(s == null) {
            return 1;
        }
        switch(s) {
            case "cbc1": {
                return 2;
            }
            case "cbcs": {
                return 2;
            }
            case "cenc": {
                return 1;
            }
            case "cens": {
                return 1;
            }
            default: {
                Log.n("TrackEncryptionBox", "Unsupported protection scheme type \'" + s + "\'. Assuming AES-CTR crypto mode.");
                return 1;
            }
        }
    }
}

