package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.Zh.Zh;
import com.bytedance.sdk.openadsdk.core.cRA;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf.Zh.cz;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;

public abstract class PjT extends ReZ {
    protected int Au;
    protected boolean DWo;
    protected TTDislikeDialogAbstract JQp;
    private XX PjT;
    protected Owx ReZ;
    protected int SM;
    protected int XX;
    protected Context Zh;
    protected com.bytedance.sdk.openadsdk.ReZ.ReZ cr;
    protected String cz;
    protected boolean qj;
    protected String xf;

    public PjT(@NonNull Context context0) {
        super(context0);
        this.cz = "embeded_ad";
        this.DWo = true;
        this.qj = true;
        this.setTag("tt_express_backup_fl_tag_26");
    }

    public PjT(@NonNull Context context0, String s) {
        super(context0);
        this.cz = "embeded_ad";
        this.DWo = true;
        this.qj = true;
        this.xf = s;
        this.setTag("tt_express_backup_fl_tag_26");
    }

    public void PjT() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract0 = this.JQp;
        if(tTDislikeDialogAbstract0 != null) {
            tTDislikeDialogAbstract0.show();
            return;
        }
        com.bytedance.sdk.openadsdk.ReZ.ReZ reZ0 = this.cr;
        if(reZ0 != null) {
            reZ0.PjT();
            return;
        }
        TTDelegateActivity.PjT(this.ReZ, null);
    }

    protected void PjT(int v) {
        this.qj = ub.cr().ReZ(String.valueOf(this.SM));
        int v1 = ub.cr().Zh(v);
        if(3 == v1) {
            this.DWo = false;
            return;
        }
        int v2 = ltE.ReZ(ub.PjT());
        if(1 == v1 && wN.cr(v2)) {
            this.DWo = true;
        }
        else if(2 == v1) {
            if(wN.JQp(v2) || wN.cr(v2) || wN.cz(v2)) {
                this.DWo = true;
            }
        }
        else if(5 == v1 && (wN.cr(v2) || wN.cz(v2))) {
            this.DWo = true;
        }
    }

    protected void PjT(View view0) {
        boolean z = true;
        if(this.ReZ != null && this.ReZ.MWx() != null && view0 != null) {
            if(this.ReZ.Qf() != 1 || !this.DWo) {
                z = false;
            }
            this.PjT(view0, z);
        }
    }

    // 检测为 Lambda 实现
    protected abstract void PjT(View arg1, int arg2, fDm arg3);

    protected void PjT(View view0, boolean z) {
        if(view0 == null) {
            return;
        }
        Zh zh0 = z ? new com.bytedance.sdk.openadsdk.core.Zh.PjT(this.Zh, this.ReZ, this.cz, wN.PjT(this.cz)) : new Zh(this.Zh, this.ReZ, this.cz, wN.PjT(this.cz));
        view0.setOnTouchListener(zh0);
        view0.setOnClickListener(zh0);
        zh0.PjT((View arg1, int arg2, fDm arg3) -> ;);

        class com.bytedance.sdk.openadsdk.core.Au.PjT.1 implements com.bytedance.sdk.openadsdk.core.Au.Zh {
            final PjT PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Au.Zh
            public void PjT(View view0, int v, fDm fDm0) {
                PjT.this.PjT(view0, v, fDm0);
            }
        }

    }

    protected String getDescription() {
        if(!TextUtils.isEmpty(this.ReZ.Xtz())) {
            return this.ReZ.Xtz();
        }
        return TextUtils.isEmpty(this.ReZ.ix()) ? "" : this.ReZ.ix();
    }

    protected String getNameOrSource() {
        Owx owx0 = this.ReZ;
        if(owx0 == null) {
            return "";
        }
        if(owx0.uQg() != null && false) {
            return "";
        }
        return TextUtils.isEmpty(this.ReZ.Ld()) ? "" : this.ReZ.Ld();
    }

    public float getRealHeight() {
        return (float)qZS.ReZ(this.Zh, ((float)this.Au));
    }

    public float getRealWidth() {
        return (float)qZS.ReZ(this.Zh, ((float)this.XX));
    }

    @Override  // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    protected String getTitle() {
        if(this.ReZ.uQg() != null && false) {
            return "";
        }
        if(!TextUtils.isEmpty(this.ReZ.Ld())) {
            return this.ReZ.Ld();
        }
        return TextUtils.isEmpty(this.ReZ.Xtz()) ? "" : this.ReZ.Xtz();
    }

    protected cz getVideoView() {
        Owx owx0 = this.ReZ;
        if(owx0 != null && this.Zh != null) {
            if(Owx.JQp(owx0)) {
                try {
                    cz cz0 = new cz(this.Zh, this.ReZ, this.cz, true, false, this.PjT);
                    cz0.setVideoCacheUrl(this.xf);
                    cz0.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.xf.Zh.cz.Zh() {
                        final PjT PjT;

                        @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz$Zh
                        public void PjT(boolean z, long v, long v1, long v2, boolean z1) {
                        }
                    });
                    cz0.setIsAutoPlay(this.DWo);
                    cz0.PjT(this.qj, "bannerGetVideoView");
                    return !Owx.JQp(this.ReZ) || cz0 == null || !cz0.PjT(0L, true, false) ? null : cz0;
                }
                catch(Throwable unused_ex) {
                }
            }
            return !Owx.JQp(this.ReZ) || true || !null.PjT(0L, true, false) ? null : null;
        }
        return null;
    }

    public void setDislikeInner(cRA cRA0) {
        if(cRA0 instanceof com.bytedance.sdk.openadsdk.ReZ.ReZ) {
            this.cr = (com.bytedance.sdk.openadsdk.ReZ.ReZ)cRA0;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract0) {
        if(tTDislikeDialogAbstract0 != null) {
            Owx owx0 = this.ReZ;
            if(owx0 != null) {
                tTDislikeDialogAbstract0.setMaterialMeta(owx0.xR(), this.ReZ.na());
            }
        }
        this.JQp = tTDislikeDialogAbstract0;
    }

    @Override  // android.view.View
    public void setTag(Object object0) {
        super.setTag("tt_express_backup_fl_tag_26");
    }
}

