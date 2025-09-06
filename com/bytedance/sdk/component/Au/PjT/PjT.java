package com.bytedance.sdk.component.Au.PjT;

import android.os.Handler;
import com.bytedance.sdk.component.utils.Au;
import com.bytedance.sdk.component.utils.KM;

public class PjT {
    static class com.bytedance.sdk.component.Au.PjT.PjT.PjT {
        private static final PjT PjT;

        static {
            com.bytedance.sdk.component.Au.PjT.PjT.PjT.PjT = new PjT(null);
        }
    }

    private final cr PjT;
    private Handler Zh;

    private PjT() {
        this.PjT = cr.PjT(2);
    }

    PjT(com.bytedance.sdk.component.Au.PjT.PjT.1 pjT$10) {
    }

    public static PjT PjT() {
        return com.bytedance.sdk.component.Au.PjT.PjT.PjT.PjT;
    }

    // 检测为 Lambda 实现
    private void PjT(Handler handler0, Handler handler1) [...]

    public KM PjT(com.bytedance.sdk.component.utils.KM.PjT kM$PjT0, String s) {
        KM kM0 = (Zh)this.PjT.PjT();
        if(kM0 != null) {
            ((Zh)kM0).PjT(kM$PjT0);
            kM0.post(new Runnable() {
                final PjT Zh;

                @Override
                public void run() {
                    Thread.currentThread().setName(s);
                }
            });
            return kM0;
        }
        return this.Zh(kM$PjT0, s);
    }

    public KM PjT(String s) {
        return this.PjT(null, s);
    }

    public boolean PjT(KM kM0) {
        if(kM0 instanceof Zh) {
            if(!this.PjT.PjT(((Zh)kM0))) {
                ((Zh)kM0).Zh();
            }
            return true;
        }
        return false;
    }

    private Zh Zh(com.bytedance.sdk.component.utils.KM.PjT kM$PjT0, String s) {
        return new Zh(Au.PjT(s), kM$PjT0);
    }

    public Handler Zh() {
        if(this.Zh == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(this.Zh == null) {
                    this.Zh = this.PjT("csj_io_handler");
                }
                __monitor_exit(class0);
                return this.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return this.Zh;
    }
}

