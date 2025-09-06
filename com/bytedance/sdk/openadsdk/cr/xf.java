package com.bytedance.sdk.openadsdk.cr;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qla;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class xf {
    static class PjT implements Serializable, Runnable {
        public Map JQp;
        public final AtomicInteger PjT;
        public Owx ReZ;
        public final AtomicBoolean Zh;
        public String cr;
        private final long cz;

        public PjT(Owx owx0, String s, Map map0) {
            this.PjT = new AtomicInteger(0);
            this.Zh = new AtomicBoolean(false);
            this.cz = SystemClock.elapsedRealtime();
            this.ReZ = owx0;
            this.cr = s;
            this.JQp = map0;
        }

        public static PjT PjT(Owx owx0, String s, Map map0) {
            return new PjT(owx0, s, map0);
        }

        public int PjT() {
            return this.PjT.get();
        }

        public PjT PjT(boolean z) {
            this.Zh.set(z);
            return this;
        }

        public void Zh() {
            this.PjT.incrementAndGet();
        }

        @Override
        public void run() {
            if(this.ReZ != null && !TextUtils.isEmpty(this.cr)) {
                String s = this.Zh.get() ? "dpl_success" : "dpl_failed";
                if(this.JQp == null) {
                    this.JQp = new HashMap();
                }
                if(this.ReZ != null && this.ReZ.cyr() == 0) {
                    this.JQp.put("auto_click", Boolean.valueOf(this.ReZ != null && !this.ReZ.Au()));
                }
                this.JQp.put("lifeCycleInit", Boolean.valueOf(qla.PjT().ReZ()));
                this.JQp.put("duration", ((long)(SystemClock.elapsedRealtime() - this.cz)));
                ReZ.PjT(this.ReZ, this.cr, s, this.JQp);
            }
        }
    }

    static class Zh {
        public int PjT;
        public int Zh;

        private Zh() {
            this.PjT = 300;
            this.Zh = 6000;
        }

        public static Zh PjT() {
            return new Zh();
        }
    }

    private Zh JQp;
    private static volatile xf PjT;
    private final Handler ReZ;
    private HandlerThread Zh;
    private final Executor cr;
    private Map cz;

    private xf() {
        this.cr = Executors.newCachedThreadPool();
        this.JQp = Zh.PjT();
        if(this.Zh == null) {
            this.Zh = Au.PjT("OpenAppSuccEvent_HandlerThread", 10);
        }
        this.ReZ = new Handler(this.Zh.getLooper(), new Handler.Callback() {
            final xf PjT;

            @Override  // android.os.Handler$Callback
            public boolean handleMessage(Message message0) {
                if(message0.what == 100) {
                    PjT xf$PjT0 = message0.obj == null || !(message0.obj instanceof PjT) ? null : ((PjT)message0.obj);
                    if(xf$PjT0 != null) {
                        xf.this.Zh(xf$PjT0);
                    }
                }
                return true;
            }
        });
    }

    public static xf PjT() {
        if(xf.PjT == null) {
            Class class0 = xf.class;
            __monitor_enter(class0);
            try {
                if(xf.PjT == null) {
                    xf.PjT = new xf();
                }
                __monitor_exit(class0);
                return xf.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return xf.PjT;
    }

    private void PjT(PjT xf$PjT0) {
        if(xf$PjT0 == null) {
            return;
        }
        xf$PjT0.Zh();
        if(xf$PjT0.PjT() * this.JQp.PjT > this.JQp.Zh) {
            this.ReZ(xf$PjT0.PjT(false));
            return;
        }
        Message message0 = this.ReZ.obtainMessage();
        message0.what = 100;
        message0.obj = xf$PjT0;
        this.ReZ.sendMessageDelayed(message0, ((long)this.JQp.PjT));
    }

    public xf PjT(Map map0) {
        this.cz = map0;
        return xf.PjT();
    }

    public void PjT(Owx owx0, String s) {
        Message message0 = this.ReZ.obtainMessage();
        message0.what = 100;
        message0.obj = PjT.PjT(owx0, s, this.cz);
        message0.sendToTarget();
    }

    private void ReZ(PjT xf$PjT0) {
        if(xf$PjT0 == null) {
            return;
        }
        this.cr.execute(xf$PjT0);
    }

    private void Zh(PjT xf$PjT0) {
        if(xf$PjT0 == null) {
            return;
        }
        boolean z = qla.PjT().cr();
        boolean z1 = qla.PjT().PjT(true);
        if(!z && z1) {
            this.PjT(xf$PjT0);
            return;
        }
        if(xf$PjT0.JQp == null) {
            xf$PjT0.JQp = new HashMap();
        }
        xf$PjT0.JQp.put("is_background", Boolean.valueOf(z));
        xf$PjT0.JQp.put("has_focus", Boolean.valueOf(z1));
        this.ReZ(xf$PjT0.PjT(true));
    }
}

