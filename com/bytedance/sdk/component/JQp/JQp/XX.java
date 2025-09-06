package com.bytedance.sdk.component.JQp.JQp;

import com.bytedance.sdk.component.JQp.ReZ.ReZ;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class XX extends PjT {
    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public String PjT() {
        return "check_duplicate";
    }

    @Override  // com.bytedance.sdk.component.JQp.JQp.SM
    public void PjT(ReZ reZ0) {
        List list0;
        String s = reZ0.Sks();
        Map map0 = reZ0.gK().Au();
        synchronized(map0) {
            list0 = (List)map0.get(s);
            if(list0 == null) {
                list0 = new LinkedList();
            }
            __monitor_exit(map0);
        }
        __monitor_enter(list0);
        try {
            list0.add(reZ0);
            map0.put(s, list0);
            if(list0.size() <= 1) {
                reZ0.PjT(new cr());
            }
            __monitor_exit(list0);
            return;
        }
        catch(Throwable throwable1) {
        }
        __monitor_exit(list0);
        throw throwable1;
    }
}

