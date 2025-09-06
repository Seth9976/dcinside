package com.bytedance.sdk.openadsdk.PjT.Zh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.Lrd.Zh.JQp;
import com.bytedance.sdk.openadsdk.PjT.Zh.PjT.ReZ;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.Au.Au;
import com.bytedance.sdk.openadsdk.core.Au.SM;
import com.bytedance.sdk.openadsdk.core.Au.gK;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.qj.cz;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.cr;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.lang.ref.WeakReference;
import java.util.List;

public class PjT {
    private PAGMediaView Au;
    private PAGMediaView DWo;
    private WeakReference JQp;
    protected final Owx PjT;
    private final String ReZ;
    private ltE SM;
    private ReZ XX;
    private final Context Zh;
    private boolean cr;
    private Zh cz;
    private WeakReference fDm;
    private com.bytedance.sdk.openadsdk.core.Zh.PjT qj;
    private com.bytedance.sdk.openadsdk.core.Zh.Zh xf;
    private boolean xs;

    public PjT(Context context0, Owx owx0, String s) {
        this.xs = false;
        this.Zh = context0;
        this.PjT = owx0;
        this.ReZ = s;
    }

    public PAGMediaView Au() {
        return this.DWo;
    }

    public View DWo() {
        if(ub.PjT() == null) {
            return null;
        }
        View view0 = new PAGLogoView(ub.PjT()) {
            int PjT;
            final PjT ReZ;
            int Zh;

            {
                Context context0 = ub.PjT();  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.PjT = 0;
                this.Zh = 0;
            }

            @Override  // android.widget.LinearLayout
            protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
                super.onLayout(z, v, v1, v2, v3);
                try {
                    ViewParent viewParent0 = this.getParent();
                    if(viewParent0 != null && this.PjT != 0 && this.Zh != 0) {
                        int v4 = ((View)viewParent0).getWidth();
                        float f = Math.min(((float)((View)viewParent0).getHeight()) / ((float)this.Zh), ((float)v4) / ((float)this.PjT));
                        int v5 = (v4 - this.PjT) / 2;
                        if(f != 1.0f) {
                            this.setScaleX(f);
                            this.setScaleY(f);
                            this.setTranslationX(((float)v5));
                        }
                    }
                }
                catch(Throwable throwable0) {
                    throwable0.getMessage();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView
            protected void onMeasure(int v, int v1) {
                if(this.PjT == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0x3FFFFFFF, 0x80000000), v1);
                    this.PjT = this.getMeasuredWidth();
                    this.Zh = this.containerHeight;
                }
                this.setMeasuredDimension(this.PjT, this.Zh);
            }
        };
        ((PAGLogoView)view0).initData(this.PjT);
        view0.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            Context context0 = PjT.this.Zh;
            if(context0 != null) {
                TTWebsiteActivity.PjT(context0, PjT.this.PjT, PjT.this.ReZ);
            }
        });
        return view0;

        class com.bytedance.sdk.openadsdk.PjT.Zh.PjT.5 implements View.OnClickListener {
            final PjT PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                PjT.this.xf();
            }
        }

    }

    public String JQp() {
        return this.PjT == null ? null : this.Zh(this.PjT);
    }

    private PAGMediaView PjT(View view0) {
        int v1;
        if(view0 == null) {
            return null;
        }
        if(view0.getParent() instanceof ViewGroup) {
            ((ViewGroup)view0.getParent()).removeView(view0);
        }
        ltE ltE0 = this.SM;
        if(ltE0 != null) {
            ltE0.setClickListener(null);
            this.SM.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.Zh.Zh zh0 = this.xf;
        if(zh0 != null && zh0 instanceof SM && view0 instanceof ltE) {
            ((ltE)view0).setClickListener(((SM)zh0));
        }
        com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = this.qj;
        if(pjT0 != null && pjT0 instanceof Au && view0 instanceof ltE) {
            ((ltE)view0).setClickCreativeListener(((Au)pjT0));
        }
        PAGMediaView pAGMediaView0 = new PAGMediaView(this.Zh) {
            final PjT ReZ;

            private void PjT(boolean z) {
                Integer integer0 = this.PjT;
                if(integer0 != null) {
                    JQp.PjT(JQp.PjT(integer0), (z ? 4 : 8));
                }
                Owx owx0 = PjT.this.PjT;
                if(owx0 != null) {
                    com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(owx0, z);
                }
            }

            @Override  // android.view.ViewGroup
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                cr.PjT(this, PjT.this.PjT);
            }

            @Override  // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if(!(view0 instanceof ltE)) {
                    this.PjT(z);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener0) {
                super.setVideoAdListener(pAGVideoAdListener0);
                PjT.this.PjT(pAGVideoAdListener0);
            }
        };
        int v = -1;
        pAGMediaView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            v1 = -1;
        }
        else {
            v = viewGroup$LayoutParams0.width;
            v1 = viewGroup$LayoutParams0.height;
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v, v1);
        frameLayout$LayoutParams0.gravity = 17;
        pAGMediaView0.addView(view0, frameLayout$LayoutParams0);
        if(view0 instanceof ltE) {
            this.SM = (ltE)view0;
        }
        return pAGMediaView0;
    }

    private String PjT(Owx owx0) {
        if(owx0.uQg() != null && false) {
            return "";
        }
        if(!TextUtils.isEmpty(owx0.Ld())) {
            return owx0.Ld();
        }
        return TextUtils.isEmpty(owx0.Xtz()) ? "" : owx0.Xtz();
    }

    private void PjT(PAGMediaView pAGMediaView0) {
        if(pAGMediaView0 == null) {
            return;
        }
        try {
            pAGMediaView0.setBackgroundColor(0xFF000000);
        }
        catch(Exception unused_ex) {
        }
    }

    public PAGMediaView PjT() {
        return this.Au;
    }

    public void PjT(ReZ reZ0) {
        this.XX = reZ0;
    }

    public void PjT(Zh zh0) {
        this.cz = zh0;
    }

    public void PjT(PAGVideoAdListener pAGVideoAdListener0) {
        if(this.PjT.iZZ() == 2 && Owx.JQp(this.PjT)) {
            ReZ reZ0 = this.XX;
            if(reZ0 != null && reZ0 instanceof com.bytedance.sdk.openadsdk.PjT.Zh.PjT.Zh) {
                gK gK0 = (gK)reZ0.cr();
                if(gK0 != null) {
                    gK0.setVideoAdListener(this.Zh(pAGVideoAdListener0));
                }
                return;
            }
        }
        Zh zh0 = this.cz;
        if(zh0 != null) {
            zh0.PjT(this.Zh(pAGVideoAdListener0));
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0) {
        this.qj = pjT0;
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.Zh.Zh zh0) {
        this.xf = zh0;
    }

    public void PjT(cz cz0) {
        this.fDm = new WeakReference(cz0);
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.xf.Zh.cz cz0) {
        this.JQp = new WeakReference(cz0);
    }

    public void PjT(boolean z) {
        this.cr = z;
    }

    public PAGImageItem ReZ() {
        return this.PjT == null || this.PjT.Xe() == null ? null : new PAGImageItem(this.PjT.Xe().ReZ(), this.PjT.Xe().Zh(), this.PjT.Xe().PjT(), ((float)this.PjT.Xe().cr()));
    }

    public PAGMediaView SM() {
        if(Owx.JQp(this.PjT)) {
            Zh zh0 = this.cz;
            if(zh0 != null) {
                View view0 = zh0.JQp();
                if(view0 != null) {
                    if(view0.getParent() instanceof ViewGroup) {
                        ((ViewGroup)view0.getParent()).removeView(view0);
                    }
                    PAGMediaView pAGMediaView0 = this.Au;
                    if(pAGMediaView0 != null) {
                        pAGMediaView0.setOnClickListener(null);
                        this.Au.setOnTouchListener(null);
                    }
                    PAGMediaView pAGMediaView1 = new PAGVideoMediaView(this.Zh, view0, this);
                    pAGMediaView1.setTag(0x1F000042, Boolean.TRUE);
                    if(this.qj == null || !xs.Gr().cr(String.valueOf(this.PjT.joj()))) {
                        com.bytedance.sdk.openadsdk.PjT.Zh.PjT.2 pjT$20 = new com.bytedance.sdk.openadsdk.core.Zh.ReZ() {
                            final PjT PjT;

                            @Override  // com.bytedance.sdk.openadsdk.core.Zh.ReZ
                            protected void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
                                try {
                                    ((PAGVideoMediaView)view0).handleInterruptVideo();
                                }
                                catch(Exception unused_ex) {
                                }
                            }
                        };
                        pAGMediaView1.setOnClickListener(pjT$20);
                        pAGMediaView1.setOnTouchListener(pjT$20);
                    }
                    else {
                        pAGMediaView1.setOnClickListener(this.qj);
                        pAGMediaView1.setOnTouchListener(this.qj);
                    }
                    this.Au = pAGMediaView1;
                    pAGMediaView1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return pAGMediaView1;
                }
                ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
                return null;
            }
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        List list0 = this.PjT.CY();
        if(list0 != null && !list0.isEmpty()) {
            ImageView imageView0 = new ImageView(this.Zh);
            imageView0.setScaleType(ImageView.ScaleType.FIT_CENTER);
            xE xE0 = (xE)list0.get(0);
            if(xE0 != null) {
                com.bytedance.sdk.openadsdk.SM.cr.PjT(xE0).ReZ(2).PjT(com.bytedance.sdk.openadsdk.SM.ReZ.PjT(this.PjT, xE0.PjT(), imageView0));
            }
            PAGMediaView pAGMediaView2 = this.PjT(imageView0);
            if(this.qj == null || !xs.Gr().cr(String.valueOf(this.PjT.joj()))) {
                pAGMediaView2.setOnClickListener(null);
                pAGMediaView2.setOnTouchListener(null);
            }
            else {
                pAGMediaView2.setOnClickListener(this.qj);
                pAGMediaView2.setOnTouchListener(this.qj);
            }
            pAGMediaView2.setTag(0x1F000042, Boolean.TRUE);
            PAGMediaView pAGMediaView3 = this.Au;
            if(pAGMediaView3 != null) {
                pAGMediaView3.setOnClickListener(null);
                this.Au.setOnTouchListener(null);
            }
            this.Au = pAGMediaView2;
            return pAGMediaView2;
        }
        ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public PAGMediaView XX() {
        PAGMediaView pAGMediaView0;
        com.bytedance.sdk.openadsdk.utils.Zh.PjT(this.PjT);
        if(this.PjT.iZZ() == 2) {
            pAGMediaView0 = this.fDm();
            this.PjT(pAGMediaView0);
        }
        else {
            pAGMediaView0 = this.SM();
        }
        if(pAGMediaView0 == null) {
            pAGMediaView0 = new PAGMediaView(this.Zh) {
                final PjT Zh;

                @Override  // android.view.ViewGroup
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    cr.PjT(this, PjT.this.PjT);
                }
            };
        }
        else {
            pAGMediaView0.setMrcTrackerKey(JQp.Zh(this.PjT));
        }
        if(pAGMediaView0 instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView)pAGMediaView0).setMaterialMeta(this.PjT);
        }
        this.DWo = pAGMediaView0;
        return pAGMediaView0;
    }

    private com.bytedance.sdk.openadsdk.PjT.Zh.ReZ Zh(PAGVideoAdListener pAGVideoAdListener0) {
        return new com.bytedance.sdk.openadsdk.PjT.Zh.ReZ() {
            final PjT Zh;

            @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.ReZ
            public void PjT(int v, int v1) {
                PAGVideoAdListener pAGVideoAdListener0 = pAGVideoAdListener0;
                if(pAGVideoAdListener0 != null) {
                    pAGVideoAdListener0.onVideoError();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.ReZ
            public void PjT(PAGNativeAd pAGNativeAd0) {
                PAGVideoAdListener pAGVideoAdListener0 = pAGVideoAdListener0;
                if(pAGVideoAdListener0 != null) {
                    pAGVideoAdListener0.onVideoAdPlay();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.ReZ
            public void ReZ(PAGNativeAd pAGNativeAd0) {
                PAGVideoAdListener pAGVideoAdListener0 = pAGVideoAdListener0;
                if(pAGVideoAdListener0 != null) {
                    pAGVideoAdListener0.onVideoAdComplete();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.ReZ
            public void Zh(PAGNativeAd pAGNativeAd0) {
                PAGVideoAdListener pAGVideoAdListener0 = pAGVideoAdListener0;
                if(pAGVideoAdListener0 != null) {
                    pAGVideoAdListener0.onVideoAdPaused();
                }
            }
        };
    }

    private String Zh(Owx owx0) {
        if(!TextUtils.isEmpty(owx0.Xtz())) {
            return owx0.Xtz();
        }
        return TextUtils.isEmpty(owx0.ix()) ? "" : owx0.ix();
    }

    public ltE Zh() {
        return this.SM;
    }

    public String cr() {
        return this.PjT == null ? null : this.PjT(this.PjT);
    }

    public String cz() {
        return this.PjT == null ? null : this.PjT.Nv();
    }

    private PAGMediaView fDm() {
        if(Owx.JQp(this.PjT)) {
            ReZ reZ0 = this.XX;
            if(reZ0 != null && reZ0 instanceof com.bytedance.sdk.openadsdk.PjT.Zh.PjT.Zh) {
                gK gK0 = (gK)reZ0.cr();
                gK0.setTag(0x1F000042, Boolean.TRUE);
                if(!this.xs) {
                    this.XX.JQp();
                }
                this.xs = true;
                return this.PjT(gK0);
            }
        }
        else {
            ReZ reZ1 = this.XX;
            if(reZ1 != null) {
                ltE ltE0 = reZ1.cr();
                ltE0.setTag(0x1F000042, Boolean.TRUE);
                if(!this.xs) {
                    this.XX.JQp();
                }
                this.xs = true;
                return this.PjT(ltE0);
            }
        }
        return null;
    }

    public View qj() {
        if(ub.PjT() != null && (this.PjT != null && this.PjT.uvo() && this.PjT.xf())) {
            View view0 = new ImageView(ub.PjT());
            com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(((int)qZS.PjT(ub.PjT(), 14.0f, true)), ((ImageView)view0), this.PjT);
            return view0;
        }
        return null;
    }

    // 检测为 Lambda 实现
    public void xf() [...]

    public void xs() {
        WeakReference weakReference0 = this.fDm;
        if(weakReference0 != null) {
            cz cz0 = (cz)weakReference0.get();
            if(cz0 != null) {
                cz0.PjT(13);
            }
        }
    }
}

