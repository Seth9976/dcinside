package com.bytedance.adsdk.Zh;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class PjT implements Collection, Set {
    private static int Au;
    private qla DWo;
    private static Object[] JQp;
    Object[] PjT;
    private static final int[] ReZ;
    private int[] SM;
    private static Object[] XX;
    int Zh;
    private static final Object[] cr;
    private static int cz;

    static {
        PjT.ReZ = new int[0];
        PjT.cr = new Object[0];
    }

    public PjT() {
        this(0);
    }

    public PjT(int v) {
        if(v == 0) {
            this.SM = PjT.ReZ;
            this.PjT = PjT.cr;
        }
        else {
            this.cr(v);
        }
        this.Zh = 0;
    }

    private int PjT() {
        int v = this.Zh;
        if(v == 0) {
            return -1;
        }
        int v1 = Zh.PjT(this.SM, v, 0);
        if(v1 < 0) {
            return v1;
        }
        if(this.PjT[v1] == null) {
            return v1;
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && this.SM[v2] == 0; ++v2) {
            if(this.PjT[v2] == null) {
                return v2;
            }
        }
        for(int v3 = v1 - 1; v3 >= 0 && this.SM[v3] == 0; --v3) {
            if(this.PjT[v3] == null) {
                return v3;
            }
        }
        return ~v2;
    }

    private int PjT(Object object0, int v) {
        int v1 = this.Zh;
        if(v1 == 0) {
            return -1;
        }
        int v2 = Zh.PjT(this.SM, v1, v);
        if(v2 < 0) {
            return v2;
        }
        if(object0.equals(this.PjT[v2])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && this.SM[v3] == v; ++v3) {
            if(object0.equals(this.PjT[v3])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && this.SM[v4] == v; --v4) {
            if(object0.equals(this.PjT[v4])) {
                return v4;
            }
        }
        return ~v3;
    }

    private static void PjT(int[] arr_v, Object[] arr_object, int v) {
        switch(arr_v.length) {
            case 4: {
                Class class0 = PjT.class;
                __monitor_enter(class0);
                try {
                    if(PjT.cz < 10) {
                        arr_object[0] = PjT.JQp;
                        arr_object[1] = arr_v;
                        for(int v1 = v - 1; v1 >= 2; --v1) {
                            arr_object[v1] = null;
                        }
                        PjT.JQp = arr_object;
                        ++PjT.cz;
                    }
                    __monitor_exit(class0);
                    return;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(class0);
                throw throwable0;
            }
            case 8: {
                Class class1 = PjT.class;
                __monitor_enter(class1);
                try {
                    if(PjT.Au < 10) {
                        arr_object[0] = PjT.XX;
                        arr_object[1] = arr_v;
                        for(int v2 = v - 1; v2 >= 2; --v2) {
                            arr_object[v2] = null;
                        }
                        PjT.XX = arr_object;
                        ++PjT.Au;
                    }
                    __monitor_exit(class1);
                    return;
                }
                catch(Throwable throwable1) {
                }
                __monitor_exit(class1);
                throw throwable1;
            }
        }
    }

    public int PjT(Object object0) {
        return object0 == null ? this.PjT() : this.PjT(object0, object0.hashCode());
    }

    public void PjT(int v) {
        int[] arr_v = this.SM;
        if(arr_v.length < v) {
            Object[] arr_object = this.PjT;
            this.cr(v);
            int v1 = this.Zh;
            if(v1 > 0) {
                System.arraycopy(arr_v, 0, this.SM, 0, v1);
                System.arraycopy(arr_object, 0, this.PjT, 0, this.Zh);
            }
            PjT.PjT(arr_v, arr_object, this.Zh);
        }
    }

    public Object ReZ(int v) {
        Object[] arr_object = this.PjT;
        Object object0 = arr_object[v];
        int v1 = this.Zh;
        if(v1 <= 1) {
            PjT.PjT(this.SM, arr_object, v1);
            this.SM = PjT.ReZ;
            this.PjT = PjT.cr;
            this.Zh = 0;
            return object0;
        }
        int[] arr_v = this.SM;
        int v2 = 8;
        if(arr_v.length <= 8 || v1 >= arr_v.length / 3) {
            this.Zh = v1 - 1;
            if(v < v1 - 1) {
                System.arraycopy(arr_v, v + 1, arr_v, v, v1 - 1 - v);
                System.arraycopy(this.PjT, v + 1, this.PjT, v, this.Zh - v);
            }
            this.PjT[this.Zh] = null;
        }
        else {
            if(v1 > 8) {
                v2 = v1 + (v1 >> 1);
            }
            this.cr(v2);
            --this.Zh;
            if(v > 0) {
                System.arraycopy(arr_v, 0, this.SM, 0, v);
                System.arraycopy(arr_object, 0, this.PjT, 0, v);
            }
            int v3 = this.Zh;
            if(v < v3) {
                System.arraycopy(arr_v, v + 1, this.SM, v, v3 - v);
                System.arraycopy(arr_object, v + 1, this.PjT, v, this.Zh - v);
                return object0;
            }
        }
        return object0;
    }

    private qla Zh() {
        if(this.DWo == null) {
            this.DWo = new qla() {
                final PjT PjT;

                @Override  // com.bytedance.adsdk.Zh.qla
                protected int PjT() {
                    return PjT.this.Zh;
                }

                @Override  // com.bytedance.adsdk.Zh.qla
                protected int PjT(Object object0) {
                    return PjT.this.PjT(object0);
                }

                @Override  // com.bytedance.adsdk.Zh.qla
                protected Object PjT(int v, int v1) {
                    return PjT.this.PjT[v];
                }

                @Override  // com.bytedance.adsdk.Zh.qla
                protected void PjT(int v) {
                    PjT.this.ReZ(v);
                }

                @Override  // com.bytedance.adsdk.Zh.qla
                protected void ReZ() {
                    PjT.this.clear();
                }

                @Override  // com.bytedance.adsdk.Zh.qla
                protected Map Zh() {
                    throw new UnsupportedOperationException("not a map");
                }
            };
        }
        return this.DWo;
    }

    public Object Zh(int v) {
        return this.PjT[v];
    }

    @Override
    public boolean add(Object object0) {
        int v1;
        int v;
        if(object0 == null) {
            v = this.PjT();
            v1 = 0;
        }
        else {
            int v2 = object0.hashCode();
            v1 = v2;
            v = this.PjT(object0, v2);
        }
        if(v >= 0) {
            return false;
        }
        int v3 = 8;
        int v4 = this.Zh;
        int[] arr_v = this.SM;
        if(v4 >= arr_v.length) {
            if(v4 >= 8) {
                v3 = (v4 >> 1) + v4;
            }
            else if(v4 < 4) {
                v3 = 4;
            }
            Object[] arr_object = this.PjT;
            this.cr(v3);
            int[] arr_v1 = this.SM;
            if(arr_v1.length > 0) {
                System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
                System.arraycopy(arr_object, 0, this.PjT, 0, arr_object.length);
            }
            PjT.PjT(arr_v, arr_object, this.Zh);
        }
        int v5 = this.Zh;
        if(~v < v5) {
            System.arraycopy(this.SM, ~v, this.SM, -v, v5 - ~v);
            System.arraycopy(this.PjT, ~v, this.PjT, -v, this.Zh - ~v);
        }
        this.SM[~v] = v1;
        this.PjT[~v] = object0;
        ++this.Zh;
        return true;
    }

    @Override
    public boolean addAll(Collection collection0) {
        this.PjT(this.Zh + collection0.size());
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.add(object0);
        }
        return z;
    }

    @Override
    public void clear() {
        int v = this.Zh;
        if(v != 0) {
            PjT.PjT(this.SM, this.PjT, v);
            this.SM = PjT.ReZ;
            this.PjT = PjT.cr;
            this.Zh = 0;
        }
    }

    @Override
    public boolean contains(Object object0) {
        return this.PjT(object0) >= 0;
    }

    @Override
    public boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private void cr(int v) {
        switch(v) {
            case 4: {
                Class class0 = PjT.class;
                synchronized(class0) {
                    Object[] arr_object = PjT.JQp;
                    if(arr_object != null) {
                        this.PjT = arr_object;
                        PjT.JQp = (Object[])arr_object[0];
                        this.SM = (int[])arr_object[1];
                        arr_object[1] = null;
                        arr_object[0] = null;
                        --PjT.cz;
                        return;
                    }
                }
                break;
            }
            case 8: {
                Class class1 = PjT.class;
                synchronized(class1) {
                    Object[] arr_object1 = PjT.XX;
                    if(arr_object1 != null) {
                        this.PjT = arr_object1;
                        PjT.XX = (Object[])arr_object1[0];
                        this.SM = (int[])arr_object1[1];
                        arr_object1[1] = null;
                        arr_object1[0] = null;
                        --PjT.Au;
                        return;
                    }
                }
            }
        }
        this.SM = new int[v];
        this.PjT = new Object[v];
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set0 = (Set)object0;
            if(this.size() != set0.size()) {
                return false;
            }
            try {
                for(int v = 0; true; ++v) {
                    if(v >= this.Zh) {
                        return true;
                    }
                    if(!set0.contains(this.Zh(v))) {
                        return false;
                    }
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.SM;
        int v = this.Zh;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1];
        }
        return v2;
    }

    @Override
    public boolean isEmpty() {
        return this.Zh <= 0;
    }

    @Override
    public Iterator iterator() {
        return this.Zh().cr().iterator();
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.PjT(object0);
        if(v >= 0) {
            this.ReZ(v);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.remove(object0);
        }
        return z;
    }

    @Override
    public boolean retainAll(Collection collection0) {
        int v = this.Zh - 1;
        boolean z = false;
        while(v >= 0) {
            if(!collection0.contains(this.PjT[v])) {
                this.ReZ(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    @Override
    public int size() {
        return this.Zh;
    }

    @Override
    public Object[] toArray() {
        int v = this.Zh;
        Object[] arr_object = new Object[v];
        System.arraycopy(this.PjT, 0, arr_object, 0, v);
        return arr_object;
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        if(arr_object.length < this.Zh) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), this.Zh);
        }
        System.arraycopy(this.PjT, 0, arr_object, 0, this.Zh);
        int v = this.Zh;
        if(arr_object.length > v) {
            arr_object[v] = null;
        }
        return arr_object;
    }

    @Override
    public String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.Zh * 14);
        stringBuilder0.append('{');
        for(int v = 0; v < this.Zh; ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.Zh(v);
            if(object0 == this) {
                stringBuilder0.append("(this Set)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

