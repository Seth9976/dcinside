package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.Zh.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.animation.PjT.Zh;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.adexpress.dynamic.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.cr.cz;
import com.bytedance.sdk.component.utils.cRA;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class JQp extends FrameLayout implements IAnimation, Co, wN {
    protected int Au;
    protected int DWo;
    protected float JQp;
    private float Owx;
    private float PjT;
    private cRA RD;
    protected float ReZ;
    protected int SM;
    private static final View.OnTouchListener Sks;
    protected int XX;
    private float Zh;
    protected float cr;
    protected float cz;
    protected DynamicRootView fDm;
    ReZ gK;
    private float ltE;
    protected Context qj;
    protected View qla;
    private static final View.OnClickListener tT;
    protected Zh ub;
    protected boolean xE;
    protected XX xf;
    protected Au xs;

    static {
        JQp.Sks = new View.OnTouchListener() {
            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                return true;
            }
        };
        JQp.tT = new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
            }
        };
    }

    public JQp(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0);
        this.qj = context0;
        this.fDm = dynamicRootView0;
        this.xs = au0;
        this.ReZ = au0.cz();
        this.cr = au0.XX();
        this.JQp = au0.Au();
        this.cz = au0.SM();
        this.SM = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, this.ReZ);
        this.DWo = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, this.cr);
        this.XX = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, this.JQp);
        this.Au = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, this.cz);
        XX xX0 = new XX(au0.DWo());
        this.xf = xX0;
        if(xX0.gK() > 0) {
            this.XX += this.xf.gK() * 2;
            this.Au += this.xf.gK() * 2;
            this.SM -= this.xf.gK();
            this.DWo -= this.xf.gK();
            List list0 = au0.qj();
            if(list0 != null) {
                for(Object object0: list0) {
                    ((Au)object0).ReZ(((Au)object0).cz() + ((float)com.bytedance.sdk.component.adexpress.cr.XX.Zh(this.qj, ((float)this.xf.gK()))));
                    ((Au)object0).cr(((Au)object0).XX() + ((float)com.bytedance.sdk.component.adexpress.cr.XX.Zh(this.qj, ((float)this.xf.gK()))));
                    ((Au)object0).PjT(((float)com.bytedance.sdk.component.adexpress.cr.XX.Zh(this.qj, ((float)this.xf.gK()))));
                    ((Au)object0).Zh(((float)com.bytedance.sdk.component.adexpress.cr.XX.Zh(this.qj, ((float)this.xf.gK()))));
                }
            }
        }
        this.xE = this.xf.fDm() > 0.0;
        this.gK = new ReZ();
    }

    protected boolean Au() {
        return this.xs == null || this.xs.DWo() == null || this.xs.DWo().JQp() == null || this.xs.DWo().JQp().kWj() == null;
    }

    public boolean JQp() {
        return this.xf != null && this.xf.iZZ() != 0;
    }

    private void PjT() {
        if(!this.isShown()) {
            return;
        }
        int v = PjT.PjT(this.xf);
        if(v == 2) {
            if(this.RD == null) {
                this.RD = new cRA(this.getContext().getApplicationContext(), 1);
            }
            new Object() {
                final JQp PjT;

            };
            boolean z = this.fDm.getRenderRequest() == null;
            return;
        }
        if(v == 3) {
            if(this.RD == null) {
                this.RD = new cRA(this.getContext().getApplicationContext(), 2);
            }
            new Object() {
                final JQp PjT;

            };
            boolean z1 = this.fDm.getRenderRequest() == null;
        }
    }

    private Drawable[] PjT(List list0) {
        Drawable[] arr_drawable = new Drawable[list0.size()];
        for(int v = 0; v < list0.size(); ++v) {
            String s = (String)list0.get(v);
            if(s.contains("linear-gradient")) {
                String[] arr_s = s.substring(s.indexOf("(") + 1, s.length() - 1).split(", ");
                int v1 = arr_s.length - 1;
                int[] arr_v = new int[v1];
                for(int v2 = 0; v2 < v1; ++v2) {
                    arr_v[v2] = XX.PjT(arr_s[v2 + 1].substring(0, 7));
                }
                GradientDrawable gradientDrawable0 = this.PjT(this.PjT(arr_s[0]), arr_v);
                gradientDrawable0.setShape(0);
                gradientDrawable0.setCornerRadius(com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, this.xf.qla()));
                arr_drawable[list0.size() - 1 - v] = gradientDrawable0;
            }
        }
        return arr_drawable;
    }

    protected Drawable PjT(boolean z, String s) {
        int[] arr_v;
        String[] arr_s;
        if(!TextUtils.isEmpty(this.xf.qZS())) {
            try {
                String s1 = this.xf.qZS();
                String s2 = s1.substring(s1.indexOf("(") + 1, s1.length() - 1);
                if(!s2.contains("rgba") || !s2.contains("%")) {
                    arr_s = s2.split(", ");
                    arr_v = new int[]{XX.PjT(arr_s[1].substring(0, 7)), XX.PjT(arr_s[2].substring(0, 7))};
                }
                else {
                    arr_s = new String[]{s2.substring(0, s2.indexOf(",")).trim(), s2.substring(s2.indexOf(",") + 1, s2.indexOf("%") + 1).trim(), s2.substring(s2.indexOf("%") + 2).trim()};
                    arr_v = new int[]{XX.PjT(arr_s[1]), XX.PjT(arr_s[2])};
                }
                try {
                    double f = Double.parseDouble(s2.substring(s2.indexOf("linear-gradient(") + 1, s2.indexOf("deg")));
                    if(f > 225.0 && f < 315.0) {
                        int v = arr_v[1];
                        arr_v[1] = arr_v[0];
                        arr_v[0] = v;
                    }
                }
                catch(Exception unused_ex) {
                }
                Drawable drawable0 = this.PjT(this.PjT(arr_s[0]), arr_v);
                ((GradientDrawable)drawable0).setShape(0);
                ((GradientDrawable)drawable0).setCornerRadius(com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, this.xf.qla()));
                return drawable0;
            }
            catch(Exception unused_ex) {
                Drawable drawable1 = this.getMutilBackgroundDrawable();
                if(drawable1 != null) {
                    return drawable1;
                }
            }
        }
        Drawable drawable2 = this.getDrawable();
        ((GradientDrawable)drawable2).setShape(0);
        float f1 = com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, this.xf.qla());
        ((GradientDrawable)drawable2).setCornerRadius(f1);
        if(f1 < 1.0f) {
            float f2 = com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, ((float)this.xf.Qf()));
            float f3 = com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, ((float)this.xf.ZX()));
            float f4 = com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, ((float)this.xf.Jo()));
            float f5 = com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, ((float)this.xf.Co()));
            float[] arr_f = new float[8];
            if(f2 > 0.0f) {
                arr_f[0] = f2;
                arr_f[1] = f2;
            }
            if(f3 > 0.0f) {
                arr_f[2] = f3;
                arr_f[3] = f3;
            }
            if(f4 > 0.0f) {
                arr_f[4] = f4;
                arr_f[5] = f4;
            }
            if(f5 > 0.0f) {
                arr_f[6] = f5;
                arr_f[7] = f5;
            }
            ((GradientDrawable)drawable2).setCornerRadii(arr_f);
        }
        ((GradientDrawable)drawable2).setColor((z ? Color.parseColor(s) : this.xf.Yo()));
        if(this.xf.ub() > 0.0f) {
            ((GradientDrawable)drawable2).setStroke(((int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, this.xf.ub())), this.xf.xE());
            return drawable2;
        }
        if(this.xf.gK() > 0) {
            ((GradientDrawable)drawable2).setStroke(this.xf.gK(), this.xf.xE());
            ((GradientDrawable)drawable2).setAlpha(50);
            if(TextUtils.equals(this.xs.DWo().Zh(), "video-vd")) {
                this.setLayerType(1, null);
                return new ltE(((int)f1), this.xf.gK());
            }
        }
        return drawable2;
    }

    protected GradientDrawable.Orientation PjT(String s) {
        try {
            int v = (int)Float.parseFloat(s.substring(0, s.length() - 3));
            if(v <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if(v <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            return v > 270 ? GradientDrawable.Orientation.BOTTOM_TOP : GradientDrawable.Orientation.RIGHT_LEFT;
        }
        catch(Exception unused_ex) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    protected GradientDrawable PjT(GradientDrawable.Orientation gradientDrawable$Orientation0, @ColorInt int[] arr_v) {
        if(arr_v != null) {
            switch(arr_v.length) {
                case 0: {
                    break;
                }
                case 1: {
                    GradientDrawable gradientDrawable0 = new GradientDrawable();
                    gradientDrawable0.setColor(arr_v[0]);
                    return gradientDrawable0;
                }
                default: {
                    return new GradientDrawable(gradientDrawable$Orientation0, arr_v);
                }
            }
        }
        return new GradientDrawable();
    }

    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Zh PjT(Bitmap bitmap0) {
        return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.PjT(bitmap0, null);
    }

    public void PjT(int v) {
        XX xX0 = this.xf;
        if(xX0 == null) {
            return;
        }
        if(!xX0.PjT(v)) {
            return;
        }
        this.SM();
        int v1 = this.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0 != null && this.getChildAt(v2) instanceof JQp) {
                ((JQp)view0).PjT(v);
            }
        }
    }

    protected void PjT(View view0) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("width", ((double)this.xs.Au()));
            jSONObject0.put("height", ((double)this.xs.SM()));
            if(cr.Zh()) {
                String s = this.xf.Zd();
                view0.setTag(com.bytedance.sdk.component.adexpress.dynamic.PjT.Owx, s);
                view0.setTag(com.bytedance.sdk.component.adexpress.dynamic.PjT.RD, this.xs.DWo().Zh());
                view0.setTag(com.bytedance.sdk.component.adexpress.dynamic.PjT.Sks, this.xs.ReZ());
                view0.setTag(com.bytedance.sdk.component.adexpress.dynamic.PjT.tT, jSONObject0.toString());
                return;
            }
            view0.setTag(0x7D06FFDD, this.xf.Zd());
            view0.setTag(0x7D06FFDB, this.xs.DWo().Zh());
            view0.setTag(0x7D06FFDA, this.xs.ReZ());
            view0.setTag(0x7D06FFD9, jSONObject0.toString());
            if(PjT.PjT(this.xf) == 1) {
                view0.setTag(0x7D06FFD3, new Pair(this.xf.cRA(), this.xf.yIW()));
                view0.setTag(0x7D06FFD4, 1);
            }
        }
        catch(JSONException unused_ex) {
        }
    }

    public boolean ReZ() {
        this.SM();
        this.cz();
        this.cr();
        return true;
    }

    public void XX() {
        if(this.Au()) {
            return;
        }
        View view0 = this.qla;
        if(view0 == null) {
            view0 = this;
        }
        this.ub = new Zh(view0, this.xs.DWo().JQp().kWj());
        this.post(new Runnable() {
            final JQp PjT;

            @Override
            public void run() {
                Zh zh0 = JQp.this.ub;
                if(zh0 != null) {
                    zh0.PjT();
                }
            }
        });
    }

    private List Zh(String s) {
        List list0 = new ArrayList();
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        for(int v = 0; v < s.length(); ++v) {
            switch(s.charAt(v)) {
                case 40: {
                    ++v1;
                    z = true;
                    break;
                }
                case 41: {
                    --v1;
                    if(v1 == 0 && z) {
                        list0.add(s.substring(v2, v + 1));
                        v2 = v + 1;
                        z = false;
                    }
                }
            }
        }
        return list0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public void Zh() {
        Zh zh0 = this.ub;
        if(zh0 != null) {
            zh0.Zh();
        }
    }

    protected void Zh(@NonNull View view0) {
        Au au0 = this.xs;
        if(au0 == null) {
            return;
        }
        cz cz0 = au0.DWo().JQp();
        if(cz0 != null) {
            view0.setTag(0x7D06FFDC, Boolean.valueOf(cz0.VZ()));
        }
    }

    protected boolean cr() {
        View.OnClickListener view$OnClickListener0;
        View.OnTouchListener view$OnTouchListener0;
        View view0 = this.qla;
        if(view0 == null) {
            view0 = this;
        }
        if(this.JQp()) {
            view$OnTouchListener0 = (View.OnTouchListener)this.getDynamicClickListener();
            view$OnClickListener0 = (View.OnClickListener)this.getDynamicClickListener();
        }
        else {
            view$OnTouchListener0 = JQp.Sks;
            view$OnClickListener0 = JQp.tT;
        }
        if(view$OnTouchListener0 != null && view$OnClickListener0 != null) {
            view0.setOnTouchListener(view$OnTouchListener0);
            view0.setOnClickListener(view$OnClickListener0);
            switch(PjT.PjT(this.xf)) {
                case 2: 
                case 3: {
                    view0.setOnClickListener(JQp.tT);
                    break;
                }
                default: {
                    view0.setOnClickListener(view$OnClickListener0);
                }
            }
        }
        this.PjT(view0);
        this.Zh(view0);
        return true;
    }

    public void cz() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.XX, this.Au);
        frameLayout$LayoutParams0.topMargin = this.DWo;
        frameLayout$LayoutParams0.leftMargin = this.SM;
        frameLayout$LayoutParams0.setMarginStart(this.SM);
        frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
        this.setLayoutParams(frameLayout$LayoutParams0);
    }

    protected Drawable getBackgroundDrawable() {
        return this.PjT(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.xE;
    }

    public int getClickArea() {
        return this.xf.iZZ();
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.cz.PjT getDynamicClickListener() {
        return this.fDm.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.Au;
    }

    public cz getDynamicLayoutBrickValue() {
        Au au0 = this.xs;
        if(au0 == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.cr.JQp jQp0 = au0.DWo();
        return jQp0 == null ? null : jQp0.JQp();
    }

    public int getDynamicWidth() {
        return this.XX;
    }

    public String getImageObjectFit() {
        return this.xf.oG();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.ltE;
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(this.PjT(this.Zh(this.xf.qZS().replaceAll("/\\*.*\\*/", ""))));
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.Owx;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.XX();
        this.PjT();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.Zh();
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        this.gK.PjT(canvas0, this, this);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        ReZ reZ0 = this.gK;
        View view0 = this.qla;
        if(view0 == null) {
            view0 = this;
        }
        reZ0.PjT(view0, v, v1);
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.ltE = f;
        this.postInvalidate();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.PjT = f;
        this.postInvalidate();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.Zh = f;
        this.postInvalidate();
    }

    public void setShouldInvisible(boolean z) {
        this.xE = z;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.Owx = f;
        this.gK.PjT(this, f);
    }
}

