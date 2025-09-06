package com.gomfactory.adpie.sdk;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.gomfactory.adpie.sdk.common.Constants;
import com.gomfactory.adpie.sdk.dialog.DialogStyleV2;
import com.gomfactory.adpie.sdk.dialog.RoundedRelativeLayout;
import com.gomfactory.adpie.sdk.nativeads.NativeAdData;
import com.gomfactory.adpie.sdk.nativeads.NativeAdView;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.DisplayUtil;

public class DialogAdV2 extends Dialog {
    public interface DialogAdListener {
        void onAdClicked();

        void onAdFailedToLoad(int arg1);

        void onAdLoaded();

        void onFirstButtonClicked();

        void onSecondButtonClicked();

        void onThirdButtonClicked();
    }

    public static final String TAG = "DialogAdV2";
    private int[] mAdContentsPadding;
    private FrameLayout mAdFrameLayout;
    private int mBackgroundColor;
    private LinearLayout mButtonContainer;
    public int mButtonCount;
    public int mButtonTextSize;
    private LinearLayout mContentLayout;
    private Context mContext;
    private NativeAdData mDefaultNativeAdData;
    private DialogAdListener mDialogAdListener;
    private RoundedRelativeLayout mDialogLayout;
    private DialogStyleV2 mDialogStyle;
    private int mFirstButtonColor;
    private String mFirstButtonText;
    private int mFirstButtonTextColor;
    private View mLine;
    private String mMessageText;
    private int mMessageTextColor;
    private int mMessageTextSize;
    private TextView mMessageTextView;
    private NativeAd mNativeAd;
    private NativeAdView mNativeAdView;
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

    public DialogAdV2(@NonNull Context context0, DialogStyleV2 dialogStyleV20) {
        super(context0);
        this.mButtonCount = 2;
        this.mButtonTextSize = 15;
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
        this.setDialogStyle(dialogStyleV20);
    }

    public DialogAdV2(@NonNull Context context0, DialogStyleV2 dialogStyleV20, String s) {
        super(context0);
        this.mButtonCount = 2;
        this.mButtonTextSize = 15;
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
        this.setDialogStyle(dialogStyleV20);
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
                                DialogAdV2.this.dismiss();
                                if(DialogAdV2.this.mDialogAdListener != null) {
                                    DialogAdV2.this.mDialogAdListener.onFirstButtonClicked();
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
                                DialogAdV2.this.dismiss();
                                if(DialogAdV2.this.mDialogAdListener != null) {
                                    DialogAdV2.this.mDialogAdListener.onSecondButtonClicked();
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
                                DialogAdV2.this.dismiss();
                                if(DialogAdV2.this.mDialogAdListener != null) {
                                    DialogAdV2.this.mDialogAdListener.onThirdButtonClicked();
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
        AdPieLog.d("DialogAdV2", this.mSlotId + ":::cancel");
    }

    public void destroy() {
        this.dismiss();
        this.mNativeAdView = null;
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        AdPieLog.d("DialogAdV2", this.mSlotId + ":::dismiss");
        super.dismiss();
        this.releaseAdView();
    }

    public DialogStyleV2 getDialogStyle() {
        return this.mDialogStyle;
    }

    private void initAdView() {
        try {
            if(this.mNativeAd != null) {
                return;
            }
            NativeAd nativeAd0 = new NativeAd(this.mContext, null);
            this.mNativeAd = nativeAd0;
            nativeAd0.setSlotId(this.mSlotId);
            this.mNativeAd.setAdListener(new AdListener() {
                @Override  // com.gomfactory.adpie.sdk.NativeAd$AdListener
                public void onAdClicked() {
                    AdPieLog.d("DialogAdV2", DialogAdV2.this.mSlotId + ":::onAdClicked");
                    if(DialogAdV2.this.mDialogAdListener != null) {
                        DialogAdV2.this.mDialogAdListener.onAdClicked();
                    }
                }

                @Override  // com.gomfactory.adpie.sdk.NativeAd$AdListener
                public void onAdFailedToLoad(int v) {
                    AdPieLog.d("DialogAdV2", DialogAdV2.this.mSlotId + ":::onAdFailedToLoad:::" + v);
                    if(DialogAdV2.this.mDialogAdListener != null) {
                        DialogAdV2.this.mDialogAdListener.onAdFailedToLoad(v);
                    }
                }

                @Override  // com.gomfactory.adpie.sdk.NativeAd$AdListener
                public void onAdLoaded(NativeAdView nativeAdView0) {
                    AdPieLog.d("DialogAdV2", DialogAdV2.this.mSlotId + ":::onAdLoaded");
                    DialogAdV2.this.mNativeAdView = nativeAdView0;
                    if(DialogAdV2.this.mDialogAdListener != null) {
                        DialogAdV2.this.mDialogAdListener.onAdLoaded();
                    }
                }

                @Override  // com.gomfactory.adpie.sdk.NativeAd$AdListener
                public void onAdShown() {
                }
            });
        }
        catch(Exception unused_ex) {
        }
    }

    public void loadAd() {
        this.initAdView();
        NativeAd nativeAd0 = this.mNativeAd;
        if(nativeAd0 != null && this.mNativeAdView == null) {
            nativeAd0.loadAd();
        }
    }

    public void loadAd(TargetingData targetingData0) {
        this.initAdView();
        NativeAd nativeAd0 = this.mNativeAd;
        if(nativeAd0 != null && this.mNativeAdView == null) {
            nativeAd0.loadAd(targetingData0);
        }
    }

    @Override  // android.app.Dialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        AdPieLog.d("DialogAdV2", this.mSlotId + ":::onCreate");
        this.requestWindowFeature(1);
        this.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        int v = DisplayUtil.dpToPx(this.mContext, 15);
        int v1 = DisplayUtil.dpToPx(this.mContext, 20);
        LinearLayout linearLayout0 = new LinearLayout(this.mContext);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
        linearLayout0.setPadding(v1, v1, v1, v1);
        this.addContentView(linearLayout0, linearLayout$LayoutParams0);
        float f = (float)Math.min(DisplayUtil.getDeviceWidth(this.mContext), DisplayUtil.getDeviceHeight(this.mContext));
        float f1 = (float)Math.max(DisplayUtil.getDeviceWidth(this.mContext), DisplayUtil.getDeviceHeight(this.mContext));
        int v2 = (int)(2.0f * f / 3.0f);
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("DialogAdV2", "deviceWidth : " + f + ", deviceHeight : " + f1 + ", dialogWidth : " + v2);
        }
        RoundedRelativeLayout roundedRelativeLayout0 = new RoundedRelativeLayout(this.mContext);
        this.mDialogLayout = roundedRelativeLayout0;
        roundedRelativeLayout0.setCornerRadius(DisplayUtil.dpToPx(this.mContext, this.mRadius));
        this.mDialogLayout.setBackgroundColor(this.mBackgroundColor);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v2, -2);
        this.mDialogLayout.setLayoutParams(relativeLayout$LayoutParams0);
        linearLayout0.addView(this.mDialogLayout);
        LinearLayout linearLayout1 = new LinearLayout(this.mContext);
        linearLayout1.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout1.setOrientation(1);
        this.mDialogLayout.addView(linearLayout1);
        this.mAdFrameLayout = new FrameLayout(this.mContext);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams1.weight = 1.0f;
        int[] arr_v = this.mAdContentsPadding;
        if(arr_v != null && arr_v.length == 4) {
            this.mAdFrameLayout.setPadding(DisplayUtil.dpToPx(this.mContext, arr_v[0]), DisplayUtil.dpToPx(this.mContext, this.mAdContentsPadding[1]), DisplayUtil.dpToPx(this.mContext, this.mAdContentsPadding[2]), DisplayUtil.dpToPx(this.mContext, this.mAdContentsPadding[3]));
        }
        this.mAdFrameLayout.setLayoutParams(linearLayout$LayoutParams1);
        linearLayout1.addView(this.mAdFrameLayout);
        View view0 = new View(this.mContext);
        this.mLine = view0;
        view0.setLayoutParams(new ViewGroup.LayoutParams(-1, DisplayUtil.dpToPx(this.mContext, 2)));
        this.mLine.setBackgroundColor(Color.parseColor("#eeeeee"));
        linearLayout1.addView(this.mLine);
        this.mLine.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(this.mContext);
        this.mContentLayout = linearLayout2;
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.mContentLayout.setGravity(17);
        this.mContentLayout.setBackgroundColor(this.mBackgroundColor);
        TextView textView0 = new TextView(this.mContext);
        this.mMessageTextView = textView0;
        textView0.setPadding(v, v, v, v);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.mMessageTextView.setLayoutParams(linearLayout$LayoutParams2);
        this.mMessageTextView.setTextSize(1, ((float)this.mMessageTextSize));
        this.mMessageTextView.setTextColor(this.mMessageTextColor);
        if(TextUtils.isEmpty(this.mMessageText)) {
            this.mMessageTextView.setText("");
        }
        else {
            this.mMessageTextView.setText(this.mMessageText.replace(" ", " "));
        }
        this.mContentLayout.addView(this.mMessageTextView);
        linearLayout1.addView(this.mContentLayout);
        this.mButtonContainer = new LinearLayout(this.mContext);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        this.mButtonContainer.setLayoutParams(linearLayout$LayoutParams3);
        this.mButtonContainer.setOrientation(0);
        linearLayout1.addView(this.mButtonContainer);
        this.addButton();
    }

    private void releaseAdView() {
        try {
            this.mAdFrameLayout.removeAllViews();
            NativeAd nativeAd0 = this.mNativeAd;
            if(nativeAd0 != null) {
                nativeAd0.destroy();
                this.mNativeAd = null;
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setDialogAdListenr(DialogAdListener dialogAdV2$DialogAdListener0) {
        this.mDialogAdListener = dialogAdV2$DialogAdListener0;
    }

    public void setDialogStyle(DialogStyleV2 dialogStyleV20) {
        this.mDialogStyle = dialogStyleV20;
        if(dialogStyleV20 != null) {
            AdPieLog.d("DialogAdV2", "dialogStyle : " + dialogStyleV20.toString());
            if(dialogStyleV20.getButtonCount() == 1 || dialogStyleV20.getButtonCount() == 2 || dialogStyleV20.getButtonCount() == 3) {
                this.mButtonCount = dialogStyleV20.getButtonCount();
            }
            if(dialogStyleV20.getButtonTextSize() > 0) {
                this.mButtonTextSize = dialogStyleV20.getButtonTextSize();
            }
            if(TextUtils.isEmpty(dialogStyleV20.getMessageText())) {
                this.mMessageText = "";
                TextView textView1 = this.mMessageTextView;
                if(textView1 != null) {
                    textView1.setText("");
                }
            }
            else {
                String s = dialogStyleV20.getMessageText();
                this.mMessageText = s;
                TextView textView0 = this.mMessageTextView;
                if(textView0 != null) {
                    textView0.setText(s.replace(" ", " "));
                }
            }
            if(dialogStyleV20.getMessageTextColor() != 0) {
                int v = dialogStyleV20.getMessageTextColor();
                this.mMessageTextColor = v;
                TextView textView2 = this.mMessageTextView;
                if(textView2 != null) {
                    textView2.setTextColor(v);
                }
            }
            if(dialogStyleV20.getMessageTextSize() > 0) {
                int v1 = dialogStyleV20.getMessageTextSize();
                this.mMessageTextSize = v1;
                TextView textView3 = this.mMessageTextView;
                if(textView3 != null) {
                    textView3.setTextSize(1, ((float)v1));
                }
            }
            if(!TextUtils.isEmpty(dialogStyleV20.getFirstButtonText())) {
                this.mFirstButtonText = dialogStyleV20.getFirstButtonText();
            }
            if(!TextUtils.isEmpty(dialogStyleV20.getSecondButtonText())) {
                this.mSecondButtonText = dialogStyleV20.getSecondButtonText();
            }
            if(!TextUtils.isEmpty(dialogStyleV20.getThirdButtonText())) {
                this.mThirdButtonText = dialogStyleV20.getThirdButtonText();
            }
            if(dialogStyleV20.getBackgroundColor() != 0) {
                int v2 = dialogStyleV20.getBackgroundColor();
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
            if(dialogStyleV20.getFirstButtonColor() != 0) {
                this.mFirstButtonColor = dialogStyleV20.getFirstButtonColor();
            }
            if(dialogStyleV20.getFirstButtonTextColor() != 0) {
                this.mFirstButtonTextColor = dialogStyleV20.getFirstButtonTextColor();
            }
            if(dialogStyleV20.getSecondButtonColor() != 0) {
                this.mSecondButtonColor = dialogStyleV20.getSecondButtonColor();
            }
            if(dialogStyleV20.getSecondButtonTextColor() != 0) {
                this.mSecondButtonTextColor = dialogStyleV20.getSecondButtonTextColor();
            }
            if(dialogStyleV20.getThirdButtonColor() != 0) {
                this.mThirdButtonColor = dialogStyleV20.getThirdButtonColor();
            }
            if(dialogStyleV20.getThirdButtonTextColor() != 0) {
                this.mThirdButtonTextColor = dialogStyleV20.getThirdButtonTextColor();
            }
            this.addButton();
            if(dialogStyleV20.getRadius() >= 0) {
                int v3 = dialogStyleV20.getRadius();
                this.mRadius = v3;
                RoundedRelativeLayout roundedRelativeLayout1 = this.mDialogLayout;
                if(roundedRelativeLayout1 != null) {
                    roundedRelativeLayout1.setCornerRadius(DisplayUtil.dpToPx(this.mContext, v3));
                }
            }
            int[] arr_v = dialogStyleV20.getAdContentsPadding();
            if(arr_v != null && arr_v.length == 4) {
                this.mAdContentsPadding = arr_v;
                FrameLayout frameLayout0 = this.mAdFrameLayout;
                if(frameLayout0 != null) {
                    frameLayout0.setPadding(DisplayUtil.dpToPx(this.mContext, arr_v[0]), DisplayUtil.dpToPx(this.mContext, this.mAdContentsPadding[1]), DisplayUtil.dpToPx(this.mContext, this.mAdContentsPadding[2]), DisplayUtil.dpToPx(this.mContext, this.mAdContentsPadding[3]));
                }
            }
            if(!TextUtils.isEmpty(dialogStyleV20.getTitle()) || !TextUtils.isEmpty(dialogStyleV20.getDescription()) || dialogStyleV20.getIconImageResId() > 0 || dialogStyleV20.getMainImageResId() > 0) {
                if(this.mDefaultNativeAdData == null) {
                    this.mDefaultNativeAdData = new NativeAdData();
                }
                this.mDefaultNativeAdData.setTitle(dialogStyleV20.getTitle());
                this.mDefaultNativeAdData.setDescription(dialogStyleV20.getDescription());
                if(dialogStyleV20.getIconImageResId() > 0) {
                    this.mDefaultNativeAdData.setIconImageUrl("" + dialogStyleV20.getIconImageResId());
                }
                if(dialogStyleV20.getMainImageResId() > 0) {
                    this.mDefaultNativeAdData.setMainImageUrl("" + dialogStyleV20.getMainImageResId());
                }
                this.mDefaultNativeAdData.setCallToAction(dialogStyleV20.getCtaButtonText());
                this.mDefaultNativeAdData.setLink(dialogStyleV20.getClickUrl());
            }
        }
    }

    public void setMessage(String s) {
        if(TextUtils.isEmpty(s)) {
            this.mMessageText = "";
            TextView textView1 = this.mMessageTextView;
            if(textView1 != null) {
                textView1.setText("");
            }
        }
        else {
            this.mMessageText = s;
            TextView textView0 = this.mMessageTextView;
            if(textView0 != null) {
                textView0.setText(s.replace(" ", " "));
            }
        }
    }

    public void setSlotId(String s) {
        this.mSlotId = s;
        NativeAd nativeAd0 = this.mNativeAd;
        if(nativeAd0 != null) {
            nativeAd0.setSlotId(s);
        }
    }

    @Override  // android.app.Dialog
    public void show() {
        super.show();
        AdPieLog.d("DialogAdV2", this.mSlotId + ":::show");
        if(AdPieSDK.getInstance().getNetworkConnectionType() == 0) {
            if(this.mDefaultNativeAdData == null) {
                FrameLayout frameLayout1 = this.mAdFrameLayout;
                if(frameLayout1 != null) {
                    frameLayout1.setVisibility(8);
                }
                View view1 = this.mLine;
                if(view1 != null) {
                    view1.setVisibility(8);
                }
            }
            else {
                NativeAdView nativeAdView0 = new NativeAdView(this.mContext, null, null);
                nativeAdView0.fillAd(this.mDefaultNativeAdData);
                if(this.mDialogStyle != null && this.mDialogStyle.getIconImageResId() > 0) {
                    ImageView imageView0 = nativeAdView0.getIconImageView();
                    if(imageView0 != null) {
                        imageView0.setImageResource(this.mDialogStyle.getIconImageResId());
                    }
                }
                if(this.mDialogStyle != null && this.mDialogStyle.getMainImageResId() > 0) {
                    ImageView imageView1 = nativeAdView0.getMainImageView();
                    if(imageView1 != null) {
                        imageView1.setImageResource(this.mDialogStyle.getMainImageResId());
                    }
                }
                this.mAdFrameLayout.addView(nativeAdView0);
                FrameLayout frameLayout0 = this.mAdFrameLayout;
                if(frameLayout0 != null) {
                    frameLayout0.setVisibility(0);
                }
                View view0 = this.mLine;
                if(view0 != null) {
                    view0.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if(this.mNativeAdView != null && this.mNativeAdView.isResourceLoaded()) {
            FrameLayout frameLayout2 = this.mAdFrameLayout;
            if(frameLayout2 != null) {
                frameLayout2.addView(this.mNativeAdView);
                this.mAdFrameLayout.setVisibility(0);
                View view2 = this.mLine;
                if(view2 != null) {
                    view2.setVisibility(0);
                }
                this.mNativeAdView = null;
            }
        }
        else if(this.mDefaultNativeAdData != null) {
            NativeAdView nativeAdView1 = new NativeAdView(this.mContext, null, null);
            nativeAdView1.fillAd(this.mDefaultNativeAdData);
            if(this.mDialogStyle != null && this.mDialogStyle.getIconImageResId() > 0) {
                ImageView imageView2 = nativeAdView1.getIconImageView();
                if(imageView2 != null) {
                    imageView2.setImageResource(this.mDialogStyle.getIconImageResId());
                }
            }
            if(this.mDialogStyle != null && this.mDialogStyle.getMainImageResId() > 0) {
                ImageView imageView3 = nativeAdView1.getMainImageView();
                if(imageView3 != null) {
                    imageView3.setImageResource(this.mDialogStyle.getMainImageResId());
                }
            }
            this.mAdFrameLayout.addView(nativeAdView1);
            FrameLayout frameLayout3 = this.mAdFrameLayout;
            if(frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            View view3 = this.mLine;
            if(view3 != null) {
                view3.setVisibility(0);
            }
        }
        else {
            FrameLayout frameLayout4 = this.mAdFrameLayout;
            if(frameLayout4 != null) {
                frameLayout4.setVisibility(8);
            }
            View view4 = this.mLine;
            if(view4 != null) {
                view4.setVisibility(8);
            }
        }
    }
}

