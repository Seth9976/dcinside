package com.bytedance.sdk.openadsdk.qj.PjT;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.PjT.cr;
import com.bytedance.sdk.component.PjT.cz;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.SM;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class Zh extends cr {
    private final WeakReference PjT;

    public Zh(KM kM0) {
        this.PjT = new WeakReference(kM0);
    }

    public static void PjT(ub ub0, KM kM0) {
        ub0.PjT("interstitial_webview_close", new com.bytedance.sdk.component.PjT.cr.Zh() {
            @Override  // com.bytedance.sdk.component.PjT.cr$Zh
            public cr PjT() {
                return new Zh(kM0);
            }
        });
    }

    @Override  // com.bytedance.sdk.component.PjT.cr
    protected void PjT(@NonNull Object object0, @NonNull cz cz0) throws Exception {
        this.PjT(((JSONObject)object0), cz0);
    }

    protected void PjT(@NonNull JSONObject jSONObject0, @NonNull cz cz0) throws Exception {
        SM.Zh().ltE();
        KM kM0 = (KM)this.PjT.get();
        if(kM0 == null) {
            this.ReZ();
            return;
        }
        kM0.Au();
    }
}

