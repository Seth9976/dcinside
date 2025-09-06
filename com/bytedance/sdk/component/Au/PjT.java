package com.bytedance.sdk.component.Au;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class PjT extends ThreadPoolExecutor {
    public static class com.bytedance.sdk.component.Au.PjT.PjT {
        private RejectedExecutionHandler Au;
        private int JQp;
        private String PjT;
        private long ReZ;
        private int SM;
        private ThreadFactory XX;
        private int Zh;
        private TimeUnit cr;
        private BlockingQueue cz;

        public com.bytedance.sdk.component.Au.PjT.PjT() {
            this.PjT = "io";
            this.Zh = 1;
            this.ReZ = 30L;
            this.cr = TimeUnit.SECONDS;
            this.JQp = 0x7FFFFFFF;
            this.cz = null;
            this.XX = null;
            this.SM = 5;
        }

        public com.bytedance.sdk.component.Au.PjT.PjT PjT(int v) {
            this.Zh = v;
            return this;
        }

        public com.bytedance.sdk.component.Au.PjT.PjT PjT(long v) {
            this.ReZ = v;
            return this;
        }

        public com.bytedance.sdk.component.Au.PjT.PjT PjT(String s) {
            this.PjT = s;
            return this;
        }

        public com.bytedance.sdk.component.Au.PjT.PjT PjT(BlockingQueue blockingQueue0) {
            this.cz = blockingQueue0;
            return this;
        }

        public com.bytedance.sdk.component.Au.PjT.PjT PjT(RejectedExecutionHandler rejectedExecutionHandler0) {
            this.Au = rejectedExecutionHandler0;
            return this;
        }

        public com.bytedance.sdk.component.Au.PjT.PjT PjT(ThreadFactory threadFactory0) {
            this.XX = threadFactory0;
            return this;
        }

        public com.bytedance.sdk.component.Au.PjT.PjT PjT(TimeUnit timeUnit0) {
            this.cr = timeUnit0;
            return this;
        }

        public PjT PjT() {
            if(this.XX == null) {
                this.XX = JQp.PjT().createThreadFactory(this.SM, this.PjT);
            }
            if(this.Au == null) {
                this.Au = cz.Au();
            }
            if(this.cz == null) {
                this.cz = new LinkedBlockingQueue();
            }
            return new PjT(this.PjT, this.Zh, this.JQp, this.ReZ, this.cr, this.cz, this.XX, this.Au);
        }

        public com.bytedance.sdk.component.Au.PjT.PjT Zh(int v) {
            this.SM = v;
            return this;
        }
    }

    private String PjT;

    public PjT(String s, int v, int v1, long v2, TimeUnit timeUnit0, BlockingQueue blockingQueue0, ThreadFactory threadFactory0, RejectedExecutionHandler rejectedExecutionHandler0) {
        super(v, v1, v2, timeUnit0, blockingQueue0, threadFactory0, rejectedExecutionHandler0);
        this.PjT = s;
    }

    private void PjT(Runnable runnable0) {
        try {
            super.execute(runnable0);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            this.PjT(runnable0, outOfMemoryError0);
        }
        catch(Throwable throwable0) {
            this.PjT(runnable0, throwable0);
        }
    }

    private void PjT(Runnable runnable0, OutOfMemoryError outOfMemoryError0) {
        this.PjT(runnable0, outOfMemoryError0);
    }

    private void PjT(Runnable runnable0, Throwable throwable0) {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable0.run();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private void PjT(BlockingQueue blockingQueue0, int v) {
        if(this.getCorePoolSize() != v && blockingQueue0 != null && blockingQueue0.size() <= 0) {
            try {
                this.setCorePoolSize(v);
                this.getCorePoolSize();
                this.getMaximumPoolSize();
            }
            catch(Exception exception0) {
                exception0.getMessage();
            }
        }
    }

    private void PjT(BlockingQueue blockingQueue0, int v, int v1) {
        if(this.getCorePoolSize() != v && blockingQueue0 != null && blockingQueue0.size() >= v1) {
            try {
                this.setCorePoolSize(v);
                this.getCorePoolSize();
                this.getMaximumPoolSize();
            }
            catch(Exception exception0) {
                exception0.getMessage();
            }
        }
    }

    public String PjT() {
        return this.PjT;
    }

    @Override
    protected void afterExecute(Runnable runnable0, Throwable throwable0) {
        super.afterExecute(runnable0, throwable0);
        if(!TextUtils.isEmpty(this.PjT)) {
            BlockingQueue blockingQueue0 = this.getQueue();
            if(blockingQueue0 != null) {
                String s = this.PjT;
                s.hashCode();
                switch(s) {
                    case "aidl": {
                        this.PjT(blockingQueue0, 2);
                        return;
                    }
                    case "io": {
                        this.PjT(blockingQueue0, 2);
                        break;
                    }
                    case "log": {
                        this.PjT(blockingQueue0, 4);
                    }
                }
            }
        }
    }

    @Override
    public void execute(Runnable runnable0) {
        if(runnable0 instanceof Au) {
            this.PjT(new Zh(((Au)runnable0), this));
        }
        else {
            this.PjT(new Zh(new Au("unknown") {
                final PjT Zh;

                @Override
                public void run() {
                    runnable0.run();
                }
            }, this));
        }
        if(!TextUtils.isEmpty(this.PjT)) {
            BlockingQueue blockingQueue0 = this.getQueue();
            if(blockingQueue0 != null) {
                String s = this.PjT;
                s.hashCode();
                switch(s) {
                    case "aidl": {
                        this.PjT(blockingQueue0, 5, 5);
                        return;
                    }
                    case "io": {
                        int v = this.getCorePoolSize();
                        this.PjT(blockingQueue0, cz.PjT + 2, v * 2);
                        break;
                    }
                    case "log": {
                        this.PjT(blockingQueue0, 8, 8);
                    }
                }
            }
        }
    }

    @Override
    public void shutdown() {
        if(!"io".equals(this.PjT) && !"aidl".equals(this.PjT)) {
            super.shutdown();
        }
    }

    // 去混淆评级： 低(20)
    @Override
    public List shutdownNow() {
        return "io".equals(this.PjT) || "aidl".equals(this.PjT) ? Collections.emptyList() : super.shutdownNow();
    }
}

