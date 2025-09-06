package com.bytedance.adsdk.PjT.Zh;

import com.bytedance.adsdk.PjT.Zh.ReZ.PjT.Au;
import com.bytedance.adsdk.PjT.Zh.ReZ.PjT.DWo;
import com.bytedance.adsdk.PjT.Zh.ReZ.PjT.JQp;
import com.bytedance.adsdk.PjT.Zh.ReZ.PjT.ReZ;
import com.bytedance.adsdk.PjT.Zh.ReZ.PjT.SM;
import com.bytedance.adsdk.PjT.Zh.ReZ.PjT.XX;
import com.bytedance.adsdk.PjT.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.PjT.Zh.ReZ.PjT.cr;
import com.bytedance.adsdk.PjT.Zh.ReZ.PjT.cz;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public class PjT {
    private String JQp;
    private static final com.bytedance.adsdk.PjT.Zh.ReZ.PjT PjT;
    private com.bytedance.adsdk.PjT.Zh.Zh.PjT ReZ;
    private final com.bytedance.adsdk.PjT.Zh.ReZ.PjT Zh;
    private Deque cr;

    static {
        cz[] arr_cz = {new DWo(), new cr(), new SM(), new Zh(), new JQp(), new com.bytedance.adsdk.PjT.Zh.ReZ.PjT.PjT(), new XX(), new ReZ(), new Au()};
        com.bytedance.adsdk.PjT.Zh.PjT.1 pjT$10 = new com.bytedance.adsdk.PjT.Zh.ReZ.PjT() {
            @Override  // com.bytedance.adsdk.PjT.Zh.ReZ.PjT
            public int PjT(String s, int v, Deque deque0) {
                return v;
            }
        };
        int v = 8;
        while(v >= 0) {
            com.bytedance.adsdk.PjT.Zh.PjT.2 pjT$20 = new com.bytedance.adsdk.PjT.Zh.ReZ.PjT() {
                @Override  // com.bytedance.adsdk.PjT.Zh.ReZ.PjT
                public int PjT(String s, int v, Deque deque0) {
                    return arr_cz[v].PjT(s, v, deque0, pjT$10);
                }
            };
            --v;
            pjT$10 = pjT$20;
        }
        PjT.PjT = pjT$10;
    }

    private PjT(String s, com.bytedance.adsdk.PjT.Zh.ReZ.PjT pjT0) {
        this.cr = new LinkedList();
        this.Zh = pjT0;
        this.JQp = s;
        try {
            this.PjT();
        }
        catch(Exception exception0) {
            throw new com.bytedance.adsdk.PjT.PjT.Zh(s, exception0);
        }
    }

    public static PjT PjT(String s) {
        return new PjT(s, PjT.PjT);
    }

    private void PjT() {
        int v = this.JQp.length();
        int v1;
        for(v1 = 0; v1 < v; v1 = v2) {
            int v2 = this.Zh.PjT(this.JQp, v1, this.cr);
            if(v2 == v1) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.JQp.substring(0, v1));
            }
        }
        ArrayList arrayList0 = new ArrayList();
        com.bytedance.adsdk.PjT.Zh.Zh.PjT pjT0;
        while((pjT0 = (com.bytedance.adsdk.PjT.Zh.Zh.PjT)this.cr.pollFirst()) != null) {
            arrayList0.add(0, pjT0);
        }
        this.ReZ = com.bytedance.adsdk.PjT.Zh.JQp.Zh.PjT(arrayList0, this.JQp, v1);
        this.cr = null;
    }

    public Object PjT(Map map0) {
        return this.ReZ.PjT(map0);
    }

    public Object PjT(JSONObject jSONObject0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("default_key", jSONObject0);
        return this.PjT(hashMap0);
    }
}

