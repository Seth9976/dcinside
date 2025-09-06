package com.bytedance.sdk.openadsdk.core.xf.Zh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.Au.tT;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.Qf;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.utils.xf;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import x.b.a;
import x.b.b;
import x.b.d;
import x.c;

@SuppressLint({"ViewConstructor"})
public class cz extends ReZ implements PjT, com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ.PjT, a {
    public interface com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT {
        void PjT(View arg1, int arg2);
    }

    public interface Zh {
        void PjT(boolean arg1, long arg2, long arg3, long arg4, boolean arg5);
    }

    protected ImageView Au;
    private boolean Co;
    protected ImageView DWo;
    private boolean IJ;
    public boolean JQp;
    private long Jo;
    private final boolean KM;
    private boolean Lrd;
    private final AtomicBoolean OMu;
    private String Owx;
    protected final Owx PjT;
    private final Handler Qf;
    private static final Integer RD;
    protected FrameLayout ReZ;
    protected ImageView SM;
    private static final Integer Sks;
    private final ViewTreeObserver.OnScrollChangedListener VY;
    protected RelativeLayout XX;
    private long Yo;
    private boolean ZX;
    private b Zd;
    protected x.b Zh;
    private boolean cRA;
    protected boolean cr;
    public XX cz;
    boolean fDm;
    private boolean gK;
    private boolean iZZ;
    private ViewTreeObserver.OnGlobalLayoutListener ig;
    private final Runnable kph;
    private boolean ltE;
    private View qZS;
    protected boolean qj;
    public Zh qla;
    private final AtomicBoolean rds;
    private String tT;
    private ViewGroup ub;
    private final String wN;
    private final Context xE;
    protected String xf;
    protected int xs;
    private boolean yIW;

    static {
        cz.RD = 0;
        cz.Sks = 1;
    }

    public cz(@NonNull Context context0, @NonNull Owx owx0, XX xX0) {
        this(context0, owx0, false, xX0);
    }

    public cz(@NonNull Context context0, @NonNull Owx owx0, String s, boolean z, boolean z1, XX xX0) {
        this(context0, owx0, false, s, z, z1, xX0);
    }

    public cz(@NonNull Context context0, @NonNull Owx owx0, boolean z, XX xX0) {
        this(context0, owx0, z, "embeded_ad", false, false, xX0);
    }

    public cz(@NonNull Context context0, @NonNull Owx owx0, boolean z, String s, boolean z1, boolean z2, XX xX0) {
        super(context0);
        this.gK = true;
        this.cr = true;
        this.ltE = false;
        this.JQp = false;
        this.Lrd = true;
        this.cRA = false;
        this.yIW = true;
        this.qj = true;
        this.xf = "embeded_ad";
        this.xs = 50;
        this.iZZ = true;
        this.KM = false;
        this.Qf = new KM(fDm.Zh().getLooper(), this);
        this.Co = false;
        this.wN = Build.MODEL;
        this.fDm = false;
        this.rds = new AtomicBoolean(false);
        this.kph = new Runnable() {
            final cz PjT;

            @Override
            public void run() {
                boolean z = cz.this.ZX;
                int v = (int)cz.RD;
                cz.this.PjT(z, v);
            }
        };
        this.IJ = true;
        this.OMu = new AtomicBoolean(false);
        this.VY = () -> {
            long v = SystemClock.elapsedRealtime();
            Handler handler0 = cz.this.Qf;
            if(handler0 != null && v - cz.this.Jo > 500L) {
                cz.this.Jo = v;
                handler0.sendEmptyMessageDelayed(1, 500L);
            }
        };
        try {
            if(owx0.AjB()) {
                this.tT = Build.VERSION.SDK_INT >= 23 ? CacheDirFactory.getICacheDir(0).Zh() : xf.PjT();
            }
        }
        catch(Throwable unused_ex) {
        }
        if(xX0 != null) {
            this.cz = xX0;
        }
        this.xf = s;
        this.xE = context0;
        this.PjT = owx0;
        this.ltE = z;
        this.setContentDescription("NativeVideoTsView");
        this.cRA = z1;
        this.yIW = z2;
        this.Zh();
        this.JQp();
    }

    public boolean Au() {
        return this.gK;
    }

    public void DWo() {
        x.b b0 = this.Zh;
        if(b0 != null) {
            c c0 = b0.xs();
            if(c0 != null) {
                c0.PjT();
                View view0 = c0.ReZ();
                if(view0 != null) {
                    view0.setVisibility(8);
                    if(view0.getParent() != null) {
                        ((ViewGroup)view0.getParent()).removeView(view0);
                    }
                }
            }
        }
    }

    private void JQp() {
        this.addView(this.PjT(this.xE));
        this.gK();
        this.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            final cz PjT;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                cz.this.ub();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                cz.this.ub();
            }
        });
    }

    private void Jo() {
        qZS.JQp(this.SM);
        qZS.JQp(this.XX);
    }

    private boolean KM() {
        int v = this.PjT.joj();
        return 2 == ub.cr().Zh(v);
    }

    private boolean Lrd() {
        return this.PjT == null ? false : this.PjT.Alu();
    }

    private void Owx() {
        x.b b0 = this.Zh;
        if(b0 == null) {
            this.gK();
        }
        else if(b0 instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ && !this.ZX()) {
            ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)this.Zh).gK();
        }
        if(this.Zh != null && this.rds.get()) {
            this.rds.set(false);
            this.Zh();
            if(this.Au()) {
                qZS.PjT(this.XX, 8);
                ImageView imageView0 = this.SM;
                if(imageView0 != null) {
                    qZS.PjT(imageView0, 8);
                }
                if(this.PjT != null && this.PjT.MWx() != null) {
                    com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(this.PjT.hx()).ReZ(), this.PjT);
                    zh0.Zh(this.PjT.dIF());
                    zh0.PjT(this.ub.getWidth());
                    zh0.Zh(this.ub.getHeight());
                    zh0.ReZ(this.PjT.xR());
                    zh0.PjT(0L);
                    zh0.PjT(this.SM());
                    this.PjT(zh0);
                    this.Zh.PjT(zh0);
                    this.Zh.Zh(false);
                }
                return;
            }
            if(this.Zh.qla()) {
                this.Zh.qla();
                this.Zh(true);
                return;
            }
            this.XX();
            qZS.PjT(this.XX, 0);
        }
    }

    private View PjT(Context context0) {
        ViewGroup viewGroup0 = new FrameLayout(context0);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        viewGroup0.setVisibility(8);
        this.ub = viewGroup0;
        FrameLayout frameLayout0 = new FrameLayout(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 17;
        frameLayout0.setLayoutParams(frameLayout$LayoutParams0);
        viewGroup0.addView(frameLayout0);
        this.ReZ = frameLayout0;
        View view0 = new View(context0);
        view0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewGroup0.addView(view0);
        this.qZS = view0;
        return viewGroup0;
    }

    private void PjT(View view0, ViewGroup viewGroup0, View view1) {
        int v = viewGroup0.indexOfChild(view1);
        viewGroup0.removeViewInLayout(view1);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        if(viewGroup$LayoutParams0 != null) {
            viewGroup0.addView(view0, v, viewGroup$LayoutParams0);
            return;
        }
        viewGroup0.addView(view0, v);
    }

    private void PjT(v.b b0) {
        try {
            if(this.PjT.AjB()) {
                b0.PjT(this.tT);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    private void PjT(boolean z, int v) {
        if(this.PjT != null && this.Zh != null) {
            boolean z1 = this.cRA();
            this.yIW();
            if(z1 && this.Zh.qla()) {
                this.Zh.qla();
                this.Zh(true);
                this.cr();
                return;
            }
            if(z && this.Lrd && !this.Zh.qla() && !this.Zh.qj()) {
                if(this.Zh.xf() != null && this.Zh.xf().XX()) {
                    if(this.gK || v == 1) {
                        x.b b0 = this.Zh;
                        if(b0 != null) {
                            this.PjT(b0.fDm(), "changeVideoStatus");
                        }
                        if("ALP-AL00".equals(this.wN)) {
                            this.Zh.Zh();
                        }
                        else {
                            ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)this.Zh).XX(z1);
                        }
                        this.PjT(false);
                        b b$b0 = this.Zd;
                        if(b$b0 != null) {
                            b$b0.h_();
                        }
                    }
                }
                else if(this.gK && this.Zh.xf() == null) {
                    if(!this.rds.get()) {
                        this.rds.set(true);
                    }
                    this.OMu.set(false);
                    this.Owx();
                }
            }
            else if(this.Zh.xf() != null && this.Zh.xf().cz()) {
                this.Zh.PjT();
                this.PjT(true);
                b b$b1 = this.Zd;
                if(b$b1 != null) {
                    b$b1.g_();
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    public com.bytedance.sdk.openadsdk.core.qj.cz PjT(List list0) {
        return this.Zh instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ ? ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)this.Zh).PjT(this, list0) : null;
    }

    @Override  // x.b$a
    public void PjT() {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ$PjT
    public void PjT(int v) {
        this.Zh();
    }

    @Override  // x.b$a
    public void PjT(long v, int v1) {
        b b$b0 = this.Zd;
        if(b$b0 != null) {
            b$b0.i_();
        }
    }

    @Override  // x.b$a
    public void PjT(long v, long v1) {
        b b$b0 = this.Zd;
        if(b$b0 != null) {
            b$b0.PjT(v, v1);
        }
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        if(message0.what == 1) {
            this.tT();
        }
    }

    protected void PjT(boolean z) {
        if(this.SM == null) {
            this.SM = new ImageView(this.getContext());
            if(SM.Zh().gK() == null) {
                this.SM.setImageResource(Lrd.cr(ub.PjT(), "tt_new_play_video"));
            }
            else {
                this.SM.setImageBitmap(SM.Zh().gK());
            }
            this.SM.setScaleType(ImageView.ScaleType.FIT_XY);
            int v = qZS.Zh(this.getContext(), ((float)this.xs));
            int v1 = qZS.Zh(this.getContext(), 10.0f);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v, v);
            frameLayout$LayoutParams0.gravity = 17;
            frameLayout$LayoutParams0.rightMargin = v1;
            frameLayout$LayoutParams0.bottomMargin = v1;
            this.ub.addView(this.SM, frameLayout$LayoutParams0);
            this.SM.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                if(ltE.ReZ(ub.PjT()) == 0) {
                    return;
                }
                if(!cz.this.qj()) {
                    return;
                }
                if(cz.this.Zh.xf() != null && cz.this.Zh.xf().XX()) {
                    cz.this.PjT(true, ((int)cz.Sks));
                    cz.this.Zh();
                    Handler handler0 = cz.this.Qf;
                    if(handler0 != null) {
                        handler0.sendEmptyMessageDelayed(1, 500L);
                    }
                    return;
                }
                if(!cz.this.Au() && !cz.this.OMu.get()) {
                    cz.this.OMu.set(true);
                    cz.this.Jo();
                    if(cz.this.PjT != null && cz.this.PjT.MWx() != null) {
                        cz.this.Jo();
                        cz.this.PjT.MWx();
                        com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(cz.this.PjT.hx()).ReZ(), cz.this.PjT);
                        zh0.Zh(cz.this.PjT.dIF());
                        zh0.PjT(cz.this.ub.getWidth());
                        zh0.Zh(cz.this.ub.getHeight());
                        zh0.ReZ(cz.this.PjT.xR());
                        zh0.PjT(cz.this.Yo);
                        zh0.PjT(cz.this.SM());
                        zh0.PjT(CacheDirFactory.getICacheDir(cz.this.PjT.hx()).ReZ());
                        cz.this.PjT(zh0);
                        cz.this.Zh.PjT(zh0);
                    }
                    Handler handler1 = cz.this.Qf;
                    if(handler1 != null) {
                        handler1.sendEmptyMessageDelayed(1, 500L);
                    }
                    cz.this.PjT(false);
                }
            });
        }
        if(z) {
            this.SM.setVisibility(0);
            return;
        }
        this.SM.setVisibility(8);

        class com.bytedance.sdk.openadsdk.core.xf.Zh.cz.5 implements View.OnClickListener {
            final cz PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                cz.this.fDm();
            }
        }

    }

    public void PjT(boolean z, String s) {
        this.cr = z;
        x.b b0 = this.Zh;
        if(b0 != null) {
            b0.PjT(z, s);
        }
    }

    public boolean PjT(long v, boolean z, boolean z1) {
        boolean z2 = false;
        this.ub.setVisibility(0);
        this.Yo = v;
        if(this.ZX()) {
            this.Zh.PjT(false);
            if(this.PjT != null && this.PjT.MWx() != null) {
                com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(this.PjT.hx()).ReZ(), this.PjT);
                zh0.Zh(this.PjT.dIF());
                zh0.PjT(this.ub.getWidth());
                zh0.Zh(this.ub.getHeight());
                zh0.ReZ(this.PjT.xR());
                zh0.PjT(v);
                zh0.PjT(this.SM());
                this.PjT(zh0);
                if(z1) {
                    this.Zh.Zh(zh0);
                    return true;
                }
                z2 = this.Zh.PjT(zh0);
            }
            int v1 = Long.compare(v, 0L);
            if((v1 > 0 && !z && !z1 || v1 > 0 && z) && this.Zh != null) {
                com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
                qla$PjT0.PjT(this.Zh.JQp());
                qla$PjT0.ReZ(this.Zh.Au());
                qla$PjT0.Zh(this.Zh.cz());
                com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.Zh(this.Zh.xs(), qla$PjT0);
            }
            return z2;
        }
        return true;
    }

    private boolean Qf() {
        int v = this.PjT.joj();
        return 5 == ub.cr().Zh(v);
    }

    private void RD() {
        this.qla = null;
        if(this.Zh instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ && !this.ZX()) {
            ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)this.Zh).Jo();
        }
        this.DWo();
        this.PjT(false);
        this.Sks();
    }

    // 检测为 Lambda 实现
    protected void ReZ() [...]

    public boolean SM() {
        return this.cr;
    }

    private void Sks() {
        if(!this.rds.get()) {
            this.rds.set(true);
            x.b b0 = this.Zh;
            if(b0 != null) {
                b0.PjT(true, 3);
            }
        }
        this.OMu.set(false);
    }

    public void XX() {
        if(this.xE != null && (this.qZS != null && this.qZS.getParent() != null && this.PjT != null && this.XX == null)) {
            ViewParent viewParent0 = this.qZS.getParent();
            RelativeLayout relativeLayout0 = this.Zh(this.xE);
            if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                this.PjT(relativeLayout0, ((ViewGroup)viewParent0), this.qZS);
            }
            this.XX = relativeLayout0;
            if(this.qj) {
                qZS.PjT(this.DWo, 0);
            }
            if(this.PjT.MWx() != null && this.PjT.MWx().c() != null) {
                com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(this.PjT.MWx().c(), this.PjT.MWx().o(), this.PjT.MWx().w(), this.Au, this.PjT);
            }
            ImageView imageView0 = this.DWo;
            if(imageView0 != null) {
                imageView0.setClickable(true);
                this.DWo.setOnClickListener((/* 缺少LAMBDA参数 */) -> if(!cz.this.xf()) {
                    cz.this.fDm();
                });
            }
        }

        class com.bytedance.sdk.openadsdk.core.xf.Zh.cz.2 implements View.OnClickListener {
            final cz PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                cz.this.ReZ();
            }
        }

    }

    private void Yo() {
        if(this.Zh != null && !this.ZX() && (!this.Lrd() || com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_is_update_flag", false)) && this.Lrd()) {
            long v = this.Zh.Au();
            long v1 = this.Zh.cz();
            boolean z = com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_native_video_complete", false);
            long v2 = com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long v3 = com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_total_play_duration", v1 + v);
            long v4 = com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_duration", v);
            com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.Zh.Zh(z);
            this.Zh.PjT(v2);
            this.Zh.Zh(v3);
            this.Zh.ReZ(v4);
        }
    }

    private boolean ZX() {
        return this.ltE;
    }

    private RelativeLayout Zh(Context context0) {
        RelativeLayout relativeLayout0 = new com.bytedance.sdk.openadsdk.core.JQp.XX(context0);
        ((com.bytedance.sdk.openadsdk.core.JQp.XX)relativeLayout0).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout0.setVisibility(8);
        cr cr0 = new cr(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout$LayoutParams0.addRule(13);
        cr0.setLayoutParams(relativeLayout$LayoutParams0);
        cr0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.Au = cr0;
        cr cr1 = new cr(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(13);
        cr1.setLayoutParams(relativeLayout$LayoutParams1);
        cr1.setVisibility(8);
        cr1.setBackground(Lrd.ReZ(context0, "tt_new_play_video"));
        this.DWo = cr1;
        relativeLayout0.addView(cr0);
        relativeLayout0.addView(cr1);
        return relativeLayout0;
    }

    protected void Zh() {
        Owx owx0 = this.PjT;
        if(owx0 == null) {
            return;
        }
        int v = owx0.joj();
        int v1 = ub.cr().Zh(v);
        int v2 = ltE.ReZ(ub.PjT());
        switch(v1) {
            case 1: {
                this.gK = wN.cr(v2);
                break;
            }
            case 2: {
                this.gK = wN.JQp(v2) || wN.cr(v2) || wN.cz(v2);
                break;
            }
            case 3: {
                this.gK = false;
                break;
            }
            case 4: {
                this.fDm = true;
                break;
            }
            case 5: {
                this.gK = wN.cr(v2) || wN.cz(v2);
            }
        }
        if(this.ltE) {
            this.cr = false;
        }
        else if(!this.JQp || !tT.Zh(this.xf)) {
            this.cr = ub.cr().ReZ(String.valueOf(v));
        }
        if("open_ad".equals(this.xf)) {
            this.gK = true;
            this.cr = true;
        }
        x.b b0 = this.Zh;
        if(b0 != null) {
            b0.ReZ(this.gK);
        }
        this.JQp = true;
    }

    @Override  // x.b$a
    public void Zh(long v, int v1) {
    }

    public void Zh(boolean z) {
        x.b b0 = this.Zh;
        if(b0 != null) {
            b0.Zh(z);
            c c0 = this.Zh.xs();
            if(c0 != null) {
                c0.Zh();
                View view0 = c0.ReZ();
                if(view0 != null) {
                    if(view0.getParent() != null) {
                        ((ViewGroup)view0.getParent()).removeView(view0);
                    }
                    view0.setVisibility(0);
                    this.addView(view0);
                    WeakReference weakReference0 = new WeakReference(this.xE);
                    c0.PjT(this.PjT, weakReference0, false);
                }
            }
        }
    }

    private boolean cRA() {
        if(!this.ZX() && this.Lrd()) {
            boolean z = com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
            return com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || z;
        }
        return false;
    }

    private void cr() {
        this.PjT(0L, 0);
        this.Zd = null;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ$PjT
    public void cz() {
        b b$b0 = this.Zd;
        if(b$b0 != null) {
            b$b0.d_();
        }
    }

    // 检测为 Lambda 实现
    public void fDm() [...]

    private void gK() {
        this.Zh = new com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ(this.xE, this.ReZ, this.PjT, this.xf, !this.ZX(), this.cRA, this.yIW, this.cz);
        this.ltE();
        if(this.ig == null) {
            this.ig = new ViewTreeObserver.OnGlobalLayoutListener() {
                final cz PjT;

                @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if(cz.this.ub != null && cz.this.ub.getViewTreeObserver() != null) {
                        cz cz0 = cz.this;
                        x.b b0 = cz0.Zh;
                        if(b0 != null) {
                            ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)b0).PjT(cz0.ub.getWidth(), cz.this.ub.getHeight());
                            cz.this.ub.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            cz.this.ig = null;
                        }
                    }
                }
            };
            this.ub.getViewTreeObserver().addOnGlobalLayoutListener(this.ig);
        }
    }

    public double getCurrentPlayTime() {
        return this.Zh == null ? 0.0 : ((double)this.Zh.JQp()) * 1.0 / 1000.0;
    }

    public x.b getNativeVideoController() {
        return this.Zh;
    }

    private void iZZ() {
        this.Qf.removeMessages(1);
        fDm.ReZ().removeCallbacks(this.kph);
    }

    private void ltE() {
        x.b b0 = this.Zh;
        if(b0 == null) {
            return;
        }
        b0.ReZ(this.gK);
        ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)this.Zh).PjT(this);
        this.Zh.PjT(this);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Owx();
        this.getViewTreeObserver().addOnScrollChangedListener(this.VY);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.RD();
        ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
        if(viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeOnScrollChangedListener(this.VY);
        }
        ViewGroup viewGroup0 = this.ub;
        if(viewGroup0 != null && this.ig != null) {
            ViewTreeObserver viewTreeObserver1 = viewGroup0.getViewTreeObserver();
            if(viewTreeObserver1.isAlive()) {
                viewTreeObserver1.removeOnGlobalLayoutListener(this.ig);
                this.ig = null;
            }
        }
    }

    @Override  // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.Owx();
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(!this.ltE) {
            Zh cz$Zh0 = this.qla;
            if(cz$Zh0 != null) {
                x.b b0 = this.Zh;
                if(b0 != null) {
                    cz$Zh0.PjT(b0.qla(), this.Zh.Au(), this.Zh.SM(), this.Zh.JQp(), this.gK);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.RD();
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        if("open_ad".equals(this.xf)) {
            this.iZZ();
        }
        else {
            this.Lrd = z;
            super.onWindowFocusChanged(z);
            com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(this.PjT, z);
            this.Yo();
            if(this.cRA() && (this.Zh != null && this.Zh.qla())) {
                this.yIW();
                qZS.PjT(this.XX, 8);
                this.Zh(true);
                this.cr();
                return;
            }
            this.Zh();
            if(this.ZX() || !this.Au() || (this.Zh == null || this.Zh.qj())) {
                if(!this.Au()) {
                    if(!z && (this.Zh != null && this.Zh.xf() != null && this.Zh.xf().cz())) {
                        this.iZZ();
                        this.PjT(false, ((int)cz.RD));
                        return;
                    }
                    if(z) {
                        this.Qf.obtainMessage(1).sendToTarget();
                    }
                }
            }
            else if(this.Qf != null) {
                if(z && (this.Zh != null && !this.Zh.qla())) {
                    this.Qf.obtainMessage(1).sendToTarget();
                    return;
                }
                this.iZZ();
                this.PjT(false, ((int)cz.RD));
            }
        }
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.Yo();
        if(this.IJ) {
            this.IJ = v == 0;
        }
        if(this.cRA() && (this.Zh != null && this.Zh.qla())) {
            this.yIW();
            qZS.PjT(this.XX, 8);
            this.Zh(true);
            this.cr();
            return;
        }
        this.Zh();
        if(!this.ZX() && this.Au() && (this.Zh != null && !this.Zh.qj())) {
            Owx owx0 = this.PjT;
            if(owx0 != null) {
                if(this.iZZ && owx0.MWx() != null) {
                    this.PjT.MWx();
                    com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(this.PjT.hx()).ReZ(), this.PjT);
                    zh0.Zh(this.PjT.dIF());
                    zh0.PjT(this.ub.getWidth());
                    zh0.Zh(this.ub.getHeight());
                    zh0.ReZ(this.PjT.xR());
                    zh0.PjT(this.Yo);
                    zh0.PjT(this.SM());
                    this.PjT(zh0);
                    this.Zh.PjT(zh0);
                    this.iZZ = false;
                    qZS.PjT(this.XX, 8);
                }
                if(v == 0 && this.Qf != null && (this.Zh != null && !this.Zh.qla())) {
                    this.Qf.obtainMessage(1).sendToTarget();
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    boolean qj() {
        return tT.Zh(this.xf) ? Qf.PjT(this, 50, 1) : Qf.PjT(this, 50, 5);
    }

    public void qla() {
        if(this.PjT != null && this.PjT.QB() != null) {
            this.PjT.QB().qla();
            this.PjT.QB().PjT().JQp(this.Yo);
        }
    }

    public void setAdCreativeClickListener(com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT cz$PjT0) {
        x.b b0 = this.Zh;
        if(b0 != null) {
            ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)b0).PjT(cz$PjT0);
        }
    }

    public void setControllerStatusCallBack(Zh cz$Zh0) {
        this.qla = cz$Zh0;
    }

    public void setIsAutoPlay(boolean z) {
        if(this.Co) {
            return;
        }
        int v = this.PjT.joj();
        if(z && ub.cr().Zh(v) != 4) {
            if(!ltE.JQp(this.xE)) {
                if(!ltE.cz(this.xE)) {
                    if(!ltE.cr(this.xE)) {
                        z = false;
                    }
                }
                else if(!this.KM() && !this.Qf()) {
                    z = false;
                }
            }
            else if(!this.KM()) {
                z = false;
            }
        }
        this.gK = z;
        x.b b0 = this.Zh;
        if(b0 != null) {
            b0.ReZ(z);
        }
        if(this.gK) {
            qZS.PjT(this.XX, 8);
        }
        else {
            this.XX();
            RelativeLayout relativeLayout0 = this.XX;
            if(relativeLayout0 != null) {
                qZS.PjT(relativeLayout0, 0);
                if(this.PjT != null && this.PjT.MWx() != null) {
                    com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(this.PjT.MWx().c(), this.PjT.MWx().o(), this.PjT.MWx().w(), this.Au, this.PjT);
                }
            }
        }
        this.Co = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.qj = z;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd0) {
        x.b b0 = this.Zh;
        if(b0 != null) {
            ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)b0).PjT(pAGNativeAd0);
        }
    }

    public void setVideoAdInteractionListener(b b$b0) {
        this.Zd = b$b0;
    }

    public void setVideoAdLoadListener(d b$d0) {
        x.b b0 = this.Zh;
        if(b0 != null) {
            b0.PjT(b$d0);
        }
    }

    public void setVideoCacheUrl(String s) {
        this.Owx = s;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.xf.Zh.Zh zh0) {
        x.b b0 = this.Zh;
        if(b0 != null) {
            ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)b0).PjT(zh0);
        }
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(v == 4 || v == 8) {
            this.Sks();
        }
    }

    private void tT() {
        this.ZX = this.qj();
        Jo.PjT(this.kph);
    }

    // 检测为 Lambda 实现
    private void ub() [...]

    public boolean xf() {
        boolean z = false;
        if(ltE.ReZ(ub.PjT()) == 0) {
            return false;
        }
        if(this.Zh.xf() != null && this.Zh.xf().cz()) {
            this.PjT(false, ((int)cz.RD));
            Handler handler0 = this.Qf;
            z = true;
            if(handler0 != null) {
                handler0.removeMessages(1);
            }
        }
        return z;
    }

    public void xs() {
        if(this.getNativeVideoController() != null && this.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ) {
            com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ reZ0 = (com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)this.getNativeVideoController();
            reZ0.PjT(reZ0.Sks(), this);
        }
    }

    private void yIW() {
        if(!this.ZX() && this.Lrd()) {
            com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_isfromvideodetailpage", Boolean.FALSE);
            com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_is_from_detail_page", Boolean.FALSE);
        }
    }

    class com.bytedance.sdk.openadsdk.core.xf.Zh.cz.6 implements ViewTreeObserver.OnScrollChangedListener {
        final cz PjT;

        @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
        public void onScrollChanged() {
            cz.this.ub();
        }
    }

}

