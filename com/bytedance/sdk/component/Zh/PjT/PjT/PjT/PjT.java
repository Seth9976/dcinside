package com.bytedance.sdk.component.Zh.PjT.PjT.PjT;

import com.bytedance.sdk.component.Zh.PjT.cr;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

public class PjT extends cr {
    public static volatile SM PjT;
    private List ReZ;
    private List Zh;
    private ExecutorService cr;

    public PjT(ExecutorService executorService0) {
        this.Zh = new CopyOnWriteArrayList();
        this.ReZ = new CopyOnWriteArrayList();
        this.cr = executorService0;
    }

    public boolean JQp() {
        return PjT.PjT != null && PjT.PjT.PjT() != null;
    }

    public static void PjT(SM sM0) {
        PjT.PjT = sM0;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public int PjT() {
        return 0;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public void PjT(int v) {
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public List ReZ() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public ExecutorService Zh() {
        ExecutorService executorService0 = PjT.PjT == null ? null : PjT.PjT.PjT();
        return executorService0 == null ? this.cr : executorService0;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public List cr() {
        return this.ReZ;
    }
}

