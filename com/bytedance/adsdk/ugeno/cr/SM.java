package com.bytedance.adsdk.ugeno.cr;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.cr.cr.XX;
import com.bytedance.adsdk.ugeno.cr.cr.Zh;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SM implements qj {
    public static class PjT {
        public Map PjT;
        public Map Zh;

        public PjT(Map map0, Map map1) {
            this.PjT = map0;
            this.Zh = map1;
        }
    }

    private PjT PjT;
    private ReZ ReZ;
    private Map Zh;
    private boolean cr;

    public SM(ReZ reZ0, PjT sM$PjT0) {
        this.ReZ = reZ0;
        this.PjT = sM$PjT0;
        if(sM$PjT0 != null) {
            this.Zh = sM$PjT0.PjT;
        }
    }

    public static SM PjT(ReZ reZ0, String s) {
        if(reZ0 != null && !TextUtils.isEmpty(s)) {
            try {
                JSONArray jSONArray0 = new JSONArray(s);
                if(jSONArray0.length() <= 0) {
                    return null;
                }
                PjT sM$PjT0 = new PjT(new HashMap(), new HashMap());
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
                    if(jSONObject0 != null) {
                        com.bytedance.adsdk.ugeno.cr.cr.PjT pjT0 = com.bytedance.adsdk.ugeno.cr.cr.PjT.PjT.PjT(reZ0.qj().getContext(), reZ0, jSONObject0, reZ0.xf());
                        if(pjT0 != null) {
                            sM$PjT0.PjT.put(pjT0.Zh(), pjT0);
                            sM$PjT0.Zh.put(pjT0.ReZ(), pjT0);
                        }
                    }
                }
                return new SM(reZ0, sM$PjT0);
            }
            catch(JSONException unused_ex) {
            }
        }
        return null;
    }

    private void PjT(String s, List list0) {
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0 = (com.bytedance.adsdk.ugeno.cr.cz.PjT)object0;
                if(cz$PjT0 != null) {
                    com.bytedance.adsdk.ugeno.cr.Zh.PjT pjT0 = com.bytedance.adsdk.ugeno.cr.Zh.PjT.PjT.PjT(this.ReZ, s, cz$PjT0);
                    if(pjT0 != null) {
                        pjT0.PjT();
                    }
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    public com.bytedance.adsdk.ugeno.cr.cr.PjT PjT(String s) {
        return this.Zh != null && !this.Zh.isEmpty() && !TextUtils.isEmpty(s) ? ((com.bytedance.adsdk.ugeno.cr.cr.PjT)this.Zh.get(s)) : null;
    }

    public void PjT() {
        com.bytedance.adsdk.ugeno.cr.cr.PjT pjT0 = this.PjT("shake");
        if(pjT0 != null) {
            pjT0.PjT(this);
            pjT0.PjT(new Object[0]);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.qj
    public void PjT(ReZ reZ0, String s, List list0) {
        this.PjT(s, list0);
    }

    public void PjT(String s, Object[] arr_object) {
        com.bytedance.adsdk.ugeno.cr.cr.PjT pjT0 = this.Zh(s);
        if(pjT0 != null) {
            pjT0.PjT(this);
            pjT0.PjT(arr_object);
        }
    }

    public boolean PjT(MotionEvent motionEvent0) {
        com.bytedance.adsdk.ugeno.cr.cr.PjT pjT0 = this.PjT("tap");
        if(pjT0 instanceof XX) {
            pjT0.PjT(this);
            this.cr = pjT0.PjT(new Object[]{motionEvent0});
        }
        if(this.cr) {
            return true;
        }
        com.bytedance.adsdk.ugeno.cr.cr.PjT pjT1 = this.PjT("slide");
        if(pjT1 instanceof com.bytedance.adsdk.ugeno.cr.cr.ReZ) {
            pjT1.PjT(this);
            return pjT1.PjT(new Object[]{motionEvent0});
        }
        return this.cr;
    }

    public void ReZ() {
        PjT sM$PjT0 = this.PjT;
        if(sM$PjT0 == null) {
            return;
        }
        for(Object object0: sM$PjT0.PjT.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0 != null) {
                com.bytedance.adsdk.ugeno.cr.cr.PjT pjT0 = (com.bytedance.adsdk.ugeno.cr.cr.PjT)map$Entry0.getValue();
                if(pjT0 instanceof Zh) {
                    pjT0.PjT(this);
                    pjT0.PjT(new Object[0]);
                }
            }
        }
    }

    public com.bytedance.adsdk.ugeno.cr.cr.PjT Zh(String s) {
        if(this.PjT != null && !TextUtils.isEmpty(s)) {
            Map map0 = this.PjT.Zh;
            return map0 == null ? null : ((com.bytedance.adsdk.ugeno.cr.cr.PjT)map0.get(s));
        }
        return null;
    }

    public void Zh() {
        com.bytedance.adsdk.ugeno.cr.cr.PjT pjT0 = this.PjT("twist");
        if(pjT0 != null) {
            pjT0.PjT(this);
            pjT0.PjT(new Object[0]);
        }
    }

    public void cr() {
        com.bytedance.adsdk.ugeno.cr.cr.PjT pjT0 = this.PjT("timer");
        if(pjT0 != null) {
            pjT0.PjT(this);
            pjT0.PjT(new Object[0]);
        }
    }
}

