package com.gomfactory.adpie.sdk.nativeads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.ClickThroughUtil;
import com.gomfactory.adpie.sdk.util.DisplayUtil;
import com.gomfactory.adpie.sdk.util.HttpUtil;
import com.gomfactory.adpie.sdk.util.MemUtil;
import com.gomfactory.adpie.sdk.util.ReportUtil;
import java.util.HashMap;

public class NativeAdView extends FrameLayout {
    public interface ResourceLoadEventListener {
        void onError();

        void onSuccess();
    }

    public static final String TAG = "NativeAdView";
    private AdEventListener mAdEventListener;
    private ViewGroup mAdView;
    private int mAdViewHeight;
    private int mAdViewWidth;
    private Context mContext;
    private Button mCtaButton;
    private TextView mDescTextView;
    private ImageView mIconImageView;
    private boolean mIsNotifyImpression;
    private boolean mIsRequiredIconImage;
    private boolean mIsRequiredMainImage;
    private boolean mIsRequiredMainVideo;
    private boolean mIsResourceLoaded;
    private boolean mIsSetOptOut;
    private boolean mIsValidLayout;
    private MainAdView mMainAdView;
    private NativeAdData mNativeAdData;
    private NativeAdViewBinder mNativeAdViewBinder;
    private ImageView mOptOutImageView;
    private RatingBar mRatingBar;
    private TextView mTitleTextView;

    static {
    }

    public NativeAdView(Context context0, NativeAdViewBinder nativeAdViewBinder0) {
        this(context0, nativeAdViewBinder0, null);
    }

    public NativeAdView(Context context0, NativeAdViewBinder nativeAdViewBinder0, AdEventListener adEventListener0) {
        super(context0);
        this.mTitleTextView = null;
        this.mIconImageView = null;
        this.mRatingBar = null;
        this.mDescTextView = null;
        this.mMainAdView = null;
        this.mCtaButton = null;
        this.mOptOutImageView = null;
        this.mIsValidLayout = false;
        this.mAdViewWidth = 0;
        this.mAdViewHeight = 0;
        this.mContext = context0;
        this.mAdEventListener = adEventListener0;
        this.initLayout(nativeAdViewBinder0);
    }

    // 检测为 Lambda 实现
    private void clickEvent(View view0) [...]

    public NativeAdView copy() {
        try {
            NativeAdView nativeAdView0 = new NativeAdView(this.mContext, this.mNativeAdViewBinder, this.mAdEventListener);
            int v = nativeAdView0.fillAd(this.getNativeAdData());
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("NativeAdView", ":::copy:::fillAdResult : " + v);
            }
            if(v == 0) {
                if(nativeAdView0.getMainImageView() != null && this.getMainImageView() != null) {
                    nativeAdView0.getMainImageView().setImageDrawable(this.getMainImageView().getDrawable());
                }
                if(nativeAdView0.getIconImageView() != null && this.getIconImageView() != null) {
                    nativeAdView0.getIconImageView().setImageDrawable(this.getIconImageView().getDrawable());
                }
                return nativeAdView0;
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("NativeAdView", exception0);
        }
        return null;
    }

    public void destroy() {
        this.removeAllViews();
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        try {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("NativeAdView", "dispatchDraw - (current) width : " + this.mAdViewWidth + ", height : " + this.mAdViewHeight);
            }
            if(this.mAdView != null && (this.mAdViewWidth != this.mAdView.getWidth() || this.mAdViewHeight != this.mAdView.getHeight())) {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("NativeAdView", "dispatchDraw - (new) width : " + this.mAdView.getWidth() + ", height : " + this.mAdView.getHeight());
                }
                this.mAdViewWidth = this.mAdView.getWidth();
                this.mAdViewHeight = this.mAdView.getHeight();
            }
            this.impressionEvent();
            this.setupOptOut();
            super.dispatchDraw(canvas0);
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.d("NativeAdView", "dispatchDraw Exception (title : " + this.mNativeAdData.getTitle() + ", description : " + this.mNativeAdData.getDescription() + ", icon : " + this.mNativeAdData.getIconImageUrl() + ", main : " + this.mNativeAdData.getMainImageUrl() + ")");
        exception0.printStackTrace();
    }

    public void downloadResource() {
        this.downloadResource(null);
    }

    public void downloadResource(ResourceLoadEventListener nativeAdView$ResourceLoadEventListener0) {
        try {
            HashMap hashMap0 = new HashMap();
            AdPieLog.d("NativeAdView", ":::downloadResource:::icon url : " + this.mNativeAdData.getIconImageUrl());
            AdPieLog.d("NativeAdView", ":::downloadResource:::icon ImageView : " + this.mIconImageView);
            AdPieLog.d("NativeAdView", ":::downloadResource:::mIsRequiredIconImage : " + this.mIsRequiredIconImage);
            if(!TextUtils.isEmpty(this.mNativeAdData.getIconImageUrl()) && this.mIconImageView != null) {
                hashMap0.put(this.mNativeAdData.getIconImageUrl(), this.mIconImageView);
            }
            else if(this.mIsRequiredIconImage) {
                this.resourceLoadError(nativeAdView$ResourceLoadEventListener0, hashMap0);
                return;
            }
            MainAdView mainAdView0 = this.mMainAdView;
            if(mainAdView0 != null) {
                ImageView imageView0 = mainAdView0.getImageView();
                AdPieLog.d("NativeAdView", ":::downloadResource:::main url : " + this.mNativeAdData.getMainImageUrl());
                AdPieLog.d("NativeAdView", ":::downloadResource:::main ImageView : " + imageView0);
                AdPieLog.d("NativeAdView", ":::downloadResource:::mIsRequiredMainImage : " + this.mIsRequiredMainImage);
                if(!TextUtils.isEmpty(this.mNativeAdData.getMainImageUrl()) && imageView0 != null) {
                    hashMap0.put(this.mNativeAdData.getMainImageUrl(), imageView0);
                }
                else if(this.mIsRequiredMainImage) {
                    this.resourceLoadError(nativeAdView$ResourceLoadEventListener0, hashMap0);
                    return;
                }
            }
            else if(this.mIsRequiredMainImage) {
                this.resourceLoadError(nativeAdView$ResourceLoadEventListener0, hashMap0);
                return;
            }
            AdPieLog.d("NativeAdView", ":::downloadResource:::count : " + hashMap0.size());
            if(hashMap0.size() == 0) {
                this.resourceLoadSuccess(nativeAdView$ResourceLoadEventListener0, hashMap0);
                return;
            }
            new NativeAdImageHelper(this.mContext).load(hashMap0, new ImageLoadEventListener() {
                @Override  // com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper$ImageLoadEventListener
                public void onError() {
                    AdPieLog.d("NativeAdView", ":::downloadResource:::onError");
                    NativeAdView.this.resourceLoadError(nativeAdView$ResourceLoadEventListener0, null);
                }

                @Override  // com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper$ImageLoadEventListener
                public void onSuccess() {
                    AdPieLog.d("NativeAdView", ":::downloadResource:::onSuccess");
                    NativeAdView.this.resourceLoadSuccess(nativeAdView$ResourceLoadEventListener0, null);
                }
            });
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("NativeAdView", exception0);
        }
        this.resourceLoadError(nativeAdView$ResourceLoadEventListener0, null);
    }

    public int fillAd(NativeAdData nativeAdData0) {
        int v1;
        int v;
        try {
            this.mNativeAdData = nativeAdData0;
            if(this.mAdView == null) {
                v = -10;
            }
            else {
                if(this.mTitleTextView != null) {
                    if(TextUtils.isEmpty(nativeAdData0.getTitle())) {
                        this.mTitleTextView.setVisibility(8);
                    }
                    else {
                        this.mTitleTextView.setVisibility(0);
                        this.mTitleTextView.setText(this.mNativeAdData.getTitle());
                        this.mTitleTextView.setOnClickListener((View view0) -> {
                            try {
                                if(!NativeAdView.this.mIsValidLayout) {
                                    AdPieLog.i("NativeAdView", "It\'s invalid layout. If it is not a server error, check your layout XML or NativeAdViewBinder object.");
                                }
                                boolean z = true;
                                NativeAdData nativeAdData0 = NativeAdView.this.mNativeAdData;
                                if(nativeAdData0 != null) {
                                    if(nativeAdData0.getOnlyClickCTA() == 1 && !view0.equals(NativeAdView.this.mCtaButton)) {
                                        return;
                                    }
                                    String s = NativeAdView.this.mNativeAdData.getLink();
                                    if(NativeAdView.this.mNativeAdData.getWebviewLanding() != 1) {
                                        z = false;
                                    }
                                    if(!ClickThroughUtil.isValidClick()) {
                                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                            AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> block");
                                        }
                                        return;
                                    }
                                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                        AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> isWebViewLanding : " + z);
                                    }
                                    if(z) {
                                        HttpUtil.getFinalURL(s, new Handler(Looper.getMainLooper()) {
                                            @Override  // android.os.Handler
                                            public void handleMessage(@NonNull Message message0) {
                                                if(message0.what == 100) {
                                                    try {
                                                        if(ClickThroughUtil.goToWebView(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        else if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    catch(Exception exception0) {
                                                    }
                                                    AdPieLog.e("NativeAdView", exception0);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, s)) {
                                        ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                        AdEventListener adEventListener0 = NativeAdView.this.mAdEventListener;
                                        if(adEventListener0 != null) {
                                            adEventListener0.notifyAdClicked();
                                        }
                                    }
                                }
                            }
                            catch(Exception exception0) {
                                AdPieLog.e("NativeAdView", exception0);
                            }
                        });
                    }
                }
                if(this.mIconImageView != null) {
                    if(TextUtils.isEmpty(this.mNativeAdData.getIconImageUrl())) {
                        this.mIconImageView.setVisibility(8);
                    }
                    else {
                        this.mIconImageView.setVisibility(0);
                        this.mIconImageView.setAdjustViewBounds(true);
                        this.mIconImageView.setOnClickListener((View view0) -> {
                            try {
                                if(!NativeAdView.this.mIsValidLayout) {
                                    AdPieLog.i("NativeAdView", "It\'s invalid layout. If it is not a server error, check your layout XML or NativeAdViewBinder object.");
                                }
                                boolean z = true;
                                NativeAdData nativeAdData0 = NativeAdView.this.mNativeAdData;
                                if(nativeAdData0 != null) {
                                    if(nativeAdData0.getOnlyClickCTA() == 1 && !view0.equals(NativeAdView.this.mCtaButton)) {
                                        return;
                                    }
                                    String s = NativeAdView.this.mNativeAdData.getLink();
                                    if(NativeAdView.this.mNativeAdData.getWebviewLanding() != 1) {
                                        z = false;
                                    }
                                    if(!ClickThroughUtil.isValidClick()) {
                                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                            AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> block");
                                        }
                                        return;
                                    }
                                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                        AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> isWebViewLanding : " + z);
                                    }
                                    if(z) {
                                        HttpUtil.getFinalURL(s, new Handler(Looper.getMainLooper()) {
                                            @Override  // android.os.Handler
                                            public void handleMessage(@NonNull Message message0) {
                                                if(message0.what == 100) {
                                                    try {
                                                        if(ClickThroughUtil.goToWebView(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        else if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    catch(Exception exception0) {
                                                    }
                                                    AdPieLog.e("NativeAdView", exception0);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, s)) {
                                        ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                        AdEventListener adEventListener0 = NativeAdView.this.mAdEventListener;
                                        if(adEventListener0 != null) {
                                            adEventListener0.notifyAdClicked();
                                        }
                                    }
                                }
                            }
                            catch(Exception exception0) {
                                AdPieLog.e("NativeAdView", exception0);
                            }
                        });
                    }
                }
                if(this.mRatingBar != null) {
                    try {
                        double f = this.mNativeAdData.getRating();
                        if(f <= 0.0 || f > 5.0) {
                            this.mRatingBar.setVisibility(8);
                        }
                        else {
                            this.mRatingBar.setVisibility(0);
                            this.mRatingBar.setNumStars(5);
                            this.mRatingBar.setRating(((float)f));
                            this.mRatingBar.setOnTouchListener(new View.OnTouchListener() {
                                @Override  // android.view.View$OnTouchListener
                                public boolean onTouch(View view0, MotionEvent motionEvent0) {
                                    if(motionEvent0.getAction() == 1) {
                                        NativeAdView.this.clickEvent(view0);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                    catch(Exception unused_ex) {
                        this.mRatingBar.setVisibility(8);
                    }
                }
                if(this.mDescTextView != null) {
                    if(TextUtils.isEmpty(this.mNativeAdData.getDescription())) {
                        this.mDescTextView.setVisibility(8);
                    }
                    else {
                        this.mDescTextView.setVisibility(0);
                        this.mDescTextView.setText(this.mNativeAdData.getDescription());
                        this.mDescTextView.setOnClickListener((View view0) -> {
                            try {
                                if(!NativeAdView.this.mIsValidLayout) {
                                    AdPieLog.i("NativeAdView", "It\'s invalid layout. If it is not a server error, check your layout XML or NativeAdViewBinder object.");
                                }
                                boolean z = true;
                                NativeAdData nativeAdData0 = NativeAdView.this.mNativeAdData;
                                if(nativeAdData0 != null) {
                                    if(nativeAdData0.getOnlyClickCTA() == 1 && !view0.equals(NativeAdView.this.mCtaButton)) {
                                        return;
                                    }
                                    String s = NativeAdView.this.mNativeAdData.getLink();
                                    if(NativeAdView.this.mNativeAdData.getWebviewLanding() != 1) {
                                        z = false;
                                    }
                                    if(!ClickThroughUtil.isValidClick()) {
                                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                            AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> block");
                                        }
                                        return;
                                    }
                                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                        AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> isWebViewLanding : " + z);
                                    }
                                    if(z) {
                                        HttpUtil.getFinalURL(s, new Handler(Looper.getMainLooper()) {
                                            @Override  // android.os.Handler
                                            public void handleMessage(@NonNull Message message0) {
                                                if(message0.what == 100) {
                                                    try {
                                                        if(ClickThroughUtil.goToWebView(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        else if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    catch(Exception exception0) {
                                                    }
                                                    AdPieLog.e("NativeAdView", exception0);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, s)) {
                                        ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                        AdEventListener adEventListener0 = NativeAdView.this.mAdEventListener;
                                        if(adEventListener0 != null) {
                                            adEventListener0.notifyAdClicked();
                                        }
                                    }
                                }
                            }
                            catch(Exception exception0) {
                                AdPieLog.e("NativeAdView", exception0);
                            }
                        });
                    }
                }
                if(this.mMainAdView != null) {
                    if(!TextUtils.isEmpty(this.mNativeAdData.getMainImageUrl())) {
                        this.mMainAdView.init(this.mNativeAdData.getMainWidth(), this.mNativeAdData.getMainHeight());
                        this.mMainAdView.setVisibility(0);
                        this.mMainAdView.setOnClickListener((View view0) -> {
                            try {
                                if(!NativeAdView.this.mIsValidLayout) {
                                    AdPieLog.i("NativeAdView", "It\'s invalid layout. If it is not a server error, check your layout XML or NativeAdViewBinder object.");
                                }
                                boolean z = true;
                                NativeAdData nativeAdData0 = NativeAdView.this.mNativeAdData;
                                if(nativeAdData0 != null) {
                                    if(nativeAdData0.getOnlyClickCTA() == 1 && !view0.equals(NativeAdView.this.mCtaButton)) {
                                        return;
                                    }
                                    String s = NativeAdView.this.mNativeAdData.getLink();
                                    if(NativeAdView.this.mNativeAdData.getWebviewLanding() != 1) {
                                        z = false;
                                    }
                                    if(!ClickThroughUtil.isValidClick()) {
                                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                            AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> block");
                                        }
                                        return;
                                    }
                                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                        AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> isWebViewLanding : " + z);
                                    }
                                    if(z) {
                                        HttpUtil.getFinalURL(s, new Handler(Looper.getMainLooper()) {
                                            @Override  // android.os.Handler
                                            public void handleMessage(@NonNull Message message0) {
                                                if(message0.what == 100) {
                                                    try {
                                                        if(ClickThroughUtil.goToWebView(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        else if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    catch(Exception exception0) {
                                                    }
                                                    AdPieLog.e("NativeAdView", exception0);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, s)) {
                                        ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                        AdEventListener adEventListener0 = NativeAdView.this.mAdEventListener;
                                        if(adEventListener0 != null) {
                                            adEventListener0.notifyAdClicked();
                                        }
                                    }
                                }
                            }
                            catch(Exception exception0) {
                                AdPieLog.e("NativeAdView", exception0);
                            }
                        });
                    }
                    else if(this.mNativeAdData.getVideoAdData() != null) {
                        this.mMainAdView.init(this.mNativeAdData.getMainWidth(), this.mNativeAdData.getMainHeight(), this.mNativeAdData.getVideoAdData(), this.mAdEventListener);
                        this.mMainAdView.setVisibility(0);
                        this.mMainAdView.setOnClickListener(new View.OnClickListener() {
                            @Override  // android.view.View$OnClickListener
                            public void onClick(View view0) {
                            }
                        });
                    }
                    else {
                        this.mMainAdView.setVisibility(8);
                    }
                }
                if(this.mCtaButton != null) {
                    if(TextUtils.isEmpty(this.mNativeAdData.getCallToAction())) {
                        this.mCtaButton.setVisibility(8);
                    }
                    else {
                        this.mCtaButton.setVisibility(0);
                        this.mCtaButton.setText(this.mNativeAdData.getCallToAction());
                        this.mCtaButton.setOnClickListener((View view0) -> {
                            try {
                                if(!NativeAdView.this.mIsValidLayout) {
                                    AdPieLog.i("NativeAdView", "It\'s invalid layout. If it is not a server error, check your layout XML or NativeAdViewBinder object.");
                                }
                                boolean z = true;
                                NativeAdData nativeAdData0 = NativeAdView.this.mNativeAdData;
                                if(nativeAdData0 != null) {
                                    if(nativeAdData0.getOnlyClickCTA() == 1 && !view0.equals(NativeAdView.this.mCtaButton)) {
                                        return;
                                    }
                                    String s = NativeAdView.this.mNativeAdData.getLink();
                                    if(NativeAdView.this.mNativeAdData.getWebviewLanding() != 1) {
                                        z = false;
                                    }
                                    if(!ClickThroughUtil.isValidClick()) {
                                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                            AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> block");
                                        }
                                        return;
                                    }
                                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                        AdPieLog.d("NativeAdView", ":::clickEvent::: " + s + " -> isWebViewLanding : " + z);
                                    }
                                    if(z) {
                                        HttpUtil.getFinalURL(s, new Handler(Looper.getMainLooper()) {
                                            @Override  // android.os.Handler
                                            public void handleMessage(@NonNull Message message0) {
                                                if(message0.what == 100) {
                                                    try {
                                                        if(ClickThroughUtil.goToWebView(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        else if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, ((String)message0.obj))) {
                                                            ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                                            if(NativeAdView.this.mAdEventListener != null) {
                                                                NativeAdView.this.mAdEventListener.notifyAdClicked();
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    catch(Exception exception0) {
                                                    }
                                                    AdPieLog.e("NativeAdView", exception0);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    if(ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, s)) {
                                        ReportUtil.sendReport("NATIVE_CLICK_TAG", NativeAdView.this.mNativeAdData.getTrackingClkUrls());
                                        AdEventListener adEventListener0 = NativeAdView.this.mAdEventListener;
                                        if(adEventListener0 != null) {
                                            adEventListener0.notifyAdClicked();
                                        }
                                    }
                                }
                            }
                            catch(Exception exception0) {
                                AdPieLog.e("NativeAdView", exception0);
                            }
                        });
                    }
                }
                ImageView imageView0 = this.mOptOutImageView;
                if(imageView0 != null) {
                    imageView0.setOnClickListener(new View.OnClickListener() {
                        @Override  // android.view.View$OnClickListener
                        public void onClick(View view0) {
                            if(!ClickThroughUtil.isValidClick()) {
                                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                    AdPieLog.d("NativeAdView", ":::clickEvent::: OptOut : " + NativeAdView.this.mNativeAdData.getOptoutLink() + " -> block");
                                }
                                return;
                            }
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("NativeAdView", ":::clickEvent::: OptOut : " + NativeAdView.this.mNativeAdData.getOptoutLink());
                            }
                            ClickThroughUtil.goToBrowser(NativeAdView.this.mContext, NativeAdView.this.mNativeAdData.getOptoutLink());
                        }
                    });
                }
                int[] arr_v = this.mNativeAdData.getAssetTypes();
                v = -23;
                if(arr_v == null) {
                    v1 = 0;
                }
                else {
                    v1 = 0;
                    for(int v2 = 0; v2 < arr_v.length; ++v2) {
                    alab1:
                        switch(arr_v[v2]) {
                            case 1: {
                                if(this.mTitleTextView == null) {
                                    AdPieLog.i("NativeAdView", "It\'s invalid layout. Title TextView cannot be null.");
                                    v1 = -11;
                                }
                                else if(TextUtils.isEmpty(this.mNativeAdData.getTitle())) {
                                    AdPieLog.i("NativeAdView", "Invalid server data received. Title data is empty.");
                                    v1 = -21;
                                }
                                break;
                            }
                            case 2: {
                                this.mIsRequiredIconImage = true;
                                if(this.mIconImageView == null) {
                                    AdPieLog.i("NativeAdView", "It\'s invalid layout. Icon ImageView cannot be null.");
                                    v1 = -12;
                                }
                                else if(TextUtils.isEmpty(this.mNativeAdData.getIconImageUrl())) {
                                    AdPieLog.i("NativeAdView", "Invalid server data received. Icon data is empty.");
                                    v1 = -22;
                                }
                                break;
                            }
                            case 3: {
                                switch(this.mNativeAdData.getIcType()) {
                                    case 0x1F: {
                                        this.mIsRequiredMainImage = true;
                                        if(this.mMainAdView == null) {
                                            AdPieLog.i("NativeAdView", "It\'s invalid layout. NativeMainView cannot be null.");
                                            v1 = -13;
                                            break alab1;
                                        }
                                        else if(TextUtils.isEmpty(this.mNativeAdData.getMainImageUrl())) {
                                            AdPieLog.i("NativeAdView", "Invalid server data received. Main data is empty.");
                                            v1 = -23;
                                        }
                                        break alab1;
                                    }
                                    case 0x20: {
                                        this.mIsRequiredMainVideo = true;
                                        if(this.mMainAdView == null) {
                                            AdPieLog.i("NativeAdView", "It\'s invalid layout. NativeMainView cannot be null.");
                                            v1 = -13;
                                        }
                                        break alab1;
                                    }
                                    default: {
                                        break alab1;
                                    }
                                }
                            }
                            case 4: {
                                if(this.mDescTextView == null) {
                                    AdPieLog.i("NativeAdView", "It\'s invalid layout. Description TextView cannot be null.");
                                    v1 = -14;
                                }
                                else if(TextUtils.isEmpty(this.mNativeAdData.getDescription())) {
                                    AdPieLog.i("NativeAdView", "Invalid server data received. Description data is empty.");
                                    v1 = -24;
                                }
                            }
                        }
                    }
                }
                if(this.mNativeAdData.getIcType() != 0x20 || this.mIsRequiredMainVideo) {
                    v = v1;
                }
                else {
                    AdPieLog.i("NativeAdView", "The main asset type can not be found.");
                }
                if(this.mNativeAdData.getOnlyClickCTA() == 1) {
                    if(this.mCtaButton == null) {
                        AdPieLog.i("NativeAdView", "It\'s invalid layout. CTA Button cannot be null.");
                        v = 16;
                    }
                    else if(TextUtils.isEmpty(this.mNativeAdData.getDescription())) {
                        AdPieLog.i("NativeAdView", "Invalid server data received. CTA data is empty.");
                        v = -26;
                    }
                }
            }
            this.mIsValidLayout = v == 0;
            if(v == 0) {
                this.mAdView.setVisibility(0);
                return 0;
            }
            AdPieLog.i("NativeAdView", "It\'s invalid layout. If it is not a server error, check your layout XML or NativeAdViewBinder object.");
            this.mAdView.setVisibility(8);
            return v;
        }
        catch(OutOfMemoryError outOfMemoryError0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("NativeAdView", "[oom] free memory : " + 0.0f + "(MB), total memory : " + 8192.0f + "(MB)");
            AdPieLog.e("NativeAdView", new Exception(outOfMemoryError0));
            MemUtil.printMemoryLog();
        }
        MemUtil.setMemoryError(true);
        return -99;

        class com.gomfactory.adpie.sdk.nativeads.NativeAdView.1 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                NativeAdView.this.clickEvent(view0);
            }
        }


        class com.gomfactory.adpie.sdk.nativeads.NativeAdView.2 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                NativeAdView.this.clickEvent(view0);
            }
        }


        class com.gomfactory.adpie.sdk.nativeads.NativeAdView.4 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                NativeAdView.this.clickEvent(view0);
            }
        }


        class com.gomfactory.adpie.sdk.nativeads.NativeAdView.5 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                NativeAdView.this.clickEvent(view0);
            }
        }


        class com.gomfactory.adpie.sdk.nativeads.NativeAdView.7 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                NativeAdView.this.clickEvent(view0);
            }
        }

    }

    public ImageView getIconImageView() {
        return this.mIconImageView;
    }

    public ImageView getMainImageView() {
        return this.mMainAdView == null ? null : this.mMainAdView.getImageView();
    }

    public NativeAdData getNativeAdData() {
        return this.mNativeAdData;
    }

    public ImageView getOptOutImageView() {
        return this.mOptOutImageView;
    }

    private void impressionEvent() {
        try {
            if(this.mIsNotifyImpression) {
                return;
            }
            if(!this.mIsValidLayout) {
                AdPieLog.i("NativeAdView", "It\'s invalid layout. If it is not a server error, check your layout XML or NativeAdViewBinder object.");
            }
            if(this.mNativeAdData != null) {
                this.mIsNotifyImpression = true;
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("NativeAdView", "impressionEvent");
                    if(this.mAdView != null) {
                        AdPieLog.d("NativeAdView", "mAdView.getVisibility() : " + String.format("%s", this.mAdView.getVisibility()));
                    }
                }
                ReportUtil.sendReport("NATIVE_IMPRESSION_TAG", this.mNativeAdData.getTrackingImpUrls());
                AdEventListener adEventListener0 = this.mAdEventListener;
                if(adEventListener0 != null) {
                    adEventListener0.notifyAdShown();
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void initLayout(NativeAdViewBinder nativeAdViewBinder0) {
        try {
            this.mNativeAdViewBinder = nativeAdViewBinder0;
            if(nativeAdViewBinder0 == null) {
                int v = DisplayUtil.dpToPx(this.mContext, 5);
                int v1 = DisplayUtil.dpToPx(this.mContext, 10);
                int v2 = DisplayUtil.dpToPx(this.mContext, 30);
                this.mAdView = new LinearLayout(this.mContext);
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
                this.mAdView.setLayoutParams(linearLayout$LayoutParams0);
                LinearLayout linearLayout0 = new LinearLayout(this.mContext);
                linearLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout0.setOrientation(1);
                this.mAdView.addView(linearLayout0);
                LinearLayout linearLayout1 = new LinearLayout(this.mContext);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
                linearLayout1.setOrientation(0);
                linearLayout1.setLayoutParams(linearLayout$LayoutParams1);
                linearLayout0.addView(linearLayout1);
                ImageView imageView0 = new ImageView(this.mContext);
                this.mIconImageView = imageView0;
                imageView0.setId(DisplayUtil.generateViewId());
                LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(DisplayUtil.dpToPx(this.mContext, 50), DisplayUtil.dpToPx(this.mContext, 50));
                linearLayout$LayoutParams2.setMargins(0, v, v1, v);
                this.mIconImageView.setLayoutParams(linearLayout$LayoutParams2);
                linearLayout1.addView(this.mIconImageView);
                this.mTitleTextView = new TextView(this.mContext);
                LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                linearLayout$LayoutParams3.setMargins(0, v, v2, v);
                linearLayout$LayoutParams3.gravity = 16;
                this.mTitleTextView.setTextColor(0xFF000000);
                this.mTitleTextView.setLayoutParams(linearLayout$LayoutParams3);
                this.mTitleTextView.setTextSize(1, 16.0f);
                this.mTitleTextView.setMaxLines(2);
                TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
                this.mTitleTextView.setEllipsize(textUtils$TruncateAt0);
                linearLayout1.addView(this.mTitleTextView);
                this.mDescTextView = new TextView(this.mContext);
                LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                linearLayout$LayoutParams4.setMargins(0, v, 0, v);
                this.mDescTextView.setTextColor(0xFF000000);
                this.mDescTextView.setLayoutParams(linearLayout$LayoutParams4);
                this.mDescTextView.setTextSize(1, 14.0f);
                this.mDescTextView.setMaxLines(3);
                this.mDescTextView.setEllipsize(textUtils$TruncateAt0);
                linearLayout0.addView(this.mDescTextView);
                MainAdView mainAdView0 = new MainAdView(this.mContext);
                this.mMainAdView = mainAdView0;
                mainAdView0.setBackgroundColor(Color.parseColor("#F5F5F5"));
                LinearLayout.LayoutParams linearLayout$LayoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                this.mMainAdView.setLayoutParams(linearLayout$LayoutParams5);
                linearLayout0.addView(this.mMainAdView);
                this.mCtaButton = new Button(this.mContext);
                LinearLayout.LayoutParams linearLayout$LayoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                this.mCtaButton.setLayoutParams(linearLayout$LayoutParams6);
                this.mCtaButton.setTextColor(-1);
                this.mCtaButton.setBackgroundColor(Color.parseColor("#039be5"));
                this.mCtaButton.setTextSize(1, 14.0f);
                linearLayout0.addView(this.mCtaButton);
                this.mAdView.setVisibility(8);
                this.removeAllViews();
                this.addView(this.mAdView);
            }
            else {
                ViewGroup viewGroup0 = (ViewGroup)View.inflate(this.mContext, nativeAdViewBinder0.getLayoutId(), null);
                this.mAdView = viewGroup0;
                if(viewGroup0 != null) {
                    this.mTitleTextView = (TextView)viewGroup0.findViewById(nativeAdViewBinder0.getTitleId());
                    this.mIconImageView = (ImageView)this.mAdView.findViewById(nativeAdViewBinder0.getIconImageId());
                    this.mRatingBar = (RatingBar)this.mAdView.findViewById(nativeAdViewBinder0.getRatingbarId());
                    this.mDescTextView = (TextView)this.mAdView.findViewById(nativeAdViewBinder0.getDescriptionId());
                    this.mMainAdView = (MainAdView)this.mAdView.findViewById(nativeAdViewBinder0.getMainId());
                    this.mCtaButton = (Button)this.mAdView.findViewById(nativeAdViewBinder0.getCallToActionId());
                    this.mOptOutImageView = (ImageView)this.mAdView.findViewById(nativeAdViewBinder0.getOptOutId());
                    this.mAdView.setVisibility(8);
                    this.removeAllViews();
                    this.addView(this.mAdView);
                    this.mAdViewWidth = this.mAdView.getWidth();
                    this.mAdViewHeight = this.mAdView.getHeight();
                }
            }
            ImageView imageView1 = this.mOptOutImageView;
            if(imageView1 == null) {
                ImageView imageView2 = new ImageView(this.mContext);
                this.mOptOutImageView = imageView2;
                imageView2.setAdjustViewBounds(true);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(DisplayUtil.dpToPx(this.mContext, 14), DisplayUtil.dpToPx(this.mContext, 14));
                frameLayout$LayoutParams0.gravity = 5;
                frameLayout$LayoutParams0.topMargin = this.mAdView.getPaddingTop() + DisplayUtil.dpToPx(this.mContext, 5);
                frameLayout$LayoutParams0.rightMargin = this.mAdView.getPaddingRight() + DisplayUtil.dpToPx(this.mContext, 5);
                this.mOptOutImageView.setLayoutParams(frameLayout$LayoutParams0);
                this.addView(this.mOptOutImageView);
                return;
            }
            imageView1.setAdjustViewBounds(true);
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("NativeAdView", exception0);
        }
    }

    public boolean isResourceLoaded() {
        return this.mIsResourceLoaded;
    }

    @Deprecated
    public boolean isSponsoredTextVisible() {
        return false;
    }

    public boolean isVideoAd() {
        return this.mNativeAdData != null && this.mNativeAdData.getIcType() == 0x20;
    }

    private void resourceLoadError(ResourceLoadEventListener nativeAdView$ResourceLoadEventListener0, HashMap hashMap0) {
        try {
            this.mIsResourceLoaded = false;
            if(nativeAdView$ResourceLoadEventListener0 != null) {
                nativeAdView$ResourceLoadEventListener0.onError();
            }
            if(hashMap0 != null) {
                hashMap0.clear();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void resourceLoadSuccess(ResourceLoadEventListener nativeAdView$ResourceLoadEventListener0, HashMap hashMap0) {
        try {
            this.mIsResourceLoaded = true;
            if(nativeAdView$ResourceLoadEventListener0 != null) {
                nativeAdView$ResourceLoadEventListener0.onSuccess();
            }
            if(hashMap0 != null) {
                hashMap0.clear();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Deprecated
    public void setSponsoredTextVisible(boolean z) {
    }

    public void setupOptOut() {
        try {
            if(this.mIsSetOptOut) {
                return;
            }
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("NativeAdView", ":::setupOptOut::: image : " + this.mNativeAdData.getOptoutImageUrl() + ", link : " + this.mNativeAdData.getOptoutLink());
            }
            if(this.mOptOutImageView == null) {
                return;
            }
            this.mIsSetOptOut = true;
            String s = this.mNativeAdData.getOptoutImageUrl();
            if(!TextUtils.isEmpty(s)) {
                this.mOptOutImageView.setImageBitmap(null);
                NativeAdImageHelper nativeAdImageHelper0 = new NativeAdImageHelper(this.mContext);
                HashMap hashMap0 = new HashMap();
                hashMap0.put(s, this.mOptOutImageView);
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("NativeAdView", ":::setupOptOut::: load - " + s);
                }
                nativeAdImageHelper0.load(hashMap0, new ImageLoadEventListener() {
                    @Override  // com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper$ImageLoadEventListener
                    public void onError() {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("NativeAdView", ":::setupOptOut:::onError - " + s);
                        }
                        NativeAdView.this.mOptOutImageView.setVisibility(8);
                    }

                    @Override  // com.gomfactory.adpie.sdk.nativeads.NativeAdImageHelper$ImageLoadEventListener
                    public void onSuccess() {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("NativeAdView", ":::setupOptOut:::onSuccess - " + s);
                        }
                        NativeAdView.this.mOptOutImageView.setVisibility(0);
                    }
                });
                return;
            }
            this.mOptOutImageView.setImageBitmap(null);
            this.mOptOutImageView.setVisibility(8);
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("NativeAdView", exception0);
        ImageView imageView0 = this.mOptOutImageView;
        if(imageView0 != null) {
            imageView0.setImageBitmap(null);
            this.mOptOutImageView.setVisibility(8);
        }
    }
}

