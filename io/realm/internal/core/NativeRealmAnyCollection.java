package io.realm.internal.core;

import io.realm.X0;
import io.realm.internal.UncheckedRow;
import io.realm.internal.k;
import io.realm.internal.l;
import io.realm.internal.s;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public final class NativeRealmAnyCollection implements l {
    private final long a;

    private NativeRealmAnyCollection(long v) {
        this.a = v;
        k.c.a(this);
    }

    public NativeRealmAny a(int v) {
        return new NativeRealmAny(NativeRealmAnyCollection.nativeGetCollectionItem(this.a, v));
    }

    public int b() {
        return NativeRealmAnyCollection.nativeGetCollectionSize(this.a);
    }

    public static NativeRealmAnyCollection c(Collection collection0) {
        byte[][] arr2_b = new byte[collection0.size()][];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            byte[] arr_b = (byte[])object0;
            if(arr_b != null) {
                arr2_b[v] = arr_b;
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateBinaryCollection(arr2_b, arr_z));
    }

    public static NativeRealmAnyCollection d(Collection collection0) {
        boolean[] arr_z = new boolean[collection0.size()];
        boolean[] arr_z1 = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            Boolean boolean0 = (Boolean)object0;
            if(boolean0 != null) {
                arr_z[v] = boolean0.booleanValue();
                arr_z1[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateBooleanCollection(arr_z, arr_z1));
    }

    public static NativeRealmAnyCollection e(Collection collection0) {
        long[] arr_v = new long[collection0.size()];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            Date date0 = (Date)object0;
            if(date0 != null) {
                arr_v[v] = date0.getTime();
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateDateCollection(arr_v, arr_z));
    }

    public static NativeRealmAnyCollection f(Collection collection0) {
        long[] arr_v = new long[collection0.size()];
        long[] arr_v1 = new long[collection0.size()];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            Decimal128 decimal1280 = (Decimal128)object0;
            if(decimal1280 != null) {
                arr_v[v] = decimal1280.i();
                arr_v1[v] = decimal1280.h();
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateDecimal128Collection(arr_v, arr_v1, arr_z));
    }

    public static NativeRealmAnyCollection g(Collection collection0) {
        double[] arr_f = new double[collection0.size()];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            Double double0 = (Double)object0;
            if(double0 != null) {
                arr_f[v] = (double)double0;
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateDoubleCollection(arr_f, arr_z));
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return NativeRealmAnyCollection.nativeGetFinalizerPtr();
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    public static NativeRealmAnyCollection h(Collection collection0) {
        float[] arr_f = new float[collection0.size()];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            Float float0 = (Float)object0;
            if(float0 != null) {
                arr_f[v] = (float)float0;
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateFloatCollection(arr_f, arr_z));
    }

    public static NativeRealmAnyCollection i(Collection collection0) {
        long[] arr_v = new long[collection0.size()];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            Number number0 = (Number)object0;
            if(number0 != null) {
                arr_v[v] = number0.longValue();
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateIntegerCollection(arr_v, arr_z));
    }

    public static NativeRealmAnyCollection j(Collection collection0) {
        String[] arr_s = new String[collection0.size()];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            if(((ObjectId)object0) != null) {
                arr_s[v] = "68bb29e9bba9e4442c198f45";
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateObjectIdCollection(arr_s, arr_z));
    }

    public static NativeRealmAnyCollection k(long[] arr_v, boolean[] arr_z) {
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateRealmAnyCollection(arr_v, arr_z));
    }

    public static NativeRealmAnyCollection l(Collection collection0) {
        long[] arr_v = new long[collection0.size()];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            X0 x00 = (X0)object0;
            if(x00 != null) {
                arr_v[v] = ((UncheckedRow)((s)x00).R3().g()).getNativePtr();
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateObjectCollection(arr_v, arr_z));
    }

    public static NativeRealmAnyCollection m(Collection collection0) {
        String[] arr_s = new String[collection0.size()];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            String s = (String)object0;
            if(s != null) {
                arr_s[v] = s;
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateStringCollection(arr_s, arr_z));
    }

    public static NativeRealmAnyCollection n(Collection collection0) {
        String[] arr_s = new String[collection0.size()];
        boolean[] arr_z = new boolean[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            UUID uUID0 = (UUID)object0;
            if(uUID0 != null) {
                arr_s[v] = uUID0.toString();
                arr_z[v] = true;
            }
            ++v;
        }
        return new NativeRealmAnyCollection(NativeRealmAnyCollection.nativeCreateUUIDCollection(arr_s, arr_z));
    }

    private static native long nativeCreateBinaryCollection(byte[][] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateBooleanCollection(boolean[] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateDateCollection(long[] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateDecimal128Collection(long[] arg0, long[] arg1, boolean[] arg2) {
    }

    private static native long nativeCreateDoubleCollection(double[] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateFloatCollection(float[] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateIntegerCollection(long[] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateObjectCollection(long[] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateObjectIdCollection(String[] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateRealmAnyCollection(long[] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateStringCollection(String[] arg0, boolean[] arg1) {
    }

    private static native long nativeCreateUUIDCollection(String[] arg0, boolean[] arg1) {
    }

    private static native long nativeGetCollectionItem(long arg0, int arg1) {
    }

    private static native int nativeGetCollectionSize(long arg0) {
    }

    private static native long nativeGetFinalizerPtr() {
    }
}

