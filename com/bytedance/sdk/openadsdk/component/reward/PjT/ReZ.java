package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.qla;
import com.bytedance.sdk.openadsdk.component.reward.Zh.Zh;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;

public class ReZ {
    private final PjT PjT;
    private TTAdDislikeToast ReZ;
    private qla Zh;

    public ReZ(PjT pjT0) {
        this.PjT = pjT0;
    }

    public void PjT() {
        TTAdDislikeToast tTAdDislikeToast0 = this.ReZ;
        if(tTAdDislikeToast0 != null) {
            tTAdDislikeToast0.hide();
        }
    }

    public void PjT(Zh zh0) {
        if(this.PjT.rds.isFinishing()) {
            return;
        }
        if(this.PjT.xf.get()) {
            if(this.ReZ == null) {
                this.ReZ = new TTAdDislikeToast(this.PjT.rds);
                ((FrameLayout)this.PjT.rds.findViewById(0x1020002)).addView(this.ReZ);
            }
            this.ReZ.show(TTAdDislikeToast.getDislikeTip());
            return;
        }
        if(this.Zh == null) {
            try {
                this.Zh(zh0);
            }
            catch(Throwable throwable0) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", throwable0);
            }
        }
        qla qla0 = this.Zh;
        if(qla0 != null) {
            qla0.PjT();
        }
    }

    private void ReZ() {
        TTAdDislikeToast tTAdDislikeToast0 = this.ReZ;
        if(tTAdDislikeToast0 != null) {
            tTAdDislikeToast0.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void Zh(Zh zh0) {
        if(this.Zh == null) {
            qla qla0 = new qla(this.PjT.rds, this.PjT.Zh);
            this.Zh = qla0;
            qla0.setCallback(new com.bytedance.sdk.openadsdk.common.qla.PjT() {
                final ReZ Zh;

                @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                public void PjT(View view0) {
                    ReZ.this.PjT.qj.set(true);
                    String s = "landing_page";
                    if(!gK.Zh(ReZ.this.PjT.Zh) && !gK.cr(ReZ.this.PjT.Zh) && !gK.JQp(ReZ.this.PjT.Zh)) {
                        if(!ReZ.this.PjT.DWo.get()) {
                            s = "video_player";
                        }
                        else if(cRA.Zh(ReZ.this.PjT.Zh)) {
                            s = "playable";
                        }
                        else if(!ReZ.this.PjT.Zh.IJ()) {
                            s = "endcard";
                        }
                    }
                    ReZ.this.Zh.setDislikeSource(s);
                    if(ReZ.this.PjT.tT.JQp) {
                        if(ReZ.this.PjT.yIW != null) {
                            ReZ.this.PjT.yIW.PjT(8, false);
                        }
                        return;
                    }
                    zh0.xE();
                    if(ReZ.this.PjT.tT.Zh()) {
                        ReZ.this.PjT.tT.xE();
                    }
                    if(ReZ.this.PjT.hN instanceof com.bytedance.sdk.openadsdk.activity.ReZ && !ReZ.this.PjT.hN.Lrd()) {
                        ReZ.this.PjT.hN.cRA().PjT(2);
                    }
                    com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(ReZ.this.PjT.Zh, 8);
                }

                @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                public void PjT(FilterWord filterWord0) {
                    if(!ReZ.this.PjT.xf.get() && filterWord0 != null && !filterWord0.hasSecondOptions()) {
                        ReZ.this.PjT.xf.set(true);
                        ReZ.this.ReZ();
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                public void Zh(View view0) {
                    ReZ.this.PjT.qj.set(false);
                    if(ReZ.this.PjT.tT.JQp) {
                        if(ReZ.this.PjT.yIW != null) {
                            ReZ.this.PjT.yIW.PjT(0, true);
                        }
                        return;
                    }
                    ReZ.this.PjT.tT.PjT(zh0);
                    if(ReZ.this.PjT.tT.cr()) {
                        ReZ.this.PjT.tT.qla();
                    }
                    if(ReZ.this.PjT.hN instanceof com.bytedance.sdk.openadsdk.activity.ReZ && !ReZ.this.PjT.hN.Lrd()) {
                        ReZ.this.PjT.hN.cRA().PjT(1);
                    }
                    com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(ReZ.this.PjT.Zh, 4);
                }
            });
            ((FrameLayout)this.PjT.rds.findViewById(0x1020002)).addView(this.Zh);
        }
        if(this.ReZ == null) {
            this.ReZ = new TTAdDislikeToast(this.PjT.rds);
            ((FrameLayout)this.PjT.rds.findViewById(0x1020002)).addView(this.ReZ);
        }
    }

    public void Zh() {
        TTAdDislikeToast tTAdDislikeToast0 = this.ReZ;
        if(tTAdDislikeToast0 != null) {
            tTAdDislikeToast0.onDestroy();
        }
    }
}

