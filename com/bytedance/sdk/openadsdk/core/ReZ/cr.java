package com.bytedance.sdk.openadsdk.core.ReZ;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.Au.gK;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.XX;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.Yo;
import com.bytedance.sdk.openadsdk.utils.Zd;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class cr extends PAGBannerAd {
    public interface PjT {
        void PjT();
    }

    static class Zh extends Au {
        boolean PjT;
        WeakReference ReZ;
        Owx Zh;

        Zh(boolean z, Owx owx0, cr cr0) {
            super("ReportWindowFocusChangedAdShow");
            this.PjT = z;
            this.Zh = owx0;
            this.ReZ = new WeakReference(cr0);
        }

        @Override
        public void run() {
            if(this.ReZ != null && this.ReZ.get() != null) {
                ((cr)this.ReZ.get()).Zh(this.PjT, this.Zh);
            }
        }
    }

    private PAGBannerAdWrapperListener Au;
    private final Queue DWo;
    TTDislikeDialogAbstract JQp;
    protected ReZ PjT;
    protected Owx ReZ;
    private cz SM;
    private final boolean XX;
    protected final Context Zh;
    protected AdSlot cr;
    protected final View.OnAttachStateChangeListener cz;
    private ltE fDm;
    private boolean qj;
    private final AtomicBoolean qla;
    private boolean xE;
    private boolean xf;
    private String xs;

    public cr(Context context0, Owx owx0, AdSlot adSlot0) {
        this.DWo = new LinkedList();
        this.xs = "banner_ad";
        this.qla = new AtomicBoolean(false);
        this.cz = new View.OnAttachStateChangeListener() {
            final cr PjT;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                if(!cr.this.xE) {
                    cr.this.PjT(cr.this.PjT.getCurView(), cr.this.ReZ);
                }
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                cr.this.PjT.ReZ();
            }
        };
        this.Zh = context0;
        this.ReZ = owx0;
        this.cr = adSlot0;
        this.PjT(context0, owx0, adSlot0);
        this.XX = false;
        this.xE = false;
    }

    private XX PjT(ViewGroup viewGroup0) {
        if(viewGroup0 == null) {
            return null;
        }
        try {
            for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
                View view0 = viewGroup0.getChildAt(v);
                if(view0 instanceof XX) {
                    return (XX)view0;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    private cz PjT(Owx owx0) {
        return owx0.cI() == 4 ? com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX.PjT(this.Zh, owx0, this.xs) : null;
    }

    private void PjT(View view0, ltE ltE0, Owx owx0, String s, PjT cr$PjT0) {
        SM.Zh().PjT(s, cr$PjT0);
        Queue queue0 = this.DWo;
        if(queue0 != null) {
            queue0.offer(System.currentTimeMillis());
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(ltE0 != null) {
                jSONObject0.put("dynamic_show_type", ltE0.getDynamicShowType());
                ltE0.PjT(jSONObject0, owx0);
            }
            if(view0 != null) {
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("width", view0.getWidth());
                    jSONObject1.put("height", view0.getHeight());
                    jSONObject1.put("alpha", ((double)view0.getAlpha()));
                }
                catch(Throwable unused_ex) {
                }
                jSONObject0.put("root_view", jSONObject1.toString());
            }
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, this.xs, jSONObject0);
            com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(owx0);
        }
        catch(JSONException unused_ex) {
            RD.Zh("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener0 = this.Au;
        if(pAGBannerAdWrapperListener0 != null) {
            pAGBannerAdWrapperListener0.onAdShow(view0, owx0.cI());
        }
        boolean z = !owx0.CD();
        if(this.PjT != null && this.PjT.getCurView() != null) {
            this.PjT.getCurView().DWo();
            this.PjT.getCurView().Au();
        }
    }

    private void PjT(XX xX0, boolean z, Owx owx0) {
        this.Zh(owx0);
    }

    private void PjT(boolean z, Owx owx0) {
        if(z && this.ReZ.en() && !this.ReZ.JDf()) {
            this.ReZ.XX(true);
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.ReZ, this.xs, this.ReZ.zSs());
        }
        Jo.Zh(new Zh(z, owx0, this), 10);
    }

    public PjT PjT() {
        return new PjT() {
            final cr PjT;

            private View PjT(boolean z) {
                View view0 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(cr.this.Zh);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
                view0.setBackgroundColor(-1);
                ((com.bytedance.sdk.openadsdk.core.JQp.ReZ)view0).setLayoutParams(viewGroup$LayoutParams0);
                View view1 = new View(cr.this.Zh);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
                view1.setAlpha(0.3f);
                view1.setBackgroundColor(Color.parseColor("#F3F7F8"));
                ((ViewGroup)view0).addView(view1, frameLayout$LayoutParams0);
                com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(cr.this.Zh);
                FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
                if(z) {
                    reZ0.setBackground(Lrd.ReZ(cr.this.Zh, "tt_ad_closed_background_300_250"));
                }
                else {
                    reZ0.setBackground(Lrd.ReZ(cr.this.Zh, "tt_ad_closed_background_320_50"));
                }
                ((ViewGroup)view0).addView(reZ0, frameLayout$LayoutParams1);
                PAGLogoView pAGLogoView0 = PAGLogoView.createPAGLogoViewByMaterial(cr.this.Zh, cr.this.ReZ);
                pAGLogoView0.setId(0x1F00002B);
                FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                if(z) {
                    int v = qZS.Zh(cr.this.Zh, 16.0f);
                    frameLayout$LayoutParams2.width = qZS.Zh(cr.this.Zh, 77.0f);
                    frameLayout$LayoutParams2.height = qZS.Zh(cr.this.Zh, 14.0f);
                    frameLayout$LayoutParams2.leftMargin = v;
                    frameLayout$LayoutParams2.topMargin = v;
                }
                else {
                    int v1 = qZS.Zh(cr.this.Zh, 8.0f);
                    frameLayout$LayoutParams2.width = qZS.Zh(cr.this.Zh, 45.0f);
                    frameLayout$LayoutParams2.height = qZS.Zh(cr.this.Zh, 8.18f);
                    frameLayout$LayoutParams2.leftMargin = v1;
                    frameLayout$LayoutParams2.topMargin = v1;
                }
                reZ0.addView(pAGLogoView0, frameLayout$LayoutParams2);
                com.bytedance.sdk.openadsdk.core.JQp.Au au0 = new com.bytedance.sdk.openadsdk.core.JQp.Au(cr.this.Zh);
                FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                frameLayout$LayoutParams3.gravity = 17;
                au0.setAlpha(0.5f);
                au0.setLines(1);
                au0.setText(Lrd.PjT(cr.this.Zh, "tt_ad_is_closed"));
                if(z) {
                    au0.setTextSize(18.0f);
                }
                else {
                    au0.setTextSize(12.0f);
                }
                reZ0.addView(au0, frameLayout$LayoutParams3);
                com.bytedance.sdk.openadsdk.core.ReZ.cr.7.1 cr$7$10 = new View.OnClickListener() {
                    final com.bytedance.sdk.openadsdk.core.ReZ.cr.7 PjT;

                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        Owx owx0 = cr.this.ReZ;
                        String s = cr.this.xs;
                        TTWebsiteActivity.PjT(cr.this.Zh, owx0, s);
                    }
                };
                pAGLogoView0.setOnClickListener(cr$7$10);
                au0.setOnClickListener(cr$7$10);
                return view0;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.ReZ.cr$PjT
            public void PjT() {
                int v = cr.this.fDm.getWidth();
                int v1 = cr.this.fDm.getHeight();
                View view0 = this.PjT(((double)v1) >= Math.floor(((double)v) * 450.0 / 600.0));
                cr.this.fDm.fDm();
                cr.this.fDm.removeAllViews();
                cr.this.fDm.addView(view0, new ViewGroup.LayoutParams(v, v1));
                cr.this.fDm.setClickCreativeListener(null);
                cr.this.fDm.setClickListener(null);
                if(cr.this.Au != null) {
                    cr.this.Au.onAdDismissed();
                }
                cr.this.xE = true;
            }
        };
    }

    public void PjT(Context context0, Owx owx0, AdSlot adSlot0) {
        ReZ reZ0 = new ReZ(context0, owx0, adSlot0);
        this.PjT = reZ0;
        reZ0.addOnAttachStateChangeListener(this.cz);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    protected void PjT(@NonNull ltE ltE0, @NonNull Owx owx0) {
        XX xX1;
        if(ltE0 != null && owx0 != null) {
            this.ReZ = owx0;
            this.SM = this.PjT(owx0);
            this.fDm = ltE0;
            PjT cr$PjT0 = this.PjT();
            ltE0.setClosedListenerKey("e4a0f2c6-f958-4fc1-b895-4fea13f959bf");
            ltE0.setBannerClickClosedListener(cr$PjT0);
            ltE0.setBackupListener(new com.bytedance.sdk.component.adexpress.Zh.ReZ() {
                final cr ReZ;

                @Override  // com.bytedance.sdk.component.adexpress.Zh.ReZ
                public boolean PjT(ViewGroup viewGroup0, int v) {
                    try {
                        ltE0.xf();
                        if(cr.this.ReZ.uvo()) {
                            com.bytedance.sdk.openadsdk.core.ReZ.XX xX0 = new com.bytedance.sdk.openadsdk.core.ReZ.XX(ltE0.getContext());
                            xX0.setClosedListenerKey("e4a0f2c6-f958-4fc1-b895-4fea13f959bf");
                            xX0.PjT(cr.this.ReZ, ltE0, cr.this.SM);
                            xX0.setDislikeOuter(cr.this.JQp);
                            xX0.setAdInteractionListener(cr.this.Au);
                            ltE0.setVastVideoHelper(xX0);
                            return true;
                        }
                        com.bytedance.sdk.openadsdk.core.ReZ.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.ReZ.PjT(ltE0.getContext());
                        pjT0.setClosedListenerKey("e4a0f2c6-f958-4fc1-b895-4fea13f959bf");
                        pjT0.PjT(cr.this.ReZ, ltE0, cr.this.SM);
                        pjT0.setDislikeOuter(cr.this.JQp);
                        pjT0.setAdInteractionListener(cr.this.Au);
                        return true;
                    }
                    catch(Exception unused_ex) {
                        return false;
                    }
                }
            });
            if(this.XX) {
                Zd.PjT(ltE0, true, 1, new com.bytedance.sdk.openadsdk.utils.Zd.Zh() {
                    final cr JQp;

                    @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
                    public void PjT() {
                        cr.this.ReZ();
                    }

                    @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
                    public void PjT(View view0, boolean z) {
                        if(!z) {
                            com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(cr.this.ReZ, 8);
                            return;
                        }
                        com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(cr.this.ReZ, 4);
                        if(cr.this.qla.compareAndSet(false, true)) {
                            cr.this.PjT(view0, ltE0, owx0, "e4a0f2c6-f958-4fc1-b895-4fea13f959bf", cr$PjT0);
                        }
                    }

                    @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
                    public void PjT(boolean z) {
                        cr.this.PjT(z, owx0);
                    }

                    @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
                    public void Zh() {
                        cr.this.PjT(null, true, owx0);
                    }
                }, null);
                xX1 = null;
            }
            else {
                XX xX0 = this.PjT(ltE0);
                if(xX0 == null) {
                    xX0 = new XX(this.Zh, ltE0);
                    ltE0.addView(xX0);
                }
                xX1 = xX0;
                xX1.setCallback(new com.bytedance.sdk.openadsdk.core.XX.PjT() {
                    final cr cz;

                    @Override  // com.bytedance.sdk.openadsdk.core.XX$PjT
                    public void PjT() {
                        cr.this.ReZ();
                    }

                    @Override  // com.bytedance.sdk.openadsdk.core.XX$PjT
                    public void PjT(View view0) {
                        if(cr.this.qla.compareAndSet(false, true)) {
                            cr.this.PjT(view0, ltE0, owx0, "e4a0f2c6-f958-4fc1-b895-4fea13f959bf", cr$PjT0);
                        }
                    }

                    @Override  // com.bytedance.sdk.openadsdk.core.XX$PjT
                    public void PjT(boolean z) {
                        cr.this.PjT(z, owx0);
                    }

                    @Override  // com.bytedance.sdk.openadsdk.core.XX$PjT
                    public void Zh() {
                        cr.this.PjT(xX1, false, owx0);
                    }
                });
            }
            Context context0 = com.bytedance.sdk.component.utils.Zh.PjT(ltE0);
            if(context0 == null) {
                context0 = this.Zh;
            }
            com.bytedance.sdk.openadsdk.core.Au.SM sM0 = new com.bytedance.sdk.openadsdk.core.Au.SM(context0, owx0, this.xs, 2);
            sM0.PjT(ltE0);
            sM0.PjT(this);
            sM0.PjT(this.SM);
            sM0.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
                final cr PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
                public void PjT(View view0, int v) {
                    if(cr.this.Au != null) {
                        cr.this.Au.onAdClicked();
                    }
                }
            });
            ltE0.setClickListener(sM0);
            com.bytedance.sdk.openadsdk.core.Au.Au au0 = new com.bytedance.sdk.openadsdk.core.Au.Au(this.Zh, owx0, this.xs, 2);
            au0.PjT(ltE0);
            au0.PjT(this);
            au0.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
                final cr PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
                public void PjT(View view0, int v) {
                    if(cr.this.Au != null) {
                        cr.this.Au.onAdClicked();
                    }
                }
            });
            ltE ltE1 = this.fDm;
            if(ltE1 instanceof gK) {
                au0.PjT(((gK)ltE1).getVideoController());
            }
            au0.PjT(this.SM);
            ltE0.setClickCreativeListener(au0);
            if(!this.XX) {
                xX1.setNeedCheckingShow(true);
            }
        }
    }

    private void ReZ() {
        this.Zh();
    }

    private void Zh(Owx owx0) {
        if(this.DWo != null && this.DWo.size() > 0 && owx0 != null) {
            try {
                long v = (long)(((Long)this.DWo.poll()));
                if(v > 0L && this.fDm != null) {
                    com.bytedance.sdk.openadsdk.cr.ReZ.PjT(String.valueOf(System.currentTimeMillis() - v), owx0, this.xs, this.fDm.getAdShowTime());
                }
            }
            catch(Exception exception0) {
                RD.Zh("PAGBannerAdImpl", exception0.getMessage());
            }
        }
    }

    private void Zh(boolean z, Owx owx0) {
        try {
            if(z) {
                this.DWo.offer(System.currentTimeMillis());
                return;
            }
            if(this.DWo.size() > 0 && this.fDm != null) {
                Long long0 = (Long)this.DWo.poll();
                if(long0 != null) {
                    com.bytedance.sdk.openadsdk.cr.ReZ.PjT(String.valueOf(System.currentTimeMillis() - ((long)long0)), owx0, this.xs, this.fDm.getAdShowTime());
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        RD.Zh("PAGBannerAdImpl", exception0.getMessage());
    }

    public void Zh() {
        this.ReZ.PjT(SystemClock.elapsedRealtime());
        this.PjT.Zh();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            try {
                reZ0.ReZ();
                this.PjT.removeOnAttachStateChangeListener(this.cz);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        return this.cr == null ? new PAGBannerSize(0, 0) : new PAGBannerSize(((int)this.cr.getExpressViewAcceptedWidth()), ((int)this.cr.getExpressViewAcceptedHeight()));
    }

    @Override  // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        com.bytedance.sdk.openadsdk.utils.Zh.PjT(this.ReZ);
        IPMiBroadcastReceiver.PjT(this.Zh, this.ReZ);
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String s) {
        if(this.ReZ != null && this.ReZ.Vs() != null) {
            try {
                return this.ReZ.Vs().get(s);
            }
            catch(Throwable throwable0) {
                RD.Zh("PAGBannerAdImpl", throwable0.getMessage());
            }
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map getMediaExtraInfo() {
        return this.ReZ == null ? null : this.ReZ.Vs();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double double0, String s, String s1) {
        if(!this.xf) {
            Yo.PjT(this.ReZ, double0, s, s1);
            this.xf = true;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback0) {
        JQp jQp0 = new JQp(pAGBannerAdInteractionCallback0);
        this.Au = jQp0;
        this.PjT.setExpressInteractionListener(jQp0);
    }

    @Override  // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener0) {
        JQp jQp0 = new JQp(pAGBannerAdInteractionListener0);
        this.Au = jQp0;
        this.PjT.setExpressInteractionListener(jQp0);
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double double0) {
        if(!this.qj) {
            Yo.PjT(this.ReZ, double0);
            this.qj = true;
        }
    }
}

