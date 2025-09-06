package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.qla;

public class ReZ extends View implements PjT {
    private PjT PjT;

    public ReZ(Context context0) {
        this(context0, null);
    }

    public ReZ(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ReZ(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    private void PjT(View view0, ViewGroup viewGroup0) {
        int v = viewGroup0.indexOfChild(this);
        viewGroup0.removeViewInLayout(this);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup0.addView(view0, v);
        }
        else {
            viewGroup0.addView(view0, v, viewGroup$LayoutParams0);
        }
        if(view0 != null) {
            view0.setId(qla.wWn);
        }
    }

    public ReZ PjT(@NonNull Owx owx0) {
        if(this.PjT != null) {
            return this;
        }
        TopLayoutDislike2 topLayoutDislike20 = new TopLayoutDislike2(this.getContext()).load(owx0);
        this.PjT = topLayoutDislike20;
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
            this.PjT(topLayoutDislike20, ((ViewGroup)viewParent0));
        }
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void clickSkip() {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.clickSkip();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void clickSound(String s) {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.clickSound(s);
        }
    }

    @Override  // android.view.View
    protected void dispatchDraw(Canvas canvas0) {
    }

    @Override  // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public View getCloseButton() {
        return this.PjT == null ? null : this.PjT.getCloseButton();
    }

    public View getITopLayout() {
        return this.PjT instanceof View ? ((View)this.PjT) : null;
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setListener(Zh zh0) {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.setListener(zh0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setShowDislike(boolean z) {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.setShowDislike(z);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setShowSkip(boolean z) {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.setShowSkip(z);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setShowSound(boolean z) {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.setShowSound(z);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setSkipEnable(boolean z) {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.setSkipEnable(z);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setSkipInvisiable() {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.setSkipInvisiable();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setSkipText(CharSequence charSequence0) {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.setSkipText(charSequence0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setSoundMute(boolean z) {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.setSoundMute(z);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setTime(CharSequence charSequence0, CharSequence charSequence1) {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.setTime(charSequence0, charSequence1);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void showCloseButton() {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.showCloseButton();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void showCountDownText() {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.showCountDownText();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void showSkipButton() {
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            pjT0.showSkipButton();
        }
    }
}

