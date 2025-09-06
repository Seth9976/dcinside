package com.bytedance.sdk.openadsdk.Zh;

import com.bytedance.sdk.component.utils.XX;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class PjT {
    class com.bytedance.sdk.openadsdk.Zh.PjT.PjT implements Callable {
        final PjT PjT;
        private final File Zh;

        private com.bytedance.sdk.openadsdk.Zh.PjT.PjT(File file0) {
            this.Zh = file0;
        }

        com.bytedance.sdk.openadsdk.Zh.PjT.PjT(File file0, com.bytedance.sdk.openadsdk.Zh.PjT.1 pjT$10) {
            this(file0);
        }

        public Void PjT() throws Exception {
            PjT.this.Zh(this.Zh);
            return null;
        }

        @Override
        public Object call() throws Exception {
            return this.PjT();
        }
    }

    protected boolean PjT;
    private final ExecutorService Zh;

    public PjT() {
        this.PjT = false;
        this.Zh = Executors.newSingleThreadExecutor();
    }

    public void PjT(File file0) throws IOException {
        com.bytedance.sdk.openadsdk.Zh.PjT.PjT pjT$PjT0 = new com.bytedance.sdk.openadsdk.Zh.PjT.PjT(this, file0, null);
        this.Zh.submit(pjT$PjT0);
    }

    protected abstract void PjT(List arg1);

    protected abstract boolean PjT(long arg1, int arg2);

    protected abstract boolean PjT(File arg1, long arg2, int arg3);

    private void Zh(File file0) throws IOException {
        if(this.PjT) {
            List list0 = XX.PjT(file0);
            list0.toString();
            this.PjT(list0);
            return;
        }
        try {
            XX.Zh(file0);
        }
        catch(Throwable unused_ex) {
        }
        this.PjT(XX.PjT(file0.getParentFile()));
    }

    long Zh(List list0) {
        long v = 0L;
        for(Object object0: list0) {
            v += ((File)object0).length();
        }
        return v;
    }

    class com.bytedance.sdk.openadsdk.Zh.PjT.1 {
    }

}

