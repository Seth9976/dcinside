package com.bytedance.sdk.component.JQp.cr.ReZ;

import android.content.Context;
import android.widget.ImageView.ScaleType;
import com.bytedance.sdk.component.JQp.Owx;
import com.bytedance.sdk.component.JQp.RD;
import com.bytedance.sdk.component.JQp.ReZ;
import com.bytedance.sdk.component.JQp.Zh.PjT;
import com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh;
import com.bytedance.sdk.component.JQp.cr;
import com.bytedance.sdk.component.JQp.gK;
import com.bytedance.sdk.component.JQp.ub;
import com.bytedance.sdk.component.JQp.xs;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class cz {
    private ExecutorService Au;
    private Map JQp;
    private Map PjT;
    private volatile ub ReZ;
    private ExecutorService XX;
    private final xs Zh;
    private volatile gK cr;
    private cr cz;

    public cz(Context context0, xs xs0) {
        this.PjT = new ConcurrentHashMap();
        this.JQp = new ConcurrentHashMap();
        this.Zh = (xs)XX.PjT(xs0);
        Zh.PjT(context0, xs0.Au());
    }

    private cr Au() {
        cr cr0 = this.Zh.cr();
        return cr0 == null ? new PjT() : cr0;
    }

    public RD JQp() {
        return this.Zh == null ? null : this.Zh.SM();
    }

    public ReZ PjT(String s) {
        return this.ReZ(Zh.PjT(new File(s)));
    }

    public com.bytedance.sdk.component.JQp.cr.ReZ.Zh.PjT PjT(com.bytedance.sdk.component.JQp.cr.ReZ.ReZ reZ0) {
        ImageView.ScaleType imageView$ScaleType0 = reZ0.cr();
        if(imageView$ScaleType0 == null) {
            imageView$ScaleType0 = com.bytedance.sdk.component.JQp.cr.ReZ.Zh.PjT.PjT;
        }
        return new com.bytedance.sdk.component.JQp.cr.ReZ.Zh.PjT(reZ0.Zh(), reZ0.ReZ(), imageView$ScaleType0, (reZ0.qj() == null ? com.bytedance.sdk.component.JQp.cr.ReZ.Zh.PjT.Zh : reZ0.qj()), reZ0.cz(), reZ0.XX());
    }

    public gK PjT() {
        return this.cr;
    }

    public ub PjT(com.bytedance.sdk.component.JQp.Zh zh0) {
        if(zh0 == null) {
            zh0 = Zh.DWo();
        }
        if(this.ReZ == null) {
            Class class0 = com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh.ReZ.class;
            __monitor_enter(class0);
            try {
                if(this.ReZ == null) {
                    this.ReZ = new com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh.ReZ(new com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh.PjT(zh0.Zh(), zh0.ReZ()));
                }
                __monitor_exit(class0);
                return this.ReZ;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return this.ReZ;
    }

    public ReZ ReZ(com.bytedance.sdk.component.JQp.Zh zh0) {
        if(zh0 == null) {
            zh0 = Zh.DWo();
        }
        String s = zh0.Au().toString();
        ReZ reZ0 = (ReZ)this.JQp.get(s);
        if(reZ0 == null) {
            reZ0 = this.cr(zh0);
            this.JQp.put(s, reZ0);
        }
        return reZ0;
    }

    public cr ReZ() {
        if(this.cz == null) {
            this.cz = this.Au();
        }
        return this.cz;
    }

    private ExecutorService SM() {
        ExecutorService executorService0 = this.Zh.Zh();
        return executorService0 == null ? com.bytedance.sdk.component.JQp.cr.PjT.Zh.PjT() : executorService0;
    }

    public Map XX() {
        return this.PjT;
    }

    public gK Zh(com.bytedance.sdk.component.JQp.Zh zh0) {
        if(zh0 == null) {
            zh0 = Zh.DWo();
        }
        if(this.cr == null) {
            Class class0 = com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh.Zh.class;
            __monitor_enter(class0);
            try {
                if(this.cr == null) {
                    this.cr = new com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh.Zh(zh0.Zh(), zh0.cr());
                }
                __monitor_exit(class0);
                return this.cr;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return this.cr;
    }

    public Collection Zh() {
        return this.JQp.values();
    }

    private ReZ cr(com.bytedance.sdk.component.JQp.Zh zh0) {
        ReZ reZ0 = this.Zh.XX();
        return reZ0 != null ? reZ0 : new com.bytedance.sdk.component.JQp.cr.ReZ.PjT.PjT.Zh(zh0.Au(), zh0.PjT());
    }

    public ExecutorService cr() {
        Owx owx0 = this.Zh.ReZ();
        if(owx0 != null) {
            ExecutorService executorService0 = owx0.PjT();
            if(executorService0 != null) {
                return executorService0;
            }
        }
        if(this.XX == null) {
            this.XX = this.SM();
        }
        return this.XX;
    }

    public ExecutorService cz() {
        Owx owx0 = this.Zh.ReZ();
        if(owx0 != null) {
            ExecutorService executorService0 = owx0.Zh();
            if(executorService0 != null) {
                return executorService0;
            }
        }
        if(this.Au == null) {
            this.Au = com.bytedance.sdk.component.JQp.cr.PjT.Zh.PjT();
        }
        return this.Au;
    }
}

