package com.kakao.adfit.ads.media;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import com.kakao.adfit.ads.R.drawable;
import com.kakao.adfit.ads.R.layout;
import com.kakao.adfit.ads.R.string;
import com.kakao.adfit.ads.R.styleable;
import com.kakao.adfit.ads.na.h;
import com.kakao.adfit.d.b;
import com.kakao.adfit.d.c;
import com.kakao.adfit.e.d;
import com.kakao.adfit.e.f;
import com.kakao.adfit.e.g;
import com.kakao.adfit.m.G;
import com.kakao.adfit.m.s;
import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s
@s0({"SMAP\nMediaAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaAdView.kt\ncom/kakao/adfit/ads/media/MediaAdView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewMeasureSpecCalculator.kt\ncom/kakao/adfit/common/util/ViewMeasureSpecCalculator\n*L\n1#1,698:1\n1#2:699\n90#3,3:700\n*S KotlinDebug\n*F\n+ 1 MediaAdView.kt\ncom/kakao/adfit/ads/media/MediaAdView\n*L\n467#1:700,3\n*E\n"})
public final class MediaAdView extends FrameLayout implements TextureView.SurfaceTextureListener, d, g {
    @s
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public abstract class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.kakao.adfit.ads.na.g.a.values().length];
            try {
                arr_v[com.kakao.adfit.ads.na.g.a.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.kakao.adfit.ads.na.g.a.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.kakao.adfit.ads.na.g.a.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.kakao.adfit.ads.na.g.a.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.kakao.adfit.ads.na.g.a.g.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.kakao.adfit.ads.na.g.a.b.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.kakao.adfit.ads.na.g.a.a.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @l
    public static final Companion Companion = null;
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_VIDEO = 2;
    private int a;
    private final com.kakao.adfit.ads.media.a b;
    private final String c;
    private f d;
    private com.kakao.adfit.ads.na.f e;
    private h f;
    private com.kakao.adfit.ads.na.g.a g;
    private Surface h;
    private final c i;
    private final b j;
    private final com.kakao.adfit.d.a k;
    private View l;
    private View m;
    private final G n;
    private final Runnable o;
    private View.OnClickListener p;
    private Function1 q;
    private Function1 r;
    private boolean s;

    static {
        MediaAdView.Companion = new Companion(null);
    }

    @j
    public MediaAdView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public MediaAdView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public MediaAdView(@l Context context0, @m AttributeSet attributeSet0, @AttrRes int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.b = this.a();
        this.c = "MediaAdView@" + this.hashCode();
        this.g = com.kakao.adfit.ads.na.g.a.a;
        c c0 = new c(context0, null, 0, 6, null);
        c0.setSurfaceTextureListener(this);
        c0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.i = c0;
        b b0 = new b(context0, null, 0, 6, null);
        b0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        b0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.j = b0;
        com.kakao.adfit.d.a a0 = new com.kakao.adfit.d.a(context0, null, 0, 6, null);
        a0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.k = a0;
        this.n = new G(this, 1.777778f, 0, 0, 12, null);
        this.o = () -> {
            L.p(this, "this$0");
            this.b();
        };
        this.addView(c0);
        this.addView(b0);
        this.addView(a0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MediaAdView, v, 0);
            L.o(typedArray0, "context.obtainStyledAttr…aAdView, defStyleAttr, 0)");
            try {
                this.setMediaMaxWidth(typedArray0.getDimensionPixelOffset(styleable.MediaAdView_adfit_mediaMaxWidth, 0));
                this.setMediaMaxHeight(typedArray0.getDimensionPixelOffset(styleable.MediaAdView_adfit_mediaMaxHeight, 0));
            }
            finally {
                typedArray0.recycle();
            }
        }
        c0.setVisibility(8);
        b0.setVisibility(0);
        a0.setVisibility(8);
    }

    public MediaAdView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final com.kakao.adfit.ads.media.MediaAdView.b a() {
        public static final class com.kakao.adfit.ads.media.MediaAdView.b implements com.kakao.adfit.ads.media.a {
            private Function1 a;
            private Function1 b;
            private Function1 c;
            final MediaAdView d;

            com.kakao.adfit.ads.media.MediaAdView.b(MediaAdView mediaAdView0) {
                this.d = mediaAdView0;
                super();
            }

            @Override  // com.kakao.adfit.ads.media.a
            public Function1 a() {
                return this.b;
            }

            @Override  // com.kakao.adfit.ads.media.a
            public Function1 b() {
                return this.a;
            }

            @Override  // com.kakao.adfit.ads.media.a
            public Function1 c() {
                return this.c;
            }
        }

        return new com.kakao.adfit.ads.media.MediaAdView.b(this);
    }

    private final com.kakao.adfit.ads.media.a.a a(com.kakao.adfit.ads.na.g.a g$a0) {
        switch(g$a0) {
            case 1: {
                return com.kakao.adfit.ads.media.a.a.c;
            }
            case 2: {
                return com.kakao.adfit.ads.media.a.a.d;
            }
            case 3: {
                return com.kakao.adfit.ads.media.a.a.e;
            }
            case 4: {
                return com.kakao.adfit.ads.media.a.a.f;
            }
            case 5: {
                return com.kakao.adfit.ads.media.a.a.g;
            }
            case 6: {
                return com.kakao.adfit.ads.media.a.a.b;
            }
            case 7: {
                return com.kakao.adfit.ads.media.a.a.a;
            }
            default: {
                throw new J();
            }
        }
    }

    private final void a(View view0, long v) {
        AlphaAnimation alphaAnimation0 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation0.setDuration(v);
        alphaAnimation0.setInterpolator(new AccelerateInterpolator());
        view0.startAnimation(alphaAnimation0);
    }

    private final void a(ViewGroup viewGroup0, View view0) {
        try {
            viewGroup0.removeView(view0);
        }
        catch(Exception unused_ex) {
        }
    }

    // 检测为 Lambda 实现
    private static final void a(MediaAdView mediaAdView0) [...]

    // 检测为 Lambda 实现
    private static final void a(MediaAdView mediaAdView0, View view0) [...]

    public static final h access$getVideoViewModel$p(MediaAdView mediaAdView0) {
        return mediaAdView0.f;
    }

    public static final com.kakao.adfit.ads.media.a.a access$toVideoAdControllerState(MediaAdView mediaAdView0, com.kakao.adfit.ads.na.g.a g$a0) {
        return mediaAdView0.a(g$a0);
    }

    private final void b() {
        if(this.g != com.kakao.adfit.ads.na.g.a.d) {
            return;
        }
        ImageView imageView0 = this.k.getPlayButton();
        if(this.c()) {
            this.k.setOnClickListener(null);
            this.k.setClickable(false);
            this.k.setFocusable(false);
            imageView0.setVisibility(0);
            return;
        }
        if(imageView0.getVisibility() == 0) {
            this.b(imageView0, 300L);
        }
    }

    private final void b(View view0, long v) {
        public static final class com.kakao.adfit.ads.media.MediaAdView.c implements Animation.AnimationListener {
            final View a;

            com.kakao.adfit.ads.media.MediaAdView.c(View view0) {
                this.a = view0;
                super();
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(Animation animation0) {
                L.p(animation0, "animation");
                this.a.setVisibility(8);
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(Animation animation0) {
                L.p(animation0, "animation");
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(Animation animation0) {
                L.p(animation0, "animation");
            }
        }

        AlphaAnimation alphaAnimation0 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation0.setDuration(v);
        alphaAnimation0.setInterpolator(new AccelerateInterpolator());
        alphaAnimation0.setAnimationListener(new com.kakao.adfit.ads.media.MediaAdView.c(view0));
        view0.startAnimation(alphaAnimation0);
    }

    // 检测为 Lambda 实现
    private static final void b(MediaAdView mediaAdView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void c(MediaAdView mediaAdView0, View view0) [...]

    private final boolean c() {
        Object object0 = this.getContext().getSystemService("accessibility");
        L.n(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager)object0).isEnabled() && ((AccessibilityManager)object0).isTouchExplorationEnabled();
    }

    private final void d() {
        if(this.g != com.kakao.adfit.ads.na.g.a.d) {
            return;
        }
        ImageView imageView0 = this.k.getPlayButton();
        if(imageView0.getVisibility() != 0) {
            imageView0.setVisibility(0);
            this.a(imageView0, 300L);
        }
        Handler handler0 = this.getHandler();
        if(handler0 != null) {
            handler0.removeCallbacks(this.o);
            handler0.postDelayed(this.o, 3000L);
        }
    }

    // 检测为 Lambda 实现
    private static final void d(MediaAdView mediaAdView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void e(MediaAdView mediaAdView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void f(MediaAdView mediaAdView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void g(MediaAdView mediaAdView0, View view0) [...]

    @l
    public final b getMainImageView() {
        return this.j;
    }

    public final int getMediaMaxHeight() {
        return this.n.c();
    }

    public final int getMediaMaxWidth() {
        return this.n.d();
    }

    public final int getMediaType() {
        return this.a;
    }

    @m
    public final Function1 getOnVideoAdProgressChangedListener$library_networkRelease() {
        return this.r;
    }

    @m
    public final Function1 getOnVideoAdStateChangedListener$library_networkRelease() {
        return this.q;
    }

    @m
    public final View.OnClickListener getOnVideoPlayButtonClickListener() {
        return this.p;
    }

    @l
    public final c getTextureView() {
        return this.i;
    }

    public final boolean getUseCustomVideoControls() {
        return this.s;
    }

    @l
    public final com.kakao.adfit.ads.media.a getVideoAdController() {
        return this.b;
    }

    @l
    public final com.kakao.adfit.d.a getVideoPanelView() {
        return this.k;
    }

    @l
    public final com.kakao.adfit.ads.na.g.a getVideoViewState$library_networkRelease() {
        return this.g;
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        this.n.a(v, v1);
        super.onMeasure(this.n.e(), this.n.b());
    }

    public final void onMuteButtonClicked() {
        h h0 = this.f;
        if(h0 != null) {
            h0.k();
        }
    }

    public final void onPauseButtonClicked() {
        h h0 = this.f;
        if(h0 != null) {
            h0.e();
        }
    }

    public final void onPlayButtonClicked() {
        h h0 = this.f;
        if(h0 == null) {
            return;
        }
        h0.h();
        View.OnClickListener view$OnClickListener0 = this.p;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this);
            return;
        }
        h0.b();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureAvailable(@l SurfaceTexture surfaceTexture0, int v, int v1) {
        L.p(surfaceTexture0, "texture");
        Surface surface0 = new Surface(surfaceTexture0);
        this.h = surface0;
        h h0 = this.f;
        if(h0 != null) {
            h0.a(surface0);
        }
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@l SurfaceTexture surfaceTexture0) {
        L.p(surfaceTexture0, "texture");
        h h0 = this.f;
        if(h0 != null) {
            h0.g();
        }
        Surface surface0 = this.h;
        if(surface0 != null) {
            surface0.release();
        }
        this.h = null;
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@l SurfaceTexture surfaceTexture0, int v, int v1) {
        L.p(surfaceTexture0, "texture");
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureUpdated(@l SurfaceTexture surfaceTexture0) {
        L.p(surfaceTexture0, "texture");
        if(this.j.getVisibility() == 0 && this.g == com.kakao.adfit.ads.na.g.a.d) {
            this.j.setVisibility(8);
        }
    }

    public final void onUnmuteButtonClicked() {
        h h0 = this.f;
        if(h0 != null) {
            h0.f();
        }
    }

    public final void setMediaMaxHeight(int v) {
        this.n.a(v);
    }

    public final void setMediaMaxSize(int v, int v1) {
        this.n.c(v, v1);
    }

    public final void setMediaMaxWidth(int v) {
        this.n.b(v);
    }

    public final void setMediaSize(int v, int v1) {
        float f = v <= 0 || v1 <= 0 ? 0.0f : ((float)v) / ((float)v1);
        if(this.n.a() != f) {
            this.i.setAspectRatio(f);
            this.j.setAspectRatio(f);
            this.n.a(f);
        }
    }

    public final void setOnVideoAdProgressChangedListener$library_networkRelease(@m Function1 function10) {
        this.r = function10;
    }

    public final void setOnVideoAdStateChangedListener$library_networkRelease(@m Function1 function10) {
        this.q = function10;
    }

    public final void setOnVideoPlayButtonClickListener(@m View.OnClickListener view$OnClickListener0) {
        this.p = view$OnClickListener0;
    }

    private final void setPauseButton(ImageView imageView0) {
        imageView0.setImageResource(drawable.adfit_video_pause_btn);
        imageView0.setContentDescription(imageView0.getResources().getText(string.adfit_pause_btn_description));
        imageView0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.onPauseButtonClicked();
        });
    }

    private final void setPlayButton(ImageView imageView0) {
        imageView0.setImageResource(drawable.adfit_video_play_btn);
        imageView0.setContentDescription(imageView0.getResources().getText(string.adfit_play_btn_description));
        imageView0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.onPlayButtonClicked();
        });
    }

    private final void setReplayButton(ImageView imageView0) {
        imageView0.setImageResource(drawable.adfit_video_replay_btn);
        imageView0.setContentDescription(imageView0.getResources().getText(string.adfit_replay_btn_description));
        imageView0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.onPlayButtonClicked();
        });
    }

    private final void setSoundOffButton(ImageView imageView0) {
        imageView0.setImageResource(drawable.adfit_video_sound_on_btn);
        imageView0.setContentDescription(imageView0.getResources().getText(string.adfit_sound_off_description));
        imageView0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.onMuteButtonClicked();
        });
    }

    private final void setSoundOnButton(ImageView imageView0) {
        imageView0.setImageResource(drawable.adfit_video_sound_off_btn);
        imageView0.setContentDescription(imageView0.getResources().getText(string.adfit_sound_on_description));
        imageView0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.onUnmuteButtonClicked();
        });
    }

    public final void setUseCustomVideoControls(boolean z) {
        if(this.s != z) {
            this.s = z;
            if(z) {
                if(this.k.getParent() != null) {
                    try {
                        this.removeView(this.k);
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
            else if(this.k.getParent() == null) {
                try {
                    this.addView(this.k, 2);
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }

    public final void setViewModel(@m f f0) {
        if(L.g(this.d, f0)) {
            return;
        }
        this.a = f0 == null ? 0 : f0.i();
        this.d = f0;
        if(f0 instanceof h) {
            if(this.e != null) {
                this.e = null;
                this.updateImageAdViewModel();
            }
            this.f = (h)f0;
            this.updateVideoAdViewModel();
            this.setBackgroundColor(0xFF000000);
            this.j.setBackgroundColor(0xFF000000);
            return;
        }
        if(f0 instanceof com.kakao.adfit.ads.na.f) {
            if(this.f != null) {
                this.f = null;
                this.updateVideoAdViewModel();
            }
            this.e = (com.kakao.adfit.ads.na.f)f0;
            this.updateImageAdViewModel();
            this.setBackgroundColor(0);
            this.j.setBackground(null);
        }
    }

    @Override  // com.kakao.adfit.e.d
    public void updateImageAdImage() {
        Drawable drawable0 = this.e == null ? null : this.e.a();
        this.j.setImageDrawable(drawable0);
    }

    @Override  // com.kakao.adfit.e.d
    public void updateImageAdSize() {
        com.kakao.adfit.ads.na.f f0 = this.e;
        if(f0 == null) {
            return;
        }
        this.setMediaSize(f0.c(), f0.b());
    }

    public void updateImageAdViewModel() {
        com.kakao.adfit.e.d.a.a(this);
    }

    @Override  // com.kakao.adfit.e.g
    public void updateVideoAdImage() {
        Drawable drawable0 = this.f == null ? null : this.f.o();
        this.j.setImageDrawable(drawable0);
    }

    @Override  // com.kakao.adfit.e.g
    public void updateVideoAdProgress() {
        h h0 = this.f;
        if(h0 == null) {
            return;
        }
        ProgressBar progressBar0 = this.k.getProgressBar();
        progressBar0.setMax(h0.d());
        progressBar0.setProgress(h0.p());
        Function1 function10 = this.r;
        if(function10 != null) {
            function10.invoke(h0.p());
        }
        Function1 function11 = this.b.a();
        if(function11 != null) {
            function11.invoke(h0.p());
        }
    }

    @Override  // com.kakao.adfit.e.g
    public void updateVideoAdSize() {
        h h0 = this.f;
        if(h0 == null) {
            return;
        }
        this.setMediaSize(h0.c(), h0.a());
    }

    @Override  // com.kakao.adfit.e.g
    public void updateVideoAdSurface() {
        Surface surface0 = this.h;
        if(surface0 != null) {
            if(!surface0.isValid()) {
                surface0 = null;
            }
            if(surface0 != null) {
                h h0 = this.f;
                if(h0 != null) {
                    h0.a(surface0);
                }
            }
        }
    }

    public void updateVideoAdViewModel() {
        com.kakao.adfit.e.g.a.a(this);
    }

    @Override  // com.kakao.adfit.e.g
    public void updateVideoAdViewState() {
        int v2;
        com.kakao.adfit.ads.na.g.a g$a1;
        com.kakao.adfit.ads.na.g.a g$a0 = this.g;
        h h0 = this.f;
        if(h0 == null) {
            g$a1 = com.kakao.adfit.ads.na.g.a.a;
        }
        else {
            g$a1 = h0.m();
            if(g$a1 == null) {
                g$a1 = com.kakao.adfit.ads.na.g.a.a;
            }
        }
        if(g$a0 == g$a1) {
            return;
        }
        this.g = g$a1;
        int[] arr_v = a.a;
        int v = arr_v[g$a0.ordinal()];
        int v1 = 0;
        switch(v) {
            case 1: {
                if(!this.s) {
                    this.k.getLoadingProgressBar().setVisibility(8);
                }
                break;
            }
            case 2: {
                this.setKeepScreenOn(false);
                if(!this.s) {
                    this.k.setOnClickListener(null);
                    this.k.setClickable(false);
                    this.k.setFocusable(false);
                    this.k.getPlayButton().clearAnimation();
                    Handler handler0 = this.getHandler();
                    if(handler0 != null) {
                        handler0.removeCallbacks(this.o);
                    }
                }
                break;
            }
            case 3: {
                if(!this.s) {
                    this.k.getPlayButton().clearAnimation();
                }
                break;
            }
            case 4: {
                if(!this.s) {
                    this.k.getPlayButton().clearAnimation();
                    this.k.getSoundButton().clearAnimation();
                    View view1 = this.l;
                    if(view1 != null) {
                        this.a(this, view1);
                        this.l = null;
                    }
                }
                break;
            }
            default: {
                if(v == 5) {
                    if(!this.s) {
                        View view0 = this.m;
                        if(view0 != null) {
                            this.a(this, view0);
                            this.m = null;
                        }
                    }
                    this.updateVideoAdImage();
                }
            }
        }
        switch(arr_v[g$a1.ordinal()]) {
            case 1: {
                this.i.setVisibility(0);
                b b0 = this.j;
                switch(arr_v[g$a0.ordinal()]) {
                    case 2: 
                    case 3: 
                    case 4: {
                        v2 = 8;
                        break;
                    }
                    default: {
                        v2 = 0;
                    }
                }
                b0.setVisibility(v2);
                if(!this.s) {
                    com.kakao.adfit.d.a a0 = this.k;
                    a0.setVisibility(0);
                    a0.getLoadingProgressBar().setVisibility(0);
                    if(this.c()) {
                        a0.getPlayButton().setVisibility(0);
                        this.setPlayButton(a0.getPlayButton());
                    }
                    else {
                        a0.getPlayButton().setVisibility(8);
                    }
                    ImageView imageView0 = a0.getSoundButton();
                    if(arr_v[g$a0.ordinal()] == 6) {
                        v1 = 8;
                    }
                    imageView0.setVisibility(v1);
                }
                break;
            }
            case 2: {
                this.setKeepScreenOn(true);
                this.i.setVisibility(0);
                if(!this.s) {
                    if(this.c()) {
                        this.k.setOnClickListener(null);
                        this.k.setClickable(false);
                        this.k.setFocusable(false);
                        this.k.getPlayButton().setVisibility(0);
                    }
                    else {
                        this.k.setVisibility(0);
                        this.k.setClickable(true);
                        i i0 = (View view0) -> {
                            L.p(this, "this$0");
                            this.d();
                        };
                        this.k.setOnClickListener(i0);
                        this.k.getPlayButton().setVisibility(8);
                    }
                    this.setPauseButton(this.k.getPlayButton());
                    this.k.getSoundButton().setVisibility(0);
                }
                break;
            }
            case 3: {
                this.i.setVisibility(0);
                this.j.setVisibility(8);
                if(!this.s) {
                    com.kakao.adfit.d.a a1 = this.k;
                    a1.setVisibility(0);
                    if(a1.getPlayButton().getVisibility() != 0) {
                        a1.getPlayButton().setVisibility(0);
                        if(!this.c()) {
                            this.a(a1.getPlayButton(), 300L);
                        }
                    }
                    this.setPlayButton(a1.getPlayButton());
                    a1.getSoundButton().setVisibility(0);
                }
                break;
            }
            case 4: {
                this.i.setVisibility(0);
                this.j.setVisibility(0);
                if(!this.s) {
                    com.kakao.adfit.d.a a2 = this.k;
                    a2.setVisibility(0);
                    if(a2.getPlayButton().getVisibility() != 0) {
                        a2.getPlayButton().setVisibility(0);
                        this.a(a2.getPlayButton(), 200L);
                    }
                    this.setReplayButton(a2.getPlayButton());
                    if(a2.getSoundButton().getVisibility() == 0) {
                        this.b(a2.getSoundButton(), 200L);
                    }
                    View view2 = this.l;
                    if(view2 == null) {
                        view2 = new View(this.getContext());
                        view2.setBackgroundColor(Color.argb(0x80, 0, 0, 0));
                        this.addView(view2, 2);
                        this.l = view2;
                    }
                    this.a(view2, 200L);
                }
                break;
            }
            case 5: {
                this.i.setVisibility(0);
                this.j.setVisibility(0);
                this.j.setImageResource(drawable.adfit_error_bg);
                if(!this.s) {
                    this.k.setVisibility(8);
                    if(this.m == null) {
                        View view3 = LayoutInflater.from(this.getContext()).inflate(layout.adfit_error_layout, this, false);
                        view3.setOnClickListener((View view0) -> {
                            L.p(this, "this$0");
                            h h0 = this.f;
                            if(h0 != null) {
                                h0.j();
                            }
                        });
                        this.addView(view3);
                        this.m = view3;
                    }
                }
                break;
            }
            case 6: {
                this.i.setVisibility(0);
                this.j.setVisibility(0);
                if(!this.s) {
                    this.k.setVisibility(0);
                    this.k.getPlayButton().setVisibility(0);
                    this.setPlayButton(this.k.getPlayButton());
                    this.k.getSoundButton().setVisibility(8);
                }
                break;
            }
            case 7: {
                this.i.setVisibility(8);
                this.j.setVisibility(0);
                this.k.setVisibility(8);
            }
        }
        if(this.f == null || !this.f.n()) {
            ImageView imageView1 = this.k.getSoundButton();
            if(imageView1.getVisibility() == 0) {
                imageView1.setVisibility(8);
            }
        }
        Function1 function10 = this.q;
        if(function10 != null) {
            function10.invoke(g$a1);
        }
        Function1 function11 = this.b.b();
        if(function11 != null) {
            function11.invoke(this.a(g$a1));
        }
    }

    @Override  // com.kakao.adfit.e.g
    public void updateVideoAdVolume() {
        float f = this.f == null ? 0.0f : this.f.l();
        if(f > 0.0f) {
            this.setSoundOffButton(this.k.getSoundButton());
        }
        else {
            this.setSoundOnButton(this.k.getSoundButton());
        }
        Function1 function10 = this.b.c();
        if(function10 != null) {
            function10.invoke(f);
        }
    }
}

