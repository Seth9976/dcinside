package com.bytedance.sdk.component.adexpress.Zh;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class xf implements PjT {
    qla PjT;
    private SM ReZ;
    @NonNull
    private List Zh;
    private AtomicBoolean cr;

    public xf(List list0, SM sM0) {
        this.cr = new AtomicBoolean(false);
        this.Zh = list0;
        this.ReZ = sM0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo$PjT
    public void PjT() {
        this.ReZ.cr();
        for(Object object0: this.Zh) {
            if(((DWo)object0).PjT(this)) {
                break;
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo$PjT
    public void PjT(DWo dWo0) {
        int v = this.Zh.indexOf(dWo0);
        if(v < 0) {
            return;
        }
        do {
            ++v;
        }
        while(v < this.Zh.size() && !((DWo)this.Zh.get(v)).PjT(this));
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo$PjT
    public void PjT(qla qla0) {
        this.PjT = qla0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo$PjT
    public void PjT(boolean z) {
        this.cr.getAndSet(z);
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo$PjT
    public boolean ReZ() {
        return this.cr.get();
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo$PjT
    public qla Zh() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo$PjT
    public boolean Zh(DWo dWo0) {
        int v = this.Zh.indexOf(dWo0);
        return v < this.Zh.size() - 1 && v >= 0;
    }
}

