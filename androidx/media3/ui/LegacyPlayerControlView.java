package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
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
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
public class LegacyPlayerControlView extends FrameLayout {
    @RequiresApi(21)
    static final class Api21 {
        @DoNotInline
        public static boolean a(View view0) {
            return view0.isAccessibilityFocused();
        }
    }

    final class ComponentListener implements View.OnClickListener, Listener, OnScrubListener {
        final LegacyPlayerControlView a;

        private ComponentListener() {
        }

        ComponentListener(androidx.media3.ui.LegacyPlayerControlView.1 legacyPlayerControlView$10) {
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

        @Override  // androidx.media3.ui.TimeBar$OnScrubListener
        public void G(TimeBar timeBar0, long v) {
            if(LegacyPlayerControlView.this.m != null) {
                LegacyPlayerControlView.this.m.setText(Util.H0(LegacyPlayerControlView.this.o, LegacyPlayerControlView.this.p, v));
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

        @Override  // androidx.media3.ui.TimeBar$OnScrubListener
        public void K(TimeBar timeBar0, long v, boolean z) {
            LegacyPlayerControlView.this.M = false;
            if(!z && LegacyPlayerControlView.this.G != null) {
                LegacyPlayerControlView.this.I(LegacyPlayerControlView.this.G, v);
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void L(Commands player$Commands0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void N(Player player0, Events player$Events0) {
            if(player$Events0.b(new int[]{4, 5})) {
                LegacyPlayerControlView.this.O();
            }
            if(player$Events0.b(new int[]{4, 5, 7})) {
                LegacyPlayerControlView.this.P();
            }
            if(player$Events0.a(8)) {
                LegacyPlayerControlView.this.Q();
            }
            if(player$Events0.a(9)) {
                LegacyPlayerControlView.this.R();
            }
            if(player$Events0.b(new int[]{8, 9, 11, 0, 13})) {
                LegacyPlayerControlView.this.N();
            }
            if(player$Events0.b(new int[]{11, 0})) {
                LegacyPlayerControlView.this.S();
            }
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Q(Timeline timeline0, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void R(long v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void S(Tracks tracks0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void T(DeviceInfo deviceInfo0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void V(boolean z, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Y(PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void Z(boolean z) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a(VideoSize videoSize0) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void a0(int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void c0(int v) {
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
        }

        @Override  // androidx.media3.common.Player$Listener
        public void i0(MediaItem mediaItem0, int v) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void l0(int v, int v1) {
        }

        @Override  // androidx.media3.common.Player$Listener
        public void o0(int v) {
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            Player player0 = LegacyPlayerControlView.this.G;
            if(player0 == null) {
                return;
            }
            if(LegacyPlayerControlView.this.d == view0) {
                player0.R1();
                return;
            }
            if(LegacyPlayerControlView.this.c == view0) {
                player0.B1();
                return;
            }
            if(LegacyPlayerControlView.this.g != view0) {
                if(LegacyPlayerControlView.this.h == view0) {
                    player0.v2();
                    return;
                }
                if(LegacyPlayerControlView.this.e == view0) {
                    Util.R0(player0);
                    return;
                }
                if(LegacyPlayerControlView.this.f == view0) {
                    Util.Q0(player0);
                    return;
                }
                if(LegacyPlayerControlView.this.i == view0) {
                    player0.q(RepeatModeUtil.a(player0.i(), LegacyPlayerControlView.this.P));
                    return;
                }
                if(LegacyPlayerControlView.this.j == view0) {
                    player0.E0(!player0.t2());
                }
            }
            else if(player0.b() != 4) {
                player0.f1();
            }
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

        @Override  // androidx.media3.ui.TimeBar$OnScrubListener
        public void u(TimeBar timeBar0, long v) {
            LegacyPlayerControlView.this.M = true;
            if(LegacyPlayerControlView.this.m != null) {
                String s = Util.H0(LegacyPlayerControlView.this.o, LegacyPlayerControlView.this.p, v);
                LegacyPlayerControlView.this.m.setText(s);
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

    public interface ProgressUpdateListener {
        void a(long arg1, long arg2);
    }

    public interface VisibilityListener {
        void u(int arg1);
    }

    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;
    @Nullable
    private Player G;
    @Nullable
    private ProgressUpdateListener H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean M8;
    private int N;
    private boolean N8;
    private int O;
    private boolean O8;
    private int P;
    private boolean P8;
    private boolean Q;
    private long Q8;
    private long[] R8;
    private boolean[] S8;
    private long[] T8;
    private boolean[] U8;
    private long V8;
    private long W8;
    private long X8;
    public static final int Y8 = 5000;
    public static final int Z8 = 0;
    private final ComponentListener a;
    public static final int a9 = 200;
    private final CopyOnWriteArrayList b;
    public static final int b9 = 100;
    @Nullable
    private final View c;
    private static final int c9 = 1000;
    @Nullable
    private final View d;
    @Nullable
    private final View e;
    @Nullable
    private final View f;
    @Nullable
    private final View g;
    @Nullable
    private final View h;
    @Nullable
    private final ImageView i;
    @Nullable
    private final ImageView j;
    @Nullable
    private final View k;
    @Nullable
    private final TextView l;
    @Nullable
    private final TextView m;
    @Nullable
    private final TimeBar n;
    private final StringBuilder o;
    private final Formatter p;
    private final Period q;
    private final Window r;
    private final Runnable s;
    private final Runnable t;
    private final Drawable u;
    private final Drawable v;
    private final Drawable w;
    private final String x;
    private final String y;
    private final String z;

    static {
        MediaLibraryInfo.a("media3.ui");
    }

    public LegacyPlayerControlView(Context context0) {
        this(context0, null);
    }

    public LegacyPlayerControlView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public LegacyPlayerControlView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, attributeSet0);
    }

    public LegacyPlayerControlView(Context context0, @Nullable AttributeSet attributeSet0, int v, @Nullable AttributeSet attributeSet1) {
        super(context0, attributeSet0, v);
        int v1 = layout.exo_legacy_player_control_view;
        this.K = true;
        this.N = 5000;
        this.P = 0;
        this.O = 200;
        this.Q8 = 0x8000000000000001L;
        this.Q = true;
        this.M8 = true;
        this.N8 = true;
        this.O8 = true;
        this.P8 = false;
        if(attributeSet1 != null) {
            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet1, styleable.LegacyPlayerControlView, v, 0);
            try {
                this.N = typedArray0.getInt(styleable.LegacyPlayerControlView_show_timeout, this.N);
                v1 = typedArray0.getResourceId(styleable.LegacyPlayerControlView_controller_layout_id, 0x7F0E00E5);  // layout:exo_legacy_player_control_view
                this.P = LegacyPlayerControlView.z(typedArray0, this.P);
                this.Q = typedArray0.getBoolean(styleable.LegacyPlayerControlView_show_rewind_button, this.Q);
                this.M8 = typedArray0.getBoolean(styleable.LegacyPlayerControlView_show_fastforward_button, this.M8);
                this.N8 = typedArray0.getBoolean(styleable.LegacyPlayerControlView_show_previous_button, this.N8);
                this.O8 = typedArray0.getBoolean(styleable.LegacyPlayerControlView_show_next_button, this.O8);
                this.P8 = typedArray0.getBoolean(styleable.LegacyPlayerControlView_show_shuffle_button, this.P8);
                this.setTimeBarMinUpdateInterval(typedArray0.getInt(styleable.LegacyPlayerControlView_time_bar_min_update_interval, 200));
            }
            finally {
                typedArray0.recycle();
            }
        }
        this.b = new CopyOnWriteArrayList();
        this.q = new Period();
        this.r = new Window();
        StringBuilder stringBuilder0 = new StringBuilder();
        this.o = stringBuilder0;
        this.p = new Formatter(stringBuilder0, Locale.getDefault());
        this.R8 = new long[0];
        this.S8 = new boolean[0];
        this.T8 = new long[0];
        this.U8 = new boolean[0];
        ComponentListener legacyPlayerControlView$ComponentListener0 = new ComponentListener(this, null);
        this.a = legacyPlayerControlView$ComponentListener0;
        this.s = () -> {
            long v1;
            long v;
            if(this.D() && this.I) {
                Player player0 = this.G;
                if(player0 == null) {
                    v = 0L;
                    v1 = 0L;
                }
                else {
                    v = this.V8 + player0.d2();
                    v1 = this.V8 + player0.e1();
                }
                boolean z = false;
                boolean z1 = v != this.W8;
                if(v1 != this.X8) {
                    z = true;
                }
                this.W8 = v;
                this.X8 = v1;
                TextView textView0 = this.m;
                if(textView0 != null && !this.M && z1) {
                    textView0.setText(Util.H0(this.o, this.p, v));
                }
                TimeBar timeBar0 = this.n;
                if(timeBar0 != null) {
                    timeBar0.setPosition(v);
                    this.n.setBufferedPosition(v1);
                }
                ProgressUpdateListener legacyPlayerControlView$ProgressUpdateListener0 = this.H;
                if(legacyPlayerControlView$ProgressUpdateListener0 != null && (z1 || z)) {
                    legacyPlayerControlView$ProgressUpdateListener0.a(v, v1);
                }
                this.removeCallbacks(this.s);
                int v2 = player0 == null ? 1 : player0.b();
                long v3 = 1000L;
                if(player0 != null && player0.isPlaying()) {
                    long v4 = Math.min((this.n == null ? 1000L : this.n.getPreferredUpdateDelay()), 1000L - v % 1000L);
                    float f = player0.m().a;
                    if(f > 0.0f) {
                        v3 = (long)(((float)v4) / f);
                    }
                    this.postDelayed(this.s, Util.x(v3, this.O, 1000L));
                    return;
                }
                if(v2 != 1 && v2 != 4) {
                    this.postDelayed(this.s, 1000L);
                }
            }
        };
        this.t = () -> if(this.D()) {
            this.setVisibility(8);
            for(Object object0: this.b) {
                ((VisibilityListener)object0).u(this.getVisibility());
            }
            this.removeCallbacks(this.s);
            this.removeCallbacks(this.t);
            this.Q8 = 0x8000000000000001L;
        };
        LayoutInflater.from(context0).inflate(v1, this);
        this.setDescendantFocusability(0x40000);
        TimeBar timeBar0 = (TimeBar)this.findViewById(id.exo_progress);
        View view0 = this.findViewById(id.exo_progress_placeholder);
        if(timeBar0 != null) {
            this.n = timeBar0;
        }
        else if(view0 == null) {
            this.n = null;
        }
        else {
            DefaultTimeBar defaultTimeBar0 = new DefaultTimeBar(context0, null, 0, attributeSet1);
            defaultTimeBar0.setId(0x7F0B0480);  // id:exo_progress
            defaultTimeBar0.setLayoutParams(view0.getLayoutParams());
            ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
            int v3 = viewGroup0.indexOfChild(view0);
            viewGroup0.removeView(view0);
            viewGroup0.addView(defaultTimeBar0, v3);
            this.n = defaultTimeBar0;
        }
        this.l = (TextView)this.findViewById(id.exo_duration);
        this.m = (TextView)this.findViewById(id.exo_position);
        TimeBar timeBar1 = this.n;
        if(timeBar1 != null) {
            timeBar1.c(legacyPlayerControlView$ComponentListener0);
        }
        View view1 = this.findViewById(id.exo_play);
        this.e = view1;
        if(view1 != null) {
            view1.setOnClickListener(legacyPlayerControlView$ComponentListener0);
        }
        View view2 = this.findViewById(id.exo_pause);
        this.f = view2;
        if(view2 != null) {
            view2.setOnClickListener(legacyPlayerControlView$ComponentListener0);
        }
        View view3 = this.findViewById(id.exo_prev);
        this.c = view3;
        if(view3 != null) {
            view3.setOnClickListener(legacyPlayerControlView$ComponentListener0);
        }
        View view4 = this.findViewById(id.exo_next);
        this.d = view4;
        if(view4 != null) {
            view4.setOnClickListener(legacyPlayerControlView$ComponentListener0);
        }
        View view5 = this.findViewById(id.exo_rew);
        this.h = view5;
        if(view5 != null) {
            view5.setOnClickListener(legacyPlayerControlView$ComponentListener0);
        }
        View view6 = this.findViewById(id.exo_ffwd);
        this.g = view6;
        if(view6 != null) {
            view6.setOnClickListener(legacyPlayerControlView$ComponentListener0);
        }
        ImageView imageView0 = (ImageView)this.findViewById(id.exo_repeat_toggle);
        this.i = imageView0;
        if(imageView0 != null) {
            imageView0.setOnClickListener(legacyPlayerControlView$ComponentListener0);
        }
        ImageView imageView1 = (ImageView)this.findViewById(id.exo_shuffle);
        this.j = imageView1;
        if(imageView1 != null) {
            imageView1.setOnClickListener(legacyPlayerControlView$ComponentListener0);
        }
        View view7 = this.findViewById(id.exo_vr);
        this.k = view7;
        this.setShowVrButton(false);
        this.M(false, false, view7);
        Resources resources0 = context0.getResources();
        this.C = ((float)resources0.getInteger(integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.D = ((float)resources0.getInteger(integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.u = Util.o0(context0, resources0, drawable.exo_legacy_controls_repeat_off);
        this.v = Util.o0(context0, resources0, drawable.exo_legacy_controls_repeat_one);
        this.w = Util.o0(context0, resources0, drawable.exo_legacy_controls_repeat_all);
        this.A = Util.o0(context0, resources0, drawable.exo_legacy_controls_shuffle_on);
        this.B = Util.o0(context0, resources0, drawable.exo_legacy_controls_shuffle_off);
        this.x = resources0.getString(string.exo_controls_repeat_off_description);
        this.y = resources0.getString(string.exo_controls_repeat_one_description);
        this.z = resources0.getString(string.exo_controls_repeat_all_description);
        this.E = resources0.getString(string.exo_controls_shuffle_on_description);
        this.F = resources0.getString(string.exo_controls_shuffle_off_description);
        this.W8 = 0x8000000000000001L;
        this.X8 = 0x8000000000000001L;
    }

    // 检测为 Lambda 实现
    public void A() [...]

    private void B() {
        this.removeCallbacks(this.t);
        if(this.N > 0) {
            long v = SystemClock.uptimeMillis();
            int v1 = this.N;
            this.Q8 = v + ((long)v1);
            if(this.I) {
                this.postDelayed(this.t, ((long)v1));
            }
        }
        else {
            this.Q8 = 0x8000000000000001L;
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean C(int v) {
        switch(v) {
            case 0x4F: 
            case 85: 
            case 87: 
            case 88: 
            case 89: 
            case 90: 
            case 0x7E: 
            case 0x7F: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public boolean D() {
        return this.getVisibility() == 0;
    }

    public void E(VisibilityListener legacyPlayerControlView$VisibilityListener0) {
        this.b.remove(legacyPlayerControlView$VisibilityListener0);
    }

    private void F() {
        boolean z = Util.j2(this.G, this.K);
        if(z) {
            View view0 = this.e;
            if(view0 != null) {
                view0.sendAccessibilityEvent(8);
                return;
            }
        }
        if(!z) {
            View view1 = this.f;
            if(view1 != null) {
                view1.sendAccessibilityEvent(8);
            }
        }
    }

    private void G() {
        boolean z = Util.j2(this.G, this.K);
        if(z) {
            View view0 = this.e;
            if(view0 != null) {
                view0.requestFocus();
                return;
            }
        }
        if(!z) {
            View view1 = this.f;
            if(view1 != null) {
                view1.requestFocus();
            }
        }
    }

    private void H(Player player0, int v, long v1) {
        player0.W1(v, v1);
    }

    private void I(Player player0, long v) {
        Timeline timeline0 = player0.O1();
        if(!this.L || timeline0.w()) {
            v2 = player0.n2();
        }
        else {
            int v1 = timeline0.v();
            int v2;
            for(v2 = 0; true; ++v2) {
                long v3 = timeline0.t(v2, this.r).e();
                if(v < v3) {
                    break;
                }
                if(v2 == v1 - 1) {
                    v = v3;
                    break;
                }
                v -= v3;
            }
        }
        this.H(player0, v2, v);
        this.P();
    }

    public void J(@Nullable long[] arr_v, @Nullable boolean[] arr_z) {
        boolean z = false;
        if(arr_v == null) {
            this.T8 = new long[0];
            this.U8 = new boolean[0];
        }
        else {
            boolean[] arr_z1 = (boolean[])Assertions.g(arr_z);
            if(arr_v.length == arr_z1.length) {
                z = true;
            }
            Assertions.a(z);
            this.T8 = arr_v;
            this.U8 = arr_z1;
        }
        this.S();
    }

    public void K() {
        if(!this.D()) {
            this.setVisibility(0);
            for(Object object0: this.b) {
                ((VisibilityListener)object0).u(this.getVisibility());
            }
            this.L();
            this.G();
            this.F();
        }
        this.B();
    }

    private void L() {
        this.O();
        this.N();
        this.Q();
        this.R();
        this.S();
    }

    private void M(boolean z, boolean z1, @Nullable View view0) {
        if(view0 == null) {
            return;
        }
        view0.setEnabled(z1);
        view0.setAlpha((z1 ? this.C : this.D));
        view0.setVisibility((z ? 0 : 8));
    }

    private void N() {
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        if(this.D() && this.I) {
            Player player0 = this.G;
            if(player0 == null) {
                z = false;
                z4 = false;
                z1 = false;
                z2 = false;
                z3 = false;
            }
            else {
                z = player0.v0(5);
                z1 = player0.v0(7);
                z2 = player0.v0(11);
                z3 = player0.v0(12);
                z4 = player0.v0(9);
            }
            this.M(this.N8, z1, this.c);
            this.M(this.Q, z2, this.h);
            this.M(this.M8, z3, this.g);
            this.M(this.O8, z4, this.d);
            TimeBar timeBar0 = this.n;
            if(timeBar0 != null) {
                timeBar0.setEnabled(z);
            }
        }
    }

    private void O() {
        int v3;
        int v2;
        if(this.D() && this.I) {
            boolean z = Util.j2(this.G, this.K);
            View view0 = this.e;
            int v = 8;
            int v1 = 1;
            if(view0 == null) {
                v2 = 0;
                v3 = 0;
            }
            else {
                v2 = z || !view0.isFocused() ? 0 : 1;
                if(Util.a < 21) {
                    v3 = v2;
                }
                else {
                    v3 = z || !Api21.a(this.e) ? 0 : 1;
                }
                this.e.setVisibility((z ? 0 : 8));
            }
            View view1 = this.f;
            if(view1 != null) {
                v2 |= (!z || !view1.isFocused() ? 0 : 1);
                if(Util.a < 21) {
                    v1 = v2;
                }
                else if(!z || !Api21.a(this.f)) {
                    v1 = 0;
                }
                v3 |= v1;
                View view2 = this.f;
                if(!z) {
                    v = 0;
                }
                view2.setVisibility(v);
            }
            if(v2 != 0) {
                this.G();
            }
            if(v3 != 0) {
                this.F();
            }
        }
    }

    // 检测为 Lambda 实现
    private void P() [...]

    private void Q() {
        if(this.D() && this.I) {
            ImageView imageView0 = this.i;
            if(imageView0 != null) {
                if(this.P == 0) {
                    this.M(false, false, imageView0);
                    return;
                }
                Player player0 = this.G;
                if(player0 == null) {
                    this.M(true, false, imageView0);
                    this.i.setImageDrawable(this.u);
                    this.i.setContentDescription(this.x);
                    return;
                }
                this.M(true, true, imageView0);
                int v = player0.i();
                switch(v) {
                    case 0: {
                        this.i.setImageDrawable(this.u);
                        this.i.setContentDescription(this.x);
                        break;
                    }
                    case 1: {
                        this.i.setImageDrawable(this.v);
                        this.i.setContentDescription(this.y);
                        break;
                    }
                    default: {
                        if(v == 2) {
                            this.i.setImageDrawable(this.w);
                            this.i.setContentDescription(this.z);
                        }
                    }
                }
                this.i.setVisibility(0);
            }
        }
    }

    private void R() {
        if(this.D() && this.I) {
            ImageView imageView0 = this.j;
            if(imageView0 != null) {
                Player player0 = this.G;
                if(!this.P8) {
                    this.M(false, false, imageView0);
                    return;
                }
                if(player0 == null) {
                    this.M(true, false, imageView0);
                    this.j.setImageDrawable(this.B);
                    this.j.setContentDescription(this.F);
                    return;
                }
                this.M(true, true, imageView0);
                Drawable drawable0 = player0.t2() ? this.A : this.B;
                this.j.setImageDrawable(drawable0);
                String s = player0.t2() ? this.E : this.F;
                this.j.setContentDescription(s);
            }
        }
    }

    private void S() {
        Window timeline$Window1;
        int v5;
        Player player0 = this.G;
        if(player0 == null) {
            return;
        }
        this.L = this.J && LegacyPlayerControlView.x(player0.O1(), this.r);
        long v = 0L;
        this.V8 = 0L;
        Timeline timeline0 = player0.O1();
        if(timeline0.w()) {
            v5 = 0;
        }
        else {
            int v1 = player0.n2();
            int v2 = this.L ? 0 : v1;
            int v3 = this.L ? timeline0.v() - 1 : v1;
            long v4 = 0L;
            v5 = 0;
            while(v2 <= v3) {
                if(v2 == v1) {
                    this.V8 = Util.B2(v4);
                }
                timeline0.t(v2, this.r);
                Window timeline$Window0 = this.r;
                if(timeline$Window0.m == 0x8000000000000001L) {
                    Assertions.i(!this.L);
                    break;
                }
                int v6 = timeline$Window0.n;
                while(true) {
                    timeline$Window1 = this.r;
                    if(v6 > timeline$Window1.o) {
                        break;
                    }
                    timeline0.j(v6, this.q);
                    int v7 = this.q.s();
                    int v8 = this.q.e();
                    while(v7 < v8) {
                        long v9 = this.q.h(v7);
                        if(v9 == 0x8000000000000000L) {
                            long v10 = this.q.d;
                            if(v10 != 0x8000000000000001L) {
                                v9 = v10;
                                goto label_33;
                            }
                        }
                        else {
                        label_33:
                            long v11 = v9 + this.q.r();
                            if(v11 >= 0L) {
                                long[] arr_v = this.R8;
                                if(v5 == arr_v.length) {
                                    int v12 = arr_v.length == 0 ? 1 : arr_v.length * 2;
                                    this.R8 = Arrays.copyOf(arr_v, v12);
                                    this.S8 = Arrays.copyOf(this.S8, v12);
                                }
                                long[] arr_v1 = this.R8;
                                arr_v1[v5] = Util.B2(v4 + v11);
                                this.S8[v5] = this.q.t(v7);
                                ++v5;
                            }
                        }
                        ++v7;
                    }
                    ++v6;
                }
                v4 += timeline$Window1.m;
                ++v2;
            }
            v = v4;
        }
        long v13 = Util.B2(v);
        TextView textView0 = this.l;
        if(textView0 != null) {
            textView0.setText(Util.H0(this.o, this.p, v13));
        }
        TimeBar timeBar0 = this.n;
        if(timeBar0 != null) {
            timeBar0.setDuration(v13);
            int v14 = this.T8.length;
            int v15 = v5 + v14;
            long[] arr_v2 = this.R8;
            if(v15 > arr_v2.length) {
                this.R8 = Arrays.copyOf(arr_v2, v15);
                this.S8 = Arrays.copyOf(this.S8, v15);
            }
            System.arraycopy(this.T8, 0, this.R8, v5, v14);
            System.arraycopy(this.U8, 0, this.S8, v5, v14);
            this.n.b(this.R8, this.S8, v15);
        }
        this.P();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.y(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.removeCallbacks(this.t);
                return super.dispatchTouchEvent(motionEvent0);
            }
            case 1: {
                this.B();
                return super.dispatchTouchEvent(motionEvent0);
            }
            default: {
                return super.dispatchTouchEvent(motionEvent0);
            }
        }
    }

    @Nullable
    public Player getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.P8;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        return this.k != null && this.k.getVisibility() == 0;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        long v = this.Q8;
        if(v != 0x8000000000000001L) {
            long v1 = v - SystemClock.uptimeMillis();
            if(v1 <= 0L) {
                this.A();
            }
            else {
                this.postDelayed(this.t, v1);
            }
        }
        else if(this.D()) {
            this.B();
        }
        this.L();
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        this.removeCallbacks(this.s);
        this.removeCallbacks(this.t);
    }

    public void setPlayer(@Nullable Player player0) {
        boolean z = false;
        Assertions.i(Looper.myLooper() == Looper.getMainLooper());
        if(player0 == null || player0.P1() == Looper.getMainLooper()) {
            z = true;
        }
        Assertions.a(z);
        Player player1 = this.G;
        if(player1 == player0) {
            return;
        }
        if(player1 != null) {
            player1.J1(this.a);
        }
        this.G = player0;
        if(player0 != null) {
            player0.M1(this.a);
        }
        this.L();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener legacyPlayerControlView$ProgressUpdateListener0) {
        this.H = legacyPlayerControlView$ProgressUpdateListener0;
    }

    public void setRepeatToggleModes(int v) {
        this.P = v;
        Player player0 = this.G;
        if(player0 != null) {
            int v1 = player0.i();
            if(v == 0 && v1 != 0) {
                this.G.q(0);
            }
            else if(v == 1 && v1 == 2) {
                this.G.q(1);
            }
            else if(v == 2 && v1 == 1) {
                this.G.q(2);
            }
        }
        this.Q();
    }

    public void setShowFastForwardButton(boolean z) {
        this.M8 = z;
        this.N();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.J = z;
        this.S();
    }

    public void setShowNextButton(boolean z) {
        this.O8 = z;
        this.N();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.K = z;
        this.O();
    }

    public void setShowPreviousButton(boolean z) {
        this.N8 = z;
        this.N();
    }

    public void setShowRewindButton(boolean z) {
        this.Q = z;
        this.N();
    }

    public void setShowShuffleButton(boolean z) {
        this.P8 = z;
        this.R();
    }

    public void setShowTimeoutMs(int v) {
        this.N = v;
        if(this.D()) {
            this.B();
        }
    }

    public void setShowVrButton(boolean z) {
        View view0 = this.k;
        if(view0 != null) {
            view0.setVisibility((z ? 0 : 8));
        }
    }

    public void setTimeBarMinUpdateInterval(int v) {
        this.O = Util.w(v, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener view$OnClickListener0) {
        View view0 = this.k;
        if(view0 != null) {
            view0.setOnClickListener(view$OnClickListener0);
            this.M(this.getShowVrButton(), view$OnClickListener0 != null, this.k);
        }
    }

    public void w(VisibilityListener legacyPlayerControlView$VisibilityListener0) {
        Assertions.g(legacyPlayerControlView$VisibilityListener0);
        this.b.add(legacyPlayerControlView$VisibilityListener0);
    }

    private static boolean x(Timeline timeline0, Window timeline$Window0) {
        if(timeline0.v() > 100) {
            return false;
        }
        int v = timeline0.v();
        for(int v1 = 0; v1 < v; ++v1) {
            if(timeline0.t(v1, timeline$Window0).m == 0x8000000000000001L) {
                return false;
            }
        }
        return true;
    }

    public boolean y(KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        Player player0 = this.G;
        if(player0 != null && LegacyPlayerControlView.C(v)) {
            if(keyEvent0.getAction() == 0) {
                switch(v) {
                    case 89: {
                        player0.v2();
                        return true;
                    label_8:
                        if(keyEvent0.getRepeatCount() == 0) {
                            switch(v) {
                                case 0x4F: 
                                case 85: {
                                    Util.T0(player0, this.K);
                                    return true;
                                }
                                case 87: {
                                    player0.R1();
                                    return true;
                                }
                                case 88: {
                                    player0.B1();
                                    return true;
                                }
                                case 0x7E: {
                                    Util.R0(player0);
                                    return true;
                                }
                                case 0x7F: {
                                    Util.Q0(player0);
                                    return true;
                                }
                                default: {
                                    return true;
                                }
                            }
                        }
                        break;
                    }
                    case 90: {
                        if(player0.b() != 4) {
                            player0.f1();
                            return true;
                        }
                        break;
                    }
                    default: {
                        goto label_8;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static int z(TypedArray typedArray0, int v) {
        return typedArray0.getInt(styleable.LegacyPlayerControlView_repeat_toggle_modes, v);
    }

    class androidx.media3.ui.LegacyPlayerControlView.1 {
    }

}

