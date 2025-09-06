package com.igaworks.ssp.common.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.C;
import com.igaworks.ssp.E;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.T;
import com.igaworks.ssp.V;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.c0;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.g0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.i;
import com.igaworks.ssp.l0;
import com.igaworks.ssp.n.d;
import com.igaworks.ssp.n;
import com.igaworks.ssp.p0;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.custom.AdPopcornSSPReactNativeAd;
import com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd;
import com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd;
import com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd;
import com.igaworks.ssp.part.splash.AdPopcornSSPSplashAd;
import com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.r0;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.mbridge.msdk.MBridgeSDK.PLUGIN_LOAD_STATUS;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBNativeHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.NativeListener.NativeAdListener;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MintegralAdapter implements BaseMediationAdapter {
    private MBNativeHandler A;
    private MBBidNativeHandler B;
    private SDKInitStatusListener C;
    private Handler D;
    private Runnable E;
    private int F;
    private boolean G;
    private g H;
    private g I;
    private g J;
    private g K;
    private Context L;
    RewardVideoListener M;
    NewInterstitialListener N;
    private C a;
    private T b;
    private c0 c;
    private l0 d;
    private V e;
    private r0 f;
    private g0 g;
    private b0 h;
    private MBRewardVideoHandler i;
    private MBBidRewardVideoHandler j;
    private MBNewInterstitialHandler k;
    private MBBidNewInterstitialHandler l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private Handler q;
    private Runnable r;
    private Runnable s;
    private boolean t;
    private boolean u;
    private boolean v;
    private MBBannerView w;
    private View x;
    private ImageView y;
    private ImageView z;

    public MintegralAdapter() {
        this.o = true;
        this.p = true;
        this.q = new Handler(Looper.getMainLooper());
        this.t = false;
        this.u = false;
        this.v = true;
        this.D = new Handler(Looper.getMainLooper());
        this.M = new RewardVideoListener() {
            final MintegralAdapter a;

            public void onAdClose(MBridgeIds mBridgeIds0, RewardInfo rewardInfo0) {
                if(rewardInfo0 == null || !rewardInfo0.isCompleteView()) {
                    b.a(Thread.currentThread(), "MintegralAdapter onAdClose rewardinfo is null or rewardInfo.isCompleteView false");
                    if(MintegralAdapter.this.d != null) {
                        MintegralAdapter.this.d.a(i.l.b(), false);
                    }
                }
                else {
                    b.a(Thread.currentThread(), "MintegralAdapter onAdClose rewardinfo :RewardName:" + rewardInfo0.getRewardName() + "RewardAmount:" + rewardInfo0.getRewardAmount() + " isCompleteView：" + rewardInfo0.isCompleteView());
                    if(MintegralAdapter.this.d != null) {
                        MintegralAdapter.this.d.a(i.l.b(), true);
                    }
                }
                if(MintegralAdapter.this.d != null) {
                    MintegralAdapter.this.d.a();
                }
                MintegralAdapter.this.t = false;
            }

            public void onAdShow(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter onAdShow");
                if(MintegralAdapter.this.t && MintegralAdapter.this.d != null) {
                    MintegralAdapter.this.d.a(MintegralAdapter.this.n);
                }
                try {
                    if(MintegralAdapter.this.I != null && MintegralAdapter.this.I.j() != null) {
                        for(int v = 0; v < MintegralAdapter.this.I.j().size(); ++v) {
                            String s = (String)MintegralAdapter.this.I.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "MintegralAdapter onAdImpression url : " + s);
                                E.g().d().a(MintegralAdapter.this.L, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            public void onEndcardShow(MBridgeIds mBridgeIds0) {
            }

            public void onLoadSuccess(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter onLoadSuccess");
            }

            public void onShowFail(MBridgeIds mBridgeIds0, String s) {
                b.a(Thread.currentThread(), "MintegralAdapter onShowFail : " + s);
                if(MintegralAdapter.this.t && MintegralAdapter.this.d != null) {
                    MintegralAdapter.this.d.c(MintegralAdapter.this.n);
                }
            }

            public void onVideoAdClicked(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter onVideoAdClicked");
                if(MintegralAdapter.this.d != null) {
                    MintegralAdapter.this.d.onClickAd();
                }
                try {
                    if(MintegralAdapter.this.I != null && MintegralAdapter.this.I.b() != null) {
                        for(int v = 0; v < MintegralAdapter.this.I.b().size(); ++v) {
                            String s = (String)MintegralAdapter.this.I.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "MintegralAdapter onAdClicked url : " + s);
                                E.g().d().a(MintegralAdapter.this.L, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            public void onVideoComplete(MBridgeIds mBridgeIds0) {
            }

            public void onVideoLoadFail(MBridgeIds mBridgeIds0, String s) {
                b.a(Thread.currentThread(), "MintegralAdapter onVideoLoadFail errorMsg : " + s + ", isCurrentRunningAdapter : " + MintegralAdapter.this.t);
                MintegralAdapter.this.a(true);
                if(MintegralAdapter.this.t && MintegralAdapter.this.d != null) {
                    MintegralAdapter.this.d.d(MintegralAdapter.this.n);
                }
            }

            public void onVideoLoadSuccess(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter onVideoLoadSuccess");
                MintegralAdapter.this.a(true);
                if(MintegralAdapter.this.t && MintegralAdapter.this.d != null) {
                    MintegralAdapter.this.d.b(MintegralAdapter.this.n);
                }
            }
        };
        this.N = new NewInterstitialListener() {
            final MintegralAdapter a;

            public void onAdClicked(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onAdClicked : " + mBridgeIds0.toString());
                try {
                    if(MintegralAdapter.this.J != null && MintegralAdapter.this.J.b() != null) {
                        for(int v = 0; v < MintegralAdapter.this.J.b().size(); ++v) {
                            String s = (String)MintegralAdapter.this.J.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "MintegralAdapter onAdClicked url : " + s);
                                E.g().d().a(MintegralAdapter.this.L, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            public void onAdClose(MBridgeIds mBridgeIds0, RewardInfo rewardInfo0) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onAdClose: isCompleteView：" + rewardInfo0.isCompleteView() + " " + mBridgeIds0.toString());
                if(MintegralAdapter.this.e != null) {
                    MintegralAdapter.this.e.a();
                }
                MintegralAdapter.this.u = false;
            }

            public void onAdCloseWithNIReward(MBridgeIds mBridgeIds0, RewardInfo rewardInfo0) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onAdCloseWithNIReward : " + mBridgeIds0.toString() + "  " + rewardInfo0.toString());
                if(MintegralAdapter.this.e != null) {
                    MintegralAdapter.this.e.a();
                }
                MintegralAdapter.this.u = false;
            }

            public void onAdShow(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onAdShow : " + mBridgeIds0.toString());
                if(MintegralAdapter.this.u && MintegralAdapter.this.e != null) {
                    MintegralAdapter.this.e.a(MintegralAdapter.this.m);
                }
                try {
                    if(MintegralAdapter.this.J != null && MintegralAdapter.this.J.j() != null) {
                        for(int v = 0; v < MintegralAdapter.this.J.j().size(); ++v) {
                            String s = (String)MintegralAdapter.this.J.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "MintegralAdapter onAdImpression url : " + s);
                                E.g().d().a(MintegralAdapter.this.L, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            public void onEndcardShow(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onEndcardShow : " + mBridgeIds0.toString());
            }

            public void onLoadCampaignSuccess(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onLoadCampaignSuccess : " + mBridgeIds0.toString());
            }

            public void onResourceLoadFail(MBridgeIds mBridgeIds0, String s) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onResourceLoadFail errorMsg: " + s + " " + mBridgeIds0.toString());
                MintegralAdapter.this.a(false);
                if(MintegralAdapter.this.u && MintegralAdapter.this.e != null) {
                    MintegralAdapter.this.e.d(MintegralAdapter.this.m);
                }
            }

            public void onResourceLoadSuccess(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onResourceLoadSuccess : " + mBridgeIds0.toString());
                MintegralAdapter.this.a(false);
                if(MintegralAdapter.this.u && MintegralAdapter.this.e != null) {
                    MintegralAdapter.this.e.b(MintegralAdapter.this.m);
                }
            }

            public void onShowFail(MBridgeIds mBridgeIds0, String s) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onShowFail errorMsg: " + s + " " + mBridgeIds0.toString());
                if(MintegralAdapter.this.u && MintegralAdapter.this.e != null) {
                    MintegralAdapter.this.e.c(MintegralAdapter.this.m);
                }
            }

            public void onVideoComplete(MBridgeIds mBridgeIds0) {
                b.a(Thread.currentThread(), "MintegralAdapter IV onVideoComplete : " + mBridgeIds0.toString());
            }
        };
    }

    private void a(Context context0, Campaign campaign0, AdPopcornSSPNativeAd adPopcornSSPNativeAd0, int v) {
        TextView textView3;
        TextView textView2;
        TextView textView1;
        TextView textView0;
        b.c(Thread.currentThread(), "MintegralAdapter inflateAd");
        MBAdChoice mBAdChoice0 = null;
        this.y = null;
        this.z = null;
        ArrayList arrayList0 = new ArrayList();
        MBMediaView mBMediaView0 = adPopcornSSPNativeAd0.getMintegralViewBinder().mbMediaViewId == 0 ? null : ((MBMediaView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().mbMediaViewId));
        if(adPopcornSSPNativeAd0.getMintegralViewBinder().titleViewId == 0) {
            textView0 = null;
        }
        else {
            textView0 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().titleViewId);
            arrayList0.add(textView0);
        }
        if(adPopcornSSPNativeAd0.getMintegralViewBinder().descViewId == 0) {
            textView1 = null;
        }
        else {
            textView1 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().descViewId);
            arrayList0.add(textView1);
        }
        if(adPopcornSSPNativeAd0.getMintegralViewBinder().ratingViewId == 0) {
            textView2 = null;
        }
        else {
            textView2 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().ratingViewId);
            arrayList0.add(textView2);
        }
        if(adPopcornSSPNativeAd0.getMintegralViewBinder().iconViewId != 0) {
            ImageView imageView0 = (ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().iconViewId);
            this.z = imageView0;
            arrayList0.add(imageView0);
        }
        if(adPopcornSSPNativeAd0.getMintegralViewBinder().adCallViewId == 0) {
            textView3 = null;
        }
        else {
            textView3 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().adCallViewId);
            arrayList0.add(textView3);
        }
        if(adPopcornSSPNativeAd0.getMintegralViewBinder().adChoiceViewId != 0) {
            mBAdChoice0 = (MBAdChoice)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().adChoiceViewId);
            arrayList0.add(mBAdChoice0);
        }
        if(adPopcornSSPNativeAd0.getMintegralViewBinder().mainImageViewId != 0) {
            ImageView imageView1 = (ImageView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().mainImageViewId);
            this.y = imageView1;
            arrayList0.add(imageView1);
        }
        if(mBAdChoice0 != null) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)((View)mBAdChoice0).getLayoutParams();
            relativeLayout$LayoutParams0.height = campaign0.getAdchoiceSizeHeight();
            relativeLayout$LayoutParams0.width = campaign0.getAdchoiceSizeWidth();
            ((View)mBAdChoice0).setLayoutParams(relativeLayout$LayoutParams0);
            mBAdChoice0.setCampaign(campaign0);
        }
        if(mBMediaView0 != null) {
            mBMediaView0.setNativeAd(campaign0);
        }
        if(textView0 != null) {
            textView0.setText(campaign0.getAppName());
        }
        if(textView1 != null) {
            textView1.setText(campaign0.getAppDesc());
        }
        if(textView2 != null) {
            textView2.setText(campaign0.getRating() + "");
        }
        if(textView3 != null) {
            textView3.setText(campaign0.getAdCall());
        }
        if(this.y == null || campaign0.getImageUrl() == null) {
            this.y.setVisibility(4);
        }
        else {
            n.a(context0, campaign0.getImageUrl(), this.y, this.y.getWidth(), this.y.getHeight(), new d() {
                final MintegralAdapter a;

                @Override  // com.igaworks.ssp.n$d
                public void a(Bitmap bitmap0) {
                    if(bitmap0 != null) {
                        MintegralAdapter.this.y.setImageBitmap(bitmap0);
                    }
                }
            });
        }
        if(this.z == null || campaign0.getIconUrl() == null) {
            this.z.setVisibility(4);
        }
        else {
            n.a(context0, campaign0.getIconUrl(), this.z, this.z.getWidth(), this.z.getHeight(), new d() {
                final MintegralAdapter a;

                @Override  // com.igaworks.ssp.n$d
                public void a(Bitmap bitmap0) {
                    if(bitmap0 != null) {
                        MintegralAdapter.this.z.setImageBitmap(bitmap0);
                    }
                }
            });
        }
        if(this.G) {
            this.B.registerView(adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().nativeAdViewId), arrayList0, campaign0);
            return;
        }
        this.A.registerView(adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().nativeAdViewId), arrayList0, campaign0);
    }

    private void a(boolean z) {
        try {
            if(z) {
                this.o = false;
                Handler handler0 = this.q;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.r);
                }
            }
            else {
                this.p = false;
                Handler handler1 = this.q;
                if(handler1 != null) {
                    handler1.removeCallbacks(this.s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkValidMediation() {
        this.C = new SDKInitStatusListener() {
            final MintegralAdapter a;

            public void onInitFail(String s) {
            }

            public void onInitSuccess() {
            }
        };
        b.a(Thread.currentThread(), "MintegralAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        MBBannerView mBBannerView0 = this.w;
        if(mBBannerView0 != null) {
            mBBannerView0.release();
            this.stopBannerTimer();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
        try {
            this.u = false;
            this.a(false);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyModalAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyNativeAd() {
        MBNativeHandler mBNativeHandler0 = this.A;
        if(mBNativeHandler0 != null) {
            mBNativeHandler0.release();
        }
        MBBidNativeHandler mBBidNativeHandler0 = this.B;
        if(mBBidNativeHandler0 != null) {
            mBBidNativeHandler0.bidRelease();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
        try {
            this.t = false;
            this.a(true);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroySplashAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getBiddingToken(Context context0) {
        return BidManager.getBuyerUid(context0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        try {
            b.a(Thread.currentThread(), "MintegralAdapter initializeSDK");
            MBridgeSDKImpl mBridgeSDKImpl0 = MBridgeSDKFactory.getMBridgeSDK();
            Map map0 = ((MBridgeSDK)mBridgeSDKImpl0).getMBConfigurationMap(p00.a("mintegral_app_id"), p00.a("mintegral_app_key"));
            if(((MBridgeSDK)mBridgeSDKImpl0).getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL) {
                ((MBridgeSDK)mBridgeSDKImpl0).initAsync(map0, context0, new SDKInitStatusListener() {
                    final MintegralAdapter b;

                    public void onInitFail(String s) {
                        SdkInitListener sdkInitListener0 = sdkInitListener0;
                        if(sdkInitListener0 != null) {
                            sdkInitListener0.onInitializationFinished();
                        }
                    }

                    public void onInitSuccess() {
                        SdkInitListener sdkInitListener0 = sdkInitListener0;
                        if(sdkInitListener0 != null) {
                            sdkInitListener0.onInitializationFinished();
                        }
                    }
                });
                return;
            }
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            }
            return;
        }
        catch(NoClassDefFoundError unused_ex) {
        }
        catch(NoSuchMethodError unused_ex) {
            goto label_14;
        }
        catch(Exception unused_ex) {
            goto label_17;
        }
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
            return;
        label_14:
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            label_17:
                if(sdkInitListener0 != null) {
                    sdkInitListener0.onInitializationFinished();
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        MBBannerView mBBannerView0 = this.w;
        if(mBBannerView0 != null) {
            mBBannerView0.release();
            this.stopBannerTimer();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        T t0 = this.b;
        if(t0 != null) {
            t0.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
        String s2;
        String s1;
        String s3;
        b.a(Thread.currentThread(), "MintegralAdapter.loadInterstitialVideoAd()");
        this.m = v;
        try {
            this.L = context0;
            this.u = true;
            this.p = true;
            if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.q == null) {
                    this.q = new Handler();
                }
                if(this.s == null) {
                    this.s = new Runnable() {
                        final MintegralAdapter a;

                        @Override
                        public void run() {
                            if(MintegralAdapter.this.p) {
                                b.b(Thread.currentThread(), "Time out in : Mintegral");
                                MintegralAdapter.this.a(false);
                                if(MintegralAdapter.this.u && MintegralAdapter.this.e != null) {
                                    MintegralAdapter.this.e.d(MintegralAdapter.this.m);
                                }
                            }
                        }
                    };
                }
                this.q.postDelayed(this.s, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
            }
            this.G = z;
            if(z) {
                if(d00 == null) {
                    throw new NullPointerException();
                }
                if(d00.b() == null || d00.b().get(0) == null) {
                    s1 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                    s2 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                    s3 = s1;
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.J = g0;
                    String s = g0.k();
                    if(s != null && s.length() > 0) {
                        s2 = p.a(s, "mintegral_placement_id");
                        s3 = p.a(s, "mintegral_unit_id");
                    }
                    else {
                        s1 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                        s2 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                        s3 = s1;
                    }
                }
            }
            else {
                String s4 = ((a0)d00.e().a().get(v)).a("MintegralAppId");
                String s5 = ((a0)d00.e().a().get(v)).a("MintegralAppKey");
                String s6 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                s2 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                MBridgeSDKImpl mBridgeSDKImpl0 = MBridgeSDKFactory.getMBridgeSDK();
                Map map0 = ((MBridgeSDK)mBridgeSDKImpl0).getMBConfigurationMap(s4, s5);
                if(((MBridgeSDK)mBridgeSDKImpl0).getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL) {
                    b.a(Thread.currentThread(), "MintegralAdapter call init");
                    ((MBridgeSDK)mBridgeSDKImpl0).init(map0, context0);
                }
                s3 = s6;
            }
            if(this.G) {
                if(this.l == null) {
                    b.a(Thread.currentThread(), "MintegralAdapter bid create MBBidNewInterstitialHandler");
                    this.l = new MBBidNewInterstitialHandler(context0, s2, s3);
                }
                this.l.setInterstitialVideoListener(this.N);
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler0 = this.l;
                if(mBBidNewInterstitialHandler0 == null) {
                    this.a(false);
                    if(this.u) {
                        V v2 = this.e;
                        if(v2 != null) {
                            v2.d(this.m);
                            return;
                        }
                    }
                }
                else {
                    if(!mBBidNewInterstitialHandler0.isBidReady()) {
                        b.a(Thread.currentThread(), "MintegralAdapter loadInterstitialVideoAd auto load");
                        this.l.loadFromBid(this.J.y());
                        return;
                    }
                    b.a(Thread.currentThread(), "MintegralAdapter bid loadInterstitialVideoAd already ready");
                    this.a(false);
                    if(this.u) {
                        V v1 = this.e;
                        if(v1 != null) {
                            v1.b(this.m);
                            return;
                        }
                    }
                }
            }
            else {
                if(this.k == null) {
                    b.a(Thread.currentThread(), "MintegralAdapter create MBNewInterstitialHandler");
                    this.k = new MBNewInterstitialHandler(context0, s2, s3);
                }
                this.k.setInterstitialVideoListener(this.N);
                MBNewInterstitialHandler mBNewInterstitialHandler0 = this.k;
                if(mBNewInterstitialHandler0 == null) {
                    this.a(false);
                    if(this.u) {
                        V v4 = this.e;
                        if(v4 != null) {
                            v4.d(this.m);
                            return;
                        }
                    }
                }
                else {
                    if(!mBNewInterstitialHandler0.isReady()) {
                        b.a(Thread.currentThread(), "MintegralAdapter loadInterstitialVideoAd auto load");
                        this.k.load();
                        return;
                    }
                    b.a(Thread.currentThread(), "MintegralAdapter loadInterstitialVideoAd already ready");
                    this.a(false);
                    if(this.u) {
                        V v3 = this.e;
                        if(v3 != null) {
                            v3.b(this.m);
                            return;
                        }
                    }
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        this.a(false);
        b.a(Thread.currentThread(), exception0);
        if(this.u) {
            V v5 = this.e;
            if(v5 != null) {
                v5.d(this.m);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
        b0 b00 = this.h;
        if(b00 != null) {
            b00.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
        String s2;
        String s1;
        try {
            if(adPopcornSSPNativeAd0.getMintegralViewBinder() == null) {
                b.c(Thread.currentThread(), "MintegralAdapter viewBinder is null");
                c0 c00 = this.c;
                if(c00 != null) {
                    c00.a(v, 3);
                    return;
                }
                return;
            }
            this.L = context0;
            this.G = z;
            if(z) {
                if(d00 == null) {
                    throw new NullPointerException();
                }
                if(d00.b() == null || d00.b().get(0) == null) {
                    s2 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                    s1 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.K = g0;
                    String s = g0.k();
                    if(s == null || s.length() <= 0) {
                        s2 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                        s1 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                    }
                    else {
                        s1 = p.a(s, "mintegral_placement_id");
                        s2 = p.a(s, "mintegral_unit_id");
                    }
                }
            }
            else {
                String s3 = ((a0)d00.e().a().get(v)).a("MintegralAppId");
                String s4 = ((a0)d00.e().a().get(v)).a("MintegralAppKey");
                String s5 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                s1 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                MBridgeSDKImpl mBridgeSDKImpl0 = MBridgeSDKFactory.getMBridgeSDK();
                Map map0 = ((MBridgeSDK)mBridgeSDKImpl0).getMBConfigurationMap(s3, s4);
                if(((MBridgeSDK)mBridgeSDKImpl0).getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL) {
                    b.a(Thread.currentThread(), "MintegralAdapter call init");
                    ((MBridgeSDK)mBridgeSDKImpl0).init(map0, context0);
                }
                s2 = s5;
            }
            if(this.G) {
                Map map1 = MBBidNativeHandler.getNativeProperties(s1, s2);
                map1.put("ad_num", 1);
                if(this.B == null) {
                    this.B = new MBBidNativeHandler(map1, context0);
                }
                this.B.setAdListener(new NativeListener.NativeAdListener() {
                    final MintegralAdapter d;

                    public void onAdClick(Campaign campaign0) {
                        b.c(Thread.currentThread(), "Mintegral Native bid ad clicked!");
                        if(MintegralAdapter.this.c != null) {
                            MintegralAdapter.this.c.onClicked();
                        }
                        try {
                            if(MintegralAdapter.this.K != null && MintegralAdapter.this.K.b() != null) {
                                for(int v = 0; v < MintegralAdapter.this.K.b().size(); ++v) {
                                    String s = (String)MintegralAdapter.this.K.b().get(v);
                                    if(s0.a(s)) {
                                        b.c(Thread.currentThread(), "MintegralAdapter onAdClick url : " + s);
                                        E.g().d().a(MintegralAdapter.this.L, e.i, s);
                                    }
                                }
                            }
                        }
                        catch(Exception exception0) {
                            exception0.printStackTrace();
                        }
                    }

                    public void onAdFramesLoaded(List list0) {
                    }

                    public void onAdLoadError(String s) {
                        b.c(Thread.currentThread(), "Mintegral Native bid ad onAdLoadError : " + s);
                        if(MintegralAdapter.this.c != null) {
                            MintegralAdapter.this.c.a(v, 2);
                        }
                    }

                    public void onAdLoaded(List list0, int v) {
                        b.c(Thread.currentThread(), "Mintegral Native bid ad loaded!");
                        try {
                            if(list0 != null && list0.size() > 0) {
                                Campaign campaign0 = (Campaign)list0.get(0);
                                MintegralAdapter.this.a(context0, campaign0, adPopcornSSPNativeAd0, v);
                                if(MintegralAdapter.this.c != null) {
                                    MintegralAdapter.this.c.a(v);
                                }
                                if(MintegralAdapter.this.x != null) {
                                    MintegralAdapter.this.x.setVisibility(0);
                                    return;
                                }
                            }
                            else if(MintegralAdapter.this.c != null) {
                                MintegralAdapter.this.c.a(v, 2);
                                return;
                            }
                            return;
                        }
                        catch(Exception exception0) {
                        }
                        exception0.printStackTrace();
                        if(MintegralAdapter.this.c != null) {
                            MintegralAdapter.this.c.a(v, 1);
                        }
                    }

                    public void onLoggingImpression(int v) {
                        b.c(Thread.currentThread(), "Mintegral Native bid ad impression logged!");
                        if(MintegralAdapter.this.c != null) {
                            MintegralAdapter.this.c.onImpression();
                        }
                        try {
                            if(MintegralAdapter.this.K != null && MintegralAdapter.this.K.j() != null) {
                                for(int v1 = 0; v1 < MintegralAdapter.this.K.j().size(); ++v1) {
                                    String s = (String)MintegralAdapter.this.K.j().get(v1);
                                    if(s0.a(s)) {
                                        b.c(Thread.currentThread(), "MintegralAdapter onAdImpression url : " + s);
                                        E.g().d().a(MintegralAdapter.this.L, e.i, s);
                                    }
                                }
                            }
                        }
                        catch(Exception exception0) {
                            exception0.printStackTrace();
                        }
                    }
                });
                this.B.bidLoad(this.K.y());
            }
            else {
                Map map2 = MBNativeHandler.getNativeProperties(s1, s2);
                map2.put("ad_num", 1);
                if(this.A == null) {
                    this.A = new MBNativeHandler(map2, context0);
                }
                this.A.setAdListener(new NativeListener.NativeAdListener() {
                    final MintegralAdapter d;

                    public void onAdClick(Campaign campaign0) {
                        b.c(Thread.currentThread(), "Mintegral Native ad clicked!");
                        if(MintegralAdapter.this.c != null) {
                            MintegralAdapter.this.c.onClicked();
                        }
                    }

                    public void onAdFramesLoaded(List list0) {
                    }

                    public void onAdLoadError(String s) {
                        b.c(Thread.currentThread(), "Mintegral Native ad onAdLoadError : " + s);
                        if(MintegralAdapter.this.c != null) {
                            MintegralAdapter.this.c.a(v, 2);
                        }
                    }

                    public void onAdLoaded(List list0, int v) {
                        b.c(Thread.currentThread(), "Mintegral Native ad loaded!");
                        try {
                            if(list0 == null || list0.size() <= 0) {
                                if(MintegralAdapter.this.c != null) {
                                    MintegralAdapter.this.c.a(v, 2);
                                }
                                return;
                            }
                            Campaign campaign0 = (Campaign)list0.get(0);
                            MintegralAdapter.this.a(context0, campaign0, adPopcornSSPNativeAd0, v);
                            if(MintegralAdapter.this.c != null) {
                                MintegralAdapter.this.c.a(v);
                            }
                            if(MintegralAdapter.this.x != null) {
                                MintegralAdapter.this.x.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        catch(Exception exception0) {
                        }
                        exception0.printStackTrace();
                        if(MintegralAdapter.this.c != null) {
                            MintegralAdapter.this.c.a(v, 1);
                        }
                    }

                    public void onLoggingImpression(int v) {
                        b.c(Thread.currentThread(), "Mintegral Native ad impression logged!");
                        if(MintegralAdapter.this.c != null) {
                            MintegralAdapter.this.c.onImpression();
                        }
                    }
                });
                this.A.load();
            }
            if(adPopcornSSPNativeAd0.getMintegralViewBinder().nativeAdViewId != 0) {
                this.x = adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getMintegralViewBinder().nativeAdViewId);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        c0 c01 = this.c;
        if(c01 != null) {
            c01.a(v, 0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        g0 g00 = this.g;
        if(g00 != null) {
            g00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
        String s2;
        String s1;
        String s3;
        b.a(Thread.currentThread(), "MintegralAdapter.loadRewardVideoAd()");
        this.n = v;
        try {
            this.L = context0;
            this.t = true;
            this.o = true;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.q == null) {
                    this.q = new Handler();
                }
                if(this.r == null) {
                    this.r = new Runnable() {
                        final MintegralAdapter a;

                        @Override
                        public void run() {
                            if(MintegralAdapter.this.o) {
                                b.b(Thread.currentThread(), "Time out in : Mintegral");
                                MintegralAdapter.this.a(true);
                                if(MintegralAdapter.this.t && MintegralAdapter.this.d != null) {
                                    MintegralAdapter.this.d.d(MintegralAdapter.this.n);
                                }
                            }
                        }
                    };
                }
                this.q.postDelayed(this.r, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            this.G = z;
            if(z) {
                if(d00 == null) {
                    throw new NullPointerException();
                }
                if(d00.b() == null || d00.b().get(0) == null) {
                    s1 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                    s2 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                    s3 = s1;
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.I = g0;
                    String s = g0.k();
                    if(s != null && s.length() > 0) {
                        s2 = p.a(s, "mintegral_placement_id");
                        s3 = p.a(s, "mintegral_unit_id");
                    }
                    else {
                        s1 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                        s2 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                        s3 = s1;
                    }
                }
            }
            else {
                String s4 = ((a0)d00.e().a().get(v)).a("MintegralAppId");
                String s5 = ((a0)d00.e().a().get(v)).a("MintegralAppKey");
                String s6 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                s2 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                MBridgeSDKImpl mBridgeSDKImpl0 = MBridgeSDKFactory.getMBridgeSDK();
                Map map0 = ((MBridgeSDK)mBridgeSDKImpl0).getMBConfigurationMap(s4, s5);
                if(((MBridgeSDK)mBridgeSDKImpl0).getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL) {
                    b.a(Thread.currentThread(), "MintegralAdapter call init");
                    ((MBridgeSDK)mBridgeSDKImpl0).init(map0, context0);
                }
                s3 = s6;
            }
            if(this.G) {
                if(this.j == null) {
                    b.a(Thread.currentThread(), "MintegralAdapter create MBBidRewardVideoHandler isInappBiddingMode");
                    this.j = new MBBidRewardVideoHandler(((Activity)context0), s2, s3);
                }
                this.j.setRewardVideoListener(((com.mbridge.msdk.video.bt.module.orglistener.g)this.M));
                MBBidRewardVideoHandler mBBidRewardVideoHandler0 = this.j;
                if(mBBidRewardVideoHandler0 == null) {
                    this.a(true);
                    if(this.t) {
                        l0 l01 = this.d;
                        if(l01 != null) {
                            l01.d(this.n);
                            return;
                        }
                    }
                }
                else {
                    if(!mBBidRewardVideoHandler0.isBidReady()) {
                        b.a(Thread.currentThread(), "MintegralAdapter loadRewardVideoAd auto load isInappBiddingMode");
                        this.j.loadFromBid(this.I.y());
                        return;
                    }
                    b.a(Thread.currentThread(), "MintegralAdapter loadRewardVideoAd already ready isInappBiddingMode");
                    this.a(true);
                    if(this.t) {
                        l0 l00 = this.d;
                        if(l00 != null) {
                            l00.b(this.n);
                            return;
                        }
                    }
                }
            }
            else {
                if(this.i == null) {
                    b.a(Thread.currentThread(), "MintegralAdapter create MBRewardVideoHandler");
                    this.i = new MBRewardVideoHandler(((Activity)context0), s2, s3);
                }
                this.i.setRewardVideoListener(((com.mbridge.msdk.video.bt.module.orglistener.g)this.M));
                b.a(Thread.currentThread(), "MintegralAdapter sdk status : " + MBridgeSDKFactory.getMBridgeSDK().getStatus());
                MBRewardVideoHandler mBRewardVideoHandler0 = this.i;
                if(mBRewardVideoHandler0 == null) {
                    this.a(true);
                    if(this.t) {
                        l0 l03 = this.d;
                        if(l03 != null) {
                            l03.d(this.n);
                            return;
                        label_89:
                            if(this.t) {
                                goto label_90;
                            }
                            goto label_93;
                        }
                    }
                }
                else {
                    if(!mBRewardVideoHandler0.isReady()) {
                        b.a(Thread.currentThread(), "MintegralAdapter loadRewardVideoAd auto load");
                        this.i.load();
                        return;
                    }
                    b.a(Thread.currentThread(), "MintegralAdapter loadRewardVideoAd already ready");
                    this.a(true);
                    if(this.t) {
                        l0 l02 = this.d;
                        if(l02 != null) {
                            l02.b(this.n);
                            return;
                        }
                    }
                }
            }
            return;
        }
        catch(Exception exception0) {
            goto label_89;
        }
    label_90:
        l0 l04 = this.d;
        if(l04 != null) {
            l04.d(v);
        }
    label_93:
        this.a(true);
        b.a(Thread.currentThread(), exception0);
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadSplashAd(Context context0, d0 d00, int v, AdPopcornSSPSplashAd adPopcornSSPSplashAd0) {
        r0 r00 = this.f;
        if(r00 != null) {
            r00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onPauseBanner() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onResumeBanner() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseRewardVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void resumeInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void resumeInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void resumeRewardVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setBannerMediationAdapterEventListener(C c0) {
        this.a = c0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setCustomExtras(HashMap hashMap0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialMediationAdapterEventListener(T t0) {
        this.b = t0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialVideoMediationAdapterEventListener(V v0) {
        this.e = v0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setModalAdMediationAdapterEventListener(b0 b00) {
        this.h = b00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setNativeMediationAdapterEventListener(c0 c00) {
        this.c = c00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setReactNativeMediationAdapterEventListener(g0 g00) {
        this.g = g00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setRewardVideoMediationAdapterEventListener(l0 l00) {
        this.d = l00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setSplashMediationAdapterEventListener(r0 r00) {
        this.f = r00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        T t0 = this.b;
        if(t0 != null) {
            t0.c(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            b.a(Thread.currentThread(), "MintegralAdapter.showInterstitialVideoAd() : " + z);
            if(z) {
                if(this.l != null && this.l.isBidReady()) {
                    this.l.showFromBid();
                    return;
                }
                if(this.u) {
                    V v1 = this.e;
                    if(v1 != null) {
                        v1.c(v);
                    }
                }
            }
            else {
                if(this.k != null && this.k.isReady()) {
                    this.k.show();
                    return;
                }
                if(this.u) {
                    V v2 = this.e;
                    if(v2 != null) {
                        v2.c(v);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.u) {
                V v3 = this.e;
                if(v3 != null) {
                    v3.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            b.a(Thread.currentThread(), "MintegralAdapter.showRewardVideoAd()");
            if(z) {
                if(this.j != null && this.j.isBidReady()) {
                    this.j.showFromBid();
                    return;
                }
                if(this.t) {
                    l0 l00 = this.d;
                    if(l00 != null) {
                        l00.c(v);
                    }
                }
            }
            else {
                if(this.i != null && this.i.isReady()) {
                    this.i.show();
                    return;
                }
                if(this.t) {
                    l0 l01 = this.d;
                    if(l01 != null) {
                        l01.c(v);
                    }
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.t) {
                l0 l02 = this.d;
                if(l02 != null) {
                    l02.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        String s4;
        String s3;
        try {
            this.L = context0;
            this.v = true;
            this.F = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.D == null) {
                    this.D = new Handler();
                }
                if(this.E == null) {
                    this.E = new Runnable() {
                        final MintegralAdapter a;

                        @Override
                        public void run() {
                            if(MintegralAdapter.this.v) {
                                b.b(Thread.currentThread(), "Time out in : Mintegral");
                                if(MintegralAdapter.this.a != null) {
                                    MintegralAdapter.this.a.a(MintegralAdapter.this.F);
                                }
                            }
                        }
                    };
                }
                this.D.postDelayed(this.E, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            this.G = z;
            b.a(Thread.currentThread(), "MintegralAdapter.startBannerAd()");
            if(!this.G) {
                String s = ((a0)d00.e().a().get(v)).a("MintegralAppId");
                String s1 = ((a0)d00.e().a().get(v)).a("MintegralAppKey");
                String s2 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                s3 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                MBridgeSDKImpl mBridgeSDKImpl0 = MBridgeSDKFactory.getMBridgeSDK();
                Map map0 = ((MBridgeSDK)mBridgeSDKImpl0).getMBConfigurationMap(s, s1);
                if(((MBridgeSDK)mBridgeSDKImpl0).getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL) {
                    b.a(Thread.currentThread(), "MintegralAdapter call init");
                    ((MBridgeSDK)mBridgeSDKImpl0).init(map0, context0);
                }
                s4 = s2;
            }
            else if(d00 == null) {
                throw new NullPointerException();
            }
            else if(d00.b() == null || d00.b().get(0) == null) {
                s4 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                s3 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
            }
            else {
                g g0 = (g)d00.b().get(0);
                this.H = g0;
                String s5 = g0.k();
                if(s5 == null || s5.length() <= 0) {
                    s4 = ((a0)d00.e().a().get(v)).a("MintegralUnitId");
                    s3 = ((a0)d00.e().a().get(v)).a("MintegralPlacementId");
                }
                else {
                    s3 = p.a(s5, "mintegral_placement_id");
                    s4 = p.a(s5, "mintegral_unit_id");
                }
            }
            if(this.w == null) {
                this.w = new MBBannerView(context0);
            }
            if(adSize0 == AdSize.BANNER_320x50) {
                this.w.init(new BannerSize(4, 320, 50), s3, s4);
            }
            else if(adSize0 == AdSize.BANNER_320x100) {
                this.w.init(new BannerSize(1, 320, 100), s3, s4);
            }
            else {
                if(adSize0 != AdSize.BANNER_300x250 && adSize0 != AdSize.BANNER_ADAPTIVE_SIZE) {
                    b.a(Thread.currentThread(), "Mintegral size support error");
                    C c0 = this.a;
                    if(c0 != null) {
                        c0.a(v);
                    }
                    return;
                }
                this.w.init(new BannerSize(2, 300, 0xFA), s3, s4);
            }
            this.w.setBannerAdListener(new BannerAdListener() {
                final MintegralAdapter b;

                public void closeFullScreen(MBridgeIds mBridgeIds0) {
                }

                public void onClick(MBridgeIds mBridgeIds0) {
                    b.b(Thread.currentThread(), "MintegralAdapter banner onClick");
                    if(MintegralAdapter.this.a != null) {
                        MintegralAdapter.this.a.a();
                    }
                    try {
                        if(MintegralAdapter.this.H != null && MintegralAdapter.this.H.b() != null) {
                            for(int v = 0; v < MintegralAdapter.this.H.b().size(); ++v) {
                                String s = (String)MintegralAdapter.this.H.b().get(v);
                                if(s0.a(s)) {
                                    b.c(Thread.currentThread(), "MintegralAdapter onAdClicked url : " + s);
                                    E.g().d().a(MintegralAdapter.this.L, e.i, s);
                                }
                            }
                        }
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }

                public void onCloseBanner(MBridgeIds mBridgeIds0) {
                }

                public void onLeaveApp(MBridgeIds mBridgeIds0) {
                }

                public void onLoadFailed(MBridgeIds mBridgeIds0, String s) {
                    b.b(Thread.currentThread(), "Mintegral failed to load in Mintegral, error msg : " + s);
                    try {
                        MintegralAdapter.this.stopBannerTimer();
                        if(MintegralAdapter.this.a != null) {
                            MintegralAdapter.this.a.a(MintegralAdapter.this.F);
                        }
                    }
                    catch(Exception unused_ex) {
                        if(MintegralAdapter.this.a != null) {
                            MintegralAdapter.this.a.a(MintegralAdapter.this.F);
                        }
                    }
                }

                public void onLoadSuccessed(MBridgeIds mBridgeIds0) {
                    try {
                        adPopcornSSPBannerAd0.removeAllViewsInLayout();
                        adPopcornSSPBannerAd0.removeAllViews();
                        adPopcornSSPBannerAd0.addView(((View)MintegralAdapter.this.w));
                        MintegralAdapter.this.stopBannerTimer();
                        if(MintegralAdapter.this.a != null) {
                            MintegralAdapter.this.a.b(MintegralAdapter.this.F);
                        }
                        if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                            adPopcornSSPBannerAd0.setVisibility(4);
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                final com.igaworks.ssp.common.adapter.MintegralAdapter.3 a;

                                @Override
                                public void run() {
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                    try {
                                        try {
                                            ((View)MintegralAdapter.this.w).buildDrawingCache();
                                            Bitmap bitmap0 = ((View)MintegralAdapter.this.w).getDrawingCache();
                                            if(bitmap0 != null) {
                                                int v = bitmap0.getPixel(1, 1);
                                                com.igaworks.ssp.common.adapter.MintegralAdapter.3.this.a.setBackgroundColor(v);
                                            }
                                            goto label_17;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        b.a(Thread.currentThread(), exception0);
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.MintegralAdapter.3.this.a;
                                        if(adPopcornSSPBannerAd0 != null) {
                                            goto label_10;
                                        }
                                        return;
                                    }
                                    catch(Throwable throwable0) {
                                        goto label_13;
                                    }
                                label_10:
                                    adPopcornSSPBannerAd0.setVisibility(0);
                                    return;
                                label_13:
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.MintegralAdapter.3.this.a;
                                    if(adPopcornSSPBannerAd1 != null) {
                                        adPopcornSSPBannerAd1.setVisibility(0);
                                    }
                                    throw throwable0;
                                label_17:
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.MintegralAdapter.3.this.a;
                                    if(adPopcornSSPBannerAd0 != null) {
                                        adPopcornSSPBannerAd0.setVisibility(0);
                                    }
                                }
                            }, 350L);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    b.a(Thread.currentThread(), exception0);
                    MintegralAdapter.this.stopBannerTimer();
                    if(MintegralAdapter.this.a != null) {
                        MintegralAdapter.this.a.a(MintegralAdapter.this.F);
                    }
                }

                public void onLogImpression(MBridgeIds mBridgeIds0) {
                    try {
                        if(MintegralAdapter.this.H != null && MintegralAdapter.this.H.j() != null) {
                            for(int v = 0; v < MintegralAdapter.this.H.j().size(); ++v) {
                                String s = (String)MintegralAdapter.this.H.j().get(v);
                                if(s0.a(s)) {
                                    b.c(Thread.currentThread(), "MintegralAdapter onAdImpression url : " + s);
                                    E.g().d().a(MintegralAdapter.this.L, e.i, s);
                                }
                            }
                        }
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }

                public void showFullScreen(MBridgeIds mBridgeIds0) {
                }
            });
            if(z) {
                this.w.loadFromBid(this.H.y());
                return;
            }
            this.w.load();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        C c1 = this.a;
        if(c1 != null) {
            c1.a(v);
        }
    }

    public void stopBannerTimer() {
        try {
            this.v = false;
            Handler handler0 = this.D;
            if(handler0 != null) {
                handler0.removeCallbacks(this.E);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

