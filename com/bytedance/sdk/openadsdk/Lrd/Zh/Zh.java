package com.bytedance.sdk.openadsdk.Lrd.Zh;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public abstract class Zh {
    private final Integer Au;
    private final AtomicBoolean JQp;
    protected WeakReference PjT;
    protected final AtomicBoolean ReZ;
    private volatile boolean SM;
    private final int XX;
    protected Owx Zh;
    private final AtomicLong cr;
    private final PjT cz;

    public Zh(Integer integer0, View view0, Owx owx0, int v, PjT jQp$PjT0) {
        this.Au = integer0;
        this.XX = v;
        this.Zh = owx0;
        this.cz = jQp$PjT0;
        this.SM = false;
        this.PjT(view0);
        this.ReZ = new AtomicBoolean(false);
        this.cr = new AtomicLong(-1L);
        this.JQp = new AtomicBoolean(false);
    }

    public void Au() {
        this.cr.set(-1L);
    }

    public void DWo() {
        this.SM = true;
        XX.Zh(this);
    }

    protected com.bytedance.sdk.openadsdk.Lrd.Zh.PjT JQp() {
        WeakReference weakReference0 = this.PjT;
        if(weakReference0 == null) {
            return new com.bytedance.sdk.openadsdk.Lrd.Zh.PjT(-1, -1, -1.0f);
        }
        View view0 = (View)weakReference0.get();
        return view0 == null ? new com.bytedance.sdk.openadsdk.Lrd.Zh.PjT(0, 0, 0.0f) : new com.bytedance.sdk.openadsdk.Lrd.Zh.PjT(view0.getWidth(), view0.getHeight(), view0.getAlpha());
    }

    public static Zh PjT(boolean z, Integer integer0, View view0, Owx owx0, PjT jQp$PjT0) {
        return z ? new Au(integer0, view0, owx0, jQp$PjT0) : new ReZ(integer0, view0, owx0, jQp$PjT0);
    }

    public void PjT() {
        if(this.ReZ.compareAndSet(false, true)) {
            XX.PjT(this);
        }
    }

    public void PjT(int v) {
        switch(v) {
            case 4: {
                this.PjT();
                return;
            }
            case 8: {
                this.xs();
                return;
            }
            case 9: {
                this.cr();
                return;
            }
            default: {
                this.Zh(v);
            }
        }
    }

    public void PjT(View view0) {
        if(view0 != null) {
            view0.setTag(0x2000001, this.qj());
        }
        this.PjT = new WeakReference(view0);
    }

    protected abstract boolean ReZ();

    public boolean SM() {
        return this.JQp.get();
    }

    public void XX() {
        if(this.SM()) {
            return;
        }
        if(!this.ReZ.get()) {
            this.Au();
            return;
        }
        if(this.cr.compareAndSet(-1L, System.currentTimeMillis())) {
            return;
        }
        if(System.currentTimeMillis() - this.cr.get() >= ((long)this.XX)) {
            this.cr();
        }
    }

    public int Zh() {
        if(this.SM()) {
            return 1;
        }
        View view0 = this.PjT == null ? null : ((View)this.PjT.get());
        if(view0 != null && !this.SM) {
            if(!this.qj().equals(view0.getTag(0x2000001))) {
                this.DWo();
                JQp.Zh(this.qj());
                return 3;
            }
            return !this.qj().equals(view0.getTag(0x2000001)) || !this.ReZ() ? 2 : 1;
        }
        return 3;
    }

    protected abstract void Zh(int arg1);

    protected void cr() {
        if(this.JQp.compareAndSet(false, true)) {
            cr.PjT(this.Zh, this.JQp(), this.cz);
        }
    }

    public abstract int cz();

    public Integer qj() {
        return this.Au;
    }

    public boolean xf() {
        return this.ReZ.get();
    }

    public void xs() {
        this.ReZ.set(false);
        this.Au();
    }
}

