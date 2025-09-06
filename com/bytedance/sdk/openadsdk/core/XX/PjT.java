package com.bytedance.sdk.openadsdk.core.XX;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.settings.cz;
import com.bytedance.sdk.openadsdk.core.ub;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class PjT {
    static class com.bytedance.sdk.openadsdk.core.XX.PjT.PjT {
        private final long PjT;
        private final String Zh;

        private com.bytedance.sdk.openadsdk.core.XX.PjT.PjT(long v, String s) {
            this.PjT = v;
            this.Zh = s;
        }

        com.bytedance.sdk.openadsdk.core.XX.PjT.PjT(long v, String s, com.bytedance.sdk.openadsdk.core.XX.PjT.1 pjT$10) {
            this(v, s);
        }
    }

    private Handler JQp;
    private static volatile PjT PjT;
    private static volatile long ReZ;
    private static volatile boolean Zh;
    private final Queue cr;
    private final cz cz;

    private PjT() {
        this.cr = new LinkedList();
        this.cz = ub.cr();
    }

    public static PjT PjT() {
        if(PjT.PjT == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(PjT.PjT == null) {
                    PjT.PjT = new PjT();
                }
                __monitor_exit(class0);
                return PjT.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PjT.PjT;
    }

    private void PjT(long v) {
        synchronized(this) {
            if(this.JQp == null) {
                this.JQp = new Handler(Looper.getMainLooper());
            }
            this.JQp.postDelayed(() -> synchronized(PjT.this) {
                PjT.Zh = false;
            }, v);
        }

        class com.bytedance.sdk.openadsdk.core.XX.PjT.1 implements Runnable {
            final PjT PjT;

            @Override
            public void run() {
                PjT.this.PjT(false);
            }
        }

    }

    // 检测为 Lambda 实现
    private void PjT(boolean z) [...]

    public boolean PjT(String s) {
        synchronized(this) {
            if(this.Zh(s)) {
                this.PjT(true);
                this.PjT(PjT.ReZ);
            }
            else {
                this.PjT(false);
            }
            return PjT.Zh;
        }
    }

    public String ReZ() {
        synchronized(this) {
            HashMap hashMap0 = new HashMap();
            for(Object object0: this.cr) {
                com.bytedance.sdk.openadsdk.core.XX.PjT.PjT pjT$PjT0 = (com.bytedance.sdk.openadsdk.core.XX.PjT.PjT)object0;
                if(hashMap0.containsKey(pjT$PjT0.Zh)) {
                    hashMap0.put(pjT$PjT0.Zh, ((int)(((int)(((Integer)hashMap0.get(pjT$PjT0.Zh)))) + 1)));
                }
                else {
                    hashMap0.put(pjT$PjT0.Zh, 1);
                }
            }
            String s = "";
            int v1 = 0x80000000;
            for(Object object1: hashMap0.keySet()) {
                String s1 = (String)object1;
                int v2 = (int)(((Integer)hashMap0.get(s1)));
                if(v1 < v2) {
                    s = s1;
                    v1 = v2;
                }
            }
            return s;
        }
    }

    private void Zh(long v) {
        synchronized(this) {
            PjT.ReZ = v;
        }
    }

    private boolean Zh(String s) {
        synchronized(this) {
            long v1 = System.currentTimeMillis();
            int v2 = this.cz.Sks();
            long v3 = this.cz.RD();
            if(this.cr.size() <= 0 || this.cr.size() < v2) {
                com.bytedance.sdk.openadsdk.core.XX.PjT.PjT pjT$PjT1 = new com.bytedance.sdk.openadsdk.core.XX.PjT.PjT(v1, s, null);
                this.cr.offer(pjT$PjT1);
            }
            else {
                long v4 = Math.abs(v1 - ((com.bytedance.sdk.openadsdk.core.XX.PjT.PjT)this.cr.peek()).PjT);
                if(v4 <= v3) {
                    this.Zh(v3 - v4);
                    return true;
                }
                this.cr.poll();
                com.bytedance.sdk.openadsdk.core.XX.PjT.PjT pjT$PjT0 = new com.bytedance.sdk.openadsdk.core.XX.PjT.PjT(v1, s, null);
                this.cr.offer(pjT$PjT0);
            }
            return false;
        }
    }

    public boolean Zh() {
        synchronized(this) {
        }
        return PjT.Zh;
    }
}

