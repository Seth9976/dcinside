package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.DWo;
import com.bytedance.adsdk.Zh.SM;
import java.util.List;

public class fDm implements qj, xs, PjT {
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT Au;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT DWo;
    private final boolean JQp;
    private final Path PjT;
    private final SM ReZ;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT SM;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT XX;
    private final String Zh;
    private final com.bytedance.adsdk.Zh.ReZ.Zh.DWo.PjT cr;
    private final boolean cz;
    private final Zh fDm;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT qj;
    private boolean qla;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT xf;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT xs;

    public fDm(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, DWo dWo0) {
        this.PjT = new Path();
        this.fDm = new Zh();
        this.ReZ = sM0;
        this.Zh = dWo0.PjT();
        com.bytedance.adsdk.Zh.ReZ.Zh.DWo.PjT dWo$PjT0 = dWo0.Zh();
        this.cr = dWo$PjT0;
        this.JQp = dWo0.DWo();
        this.cz = dWo0.qj();
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = dWo0.ReZ().PjT();
        this.XX = pjT1;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = dWo0.cr().PjT();
        this.Au = pjT2;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = dWo0.JQp().PjT();
        this.SM = pjT3;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT4 = dWo0.XX().PjT();
        this.qj = pjT4;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT5 = dWo0.SM().PjT();
        this.xs = pjT5;
        com.bytedance.adsdk.Zh.ReZ.Zh.DWo.PjT dWo$PjT1 = com.bytedance.adsdk.Zh.ReZ.Zh.DWo.PjT.PjT;
        if(dWo$PjT0 == dWo$PjT1) {
            this.DWo = dWo0.cz().PjT();
            this.xf = dWo0.Au().PjT();
        }
        else {
            this.DWo = null;
            this.xf = null;
        }
        pjT0.PjT(pjT1);
        pjT0.PjT(pjT2);
        pjT0.PjT(pjT3);
        pjT0.PjT(pjT4);
        pjT0.PjT(pjT5);
        if(dWo$PjT0 == dWo$PjT1) {
            pjT0.PjT(this.DWo);
            pjT0.PjT(this.xf);
        }
        pjT1.PjT(this);
        pjT2.PjT(this);
        pjT3.PjT(this);
        pjT4.PjT(this);
        pjT5.PjT(this);
        if(dWo$PjT0 == dWo$PjT1) {
            this.DWo.PjT(this);
            this.xf.PjT(this);
        }
    }

    private void JQp() {
        double f10;
        int v2;
        int v = (int)Math.floor(((float)(((Float)this.XX.XX()))));
        double f = Math.toRadians((this.SM == null ? 0.0 : ((double)(((float)(((Float)this.SM.XX())))))) - 90.0);
        float f1 = (float)(((Float)this.xs.XX()));
        float f2 = (float)(((Float)this.qj.XX()));
        float f3 = (float)(Math.cos(f) * ((double)f2));
        float f4 = (float)(Math.sin(f) * ((double)f2));
        this.PjT.moveTo(f3, f4);
        double f5 = (double)(((float)(6.283185 / ((double)v))));
        double f6 = f + f5;
        double f7 = Math.ceil(v);
        int v1 = 0;
        while(((double)v1) < f7) {
            float f8 = (float)(Math.cos(f6) * ((double)f2));
            float f9 = (float)(((double)f2) * Math.sin(f6));
            if(f1 / 100.0f == 0.0f) {
                v2 = v1;
                f10 = f6;
                this.PjT.lineTo(f8, f9);
            }
            else {
                v2 = v1;
                f10 = f6;
                double f11 = (double)(((float)(Math.atan2(f4, f3) - 1.570796)));
                double f12 = (double)(((float)(Math.atan2(f9, f8) - 1.570796)));
                float f13 = f2 * (f1 / 100.0f) * 0.25f;
                this.PjT.cubicTo(f3 - ((float)Math.cos(f11)) * f13, f4 - ((float)Math.sin(f11)) * f13, f8 + ((float)Math.cos(f12)) * f13, f9 + f13 * ((float)Math.sin(f12)), f8, f9);
            }
            f6 = f10 + f5;
            v1 = v2 + 1;
            f4 = f9;
            f3 = f8;
        }
        PointF pointF0 = (PointF)this.Au.XX();
        this.PjT.offset(pointF0.x, pointF0.y);
        this.PjT.close();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.Zh();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
        for(int v = 0; v < list0.size(); ++v) {
            ReZ reZ0 = (ReZ)list0.get(v);
            if(reZ0 instanceof RD && ((RD)reZ0).Zh() == com.bytedance.adsdk.Zh.ReZ.Zh.ltE.PjT.PjT) {
                this.fDm.PjT(((RD)reZ0));
                ((RD)reZ0).PjT(this);
            }
        }
    }

    private void ReZ() {
        float f26;
        float f25;
        double f24;
        float f21;
        double f20;
        float f19;
        float f18;
        float f13;
        float f12;
        double f11;
        float f10;
        int v1;
        float f8;
        float f = (float)(((Float)this.XX.XX()));
        double f1 = Math.toRadians((this.SM == null ? 0.0 : ((double)(((float)(((Float)this.SM.XX())))))) - 90.0);
        float f2 = (float)(6.283185 / ((double)f));
        if(this.cz) {
            f2 *= -1.0f;
        }
        float f3 = f - ((float)(((int)f)));
        int v = Float.compare(f3, 0.0f);
        if(v != 0) {
            f1 += (double)((1.0f - f3) * (f2 / 2.0f));
        }
        float f4 = (float)(((Float)this.qj.XX()));
        float f5 = (float)(((Float)this.DWo.XX()));
        float f6 = this.xf == null ? 0.0f : ((float)(((Float)this.xf.XX()))) / 100.0f;
        float f7 = this.xs == null ? 0.0f : ((float)(((Float)this.xs.XX()))) / 100.0f;
        if(v == 0) {
            v1 = 0;
            float f14 = (float)(Math.cos(f1) * ((double)f4));
            float f15 = (float)(((double)f4) * Math.sin(f1));
            this.PjT.moveTo(f14, f15);
            f12 = f14;
            f13 = f2 / 2.0f;
            f11 = f1 + ((double)f13);
            f10 = f15;
            f8 = 0.0f;
        }
        else {
            f8 = (f4 - f5) * f3 + f5;
            v1 = v;
            float f9 = (float)(((double)f8) * Math.cos(f1));
            f10 = (float)(((double)f8) * Math.sin(f1));
            this.PjT.moveTo(f9, f10);
            f11 = f1 + ((double)(f2 * f3 / 2.0f));
            f12 = f9;
            f13 = f2 / 2.0f;
        }
        double f16 = Math.ceil(f) * 2.0;
        int v2 = 0;
        float f17 = f12;
        int v3 = 0;
        while(((double)v2) < f16) {
            int v4 = Float.compare(f8, 0.0f);
            if(v4 == 0 || ((double)v2) != f16 - 2.0) {
                f18 = f2;
                f19 = f13;
            }
            else {
                f18 = f2;
                f19 = f2 * f3 / 2.0f;
            }
            if(v4 == 0 || ((double)v2) != f16 - 1.0) {
                f20 = (double)v2;
                f21 = f8;
                f8 = v3 == 0 ? f5 : f4;
            }
            else {
                f20 = (double)v2;
                f21 = f8;
            }
            float f22 = (float)(((double)f8) * Math.cos(f11));
            float f23 = (float)(((double)f8) * Math.sin(f11));
            if(f6 != 0.0f || f7 != 0.0f) {
                f25 = f6;
                double f27 = (double)(((float)(Math.atan2(f10, f17) - 1.570796)));
                f26 = f7;
                f24 = f11;
                double f28 = (double)(((float)(Math.atan2(f23, f22) - 1.570796)));
                float f29 = (v3 == 0 ? f4 : f5) * (v3 == 0 ? f26 : f25) * 0.47829f;
                float f30 = ((float)Math.cos(f27)) * f29;
                float f31 = f29 * ((float)Math.sin(f27));
                float f32 = (v3 == 0 ? f5 : f4) * (v3 == 0 ? f25 : f26) * 0.47829f;
                float f33 = ((float)Math.cos(f28)) * f32;
                float f34 = f32 * ((float)Math.sin(f28));
                if(v1 != 0) {
                    if(v2 == 0) {
                        f30 *= f3;
                        f31 *= f3;
                    }
                    else if(f20 == f16 - 1.0) {
                        f33 *= f3;
                        f34 *= f3;
                    }
                }
                this.PjT.cubicTo(f17 - f30, f10 - f31, f22 + f33, f23 + f34, f22, f23);
            }
            else {
                this.PjT.lineTo(f22, f23);
                f24 = f11;
                f25 = 0.0f;
                f26 = 0.0f;
            }
            f11 = f24 + ((double)f19);
            v3 ^= 1;
            ++v2;
            f17 = f22;
            f10 = f23;
            f7 = f26;
            f6 = f25;
            f8 = f21;
            f2 = f18;
        }
        PointF pointF0 = (PointF)this.Au.XX();
        this.PjT.offset(pointF0.x, pointF0.y);
        this.PjT.close();
    }

    private void Zh() {
        this.qla = false;
        this.ReZ.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.xs
    public Path cr() {
        if(this.qla) {
            return this.PjT;
        }
        this.PjT.reset();
        if(this.JQp) {
            this.qla = true;
            return this.PjT;
        }
        switch(this.cr) {
            case 1: {
                this.ReZ();
                break;
            }
            case 2: {
                this.JQp();
            }
        }
        this.PjT.close();
        this.fDm.PjT(this.PjT);
        this.qla = true;
        return this.PjT;
    }
}

