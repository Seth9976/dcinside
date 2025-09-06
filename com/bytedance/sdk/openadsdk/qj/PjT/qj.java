package com.bytedance.sdk.openadsdk.qj.PjT;

import com.bytedance.sdk.component.PjT.cr.Zh;
import com.bytedance.sdk.component.PjT.cr;
import com.bytedance.sdk.component.PjT.cz;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

public class qj extends cr {
    private WeakReference PjT;
    private long ReZ;
    private Owx Zh;
    private HashSet cr;

    public qj(KM kM0, Owx owx0) {
        this.PjT = new WeakReference(kM0);
        this.Zh = owx0;
        this.cr = new HashSet();
    }

    public static void PjT(ub ub0, KM kM0, Owx owx0) {
        ub0.PjT("requestDelayCallback", new Zh() {
            @Override  // com.bytedance.sdk.component.PjT.cr$Zh
            public cr PjT() {
                return new qj(kM0, owx0);
            }
        });
    }

    @Override  // com.bytedance.sdk.component.PjT.cr
    protected void PjT(Object object0, cz cz0) throws Exception {
        this.PjT(((JSONObject)object0), cz0);
    }

    protected void PjT(JSONObject jSONObject0, cz cz0) throws Exception {
        KM kM0 = (KM)this.PjT.get();
        if(kM0 != null && jSONObject0 != null) {
            kM0.PjT(new com.bytedance.sdk.openadsdk.xf.Zh() {
                final qj PjT;

                @Override  // com.bytedance.sdk.openadsdk.xf.Zh
                public void PjT(int v) {
                    qj.this.cr.add(v);
                    if(((long)qj.this.cr.size()) >= qj.this.ReZ) {
                        try {
                            JSONObject jSONObject0 = new JSONObject();
                            qj.this.PjT(jSONObject0);
                            qj.this.cr.clear();
                        }
                        catch(Exception exception0) {
                            exception0.getMessage();
                        }
                    }
                }
            });
            int v = jSONObject0.optInt("delay", -1);
            if(v < 0) {
                return;
            }
            this.ReZ = (long)(v / 1000);
            return;
        }
        this.ReZ();
    }
}

