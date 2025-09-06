package com.bytedance.sdk.component.JQp.cr.ReZ;

import com.bytedance.sdk.component.JQp.XX;
import com.bytedance.sdk.component.JQp.qj;
import java.util.Map;

public class cr implements qj {
    private boolean Au;
    private XX DWo;
    private int JQp;
    private String PjT;
    private Object ReZ;
    private boolean SM;
    private Map XX;
    private String Zh;
    private Object cr;
    private int cz;
    private int qj;

    @Override  // com.bytedance.sdk.component.JQp.qj
    public boolean JQp() {
        return this.Au;
    }

    public cr PjT(ReZ reZ0, Object object0) {
        this.ReZ = object0;
        this.PjT = reZ0.DWo();
        this.Zh = reZ0.PjT();
        this.JQp = reZ0.Zh();
        this.cz = reZ0.ReZ();
        this.SM = reZ0.xs();
        this.DWo = reZ0.qla();
        this.qj = reZ0.xE();
        return this;
    }

    public cr PjT(ReZ reZ0, Object object0, Map map0, boolean z) {
        this.XX = map0;
        this.Au = z;
        return this.PjT(reZ0, object0);
    }

    @Override  // com.bytedance.sdk.component.JQp.qj
    public String PjT() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.JQp.qj
    public void PjT(Object object0) {
        this.cr = this.ReZ;
        this.ReZ = object0;
    }

    @Override  // com.bytedance.sdk.component.JQp.qj
    public Object ReZ() {
        return this.cr;
    }

    @Override  // com.bytedance.sdk.component.JQp.qj
    public int XX() {
        return this.qj;
    }

    @Override  // com.bytedance.sdk.component.JQp.qj
    public Object Zh() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.JQp.qj
    public Map cr() {
        return this.XX;
    }

    @Override  // com.bytedance.sdk.component.JQp.qj
    public boolean cz() {
        return this.SM;
    }
}

