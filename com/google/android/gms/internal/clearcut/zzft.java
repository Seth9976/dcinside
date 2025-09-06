package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class zzft extends IOException {
    zzft(int v, int v1) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + v + " limit " + v1 + ").");
    }
}

