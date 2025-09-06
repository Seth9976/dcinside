package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

public final class zzgwt extends IOException {
    zzgwt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzgwt(long v, long v1, int v2, Throwable throwable0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + String.format(Locale.US, "Pos: %d, limit: %d, len: %d", v, v1, v2), throwable0);
    }

    zzgwt(Throwable throwable0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable0);
    }
}

