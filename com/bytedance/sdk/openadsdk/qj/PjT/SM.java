package com.bytedance.sdk.openadsdk.qj.PjT;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.PjT.JQp;
import com.bytedance.sdk.component.PjT.cz;
import com.bytedance.sdk.component.PjT.ub;
import com.bytedance.sdk.openadsdk.core.KM;
import org.json.JSONObject;

public class SM extends JQp {
    private final KM PjT;

    public SM(KM kM0) {
        this.PjT = kM0;
    }

    public static void PjT(ub ub0, KM kM0) {
        ub0.PjT("overlayRenderFinish", new SM(kM0));
    }

    @Override  // com.bytedance.sdk.component.PjT.JQp
    @Nullable
    public Object PjT(@NonNull Object object0, @NonNull cz cz0) throws Exception {
        return this.PjT(((JSONObject)object0), cz0);
    }

    @Nullable
    public JSONObject PjT(@NonNull JSONObject jSONObject0, @NonNull cz cz0) throws Exception {
        this.PjT.xs();
        return null;
    }
}

