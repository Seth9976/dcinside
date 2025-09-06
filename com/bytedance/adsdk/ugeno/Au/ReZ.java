package com.bytedance.adsdk.ugeno.Au;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReZ extends ViewGroup {
    static class Au implements Comparator {
        public int PjT(View view0, View view1) {
            com.bytedance.adsdk.ugeno.Au.ReZ.ReZ reZ$ReZ0 = (com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)view0.getLayoutParams();
            com.bytedance.adsdk.ugeno.Au.ReZ.ReZ reZ$ReZ1 = (com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)view1.getLayoutParams();
            boolean z = reZ$ReZ0.PjT;
            if(z != reZ$ReZ1.PjT) {
                return z ? 1 : -1;
            }
            return reZ$ReZ0.JQp - reZ$ReZ1.JQp;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.PjT(((View)object0), ((View)object1));
        }
    }

    public interface JQp {
        void PjT(View arg1, float arg2);
    }

    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    public @interface PjT {
    }

    public static class com.bytedance.adsdk.ugeno.Au.ReZ.ReZ extends ViewGroup.LayoutParams {
        int JQp;
        public boolean PjT;
        float ReZ;
        public int Zh;
        boolean cr;
        int cz;

        public com.bytedance.adsdk.ugeno.Au.ReZ.ReZ() {
            super(-1, -1);
            this.ReZ = 0.0f;
        }

        public com.bytedance.adsdk.ugeno.Au.ReZ.ReZ(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.ReZ = 0.0f;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, ReZ.Zh);
            this.Zh = typedArray0.getInteger(0, 0x30);
            typedArray0.recycle();
        }
    }

    public static class XX extends com.bytedance.adsdk.ugeno.Au.PjT {
        public static final Parcelable.Creator CREATOR;
        Parcelable ReZ;
        int Zh;
        ClassLoader cr;

        static {
            XX.CREATOR = new Parcelable.ClassLoaderCreator() {
                public XX PjT(Parcel parcel0) {
                    return new XX(parcel0, null);
                }

                public XX PjT(Parcel parcel0, ClassLoader classLoader0) {
                    return new XX(parcel0, classLoader0);
                }

                public XX[] PjT(int v) {
                    return new XX[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.PjT(parcel0);
                }

                @Override  // android.os.Parcelable$ClassLoaderCreator
                public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                    return this.PjT(parcel0, classLoader0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.PjT(v);
                }
            };
        }

        XX(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                classLoader0 = this.getClass().getClassLoader();
            }
            this.Zh = parcel0.readInt();
            this.ReZ = parcel0.readParcelable(classLoader0);
            this.cr = classLoader0;
        }

        public XX(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.Zh + "}";
        }

        @Override  // com.bytedance.adsdk.ugeno.Au.PjT
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.Zh);
            parcel0.writeParcelable(this.ReZ, v);
        }
    }

    static class Zh {
        float JQp;
        Object PjT;
        boolean ReZ;
        int Zh;
        float cr;

    }

    public interface cr {
        void DWo(int arg1);

        void PjT(int arg1, float arg2, int arg3);

        void qj(int arg1);
    }

    class cz extends DataSetObserver {
        final ReZ PjT;

        @Override  // android.database.DataSetObserver
        public void onChanged() {
            ReZ.this.Zh();
        }

        @Override  // android.database.DataSetObserver
        public void onInvalidated() {
            ReZ.this.Zh();
        }
    }

    private final Zh Au;
    private int CY;
    private float Co;
    private int DWo;
    private List HG;
    private int IJ;
    private static final Comparator JQp;
    private int Jo;
    private boolean KM;
    private boolean Ld;
    private boolean Lrd;
    private boolean MWx;
    private int OMu;
    private float Owx;
    private int PjT;
    private int Qf;
    private float RD;
    com.bytedance.adsdk.ugeno.Au.Zh ReZ;
    private final Rect SM;
    private int Sks;
    private int VY;
    private final ArrayList XX;
    private cr Xe;
    private int Xtz;
    private boolean Yo;
    private int ZX;
    private float Zd;
    static final int[] Zh;
    private boolean cI;
    private boolean cRA;
    int cr;
    private static final Interpolator cz;
    private EdgeEffect dwk;
    private int fA;
    private boolean fDm;
    private int gK;
    private int iZZ;
    private int ig;
    private List kFP;
    private int kph;
    private int ltE;
    private int oG;
    private float qZS;
    private Parcelable qj;
    private cz qla;
    private VelocityTracker rds;
    private int tT;
    private boolean tY;
    private Drawable ub;
    private static final Au wKV;
    private float wN;
    private int xE;
    private EdgeEffect xH;
    private ClassLoader xf;
    private Scroller xs;
    private JQp xu;
    private boolean yIW;
    private final Runnable yks;
    private ArrayList zYH;
    private cr zZ;

    static {
        ReZ.Zh = new int[]{0x10100B3};
        ReZ.JQp = new Comparator() {
            public int PjT(Zh reZ$Zh0, Zh reZ$Zh1) {
                return reZ$Zh0.Zh - reZ$Zh1.Zh;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.PjT(((Zh)object0), ((Zh)object1));
            }
        };
        ReZ.cz = new Interpolator() {
            @Override  // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
            }
        };
        ReZ.wKV = new Au();
    }

    public ReZ(Context context0) {
        super(context0);
        this.XX = new ArrayList();
        this.Au = new Zh();
        this.SM = new Rect();
        this.DWo = -1;
        this.qj = null;
        this.xf = null;
        this.Owx = -3.402823E+38f;
        this.RD = 3.402823E+38f;
        this.iZZ = 1;
        this.ig = -1;
        this.MWx = true;
        this.Ld = false;
        this.yks = new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                ReZ.this.setScrollState(0);
                ReZ.this.ReZ();
            }
        };
        this.Xtz = 0;
        this.PjT();
    }

    private boolean Au() {
        this.ig = -1;
        this.DWo();
        this.xH.onRelease();
        this.dwk.onRelease();
        return this.xH.isFinished() || this.dwk.isFinished();
    }

    private void DWo() {
        this.Yo = false;
        this.KM = false;
        VelocityTracker velocityTracker0 = this.rds;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.rds = null;
        }
    }

    private void JQp(int v) {
        cr reZ$cr0 = this.zZ;
        if(reZ$cr0 != null) {
            reZ$cr0.DWo(v);
        }
        List list0 = this.HG;
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                cr reZ$cr1 = (cr)this.HG.get(v2);
                if(reZ$cr1 != null) {
                    reZ$cr1.DWo(v);
                }
            }
        }
        cr reZ$cr2 = this.Xe;
        if(reZ$cr2 != null) {
            reZ$cr2.DWo(v);
        }
    }

    boolean JQp() {
        if(this.ReZ != null && this.cr < this.ReZ.PjT() - 1) {
            this.PjT(this.cr + 1, true);
            return true;
        }
        return false;
    }

    private int PjT(int v, float f, int v1, int v2) {
        if(Math.abs(v2) <= this.OMu || Math.abs(v1) <= this.kph) {
            v += (int)(f + (v < this.cr ? 0.6f : 0.4f));
        }
        else if(v1 <= 0) {
            ++v;
        }
        if(this.XX.size() > 0) {
            Zh reZ$Zh0 = (Zh)this.XX.get(0);
            int v3 = Math.min(v, ((Zh)this.XX.get(this.XX.size() - 1)).Zh);
            return Math.max(reZ$Zh0.Zh, v3);
        }
        return v;
    }

    private Rect PjT(Rect rect0, View view0) {
        if(rect0 == null) {
            rect0 = new Rect();
        }
        if(view0 == null) {
            rect0.set(0, 0, 0, 0);
            return rect0;
        }
        rect0.left = view0.getLeft();
        rect0.right = view0.getRight();
        rect0.top = view0.getTop();
        rect0.bottom = view0.getBottom();
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof ViewGroup && viewParent0 != this; viewParent0 = ((ViewGroup)viewParent0).getParent()) {
            rect0.left += ((ViewGroup)viewParent0).getLeft();
            rect0.right += ((ViewGroup)viewParent0).getRight();
            rect0.top += ((ViewGroup)viewParent0).getTop();
            rect0.bottom += ((ViewGroup)viewParent0).getBottom();
        }
        return rect0;
    }

    private void PjT(int v, int v1, int v2, int v3) {
        if(v1 > 0 && !this.XX.isEmpty()) {
            if(!this.xs.isFinished()) {
                this.xs.setFinalX(this.getCurrentItem() * this.getClientWidth());
                return;
            }
            int v4 = this.getPaddingLeft();
            int v5 = this.getPaddingRight();
            int v6 = this.getPaddingLeft();
            int v7 = this.getPaddingRight();
            this.scrollTo(((int)(((float)this.getScrollX()) / ((float)(v1 - v6 - v7 + v3)) * ((float)(v - v4 - v5 + v2)))), this.getScrollY());
            return;
        }
        Zh reZ$Zh0 = this.Zh(this.cr);
        int v8 = (int)((reZ$Zh0 == null ? 0.0f : Math.min(reZ$Zh0.JQp, this.RD)) * ((float)(v - this.getPaddingLeft() - this.getPaddingRight())));
        if(v8 != this.getScrollX()) {
            this.PjT(false);
            this.scrollTo(v8, this.getScrollY());
        }
    }

    private void PjT(int v, boolean z, int v1, boolean z1) {
        Zh reZ$Zh0 = this.Zh(v);
        int v2 = reZ$Zh0 == null ? 0 : ((int)(((float)this.getClientWidth()) * Math.max(this.Owx, Math.min(reZ$Zh0.JQp, this.RD))));
        if(z) {
            this.PjT(v2, 0, v1);
            if(z1) {
                this.JQp(v);
            }
        }
        else {
            if(z1) {
                this.JQp(v);
            }
            this.PjT(false);
            this.scrollTo(v2, 0);
            this.cr(v2);
        }
    }

    private void PjT(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.ig) {
            int v1 = v == 0 ? 1 : 0;
            this.Co = motionEvent0.getX(v1);
            this.ig = motionEvent0.getPointerId(v1);
            VelocityTracker velocityTracker0 = this.rds;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
    }

    private void PjT(Zh reZ$Zh0, int v, Zh reZ$Zh1) {
        int v1 = this.ReZ.PjT();
        int v2 = this.getClientWidth();
        float f = v2 <= 0 ? 0.0f : ((float)this.xE) / ((float)v2);
        if(reZ$Zh1 != null) {
            int v3 = reZ$Zh1.Zh;
            int v4 = reZ$Zh0.Zh;
            if(v3 < v4) {
                float f1 = reZ$Zh1.JQp + reZ$Zh1.cr + f;
                int v5 = v3 + 1;
                int v6 = 0;
                while(v5 <= reZ$Zh0.Zh && v6 < this.XX.size()) {
                    Zh reZ$Zh2;
                    for(reZ$Zh2 = (Zh)this.XX.get(v6); v5 > reZ$Zh2.Zh && v6 < this.XX.size() - 1; reZ$Zh2 = (Zh)this.XX.get(v6)) {
                        ++v6;
                    }
                    while(v5 < reZ$Zh2.Zh) {
                        f1 += this.ReZ.PjT(v5) + f;
                        ++v5;
                    }
                    reZ$Zh2.JQp = f1;
                    f1 += reZ$Zh2.cr + f;
                    ++v5;
                }
            }
            else if(v3 > v4) {
                int v7 = this.XX.size() - 1;
                float f2 = reZ$Zh1.JQp;
                for(int v8 = v3 - 1; v8 >= reZ$Zh0.Zh && v7 >= 0; --v8) {
                    Zh reZ$Zh3;
                    for(reZ$Zh3 = (Zh)this.XX.get(v7); v8 < reZ$Zh3.Zh && v7 > 0; reZ$Zh3 = (Zh)this.XX.get(v7)) {
                        --v7;
                    }
                    while(v8 > reZ$Zh3.Zh) {
                        f2 -= this.ReZ.PjT(v8) + f;
                        --v8;
                    }
                    f2 -= reZ$Zh3.cr + f;
                    reZ$Zh3.JQp = f2;
                }
            }
        }
        int v9 = this.XX.size();
        float f3 = reZ$Zh0.JQp;
        int v10 = reZ$Zh0.Zh - 1;
        this.Owx = reZ$Zh0.Zh == 0 ? f3 : -3.402823E+38f;
        this.RD = reZ$Zh0.Zh == v1 - 1 ? reZ$Zh0.cr + f3 - 1.0f : 3.402823E+38f;
        int v11 = v - 1;
        while(v11 >= 0) {
            Zh reZ$Zh4 = (Zh)this.XX.get(v11);
            while(true) {
                int v12 = reZ$Zh4.Zh;
                if(v10 <= v12) {
                    break;
                }
                f3 -= this.ReZ.PjT(v10) + f;
                --v10;
            }
            f3 -= reZ$Zh4.cr + f;
            reZ$Zh4.JQp = f3;
            if(v12 == 0) {
                this.Owx = f3;
            }
            --v11;
            --v10;
        }
        float f4 = reZ$Zh0.JQp + reZ$Zh0.cr + f;
        int v13 = reZ$Zh0.Zh + 1;
        int v14 = v + 1;
        while(v14 < v9) {
            Zh reZ$Zh5 = (Zh)this.XX.get(v14);
            while(true) {
                int v15 = reZ$Zh5.Zh;
                if(v13 >= v15) {
                    break;
                }
                f4 += this.ReZ.PjT(v13) + f;
                ++v13;
            }
            if(v15 == v1 - 1) {
                this.RD = reZ$Zh5.cr + f4 - 1.0f;
            }
            reZ$Zh5.JQp = f4;
            f4 += reZ$Zh5.cr + f;
            ++v14;
            ++v13;
        }
        this.Ld = false;
    }

    private void PjT(boolean z) {
        boolean z1 = this.Xtz == 2;
        if(z1) {
            this.setScrollingCacheEnabled(false);
            if(!this.xs.isFinished()) {
                this.xs.abortAnimation();
                int v = this.getScrollX();
                int v1 = this.getScrollY();
                int v2 = this.xs.getCurrX();
                int v3 = this.xs.getCurrY();
                if(v != v2 || v1 != v3) {
                    this.scrollTo(v2, v3);
                    if(v2 != v) {
                        this.cr(v2);
                    }
                }
            }
        }
        this.yIW = false;
        for(int v4 = 0; v4 < this.XX.size(); ++v4) {
            Zh reZ$Zh0 = (Zh)this.XX.get(v4);
            if(reZ$Zh0.ReZ) {
                reZ$Zh0.ReZ = false;
                z1 = true;
            }
        }
        if(z1) {
            if(z) {
                this.postOnAnimation(this.yks);
                return;
            }
            this.yks.run();
        }
    }

    private boolean PjT(float f, float f1) {
        return f < ((float)this.ZX) && f1 > 0.0f || f > ((float)(this.getWidth() - this.ZX)) && f1 < 0.0f;
    }

    float PjT(float f) {
        return (float)Math.sin((f - 0.5f) * 0.471239f);
    }

    Zh PjT(int v, int v1) {
        Zh reZ$Zh0 = new Zh();
        reZ$Zh0.Zh = v;
        reZ$Zh0.PjT = this.ReZ.PjT(this, v);
        reZ$Zh0.cr = this.ReZ.PjT(v);
        if(v1 >= 0 && v1 < this.XX.size()) {
            this.XX.add(v1, reZ$Zh0);
            return reZ$Zh0;
        }
        this.XX.add(reZ$Zh0);
        return reZ$Zh0;
    }

    Zh PjT(View view0) {
        for(int v = 0; v < this.XX.size(); ++v) {
            Zh reZ$Zh0 = (Zh)this.XX.get(v);
            if(this.ReZ.PjT(view0, reZ$Zh0.PjT)) {
                return reZ$Zh0;
            }
        }
        return null;
    }

    void PjT() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(0x40000);
        this.setFocusable(true);
        Context context0 = this.getContext();
        this.xs = new Scroller(context0, ReZ.cz);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        float f = context0.getResources().getDisplayMetrics().density;
        this.Jo = viewConfiguration0.getScaledPagingTouchSlop();
        this.kph = (int)(400.0f * f);
        this.IJ = viewConfiguration0.getScaledMaximumFlingVelocity();
        this.xH = new EdgeEffect(context0);
        this.dwk = new EdgeEffect(context0);
        this.OMu = (int)(25.0f * f);
        this.VY = (int)(2.0f * f);
        this.Qf = (int)(f * 16.0f);
    }

    void PjT(int v) {
        String s;
        Zh reZ$Zh3;
        Zh reZ$Zh1;
        Zh reZ$Zh0;
        int v1 = this.cr;
        if(v1 == v) {
            reZ$Zh0 = null;
        }
        else {
            reZ$Zh0 = this.Zh(v1);
            this.cr = v;
        }
        if(this.ReZ == null) {
            this.XX();
            return;
        }
        if(this.yIW) {
            this.XX();
            return;
        }
        if(this.getWindowToken() == null) {
            return;
        }
        int v2 = this.iZZ;
        int v3 = Math.max(0, this.cr - v2);
        int v4 = this.ReZ.PjT();
        int v5 = Math.min(v4 - 1, this.cr + v2);
        if(v4 == this.PjT) {
            int v6 = 0;
            while(true) {
                if(v6 < this.XX.size()) {
                    reZ$Zh1 = (Zh)this.XX.get(v6);
                    int v7 = reZ$Zh1.Zh;
                    int v8 = this.cr;
                    if(v7 < v8) {
                        ++v6;
                        continue;
                    }
                    else if(v7 == v8) {
                        break;
                    }
                }
                reZ$Zh1 = null;
                break;
            }
            if(reZ$Zh1 == null && v4 > 0) {
                reZ$Zh1 = this.PjT(this.cr, v6);
            }
            if(reZ$Zh1 != null) {
                int v9 = v6 - 1;
                Zh reZ$Zh2 = v9 < 0 ? null : ((Zh)this.XX.get(v9));
                int v10 = this.getClientWidth();
                float f = v10 > 0 ? 2.0f - reZ$Zh1.cr + ((float)this.getPaddingLeft()) / ((float)v10) : 0.0f;
                int v11 = this.cr - 1;
                float f1 = 0.0f;
                while(v11 >= 0) {
                    if(f1 < f || v11 >= v3) {
                        if(reZ$Zh2 == null || v11 != reZ$Zh2.Zh) {
                            f1 += this.PjT(v11, v9 + 1).cr;
                            ++v6;
                            if(v9 >= 0) {
                                reZ$Zh3 = (Zh)this.XX.get(v9);
                                goto label_65;
                            }
                        }
                        else {
                            f1 += reZ$Zh2.cr;
                            --v9;
                            if(v9 >= 0) {
                                reZ$Zh3 = (Zh)this.XX.get(v9);
                                goto label_65;
                            }
                        }
                        reZ$Zh3 = null;
                    label_65:
                        reZ$Zh2 = reZ$Zh3;
                    }
                    else {
                        if(reZ$Zh2 == null) {
                            break;
                        }
                        if(v11 == reZ$Zh2.Zh && !reZ$Zh2.ReZ) {
                            this.XX.remove(v9);
                            this.ReZ.PjT(this, v11, reZ$Zh2.PjT);
                            --v9;
                            --v6;
                            reZ$Zh3 = v9 >= 0 ? ((Zh)this.XX.get(v9)) : null;
                            goto label_65;
                        }
                    }
                    --v11;
                }
                float f2 = reZ$Zh1.cr;
                int v12 = v6 + 1;
                if(f2 < 2.0f) {
                    Zh reZ$Zh4 = v12 >= this.XX.size() ? null : ((Zh)this.XX.get(v12));
                    float f3 = v10 > 0 ? ((float)this.getPaddingRight()) / ((float)v10) + 2.0f : 0.0f;
                    int v13 = this.cr;
                    while(true) {
                        ++v13;
                        if(v13 >= v4) {
                            break;
                        }
                        if(f2 >= f3 && v13 > v5) {
                            if(reZ$Zh4 == null) {
                                break;
                            }
                            if(v13 != reZ$Zh4.Zh || reZ$Zh4.ReZ) {
                                continue;
                            }
                            this.XX.remove(v12);
                            this.ReZ.PjT(this, v13, reZ$Zh4.PjT);
                            if(v12 < this.XX.size()) {
                                reZ$Zh4 = (Zh)this.XX.get(v12);
                                continue;
                            }
                        }
                        else if(reZ$Zh4 == null || v13 != reZ$Zh4.Zh) {
                            Zh reZ$Zh5 = this.PjT(v13, v12);
                            ++v12;
                            f2 += reZ$Zh5.cr;
                            if(v12 < this.XX.size()) {
                                reZ$Zh4 = (Zh)this.XX.get(v12);
                                continue;
                            }
                        }
                        else {
                            f2 += reZ$Zh4.cr;
                            ++v12;
                            if(v12 < this.XX.size()) {
                                reZ$Zh4 = (Zh)this.XX.get(v12);
                                continue;
                            }
                        }
                        reZ$Zh4 = null;
                    }
                }
                this.PjT(reZ$Zh1, v6, reZ$Zh0);
            }
            int v14 = this.getChildCount();
            for(int v15 = 0; v15 < v14; ++v15) {
                View view0 = this.getChildAt(v15);
                com.bytedance.adsdk.ugeno.Au.ReZ.ReZ reZ$ReZ0 = (com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)view0.getLayoutParams();
                reZ$ReZ0.cz = v15;
                if(!reZ$ReZ0.PjT && reZ$ReZ0.ReZ == 0.0f) {
                    Zh reZ$Zh6 = this.PjT(view0);
                    if(reZ$Zh6 != null) {
                        reZ$ReZ0.ReZ = reZ$Zh6.cr;
                        reZ$ReZ0.JQp = reZ$Zh6.Zh;
                    }
                }
            }
            this.XX();
            if(this.hasFocus()) {
                View view1 = this.findFocus();
                Zh reZ$Zh7 = view1 == null ? null : this.Zh(view1);
                if(reZ$Zh7 == null || reZ$Zh7.Zh != this.cr) {
                    for(int v16 = 0; v16 < this.getChildCount(); ++v16) {
                        View view2 = this.getChildAt(v16);
                        Zh reZ$Zh8 = this.PjT(view2);
                        if(reZ$Zh8 != null && reZ$Zh8.Zh == this.cr && view2.requestFocus(2)) {
                            break;
                        }
                    }
                }
            }
            return;
        }
        try {
            s = this.getResources().getResourceName(this.getId());
        }
        catch(Resources.NotFoundException unused_ex) {
            s = Integer.toHexString(this.getId());
        }
        throw new IllegalStateException("The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.PjT + ", found: " + v4 + " Pager id: " + s + " Pager class: " + this.getClass() + " Problematic adapter: " + this.ReZ.getClass());
    }

    protected void PjT(int v, float f, int v1) {
        int v9;
        if(this.oG > 0) {
            int v3 = this.getScrollX();
            int v4 = this.getPaddingLeft();
            int v5 = this.getPaddingRight();
            int v6 = this.getWidth();
            int v7 = this.getChildCount();
            for(int v8 = 0; v8 < v7; ++v8) {
                View view0 = this.getChildAt(v8);
                com.bytedance.adsdk.ugeno.Au.ReZ.ReZ reZ$ReZ0 = (com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)view0.getLayoutParams();
                if(reZ$ReZ0.PjT) {
                    switch(reZ$ReZ0.Zh & 7) {
                        case 1: {
                            v9 = v4;
                            v4 = Math.max((v6 - view0.getMeasuredWidth()) / 2, v4);
                            break;
                        }
                        case 3: {
                            v9 = view0.getWidth() + v4;
                            break;
                        }
                        case 5: {
                            int v10 = v6 - v5 - view0.getMeasuredWidth();
                            v5 += view0.getMeasuredWidth();
                            v9 = v4;
                            v4 = v10;
                            break;
                        }
                        default: {
                            v9 = v4;
                        }
                    }
                    int v11 = v4 + v3 - view0.getLeft();
                    if(v11 != 0) {
                        view0.offsetLeftAndRight(v11);
                    }
                    v4 = v9;
                }
            }
        }
        this.Zh(v, f, v1);
        if(this.xu != null) {
            int v12 = this.getScrollX();
            int v13 = this.getChildCount();
            for(int v2 = 0; v2 < v13; ++v2) {
                View view1 = this.getChildAt(v2);
                if(!((com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)view1.getLayoutParams()).PjT) {
                    float f1 = ((float)(view1.getLeft() - v12)) / ((float)this.getClientWidth());
                    this.xu.PjT(view1, f1);
                }
            }
        }
        this.cI = true;
    }

    void PjT(int v, int v1, int v2) {
        int v3;
        if(this.getChildCount() == 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if(this.xs == null || this.xs.isFinished()) {
            v3 = this.getScrollX();
        }
        else {
            v3 = this.fDm ? this.xs.getCurrX() : this.xs.getStartX();
            this.xs.abortAnimation();
            this.setScrollingCacheEnabled(false);
        }
        int v4 = this.getScrollY();
        int v5 = v - v3;
        int v6 = v1 - v4;
        if(v5 == 0 && v6 == 0) {
            this.PjT(false);
            this.ReZ();
            this.setScrollState(0);
            return;
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(2);
        int v7 = this.getClientWidth();
        int v8 = Math.abs(v2);
        this.fDm = false;
        this.xs.startScroll(v3, v4, v5, v6, Math.min((v8 <= 0 ? ((int)((((float)Math.abs(v5)) / (((float)v7) * this.ReZ.PjT(this.cr) + ((float)this.xE)) + 1.0f) * 100.0f)) : Math.round(Math.abs((((float)(v7 / 2)) + this.PjT(Math.min(1.0f, ((float)Math.abs(v5)) * 1.0f / ((float)v7))) * ((float)(v7 / 2))) / ((float)v8)) * 1000.0f) * 4), 600));
        this.postInvalidateOnAnimation();
    }

    public void PjT(int v, boolean z) {
        this.yIW = false;
        this.PjT(v, z, false);
    }

    void PjT(int v, boolean z, boolean z1) {
        this.PjT(v, z, z1, 0);
    }

    void PjT(int v, boolean z, boolean z1, int v1) {
        boolean z2 = false;
        if(this.ReZ != null && this.ReZ.PjT() > 0) {
            if(!z1 && this.cr == v && this.XX.size() != 0) {
                this.setScrollingCacheEnabled(false);
                return;
            }
            if(v < 0) {
                v = 0;
            }
            else if(v >= this.ReZ.PjT()) {
                v = this.ReZ.PjT() - 1;
            }
            if(v > this.cr + this.iZZ || v < this.cr - this.iZZ) {
                for(int v2 = 0; v2 < this.XX.size(); ++v2) {
                    ((Zh)this.XX.get(v2)).ReZ = true;
                }
            }
            if(this.cr != v) {
                z2 = true;
            }
            if(this.MWx) {
                this.cr = v;
                if(z2) {
                    this.JQp(v);
                }
                this.requestLayout();
                return;
            }
            this.PjT(v);
            this.PjT(v, z, v1, z2);
            return;
        }
        this.setScrollingCacheEnabled(false);
    }

    public void PjT(cr reZ$cr0) {
        if(this.HG == null) {
            this.HG = new ArrayList();
        }
        this.HG.add(reZ$cr0);
    }

    public void PjT(boolean z, JQp reZ$JQp0) {
        this.PjT(z, reZ$JQp0, 2);
    }

    public void PjT(boolean z, JQp reZ$JQp0, int v) {
        int v1 = 1;
        boolean z1 = reZ$JQp0 != null != (this.xu != null);
        this.xu = reZ$JQp0;
        this.setChildrenDrawingOrderEnabled(reZ$JQp0 != null);
        if(reZ$JQp0 == null) {
            this.fA = 0;
        }
        else {
            if(z) {
                v1 = 2;
            }
            this.fA = v1;
            this.CY = v;
        }
        if(z1) {
            this.ReZ();
        }
    }

    public boolean PjT(KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 0) {
            switch(keyEvent0.getKeyCode()) {
                case 21: {
                    return keyEvent0.hasModifiers(2) ? this.cr() : this.ReZ(17);
                }
                case 22: {
                    return keyEvent0.hasModifiers(2) ? this.JQp() : this.ReZ(66);
                }
                case 61: {
                    if(keyEvent0.hasNoModifiers()) {
                        return this.ReZ(2);
                    }
                    return keyEvent0.hasModifiers(1) ? this.ReZ(1) : false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    protected boolean PjT(View view0, boolean z, int v, int v1, int v2) {
        if(view0 instanceof ViewGroup) {
            int v3 = view0.getScrollX();
            int v4 = view0.getScrollY();
            for(int v5 = ((ViewGroup)view0).getChildCount() - 1; v5 >= 0; --v5) {
                View view1 = ((ViewGroup)view0).getChildAt(v5);
                int v6 = v1 + v3;
                if(v6 >= view1.getLeft() && v6 < view1.getRight()) {
                    int v7 = v2 + v4;
                    if(v7 >= view1.getTop() && v7 < view1.getBottom() && this.PjT(view1, true, v, v6 - view1.getLeft(), v7 - view1.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view0.canScrollHorizontally(-v);
    }

    private void ReZ(boolean z) {
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(z);
        }
    }

    private static boolean ReZ(View view0) {
        return view0.getClass().getAnnotation(PjT.class) != null;
    }

    void ReZ() {
        this.PjT(this.cr);
    }

    public boolean ReZ(int v) {
        boolean z;
        View view0 = this.findFocus();
        if(view0 == this) {
            view0 = null;
        }
        else if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            while(viewParent0 instanceof ViewGroup) {
                if(viewParent0 == this) {
                    goto label_20;
                }
                viewParent0 = viewParent0.getParent();
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(view0.getClass().getSimpleName());
            for(ViewParent viewParent1 = view0.getParent(); viewParent1 instanceof ViewGroup; viewParent1 = viewParent1.getParent()) {
                stringBuilder0.append(" => ");
                stringBuilder0.append(viewParent1.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder0.toString());
            view0 = null;
        }
    label_20:
        View view1 = FocusFinder.getInstance().findNextFocus(this, view0, v);
        if(view1 == null || view1 == view0) {
            switch(v) {
                case 1: 
                case 17: {
                    z = this.cr();
                    break;
                }
                case 2: 
                case 66: {
                    z = this.JQp();
                    break;
                }
                default: {
                    z = false;
                }
            }
        }
        else if(v != 17) {
            if(v != 66) {
                z = false;
            }
            else if(view0 == null || this.PjT(this.SM, view1).left > this.PjT(this.SM, view0).left) {
                z = view1.requestFocus();
            }
            else {
                z = this.JQp();
            }
        }
        else if(view0 != null && this.PjT(this.SM, view1).left >= this.PjT(this.SM, view0).left) {
            z = this.cr();
        }
        else {
            z = view1.requestFocus();
        }
        if(z) {
            this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(v));
        }
        return z;
    }

    private Zh SM() {
        int v = this.getClientWidth();
        float f = 0.0f;
        float f1 = v <= 0 ? 0.0f : ((float)this.getScrollX()) / ((float)v);
        float f2 = v <= 0 ? 0.0f : ((float)this.xE) / ((float)v);
        Zh reZ$Zh0 = null;
        float f3 = 0.0f;
        int v1 = -1;
        int v2 = 0;
        boolean z = true;
        while(v2 < this.XX.size()) {
            Zh reZ$Zh1 = (Zh)this.XX.get(v2);
            if(!z && reZ$Zh1.Zh != v1 + 1) {
                reZ$Zh1 = this.Au;
                reZ$Zh1.JQp = f + f3 + f2;
                reZ$Zh1.Zh = v1 + 1;
                reZ$Zh1.cr = this.ReZ.PjT(v1 + 1);
                --v2;
            }
            f = reZ$Zh1.JQp;
            float f4 = reZ$Zh1.cr + f + f2;
            if(!z && f1 < f) {
                return reZ$Zh0;
            }
            if(f1 >= f4 && v2 != this.XX.size() - 1) {
                ++v2;
                z = false;
                v1 = reZ$Zh1.Zh;
                f3 = reZ$Zh1.cr;
                reZ$Zh0 = reZ$Zh1;
                continue;
            }
            return reZ$Zh1;
        }
        return reZ$Zh0;
    }

    private void XX() {
        if(this.fA != 0) {
            ArrayList arrayList0 = this.zYH;
            if(arrayList0 == null) {
                this.zYH = new ArrayList();
            }
            else {
                arrayList0.clear();
            }
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = this.getChildAt(v1);
                this.zYH.add(view0);
            }
            Collections.sort(this.zYH, ReZ.wKV);
        }
    }

    private void Zh(int v, float f, int v1) {
        cr reZ$cr0 = this.zZ;
        if(reZ$cr0 != null) {
            reZ$cr0.PjT(v, f, v1);
        }
        List list0 = this.HG;
        if(list0 != null) {
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                cr reZ$cr1 = (cr)this.HG.get(v3);
                if(reZ$cr1 != null) {
                    reZ$cr1.PjT(v, f, v1);
                }
            }
        }
        cr reZ$cr2 = this.Xe;
        if(reZ$cr2 != null) {
            reZ$cr2.PjT(v, f, v1);
        }
    }

    private void Zh(boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = z ? this.CY : 0;
            this.getChildAt(v1).setLayerType(v2, null);
        }
    }

    private boolean Zh(float f) {
        boolean z2;
        boolean z1;
        float f1 = this.Co - f;
        this.Co = f;
        float f2 = ((float)this.getScrollX()) + f1;
        float f3 = (float)this.getClientWidth();
        float f4 = this.Owx * f3;
        float f5 = this.RD * f3;
        boolean z = false;
        Zh reZ$Zh0 = (Zh)this.XX.get(0);
        Zh reZ$Zh1 = (Zh)this.XX.get(this.XX.size() - 1);
        if(reZ$Zh0.Zh == 0) {
            z1 = true;
        }
        else {
            f4 = reZ$Zh0.JQp * f3;
            z1 = false;
        }
        if(reZ$Zh1.Zh == this.ReZ.PjT() - 1) {
            z2 = true;
        }
        else {
            f5 = reZ$Zh1.JQp * f3;
            z2 = false;
        }
        if(f2 < f4) {
            if(z1) {
                this.xH.onPull(Math.abs(f4 - f2) / f3);
                z = true;
            }
            f2 = f4;
        }
        else if(f2 > f5) {
            if(z2) {
                this.dwk.onPull(Math.abs(f2 - f5) / f3);
                z = true;
            }
            f2 = f5;
        }
        this.Co += f2 - ((float)(((int)f2)));
        this.scrollTo(((int)f2), this.getScrollY());
        this.cr(((int)f2));
        return z;
    }

    Zh Zh(int v) {
        for(int v1 = 0; v1 < this.XX.size(); ++v1) {
            Zh reZ$Zh0 = (Zh)this.XX.get(v1);
            if(reZ$Zh0.Zh == v) {
                return reZ$Zh0;
            }
        }
        return null;
    }

    Zh Zh(View view0) {
        ViewParent viewParent0;
        while((viewParent0 = view0.getParent()) != this) {
            if(viewParent0 != null && viewParent0 instanceof View) {
                view0 = (View)viewParent0;
                continue;
            }
            return null;
        }
        return this.PjT(view0);
    }

    void Zh() {
        int v = this.ReZ.PjT();
        this.PjT = v;
        boolean z = this.XX.size() < this.iZZ * 2 + 1 && this.XX.size() < v;
        int v1 = this.cr;
        for(int v2 = 0; v2 < this.XX.size(); ++v2) {
            Zh reZ$Zh0 = (Zh)this.XX.get(v2);
            int v3 = this.ReZ.PjT(reZ$Zh0.PjT);
            if(v3 != -1) {
                if(v3 == -2) {
                    this.XX.remove(v2);
                    --v2;
                    this.ReZ.PjT(this, reZ$Zh0.Zh, reZ$Zh0.PjT);
                    int v4 = this.cr;
                    if(v4 == reZ$Zh0.Zh) {
                        v1 = Math.max(0, Math.min(v4, v - 1));
                    }
                    z = true;
                }
                else {
                    int v5 = reZ$Zh0.Zh;
                    if(v5 != v3) {
                        if(v5 == this.cr) {
                            v1 = v3;
                        }
                        reZ$Zh0.Zh = v3;
                        z = true;
                    }
                }
            }
        }
        Collections.sort(this.XX, ReZ.JQp);
        if(z) {
            int v6 = this.getChildCount();
            for(int v7 = 0; v7 < v6; ++v7) {
                com.bytedance.adsdk.ugeno.Au.ReZ.ReZ reZ$ReZ0 = (com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)this.getChildAt(v7).getLayoutParams();
                if(!reZ$ReZ0.PjT) {
                    reZ$ReZ0.ReZ = 0.0f;
                }
            }
            this.PjT(v1, false, true);
            this.requestLayout();
        }
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        int v2 = arrayList0.size();
        int v3 = this.getDescendantFocusability();
        if(v3 != 0x60000) {
            for(int v4 = 0; v4 < this.getChildCount(); ++v4) {
                View view0 = this.getChildAt(v4);
                if(view0.getVisibility() == 0) {
                    Zh reZ$Zh0 = this.PjT(view0);
                    if(reZ$Zh0 != null && reZ$Zh0.Zh == this.cr) {
                        view0.addFocusables(arrayList0, v, v1);
                    }
                }
            }
        }
        if(v3 == 0x40000 && v2 != arrayList0.size() || !this.isFocusable()) {
            return;
        }
        if((v1 & 1) == 1 && this.isInTouchMode() && !this.isFocusableInTouchMode()) {
            return;
        }
        arrayList0.add(this);
    }

    @Override  // android.view.ViewGroup
    public void addTouchables(ArrayList arrayList0) {
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0.getVisibility() == 0) {
                Zh reZ$Zh0 = this.PjT(view0);
                if(reZ$Zh0 != null && reZ$Zh0.Zh == this.cr) {
                    view0.addTouchables(arrayList0);
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(!this.checkLayoutParams(viewGroup$LayoutParams0)) {
            viewGroup$LayoutParams0 = this.generateLayoutParams(viewGroup$LayoutParams0);
        }
        int v1 = ((com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)viewGroup$LayoutParams0).PjT | ReZ.ReZ(view0);
        ((com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)viewGroup$LayoutParams0).PjT = v1;
        if(this.Lrd) {
            if(v1 != 0) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            ((com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)viewGroup$LayoutParams0).cr = true;
            this.addViewInLayout(view0, v, viewGroup$LayoutParams0);
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public boolean canScrollHorizontally(int v) {
        if(this.ReZ == null) {
            return false;
        }
        int v1 = this.getClientWidth();
        int v2 = this.getScrollX();
        return v >= 0 ? v > 0 && v2 < ((int)(((float)v1) * this.RD)) : v2 > ((int)(((float)v1) * this.Owx));
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof com.bytedance.adsdk.ugeno.Au.ReZ.ReZ && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public void computeScroll() {
        this.fDm = true;
        if(!this.xs.isFinished() && this.xs.computeScrollOffset()) {
            int v = this.getScrollX();
            int v1 = this.getScrollY();
            int v2 = this.xs.getCurrX();
            int v3 = this.xs.getCurrY();
            if(v != v2 || v1 != v3) {
                this.scrollTo(v2, v3);
                if(!this.cr(v2)) {
                    this.xs.abortAnimation();
                    this.scrollTo(0, v3);
                }
            }
            this.postInvalidateOnAnimation();
            return;
        }
        this.PjT(true);
    }

    private boolean cr(int v) {
        if(this.XX.size() == 0) {
            if(this.MWx) {
                return false;
            }
            this.cI = false;
            this.PjT(0, 0.0f, 0);
            if(!this.cI) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        Zh reZ$Zh0 = this.SM();
        int v1 = this.getClientWidth();
        int v2 = v1 + this.xE;
        int v3 = reZ$Zh0.Zh;
        float f = (((float)v) / ((float)v1) - reZ$Zh0.JQp) / (reZ$Zh0.cr + ((float)this.xE) / ((float)v1));
        this.cI = false;
        this.PjT(v3, f, ((int)(((float)v2) * f)));
        if(!this.cI) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    boolean cr() {
        int v = this.cr;
        if(v > 0) {
            this.PjT(v - 1, true);
            return true;
        }
        return false;
    }

    private void cz() {
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(!((com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)this.getChildAt(v).getLayoutParams()).PjT) {
                this.removeViewAt(v);
                --v;
            }
        }
    }

    private void cz(int v) {
        cr reZ$cr0 = this.zZ;
        if(reZ$cr0 != null) {
            reZ$cr0.qj(v);
        }
        List list0 = this.HG;
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                cr reZ$cr1 = (cr)this.HG.get(v2);
                if(reZ$cr1 != null) {
                    reZ$cr1.qj(v);
                }
            }
        }
        cr reZ$cr2 = this.Xe;
        if(reZ$cr2 != null) {
            reZ$cr2.qj(v);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0) || this.PjT(keyEvent0);
    }

    @Override  // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        if(accessibilityEvent0.getEventType() == 0x1000) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent0);
        }
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(view0.getVisibility() == 0) {
                Zh reZ$Zh0 = this.PjT(view0);
                if(reZ$Zh0 != null && reZ$Zh0.Zh == this.cr && view0.dispatchPopulateAccessibilityEvent(accessibilityEvent0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
        int v = this.getOverScrollMode();
        boolean z = false;
        if(v == 0 || v == 1 && (this.ReZ != null && this.ReZ.PjT() > 1)) {
            if(!this.xH.isFinished()) {
                int v1 = canvas0.save();
                int v2 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                int v3 = this.getWidth();
                canvas0.rotate(270.0f);
                canvas0.translate(((float)(this.getPaddingTop() - v2)), this.Owx * ((float)v3));
                this.xH.setSize(v2, v3);
                z = this.xH.draw(canvas0);
                canvas0.restoreToCount(v1);
            }
            if(!this.dwk.isFinished()) {
                int v4 = canvas0.save();
                int v5 = this.getWidth();
                int v6 = this.getHeight();
                int v7 = this.getPaddingTop();
                int v8 = this.getPaddingBottom();
                canvas0.rotate(90.0f);
                canvas0.translate(((float)(-this.getPaddingTop())), -(this.RD + 1.0f) * ((float)v5));
                this.dwk.setSize(v6 - v7 - v8, v5);
                z |= this.dwk.draw(canvas0);
                canvas0.restoreToCount(v4);
            }
        }
        else {
            this.xH.finish();
            this.dwk.finish();
        }
        if(z) {
            this.postInvalidateOnAnimation();
        }
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable0 = this.ub;
        if(drawable0 != null && drawable0.isStateful()) {
            drawable0.setState(this.getDrawableState());
        }
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.bytedance.adsdk.ugeno.Au.ReZ.ReZ();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new com.bytedance.adsdk.ugeno.Au.ReZ.ReZ(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.Au.Zh getAdapter() {
        return this.ReZ;
    }

    @Override  // android.view.ViewGroup
    protected int getChildDrawingOrder(int v, int v1) {
        if(this.fA == 2) {
            v1 = v - 1 - v1;
        }
        return ((com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)((View)this.zYH.get(v1)).getLayoutParams()).cz;
    }

    private int getClientWidth() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }

    public int getCurrentItem() {
        return this.cr;
    }

    public int getOffscreenPageLimit() {
        return this.iZZ;
    }

    public int getPageMargin() {
        return this.xE;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MWx = true;
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.yks);
        if(this.xs != null && !this.xs.isFinished()) {
            this.xs.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        float f4;
        float f2;
        super.onDraw(canvas0);
        if(this.xE > 0 && this.ub != null && this.XX.size() > 0 && this.ReZ != null) {
            int v = this.getScrollX();
            int v1 = this.getWidth();
            float f = ((float)this.xE) / ((float)v1);
            int v2 = 0;
            Zh reZ$Zh0 = (Zh)this.XX.get(0);
            float f1 = reZ$Zh0.JQp;
            int v3 = this.XX.size();
            int v4 = reZ$Zh0.Zh;
            int v5 = ((Zh)this.XX.get(v3 - 1)).Zh;
            while(v4 < v5) {
                while(true) {
                    int v6 = reZ$Zh0.Zh;
                    if(v4 <= v6 || v2 >= v3) {
                        break;
                    }
                    ++v2;
                    reZ$Zh0 = (Zh)this.XX.get(v2);
                }
                if(v4 == v6) {
                    f2 = (reZ$Zh0.JQp + reZ$Zh0.cr) * ((float)v1);
                    f1 = reZ$Zh0.JQp + reZ$Zh0.cr + f;
                }
                else {
                    float f3 = this.ReZ.PjT(v4);
                    f2 = (f1 + f3) * ((float)v1);
                    f1 += f3 + f;
                }
                if(((float)this.xE) + f2 > ((float)v)) {
                    f4 = f;
                    this.ub.setBounds(Math.round(f2), this.gK, Math.round(((float)this.xE) + f2), this.ltE);
                    this.ub.draw(canvas0);
                }
                else {
                    f4 = f;
                }
                if(f2 > ((float)(v + v1))) {
                    break;
                }
                ++v4;
                f = f4;
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        switch(v & 0xFF) {
            case 0: {
                break;
            }
            case 1: 
            case 3: {
                this.Au();
                return false;
            label_5:
                if(this.Yo) {
                    return true;
                }
                if(this.KM) {
                    return false;
                }
                break;
            }
            default: {
                goto label_5;
            }
        }
        switch(v & 0xFF) {
            case 0: {
                float f = motionEvent0.getX();
                this.qZS = f;
                this.Co = f;
                float f1 = motionEvent0.getY();
                this.Zd = f1;
                this.wN = f1;
                this.ig = motionEvent0.getPointerId(0);
                this.KM = false;
                this.fDm = true;
                this.xs.computeScrollOffset();
                if(this.Xtz != 2 || Math.abs(this.xs.getFinalX() - this.xs.getCurrX()) <= this.VY) {
                    this.PjT(false);
                    this.Yo = false;
                }
                else {
                    this.xs.abortAnimation();
                    this.yIW = false;
                    this.ReZ();
                    this.Yo = true;
                    this.ReZ(true);
                    this.setScrollState(1);
                }
                break;
            }
            case 2: {
                int v1 = this.ig;
                if(v1 != -1) {
                    int v2 = motionEvent0.findPointerIndex(v1);
                    if(v2 != -1) {
                        float f2 = motionEvent0.getX(v2);
                        float f3 = f2 - this.Co;
                        float f4 = Math.abs(f3);
                        float f5 = motionEvent0.getY(v2);
                        float f6 = Math.abs(f5 - this.Zd);
                        int v3 = Float.compare(f3, 0.0f);
                        if(v3 != 0 && !this.PjT(this.Co, f3) && this.PjT(this, false, ((int)f3), ((int)f2), ((int)f5))) {
                            this.Co = f2;
                            this.wN = f5;
                            this.KM = true;
                            return false;
                        }
                        int v4 = this.Jo;
                        if(f4 > ((float)v4) && f4 * 0.5f > f6) {
                            this.Yo = true;
                            this.ReZ(true);
                            this.setScrollState(1);
                            float f7 = (float)this.Jo;
                            this.Co = v3 <= 0 ? this.qZS - f7 : this.qZS + f7;
                            this.wN = f5;
                            this.setScrollingCacheEnabled(true);
                        }
                        else if(f6 > ((float)v4)) {
                            this.KM = true;
                        }
                        if(this.Yo && this.Zh(f2)) {
                            this.postInvalidateOnAnimation();
                        }
                    }
                }
                break;
            }
            default: {
                if((v & 0xFF) == 6) {
                    this.PjT(motionEvent0);
                }
            }
        }
        if(this.rds == null) {
            this.rds = VelocityTracker.obtain();
        }
        this.rds.addMovement(motionEvent0);
        return this.Yo;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v17;
        int v15;
        int v4 = this.getChildCount();
        int v5 = v2 - v;
        int v6 = v3 - v1;
        int v7 = this.getPaddingLeft();
        int v8 = this.getPaddingTop();
        int v9 = this.getPaddingRight();
        int v10 = this.getPaddingBottom();
        int v11 = this.getScrollX();
        int v13 = 0;
        for(int v12 = 0; v12 < v4; ++v12) {
            View view0 = this.getChildAt(v12);
            if(view0.getVisibility() != 8) {
                com.bytedance.adsdk.ugeno.Au.ReZ.ReZ reZ$ReZ0 = (com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)view0.getLayoutParams();
                if(reZ$ReZ0.PjT) {
                    int v14 = reZ$ReZ0.Zh & 0x70;
                    switch(reZ$ReZ0.Zh & 7) {
                        case 1: {
                            v15 = v7;
                            v7 = Math.max((v5 - view0.getMeasuredWidth()) / 2, v7);
                            break;
                        }
                        case 3: {
                            v15 = view0.getMeasuredWidth() + v7;
                            break;
                        }
                        case 5: {
                            int v16 = v5 - v9 - view0.getMeasuredWidth();
                            v9 += view0.getMeasuredWidth();
                            v15 = v7;
                            v7 = v16;
                            break;
                        }
                        default: {
                            v15 = v7;
                        }
                    }
                    switch(v14) {
                        case 16: {
                            v17 = v8;
                            v8 = Math.max((v6 - view0.getMeasuredHeight()) / 2, v8);
                            break;
                        }
                        case 0x30: {
                            v17 = view0.getMeasuredHeight() + v8;
                            break;
                        }
                        case 80: {
                            int v18 = v6 - v10 - view0.getMeasuredHeight();
                            v10 += view0.getMeasuredHeight();
                            v17 = v8;
                            v8 = v18;
                            break;
                        }
                        default: {
                            v17 = v8;
                        }
                    }
                    view0.layout(v7 + v11, v8, view0.getMeasuredWidth() + (v7 + v11), v8 + view0.getMeasuredHeight());
                    ++v13;
                    v8 = v17;
                    v7 = v15;
                }
            }
        }
        for(int v19 = 0; v19 < v4; ++v19) {
            View view1 = this.getChildAt(v19);
            if(view1.getVisibility() != 8) {
                com.bytedance.adsdk.ugeno.Au.ReZ.ReZ reZ$ReZ1 = (com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)view1.getLayoutParams();
                if(!reZ$ReZ1.PjT) {
                    Zh reZ$Zh0 = this.PjT(view1);
                    if(reZ$Zh0 != null) {
                        float f = (float)(v5 - v7 - v9);
                        int v20 = ((int)(reZ$Zh0.JQp * f)) + v7;
                        if(reZ$ReZ1.cr) {
                            reZ$ReZ1.cr = false;
                            view1.measure(View.MeasureSpec.makeMeasureSpec(((int)(f * reZ$ReZ1.ReZ)), 0x40000000), View.MeasureSpec.makeMeasureSpec(v6 - v8 - v10, 0x40000000));
                        }
                        view1.layout(v20, v8, view1.getMeasuredWidth() + v20, view1.getMeasuredHeight() + v8);
                    }
                }
            }
        }
        this.gK = v8;
        this.ltE = v6 - v10;
        this.oG = v13;
        if(this.MWx) {
            this.PjT(this.cr, false, 0, false);
        }
        this.MWx = false;
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v11;
        this.setMeasuredDimension(View.getDefaultSize(0, v), View.getDefaultSize(0, v1));
        int v3 = this.getMeasuredWidth();
        this.ZX = Math.min(v3 / 10, this.Qf);
        int v4 = v3 - this.getPaddingLeft() - this.getPaddingRight();
        int v5 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        int v6 = this.getChildCount();
        int v7 = 0;
        while(true) {
            boolean z = true;
            int v8 = 0x40000000;
            if(v7 >= v6) {
                break;
            }
            View view0 = this.getChildAt(v7);
            if(view0.getVisibility() != 8) {
                com.bytedance.adsdk.ugeno.Au.ReZ.ReZ reZ$ReZ0 = (com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)view0.getLayoutParams();
                if(reZ$ReZ0 != null && reZ$ReZ0.PjT) {
                    int v9 = reZ$ReZ0.Zh & 7;
                    boolean z1 = (reZ$ReZ0.Zh & 0x70) == 0x30 || (reZ$ReZ0.Zh & 0x70) == 80;
                    if(v9 != 3 && v9 != 5) {
                        z = false;
                    }
                    int v10 = 0x80000000;
                    if(z1) {
                        v10 = 0x40000000;
                    }
                    else if(z) {
                        v11 = 0x40000000;
                        goto label_27;
                    }
                    v11 = 0x80000000;
                label_27:
                    int v12 = reZ$ReZ0.width;
                    switch(v12) {
                        case -2: {
                            v12 = v4;
                            break;
                        }
                        case -1: {
                            v12 = v4;
                            v10 = 0x40000000;
                            break;
                        }
                        default: {
                            v10 = 0x40000000;
                        }
                    }
                    int v13 = reZ$ReZ0.height;
                    switch(v13) {
                        case -2: {
                            v13 = v5;
                            v8 = v11;
                            break;
                        }
                        case -1: {
                            v13 = v5;
                        }
                    }
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v12, v10), View.MeasureSpec.makeMeasureSpec(v13, v8));
                    if(z1) {
                        v5 -= view0.getMeasuredHeight();
                    }
                    else if(z) {
                        v4 -= view0.getMeasuredWidth();
                    }
                }
            }
            ++v7;
        }
        this.Sks = View.MeasureSpec.makeMeasureSpec(v4, 0x40000000);
        this.tT = View.MeasureSpec.makeMeasureSpec(v5, 0x40000000);
        this.Lrd = true;
        this.ReZ();
        this.Lrd = false;
        int v14 = this.getChildCount();
        for(int v2 = 0; v2 < v14; ++v2) {
            View view1 = this.getChildAt(v2);
            if(view1.getVisibility() != 8) {
                com.bytedance.adsdk.ugeno.Au.ReZ.ReZ reZ$ReZ1 = (com.bytedance.adsdk.ugeno.Au.ReZ.ReZ)view1.getLayoutParams();
                if(reZ$ReZ1 == null || !reZ$ReZ1.PjT) {
                    view1.measure(View.MeasureSpec.makeMeasureSpec(((int)(((float)v4) * reZ$ReZ1.ReZ)), 0x40000000), this.tT);
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int v, Rect rect0) {
        int v4;
        int v3;
        int v2;
        int v1 = this.getChildCount();
        if((v & 2) == 0) {
            v3 = v1 - 1;
            v2 = -1;
            v4 = -1;
        }
        else {
            v2 = v1;
            v3 = 0;
            v4 = 1;
        }
        while(v3 != v2) {
            View view0 = this.getChildAt(v3);
            if(view0.getVisibility() == 0) {
                Zh reZ$Zh0 = this.PjT(view0);
                if(reZ$Zh0 != null && reZ$Zh0.Zh == this.cr && view0.requestFocus(v, rect0)) {
                    return true;
                }
            }
            v3 += v4;
        }
        return false;
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof XX)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((XX)parcelable0).PjT());
        if(this.ReZ != null) {
            this.PjT(((XX)parcelable0).Zh, false, true);
            return;
        }
        this.DWo = ((XX)parcelable0).Zh;
        this.qj = ((XX)parcelable0).ReZ;
        this.xf = ((XX)parcelable0).cr;
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new XX(super.onSaveInstanceState());
        parcelable0.Zh = this.cr;
        if(this.ReZ != null) {
            parcelable0.ReZ = null;
        }
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v != v2) {
            this.PjT(v, v2, this.xE, this.xE);
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = false;
        if(this.tY) {
            return true;
        }
        if(motionEvent0.getAction() == 0 && motionEvent0.getEdgeFlags() != 0) {
            return false;
        }
        if(this.ReZ != null && this.ReZ.PjT() != 0) {
            if(this.rds == null) {
                this.rds = VelocityTracker.obtain();
            }
            this.rds.addMovement(motionEvent0);
            switch(motionEvent0.getAction() & 0xFF) {
                case 0: {
                    this.xs.abortAnimation();
                    this.yIW = false;
                    this.ReZ();
                    float f = motionEvent0.getX();
                    this.qZS = f;
                    this.Co = f;
                    float f1 = motionEvent0.getY();
                    this.Zd = f1;
                    this.wN = f1;
                    this.ig = motionEvent0.getPointerId(0);
                    break;
                }
                case 1: {
                    if(this.Yo) {
                        VelocityTracker velocityTracker0 = this.rds;
                        velocityTracker0.computeCurrentVelocity(1000, ((float)this.IJ));
                        int v = (int)velocityTracker0.getXVelocity(this.ig);
                        this.yIW = true;
                        int v1 = this.getClientWidth();
                        int v2 = this.getScrollX();
                        Zh reZ$Zh0 = this.SM();
                        int v3 = reZ$Zh0.Zh;
                        float f2 = (((float)v2) / ((float)v1) - reZ$Zh0.JQp) / (reZ$Zh0.cr + ((float)this.xE) / ((float)v1));
                        int v4 = motionEvent0.findPointerIndex(this.ig);
                        if(v4 != -1) {
                            this.PjT(this.PjT(v3, f2, v, ((int)(motionEvent0.getX(v4) - this.qZS))), true, true, v);
                            z = this.Au();
                        }
                    }
                    break;
                }
                case 2: {
                    if(this.Yo) {
                    label_55:
                        if(this.Yo) {
                            int v6 = motionEvent0.findPointerIndex(this.ig);
                            if(v6 != -1) {
                                z = this.Zh(motionEvent0.getX(v6));
                            }
                        }
                    }
                    else {
                        int v5 = motionEvent0.findPointerIndex(this.ig);
                        if(v5 == -1) {
                            z = this.Au();
                        }
                        else {
                            float f3 = motionEvent0.getX(v5);
                            float f4 = Math.abs(f3 - this.Co);
                            float f5 = motionEvent0.getY(v5);
                            if(f4 > ((float)this.Jo) && f4 > Math.abs(f5 - this.wN)) {
                                this.Yo = true;
                                this.ReZ(true);
                                this.Co = f3 - this.qZS > 0.0f ? this.qZS + ((float)this.Jo) : this.qZS - ((float)this.Jo);
                                this.wN = f5;
                                this.setScrollState(1);
                                this.setScrollingCacheEnabled(true);
                                ViewParent viewParent0 = this.getParent();
                                if(viewParent0 != null) {
                                    viewParent0.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                            goto label_55;
                        }
                    }
                    break;
                }
                case 3: {
                    if(this.Yo) {
                        this.PjT(this.cr, true, 0, false);
                        z = this.Au();
                    }
                    break;
                }
                case 5: {
                    int v7 = motionEvent0.getActionIndex();
                    if(v7 != -1) {
                        this.Co = motionEvent0.getX(v7);
                        this.ig = motionEvent0.getPointerId(v7);
                    }
                    break;
                }
                case 6: {
                    this.PjT(motionEvent0);
                    int v8 = motionEvent0.findPointerIndex(this.ig);
                    if(v8 != -1) {
                        this.Co = motionEvent0.getX(v8);
                    }
                }
            }
            if(z) {
                this.postInvalidateOnAnimation();
            }
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public void removeView(View view0) {
        if(this.Lrd) {
            this.removeViewInLayout(view0);
            return;
        }
        super.removeView(view0);
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.Au.Zh zh0) {
        com.bytedance.adsdk.ugeno.Au.Zh zh1 = this.ReZ;
        if(zh1 != null) {
            zh1.PjT(null);
            for(int v1 = 0; v1 < this.XX.size(); ++v1) {
                Zh reZ$Zh0 = (Zh)this.XX.get(v1);
                this.ReZ.PjT(this, reZ$Zh0.Zh, reZ$Zh0.PjT);
            }
            this.XX.clear();
            this.cz();
            this.cr = 0;
            this.scrollTo(0, 0);
        }
        this.ReZ = zh0;
        this.PjT = 0;
        if(zh0 != null) {
            if(this.qla == null) {
                this.qla = new cz(this);
            }
            this.ReZ.PjT(this.qla);
            this.yIW = false;
            boolean z = this.MWx;
            this.MWx = true;
            this.PjT = this.ReZ.PjT();
            int v2 = this.DWo;
            if(v2 >= 0) {
                this.PjT(v2, false, true);
                this.DWo = -1;
                this.qj = null;
                this.xf = null;
            }
            else if(z) {
                this.requestLayout();
            }
            else {
                this.ReZ();
            }
        }
        if(this.kFP != null && !this.kFP.isEmpty()) {
            int v3 = this.kFP.size();
            for(int v = 0; v < v3; ++v) {
                this.kFP.get(v);
            }
        }
    }

    public void setCurrentItem(int v) {
        this.yIW = false;
        this.PjT(v, !this.MWx, false);
    }

    public void setOffscreenPageLimit(int v) {
        if(v <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + v + " too small; defaulting to 1");
            v = 1;
        }
        if(v != this.iZZ) {
            this.iZZ = v;
            this.ReZ();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(cr reZ$cr0) {
        this.zZ = reZ$cr0;
    }

    public void setPageMargin(int v) {
        int v1 = this.xE;
        this.xE = v;
        int v2 = this.getWidth();
        this.PjT(v2, v2, v, v1);
        this.requestLayout();
    }

    public void setPageMarginDrawable(int v) {
        this.setPageMarginDrawable(this.getContext().getResources().getDrawable(v));
    }

    public void setPageMarginDrawable(Drawable drawable0) {
        this.ub = drawable0;
        if(drawable0 != null) {
            this.refreshDrawableState();
        }
        this.setWillNotDraw(drawable0 == null);
        this.invalidate();
    }

    void setScrollState(int v) {
        if(this.Xtz == v) {
            return;
        }
        this.Xtz = v;
        if(this.xu != null) {
            this.Zh(v != 0);
        }
        this.cz(v);
    }

    public void setScroller(Scroller scroller0) {
        this.xs = scroller0;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if(this.cRA != z) {
            this.cRA = z;
        }
    }

    @Override  // android.view.View
    protected boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.ub;
    }
}

