package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.media3.common.AdOverlayInfo.Builder;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.ErrorMessageProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player.Events;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.O2;
import h4.e;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class PlayerView extends FrameLayout implements AdViewProvider {
    @RequiresApi(34)
    static class Api34 {
        @DoNotInline
        public static void a(SurfaceView surfaceView0) {
            surfaceView0.setSurfaceLifecycle(2);
        }
    }

    @UnstableApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ArtworkDisplayMode {
    }

    final class ComponentListener implements View.OnClickListener, View.OnLayoutChangeListener, Listener, OnFullScreenModeChangedListener, VisibilityListener {
        private final Period a;
        @Nullable
        private Object b;
        final PlayerView c;

        public ComponentListener() {
            this.a = new Period();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void A(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void C(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void E(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void F(boolean z) {
        }

        @Override  // androidx.media3.ui.PlayerControlView$OnFullScreenModeChangedListener
        public void G(boolean z) {
            if(PlayerView.this.w != null) {
                PlayerView.this.w.a(z);
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void H(int v, boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void I(MediaMetadata mediaMetadata0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void J(PlaybackException playbackException0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void L(Commands player$Commands0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void N(Player player0, Events player$Events0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Q(Timeline timeline0, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void R(long v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void S(Tracks tracks0) {
            Player player0 = (Player)Assertions.g(PlayerView.this.s);
            Timeline timeline0 = player0.v0(17) ? player0.O1() : Timeline.a;
            if(timeline0.w()) {
                this.b = null;
            }
            else if(!player0.v0(30) || player0.r0().d()) {
                Object object0 = this.b;
                if(object0 != null) {
                    int v = timeline0.f(object0);
                    if(v != -1) {
                        int v1 = timeline0.j(v, this.a).c;
                        if(player0.n2() == v1) {
                            return;
                        }
                    }
                    this.b = null;
                }
            }
            else {
                this.b = timeline0.k(player0.L0(), this.a, true).b;
            }
            PlayerView.this.k0(false);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void T(DeviceInfo deviceInfo0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void V(boolean z, int v) {
            PlayerView.this.g0();
            PlayerView.this.i0();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Y(PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
            if(PlayerView.this.N() && PlayerView.this.G) {
                PlayerView.this.I();
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Z(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a(VideoSize videoSize0) {
            if(!videoSize0.equals(VideoSize.i) && PlayerView.this.s != null && PlayerView.this.s.b() != 1) {
                PlayerView.this.f0();
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a0(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void c0(int v) {
            PlayerView.this.g0();
            PlayerView.this.j0();
            PlayerView.this.i0();
        }

        @Override  // androidx.media3.common.Player$Listener
        public void d(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void f0(long v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void g0(TrackSelectionParameters trackSelectionParameters0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void h0() {
            if(PlayerView.this.c != null) {
                PlayerView.this.c.setVisibility(4);
                if(PlayerView.this.E()) {
                    PlayerView.this.J();
                    return;
                }
                PlayerView.this.G();
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void i0(MediaItem mediaItem0, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void l0(int v, int v1) {
            if(Util.a == 34 && PlayerView.this.d instanceof SurfaceView) {
                ((SurfaceSyncGroupCompatV34)Assertions.g(PlayerView.this.f)).f(PlayerView.this.o, ((SurfaceView)PlayerView.this.d), new H(PlayerView.this));
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void o0(int v) {
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            PlayerView.this.e0();
        }

        @Override  // android.view.View$OnLayoutChangeListener
        public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
            PlayerView.y(((TextureView)view0), PlayerView.this.I);
        }

        @Override  // androidx.media3.common.Player$Listener
        public void p0(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void q(PlaybackParameters playbackParameters0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void q0(float f) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void r(List list0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void r0(AudioAttributes audioAttributes0) {
        }

        @Override  // androidx.media3.ui.PlayerControlView$VisibilityListener
        public void u(int v) {
            PlayerView.this.h0();
            if(PlayerView.this.u != null) {
                PlayerView.this.u.a(v);
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void u0(boolean z, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void v0(MediaMetadata mediaMetadata0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void w(CueGroup cueGroup0) {
            if(PlayerView.this.i != null) {
                PlayerView.this.i.setCues(cueGroup0.a);
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void w0(PlaybackException playbackException0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void x(Metadata metadata0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void x0(long v) {
        }
    }

    public interface ControllerVisibilityListener {
        void a(int arg1);
    }

    public interface FullscreenButtonClickListener {
        void a(boolean arg1);
    }

    @UnstableApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ImageDisplayMode {
    }

    @UnstableApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ShowBuffering {
    }

    @RequiresApi(34)
    static final class SurfaceSyncGroupCompatV34 {
        @Nullable
        SurfaceSyncGroup a;

        private SurfaceSyncGroupCompatV34() {
        }

        SurfaceSyncGroupCompatV34(androidx.media3.ui.PlayerView.1 playerView$10) {
        }

        public static void b() {
        }

        private static void c() {
        }

        // 检测为 Lambda 实现
        private void d(SurfaceView surfaceView0, Runnable runnable0) [...]

        @DoNotInline
        public void e() {
            SurfaceSyncGroup surfaceSyncGroup0 = this.a;
            if(surfaceSyncGroup0 != null) {
                surfaceSyncGroup0.markSyncReady();
                this.a = null;
            }
        }

        @DoNotInline
        public void f(Handler handler0, SurfaceView surfaceView0, Runnable runnable0) {
            handler0.post(() -> {
                AttachedSurfaceControl attachedSurfaceControl0 = surfaceView0.getRootSurfaceControl();
                if(attachedSurfaceControl0 == null) {
                    return;
                }
                SurfaceSyncGroup surfaceSyncGroup0 = M.a("exo-sync-b-334901521");
                this.a = surfaceSyncGroup0;
                Assertions.i(surfaceSyncGroup0.add(attachedSurfaceControl0, new P()));
                runnable0.run();
                attachedSurfaceControl0.applyTransactionOnDraw(N.a());
            });
        }
    }

    private int A;
    private boolean B;
    @Nullable
    private ErrorMessageProvider C;
    @Nullable
    private CharSequence D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    @UnstableApi
    public static final int J = 0;
    @UnstableApi
    public static final int K = 1;
    @UnstableApi
    public static final int L = 2;
    @UnstableApi
    public static final int M = 0;
    private static final int M8 = 0;
    @UnstableApi
    public static final int N = 1;
    private static final int N8 = 1;
    @UnstableApi
    public static final int O = 0;
    private static final int O8 = 2;
    @UnstableApi
    public static final int P = 1;
    private static final int P8 = 3;
    @UnstableApi
    public static final int Q = 2;
    private static final int Q8 = 4;
    private final ComponentListener a;
    @Nullable
    private final AspectRatioFrameLayout b;
    @Nullable
    private final View c;
    @Nullable
    private final View d;
    private final boolean e;
    @Nullable
    private final SurfaceSyncGroupCompatV34 f;
    @Nullable
    private final ImageView g;
    @Nullable
    private final ImageView h;
    @Nullable
    private final SubtitleView i;
    @Nullable
    private final View j;
    @Nullable
    private final TextView k;
    @Nullable
    private final PlayerControlView l;
    @Nullable
    private final FrameLayout m;
    @Nullable
    private final FrameLayout n;
    private final Handler o;
    @Nullable
    private final Class p;
    @Nullable
    private final Method q;
    @Nullable
    private final Object r;
    @Nullable
    private Player s;
    private boolean t;
    @Nullable
    private ControllerVisibilityListener u;
    @Nullable
    private VisibilityListener v;
    @Nullable
    private FullscreenButtonClickListener w;
    private int x;
    private int y;
    @Nullable
    private Drawable z;

    public PlayerView(Context context0) {
        this(context0, null);
    }

    public PlayerView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PlayerView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        boolean z5;
        int v10;
        int v8;
        int v7;
        boolean z2;
        int v6;
        int v5;
        int v4;
        boolean z1;
        int v3;
        int v2;
        boolean z;
        Object object0;
        Method method0;
        Class class0;
        boolean z11;
        boolean z10;
        boolean z9;
        int v18;
        int v17;
        boolean z8;
        int v16;
        int v15;
        boolean z7;
        int v14;
        int v13;
        boolean z6;
        int v12;
        int v11;
        boolean z4;
        boolean z3;
        int v9;
        ComponentListener playerView$ComponentListener0 = new ComponentListener(this);
        this.a = playerView$ComponentListener0;
        this.o = new Handler(Looper.getMainLooper());
        if(this.isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.p = null;
            this.q = null;
            this.r = null;
            ImageView imageView0 = new ImageView(context0);
            if(Util.a >= 23) {
                PlayerView.C(context0, this.getResources(), imageView0);
            }
            else {
                PlayerView.B(context0, this.getResources(), imageView0);
            }
            this.addView(imageView0);
            return;
        }
        if(attributeSet0 == null) {
            v16 = 0x7F0E00EA;  // layout:exo_player_view
            z6 = true;
            v12 = 0;
            z3 = true;
            v13 = 0;
            v11 = 0;
            v18 = 0;
            v15 = 1;
            v17 = 0;
            z7 = false;
            z9 = true;
            v14 = 1;
            v9 = 5000;
            z8 = true;
            z4 = true;
        }
        else {
            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.PlayerView, v, 0);
            try {
                z = typedArray0.hasValue(styleable.PlayerView_shutter_background_color);
                v2 = typedArray0.getColor(styleable.PlayerView_shutter_background_color, 0);
                v3 = typedArray0.getResourceId(styleable.PlayerView_player_layout_id, 0x7F0E00EA);  // layout:exo_player_view
                z1 = typedArray0.getBoolean(styleable.PlayerView_use_artwork, true);
                v4 = typedArray0.getInt(styleable.PlayerView_artwork_display_mode, 1);
                v5 = typedArray0.getResourceId(styleable.PlayerView_default_artwork, 0);
                v6 = typedArray0.getInt(styleable.PlayerView_image_display_mode, 0);
                z2 = typedArray0.getBoolean(styleable.PlayerView_use_controller, true);
                v7 = typedArray0.getInt(styleable.PlayerView_surface_type, 1);
                v8 = typedArray0.getInt(styleable.PlayerView_resize_mode, 0);
                v9 = typedArray0.getInt(styleable.PlayerView_show_timeout, 5000);
                z3 = typedArray0.getBoolean(styleable.PlayerView_hide_on_touch, true);
                z4 = typedArray0.getBoolean(styleable.PlayerView_auto_show, true);
                v10 = typedArray0.getInteger(styleable.PlayerView_show_buffering, 0);
                this.B = typedArray0.getBoolean(styleable.PlayerView_keep_content_on_player_reset, this.B);
                z5 = typedArray0.getBoolean(styleable.PlayerView_hide_during_ads, true);
            }
            finally {
                typedArray0.recycle();
            }
            v11 = v10;
            v12 = v8;
            z6 = z2;
            v13 = v6;
            v14 = v4;
            z7 = z;
            v15 = v7;
            v16 = v3;
            z8 = z5;
            v17 = v2;
            v18 = v5;
            z9 = z1;
        }
        LayoutInflater.from(context0).inflate(v16, this);
        this.setDescendantFocusability(0x40000);
        AspectRatioFrameLayout aspectRatioFrameLayout0 = (AspectRatioFrameLayout)this.findViewById(id.exo_content_frame);
        this.b = aspectRatioFrameLayout0;
        if(aspectRatioFrameLayout0 != null) {
            PlayerView.Y(aspectRatioFrameLayout0, v12);
        }
        View view0 = this.findViewById(id.exo_shutter);
        this.c = view0;
        if(view0 != null && z7) {
            view0.setBackgroundColor(v17);
        }
        if(aspectRatioFrameLayout0 == null || v15 == 0) {
            this.d = null;
            z11 = false;
        }
        else {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
            if(v15 == 2) {
                this.d = new TextureView(context0);
                z10 = false;
            }
            else {
                switch(v15) {
                    case 3: {
                        try {
                            this.d = new SphericalGLSurfaceView(context0);
                            z10 = true;
                            break;
                        }
                        catch(Exception exception0) {
                            throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", exception0);
                        }
                    }
                    case 4: {
                        try {
                            this.d = new VideoDecoderGLSurfaceView(context0);
                        }
                        catch(Exception exception1) {
                            throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", exception1);
                        }
                        z10 = false;
                        break;
                    }
                    default: {
                        SurfaceView surfaceView0 = new SurfaceView(context0);
                        if(Util.a >= 34) {
                            Api34.a(surfaceView0);
                        }
                        this.d = surfaceView0;
                        z10 = false;
                    }
                }
            }
            this.d.setLayoutParams(viewGroup$LayoutParams0);
            this.d.setOnClickListener(playerView$ComponentListener0);
            this.d.setClickable(false);
            aspectRatioFrameLayout0.addView(this.d, 0);
            z11 = z10;
        }
        this.e = z11;
        this.f = Util.a == 34 ? new SurfaceSyncGroupCompatV34(null) : null;
        this.m = (FrameLayout)this.findViewById(id.exo_ad_overlay);
        this.n = (FrameLayout)this.findViewById(id.exo_overlay);
        this.g = (ImageView)this.findViewById(id.exo_image);
        this.y = v13;
        try {
            class0 = ExoPlayer.class;
            method0 = class0.getMethod("setImageOutput", ImageOutput.class);
            object0 = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, (Object object0, Method method0, Object[] arr_object) -> {
                if(method0.getName().equals("onImageAvailable")) {
                    this.S(((Bitmap)arr_object[1]));
                }
                return null;
            });
        }
        catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
            class0 = null;
            object0 = null;
            method0 = null;
        }
        this.p = class0;
        this.q = method0;
        this.r = object0;
        ImageView imageView1 = (ImageView)this.findViewById(id.exo_artwork);
        this.h = imageView1;
        this.x = !z9 || v14 == 0 || imageView1 == null ? 0 : v14;
        if(v18 != 0) {
            this.z = ContextCompat.getDrawable(this.getContext(), v18);
        }
        SubtitleView subtitleView0 = (SubtitleView)this.findViewById(id.exo_subtitles);
        this.i = subtitleView0;
        if(subtitleView0 != null) {
            subtitleView0.e();
            subtitleView0.f();
        }
        View view1 = this.findViewById(id.exo_buffering);
        this.j = view1;
        if(view1 != null) {
            view1.setVisibility(8);
        }
        this.A = v11;
        TextView textView0 = (TextView)this.findViewById(id.exo_error_message);
        this.k = textView0;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
        PlayerControlView playerControlView0 = (PlayerControlView)this.findViewById(id.exo_controller);
        View view2 = this.findViewById(id.exo_controller_placeholder);
        if(playerControlView0 != null) {
            this.l = playerControlView0;
        }
        else if(view2 == null) {
            this.l = null;
        }
        else {
            PlayerControlView playerControlView1 = new PlayerControlView(context0, null, 0, attributeSet0);
            this.l = playerControlView1;
            playerControlView1.setId(0x7F0B0467);  // id:exo_controller
            playerControlView1.setLayoutParams(view2.getLayoutParams());
            ViewGroup viewGroup0 = (ViewGroup)view2.getParent();
            int v19 = viewGroup0.indexOfChild(view2);
            viewGroup0.removeView(view2);
            viewGroup0.addView(playerControlView1, v19);
        }
        PlayerControlView playerControlView2 = this.l;
        this.E = playerControlView2 == null ? 0 : v9;
        this.H = z3;
        this.F = z4;
        this.G = z8;
        this.t = z6 && playerControlView2 != null;
        if(playerControlView2 != null) {
            playerControlView2.Z();
            this.l.S(this.a);
        }
        if(z6) {
            this.setClickable(true);
        }
        this.h0();
    }

    private void A() {
        View view0 = this.c;
        if(view0 != null) {
            view0.setVisibility(0);
        }
    }

    private static void B(Context context0, Resources resources0, ImageView imageView0) {
        imageView0.setImageDrawable(Util.o0(context0, resources0, drawable.exo_edit_mode_logo));
        imageView0.setBackgroundColor(resources0.getColor(color.exo_edit_mode_background_color));
    }

    @RequiresApi(23)
    private static void C(Context context0, Resources resources0, ImageView imageView0) {
        imageView0.setImageDrawable(Util.o0(context0, resources0, drawable.exo_edit_mode_logo));
        imageView0.setBackgroundColor(resources0.getColor(color.exo_edit_mode_background_color, null));
    }

    // 去混淆评级： 低(20)
    @UnstableApi
    public boolean D(KeyEvent keyEvent0) {
        return this.n0() && this.l.U(keyEvent0);
    }

    private boolean E() {
        Player player0 = this.s;
        return player0 != null && this.r != null && player0.v0(30) && player0.r0().e(4);
    }

    private boolean F() {
        Player player0 = this.s;
        return player0 != null && player0.v0(30) && player0.r0().e(2);
    }

    private void G() {
        this.J();
        ImageView imageView0 = this.g;
        if(imageView0 != null) {
            imageView0.setImageResource(0x106000D);
        }
    }

    private void H() {
        ImageView imageView0 = this.h;
        if(imageView0 != null) {
            imageView0.setImageResource(0x106000D);
            this.h.setVisibility(4);
        }
    }

    @UnstableApi
    public void I() {
        PlayerControlView playerControlView0 = this.l;
        if(playerControlView0 != null) {
            playerControlView0.Y();
        }
    }

    private void J() {
        ImageView imageView0 = this.g;
        if(imageView0 != null) {
            imageView0.setVisibility(4);
        }
    }

    @UnstableApi
    public boolean K() {
        return this.l != null && this.l.d0();
    }

    @SuppressLint({"InlinedApi"})
    private boolean L(int v) {
        switch(v) {
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 0x10C: 
            case 0x10D: 
            case 270: 
            case 0x10F: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private boolean M() {
        ImageView imageView0 = this.g;
        if(imageView0 == null) {
            return false;
        }
        Drawable drawable0 = imageView0.getDrawable();
        return drawable0 != null && drawable0.getAlpha() != 0;
    }

    // 去混淆评级： 低(30)
    private boolean N() {
        return this.s != null && this.s.v0(16) && this.s.W() && this.s.D0();
    }

    // 检测为 Lambda 实现
    private Object O(Object object0, Method method0, Object[] arr_object) throws Throwable [...]

    // 检测为 Lambda 实现
    private void P(Bitmap bitmap0) [...]

    private void Q(boolean z) {
        if(this.N() && this.G) {
            return;
        }
        if(this.n0()) {
            boolean z1 = this.l.d0() && this.l.getShowTimeoutMs() <= 0;
            boolean z2 = this.Z();
            if(z || z1 || z2) {
                this.b0(z2);
            }
        }
    }

    @UnstableApi
    protected void R(@Nullable AspectRatioFrameLayout aspectRatioFrameLayout0, float f) {
        if(aspectRatioFrameLayout0 != null) {
            aspectRatioFrameLayout0.setAspectRatio(f);
        }
    }

    private void S(Bitmap bitmap0) {
        F f0 = () -> {
            this.setImage(new BitmapDrawable(this.getResources(), bitmap0));
            if(!this.F()) {
                this.c0();
                this.A();
            }
        };
        this.o.post(f0);
    }

    public void T() {
        View view0 = this.d;
        if(view0 instanceof GLSurfaceView) {
            ((GLSurfaceView)view0).onPause();
        }
    }

    public void U() {
        View view0 = this.d;
        if(view0 instanceof GLSurfaceView) {
            ((GLSurfaceView)view0).onResume();
        }
    }

    private boolean V(@Nullable Player player0) {
        if(player0 != null && player0.v0(18)) {
            byte[] arr_b = player0.w2().k;
            if(arr_b == null) {
                return false;
            }
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            return this.W(new BitmapDrawable(this.getResources(), bitmap0));
        }
        return false;
    }

    private boolean W(@Nullable Drawable drawable0) {
        if(this.h != null && drawable0 != null) {
            int v = drawable0.getIntrinsicWidth();
            int v1 = drawable0.getIntrinsicHeight();
            if(v > 0 && v1 > 0) {
                float f = ((float)v) / ((float)v1);
                ImageView.ScaleType imageView$ScaleType0 = ImageView.ScaleType.FIT_XY;
                if(this.x == 2) {
                    f = ((float)this.getWidth()) / ((float)this.getHeight());
                    imageView$ScaleType0 = ImageView.ScaleType.CENTER_CROP;
                }
                this.R(this.b, f);
                this.h.setScaleType(imageView$ScaleType0);
                this.h.setImageDrawable(drawable0);
                this.h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public void X(@Nullable long[] arr_v, @Nullable boolean[] arr_z) {
        Assertions.k(this.l);
        this.l.n0(arr_v, arr_z);
    }

    private static void Y(AspectRatioFrameLayout aspectRatioFrameLayout0, int v) {
        aspectRatioFrameLayout0.setResizeMode(v);
    }

    private boolean Z() {
        Player player0 = this.s;
        if(player0 == null) {
            return true;
        }
        int v = player0.b();
        return this.F && (!this.s.v0(17) || !this.s.O1().w()) && (v == 1 || v == 4 || !((Player)Assertions.g(this.s)).D0());
    }

    @UnstableApi
    public void a0() {
        this.b0(this.Z());
    }

    private void b0(boolean z) {
        if(!this.n0()) {
            return;
        }
        this.l.setShowTimeoutMs((z ? 0 : this.E));
        this.l.p0();
    }

    private void c0() {
        ImageView imageView0 = this.g;
        if(imageView0 != null) {
            imageView0.setVisibility(0);
            this.l0();
        }
    }

    @UnstableApi
    public static void d0(Player player0, @Nullable PlayerView playerView0, @Nullable PlayerView playerView1) {
        if(playerView0 == playerView1) {
            return;
        }
        if(playerView1 != null) {
            playerView1.setPlayer(player0);
        }
        if(playerView0 != null) {
            playerView0.setPlayer(null);
        }
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        super.dispatchDraw(canvas0);
        if(Util.a == 34) {
            SurfaceSyncGroupCompatV34 playerView$SurfaceSyncGroupCompatV340 = this.f;
            if(playerView$SurfaceSyncGroupCompatV340 != null) {
                playerView$SurfaceSyncGroupCompatV340.e();
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        if(this.s != null && this.s.v0(16) && this.s.W()) {
            return super.dispatchKeyEvent(keyEvent0);
        }
        boolean z = this.L(keyEvent0.getKeyCode());
        if(z && this.n0() && !this.l.d0()) {
            this.Q(true);
            return true;
        }
        if(!this.D(keyEvent0) && !super.dispatchKeyEvent(keyEvent0)) {
            if(z && this.n0()) {
                this.Q(true);
            }
            return false;
        }
        this.Q(true);
        return true;
    }

    private void e0() {
        if(this.n0() && this.s != null) {
            if(!this.l.d0()) {
                this.Q(true);
                return;
            }
            if(this.H) {
                this.l.Y();
            }
        }
    }

    private void f0() {
        VideoSize videoSize0 = this.s == null ? VideoSize.i : this.s.O();
        int v = videoSize0.c;
        float f = 0.0f;
        float f1 = videoSize0.b == 0 || videoSize0.a == 0 ? 0.0f : ((float)videoSize0.a) * videoSize0.d / ((float)videoSize0.b);
        View view0 = this.d;
        if(view0 instanceof TextureView) {
            if(f1 > 0.0f && (v == 90 || v == 270)) {
                f1 = 1.0f / f1;
            }
            if(this.I != 0) {
                view0.removeOnLayoutChangeListener(this.a);
            }
            this.I = v;
            if(v != 0) {
                this.d.addOnLayoutChangeListener(this.a);
            }
            PlayerView.y(((TextureView)this.d), this.I);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout0 = this.b;
        if(!this.e) {
            f = f1;
        }
        this.R(aspectRatioFrameLayout0, f);
    }

    private void g0() {
        boolean z = true;
        int v = 0;
        if(this.j != null) {
            if(this.s == null || this.s.b() != 2 || this.A != 2 && (this.A != 1 || !this.s.D0())) {
                z = false;
            }
            View view0 = this.j;
            if(!z) {
                v = 8;
            }
            view0.setVisibility(v);
        }
    }

    @Override  // androidx.media3.common.AdViewProvider
    public List getAdOverlayInfos() {
        ArrayList arrayList0 = new ArrayList();
        FrameLayout frameLayout0 = this.n;
        if(frameLayout0 != null) {
            arrayList0.add(new Builder(frameLayout0, 4).b("Transparent overlay does not impact viewability").a());
        }
        PlayerControlView playerControlView0 = this.l;
        if(playerControlView0 != null) {
            arrayList0.add(new Builder(playerControlView0, 1).a());
        }
        return O2.r(arrayList0);
    }

    @Override  // androidx.media3.common.AdViewProvider
    public ViewGroup getAdViewGroup() {
        return (ViewGroup)Assertions.l(this.m, "exo_ad_overlay must be present for ad playback");
    }

    @UnstableApi
    public int getArtworkDisplayMode() {
        return this.x;
    }

    @UnstableApi
    public boolean getControllerAutoShow() {
        return this.F;
    }

    @UnstableApi
    public boolean getControllerHideOnTouch() {
        return this.H;
    }

    @UnstableApi
    public int getControllerShowTimeoutMs() {
        return this.E;
    }

    @Nullable
    @UnstableApi
    public Drawable getDefaultArtwork() {
        return this.z;
    }

    @UnstableApi
    public int getImageDisplayMode() {
        return this.y;
    }

    @Nullable
    @UnstableApi
    public FrameLayout getOverlayFrameLayout() {
        return this.n;
    }

    @Nullable
    public Player getPlayer() {
        return this.s;
    }

    @UnstableApi
    public int getResizeMode() {
        Assertions.k(this.b);
        return this.b.getResizeMode();
    }

    @Nullable
    @UnstableApi
    public SubtitleView getSubtitleView() {
        return this.i;
    }

    @UnstableApi
    @Deprecated
    public boolean getUseArtwork() {
        return this.x != 0;
    }

    public boolean getUseController() {
        return this.t;
    }

    @Nullable
    @UnstableApi
    public View getVideoSurfaceView() {
        return this.d;
    }

    private void h0() {
        PlayerControlView playerControlView0 = this.l;
        String s = null;
        if(playerControlView0 != null && this.t) {
            if(playerControlView0.d0()) {
                if(this.H) {
                    s = this.getResources().getString(string.exo_controls_hide);
                }
                this.setContentDescription(s);
                return;
            }
            this.setContentDescription(this.getResources().getString(string.exo_controls_show));
            return;
        }
        this.setContentDescription(null);
    }

    private void i0() {
        if(this.N() && this.G) {
            this.I();
            return;
        }
        this.Q(false);
    }

    private void j0() {
        TextView textView0 = this.k;
        if(textView0 != null) {
            CharSequence charSequence0 = this.D;
            if(charSequence0 != null) {
                textView0.setText(charSequence0);
                this.k.setVisibility(0);
                return;
            }
            PlaybackException playbackException0 = this.s == null ? null : this.s.f();
            if(playbackException0 != null) {
                ErrorMessageProvider errorMessageProvider0 = this.C;
                if(errorMessageProvider0 != null) {
                    Pair pair0 = errorMessageProvider0.a(playbackException0);
                    this.k.setText(((CharSequence)pair0.second));
                    this.k.setVisibility(0);
                    return;
                }
            }
            this.k.setVisibility(8);
        }
    }

    private void k0(boolean z) {
        Player player0 = this.s;
        boolean z1 = false;
        boolean z2 = player0 != null && player0.v0(30) && !player0.r0().d();
        if(!this.B && (!z2 || z)) {
            this.H();
            this.A();
            this.G();
        }
        if(!z2) {
            return;
        }
        boolean z3 = this.F();
        boolean z4 = this.E();
        if(!z3 && !z4) {
            this.A();
            this.G();
        }
        if(this.c != null && this.c.getVisibility() == 4 && this.M()) {
            z1 = true;
        }
        if(z4 && !z3 && z1) {
            this.A();
            this.c0();
        }
        else if(z3 && !z4 && z1) {
            this.G();
        }
        if(!z3 && !z4 && this.m0()) {
            if(this.V(player0)) {
                return;
            }
            if(this.W(this.z)) {
                return;
            }
        }
        this.H();
    }

    private void l0() {
        ImageView imageView0 = this.g;
        if(imageView0 == null) {
            return;
        }
        Drawable drawable0 = imageView0.getDrawable();
        if(drawable0 == null) {
            return;
        }
        int v = drawable0.getIntrinsicWidth();
        int v1 = drawable0.getIntrinsicHeight();
        if(v > 0 && v1 > 0) {
            float f = ((float)v) / ((float)v1);
            ImageView.ScaleType imageView$ScaleType0 = ImageView.ScaleType.FIT_XY;
            if(this.y == 1) {
                f = ((float)this.getWidth()) / ((float)this.getHeight());
                imageView$ScaleType0 = ImageView.ScaleType.CENTER_CROP;
            }
            if(this.g.getVisibility() == 0) {
                this.R(this.b, f);
            }
            this.g.setScaleType(imageView$ScaleType0);
        }
    }

    private boolean m0() {
        if(this.x != 0) {
            Assertions.k(this.h);
            return true;
        }
        return false;
    }

    @e(expression = {"controller"}, result = true)
    private boolean n0() {
        if(this.t) {
            Assertions.k(this.l);
            return true;
        }
        return false;
    }

    @Override  // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent0) {
        if(this.n0() && this.s != null) {
            this.Q(true);
            return true;
        }
        return false;
    }

    @Override  // android.view.View
    public boolean performClick() {
        this.e0();
        return super.performClick();
    }

    @UnstableApi
    public void setArtworkDisplayMode(int v) {
        Assertions.i(v == 0 || this.h != null);
        if(this.x != v) {
            this.x = v;
            this.k0(false);
        }
    }

    @UnstableApi
    public void setAspectRatioListener(@Nullable AspectRatioListener aspectRatioFrameLayout$AspectRatioListener0) {
        Assertions.k(this.b);
        this.b.setAspectRatioListener(aspectRatioFrameLayout$AspectRatioListener0);
    }

    @UnstableApi
    public void setControllerAnimationEnabled(boolean z) {
        Assertions.k(this.l);
        this.l.setAnimationEnabled(z);
    }

    @UnstableApi
    public void setControllerAutoShow(boolean z) {
        this.F = z;
    }

    @UnstableApi
    public void setControllerHideDuringAds(boolean z) {
        this.G = z;
    }

    @UnstableApi
    public void setControllerHideOnTouch(boolean z) {
        Assertions.k(this.l);
        this.H = z;
        this.h0();
    }

    @UnstableApi
    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener playerControlView$OnFullScreenModeChangedListener0) {
        Assertions.k(this.l);
        this.w = null;
        this.l.setOnFullScreenModeChangedListener(playerControlView$OnFullScreenModeChangedListener0);
    }

    @UnstableApi
    public void setControllerShowTimeoutMs(int v) {
        Assertions.k(this.l);
        this.E = v;
        if(this.l.d0()) {
            this.a0();
        }
    }

    @UnstableApi
    @Deprecated
    public void setControllerVisibilityListener(@Nullable VisibilityListener playerControlView$VisibilityListener0) {
        Assertions.k(this.l);
        VisibilityListener playerControlView$VisibilityListener1 = this.v;
        if(playerControlView$VisibilityListener1 == playerControlView$VisibilityListener0) {
            return;
        }
        if(playerControlView$VisibilityListener1 != null) {
            this.l.k0(playerControlView$VisibilityListener1);
        }
        this.v = playerControlView$VisibilityListener0;
        if(playerControlView$VisibilityListener0 != null) {
            this.l.S(playerControlView$VisibilityListener0);
            this.setControllerVisibilityListener(null);
        }
    }

    public void setControllerVisibilityListener(@Nullable ControllerVisibilityListener playerView$ControllerVisibilityListener0) {
        this.u = playerView$ControllerVisibilityListener0;
        if(playerView$ControllerVisibilityListener0 != null) {
            this.setControllerVisibilityListener(null);
        }
    }

    @UnstableApi
    public void setCustomErrorMessage(@Nullable CharSequence charSequence0) {
        Assertions.i(this.k != null);
        this.D = charSequence0;
        this.j0();
    }

    @UnstableApi
    public void setDefaultArtwork(@Nullable Drawable drawable0) {
        if(this.z != drawable0) {
            this.z = drawable0;
            this.k0(false);
        }
    }

    public void setErrorMessageProvider(@Nullable ErrorMessageProvider errorMessageProvider0) {
        if(this.C != errorMessageProvider0) {
            this.C = errorMessageProvider0;
            this.j0();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable FullscreenButtonClickListener playerView$FullscreenButtonClickListener0) {
        Assertions.k(this.l);
        this.w = playerView$FullscreenButtonClickListener0;
        this.l.setOnFullScreenModeChangedListener(this.a);
    }

    private void setImage(Drawable drawable0) {
        ImageView imageView0 = this.g;
        if(imageView0 == null) {
            return;
        }
        imageView0.setImageDrawable(drawable0);
        this.l0();
    }

    @UnstableApi
    public void setImageDisplayMode(int v) {
        Assertions.i(this.g != null);
        if(this.y != v) {
            this.y = v;
            this.l0();
        }
    }

    private void setImageOutput(Player player0) {
        if(this.p != null && this.p.isAssignableFrom(player0.getClass())) {
            try {
                ((Method)Assertions.g(this.q)).invoke(player0, Assertions.g(this.r));
            }
            catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                throw new RuntimeException(illegalAccessException0);
            }
        }
    }

    @UnstableApi
    public void setKeepContentOnPlayerReset(boolean z) {
        if(this.B != z) {
            this.B = z;
            this.k0(false);
        }
    }

    public void setPlayer(@Nullable Player player0) {
        Assertions.i(Looper.myLooper() == Looper.getMainLooper());
        Assertions.a(player0 == null || player0.P1() == Looper.getMainLooper());
        Player player1 = this.s;
        if(player1 == player0) {
            return;
        }
        if(player1 != null) {
            player1.J1(this.a);
            if(player1.v0(27)) {
                View view0 = this.d;
                if(view0 instanceof TextureView) {
                    player1.B(((TextureView)view0));
                }
                else if(view0 instanceof SurfaceView) {
                    player1.S(((SurfaceView)view0));
                }
            }
            this.z(player1);
        }
        SubtitleView subtitleView0 = this.i;
        if(subtitleView0 != null) {
            subtitleView0.setCues(null);
        }
        this.s = player0;
        if(this.n0()) {
            this.l.setPlayer(player0);
        }
        this.g0();
        this.j0();
        this.k0(true);
        if(player0 != null) {
            if(player0.v0(27)) {
                View view1 = this.d;
                if(view1 instanceof TextureView) {
                    player0.N(((TextureView)view1));
                }
                else if(view1 instanceof SurfaceView) {
                    player0.t(((SurfaceView)view1));
                }
                if(!player0.v0(30) || player0.r0().f(2)) {
                    this.f0();
                }
            }
            if(this.i != null && player0.v0(28)) {
                CueGroup cueGroup0 = player0.L();
                this.i.setCues(cueGroup0.a);
            }
            player0.M1(this.a);
            this.setImageOutput(player0);
            this.Q(false);
            return;
        }
        this.I();
    }

    @UnstableApi
    public void setRepeatToggleModes(int v) {
        Assertions.k(this.l);
        this.l.setRepeatToggleModes(v);
    }

    @UnstableApi
    public void setResizeMode(int v) {
        Assertions.k(this.b);
        this.b.setResizeMode(v);
    }

    @UnstableApi
    public void setShowBuffering(int v) {
        if(this.A != v) {
            this.A = v;
            this.g0();
        }
    }

    @UnstableApi
    public void setShowFastForwardButton(boolean z) {
        Assertions.k(this.l);
        this.l.setShowFastForwardButton(z);
    }

    @UnstableApi
    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        Assertions.k(this.l);
        this.l.setShowMultiWindowTimeBar(z);
    }

    @UnstableApi
    public void setShowNextButton(boolean z) {
        Assertions.k(this.l);
        this.l.setShowNextButton(z);
    }

    @UnstableApi
    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        Assertions.k(this.l);
        this.l.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    @UnstableApi
    public void setShowPreviousButton(boolean z) {
        Assertions.k(this.l);
        this.l.setShowPreviousButton(z);
    }

    @UnstableApi
    public void setShowRewindButton(boolean z) {
        Assertions.k(this.l);
        this.l.setShowRewindButton(z);
    }

    @UnstableApi
    public void setShowShuffleButton(boolean z) {
        Assertions.k(this.l);
        this.l.setShowShuffleButton(z);
    }

    @UnstableApi
    public void setShowSubtitleButton(boolean z) {
        Assertions.k(this.l);
        this.l.setShowSubtitleButton(z);
    }

    @UnstableApi
    public void setShowVrButton(boolean z) {
        Assertions.k(this.l);
        this.l.setShowVrButton(z);
    }

    @UnstableApi
    public void setShutterBackgroundColor(@ColorInt int v) {
        View view0 = this.c;
        if(view0 != null) {
            view0.setBackgroundColor(v);
        }
    }

    @UnstableApi
    @Deprecated
    public void setUseArtwork(boolean z) {
        this.setArtworkDisplayMode(!z);
    }

    public void setUseController(boolean z) {
        boolean z1 = true;
        Assertions.i(!z || this.l != null);
        if(!z && !this.hasOnClickListeners()) {
            z1 = false;
        }
        this.setClickable(z1);
        if(this.t == z) {
            return;
        }
        this.t = z;
        if(this.n0()) {
            this.l.setPlayer(this.s);
        }
        else {
            PlayerControlView playerControlView0 = this.l;
            if(playerControlView0 != null) {
                playerControlView0.Y();
                this.l.setPlayer(null);
            }
        }
        this.h0();
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        View view0 = this.d;
        if(view0 instanceof SurfaceView) {
            view0.setVisibility(v);
        }
    }

    private static void y(TextureView textureView0, int v) {
        Matrix matrix0 = new Matrix();
        float f = (float)textureView0.getWidth();
        float f1 = (float)textureView0.getHeight();
        if(f != 0.0f && f1 != 0.0f && v != 0) {
            matrix0.postRotate(((float)v), f / 2.0f, f1 / 2.0f);
            RectF rectF0 = new RectF(0.0f, 0.0f, f, f1);
            RectF rectF1 = new RectF();
            matrix0.mapRect(rectF1, rectF0);
            matrix0.postScale(f / rectF1.width(), f1 / rectF1.height(), f / 2.0f, f1 / 2.0f);
        }
        textureView0.setTransform(matrix0);
    }

    private void z(Player player0) {
        if(this.p != null && this.p.isAssignableFrom(player0.getClass())) {
            try {
                ((Method)Assertions.g(this.q)).invoke(player0, ((Object)null));
            }
            catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                throw new RuntimeException(illegalAccessException0);
            }
        }
    }

    class androidx.media3.ui.PlayerView.1 {
    }

}

