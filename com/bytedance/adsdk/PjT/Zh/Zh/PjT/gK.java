package com.bytedance.adsdk.PjT.Zh.Zh.PjT;

import com.bytedance.adsdk.PjT.Zh.JQp.PjT.Au;
import com.bytedance.adsdk.PjT.Zh.cr.ReZ;
import java.util.Map;

public class gK extends ub {
    private static final ThreadLocal cr;

    static {
        gK.cr = new ThreadLocal() {
            protected StringBuilder PjT() {
                return new StringBuilder();
            }

            @Override
            protected Object initialValue() {
                return this.PjT();
            }
        };
    }

    public gK() {
        super(ReZ.qj);
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public Object PjT(Map map0) {
        Object object0 = this.PjT.PjT(map0);
        if(object0 == null) {
            return null;
        }
        Object object1 = this.Zh.PjT(map0);
        if(object1 == null) {
            return null;
        }
        if(!(object0 instanceof String) && !(object1 instanceof String)) {
            return Au.PjT(((Number)object0), ((Number)object1));
        }
        StringBuilder stringBuilder0 = (StringBuilder)gK.cr.get();
        stringBuilder0.append(object0);
        stringBuilder0.append(object1);
        stringBuilder0.setLength(0);
        return stringBuilder0.toString();
    }
}

