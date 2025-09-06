package com.bytedance.sdk.component.JQp.JQp;

import com.bytedance.sdk.component.JQp.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.ReZ.cr;
import com.bytedance.sdk.component.JQp.cz;
import com.bytedance.sdk.component.JQp.xE;
import java.util.List;
import java.util.Map;

public class xs extends PjT {
    private Object PjT;
    private boolean ReZ;
    private cz Zh;

    public xs(Object object0, cz cz0, boolean z) {
        this.PjT = object0;
        this.Zh = cz0;
        this.ReZ = z;
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "success";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(ReZ reZ0) {
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

    private Map Zh() {
        return this.Zh == null ? null : this.Zh.JQp();
    }

    private void Zh(ReZ reZ0) {
        xE xE0 = reZ0.Au();
        if(xE0 != null) {
            xE0.PjT(new cr().PjT(reZ0, this.PjT, this.Zh(), this.ReZ));
        }
    }
}

