package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.Zh.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.xf.Zh.cz;
import com.bytedance.sdk.openadsdk.utils.cr;

public class PAGVideoMediaView extends PAGMediaView implements PjT {
    private final com.bytedance.sdk.openadsdk.PjT.Zh.PjT ReZ;
    private cz Zh;
    private Owx cr;

    public PAGVideoMediaView(Context context0, @Nullable View view0, @Nullable com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT0) {
        super(context0);
        this.PjT(view0);
        this.ReZ = pjT0;
    }

    private void PjT() {
        cz cz0 = this.Zh;
        if(cz0 != null) {
            cz0.fDm();
        }
    }

    private void PjT(View view0) {
        if(view0 instanceof cz) {
            this.Zh = (cz)view0;
            this.addView(((cz)view0), -1, -1);
        }
    }

    private boolean Zh() {
        return this.Zh == null ? false : this.Zh.xf();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        cz cz0 = this.Zh;
        if(cz0 != null) {
            cz0.qla();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT$PjT
    public long getVideoProgress() {
        return this.Zh == null || this.Zh.getNativeVideoController() == null ? 0L : this.Zh.getNativeVideoController().JQp();
    }

    public void handleInterruptVideo() {
        if(!this.Zh()) {
            this.PjT();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        cr.PjT(this, this.cr);
    }

    public void setMaterialMeta(Owx owx0) {
        this.cr = owx0;
    }

    @Override  // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        super.setOnClickListener(view$OnClickListener0);
        if(view$OnClickListener0 instanceof com.bytedance.sdk.openadsdk.core.Zh.PjT) {
            ((com.bytedance.sdk.openadsdk.core.Zh.PjT)view$OnClickListener0).PjT(this);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener0) {
        com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT0 = this.ReZ;
        if(pjT0 == null) {
            return;
        }
        pjT0.PjT(new PAGVideoAdListener() {
            final PAGVideoMediaView Zh;

            @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener0 = pAGVideoAdListener0;
                if(pAGVideoAdListener0 != null) {
                    pAGVideoAdListener0.onVideoAdComplete();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener0 = pAGVideoAdListener0;
                if(pAGVideoAdListener0 != null) {
                    pAGVideoAdListener0.onVideoAdPaused();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener0 = pAGVideoAdListener0;
                if(pAGVideoAdListener0 != null) {
                    pAGVideoAdListener0.onVideoAdPlay();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener0 = pAGVideoAdListener0;
                if(pAGVideoAdListener0 != null) {
                    pAGVideoAdListener0.onVideoError();
                }
            }
        });
    }
}

