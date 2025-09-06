package com.kakao.adfit.ads.na;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.kakao.adfit.a.c;
import com.kakao.adfit.a.d;
import com.kakao.adfit.a.p;
import com.kakao.adfit.ads.R.drawable;
import com.kakao.adfit.ads.media.MediaAdView;
import com.kakao.adfit.e.k;
import com.kakao.adfit.m.J;
import com.kakao.adfit.m.f;
import com.kakao.adfit.m.g;
import com.kakao.adfit.m.m;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;

public final class b {
    static final class a extends k implements com.kakao.adfit.ads.na.AdFitNativeAdView.b {
        private final String b;
        private final com.kakao.adfit.ads.na.AdFitNativeAdView.a c;
        private final g d;
        private final J e;
        private m f;
        private m g;
        private final long h;
        private long i;

        public a(AdFitNativeAdView adFitNativeAdView0, String s, c c0, p p0) {
            static final class com.kakao.adfit.ads.na.b.a.a extends N implements Function1 {
                final a a;
                final c b;
                final AdFitNativeAdView c;

                com.kakao.adfit.ads.na.b.a.a(a b$a0, c c0, AdFitNativeAdView adFitNativeAdView0) {
                    this.a = b$a0;
                    this.b = c0;
                    this.c = adFitNativeAdView0;
                    super(1);
                }

                public final void a(float f) {
                    static final class com.kakao.adfit.ads.na.b.a.a.a extends N implements A3.a {
                        final AdFitNativeAdView a;
                        final c b;

                        com.kakao.adfit.ads.na.b.a.a.a(AdFitNativeAdView adFitNativeAdView0, c c0) {
                            this.a = adFitNativeAdView0;
                            this.b = c0;
                            super(0);
                        }

                        public final d a() {
                            return d.b.a(this.a, this.b);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.a();
                        }
                    }

                    if(f > 0.0f) {
                        m m0 = this.a.f;
                        if(m0 != null) {
                            m0.dispose();
                        }
                        this.a.f = null;
                        com.kakao.adfit.ads.na.b.a.a.a b$a$a$a0 = new com.kakao.adfit.ads.na.b.a.a.a(this.c, this.b);
                        this.b.c().a(b$a$a$a0);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((Number)object0).floatValue());
                    return S0.a;
                }
            }


            static final class com.kakao.adfit.ads.na.b.a.b extends N implements A3.a {
                final AdFitNativeAdView a;
                final c b;

                com.kakao.adfit.ads.na.b.a.b(AdFitNativeAdView adFitNativeAdView0, c c0) {
                    this.a = adFitNativeAdView0;
                    this.b = c0;
                    super(0);
                }

                public final d a() {
                    return d.b.a(this.a, this.b);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.a();
                }
            }


            public static final class com.kakao.adfit.ads.na.b.a.c extends N implements Function1 {
                final J a;
                final a b;
                final c c;
                final AdFitNativeAdView d;

                public com.kakao.adfit.ads.na.b.a.c(J j0, a b$a0, c c0, AdFitNativeAdView adFitNativeAdView0) {
                    this.a = j0;
                    this.b = b$a0;
                    this.c = c0;
                    this.d = adFitNativeAdView0;
                    super(1);
                }

                public final void a(float f) {
                    if(f >= this.a.c) {
                        long v = SystemClock.elapsedRealtime();
                        if(this.b.i <= 0L) {
                            this.b.i = v;
                            return;
                        }
                        if(v - this.b.i >= this.b.h) {
                            m m0 = this.b.g;
                            if(m0 != null) {
                                m0.dispose();
                            }
                            this.b.g = null;
                            com.kakao.adfit.ads.na.b.a.b b$a$b0 = new com.kakao.adfit.ads.na.b.a.b(this.d, this.c);
                            this.c.d().a(b$a$b0);
                        }
                    }
                    else {
                        this.b.i = 0L;
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((Number)object0).floatValue());
                    return S0.a;
                }
            }


            static final class com.kakao.adfit.ads.na.b.a.d extends N implements A3.a {
                final a a;

                com.kakao.adfit.ads.na.b.a.d(a b$a0) {
                    this.a = b$a0;
                    super(0);
                }

                public final void a() {
                    this.a.j();
                }

                @Override  // A3.a
                public Object invoke() {
                    this.a();
                    return S0.a;
                }
            }

            L.p(adFitNativeAdView0, "view");
            long v;
            float f;
            L.p(s, "layoutName");
            L.p(c0, "event");
            super();
            this.b = s;
            com.kakao.adfit.ads.na.AdFitNativeAdView.a adFitNativeAdView$a0 = adFitNativeAdView0.getDelegate$library_networkRelease();
            this.c = adFitNativeAdView$a0;
            g g0 = new g(new com.kakao.adfit.ads.na.b.a.d(this));
            this.d = g0;
            if(p0 == null) {
                f = 0.5f;
            }
            else {
                Float float0 = p0.a();
                f = float0 == null ? 0.5f : ((float)float0);
            }
            J j0 = new J(s, adFitNativeAdView0, f, 0.0f, 0L, 24, null);
            this.e = j0;
            if(p0 == null) {
                v = 1000L;
            }
            else {
                Long long0 = p0.b();
                v = long0 == null ? 1000L : ((long)long0);
            }
            this.h = v;
            if(!c0.c().e()) {
                this.f = j0.a(new com.kakao.adfit.ads.na.b.a.a(this, c0, adFitNativeAdView0));
            }
            if(!c0.d().e()) {
                this.g = j0.a(new com.kakao.adfit.ads.na.b.a.c(j0, this, c0, adFitNativeAdView0));
            }
            adFitNativeAdView$a0.a(this);
            this.e();
            if(!g0.d()) {
                f.d((s + " is background state."));
            }
        }

        @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$b
        public void a() {
            boolean z = this.c.f();
            this.d.f(z);
        }

        @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$b
        public void b() {
            boolean z = this.c.e();
            this.d.e(z);
        }

        @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$b
        public void c() {
            boolean z = this.c.a();
            this.d.d(z);
        }

        @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$b
        public void d() {
            boolean z = this.c.c() > 0 && this.c.d() > 0;
            this.d.c(z);
        }

        @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$b
        public void e() {
            boolean z = this.c.b();
            if(this.d.c() == z) {
                return;
            }
            this.d.a(z);
            if(z) {
                boolean z1 = this.c.e();
                this.d.e(z1);
                boolean z2 = this.c.f();
                this.d.f(z2);
                boolean z3 = this.c.a();
                this.d.d(z3);
                boolean z4 = this.c.c() > 0 && this.c.d() > 0;
                this.d.c(z4);
            }
        }

        @Override  // com.kakao.adfit.e.k
        protected void g() {
            this.c.a(null);
            m m0 = this.f;
            if(m0 != null) {
                m0.dispose();
            }
            this.f = null;
            m m1 = this.g;
            if(m1 != null) {
                m1.dispose();
            }
            this.g = null;
        }

        public final J i() {
            return this.e;
        }

        private final void j() {
            boolean z = this.d.d();
            if(z) {
                f.d((this.b + " is foreground state."));
            }
            else {
                f.d((this.b + " is background state."));
            }
            this.e.a(z);
        }
    }

    static final class com.kakao.adfit.ads.na.b.b extends k {
        private final MediaAdView b;
        private final i c;

        public com.kakao.adfit.ads.na.b.b(MediaAdView mediaAdView0, com.kakao.adfit.ads.na.m.b m$b0, String s, com.kakao.adfit.ads.na.d d0) {
            static final class com.kakao.adfit.ads.na.b.b.a extends o implements A3.o {
                int a;
                final com.kakao.adfit.ads.na.d b;
                final String c;
                final com.kakao.adfit.ads.na.b.b d;

                com.kakao.adfit.ads.na.b.b.a(com.kakao.adfit.ads.na.d d0, String s, com.kakao.adfit.ads.na.b.b b$b0, kotlin.coroutines.d d1) {
                    this.b = d0;
                    this.c = s;
                    this.d = b$b0;
                    super(2, d1);
                }

                public final Object a(O o0, kotlin.coroutines.d d0) {
                    return ((com.kakao.adfit.ads.na.b.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                    return new com.kakao.adfit.ads.na.b.b.a(this.b, this.c, this.d, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((O)object0), ((kotlin.coroutines.d)object1));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object object0) {
                    Object object1 = kotlin.coroutines.intrinsics.b.l();
                    switch(this.a) {
                        case 0: {
                            f0.n(object0);
                            this.a = 1;
                            object0 = com.kakao.adfit.ads.na.d.a(this.b, this.c, 0L, this, 2, null);
                            if(object0 == object1) {
                                return object1;
                            }
                            break;
                        }
                        case 1: {
                            f0.n(object0);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    if(((Bitmap)object0) != null && this.d.f()) {
                        this.d.a(((Bitmap)object0));
                    }
                    return S0.a;
                }
            }

            L.p(mediaAdView0, "view");
            L.p(m$b0, "image");
            L.p(d0, "imageContainer");
            super();
            this.b = mediaAdView0;
            i i0 = new i(mediaAdView0, m$b0);
            this.c = i0;
            String s1 = m$b0.b();
            Bitmap bitmap0 = d0.a(s1);
            if(bitmap0 == null) {
                kotlinx.coroutines.k.f(P.a(j1.c(null, 1, null).plus(h0.e().u1())), null, null, new com.kakao.adfit.ads.na.b.b.a(d0, s1, this, null), 3, null);
            }
            else {
                this.a(bitmap0);
            }
            mediaAdView0.setViewModel(i0);
            mediaAdView0.setContentDescription(s);
        }

        private final void a(Bitmap bitmap0) {
            BitmapDrawable bitmapDrawable0 = new BitmapDrawable(this.b.getResources(), bitmap0);
            this.c.a(bitmapDrawable0);
        }

        @Override  // com.kakao.adfit.e.k
        protected void g() {
            this.b.setViewModel(null);
        }
    }

    static final class com.kakao.adfit.ads.na.b.c extends k {
        private final MediaAdView b;
        private com.kakao.adfit.ads.na.p c;
        private m d;

        public com.kakao.adfit.ads.na.b.c(MediaAdView mediaAdView0, com.kakao.adfit.ads.na.m.f m$f0, String s, com.kakao.adfit.c.b b0, c c0, J j0, com.kakao.adfit.ads.na.d d0) {
            static final class com.kakao.adfit.ads.na.b.c.a extends o implements A3.o {
                int a;
                final com.kakao.adfit.ads.na.d b;
                final String c;
                final com.kakao.adfit.ads.na.b.c d;

                com.kakao.adfit.ads.na.b.c.a(com.kakao.adfit.ads.na.d d0, String s, com.kakao.adfit.ads.na.b.c b$c0, kotlin.coroutines.d d1) {
                    this.b = d0;
                    this.c = s;
                    this.d = b$c0;
                    super(2, d1);
                }

                public final Object a(O o0, kotlin.coroutines.d d0) {
                    return ((com.kakao.adfit.ads.na.b.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                    return new com.kakao.adfit.ads.na.b.c.a(this.b, this.c, this.d, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((O)object0), ((kotlin.coroutines.d)object1));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object object0) {
                    Object object1 = kotlin.coroutines.intrinsics.b.l();
                    switch(this.a) {
                        case 0: {
                            f0.n(object0);
                            this.a = 1;
                            object0 = com.kakao.adfit.ads.na.d.a(this.b, this.c, 0L, this, 2, null);
                            if(object0 == object1) {
                                return object1;
                            }
                            break;
                        }
                        case 1: {
                            f0.n(object0);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    if(((Bitmap)object0) != null && this.d.f()) {
                        this.d.a(((Bitmap)object0));
                    }
                    return S0.a;
                }
            }


            public static final class com.kakao.adfit.ads.na.b.c.b extends N implements Function1 {
                final J a;
                final c b;
                final com.kakao.adfit.ads.na.b.c c;

                public com.kakao.adfit.ads.na.b.c.b(J j0, c c0, com.kakao.adfit.ads.na.b.c b$c0) {
                    this.a = j0;
                    this.b = c0;
                    this.c = b$c0;
                    super(1);
                }

                public final void a(float f) {
                    boolean z = this.b.d().e() && f >= this.a.c;
                    this.c.c.a(z);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((Number)object0).floatValue());
                    return S0.a;
                }
            }

            L.p(mediaAdView0, "view");
            L.p(m$f0, "video");
            L.p(b0, "policy");
            L.p(c0, "event");
            L.p(j0, "viewableTracker");
            L.p(d0, "imageContainer");
            super();
            this.b = mediaAdView0;
            Context context0 = mediaAdView0.getContext();
            L.o(context0, "view.context");
            this.c = new com.kakao.adfit.ads.na.p(context0, mediaAdView0, m$f0, b0);
            com.kakao.adfit.ads.na.m.b m$b0 = m$f0.b();
            String s1 = m$b0 == null ? null : m$b0.b();
            if(s1 != null) {
                Bitmap bitmap0 = d0.a(s1);
                if(bitmap0 == null) {
                    kotlinx.coroutines.k.f(P.a(j1.c(null, 1, null).plus(h0.e().u1())), null, null, new com.kakao.adfit.ads.na.b.c.a(d0, s1, this, null), 3, null);
                }
                else {
                    this.a(bitmap0);
                }
            }
            mediaAdView0.setViewModel(this.c);
            mediaAdView0.setContentDescription(s);
            this.d = j0.a(new com.kakao.adfit.ads.na.b.c.b(j0, c0, this));
        }

        private final void a(Bitmap bitmap0) {
            this.c.a(new BitmapDrawable(this.b.getResources(), bitmap0));
        }

        @Override  // com.kakao.adfit.e.k
        protected void g() {
            this.b.setViewModel(null);
            this.c.u();
            m m0 = this.d;
            if(m0 != null) {
                m0.dispose();
            }
            this.d = null;
        }
    }

    private final AdFitNativeAdLayout a;
    private final com.kakao.adfit.ads.na.m b;
    private final ArrayList c;
    private final com.kakao.adfit.e.a d;
    private final Function1 e;
    private final Function1 f;
    private final J g;

    public b(AdFitNativeAdBinder adFitNativeAdBinder0, AdFitNativeAdLayout adFitNativeAdLayout0, com.kakao.adfit.ads.na.m m0, com.kakao.adfit.ads.na.d d0, com.kakao.adfit.c.b b0, int v) {
        static final class com.kakao.adfit.ads.na.b.d extends N implements Function1 {
            public static final com.kakao.adfit.ads.na.b.d a;

            static {
                com.kakao.adfit.ads.na.b.d.a = new com.kakao.adfit.ads.na.b.d();
            }

            com.kakao.adfit.ads.na.b.d() {
                super(1);
            }

            public final Boolean a(String s) {
                L.p(s, "<anonymous parameter 0>");
                return false;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((String)object0));
            }
        }


        static final class e extends N implements Function1 {
            final AdFitNativeAdBinder a;

            e(AdFitNativeAdBinder adFitNativeAdBinder0) {
                this.a = adFitNativeAdBinder0;
                super(1);
            }

            public final void a(View view0) {
                L.p(view0, "v");
                com.kakao.adfit.common.matrix.c c0 = com.kakao.adfit.common.matrix.c.a;
                try {
                    OnAdClickListener adFitNativeAdBinder$OnAdClickListener0 = this.a.getOnAdClickListener();
                    if(adFitNativeAdBinder$OnAdClickListener0 != null) {
                        adFitNativeAdBinder$OnAdClickListener0.onAdClicked(view0);
                    }
                }
                catch(Throwable throwable0) {
                    throw c0.b(throwable0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((View)object0));
                return S0.a;
            }
        }

        L.p(adFitNativeAdBinder0, "binder");
        L.p(adFitNativeAdLayout0, "layout");
        L.p(m0, "ad");
        L.p(d0, "imageContainer");
        L.p(b0, "videoPlayPolicy");
        super();
        this.a = adFitNativeAdLayout0;
        this.b = m0;
        ArrayList arrayList0 = new ArrayList();
        this.c = arrayList0;
        this.d = new com.kakao.adfit.e.a();
        this.e = com.kakao.adfit.ads.na.b.d.a;
        this.f = new e(adFitNativeAdBinder0);
        a b$a0 = this.a(adFitNativeAdLayout0.getContainerView(), adFitNativeAdLayout0.getName$library_networkRelease(), m0);
        this.g = b$a0.i();
        arrayList0.add(b$a0);
        ImageView imageView0 = adFitNativeAdLayout0.getContainerView().getDelegate$library_networkRelease().g();
        arrayList0.add(this.a(imageView0, d0, m0.a(), drawable.adfit_icon_ad_info));
        arrayList0.add(this.a(imageView0));
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
        L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).gravity = v;
        imageView0.requestLayout();
        View view0 = adFitNativeAdLayout0.getTitleView();
        ViewGroup viewGroup0 = null;
        TextView textView0 = view0 instanceof TextView ? ((TextView)view0) : null;
        if(textView0 != null) {
            arrayList0.add(this.a(textView0, m0.m()));
            arrayList0.add(this.b(textView0));
        }
        View view1 = adFitNativeAdLayout0.getBodyView();
        TextView textView1 = view1 instanceof TextView ? ((TextView)view1) : null;
        if(textView1 != null) {
            arrayList0.add(this.a(textView1, m0.e()));
            arrayList0.add(this.b(textView1));
        }
        View view2 = adFitNativeAdLayout0.getCallToActionButton();
        TextView textView2 = view2 instanceof TextView ? ((TextView)view2) : null;
        if(textView2 != null) {
            arrayList0.add(this.a(textView2, m0.f()));
            arrayList0.add(this.b(textView2));
        }
        View view3 = adFitNativeAdLayout0.getProfileIconView();
        ImageView imageView1 = view3 instanceof ImageView ? ((ImageView)view3) : null;
        if(imageView1 != null) {
            arrayList0.add(b.a(this, imageView1, d0, m0.k(), 0, 4, null));
            arrayList0.add(this.b(imageView1));
        }
        View view4 = adFitNativeAdLayout0.getProfileNameView();
        TextView textView3 = view4 instanceof TextView ? ((TextView)view4) : null;
        if(textView3 != null) {
            arrayList0.add(this.a(textView3, m0.l()));
            arrayList0.add(this.b(textView3));
        }
        View view5 = adFitNativeAdLayout0.getMediaView();
        if(view5 instanceof ViewGroup) {
            viewGroup0 = (ViewGroup)view5;
        }
        if(viewGroup0 != null) {
            viewGroup0.removeAllViews();
            Context context0 = viewGroup0.getContext();
            L.o(context0, "mediaView.context");
            MediaAdView mediaAdView0 = new MediaAdView(context0, null, 0, 6, null);
            com.kakao.adfit.ads.na.m.d m$d0 = m0.i();
            if(m$d0 instanceof com.kakao.adfit.ads.na.m.b) {
                arrayList0.add(this.a(mediaAdView0, d0, ((com.kakao.adfit.ads.na.m.b)m0.i())));
                arrayList0.add(this.b(mediaAdView0));
            }
            else if(m$d0 instanceof com.kakao.adfit.ads.na.m.f) {
                arrayList0.add(this.a(mediaAdView0, d0, b0, ((com.kakao.adfit.ads.na.m.f)m0.i())));
            }
            viewGroup0.addView(mediaAdView0);
        }
    }

    private final a a(AdFitNativeAdView adFitNativeAdView0, String s, com.kakao.adfit.ads.na.m m0) {
        return new a(adFitNativeAdView0, s, m0.g(), m0.n());
    }

    private final com.kakao.adfit.ads.na.b.b a(MediaAdView mediaAdView0, com.kakao.adfit.ads.na.d d0, com.kakao.adfit.ads.na.m.b m$b0) {
        return new com.kakao.adfit.ads.na.b.b(mediaAdView0, m$b0, this.b.d(), d0);
    }

    private final com.kakao.adfit.ads.na.b.c a(MediaAdView mediaAdView0, com.kakao.adfit.ads.na.d d0, com.kakao.adfit.c.b b0, com.kakao.adfit.ads.na.m.f m$f0) {
        return new com.kakao.adfit.ads.na.b.c(mediaAdView0, m$f0, this.b.d(), b0, this.b.g(), this.g, d0);
    }

    private final com.kakao.adfit.ads.na.e a(ImageView imageView0, com.kakao.adfit.ads.na.d d0, com.kakao.adfit.ads.na.m.b m$b0, int v) {
        return new com.kakao.adfit.ads.na.e(imageView0, m$b0, v, 0, d0);
    }

    static j a(b b0, ImageView imageView0, com.kakao.adfit.ads.na.d d0, com.kakao.adfit.ads.na.m.b m$b0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        return b0.b(imageView0, d0, m$b0, v);
    }

    private final com.kakao.adfit.ads.na.o a(TextView textView0, com.kakao.adfit.ads.na.m.e m$e0) {
        return new com.kakao.adfit.ads.na.o(textView0, m$e0);
    }

    private final com.kakao.adfit.e.b a(View view0) {
        return new com.kakao.adfit.e.b(view0, this.b.b(), this.d, this.e);
    }

    public final AdFitNativeAdLayout a() {
        return this.a;
    }

    private final j b(ImageView imageView0, com.kakao.adfit.ads.na.d d0, com.kakao.adfit.ads.na.m.b m$b0, int v) {
        return new j(imageView0, m$b0, v, 0, d0);
    }

    private final com.kakao.adfit.e.c b(View view0) {
        String s = this.b.h();
        return new com.kakao.adfit.e.c(view0, this.a.getContainerView(), s, this.b.g(), this.b.g().a().d(), this.d, this.e, this.f);
    }

    public final void b() {
        for(Object object0: this.c) {
            ((k)object0).h();
        }
        this.c.clear();
    }
}

