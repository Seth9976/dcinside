package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import java.util.LinkedList;

public class Zh {
    static class PjT extends Handler {
        PjT(Looper looper0) {
            super(looper0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            if(message0.what == 1) {
                try {
                    Zh.ReZ();
                }
                catch(OutOfMemoryError unused_ex) {
                }
            }
        }
    }

    private static final Object PjT;
    @GuardedBy("sLock")
    private static final LinkedList ReZ;
    @GuardedBy("sLock")
    private static volatile Handler Zh;
    private static Object cr;

    static {
        Zh.PjT = new Object();
        Zh.ReZ = new LinkedList();
        Zh.cr = new Object();
    }

    public static void PjT(Runnable runnable0, boolean z) {
        Object object0;
        Handler handler0;
        try {
            handler0 = Zh.Zh();
            object0 = Zh.PjT;
            __monitor_enter(object0);
        }
        catch(OutOfMemoryError unused_ex) {
            return;
        }
        try {
            Zh.ReZ.add(runnable0);
            if(z) {
                handler0.sendEmptyMessageDelayed(1, 100L);
            }
            else {
                handler0.sendEmptyMessage(1);
            }
            __monitor_exit(object0);
            return;
        }
        catch(Throwable throwable0) {
        }
        try {
            __monitor_exit(object0);
            throw throwable0;
        }
        catch(OutOfMemoryError unused_ex) {
        }
    }

    private static void ReZ() {
        Object object0 = Zh.cr;
        __monitor_enter(object0);
        try {
            synchronized(Zh.PjT) {
                LinkedList linkedList0 = (LinkedList)Zh.ReZ.clone();
                Zh.ReZ.clear();
                Zh.Zh().removeMessages(1);
            }
            if(linkedList0.size() > 0) {
                for(Object object1: linkedList0) {
                    ((Runnable)object1).run();
                }
            }
            __monitor_exit(object0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    private static Handler Zh() {
        if(Zh.Zh == null) {
            Object object0 = Zh.PjT;
            __monitor_enter(object0);
            try {
                if(Zh.Zh == null) {
                    HandlerThread handlerThread0 = com.bytedance.sdk.component.PjT.PjT == null ? null : com.bytedance.sdk.component.PjT.PjT.getSafeHandlerThread("queued-work-looper", -2);
                    if(handlerThread0 == null) {
                        handlerThread0 = new HandlerThread("queued-work-looper", -2);
                        handlerThread0.start();
                    }
                    Zh.Zh = new PjT(handlerThread0.getLooper());
                }
                __monitor_exit(object0);
                return Zh.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(object0);
            throw throwable0;
        }
        return Zh.Zh;
    }
}

