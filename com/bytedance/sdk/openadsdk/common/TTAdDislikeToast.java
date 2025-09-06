package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class TTAdDislikeToast extends ReZ {
    private final Handler mHandler;
    private TextView mTextView;
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;

    public TTAdDislikeToast(Context context0) {
        this(context0, null);
    }

    public TTAdDislikeToast(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public TTAdDislikeToast(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.setVisibility(8);
        this.setClickable(false);
        this.setFocusable(false);
        this.initToast(context0);
    }

    public static String getDislikeSendTip() {
        if(TTAdDislikeToast.sDislikeSendTip == null) {
            Context context0 = ub.PjT();
            TTAdDislikeToast.sDislikeSendTip = Lrd.PjT(context0, "tt_feedback_thank_text") + "\n" + Lrd.PjT(context0, "tt_feedback_experience_text");
        }
        return TTAdDislikeToast.sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if(TTAdDislikeToast.sDislikeTip == null) {
            TTAdDislikeToast.sDislikeTip = Lrd.PjT(ub.PjT(), "tt_feedback_submit_text");
        }
        return TTAdDislikeToast.sDislikeTip;
    }

    public static String getSkipText() {
        if(TTAdDislikeToast.sSkipText == null) {
            TTAdDislikeToast.sSkipText = Lrd.PjT(ub.PjT(), "tt_reward_screen_skip_tx");
        }
        return TTAdDislikeToast.sSkipText;
    }

    public void hide() {
        this.setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    private void initToast(Context context0) {
        TextView textView0 = new TextView(context0);
        this.mTextView = textView0;
        textView0.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 49;
        frameLayout$LayoutParams0.topMargin = qZS.Zh(this.getContext(), 75.0f);
        int v = qZS.Zh(ub.PjT(), 16.0f);
        int v1 = qZS.Zh(ub.PjT(), 12.0f);
        this.mTextView.setPadding(v, v1, v, v1);
        this.mTextView.setLayoutParams(frameLayout$LayoutParams0);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(0x800003);
        Drawable drawable0 = Lrd.ReZ(this.getContext(), "tt_dislike_toast");
        int v2 = qZS.Zh(this.getContext(), 16.0f);
        drawable0.setBounds(0, 0, v2, v2);
        this.mTextView.setCompoundDrawablePadding(v2 / 2);
        this.mTextView.setCompoundDrawables(drawable0, null, null, null);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setColor(Color.argb(209, 37, 37, 37));
        gradientDrawable0.setCornerRadius(((float)qZS.Zh(ub.PjT(), 12.0f)));
        this.mTextView.setBackground(gradientDrawable0);
        this.addView(this.mTextView);
    }

    public void onDestroy() {
        this.setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public static void onResourceUpdated() {
        Context context0 = ub.PjT();
        TTAdDislikeToast.sSkipText = Lrd.PjT(context0, "tt_reward_screen_skip_tx");
        TTAdDislikeToast.sDislikeTip = Lrd.PjT(context0, "tt_feedback_submit_text");
        TTAdDislikeToast.sDislikeSendTip = Lrd.PjT(context0, "tt_feedback_thank_text") + "\n" + Lrd.PjT(context0, "tt_feedback_experience_text");
    }

    public void show(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1 tTAdDislikeToast$10 = new Runnable() {
            final TTAdDislikeToast Zh;

            @Override
            public void run() {
                if(TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(s));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        };
        this.mHandler.post(tTAdDislikeToast$10);
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2 tTAdDislikeToast$20 = new Runnable() {
            final TTAdDislikeToast PjT;

            @Override
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        };
        this.mHandler.postDelayed(tTAdDislikeToast$20, 2000L);
    }
}

