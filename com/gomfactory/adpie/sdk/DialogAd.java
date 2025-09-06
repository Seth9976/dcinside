package com.gomfactory.adpie.sdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.gomfactory.adpie.sdk.common.Constants;
import com.gomfactory.adpie.sdk.dialog.DialogStyle;
import com.gomfactory.adpie.sdk.dialog.RoundedRelativeLayout;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.ClickThroughUtil;
import com.gomfactory.adpie.sdk.util.DisplayUtil;

@Deprecated
public class DialogAd extends Dialog {
    public interface DialogAdListener {
        void onAdClicked();

        void onAdFailedToLoad(int arg1);

        void onAdLoaded();

        void onFirstButtonClicked();

        void onSecondButtonClicked();

        void onThirdButtonClicked();
    }

    public static final String TAG = "DialogAd";
    private ImageView defaultImageView;
    private FrameLayout mAdFrameLayout;
    private int mAdHeight;
    private AdView mAdView;
    private int mAdWidth;
    private int mBackgroundColor;
    public int mButtonCount;
    public int mButtonTextSize;
    private String mClickUrl;
    private LinearLayout mContentLayout;
    private Context mContext;
    private int mDefaultImageResId;
    private DialogAdListener mDialogAdListener;
    private RoundedRelativeLayout mDialogLayout;
    private int mFirstButtonColor;
    private String mFirstButtonText;
    private int mFirstButtonTextColor;
    private boolean mIsLoadingBar;
    private String mMessageText;
    private int mMessageTextColor;
    private int mMessageTextSize;
    private ProgressBar mProgressbar;
    private int mRadius;
    private int mSecondButtonColor;
    private String mSecondButtonText;
    private int mSecondButtonTextColor;
    private String mSlotId;
    private int mThirdButtonColor;
    private String mThirdButtonText;
    private int mThirdButtonTextColor;
    private TextView messageTextView;

    static {
    }

    protected DialogAd(@NonNull Context context0, @StyleRes int v) {
        super(context0, v);
        this.mButtonCount = 2;
        this.mButtonTextSize = 15;
        this.mAdWidth = 0xFA;
        this.mAdHeight = 0xFA;
        this.mBackgroundColor = -1;
        this.mMessageText = "서비스를 종료하시겠습니까?";
        this.mMessageTextColor = 0xFF000000;
        this.mMessageTextSize = 15;
        this.mFirstButtonText = "취소";
        this.mFirstButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mFirstButtonTextColor = -1;
        this.mSecondButtonText = "종료";
        this.mSecondButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mSecondButtonTextColor = -1;
        this.mThirdButtonText = "확인";
        this.mThirdButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mThirdButtonTextColor = -1;
        this.mRadius = 10;
        this.mIsLoadingBar = true;
        this.mContext = context0;
    }

    public DialogAd(@NonNull Context context0, DialogStyle dialogStyle0) {
        super(context0);
        this.mButtonCount = 2;
        this.mButtonTextSize = 15;
        this.mAdWidth = 0xFA;
        this.mAdHeight = 0xFA;
        this.mBackgroundColor = -1;
        this.mMessageText = "서비스를 종료하시겠습니까?";
        this.mMessageTextColor = 0xFF000000;
        this.mMessageTextSize = 15;
        this.mFirstButtonText = "취소";
        this.mFirstButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mFirstButtonTextColor = -1;
        this.mSecondButtonText = "종료";
        this.mSecondButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mSecondButtonTextColor = -1;
        this.mThirdButtonText = "확인";
        this.mThirdButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mThirdButtonTextColor = -1;
        this.mRadius = 10;
        this.mIsLoadingBar = true;
        this.mContext = context0;
        this.setDialogStyle(dialogStyle0);
    }

    public DialogAd(@NonNull Context context0, DialogStyle dialogStyle0, String s) {
        super(context0);
        this.mButtonCount = 2;
        this.mButtonTextSize = 15;
        this.mAdWidth = 0xFA;
        this.mAdHeight = 0xFA;
        this.mBackgroundColor = -1;
        this.mMessageText = "서비스를 종료하시겠습니까?";
        this.mMessageTextColor = 0xFF000000;
        this.mMessageTextSize = 15;
        this.mFirstButtonText = "취소";
        this.mFirstButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mFirstButtonTextColor = -1;
        this.mSecondButtonText = "종료";
        this.mSecondButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mSecondButtonTextColor = -1;
        this.mThirdButtonText = "확인";
        this.mThirdButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mThirdButtonTextColor = -1;
        this.mRadius = 10;
        this.mIsLoadingBar = true;
        this.mContext = context0;
        this.mSlotId = s;
        this.setDialogStyle(dialogStyle0);
    }

    protected DialogAd(@NonNull Context context0, boolean z, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        super(context0, z, dialogInterface$OnCancelListener0);
        this.mButtonCount = 2;
        this.mButtonTextSize = 15;
        this.mAdWidth = 0xFA;
        this.mAdHeight = 0xFA;
        this.mBackgroundColor = -1;
        this.mMessageText = "서비스를 종료하시겠습니까?";
        this.mMessageTextColor = 0xFF000000;
        this.mMessageTextSize = 15;
        this.mFirstButtonText = "취소";
        this.mFirstButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mFirstButtonTextColor = -1;
        this.mSecondButtonText = "종료";
        this.mSecondButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mSecondButtonTextColor = -1;
        this.mThirdButtonText = "확인";
        this.mThirdButtonColor = Constants.DEFAULT_DIALOG_BUTTON_COLOR;
        this.mThirdButtonTextColor = -1;
        this.mRadius = 10;
        this.mIsLoadingBar = true;
        this.mContext = context0;
    }

    @Override  // android.app.Dialog
    public void cancel() {
        super.cancel();
        AdPieLog.d("DialogAd", this.mSlotId + ":::cancel");
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        super.dismiss();
        AdPieLog.d("DialogAd", this.mSlotId + ":::dismiss");
    }

    @Override  // android.app.Dialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        AdPieLog.d("DialogAd", this.mSlotId + ":::onCreate");
        this.requestWindowFeature(1);
        this.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        RoundedRelativeLayout roundedRelativeLayout0 = new RoundedRelativeLayout(this.mContext);
        this.mDialogLayout = roundedRelativeLayout0;
        roundedRelativeLayout0.setCornerRadius(DisplayUtil.dpToPx(this.mContext, this.mRadius));
        this.mDialogLayout.setBackgroundColor(this.mBackgroundColor);
        this.addContentView(this.mDialogLayout, new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout0 = new LinearLayout(this.mContext);
        linearLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout0.setOrientation(1);
        this.mDialogLayout.addView(linearLayout0);
        this.mAdView = new AdView(this.mContext);
        this.mAdFrameLayout = new FrameLayout(this.mContext);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        this.mAdFrameLayout.setLayoutParams(frameLayout$LayoutParams0);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(DisplayUtil.dpToPx(this.mContext, this.mAdWidth), DisplayUtil.dpToPx(this.mContext, this.mAdHeight));
        frameLayout$LayoutParams1.gravity = 1;
        if(this.mDefaultImageResId > 0) {
            ImageView imageView0 = new ImageView(this.mContext);
            this.defaultImageView = imageView0;
            imageView0.setLayoutParams(frameLayout$LayoutParams1);
            this.defaultImageView.setAdjustViewBounds(true);
            this.defaultImageView.setVisibility(8);
            this.defaultImageView.setImageResource(this.mDefaultImageResId);
            this.defaultImageView.setOnClickListener(new View.OnClickListener() {
                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(!ClickThroughUtil.isValidClick()) {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("DialogAd", ":::clickEvent::: " + DialogAd.this.mClickUrl + " -> block");
                        }
                        return;
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("DialogAd", ":::clickEvent::: " + DialogAd.this.mClickUrl);
                    }
                    ClickThroughUtil.goToBrowser(DialogAd.this.mContext, DialogAd.this.mClickUrl);
                }
            });
            this.mAdFrameLayout.addView(this.defaultImageView);
        }
        this.mAdView.setLayoutParams(frameLayout$LayoutParams1);
        this.mAdFrameLayout.addView(this.mAdView);
        if(this.mIsLoadingBar) {
            this.mProgressbar = new ProgressBar(this.mContext);
            FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            frameLayout$LayoutParams2.gravity = 17;
            this.mProgressbar.setLayoutParams(frameLayout$LayoutParams2);
            this.mProgressbar.setVisibility(8);
            this.mAdFrameLayout.addView(this.mProgressbar);
        }
        linearLayout0.addView(this.mAdFrameLayout);
        this.mAdView.setAdListener(new AdListener() {
            @Override  // com.gomfactory.adpie.sdk.AdView$AdListener
            public void onAdClicked() {
                AdPieLog.d("DialogAd", DialogAd.this.mSlotId + ":::onAdClicked");
                if(DialogAd.this.mDialogAdListener != null) {
                    DialogAd.this.mDialogAdListener.onAdClicked();
                }
            }

            @Override  // com.gomfactory.adpie.sdk.AdView$AdListener
            public void onAdFailedToLoad(int v) {
                AdPieLog.d("DialogAd", DialogAd.this.mSlotId + ":::onAdFailedToLoad:::" + v);
                if(DialogAd.this.mDialogAdListener != null) {
                    DialogAd.this.mDialogAdListener.onAdFailedToLoad(v);
                }
                if(DialogAd.this.mProgressbar != null) {
                    DialogAd.this.mProgressbar.setVisibility(8);
                }
                if(DialogAd.this.defaultImageView != null) {
                    DialogAd.this.defaultImageView.setVisibility(0);
                }
            }

            @Override  // com.gomfactory.adpie.sdk.AdView$AdListener
            public void onAdLoaded() {
                AdPieLog.d("DialogAd", DialogAd.this.mSlotId + ":::onAdLoaded");
                if(DialogAd.this.mDialogAdListener != null) {
                    DialogAd.this.mDialogAdListener.onAdLoaded();
                }
                if(DialogAd.this.mProgressbar != null) {
                    DialogAd.this.mProgressbar.setVisibility(8);
                }
            }
        });
        LinearLayout linearLayout1 = new LinearLayout(this.mContext);
        this.mContentLayout = linearLayout1;
        linearLayout1.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.mContentLayout.setBackgroundColor(this.mBackgroundColor);
        this.messageTextView = new TextView(this.mContext);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout$LayoutParams0.topMargin = DisplayUtil.dpToPx(this.mContext, 20);
        linearLayout$LayoutParams0.bottomMargin = DisplayUtil.dpToPx(this.mContext, 20);
        this.messageTextView.setGravity(17);
        this.messageTextView.setLayoutParams(linearLayout$LayoutParams0);
        this.messageTextView.setTextSize(1, ((float)this.mMessageTextSize));
        this.messageTextView.setTextColor(this.mMessageTextColor);
        this.messageTextView.setText(this.mMessageText);
        this.mContentLayout.addView(this.messageTextView);
        linearLayout0.addView(this.mContentLayout);
        LinearLayout linearLayout2 = new LinearLayout(this.mContext);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setWeightSum(((float)this.mButtonCount));
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams1.weight = 1.0f;
        for(int v = 0; v < this.mButtonCount; ++v) {
            if(v > 0) {
                View view0 = new View(this.mContext);
                view0.setLayoutParams(new ViewGroup.LayoutParams(DisplayUtil.dpToPx(this.mContext, 2), -1));
                view0.setBackgroundColor(this.mBackgroundColor);
                linearLayout2.addView(view0);
            }
            if(v == 0) {
                Button button0 = new Button(this.mContext);
                button0.setLayoutParams(linearLayout$LayoutParams1);
                button0.setOnClickListener(new View.OnClickListener() {
                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        DialogAd.this.dismiss();
                        if(DialogAd.this.mDialogAdListener != null) {
                            DialogAd.this.mDialogAdListener.onFirstButtonClicked();
                        }
                    }
                });
                button0.setText(this.mFirstButtonText);
                button0.setTextSize(1, ((float)this.mButtonTextSize));
                button0.setBackgroundColor(this.mFirstButtonColor);
                button0.setTextColor(this.mFirstButtonTextColor);
                linearLayout2.addView(button0);
            }
            else if(v == 1) {
                Button button1 = new Button(this.mContext);
                button1.setLayoutParams(linearLayout$LayoutParams1);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        DialogAd.this.dismiss();
                        if(DialogAd.this.mDialogAdListener != null) {
                            DialogAd.this.mDialogAdListener.onSecondButtonClicked();
                        }
                    }
                });
                button1.setText(this.mSecondButtonText);
                button1.setTextSize(1, ((float)this.mButtonTextSize));
                button1.setBackgroundColor(this.mSecondButtonColor);
                button1.setTextColor(this.mSecondButtonTextColor);
                linearLayout2.addView(button1);
            }
            else if(v == 2) {
                Button button2 = new Button(this.mContext);
                button2.setLayoutParams(linearLayout$LayoutParams1);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        DialogAd.this.dismiss();
                        if(DialogAd.this.mDialogAdListener != null) {
                            DialogAd.this.mDialogAdListener.onThirdButtonClicked();
                        }
                    }
                });
                button2.setText(this.mThirdButtonText);
                button2.setTextSize(1, ((float)this.mButtonTextSize));
                button2.setBackgroundColor(this.mThirdButtonColor);
                button2.setTextColor(this.mThirdButtonTextColor);
                linearLayout2.addView(button2);
            }
        }
        linearLayout0.addView(linearLayout2);
    }

    private void setAdSize(int v, int v1) {
        try {
            if(v > 320) {
                this.mAdWidth = 320;
                this.mAdHeight = 320 * v1 / v;
                return;
            }
            if(v < 0xFA) {
                this.mAdWidth = 0xFA;
                this.mAdHeight = 0xFA * v1 / v;
                return;
            }
            this.mAdWidth = v;
            this.mAdHeight = v1;
        }
        catch(Exception unused_ex) {
            this.mAdWidth = v;
            this.mAdHeight = 0;
        }
    }

    private void setAdSize(int v, int v1, int v2) {
        this.setAdSize(v, v1);
        this.mDefaultImageResId = v2;
    }

    private void setAdSize(int v, int v1, int v2, String s) {
        this.setAdSize(v, v1, v2);
        this.mClickUrl = s;
    }

    public void setDialogAdListenr(DialogAdListener dialogAd$DialogAdListener0) {
        this.mDialogAdListener = dialogAd$DialogAdListener0;
    }

    private void setDialogStyle(DialogStyle dialogStyle0) {
        if(dialogStyle0 == null) {
            this.setAdSize(0xFA, 0, 0, null);
        }
        else {
            AdPieLog.d("DialogAd", "dialogStyle : " + dialogStyle0.toString());
            if(dialogStyle0.getAdSize() == 0) {
                this.setAdSize(0xFA, 0xFA, dialogStyle0.getDefaultImageResId(), dialogStyle0.getDefaultImageClickUrl());
            }
            else if(dialogStyle0.getAdSize() == 1) {
                this.setAdSize(300, 0xFA, dialogStyle0.getDefaultImageResId(), dialogStyle0.getDefaultImageClickUrl());
            }
            else {
                this.setAdSize(0xFA, 0xFA, dialogStyle0.getDefaultImageResId(), dialogStyle0.getDefaultImageClickUrl());
            }
            if(dialogStyle0.getButtonCount() == 1 || dialogStyle0.getButtonCount() == 2 || dialogStyle0.getButtonCount() == 3) {
                this.mButtonCount = dialogStyle0.getButtonCount();
            }
            if(dialogStyle0.getButtonTextSize() > 0) {
                this.mButtonTextSize = dialogStyle0.getButtonTextSize();
            }
            if(!TextUtils.isEmpty(dialogStyle0.getMessageText())) {
                this.mMessageText = dialogStyle0.getMessageText();
            }
            if(dialogStyle0.getMessageTextColor() != 0) {
                this.mMessageTextColor = dialogStyle0.getMessageTextColor();
            }
            if(dialogStyle0.getMessageTextSize() > 0) {
                this.mMessageTextSize = dialogStyle0.getMessageTextSize();
            }
            if(!TextUtils.isEmpty(dialogStyle0.getFirstButtonText())) {
                this.mFirstButtonText = dialogStyle0.getFirstButtonText();
            }
            if(!TextUtils.isEmpty(dialogStyle0.getSecondButtonText())) {
                this.mSecondButtonText = dialogStyle0.getSecondButtonText();
            }
            if(!TextUtils.isEmpty(dialogStyle0.getThirdButtonText())) {
                this.mThirdButtonText = dialogStyle0.getThirdButtonText();
            }
            if(dialogStyle0.getBackgroundColor() != 0) {
                this.mBackgroundColor = dialogStyle0.getBackgroundColor();
            }
            if(dialogStyle0.getFirstButtonColor() != 0) {
                this.mFirstButtonColor = dialogStyle0.getFirstButtonColor();
            }
            if(dialogStyle0.getFirstButtonTextColor() != 0) {
                this.mFirstButtonTextColor = dialogStyle0.getFirstButtonTextColor();
            }
            if(dialogStyle0.getSecondButtonColor() != 0) {
                this.mSecondButtonColor = dialogStyle0.getSecondButtonColor();
            }
            if(dialogStyle0.getSecondButtonTextColor() != 0) {
                this.mSecondButtonTextColor = dialogStyle0.getSecondButtonTextColor();
            }
            if(dialogStyle0.getThirdButtonColor() != 0) {
                this.mThirdButtonColor = dialogStyle0.getThirdButtonColor();
            }
            if(dialogStyle0.getThirdButtonTextColor() != 0) {
                this.mThirdButtonTextColor = dialogStyle0.getThirdButtonTextColor();
            }
            if(dialogStyle0.getRadius() >= 0) {
                this.mRadius = dialogStyle0.getRadius();
            }
        }
    }

    public void setMessage(String s) {
        if(!TextUtils.isEmpty(s)) {
            this.mMessageText = s;
            TextView textView0 = this.messageTextView;
            if(textView0 != null) {
                textView0.setText(s);
            }
        }
    }

    public void setSlotId(String s) {
        this.mSlotId = s;
    }

    @Override  // android.app.Dialog
    public void show() {
        super.show();
        AdPieLog.d("DialogAd", this.mSlotId + ":::show");
        if(this.mAdWidth > 0 && this.mAdHeight > 0) {
            if(this.getContext().getResources().getConfiguration().orientation == 1) {
                FrameLayout frameLayout0 = this.mAdFrameLayout;
                if(frameLayout0 != null) {
                    frameLayout0.setVisibility(0);
                }
                if(this.mIsLoadingBar) {
                    ProgressBar progressBar0 = this.mProgressbar;
                    if(progressBar0 != null) {
                        progressBar0.setVisibility(0);
                    }
                    ImageView imageView0 = this.defaultImageView;
                    if(imageView0 != null) {
                        imageView0.setVisibility(8);
                    }
                }
                else {
                    ProgressBar progressBar1 = this.mProgressbar;
                    if(progressBar1 != null) {
                        progressBar1.setVisibility(8);
                    }
                    ImageView imageView1 = this.defaultImageView;
                    if(imageView1 != null) {
                        imageView1.setVisibility(0);
                    }
                }
                AdView adView0 = this.mAdView;
                if(adView0 != null) {
                    adView0.setSlotId(this.mSlotId);
                    this.mAdView.load();
                }
            }
            else {
                FrameLayout frameLayout1 = this.mAdFrameLayout;
                if(frameLayout1 != null) {
                    frameLayout1.setVisibility(8);
                }
            }
        }
        if(this.mAdWidth > 0) {
            this.getWindow().setLayout(DisplayUtil.dpToPx(this.mContext, this.mAdWidth), -2);
        }
    }
}

