package com.dcinside.app.voice;

import A3.p;
import Y.K8;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.dcinside.app.archive.folder.ArchiveVoiceSelectActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Q;
import com.dcinside.app.rx.bus.r0;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.zk;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.tool.e;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.mackhartley.roundedprogressbar.RoundedProgressBar;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.q0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kr.better.widget.BetterTextView;
import rx.o;

@s0({"SMAP\nVoiceRecordView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceRecordView.kt\ncom/dcinside/app/voice/VoiceRecordView\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,790:1\n39#2:791\n55#2,12:792\n84#2,3:804\n255#3:807\n255#3:808\n255#3:809\n176#3,2:811\n176#3,2:813\n176#3,2:815\n176#3,2:817\n257#3,2:819\n257#3,2:821\n257#3,2:823\n257#3,2:825\n257#3,2:827\n257#3,2:829\n257#3,2:831\n257#3,2:833\n257#3,2:835\n257#3,2:837\n257#3,2:839\n257#3,2:841\n257#3,2:843\n257#3,2:845\n257#3,2:847\n257#3,2:849\n257#3,2:851\n257#3,2:853\n257#3,2:855\n257#3,2:857\n257#3,2:859\n257#3,2:861\n31#4:810\n*S KotlinDebug\n*F\n+ 1 VoiceRecordView.kt\ncom/dcinside/app/voice/VoiceRecordView\n*L\n632#1:791\n632#1:792,12\n632#1:804,3\n180#1:807\n184#1:808\n300#1:809\n532#1:811,2\n541#1:813,2\n549#1:815,2\n557#1:817,2\n686#1:819,2\n687#1:821,2\n688#1:823,2\n689#1:825,2\n690#1:827,2\n700#1:829,2\n701#1:831,2\n702#1:833,2\n726#1:835,2\n733#1:837,2\n734#1:839,2\n735#1:841,2\n736#1:843,2\n739#1:845,2\n740#1:847,2\n750#1:849,2\n751#1:851,2\n759#1:853,2\n760#1:855,2\n761#1:857,2\n762#1:859,2\n769#1:861,2\n414#1:810\n*E\n"})
public final class m extends FrameLayout implements PermissionListener {
    public static enum l {
        RECORD,
        TEXT;

        private static final l[] c;
        private static final a d;

        static {
            l.c = arr_m$l;
            L.p(arr_m$l, "entries");
            l.d = new d(arr_m$l);
        }

        private static final l[] a() [...] // Inlined contents

        @y4.l
        public static a b() {
            return l.d;
        }
    }

    static enum com.dcinside.app.voice.m.m {
        RECORD_STATE,
        RECORDING_STATE,
        PLAY_STATE,
        PLAYING_STATE;

        private static final com.dcinside.app.voice.m.m[] e;
        private static final a f;

        static {
            com.dcinside.app.voice.m.m.e = arr_m$m;
            L.p(arr_m$m, "entries");
            com.dcinside.app.voice.m.m.f = new d(arr_m$m);
        }

        private static final com.dcinside.app.voice.m.m[] a() [...] // Inlined contents

        @y4.l
        public static a b() {
            return com.dcinside.app.voice.m.m.f;
        }
    }

    public final class n {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.voice.m.m.values().length];
            try {
                arr_v[com.dcinside.app.voice.m.m.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.voice.m.m.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.voice.m.m.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.voice.m.m.a.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            n.a = arr_v;
        }
    }

    @y4.l
    private K8 a;
    private int b;
    @y4.m
    private MediaRecorder c;
    @y4.m
    private File d;
    private long e;
    @y4.m
    private o f;
    @y4.m
    private o g;
    @y4.m
    private c h;
    @y4.m
    private b i;
    @y4.l
    private com.dcinside.app.voice.m.m j;
    private int k;
    @y4.l
    private final e l;
    private boolean m;
    @y4.l
    private TextWatcher n;
    @y4.m
    private ValueAnimator o;

    public m(@y4.l Context context0) {
        @f(c = "com.dcinside.app.voice.VoiceRecordView$10", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.voice.m.a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            com.dcinside.app.voice.m.a(m m0, kotlin.coroutines.d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.voice.m.a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.Q();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$11", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.voice.m.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            com.dcinside.app.voice.m.b(m m0, kotlin.coroutines.d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.voice.m.b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.W();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$12", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.voice.m.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            com.dcinside.app.voice.m.c(m m0, kotlin.coroutines.d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.voice.m.c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.X();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$1", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.voice.m.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            com.dcinside.app.voice.m.d(m m0, kotlin.coroutines.d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.voice.m.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.D();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$2", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.voice.m.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            com.dcinside.app.voice.m.e(m m0, kotlin.coroutines.d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.voice.m.e(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.G();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$3", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.voice.m.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            com.dcinside.app.voice.m.f(m m0, kotlin.coroutines.d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                return new com.dcinside.app.voice.m.f(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.K();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$4", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final m m;

            g(m m0, kotlin.coroutines.d d0) {
                this.m = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                g m$g0 = new g(this.m, d0);
                m$g0.l = view0;
                return m$g0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.y(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$5", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final m m;

            h(m m0, kotlin.coroutines.d d0) {
                this.m = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                h m$h0 = new h(this.m, d0);
                m$h0.l = view0;
                return m$h0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.y(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$6", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            i(m m0, kotlin.coroutines.d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                return new i(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.J();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$7", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            j(m m0, kotlin.coroutines.d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                return new j(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.H();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.voice.VoiceRecordView$8", f = "VoiceRecordView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final m l;

            k(m m0, kotlin.coroutines.d d0) {
                this.l = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@y4.l O o0, @y4.l View view0, @y4.m kotlin.coroutines.d d0) {
                return new k(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.N();
                return S0.a;
            }
        }


        public static final class com.dcinside.app.voice.m.o implements TextWatcher {
            final m a;

            com.dcinside.app.voice.m.o(m m0) {
                this.a = m0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@y4.m Editable editable0) {
                this.a.z();
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@y4.m CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@y4.m CharSequence charSequence0, int v, int v1, int v2) {
            }
        }


        @s0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 VoiceRecordView.kt\ncom/dcinside/app/voice/VoiceRecordView\n*L\n1#1,82:1\n63#2:83\n59#3:84\n632#4:85\n*E\n"})
        public static final class s implements TextWatcher {
            final m a;

            public s(m m0) {
                this.a = m0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                this.a.I(charSequence0, v, v1, v2);
            }
        }

        L.p(context0, "context");
        super(context0);
        this.j = com.dcinside.app.voice.m.m.a;
        this.k = 4;
        this.m = true;
        this.n = new com.dcinside.app.voice.m.o(this);
        K8 k80 = K8.b(LayoutInflater.from(context0), this);
        L.o(k80, "inflate(...)");
        this.a = k80;
        this.setClickable(true);
        ViewCompat.R1(this, vk.e(context0, 0x1010054));
        ColorStateList colorStateList0 = ColorStateList.valueOf(ContextCompat.getColor(context0, 0x7F060104));  // color:divide0
        L.o(colorStateList0, "valueOf(...)");
        vk.q(colorStateList0, new View[]{this.a.b.t, this.a.b.r});
        this.a.b.w.setText(Bk.E(0L));
        this.l = new e(this.a.b.f, this.a.b.h, this.a.b.g, null, this.a.b.i);
        ImageView imageView0 = this.a.d;
        L.o(imageView0, "voiceRecorderClose");
        r.M(imageView0, null, new com.dcinside.app.voice.m.d(this, null), 1, null);
        ImageView imageView1 = this.a.e;
        L.o(imageView1, "voiceRecorderConfirm");
        r.M(imageView1, null, new com.dcinside.app.voice.m.e(this, null), 1, null);
        ImageView imageView2 = this.a.b.m;
        L.o(imageView2, "voiceRecorderIcon");
        r.M(imageView2, null, new com.dcinside.app.voice.m.f(this, null), 1, null);
        ConstraintLayout constraintLayout0 = this.a.b.t;
        L.o(constraintLayout0, "voiceRecorderRecordTab");
        r.M(constraintLayout0, null, new g(this, null), 1, null);
        ConstraintLayout constraintLayout1 = this.a.b.r;
        L.o(constraintLayout1, "voiceRecorderPasteTab");
        r.M(constraintLayout1, null, new h(this, null), 1, null);
        BetterTextView betterTextView0 = this.a.b.q;
        L.o(betterTextView0, "voiceRecorderLoadArchive");
        r.M(betterTextView0, null, new i(this, null), 1, null);
        TextView textView0 = this.a.b.l;
        L.o(textView0, "voiceRecorderCopyrightDetailText");
        r.M(textView0, null, new j(this, null), 1, null);
        TextView textView1 = this.a.b.u;
        L.o(textView1, "voiceRecorderRetryContainer");
        r.M(textView1, null, new k(this, null), 1, null);
        ClearableEditText clearableEditText0 = this.a.b.p;
        L.o(clearableEditText0, "voiceRecorderInputText");
        clearableEditText0.addTextChangedListener(new s(this));
        this.a.b.A.addTextChangedListener(this.n);
        TextView textView2 = this.a.b.x;
        L.o(textView2, "voiceReplyDefGuestNick");
        r.M(textView2, null, new com.dcinside.app.voice.m.a(this, null), 1, null);
        ImageView imageView3 = this.a.b.z;
        L.o(imageView3, "voiceReplyDeleteDefNick");
        r.M(imageView3, null, new com.dcinside.app.voice.m.b(this, null), 1, null);
        TextView textView3 = this.a.b.D;
        L.o(textView3, "voiceReplyUseDefNick");
        r.M(textView3, null, new com.dcinside.app.voice.m.c(this, null), 1, null);
    }

    private final void A(boolean z, boolean z1, int v, int v1) {
        boolean z2 = z || z1;
        if(z2) {
            this.O(((long)v), ((long)v1), 300L);
            this.a.b.w.setText(Bk.E(v));
        }
        else {
            this.O(1L, 1L, 300L);
            this.a.b.w.setText(Bk.E(this.e));
        }
        if(this.a.b.m.isSelected() != z2) {
            this.a.b.m.setSelected(z2);
            if(z2) {
                this.U(com.dcinside.app.voice.m.m.d);
                return;
            }
            this.U(com.dcinside.app.voice.m.m.c);
        }
    }

    private final void B() {
        String s;
        FileInputStream fileInputStream1;
        this.U(com.dcinside.app.voice.m.m.c);
        kl.b(new o[]{this.f});
        this.setKeepScreenOn(false);
        MediaRecorder mediaRecorder0 = this.c;
        FileInputStream fileInputStream0 = null;
        if(mediaRecorder0 != null) {
            try {
                this.c = null;
                mediaRecorder0.stop();
                mediaRecorder0.reset();
                mediaRecorder0.release();
            }
            catch(RuntimeException unused_ex) {
                mediaRecorder0.reset();
                mediaRecorder0.release();
            }
        }
        if(this.e == 0L) {
            try {
                File file0 = this.getInputRecord();
                L.m(file0);
                fileInputStream1 = new FileInputStream(file0.getPath());
            }
            catch(Exception exception0) {
                goto label_35;
            }
            catch(Throwable throwable0) {
                goto label_41;
            }
            try {
                FileDescriptor fileDescriptor0 = fileInputStream1.getFD();
                MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
                mediaMetadataRetriever0.setDataSource(fileDescriptor0);
                s = mediaMetadataRetriever0.extractMetadata(9);
                mediaMetadataRetriever0.release();
                fileInputStream1.close();
            }
            catch(Exception exception1) {
                fileInputStream0 = fileInputStream1;
                exception0 = exception1;
                goto label_35;
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(fileInputStream1, throwable1);
                throw throwable1;
            }
            if(s != null) {
                try {
                    this.e = Long.parseLong(s);
                }
                catch(Exception exception0) {
                    try {
                    label_35:
                        exception0.printStackTrace();
                        zk.a(exception0);
                        if(fileInputStream0 != null) {
                            goto label_38;
                        }
                        goto label_43;
                    }
                    catch(Throwable throwable0) {
                        goto label_41;
                    }
                    try {
                    label_38:
                        fileInputStream0.close();
                    }
                    catch(Exception unused_ex) {
                    }
                }
                catch(Throwable throwable0) {
                label_41:
                    TWR.safeClose$NT(fileInputStream0, throwable0);
                    throw throwable0;
                }
            }
        }
    label_43:
        this.O(1L, 1L, 0L);
        this.a.b.w.setText(Bk.E(this.e));
    }

    public final void C() {
        ConstraintLayout constraintLayout0 = ll.K() ? this.a.b.t : this.a.b.r;
        L.m(constraintLayout0);
        this.y(constraintLayout0);
    }

    public final void D() {
        static final class com.dcinside.app.voice.m.p extends N implements Function1 {
            public static final com.dcinside.app.voice.m.p e;

            static {
                com.dcinside.app.voice.m.p.e = new com.dcinside.app.voice.m.p();
            }

            com.dcinside.app.voice.m.p() {
                super(1);
            }

            @y4.m
            public final Object a(@y4.l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F15009E);  // string:alert_clear_voice "녹음된 음성은 저장되지 않습니다.\n녹음을 중단하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class q extends N implements Function1 {
            public static final q e;

            static {
                q.e = new q();
            }

            q() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.voice.m.r extends N implements Function1 {
            final m e;

            com.dcinside.app.voice.m.r(m m0) {
                this.e = m0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                b b0 = this.e.i;
                if(b0 != null) {
                    b0.a(this.e);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        kl.b(new o[]{this.g});
        File file0 = this.getInputRecord();
        if(file0 != null && file0.exists()) {
            String s = file0.getPath();
            Context context0 = Dl.b(this);
            L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            com.dcinside.app.perform.r.c r$c0 = com.dcinside.app.perform.r.g(((AppCompatActivity)context0)).i(s);
            if(r$c0 != null) {
                r$c0.x();
            }
            this.g = com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).n(com.dcinside.app.voice.m.p.e).z(0x7F150793).x(0x7F150792).b().Z1((Object object0) -> {
                L.p(q.e, "$tmp0");
                return (Boolean)q.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new com.dcinside.app.voice.m.r(this), "$tmp0");
                new com.dcinside.app.voice.m.r(this).invoke(object0);
            });
            return;
        }
        b b0 = this.i;
        if(b0 != null) {
            b0.a(this);
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean E(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void F(Function1 function10, Object object0) [...]

    private final void G() {
        boolean z1;
        if(this.a.b.E.getVisibility() == 0) {
            String s = String.valueOf(this.a.b.A.getText());
            ConstraintLayout constraintLayout0 = this.a.b.y;
            L.o(constraintLayout0, "voiceReplyDefGuestWrap");
            if(constraintLayout0.getVisibility() == 0) {
                CharSequence charSequence0 = this.a.b.x.getText();
                if(charSequence0 == null) {
                    s = "";
                }
                else {
                    s = charSequence0.toString();
                    if(s == null) {
                        s = "";
                    }
                }
            }
            if(s.length() < 2) {
                this.V(0x7F15078B);  // string:please_check_guest_info "닉네임 및 비밀번호를 확인해주세요."
                return;
            }
            if(String.valueOf(this.a.b.B.getText()).length() < this.k) {
                this.V(0x7F15078B);  // string:please_check_guest_info "닉네임 및 비밀번호를 확인해주세요."
                return;
            }
        }
        if(this.l.l() && !this.l.h()) {
            this.V(0x7F15078D);  // string:please_code_input "코드를 입력해 주세요."
            return;
        }
        File file0 = this.getInputRecord();
        boolean z = this.a.c.isChecked();
        if(file0 == null || !file0.exists()) {
            z1 = false;
        }
        else {
            String s1 = file0.getPath();
            Context context0 = Dl.b(this);
            L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            com.dcinside.app.perform.r.c r$c0 = com.dcinside.app.perform.r.g(((AppCompatActivity)context0)).i(s1);
            if(r$c0 != null) {
                r$c0.x();
            }
            z1 = true;
        }
        if(this.getInputType() == l.a) {
            if(z1) {
                c c0 = this.h;
                if(c0 == null) {
                    return;
                }
                c0.d(this, z);
                return;
            }
            this.V(0x7F150B85);  // string:voice_recorder_desc_request "녹음 버튼을 눌러주세요."
            return;
        }
        Editable editable0 = this.a.b.p.getText();
        String s2 = editable0 == null ? null : editable0.toString();
        if(s2 != null && !v.x3(s2)) {
            com.dcinside.app.voice.a a0 = com.dcinside.app.voice.a.d.a(s2, com.dcinside.app.voice.a.e, false);
            if(a0 == null) {
                this.V(0x7F150B88);  // string:voice_recorder_iframe_unknown "해당 보이스의 정보를 불러올 수 없습니다.\n소스를 다시 확인해주세요."
                return;
            }
            m0.a.a a$a0 = m0.a.a;
            if(a$a0.j(a0.c())) {
                this.V(0x7F150B87);  // string:voice_recorder_iframe_not_blank_content "해당 보이스의 정보를 불러올 수 없습니다.\n소스에 잘못된 
                                     // 문자가 포함되었습니다."
                return;
            }
            if(a$a0.j(a0.d())) {
                this.V(0x7F150B87);  // string:voice_recorder_iframe_not_blank_content "해당 보이스의 정보를 불러올 수 없습니다.\n소스에 잘못된 
                                     // 문자가 포함되었습니다."
                return;
            }
            c c1 = this.h;
            if(c1 != null) {
                c1.d(this, z);
            }
            return;
        }
        this.V(0x7F150B86);  // string:voice_recorder_iframe_empty "해당 보이스의 정보를 불러올 수 없습니다.\n소스를 입력해 주세요."
    }

    private final void H() {
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        com.dcinside.app.rx.bus.c.a(context0, new r0());
    }

    private final void I(CharSequence charSequence0, int v, int v1, int v2) {
        if(this.getInputType() == l.b) {
            this.U(this.j);
        }
    }

    private final void J() {
        Intent intent0 = new Intent(this.getContext(), ArchiveVoiceSelectActivity.class);
        Context context0 = Dl.b(this);
        L.n(context0, "null cannot be cast to non-null type android.app.Activity");
        ((Activity)context0).startActivityForResult(intent0, 1020);
    }

    private final void K() {
        if(this.getInputRecord() == null) {
            this.V(0x7F1500AB);  // string:alert_record_unable "녹음을 진행할 수 없습니다. 인터넷 연결 상태 또는 저장소의 상태를 확인해주세요."
            return;
        }
        switch(this.j) {
            case 2: {
                this.B();
                return;
            }
            case 1: 
            case 3: {
                this.L();
                return;
            }
            case 4: {
                this.R();
            }
        }
    }

    private final void L() {
        Context context0 = this.getContext();
        L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        File file0 = this.getInputRecord();
        L.m(file0);
        String s = file0.getPath();
        if(this.j == com.dcinside.app.voice.m.m.c) {
            this.O(0L, 1L, 0L);
            com.dcinside.app.perform.r.c r$c0 = com.dcinside.app.perform.r.g(((AppCompatActivity)context0)).j(s, (boolean z, boolean z1, int v, int v1) -> {
                L.p(this, "this$0");
                this.A(z, z1, v, v1);
            });
            if(r$c0 != null) {
                r$c0.t();
            }
        }
        else {
            com.dcinside.app.perform.r.c r$c1 = com.dcinside.app.perform.r.g(((AppCompatActivity)context0)).i(s);
            if(r$c1 != null) {
                r$c1.x();
            }
            this.O(1L, 1L, 0L);
        }
    }

    // 检测为 Lambda 实现
    private static final void M(m m0, boolean z, boolean z1, int v, int v1) [...]

    private final void N() {
        kl.b(new o[]{this.f});
        this.f = null;
        this.e = 0L;
        this.U(com.dcinside.app.voice.m.m.a);
        this.O(0L, 1L, 0L);
        this.a.b.w.setText(Bk.E(0L));
        this.a.b.u.setVisibility(4);
    }

    private final void O(long v, long v1, long v2) {
        float f = ((float)Math.min(v + v2, v1)) / Math.max(v1, 1.0f) * 100.0f;
        ValueAnimator valueAnimator0 = this.o;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        RoundedProgressBar roundedProgressBar0 = this.a.b.s;
        L.o(roundedProgressBar0, "voiceRecorderProgress");
        roundedProgressBar0.setAnimationLength(v2);
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{((float)roundedProgressBar0.getProgressPercentage()), f});
        valueAnimator1.setInterpolator(new LinearInterpolator());
        valueAnimator1.addUpdateListener((ValueAnimator valueAnimator0) -> {
            L.p(roundedProgressBar0, "$bar");
            L.p(valueAnimator0, "animation");
            Object object0 = valueAnimator0.getAnimatedValue();
            L.n(object0, "null cannot be cast to non-null type kotlin.Float");
            roundedProgressBar0.O(((double)(((float)(((Float)object0))))), false);
        });
        valueAnimator1.setDuration(v2);
        valueAnimator1.start();
        this.o = valueAnimator1;
    }

    // 检测为 Lambda 实现
    private static final void P(RoundedProgressBar roundedProgressBar0, ValueAnimator valueAnimator0) [...]

    private final void Q() {
        ImageView imageView0 = this.a.b.z;
        L.o(imageView0, "voiceReplyDeleteDefNick");
        imageView0.setVisibility(0);
    }

    private final void R() {
        static final class t extends N implements Function1 {
            final m e;

            t(m m0) {
                this.e = m0;
                super(1);
            }

            public final void a(long v) {
                if(this.e.j != com.dcinside.app.voice.m.m.b && this.e.j != com.dcinside.app.voice.m.m.d) {
                    kl.b(new o[]{this.e.f});
                    return;
                }
                if(v * 1000L < 300000L) {
                    this.e.O(v * 1000L, 300000L, 1000L);
                    String s = Bk.E(v * 1000L);
                    this.e.a.b.w.setText(s);
                    return;
                }
                this.e.B();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).longValue());
                return S0.a;
            }
        }

        Context context0 = Dl.b(this);
        L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        if(cl.f(((AppCompatActivity)context0), this)) {
            this.b = 101;
            return;
        }
        AudioManager audioManager0 = (AudioManager)ContextCompat.getSystemService(((AppCompatActivity)context0), AudioManager.class);
        int v = 44100;
        if(audioManager0 != null) {
            String s = audioManager0.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if(s != null && s.length() > 0) {
                try {
                    v = Math.max(Integer.parseInt(s), 44100);
                }
                catch(Exception unused_ex) {
                }
            }
        }
        MediaRecorder mediaRecorder0 = Build.VERSION.SDK_INT < 0x1F ? new MediaRecorder() : com.dcinside.app.voice.e.a(this.getContext());
        this.c = mediaRecorder0;
        mediaRecorder0.setAudioSamplingRate(v);
        mediaRecorder0.setAudioEncodingBitRate(192000);
        mediaRecorder0.setAudioSource(1);
        mediaRecorder0.setOutputFormat(2);
        mediaRecorder0.setAudioEncoder(3);
        mediaRecorder0.setMaxDuration(300000);
        File file0 = this.getInputRecord();
        L.m(file0);
        mediaRecorder0.setOutputFile(file0.getPath());
        try {
            mediaRecorder0.setAudioChannels(2);
        }
        catch(Exception unused_ex) {
            mediaRecorder0.setAudioChannels(1);
        }
        mediaRecorder0.setOnErrorListener((MediaRecorder mediaRecorder0, int v, int v1) -> {
            L.p(this, "this$0");
            L.p(((AppCompatActivity)context0), "$activity");
            com.dcinside.app.http.f f0 = new com.dcinside.app.http.f(0x7F15032C);  // string:failed_record_audio "녹음 중 에러가 발생하여 녹음을 진행할 수 없습니다."
            this.g = com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).q(f0);
        });
        try {
            mediaRecorder0.prepare();
            mediaRecorder0.start();
            this.a.b.w.setText(Bk.E(0L));
            if(kl.a(new o[]{this.f})) {
                this.f = rx.g.K2(0L, 1L, TimeUnit.SECONDS).M3(rx.android.schedulers.a.c()).x5((Object object0) -> {
                    L.p(new t(this), "$tmp0");
                    new t(this).invoke(object0);
                });
            }
            this.U(com.dcinside.app.voice.m.m.b);
            this.setKeepScreenOn(true);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        com.dcinside.app.http.f f0 = new com.dcinside.app.http.f(0x7F15032C);  // string:failed_record_audio "녹음 중 에러가 발생하여 녹음을 진행할 수 없습니다."
        this.g = com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).q(f0);
        this.setKeepScreenOn(false);
    }

    // 检测为 Lambda 实现
    private static final void S(m m0, AppCompatActivity appCompatActivity0, MediaRecorder mediaRecorder0, int v, int v1) [...]

    // 检测为 Lambda 实现
    private static final void T(Function1 function10, Object object0) [...]

    private final void U(com.dcinside.app.voice.m.m m$m0) {
        this.j = m$m0;
        int v = 0x7F04012E;  // attr:colorAccent
        if(this.getInputType() == l.a) {
            switch(n.a[m$m0.ordinal()]) {
                case 1: {
                    this.a.b.m.setImageResource(0x7F0802FC);  // drawable:ic_voice_stop
                    ImageView imageView0 = this.a.b.m;
                    L.o(imageView0, "voiceRecorderIcon");
                    imageView0.setPadding(0, 0, 0, 0);
                    vk.h(0x7F04012E, new View[]{this.a.e});  // attr:colorAccent
                    vk.h(0x7F040505, new View[]{this.a.b.m});  // attr:recordIcColor
                    this.a.e.setEnabled(true);
                    this.a.b.u.setVisibility(4);
                    return;
                }
                case 2: {
                    this.a.b.m.setImageResource(0x7F0802FC);  // drawable:ic_voice_stop
                    vk.h(0x7F04032A, new View[]{this.a.e});  // attr:icTintNormal
                    ImageView imageView1 = this.a.b.m;
                    L.o(imageView1, "voiceRecorderIcon");
                    imageView1.setPadding(0, 0, 0, 0);
                    vk.h(0x7F040505, new View[]{this.a.b.m});  // attr:recordIcColor
                    this.a.e.setEnabled(false);
                    this.a.b.u.setVisibility(4);
                    return;
                }
                case 3: {
                    this.a.b.m.setImageResource(0x7F0802F9);  // drawable:ic_voice_playing
                    vk.h(0x7F04012E, new View[]{this.a.e});  // attr:colorAccent
                    ImageView imageView2 = this.a.b.m;
                    L.o(imageView2, "voiceRecorderIcon");
                    imageView2.setPadding(0, 0, 0, 0);
                    vk.h(0x7F040505, new View[]{this.a.b.m});  // attr:recordIcColor
                    this.a.e.setEnabled(true);
                    this.a.b.u.setVisibility(0);
                    return;
                }
                case 4: {
                    this.a.b.m.setImageResource(0x7F0802FA);  // drawable:ic_voice_recording
                    vk.h(0x7F04032A, new View[]{this.a.e});  // attr:icTintNormal
                    ImageView imageView3 = this.a.b.m;
                    L.o(imageView3, "voiceRecorderIcon");
                    imageView3.setPadding(0, 0, 0, 0);
                    vk.h(0x7F0400E1, new View[]{this.a.b.m});  // attr:caution
                    this.a.e.setEnabled(false);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        boolean z = this.a.b.p.length() > 0;
        if(!z) {
            v = 0x7F04032A;  // attr:icTintNormal
        }
        vk.h(v, new View[]{this.a.e});
        this.a.e.setEnabled(z);
        this.a.b.u.setVisibility(4);
    }

    private final void V(@StringRes int v) {
        int v1;
        if(Build.VERSION.SDK_INT >= 23) {
            WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.L(this.getRootWindowInsets());
            v1 = windowInsetsCompat0.C(8) ? windowInsetsCompat0.f(8).d : 0;
        }
        else {
            v1 = ll.q();
        }
        com.hjq.toast.s.u(80, 0, v1 + this.getHeight() + this.getResources().getDimensionPixelSize(0x7F07040B));  // dimen:voice_reply_toast_margin
        com.hjq.toast.s.E(v);
    }

    private final void W() {
        this.a.b.A.setEnabled(true);
        ConstraintLayout constraintLayout0 = this.a.b.y;
        L.o(constraintLayout0, "voiceReplyDefGuestWrap");
        constraintLayout0.setVisibility(8);
        TextView textView0 = this.a.b.D;
        L.o(textView0, "voiceReplyUseDefNick");
        textView0.setVisibility(0);
    }

    private final void X() {
        this.a.b.A.setEnabled(false);
        ConstraintLayout constraintLayout0 = this.a.b.y;
        L.o(constraintLayout0, "voiceReplyDefGuestWrap");
        constraintLayout0.setVisibility(0);
        TextView textView0 = this.a.b.x;
        L.o(textView0, "voiceReplyDefGuestNick");
        textView0.setVisibility(0);
        ImageView imageView0 = this.a.b.z;
        L.o(imageView0, "voiceReplyDeleteDefNick");
        imageView0.setVisibility(8);
        TextView textView1 = this.a.b.D;
        L.o(textView1, "voiceReplyUseDefNick");
        textView1.setVisibility(8);
    }

    @y4.l
    public final q0 getAllowGuestInfo() {
        LinearLayout linearLayout0 = this.a.b.E;
        L.o(linearLayout0, "voiceReplyUser");
        if(linearLayout0.getVisibility() == 0) {
            String s = String.valueOf(this.a.b.A.getText());
            String s1 = String.valueOf(this.a.b.B.getText());
            ConstraintLayout constraintLayout0 = this.a.b.y;
            L.o(constraintLayout0, "voiceReplyDefGuestWrap");
            return constraintLayout0.getVisibility() == 0 ? new q0(s, s1, Boolean.TRUE) : new q0(s, s1, Boolean.FALSE);
        }
        return new q0(null, null, Boolean.FALSE);
    }

    @y4.l
    public final e getCaptchaCodeManager() {
        return this.l;
    }

    @y4.m
    public final File getInputRecord() {
        File file0;
        Class class0;
        try {
            if(this.d != null) {
                return this.d;
            }
            class0 = m.class;
            __monitor_enter(class0);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return null;
        }
        try {
            if(this.d == null) {
                file0 = new File(this.getContext().getCacheDir(), "voice");
                if(!file0.exists()) {
                    goto label_27;
                }
                else if(file0.isDirectory()) {
                    int v = 0;
                    File[] arr_file = file0.listFiles();
                    if(arr_file != null && arr_file.length != 0) {
                        while(true) {
                            if(v >= arr_file.length) {
                                break;
                            }
                            if(!arr_file[v].delete()) {
                                goto label_15;
                            }
                            ++v;
                        }
                    }
                    this.d = new File(file0, com.dcinside.app.voice.a.d.c());
                }
                else {
                    goto label_19;
                }
            }
            goto label_35;
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
        try {
        label_15:
            __monitor_exit(class0);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
        try {
            this.d = new File(file0, com.dcinside.app.voice.a.d.c());
            goto label_35;
        label_19:
            if(file0.delete()) {
                if(file0.mkdirs()) {
                    this.d = new File(file0, com.dcinside.app.voice.a.d.c());
                    goto label_35;
                }
                goto label_23;
            }
            goto label_25;
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
        try {
        label_23:
            __monitor_exit(class0);
            return null;
        label_25:
            __monitor_exit(class0);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
        try {
        label_27:
            if(file0.mkdirs()) {
                this.d = new File(file0, com.dcinside.app.voice.a.d.c());
                goto label_35;
            }
            goto label_33;
        }
        catch(Throwable throwable0) {
            try {
            label_31:
                __monitor_exit(class0);
                throw throwable0;
            label_33:
                __monitor_exit(class0);
                return null;
            label_35:
                __monitor_exit(class0);
                return this.d;
            }
            catch(Exception exception0) {
            }
        }
        exception0.printStackTrace();
        return null;
    }

    @y4.m
    public final String getInputText() {
        return String.valueOf(this.a.b.p.getText());
    }

    @y4.l
    public final l getInputType() {
        return this.a.b.o.getVisibility() == 0 ? l.a : l.b;
    }

    @y4.l
    public final String getNick() {
        return String.valueOf(this.a.b.A.getText());
    }

    @y4.l
    public final String getPassword() {
        return String.valueOf(this.a.b.B.getText());
    }

    @y4.l
    public final String getTitle() {
        return String.valueOf(this.a.b.C.getText());
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.a.b.A.removeTextChangedListener(this.n);
        super.onDetachedFromWindow();
        kl.b(new o[]{this.f, this.g});
        switch(this.j) {
            case 1: {
                this.L();
                return;
            }
            case 2: {
                this.B();
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@y4.l PermissionDeniedResponse permissionDeniedResponse0) {
        L.p(permissionDeniedResponse0, "response");
        this.V(cl.b(permissionDeniedResponse0.getPermissionName()));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@y4.l PermissionGrantedResponse permissionGrantedResponse0) {
        L.p(permissionGrantedResponse0, "response");
        this.V(cl.c(permissionGrantedResponse0.getPermissionName()));
        if(this.b == 101) {
            this.R();
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@y4.l PermissionRequest permissionRequest0, @y4.l PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        L.p(permissionToken0, "token");
        permissionToken0.continuePermissionRequest();
    }

    public final void setCaptchaCodeInfo(@y4.m Q q0) {
        this.l.c(q0, com.dcinside.app.type.f.a);
    }

    public final void setEnableGuestInput(boolean z) {
        this.a.b.E.setVisibility((z ? 0 : 8));
    }

    public final void setGuestPwInputMin(int v) {
        this.k = v;
    }

    public final void setInputText(@y4.m String s) {
        ClearableEditText clearableEditText0 = this.a.b.p;
        if(s == null) {
            s = "";
        }
        clearableEditText0.setText(s);
    }

    public final void setOnVoiceRecordCloseListener(@y4.m b b0) {
        this.i = b0;
    }

    public final void setOnVoiceRecordConfirmListener(@y4.m c c0) {
        this.h = c0;
    }

    public final void x(@y4.m TextView textView0, @y4.m TextView textView1, @y4.m String s) {
        if(textView0 == null) {
            this.a.b.A.setEnabled(true);
            this.a.b.A.setText("");
        }
        else {
            this.a.b.A.setEnabled(textView0.isEnabled());
            this.a.b.A.setText(textView0.getText());
        }
        if(textView1 == null) {
            this.a.b.B.setEnabled(true);
            this.a.b.B.setText("");
        }
        else {
            this.a.b.B.setEnabled(textView1.isEnabled());
            this.a.b.B.setText(textView1.getText());
        }
        if(s != null) {
            this.m = true;
            if(s.length() > 0) {
                this.a.b.x.setText(s);
                if(dl.a.A2() && this.a.b.A.isEnabled()) {
                    this.a.b.A.setText("");
                }
            }
        }
    }

    private final void y(View view0) {
        if(L.g(view0, this.a.b.t)) {
            view0.setSelected(true);
            this.a.b.r.setSelected(false);
        }
        else if(L.g(view0, this.a.b.r)) {
            view0.setSelected(true);
            this.a.b.t.setSelected(false);
        }
        com.dcinside.app.voice.m.m m$m0 = this.j;
        if(m$m0 == com.dcinside.app.voice.m.m.b) {
            this.B();
        }
        else if(m$m0 == com.dcinside.app.voice.m.m.d) {
            this.L();
        }
        switch(view0.getId()) {
            case 0x7F0B10B8: {  // id:voice_recorder_paste_tab
                ll.m0(false);
                this.a.b.t.setSelected(false);
                this.a.b.r.setSelected(true);
                this.a.b.C.setVisibility(4);
                this.a.b.o.setVisibility(4);
                BetterTextView betterTextView0 = this.a.b.q;
                L.o(betterTextView0, "voiceRecorderLoadArchive");
                betterTextView0.setVisibility(0);
                ClearableEditText clearableEditText0 = this.a.b.p;
                L.o(clearableEditText0, "voiceRecorderInputText");
                clearableEditText0.setVisibility(0);
                VoiceTabIndicatorView voiceTabIndicatorView0 = this.a.b.b;
                L.o(voiceTabIndicatorView0, "voicePasteImg");
                voiceTabIndicatorView0.setVisibility(0);
                this.a.b.d.setVisibility(4);
                e.s(this.l, false, 1, null);
                break;
            }
            case 0x7F0B10BA: {  // id:voice_recorder_record_tab
                ll.m0(true);
                this.a.b.t.setSelected(true);
                this.a.b.r.setSelected(false);
                ClearableEditText clearableEditText1 = this.a.b.C;
                L.o(clearableEditText1, "voiceReplyTitle");
                clearableEditText1.setVisibility(0);
                ConstraintLayout constraintLayout0 = this.a.b.o;
                L.o(constraintLayout0, "voiceRecorderInputRecord");
                constraintLayout0.setVisibility(0);
                BetterTextView betterTextView1 = this.a.b.q;
                L.o(betterTextView1, "voiceRecorderLoadArchive");
                betterTextView1.setVisibility(8);
                ClearableEditText clearableEditText2 = this.a.b.p;
                L.o(clearableEditText2, "voiceRecorderInputText");
                clearableEditText2.setVisibility(8);
                VoiceTabIndicatorView voiceTabIndicatorView1 = this.a.b.d;
                L.o(voiceTabIndicatorView1, "voiceRecordImg");
                voiceTabIndicatorView1.setVisibility(0);
                this.a.b.b.setVisibility(4);
                e.s(this.l, false, 1, null);
            }
        }
        this.U(this.j);
    }

    private final void z() {
        CharSequence charSequence0 = this.a.b.x.getText();
        int v = 8;
        if(charSequence0 != null && charSequence0.length() != 0) {
            Editable editable0 = this.a.b.A.getText();
            String s = editable0 == null ? null : editable0.toString();
            boolean z = s == null || s.length() == 0;
            if(this.m && z) {
                ConstraintLayout constraintLayout0 = this.a.b.y;
                L.o(constraintLayout0, "voiceReplyDefGuestWrap");
                constraintLayout0.setVisibility(0);
                ImageView imageView0 = this.a.b.z;
                L.o(imageView0, "voiceReplyDeleteDefNick");
                imageView0.setVisibility(8);
                TextView textView0 = this.a.b.x;
                L.o(textView0, "voiceReplyDefGuestNick");
                textView0.setVisibility(0);
                TextView textView1 = this.a.b.D;
                L.o(textView1, "voiceReplyUseDefNick");
                textView1.setVisibility(8);
                return;
            }
            this.m = false;
            ConstraintLayout constraintLayout1 = this.a.b.y;
            L.o(constraintLayout1, "voiceReplyDefGuestWrap");
            constraintLayout1.setVisibility(8);
            TextView textView2 = this.a.b.D;
            L.o(textView2, "voiceReplyUseDefNick");
            if(z) {
                v = 0;
            }
            textView2.setVisibility(v);
            return;
        }
        ConstraintLayout constraintLayout2 = this.a.b.y;
        L.o(constraintLayout2, "voiceReplyDefGuestWrap");
        constraintLayout2.setVisibility(8);
    }
}

