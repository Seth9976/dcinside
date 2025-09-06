package com.bytedance.sdk.component.cz.PjT.Zh;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.JQp;
import com.bytedance.sdk.component.cz.PjT.ReZ.Zh;
import com.bytedance.sdk.component.cz.PjT.Zh.PjT.PjT;
import com.bytedance.sdk.component.cz.PjT.Zh.ReZ.ReZ;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

public class cr {
    public static long Au;
    private volatile Handler DWo;
    public static final AtomicLong JQp;
    public static final cr PjT;
    public volatile boolean ReZ;
    private volatile ReZ SM;
    public static final long XX;
    public volatile boolean Zh;
    public static final PjT cr;
    public static final AtomicLong cz;
    private final Comparator qj;
    private final PriorityBlockingQueue xf;

    static {
        cr.PjT = new cr();
        cr.cr = new PjT();
        cr.JQp = new AtomicLong(0L);
        cr.cz = new AtomicLong(0L);
        cr.XX = System.currentTimeMillis();
        cr.Au = 0L;
    }

    private cr() {
        this.Zh = false;
        this.ReZ = false;
        com.bytedance.sdk.component.cz.PjT.Zh.cr.1 cr$10 = new Comparator() {
            final cr PjT;

            public int PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0, com.bytedance.sdk.component.cz.PjT.cr.PjT pjT1) {
                return cr.this.PjT(pjT0, pjT1);
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.PjT(((com.bytedance.sdk.component.cz.PjT.cr.PjT)object0), ((com.bytedance.sdk.component.cz.PjT.cr.PjT)object1));
            }
        };
        this.qj = cr$10;
        this.xf = new PriorityBlockingQueue(8, cr$10);
    }

    public void JQp() {
        Zh.PjT(cr.cr.wN(), 1);
        ReZ reZ0 = this.SM;
        if(Looper.myLooper() == Looper.getMainLooper()) {
            JQp jQp0 = Au.XX().xE();
            if(jQp0 != null) {
                Executor executor0 = jQp0.cr();
                if(executor0 == null) {
                    executor0 = jQp0.JQp();
                }
                if(executor0 != null) {
                    executor0.execute(new com.bytedance.sdk.component.cz.PjT.JQp.JQp("flush") {
                        final cr Zh;

                        @Override
                        public void run() {
                            ReZ reZ0 = reZ0;
                            if(reZ0 != null) {
                                reZ0.ReZ(2);
                            }
                        }
                    });
                }
            }
            return;
        }
        if(reZ0 != null) {
            reZ0.ReZ(2);
        }
    }

    private int PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0, com.bytedance.sdk.component.cz.PjT.cr.PjT pjT1) {
        long v3;
        long v2;
        long v1;
        long v;
        if(pjT0 == null) {
            return pjT1 == null ? 0 : -1;
        }
        if(pjT1 == null) {
            return 1;
        }
        if(pjT0.JQp() == pjT1.JQp()) {
            if(pjT0.PjT() == null) {
                v = 0L;
                v1 = 0L;
            }
            else {
                v = pjT0.PjT().PjT();
                v1 = pjT0.PjT().Zh();
            }
            if(pjT1.PjT() == null) {
                v3 = 0L;
                v2 = 0L;
            }
            else {
                v2 = pjT1.PjT().PjT();
                v3 = pjT1.PjT().Zh();
            }
            if(v != 0L && v2 != 0L) {
                long v4 = v - v2;
                if(Math.abs(v4) > 0x7FFFFFFFL) {
                    return 0;
                }
                if(v4 == 0L) {
                    return v1 == 0L || v3 == 0L ? 0 : ((int)(v1 - v3));
                }
                return (int)v4;
            }
            return 0;
        }
        return pjT0.JQp() - pjT1.JQp();
    }

    private void PjT(JQp jQp0, long v) {
        ReZ reZ0 = this.SM;
        if(jQp0 != null && reZ0 != null) {
            reZ0.PjT(jQp0.PjT(cr.cr.Zh(v)), true);
            cr.cr.VY();
        }
    }

    private void PjT(JQp jQp0, com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        if(jQp0 != null) {
            try {
                if(jQp0.XX()) {
                    long v = pjT0 == null || pjT0.PjT() == null ? 0L : pjT0.PjT().Zh();
                    if(v == 1L) {
                        cr.Au = System.currentTimeMillis();
                    }
                    AtomicLong atomicLong0 = cr.cr.kFP();
                    Zh.PjT(atomicLong0, 1);
                    if(atomicLong0.get() == 200L) {
                        if(Looper.getMainLooper() == Looper.myLooper()) {
                            Executor executor0 = jQp0.cr();
                            if(executor0 == null) {
                                executor0 = jQp0.JQp();
                            }
                            if(executor0 != null) {
                                executor0.execute(new com.bytedance.sdk.component.cz.PjT.JQp.JQp("report") {
                                    final cr ReZ;

                                    @Override
                                    public void run() {
                                        cr.this.PjT(jQp0, v);
                                    }
                                });
                            }
                            return;
                        }
                        this.PjT(jQp0, v);
                    }
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public PriorityBlockingQueue PjT() {
        return this.xf;
    }

    public void PjT(Handler handler0) {
        this.DWo = handler0;
    }

    public void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0, int v) {
        this.cr();
        JQp jQp0 = Au.XX().xE();
        ReZ reZ0 = this.SM;
        if(reZ0 != null) {
            this.PjT(jQp0, pjT0);
            reZ0.PjT(pjT0, pjT0.JQp() == 4);
        }
    }

    public void ReZ() {
        if(this.SM != null && this.SM.isAlive()) {
            __monitor_enter(this);
            try {
                if(this.SM != null && this.SM.isAlive()) {
                    if(this.DWo != null) {
                        this.DWo.removeCallbacksAndMessages(null);
                    }
                    this.SM.PjT(false);
                    this.SM.quitSafely();
                    this.SM = null;
                }
                __monitor_exit(this);
                return;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        }
    }

    public void Zh() {
        this.cr();
        this.JQp();
    }

    public boolean cr() {
        try {
            if(this.SM == null && !com.bytedance.sdk.component.cz.PjT.Zh.Zh()) {
                synchronized(this) {
                    if(this.SM == null) {
                        this.SM = new ReZ(this.xf);
                        this.SM.start();
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }
}

