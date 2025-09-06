package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.Nullable;

public enum x {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private final int a;
    private static final SparseArray h;

    static {
        SparseArray sparseArray0 = new SparseArray();
        x.h = sparseArray0;
        sparseArray0.put(0, x.b);
        sparseArray0.put(1, x.c);
        sparseArray0.put(2, x.d);
        sparseArray0.put(3, x.e);
        sparseArray0.put(4, x.f);
        sparseArray0.put(-1, x.g);
    }

    private x(int v1) {
        this.a = v1;
    }

    @Nullable
    public static x a(int v) {
        switch(v) {
            case 0: {
                return x.b;
            }
            case 1: {
                return x.c;
            }
            case 2: {
                return x.d;
            }
            case 3: {
                return x.e;
            }
            case 4: {
                return x.f;
            }
            default: {
                return null;
            }
        }
    }

    public final int getNumber() {
        return this.a;
    }
}

