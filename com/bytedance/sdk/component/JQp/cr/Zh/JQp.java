package com.bytedance.sdk.component.JQp.cr.Zh;

import com.bytedance.sdk.component.JQp.cr.ReZ.PjT;
import com.bytedance.sdk.component.JQp.cr.ReZ.ReZ;
import com.bytedance.sdk.component.JQp.ltE;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class JQp implements cz {
    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public String PjT() {
        return "check_duplicate";
    }

    @Override  // com.bytedance.sdk.component.JQp.cr.Zh.cz
    public boolean PjT(ReZ reZ0, ltE ltE0, PjT pjT0) {
        List list0;
        String s = reZ0.Owx();
        Map map0 = reZ0.ub().XX();
        synchronized(map0) {
            list0 = (List)map0.get(s);
            if(list0 == null) {
                list0 = new CopyOnWriteArrayList();
                map0.put(s, list0);
            }
        }
        synchronized(list0) {
            list0.add(reZ0);
            return list0.size() > 1 ? false : true;
        }
    }
}

