package com.bytedance.adsdk.Zh;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

public class cz extends ImageView {
    public interface PjT {
    }

    static class ReZ extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR;
        String JQp;
        String PjT;
        float ReZ;
        int XX;
        int Zh;
        boolean cr;
        int cz;

        static {
            ReZ.CREATOR = new Parcelable.Creator() {
                public ReZ PjT(Parcel parcel0) {
                    return new ReZ(parcel0, null);
                }

                public ReZ[] PjT(int v) {
                    return new ReZ[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.PjT(parcel0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.PjT(v);
                }
            };
        }

        private ReZ(Parcel parcel0) {
            super(parcel0);
            this.PjT = parcel0.readString();
            this.ReZ = parcel0.readFloat();
            this.cr = parcel0.readInt() == 1;
            this.JQp = parcel0.readString();
            this.cz = parcel0.readInt();
            this.XX = parcel0.readInt();
        }

        ReZ(Parcel parcel0, com.bytedance.adsdk.Zh.cz.1 cz$10) {
            this(parcel0);
        }

        ReZ(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeString(this.PjT);
            parcel0.writeFloat(this.ReZ);
            parcel0.writeInt(((int)this.cr));
            parcel0.writeString(this.JQp);
            parcel0.writeInt(this.cz);
            parcel0.writeInt(this.XX);
        }
    }

    public interface Zh {
    }

    static enum cr {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION;

    }

    private String Au;
    private boolean DWo;
    private qj JQp;
    private Zh KM;
    private int Lrd;
    private long Owx;
    private static final String PjT = "cz";
    private PjT Qf;
    private com.bytedance.adsdk.Zh.ReZ.ReZ.ReZ RD;
    private final qj ReZ;
    private int SM;
    private int Sks;
    private final SM XX;
    private final Runnable Yo;
    private static final qj Zh;
    private int cRA;
    private final qj cr;
    private int cz;
    private final Set fDm;
    private int gK;
    private JSONArray iZZ;
    private Handler ltE;
    private boolean qj;
    private xs qla;
    private int tT;
    private final Handler ub;
    private XX xE;
    private boolean xf;
    private final Set xs;
    private String yIW;

    static {
        cz.Zh = new qj() {
            @Override  // com.bytedance.adsdk.Zh.qj
            public void PjT(Object object0) {
            }

            public void PjT(Throwable throwable0) {
                com.bytedance.adsdk.Zh.cz.cz.PjT(throwable0);
            }
        };
    }

    public cz(Context context0) {
        super(context0);
        this.ReZ = new qj() {
            final cz PjT;

            public void PjT(XX xX0) {
                cz.this.setComposition(xX0);
            }

            @Override  // com.bytedance.adsdk.Zh.qj
            public void PjT(Object object0) {
                this.PjT(((XX)object0));
            }
        };
        this.cr = new qj() {
            final cz PjT;

            @Override  // com.bytedance.adsdk.Zh.qj
            public void PjT(Object object0) {
                this.PjT(((Throwable)object0));
            }

            public void PjT(Throwable throwable0) {
                if(cz.this.cz != 0) {
                    cz.this.setImageResource(cz.this.cz);
                }
                (cz.this.JQp == null ? cz.Zh : cz.this.JQp).PjT(throwable0);
            }
        };
        this.cz = 0;
        this.XX = new SM();
        this.DWo = false;
        this.qj = false;
        this.xf = true;
        this.xs = new HashSet();
        this.fDm = new HashSet();
        this.ub = new Handler(Looper.getMainLooper());
        this.gK = 0;
        this.Owx = 0L;
        this.Yo = new Runnable() {
            final cz PjT;

            @Override
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + cz.this.Sks + ", " + cz.this.tT);
                if(cz.this.Sks > cz.this.tT) {
                    cz.gK(cz.this);
                    cz.this.RD.PjT(cz.this.Sks);
                    cz.this.invalidate();
                    cz.this.qla();
                    return;
                }
                if(cz.this.Lrd < 0 || cz.this.cRA < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + cz.this.Lrd + "," + cz.this.cRA);
                }
                else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + cz.this.Lrd);
                    cz.this.PjT();
                    cz.this.setFrame(cz.this.Lrd);
                    com.bytedance.adsdk.Zh.cz.4.1 cz$4$10 = new ValueAnimator.AnimatorUpdateListener() {
                        final com.bytedance.adsdk.Zh.cz.4 PjT;

                        @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                            if(cz.this.getFrame() >= cz.this.cRA - 1 && cz.this.getFrame() < cz.this.cRA + 2) {
                                Log.i("TMe", "--==--- timer end, play anim, endframe: " + cz.this.cRA);
                                cz.this.Zh(this);
                                cz.this.cz();
                            }
                        }
                    };
                    cz.this.PjT(cz$4$10);
                }
                if(TextUtils.isEmpty(cz.this.yIW) && cz.this.iZZ != null) {
                    boolean z = cz.this.iZZ.length() <= 0;
                }
            }
        };
        this.Au();
    }

    static PjT Au(cz cz0) {
        return cz0.Qf;
    }

    private void Au() {
        boolean z = false;
        this.setSaveEnabled(false);
        this.xf = true;
        this.setFallbackResource(0);
        this.setImageAssetsFolder("");
        this.PjT(0.0f, false);
        this.PjT(false, this.getContext().getApplicationContext());
        this.setIgnoreDisabledSystemAnimations(false);
        SM sM0 = this.XX;
        if(com.bytedance.adsdk.Zh.cz.cz.PjT(this.getContext()) != 0.0f) {
            z = true;
        }
        sM0.PjT(Boolean.valueOf(z));
        this.SM();
        this.DWo();
        this.xf();
    }

    private void DWo() {
        this.PjT(new ValueAnimator.AnimatorUpdateListener() {
            final cz PjT;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                Object object0 = valueAnimator0.getAnimatedValue();
                if(object0 instanceof Float && ((float)(((Float)object0))) >= 0.98f) {
                    cz.JQp(cz.this);
                    com.bytedance.adsdk.Zh.XX.PjT xX$PjT0 = cz.this.getGlobalConfig();
                    if(xX$PjT0 != null && (xX$PjT0.cr > 0 && xX$PjT0.cr > cz.this.gK)) {
                        cz.this.fDm();
                        cz.this.PjT();
                        cz.this.setProgress(0.0f);
                        return;
                    }
                    cz.this.Zh(this);
                }
            }
        });
    }

    static int JQp(cz cz0) {
        int v = cz0.gK;
        cz0.gK = v + 1;
        return v;
    }

    public void JQp() {
        this.xs.add(cr.cz);
        this.XX.iZZ();
    }

    private DWo PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        SM sM0 = this.XX;
        if(sM0 != null) {
            XX xX0 = sM0.yIW();
            if(xX0 != null) {
                Map map0 = xX0.xE();
                return map0 == null ? null : ((DWo)map0.get(s));
            }
        }
        return null;
    }

    private com.bytedance.adsdk.Zh.ReZ.ReZ.PjT PjT(MotionEvent motionEvent0) {
        SM sM0 = this.XX;
        if(sM0 == null) {
            return null;
        }
        com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0 = sM0.Zh();
        return zh0 == null ? null : this.PjT(zh0, motionEvent0);
    }

    private com.bytedance.adsdk.Zh.ReZ.ReZ.PjT PjT(com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0, MotionEvent motionEvent0) {
        for(Object object0: zh0.xf()) {
            com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0 = (com.bytedance.adsdk.Zh.ReZ.ReZ.PjT)object0;
            if(pjT0 instanceof com.bytedance.adsdk.Zh.ReZ.ReZ.Zh) {
                if(!pjT0.Au() || pjT0.cz() <= 0.0f) {
                    continue;
                }
                RectF rectF0 = new RectF();
                pjT0.PjT(rectF0, pjT0.cr(), true);
                if(rectF0.width() < 3.0f || rectF0.height() < 3.0f) {
                    continue;
                }
                com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT1 = this.PjT(((com.bytedance.adsdk.Zh.ReZ.ReZ.Zh)pjT0), motionEvent0);
                if(pjT1 == null) {
                    continue;
                }
                return pjT1;
            }
            if(pjT0.Au() && pjT0.cz() > 0.0f) {
                RectF rectF1 = new RectF();
                if(this.XX == null || !this.XX.XX()) {
                    RectF rectF3 = new RectF();
                    pjT0.PjT(rectF3, pjT0.cr(), true);
                    this.Zh(rectF1, rectF3);
                }
                else {
                    pjT0.PjT(rectF1, pjT0.cr(), true);
                    RectF rectF2 = this.XX.Qf();
                    if(rectF2 != null) {
                        this.PjT(rectF1, rectF2);
                    }
                }
                if(this.PjT(motionEvent0, rectF1)) {
                    return pjT0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    private com.bytedance.adsdk.Zh.ReZ.ReZ.ReZ PjT(com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0, String s) {
        for(Object object0: zh0.xf()) {
            com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0 = (com.bytedance.adsdk.Zh.ReZ.ReZ.PjT)object0;
            if(pjT0 instanceof com.bytedance.adsdk.Zh.ReZ.ReZ.Zh) {
                com.bytedance.adsdk.Zh.ReZ.ReZ.ReZ reZ0 = this.PjT(((com.bytedance.adsdk.Zh.ReZ.ReZ.Zh)pjT0), s);
                if(reZ0 == null) {
                    continue;
                }
                return reZ0;
            }
            if(TextUtils.equals(s, pjT0.SM()) && pjT0 instanceof com.bytedance.adsdk.Zh.ReZ.ReZ.ReZ) {
                return (com.bytedance.adsdk.Zh.ReZ.ReZ.ReZ)pjT0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    private xs PjT(int v) {
        if(this.isInEditMode()) {
            return new xs(new Callable() {
                final cz Zh;

                // 去混淆评级： 低(20)
                public xf PjT() throws Exception {
                    return cz.this.xf ? Au.Zh(cz.this.getContext(), v) : Au.Zh(cz.this.getContext(), v, null);
                }

                @Override
                public Object call() throws Exception {
                    return this.PjT();
                }
            }, true);
        }
        return this.xf ? Au.PjT(this.getContext(), v) : Au.PjT(this.getContext(), v, null);
    }

    private void PjT(float f, boolean z) {
        if(z) {
            this.xs.add(cr.Zh);
        }
        this.XX.cr(f);
    }

    private void PjT(long v) {
        com.bytedance.adsdk.Zh.XX.PjT xX$PjT0 = this.getGlobalConfig();
        if(this.Qf != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("duration", v);
            if(xX$PjT0 != null && (xX$PjT0.Zh != null && !xX$PjT0.Zh.isEmpty())) {
                hashMap0.putAll(xX$PjT0.Zh);
            }
        }
    }

    private void PjT(Matrix matrix0, float f, float f1, float f2, float f3) {
        if(f2 / f3 >= f / f1) {
            float f4 = f1 / f3;
            matrix0.preScale(f4, f4);
            matrix0.postTranslate(-((f2 * f4 - f) / 2.0f), 0.0f);
            return;
        }
        float f5 = f / f2;
        matrix0.preScale(f5, f5);
        matrix0.postTranslate(0.0f, -((f3 * f5 - f1) / 2.0f));
    }

    private void PjT(RectF rectF0, RectF rectF1) {
        float f = (float)this.getWidth();
        float f1 = (float)this.getHeight();
        float f2 = rectF1.width();
        float f3 = rectF1.height();
        if(f != 0.0f && f1 != 0.0f && f2 != 0.0f && f3 != 0.0f) {
            Matrix matrix0 = new Matrix();
            switch(com.bytedance.adsdk.Zh.cz.5.PjT[this.getScaleType().ordinal()]) {
                case 1: {
                    this.PjT(matrix0, f, f1, f2, f3);
                    break;
                }
                case 2: {
                    this.Zh(matrix0, f, f1, f2, f3);
                    break;
                }
                case 3: {
                    this.ReZ(matrix0, f, f1, f2, f3);
                    break;
                }
                case 4: {
                    this.cr(matrix0, f, f1, f2, f3);
                }
            }
            matrix0.mapRect(rectF0);
        }
    }

    private void PjT(String s, String s1, JSONArray jSONArray0) {
        com.bytedance.adsdk.Zh.XX.Zh xX$Zh0 = this.getGlobalEvent();
        if(xX$Zh0 != null && s != null) {
            if(TextUtils.isEmpty(s1) && !s.contains("CSJNO")) {
                s1 = xX$Zh0.PjT;
            }
            if((jSONArray0 == null || jSONArray0.length() <= 0) && !s.contains("CSJLELNO")) {
                jSONArray0 = xX$Zh0.ReZ;
            }
        }
        if(TextUtils.isEmpty(s1) && jSONArray0 != null) {
            jSONArray0.length();
        }
    }

    private void PjT(int[][] arr2_v) {
        if(arr2_v != null && arr2_v.length != 0) {
            try {
                int[] arr_v = arr2_v[0];
                int v = arr_v[0];
                int v1 = arr_v[1];
                if(v >= 0 && v1 >= 0) {
                    Log.i("TMe", "--==--- inel enter, play anim, startframe: " + v);
                    this.xE();
                    this.PjT();
                    this.setFrame(v);
                    this.PjT(new ValueAnimator.AnimatorUpdateListener() {
                        final cz Zh;

                        @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                            if(cz.this.getFrame() >= v1 - 1 && cz.this.getFrame() < v1 + 2) {
                                Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + v1 + ", realFrame: " + cz.this.getFrame());
                                cz.this.Zh(this);
                                cz.this.cz();
                            }
                        }
                    });
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private boolean PjT(MotionEvent motionEvent0, RectF rectF0) {
        if(motionEvent0 != null && rectF0 != null) {
            float f = motionEvent0.getX();
            float f1 = motionEvent0.getY();
            return f >= rectF0.left && f <= rectF0.right && f1 >= rectF0.top && f1 <= rectF0.bottom;
        }
        return false;
    }

    public Bitmap PjT(String s, Bitmap bitmap0) {
        return this.XX.PjT(s, bitmap0);
    }

    public void PjT() {
        if(this.Owx == 0L) {
            this.Owx = SystemClock.elapsedRealtime();
        }
        this.xs.add(cr.cz);
        this.XX.qj();
    }

    public void PjT(Animator.AnimatorListener animator$AnimatorListener0) {
        this.XX.PjT(animator$AnimatorListener0);
    }

    public void PjT(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.XX.PjT(valueAnimator$AnimatorUpdateListener0);
    }

    public void PjT(InputStream inputStream0, String s) {
        this.setCompositionTask(Au.PjT(inputStream0, s));
    }

    public void PjT(String s, String s1) {
        this.PjT(new ByteArrayInputStream(s.getBytes()), s1);
    }

    public void PjT(boolean z) {
        this.XX.JQp((z ? -1 : 0));
    }

    public void PjT(boolean z, Context context0) {
        this.XX.PjT(z, context0);
    }

    private com.bytedance.adsdk.Zh.ReZ.ReZ.ReZ ReZ(String s) {
        SM sM0 = this.XX;
        if(sM0 == null) {
            return null;
        }
        com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0 = sM0.Zh();
        return zh0 == null ? null : this.PjT(zh0, s);
    }

    private void ReZ(Matrix matrix0, float f, float f1, float f2, float f3) {
        matrix0.postTranslate((f - f2) / 2.0f, (f1 - f3) / 2.0f);
    }

    public void ReZ() {
        this.XX.gK();
    }

    static Zh SM(cz cz0) {
        return cz0.KM;
    }

    private void SM() {
        this.PjT(new Animator.AnimatorListener() {
            final cz PjT;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                cz.this.Zh(this);
                cz.this.fDm();
                cz.this.qj();
            }
        });
    }

    private xs Zh(String s) {
        if(this.isInEditMode()) {
            return new xs(new Callable() {
                final cz Zh;

                // 去混淆评级： 低(20)
                public xf PjT() throws Exception {
                    return cz.this.xf ? Au.ReZ(cz.this.getContext(), s) : Au.ReZ(cz.this.getContext(), s, null);
                }

                @Override
                public Object call() throws Exception {
                    return this.PjT();
                }
            }, true);
        }
        return this.xf ? Au.Zh(this.getContext(), s) : Au.Zh(this.getContext(), s, null);
    }

    private void Zh(Matrix matrix0, float f, float f1, float f2, float f3) {
        if(f2 < f && f3 < f1) {
            matrix0.postTranslate((f - f2) / 2.0f, (f1 - f3) / 2.0f);
            return;
        }
        if(f2 / f3 >= f / f1) {
            float f4 = f / f2;
            matrix0.preScale(f4, f4);
            matrix0.postTranslate(0.0f, (f1 - f3 * f4) / 2.0f);
            return;
        }
        float f5 = f1 / f3;
        matrix0.preScale(f5, f5);
        matrix0.postTranslate((f - f2 * f5) / 2.0f, 0.0f);
    }

    private void Zh(RectF rectF0, RectF rectF1) {
        float f = (float)this.getWidth();
        float f1 = (float)this.getHeight();
        float f2 = (float)this.XX.getBounds().width();
        float f3 = (float)this.XX.getBounds().height();
        if(f != 0.0f && f1 != 0.0f && f2 != 0.0f && f3 != 0.0f) {
            Matrix matrix0 = new Matrix();
            switch(com.bytedance.adsdk.Zh.cz.5.PjT[this.getScaleType().ordinal()]) {
                case 1: {
                    this.PjT(matrix0, f, f1, f2, f3);
                    break;
                }
                case 2: {
                    this.Zh(matrix0, f, f1, f2, f3);
                    break;
                }
                case 3: {
                    this.ReZ(matrix0, f, f1, f2, f3);
                    break;
                }
                case 4: {
                    this.cr(matrix0, f, f1, f2, f3);
                }
            }
            matrix0.mapRect(rectF0, rectF1);
        }
    }

    public void Zh() {
        this.XX.ub();
    }

    public void Zh(Animator.AnimatorListener animator$AnimatorListener0) {
        this.XX.Zh(animator$AnimatorListener0);
    }

    public void Zh(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.XX.Zh(valueAnimator$AnimatorUpdateListener0);
    }

    private void cr(Matrix matrix0, float f, float f1, float f2, float f3) {
        if(f2 < f && f3 < f1) {
            if(f2 / f3 >= f / f1) {
                float f4 = f / f2;
                matrix0.preScale(f4, f4);
                matrix0.postTranslate(0.0f, (f1 - f3 * f4) / 2.0f);
                return;
            }
            float f5 = f1 / f3;
            matrix0.preScale(f5, f5);
            matrix0.postTranslate((f - f2 * f5) / 2.0f, 0.0f);
            return;
        }
        if(f2 / f3 >= f / f1) {
            float f6 = f / f2;
            matrix0.preScale(f6, f6);
            matrix0.postTranslate(0.0f, (f1 - f3 * f6) / 2.0f);
            return;
        }
        float f7 = f1 / f3;
        matrix0.preScale(f7, f7);
        matrix0.postTranslate((f - f2 * f7) / 2.0f, 0.0f);
    }

    public boolean cr() {
        return this.XX.Sks();
    }

    public void cz() {
        this.qj = false;
        this.XX.Yo();
    }

    private void fDm() {
        int v4;
        int v3;
        int v2;
        if(this.xE != null) {
            SM sM0 = this.XX;
            if(sM0 != null) {
                com.bytedance.adsdk.Zh.XX.ReZ xX$ReZ0 = this.xE.Au();
                if(xX$ReZ0 != null && sM0.Lrd() != null) {
                    int v = xX$ReZ0.PjT;
                    if(v < 0) {
                        Log.i("TMe", "--==--- timer fail, ke is invalid: " + v);
                        return;
                    }
                    int[] arr_v = xX$ReZ0.JQp;
                    int v1 = -1;
                    if(arr_v == null || arr_v.length < 2) {
                        v3 = -1;
                        v2 = -1;
                    }
                    else {
                        v2 = arr_v[0];
                        v3 = arr_v[1];
                    }
                    try {
                        String s = xX$ReZ0.cr;
                        v4 = -1;
                        v4 = Integer.parseInt(xX$ReZ0.ReZ);
                        v1 = Integer.parseInt(s);
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                    Log.i("TMe", "--==--- prepare timer, startS: " + v4 + ", lenS: " + v1);
                    if(!TextUtils.isEmpty(xX$ReZ0.Zh)) {
                        Log.i("TMe", "--==--- timer, id:" + xX$ReZ0.Zh);
                        com.bytedance.adsdk.Zh.ReZ.ReZ.ReZ reZ0 = this.ReZ(xX$ReZ0.Zh);
                        if(reZ0 != null) {
                            Log.i("TMe", "--==--- timer success");
                            this.yIW = xX$ReZ0.cz;
                            this.iZZ = xX$ReZ0.XX;
                            this.RD = reZ0;
                            this.Sks = v4;
                            this.tT = v4 - v1;
                            this.Lrd = v2;
                            this.cRA = v3;
                            reZ0.PjT(this.Sks);
                            this.PjT(new ValueAnimator.AnimatorUpdateListener() {
                                final cz cr;

                                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                                public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                                    if(cz.this.getFrame() >= v - 1 && cz.this.getFrame() < v + 2) {
                                        Log.i("TMe", "--==--- enter timer point, frame: " + cz.this.getFrame());
                                        cz.this.Zh(this);
                                        if(v4 < 0 || v1 < 0) {
                                            Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                                        }
                                        else {
                                            Log.i("TMe", "--==--- enter timer callback, start timer");
                                            cz.this.qla();
                                        }
                                        cz.this.cz();
                                    }
                                }
                            });
                        }
                        return;
                    }
                    Log.i("TMe", "--==--- timer fail, id is invalid: " + xX$ReZ0.Zh);
                }
            }
        }
    }

    static int gK(cz cz0) {
        int v = cz0.Sks;
        cz0.Sks = v - 1;
        return v;
    }

    private void gK() {
        boolean z = this.cr();
        this.setImageDrawable(null);
        this.setImageDrawable(this.XX);
        if(z) {
            this.XX.xs();
        }
    }

    public boolean getClipToCompositionBounds() {
        return this.XX.ReZ();
    }

    public XX getComposition() {
        return this.xE;
    }

    public long getDuration() {
        return this.xE == null ? 0L : ((long)this.xE.JQp());
    }

    public int getFrame() {
        return this.XX.ltE();
    }

    private com.bytedance.adsdk.Zh.XX.PjT getGlobalConfig() {
        SM sM0 = this.XX;
        if(sM0 != null) {
            XX xX0 = sM0.yIW();
            return xX0 == null ? null : xX0.qj();
        }
        return null;
    }

    private com.bytedance.adsdk.Zh.XX.Zh getGlobalEvent() {
        SM sM0 = this.XX;
        if(sM0 != null) {
            XX xX0 = sM0.yIW();
            return xX0 == null ? null : xX0.DWo();
        }
        return null;
    }

    public String getImageAssetsFolder() {
        return this.XX.cr();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.XX.JQp();
    }

    public float getMaxFrame() {
        return this.XX.qla();
    }

    public float getMinFrame() {
        return this.XX.fDm();
    }

    public gK getPerformanceTracker() {
        return this.XX.Au();
    }

    // 去混淆评级： 低(20)
    private String getPlayDelayedELExpressTimeS() {
        return this.XX == null || this.XX.yIW() == null ? null : "";
    }

    public float getProgress() {
        return this.XX.KM();
    }

    public ltE getRenderMode() {
        return this.XX.cz();
    }

    public int getRepeatCount() {
        return this.XX.RD();
    }

    public int getRepeatMode() {
        return this.XX.Owx();
    }

    public float getSpeed() {
        return this.XX.xE();
    }

    @Override  // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable0 = this.getDrawable();
        if(drawable0 instanceof SM && ((SM)drawable0).cz() == ltE.ReZ) {
            this.XX.invalidateSelf();
        }
    }

    @Override  // android.widget.ImageView
    public void invalidateDrawable(Drawable drawable0) {
        Drawable drawable1 = this.getDrawable();
        SM sM0 = this.XX;
        if(drawable1 == sM0) {
            super.invalidateDrawable(sM0);
            return;
        }
        super.invalidateDrawable(drawable0);
    }

    @Override  // android.widget.ImageView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(!this.isInEditMode() && this.qj) {
            this.XX.qj();
        }
    }

    @Override  // android.widget.ImageView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.xE();
        Handler handler0 = this.ltE;
        if(handler0 != null) {
            handler0.removeCallbacksAndMessages(null);
        }
        this.ReZ();
        this.Zh();
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof ReZ)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((ReZ)parcelable0).getSuperState());
        this.Au = ((ReZ)parcelable0).PjT;
        cr cz$cr0 = cr.PjT;
        if(!this.xs.contains(cz$cr0) && !TextUtils.isEmpty(this.Au)) {
            this.setAnimation(this.Au);
        }
        this.SM = ((ReZ)parcelable0).Zh;
        if(!this.xs.contains(cz$cr0)) {
            int v = this.SM;
            if(v != 0) {
                this.setAnimation(v);
            }
        }
        if(!this.xs.contains(cr.Zh)) {
            this.PjT(((ReZ)parcelable0).ReZ, false);
        }
        if(!this.xs.contains(cr.cz) && ((ReZ)parcelable0).cr) {
            this.PjT();
        }
        if(!this.xs.contains(cr.JQp)) {
            this.setImageAssetsFolder(((ReZ)parcelable0).JQp);
        }
        if(!this.xs.contains(cr.ReZ)) {
            this.setRepeatMode(((ReZ)parcelable0).cz);
        }
        if(!this.xs.contains(cr.cr)) {
            this.setRepeatCount(((ReZ)parcelable0).XX);
        }
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new ReZ(super.onSaveInstanceState());
        parcelable0.PjT = this.Au;
        parcelable0.Zh = this.SM;
        parcelable0.ReZ = this.XX.KM();
        parcelable0.cr = this.XX.tT();
        parcelable0.JQp = this.XX.cr();
        parcelable0.cz = this.XX.Owx();
        parcelable0.XX = this.XX.RD();
        return parcelable0;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0 = this.PjT(motionEvent0);
        if(pjT0 != null) {
            String s = pjT0.SM();
            if(pjT0 instanceof com.bytedance.adsdk.Zh.ReZ.ReZ.Zh) {
                return this.getGlobalConfig() == null || this.getGlobalConfig().PjT != 1 ? super.onTouchEvent(motionEvent0) : false;
            }
            if(s != null && s.startsWith("CSJCLOSE")) {
                this.xE();
            }
            DWo dWo0 = this.PjT(pjT0.JQp());
            if(dWo0 != null && motionEvent0.getAction() == 1) {
                this.PjT(s, dWo0.JQp(), dWo0.XX());
                int[][] arr2_v = dWo0.cz();
                if(arr2_v != null) {
                    this.PjT(arr2_v);
                    return s == null || !s.startsWith("CSJNTP") ? super.onTouchEvent(motionEvent0) : false;
                }
                if(this.getGlobalEvent() != null) {
                    int[][] arr2_v1 = this.getGlobalEvent().Zh;
                    if(arr2_v1 != null) {
                        this.PjT(arr2_v1);
                    }
                }
            }
            return s == null || !s.startsWith("CSJNTP") ? super.onTouchEvent(motionEvent0) : false;
        }
        return this.getGlobalConfig() == null || this.getGlobalConfig().PjT != 1 ? super.onTouchEvent(motionEvent0) : false;
    }

    private void qj() {
        com.bytedance.adsdk.Zh.XX.PjT xX$PjT0 = this.getGlobalConfig();
        if(xX$PjT0 != null && xX$PjT0.JQp > 0 && (!TextUtils.isEmpty(xX$PjT0.cz) || xX$PjT0.XX != null)) {
            this.PjT(new ValueAnimator.AnimatorUpdateListener() {
                final cz ReZ;

                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                    Object object0 = valueAnimator0.getAnimatedValue();
                    if(object0 instanceof Float && ((float)(((Float)object0))) >= ((float)(((float)xX$PjT0.JQp) > this.getMaxFrame() ? ((int)this.getMaxFrame()) : xX$PjT0.JQp)) / this.getMaxFrame()) {
                        cz.this.Zh(this);
                    }
                }
            });
        }
    }

    private void qla() {
        this.ub.postDelayed(this.Yo, 1000L);
    }

    public void setAnimation(int v) {
        this.SM = v;
        this.Au = null;
        this.setCompositionTask(this.PjT(v));
    }

    public void setAnimation(String s) {
        this.Au = s;
        this.SM = 0;
        this.setCompositionTask(this.Zh(s));
    }

    public void setAnimationFromJson(String s) {
        this.PjT(s, null);
    }

    public void setAnimationFromUrl(String s) {
        this.setCompositionTask((this.xf ? Au.PjT(this.getContext(), s) : Au.PjT(this.getContext(), s, null)));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.XX.JQp(z);
    }

    public void setCacheComposition(boolean z) {
        this.xf = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.XX.PjT(z);
    }

    public void setComposition(XX xX0) {
        if(JQp.PjT) {
            Log.v("cz", "Set Composition \n" + xX0);
        }
        this.XX.setCallback(this);
        this.xE = xX0;
        this.DWo = true;
        Context context0 = this.getContext().getApplicationContext();
        boolean z = this.XX.PjT(xX0, context0);
        this.DWo = false;
        if(this.getDrawable() == this.XX && !z) {
            return;
        }
        if(!z) {
            this.gK();
        }
        this.onVisibilityChanged(this, this.getVisibility());
        this.requestLayout();
        Iterator iterator0 = this.fDm.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    private void setCompositionTask(xs xs0) {
        this.xs.add(cr.PjT);
        this.ub();
        this.xs();
        this.qla = xs0.PjT(this.ReZ).ReZ(this.cr);
    }

    public void setDefaultFontFileExtension(String s) {
        this.XX.XX(s);
    }

    public void setFailureListener(qj qj0) {
        this.JQp = qj0;
    }

    public void setFallbackResource(int v) {
        this.cz = v;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.Zh.ReZ reZ0) {
        this.XX.PjT(reZ0);
    }

    public void setFontMap(Map map0) {
        this.XX.PjT(map0);
    }

    public void setFrame(int v) {
        this.XX.ReZ(v);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.XX.XX(z);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.Zh.cr cr0) {
        this.XX.PjT(cr0);
    }

    public void setImageAssetsFolder(String s) {
        this.XX.PjT(s);
    }

    @Override  // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap0) {
        this.xs();
        super.setImageBitmap(bitmap0);
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(Drawable drawable0) {
        this.xs();
        super.setImageDrawable(drawable0);
    }

    @Override  // android.widget.ImageView
    public void setImageResource(int v) {
        this.xs();
        super.setImageResource(v);
    }

    public void setLottieAnimListener(PjT cz$PjT0) {
        this.Qf = cz$PjT0;
    }

    public void setLottieClicklistener(Zh cz$Zh0) {
        this.KM = cz$Zh0;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.XX.Zh(z);
    }

    public void setMaxFrame(int v) {
        this.XX.Zh(v);
    }

    public void setMaxFrame(String s) {
        this.XX.ReZ(s);
    }

    public void setMaxProgress(float f) {
        this.XX.Zh(f);
    }

    public void setMinAndMaxFrame(String s) {
        this.XX.cr(s);
    }

    public void setMinFrame(int v) {
        this.XX.PjT(v);
    }

    public void setMinFrame(String s) {
        this.XX.Zh(s);
    }

    public void setMinProgress(float f) {
        this.XX.PjT(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.XX.cr(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.XX.ReZ(z);
    }

    public void setProgress(float f) {
        this.PjT(f, true);
    }

    public void setRenderMode(ltE ltE0) {
        this.XX.PjT(ltE0);
    }

    public void setRepeatCount(int v) {
        this.xs.add(cr.cr);
        this.XX.JQp(v);
    }

    public void setRepeatMode(int v) {
        this.xs.add(cr.ReZ);
        this.XX.cr(v);
    }

    public void setSafeMode(boolean z) {
        this.XX.cz(z);
    }

    public void setSpeed(float f) {
        this.XX.ReZ(f);
    }

    public void setTextDelegate(Owx owx0) {
        this.XX.PjT(owx0);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.XX.Au(z);
    }

    public void setView(View view0) {
        this.XX.PjT(view0);
    }

    private void ub() {
        this.xE = null;
        this.XX.DWo();
    }

    @Override  // android.view.View
    public void unscheduleDrawable(Drawable drawable0) {
        if(!this.DWo && (drawable0 == this.XX && this.XX.Sks())) {
            this.cz();
        }
        else if(!this.DWo && drawable0 instanceof SM && ((SM)drawable0).Sks()) {
            ((SM)drawable0).Yo();
        }
        super.unscheduleDrawable(drawable0);
    }

    private void xE() {
        this.ub.removeCallbacksAndMessages(null);
    }

    private void xf() {
        this.PjT(new Animator.AnimatorListener() {
            final cz PjT;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                long v = SystemClock.elapsedRealtime() - cz.this.Owx;
                cz.this.Zh(this);
                String s = cz.this.getPlayDelayedELExpressTimeS();
                if(!TextUtils.isEmpty(s) && cz.this.XX.Lrd() != null) {
                    try {
                        int v1 = Integer.parseInt(s);
                        if(cz.this.Owx > 0L) {
                            long v2 = cz.this.Owx + ((long)(v1 * 1000)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: " + v2);
                            if(v2 > 0L) {
                                cz.this.cz();
                                cz.this.setVisibility(8);
                                if(cz.this.ltE == null) {
                                    Handler handler0 = new Handler(Looper.getMainLooper());
                                    cz.this.ltE = handler0;
                                }
                                cz.this.ltE.removeCallbacksAndMessages(null);
                                cz.this.ltE.postDelayed(new Runnable() {
                                    final com.bytedance.adsdk.Zh.cz.11 Zh;

                                    @Override
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        cz.this.setVisibility(0);
                                        cz.this.PjT();
                                        cz.this.PjT(v);
                                    }
                                }, v2);
                                return;
                            }
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
                cz.this.PjT(v);
            }
        });
    }

    private void xs() {
        xs xs0 = this.qla;
        if(xs0 != null) {
            xs0.Zh(this.ReZ);
            this.qla.cr(this.cr);
        }
    }

    class com.bytedance.adsdk.Zh.cz.5 {
        static final int[] PjT;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            com.bytedance.adsdk.Zh.cz.5.PjT = arr_v;
            try {
                arr_v[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.Zh.cz.5.PjT[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.Zh.cz.5.PjT[ImageView.ScaleType.CENTER.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.Zh.cz.5.PjT[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

