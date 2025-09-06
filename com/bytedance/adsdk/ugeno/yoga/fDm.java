package com.bytedance.adsdk.ugeno.yoga;

public class fDm extends YogaNodeJNIBase {
    @Override
    protected void finalize() throws Throwable {
        try {
            this.xf();
        }
        finally {
            super.finalize();
        }
    }

    public void xf() {
        long v = this.PjT;
        if(v != 0L) {
            this.PjT = 0L;
            YogaNative.jni_YGNodeDeallocateJNI(v);
        }
    }
}

