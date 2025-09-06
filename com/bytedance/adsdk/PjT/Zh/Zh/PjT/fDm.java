package com.bytedance.adsdk.PjT.Zh.Zh.PjT;

import com.bytedance.adsdk.PjT.Zh.JQp.PjT.Zh;
import com.bytedance.adsdk.PjT.Zh.cr.ReZ;
import java.util.Map;

public class fDm extends ub {
    public fDm() {
        super(ReZ.DWo);
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public Object PjT(Map map0) {
        Object object0 = this.PjT.PjT(map0);
        Object object1 = this.Zh.PjT(map0);
        if(object0 == null && object1 == null) {
            return false;
        }
        if(object0 == null && object1 != null) {
            return true;
        }
        if(object0 != null && object1 == null) {
            return true;
        }
        return !(object0 instanceof Number) || !(object1 instanceof Number) ? Boolean.valueOf(!object0.equals(object1)) : Boolean.valueOf(!Zh.PjT(((Number)object0), ((Number)object1)));
    }
}

