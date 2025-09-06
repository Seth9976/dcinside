package com.bytedance.adsdk.Zh.cz;

import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import com.bytedance.adsdk.Zh.XX;

public class ReZ extends PjT implements Choreographer.FrameCallback {
    private float Au;
    private XX DWo;
    private float JQp;
    protected boolean PjT;
    private boolean ReZ;
    private float SM;
    private int XX;
    private float Zh;
    private long cr;
    private float cz;
    private boolean qj;

    public ReZ() {
        this.Zh = 1.0f;
        this.ReZ = false;
        this.cr = 0L;
        this.JQp = 0.0f;
        this.cz = 0.0f;
        this.XX = 0;
        this.Au = -2147483648.0f;
        this.SM = 2147483648.0f;
        this.PjT = false;
        this.qj = false;
    }

    public void Au() {
        this.DWo = null;
        this.Au = -2147483648.0f;
        this.SM = 2147483648.0f;
    }

    public float DWo() {
        return this.Zh;
    }

    private boolean Owx() {
        return this.DWo() < 0.0f;
    }

    public void PjT(float f) {
        if(this.JQp == f) {
            return;
        }
        float f1 = JQp.Zh(f, this.qla(), this.xE());
        this.JQp = f1;
        if(this.qj) {
            f1 = (float)Math.floor(f1);
        }
        this.cz = f1;
        this.cr = 0L;
        this.ReZ();
    }

    public void PjT(float f, float f1) {
        if(f > f1) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", f, f1));
        }
        float f2 = this.DWo == null ? -3.402823E+38f : this.DWo.cz();
        float f3 = this.DWo == null ? 3.402823E+38f : this.DWo.XX();
        float f4 = JQp.Zh(f, f2, f3);
        float f5 = JQp.Zh(f1, f2, f3);
        if(f4 != this.Au || f5 != this.SM) {
            this.Au = f4;
            this.SM = f5;
            this.PjT(((float)(((int)JQp.Zh(this.cz, f4, f5)))));
        }
    }

    public void PjT(int v) {
        this.PjT(((float)v), ((float)(((int)this.SM))));
    }

    public void PjT(XX xX0) {
        boolean z = this.DWo == null;
        this.DWo = xX0;
        if(z) {
            this.PjT(Math.max(this.Au, xX0.cz()), Math.min(this.SM, xX0.XX()));
        }
        else {
            this.PjT(((float)(((int)xX0.cz()))), ((float)(((int)xX0.XX()))));
        }
        float f = this.cz;
        this.cz = 0.0f;
        this.JQp = 0.0f;
        this.PjT(((float)(((int)f))));
        this.ReZ();
    }

    private void RD() {
        if(this.DWo == null) {
            return;
        }
        if(this.cz < this.Au || this.cz > this.SM) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", this.Au, this.SM, this.cz));
        }
    }

    public void ReZ(float f) {
        this.Zh = f;
    }

    public void ReZ(boolean z) {
        this.qj = z;
    }

    public void SM() {
        this.ReZ(-this.DWo());
    }

    public float XX() {
        return this.cz;
    }

    @Override  // com.bytedance.adsdk.Zh.cz.PjT
    void Zh() {
        super.Zh();
        this.Zh(this.Owx());
    }

    public void Zh(float f) {
        this.PjT(this.Au, f);
    }

    @Override  // android.animation.ValueAnimator
    public void cancel() {
        this.Zh();
        this.gK();
    }

    protected void cr(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if(z) {
            this.PjT = false;
        }
    }

    public float cz() {
        return this.DWo == null ? 0.0f : (this.cz - this.DWo.cz()) / (this.DWo.XX() - this.DWo.cz());
    }

    @Override  // android.view.Choreographer$FrameCallback
    public void doFrame(long v) {
        this.ub();
        if(this.DWo != null && this.isRunning()) {
            com.bytedance.adsdk.Zh.JQp.PjT("LottieValueAnimator#doFrame");
            float f = ((float)(this.cr == 0L ? 0L : v - this.cr)) / this.ltE();
            float f1 = this.JQp;
            if(this.Owx()) {
                f = -f;
            }
            float f2 = f1 + f;
            boolean z = JQp.ReZ(f2, this.qla(), this.xE());
            float f3 = this.JQp;
            float f4 = JQp.Zh(f2, this.qla(), this.xE());
            this.JQp = f4;
            if(this.qj) {
                f4 = (float)Math.floor(f4);
            }
            this.cz = f4;
            this.cr = v;
            if(!this.qj || this.JQp != f3) {
                this.ReZ();
            }
            if(!z) {
                if(this.getRepeatCount() == -1 || this.XX < this.getRepeatCount()) {
                    this.PjT();
                    ++this.XX;
                    if(this.getRepeatMode() == 2) {
                        this.ReZ = !this.ReZ;
                        this.SM();
                    }
                    else {
                        float f6 = this.Owx() ? this.xE() : this.qla();
                        this.JQp = f6;
                        this.cz = f6;
                    }
                    this.cr = v;
                }
                else {
                    float f5 = this.Zh < 0.0f ? this.qla() : this.xE();
                    this.JQp = f5;
                    this.cz = f5;
                    this.gK();
                    this.Zh(this.Owx());
                }
            }
            this.RD();
            com.bytedance.adsdk.Zh.JQp.Zh("LottieValueAnimator#doFrame");
        }
    }

    public void fDm() {
        this.PjT = true;
        this.ub();
        this.cr = 0L;
        if(this.Owx() && this.XX() == this.qla()) {
            this.PjT(this.xE());
        }
        else if(!this.Owx() && this.XX() == this.xE()) {
            this.PjT(this.qla());
        }
        this.JQp();
    }

    protected void gK() {
        this.cr(true);
    }

    @Override  // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        if(this.DWo == null) {
            return 0.0f;
        }
        return this.Owx() ? (this.xE() - this.cz) / (this.xE() - this.qla()) : (this.cz - this.qla()) / (this.xE() - this.qla());
    }

    @Override  // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return this.cz();
    }

    @Override  // android.animation.ValueAnimator
    public long getDuration() {
        return this.DWo == null ? 0L : ((long)this.DWo.JQp());
    }

    @Override  // android.animation.ValueAnimator
    public boolean isRunning() {
        return this.PjT;
    }

    private float ltE() {
        return this.DWo == null ? 3.402823E+38f : 1000000000.0f / this.DWo.xf() / Math.abs(this.Zh);
    }

    public void qj() {
        this.PjT = true;
        this.PjT(this.Owx());
        this.PjT(((float)(((int)(this.Owx() ? this.xE() : this.qla())))));
        this.cr = 0L;
        this.XX = 0;
        this.ub();
    }

    public float qla() {
        XX xX0 = this.DWo;
        if(xX0 == null) {
            return 0.0f;
        }
        return this.Au == -2147483648.0f ? xX0.cz() : this.Au;
    }

    @Override  // android.animation.ValueAnimator
    public void setRepeatMode(int v) {
        super.setRepeatMode(v);
        if(v != 2 && this.ReZ) {
            this.ReZ = false;
            this.SM();
        }
    }

    protected void ub() {
        if(this.isRunning()) {
            this.cr(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public float xE() {
        XX xX0 = this.DWo;
        if(xX0 == null) {
            return 0.0f;
        }
        return this.SM == 2147483648.0f ? xX0.XX() : this.SM;
    }

    public void xf() {
        this.gK();
        this.Zh(this.Owx());
    }

    public void xs() {
        this.gK();
        this.cr();
    }
}

