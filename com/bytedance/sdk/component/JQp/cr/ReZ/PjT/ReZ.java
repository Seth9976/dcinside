package com.bytedance.sdk.component.JQp.cr.ReZ.PjT;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ReZ {
    private final LinkedHashMap PjT;
    private int Zh;

    public ReZ(int v) {
        this.Zh = v;
        this.PjT = new LinkedHashMap(0, 0.75f, true);
    }

    public Object PjT(Object object0) {
        Object object1;
        __monitor_enter(this);
        if(object0 == null) {
            __monitor_exit(this);
            return null;
        }
        if(this.Zh <= 0) {
            __monitor_exit(this);
            return null;
        }
        try {
            SoftReference softReference0 = (SoftReference)this.PjT.get(object0);
            if(softReference0 != null) {
                object1 = softReference0.get();
                if(object1 == null) {
                    this.PjT.remove(object0);
                    goto label_18;
                }
                goto label_16;
            }
            goto label_18;
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
    label_16:
        __monitor_exit(this);
        return object1;
    label_18:
        __monitor_exit(this);
        return null;
    }

    public void PjT(int v) {
        synchronized(this) {
            int v2 = this.PjT.size() - v;
            if(v2 > 0) {
                Iterator iterator0 = this.PjT.entrySet().iterator();
                for(int v3 = 0; v3 < v2; ++v3) {
                    iterator0.next();
                    iterator0.remove();
                }
            }
            if(v == 0) {
                return;
            }
            Iterator iterator1 = this.PjT.entrySet().iterator();
            while(iterator1.hasNext()) {
                Object object0 = iterator1.next();
                if(((SoftReference)((Map.Entry)object0).getValue()).get() == null) {
                    iterator1.remove();
                }
            }
        }
    }

    public void PjT(Object object0, Object object1) {
        __monitor_enter(this);
        if(this.Zh <= 0) {
            __monitor_exit(this);
            return;
        }
        if(object0 != null && object1 != null) {
            try {
                SoftReference softReference0 = new SoftReference(object1);
                this.PjT.put(object0, softReference0);
                int v = this.Zh;
                if(this.PjT.size() > v) {
                    this.PjT(((int)(((double)v) * 0.7)));
                }
            }
            catch(Throwable throwable0) {
                __monitor_exit(this);
                throw throwable0;
            }
            __monitor_exit(this);
            return;
        }
        __monitor_exit(this);
    }

    @Override
    public final String toString() {
        Object[] arr_object;
        synchronized(this) {
            arr_object = new Object[]{this.Zh, this.PjT.size()};
        }
        return String.format("LruCache[maxCount=%d,size=%d]", arr_object);
    }
}

