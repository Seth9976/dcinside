package com.coupang.ads.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.coupang.ads.R.id;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.viewmodels.AdsRequest;
import com.coupang.ads.viewmodels.AdsViewModel;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public abstract class AdsBaseView extends FrameLayout implements LifecycleOwner {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a Companion = null;
    @l
    public static final String TAG = "AdsBaseView";
    @m
    private L.a adsListener;
    @m
    private View.OnClickListener extClickListener;
    @l
    private final D lifecycleRegistry$delegate;
    @l
    private final D observer$delegate;
    @m
    private AdsViewModel viewModel;

    static {
        AdsBaseView.Companion = new a(null);
    }

    @j
    public AdsBaseView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsBaseView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsBaseView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class b extends N implements A3.a {
            final AdsBaseView e;

            b(AdsBaseView adsBaseView0) {
                this.e = adsBaseView0;
                super(0);
            }

            @l
            public final LifecycleRegistry b() {
                return new LifecycleRegistry(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class c extends N implements A3.a {
            final AdsBaseView e;

            c(AdsBaseView adsBaseView0) {
                this.e = adsBaseView0;
                super(0);
            }

            @l
            public final Observer b() {
                return (e0 e00) -> {
                    String s1;
                    S0 s01;
                    S0 s00;
                    L.p(this.e, "this$0");
                    L.o(e00, "it");
                    DTO dTO0 = (DTO)com.coupang.ads.tools.l.a(e00.l(), "AdsBaseView");
                    if(dTO0 != null) {
                        com.coupang.ads.clog.b.a.a("AdsBaseView", "loadData success " + dTO0);
                        try {
                            this.e.onBindModelData(dTO0);
                            this.e.d(dTO0);
                            L.a a0 = this.e.getAdsListener();
                            if(a0 == null) {
                                s00 = null;
                            }
                            else {
                                a0.onAdLoaded();
                                s00 = S0.a;
                            }
                            s01 = s00;
                        }
                        catch(Throwable throwable0) {
                            s01 = e0.b(f0.a(throwable0));
                        }
                        com.coupang.ads.tools.l.a(s01, "AdsBaseView");
                        return;
                    }
                    Throwable throwable1 = e0.e(e00.l());
                    AdsViewModel adsViewModel0 = this.e.getViewModel();
                    if(adsViewModel0 != null) {
                        AdsRequest adsRequest0 = adsViewModel0.getRequest();
                        if(throwable1 == null) {
                            s1 = "unknown";
                        }
                        else {
                            String s = throwable1.getMessage();
                            s1 = s == null ? "unknown" : s;
                        }
                        com.coupang.ads.b b0 = new com.coupang.ads.b(adsRequest0, s1, throwable1, 0, 8, null);
                        L.a a1 = this.e.getAdsListener();
                        if(a1 != null) {
                            a1.onAdFailedToLoad(b0.getMessage());
                        }
                    }
                };
            }

            // 检测为 Lambda 实现
            private static final void c(AdsBaseView adsBaseView0, e0 e00) [...]

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        if(this.getId() == -1) {
            this.setId(id.ads_view);
        }
        super.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            View.OnClickListener view$OnClickListener0 = this.extClickListener;
            if(view$OnClickListener0 != null) {
                view$OnClickListener0.onClick(view0);
            }
        });
        this.lifecycleRegistry$delegate = E.a(new b(this));
        this.observer$delegate = E.a(new c(this));
    }

    public AdsBaseView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public void bindViewModel(@m LifecycleOwner lifecycleOwner0, @l AdsViewModel adsViewModel0) {
        L.p(adsViewModel0, "viewModel");
        AdsViewModel adsViewModel1 = this.viewModel;
        if(adsViewModel1 != null) {
            MutableLiveData mutableLiveData0 = adsViewModel1.getDataResult();
            if(mutableLiveData0 != null) {
                mutableLiveData0.p(this.getObserver());
            }
        }
        boolean z = adsViewModel0.getDataResult().f() != null;
        MutableLiveData mutableLiveData1 = adsViewModel0.getDataResult();
        if(lifecycleOwner0 == null) {
            lifecycleOwner0 = this.getLifecycleOwner();
        }
        mutableLiveData1.k(lifecycleOwner0, this.getObserver());
        this.viewModel = adsViewModel0;
    }

    public static void bindViewModel$default(AdsBaseView adsBaseView0, LifecycleOwner lifecycleOwner0, AdsViewModel adsViewModel0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindViewModel");
        }
        if((v & 1) != 0) {
            lifecycleOwner0 = null;
        }
        adsBaseView0.bindViewModel(lifecycleOwner0, adsViewModel0);
    }

    // 检测为 Lambda 实现
    private static final void c(AdsBaseView adsBaseView0, View view0) [...]

    private final void d(DTO dTO0) {
        super.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.p(dTO0, "$data");
            this.onClick(dTO0);
            View.OnClickListener view$OnClickListener0 = this.extClickListener;
            if(view$OnClickListener0 != null) {
                view$OnClickListener0.onClick(this);
            }
            L.a a0 = this.getAdsListener();
            if(a0 != null) {
                a0.onAdClicked();
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void e(AdsBaseView adsBaseView0, DTO dTO0, View view0) [...]

    @m
    public final L.a getAdsListener() {
        return this.adsListener;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return this.getLifecycleRegistry();
    }

    private final LifecycleOwner getLifecycleOwner() {
        Object object0;
        try {
            object0 = e0.b(FragmentManager.q0(this));
        }
        catch(Throwable throwable0) {
            object0 = e0.b(f0.a(throwable0));
        }
        FragmentActivity fragmentActivity0 = null;
        if(e0.i(object0)) {
            object0 = null;
        }
        LifecycleOwner lifecycleOwner0 = ((Fragment)object0) == null ? null : ((Fragment)object0).getViewLifecycleOwner();
        if(lifecycleOwner0 == null) {
            Context context0 = this.getContext();
            if(context0 instanceof FragmentActivity) {
                fragmentActivity0 = (FragmentActivity)context0;
            }
            lifecycleOwner0 = fragmentActivity0;
        }
        return lifecycleOwner0 == null ? this : lifecycleOwner0;
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry)this.lifecycleRegistry$delegate.getValue();
    }

    private final Observer getObserver() {
        return (Observer)this.observer$delegate.getValue();
    }

    @m
    public final AdsViewModel getViewModel() {
        return this.viewModel;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleRegistry lifecycleRegistry0 = this.getLifecycleRegistry();
        lifecycleRegistry0.l(Event.ON_CREATE);
        lifecycleRegistry0.l(Event.ON_START);
        lifecycleRegistry0.l(Event.ON_RESUME);
    }

    public abstract void onBindModelData(@l DTO arg1);

    public void onClean() {
    }

    public void onClick(@l DTO dTO0) {
        L.p(dTO0, "data");
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.getLifecycleRegistry();
        this.getLifecycleRegistry().l(Event.ON_PAUSE);
        this.getLifecycleRegistry().l(Event.ON_STOP);
        this.getLifecycleRegistry().l(Event.ON_DESTROY);
        super.onDetachedFromWindow();
    }

    public void onLoadDataFailed(@m Throwable throwable0) {
    }

    public final void setAdsListener(@m L.a a0) {
        this.adsListener = a0;
    }

    @Override  // android.view.View
    public void setOnClickListener(@m View.OnClickListener view$OnClickListener0) {
        this.extClickListener = view$OnClickListener0;
    }
}

