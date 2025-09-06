package com.bytedance.sdk.component.Au.ReZ;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class cz extends ThreadPoolExecutor {
    public static class PjT {
        private int Au;
        private boolean DWo;
        private long JQp;
        private String PjT;
        private int ReZ;
        private int SM;
        private TimeUnit XX;
        private int Zh;
        private int cr;
        private boolean cz;
        private BlockingQueue qj;
        private ThreadFactory xf;

        public PjT() {
            this.PjT = "cache";
            this.Zh = 4;
            this.ReZ = 100;
            this.cr = 0;
            this.JQp = 30000L;
            this.cz = false;
            this.XX = TimeUnit.MILLISECONDS;
            this.Au = -1;
            this.SM = 20;
            this.DWo = false;
            this.qj = new PriorityBlockingQueue();
            this.xf = null;
        }

        public PjT JQp(int v) {
            this.Au = v;
            return this;
        }

        public PjT PjT(int v) {
            this.Zh = v;
            return this;
        }

        public PjT PjT(long v) {
            this.JQp = v;
            return this;
        }

        public PjT PjT(String s) {
            this.PjT = s;
            return this;
        }

        public PjT PjT(boolean z) {
            this.cz = z;
            return this;
        }

        public cz PjT() {
            if(this.xf == null) {
                this.xf = new cr(this.PjT);
            }
            if(this.Zh < 0) {
                this.Zh = 8;
            }
            if(this.Zh == 0) {
                this.qj = new SynchronousQueue();
            }
            if(this.qj == null) {
                this.qj = new LinkedBlockingQueue();
            }
            if(this.ReZ > 100) {
                this.ReZ = 100;
            }
            int v = this.Zh;
            if(this.ReZ < v) {
                this.ReZ = v;
            }
            if(this.SM < 0) {
                this.SM = 20;
            }
            if(this.SM > 100) {
                this.SM = 100;
            }
            return new cz(this, null);
        }

        public PjT ReZ(int v) {
            this.cr = v;
            return this;
        }

        public PjT Zh(int v) {
            this.ReZ = v;
            return this;
        }

        public PjT Zh(boolean z) {
            this.DWo = z;
            return this;
        }

        public PjT cr(int v) {
            this.SM = v;
            return this;
        }
    }

    private LinkedHashMap Au;
    private int JQp;
    private final String PjT;
    private int ReZ;
    private boolean XX;
    private int Zh;
    private int cr;
    private int cz;

    private cz(PjT cz$PjT0) {
        super(cz$PjT0.Zh, 0x7FFFFFFF, cz$PjT0.JQp, cz$PjT0.XX, cz$PjT0.qj, cz$PjT0.xf);
        this.XX = false;
        this.PjT = cz$PjT0.PjT;
        this.cr = cz$PjT0.Zh;
        this.JQp = cz$PjT0.ReZ;
        this.cz = cz$PjT0.cr;
        this.allowCoreThreadTimeOut(cz$PjT0.cz);
        this.Zh = cz$PjT0.Au;
        this.ReZ = cz$PjT0.SM;
        this.XX = cz$PjT0.DWo;
        if(this.XX()) {
            this.Au = new LinkedHashMap(this.ReZ + 4, 0.75f, true) {
                final cz Zh;

                @Override
                protected boolean removeEldestEntry(Map.Entry map$Entry0) {
                    return this.size() > this.ReZ + 4;
                }
            };
        }
    }

    cz(PjT cz$PjT0, com.bytedance.sdk.component.Au.ReZ.cz.1 cz$10) {
        this(cz$PjT0);
    }

    private void JQp() {
        try {
            if(this.cr == 0) {
                return;
            }
            if(this.getCorePoolSize() > this.cr && this.getQueue().size() == 0) {
                this.setCorePoolSize(this.cr);
            }
        }
        catch(Exception exception0) {
            exception0.getMessage();
        }
    }

    private void PjT(Zh zh0) {
        LinkedHashMap linkedHashMap0 = this.Au;
        if(linkedHashMap0 != null) {
            com.bytedance.sdk.component.Au.ReZ.PjT.PjT pjT0 = (com.bytedance.sdk.component.Au.ReZ.PjT.PjT)linkedHashMap0.get(zh0.Zh());
            if(pjT0 == null) {
                __monitor_enter(linkedHashMap0);
                try {
                    pjT0 = (com.bytedance.sdk.component.Au.ReZ.PjT.PjT)linkedHashMap0.get(zh0.Zh());
                    if(pjT0 == null) {
                        pjT0 = new com.bytedance.sdk.component.Au.ReZ.PjT.PjT();
                        linkedHashMap0.put(zh0.Zh(), pjT0);
                    }
                    __monitor_exit(linkedHashMap0);
                    goto label_14;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(linkedHashMap0);
                throw throwable0;
            }
        label_14:
            pjT0.PjT(zh0);
        }
    }

    private void PjT(Runnable runnable0, Throwable throwable0) {
        try {
            if(Looper.myLooper() == Looper.getMainLooper()) {
                Handler handler0 = ReZ.ReZ();
                if(handler0 != null) {
                    handler0.post(runnable0);
                }
                return;
            }
            runnable0.run();
        }
        catch(Throwable unused_ex) {
        }
    }

    public LinkedHashMap PjT() {
        return this.Au;
    }

    public void PjT(PjT cz$PjT0) {
        try {
            if(cz$PjT0.Zh >= 0 && this.cr != cz$PjT0.Zh) {
                int v = cz$PjT0.Zh;
                this.cr = v;
                this.setCorePoolSize(v);
            }
            this.JQp = cz$PjT0.ReZ;
            this.cz = cz$PjT0.cr;
            this.allowCoreThreadTimeOut(cz$PjT0.cz);
            this.Zh = cz$PjT0.Au;
            this.ReZ = cz$PjT0.SM;
            this.XX = cz$PjT0.DWo;
        }
        catch(Throwable unused_ex) {
        }
    }

    public boolean ReZ() {
        return this.XX;
    }

    private boolean XX() {
        return this.Zh > 0;
    }

    public String Zh() {
        return this.PjT;
    }

    @Override
    protected void afterExecute(Runnable runnable0, Throwable throwable0) {
        if(runnable0 instanceof Zh) {
            ((Zh)runnable0).ReZ(SystemClock.elapsedRealtime());
            try {
                if(this.XX() && this.Au != null) {
                    this.PjT(((Zh)runnable0));
                    this.cz();
                }
            }
            catch(Exception exception0) {
                exception0.getMessage();
            }
        }
        super.afterExecute(runnable0, throwable0);
        this.JQp();
    }

    @Override
    protected void beforeExecute(Thread thread0, Runnable runnable0) {
        if(runnable0 instanceof Zh) {
            ((Zh)runnable0).Zh(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread0, runnable0);
    }

    private void cr() {
        try {
            if(this.cr == 0) {
                return;
            }
            if(this.getCorePoolSize() < this.JQp) {
                int v = this.getQueue().size();
                if(this.getActiveCount() >= this.cr && v >= this.cz) {
                    this.setCorePoolSize(this.JQp);
                }
            }
        }
        catch(Exception exception0) {
            exception0.getMessage();
        }
    }

    private void cz() {
        if(this.getCompletedTaskCount() > ((long)this.Zh)) {
            JQp jQp0 = ReZ.PjT();
            if(jQp0 != null) {
                jQp0.PjT(this);
            }
            this.Zh = -1;
        }
    }

    @Override
    public void execute(Runnable runnable0) {
        if(!(runnable0 instanceof Zh)) {
            runnable0 = new Zh("unknown", runnable0) {
                final cz PjT;

                @Override
                public void run() {
                    Runnable runnable0 = this.Au();
                    if(runnable0 != null) {
                        runnable0.run();
                    }
                }
            };
        }
        if(!"cache".equals(this.PjT) && (!TextUtils.isEmpty("jeb-dexdec-sb-st-3722") && "jeb-dexdec-sb-st-3722".startsWith("pag_" + this.PjT))) {
            com.bytedance.sdk.component.Au.ReZ.PjT pjT0 = ReZ.Zh();
            if(pjT0 != null) {
                pjT0.PjT(this, ((Zh)runnable0));
            }
        }
        ((Zh)runnable0).PjT(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable0);
        }
        catch(Throwable throwable0) {
            this.PjT(runnable0, throwable0);
            return;
        }
        this.cr();
    }

    @Override
    public void shutdown() {
        if("aidl".equals(this.PjT)) {
            return;
        }
        super.shutdown();
    }

    // 去混淆评级： 低(20)
    @Override
    public List shutdownNow() {
        return "aidl".equals(this.PjT) ? Collections.emptyList() : super.shutdownNow();
    }

    @Override
    public Future submit(Runnable runnable0) {
        String s;
        int v;
        runnable0.getClass();
        Future future0 = this.newTaskFor(runnable0, null);
        if(runnable0 instanceof Zh) {
            v = ((Zh)runnable0).PjT();
            s = ((Zh)runnable0).Zh();
        }
        else {
            s = "";
            v = 6;
        }
        if(v != 0) {
            boolean z = !TextUtils.isEmpty(s);
        }
        this.execute(new Zh(v, s) {
            final cz Zh;

            @Override
            public void run() {
                ((RunnableFuture)future0).run();
            }
        });
        return future0;
    }
}

