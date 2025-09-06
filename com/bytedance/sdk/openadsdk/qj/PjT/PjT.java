package com.bytedance.sdk.openadsdk.qj.PjT;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.PjT.cr.Zh;
import com.bytedance.sdk.component.PjT.cr;
import com.bytedance.sdk.component.PjT.cz;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.openadsdk.core.KM;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

public class PjT extends cr {
    private final WeakReference PjT;

    public PjT(KM kM0) {
        this.PjT = new WeakReference(kM0);
    }

    public static void PjT(ub ub0, KM kM0) {
        ub0.PjT("getNetworkData", new Zh() {
            @Override  // com.bytedance.sdk.component.PjT.cr$Zh
            public cr PjT() {
                return new PjT(kM0);
            }
        });
    }

    @Override  // com.bytedance.sdk.component.PjT.cr
    protected void PjT(@NonNull Object object0, @NonNull cz cz0) throws Exception {
        this.PjT(((JSONObject)object0), cz0);
    }

    protected void PjT(@NonNull JSONObject jSONObject0, @NonNull cz cz0) throws Exception {
        KM kM0 = (KM)this.PjT.get();
        if(kM0 == null) {
            this.ReZ();
            return;
        }
        kM0.PjT(jSONObject0, new com.bytedance.sdk.openadsdk.xf.cr() {
            final PjT PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.cr
            public void PjT(boolean z, List list0) {
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    if(z) {
                        jSONObject0.put("creatives", KM.Zh(list0));
                        PjT.this.PjT(jSONObject0);
                        return;
                    }
                    PjT.this.PjT(jSONObject0);
                }
                catch(Throwable unused_ex) {
                }
            }
        });
    }
}

