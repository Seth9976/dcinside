package com.bytedance.adsdk.Zh.XX;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.Zh.XX;

public class PjT {
    public PointF Au;
    private final XX DWo;
    public final Interpolator JQp;
    public final Object PjT;
    public final Interpolator ReZ;
    public PointF SM;
    public Float XX;
    public Object Zh;
    public final Interpolator cr;
    public final float cz;
    private int fDm;
    private float qj;
    private float qla;
    private float xE;
    private float xf;
    private int xs;

    public PjT(XX xX0, Object object0, Object object1, Interpolator interpolator0, float f, Float float0) {
        this.qj = -3987645.75f;
        this.xf = -3987645.75f;
        this.xs = 0x2EC8FB09;
        this.fDm = 0x2EC8FB09;
        this.qla = 1.401298E-45f;
        this.xE = 1.401298E-45f;
        this.Au = null;
        this.SM = null;
        this.DWo = xX0;
        this.PjT = object0;
        this.Zh = object1;
        this.ReZ = interpolator0;
        this.cr = null;
        this.JQp = null;
        this.cz = f;
        this.XX = float0;
    }

    public PjT(XX xX0, Object object0, Object object1, Interpolator interpolator0, Interpolator interpolator1, float f, Float float0) {
        this.qj = -3987645.75f;
        this.xf = -3987645.75f;
        this.xs = 0x2EC8FB09;
        this.fDm = 0x2EC8FB09;
        this.qla = 1.401298E-45f;
        this.xE = 1.401298E-45f;
        this.Au = null;
        this.SM = null;
        this.DWo = xX0;
        this.PjT = object0;
        this.Zh = object1;
        this.ReZ = null;
        this.cr = interpolator0;
        this.JQp = interpolator1;
        this.cz = f;
        this.XX = float0;
    }

    protected PjT(XX xX0, Object object0, Object object1, Interpolator interpolator0, Interpolator interpolator1, Interpolator interpolator2, float f, Float float0) {
        this.qj = -3987645.75f;
        this.xf = -3987645.75f;
        this.xs = 0x2EC8FB09;
        this.fDm = 0x2EC8FB09;
        this.qla = 1.401298E-45f;
        this.xE = 1.401298E-45f;
        this.Au = null;
        this.SM = null;
        this.DWo = xX0;
        this.PjT = object0;
        this.Zh = object1;
        this.ReZ = interpolator0;
        this.cr = interpolator1;
        this.JQp = interpolator2;
        this.cz = f;
        this.XX = float0;
    }

    public PjT(Object object0) {
        this.qj = -3987645.75f;
        this.xf = -3987645.75f;
        this.xs = 0x2EC8FB09;
        this.fDm = 0x2EC8FB09;
        this.qla = 1.401298E-45f;
        this.xE = 1.401298E-45f;
        this.Au = null;
        this.SM = null;
        this.DWo = null;
        this.PjT = object0;
        this.Zh = object0;
        this.ReZ = null;
        this.cr = null;
        this.JQp = null;
        this.cz = 1.401298E-45f;
        this.XX = 3.402823E+38f;
    }

    private PjT(Object object0, Object object1) {
        this.qj = -3987645.75f;
        this.xf = -3987645.75f;
        this.xs = 0x2EC8FB09;
        this.fDm = 0x2EC8FB09;
        this.qla = 1.401298E-45f;
        this.xE = 1.401298E-45f;
        this.Au = null;
        this.SM = null;
        this.DWo = null;
        this.PjT = object0;
        this.Zh = object1;
        this.ReZ = null;
        this.cr = null;
        this.JQp = null;
        this.cz = 1.401298E-45f;
        this.XX = 3.402823E+38f;
    }

    public int Au() {
        if(this.xs == 0x2EC8FB09) {
            this.xs = (int)(((Integer)this.PjT));
        }
        return this.xs;
    }

    public boolean JQp() {
        return this.ReZ == null && this.cr == null && this.JQp == null;
    }

    public PjT PjT(Object object0, Object object1) {
        return new PjT(object0, object1);
    }

    public boolean PjT(float f) {
        return f >= this.ReZ() && f < this.cr();
    }

    public float ReZ() {
        XX xX0 = this.DWo;
        if(xX0 == null) {
            return 0.0f;
        }
        if(this.qla == 1.401298E-45f) {
            float f = xX0.cz();
            float f1 = this.DWo.ub();
            this.qla = (this.cz - f) / f1;
        }
        return this.qla;
    }

    public int SM() {
        if(this.fDm == 0x2EC8FB09) {
            this.fDm = (int)(((Integer)this.Zh));
        }
        return this.fDm;
    }

    public float XX() {
        if(this.xf == -3987645.75f) {
            this.xf = (float)(((Float)this.Zh));
        }
        return this.xf;
    }

    public float cr() {
        if(this.DWo == null) {
            return 1.0f;
        }
        if(this.xE == 1.401298E-45f) {
            if(this.XX == null) {
                this.xE = 1.0f;
                return 1.0f;
            }
            this.xE = this.ReZ() + (((float)this.XX) - this.cz) / this.DWo.ub();
        }
        return this.xE;
    }

    public float cz() {
        if(this.qj == -3987645.75f) {
            this.qj = (float)(((Float)this.PjT));
        }
        return this.qj;
    }

    @Override
    public String toString() {
        return "Keyframe{startValue=" + this.PjT + ", endValue=" + this.Zh + ", startFrame=" + this.cz + ", endFrame=" + this.XX + ", interpolator=" + this.ReZ + '}';
    }
}

