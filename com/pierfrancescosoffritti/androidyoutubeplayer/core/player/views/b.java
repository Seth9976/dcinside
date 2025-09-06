package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import A3.a;
import J2.a.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.LayoutRes;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.f;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class b extends SixteenByNineFrameLayout {
    @l
    private final c a;
    @l
    private final com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b b;
    @l
    private final f c;
    private boolean d;
    @l
    private a e;
    @l
    private final Set f;
    private boolean g;

    public b(@l Context context0) {
        L.p(context0, "context");
        this(context0, com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.a.a, null, 0);
    }

    public b(@l Context context0, @l K2.b b0, @m AttributeSet attributeSet0, int v) {
        public static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.a extends K2.a {
            final b a;

            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.a(b b0) {
                this.a = b0;
                super();
            }

            @Override  // K2.a
            public void f(@l J2.c c0, @l d a$d0) {
                L.p(c0, "youTubePlayer");
                L.p(a$d0, "state");
                if(a$d0 == d.d && !this.a.j()) {
                    c0.pause();
                }
            }
        }


        @s0({"SMAP\nLegacyYouTubePlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyYouTubePlayerView.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n1855#2,2:202\n*S KotlinDebug\n*F\n+ 1 LegacyYouTubePlayerView.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView$2\n*L\n64#1:202,2\n*E\n"})
        public static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.b extends K2.a {
            final b a;

            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.b(b b0) {
                this.a = b0;
                super();
            }

            @Override  // K2.a
            public void d(@l J2.c c0) {
                L.p(c0, "youTubePlayer");
                this.a.setYouTubePlayerReady$core_release(true);
                for(Object object0: this.a.f) {
                    ((K2.c)object0).a(c0);
                }
                this.a.f.clear();
                c0.h(this);
            }
        }


        public static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.c implements com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.a {
            final b a;

            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.c(b b0) {
                this.a = b0;
                super();
            }

            @Override  // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b$a
            public void a() {
            }

            @Override  // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b$a
            public void b() {
                if(!this.a.k()) {
                    this.a.e.invoke();
                    return;
                }
                this.a.c.m(this.a.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release());
            }
        }


        static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.d extends N implements a {
            public static final com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.d e;

            static {
                com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.d.e = new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.d();
            }

            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.d() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }

        L.p(context0, "context");
        L.p(b0, "listener");
        super(context0, attributeSet0, v);
        c c0 = new c(context0, b0, null, 0, 12, null);
        this.a = c0;
        Context context1 = context0.getApplicationContext();
        L.o(context1, "context.applicationContext");
        com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b b1 = new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b(context1);
        this.b = b1;
        f f0 = new f();
        this.c = f0;
        this.e = com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.d.e;
        this.f = new LinkedHashSet();
        this.g = true;
        this.addView(c0, new FrameLayout.LayoutParams(-1, -1));
        c0.c(f0);
        c0.c(new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.a(this));
        c0.c(new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.b(this));
        b1.d().add(new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.c(this));
    }

    public b(Context context0, K2.b b0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 4) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(context0, b0, attributeSet0, v);
    }

    public final void d(boolean z) {
        this.a.setBackgroundPlaybackEnabled$core_release(z);
    }

    public final void e(@l K2.c c0) {
        L.p(c0, "youTubePlayerCallback");
        if(this.d) {
            c0.a(this.a.getYoutubePlayer$core_release());
            return;
        }
        this.f.add(c0);
    }

    @l
    public final View f(@LayoutRes int v) {
        this.removeViews(1, this.getChildCount() - 1);
        View view0 = View.inflate(this.getContext(), v, this);
        L.o(view0, "inflate(context, layoutId, this)");
        return view0;
    }

    public final void g(@l K2.d d0) {
        L.p(d0, "youTubePlayerListener");
        this.h(d0, true);
    }

    public final boolean getCanPlay$core_release() {
        return this.g;
    }

    @l
    public final c getWebViewYouTubePlayer$core_release() {
        return this.a;
    }

    public final void h(@l K2.d d0, boolean z) {
        L.p(d0, "youTubePlayerListener");
        this.i(d0, z, L2.a.b.a());
    }

    public final void i(@l K2.d d0, boolean z, @l L2.a a0) {
        static final class e extends N implements a {
            final b e;
            final L2.a f;
            final K2.d g;

            e(b b0, L2.a a0, K2.d d0) {
                this.e = b0;
                this.f = a0;
                this.g = d0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.e.a extends N implements Function1 {
                    final K2.d e;

                    com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.e.a(K2.d d0) {
                        this.e = d0;
                        super(1);
                    }

                    public final void a(@l J2.c c0) {
                        L.p(c0, "it");
                        c0.g(this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((J2.c)object0));
                        return S0.a;
                    }
                }

                com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.e.a b$e$a0 = new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.b.e.a(this.g);
                this.e.getWebViewYouTubePlayer$core_release().e(b$e$a0, this.f);
            }
        }

        L.p(d0, "youTubePlayerListener");
        L.p(a0, "playerOptions");
        if(this.d) {
            throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
        }
        if(z) {
            this.b.e();
        }
        e b$e0 = new e(this, a0, d0);
        this.e = b$e0;
        if(!z) {
            b$e0.invoke();
        }
    }

    // 去混淆评级： 低(20)
    public final boolean j() {
        return this.g || this.a.f();
    }

    public final boolean k() {
        return this.d;
    }

    public final void l() {
        this.c.k();
        this.g = true;
    }

    public final void o() {
        this.a.getYoutubePlayer$core_release().pause();
        this.c.l();
        this.g = false;
    }

    public final void p() {
        this.b.a();
        this.removeView(this.a);
        this.a.removeAllViews();
        this.a.destroy();
    }

    public final void setCustomPlayerUi(@l View view0) {
        L.p(view0, "view");
        this.removeViews(1, this.getChildCount() - 1);
        this.addView(view0);
    }

    public final void setYouTubePlayerReady$core_release(boolean z) {
        this.d = z;
    }
}

