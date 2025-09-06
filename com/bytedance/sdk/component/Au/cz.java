package com.bytedance.sdk.component.Au;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class cz extends JQp {
    private static volatile ThreadPoolExecutor Au;
    private static volatile ThreadPoolExecutor DWo;
    private static volatile ThreadPoolExecutor JQp;
    public static final int PjT;
    public static int ReZ;
    private static volatile ThreadPoolExecutor SM;
    private static volatile ThreadPoolExecutor XX;
    public static ReZ Zh;
    public static boolean cr;
    private static volatile ThreadPoolExecutor cz;
    private static volatile ScheduledExecutorService qj;

    static {
        cz.PjT = Runtime.getRuntime().availableProcessors();
        cz.ReZ = 120;
        cz.cr = true;
    }

    public static RejectedExecutionHandler Au() {
        return new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable runnable0, ThreadPoolExecutor threadPoolExecutor0) {
            }
        };
    }

    public static ExecutorService DWo() {
        if(cz.SM == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.SM == null) {
                    PjT pjT0 = new com.bytedance.sdk.component.Au.PjT.PjT().PjT("computation").PjT(3).Zh(10).PjT(20L).PjT(TimeUnit.SECONDS).PjT(new PriorityBlockingQueue()).PjT(cz.Au()).PjT(JQp.PjT().createThreadFactory(10, "computation")).PjT();
                    cz.SM = pjT0;
                    pjT0.allowCoreThreadTimeOut(true);
                }
                __monitor_exit(class0);
                return cz.SM;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.SM;
    }

    public static ExecutorService JQp() {
        if(cz.DWo == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.DWo == null) {
                    PjT pjT0 = new com.bytedance.sdk.component.Au.PjT.PjT().PjT("aidl").Zh(10).PjT(2).PjT(30L).PjT(TimeUnit.SECONDS).PjT(new PriorityBlockingQueue()).PjT(cz.Au()).PjT(JQp.PjT().createThreadFactory(10, "aidl")).PjT();
                    cz.DWo = pjT0;
                    pjT0.allowCoreThreadTimeOut(true);
                }
                __monitor_exit(class0);
                return cz.DWo;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.DWo;
    }

    public static void JQp(Au au0) {
        if(cz.XX == null) {
            cz.Zh(5);
        }
        if(au0 != null && cz.XX != null) {
            cz.XX.execute(au0);
        }
    }

    public static ExecutorService PjT(int v) {
        if(cz.cz == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.cz == null) {
                    PjT pjT0 = new com.bytedance.sdk.component.Au.PjT.PjT().PjT("io").PjT(2).Zh(v).PjT(20L).PjT(TimeUnit.SECONDS).PjT(new LinkedBlockingQueue()).PjT(cz.Au()).PjT(JQp.PjT().createThreadFactory(v, "io")).PjT();
                    cz.cz = pjT0;
                    pjT0.allowCoreThreadTimeOut(true);
                }
                __monitor_exit(class0);
                return cz.cz;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.cz;
    }

    public static void PjT(Au au0) {
        if(cz.JQp == null) {
            cz.Zh();
        }
        if(au0 != null && cz.JQp != null) {
            cz.JQp.execute(au0);
        }
    }

    public static void PjT(Au au0, int v) {
        cz.Zh(au0);
    }

    public static void PjT(Au au0, int v, int v1) {
        if(cz.cz == null) {
            cz.PjT(v1);
        }
        if(au0 != null && cz.cz != null) {
            au0.setPriority(v);
            cz.cz.execute(au0);
        }
    }

    public static void PjT(ReZ reZ0) {
        cz.Zh = reZ0;
    }

    public static void PjT(boolean z) {
        cz.cr = z;
    }

    public static ExecutorService ReZ() {
        return cz.PjT(10);
    }

    public static void ReZ(int v) {
        cz.ReZ = v;
    }

    public static void ReZ(Au au0) {
        if(cz.Au == null) {
            cz.cr();
        }
        if(au0 != null && cz.Au != null) {
            cz.Au.execute(au0);
        }
    }

    public static void ReZ(Au au0, int v) {
        if(au0 != null) {
            au0.setPriority(v);
        }
        cz.cr(au0);
    }

    public static ReZ SM() {
        return cz.Zh;
    }

    public static boolean XX() [...] // 潜在的解密器

    public static ExecutorService Zh() {
        if(cz.JQp == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.JQp == null) {
                    cz.JQp = new com.bytedance.sdk.component.Au.PjT.PjT().PjT("init").PjT(0).Zh(10).PjT(5L).PjT(TimeUnit.SECONDS).PjT(new SynchronousQueue()).PjT(cz.Au()).PjT(JQp.PjT().createThreadFactory(10, "init")).PjT();
                }
                __monitor_exit(class0);
                return cz.JQp;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.JQp;
    }

    public static ExecutorService Zh(int v) {
        if(cz.XX == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.XX == null) {
                    PjT pjT0 = new com.bytedance.sdk.component.Au.PjT.PjT().PjT("ad").PjT(2).Zh(v).PjT(20L).PjT(TimeUnit.SECONDS).PjT(new LinkedBlockingQueue()).PjT(cz.Au()).PjT(JQp.PjT().createThreadFactory(v, "ad")).PjT();
                    cz.XX = pjT0;
                    pjT0.allowCoreThreadTimeOut(true);
                }
                __monitor_exit(class0);
                return cz.XX;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.XX;
    }

    public static void Zh(Au au0) {
        if(cz.cz == null) {
            cz.ReZ();
        }
        if(cz.cz != null) {
            cz.cz.execute(au0);
        }
    }

    public static void Zh(Au au0, int v) {
        if(au0 != null) {
            au0.setPriority(v);
        }
        cz.ReZ(au0);
    }

    public static ExecutorService cr() {
        if(cz.Au == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.Au == null) {
                    PjT pjT0 = new com.bytedance.sdk.component.Au.PjT.PjT().PjT("log").Zh(10).PjT(4).PjT(20L).PjT(TimeUnit.SECONDS).PjT(new PriorityBlockingQueue()).PjT(cz.Au()).PjT(JQp.PjT().createThreadFactory(10, "log")).PjT();
                    cz.Au = pjT0;
                    pjT0.allowCoreThreadTimeOut(true);
                }
                __monitor_exit(class0);
                return cz.Au;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.Au;
    }

    public static void cr(Au au0) {
        if(cz.DWo == null) {
            cz.JQp();
        }
        if(au0 != null && cz.DWo != null) {
            cz.DWo.execute(au0);
        }
    }

    public static ScheduledExecutorService cz() {
        if(cz.qj == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.qj == null) {
                    cz.qj = Executors.newSingleThreadScheduledExecutor(JQp.PjT().createThreadFactory(5, "scheduled"));
                }
                __monitor_exit(class0);
                return cz.qj;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.qj;
    }
}

