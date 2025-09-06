package com.dcinside.app.write;

import android.app.Activity;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.p;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.dccon.DcConPickerView;
import com.dcinside.app.view.tool.j;
import com.dcinside.app.voice.b;
import com.dcinside.app.voice.c;
import com.dcinside.app.voice.m;
import kotlin.S0;
import kotlin.enums.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import rx.g;
import y4.l;

@s0({"SMAP\nPostWriteAddonsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteAddonsManager.kt\ncom/dcinside/app/write/PostWriteAddonsManager\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n147#2:249\n147#2:250\n147#2:251\n1#3:252\n*S KotlinDebug\n*F\n+ 1 PostWriteAddonsManager.kt\ncom/dcinside/app/write/PostWriteAddonsManager\n*L\n29#1:249\n30#1:250\n31#1:251\n*E\n"})
public final class h1 implements b, c {
    public static enum a {
        DCCON,
        VOICE;

        private static final a[] c;
        private static final kotlin.enums.a d;

        static {
            a.c = arr_h1$a;
            L.p(arr_h1$a, "entries");
            a.d = new d(arr_h1$a);
        }

        private static final a[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return a.d;
        }
    }

    public interface com.dcinside.app.write.h1.b {
        boolean U();
    }

    public interface com.dcinside.app.write.h1.c {
        void B(@l g arg1);

        void a0(@l p arg1);

        boolean d(@l m arg1, boolean arg2);
    }

    public final class com.dcinside.app.write.h1.d {
        public static final int[] a;

        static {
            int[] arr_v = new int[a.values().length];
            try {
                arr_v[a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.write.h1.d.a = arr_v;
        }
    }

    @l
    private final t a;
    @l
    private final t b;
    @l
    private final t c;
    private boolean d;
    @y4.m
    private View e;
    @y4.m
    private View f;
    @y4.m
    private View g;
    @y4.m
    private ViewGroup h;
    @y4.m
    private ViewGroup i;
    @y4.m
    private DcConPickerView j;
    @y4.m
    private m k;
    @y4.m
    private Runnable l;
    private int m;
    @y4.m
    private View.OnLayoutChangeListener n;

    public h1(@l Activity activity0, @l com.dcinside.app.write.h1.c h1$c0, @l com.dcinside.app.write.h1.b h1$b0) {
        L.p(activity0, "activity");
        L.p(h1$c0, "onWriteAddonActions");
        L.p(h1$b0, "onMoreMenuHiddenState");
        super();
        this.a = new t(activity0);
        this.b = new t(h1$c0);
        this.c = new t(h1$b0);
    }

    @Override  // com.dcinside.app.voice.b
    public void a(@l m m0) {
        L.p(m0, "view");
        this.n();
    }

    @Override  // com.dcinside.app.voice.c
    public void d(@l m m0, boolean z) {
        L.p(m0, "view");
        com.dcinside.app.write.h1.c h1$c0 = (com.dcinside.app.write.h1.c)this.b.a();
        if(h1$c0 != null && h1$c0.d(m0, z)) {
            this.n();
        }
    }

    public final void h(@l ViewGroup viewGroup0, @l View view0) {
        L.p(viewGroup0, "container");
        L.p(view0, "button");
        this.h = viewGroup0;
        this.f = view0;
    }

    public final void i(@l ViewGroup viewGroup0, @l View view0) {
        L.p(viewGroup0, "container");
        L.p(view0, "voiceButton");
        this.i = viewGroup0;
        this.g = view0;
    }

    public final void j() {
        if(this.m()) {
            m m0 = this.k;
            if(m0 == null) {
                this.n();
                return;
            }
            m0.D();
            return;
        }
        this.n();
    }

    @y4.m
    public final DcConPickerView k() {
        return this.j;
    }

    @y4.m
    public final m l() {
        return this.k;
    }

    public final boolean m() {
        return this.j != null || this.k != null;
    }

    public final void n() {
        View view0 = this.f;
        if(view0 != null) {
            view0.setAlpha(1.0f);
        }
        View view1 = this.g;
        if(view1 != null) {
            view1.setAlpha(1.0f);
        }
        Runnable runnable0 = this.l;
        if(runnable0 != null) {
            ViewGroup viewGroup0 = this.i;
            if(viewGroup0 != null) {
                viewGroup0.removeCallbacks(runnable0);
            }
            ViewGroup viewGroup1 = this.h;
            if(viewGroup1 != null) {
                viewGroup1.removeCallbacks(this.l);
            }
            this.l = null;
        }
        ViewGroup viewGroup2 = this.i;
        if(viewGroup2 != null && this.k != null) {
            L.m(viewGroup2);
            m m0 = this.k;
            L.m(m0);
            this.k = null;
            com.dcinside.app.util.ql.a.c(m0);
            viewGroup2.removeView(m0);
            m0.setOnVoiceRecordConfirmListener(null);
            m0.setOnVoiceRecordCloseListener(null);
        }
        ViewGroup viewGroup3 = this.h;
        if(viewGroup3 != null && this.j != null) {
            L.m(viewGroup3);
            DcConPickerView dcConPickerView0 = this.j;
            L.m(dcConPickerView0);
            this.j = null;
            com.dcinside.app.util.ql.a.c(dcConPickerView0);
            viewGroup3.removeView(dcConPickerView0);
            dcConPickerView0.setOnSelectedListener(null);
            dcConPickerView0.setOnLongSelectedListener(null);
        }
    }

    private final void o() {
        View view0 = this.e;
        if(view0 == null) {
            return;
        }
        com.dcinside.app.write.h1.b h1$b0 = (com.dcinside.app.write.h1.b)this.c.a();
        int v = 44;
        int v1 = h1$b0 == null || !h1$b0.U() ? 44 : 0x60;
        int v2 = 0;
        if(!this.d) {
            v = 0;
        }
        int v3 = Dk.d(v1 + v);
        ViewGroup viewGroup0 = this.h;
        if(viewGroup0 != null) {
            v2 = viewGroup0.getHeight();
        }
        int v4 = s.u(v2, v3);
        if(v4 == this.m) {
            return;
        }
        this.m = v4;
        j.h(view0, v4);
    }

    private final void p(p p0) {
        com.dcinside.app.write.h1.c h1$c0 = (com.dcinside.app.write.h1.c)this.b.a();
        if(h1$c0 != null) {
            h1$c0.a0(p0);
        }
    }

    private final void q(g g0) {
        this.n();
        com.dcinside.app.write.h1.c h1$c0 = (com.dcinside.app.write.h1.c)this.b.a();
        if(h1$c0 != null) {
            h1$c0.B(g0);
        }
    }

    public final void r() {
        this.n();
        ViewGroup viewGroup0 = this.h;
        if(viewGroup0 != null) {
            View.OnLayoutChangeListener view$OnLayoutChangeListener0 = this.n;
            if(view$OnLayoutChangeListener0 != null) {
                if(viewGroup0 != null) {
                    viewGroup0.removeOnLayoutChangeListener(view$OnLayoutChangeListener0);
                }
                this.n = null;
            }
            this.h = null;
        }
        this.i = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void s(@y4.m View view0) {
        if(view0 == null) {
            return;
        }
        this.e = view0;
        e1 e10 = (View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> {
            L.p(this, "this$0");
            this.o();
        };
        this.n = e10;
        ViewGroup viewGroup0 = this.h;
        if(viewGroup0 != null) {
            viewGroup0.addOnLayoutChangeListener(e10);
        }
    }

    // 检测为 Lambda 实现
    private static final void t(h1 h10, View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) [...]

    public final void u(boolean z) {
        this.d = z;
        this.o();
    }

    private final void v() {
        final class e extends H implements Function1 {
            e(Object object0) {
                super(1, object0, h1.class, "onDcconSelected", "onDcconSelected(Lrx/Observable;)V", 0);
            }

            public final void a(@l g g0) {
                L.p(g0, "p0");
                ((h1)this.receiver).q(g0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((g)object0));
                return S0.a;
            }
        }


        final class f extends H implements Function1 {
            f(Object object0) {
                super(1, object0, h1.class, "onDcconLongClicked", "onDcconLongClicked(Lcom/dcinside/app/model/DcConIcon;)V", 0);
            }

            public final void a(@l p p0) {
                L.p(p0, "p0");
                ((h1)this.receiver).p(p0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((p)object0));
                return S0.a;
            }
        }

        if(this.j == null && this.l == null) {
            ViewGroup viewGroup0 = this.h;
            if(viewGroup0 == null) {
                return;
            }
            this.l = () -> {
                L.p(this, "this$0");
                if(this.l == null) {
                    return;
                }
                this.l = null;
                if(this.j != null) {
                    return;
                }
                Activity activity0 = (Activity)this.a.a();
                if(activity0 != null) {
                    Activity activity1 = activity0.isFinishing() ? null : activity0;
                    if(activity1 != null) {
                        View view0 = this.f;
                        if(view0 != null) {
                            view0.setAlpha(0.6f);
                        }
                        DcConPickerView dcConPickerView0 = new DcConPickerView(activity1, null, 0, 6, null);
                        dcConPickerView0.W();
                        dcConPickerView0.setOnSelectedListener(new e(this));
                        dcConPickerView0.setOnLongSelectedListener(new f(this));
                        ViewGroup viewGroup0 = this.h;
                        if(viewGroup0 != null) {
                            viewGroup0.addView(dcConPickerView0, new ViewGroup.LayoutParams(-1, 0));
                        }
                        this.j = dcConPickerView0;
                    }
                }
            };
            Activity activity0 = (Activity)this.a.a();
            Nk.a.a(activity0);
            viewGroup0.postDelayed(this.l, 100L);
        }
    }

    // 检测为 Lambda 实现
    private static final void w(h1 h10) [...]

    private final void x() {
        if(this.k == null && this.l == null) {
            ViewGroup viewGroup0 = this.i;
            if(viewGroup0 == null) {
                return;
            }
            this.l = () -> {
                L.p(this, "this$0");
                if(this.l == null) {
                    return;
                }
                Activity activity0 = null;
                this.l = null;
                if(this.k != null) {
                    return;
                }
                Activity activity1 = (Activity)this.a.a();
                if(activity1 != null) {
                    if(!activity1.isFinishing()) {
                        activity0 = activity1;
                    }
                    if(activity0 != null) {
                        View view0 = this.g;
                        if(view0 != null) {
                            view0.setAlpha(0.6f);
                        }
                        View view1 = new View(activity0);
                        view1.setBackgroundColor(vk.b(activity0, 0x7F040158));  // attr:colorPrimary
                        view1.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        m m0 = new m(activity0);
                        m0.setEnableGuestInput(false);
                        m0.setOnVoiceRecordConfirmListener(this);
                        m0.setOnVoiceRecordCloseListener(this);
                        m0.C();
                        m0.addView(view1);
                        ViewGroup viewGroup0 = this.i;
                        if(viewGroup0 != null) {
                            viewGroup0.addView(m0, new ViewGroup.LayoutParams(-1, -2));
                        }
                        this.k = m0;
                    }
                }
            };
            Activity activity0 = (Activity)this.a.a();
            Nk.a.a(activity0);
            viewGroup0.postDelayed(this.l, 100L);
        }
    }

    // 检测为 Lambda 实现
    private static final void y(h1 h10) [...]

    public final void z(@l a h1$a0) {
        L.p(h1$a0, "addon");
        boolean z = false;
        switch(h1$a0) {
            case 1: {
                if(this.j == null) {
                    z = true;
                }
                this.n();
                if(z) {
                    this.v();
                    return;
                }
                break;
            }
            case 2: {
                if(this.k == null) {
                    z = true;
                }
                this.n();
                if(z) {
                    this.x();
                    return;
                }
                break;
            }
        }
    }
}

