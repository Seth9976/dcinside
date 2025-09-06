package com.bytedance.sdk.openadsdk.qla.ReZ;

class cr implements Zh {
    private static volatile cr PjT;

    public static cr PjT() {
        if(cr.PjT == null) {
            Class class0 = cr.class;
            __monitor_enter(class0);
            try {
                if(cr.PjT == null) {
                    cr.PjT = new cr();
                }
                __monitor_exit(class0);
                return cr.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cr.PjT;
    }

    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.Zh
    public void PjT(com.bytedance.sdk.openadsdk.qla.Zh zh0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.Zh
    public void PjT(com.bytedance.sdk.openadsdk.qla.Zh zh0, boolean z) {
    }
}

