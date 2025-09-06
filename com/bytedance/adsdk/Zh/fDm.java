package com.bytedance.adsdk.Zh;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;

public class fDm {
    private int Au;
    private int JQp;
    private final LinkedHashMap PjT;
    private int ReZ;
    private int XX;
    private int Zh;
    private int cr;
    private int cz;

    public fDm(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.ReZ = v;
        this.PjT = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object PjT(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        __monitor_enter(this);
        try {
            Object object1 = this.PjT.get(object0);
            if(object1 != null) {
                ++this.XX;
                __monitor_exit(this);
                return object1;
            }
            ++this.Au;
            __monitor_exit(this);
            return null;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(this);
        throw throwable0;
    }

    public final Object PjT(Object object0, Object object1) {
        Object object2;
        if(object0 == null || object1 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized(this) {
            ++this.cr;
            this.Zh += this.ReZ(object0, object1);
            object2 = this.PjT.put(object0, object1);
            if(object2 != null) {
                this.Zh -= this.ReZ(object0, object2);
            }
        }
        this.PjT(this.ReZ);
        return object2;
    }

    public void PjT(int v) {
        while(true) {
            __monitor_enter(this);
            try {
                if(this.Zh < 0 || this.PjT.isEmpty() && this.Zh != 0) {
                    throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                }
                if(this.Zh <= v || this.PjT.isEmpty()) {
                    __monitor_exit(this);
                    return;
                }
                Object object0 = this.PjT.entrySet().iterator().next();
                Object object1 = ((Map.Entry)object0).getKey();
                Object object2 = ((Map.Entry)object0).getValue();
                this.PjT.remove(object1);
                this.Zh -= this.ReZ(object1, object2);
                ++this.cz;
                __monitor_exit(this);
                continue;
            }
            catch(Throwable throwable0) {
            }
            break;
        }
        __monitor_exit(this);
        throw throwable0;
    }

    private int ReZ(Object object0, Object object1) {
        return 1;
    }

    protected int Zh(Object object0, Object object1) [...] // Inlined contents

    protected Object Zh(Object object0) [...] // Inlined contents

    @Override
    public final String toString() {
        int v2;
        synchronized(this) {
            int v1 = this.Au + this.XX;
            v2 = v1 == 0 ? 0 : this.XX * 100 / v1;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.ReZ, this.XX, this.Au, v2);
    }
}

