package com.igaworks.ssp.common.adapter;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.igaworks.ssp.AdPopcornSSPUserProperties;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.C;
import com.igaworks.ssp.E;
import com.igaworks.ssp.J;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.T;
import com.igaworks.ssp.V;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.c0;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.g0;
import com.igaworks.ssp.i;
import com.igaworks.ssp.l0;
import com.igaworks.ssp.p0;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.custom.AdPopcornSSPReactNativeAd;
import com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd;
import com.igaworks.ssp.part.interstitial.dialog.AdPopcornSSPCustomInterstitialDialog;
import com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd;
import com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd;
import com.igaworks.ssp.part.splash.AdPopcornSSPSplashAd;
import com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.r0;
import com.igaworks.ssp.s;
import com.naver.gfpsdk.AdEventListener;
import com.naver.gfpsdk.AdParam.Builder;
import com.naver.gfpsdk.AdParam;
import com.naver.gfpsdk.BannerAdListener;
import com.naver.gfpsdk.BannerViewLayoutType;
import com.naver.gfpsdk.GenderType;
import com.naver.gfpsdk.GfpAdChoicesView;
import com.naver.gfpsdk.GfpAdLoader.Builder;
import com.naver.gfpsdk.GfpAdLoader;
import com.naver.gfpsdk.GfpBannerAd.OnBannerAdViewLoadedListener;
import com.naver.gfpsdk.GfpBannerAd;
import com.naver.gfpsdk.GfpBannerAdOptions.Builder;
import com.naver.gfpsdk.GfpBannerAdOptions;
import com.naver.gfpsdk.GfpBannerAdSize;
import com.naver.gfpsdk.GfpBannerAdView;
import com.naver.gfpsdk.GfpError;
import com.naver.gfpsdk.GfpMediaView;
import com.naver.gfpsdk.GfpNativeAd.OnNativeAdLoadedListener;
import com.naver.gfpsdk.GfpNativeAd;
import com.naver.gfpsdk.GfpNativeAdOptions.Builder;
import com.naver.gfpsdk.GfpNativeAdOptions;
import com.naver.gfpsdk.GfpNativeAdView;
import com.naver.gfpsdk.GfpNativeSimpleAd.OnNativeSimpleAdLoadedListener;
import com.naver.gfpsdk.GfpNativeSimpleAd;
import com.naver.gfpsdk.GfpNativeSimpleAdOptions.Builder;
import com.naver.gfpsdk.GfpNativeSimpleAdOptions;
import com.naver.gfpsdk.GfpNativeSimpleAdView;
import com.naver.gfpsdk.GfpResponseInfo;
import com.naver.gfpsdk.GfpSdk.InitializationCallback;
import com.naver.gfpsdk.GfpSdk.InitializationResult;
import com.naver.gfpsdk.GfpSdk;
import com.naver.gfpsdk.properties.UserPropertiesBuilder;
import java.util.HashMap;
import java.util.Map;

public class NAMAdapter implements BaseMediationAdapter {
    private GfpBannerAdView A;
    private GfpBannerAdView B;
    private GfpBannerAdView C;
    private GfpAdLoader D;
    private AdPopcornSSPNativeAd E;
    private GfpNativeAdView F;
    private GfpNativeSimpleAdView G;
    private boolean H;
    private boolean I;
    private boolean J;
    private HashMap K;
    private AdPopcornSSPReactNativeAd L;
    private boolean M;
    private Context N;
    private boolean O;
    private GfpMediaView P;
    private GfpAdChoicesView Q;
    private ImageView R;
    private TextView S;
    private TextView T;
    private TextView U;
    private TextView V;
    private Button W;
    private final BannerAdListener X;
    private final BannerAdListener Y;
    private final GfpNativeSimpleAd.OnNativeSimpleAdLoadedListener Z;
    private C a;
    private final GfpNativeAd.OnNativeAdLoadedListener a0;
    private T b;
    private final GfpBannerAd.OnBannerAdViewLoadedListener b0;
    private c0 c;
    private final AdEventListener c0;
    private l0 d;
    private GfpNativeSimpleAd.OnNativeSimpleAdLoadedListener d0;
    private V e;
    private AdEventListener e0;
    private r0 f;
    private final BannerAdListener f0;
    private g0 g;
    private b0 h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private Handler t;
    private Runnable u;
    private boolean v;
    private boolean w;
    private BannerAdListener x;
    private AdPopcornSSPBannerAd y;
    private GfpBannerAdView z;

    public NAMAdapter() {
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.s = true;
        this.t = new Handler(Looper.getMainLooper());
        this.v = false;
        this.w = false;
        this.H = true;
        this.I = true;
        this.J = false;
        this.M = false;
        this.O = false;
        this.X = new BannerAdListener() {
            final NAMAdapter a;

            public void onAdClicked(GfpBannerAd gfpBannerAd0) {
                super.onAdClicked(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter banner onAdClicked");
                if(NAMAdapter.this.a != null) {
                    NAMAdapter.this.a.a();
                }
            }

            public void onAdImpression(GfpBannerAd gfpBannerAd0) {
                super.onAdImpression(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter banner onAdImpression");
            }

            public void onAdLoaded(GfpBannerAd gfpBannerAd0) {
                super.onAdLoaded(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter banner onAdLoaded");
                try {
                    NAMAdapter.this.y.removeAllViewsInLayout();
                    NAMAdapter.this.y.removeAllViews();
                    NAMAdapter.this.y.addView(((View)NAMAdapter.this.z));
                    NAMAdapter.this.stopBannerTimer();
                    if(NAMAdapter.this.a != null) {
                        NAMAdapter.this.a.b(NAMAdapter.this.m);
                    }
                    if(NAMAdapter.this.y != null && NAMAdapter.this.y.getAutoBgColor()) {
                        NAMAdapter.this.y.setVisibility(4);
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            final com.igaworks.ssp.common.adapter.NAMAdapter.4 a;

                            @Override
                            public void run() {
                                try {
                                    try {
                                        ((View)NAMAdapter.this.z).buildDrawingCache();
                                        Bitmap bitmap0 = ((View)NAMAdapter.this.z).getDrawingCache();
                                        if(bitmap0 != null) {
                                            int v = bitmap0.getPixel(1, 1);
                                            NAMAdapter.this.y.setBackgroundColor(v);
                                        }
                                        goto label_15;
                                    }
                                    catch(Exception exception0) {
                                    }
                                    b.a(Thread.currentThread(), exception0);
                                    if(NAMAdapter.this.y != null) {
                                        goto label_9;
                                    }
                                    return;
                                }
                                catch(Throwable throwable0) {
                                    goto label_12;
                                }
                            label_9:
                                NAMAdapter.this.y.setVisibility(0);
                                return;
                            label_12:
                                if(NAMAdapter.this.y != null) {
                                    NAMAdapter.this.y.setVisibility(0);
                                }
                                throw throwable0;
                            label_15:
                                if(NAMAdapter.this.y != null) {
                                    NAMAdapter.this.y.setVisibility(0);
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
                NAMAdapter.this.stopBannerTimer();
                if(NAMAdapter.this.a != null) {
                    NAMAdapter.this.a.a(NAMAdapter.this.m);
                }
            }

            public void onAdMetaChanged(GfpBannerAd gfpBannerAd0, Map map0) {
                super.onAdMetaChanged(gfpBannerAd0, map0);
            }

            public void onAdMuted(GfpBannerAd gfpBannerAd0) {
                super.onAdMuted(gfpBannerAd0);
            }

            public void onAdSizeChanged(GfpBannerAd gfpBannerAd0) {
                super.onAdSizeChanged(gfpBannerAd0);
            }

            public void onError(GfpBannerAd gfpBannerAd0, GfpError gfpError0) {
                super.onError(gfpBannerAd0, gfpError0);
                b.b(Thread.currentThread(), "NAMAdapter banner onError : " + gfpError0.getErrorMessage());
                try {
                    NAMAdapter.this.stopBannerTimer();
                    if(NAMAdapter.this.a != null) {
                        NAMAdapter.this.a.a(NAMAdapter.this.m);
                    }
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                }
            }
        };
        this.Y = new BannerAdListener() {
            final NAMAdapter a;

            public void onAdClicked(GfpBannerAd gfpBannerAd0) {
                super.onAdClicked(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter interstitialAd onAdClicked");
                if(NAMAdapter.this.b != null) {
                    NAMAdapter.this.b.a();
                }
            }

            public void onAdImpression(GfpBannerAd gfpBannerAd0) {
                super.onAdImpression(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter interstitialAd onAdImpression");
            }

            public void onAdLoaded(GfpBannerAd gfpBannerAd0) {
                super.onAdLoaded(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter interstitialAd onAdLoaded");
                if(NAMAdapter.this.b != null) {
                    try {
                        NAMAdapter.this.b.b(NAMAdapter.this.n);
                    }
                    catch(Exception exception0) {
                        b.a(Thread.currentThread(), exception0);
                        if(NAMAdapter.this.b != null) {
                            NAMAdapter.this.b.d(NAMAdapter.this.n);
                        }
                    }
                }
            }

            public void onAdMetaChanged(GfpBannerAd gfpBannerAd0, Map map0) {
                super.onAdMetaChanged(gfpBannerAd0, map0);
            }

            public void onAdMuted(GfpBannerAd gfpBannerAd0) {
                super.onAdMuted(gfpBannerAd0);
            }

            public void onAdSizeChanged(GfpBannerAd gfpBannerAd0) {
                super.onAdSizeChanged(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter interstitialAd onAdSizeChanged : " + gfpBannerAd0.getBannerAdSize().getWidth() + ", " + gfpBannerAd0.getBannerAdSize().getHeight());
            }

            public void onError(GfpBannerAd gfpBannerAd0, GfpError gfpError0) {
                super.onError(gfpBannerAd0, gfpError0);
                b.b(Thread.currentThread(), "NAMAdapter interstitialAd onError : " + gfpError0.getErrorMessage());
                if(NAMAdapter.this.b != null) {
                    NAMAdapter.this.b.d(NAMAdapter.this.n);
                }
            }
        };
        this.Z = new GfpNativeSimpleAd.OnNativeSimpleAdLoadedListener() {
            final NAMAdapter a;

            public void onNativeSimpleAdLoaded(GfpNativeSimpleAd gfpNativeSimpleAd0) {
                try {
                    b.c(Thread.currentThread(), "NAMAdapter onNativeSimpleAdLoaded");
                }
                catch(Exception exception0) {
                    goto label_17;
                }
                try {
                    if(NAMAdapter.this.A != null) {
                        NAMAdapter.this.E.removeView(((View)NAMAdapter.this.A));
                        NAMAdapter.this.E.getNamViewBinder().gfpNativeBannerView = null;
                    }
                }
                catch(Exception unused_ex) {
                }
                try {
                    NAMAdapter.this.E.removeView(((View)NAMAdapter.this.G));
                    NAMAdapter.this.E.addView(((View)NAMAdapter.this.G));
                    NAMAdapter.this.G.setNativeSimpleAd(gfpNativeSimpleAd0);
                    if(NAMAdapter.this.c != null) {
                        NAMAdapter.this.c.a(NAMAdapter.this.o);
                    }
                    if(NAMAdapter.this.A != null) {
                        ((View)NAMAdapter.this.A).setVisibility(8);
                    }
                    if(NAMAdapter.this.F != null) {
                        ((View)NAMAdapter.this.F).setVisibility(8);
                    }
                    if(NAMAdapter.this.G != null) {
                        ((View)NAMAdapter.this.G).setVisibility(0);
                        return;
                    }
                    return;
                }
                catch(Exception exception0) {
                }
            label_17:
                b.c(Thread.currentThread(), "NAMAdapter onNativeSimpleAdLoaded exception : " + exception0.getMessage());
                if(NAMAdapter.this.c != null) {
                    NAMAdapter.this.c.a(NAMAdapter.this.o, 1);
                }
            }
        };
        this.a0 = new GfpNativeAd.OnNativeAdLoadedListener() {
            final NAMAdapter a;

            public void onNativeAdLoaded(GfpNativeAd gfpNativeAd0) {
                try {
                    b.c(Thread.currentThread(), "NAMAdapter onNativeAdLoaded");
                }
                catch(Exception exception0) {
                    goto label_68;
                }
                try {
                    if(NAMAdapter.this.A != null) {
                        NAMAdapter.this.E.removeView(((View)NAMAdapter.this.A));
                        NAMAdapter.this.E.getNamViewBinder().gfpNativeBannerView = null;
                    }
                }
                catch(Exception unused_ex) {
                }
                try {
                    NAMAdapter.this.E.removeView(((View)NAMAdapter.this.F));
                    NAMAdapter.this.E.addView(((View)NAMAdapter.this.F));
                    if(!NAMAdapter.this.O) {
                        FrameLayout frameLayout0 = (FrameLayout)NAMAdapter.this.E.findViewById(NAMAdapter.this.E.getNamViewBinder().assetContainerViewId);
                        if(NAMAdapter.this.E.getNamViewBinder().hasMediaView) {
                            GfpMediaView gfpMediaView0 = (GfpMediaView)NAMAdapter.this.E.findViewById(NAMAdapter.this.E.getNamViewBinder().mediaViewId);
                            NAMAdapter.this.P = gfpMediaView0;
                            NAMAdapter.this.F.setMediaView(NAMAdapter.this.P);
                        }
                        GfpAdChoicesView gfpAdChoicesView0 = (GfpAdChoicesView)NAMAdapter.this.E.findViewById(NAMAdapter.this.E.getNamViewBinder().adChoicesViewId);
                        NAMAdapter.this.Q = gfpAdChoicesView0;
                        ImageView imageView0 = (ImageView)NAMAdapter.this.E.findViewById(NAMAdapter.this.E.getNamViewBinder().iconViewId);
                        NAMAdapter.this.R = imageView0;
                        TextView textView0 = (TextView)NAMAdapter.this.E.findViewById(NAMAdapter.this.E.getNamViewBinder().titleViewId);
                        NAMAdapter.this.S = textView0;
                        TextView textView1 = (TextView)NAMAdapter.this.E.findViewById(NAMAdapter.this.E.getNamViewBinder().bodyViewId);
                        NAMAdapter.this.T = textView1;
                        TextView textView2 = (TextView)NAMAdapter.this.E.findViewById(NAMAdapter.this.E.getNamViewBinder().advertiserViewId);
                        NAMAdapter.this.U = textView2;
                        TextView textView3 = (TextView)NAMAdapter.this.E.findViewById(NAMAdapter.this.E.getNamViewBinder().socialContextViewId);
                        NAMAdapter.this.V = textView3;
                        Button button0 = (Button)NAMAdapter.this.E.findViewById(NAMAdapter.this.E.getNamViewBinder().callToActionButtonViewId);
                        NAMAdapter.this.W = button0;
                        if(frameLayout0 != null) {
                            NAMAdapter.this.F.setAssetsContainer(frameLayout0);
                        }
                        if(NAMAdapter.this.Q != null) {
                            NAMAdapter.this.F.setAdChoicesView(NAMAdapter.this.Q);
                        }
                        if(NAMAdapter.this.R != null) {
                            NAMAdapter.this.F.setIconView(NAMAdapter.this.R);
                        }
                        if(NAMAdapter.this.S != null) {
                            NAMAdapter.this.F.setTitleView(NAMAdapter.this.S);
                        }
                        if(NAMAdapter.this.T != null) {
                            NAMAdapter.this.F.setBodyView(NAMAdapter.this.T);
                        }
                        if(NAMAdapter.this.U != null) {
                            NAMAdapter.this.F.setAdvertiserView(NAMAdapter.this.U);
                        }
                        if(NAMAdapter.this.V != null) {
                            NAMAdapter.this.F.setSocialContextView(NAMAdapter.this.V);
                        }
                        if(NAMAdapter.this.W != null) {
                            NAMAdapter.this.F.setCallToActionView(NAMAdapter.this.W);
                        }
                        NAMAdapter.this.O = true;
                    }
                    NAMAdapter.this.S.setText(gfpNativeAd0.getTitle());
                    NAMAdapter.this.T.setText(gfpNativeAd0.getBody());
                    NAMAdapter.this.W.setText(gfpNativeAd0.getCallToAction());
                    NAMAdapter.this.U.setText(gfpNativeAd0.getAdvertiserName());
                    NAMAdapter.this.F.setNativeAd(gfpNativeAd0);
                    if(gfpNativeAd0.getIcon() == null) {
                        NAMAdapter.this.R.setVisibility(8);
                    }
                    else {
                        NAMAdapter.this.R.setImageDrawable(gfpNativeAd0.getIcon().getDrawable());
                        NAMAdapter.this.R.setVisibility(0);
                    }
                    if(gfpNativeAd0.getSocialContext() == null) {
                        NAMAdapter.this.V.setVisibility(8);
                    }
                    else {
                        NAMAdapter.this.V.setText(gfpNativeAd0.getSocialContext());
                        NAMAdapter.this.V.setVisibility(0);
                    }
                    if(NAMAdapter.this.c != null) {
                        NAMAdapter.this.c.a(NAMAdapter.this.o);
                    }
                    if(NAMAdapter.this.A != null) {
                        ((View)NAMAdapter.this.A).setVisibility(8);
                    }
                    if(NAMAdapter.this.G != null) {
                        ((View)NAMAdapter.this.G).setVisibility(8);
                    }
                    if(NAMAdapter.this.F != null) {
                        ((View)NAMAdapter.this.F).setVisibility(0);
                        return;
                    }
                    return;
                }
                catch(Exception exception0) {
                }
            label_68:
                exception0.printStackTrace();
                if(NAMAdapter.this.c != null) {
                    NAMAdapter.this.c.a(NAMAdapter.this.o, 1);
                }
            }
        };
        this.b0 = new GfpBannerAd.OnBannerAdViewLoadedListener() {
            final NAMAdapter a;

            public void onBannerAdViewLoaded(GfpBannerAdView gfpBannerAdView0) {
                try {
                    b.c(Thread.currentThread(), "NAMAdapter native onBannerAdViewLoaded : " + gfpBannerAdView0.getAdProviderName());
                    if(NAMAdapter.this.A != null) {
                        NAMAdapter.this.E.removeView(((View)NAMAdapter.this.A));
                    }
                    ((RelativeLayout)gfpBannerAdView0).setHorizontalGravity(1);
                    NAMAdapter.this.E.addView(((View)gfpBannerAdView0));
                    NAMAdapter.this.A = gfpBannerAdView0;
                    NAMAdapter.this.E.getNamViewBinder().gfpNativeBannerView = gfpBannerAdView0;
                    if(NAMAdapter.this.c != null) {
                        NAMAdapter.this.c.a(NAMAdapter.this.o);
                    }
                    if(NAMAdapter.this.A != null) {
                        ((View)NAMAdapter.this.A).setVisibility(0);
                    }
                    if(NAMAdapter.this.G != null) {
                        ((View)NAMAdapter.this.G).setVisibility(8);
                        return;
                    }
                    return;
                }
                catch(Exception exception0) {
                }
                exception0.printStackTrace();
                if(NAMAdapter.this.c != null) {
                    NAMAdapter.this.c.a(NAMAdapter.this.o, 1);
                }
            }
        };
        this.c0 = new AdEventListener() {
            final NAMAdapter a;

            public void onAdClicked() {
                super.onAdClicked();
                b.c(Thread.currentThread(), "NAMAdapter nativeAd onAdClicked");
                if(NAMAdapter.this.c != null) {
                    NAMAdapter.this.c.onClicked();
                }
            }

            public void onAdImpression() {
                super.onAdImpression();
                b.c(Thread.currentThread(), "NAMAdapter nativeAd onAdImpression");
                if(NAMAdapter.this.c != null) {
                    NAMAdapter.this.c.onImpression();
                }
            }

            public void onAdMetaChanged(Map map0) {
                super.onAdMetaChanged(map0);
            }

            public void onAdMuted() {
                super.onAdMuted();
                b.c(Thread.currentThread(), "NAMAdapter nativeAd onAdMuted");
                if(NAMAdapter.this.D != null) {
                    NAMAdapter.this.D.cancel();
                }
                if(NAMAdapter.this.c != null) {
                    NAMAdapter.this.c.onAdHidden();
                }
            }

            public void onAdSizeChanged(GfpBannerAdSize gfpBannerAdSize0) {
                super.onAdSizeChanged(gfpBannerAdSize0);
            }

            public void onError(GfpError gfpError0, GfpResponseInfo gfpResponseInfo0) {
                super.onError(gfpError0, gfpResponseInfo0);
                b.c(Thread.currentThread(), "NAMAdapter nativeAd onError : " + gfpError0.getErrorMessage());
                try {
                    if(NAMAdapter.this.A != null) {
                        NAMAdapter.this.E.removeView(((View)NAMAdapter.this.A));
                        NAMAdapter.this.E.getNamViewBinder().gfpNativeBannerView = null;
                    }
                }
                catch(Exception unused_ex) {
                }
                if(NAMAdapter.this.c != null) {
                    NAMAdapter.this.c.a(NAMAdapter.this.o, 2);
                }
            }
        };
        this.d0 = new GfpNativeSimpleAd.OnNativeSimpleAdLoadedListener() {
            final NAMAdapter a;

            public void onNativeSimpleAdLoaded(GfpNativeSimpleAd gfpNativeSimpleAd0) {
                try {
                    b.c(Thread.currentThread(), "NAMAdapter reactNative onNativeSimpleAdLoaded");
                    NAMAdapter.this.L.removeAllViewsInLayout();
                    NAMAdapter.this.L.removeAllViews();
                    NAMAdapter.this.L.addView(((View)NAMAdapter.this.G));
                    NAMAdapter.this.G.setNativeSimpleAd(gfpNativeSimpleAd0);
                    if(NAMAdapter.this.G != null) {
                        ((View)NAMAdapter.this.G).setVisibility(0);
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        final com.igaworks.ssp.common.adapter.NAMAdapter.16 a;

                        @Override
                        public void run() {
                            if(NAMAdapter.this.g != null) {
                                int v = ((View)NAMAdapter.this.G).getWidth();
                                int v1 = ((View)NAMAdapter.this.G).getHeight();
                                NAMAdapter.this.g.a(NAMAdapter.this.p, v, v1, i.y.b());
                            }
                        }
                    });
                    return;
                }
                catch(Exception exception0) {
                }
                exception0.printStackTrace();
                if(NAMAdapter.this.g != null) {
                    NAMAdapter.this.g.a(NAMAdapter.this.p, 1);
                }
            }
        };
        this.e0 = new AdEventListener() {
            final NAMAdapter a;

            public void onAdClicked() {
                super.onAdClicked();
                b.c(Thread.currentThread(), "NAMAdapter reactNativeAd onAdClicked");
                if(NAMAdapter.this.g != null) {
                    NAMAdapter.this.g.onClicked();
                }
            }

            public void onAdImpression() {
                super.onAdImpression();
                b.c(Thread.currentThread(), "NAMAdapter reactNativeAd onAdImpression");
                if(NAMAdapter.this.g != null) {
                    NAMAdapter.this.g.onImpression();
                }
            }

            public void onAdMetaChanged(Map map0) {
                super.onAdMetaChanged(map0);
            }

            public void onAdMuted() {
                super.onAdMuted();
            }

            public void onAdSizeChanged(GfpBannerAdSize gfpBannerAdSize0) {
                super.onAdSizeChanged(gfpBannerAdSize0);
                b.c(Thread.currentThread(), "NAMAdapter onAdSizeChanged : " + gfpBannerAdSize0.getWidth() + ":" + gfpBannerAdSize0.getHeight());
            }

            public void onError(GfpError gfpError0, GfpResponseInfo gfpResponseInfo0) {
                super.onError(gfpError0, gfpResponseInfo0);
                b.c(Thread.currentThread(), "NAMAdapter reactNativeAd onError : " + gfpError0.getErrorMessage());
                if(NAMAdapter.this.g != null) {
                    NAMAdapter.this.g.a(NAMAdapter.this.p, 2);
                }
            }
        };
        this.f0 = new BannerAdListener() {
            final NAMAdapter a;

            public void onAdClicked(GfpBannerAd gfpBannerAd0) {
                super.onAdClicked(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter modalAd onAdClicked");
                if(NAMAdapter.this.h != null) {
                    NAMAdapter.this.h.a();
                }
            }

            public void onAdImpression(GfpBannerAd gfpBannerAd0) {
                super.onAdImpression(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter modalAd onAdImpression");
            }

            public void onAdLoaded(GfpBannerAd gfpBannerAd0) {
                super.onAdLoaded(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter modalAd onAdLoaded");
                if(NAMAdapter.this.h != null) {
                    try {
                        NAMAdapter.this.h.b(NAMAdapter.this.r);
                    }
                    catch(Exception exception0) {
                        b.a(Thread.currentThread(), exception0);
                        if(NAMAdapter.this.h != null) {
                            NAMAdapter.this.h.d(NAMAdapter.this.r);
                        }
                    }
                }
            }

            public void onAdMetaChanged(GfpBannerAd gfpBannerAd0, Map map0) {
                super.onAdMetaChanged(gfpBannerAd0, map0);
            }

            public void onAdMuted(GfpBannerAd gfpBannerAd0) {
                super.onAdMuted(gfpBannerAd0);
            }

            public void onAdSizeChanged(GfpBannerAd gfpBannerAd0) {
                super.onAdSizeChanged(gfpBannerAd0);
                b.a(Thread.currentThread(), "NAMAdapter modalAd onAdSizeChanged : " + gfpBannerAd0.getBannerAdSize().getWidth() + ", " + gfpBannerAd0.getBannerAdSize().getHeight());
            }

            public void onError(GfpBannerAd gfpBannerAd0, GfpError gfpError0) {
                super.onError(gfpBannerAd0, gfpError0);
                b.b(Thread.currentThread(), "NAMAdapter modalAd onError : " + gfpError0.getErrorMessage());
                if(NAMAdapter.this.h != null) {
                    NAMAdapter.this.h.d(NAMAdapter.this.r);
                }
            }
        };
    }

    private void a() {
        AdParam adParam0 = new AdParam.Builder().setAdUnitId(this.k).build();
        GfpNativeAdOptions gfpNativeAdOptions0 = null;
        GfpNativeSimpleAdOptions gfpNativeSimpleAdOptions0 = this.H ? new GfpNativeSimpleAdOptions.Builder().setAdChoicesPlacement(1).setActivateObservingOnBackground(this.E.getNamViewBinder().activateObservingOnBackground).setPlaceAdChoicesInAdViewCorner(true).build() : null;
        if(this.I) {
            gfpNativeAdOptions0 = new GfpNativeAdOptions.Builder().setHasMediaView(this.E.getNamViewBinder().hasMediaView).setAdChoicesPlacement(1).setActivateObservingOnBackground(this.E.getNamViewBinder().activateObservingOnBackground).build();
        }
        if(this.D == null) {
            if(gfpNativeSimpleAdOptions0 != null && gfpNativeAdOptions0 != null) {
                this.D = ((GfpAdLoader.Builder)((GfpAdLoader.Builder)((GfpAdLoader.Builder)((GfpAdLoader.Builder)new GfpAdLoader.Builder(this.N, adParam0).withAdListener(this.c0)).withNativeSimpleAd(gfpNativeSimpleAdOptions0, this.Z)).withNativeAd(gfpNativeAdOptions0, this.a0)).withBannerAd(new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FLUID_WIDTH).build(), this.b0)).build();
            }
            else if(gfpNativeSimpleAdOptions0 == null) {
                if(gfpNativeAdOptions0 != null) {
                    this.D = ((GfpAdLoader.Builder)((GfpAdLoader.Builder)((GfpAdLoader.Builder)new GfpAdLoader.Builder(this.N, adParam0).withAdListener(this.c0)).withNativeAd(gfpNativeAdOptions0, this.a0)).withBannerAd(new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FLUID_WIDTH).build(), this.b0)).build();
                    this.D.loadAd();
                    return;
                }
                b.a(Thread.currentThread(), "NAMAdapter native Ad options null");
                c0 c00 = this.c;
                if(c00 != null) {
                    c00.a(this.o, 2);
                }
                return;
            }
            else {
                this.D = ((GfpAdLoader.Builder)((GfpAdLoader.Builder)((GfpAdLoader.Builder)new GfpAdLoader.Builder(this.N, adParam0).withAdListener(this.c0)).withNativeSimpleAd(gfpNativeSimpleAdOptions0, this.Z)).withBannerAd(new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FLUID_WIDTH).build(), this.b0)).build();
            }
        }
        this.D.loadAd();
    }

    private void b() {
        if(this.J) {
            return;
        }
        E e0 = E.g();
        try {
            AdPopcornSSPUserProperties adPopcornSSPUserProperties0 = e0.l();
            b.a(Thread.currentThread(), "NAMAdapter setUserProperties : " + adPopcornSSPUserProperties0);
            if(adPopcornSSPUserProperties0 != null) {
                UserPropertiesBuilder userPropertiesBuilder0 = GfpSdk.getUserProperties().buildUpon();
                if(adPopcornSSPUserProperties0.yearOfBirth > 0) {
                    b.a(Thread.currentThread(), "NAMAdapter userProperties.yearOfBirth : " + adPopcornSSPUserProperties0.yearOfBirth);
                    userPropertiesBuilder0.yob(adPopcornSSPUserProperties0.yearOfBirth);
                }
                if(adPopcornSSPUserProperties0.gender >= 0) {
                    b.a(Thread.currentThread(), "NAMAdapter userProperties.gender : " + adPopcornSSPUserProperties0.gender);
                    switch(adPopcornSSPUserProperties0.gender) {
                        case 0: {
                            userPropertiesBuilder0.gender(GenderType.MALE);
                            break;
                        }
                        case 1: {
                            userPropertiesBuilder0.gender(GenderType.FEMALE);
                            break;
                        }
                        default: {
                            userPropertiesBuilder0.gender(GenderType.UNKNOWN);
                        }
                    }
                }
                if(adPopcornSSPUserProperties0.country != null) {
                    b.a(Thread.currentThread(), "NAMAdapter userProperties.country : " + adPopcornSSPUserProperties0.country);
                    userPropertiesBuilder0.country(adPopcornSSPUserProperties0.country);
                }
                if(adPopcornSSPUserProperties0.language != null) {
                    b.a(Thread.currentThread(), "NAMAdapter userProperties.language : " + adPopcornSSPUserProperties0.language);
                    userPropertiesBuilder0.language(adPopcornSSPUserProperties0.language);
                }
                GfpSdk.setUserProperties(userPropertiesBuilder0.build());
                this.J = true;
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
        this.x = new BannerAdListener() {
            final NAMAdapter a;

            public void onAdClicked(GfpBannerAd gfpBannerAd0) {
                super.onAdClicked(gfpBannerAd0);
            }

            public void onAdImpression(GfpBannerAd gfpBannerAd0) {
                super.onAdImpression(gfpBannerAd0);
            }

            public void onAdLoaded(GfpBannerAd gfpBannerAd0) {
                super.onAdLoaded(gfpBannerAd0);
            }

            public void onAdMetaChanged(GfpBannerAd gfpBannerAd0, Map map0) {
                super.onAdMetaChanged(gfpBannerAd0, map0);
            }

            public void onAdMuted(GfpBannerAd gfpBannerAd0) {
                super.onAdMuted(gfpBannerAd0);
            }

            public void onAdSizeChanged(GfpBannerAd gfpBannerAd0) {
                super.onAdSizeChanged(gfpBannerAd0);
            }

            public void onError(GfpBannerAd gfpBannerAd0, GfpError gfpError0) {
                super.onError(gfpBannerAd0, gfpError0);
            }
        };
        b.a(Thread.currentThread(), "NAMAdapter SDK imported");
        this.b();
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        GfpBannerAdView gfpBannerAdView0 = this.z;
        if(gfpBannerAdView0 != null) {
            gfpBannerAdView0.destroy();
        }
        this.stopBannerTimer();
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyModalAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyNativeAd() {
        GfpAdLoader gfpAdLoader0 = this.D;
        if(gfpAdLoader0 != null) {
            gfpAdLoader0.cancel();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
        GfpAdLoader gfpAdLoader0 = this.D;
        if(gfpAdLoader0 != null) {
            gfpAdLoader0.cancel();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroySplashAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getBiddingToken(Context context0) {
        return "";
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        try {
            b.a(Thread.currentThread(), "NAMAdapter initializeSDK");
            if(!GfpSdk.isInitialized()) {
                GfpSdk.initialize(context0.getApplicationContext(), new GfpSdk.InitializationCallback() {
                    final NAMAdapter b;

                    public void onInitializationComplete(GfpSdk.InitializationResult gfpSdk$InitializationResult0) {
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
            goto label_12;
        }
        catch(Exception unused_ex) {
            goto label_15;
        }
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
            return;
        label_12:
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            label_15:
                if(sdkInitListener0 != null) {
                    sdkInitListener0.onInitializationFinished();
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        GfpBannerAdView gfpBannerAdView0 = this.z;
        if(gfpBannerAdView0 != null) {
            gfpBannerAdView0.destroy();
        }
        this.stopBannerTimer();
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        try {
            this.N = context0;
            this.n = v;
            b.a(Thread.currentThread(), "NAMAdapter loadInterstitial()");
            this.j = ((a0)d00.e().a().get(v)).a("NamUnitId");
            if(GfpSdk.isInitialized()) {
                b.a(Thread.currentThread(), "NAMAdapter already initialized and loadAd");
                AdParam adParam0 = new AdParam.Builder().setAdUnitId(this.j).build();
                GfpBannerAdOptions gfpBannerAdOptions0 = new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FLUID).build();
                if(this.B == null) {
                    this.B = new GfpBannerAdView(context0, adParam0);
                }
                this.B.setAdListener(this.Y);
                this.B.setBannerAdOptions(gfpBannerAdOptions0);
                this.B.loadAd();
                return;
            }
            b.a(Thread.currentThread(), "NAMAdapter call init");
        }
        catch(Exception exception0) {
            goto label_24;
        }
        try {
            GfpSdk.initialize(context0.getApplicationContext(), new GfpSdk.InitializationCallback() {
                final NAMAdapter b;

                public void onInitializationComplete(GfpSdk.InitializationResult gfpSdk$InitializationResult0) {
                    if(gfpSdk$InitializationResult0.getSuccess()) {
                        AdParam adParam0 = new AdParam.Builder().setAdUnitId(NAMAdapter.this.j).build();
                        GfpBannerAdOptions gfpBannerAdOptions0 = new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FLUID).build();
                        if(NAMAdapter.this.B == null) {
                            GfpBannerAdView gfpBannerAdView0 = new GfpBannerAdView(context0, adParam0);
                            NAMAdapter.this.B = gfpBannerAdView0;
                        }
                        NAMAdapter.this.B.setBannerAdOptions(gfpBannerAdOptions0);
                        NAMAdapter.this.B.setAdListener(NAMAdapter.this.Y);
                        NAMAdapter.this.B.loadAd();
                        return;
                    }
                    b.a(Thread.currentThread(), "NAMAdapter init onError : " + gfpSdk$InitializationResult0.getMessage());
                    if(NAMAdapter.this.b != null) {
                        NAMAdapter.this.b.d(NAMAdapter.this.n);
                    }
                }
            });
            return;
        }
        catch(Exception exception1) {
            try {
                b.a(Thread.currentThread(), "NAMAdapter init Exception : " + exception1.getMessage());
                T t0 = this.b;
                if(t0 != null) {
                    t0.d(this.n);
                    return;
                }
                return;
            }
            catch(Exception exception0) {
            }
        }
    label_24:
        b.a(Thread.currentThread(), exception0);
        T t1 = this.b;
        if(t1 != null) {
            t1.d(this.n);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
        if(this.w) {
            V v1 = this.e;
            if(v1 != null) {
                v1.d(this.q);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
        this.r = v;
        b.a(Thread.currentThread(), "NAMAdapter loadModalAd()");
        this.l = ((a0)d00.e().a().get(v)).a("NamUnitId");
        if(GfpSdk.isInitialized()) {
            b.a(Thread.currentThread(), "NAMAdapter already initialized and loadAd");
            AdParam adParam0 = new AdParam.Builder().setAdUnitId(this.l).build();
            GfpBannerAdOptions gfpBannerAdOptions0 = new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FIXED).build();
            if(this.C == null) {
                this.C = new GfpBannerAdView(context0, adParam0);
            }
            this.C.setAdListener(this.f0);
            this.C.setBannerAdOptions(gfpBannerAdOptions0);
            this.C.loadAd();
            return;
        }
        b.a(Thread.currentThread(), "NAMAdapter call init");
        try {
            GfpSdk.initialize(context0.getApplicationContext(), new GfpSdk.InitializationCallback() {
                final NAMAdapter b;

                public void onInitializationComplete(GfpSdk.InitializationResult gfpSdk$InitializationResult0) {
                    if(gfpSdk$InitializationResult0.getSuccess()) {
                        AdParam adParam0 = new AdParam.Builder().setAdUnitId(NAMAdapter.this.l).build();
                        GfpBannerAdOptions gfpBannerAdOptions0 = new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FIXED).build();
                        if(NAMAdapter.this.C == null) {
                            GfpBannerAdView gfpBannerAdView0 = new GfpBannerAdView(context0, adParam0);
                            NAMAdapter.this.C = gfpBannerAdView0;
                        }
                        NAMAdapter.this.C.setBannerAdOptions(gfpBannerAdOptions0);
                        NAMAdapter.this.C.setAdListener(NAMAdapter.this.f0);
                        NAMAdapter.this.C.loadAd();
                        return;
                    }
                    b.a(Thread.currentThread(), "NAMAdapter init onError : " + gfpSdk$InitializationResult0.getMessage());
                    if(NAMAdapter.this.h != null) {
                        NAMAdapter.this.h.d(NAMAdapter.this.r);
                    }
                }
            });
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), "NAMAdapter init Exception : " + exception0.getMessage());
            b0 b00 = this.h;
            if(b00 != null) {
                b00.d(this.r);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
        try {
            if(adPopcornSSPNativeAd0.getNamViewBinder() == null) {
                b.c(Thread.currentThread(), "NAMAdapter viewBinder is null");
                c0 c00 = this.c;
                if(c00 != null) {
                    c00.a(v, 3);
                    return;
                }
                return;
            }
            this.N = context0;
            this.o = v;
            this.E = adPopcornSSPNativeAd0;
            b.c(Thread.currentThread(), "NAMAdapter loadNativeAd : " + adPopcornSSPNativeAd0.getNamViewBinder().activateObservingOnBackground);
            this.H = adPopcornSSPNativeAd0.getNamViewBinder().useGfpNativeSimpleView;
            this.I = adPopcornSSPNativeAd0.getNamViewBinder().useGfpNativeView;
            this.k = ((a0)d00.e().a().get(v)).a("NamUnitId");
            if(GfpSdk.isInitialized()) {
                b.a(Thread.currentThread(), "NAMAdapter already initialized and loadAd");
                this.a();
            }
            else {
                b.a(Thread.currentThread(), "NAMAdapter call init");
                goto label_19;
            }
            goto label_26;
        }
        catch(Exception exception0) {
            goto label_32;
        }
        try {
        label_19:
            GfpSdk.initialize(context0.getApplicationContext(), new GfpSdk.InitializationCallback() {
                final NAMAdapter b;

                public void onInitializationComplete(GfpSdk.InitializationResult gfpSdk$InitializationResult0) {
                    if(gfpSdk$InitializationResult0.getSuccess()) {
                        NAMAdapter.this.a();
                        return;
                    }
                    b.a(Thread.currentThread(), "NAMAdapter native init onError : " + gfpSdk$InitializationResult0.getMessage());
                    if(NAMAdapter.this.c != null) {
                        NAMAdapter.this.c.a(v, 2);
                    }
                }
            });
            goto label_26;
        }
        catch(Exception exception1) {
            try {
                b.a(Thread.currentThread(), "NAMAdapter init onError : " + exception1.getLocalizedMessage());
                c0 c01 = this.c;
                if(c01 != null) {
                    c01.a(v, 2);
                }
            label_26:
                if(adPopcornSSPNativeAd0.getNamViewBinder().gfpNativeSimpleAdViewId != 0) {
                    this.G = (GfpNativeSimpleAdView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getNamViewBinder().gfpNativeSimpleAdViewId);
                }
                if(adPopcornSSPNativeAd0.getNamViewBinder().gfpNativeAdViewId != 0) {
                    this.F = (GfpNativeAdView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getNamViewBinder().gfpNativeAdViewId);
                    return;
                }
                return;
            }
            catch(Exception exception0) {
            }
        }
    label_32:
        b.c(Thread.currentThread(), "NAMAdapter loadNativeAd exception : " + exception0.getLocalizedMessage());
        c0 c02 = this.c;
        if(c02 != null) {
            c02.a(v, 0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        try {
            this.p = v;
            this.L = adPopcornSSPReactNativeAd0;
            b.c(Thread.currentThread(), "NAMAdapter loadReactNativeAd");
            this.k = ((a0)d00.e().a().get(v)).a("NamUnitId");
            if(this.G == null) {
                this.G = new GfpNativeSimpleAdView(context0);
            }
            int v1 = adPopcornSSPReactNativeAd0.getReactNativeWidth();
            int v2 = adPopcornSSPReactNativeAd0.getReactNativeHeight();
            if(v1 == 0) {
                v1 = -1;
            }
            if(v2 == 0) {
                v2 = -2;
            }
            b.a(Thread.currentThread(), "NAMAdapter width : " + v1 + ", height : " + v2);
            ((View)this.G).setLayoutParams(new FrameLayout.LayoutParams(v1, v2));
            if(GfpSdk.isInitialized()) {
                b.a(Thread.currentThread(), "NAMAdapter already initialized and loadAd");
                AdParam adParam0 = new AdParam.Builder().setAdUnitId(this.k).build();
                GfpNativeSimpleAdOptions gfpNativeSimpleAdOptions0 = new GfpNativeSimpleAdOptions.Builder().setAdChoicesPlacement(1).setPlaceAdChoicesInAdViewCorner(true).build();
                if(this.D == null) {
                    this.D = ((GfpAdLoader.Builder)((GfpAdLoader.Builder)new GfpAdLoader.Builder(context0, adParam0).withAdListener(this.e0)).withNativeSimpleAd(gfpNativeSimpleAdOptions0, this.d0)).build();
                }
                this.D.loadAd();
                return;
            }
            b.a(Thread.currentThread(), "NAMAdapter call init");
        }
        catch(Exception exception0) {
            goto label_32;
        }
        try {
            GfpSdk.initialize(context0.getApplicationContext(), new GfpSdk.InitializationCallback() {
                final NAMAdapter c;

                public void onInitializationComplete(GfpSdk.InitializationResult gfpSdk$InitializationResult0) {
                    if(gfpSdk$InitializationResult0.getSuccess()) {
                        AdParam adParam0 = new AdParam.Builder().setAdUnitId(NAMAdapter.this.k).build();
                        GfpNativeSimpleAdOptions gfpNativeSimpleAdOptions0 = new GfpNativeSimpleAdOptions.Builder().setAdChoicesPlacement(1).setPlaceAdChoicesInAdViewCorner(true).build();
                        if(NAMAdapter.this.D == null) {
                            GfpAdLoader gfpAdLoader0 = ((GfpAdLoader.Builder)((GfpAdLoader.Builder)new GfpAdLoader.Builder(context0, adParam0).withAdListener(NAMAdapter.this.e0)).withNativeSimpleAd(gfpNativeSimpleAdOptions0, NAMAdapter.this.d0)).build();
                            NAMAdapter.this.D = gfpAdLoader0;
                        }
                        NAMAdapter.this.D.loadAd();
                        return;
                    }
                    b.a(Thread.currentThread(), "NAMAdapter native init onError : " + gfpSdk$InitializationResult0.getMessage());
                    if(NAMAdapter.this.g != null) {
                        NAMAdapter.this.g.a(v, 2);
                    }
                }
            });
            return;
        }
        catch(Exception exception1) {
            try {
                b.a(Thread.currentThread(), "NAMAdapter init onError : " + exception1.getLocalizedMessage());
                g0 g00 = this.g;
                if(g00 != null) {
                    g00.a(v, 2);
                    return;
                }
                return;
            }
            catch(Exception exception0) {
            }
        }
    label_32:
        exception0.printStackTrace();
        g0 g01 = this.g;
        if(g01 != null) {
            g01.a(v, 0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
        if(this.v) {
            l0 l00 = this.d;
            if(l00 != null) {
                l00.d(v);
            }
        }
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
        this.K = hashMap0;
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
        try {
            b.a(Thread.currentThread(), "NAMAdapter showInterstitial()");
            this.n = v;
            try {
                GfpBannerAdView gfpBannerAdView0 = this.B;
                if(gfpBannerAdView0 != null) {
                    ViewGroup viewGroup0 = (ViewGroup)((View)gfpBannerAdView0).getParent();
                    if(viewGroup0 != null) {
                        viewGroup0.removeView(((View)this.B));
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            AdPopcornSSPCustomInterstitialDialog adPopcornSSPCustomInterstitialDialog0 = new AdPopcornSSPCustomInterstitialDialog(context0, this.B, this.K, J.a(context0));
            adPopcornSSPCustomInterstitialDialog0.setCancelable(false);
            adPopcornSSPCustomInterstitialDialog0.setOnDismissListener(new DialogInterface.OnDismissListener() {
                final NAMAdapter a;

                @Override  // android.content.DialogInterface$OnDismissListener
                public void onDismiss(DialogInterface dialogInterface0) {
                    if(NAMAdapter.this.b != null) {
                        NAMAdapter.this.b.e(0);
                    }
                }
            });
            adPopcornSSPCustomInterstitialDialog0.setOnShowListener(new DialogInterface.OnShowListener() {
                final NAMAdapter a;

                @Override  // android.content.DialogInterface$OnShowListener
                public void onShow(DialogInterface dialogInterface0) {
                    if(NAMAdapter.this.b != null) {
                        NAMAdapter.this.b.a(NAMAdapter.this.n);
                    }
                }
            });
            adPopcornSSPCustomInterstitialDialog0.show();
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            T t0 = this.b;
            if(t0 != null) {
                t0.c(this.n);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
        try {
            b.a(Thread.currentThread(), "NAMAdapter showModalAd()");
            this.r = v;
            try {
                GfpBannerAdView gfpBannerAdView0 = this.C;
                if(gfpBannerAdView0 != null) {
                    ViewGroup viewGroup0 = (ViewGroup)((View)gfpBannerAdView0).getParent();
                    if(viewGroup0 != null) {
                        viewGroup0.removeView(((View)this.C));
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            s s0 = new s(context0, adPopcornSSPModalAd0, ((View)this.C), this.K, J.a(context0));
            s0.setCancelable(adPopcornSSPModalAd0.isEnableBackKey());
            s0.setOnDismissListener(new DialogInterface.OnDismissListener() {
                final NAMAdapter a;

                @Override  // android.content.DialogInterface$OnDismissListener
                public void onDismiss(DialogInterface dialogInterface0) {
                    if(NAMAdapter.this.h != null) {
                        NAMAdapter.this.h.e(0);
                    }
                }
            });
            s0.setOnShowListener(new DialogInterface.OnShowListener() {
                final NAMAdapter a;

                @Override  // android.content.DialogInterface$OnShowListener
                public void onShow(DialogInterface dialogInterface0) {
                    if(NAMAdapter.this.h != null) {
                        NAMAdapter.this.h.a(NAMAdapter.this.r);
                    }
                }
            });
            s0.show();
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            b0 b00 = this.h;
            if(b00 != null) {
                b00.c(this.r);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        try {
            this.N = context0;
            this.y = adPopcornSSPBannerAd0;
            this.s = true;
            this.m = v;
            if(this.t == null) {
                this.t = new Handler();
            }
            if(this.u == null) {
                com.igaworks.ssp.common.adapter.NAMAdapter.2 nAMAdapter$20 = new Runnable() {
                    final NAMAdapter a;

                    @Override
                    public void run() {
                        if(NAMAdapter.this.s) {
                            b.b(Thread.currentThread(), "Time out in : NAM");
                            if(NAMAdapter.this.a != null) {
                                NAMAdapter.this.a.a(NAMAdapter.this.m);
                            }
                        }
                    }
                };
                this.u = nAMAdapter$20;
                this.t.postDelayed(nAMAdapter$20, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            if(adPopcornSSPBannerAd0 != null) {
                goto label_11;
            }
            goto label_14;
        }
        catch(Exception exception0) {
            goto label_37;
        }
        try {
        label_11:
            if(adPopcornSSPBannerAd0.getMediationExtraData("NAM_OBSERVING_ON_BACKGROUND") != null) {
                this.M = ((Boolean)adPopcornSSPBannerAd0.getMediationExtraData("NAM_OBSERVING_ON_BACKGROUND")).booleanValue();
                b.a(Thread.currentThread(), "activateObservingOnBackground : " + this.M);
            }
        }
        catch(Exception unused_ex) {
        }
        try {
        label_14:
            b.a(Thread.currentThread(), "NAMAdapter startBannerAd()");
            this.i = ((a0)d00.e().a().get(v)).a("NamUnitId");
            if(GfpSdk.isInitialized()) {
                b.a(Thread.currentThread(), "NAMAdapter already initialized and loadAd : " + this.M);
                AdParam adParam0 = new AdParam.Builder().setAdUnitId(this.i).build();
                GfpBannerAdOptions gfpBannerAdOptions0 = this.M ? new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FLUID).setActivateObservingOnBackground(true).build() : new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FLUID).build();
                if(this.z == null) {
                    this.z = new GfpBannerAdView(context0, adParam0);
                }
                this.z.setAdListener(this.X);
                this.z.setBannerAdOptions(gfpBannerAdOptions0);
                this.z.loadAd();
                return;
            }
            b.a(Thread.currentThread(), "NAMAdapter call init");
        }
        catch(Exception exception0) {
            goto label_37;
        }
        try {
            GfpSdk.initialize(context0.getApplicationContext(), new GfpSdk.InitializationCallback() {
                final NAMAdapter b;

                public void onInitializationComplete(GfpSdk.InitializationResult gfpSdk$InitializationResult0) {
                    if(gfpSdk$InitializationResult0.getSuccess()) {
                        AdParam adParam0 = new AdParam.Builder().setAdUnitId(NAMAdapter.this.i).build();
                        GfpBannerAdOptions gfpBannerAdOptions0 = NAMAdapter.this.M ? new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FLUID).setActivateObservingOnBackground(true).build() : new GfpBannerAdOptions.Builder().setBannerViewLayoutType(BannerViewLayoutType.FLUID).build();
                        if(NAMAdapter.this.z == null) {
                            GfpBannerAdView gfpBannerAdView0 = new GfpBannerAdView(context0, adParam0);
                            NAMAdapter.this.z = gfpBannerAdView0;
                        }
                        NAMAdapter.this.z.setBannerAdOptions(gfpBannerAdOptions0);
                        NAMAdapter.this.z.setAdListener(NAMAdapter.this.X);
                        NAMAdapter.this.z.loadAd();
                        return;
                    }
                    b.a(Thread.currentThread(), "NAMAdapter init onError : " + gfpSdk$InitializationResult0.getMessage());
                    NAMAdapter.this.stopBannerTimer();
                    if(NAMAdapter.this.a != null) {
                        NAMAdapter.this.a.a(NAMAdapter.this.m);
                    }
                }
            });
            return;
        }
        catch(Exception exception1) {
            try {
                b.a(Thread.currentThread(), "NAMAdapter init Exception : " + exception1.getMessage());
                this.stopBannerTimer();
                C c0 = this.a;
                if(c0 != null) {
                    c0.a(this.m);
                    return;
                }
                return;
            }
            catch(Exception exception0) {
            }
        }
    label_37:
        this.stopBannerTimer();
        C c1 = this.a;
        if(c1 != null) {
            c1.a(this.m);
        }
        b.a(Thread.currentThread(), exception0);
    }

    public void stopBannerTimer() {
        try {
            this.s = false;
            Handler handler0 = this.t;
            if(handler0 != null) {
                handler0.removeCallbacks(this.u);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

