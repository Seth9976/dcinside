package J2;

import kotlin.J;
import kotlin.jvm.internal.L;
import y4.l;

public final class b {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[J2.a.b.values().length];
            try {
                arr_v[J2.a.b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[J2.a.b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[J2.a.b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[J2.a.b.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[J2.a.b.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[J2.a.b.f.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    public static final float a(@l J2.a.b a$b0) {
        L.p(a$b0, "<this>");
        switch(a$b0) {
            case 2: {
                return 0.25f;
            }
            case 3: {
                return 0.5f;
            }
            case 1: 
            case 4: {
                return 1.0f;
            }
            case 5: {
                return 1.5f;
            }
            case 6: {
                return 2.0f;
            }
            default: {
                throw new J();
            }
        }
    }
}

