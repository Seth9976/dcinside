package org.bson.codecs;

import java.math.BigDecimal;
import org.bson.G;
import org.bson.P;
import org.bson.X;
import org.bson.types.Decimal128;

final class j0 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[X.values().length];
            a.a = arr_v;
            try {
                arr_v[X.r.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[X.t.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[X.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[X.u.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static double a(P p0) {
        X x0 = p0.z0();
        int v = a.a[x0.ordinal()];
        if(v != 1) {
            Class class0 = Double.class;
            switch(v) {
                case 2: {
                    long v1 = p0.readInt64();
                    if(v1 != ((long)(((double)v1)))) {
                        throw j0.d(class0, v1);
                    }
                    return (double)v1;
                }
                case 3: {
                    return p0.readDouble();
                }
                case 4: {
                    Decimal128 decimal1280 = p0.U1();
                    try {
                        double f = decimal1280.doubleValue();
                        if(!decimal1280.equals(new Decimal128(new BigDecimal(f)))) {
                            throw j0.d(class0, decimal1280);
                        }
                        return f;
                    }
                    catch(NumberFormatException unused_ex) {
                        throw j0.d(class0, decimal1280);
                    }
                }
                default: {
                    throw new G(String.format("Invalid numeric type, found: %s", x0));
                }
            }
        }
        return (double)p0.readInt32();
    }

    static int b(P p0) {
        int v3;
        X x0 = p0.z0();
        int v = a.a[x0.ordinal()];
        if(v != 1) {
            Class class0 = Integer.class;
            switch(v) {
                case 2: {
                    long v2 = p0.readInt64();
                    v3 = (int)v2;
                    if(v2 != ((long)v3)) {
                        throw j0.d(class0, v2);
                    }
                    return v3;
                }
                case 3: {
                    double f = p0.readDouble();
                    v3 = (int)f;
                    if(f != ((double)v3)) {
                        throw j0.d(class0, f);
                    }
                    return v3;
                }
                case 4: {
                    Decimal128 decimal1280 = p0.U1();
                    int v1 = decimal1280.intValue();
                    if(!decimal1280.equals(new Decimal128(((long)v1)))) {
                        throw j0.d(class0, decimal1280);
                    }
                    return v1;
                }
                default: {
                    throw new G(String.format("Invalid numeric type, found: %s", x0));
                }
            }
        }
        return p0.readInt32();
    }

    static long c(P p0) {
        X x0 = p0.z0();
        int v = a.a[x0.ordinal()];
        switch(v) {
            case 1: {
                return (long)p0.readInt32();
            }
            case 2: {
                return p0.readInt64();
            }
            default: {
                Class class0 = Long.class;
                switch(v) {
                    case 3: {
                        double f = p0.readDouble();
                        if(f != ((double)(((long)f)))) {
                            throw j0.d(class0, f);
                        }
                        return (long)f;
                    }
                    case 4: {
                        Decimal128 decimal1280 = p0.U1();
                        long v1 = decimal1280.longValue();
                        if(!decimal1280.equals(new Decimal128(v1))) {
                            throw j0.d(class0, decimal1280);
                        }
                        return v1;
                    }
                    default: {
                        throw new G(String.format("Invalid numeric type, found: %s", x0));
                    }
                }
            }
        }
    }

    private static G d(Class class0, Number number0) {
        return new G(String.format("Could not convert `%s` to a %s without losing precision", number0, class0));
    }
}

