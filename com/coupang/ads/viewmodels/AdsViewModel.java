package com.coupang.ads.viewmodels;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.coupang.ads.dto.AdRequestBody;
import com.coupang.ads.dto.AdsDto;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.dto.ImpressionDetails;
import com.coupang.ads.dto.Placement;
import com.coupang.ads.dto.PlacementGroup;
import com.coupang.ads.dto.PlacementGroupInfo;
import com.coupang.ads.dto.Property;
import com.coupang.ads.dto.Raw;
import com.coupang.ads.dto.RawParameter;
import com.coupang.ads.tools.h;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import okhttp3.RequestBody;
import y4.l;
import y4.m;

public class AdsViewModel extends ViewModel {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final Gson a() {
            return AdsViewModel.gson;
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[J.b.values().length];
            arr_v[J.b.a.ordinal()] = 1;
            arr_v[J.b.b.ordinal()] = 2;
            arr_v[J.b.c.ordinal()] = 3;
            arr_v[J.b.j.ordinal()] = 4;
            arr_v[J.b.k.ordinal()] = 5;
            b.a = arr_v;
        }
    }

    @l
    public static final a Companion = null;
    @l
    public static final String TAG = "AdsViewModel";
    @l
    private final D dataResult$delegate;
    @l
    private final D dataResultJava$delegate;
    @l
    private static final Gson gson;
    private boolean isLoading;
    @l
    private final AdsRequest request;

    static {
        AdsViewModel.Companion = new a(null);
        AdsViewModel.gson = new Gson();
    }

    public AdsViewModel(@l AdsRequest adsRequest0) {
        static final class c extends N implements A3.a {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(0);
            }

            @l
            public final MutableLiveData b() {
                return new MutableLiveData();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class d extends N implements A3.a {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(0);
            }

            @l
            public final MutableLiveData b() {
                return new MutableLiveData();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(adsRequest0, "request");
        super();
        this.request = adsRequest0;
        this.dataResult$delegate = E.a(c.e);
        this.dataResultJava$delegate = E.a(d.e);
    }

    private final AdRequestBody buildAdRequestBody(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v) {
        ArrayList arrayList0 = this.oneItemList(new PlacementGroup(this.oneItemList(new Placement("gmt_widget", "1000")), v, "/dynamic_affiliates", this.oneItemList("1757089380528"), new Property(s, (s3 == null ? "" : s3), s4, (s2 == null ? "" : s2))));
        Raw raw0 = this.strRaw("1.3.0");
        Raw raw1 = this.strRaw(com.coupang.ads.a.o.b().c());
        return new AdRequestBody("offsite-sdk-" + System.currentTimeMillis(), arrayList0, new RawParameter(raw0, this.strRaw(com.coupang.ads.a.o.b().n()), raw1, this.strRaw(s1), this.strRaw(O.a.a.a()), this.strRaw(com.coupang.ads.a.o.b().i().g()), this.strRaw(com.coupang.ads.a.o.b().i().c()), this.strRaw(com.coupang.ads.a.o.b().i().e()), this.strRaw(String.valueOf(com.coupang.ads.a.o.b().i().a())), this.strRaw(com.coupang.ads.a.o.b().i().f()), this.strRaw("Android"), this.strRaw(com.coupang.ads.a.o.b().i().i()), this.strRaw(com.coupang.ads.a.o.b().e().a()), this.strRaw(com.coupang.ads.a.o.b().e().b()), this.strRaw(com.coupang.ads.a.o.b().e().c()), this.strRaw(s5), this.strRaw(s6), this.strRaw(s7)));
    }

    static AdRequestBody buildAdRequestBody$default(AdsViewModel adsViewModel0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildAdRequestBody");
        }
        return (v1 & 0x100) == 0 ? adsViewModel0.buildAdRequestBody(s, s1, s2, s3, s4, s5, s6, s7, v) : adsViewModel0.buildAdRequestBody(s, s1, s2, s3, s4, s5, s6, s7, 1);
    }

    public void checkParameters(@m String s) throws com.coupang.ads.b {
        if(this.request.getWidgetId().length() == 0 && com.coupang.ads.a.o.b().f()) {
            throw new com.coupang.ads.b(this.request, this.request + " checkBaseParameters empty widgetId", null, 0, 12, null);
        }
        String s1 = com.coupang.ads.a.o.b().c();
        if(s1 == null || s1.length() == 0) {
            throw new com.coupang.ads.b(this.request, this.request + " checkBaseParameters empty affiliateId and adToken", null, 0, 12, null);
        }
        if(O.a.a.a().length() == 0 && (s == null || s.length() == 0)) {
            throw new com.coupang.ads.b(this.request, this.request + " Failed to get Android ADID && couToken", null, 0, 12, null);
        }
    }

    @l
    public final MutableLiveData getDataResult() {
        return (MutableLiveData)this.dataResult$delegate.getValue();
    }

    @l
    public final MutableLiveData getDataResultJava() {
        return (MutableLiveData)this.dataResultJava$delegate.getValue();
    }

    @l
    public final AdsRequest getRequest() {
        return this.request;
    }

    private final RequestBody getRequestBody(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v) {
        AdRequestBody adRequestBody0 = this.buildAdRequestBody(s, s1, s2, s3, s4, s5, s6, s7, v);
        RequestBody requestBody0 = com.coupang.ads.network.b.a(AdsViewModel.gson.D(adRequestBody0));
        L.o(requestBody0, "toRequestBody(\n         …)\n            )\n        )");
        return requestBody0;
    }

    static RequestBody getRequestBody$default(AdsViewModel adsViewModel0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequestBody");
        }
        return (v1 & 0x100) == 0 ? adsViewModel0.getRequestBody(s, s1, s2, s3, s4, s5, s6, s7, v) : adsViewModel0.getRequestBody(s, s1, s2, s3, s4, s5, s6, s7, 1);
    }

    private final void handleResult(Object object0) {
        this.getDataResult().o(e0.a(object0));
        this.getDataResultJava().o(new M.a(object0));
    }

    protected final boolean isLoading() {
        return this.isLoading;
    }

    public final void loadAdData() {
        @f(c = "com.coupang.ads.viewmodels.AdsViewModel$loadAdData$1", f = "AdsViewModel.kt", i = {0}, l = {59}, m = "invokeSuspend", n = {"clock"}, s = {"J$0"})
        static final class e extends o implements A3.o {
            long k;
            int l;
            final AdsViewModel m;

            e(AdsViewModel adsViewModel0, kotlin.coroutines.d d0) {
                this.m = adsViewModel0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new e(this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.coupang.ads.viewmodels.AdsViewModel$loadAdData$1$result$1", f = "AdsViewModel.kt", i = {}, l = {0x3F}, m = "invokeSuspend", n = {}, s = {})
                static final class com.coupang.ads.viewmodels.AdsViewModel.e.a extends o implements A3.o {
                    Object k;
                    int l;
                    final AdsViewModel m;

                    com.coupang.ads.viewmodels.AdsViewModel.e.a(AdsViewModel adsViewModel0, kotlin.coroutines.d d0) {
                        this.m = adsViewModel0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.coupang.ads.viewmodels.AdsViewModel.e.a(this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.coupang.ads.viewmodels.AdsViewModel.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        AdsViewModel adsViewModel1;
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.l) {
                            case 0: {
                                f0.n(object0);
                                AdsViewModel adsViewModel0 = this.m;
                                try {
                                    Object object2 = com.coupang.ads.coupangapp.d.e(com.coupang.ads.a.o.b().b(), null, 1, null);
                                    if(e0.i(object2)) {
                                        object2 = null;
                                    }
                                    adsViewModel0.checkParameters((((com.coupang.ads.coupangapp.f)object2) == null ? null : ((com.coupang.ads.coupangapp.f)object2).n()));
                                    String s = ((com.coupang.ads.coupangapp.f)object2) == null ? null : ((com.coupang.ads.coupangapp.f)object2).n();
                                    String s1 = ((com.coupang.ads.coupangapp.f)object2) == null ? null : ((com.coupang.ads.coupangapp.f)object2).o();
                                    this.k = adsViewModel0;
                                    this.l = 1;
                                    Object object3 = adsViewModel0.requestData(s, s1, this);
                                    if(object3 == object1) {
                                        return object1;
                                    }
                                    adsViewModel1 = adsViewModel0;
                                    object0 = object3;
                                    goto label_21;
                                }
                                catch(Throwable throwable0) {
                                    break;
                                }
                            }
                            case 1: {
                                adsViewModel1 = (AdsViewModel)this.k;
                                try {
                                    f0.n(object0);
                                label_21:
                                    List list0 = ((AdsDto)object0).getPlacementGroups();
                                    if(list0 != null) {
                                        for(Object object4: list0) {
                                            ImpressionDetails impressionDetails0 = ((PlacementGroupInfo)object4).getProperties();
                                            h.g((impressionDetails0 == null ? null : impressionDetails0.getLoading_impression_url()));
                                        }
                                    }
                                    return e0.a(e0.b(adsViewModel1.parseData(((AdsDto)object0))));
                                }
                                catch(Throwable throwable0) {
                                    break;
                                }
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        return e0.a(e0.b(f0.a(throwable0)));
                    }
                }

                long v1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        long v = SystemClock.elapsedRealtime();
                        com.coupang.ads.clog.b.a.a("AdsViewModel", this.m.getRequest() + " start load");
                        com.coupang.ads.viewmodels.AdsViewModel.e.a adsViewModel$e$a0 = new com.coupang.ads.viewmodels.AdsViewModel.e.a(this.m, null);
                        this.k = v;
                        this.l = 1;
                        object0 = i.h(h0.c(), adsViewModel$e$a0, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        v1 = v;
                        break;
                    }
                    case 1: {
                        v1 = this.k;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                Object object2 = ((e0)object0).l();
                this.m.handleResult(object2);
                long v2 = SystemClock.elapsedRealtime();
                com.coupang.ads.clog.b.a.a("AdsViewModel", this.m.getRequest() + " load complete cost:" + (v2 - v1) + " success:" + e0.j(object2));
                this.m.setLoading(false);
                return S0.a;
            }
        }

        com.coupang.ads.clog.b.a.a("AdsViewModel", this.request + " loadData");
        if(!this.isLoading) {
            this.isLoading = true;
            k.f(ViewModelKt.a(this), null, null, new e(this, null), 3, null);
        }
    }

    public final void observe(@l LifecycleOwner lifecycleOwner0, @l Observer observer0) {
        L.p(lifecycleOwner0, "lifecycleOwner");
        L.p(observer0, "observer");
        this.getDataResult().k(lifecycleOwner0, observer0);
    }

    public final void observeJava(@l LifecycleOwner lifecycleOwner0, @l Observer observer0) {
        L.p(lifecycleOwner0, "lifecycleOwner");
        L.p(observer0, "observer");
        this.getDataResultJava().k(lifecycleOwner0, observer0);
    }

    private final ArrayList oneItemList(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(object0);
        return arrayList0;
    }

    @l
    public DTO parseData(@l AdsDto adsDto0) throws com.coupang.ads.b {
        Object object0;
        L.p(adsDto0, "data");
        Iterator iterator0 = com.coupang.ads.a.o.b().j().iterator();
        while(true) {
            object0 = null;
        label_3:
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            com.coupang.ads.viewmodels.a a0 = (com.coupang.ads.viewmodels.a)object1;
            try {
                object0 = e0.b(a0.a(this.getRequest(), adsDto0));
            }
            catch(Throwable throwable0) {
                object0 = e0.b(f0.a(throwable0));
            }
            if(e0.i(object0)) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_3;
        }
        if(object0 != null) {
            return (DTO)object0;
        }
        com.coupang.ads.clog.b.a.a("AdsViewModel", "failed parse " + adsDto0);
        throw new com.coupang.ads.b(this.request, "Data is empty", null, 0, 12, null);
    }

    @m
    public Object requestData(@m String s, @m String s1, @l kotlin.coroutines.d d0) {
        return AdsViewModel.requestData$suspendImpl(this, s, s1, d0);
    }

    public static Object requestData$default(AdsViewModel adsViewModel0, String s, String s1, kotlin.coroutines.d d0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestData");
        }
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        return adsViewModel0.requestData(s, s1, d0);
    }

    static Object requestData$suspendImpl(AdsViewModel adsViewModel0, String s, String s1, kotlin.coroutines.d d0) {
        String s5;
        com.coupang.ads.network.api.a a0 = com.coupang.ads.a.o.b().l().a();
        String s2 = adsViewModel0.getRequest().getWidgetId();
        String s3 = adsViewModel0.getRequest().getAffiliatePage();
        String s4 = adsViewModel0.getRequest().getAffiliatePlacement();
        if(adsViewModel0.getRequest().getCreativeSize() == J.b.k) {
            s5 = "INTERSTITIAL";
        }
        else {
            s5 = adsViewModel0.getRequest().getAdsMode() == J.d.b ? "CAROUSEL" : "BANNER";
        }
        String s6 = adsViewModel0.sizeString(adsViewModel0.getRequest().getCreativeSize());
        String s7 = adsViewModel0.getRequest().getPuid();
        return adsViewModel0.getRequest().getAdsMode() == J.d.b ? a0.b(adsViewModel0.getRequestBody(s2, s3, s4, s5, s6, s7, s, s1, 10), d0) : a0.b(adsViewModel0.getRequestBody(s2, s3, s4, s5, s6, s7, s, s1, 1), d0);
    }

    protected final void setLoading(boolean z) {
        this.isLoading = z;
    }

    private final String sizeString(J.b b0) {
        switch((b0 == null ? -1 : b.a[b0.ordinal()])) {
            case 1: {
                return "320x50";
            }
            case 2: {
                return "320x100";
            }
            case 3: {
                return "300x250";
            }
            case 4: {
                com.coupang.ads.a a1 = com.coupang.ads.a.o.b();
                Context context2 = a1.m();
                Point point2 = a1.i().d();
                int v1 = P.c.a.s(context2, point2.x);
                if(v1 <= 400) {
                    return v1 + "x32";
                }
                return v1 > 720 ? v1 + "x90" : v1 + "x50";
            }
            case 5: {
                com.coupang.ads.a a0 = com.coupang.ads.a.o.b();
                Context context0 = a0.m();
                Point point0 = a0.i().d();
                int v = P.c.a.s(context0, point0.x);
                Context context1 = a0.m();
                Point point1 = a0.i().d();
                return v + 'x' + P.c.a.s(context1, point1.y);
            }
            default: {
                return "";
            }
        }
    }

    private final Raw strRaw(String s) {
        if(s == null) {
            s = "";
        }
        return new Raw(this.oneItemList(s));
    }
}

