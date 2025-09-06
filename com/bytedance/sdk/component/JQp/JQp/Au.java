package com.bytedance.sdk.component.JQp.JQp;

import com.bytedance.sdk.component.JQp.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.xE;
import java.util.List;
import java.util.Map;

public class Au extends PjT {
    private Throwable PjT;
    private String ReZ;
    private int Zh;

    public Au(int v, String s, Throwable throwable0) {
        this.Zh = v;
        this.ReZ = s;
        this.PjT = throwable0;
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "failed";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(ReZ reZ0) {
        reZ0.PjT(new com.bytedance.sdk.component.JQp.ReZ.PjT(this.Zh, this.ReZ, this.PjT));
        String s = reZ0.Sks();
        Map map0 = reZ0.gK().Au();
        List list0 = (List)map0.get(s);
        if(list0 == null) {
            this.Zh(reZ0);
            return;
        }
        __monitor_enter(list0);
        try {
            for(Object object0: list0) {
                this.Zh(((ReZ)object0));
            }
            list0.clear();
            map0.remove(s);
            __monitor_exit(list0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(list0);
        throw throwable0;
    }

    private void Zh(ReZ reZ0) {
        xE xE0 = reZ0.Au();
        if(xE0 != null) {
            xE0.PjT(this.Zh, this.ReZ, this.PjT);
        }
    }
}

