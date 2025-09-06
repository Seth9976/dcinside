package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.component.adexpress.Zh.qj;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.Zh;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.adexpress.dynamic.cr.cz;
import com.bytedance.sdk.component.adexpress.dynamic.cr;
import com.bytedance.sdk.component.adexpress.theme.PjT;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DynamicRootView extends FrameLayout implements cr, PjT {
    private String bgColor;
    private Map bgMaterialCenterCalcColor;
    private JQp dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.cz.PjT mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private qj mRenderListener;
    private xs mRenderRequest;
    private ViewGroup mTimeOut;
    private Zh muteListener;
    protected final fDm renderResult;
    private int scoreCountWithIcon;
    private List timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.JQp videoListener;
    public View videoView;

    public DynamicRootView(Context context0, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver0, boolean z, xs xs0, com.bytedance.sdk.component.adexpress.dynamic.cz.PjT pjT0) {
        super(context0);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context0;
        fDm fDm0 = new fDm();
        this.renderResult = fDm0;
        fDm0.PjT(2);
        this.mDynamicClickListener = pjT0;
        pjT0.PjT(this);
        this.mReceiver = themeStatusBroadcastReceiver0;
        themeStatusBroadcastReceiver0.PjT(this);
        this.mIsMute = z;
        this.mRenderRequest = xs0;
    }

    public void beginHideFromVisible() {
        this.beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        this.beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void beginShowFromInvisible(JQp jQp0, int v) {
        if(jQp0 == null) {
            return;
        }
        if(jQp0.getBeginInvisibleAndShow()) {
            jQp0.setVisibility(v);
            View view0 = jQp0.qla;
            if(view0 != null) {
                view0.setVisibility(v);
            }
        }
        int v1 = jQp0.getChildCount();
        if(v1 <= 0) {
            return;
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(jQp0.getChildAt(v2) instanceof JQp) {
                this.beginShowFromInvisible(((JQp)jQp0.getChildAt(v2)), v);
            }
        }
    }

    public void callBackRenderFail(int v, String s) {
        this.renderResult.PjT(false);
        this.renderResult.Zh(v);
        this.renderResult.PjT(s);
        this.mRenderListener.PjT(this.renderResult);
    }

    private void checkCanOpenLandingPage(Au au0) {
        com.bytedance.sdk.component.adexpress.dynamic.cr.JQp jQp0 = au0.DWo();
        if(jQp0 == null) {
            return;
        }
        cz cz0 = jQp0.JQp();
        if(cz0 == null) {
            return;
        }
        this.renderResult.Zh(cz0.VZ());
    }

    private boolean checkSizeValid() {
        return this.dynamicBaseWidget.JQp > 0.0f && this.dynamicBaseWidget.cz > 0.0f;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.cz.PjT getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public qj getRenderListener() {
        return this.mRenderListener;
    }

    public xs getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override  // com.bytedance.sdk.component.adexpress.theme.PjT
    public void onThemeChanged(int v) {
        JQp jQp0 = this.dynamicBaseWidget;
        if(jQp0 == null) {
            return;
        }
        jQp0.PjT(v);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void onvideoComplate() {
        try {
            this.videoListener.PjT();
        }
        catch(Exception unused_ex) {
        }
    }

    public void render(Au au0, int v) {
        this.dynamicBaseWidget = this.renderDynamicView(au0, this, v);
        this.renderResult.PjT(true);
        this.renderResult.PjT(((double)this.dynamicBaseWidget.JQp));
        this.renderResult.Zh(((double)this.dynamicBaseWidget.cz));
        this.renderResult.PjT(this.videoView);
        this.mRenderListener.PjT(this.renderResult);
    }

    public JQp renderDynamicView(Au au0, ViewGroup viewGroup0, int v) {
        if(au0 == null) {
            return null;
        }
        List list0 = au0.qj();
        JQp jQp0 = com.bytedance.sdk.component.adexpress.dynamic.PjT.Zh.PjT(this.mContext, this, au0);
        if(jQp0 instanceof Qf) {
            this.callBackRenderFail((v == 3 ? 0x80 : 0x76), "unknow widget");
            return null;
        }
        this.checkCanOpenLandingPage(au0);
        jQp0.ReZ();
        if(viewGroup0 != null) {
            viewGroup0.addView(jQp0);
            this.setClipChildren(viewGroup0, au0);
        }
        if(list0 != null && list0.size() > 0) {
            for(Object object0: list0) {
                this.renderDynamicView(((Au)object0), jQp0, v);
            }
            return jQp0;
        }
        return null;
    }

    public void setBgColor(String s) {
        this.bgColor = s;
    }

    public void setBgMaterialCenterCalcColor(Map map0) {
        this.bgMaterialCenterCalcColor = map0;
    }

    private void setClipChildren(ViewGroup viewGroup0, Au au0) {
        if(viewGroup0 == null) {
            return;
        }
        ViewGroup viewGroup1 = (ViewGroup)viewGroup0.getParent();
        if(viewGroup1 != null && au0.Lrd()) {
            viewGroup1.setClipChildren(false);
            viewGroup1.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup)viewGroup1.getParent();
            if(viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
        }
    }

    public void setDislikeView(View view0) {
        this.mDynamicClickListener.Zh(view0);
    }

    public void setLogoUnionHeight(int v) {
        this.logoUnionHeight = v;
    }

    public void setMuteListener(Zh zh0) {
        this.muteListener = zh0;
    }

    public void setRenderListener(qj qj0) {
        this.mRenderListener = qj0;
        this.mDynamicClickListener.PjT(qj0);
    }

    public void setScoreCountWithIcon(int v) {
        this.scoreCountWithIcon = v;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void setSoundMute(boolean z) {
        Zh zh0 = this.muteListener;
        if(zh0 != null) {
            zh0.setSoundMute(z);
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void setTime(CharSequence charSequence0, int v, int v1, boolean z) {
        for(int v2 = 0; v2 < this.timeOutListener.size(); ++v2) {
            if(this.timeOutListener.get(v2) != null) {
                ((ReZ)this.timeOutListener.get(v2)).PjT(charSequence0, v == 1, v1, z);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup0) {
        this.mTimeOut = viewGroup0;
    }

    public void setTimeOutListener(ReZ reZ0) {
        this.timeOutListener.add(reZ0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void setTimeUpdate(int v) {
        this.videoListener.setTimeUpdate(v);
    }

    public void setTimedown(int v) {
        this.timedown = v;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.JQp jQp0) {
        this.videoListener = jQp0;
    }

    public void updateRenderInfoForVideo(double f, double f1, double f2, double f3, float f4) {
        this.renderResult.ReZ(f);
        this.renderResult.cr(f1);
        this.renderResult.JQp(f2);
        this.renderResult.cz(f3);
        this.renderResult.PjT(f4);
        this.renderResult.Zh(f4);
        this.renderResult.ReZ(f4);
        this.renderResult.cr(f4);
    }
}

