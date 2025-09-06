package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;
import com.bytedance.sdk.component.Au.SM;

public class Au {
    private static HandlerThread PjT;

    public static HandlerThread PjT(String s) {
        return Au.PjT(s, 0);
    }

    public static HandlerThread PjT(String s, int v) {
        if(SM.sCrashHappened) {
            return Au.PjT;
        }
        try {
            HandlerThread handlerThread0 = new HandlerThread(s, v) {
                boolean PjT;

                {
                    String s = s;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    int v = v;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.PjT = false;
                }

                @Override
                public void start() {
                    synchronized(this) {
                        if(this.PjT) {
                            return;
                        }
                        this.PjT = true;
                        super.start();
                    }
                }
            };
            handlerThread0.start();
            return handlerThread0;
        }
        catch(Throwable throwable0) {
            RD.PjT("HandlerThreadUtils", "new handlerThread error", throwable0);
            return Au.PjT;
        }
    }

    public static void PjT(HandlerThread handlerThread0) {
        Au.PjT = handlerThread0;
    }
}

