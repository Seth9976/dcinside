package com.gomfactory.adpie.sdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Configuration;
import android.graphics.Color;
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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.gomfactory.adpie.sdk.common.Constants;
import com.gomfactory.adpie.sdk.dialog.DialogAdView.AdListener;
import com.gomfactory.adpie.sdk.dialog.DialogAdView;
import com.gomfactory.adpie.sdk.dialog.DialogStyleV1;
import com.gomfactory.adpie.sdk.dialog.RoundedRelativeLayout;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.ClickThroughUtil;
import com.gomfactory.adpie.sdk.util.DisplayUtil;

public class DialogAdV1 extends Dialog {
    public interface DialogAdListener {
        void onAdClicked();

        void onAdFailedToLoad(int arg1);

        void onAdLoaded();

        void onFirstButtonClicked();

        void onSecondButtonClicked();

        void onThirdButtonClicked();
    }

    public static final String TAG = "DialogAdV1";
    private ImageView defaultImageView;
    private FrameLayout mAdFrameLayout;
    private int mAdHeight;
    private DialogAdView mAdView;
    private int mAdWidth;
    private int mBackgroundColor;
    private LinearLayout mButtonContainer;
    public int mButtonCount;
    public int mButtonTextSize;
    private String mClickUrl;
    private LinearLayout mContentLayout;
    private Context mContext;
    private int mDefaultImageResId;
    private DialogAdListener mDialogAdListener;
    private RoundedRelativeLayout mDialogLayout;
    private DialogStyleV1 mDialogStyle;
    private int mFirstButtonColor;
    private String mFirstButtonText;
    private int mFirstButtonTextColor;
    private View mLine;
    private String mMessageText;
    private int mMessageTextColor;
    private int mMessageTextSize;
    private TextView mMessageTextView;
    private int mRadius;
    private int mSecondButtonColor;
    private String mSecondButtonText;
    private int mSecondButtonTextColor;
    private String mSlotId;
    private int mThirdButtonColor;
    private String mThirdButtonText;
    private int mThirdButtonTextColor;

    static {
    }

    protected DialogAdV1(@NonNull Context context0, @StyleRes int v) {
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
        this.mContext = context0;
    }

    public DialogAdV1(@NonNull Context context0, DialogStyleV1 dialogStyleV10) {
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
        this.mContext = context0;
        this.setDialogStyle(dialogStyleV10);
    }

    public DialogAdV1(@NonNull Context context0, DialogStyleV1 dialogStyleV10, String s) {
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
        this.mContext = context0;
        this.mSlotId = s;
        this.setDialogStyle(dialogStyleV10);
    }

    protected DialogAdV1(@NonNull Context context0, boolean z, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
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
        this.mContext = context0;
    }

    private void addButton() {
        LinearLayout linearLayout0 = this.mButtonContainer;
        if(linearLayout0 != null) {
            linearLayout0.removeAllViews();
            this.mButtonContainer.setWeightSum(((float)this.mButtonCount));
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, -2);
            linearLayout$LayoutParams0.weight = 1.0f;
            for(int v = 0; v < this.mButtonCount; ++v) {
                if(v > 0) {
                    View view0 = new View(this.mContext);
                    view0.setLayoutParams(new ViewGroup.LayoutParams(DisplayUtil.dpToPx(this.mContext, 2), -1));
                    view0.setBackgroundColor(this.mBackgroundColor);
                    this.mButtonContainer.addView(view0);
                }
                switch(v) {
                    case 0: {
                        Button button0 = new Button(this.mContext);
                        button0.setLayoutParams(linearLayout$LayoutParams0);
                        button0.setOnClickListener(new View.OnClickListener() {
                            @Override  // android.view.View$OnClickListener
                            public void onClick(View view0) {
                                DialogAdV1.this.dismiss();
                                if(DialogAdV1.this.mDialogAdListener != null) {
                                    DialogAdV1.this.mDialogAdListener.onFirstButtonClicked();
                                }
                            }
                        });
                        button0.setText(this.mFirstButtonText);
                        button0.setTextSize(1, ((float)this.mButtonTextSize));
                        button0.setBackgroundColor(this.mFirstButtonColor);
                        button0.setTextColor(this.mFirstButtonTextColor);
                        this.mButtonContainer.addView(button0);
                        break;
                    }
                    case 1: {
                        Button button1 = new Button(this.mContext);
                        button1.setLayoutParams(linearLayout$LayoutParams0);
                        button1.setOnClickListener(new View.OnClickListener() {
                            @Override  // android.view.View$OnClickListener
                            public void onClick(View view0) {
                                DialogAdV1.this.dismiss();
                                if(DialogAdV1.this.mDialogAdListener != null) {
                                    DialogAdV1.this.mDialogAdListener.onSecondButtonClicked();
                                }
                            }
                        });
                        button1.setText(this.mSecondButtonText);
                        button1.setTextSize(1, ((float)this.mButtonTextSize));
                        button1.setBackgroundColor(this.mSecondButtonColor);
                        button1.setTextColor(this.mSecondButtonTextColor);
                        this.mButtonContainer.addView(button1);
                        break;
                    }
                    case 2: {
                        Button button2 = new Button(this.mContext);
                        button2.setLayoutParams(linearLayout$LayoutParams0);
                        button2.setOnClickListener(new View.OnClickListener() {
                            @Override  // android.view.View$OnClickListener
                            public void onClick(View view0) {
                                DialogAdV1.this.dismiss();
                                if(DialogAdV1.this.mDialogAdListener != null) {
                                    DialogAdV1.this.mDialogAdListener.onThirdButtonClicked();
                                }
                            }
                        });
                        button2.setText(this.mThirdButtonText);
                        button2.setTextSize(1, ((float)this.mButtonTextSize));
                        button2.setBackgroundColor(this.mThirdButtonColor);
                        button2.setTextColor(this.mThirdButtonTextColor);
                        this.mButtonContainer.addView(button2);
                    }
                }
            }
        }
    }

    @Override  // android.app.Dialog
    public void cancel() {
        super.cancel();
        AdPieLog.d("DialogAdV1", this.mSlotId + ":::cancel");
    }

    public void destroy() {
        this.dismiss();
        this.releaseAdView();
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        AdPieLog.d("DialogAdV1", this.mSlotId + ":::dismiss");
        super.dismiss();
    }

    public DialogStyleV1 getDialogStyle() {
        return this.mDialogStyle;
    }

    private void initAdView() {
        try {
            if(this.mAdView != null) {
                return;
            }
            if(this.mAdFrameLayout == null) {
                this.mAdFrameLayout = new FrameLayout(this.mContext);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
                this.mAdFrameLayout.setLayoutParams(frameLayout$LayoutParams0);
            }
            this.mAdView = new DialogAdView(this.mContext, this.mSlotId);
            FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(DisplayUtil.dpToPx(this.mContext, this.mAdWidth), DisplayUtil.dpToPx(this.mContext, this.mAdHeight));
            frameLayout$LayoutParams1.gravity = 1;
            this.mAdView.setLayoutParams(frameLayout$LayoutParams1);
            this.mAdFrameLayout.addView(this.mAdView);
            this.mAdView.setAdListener(new AdListener() {
                @Override  // com.gomfactory.adpie.sdk.dialog.DialogAdView$AdListener
                public void onAdClicked() {
                    AdPieLog.d("DialogAdV1", DialogAdV1.this.mSlotId + ":::onAdClicked");
                    if(DialogAdV1.this.mDialogAdListener != null) {
                        DialogAdV1.this.mDialogAdListener.onAdClicked();
                    }
                }

                @Override  // com.gomfactory.adpie.sdk.dialog.DialogAdView$AdListener
                public void onAdFailedToLoad(int v) {
                    AdPieLog.d("DialogAdV1", DialogAdV1.this.mSlotId + ":::onAdFailedToLoad:::" + v);
                    if(DialogAdV1.this.mDialogAdListener != null) {
                        DialogAdV1.this.mDialogAdListener.onAdFailedToLoad(v);
                    }
                    if(DialogAdV1.this.mAdFrameLayout != null) {
                        DialogAdV1.this.mAdFrameLayout.setVisibility(8);
                    }
                }

                @Override  // com.gomfactory.adpie.sdk.dialog.DialogAdView$AdListener
                public void onAdLoaded() {
                    AdPieLog.d("DialogAdV1", DialogAdV1.this.mSlotId + ":::onAdLoaded");
                    if(DialogAdV1.this.mDialogAdListener != null) {
                        DialogAdV1.this.mDialogAdListener.onAdLoaded();
                    }
                }

                @Override  // com.gomfactory.adpie.sdk.dialog.DialogAdView$AdListener
                public void onAdShown() {
                }
            });
        }
        catch(Exception unused_ex) {
        }
    }

    public void loadAd() {
        if(this.mAdView == null) {
            this.initAdView();
        }
        if(this.mAdView != null && !this.mAdView.isLoaded()) {
            this.mAdView.load();
        }
    }

    public void loadAd(TargetingData targetingData0) {
        if(this.mAdView == null) {
            this.initAdView();
        }
        if(this.mAdView != null && !this.mAdView.isLoaded()) {
            this.mAdView.load(targetingData0);
        }
    }

    @Override  // android.app.Dialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        AdPieLog.d("DialogAdV1", this.mSlotId + ":::onCreate");
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
        if(this.mAdFrameLayout == null) {
            this.mAdFrameLayout = new FrameLayout(this.mContext);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
            this.mAdFrameLayout.setLayoutParams(frameLayout$LayoutParams0);
        }
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
                            AdPieLog.d("DialogAdV1", ":::clickEvent::: " + DialogAdV1.this.mClickUrl + " -> block");
                        }
                        return;
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("DialogAdV1", ":::clickEvent::: " + DialogAdV1.this.mClickUrl);
                    }
                    ClickThroughUtil.goToBrowser(DialogAdV1.this.mContext, DialogAdV1.this.mClickUrl);
                }
            });
            this.mAdFrameLayout.addView(this.defaultImageView);
        }
        linearLayout0.addView(this.mAdFrameLayout);
        View view0 = new View(this.mContext);
        this.mLine = view0;
        view0.setLayoutParams(new ViewGroup.LayoutParams(-1, DisplayUtil.dpToPx(this.mContext, 2)));
        this.mLine.setBackgroundColor(Color.parseColor("#eeeeee"));
        linearLayout0.addView(this.mLine);
        this.mLine.setVisibility(8);
        LinearLayout linearLayout1 = new LinearLayout(this.mContext);
        this.mContentLayout = linearLayout1;
        linearLayout1.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.mContentLayout.setBackgroundColor(this.mBackgroundColor);
        this.mMessageTextView = new TextView(this.mContext);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout$LayoutParams0.topMargin = DisplayUtil.dpToPx(this.mContext, 20);
        linearLayout$LayoutParams0.bottomMargin = DisplayUtil.dpToPx(this.mContext, 20);
        this.mMessageTextView.setGravity(17);
        this.mMessageTextView.setLayoutParams(linearLayout$LayoutParams0);
        this.mMessageTextView.setTextSize(1, ((float)this.mMessageTextSize));
        this.mMessageTextView.setTextColor(this.mMessageTextColor);
        this.mMessageTextView.setText(this.mMessageText);
        this.mContentLayout.addView(this.mMessageTextView);
        linearLayout0.addView(this.mContentLayout);
        this.mButtonContainer = new LinearLayout(this.mContext);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        this.mButtonContainer.setLayoutParams(linearLayout$LayoutParams1);
        this.mButtonContainer.setOrientation(0);
        linearLayout0.addView(this.mButtonContainer);
        this.addButton();
    }

    private void releaseAdView() {
        try {
            DialogAdView dialogAdView0 = this.mAdView;
            if(dialogAdView0 != null) {
                this.mAdFrameLayout.removeView(dialogAdView0);
                this.mAdView.destroy();
                this.mAdView = null;
            }
        }
        catch(Exception unused_ex) {
        }
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

    public void setDialogAdListenr(DialogAdListener dialogAdV1$DialogAdListener0) {
        this.mDialogAdListener = dialogAdV1$DialogAdListener0;
    }

    public void setDialogStyle(DialogStyleV1 dialogStyleV10) {
        this.mDialogStyle = dialogStyleV10;
        if(dialogStyleV10 == null) {
            this.setAdSize(0xFA, 0);
        }
        else {
            AdPieLog.d("DialogAdV1", "dialogStyle : " + dialogStyleV10.toString());
            if(dialogStyleV10.getAdSize() == 0) {
                this.setAdSize(0xFA, 0xFA, dialogStyleV10.getDefaultImageResId(), dialogStyleV10.getDefaultImageClickUrl());
            }
            else if(dialogStyleV10.getAdSize() == 1) {
                this.setAdSize(300, 0xFA, dialogStyleV10.getDefaultImageResId(), dialogStyleV10.getDefaultImageClickUrl());
            }
            else {
                this.setAdSize(0xFA, 0xFA, dialogStyleV10.getDefaultImageResId(), dialogStyleV10.getDefaultImageClickUrl());
            }
            if(dialogStyleV10.getButtonCount() == 1 || dialogStyleV10.getButtonCount() == 2 || dialogStyleV10.getButtonCount() == 3) {
                this.mButtonCount = dialogStyleV10.getButtonCount();
            }
            if(dialogStyleV10.getButtonTextSize() > 0) {
                this.mButtonTextSize = dialogStyleV10.getButtonTextSize();
            }
            if(!TextUtils.isEmpty(dialogStyleV10.getMessageText())) {
                String s = dialogStyleV10.getMessageText();
                this.mMessageText = s;
                TextView textView0 = this.mMessageTextView;
                if(textView0 != null) {
                    textView0.setText(s);
                }
            }
            if(dialogStyleV10.getMessageTextColor() != 0) {
                int v = dialogStyleV10.getMessageTextColor();
                this.mMessageTextColor = v;
                TextView textView1 = this.mMessageTextView;
                if(textView1 != null) {
                    textView1.setTextColor(v);
                }
            }
            if(dialogStyleV10.getMessageTextSize() > 0) {
                int v1 = dialogStyleV10.getMessageTextSize();
                this.mMessageTextSize = v1;
                TextView textView2 = this.mMessageTextView;
                if(textView2 != null) {
                    textView2.setTextSize(1, ((float)v1));
                }
            }
            if(!TextUtils.isEmpty(dialogStyleV10.getFirstButtonText())) {
                this.mFirstButtonText = dialogStyleV10.getFirstButtonText();
            }
            if(!TextUtils.isEmpty(dialogStyleV10.getSecondButtonText())) {
                this.mSecondButtonText = dialogStyleV10.getSecondButtonText();
            }
            if(!TextUtils.isEmpty(dialogStyleV10.getThirdButtonText())) {
                this.mThirdButtonText = dialogStyleV10.getThirdButtonText();
            }
            if(dialogStyleV10.getBackgroundColor() != 0) {
                int v2 = dialogStyleV10.getBackgroundColor();
                this.mBackgroundColor = v2;
                RoundedRelativeLayout roundedRelativeLayout0 = this.mDialogLayout;
                if(roundedRelativeLayout0 != null) {
                    roundedRelativeLayout0.setBackgroundColor(v2);
                }
                LinearLayout linearLayout0 = this.mContentLayout;
                if(linearLayout0 != null) {
                    linearLayout0.setBackgroundColor(this.mBackgroundColor);
                }
            }
            if(dialogStyleV10.getFirstButtonColor() != 0) {
                this.mFirstButtonColor = dialogStyleV10.getFirstButtonColor();
            }
            if(dialogStyleV10.getFirstButtonTextColor() != 0) {
                this.mFirstButtonTextColor = dialogStyleV10.getFirstButtonTextColor();
            }
            if(dialogStyleV10.getSecondButtonColor() != 0) {
                this.mSecondButtonColor = dialogStyleV10.getSecondButtonColor();
            }
            if(dialogStyleV10.getSecondButtonTextColor() != 0) {
                this.mSecondButtonTextColor = dialogStyleV10.getSecondButtonTextColor();
            }
            if(dialogStyleV10.getThirdButtonColor() != 0) {
                this.mThirdButtonColor = dialogStyleV10.getThirdButtonColor();
            }
            if(dialogStyleV10.getThirdButtonTextColor() != 0) {
                this.mThirdButtonTextColor = dialogStyleV10.getThirdButtonTextColor();
            }
            this.addButton();
            if(dialogStyleV10.getRadius() >= 0) {
                int v3 = dialogStyleV10.getRadius();
                this.mRadius = v3;
                RoundedRelativeLayout roundedRelativeLayout1 = this.mDialogLayout;
                if(roundedRelativeLayout1 != null) {
                    roundedRelativeLayout1.setCornerRadius(DisplayUtil.dpToPx(this.mContext, v3));
                }
            }
        }
    }

    public void setMessage(String s) {
        if(!TextUtils.isEmpty(s)) {
            this.mMessageText = s;
            TextView textView0 = this.mMessageTextView;
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
        AdPieLog.d("DialogAdV1", this.mSlotId + ":::show");
        ImageView imageView0 = this.defaultImageView;
        if(imageView0 != null) {
            imageView0.setVisibility(8);
        }
        Configuration configuration0 = this.getContext().getResources().getConfiguration();
        if((this.mAdWidth <= 0 || this.mAdHeight <= 0 || configuration0.orientation != 1 || (this.mAdView == null || !this.mAdView.isLoaded()) ? false : this.mAdView.show())) {
            FrameLayout frameLayout0 = this.mAdFrameLayout;
            if(frameLayout0 != null) {
                frameLayout0.setVisibility(0);
            }
            View view0 = this.mLine;
            if(view0 != null) {
                view0.setVisibility(0);
            }
        }
        else {
            View view1 = this.mLine;
            if(view1 != null) {
                view1.setVisibility(8);
            }
            if(configuration0.orientation == 1) {
                ImageView imageView1 = this.defaultImageView;
                if(imageView1 == null) {
                    goto label_25;
                }
                else {
                    imageView1.setVisibility(0);
                    FrameLayout frameLayout1 = this.mAdFrameLayout;
                    if(frameLayout1 != null) {
                        frameLayout1.setVisibility(0);
                    }
                }
            }
            else {
            label_25:
                FrameLayout frameLayout2 = this.mAdFrameLayout;
                if(frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
        }
        if(this.mAdWidth > 0) {
            this.getWindow().setLayout(DisplayUtil.dpToPx(this.mContext, this.mAdWidth), -2);
        }
    }
}

