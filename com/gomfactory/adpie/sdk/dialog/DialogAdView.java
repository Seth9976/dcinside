package com.gomfactory.adpie.sdk.dialog;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.TargetingData;
import com.gomfactory.adpie.sdk.common.AdData;
import com.gomfactory.adpie.sdk.common.AdResponse;
import com.gomfactory.adpie.sdk.controller.AdController;
import com.gomfactory.adpie.sdk.event.AdEventListener;
import com.gomfactory.adpie.sdk.ui.AdContentView.AdContentEventListener;
import com.gomfactory.adpie.sdk.ui.AdContentView;
import com.gomfactory.adpie.sdk.ui.webview.AdWebView.WebViewEventListener;
import com.gomfactory.adpie.sdk.ui.webview.AdWebView;
import com.gomfactory.adpie.sdk.util.AdPieLog;

public class DialogAdView extends FrameLayout {
    public interface AdListener {
        void onAdClicked();

        void onAdFailedToLoad(int arg1);

        void onAdLoaded();

        void onAdShown();
    }

    static enum DialogState {
        NOT_READY,
        READY,
        SHOW;

        boolean isReady() [...] // 潜在的解密器
    }

    public static final String TAG = "DialogAdView";
    private AdData adData;
    private Thread adThread;
    private boolean initialized;
    private FrameLayout mAdContainer;
    private AdController mAdController;
    private AdEventListener mAdEventListener;
    private AdListener mAdListener;
    private AdWebView mAdWebView;
    private Context mContext;
    private DialogState mDialogState;
    private final Handler mHandler;
    private ProgressBar mProgressbar;
    private String mSlotId;
    private TargetingData mTargetingData;

    static {
    }

    public DialogAdView(Context context0, String s) {
        super(context0);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mContext = context0;
        this.mAdListener = null;
        this.mSlotId = s;
        this.mDialogState = DialogState.NOT_READY;
        this.init();
    }

    private void addEventListener() {
        this.mAdEventListener = new AdEventListener() {
            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdClicked() {
                DialogAdView.this.mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::notifyAdClicked");
                        if(DialogAdView.this.mAdListener != null) {
                            DialogAdView.this.mAdListener.onAdClicked();
                        }
                    }
                });
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdDismissed() {
                com.gomfactory.adpie.sdk.dialog.DialogAdView.1.4 dialogAdView$1$40 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::notifyAdDismissed");
                        DialogAdView.this.mDialogState = DialogState.NOT_READY;
                    }
                };
                DialogAdView.this.mHandler.post(dialogAdView$1$40);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdFailedToLoad(int v) {
                com.gomfactory.adpie.sdk.dialog.DialogAdView.1.2 dialogAdView$1$20 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::notifyAdFailedToLoad:::" + v);
                        DialogAdView.this.mDialogState = DialogState.NOT_READY;
                        DialogAdView.this.adData = null;
                        if(DialogAdView.this.mAdListener != null) {
                            DialogAdView.this.mAdListener.onAdFailedToLoad(v);
                        }
                    }
                };
                DialogAdView.this.mHandler.post(dialogAdView$1$20);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdLoaded(Object[] arr_object) {
                com.gomfactory.adpie.sdk.dialog.DialogAdView.1.1 dialogAdView$1$10 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::notifyAdLoaded");
                        if(DialogAdView.this.mAdListener != null) {
                            DialogAdView.this.mAdListener.onAdLoaded();
                        }
                    }
                };
                DialogAdView.this.mHandler.post(dialogAdView$1$10);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyAdShown() {
                com.gomfactory.adpie.sdk.dialog.DialogAdView.1.3 dialogAdView$1$30 = new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::notifyAdShown");
                        DialogAdView.this.mDialogState = DialogState.SHOW;
                        if(DialogAdView.this.mAdListener != null) {
                            DialogAdView.this.mAdListener.onAdShown();
                        }
                    }
                };
                DialogAdView.this.mHandler.post(dialogAdView$1$30);
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdCompleted() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdError() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdPaused() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdSkipped() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStarted() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void notifyVideoAdStopped() {
            }

            @Override  // com.gomfactory.adpie.sdk.event.AdEventListener
            public void receivedResponse(AdResponse adResponse0) {
                AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::receivedResponse");
                if(adResponse0 != null) {
                    try {
                        int v = adResponse0.getResult();
                        if(v == 0) {
                            if(adResponse0.getCount() == 1) {
                                DialogAdView.this.adData = adResponse0.getAdData();
                                if(DialogAdView.this.adData != null) {
                                    if(DialogAdView.this.adData.getIcType() == 11) {
                                        String s = DialogAdView.this.adData.getAdmImageTag();
                                        if(!TextUtils.isEmpty(s)) {
                                            DialogAdView.this.preloadHtml(s);
                                            return;
                                        }
                                        DialogAdView.this.preloadHtml("");
                                        return;
                                    }
                                    AdPieLog.i("DialogAdView", "\'" + DialogAdView.this.adData.getIcType() + "\' inventory and contentType are not matched.");
                                    if(DialogAdView.this.mAdEventListener != null) {
                                        DialogAdView.this.mAdEventListener.notifyAdFailedToLoad(108);
                                        return;
                                    }
                                }
                                else if(DialogAdView.this.mAdEventListener != null) {
                                    DialogAdView.this.mAdEventListener.notifyAdFailedToLoad(100);
                                    return;
                                }
                            }
                            else if(DialogAdView.this.mAdEventListener != null) {
                                DialogAdView.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(v == 204) {
                            if(DialogAdView.this.mAdEventListener != null) {
                                DialogAdView.this.mAdEventListener.notifyAdFailedToLoad(100);
                                return;
                            }
                        }
                        else if(DialogAdView.this.mAdEventListener != null) {
                            DialogAdView.this.mAdEventListener.notifyAdFailedToLoad(101);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("DialogAdView", exception0);
                    }
                    this.notifyAdFailedToLoad(104);
                }
            }
        };
    }

    public void destroy() {
        AdPieLog.d("DialogAdView", this.mSlotId + ":::destroy");
        AdController adController0 = this.mAdController;
        if(adController0 != null) {
            adController0.destroy();
            this.mAdController = null;
        }
        this.removeEventListener();
        Thread thread0 = this.adThread;
        if(thread0 != null) {
            thread0.interrupt();
            this.adThread = null;
        }
        AdWebView adWebView0 = this.mAdWebView;
        if(adWebView0 != null) {
            adWebView0.setWebViewEventListener(null);
            this.mAdWebView.destroy();
            this.mAdWebView = null;
        }
    }

    public AdListener getAdListener() {
        return this.mAdListener;
    }

    private void init() {
        AdPieLog.d("DialogAdView", this.mSlotId + ":::init");
        this.addEventListener();
        this.mAdController = new AdController(this.mContext, this.mAdEventListener);
        FrameLayout frameLayout0 = new FrameLayout(this.mContext);
        this.mAdContainer = frameLayout0;
        frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.addView(this.mAdContainer);
        this.mProgressbar = new ProgressBar(this.mContext);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 17;
        this.mProgressbar.setLayoutParams(frameLayout$LayoutParams0);
        this.mProgressbar.setVisibility(8);
        this.addView(this.mProgressbar);
        this.initialized = true;
    }

    // 去混淆评级： 低(20)
    public boolean isLoaded() {
        return false;
    }

    public void load() {
        try {
            if(this.adThread == null) {
                Thread thread0 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::load");
                        DialogAdView.this.mDialogState = DialogState.NOT_READY;
                        DialogAdView.this.adData = null;
                        if(!DialogAdView.this.initialized) {
                            DialogAdView.this.init();
                        }
                        try {
                            DialogAdView.this.mAdController.setSlotID(DialogAdView.this.mSlotId);
                            DialogAdView.this.mAdController.setTargetingData(DialogAdView.this.mTargetingData);
                            DialogAdView.this.mAdController.loadAd();
                        }
                        catch(Exception exception0) {
                            AdPieLog.e("DialogAdView", exception0);
                            if(DialogAdView.this.mAdEventListener != null) {
                                DialogAdView.this.mAdEventListener.notifyAdFailedToLoad(104);
                            }
                        }
                        DialogAdView.this.adThread = null;
                    }
                });
                this.adThread = thread0;
                thread0.start();
                return;
            }
            AdPieLog.d("DialogAdView", "AdPie (" + this.mSlotId + ") is already loading an ad. Wait for previous load to finish.");
            AdEventListener adEventListener0 = this.mAdEventListener;
            if(adEventListener0 != null) {
                adEventListener0.notifyAdFailedToLoad(106);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("DialogAdView", exception0);
        AdEventListener adEventListener1 = this.mAdEventListener;
        if(adEventListener1 != null) {
            adEventListener1.notifyAdFailedToLoad(104);
        }
    }

    public void load(TargetingData targetingData0) {
        this.mTargetingData = targetingData0;
        this.load();
    }

    private void preloadHtml(String s) {
        if(TextUtils.isEmpty(s)) {
            this.mDialogState = DialogState.READY;
            AdEventListener adEventListener0 = this.mAdEventListener;
            if(adEventListener0 != null) {
                adEventListener0.notifyAdLoaded(new Object[0]);
            }
            return;
        }
        AdPieLog.d("DialogAdView", this.mSlotId + ":::preloadHtml - " + s);
        AdWebView adWebView0 = this.mAdWebView;
        if(adWebView0 != null) {
            adWebView0.setWebViewEventListener(null);
            this.mAdWebView.destroy();
            this.mAdWebView = null;
        }
        AdWebView adWebView1 = new AdWebView(this.mContext);
        this.mAdWebView = adWebView1;
        adWebView1.setWebViewEventListener(new WebViewEventListener() {
            @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewEventListener
            public void onPageDelayed() {
                DialogAdView.this.mDialogState = DialogState.NOT_READY;
                DialogAdView.this.adData = null;
                if(DialogAdView.this.mAdWebView != null) {
                    DialogAdView.this.mAdWebView.setWebViewEventListener(null);
                    DialogAdView.this.mAdWebView.destroy();
                    DialogAdView.this.mAdWebView = null;
                }
                if(DialogAdView.this.mAdEventListener != null) {
                    DialogAdView.this.mAdEventListener.notifyAdFailedToLoad(107);
                }
            }

            @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewEventListener
            public void onPageFinished() {
                DialogAdView.this.mDialogState = DialogState.READY;
                if(DialogAdView.this.mAdEventListener != null) {
                    DialogAdView.this.mAdEventListener.notifyAdLoaded(new Object[0]);
                }
            }

            @Override  // com.gomfactory.adpie.sdk.ui.webview.AdWebView$WebViewEventListener
            public void onUserClick(String s) {
            }
        });
        AdPieLog.d("DialogAdView", this.mSlotId + ":::AdWebView-loadData");
        this.mAdWebView.loadData(s, 2000L);
    }

    private void removeEventListener() {
        this.mAdEventListener = null;
    }

    public void setAdListener(AdListener dialogAdView$AdListener0) {
        this.mAdListener = dialogAdView$AdListener0;
    }

    public boolean show() {
        AdPieLog.d("DialogAdView", this.mSlotId + ":::show:::" + AdPieSDK.getInstance().getNetworkConnectionType() + "," + Build.VERSION.SDK_INT);
        try {
            if(AdPieSDK.getInstance().getNetworkConnectionType() != 0) {
                if(this.adData == null) {
                    AdPieLog.i("DialogAdView", this.mSlotId + ":::show:::Ads data cannot be null.");
                    return false;
                }
                AdPieLog.i("DialogAdView", this.mSlotId + ":::show:::InterstitialState is not ready.");
                return false;
            }
            AdPieLog.i("DialogAdView", this.mSlotId + ":::show:::Check your internet connection.");
            return false;
        }
        catch(Exception exception0) {
        }
        AdPieLog.e("DialogAdView", exception0);
        return false;
    }

    private void showAdContent(AdData adData0) {
        ProgressBar progressBar0 = this.mProgressbar;
        if(progressBar0 != null) {
            progressBar0.setVisibility(0);
        }
        AdPieLog.d("DialogAdView", this.mSlotId + ":::showAdContent - start");
        if(AdPieSDK.getInstance().getNetworkConnectionType() == 0) {
            AdEventListener adEventListener0 = this.mAdEventListener;
            if(adEventListener0 != null) {
                adEventListener0.notifyAdFailedToLoad(103);
            }
            return;
        }
        this.mAdContainer.removeAllViews();
        AdContentView adContentView0 = new AdContentView(this.mContext, new AdContentEventListener() {
            private boolean isViewLoaded;

            @Override  // com.gomfactory.adpie.sdk.ui.AdContentView$AdContentEventListener
            public void onViewClicked() {
                AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::onViewClicked");
                if(DialogAdView.this.mAdEventListener != null) {
                    DialogAdView.this.mAdEventListener.notifyAdClicked();
                }
            }

            @Override  // com.gomfactory.adpie.sdk.ui.AdContentView$AdContentEventListener
            public void onViewClicked(String s) {
            }

            @Override  // com.gomfactory.adpie.sdk.ui.AdContentView$AdContentEventListener
            public void onViewLoadTimeout(AdContentView adContentView0) {
                AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::onViewLoadTimeout");
                if(DialogAdView.this.mProgressbar != null) {
                    DialogAdView.this.mProgressbar.setVisibility(8);
                }
                if(adContentView0 != null) {
                    try {
                        DialogAdView.this.removeView(adContentView0);
                        adContentView0.onDestroy();
                    }
                    catch(Exception exception0) {
                        AdPieLog.e("DialogAdView", exception0);
                    }
                }
                if(DialogAdView.this.mAdEventListener != null) {
                    DialogAdView.this.mAdEventListener.notifyAdFailedToLoad(107);
                }
            }

            @Override  // com.gomfactory.adpie.sdk.ui.AdContentView$AdContentEventListener
            public void onViewLoaded(AdContentView adContentView0) {
                AdPieLog.d("DialogAdView", DialogAdView.this.mSlotId + ":::onViewLoaded");
                if(DialogAdView.this.mProgressbar != null) {
                    DialogAdView.this.mProgressbar.setVisibility(8);
                }
                adContentView0.setVisibility(0);
                if(!this.isViewLoaded) {
                    this.isViewLoaded = true;
                    if(DialogAdView.this.mAdEventListener != null) {
                        try {
                            DialogAdView.this.mAdEventListener.notifyAdShown();
                        }
                        catch(Exception exception0) {
                            AdPieLog.e("DialogAdView", exception0);
                            if(DialogAdView.this.mAdEventListener != null) {
                                DialogAdView.this.mAdEventListener.notifyAdFailedToLoad(104);
                            }
                        }
                    }
                }
            }
        });
        adContentView0.setVisibility(4);
        this.mAdContainer.addView(adContentView0);
        adContentView0.setAdData(adData0);
        adContentView0.showContent();
        AdPieLog.d("DialogAdView", this.mSlotId + ":::showAdContent - end");
    }
}

