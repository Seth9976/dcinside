package com.bytedance.sdk.openadsdk.PjT.Zh;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xE;
import com.bytedance.sdk.openadsdk.core.xf.Zh.cz;
import com.bytedance.sdk.openadsdk.multipro.Zh.PjT.PjT;
import com.bytedance.sdk.openadsdk.utils.wN;
import x.b.b;
import x.b.d;

public class Zh extends Au implements PjT, b, d {
    private ReZ Au;
    private boolean DWo;
    private final com.bytedance.sdk.openadsdk.multipro.Zh.PjT SM;
    private boolean qj;
    private AdSlot xf;
    private long xs;

    public Zh(@NonNull Context context0, @NonNull Owx owx0, int v, AdSlot adSlot0) {
        super(context0, owx0, v, true);
        this.DWo = false;
        this.qj = true;
        this.JQp = v;
        this.xf = adSlot0;
        this.SM = new com.bytedance.sdk.openadsdk.multipro.Zh.PjT();
        this.PjT(this.cz);
        this.PjT("embeded_ad");
        this.cr.PjT(this);
    }

    public Zh(@NonNull Context context0, @NonNull Owx owx0, int v, AdSlot adSlot0, com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT0, xE xE0) {
        super(context0, owx0, v, false);
        this.DWo = false;
        this.qj = true;
        this.cr = pjT0;
        this.PjT = xE0;
        this.JQp = v;
        this.xf = adSlot0;
        this.SM = new com.bytedance.sdk.openadsdk.multipro.Zh.PjT();
        this.PjT(this.cz);
        this.PjT("embeded_ad");
        pjT0.PjT(this);
    }

    public View JQp() {
        View view0;
        Owx owx0 = this.Zh;
        if(owx0 != null && this.ReZ != null) {
            if(Owx.JQp(owx0)) {
                try {
                    view0 = new cz(this.ReZ, this.Zh, this.PjT.PjT());
                    if(this.Zh != null && this.Zh.uvo()) {
                        com.bytedance.sdk.openadsdk.core.qj.cz cz0 = ((cz)view0).PjT(null);
                        com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT0 = this.cr;
                        if(pjT0 != null) {
                            pjT0.PjT(cz0);
                        }
                    }
                    this.PjT.PjT(((cz)view0).getNativeVideoController());
                    com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT1 = this.cr;
                    if(pjT1 != null) {
                        pjT1.PjT(((cz)view0));
                    }
                    ((cz)view0).setVideoAdClickListenerTTNativeAd(this);
                    ((cz)view0).setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT() {
                        final Zh PjT;

                        @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz$PjT
                        public void PjT(View view0, int v) {
                            xE xE0 = Zh.this.PjT;
                            if(xE0 != null) {
                                xE0.PjT(view0, v);
                            }
                        }
                    });
                    ((cz)view0).setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.xf.Zh.cz.Zh() {
                        final Zh PjT;

                        @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz$Zh
                        public void PjT(boolean z, long v, long v1, long v2, boolean z1) {
                            Zh.this.SM.PjT = z;
                            Zh.this.SM.JQp = v;
                            Zh.this.SM.cz = v1;
                            Zh.this.SM.XX = v2;
                            Zh.this.SM.cr = z1;
                        }
                    });
                    ((cz)view0).setVideoAdLoadListener(this);
                    ((cz)view0).setVideoAdInteractionListener(this);
                    if(5 == this.JQp) {
                        ((cz)view0).setIsAutoPlay((this.DWo ? this.xf.isAutoPlay() : this.qj));
                    }
                    else {
                        ((cz)view0).setIsAutoPlay(this.qj);
                    }
                    ((cz)view0).PjT(ub.cr().ReZ(String.valueOf(this.cz)), "feedGetAdView");
                    goto label_29;
                }
                catch(Exception exception0) {
                }
                ApmHelper.reportCustomError("", "getAdView null", exception0);
            }
            view0 = null;
        label_29:
            if(Owx.JQp(this.Zh) && view0 != null && ((cz)view0).PjT(0L, true, false)) {
                return view0;
            }
            ApmHelper.reportCustomError((this.Zh.fK() + "," + view0), "getAdView null", new RuntimeException());
        }
        return null;
    }

    private void PjT(int v) {
        int v1 = ub.cr().Zh(v);
        int v2 = ltE.ReZ(ub.PjT());
        if(3 == v1) {
            this.DWo = false;
            this.qj = false;
        }
        else if(1 == v1 && wN.cr(v2)) {
            this.DWo = false;
            this.qj = true;
        }
        else if(2 != v1) {
            if(4 == v1) {
                this.DWo = true;
            }
            else if(5 == v1 && (wN.cr(v2) || wN.cz(v2))) {
                this.qj = true;
            }
        }
        else if(wN.JQp(v2) || wN.cr(v2) || wN.cz(v2)) {
            this.DWo = false;
            this.qj = true;
        }
        com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT0 = this.cr;
        if(pjT0 != null) {
            pjT0.PjT(this.DWo);
        }
    }

    @Override  // x.b$d
    public void PjT(int v, int v1) {
        ReZ reZ0 = this.Au;
        if(reZ0 != null) {
            reZ0.PjT(v, v1);
        }
    }

    @Override  // x.b$b
    public void PjT(long v, long v1) {
        this.xs = v;
    }

    public void PjT(ReZ reZ0) {
        this.Au = reZ0;
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.Au
    protected void PjT(String s) {
        super.PjT(s);
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.Zh.PjT$PjT
    public com.bytedance.sdk.openadsdk.multipro.Zh.PjT cz() {
        return this.SM;
    }

    @Override  // x.b$b
    public void d_() {
        ReZ reZ0 = this.Au;
        if(reZ0 != null) {
            reZ0.PjT(this);
        }
    }

    @Override  // x.b$b
    public void g_() {
        ReZ reZ0 = this.Au;
        if(reZ0 != null) {
            reZ0.Zh(this);
        }
    }

    @Override  // x.b$b
    public void h_() {
    }

    @Override  // x.b$b
    public void i_() {
        ReZ reZ0 = this.Au;
        if(reZ0 != null) {
            reZ0.ReZ(this);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.Au
    public void showPrivacyActivity() {
        com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT0 = this.cr;
        if(pjT0 != null) {
            pjT0.xf();
        }
    }
}

