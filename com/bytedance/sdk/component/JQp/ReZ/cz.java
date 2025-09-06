package com.bytedance.sdk.component.JQp.ReZ;

import android.content.Context;
import android.widget.ImageView.ScaleType;
import com.bytedance.sdk.component.JQp.Owx;
import com.bytedance.sdk.component.JQp.PjT.Zh;
import com.bytedance.sdk.component.JQp.RD;
import com.bytedance.sdk.component.JQp.ReZ.PjT.PjT;
import com.bytedance.sdk.component.JQp.ReZ.PjT.Zh.JQp;
import com.bytedance.sdk.component.JQp.cr;
import com.bytedance.sdk.component.JQp.gK;
import com.bytedance.sdk.component.JQp.ub;
import com.bytedance.sdk.component.JQp.xf;
import com.bytedance.sdk.component.JQp.xs;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class cz {
    private ExecutorService Au;
    private Map JQp;
    private Map PjT;
    private Map ReZ;
    private xf XX;
    private final xs Zh;
    private Map cr;
    private cr cz;

    public cz(Context context0, xs xs0) {
        this.PjT = new ConcurrentHashMap();
        this.ReZ = new HashMap();
        this.cr = new HashMap();
        this.JQp = new HashMap();
        this.Zh = (xs)XX.PjT(xs0);
        PjT.PjT(context0, xs0.Au());
    }

    public Map Au() {
        return this.PjT;
    }

    private xf DWo() {
        xf xf0 = this.Zh.PjT();
        return xf0 == null ? Zh.PjT() : xf0;
    }

    private gK JQp(com.bytedance.sdk.component.JQp.Zh zh0) {
        gK gK0 = this.Zh.cz();
        return gK0 == null ? JQp.PjT(zh0.Zh()) : gK0;
    }

    public RD JQp() {
        return this.Zh == null ? null : this.Zh.SM();
    }

    public com.bytedance.sdk.component.JQp.ReZ.Zh.PjT PjT(ReZ reZ0) {
        ImageView.ScaleType imageView$ScaleType0 = reZ0.cr();
        if(imageView$ScaleType0 == null) {
            imageView$ScaleType0 = com.bytedance.sdk.component.JQp.ReZ.Zh.PjT.PjT;
        }
        return new com.bytedance.sdk.component.JQp.ReZ.Zh.PjT(reZ0.Zh(), reZ0.ReZ(), imageView$ScaleType0, (reZ0.qj() == null ? com.bytedance.sdk.component.JQp.ReZ.Zh.PjT.Zh : reZ0.qj()), reZ0.cz(), reZ0.XX());
    }

    public com.bytedance.sdk.component.JQp.ReZ PjT(String s) {
        return this.ReZ(PjT.PjT(new File(s)));
    }

    public ub PjT(com.bytedance.sdk.component.JQp.Zh zh0) {
        if(zh0 == null) {
            zh0 = PjT.DWo();
        }
        String s = zh0.Au().toString();
        ub ub0 = (ub)this.ReZ.get(s);
        if(ub0 == null) {
            ub0 = this.cr(zh0);
            this.ReZ.put(s, ub0);
        }
        return ub0;
    }

    public Collection PjT() {
        return this.ReZ.values();
    }

    public com.bytedance.sdk.component.JQp.ReZ ReZ(com.bytedance.sdk.component.JQp.Zh zh0) {
        if(zh0 == null) {
            zh0 = PjT.DWo();
        }
        String s = zh0.Au().toString();
        com.bytedance.sdk.component.JQp.ReZ reZ0 = (com.bytedance.sdk.component.JQp.ReZ)this.JQp.get(s);
        if(reZ0 == null) {
            reZ0 = this.cz(zh0);
            this.JQp.put(s, reZ0);
        }
        return reZ0;
    }

    public Collection ReZ() {
        return this.JQp.values();
    }

    private cr SM() {
        cr cr0 = this.Zh.cr();
        return cr0 == null ? new com.bytedance.sdk.component.JQp.Zh.PjT() : cr0;
    }

    public ExecutorService XX() {
        Owx owx0 = this.Zh.ReZ();
        if(owx0 != null) {
            ExecutorService executorService0 = owx0.PjT();
            if(executorService0 != null) {
                return executorService0;
            }
        }
        if(this.Au == null) {
            this.Au = this.qj();
        }
        return this.Au;
    }

    public gK Zh(com.bytedance.sdk.component.JQp.Zh zh0) {
        if(zh0 == null) {
            zh0 = PjT.DWo();
        }
        String s = zh0.Au().toString();
        gK gK0 = (gK)this.cr.get(s);
        if(gK0 == null) {
            gK0 = this.JQp(zh0);
            this.cr.put(s, gK0);
        }
        return gK0;
    }

    public Collection Zh() {
        return this.cr.values();
    }

    private ub cr(com.bytedance.sdk.component.JQp.Zh zh0) {
        ub ub0 = this.Zh.JQp();
        return ub0 == null ? com.bytedance.sdk.component.JQp.ReZ.PjT.Zh.PjT.PjT(zh0.Zh()) : com.bytedance.sdk.component.JQp.ReZ.PjT.Zh.PjT.PjT(ub0);
    }

    public cr cr() {
        if(this.cz == null) {
            this.cz = this.SM();
        }
        return this.cz;
    }

    private com.bytedance.sdk.component.JQp.ReZ cz(com.bytedance.sdk.component.JQp.Zh zh0) {
        com.bytedance.sdk.component.JQp.ReZ reZ0 = this.Zh.XX();
        return reZ0 != null ? reZ0 : new com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.Zh(zh0.Au(), zh0.PjT(), this.XX());
    }

    public xf cz() {
        if(this.XX == null) {
            this.XX = this.DWo();
        }
        return this.XX;
    }

    private ExecutorService qj() {
        ExecutorService executorService0 = this.Zh.Zh();
        return executorService0 == null ? com.bytedance.sdk.component.JQp.PjT.ReZ.PjT() : executorService0;
    }
}

