package com.bytedance.sdk.openadsdk.component;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.JQp;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.qla;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class ReZ {
    public class PjT implements cr {
        WeakReference PjT;
        final ReZ Zh;

        PjT(Activity activity0) {
            this.PjT = new WeakReference(activity0);
        }

        @Override  // com.bytedance.sdk.openadsdk.component.cz$cr
        public void PjT(Bitmap bitmap0) {
            if(this.PjT.get() != null && !((Activity)this.PjT.get()).isFinishing()) {
                ReZ.this.PjT(bitmap0);
            }
        }
    }

    public static class Zh implements com.bytedance.sdk.openadsdk.utils.xE.PjT {
        private final WeakReference PjT;

        public Zh(ReZ reZ0) {
            this.PjT = new WeakReference(reZ0);
        }

        @Override  // com.bytedance.sdk.openadsdk.utils.xE$PjT
        public void PjT() {
        }

        @Override  // com.bytedance.sdk.openadsdk.utils.xE$PjT
        public void PjT(com.bytedance.sdk.openadsdk.gK.PjT.Zh zh0) {
            if(zh0.cr()) {
                ReZ reZ0 = (ReZ)this.PjT.get();
                if(reZ0 != null) {
                    reZ0.PjT(zh0);
                    if(zh0.Zh() != null) {
                        reZ0.PjT(zh0.PjT());
                    }
                }
            }
        }
    }

    protected FrameLayout Au;
    protected com.bytedance.sdk.openadsdk.core.JQp.cr DWo;
    protected final com.bytedance.sdk.openadsdk.component.PjT JQp;
    private com.bytedance.sdk.openadsdk.component.Au.ReZ Lrd;
    private Au Owx;
    protected final Activity PjT;
    private float RD;
    protected final boolean ReZ;
    protected View SM;
    private float Sks;
    protected int XX;
    private View Yo;
    protected final Owx Zh;
    private Au cRA;
    protected final FrameLayout cr;
    protected final int cz;
    private ImageView fDm;
    private xE gK;
    private qla iZZ;
    private Au ltE;
    protected Au qj;
    private PAGLogoView qla;
    @NonNull
    private final com.bytedance.sdk.openadsdk.component.SM.Au tT;
    private ImageView ub;
    private Au xE;
    protected final com.bytedance.sdk.openadsdk.component.Au.PjT xf;
    private RelativeLayout xs;
    private com.bytedance.sdk.openadsdk.core.JQp.cr yIW;

    public ReZ(Activity activity0, Owx owx0, FrameLayout frameLayout0, com.bytedance.sdk.openadsdk.component.PjT pjT0, int v, boolean z, com.bytedance.sdk.openadsdk.component.Au.PjT pjT1) {
        this.tT = new com.bytedance.sdk.openadsdk.component.SM.Au();
        this.PjT = activity0;
        this.Zh = owx0;
        this.cr = frameLayout0;
        this.XX = v;
        this.ReZ = z;
        this.JQp = pjT0;
        this.cz = owx0.joj();
        this.xf = pjT1;
    }

    private void Au() {
        int v2;
        int v = 8;
        this.tT.PjT();
        this.xE.setText(this.Zh.Nv());
        if(this.Zh.Pv()) {
            this.SM();
            return;
        }
        if(this.ReZ) {
            this.Zh(0);
            this.PjT(8);
            if(this.PjT(this.Au)) {
                this.JQp.ReZ();
            }
            else {
                this.JQp.cr();
            }
            PjT reZ$PjT0 = new PjT(this, this.PjT);
            cz.PjT(this.Zh, reZ$PjT0, 25);
        }
        else {
            this.Zh(8);
            this.PjT(0);
            this.DWo();
            this.JQp.ReZ();
        }
        int v1 = 1;
        if(this.cRA == null) {
            v2 = 0;
        }
        else if(!TextUtils.isEmpty(this.Zh.Ld())) {
            this.cRA.setText(this.Zh.Ld());
            v2 = 1;
        }
        else if(this.Zh.uQg() == null) {
            v2 = 0;
        }
        else {
            this.cRA.setText("");
            v2 = 1;
        }
        if(this.yIW != null) {
            com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(this.Zh.Xe(), this.yIW, this.Zh);
        }
        qla qla0 = this.iZZ;
        if(qla0 == null) {
            v1 = v2;
        }
        else {
            qZS.PjT(null, qla0, this.Zh);
            if(this.Zh.uQg() == null || this.Zh.uQg().cr() < 0.0) {
                this.iZZ.setVisibility(8);
                v1 = v2;
            }
        }
        View view0 = this.Yo;
        if(view0 != null) {
            if(v1 != 0) {
                v = 0;
            }
            view0.setVisibility(v);
        }
    }

    private void DWo() {
        com.bytedance.sdk.openadsdk.core.model.xE xE0 = (com.bytedance.sdk.openadsdk.core.model.xE)this.Zh.CY().get(0);
        File file0 = com.bytedance.sdk.openadsdk.component.XX.PjT.Zh((TextUtils.isEmpty(xE0.XX()) ? JQp.PjT(xE0.PjT()) : xE0.XX()));
        com.bytedance.sdk.openadsdk.utils.xE.PjT(new com.bytedance.sdk.openadsdk.gK.PjT(xE0.PjT(), xE0.XX()), xE0.Zh(), xE0.ReZ(), new Zh(this), file0.getParent(), 25);
    }

    public void JQp() {
    }

    private void PjT(Bitmap bitmap0) {
        if(bitmap0 != null) {
            try {
                BitmapDrawable bitmapDrawable0 = new BitmapDrawable(ub.PjT().getResources(), bitmap0);
                this.ub.setImageDrawable(bitmapDrawable0);
            }
            catch(Throwable unused_ex) {
                RD.Zh("AppOpenAdNativeManager", new Object[]{"open_ad", "bindBackGroundImage error"});
            }
        }
    }

    public JSONObject PjT(JSONObject jSONObject0) {
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void PjT() {
        this.qla.setOnClickListener(new View.OnClickListener() {
            final ReZ PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                try {
                    TTWebsiteActivity.PjT(ReZ.this.PjT, ReZ.this.Zh, "open_ad");
                }
                catch(Throwable throwable0) {
                    RD.Zh("AppOpenAdNativeManager", throwable0.getMessage());
                }
            }
        });
        this.cz();
        if(this.Zh.pBJ()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.PjT.PjT pjT0 = com.bytedance.sdk.openadsdk.component.PjT.Zh.PjT(this.Zh, this.PjT, this.xf);
        pjT0.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
            final ReZ PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
            public void PjT(View view0, int v) {
                ReZ.this.JQp.JQp();
            }
        });
        pjT0.PjT(this.Lrd);
        if(this.Zh.ub() == 1) {
            this.xs.setOnClickListener(pjT0);
            this.xs.setOnTouchListener(pjT0);
        }
        this.xE.setOnClickListener(pjT0);
        this.xE.setOnTouchListener(pjT0);
    }

    public void PjT(float f, float f1) {
        this.Sks = f;
        this.RD = f1;
    }

    void PjT(int v) {
        qZS.PjT(this.fDm, v);
    }

    public void PjT(int v, boolean z) {
        if(this.DWo != null) {
            Au au0 = this.qj;
            if(au0 != null) {
                if(z) {
                    if(au0.getVisibility() != 8) {
                        this.qj.setVisibility(8);
                    }
                    if(this.DWo.getVisibility() != 0) {
                        this.DWo.setVisibility(0);
                    }
                }
                else {
                    this.qj.setText(v + "s");
                    if(this.qj.getVisibility() != 0) {
                        this.qj.setVisibility(0);
                    }
                }
            }
        }
    }

    public void PjT(ViewGroup viewGroup0) {
        com.bytedance.sdk.openadsdk.component.SM.cr cr0 = new com.bytedance.sdk.openadsdk.component.SM.cr(this.PjT, this.Zh);
        int v = this.Zh.gK();
        if(v == 5) {
            cr0 = new com.bytedance.sdk.openadsdk.component.SM.cz(this.PjT, this.Zh);
        }
        else if(v == 4) {
            cr0 = new com.bytedance.sdk.openadsdk.component.SM.JQp(this.PjT, this.Zh);
        }
        this.xs = cr0;
        viewGroup0.addView(cr0);
        this.ub = cr0.getBackImage();
        this.Au = cr0.getVideoContainer();
        this.fDm = cr0.getImageView();
        this.xE = cr0.getClickButton();
        this.qla = cr0.getAdLogo();
        this.cRA = cr0.getAdTitleTextView();
        this.yIW = cr0.getAdIconView();
        this.iZZ = cr0.getScoreBar();
        this.Yo = cr0.getOverlayLayout();
        if(this.Zh.Pv()) {
            this.gK = cr0.getIconOnlyView();
            this.ltE = cr0.getTitle();
            this.Owx = cr0.getContent();
        }
        if(cr0.getDspAdChoice() != null) {
            cr0.getDspAdChoice().PjT(14, this.Zh);
        }
        if(!this.Zh.pBJ()) {
            this.tT.PjT(cr0, this.Zh, this.Sks, this.RD, this.ReZ);
        }
        this.SM = cr0.getTopDisLike();
        this.DWo = cr0.getTopSkip();
        this.qj = cr0.getTopCountDown();
        if(cr0 instanceof com.bytedance.sdk.openadsdk.component.SM.JQp) {
            ((com.bytedance.sdk.openadsdk.component.SM.JQp)cr0).setRenderListener(new com.bytedance.sdk.openadsdk.component.SM.JQp.PjT() {
                final ReZ PjT;

                @Override  // com.bytedance.sdk.openadsdk.component.SM.JQp$PjT
                public void PjT(View view0, int v) {
                    ReZ.this.JQp.JQp();
                }
            });
        }
    }

    void PjT(com.bytedance.sdk.openadsdk.gK.PjT.Zh zh0) {
        if(zh0.Zh() != null) {
            this.fDm.setImageBitmap(zh0.Zh());
            return;
        }
        if(this.Zh.CY() != null && this.Zh.CY().get(0) != null) {
            int v = ((com.bytedance.sdk.openadsdk.core.model.xE)this.Zh.CY().get(0)).Zh();
            Drawable drawable0 = com.bytedance.sdk.openadsdk.utils.xE.PjT(zh0.ReZ(), v);
            this.fDm.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.fDm.setImageDrawable(drawable0);
        }
    }

    protected boolean PjT(FrameLayout frameLayout0) {
        com.bytedance.sdk.openadsdk.component.Au.ReZ reZ0 = new com.bytedance.sdk.openadsdk.component.Au.ReZ(this.PjT);
        this.Lrd = reZ0;
        return reZ0.PjT(frameLayout0, this.JQp, this.Zh);
    }

    public void ReZ() {
        com.bytedance.sdk.openadsdk.component.Au.ReZ reZ0 = this.Lrd;
        if(reZ0 != null) {
            reZ0.qj();
        }
    }

    private void SM() {
        if(this.ltE != null) {
            if(this.Zh.uQg() != null && false) {
                this.ltE.setText("");
            }
            else if(TextUtils.isEmpty(this.Zh.Ld())) {
                this.ltE.setVisibility(8);
            }
            else {
                this.ltE.setText(this.Zh.Ld());
            }
        }
        if(this.Owx != null) {
            if(TextUtils.isEmpty(this.Zh.Xtz())) {
                this.Owx.setVisibility(8);
            }
            else {
                this.Owx.setText(this.Zh.Xtz());
            }
        }
        if(this.gK != null && this.Zh.Xe() != null && !TextUtils.isEmpty(this.Zh.Xe().PjT())) {
            com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(this.Zh.Xe().PjT(), this.Zh.Xe().Zh(), this.Zh.Xe().ReZ(), this.gK, this.Zh);
        }
        this.JQp.ReZ();
    }

    public com.bytedance.sdk.openadsdk.component.Au.ReZ XX() {
        return this.Lrd;
    }

    private void Zh(int v) {
        qZS.PjT(this.Au, v);
    }

    public void Zh() {
        if(!this.Zh.pBJ()) {
            this.Au();
            return;
        }
        this.JQp.ReZ();
    }

    public int cr() {
        return -1;
    }

    protected void cz() {
        this.SM.setOnClickListener(new View.OnClickListener() {
            final ReZ PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                com.bytedance.sdk.openadsdk.component.PjT pjT0 = ReZ.this.JQp;
                if(pjT0 != null) {
                    pjT0.Zh(view0);
                }
            }
        });
        this.DWo.setOnClickListener(new View.OnClickListener() {
            final ReZ PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                com.bytedance.sdk.openadsdk.component.PjT pjT0 = ReZ.this.JQp;
                if(pjT0 != null) {
                    pjT0.PjT(view0);
                }
            }
        });
    }
}

