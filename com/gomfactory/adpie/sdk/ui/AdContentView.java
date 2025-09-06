package com.gomfactory.adpie.sdk.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.common.AdData;
import com.gomfactory.adpie.sdk.ui.webview.AdWebView.WebViewEventListener;
import com.gomfactory.adpie.sdk.ui.webview.AdWebView;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.ClickThroughUtil;
import com.gomfactory.adpie.sdk.util.DisplayUtil;
import com.gomfactory.adpie.sdk.util.HttpUtil;
import com.gomfactory.adpie.sdk.util.ReportUtil;
import java.util.ArrayList;

public class AdContentView extends RelativeLayout {
    public interface AdContentEventListener {
        void onViewClicked();

        void onViewClicked(String arg1);

        void onViewLoadTimeout(AdContentView arg1);

        void onViewLoaded(AdContentView arg1);
    }

    public static final String TAG = "AdContentView";
    private AdContentEventListener mAdContentEventListener;
    private AdWebView mAdWebView;
    private Context mContext;
    private String mHtmlData;
    private int mIcType;
    private boolean mIsSkipLandingUrl;
    private boolean mIsWebViewLanding;
    private ArrayList mTrackingClkUrls;
    private ArrayList mTrackingImpUrls;

    static {
    }

    public AdContentView(Context context0, AdContentEventListener adContentView$AdContentEventListener0) {
        super(context0);
        this.mContext = context0;
        this.mAdContentEventListener = adContentView$AdContentEventListener0;
        this.init();
    }

    public void drawBackgroundColor(boolean z) {
        try {
            this.mAdWebView.buildDrawingCache();
            Bitmap bitmap0 = this.mAdWebView.getDrawingCache();
            AdPieLog.d("AdContentView", "drawingCache : " + bitmap0);
            if(bitmap0 != null) {
                int v = bitmap0.getPixel(1, 1);
                AdPieLog.d("AdContentView", "pixel : " + v);
                if(v != 0) {
                    this.setBackgroundColor(v);
                    this.setClickable(false);
                }
            }
            if(z) {
                AdContentEventListener adContentView$AdContentEventListener0 = this.mAdContentEventListener;
                if(adContentView$AdContentEventListener0 != null) {
                    adContentView$AdContentEventListener0.onViewLoaded(this);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void init() {
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mAdWebView = new AdWebView(this.mContext);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout$LayoutParams0.addRule(15);
        relativeLayout$LayoutParams0.addRule(14);
        this.mAdWebView.setLayoutParams(relativeLayout$LayoutParams0);
        this.addView(this.mAdWebView);
        this.mAdWebView.setWebViewEventListener(new WebViewEventListener() {
            @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewEventListener
            public void onPageDelayed() {
                if(AdContentView.this.mAdWebView != null) {
                    AdContentView.this.mAdWebView.setWebViewEventListener(null);
                    AdContentView.this.mAdWebView.destroy();
                    AdContentView.this.mAdWebView = null;
                }
                if(AdContentView.this.mAdContentEventListener != null) {
                    AdContentView.this.mAdContentEventListener.onViewLoadTimeout(AdContentView.this);
                }
            }

            @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewEventListener
            public void onPageFinished() {
                ReportUtil.sendReport("WEBVIEW_IMPRESSION_TAG", AdContentView.this.mTrackingImpUrls);
                if(AdContentView.this.mAdContentEventListener != null) {
                    AdContentView.this.mAdContentEventListener.onViewLoaded(AdContentView.this);
                }
            }

            @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewEventListener
            public void onUserClick(String s) {
                if(!ClickThroughUtil.isValidClick()) {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("AdContentView", ":::clickEvent::: " + s + " -> block");
                    }
                    return;
                }
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdContentView", ":::clickEvent::: " + s + " -> isSkipLandingUrl : " + AdContentView.this.mIsSkipLandingUrl + ", isWebViewLanding : " + AdContentView.this.mIsWebViewLanding);
                }
                if(AdContentView.this.mIsSkipLandingUrl) {
                    ReportUtil.sendReport("WEBVIEW_CLICK_TAG", AdContentView.this.mTrackingClkUrls);
                    if(AdContentView.this.mAdContentEventListener != null) {
                        AdContentView.this.mAdContentEventListener.onViewClicked(s);
                    }
                }
                else {
                    try {
                        if(AdContentView.this.mIsWebViewLanding) {
                            HttpUtil.getFinalURL(s, new Handler(Looper.getMainLooper()) {
                                @Override  // android.os.Handler
                                public void handleMessage(@NonNull Message message0) {
                                    if(message0.what == 100) {
                                        try {
                                            if(ClickThroughUtil.goToWebView(AdContentView.this.mContext, ((String)message0.obj))) {
                                                if(!s.contains("newspub.kr")) {
                                                    ReportUtil.sendReport("WEBVIEW_CLICK_TAG", AdContentView.this.mTrackingClkUrls);
                                                    return;
                                                }
                                            }
                                            else if(ClickThroughUtil.goToBrowser(AdContentView.this.mContext, ((String)message0.obj)) && !s.contains("newspub.kr")) {
                                                ReportUtil.sendReport("WEBVIEW_CLICK_TAG", AdContentView.this.mTrackingClkUrls);
                                                return;
                                            }
                                            return;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        AdPieLog.e("AdContentView", exception0);
                                    }
                                }
                            });
                        }
                        else if(ClickThroughUtil.goToBrowser(AdContentView.this.mContext, s) && !s.contains("newspub.kr")) {
                            ReportUtil.sendReport("WEBVIEW_CLICK_TAG", AdContentView.this.mTrackingClkUrls);
                        }
                    }
                    catch(Exception exception0) {
                        AdPieLog.e("AdContentView", exception0);
                    }
                    if(AdContentView.this.mAdContentEventListener != null) {
                        AdContentView.this.mAdContentEventListener.onViewClicked();
                    }
                }
            }
        });
    }

    public void onDestroy() {
        this.removeAllViews();
        if(this.mAdWebView != null) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdContentView", "AdWebView onDestroy");
            }
            this.mAdWebView.setWebViewEventListener(null);
            this.mAdWebView.destroy();
            this.mAdWebView = null;
        }
    }

    public void onPause() {
        if(this.mAdWebView != null) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdContentView", "AdWebView onPause");
            }
            this.mAdWebView.onPause();
        }
    }

    public void onResume() {
        if(this.mAdWebView != null) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdContentView", "AdWebView onResume");
            }
            this.mAdWebView.onResume();
        }
    }

    public void setAdData(AdData adData0) {
        try {
            this.mIcType = adData0.getIcType();
            this.mHtmlData = adData0.getAdm();
            this.mIsWebViewLanding = adData0.getWebviewLanding() == 1;
            this.mTrackingImpUrls = adData0.getTrackingImpUrls();
            this.mTrackingClkUrls = adData0.getTrackingClkUrls();
            String s = adData0.getBgColor();
            if(!TextUtils.isEmpty(s)) {
                try {
                    this.setBackgroundColor(Color.parseColor(s));
                }
                catch(Exception unused_ex) {
                }
            }
            int v = adData0.getContentWidth();
            int v1 = adData0.getContentHeight();
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(new ViewGroup.LayoutParams(DisplayUtil.dpToPx(this.mContext, v), DisplayUtil.dpToPx(this.mContext, v1)));
            switch(adData0.getPosition()) {
                case 1: {
                    relativeLayout$LayoutParams0.addRule(14);
                    relativeLayout$LayoutParams0.addRule(10);
                    break;
                }
                case 2: {
                    relativeLayout$LayoutParams0.addRule(13);
                    break;
                }
                case 3: {
                    relativeLayout$LayoutParams0.addRule(14);
                    relativeLayout$LayoutParams0.addRule(12);
                    break;
                }
                default: {
                    relativeLayout$LayoutParams0.addRule(13);
                }
            }
            this.mAdWebView.setLayoutParams(relativeLayout$LayoutParams0);
            this.mAdWebView.setMonitoring(adData0.getMonitoring());
            this.mAdWebView.setWebviewLoadingSkip(adData0.getWebviewLoadingSkip());
        }
        catch(Exception unused_ex) {
        }
    }

    public void setScale(float f) {
        try {
            this.mAdWebView.setScaleX(f);
            this.mAdWebView.setScaleY(f);
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("AdContentView", exception0);
            }
        }
    }

    public void setSkipLandingUrl(boolean z) {
        this.mIsSkipLandingUrl = z;
    }

    public void showContent() {
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdContentView", this.mHtmlData);
        }
        if(this.mAdWebView != null && !TextUtils.isEmpty(this.mHtmlData)) {
            if(this.mIcType == 11) {
                this.mAdWebView.loadData(this.mHtmlData, 2000L);
                return;
            }
            this.mAdWebView.loadData(this.mHtmlData, 0L);
            return;
        }
        AdContentEventListener adContentView$AdContentEventListener0 = this.mAdContentEventListener;
        if(adContentView$AdContentEventListener0 != null) {
            adContentView$AdContentEventListener0.onViewLoadTimeout(this);
        }
    }
}

