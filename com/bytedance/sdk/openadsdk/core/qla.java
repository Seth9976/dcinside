package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

public class qla {
    static class PjT {
        private static final qla PjT;

        static {
            PjT.PjT = new qla();
        }
    }

    private final com.bytedance.sdk.openadsdk.utils.PjT PjT;
    private boolean Zh;

    public qla() {
        this.PjT = new com.bytedance.sdk.openadsdk.utils.PjT();
    }

    public com.bytedance.sdk.openadsdk.utils.PjT JQp() {
        return this.PjT;
    }

    public static qla PjT() {
        return PjT.PjT;
    }

    public boolean PjT(boolean z) {
        return this.PjT.PjT(z);
    }

    public boolean ReZ() {
        return this.Zh;
    }

    public void Zh() {
        try {
            Context context0 = ub.PjT();
            if(context0 instanceof Application) {
                ((Application)context0).registerActivityLifecycleCallbacks(this.PjT);
                this.Zh = true;
                return;
            }
            if(context0 != null && context0.getApplicationContext() != null) {
                ((Application)context0.getApplicationContext()).registerActivityLifecycleCallbacks(this.PjT);
                this.Zh = true;
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", throwable0);
    }

    public boolean cr() {
        return this.PjT.PjT();
    }
}

