package com.bytedance.adsdk.ugeno.yoga;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.PjT.JQp;
import com.bytedance.adsdk.ugeno.PjT.cz;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.Zh.Zh;
import com.bytedance.adsdk.ugeno.cr;
import java.util.HashMap;
import java.util.Map;

public class Au extends ViewGroup implements JQp, Zh {
    public static class PjT extends ViewGroup.LayoutParams {
        private float Au;
        private float DWo;
        private float JQp;
        SparseArray PjT;
        private float ReZ;
        private float SM;
        private float XX;
        SparseArray Zh;
        private float cr;
        private float cz;
        private float fDm;
        private float gK;
        private float ltE;
        private float qj;
        private float qla;
        private float ub;
        private float xE;
        private float xf;
        private float xs;

        public PjT(int v, int v1) {
            super(v, v1);
            this.PjT = new SparseArray();
            this.Zh = new SparseArray();
            if(v == -2 || v == -1 || v >= 0) {
                this.PjT.put(15, ((float)v));
            }
            if(v1 == -2 || v1 == -1 || v1 >= 0) {
                this.PjT.put(16, ((float)v1));
            }
        }

        public PjT(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            if(viewGroup$LayoutParams0 instanceof PjT) {
                this.PjT = ((PjT)viewGroup$LayoutParams0).PjT.clone();
                this.Zh = ((PjT)viewGroup$LayoutParams0).Zh.clone();
                return;
            }
            this.PjT = new SparseArray();
            this.Zh = new SparseArray();
            if(viewGroup$LayoutParams0.width >= 0) {
                this.PjT.put(15, ((float)this.width));
            }
            if(viewGroup$LayoutParams0.height >= 0) {
                this.PjT.put(16, ((float)this.height));
            }
        }

        public void Au(float f) {
            this.fDm = f;
            this.PjT.put(11, f);
        }

        public void DWo(float f) {
            this.xE = f;
            this.PjT.put(13, f);
        }

        public void JQp(float f) {
            this.qj = f;
            this.PjT.put(9, f);
        }

        public void PjT(float f) {
            this.XX = f;
            this.PjT.put(5, f);
        }

        public void ReZ(float f) {
            this.SM = f;
            this.PjT.put(7, f);
        }

        public void SM(float f) {
            this.qla = f;
            this.PjT.put(12, f);
        }

        public void XX(float f) {
            this.xs = f;
            this.PjT.put(10, f);
        }

        public void Zh(float f) {
            this.Au = f;
            this.PjT.put(6, f);
        }

        public void cr(float f) {
            this.DWo = f;
            this.PjT.put(8, f);
        }

        public void cz(float f) {
            this.xf = f;
            this.PjT.put(14, f);
        }

        public void fDm(float f) {
            this.cz = f;
            this.PjT.put(20, f);
        }

        public void qj(float f) {
            this.ReZ = f;
            this.PjT.put(17, f);
        }

        public void qla(float f) {
            this.ub = f;
            this.PjT.put(25, f);
        }

        public void ub(float f) {
            this.ltE = f;
            this.PjT.put(28, f);
        }

        public void xE(float f) {
            this.gK = f;
            this.PjT.put(27, f);
        }

        public void xf(float f) {
            this.cr = f;
            this.PjT.put(18, f);
        }

        public void xs(float f) {
            this.JQp = f;
            this.PjT.put(19, f);
        }
    }

    public static class com.bytedance.adsdk.ugeno.yoga.Au.Zh implements SM {
        private int PjT(DWo dWo0) {
            if(dWo0 == DWo.ReZ) {
                return 0x80000000;
            }
            return dWo0 == DWo.Zh ? 0x40000000 : 0;
        }

        @Override  // com.bytedance.adsdk.ugeno.yoga.SM
        public long PjT(xf xf0, float f, DWo dWo0, float f1, DWo dWo1) {
            View view0 = (View)xf0.SM();
            if(view0 != null && !(view0 instanceof Au)) {
                view0.measure(View.MeasureSpec.makeMeasureSpec(((int)f), this.PjT(dWo0)), View.MeasureSpec.makeMeasureSpec(((int)f1), this.PjT(dWo1)));
                return qj.PjT(view0.getMeasuredWidth(), view0.getMeasuredHeight());
            }
            return qj.PjT(0, 0);
        }
    }

    private final Map PjT;
    private cr ReZ;
    private final xf Zh;
    private cz cr;

    public Au(Context context0) {
        this(context0, null, 0);
    }

    public Au(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.cr = new cz(this);
        xf xf0 = xs.PjT();
        this.Zh = xf0;
        this.PjT = new HashMap();
        xf0.PjT(this);
        xf0.PjT(new com.bytedance.adsdk.ugeno.yoga.Au.Zh());
        Au.PjT(((PjT)this.generateDefaultLayoutParams()), xf0, this);
    }

    private void PjT(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getSize(v1);
        int v4 = View.MeasureSpec.getMode(v);
        int v5 = View.MeasureSpec.getMode(v1);
        if(v5 == 0x40000000) {
            this.Zh.cz(((float)v3));
        }
        if(v4 == 0x40000000) {
            this.Zh.cr(((float)v2));
        }
        if(v5 == 0x80000000) {
            this.Zh.qj(((float)v3));
        }
        if(v4 == 0x80000000) {
            this.Zh.DWo(((float)v2));
        }
        this.Zh.PjT(NaNf, NaNf);
    }

    private void PjT(View view0, boolean z) {
        xf xf0 = (xf)this.PjT.get(view0);
        if(xf0 == null) {
            return;
        }
        xf xf1 = xf0.Zh();
        for(int v = 0; v < xf1.PjT(); ++v) {
            if(xf1.PjT(v).equals(xf0)) {
                xf1.Zh(v);
                break;
            }
        }
        xf0.PjT(null);
        this.PjT.remove(view0);
        if(z) {
            this.Zh.PjT(NaNf, NaNf);
        }
    }

    protected static void PjT(PjT au$PjT0, xf xf0, View view0) {
        if(view0.getResources().getConfiguration().getLayoutDirection() == 1) {
            xf0.PjT(com.bytedance.adsdk.ugeno.yoga.cr.ReZ);
        }
        Drawable drawable0 = view0.getBackground();
        if(drawable0 != null) {
            Rect rect0 = new Rect();
            if(drawable0.getPadding(rect0)) {
                xf0.Zh(com.bytedance.adsdk.ugeno.yoga.JQp.PjT, ((float)rect0.left));
                xf0.Zh(com.bytedance.adsdk.ugeno.yoga.JQp.Zh, ((float)rect0.top));
                xf0.Zh(com.bytedance.adsdk.ugeno.yoga.JQp.ReZ, ((float)rect0.right));
                xf0.Zh(com.bytedance.adsdk.ugeno.yoga.JQp.cr, ((float)rect0.bottom));
            }
        }
        for(int v = 0; v < au$PjT0.PjT.size(); ++v) {
            int v1 = au$PjT0.PjT.keyAt(v);
            float f = (float)(((Float)au$PjT0.PjT.valueAt(v)));
            switch(v1) {
                case 0: {
                    xf0.PjT(com.bytedance.adsdk.ugeno.yoga.Zh.PjT(Math.round(f)));
                    break;
                }
                case 1: {
                    xf0.PjT(com.bytedance.adsdk.ugeno.yoga.cz.PjT(Math.round(f)));
                    break;
                }
                case 2: {
                    xf0.PjT(xE.PjT(Math.round(f)));
                    break;
                }
                case 3: {
                    xf0.PjT(XX.PjT(Math.round(f)));
                    break;
                }
                case 4: {
                    xf0.ReZ(com.bytedance.adsdk.ugeno.yoga.Zh.PjT(Math.round(f)));
                    break;
                }
                case 6: {
                    xf0.PjT(f);
                    break;
                }
                case 7: {
                    xf0.Zh(f);
                    break;
                }
                case 8: {
                    xf0.ReZ(f);
                    break;
                }
                case 9: {
                    xf0.Zh(com.bytedance.adsdk.ugeno.yoga.Zh.PjT(Math.round(f)));
                    break;
                }
                case 10: {
                    xf0.ReZ(com.bytedance.adsdk.ugeno.yoga.JQp.Zh, f);
                    break;
                }
                case 11: {
                    xf0.ReZ(com.bytedance.adsdk.ugeno.yoga.JQp.PjT, f);
                    break;
                }
                case 12: {
                    xf0.ReZ(com.bytedance.adsdk.ugeno.yoga.JQp.cr, f);
                    break;
                }
                case 13: {
                    xf0.ReZ(com.bytedance.adsdk.ugeno.yoga.JQp.ReZ, f);
                    break;
                }
                case 14: {
                    xf0.PjT(qla.PjT(Math.round(f)));
                    break;
                }
                case 15: {
                    if(f == -1.0f) {
                        xf0.JQp(100.0f);
                    }
                    else if(f == -2.0f) {
                        xf0.ReZ();
                    }
                    else {
                        xf0.cr(f);
                    }
                    break;
                }
                case 16: {
                    if(f == -1.0f) {
                        xf0.XX(100.0f);
                    }
                    else if(f == -2.0f) {
                        xf0.cr();
                    }
                    else {
                        xf0.cz(f);
                    }
                    break;
                }
                case 17: {
                    xf0.PjT(com.bytedance.adsdk.ugeno.yoga.JQp.Zh, f);
                    break;
                }
                case 18: {
                    xf0.PjT(com.bytedance.adsdk.ugeno.yoga.JQp.PjT, f);
                    break;
                }
                case 19: {
                    xf0.PjT(com.bytedance.adsdk.ugeno.yoga.JQp.cr, f);
                    break;
                }
                case 20: {
                    xf0.PjT(com.bytedance.adsdk.ugeno.yoga.JQp.ReZ, f);
                    break;
                }
                case 21: {
                    xf0.Zh(com.bytedance.adsdk.ugeno.yoga.JQp.Zh, f);
                    break;
                }
                case 22: {
                    xf0.Zh(com.bytedance.adsdk.ugeno.yoga.JQp.PjT, f);
                    break;
                }
                case 23: {
                    xf0.Zh(com.bytedance.adsdk.ugeno.yoga.JQp.cr, f);
                    break;
                }
                case 24: {
                    xf0.Zh(com.bytedance.adsdk.ugeno.yoga.JQp.ReZ, f);
                    break;
                }
                case 25: {
                    xf0.xf(f);
                    break;
                }
                case 27: {
                    xf0.Au(f);
                    break;
                }
                case 28: {
                    xf0.SM(f);
                }
            }
        }
    }

    private void PjT(xf xf0) {
        if(xf0.Zh() != null) {
            this.PjT(xf0.Zh());
            return;
        }
        xf0.PjT(NaNf, NaNf);
    }

    private void PjT(xf xf0, float f, float f1) {
        View view0 = (View)xf0.SM();
        if(view0 != null && view0 != this) {
            if(view0.getVisibility() == 8) {
                return;
            }
            int v = Math.round(xf0.JQp() + f);
            int v1 = Math.round(xf0.cz() + f1);
            view0.measure(View.MeasureSpec.makeMeasureSpec(Math.round(xf0.XX()), 0x40000000), View.MeasureSpec.makeMeasureSpec(Math.round(xf0.Au()), 0x40000000));
            view0.layout(v, v1, view0.getMeasuredWidth() + v, view0.getMeasuredHeight() + v1);
        }
        int v2 = xf0.PjT();
        for(int v3 = 0; v3 < v2; ++v3) {
            if(this.equals(view0)) {
                this.PjT(xf0.PjT(v3), f, f1);
            }
            else if(!(view0 instanceof Au)) {
                this.PjT(xf0.PjT(v3), xf0.JQp() + f, xf0.cz() + f1);
            }
        }
    }

    private void PjT(xf xf0, int v) {
        switch(v) {
            case -2: {
                xf0.ReZ();
                return;
            }
            case -1: {
                xf0.JQp(100.0f);
                return;
            }
            default: {
                xf0.cr(((float)v));
            }
        }
    }

    public xf PjT(View view0) {
        return (xf)this.PjT.get(view0);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.Zh
    public void PjT(int v) {
        xf xf0 = this.Zh;
        if(xf0 != null) {
            this.PjT(xf0, v);
            this.requestLayout();
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.Zh
    public void PjT(View view0, int v) {
        if(view0 == null) {
            return;
        }
        xf xf0 = this.PjT(view0);
        if(xf0 == null) {
            return;
        }
        this.PjT(xf0, v);
        view0.requestLayout();
    }

    public void PjT(ReZ reZ0) {
        this.ReZ = reZ0;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.Zh
    public void ReZ(View view0, int v) {
        this.cr(view0, v);
    }

    private void Zh(xf xf0, int v) {
        switch(v) {
            case -2: {
                xf0.cr();
                return;
            }
            case -1: {
                xf0.XX(100.0f);
                return;
            }
            default: {
                xf0.cz(((float)v));
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.Zh
    public void Zh(int v) {
        xf xf0 = this.Zh;
        if(xf0 != null) {
            this.Zh(xf0, v);
            this.requestLayout();
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.Zh
    public void Zh(View view0, int v) {
        if(view0 == null) {
            return;
        }
        xf xf0 = this.PjT(view0);
        if(xf0 == null) {
            return;
        }
        this.Zh(xf0, v);
        view0.requestLayout();
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        xf xf0;
        this.Zh.PjT(null);
        if(view0 instanceof com.bytedance.adsdk.ugeno.yoga.PjT) {
            throw null;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
        if(this.PjT.containsKey(view0)) {
            return;
        }
        if(view0 instanceof Au) {
            xf0 = ((Au)view0).getYogaNode();
        }
        else {
            xf0 = this.PjT.containsKey(view0) ? ((xf)this.PjT.get(view0)) : xs.PjT();
            xf0.PjT(view0);
            xf0.PjT(new com.bytedance.adsdk.ugeno.yoga.Au.Zh());
        }
        Au.PjT(((PjT)view0.getLayoutParams()), xf0, view0);
        this.PjT.put(view0, xf0);
        if(view0.getVisibility() == 8) {
            view0.setTag(0x900FF00, this.Zh.PjT());
            return;
        }
        int v1 = this.Zh.PjT();
        this.Zh.PjT(xf0, v1);
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof PjT;
    }

    public void cr(View view0, int v) {
        view0.setVisibility(v);
        try {
            xf xf0 = (xf)this.PjT.get(view0);
            Object object0 = view0.getTag(0x900FF00);
            if(v == 0) {
                if(object0 != null && this.Zh.PjT(xf0) == -1) {
                    int v1 = (int)(((Integer)object0));
                    if(v1 < this.Zh.PjT()) {
                        xf xf1 = (xf)this.PjT.get(view0);
                        this.Zh.PjT(xf1, v1);
                    }
                    else {
                        xf xf2 = (xf)this.PjT.get(view0);
                        int v2 = this.Zh.PjT();
                        this.Zh.PjT(xf2, v2);
                    }
                    this.PjT(this.Zh);
                }
            }
            else if(v == 8) {
                int v3 = this.Zh.PjT(xf0);
                if(v3 != -1) {
                    this.Zh.Zh(v3);
                    view0.setTag(0x900FF00, v3);
                    this.PjT(this.Zh);
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new PjT(-1, -1);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new PjT(viewGroup$LayoutParams0);
    }

    public float getBorderRadius() {
        return this.cr.PjT();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getRipple() {
        return this.cr.getRipple();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getRubIn() {
        return this.cr.getRubIn();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getShine() {
        return this.cr.getShine();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getStretch() {
        return this.cr.getStretch();
    }

    public xf getYogaNode() {
        return this.Zh;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        cr cr0 = this.ReZ;
        if(cr0 != null) {
            cr0.XX();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cr cr0 = this.ReZ;
        if(cr0 != null) {
            cr0.Au();
        }
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        cr cr0 = this.ReZ;
        if(cr0 != null) {
            cr0.PjT(canvas0);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        cr cr0 = this.ReZ;
        if(cr0 != null) {
            cr0.cz();
        }
        if(!(this.getParent() instanceof Au)) {
            this.PjT(View.MeasureSpec.makeMeasureSpec(v2 - v, 0x40000000), View.MeasureSpec.makeMeasureSpec(v3 - v1, 0x40000000));
        }
        this.PjT(this.Zh, 0.0f, 0.0f);
        cr cr1 = this.ReZ;
        if(cr1 != null) {
            cr1.PjT(v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        if(!(this.getParent() instanceof Au)) {
            this.PjT(v, v1);
        }
        cr cr0 = this.ReZ;
        if(cr0 == null) {
            this.setMeasuredDimension(Math.round(this.Zh.XX()), Math.round(this.Zh.Au()));
        }
        else {
            int[] arr_v = cr0.PjT(v, v1);
            this.setMeasuredDimension(arr_v[0], arr_v[1]);
        }
        cr cr1 = this.ReZ;
        if(cr1 != null) {
            cr1.JQp();
        }
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        cr cr0 = this.ReZ;
        if(cr0 != null) {
            cr0.Zh(v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override  // android.view.ViewGroup
    public void removeAllViews() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            this.PjT(this.getChildAt(v1), false);
        }
        super.removeAllViews();
    }

    @Override  // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            this.PjT(this.getChildAt(v1), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override  // android.view.ViewGroup
    public void removeView(View view0) {
        this.PjT(view0, false);
        super.removeView(view0);
    }

    @Override  // android.view.ViewGroup
    public void removeViewAt(int v) {
        this.PjT(this.getChildAt(v), false);
        super.removeViewAt(v);
    }

    @Override  // android.view.ViewGroup
    public void removeViewInLayout(View view0) {
        this.PjT(view0, true);
        super.removeViewInLayout(view0);
    }

    @Override  // android.view.ViewGroup
    public void removeViews(int v, int v1) {
        for(int v2 = v; v2 < v + v1; ++v2) {
            this.PjT(this.getChildAt(v2), false);
        }
        super.removeViews(v, v1);
    }

    @Override  // android.view.ViewGroup
    public void removeViewsInLayout(int v, int v1) {
        for(int v2 = v; v2 < v + v1; ++v2) {
            this.PjT(this.getChildAt(v2), true);
        }
        super.removeViewsInLayout(v, v1);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        this.cr.PjT(v);
    }

    public void setBorderRadius(float f) {
        this.cr.PjT(f);
    }

    public void setRipple(float f) {
        cz cz0 = this.cr;
        if(cz0 != null) {
            cz0.Zh(f);
        }
    }

    public void setRubIn(float f) {
        cz cz0 = this.cr;
        if(cz0 != null) {
            cz0.JQp(f);
        }
    }

    public void setShine(float f) {
        cz cz0 = this.cr;
        if(cz0 != null) {
            cz0.ReZ(f);
        }
    }

    public void setStretch(float f) {
        cz cz0 = this.cr;
        if(cz0 != null) {
            cz0.cr(f);
        }
    }
}

