package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import K2.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.LayoutRes;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.pierfrancescosoffritti.androidyoutubeplayer.R.styleable;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class YouTubePlayerView extends SixteenByNineFrameLayout implements LifecycleEventObserver {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[Event.values().length];
            try {
                arr_v[Event.ON_RESUME.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_STOP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_DESTROY.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_CREATE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_START.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_PAUSE.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Event.ON_ANY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @l
    private final List a;
    @l
    private final b b;
    @l
    private final com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b c;
    private boolean d;

    public YouTubePlayerView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0);
    }

    public YouTubePlayerView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0);
    }

    public YouTubePlayerView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        @s0({"SMAP\nYouTubePlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YouTubePlayerView.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView$webViewFullscreenListener$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n1855#2,2:241\n1855#2,2:243\n*S KotlinDebug\n*F\n+ 1 YouTubePlayerView.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView$webViewFullscreenListener$1\n*L\n47#1:241,2\n54#1:243,2\n*E\n"})
        public static final class b implements K2.b {
            final YouTubePlayerView a;

            b(YouTubePlayerView youTubePlayerView0) {
                this.a = youTubePlayerView0;
                super();
            }

            @Override  // K2.b
            public void a() {
                if(this.a.a.isEmpty()) {
                    throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
                }
                for(Object object0: this.a.a) {
                    ((K2.b)object0).a();
                }
            }

            @Override  // K2.b
            public void b(@l View view0, @l A3.a a0) {
                L.p(view0, "fullscreenView");
                L.p(a0, "exitFullscreen");
                if(this.a.a.isEmpty()) {
                    throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
                }
                for(Object object0: this.a.a) {
                    ((K2.b)object0).b(view0, a0);
                }
            }
        }


        public static final class c extends K2.a {
            final String a;
            final YouTubePlayerView b;
            final boolean c;

            c(String s, YouTubePlayerView youTubePlayerView0, boolean z) {
                this.a = s;
                this.b = youTubePlayerView0;
                this.c = z;
                super();
            }

            @Override  // K2.a
            public void d(@l J2.c c0) {
                L.p(c0, "youTubePlayer");
                String s = this.a;
                if(s != null) {
                    h.b(c0, this.b.c.getCanPlay$core_release() && this.c, s, 0.0f);
                }
                c0.h(this);
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = new ArrayList();
        b youTubePlayerView$b0 = new b(this);
        this.b = youTubePlayerView$b0;
        com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b b0 = new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b(context0, youTubePlayerView$b0, null, 0, 12, null);
        this.c = b0;
        this.addView(b0, g.b());
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.YouTubePlayerView, 0, 0);
        L.o(typedArray0, "context.theme.obtainStyl….YouTubePlayerView, 0, 0)");
        this.d = typedArray0.getBoolean(styleable.YouTubePlayerView_enableAutomaticInitialization, true);
        boolean z = typedArray0.getBoolean(styleable.YouTubePlayerView_autoPlay, false);
        boolean z1 = typedArray0.getBoolean(styleable.YouTubePlayerView_handleNetworkEvents, true);
        String s = typedArray0.getString(styleable.YouTubePlayerView_videoId);
        typedArray0.recycle();
        if(z && s == null) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
        }
        c youTubePlayerView$c0 = new c(s, this, z);
        if(this.d) {
            b0.i(youTubePlayerView$c0, z1, L2.a.b.a());
        }
    }

    public YouTubePlayerView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public YouTubePlayerView(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public final boolean c(@l K2.b b0) {
        L.p(b0, "fullscreenListener");
        return this.a.add(b0);
    }

    public final boolean d(@l d d0) {
        L.p(d0, "youTubePlayerListener");
        return this.c.getWebViewYouTubePlayer$core_release().c(d0);
    }

    public final void e(boolean z) {
        this.c.d(z);
    }

    public final void f(@l K2.c c0) {
        L.p(c0, "youTubePlayerCallback");
        this.c.e(c0);
    }

    @l
    public final View g(@LayoutRes int v) {
        return this.c.f(v);
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.d;
    }

    public final void h(@l d d0) {
        L.p(d0, "youTubePlayerListener");
        if(this.d) {
            throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set \'enableAutomaticInitialization\' to false.");
        }
        this.c.h(d0, true);
    }

    public final void i(@l d d0, @l L2.a a0) {
        L.p(d0, "youTubePlayerListener");
        L.p(a0, "playerOptions");
        if(this.d) {
            throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set \'enableAutomaticInitialization\' to false.");
        }
        this.c.i(d0, true, a0);
    }

    public final void j(@l d d0, boolean z) {
        L.p(d0, "youTubePlayerListener");
        if(this.d) {
            throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set \'enableAutomaticInitialization\' to false.");
        }
        this.c.i(d0, z, L2.a.b.a());
    }

    public final void k(@l d d0, boolean z, @l L2.a a0) {
        L.p(d0, "youTubePlayerListener");
        L.p(a0, "playerOptions");
        if(this.d) {
            throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set \'enableAutomaticInitialization\' to false.");
        }
        this.c.i(d0, z, a0);
    }

    public final void l() {
        this.u(-1, -1);
    }

    private final void o() {
        this.c.l();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        switch(lifecycle$Event0) {
            case 1: {
                this.o();
                return;
            }
            case 2: {
                this.p();
                return;
            }
            case 3: {
                this.q();
            }
        }
    }

    private final void p() {
        this.c.o();
    }

    public final void q() {
        this.c.p();
    }

    public final boolean s(@l K2.b b0) {
        L.p(b0, "fullscreenListener");
        return this.a.remove(b0);
    }

    public final void setCustomPlayerUi(@l View view0) {
        L.p(view0, "view");
        this.c.setCustomPlayerUi(view0);
    }

    public final void setEnableAutomaticInitialization(boolean z) {
        this.d = z;
    }

    public final boolean t(@l d d0) {
        L.p(d0, "youTubePlayerListener");
        return this.c.getWebViewYouTubePlayer$core_release().g(d0);
    }

    private final void u(int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        viewGroup$LayoutParams0.width = v;
        viewGroup$LayoutParams0.height = v1;
        this.setLayoutParams(viewGroup$LayoutParams0);
    }

    public final void v() {
        this.u(-1, -2);
    }
}

