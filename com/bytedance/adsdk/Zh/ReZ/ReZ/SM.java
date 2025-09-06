package com.bytedance.adsdk.Zh.ReZ.ReZ;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.Zh.Owx;
import com.bytedance.adsdk.Zh.PjT.Zh.qla;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.PjT.qj;
import com.bytedance.adsdk.Zh.ReZ.ReZ;
import com.bytedance.adsdk.Zh.ReZ.Zh.xE;
import com.bytedance.adsdk.Zh.ReZ.cr;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SM extends PjT {
    static class com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT {
        private String PjT;
        private float Zh;

        private com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT() {
            this.PjT = "";
            this.Zh = 0.0f;
        }

        com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT(com.bytedance.adsdk.Zh.ReZ.ReZ.SM.1 sM$10) {
        }

        void PjT(String s, float f) {
            this.PjT = s;
            this.Zh = f;
        }
    }

    private final RectF Au;
    private final Paint DWo;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT Lrd;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT Owx;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT RD;
    private final Matrix SM;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT Sks;
    private final StringBuilder XX;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT cRA;
    private final List fDm;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT gK;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT iZZ;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT ltE;
    private final Paint qj;
    private final qla qla;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT tT;
    private final XX ub;
    private final com.bytedance.adsdk.Zh.SM xE;
    private final Map xf;
    private final LongSparseArray xs;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT yIW;

    SM(com.bytedance.adsdk.Zh.SM sM0, JQp jQp0) {
        super(sM0, jQp0);
        this.XX = new StringBuilder(2);
        this.Au = new RectF();
        this.SM = new Matrix();
        this.DWo = new Paint(1) {
            final SM PjT;

            {
                int v = 1;  // 捕获的参数
                this.setStyle(Paint.Style.FILL);
            }
        };
        this.qj = new Paint(1) {
            final SM PjT;

            {
                int v = 1;  // 捕获的参数
                this.setStyle(Paint.Style.STROKE);
            }
        };
        this.xf = new HashMap();
        this.xs = new LongSparseArray();
        this.fDm = new ArrayList();
        this.xE = sM0;
        this.ub = jQp0.PjT();
        qla qla0 = jQp0.ltE().cr();
        this.qla = qla0;
        qla0.PjT(this);
        this.PjT(qla0);
        qj qj0 = jQp0.Owx();
        if(qj0 != null) {
            com.bytedance.adsdk.Zh.ReZ.PjT.PjT pjT0 = qj0.PjT;
            if(pjT0 != null) {
                com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = pjT0.PjT();
                this.gK = pjT1;
                pjT1.PjT(this);
                this.PjT(this.gK);
            }
        }
        if(qj0 != null) {
            com.bytedance.adsdk.Zh.ReZ.PjT.PjT pjT2 = qj0.Zh;
            if(pjT2 != null) {
                com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = pjT2.PjT();
                this.Owx = pjT3;
                pjT3.PjT(this);
                this.PjT(this.Owx);
            }
        }
        if(qj0 != null) {
            Zh zh0 = qj0.ReZ;
            if(zh0 != null) {
                com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT4 = zh0.PjT();
                this.Sks = pjT4;
                pjT4.PjT(this);
                this.PjT(this.Sks);
            }
        }
        if(qj0 != null) {
            Zh zh1 = qj0.cr;
            if(zh1 != null) {
                com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT5 = zh1.PjT();
                this.Lrd = pjT5;
                pjT5.PjT(this);
                this.PjT(this.Lrd);
            }
        }
    }

    private Typeface PjT(ReZ reZ0) {
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.iZZ;
        if(pjT0 != null) {
            Typeface typeface0 = (Typeface)pjT0.XX();
            if(typeface0 != null) {
                return typeface0;
            }
        }
        Typeface typeface1 = this.xE.PjT(reZ0);
        return typeface1 == null ? reZ0.cr() : typeface1;
    }

    private String PjT(String s, int v) {
        int v1 = s.codePointAt(v);
        int v2 = Character.charCount(v1) + v;
        while(v2 < s.length()) {
            int v3 = s.codePointAt(v2);
            if(!this.ReZ(v3)) {
                break;
            }
            v2 += Character.charCount(v3);
            v1 = v1 * 0x1F + v3;
        }
        if(this.xs.indexOfKey(((long)v1)) >= 0) {
            return (String)this.xs.get(((long)v1));
        }
        this.XX.setLength(0);
        while(v < v2) {
            int v4 = s.codePointAt(v);
            this.XX.appendCodePoint(v4);
            v += Character.charCount(v4);
        }
        String s1 = this.XX.toString();
        this.xs.put(((long)v1), s1);
        return s1;
    }

    private List PjT(cr cr0) {
        if(this.xf.containsKey(cr0)) {
            return (List)this.xf.get(cr0);
        }
        List list0 = cr0.PjT();
        int v = list0.size();
        List list1 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            xE xE0 = (xE)list0.get(v1);
            list1.add(new com.bytedance.adsdk.Zh.PjT.PjT.cr(this.xE, this, xE0, this.ub));
        }
        this.xf.put(cr0, list1);
        return list1;
    }

    private List PjT(String s) {
        return Arrays.asList(s.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private List PjT(String s, float f, ReZ reZ0, float f1, float f2, boolean z) {
        float f6;
        int v = 0;
        float f3 = 0.0f;
        int v1 = 0;
        int v2 = 0;
        boolean z1 = false;
        float f4 = 0.0f;
        int v3 = 0;
        float f5 = 0.0f;
        while(v < s.length()) {
            int v4 = s.charAt(v);
            if(z) {
                cr cr0 = (cr)this.ub.fDm().get(cr.PjT(((char)v4), reZ0.PjT(), reZ0.ReZ()));
                if(cr0 != null) {
                    f6 = ((float)cr0.Zh()) * f1 * cz.PjT() + f2;
                    goto label_16;
                }
            }
            else {
                f6 = this.DWo.measureText(s.substring(v, v + 1)) + f2;
            label_16:
                if(v4 == 0x20) {
                    z1 = true;
                    f5 = f6;
                }
                else if(z1) {
                    v3 = v;
                    f4 = f6;
                    z1 = false;
                }
                else {
                    f4 += f6;
                }
                f3 += f6;
                if(f > 0.0f && f3 >= f && v4 != 0x20) {
                    ++v1;
                    com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT sM$PjT0 = this.Zh(v1);
                    if(v3 == v2) {
                        String s1 = s.substring(v2, v);
                        String s2 = s1.trim();
                        sM$PjT0.PjT(s2, f3 - f6 - ((float)(s2.length() - s1.length())) * f5);
                        v2 = v;
                        v3 = v2;
                        f3 = f6;
                        f4 = f3;
                    }
                    else {
                        String s3 = s.substring(v2, v3 - 1);
                        String s4 = s3.trim();
                        sM$PjT0.PjT(s4, f3 - f4 - ((float)(s3.length() - s4.length())) * f5 - f5);
                        f3 = f4;
                        v2 = v3;
                    }
                }
            }
            ++v;
        }
        if(f3 > 0.0f) {
            ++v1;
            this.Zh(v1).PjT(s.substring(v2), f3);
        }
        return this.fDm.subList(0, v1);
    }

    private void PjT(Canvas canvas0, com.bytedance.adsdk.Zh.ReZ.Zh zh0, int v, float f) {
        PointF pointF0 = zh0.xf;
        PointF pointF1 = zh0.xs;
        float f1 = cz.PjT();
        float f2 = 0.0f;
        float f3 = ((float)v) * zh0.cz * f1 + (pointF0 == null ? 0.0f : zh0.cz * 0.6f * f1 + pointF0.y);
        float f4 = pointF0 == null ? 0.0f : pointF0.x;
        if(pointF1 != null) {
            f2 = pointF1.x;
        }
        switch(zh0.cr) {
            case 1: {
                canvas0.translate(f4, f3);
                return;
            }
            case 2: {
                canvas0.translate(f4 + f2 - f, f3);
                return;
            }
            case 3: {
                canvas0.translate(f4 + f2 / 2.0f - f / 2.0f, f3);
            }
        }
    }

    private void PjT(Path path0, Paint paint0, Canvas canvas0) {
        if(paint0.getColor() == 0) {
            return;
        }
        if(paint0.getStyle() == Paint.Style.STROKE && paint0.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas0.drawPath(path0, paint0);
    }

    private void PjT(com.bytedance.adsdk.Zh.ReZ.Zh zh0, Matrix matrix0) {
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.ltE;
        if(pjT0 == null) {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = this.gK;
            if(pjT1 == null) {
                this.DWo.setColor(zh0.Au);
            }
            else {
                int v1 = (int)(((Integer)pjT1.XX()));
                this.DWo.setColor(v1);
            }
        }
        else {
            int v = (int)(((Integer)pjT0.XX()));
            this.DWo.setColor(v);
        }
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = this.RD;
        if(pjT2 == null) {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = this.Owx;
            if(pjT3 == null) {
                this.qj.setColor(zh0.SM);
            }
            else {
                int v3 = (int)(((Integer)pjT3.XX()));
                this.qj.setColor(v3);
            }
        }
        else {
            int v2 = (int)(((Integer)pjT2.XX()));
            this.qj.setColor(v2);
        }
        int v4 = (this.cr.PjT() == null ? 100 : ((int)(((Integer)this.cr.PjT().XX())))) * 0xFF / 100;
        this.DWo.setAlpha(v4);
        this.qj.setAlpha(v4);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT4 = this.tT;
        if(pjT4 != null) {
            float f = (float)(((Float)pjT4.XX()));
            this.qj.setStrokeWidth(f);
            return;
        }
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT5 = this.Sks;
        if(pjT5 != null) {
            float f1 = (float)(((Float)pjT5.XX()));
            this.qj.setStrokeWidth(f1);
            return;
        }
        float f2 = zh0.DWo;
        float f3 = cz.PjT();
        this.qj.setStrokeWidth(f2 * f3);
    }

    private void PjT(com.bytedance.adsdk.Zh.ReZ.Zh zh0, Matrix matrix0, ReZ reZ0, Canvas canvas0) {
        float f = this.yIW == null ? zh0.ReZ : ((float)(((Float)this.yIW.XX())));
        float f1 = cz.PjT(matrix0);
        List list0 = this.PjT(zh0.PjT);
        int v = list0.size();
        float f2 = ((float)zh0.JQp) / 10.0f;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.cRA;
        if(pjT0 == null) {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = this.Lrd;
            if(pjT1 != null) {
                f2 += (float)(((Float)pjT1.XX()));
            }
        }
        else {
            f2 += (float)(((Float)pjT0.XX()));
        }
        for(int v1 = 0; v1 < v; ++v1) {
            List list1 = this.PjT(((String)list0.get(v1)), (zh0.xs == null ? 0.0f : zh0.xs.x), reZ0, f / 100.0f, f2, true);
            int v3 = 0;
            for(int v2 = -1; v3 < list1.size(); ++v2) {
                com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT sM$PjT0 = (com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT)list1.get(v3);
                canvas0.save();
                this.PjT(canvas0, zh0, v2 + 1, sM$PjT0.Zh);
                this.PjT(sM$PjT0.PjT, zh0, reZ0, canvas0, f1, f / 100.0f, f2);
                canvas0.restore();
                ++v3;
            }
        }
    }

    private void PjT(com.bytedance.adsdk.Zh.ReZ.Zh zh0, ReZ reZ0, Canvas canvas0) {
        Typeface typeface0 = this.PjT(reZ0);
        if(typeface0 == null) {
            return;
        }
        String s = zh0.PjT;
        Owx owx0 = this.xE.Lrd();
        if(owx0 != null) {
            s = owx0.Zh(this.SM(), s);
        }
        this.DWo.setTypeface(typeface0);
        float f = this.yIW == null ? zh0.ReZ : ((float)(((Float)this.yIW.XX())));
        float f1 = cz.PjT();
        this.DWo.setTextSize(f1 * f);
        Typeface typeface1 = this.DWo.getTypeface();
        this.qj.setTypeface(typeface1);
        float f2 = this.DWo.getTextSize();
        this.qj.setTextSize(f2);
        float f3 = ((float)zh0.JQp) / 10.0f;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.cRA;
        if(pjT0 == null) {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = this.Lrd;
            if(pjT1 != null) {
                f3 += (float)(((Float)pjT1.XX()));
            }
        }
        else {
            f3 += (float)(((Float)pjT0.XX()));
        }
        float f4 = f3 * cz.PjT() * f / 100.0f;
        List list0 = this.PjT(s);
        int v = list0.size();
        int v2 = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            List list1 = this.PjT(((String)list0.get(v1)), (zh0.xs == null ? 0.0f : zh0.xs.x), reZ0, 0.0f, f4, false);
            for(int v3 = 0; v3 < list1.size(); ++v3) {
                com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT sM$PjT0 = (com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT)list1.get(v3);
                ++v2;
                canvas0.save();
                this.PjT(canvas0, zh0, v2, sM$PjT0.Zh);
                this.PjT(sM$PjT0.PjT, zh0, canvas0, f4);
                canvas0.restore();
            }
        }
    }

    private void PjT(cr cr0, float f, com.bytedance.adsdk.Zh.ReZ.Zh zh0, Canvas canvas0) {
        List list0 = this.PjT(cr0);
        for(int v = 0; v < list0.size(); ++v) {
            Path path0 = ((com.bytedance.adsdk.Zh.PjT.PjT.cr)list0.get(v)).cr();
            path0.computeBounds(this.Au, false);
            this.SM.reset();
            float f1 = -zh0.XX;
            float f2 = cz.PjT();
            this.SM.preTranslate(0.0f, f1 * f2);
            this.SM.preScale(f, f);
            path0.transform(this.SM);
            if(zh0.qj) {
                this.PjT(path0, this.DWo, canvas0);
                this.PjT(path0, this.qj, canvas0);
            }
            else {
                this.PjT(path0, this.qj, canvas0);
                this.PjT(path0, this.DWo, canvas0);
            }
        }
    }

    private void PjT(String s, Paint paint0, Canvas canvas0) {
        if(paint0.getColor() == 0) {
            return;
        }
        if(paint0.getStyle() == Paint.Style.STROKE && paint0.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas0.drawText(s, 0, s.length(), 0.0f, 0.0f, paint0);
    }

    private void PjT(String s, com.bytedance.adsdk.Zh.ReZ.Zh zh0, Canvas canvas0) {
        if(zh0.qj) {
            this.PjT(s, this.DWo, canvas0);
            this.PjT(s, this.qj, canvas0);
            return;
        }
        this.PjT(s, this.qj, canvas0);
        this.PjT(s, this.DWo, canvas0);
    }

    private void PjT(String s, com.bytedance.adsdk.Zh.ReZ.Zh zh0, Canvas canvas0, float f) {
        int v = 0;
        while(v < s.length()) {
            String s1 = this.PjT(s, v);
            v += s1.length();
            this.PjT(s1, zh0, canvas0);
            canvas0.translate(this.DWo.measureText(s1) + f, 0.0f);
        }
    }

    private void PjT(String s, com.bytedance.adsdk.Zh.ReZ.Zh zh0, ReZ reZ0, Canvas canvas0, float f, float f1, float f2) {
        for(int v = 0; v < s.length(); ++v) {
            cr cr0 = (cr)this.ub.fDm().get(cr.PjT(s.charAt(v), reZ0.PjT(), reZ0.ReZ()));
            if(cr0 != null) {
                this.PjT(cr0, f1, zh0, canvas0);
                canvas0.translate(((float)cr0.Zh()) * f1 * cz.PjT() + f2, 0.0f);
            }
        }
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        super.PjT(rectF0, matrix0, z);
        rectF0.set(0.0f, 0.0f, ((float)this.ub.cr().width()), ((float)this.ub.cr().height()));
    }

    private boolean ReZ(int v) {
        switch(Character.getType(v)) {
            case 6: 
            case 8: 
            case 16: 
            case 19: 
            case 27: 
            case 28: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT Zh(int v) {
        for(int v1 = this.fDm.size(); v1 < v; ++v1) {
            com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT sM$PjT0 = new com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT(null);
            this.fDm.add(sM$PjT0);
        }
        return (com.bytedance.adsdk.Zh.ReZ.ReZ.SM.PjT)this.fDm.get(v - 1);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void Zh(Canvas canvas0, Matrix matrix0, int v) {
        super.Zh(canvas0, matrix0, v);
        com.bytedance.adsdk.Zh.ReZ.Zh zh0 = (com.bytedance.adsdk.Zh.ReZ.Zh)this.qla.XX();
        ReZ reZ0 = (ReZ)this.ub.qla().get(zh0.Zh);
        if(reZ0 == null) {
            return;
        }
        canvas0.save();
        canvas0.concat(matrix0);
        this.PjT(zh0, matrix0);
        if(this.xE.cRA()) {
            this.PjT(zh0, matrix0, reZ0, canvas0);
        }
        else {
            this.PjT(zh0, reZ0, canvas0);
        }
        canvas0.restore();
    }
}

