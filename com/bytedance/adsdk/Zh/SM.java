package com.bytedance.adsdk.Zh;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.Zh.JQp.Sks;
import com.bytedance.adsdk.Zh.cz.ReZ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class SM extends Drawable implements Animatable, Drawable.Callback {
    interface PjT {
        void PjT(XX arg1);
    }

    static enum Zh {
        NONE,
        PLAY,
        RESUME;

    }

    private boolean Au;
    private Rect Co;
    private final ArrayList DWo;
    private boolean IJ;
    private final ReZ JQp;
    private Paint Jo;
    private Canvas KM;
    private boolean Lrd;
    private com.bytedance.adsdk.Zh.ReZ.ReZ.Zh Owx;
    String PjT;
    private Rect Qf;
    private int RD;
    Owx ReZ;
    private Zh SM;
    private boolean Sks;
    private boolean XX;
    private Bitmap Yo;
    private RectF ZX;
    private RectF Zd;
    com.bytedance.adsdk.Zh.ReZ Zh;
    private ltE cRA;
    private XX cr;
    private boolean cz;
    private cr fDm;
    private boolean gK;
    private final Matrix iZZ;
    private Matrix ig;
    private View kph;
    private boolean ltE;
    private RectF qZS;
    private final ValueAnimator.AnimatorUpdateListener qj;
    private com.bytedance.adsdk.Zh.Zh.PjT qla;
    private Matrix rds;
    private boolean tT;
    private boolean ub;
    private Rect wN;
    private Map xE;
    private com.bytedance.adsdk.Zh.Zh.Zh xf;
    private String xs;
    private boolean yIW;

    public SM() {
        ReZ reZ0 = new ReZ();
        this.JQp = reZ0;
        this.cz = true;
        this.XX = false;
        this.Au = false;
        this.SM = Zh.PjT;
        this.DWo = new ArrayList();
        com.bytedance.adsdk.Zh.SM.1 sM$10 = new ValueAnimator.AnimatorUpdateListener() {
            final SM PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                if(SM.this.Owx != null) {
                    SM.this.Owx.PjT(SM.this.JQp.cz());
                }
            }
        };
        this.qj = sM$10;
        this.gK = false;
        this.ltE = true;
        this.RD = 0xFF;
        this.cRA = ltE.PjT;
        this.yIW = false;
        this.iZZ = new Matrix();
        this.IJ = false;
        reZ0.addUpdateListener(sM$10);
    }

    public gK Au() {
        return this.cr == null ? null : this.cr.ReZ();
    }

    public void Au(boolean z) {
        this.JQp.ReZ(z);
    }

    private com.bytedance.adsdk.Zh.Zh.Zh Co() {
        if(this.xf != null && !this.xf.PjT(this.qZS())) {
            this.xf = null;
        }
        if(this.xf == null) {
            this.xf = new com.bytedance.adsdk.Zh.Zh.Zh(this.getCallback(), this.xs, this.fDm, this.cr.xE());
        }
        return this.xf;
    }

    public void DWo() {
        if(this.JQp.isRunning()) {
            this.JQp.cancel();
            if(!this.isVisible()) {
                this.SM = Zh.PjT;
            }
        }
        this.cr = null;
        this.Owx = null;
        this.xf = null;
        this.JQp.Au();
        this.invalidateSelf();
    }

    public Bitmap JQp(String s) {
        com.bytedance.adsdk.Zh.Zh.Zh zh0 = this.Co();
        return zh0 == null ? null : zh0.PjT(s);
    }

    public void JQp(int v) {
        this.JQp.setRepeatCount(v);
    }

    public void JQp(boolean z) {
        this.Lrd = z;
    }

    public boolean JQp() {
        return this.gK;
    }

    // 去混淆评级： 低(20)
    private boolean Jo() {
        return this.cz || this.XX;
    }

    public float KM() {
        return this.JQp.cz();
    }

    public Owx Lrd() {
        return this.ReZ;
    }

    @SuppressLint({"WrongConstant"})
    public int Owx() {
        return this.JQp.getRepeatMode();
    }

    private void PjT(Context context0) {
        XX xX0 = this.cr;
        if(xX0 == null) {
            return;
        }
        com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0 = new com.bytedance.adsdk.Zh.ReZ.ReZ.Zh(this, Sks.PjT(xX0), xX0.xs(), xX0, context0);
        this.Owx = zh0;
        if(this.tT) {
            zh0.PjT(true);
        }
        this.Owx.Zh(this.ltE);
    }

    private void PjT(Canvas canvas0) {
        com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0 = this.Owx;
        XX xX0 = this.cr;
        if(zh0 != null && xX0 != null) {
            this.iZZ.reset();
            Rect rect0 = this.getBounds();
            if(!rect0.isEmpty()) {
                float f = ((float)rect0.width()) / ((float)xX0.cr().width());
                float f1 = ((float)rect0.height()) / ((float)xX0.cr().height());
                this.iZZ.preScale(f, f1);
                this.iZZ.preTranslate(((float)rect0.left), ((float)rect0.top));
            }
            zh0.PjT(canvas0, this.iZZ, this.RD);
        }
    }

    private void PjT(Canvas canvas0, com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0) {
        if(this.cr != null && zh0 != null) {
            this.Zd();
            canvas0.getMatrix(this.ig);
            canvas0.getClipBounds(this.Qf);
            this.PjT(this.Qf, this.ZX);
            this.ig.mapRect(this.ZX);
            this.PjT(this.ZX, this.Qf);
            if(this.ltE) {
                this.Zd.set(0.0f, 0.0f, ((float)this.getIntrinsicWidth()), ((float)this.getIntrinsicHeight()));
            }
            else {
                zh0.PjT(this.Zd, null, false);
            }
            this.ig.mapRect(this.Zd);
            Rect rect0 = this.getBounds();
            float f = ((float)rect0.width()) / ((float)this.getIntrinsicWidth());
            float f1 = ((float)rect0.height()) / ((float)this.getIntrinsicHeight());
            this.PjT(this.Zd, f, f1);
            if(!this.ig()) {
                this.Zd.intersect(((float)this.Qf.left), ((float)this.Qf.top), ((float)this.Qf.right), ((float)this.Qf.bottom));
            }
            int v = (int)Math.ceil(this.Zd.width());
            int v1 = (int)Math.ceil(this.Zd.height());
            if(v != 0 && v1 != 0) {
                this.Zh(v, v1);
                if(this.IJ) {
                    this.iZZ.set(this.ig);
                    this.iZZ.preScale(f, f1);
                    this.iZZ.postTranslate(-this.Zd.left, -this.Zd.top);
                    this.Yo.eraseColor(0);
                    zh0.PjT(this.KM, this.iZZ, this.RD);
                    this.ig.invert(this.rds);
                    this.rds.mapRect(this.qZS, this.Zd);
                    this.PjT(this.qZS, this.wN);
                }
                this.Co.set(0, 0, v, v1);
                canvas0.drawBitmap(this.Yo, this.Co, this.wN, this.Jo);
            }
        }
    }

    private void PjT(Rect rect0, RectF rectF0) {
        rectF0.set(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom));
    }

    private void PjT(RectF rectF0, float f, float f1) {
        rectF0.set(rectF0.left * f, rectF0.top * f1, rectF0.right * f, rectF0.bottom * f1);
    }

    private void PjT(RectF rectF0, Rect rect0) {
        rect0.set(((int)Math.floor(rectF0.left)), ((int)Math.floor(rectF0.top)), ((int)Math.ceil(rectF0.right)), ((int)Math.ceil(rectF0.bottom)));
    }

    public Bitmap PjT(String s, Bitmap bitmap0) {
        com.bytedance.adsdk.Zh.Zh.Zh zh0 = this.Co();
        if(zh0 == null) {
            return null;
        }
        Bitmap bitmap1 = zh0.PjT(s, bitmap0);
        this.invalidateSelf();
        return bitmap1;
    }

    public Typeface PjT(com.bytedance.adsdk.Zh.ReZ.ReZ reZ0) {
        Map map0 = this.xE;
        if(map0 != null) {
            String s = reZ0.PjT();
            if(map0.containsKey(s)) {
                return (Typeface)map0.get(s);
            }
            String s1 = reZ0.Zh();
            if(map0.containsKey(s1)) {
                return (Typeface)map0.get(s1);
            }
            String s2 = reZ0.PjT() + "-" + reZ0.ReZ();
            if(map0.containsKey(s2)) {
                return (Typeface)map0.get(s2);
            }
        }
        com.bytedance.adsdk.Zh.Zh.PjT pjT0 = this.wN();
        return pjT0 == null ? null : pjT0.PjT(reZ0);
    }

    public View PjT() {
        return this.kph;
    }

    // 检测为 Lambda 实现
    public void PjT(float f) [...]

    // 检测为 Lambda 实现
    public void PjT(int v) [...]

    // 检测为 Lambda 实现
    public void PjT(int v, int v1) [...]

    public void PjT(Animator.AnimatorListener animator$AnimatorListener0) {
        this.JQp.addListener(animator$AnimatorListener0);
    }

    public void PjT(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.JQp.addUpdateListener(valueAnimator$AnimatorUpdateListener0);
    }

    public void PjT(View view0) {
        this.kph = view0;
    }

    public void PjT(Owx owx0) {
        this.ReZ = owx0;
    }

    public void PjT(com.bytedance.adsdk.Zh.ReZ reZ0) {
        this.Zh = reZ0;
        com.bytedance.adsdk.Zh.Zh.PjT pjT0 = this.qla;
        if(pjT0 != null) {
            pjT0.PjT(reZ0);
        }
    }

    public void PjT(cr cr0) {
        this.fDm = cr0;
        com.bytedance.adsdk.Zh.Zh.Zh zh0 = this.xf;
        if(zh0 != null) {
            zh0.PjT(cr0);
        }
    }

    public void PjT(ltE ltE0) {
        this.cRA = ltE0;
        this.ZX();
    }

    public void PjT(Boolean boolean0) {
        this.cz = boolean0.booleanValue();
    }

    public void PjT(String s) {
        this.xs = s;
    }

    public void PjT(Map map0) {
        if(map0 == this.xE) {
            return;
        }
        this.xE = map0;
        this.invalidateSelf();
    }

    public void PjT(boolean z) {
        if(z != this.ltE) {
            this.ltE = z;
            com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0 = this.Owx;
            if(zh0 != null) {
                zh0.Zh(z);
            }
            this.invalidateSelf();
        }
    }

    public void PjT(boolean z, Context context0) {
        if(this.ub == z) {
            return;
        }
        this.ub = z;
        if(this.cr != null) {
            this.PjT(context0);
        }
    }

    public boolean PjT(XX xX0, Context context0) {
        if(this.cr == xX0) {
            return false;
        }
        this.IJ = true;
        this.DWo();
        this.cr = xX0;
        this.PjT(context0);
        this.JQp.PjT(xX0);
        this.cr(this.JQp.getAnimatedFraction());
        Iterator iterator0 = new ArrayList(this.DWo).iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            PjT sM$PjT0 = (PjT)object0;
            if(sM$PjT0 != null) {
                sM$PjT0.PjT(xX0);
            }
            iterator0.remove();
        }
        this.DWo.clear();
        xX0.Zh(this.Sks);
        this.ZX();
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 instanceof ImageView) {
            ((ImageView)drawable$Callback0).setImageDrawable(null);
            ((ImageView)drawable$Callback0).setImageDrawable(this);
        }
        return true;
    }

    public RectF Qf() {
        return this.Zd;
    }

    public int RD() {
        return this.JQp.getRepeatCount();
    }

    public void ReZ(float f) {
        this.JQp.ReZ(f);
    }

    // 检测为 Lambda 实现
    public void ReZ(int v) [...]

    // 检测为 Lambda 实现
    public void ReZ(String s) [...]

    public void ReZ(boolean z) {
        this.Sks = z;
        XX xX0 = this.cr;
        if(xX0 != null) {
            xX0.Zh(z);
        }
    }

    public boolean ReZ() {
        return this.ltE;
    }

    public boolean SM() {
        return this.Lrd;
    }

    public boolean Sks() {
        return this.JQp == null ? false : this.JQp.isRunning();
    }

    public void XX(String s) {
        this.PjT = s;
        com.bytedance.adsdk.Zh.Zh.PjT pjT0 = this.wN();
        if(pjT0 != null) {
            pjT0.PjT(s);
        }
    }

    public void XX(boolean z) {
        this.XX = z;
    }

    public boolean XX() {
        return this.yIW;
    }

    public void Yo() {
        this.DWo.clear();
        this.JQp.xs();
        if(!this.isVisible()) {
            this.SM = Zh.PjT;
        }
    }

    private void ZX() {
        XX xX0 = this.cr;
        if(xX0 == null) {
            return;
        }
        this.yIW = this.cRA.PjT(Build.VERSION.SDK_INT, xX0.PjT(), xX0.Zh());
    }

    private void Zd() {
        if(this.KM != null) {
            return;
        }
        this.KM = new Canvas();
        this.Zd = new RectF();
        this.ig = new Matrix();
        this.rds = new Matrix();
        this.Qf = new Rect();
        this.ZX = new RectF();
        this.Jo = new com.bytedance.adsdk.Zh.PjT.PjT();
        this.Co = new Rect();
        this.wN = new Rect();
        this.qZS = new RectF();
    }

    private void Zh(int v, int v1) {
        if(this.Yo != null && this.Yo.getWidth() >= v && this.Yo.getHeight() >= v1) {
            if(this.Yo.getWidth() > v || this.Yo.getHeight() > v1) {
                Bitmap bitmap0 = Bitmap.createBitmap(this.Yo, 0, 0, v, v1);
                this.Yo = bitmap0;
                this.KM.setBitmap(bitmap0);
                this.IJ = true;
            }
            return;
        }
        Bitmap bitmap1 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
        this.Yo = bitmap1;
        this.KM.setBitmap(bitmap1);
        this.IJ = true;
    }

    public com.bytedance.adsdk.Zh.ReZ.ReZ.Zh Zh() {
        return this.Owx;
    }

    // 检测为 Lambda 实现
    public void Zh(float f) [...]

    // 检测为 Lambda 实现
    public void Zh(int v) [...]

    public void Zh(Animator.AnimatorListener animator$AnimatorListener0) {
        this.JQp.removeListener(animator$AnimatorListener0);
    }

    public void Zh(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.JQp.removeUpdateListener(valueAnimator$AnimatorUpdateListener0);
    }

    // 检测为 Lambda 实现
    public void Zh(String s) [...]

    public void Zh(boolean z) {
        this.gK = z;
    }

    public boolean cRA() {
        return this.xE == null && this.ReZ == null && this.cr.fDm().size() > 0;
    }

    public String cr() {
        return this.xs;
    }

    // 检测为 Lambda 实现
    public void cr(float f) [...]

    public void cr(int v) {
        this.JQp.setRepeatMode(v);
    }

    // 检测为 Lambda 实现
    public void cr(String s) [...]

    public void cr(boolean z) {
        if(this.tT == z) {
            return;
        }
        this.tT = z;
        com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0 = this.Owx;
        if(zh0 != null) {
            zh0.PjT(z);
        }
    }

    public DWo cz(String s) {
        return this.cr == null ? null : ((DWo)this.cr.xE().get(s));
    }

    // 去混淆评级： 低(20)
    public ltE cz() {
        return this.yIW ? ltE.ReZ : ltE.Zh;
    }

    public void cz(boolean z) {
        this.Au = z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        JQp.PjT("Drawable#draw");
        try {
            if(this.yIW) {
                this.PjT(canvas0, this.Owx);
            }
            else {
                this.PjT(canvas0);
            }
        }
        catch(Throwable unused_ex) {
        }
        this.IJ = false;
        JQp.Zh("Drawable#draw");
    }

    public float fDm() {
        return this.JQp.qla();
    }

    public void gK() {
        this.JQp.removeAllListeners();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.RD;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.cr == null ? -1 : this.cr.cr().height();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.cr == null ? -1 : this.cr.cr().width();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void iZZ() {
        this.DWo.clear();
        this.JQp.cancel();
        if(!this.isVisible()) {
            this.SM = Zh.PjT;
        }
    }

    private boolean ig() {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(!(drawable$Callback0 instanceof View)) {
            return false;
        }
        ViewParent viewParent0 = ((View)drawable$Callback0).getParent();
        return viewParent0 instanceof ViewGroup && !((ViewGroup)viewParent0).getClipChildren();
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(Drawable drawable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 == null) {
            return;
        }
        drawable$Callback0.invalidateDrawable(this);
    }

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if(this.IJ) {
            return;
        }
        this.IJ = true;
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.Sks();
    }

    public int ltE() {
        return (int)this.JQp.XX();
    }

    private Context qZS() {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 == null) {
            return null;
        }
        return drawable$Callback0 instanceof View ? ((View)drawable$Callback0).getContext() : null;
    }

    // 检测为 Lambda 实现
    public void qj() [...]

    public float qla() {
        return this.JQp.xE();
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 == null) {
            return;
        }
        drawable$Callback0.scheduleDrawable(this, runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.RD = v;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = this.isVisible();
        boolean z3 = super.setVisible(z, z1);
        if(z) {
            Zh sM$Zh0 = this.SM;
            if(sM$Zh0 == Zh.Zh) {
                this.qj();
                return z3;
            }
            if(sM$Zh0 == Zh.ReZ) {
                this.xs();
                return z3;
            }
        }
        else {
            if(this.JQp.isRunning()) {
                this.Yo();
                this.SM = Zh.ReZ;
                return z3;
            }
            if(z2) {
                this.SM = Zh.PjT;
            }
        }
        return z3;
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 instanceof View && ((View)drawable$Callback0).isInEditMode()) {
            return;
        }
        this.qj();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.xf();
    }

    // 去混淆评级： 低(20)
    boolean tT() {
        return this.isVisible() ? this.JQp.isRunning() : this.SM == Zh.Zh || this.SM == Zh.ReZ;
    }

    public void ub() {
        this.JQp.removeAllUpdateListeners();
        this.JQp.addUpdateListener(this.qj);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 == null) {
            return;
        }
        drawable$Callback0.unscheduleDrawable(this, runnable0);
    }

    private com.bytedance.adsdk.Zh.Zh.PjT wN() {
        if(this.getCallback() == null) {
            return null;
        }
        if(this.qla == null) {
            com.bytedance.adsdk.Zh.Zh.PjT pjT0 = new com.bytedance.adsdk.Zh.Zh.PjT(this.getCallback(), this.Zh);
            this.qla = pjT0;
            String s = this.PjT;
            if(s != null) {
                pjT0.PjT(s);
            }
        }
        return this.qla;
    }

    public float xE() {
        return this.JQp.DWo();
    }

    public void xf() {
        this.DWo.clear();
        this.JQp.xf();
        if(!this.isVisible()) {
            this.SM = Zh.PjT;
        }
    }

    // 检测为 Lambda 实现
    public void xs() [...]

    public XX yIW() {
        return this.cr;
    }
}

