package com.bytedance.sdk.openadsdk.qj.PjT;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.PjT.cr.Zh;
import com.bytedance.sdk.component.PjT.cr;
import com.bytedance.sdk.component.PjT.cz;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.openadsdk.core.KM;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class ReZ extends cr {
    private final WeakReference PjT;

    public ReZ(KM kM0) {
        this.PjT = new WeakReference(kM0);
    }

    public static void PjT(ub ub0, KM kM0) {
        ub0.PjT("newClickEvent", new Zh() {
            @Override  // com.bytedance.sdk.component.PjT.cr$Zh
            public cr PjT() {
                return new ReZ(kM0);
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
        kM0.JQp(jSONObject0);
    }
}

