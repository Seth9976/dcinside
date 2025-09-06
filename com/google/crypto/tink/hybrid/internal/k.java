package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.proto.C1;
import com.google.crypto.tink.proto.x1;
import java.security.GeneralSecurityException;

final class k {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[x1.values().length];
            a.a = arr_v;
            try {
                arr_v[x1.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x1.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x1.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x1.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static l a(C1 c10) throws GeneralSecurityException {
        switch(c10.e().a().Y0()) {
            case 1: {
                return t.c(c10.e0().a0());
            }
            case 2: 
            case 3: 
            case 4: {
                return r.c(c10.e0().a0(), c10.e().e().a0(), p.f(c10.e().a().Y0()));
            }
            default: {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
        }
    }
}

