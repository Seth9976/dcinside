package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class zzfx implements Cloneable {
    private Object value;
    private zzfv zzrp;
    private List zzrq;

    zzfx() {
        this.zzrq = new ArrayList();
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        return this.zzeq();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzfx)) {
            return false;
        }
        if(this.value != null && ((zzfx)object0).value != null) {
            zzfv zzfv0 = this.zzrp;
            if(zzfv0 != ((zzfx)object0).zzrp) {
                return false;
            }
            if(!zzfv0.zzrk.isArray()) {
                return this.value.equals(((zzfx)object0).value);
            }
            Object object1 = this.value;
            if(object1 instanceof byte[]) {
                return Arrays.equals(((byte[])object1), ((byte[])((zzfx)object0).value));
            }
            if(object1 instanceof int[]) {
                return Arrays.equals(((int[])object1), ((int[])((zzfx)object0).value));
            }
            if(object1 instanceof long[]) {
                return Arrays.equals(((long[])object1), ((long[])((zzfx)object0).value));
            }
            if(object1 instanceof float[]) {
                return Arrays.equals(((float[])object1), ((float[])((zzfx)object0).value));
            }
            if(object1 instanceof double[]) {
                return Arrays.equals(((double[])object1), ((double[])((zzfx)object0).value));
            }
            return object1 instanceof boolean[] ? Arrays.equals(((boolean[])object1), ((boolean[])((zzfx)object0).value)) : Arrays.deepEquals(((Object[])object1), ((Object[])((zzfx)object0).value));
        }
        List list0 = this.zzrq;
        if(list0 != null) {
            List list1 = ((zzfx)object0).zzrq;
            if(list1 != null) {
                return list0.equals(list1);
            }
        }
        try {
            return Arrays.equals(new byte[0], new byte[0]);
        }
        catch(IOException iOException0) {
            throw new IllegalStateException(iOException0);
        }
    }

    @Override
    public final int hashCode() {
        try {
            return Arrays.hashCode(new byte[0]) + 0x20F;
        }
        catch(IOException iOException0) {
            throw new IllegalStateException(iOException0);
        }
    }

    private final byte[] toByteArray() throws IOException [...] // 潜在的解密器

    final void zza(zzfs zzfs0) throws IOException {
        if(this.value != null) {
            throw new NoSuchMethodError();
        }
        Iterator iterator0 = this.zzrq.iterator();
        if(!iterator0.hasNext()) {
            return;
        }
        iterator0.next();
        throw new NoSuchMethodError();
    }

    final int zzen() {
        if(this.value != null) {
            throw new NoSuchMethodError();
        }
        Iterator iterator0 = this.zzrq.iterator();
        if(!iterator0.hasNext()) {
            return 0;
        }
        iterator0.next();
        throw new NoSuchMethodError();
    }

    private final zzfx zzeq() {
        zzfz zzfz0;
        zzfx zzfx0 = new zzfx();
        try {
            zzfx0.zzrp = this.zzrp;
            List list0 = this.zzrq;
            if(list0 == null) {
                zzfx0.zzrq = null;
            }
            else {
                zzfx0.zzrq.addAll(list0);
            }
            int v = 0;
            Object object0 = this.value;
            if(object0 == null) {
                return zzfx0;
            }
            if(object0 instanceof zzfz) {
                zzfz0 = (zzfz)((zzfz)object0).clone();
                zzfx0.value = zzfz0;
                return zzfx0;
            }
            if(object0 instanceof byte[]) {
                zzfz0 = ((byte[])object0).clone();
                zzfx0.value = zzfz0;
                return zzfx0;
            }
            if(object0 instanceof byte[][]) {
                byte[][] arr2_b = new byte[((byte[][])object0).length][];
                zzfx0.value = arr2_b;
                while(true) {
                    if(v >= ((byte[][])object0).length) {
                        return zzfx0;
                    }
                    arr2_b[v] = (byte[])((byte[][])object0)[v].clone();
                    ++v;
                }
            }
            if(object0 instanceof boolean[]) {
                zzfz0 = ((boolean[])object0).clone();
                zzfx0.value = zzfz0;
                return zzfx0;
            }
            if(object0 instanceof int[]) {
                zzfz0 = ((int[])object0).clone();
                zzfx0.value = zzfz0;
                return zzfx0;
            }
            if(object0 instanceof long[]) {
                zzfz0 = ((long[])object0).clone();
                zzfx0.value = zzfz0;
                return zzfx0;
            }
            boolean z = false;
            if(object0 instanceof float[]) {
                z = true;
                zzfz0 = ((float[])object0).clone();
            }
            else if(object0 instanceof double[]) {
                z = true;
                zzfz0 = ((double[])object0).clone();
            }
            if(z) {
                zzfx0.value = zzfz0;
                return zzfx0;
            }
            if(!(object0 instanceof zzfz[])) {
                return zzfx0;
            }
            zzfz[] arr_zzfz = new zzfz[((zzfz[])object0).length];
            zzfx0.value = arr_zzfz;
            while(true) {
                if(v >= ((zzfz[])object0).length) {
                    return zzfx0;
                }
                arr_zzfz[v] = (zzfz)((zzfz[])object0)[v].clone();
                ++v;
            }
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
        }
        throw new AssertionError(cloneNotSupportedException0);
    }
}

