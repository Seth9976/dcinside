package com.bytedance.adsdk.PjT.Zh.Zh.PjT;

import com.bytedance.adsdk.PjT.Au;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT;
import com.bytedance.adsdk.PjT.Zh.cr.JQp;
import com.bytedance.adsdk.PjT.Zh.cr.Zh;
import java.util.Map;
import org.json.JSONObject;

public class DWo implements PjT {
    private PjT[] PjT;
    private com.bytedance.adsdk.PjT.Zh.PjT.PjT ReZ;
    private String Zh;

    public DWo(String s) {
        this.Zh = s;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public JQp PjT() {
        return Zh.PjT;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public Object PjT(Map map0) {
        com.bytedance.adsdk.PjT.Zh.PjT.PjT pjT0 = new com.bytedance.adsdk.PjT.Zh.PjT.PjT();
        this.ReZ = pjT0;
        pjT0.PjT(this.Zh);
        Object[] arr_object = new Object[this.PjT.length];
        for(int v = 0; true; ++v) {
            PjT[] arr_pjT = this.PjT;
            if(v >= arr_pjT.length) {
                break;
            }
            PjT pjT1 = arr_pjT[v];
            if(pjT1 != null) {
                arr_object[v] = pjT1.PjT(map0);
            }
        }
        this.ReZ.PjT(arr_object);
        return Au.PjT(this.Zh).PjT(((JSONObject)map0.get("default_key")), arr_object);
    }

    public void PjT(PjT[] arr_pjT) {
        this.PjT = arr_pjT;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public String Zh() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.Zh);
        stringBuilder0.append("(");
        if(this.PjT != null && this.PjT.length > 0) {
            for(int v = 0; true; ++v) {
                PjT[] arr_pjT = this.PjT;
                if(v >= arr_pjT.length) {
                    break;
                }
                stringBuilder0.append(arr_pjT[v].Zh());
                stringBuilder0.append(",");
            }
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

