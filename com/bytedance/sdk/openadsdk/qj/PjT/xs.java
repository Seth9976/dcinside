package com.bytedance.sdk.openadsdk.qj.PjT;

import android.view.ViewGroup;
import com.bytedance.sdk.component.PjT.JQp;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.Qf;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.Jo;
import org.json.JSONObject;

public class xs extends JQp {
    private cz PjT;
    private KM ReZ;
    private String Zh;
    private Owx cr;

    public xs(cz cz0, String s, KM kM0, Owx owx0) {
        this.PjT = cz0;
        this.Zh = s;
        this.ReZ = kM0;
        this.cr = owx0;
    }

    public static void PjT(ub ub0, cz cz0, KM kM0, Owx owx0) {
        ub0.PjT("closeWebview", new xs(cz0, "closeWebview", kM0, owx0));
        ub0.PjT("makeVisible", new xs(cz0, "makeVisible", kM0, owx0));
        ub0.PjT("getCurrentVisibleState", new xs(cz0, "getCurrentVisibleState", kM0, owx0));
    }

    @Override  // com.bytedance.sdk.component.PjT.JQp
    public Object PjT(Object object0, com.bytedance.sdk.component.PjT.cz cz0) throws Exception {
        return this.PjT(((JSONObject)object0), cz0);
    }

    public JSONObject PjT(JSONObject jSONObject0, com.bytedance.sdk.component.PjT.cz cz0) throws Exception {
        JSONObject jSONObject1 = new JSONObject();
        String s = this.Zh;
        s.hashCode();
        switch(s) {
            case "closeWebview": {
                Jo.PjT(new Runnable() {
                    final xs PjT;

                    @Override
                    public void run() {
                        if(xs.this.PjT != null) {
                            xs.this.PjT.setVisibility(8);
                            ViewGroup viewGroup0 = (ViewGroup)xs.this.PjT.getParent();
                            if(viewGroup0 != null) {
                                viewGroup0.removeView(xs.this.PjT);
                            }
                        }
                    }
                });
                jSONObject1.put("success", true);
                return jSONObject1;
            }
            case "getCurrentVisibleState": {
                Owx owx0 = this.cr;
                if(owx0 != null) {
                    jSONObject1.put("visibleState", !Qf.PjT(this.PjT, 20, owx0.kW()));
                }
                return jSONObject1;
            }
            case "makeVisible": {
                if(this.PjT != null) {
                    jSONObject1.put("success", true);
                    Jo.PjT(new Runnable() {
                        final xs PjT;

                        @Override
                        public void run() {
                            if(xs.this.PjT != null) {
                                xs.this.PjT.setVisibility(0);
                            }
                        }
                    });
                    return jSONObject1;
                }
                jSONObject1.put("success", false);
                return jSONObject1;
            }
            default: {
                return jSONObject1;
            }
        }
    }
}

