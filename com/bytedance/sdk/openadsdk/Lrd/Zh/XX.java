package com.bytedance.sdk.openadsdk.Lrd.Zh;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.Au;
import com.bytedance.sdk.component.utils.RD;

public class XX {
    static class PjT extends Handler {
        public PjT(Looper looper0) {
            super(looper0);
        }

        public void PjT(Zh zh0) {
            if(zh0 == null) {
                return;
            }
            int v = (int)zh0.qj();
            if(!this.hasMessages(v)) {
                Message message0 = Message.obtain();
                message0.what = v;
                message0.obj = zh0;
                this.sendMessageDelayed(message0, ((long)zh0.cz()));
            }
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            Zh zh0 = (Zh)message0.obj;
            if(zh0 == null) {
                return;
            }
            int v = zh0.Zh();
            boolean z = false;
            if(v == 1) {
                z = true;
                zh0.XX();
            }
            else if(v == 2) {
                z = true;
                zh0.Au();
            }
            if(z) {
                if(zh0.SM()) {
                    JQp.Zh(zh0.qj());
                    return;
                }
                if(zh0.xf()) {
                    this.PjT(zh0);
                }
                return;
            }
            JQp.Zh(zh0.qj());
        }
    }

    private static PjT PjT;
    private static HandlerThread Zh;

    public static void PjT() {
    }

    public static void PjT(Zh zh0) {
        if(zh0 == null) {
            return;
        }
        XX.Zh();
        PjT xX$PjT0 = XX.PjT;
        if(xX$PjT0 != null) {
            xX$PjT0.PjT(zh0);
        }
    }

    public static void Zh() {
        Class class0;
        if(XX.PjT != null) {
            return;
        }
        try {
            if(XX.Zh != null && XX.Zh.isAlive()) {
                return;
            }
            class0 = XX.class;
            __monitor_enter(class0);
        }
        catch(Throwable throwable0) {
            RD.Zh("MRC", throwable0.getMessage());
            return;
        }
        try {
            if(XX.Zh == null || !XX.Zh.isAlive()) {
                XX.Zh = Au.PjT("csj_MRC");
                XX.PjT = new PjT(XX.Zh.getLooper());
            }
            __monitor_exit(class0);
            return;
        }
        catch(Throwable throwable1) {
        }
        try {
            __monitor_exit(class0);
            throw throwable1;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("MRC", throwable0.getMessage());
    }

    public static void Zh(Zh zh0) {
        if(zh0 == null) {
            return;
        }
        if(XX.PjT != null) {
            try {
                int v = (int)zh0.qj();
                if(XX.PjT.hasMessages(v)) {
                    XX.PjT.removeMessages(v);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }
}

