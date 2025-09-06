package com.bytedance.sdk.component.JQp.ReZ.PjT;

import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ReZ {
    private int Au;
    private int JQp;
    private final LinkedHashMap PjT;
    private int ReZ;
    private int XX;
    private int Zh;
    private int cr;
    private int cz;

    public ReZ(int v) {
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
            SoftReference softReference0 = (SoftReference)this.PjT.get(object0);
            if(softReference0 != null) {
                Object object1 = softReference0.get();
                if(object1 != null) {
                    ++this.XX;
                    __monitor_exit(this);
                    return object1;
                }
                this.PjT.remove(object0);
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
            SoftReference softReference0 = new SoftReference(object1);
            SoftReference softReference1 = (SoftReference)this.PjT.put(object0, softReference0);
            if(softReference1 == null) {
                object2 = null;
            }
            else {
                object2 = softReference1.get();
                if(object2 != null) {
                    this.Zh -= this.ReZ(object0, object2);
                }
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
                    Log.e("LruCache", "oom maybe occured, clear cache. size= " + this.Zh + ", maxSize: " + v);
                    this.Zh = 0;
                    this.PjT.clear();
                    __monitor_exit(this);
                    return;
                }
                if(this.Zh <= v) {
                    __monitor_exit(this);
                    return;
                }
                Object object0 = this.PjT.entrySet().iterator().next();
                if(((Map.Entry)object0) == null) {
                    __monitor_exit(this);
                    return;
                }
                Object object1 = ((Map.Entry)object0).getKey();
                SoftReference softReference0 = (SoftReference)((Map.Entry)object0).getValue();
                this.PjT.remove(object1);
                if(softReference0 != null) {
                    Object object2 = softReference0.get();
                    this.Zh -= this.ReZ(object1, object2);
                }
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
        int v = this.Zh(object0, object1);
        if(v < 0) {
            throw new IllegalStateException("Negative size: " + object0 + "=" + object1);
        }
        return v;
    }

    protected int Zh(Object object0, Object object1) {
        return 1;
    }

    protected Object Zh(Object object0) [...] // Inlined contents

    @Override
    public final String toString() {
        int v2;
        synchronized(this) {
            int v1 = this.Au + this.XX;
            v2 = v1 == 0 ? 0 : this.XX * 100 / v1;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.ReZ, this.XX, this.Au, v2);
    }
}

