package com.bytedance.sdk.component.adexpress.dynamic.JQp;

import java.util.ArrayList;
import java.util.List;

public class DWo {
    public static float PjT(float f) {
        return (float)Math.ceil(f * 16.0f / 16.0f);
    }

    public static List PjT(float f, List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(((PjT)((PjT)object0).clone()));
        }
        boolean z = true;
        int v1 = 0;
        int v2 = 0;
        for(Object object1: list1) {
            PjT zh$PjT0 = (PjT)object1;
            if(zh$PjT0.Zh) {
                v1 = (int)(((float)v1) + zh$PjT0.PjT);
            }
            else {
                v2 = (int)(((float)v2) + zh$PjT0.PjT);
                z = false;
            }
        }
        if(z && f > ((float)v1)) {
            return list1;
        }
        int v3 = Float.compare(f, v1);
        int v4 = Float.compare(f, v1);
        float f1 = v4 <= 0 ? 0.0f : (f - ((float)v1)) / ((float)v2);
        if(f1 > 1.0f) {
            ArrayList arrayList0 = new ArrayList();
            boolean z1 = false;
            for(Object object2: list1) {
                PjT zh$PjT1 = (PjT)object2;
                if(!zh$PjT1.Zh) {
                    float f2 = zh$PjT1.ReZ;
                    if(f2 != 0.0f && zh$PjT1.PjT * f1 > f2) {
                        zh$PjT1.PjT = f2;
                        zh$PjT1.Zh = true;
                        z1 = true;
                    }
                }
                arrayList0.add(zh$PjT1);
            }
            if(z1) {
                return DWo.PjT(f, arrayList0);
            }
        }
        int v5 = 0;
        for(Object object3: list1) {
            PjT zh$PjT2 = (PjT)object3;
            zh$PjT2.PjT = zh$PjT2.Zh ? DWo.PjT(zh$PjT2.PjT * (v3 >= 0 ? 1.0f : f / ((float)v1))) : DWo.PjT(zh$PjT2.PjT * f1);
            v5 = (int)(((float)v5) + zh$PjT2.PjT);
        }
        if(((float)v5) < f) {
            float f3 = f - ((float)v5);
            for(int v = 0; v < list1.size() && f3 > 0.0f; v = (v + 1) % list1.size()) {
                PjT zh$PjT3 = (PjT)list1.get(v);
                if(v3 < 0 && zh$PjT3.Zh || v4 > 0 && !zh$PjT3.Zh) {
                    zh$PjT3.PjT += 0.0625f;
                    f3 -= 0.0625f;
                }
            }
        }
        return list1;
    }
}

