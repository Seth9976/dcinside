package com.bytedance.sdk.component.PjT;

public abstract class cr extends Zh {
    interface PjT {
        void PjT(Object arg1);

        void PjT(Throwable arg1);
    }

    public interface com.bytedance.sdk.component.PjT.cr.Zh {
        cr PjT();
    }

    private boolean PjT;
    private cz ReZ;
    private PjT Zh;

    public cr() {
        this.PjT = true;
    }

    void JQp() {
        this.cr();
    }

    @Override  // com.bytedance.sdk.component.PjT.Zh
    public String PjT() {
        return super.PjT();
    }

    protected final void PjT(Object object0) {
        if(this.cz()) {
            this.Zh.PjT(object0);
            this.cr();
        }
    }

    protected abstract void PjT(Object arg1, cz arg2) throws Exception;

    void PjT(Object object0, cz cz0, PjT cr$PjT0) throws Exception {
        this.ReZ = cz0;
        this.Zh = cr$PjT0;
        this.PjT(object0, cz0);
    }

    protected final void PjT(Throwable throwable0) {
        if(this.cz()) {
            this.Zh.PjT(throwable0);
            this.cr();
        }
    }

    protected final void ReZ() {
        this.PjT(null);
    }

    protected void cr() {
        this.PjT = false;
        this.ReZ = null;
    }

    private boolean cz() {
        if(!this.PjT) {
            SM.PjT(new IllegalStateException("Jsb async call already finished: " + this.PjT() + ", hashcode: " + this.hashCode()));
            return false;
        }
        return true;
    }
}

