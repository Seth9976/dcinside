package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.cz;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class TopLayoutDislike2 extends JQp implements PjT {
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private cr mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private CharSequence mProgressStr;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private Zh mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(@NonNull Context context0) {
        this(context0, null);
    }

    public TopLayoutDislike2(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public TopLayoutDislike2(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.mProgressStr = "";
        this.setOrientation(0);
    }

    public void clickDislike() {
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void clickSkip() {
        ImageView imageView0 = this.mSkipIV;
        if(imageView0 != null) {
            imageView0.performClick();
        }
        TextView textView0 = this.mTextViewCountDown;
        if(textView0 != null) {
            textView0.performClick();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void clickSound(String s) {
        ImageView imageView0 = this.mImgSound;
        if(imageView0 != null) {
            imageView0.setTag(imageView0.getId(), s);
            this.mImgSound.performClick();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    private ImageView getCommonRingBGImageView() {
        ImageView imageView0 = new cr(this.getContext());
        int v = qZS.Zh(this.getContext(), 5.0f);
        ((cr)imageView0).setPadding(v, v, v, v);
        imageView0.setScaleType(ImageView.ScaleType.CENTER);
        imageView0.setBackground(com.bytedance.sdk.openadsdk.core.widget.cr.PjT());
        return imageView0;
    }

    private void initListener() {
        View view0 = this.mImgDislike;
        if(view0 != null) {
            view0.setOnClickListener(new View.OnClickListener() {
                final TopLayoutDislike2 PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.Zh(view0);
                    }
                }
            });
        }
        ImageView imageView0 = this.mImgSound;
        if(imageView0 != null) {
            imageView0.setOnClickListener(new View.OnClickListener() {
                final TopLayoutDislike2 PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    Drawable drawable0;
                    TopLayoutDislike2.this.mIsSoundMute = !TopLayoutDislike2.this.mIsSoundMute;
                    if(TopLayoutDislike2.this.mSkipIV == null) {
                        drawable0 = TopLayoutDislike2.this.mIsSoundMute ? DWo.PjT(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : DWo.PjT(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    else if(TopLayoutDislike2.this.mIsSoundMute) {
                        drawable0 = Lrd.ReZ(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute");
                    }
                    else {
                        drawable0 = Lrd.ReZ(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    }
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(drawable0);
                    if(TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if(TopLayoutDislike2.this.mTopListener != null) {
                        Object object0 = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.PjT(view0, (object0 instanceof String ? object0.toString() : "nativeClick"));
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView1 = this.mSkipIV;
        if(imageView1 == null) {
            TextView textView0 = this.mTextViewCountDown;
            if(textView0 != null) {
                textView0.setOnClickListener(new View.OnClickListener() {
                    final TopLayoutDislike2 PjT;

                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        if(TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.PjT(view0);
                        }
                    }
                });
            }
        }
        else {
            imageView1.setOnClickListener(new View.OnClickListener() {
                final TopLayoutDislike2 PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.PjT(view0);
                    }
                }
            });
        }
        cr cr0 = this.mCloseBtn;
        if(cr0 != null) {
            cr0.setOnClickListener(new View.OnClickListener() {
                final TopLayoutDislike2 PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.ReZ(view0);
                    }
                }
            });
        }
    }

    private void initView() {
        int v = qZS.Zh(this.getContext(), 16.0f);
        int v1 = qZS.Zh(this.getContext(), 20.0f);
        int v2 = qZS.Zh(this.getContext(), 28.0f);
        this.mImgSound = this.getCommonRingBGImageView();
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v2, v2);
        linearLayout$LayoutParams0.leftMargin = v;
        linearLayout$LayoutParams0.topMargin = v1;
        this.mImgSound.setId(qla.Lrs);
        this.mImgSound.setLayoutParams(linearLayout$LayoutParams0);
        ImageView imageView0 = this.getCommonRingBGImageView();
        this.mImgDislike = imageView0;
        imageView0.setId(0x1F000011);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(v2, v2);
        linearLayout$LayoutParams1.topMargin = v1;
        linearLayout$LayoutParams1.leftMargin = v;
        this.mImgDislike.setLayoutParams(linearLayout$LayoutParams1);
        View view0 = new View(this.getContext());
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(0, 0);
        linearLayout$LayoutParams2.weight = 1.0f;
        view0.setLayoutParams(linearLayout$LayoutParams2);
        Au au0 = new Au(this.getContext());
        this.mTextViewCountDown = au0;
        au0.setBackground(com.bytedance.sdk.openadsdk.core.widget.cr.Zh());
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-2, qZS.Zh(this.getContext(), 28.0f));
        linearLayout$LayoutParams3.topMargin = qZS.Zh(this.getContext(), 20.0f);
        int v3 = qZS.Zh(this.getContext(), 16.0f);
        linearLayout$LayoutParams1.rightMargin = v3;
        linearLayout$LayoutParams3.rightMargin = v3;
        int v4 = qZS.Zh(this.getContext(), 12.0f);
        qZS.Zh(this.getContext(), 5.0f);
        this.mTextViewCountDown.setPadding(v4, 0, v4, 0);
        this.mTextViewCountDown.setLayoutParams(linearLayout$LayoutParams3);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        ImageView imageView1 = this.getCommonRingBGImageView();
        this.mSkipIV = imageView1;
        imageView1.setId(0x1F000012);
        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(v2, v2);
        linearLayout$LayoutParams4.topMargin = v1;
        linearLayout$LayoutParams4.rightMargin = v;
        this.mSkipIV.setLayoutParams(linearLayout$LayoutParams4);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        cr cr0 = cz.Zh(this.getContext());
        this.mCloseBtn = cr0;
        cr0.setId(0x1F00000C);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 0x800035;
        frameLayout$LayoutParams0.topMargin = qZS.Zh(this.getContext(), 20.0f);
        frameLayout$LayoutParams0.rightMargin = qZS.Zh(this.getContext(), 24.0f);
        this.mCloseBtn.setLayoutParams(frameLayout$LayoutParams0);
        this.mCloseBtn.setContentDescription(Lrd.PjT(this.getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        this.addView(this.mImgSound);
        this.addView(this.mImgDislike);
        this.addView(view0);
        this.addView(this.mTextViewCountDown);
        this.addView(this.mSkipIV);
        this.addView(this.mCloseBtn);
    }

    public View load(@NonNull Owx owx0) {
        return this.load(owx0);
    }

    public TopLayoutDislike2 load(@NonNull Owx owx0) {
        this.initView();
        this.mImgDislike.setVisibility(0);
        ((ImageView)this.mImgDislike).setImageResource(Lrd.cr(ub.PjT(), "tt_reward_full_feedback"));
        if(xs.Gr().fDm(String.valueOf(owx0.joj()))) {
            switch(owx0.RD()) {
                case 5: 
                case 6: {
                    this.mSkipIV.setImageResource(Lrd.cr(ub.PjT(), "tt_close_btn"));
                    break;
                }
                default: {
                    this.mSkipIV.setImageResource(Lrd.cr(ub.PjT(), "tt_skip_btn"));
                }
            }
        }
        else {
            this.mSkipIV.setImageResource(Lrd.cr(ub.PjT(), "tt_close_btn"));
        }
        if(this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = owx0.MWx() == null ? 0 : ((int)owx0.MWx().C()) * owx0.MWx().t();
        if(gK.cr(owx0) && owx0.xs() != null) {
            this.videoDuration = (int)owx0.xs().Zh();
        }
        else if(gK.JQp(owx0) && owx0.xs() != null) {
            this.videoDuration = (int)owx0.xs().cr();
        }
        if(this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if(owx0.XWz() != 8 || owx0.ig() == null) {
            this.skipTime = owx0.Zh() >= 0 ? owx0.Zh() : ub.cr().DWo(owx0.ig().getCodeId());
        }
        else if(owx0.PjT() >= 0) {
            this.skipTime = owx0.PjT();
        }
        else {
            this.skipTime = ub.cr().ltE(owx0.ig().getCodeId());
        }
        if(cRA.ReZ(owx0)) {
            this.skipTime = ub.cr().PjT(String.valueOf(owx0.joj()), owx0.Sky());
            this.videoDuration = owx0.Gr();
        }
        this.shouldShowSkipTime = this.skipTime == -1 || this.skipTime >= this.videoDuration;
        if(owx0.uvo()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        this.initListener();
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setListener(Zh zh0) {
        this.mTopListener = zh0;
    }

    public void setShouldShowSkipTime(boolean z) {
        this.shouldShowSkipTime = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setShowDislike(boolean z) {
        View view0 = this.mImgDislike;
        if(view0 != null && !this.isVast) {
            view0.setVisibility((z ? 0 : 8));
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setShowSkip(boolean z) {
        TextView textView0 = this.mTextViewCountDown;
        if(textView0 == null) {
            return;
        }
        if(!z) {
            textView0.setText("");
        }
        if(this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z;
        int v = 8;
        this.mSkipIV.setVisibility((!z || !this.hasCutDown ? 8 : 0));
        boolean z1 = TextUtils.isEmpty(this.mTextViewCountDown.getText());
        TextView textView1 = this.mTextViewCountDown;
        if((z & !z1) != 0) {
            v = 0;
        }
        textView1.setVisibility(v);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setShowSound(boolean z) {
        ImageView imageView0 = this.mImgSound;
        if(imageView0 != null) {
            imageView0.setVisibility((z ? 0 : 8));
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setSkipEnable(boolean z) {
        ImageView imageView0 = this.mSkipIV;
        if(imageView0 != null) {
            imageView0.setEnabled(z);
            this.mSkipIV.setClickable(z);
            return;
        }
        TextView textView0 = this.mTextViewCountDown;
        if(textView0 != null) {
            textView0.setEnabled(z);
            this.mTextViewCountDown.setClickable(z);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setSkipText(CharSequence charSequence0) {
        if(TextUtils.isEmpty(charSequence0)) {
            return;
        }
        this.mTextViewCountDown.setText(charSequence0);
        if(this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView0 = this.mSkipIV;
        if(imageView0 != null) {
            imageView0.setVisibility(8);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void setSoundMute(boolean z) {
        Drawable drawable0;
        this.mIsSoundMute = z;
        if(this.mSkipIV == null) {
            drawable0 = z ? DWo.PjT(this.getContext(), "tt_mute_wrapper") : DWo.PjT(this.getContext(), "tt_unmute_wrapper");
        }
        else if(z) {
            drawable0 = Lrd.ReZ(this.getContext(), "tt_reward_full_mute");
        }
        else {
            drawable0 = Lrd.ReZ(this.getContext(), "tt_reward_full_unmute");
        }
        this.mImgSound.setImageDrawable(drawable0);
        if(this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    @SuppressLint({"SetTextI18n"})
    public void setTime(CharSequence charSequence0, CharSequence charSequence1) {
        int v;
        if(!TextUtils.isEmpty(charSequence0)) {
            this.mProgressStr = charSequence0;
        }
        if(this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if(this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(this.mProgressStr + "s");
            this.updateTime(false);
            return;
        }
        String s = (String)this.mProgressStr;
        try {
            v = this.skipTime == 0 ? Integer.parseInt(s) : this.skipTime - (this.videoDuration - Integer.parseInt(s));
            if(v > 0) {
                goto label_12;
            }
            goto label_18;
        }
        catch(Exception unused_ex) {
            return;
        }
    label_12:
        if(this.skipTime == 0) {
            this.updateTime(false);
            return;
        }
        this.mTextViewCountDown.setText(v + "s");
        this.updateTime(true);
        return;
    label_18:
        this.mTextViewCountDown.setText(this.mProgressStr + "s");
        this.updateTime(false);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void showCloseButton() {
        this.setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.top.PjT
    public void showSkipButton() {
        ImageView imageView0 = this.mSkipIV;
        if(imageView0 != null) {
            imageView0.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
    }

    private void updateTime(boolean z) {
        if(this.hasShowClose) {
            return;
        }
        if(this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
            return;
        }
        if(z) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setVisibility(8);
        this.mSkipIV.setVisibility(0);
    }
}

