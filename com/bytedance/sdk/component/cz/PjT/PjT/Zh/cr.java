package com.bytedance.sdk.component.cz.PjT.PjT.Zh;

import com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class cr {
    private PjT PjT;
    private Queue ReZ;
    private Queue Zh;
    private String cr;

    public cr(PjT pjT0, Queue queue0, String s) {
        this.Zh = new ConcurrentLinkedQueue();
        this.PjT = pjT0;
        this.ReZ = queue0;
        this.cr = s;
    }

    public List PjT(int v, int v1) {
        synchronized(this) {
            if(this.Zh(v, v1)) {
                List list0 = new ArrayList(this.PjT.PjT());
                do {
                    com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)this.Zh.poll();
                    if(pjT0 == null) {
                        break;
                    }
                    list0.add(pjT0);
                }
                while(list0.size() != this.PjT.Zh());
                return list0;
            }
            return null;
        }
    }

    public void PjT(int v, List list0) {
        synchronized(this) {
            if(v != -1 && v != 200 && v != 509) {
                this.Zh.addAll(list0);
                return;
            }
            this.Zh.size();
        }
    }

    public void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        Queue queue0 = this.Zh;
        if(queue0 != null && pjT0 != null) {
            queue0.offer(pjT0);
        }
    }

    public boolean Zh(int v, int v1) {
        synchronized(this) {
            int v3 = this.Zh.size();
            int v4 = this.PjT.PjT();
            if(v != 1 && v != 2) {
                return v3 >= v4;
            }
            return com.bytedance.sdk.component.cz.PjT.ReZ.PjT.ReZ() ? v3 > 0 : v3 >= v4;
        }
    }
}

