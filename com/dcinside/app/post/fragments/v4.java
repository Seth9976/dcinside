package com.dcinside.app.post.fragments;

import A3.p;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.i;
import com.dcinside.app.http.q;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.Q;
import com.dcinside.app.post.c0;
import com.dcinside.app.read.H;
import com.dcinside.app.read.K0;
import com.dcinside.app.read.P0;
import com.dcinside.app.read.Q0;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.j;
import com.dcinside.app.type.G;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.zk;
import com.dcinside.app.view.StateAnnounceView;
import com.dcinside.app.view.popupmenu.U;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.E;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.v;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nPostReadImageNoteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadImageNoteView.kt\ncom/dcinside/app/post/fragments/PostReadImageNoteView\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,934:1\n177#2,9:935\n120#2,3:955\n124#2:959\n120#2,3:962\n124#2:966\n257#3,2:944\n257#3,2:946\n257#3,2:948\n257#3,2:950\n257#3,2:953\n257#3,2:960\n257#3,2:967\n257#3,2:969\n257#3,2:979\n327#3,4:981\n255#3:985\n327#3,4:986\n257#3,2:990\n255#3:994\n257#3,2:995\n327#3,4:997\n255#3:1001\n147#4:952\n1#5:958\n1#5:965\n1#5:976\n25#6:971\n1557#7:972\n1628#7,3:973\n295#7,2:977\n37#8,2:992\n*S KotlinDebug\n*F\n+ 1 PostReadImageNoteView.kt\ncom/dcinside/app/post/fragments/PostReadImageNoteView\n*L\n128#1:935,9\n313#1:955,3\n313#1:959\n321#1:962,3\n321#1:966\n182#1:944,2\n183#1:946,2\n185#1:948,2\n187#1:950,2\n245#1:953,2\n319#1:960,2\n326#1:967,2\n334#1:969,2\n679#1:979,2\n704#1:981,4\n720#1:985\n722#1:986,4\n768#1:990,2\n881#1:994\n882#1:995,2\n900#1:997,4\n917#1:1001\n231#1:952\n313#1:958\n321#1:965\n439#1:971\n439#1:972\n439#1:973,3\n633#1:977,2\n798#1:992,2\n*E\n"})
public final class v4 extends FrameLayout implements i {
    public static final class e {
        private e() {
        }

        public e(w w0) {
        }
    }

    public static enum f {
        MAX,
        MIN;

        private static final f[] c;
        private static final a d;

        static {
            f.c = arr_v4$f;
            L.p(arr_v4$f, "entries");
            f.d = new d(arr_v4$f);
        }

        private static final f[] a() [...] // Inlined contents

        @l
        public static a b() {
            return f.d;
        }
    }

    public final class g {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;

        static {
            int[] arr_v = new int[P0.values().length];
            try {
                arr_v[P0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[P0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[P0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            g.a = arr_v;
            int[] arr_v1 = new int[com.dcinside.app.post.fragments.N.a.values().length];
            try {
                arr_v1[com.dcinside.app.post.fragments.N.a.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[com.dcinside.app.post.fragments.N.a.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            g.b = arr_v1;
            int[] arr_v2 = new int[f.values().length];
            try {
                arr_v2[f.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[f.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            g.c = arr_v2;
        }
    }

    static final class u implements Observer, D {
        private final Function1 a;

        u(Function1 function10) {
            L.p(function10, "function");
            super();
            this.a = function10;
        }

        // 去混淆评级： 低(20)
        @Override
        public final boolean equals(@m Object object0) {
            return !(object0 instanceof Observer) || !(object0 instanceof D) ? false : L.g(this.getFunctionDelegate(), ((D)object0).getFunctionDelegate());
        }

        @Override  // kotlin.jvm.internal.D
        @l
        public final v getFunctionDelegate() {
            return this.a;
        }

        @Override
        public final int hashCode() {
            return this.getFunctionDelegate().hashCode();
        }

        @Override  // androidx.lifecycle.Observer
        public final void onChanged(Object object0) {
            this.a.invoke(object0);
        }
    }

    @m
    private k4 A;
    @m
    private d4 B;
    @m
    private C C;
    @l
    private f D;
    private boolean E;
    @m
    private String F;
    @m
    private String G;
    @l
    private final G H;
    @l
    private final kotlin.D I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private int M8;
    private int N;
    private boolean N8;
    private int O;
    private int O8;
    private int P;
    @l
    private final Map P8;
    private int Q;
    @l
    public static final e Q8 = null;
    private static final int R8 = 4;
    private static final int S8 = 30;
    private static final long T8 = 200L;
    private static final long U8 = 300L;
    @m
    private FrameLayout a;
    @m
    private LinearLayout b;
    @m
    private ConstraintLayout c;
    @m
    private View d;
    @m
    private TextView e;
    @m
    private RecyclerView f;
    @l
    private SparseArray g;
    @m
    private ConstraintLayout h;
    @m
    private FrameLayout i;
    @m
    private TextView j;
    @m
    private ImageView k;
    @m
    private TextView l;
    @m
    private TextView m;
    @m
    private TextView n;
    @m
    private ImageView o;
    @m
    private View p;
    @m
    private StateAnnounceView q;
    @m
    private ProgressBar r;
    @m
    private LinearLayout s;
    @m
    private o t;
    @m
    private o u;
    @m
    private I0 v;
    @m
    private I0 w;
    @m
    private t x;
    @l
    private H y;
    @m
    private N z;

    static {
        v4.Q8 = new e(null);
    }

    public v4(@l Context context0) {
        static final class com.dcinside.app.post.fragments.v4.a extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.post.fragments.v4.a e;

            static {
                com.dcinside.app.post.fragments.v4.a.e = new com.dcinside.app.post.fragments.v4.a();
            }

            com.dcinside.app.post.fragments.v4.a() {
                super(1);
            }

            public final void a(int v) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        static final class b extends kotlin.jvm.internal.N implements Function1 {
            final v4 e;

            b(v4 v40) {
                this.e = v40;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                if(z) {
                    this.e.F = null;
                }
                this.e.setInputVisible(z);
                C c0 = this.e.C;
                if(c0 != null) {
                    c0.N(z);
                }
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostReadImageNoteView$3", f = "PostReadImageNoteView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final v4 l;

            c(v4 v40, kotlin.coroutines.d d0) {
                this.l = v40;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.release();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostReadImageNoteView$4", f = "PostReadImageNoteView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.v4.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final v4 l;

            com.dcinside.app.post.fragments.v4.d(v4 v40, kotlin.coroutines.d d0) {
                this.l = v40;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.v4.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.r0();
                return S0.a;
            }
        }


        static final class com.dcinside.app.post.fragments.v4.m extends kotlin.jvm.internal.N implements A3.a {
            public static final com.dcinside.app.post.fragments.v4.m e;

            static {
                com.dcinside.app.post.fragments.v4.m.e = new com.dcinside.app.post.fragments.v4.m();
            }

            com.dcinside.app.post.fragments.v4.m() {
                super(0);
            }

            @l
            public final Long invoke() {
                return jl.a.j0();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }

        L.p(context0, "context");
        G g0;
        super(context0);
        this.g = new SparseArray();
        this.D = f.b;
        this.E = Al.a.s(context0);
        try {
            g0 = null;
            g0 = (G)G.b().get(((int)dl.a.H0()));
        }
        catch(Exception unused_ex) {
        }
        if(g0 == null) {
            g0 = G.b;
        }
        this.H = g0;
        this.I = E.a(com.dcinside.app.post.fragments.v4.m.e);
        this.J = 1;
        this.K = 1;
        this.N = -1;
        this.P = Dk.e(context0) - this.O;
        this.P8 = new LinkedHashMap();
        View.inflate(context0, 0x7F0E0239, this);  // layout:view_post_read_image_note
        this.a = (FrameLayout)this.findViewById(0x7F0B05FD);  // id:image_note_parent
        this.b = (LinearLayout)this.findViewById(0x7F0B05D3);  // id:image_note_bg
        this.h = (ConstraintLayout)this.findViewById(0x7F0B0601);  // id:image_note_text_container
        this.i = (FrameLayout)this.findViewById(0x7F0B05F1);  // id:image_note_input_parent
        this.c = (ConstraintLayout)this.findViewById(0x7F0B05FB);  // id:image_note_move
        this.d = this.findViewById(0x7F0B05FC);  // id:image_note_move_icon
        this.e = (TextView)this.findViewById(0x7F0B0607);  // id:image_note_title
        this.p = this.findViewById(0x7F0B0602);  // id:image_note_text_divider
        this.q = (StateAnnounceView)this.findViewById(0x7F0B05FF);  // id:image_note_state
        this.r = (ProgressBar)this.findViewById(0x7F0B05FE);  // id:image_note_progress_write
        this.f = (RecyclerView)this.findViewById(0x7F0B05FA);  // id:image_note_list
        this.j = (TextView)this.findViewById(0x7F0B0600);  // id:image_note_text
        this.k = (ImageView)this.findViewById(0x7F0B0605);  // id:image_note_text_profile_icon
        this.l = (TextView)this.findViewById(0x7F0B0606);  // id:image_note_text_profile_name
        this.m = (TextView)this.findViewById(0x7F0B0604);  // id:image_note_text_profile_anonymous
        this.n = (TextView)this.findViewById(0x7F0B05D5);  // id:image_note_confirm
        this.o = (ImageView)this.findViewById(0x7F0B05D4);  // id:image_note_close
        this.s = (LinearLayout)this.findViewById(0x7F0B0EEB);  // id:shadow_wrap
        this.X();
        b v4$b0 = new b(this);
        this.y = new H(this, com.dcinside.app.post.fragments.v4.a.e, v4$b0);
        if(this.E) {
            LinearLayout linearLayout0 = this.b;
            if(linearLayout0 != null) {
                linearLayout0.setBackgroundResource(0x7F0804DD);  // drawable:quick_write_input_bg
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b == null ? null : this.b.getLayoutParams();
            if(viewGroup$LayoutParams0 != null) {
                viewGroup$LayoutParams0.height = -1;
            }
            FrameLayout frameLayout0 = this.i;
            if(frameLayout0 != null) {
                frameLayout0.setBackgroundResource(0x7F08038F);  // drawable:image_note_bg_rounded_bottom
            }
            int v = Dk.b(0x7F070108);  // dimen:image_note_input_land_h
            int v1 = Dk.b(0x7F070107);  // dimen:image_note_input_land_b
            FrameLayout frameLayout1 = this.i;
            if(frameLayout1 != null) {
                frameLayout1.setPadding(v, 0, v, v1);
            }
            View view0 = this.d;
            if(view0 != null) {
                view0.setVisibility(8);
            }
            ImageView imageView0 = this.o;
            if(imageView0 != null) {
                imageView0.setVisibility(0);
            }
            View view1 = this.p;
            if(view1 != null) {
                view1.setVisibility(0);
            }
            LinearLayout linearLayout1 = this.s;
            if(linearLayout1 != null) {
                linearLayout1.setVisibility(8);
            }
            ImageView imageView1 = this.o;
            if(imageView1 != null) {
                r.M(imageView1, null, new c(this, null), 1, null);
            }
        }
        k4 k40 = new k4(this);
        this.A = k40;
        k40.h(this.E);
        TextView textView0 = this.n;
        if(textView0 != null) {
            r.M(textView0, null, new com.dcinside.app.post.fragments.v4.d(this, null), 1, null);
        }
    }

    private final void A0(int v, int v1) {
        boolean z1;
        boolean z = true;
        if((v == 0 || v1 > 0) && !this.E) {
            if(v == 0) {
                this.N8 = true;
                v4.y0(this, false, 1, null);
                return;
            }
            N n0 = this.z;
            if(n0 == null) {
                z1 = false;
            }
            else {
                LiveData liveData0 = n0.q();
                z1 = liveData0 == null ? false : L.g(liveData0.f(), Boolean.TRUE);
            }
            this.N8 = false;
            if(z1 || !L.g(this.F, "write")) {
                z = false;
            }
            this.setDefaultHeight(z);
            return;
        }
        this.N8 = false;
        v4.y0(this, false, 1, null);
    }

    private final void B0(AppCompatActivity appCompatActivity0, Throwable throwable0) {
        t t0 = this.x;
        if(t0 != null) {
            N3 n30 = (N3)t0.a();
            if(n30 != null) {
                StateAnnounceView stateAnnounceView0 = null;
                String s = "";
                Q q0 = n30.m5();
                if(q0 == null) {
                    return;
                }
                if(throwable0 instanceof q) {
                    String s1 = q0.G0();
                    String s2 = ((q)throwable0).getMessage();
                    if(s2 != null) {
                        s = s2;
                    }
                    com.dcinside.app.rx.bus.c.a(appCompatActivity0, new com.dcinside.app.rx.bus.i(s, s1));
                    this.setInputProgress(false);
                    return;
                }
                if(throwable0 instanceof com.dcinside.app.http.f) {
                    n30.T8(throwable0);
                    this.setInputProgress(false);
                    return;
                }
                if(throwable0 instanceof com.dcinside.app.http.b) {
                    for(Object object0: jl.a.B()) {
                        List list0 = ((com.dcinside.app.model.e)object0).g();
                        if(list0 != null && list0.contains(q0.G0())) {
                            stateAnnounceView0 = object0;
                            break;
                        }
                        List list1 = ((com.dcinside.app.model.e)object0).g();
                        if(list1 != null && list1.contains("*")) {
                            stateAnnounceView0 = object0;
                            break;
                        }
                    }
                    com.dcinside.app.type.e.a e$a0 = com.dcinside.app.type.e.a;
                    if(((com.dcinside.app.model.e)stateAnnounceView0) != null) {
                        String s3 = ((com.dcinside.app.model.e)stateAnnounceView0).h();
                        if(s3 != null) {
                            s = s3;
                        }
                    }
                    e$a0.h(appCompatActivity0, s);
                    this.setInputProgress(false);
                    return;
                }
                if(this.E) {
                    stateAnnounceView0 = this.q;
                }
                else {
                    C c0 = this.C;
                    if(c0 != null) {
                        stateAnnounceView0 = c0.getState();
                    }
                }
                if(stateAnnounceView0 != null) {
                    stateAnnounceView0.e(k0.d.g(throwable0));
                }
            }
        }
    }

    private final void I() {
        int v1;
        int v;
        switch(this.D) {
            case 1: {
                v = this.Q;
                break;
            }
            case 2: {
                v = this.P;
                break;
            }
            default: {
                throw new J();
            }
        }
        if(this.N8) {
            v1 = this.O8;
            if(v <= v1) {
                v1 = v - this.N;
            }
        }
        else {
            v1 = v - this.N;
        }
        LinearLayout linearLayout0 = this.b;
        if(linearLayout0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = linearLayout0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).height = v1;
            linearLayout0.setLayoutParams(((FrameLayout.LayoutParams)viewGroup$LayoutParams0));
        }
    }

    private final void J(boolean z) {
        int v = 0;
        if(this.a != null && this.a.getVisibility() == 0 == z) {
            return;
        }
        FrameLayout frameLayout0 = this.a;
        if(frameLayout0 != null) {
            if(!z) {
                v = 8;
            }
            frameLayout0.setVisibility(v);
        }
    }

    private final void K() {
        if(this.E) {
            TextView textView0 = this.j;
            if(textView0 != null) {
                textView0.setText(null);
            }
        }
        else {
            C c0 = this.C;
            if(c0 != null) {
                c0.M();
            }
        }
        this.setInputVisible(false);
    }

    public final void L(@l com.dcinside.app.post.fragments.N.a n$a0) {
        L.p(n$a0, "type");
        this.g.clear();
        t t0 = this.x;
        if(t0 != null) {
            N3 n30 = (N3)t0.a();
            if(n30 != null) {
                switch(n$a0) {
                    case 1: 
                    case 2: {
                        String s = this.G;
                        if(s == null) {
                            return;
                        }
                        n30.A7(n$a0, s, 1);
                        N n0 = this.z;
                        if(n0 != null) {
                            n0.u(n$a0);
                        }
                        this.K = 1;
                        v4.w0(this, false, 0, 0, 7, null);
                        RecyclerView recyclerView0 = this.f;
                        if(recyclerView0 != null) {
                            recyclerView0.scrollToPosition(0);
                        }
                        break;
                    }
                }
            }
        }
    }

    public static void M(v4 v40, com.dcinside.app.post.fragments.N.a n$a0, int v, Object object0) {
        if((v & 1) != 0) {
            n$a0 = com.dcinside.app.post.fragments.N.a.a;
        }
        v40.L(n$a0);
    }

    private final void N() {
        this.setInputVisible(false);
        this.setNoteViewVisible(false);
        N n0 = this.z;
        if(n0 != null) {
            n0.c();
        }
        this.z = null;
        FrameLayout frameLayout0 = this.i;
        if(frameLayout0 != null) {
            frameLayout0.removeAllViews();
        }
        this.C = null;
        d4 d40 = this.B;
        if(d40 != null) {
            d40.w();
        }
        this.B = null;
        k4 k40 = this.A;
        if(k40 != null) {
            k40.t();
        }
        this.A = null;
        this.x = null;
        I0 i00 = this.v;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.v = null;
        I0 i01 = this.w;
        if(i01 != null) {
            kotlinx.coroutines.I0.a.b(i01, null, 1, null);
        }
        this.w = null;
        t0 t00 = new t0(2);
        t00.a(this.t);
        t00.b(kotlin.collections.u.s2(this.P8.values()).toArray(new o[0]));
        kl.b(((o[])t00.d(new o[t00.c()])));
    }

    private final void O() {
        ViewPropertyAnimator viewPropertyAnimator4;
        int v = this.b == null ? this.Q : this.b.getHeight();
        LinearLayout linearLayout0 = this.b;
        if(linearLayout0 == null) {
            viewPropertyAnimator4 = null;
        }
        else {
            ViewPropertyAnimator viewPropertyAnimator0 = linearLayout0.animate();
            if(viewPropertyAnimator0 == null) {
                viewPropertyAnimator4 = null;
            }
            else {
                ViewPropertyAnimator viewPropertyAnimator1 = viewPropertyAnimator0.translationY(((float)v));
                if(viewPropertyAnimator1 == null) {
                    viewPropertyAnimator4 = null;
                }
                else {
                    ViewPropertyAnimator viewPropertyAnimator2 = viewPropertyAnimator1.setInterpolator(K0.g.a());
                    if(viewPropertyAnimator2 == null) {
                        viewPropertyAnimator4 = null;
                    }
                    else {
                        ViewPropertyAnimator viewPropertyAnimator3 = viewPropertyAnimator2.setDuration(200L);
                        viewPropertyAnimator4 = viewPropertyAnimator3 == null ? null : viewPropertyAnimator3.withEndAction(() -> {
                            L.p(this, "this$0");
                            this.N();
                        });
                    }
                }
            }
        }
        if(viewPropertyAnimator4 == null) {
            this.N();
            return;
        }
        viewPropertyAnimator4.start();
        LinearLayout linearLayout1 = this.b;
        if(linearLayout1 != null) {
            linearLayout1.postDelayed(() -> {
                L.p(this, "this$0");
                viewPropertyAnimator4.cancel();
                this.N();
            }, 300L);
        }
    }

    // 检测为 Lambda 实现
    private static final void P(v4 v40) [...]

    // 检测为 Lambda 实现
    private static final void Q(ViewPropertyAnimator viewPropertyAnimator0, v4 v40) [...]

    public final void R(boolean z) {
        FrameLayout frameLayout0 = this.a;
        if(frameLayout0 != null) {
            frameLayout0.requestDisallowInterceptTouchEvent(z);
        }
    }

    @m
    public final j S(int v) {
        return this.B == null ? null : this.B.y(v);
    }

    public final boolean T() {
        RecyclerView recyclerView0 = this.f;
        if(recyclerView0 != null) {
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 != null) {
                int v = recyclerView$Adapter0.getItemCount();
                if(!this.Z() && !this.M) {
                    LinearLayoutManager linearLayoutManager0 = null;
                    LayoutManager recyclerView$LayoutManager0 = this.f == null ? null : this.f.getLayoutManager();
                    if(recyclerView$LayoutManager0 instanceof LinearLayoutManager) {
                        linearLayoutManager0 = (LinearLayoutManager)recyclerView$LayoutManager0;
                    }
                    return ((long)v) <= ((long)(linearLayoutManager0 == null ? -1 : linearLayoutManager0.i())) + this.getLoadNextRemainPostCnt();
                }
            }
        }
        return false;
    }

    private final void U() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostReadImageNoteView$initInputView$1", f = "PostReadImageNoteView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final v4 l;

            h(v4 v40, kotlin.coroutines.d d0) {
                this.l = v40;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.setInputVisible(true);
                return S0.a;
            }
        }

        B b3;
        B b1;
        Boolean boolean1;
        Boolean boolean0;
        TextView textView0 = this.j;
        if(textView0 != null) {
            r.M(textView0, null, new h(this, null), 1, null);
        }
        TextView textView1 = this.j;
        if(textView1 != null) {
            textView1.setMovementMethod(new ScrollingMovementMethod());
        }
        StateAnnounceView stateAnnounceView0 = this.q;
        if(stateAnnounceView0 != null) {
            stateAnnounceView0.e(k0.d.a());
        }
        StateAnnounceView stateAnnounceView1 = this.q;
        if(stateAnnounceView1 != null) {
            stateAnnounceView1.setOnRetryListener(() -> {
                L.p(this, "this$0");
                StateAnnounceView stateAnnounceView0 = this.q;
                if(stateAnnounceView0 != null) {
                    stateAnnounceView0.e(k0.d.a());
                }
            });
        }
        N n0 = this.z;
        if(n0 == null) {
            boolean0 = Boolean.FALSE;
        }
        else {
            LiveData liveData0 = n0.q();
            if(liveData0 == null) {
                boolean0 = Boolean.FALSE;
            }
            else {
                boolean0 = (Boolean)liveData0.f();
                if(boolean0 == null) {
                    boolean0 = Boolean.FALSE;
                }
            }
        }
        if(boolean0.booleanValue()) {
            TextView textView2 = this.j;
            if(textView2 != null) {
                textView2.setEnabled(false);
            }
            TextView textView3 = this.j;
            if(textView3 != null) {
                textView3.setFocusable(false);
            }
            TextView textView4 = this.j;
            if(textView4 != null) {
                textView4.setFocusableInTouchMode(false);
            }
            TextView textView5 = this.j;
            if(textView5 != null) {
                textView5.setText(null);
            }
            TextView textView6 = this.j;
            if(textView6 != null) {
                textView6.setHint("멤버만 댓글을 쓸 수 있습니다.");
            }
            return;
        }
        N n1 = this.z;
        if(n1 == null) {
            boolean1 = Boolean.FALSE;
        }
        else {
            LiveData liveData1 = n1.g();
            if(liveData1 == null) {
                boolean1 = Boolean.FALSE;
            }
            else {
                boolean1 = (Boolean)liveData1.f();
                if(boolean1 == null) {
                    boolean1 = Boolean.FALSE;
                }
            }
        }
        boolean z = boolean1.booleanValue();
        switch(dl.a.U1()) {
            case 2: {
                if(z) {
                    TextView textView7 = this.j;
                    if(textView7 == null) {
                        return;
                    }
                    textView7.setHint(this.getContext().getString(0x7F1500BC, new Object[]{"이미지 댓글 입력"}));  // string:anonymous_profile_name "익명 %1$s"
                    return;
                }
                F0 f00 = F0.g4();
                try {
                    L.m(f00);
                    B b0 = B.E.V(f00);
                    b1 = b0 == null ? null : ((B)f00.d2(b0));
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable0;
                }
                kotlin.io.c.a(f00, null);
                if(b1 == null) {
                    return;
                }
                TextView textView8 = this.j;
                if(textView8 == null) {
                    return;
                }
                String s = b1.m6();
                if(s == null) {
                    s = "";
                }
                textView8.setHint(com.dcinside.app.internal.l.h(s, 10, null, 2, null) + " " + "이미지 댓글 입력");
                return;
            }
            case 3: {
                if(z) {
                    TextView textView9 = this.m;
                    if(textView9 != null) {
                        textView9.setVisibility(0);
                        return;
                    }
                    return;
                }
                F0 f01 = F0.g4();
                try {
                    L.m(f01);
                    B b2 = B.E.V(f01);
                    b3 = b2 == null ? null : ((B)f01.d2(b2));
                }
                catch(Throwable throwable1) {
                    kotlin.io.c.a(f01, throwable1);
                    throw throwable1;
                }
                kotlin.io.c.a(f01, null);
                if(b3 == null) {
                    return;
                }
                TextView textView10 = this.l;
                if(textView10 == null) {
                    return;
                }
                String s1 = b3.o6();
                if(s1 != null && s1.length() != 0) {
                    ImageView imageView0 = this.k;
                    if(imageView0 == null) {
                        return;
                    }
                    com.dcinside.app.glide.a.l(imageView0).g0().v2(s1).U1().q1(imageView0);
                    imageView0.setVisibility(0);
                    return;
                }
                com.dcinside.app.main.login.g.a.g(textView10, b3);
                textView10.setVisibility(0);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void V(v4 v40) [...]

    public final void W(@l N3 n30, boolean z, @l com.dcinside.app.rx.bus.v v0) {
        L.p(n30, "read");
        L.p(v0, "event");
        this.F = v0.c();
        this.G = v0.b();
        this.x = new t(n30);
        Q q0 = n30.m5();
        boolean z1 = (q0 == null ? -9 : q0.Y0()) > 0;
        Q q1 = n30.m5();
        String s = null;
        String s1 = q1 == null ? null : q1.p0();
        boolean z2 = !z1 && (s1 != null && s1.length() > 0);
        N n0 = this.z;
        if(n0 != null) {
            Q q2 = n30.m5();
            String s2 = q2 == null ? null : q2.G0();
            Q q3 = n30.m5();
            if(q3 != null) {
                s = q3.I0();
            }
            n0.B(s2, s, z1, s1, z2);
        }
        this.U();
        if(this.E) {
            int v1 = Dk.b(0x7F070108);  // dimen:image_note_input_land_h
            int v2 = z ? v1 : ((int)(((float)Dk.h(this.getContext())) * 0.1f));
            LinearLayout linearLayout0 = this.b;
            if(linearLayout0 != null) {
                r.f0(linearLayout0, v1, v1, v2, v2);
            }
        }
        else if(!z1) {
            ConstraintLayout constraintLayout0 = this.h;
            if(constraintLayout0 != null) {
                constraintLayout0.setVisibility(8);
            }
            FrameLayout frameLayout0 = this.i;
            if(frameLayout0 != null) {
                frameLayout0.removeAllViews();
            }
            Context context0 = this.getContext();
            L.o(context0, "getContext(...)");
            C c0 = new C(context0);
            this.C = c0;
            FrameLayout frameLayout1 = this.i;
            if(frameLayout1 != null) {
                frameLayout1.addView(c0);
            }
            C c1 = this.C;
            if(c1 != null) {
                c1.setCaptcha(n30.m5());
            }
        }
        this.setNoteViewVisible(true);
        d4 d40 = new d4(n30);
        this.B = d40;
        RecyclerView recyclerView0 = this.f;
        if(recyclerView0 != null) {
            recyclerView0.setAdapter(d40);
        }
        RecyclerView recyclerView1 = this.f;
        if(recyclerView1 != null) {
            recyclerView1.setLayoutManager(new NonPredictiveLayoutManager());
        }
        this.v0(true, 1, v0.a());
    }

    private final void X() {
        @s0({"SMAP\nPostReadImageNoteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadImageNoteView.kt\ncom/dcinside/app/post/fragments/PostReadImageNoteView$initViewModel$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,934:1\n257#2,2:935\n*S KotlinDebug\n*F\n+ 1 PostReadImageNoteView.kt\ncom/dcinside/app/post/fragments/PostReadImageNoteView$initViewModel$1\n*L\n277#1:935,2\n*E\n"})
        static final class com.dcinside.app.post.fragments.v4.i extends kotlin.jvm.internal.N implements Function1 {
            final int e;
            final v4 f;

            com.dcinside.app.post.fragments.v4.i(int v, v4 v40) {
                this.e = v;
                this.f = v40;
                super(1);
            }

            public final void a(com.dcinside.app.post.fragments.N.c n$c0) {
                int v = Math.max(this.e, n$c0.e());
                TextView textView0 = this.f.j;
                int v1 = 0;
                if(textView0 != null) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = textView0.getLayoutParams();
                    if(viewGroup$LayoutParams0 != null) {
                        if(v <= 0) {
                            v = -2;
                        }
                        viewGroup$LayoutParams0.height = v;
                    }
                    textView0.scrollTo(0, 0);
                    textView0.setText(n$c0.f());
                }
                TextView textView1 = this.f.n;
                if(textView1 != null) {
                    if(n$c0.f().length() <= 0) {
                        v1 = 8;
                    }
                    textView1.setVisibility(v1);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.post.fragments.N.c)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.post.fragments.v4.j extends kotlin.jvm.internal.N implements Function1 {
            final v4 e;

            com.dcinside.app.post.fragments.v4.j(v4 v40) {
                this.e = v40;
                super(1);
            }

            public final void a(Boolean boolean0) {
                if(!boolean0.booleanValue()) {
                    return;
                }
                this.e.r0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Context context0 = this.getContext();
        c0 c00 = context0 instanceof c0 ? ((c0)context0) : null;
        if(c00 instanceof ViewModelStoreOwner) {
            this.z = (N)new ViewModelProvider(c00).a(N.class);
            int v = Dk.b(0x7F070109);  // dimen:image_note_input_min
            int v1 = Dk.b(0x7F07010B);  // dimen:image_note_input_unit
            N n0 = this.z;
            if(n0 != null) {
                n0.f(v1, v);
            }
            if(this.E) {
                N n1 = this.z;
                if(n1 != null) {
                    LiveData liveData0 = n1.n();
                    if(liveData0 != null) {
                        LiveData liveData1 = Transformations.a(liveData0);
                        if(liveData1 != null) {
                            liveData1.k(c00, new u(new com.dcinside.app.post.fragments.v4.i(v, this)));
                        }
                    }
                }
            }
            N n2 = this.z;
            if(n2 != null) {
                LiveData liveData2 = n2.s();
                if(liveData2 != null) {
                    LiveData liveData3 = Transformations.a(liveData2);
                    if(liveData3 != null) {
                        liveData3.k(c00, new u(new com.dcinside.app.post.fragments.v4.j(this)));
                    }
                }
            }
        }
    }

    public final boolean Y(float f, boolean z) {
        if(this.D == f.a) {
            return Math.abs(f) >= ((float)this.Q) ? this.a != null && this.a.getVisibility() == 0 : false;
        }
        return f <= 0.0f && z ? false : this.a != null && this.a.getVisibility() == 0;
    }

    private final boolean Z() {
        return this.K >= this.J;
    }

    private final void a0(AppCompatActivity appCompatActivity0, int v, Throwable throwable0) {
        static final class k extends kotlin.jvm.internal.N implements Function1 {
            final String e;

            k(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.post.fragments.v4.l extends kotlin.jvm.internal.N implements Function1 {
            final v4 e;
            final int f;

            com.dcinside.app.post.fragments.v4.l(v4 v40, int v) {
                this.e = v40;
                this.f = v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    v4.w0(this.e, false, this.f, 0, 5, null);
                    return;
                }
                this.e.release();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        String s = throwable0.getMessage();
        if(s == null) {
            s = "서버에 연결할 수 없습니다.";
            L.o("서버에 연결할 수 없습니다.", "getString(...)");
        }
        else {
            if(s.length() <= 0) {
                s = null;
            }
            if(s == null) {
                s = "서버에 연결할 수 없습니다.";
                L.o("서버에 연결할 수 없습니다.", "getString(...)");
            }
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new k(s)).z(0x7F1508D7).x(0x7F1501F2).b().y5((Object object0) -> {
            L.p(new com.dcinside.app.post.fragments.v4.l(this, v), "$tmp0");
            new com.dcinside.app.post.fragments.v4.l(this, v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.release();
        });
        this.setProgress(false);
        this.M = true;
    }

    // 检测为 Lambda 实现
    private static final void b0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void c0(v4 v40, Throwable throwable0) [...]

    public final void d0() {
        v4.w0(this, false, this.K + 1, 0, 5, null);
    }

    private final List e0() {
        List list0 = new ArrayList();
        kotlin.ranges.l l0 = s.W1(0, this.g.size());
        ArrayList arrayList0 = new ArrayList(kotlin.collections.u.b0(l0, 10));
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            int v = ((T)iterator0).b();
            arrayList0.add(this.g.keyAt(v));
        }
        for(Object object0: kotlin.collections.u.q5(arrayList0)) {
            List list1 = (List)this.g.get(((Number)object0).intValue());
            if(list1 != null) {
                list0.addAll(list1);
            }
        }
        return list0;
    }

    public final void f0(int v) {
        static final class n extends kotlin.jvm.internal.N implements Function1 {
            final Q e;
            final j f;

            n(Q q0, j j0) {
                this.e = q0;
                this.f = j0;
                super(1);
            }

            public final rx.g b(String s) {
                return uk.qG(this.e, this.f.a0(), s, false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((String)object0));
            }
        }


        static final class com.dcinside.app.post.fragments.v4.o extends kotlin.jvm.internal.N implements Function1 {
            final v4 e;

            com.dcinside.app.post.fragments.v4.o(v4 v40) {
                this.e = v40;
                super(1);
            }

            public final void a(com.dcinside.app.model.f0 f00) {
                this.e.L(com.dcinside.app.post.fragments.N.a.b);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.f0)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.post.fragments.v4.p extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.post.fragments.v4.p e;

            static {
                com.dcinside.app.post.fragments.v4.p.e = new com.dcinside.app.post.fragments.v4.p();
            }

            com.dcinside.app.post.fragments.v4.p() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F1500A5);  // string:alert_delete_reply "삭제된 댓글은 복구할 수 없습니다. 댓글을 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.post.fragments.v4.q extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.post.fragments.v4.q e;

            static {
                com.dcinside.app.post.fragments.v4.q.e = new com.dcinside.app.post.fragments.v4.q();
            }

            com.dcinside.app.post.fragments.v4.q() {
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


        static final class com.dcinside.app.post.fragments.v4.r extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.post.fragments.v4.r e;

            static {
                com.dcinside.app.post.fragments.v4.r.e = new com.dcinside.app.post.fragments.v4.r();
            }

            com.dcinside.app.post.fragments.v4.r() {
                super(1);
            }

            public final rx.g a(Boolean boolean0) {
                return rx.g.Q2(null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }

        t t0 = this.x;
        if(t0 != null) {
            N3 n30 = (N3)t0.a();
            if(n30 != null) {
                FragmentActivity fragmentActivity0 = n30.getActivity();
                AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
                if(appCompatActivity0 == null) {
                    return;
                }
                if(!kl.a(new o[]{this.u})) {
                    Dl.D(this.getContext(), 0x7F1500AF);  // string:alert_reply_progress "요청이 처리중입니다."
                    return;
                }
                Q q0 = n30.m5();
                if(q0 == null) {
                    return;
                }
                d4 d40 = this.B;
                if(d40 != null) {
                    j j0 = d40.y(v);
                    if(j0 != null) {
                        com.dcinside.app.read.f f0 = com.dcinside.app.read.f.e.c(q0, j0);
                        if(!f0.e()) {
                            return;
                        }
                        this.u = (f0.f() ? U.e.g(appCompatActivity0) : com.dcinside.app.perform.e.e.a(appCompatActivity0).n(com.dcinside.app.post.fragments.v4.p.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                            L.p(com.dcinside.app.post.fragments.v4.q.e, "$tmp0");
                            return (Boolean)com.dcinside.app.post.fragments.v4.q.e.invoke(object0);
                        }).f2((Object object0) -> {
                            L.p(com.dcinside.app.post.fragments.v4.r.e, "$tmp0");
                            return (rx.g)com.dcinside.app.post.fragments.v4.r.e.invoke(object0);
                        })).f2((Object object0) -> {
                            L.p(new n(q0, j0), "$tmp0");
                            return (rx.g)new n(q0, j0).invoke(object0);
                        }).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
                            L.p(new com.dcinside.app.post.fragments.v4.o(this), "$tmp0");
                            new com.dcinside.app.post.fragments.v4.o(this).invoke(object0);
                        }, (Throwable throwable0) -> {
                            L.p(appCompatActivity0, "$activity");
                            com.dcinside.app.perform.e e0 = com.dcinside.app.perform.e.e.a(appCompatActivity0);
                            L.m(throwable0);
                            e0.q(throwable0);
                        });
                    }
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean g0(Function1 function10, Object object0) [...]

    @m
    public final LinearLayout getBgWrap() {
        return this.b;
    }

    @l
    public final f getCurrentSize() {
        return this.D;
    }

    @m
    public final RecyclerView getList() {
        return this.f;
    }

    private final long getLoadNextRemainPostCnt() {
        return ((Number)this.I.getValue()).longValue();
    }

    @m
    public final View getMoveIcon() {
        return this.d;
    }

    @m
    public final ConstraintLayout getMoveWrap() {
        return this.c;
    }

    @m
    public final FrameLayout getParent() {
        return this.a;
    }

    @m
    public final TextView getTitle() {
        return this.e;
    }

    private final i0.a getWriteArgs() {
        N3 n30 = this.x == null ? null : ((N3)this.x.a());
        N n0 = this.z;
        if(n0 != null) {
            LiveData liveData0 = n0.t();
            if(liveData0 != null) {
                i0.a a0 = (i0.a)liveData0.f();
                if(a0 != null) {
                    j j0 = new j(null, null, 0, null, null, null, null, null, null, null, 0, null, null, false, null, 0, false, false, null, null, null, false, 0, false, false, 0, null, 0x7FFFFFF, null);
                    j0.H0(B.E.k0());
                    j0.B0((this.G == null ? 0 : Integer.parseInt(this.G)));
                    i0.a a1 = a0.u(Q0.e).y(j0);
                    return n30 == null ? a1.w(null) : a1.w(n30.m5());
                }
            }
        }
        return null;
    }

    // 检测为 Lambda 实现
    private static final rx.g h0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final rx.g i0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void j0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k0(AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

    public final void l0(int v, int v1) {
        int v2 = this.N;
        if(v2 == v1 && this.O >= v) {
            return;
        }
        if(v2 < 0) {
            this.z0();
        }
        else if(!this.E && this.F == null && v1 > 0) {
            this.s0();
        }
        this.N = v1;
        this.O = v;
        int v3 = Dk.e(this.getContext()) - this.O;
        this.P = v3;
        if(this.E) {
            N n0 = this.z;
            if(n0 != null) {
                n0.D(v3 - v1);
            }
        }
        else {
            v4.y0(this, false, 1, null);
            this.I();
        }
    }

    private final void m0(int v, boolean z, int v1, com.dcinside.app.response.k k0) {
        boolean z1 = true;
        int v2 = k0.g();
        this.L = v2;
        TextView textView0 = this.e;
        if(textView0 != null) {
            textView0.setText((this.E || v2 > 0 ? this.getContext().getString(0x7F1504D2, new Object[]{this.L}) : "댓글"));  // string:image_note_count "댓글 %d"
        }
        if((z || this.N8) && !this.E) {
            List list0 = k0.c();
            this.A0(k0.g(), (list0 == null ? 0 : list0.size()));
        }
        if(k0.c() == null) {
            this.g.remove(v);
        }
        else {
            this.g.put(v, k0.c());
        }
        List list1 = this.e0();
        if(list1.size() < 30 && this.K < this.J && this.M8 < 4) {
            d4 d40 = this.B;
            if(d40 != null) {
                d40.G(list1, false);
            }
            ++this.M8;
            this.d0();
            return;
        }
        if(this.K >= this.J) {
            z1 = false;
        }
        d4 d41 = this.B;
        if(d41 != null) {
            d41.G(list1, z1);
        }
        this.M8 = 0;
        this.n0(v1);
        this.M = false;
        this.setProgress(false);
    }

    public final void n0(int v) {
        if(v < 0) {
            return;
        }
        int v1 = this.B == null ? -1 : this.B.A(v);
        if(v1 < 0) {
            return;
        }
        RecyclerView recyclerView0 = this.f;
        if(recyclerView0 != null) {
            recyclerView0.scrollToPosition(v1);
        }
    }

    public final void o0(boolean z) {
        if(this.a != null && this.a.getVisibility() != 0) {
            return;
        }
        this.R(false);
        LinearLayout linearLayout0 = this.b;
        if(linearLayout0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = linearLayout0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            int v = ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).height;
            if(v <= 0) {
                return;
            }
            int v1 = v + this.N;
            int v2 = this.Q + ((int)(((double)(this.P - this.Q)) * 0.6));
            int v3 = Dk.b(0x7F070104) + this.N;  // dimen:image_note_close_min
            int v4 = this.P;
            if(v1 >= 0 && v1 < v3 || z && ((float)v1) <= ((float)v4) * 0.6f) {
                this.release();
                return;
            }
            if(v3 <= v1 && v1 < this.Q) {
                this.D = f.b;
            }
            else if(this.Q <= v1 && v1 < v2) {
                this.D = this.D == f.b ? f.a : f.b;
            }
            else if(v2 <= v1 && v1 < v4) {
                this.D = f.a;
            }
            else if(v1 >= v4) {
                this.D = f.a;
            }
            this.I();
            linearLayout0.setLayoutParams(((FrameLayout.LayoutParams)viewGroup$LayoutParams0));
        }
    }

    public static void p0(v4 v40, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        v40.o0(z);
    }

    public final void q0(float f) {
        LinearLayout linearLayout0 = this.b;
        if(linearLayout0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = linearLayout0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            int v = (int)(((float)((FrameLayout.LayoutParams)viewGroup$LayoutParams0).height) + f);
            if(this.N8) {
                int v1 = this.O8;
                if(v > v1) {
                    ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).height = v1;
                    linearLayout0.setLayoutParams(((FrameLayout.LayoutParams)viewGroup$LayoutParams0));
                    return;
                }
                goto label_10;
            }
            else {
            label_10:
                if(10 <= v && v < this.P) {
                    ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).height = v;
                }
            }
            linearLayout0.setLayoutParams(((FrameLayout.LayoutParams)viewGroup$LayoutParams0));
        }
    }

    private final void r0() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostReadImageNoteView$onWrite$1", f = "PostReadImageNoteView.kt", i = {0}, l = {551}, m = "invokeSuspend", n = {"args"}, s = {"L$0"})
        static final class com.dcinside.app.post.fragments.v4.s extends kotlin.coroutines.jvm.internal.o implements A3.o {
            Object k;
            int l;
            final v4 m;
            final N n;
            final AppCompatActivity o;

            com.dcinside.app.post.fragments.v4.s(v4 v40, N n0, AppCompatActivity appCompatActivity0, kotlin.coroutines.d d0) {
                this.m = v40;
                this.n = n0;
                this.o = appCompatActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.v4.s(this.m, this.n, this.o, d0);
            }

            // 检测为 Lambda 实现
            private static final void g(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void h(N n0, v4 v40, AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.fragments.v4.s)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostReadImageNoteView$onWrite$1$1", f = "PostReadImageNoteView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.post.fragments.v4.s.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final v4 l;

                    com.dcinside.app.post.fragments.v4.s.a(v4 v40, kotlin.coroutines.d d0) {
                        this.l = v40;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.post.fragments.v4.s.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.post.fragments.v4.s.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.setInputProgress(true);
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.post.fragments.v4.s.b extends kotlin.jvm.internal.N implements Function1 {
                    public final class com.dcinside.app.post.fragments.v4.s.b.a {
                        public static final int[] a;

                        static {
                            int[] arr_v = new int[G.values().length];
                            try {
                                arr_v[G.b.ordinal()] = 1;
                            }
                            catch(NoSuchFieldError unused_ex) {
                            }
                            try {
                                arr_v[G.c.ordinal()] = 2;
                            }
                            catch(NoSuchFieldError unused_ex) {
                            }
                            try {
                                arr_v[G.d.ordinal()] = 3;
                            }
                            catch(NoSuchFieldError unused_ex) {
                            }
                            com.dcinside.app.post.fragments.v4.s.b.a.a = arr_v;
                        }
                    }

                    final v4 e;
                    final i0.a f;

                    com.dcinside.app.post.fragments.v4.s.b(v4 v40, i0.a a0) {
                        this.e = v40;
                        this.f = a0;
                        super(1);
                    }

                    public final void a(com.dcinside.app.model.f0 f00) {
                        this.e.setInputProgress(false);
                        this.e.x0(this.f);
                        this.e.K();
                        switch(this.e.H) {
                            case 1: {
                                this.e.u0(this.e.J);
                                if(this.e.Z()) {
                                    v4.w0(this.e, false, this.e.J, 0, 5, null);
                                }
                                return;
                            }
                            case 2: 
                            case 3: {
                                this.e.u0(1);
                                v4.w0(this.e, false, 1, 0, 5, null);
                            }
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.dcinside.app.model.f0)object0));
                        return S0.a;
                    }
                }

                i0.a a1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        if(!kl.a(new o[]{this.m.t})) {
                            return S0.a;
                        }
                        i0.a a0 = this.m.getWriteArgs();
                        if(a0 == null) {
                            return S0.a;
                        }
                        com.dcinside.app.post.fragments.v4.s.a v4$s$a0 = new com.dcinside.app.post.fragments.v4.s.a(this.m, null);
                        this.k = a0;
                        this.l = 1;
                        if(kotlinx.coroutines.i.h(h0.e(), v4$s$a0, this) == object1) {
                            return object1;
                        }
                        a1 = a0;
                        break;
                    }
                    case 1: {
                        a1 = (i0.a)this.k;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                o o0 = uk.sG(a1).M3(rx.android.schedulers.a.c()).y5((Object object0) -> new com.dcinside.app.post.fragments.v4.s.b(this.m, a1).invoke(object0), (Throwable throwable0) -> {
                    this.n.A();
                    this.m.B0(this.o, throwable0);
                });
                this.m.t = o0;
                return S0.a;
            }
        }

        t t0 = this.x;
        if(t0 != null) {
            N3 n30 = (N3)t0.a();
            if(n30 != null) {
                FragmentActivity fragmentActivity0 = n30.getActivity();
                AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
                if(appCompatActivity0 == null) {
                    return;
                }
                N n0 = this.z;
                if(n0 == null) {
                    return;
                }
                Integer integer0 = (Integer)n0.j().f();
                if(integer0 == null) {
                    integer0 = -1;
                }
                int v = integer0.intValue();
                if(v > 0) {
                    Dl.D(this.getContext(), v);
                    n0.A();
                    return;
                }
                I0 i00 = this.w;
                if(i00 != null) {
                    kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                }
                LifecycleOwner lifecycleOwner0 = n30.getViewLifecycleOwner();
                L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
                this.w = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.c(), null, new com.dcinside.app.post.fragments.v4.s(this, n0, appCompatActivity0, null), 2, null);
            }
        }
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        if(this.E) {
            this.N();
            return;
        }
        this.O();
    }

    private final void s0() {
        this.D = f.a;
        this.I();
    }

    public final void setBgWrap(@m LinearLayout linearLayout0) {
        this.b = linearLayout0;
    }

    public final void setCurrentSize(@l f v4$f0) {
        L.p(v4$f0, "<set-?>");
        this.D = v4$f0;
    }

    private final void setDefaultHeight(boolean z) {
        int v2;
        int v = Dk.b(0x7F07010D);  // dimen:image_note_title
        int v1 = Dk.b(0x7F070109);  // dimen:image_note_input_min
        String s = B.E.k0();
        if(!m0.a.a.i(s)) {
            v2 = Dk.b(0x7F07010E);  // dimen:image_note_user_dimen
        }
        else if(this.C != null && this.C.S()) {
            v2 = Dk.b(0x7F070105);  // dimen:image_note_guest
        }
        else {
            v2 = Dk.b(0x7F070109);  // dimen:image_note_input_min
        }
        int v3 = this.N + v + v1 + v2;
        int v4 = Math.max((this.L <= 0 ? this.N + v + v1 + v2 : Math.max(v3, Math.max(v3, ((int)(((float)this.P) * 0.7f))))), this.Q);
        this.Q = v4;
        N n0 = this.z;
        if(n0 != null) {
            n0.D(v4 - this.N);
        }
        if(z) {
            this.D = f.a;
        }
        if(this.N8) {
            this.O8 = this.Q - this.N;
        }
        this.I();
    }

    private final void setInputProgress(boolean z) {
        StateAnnounceView stateAnnounceView0;
        if(this.E) {
            stateAnnounceView0 = this.q;
        }
        else {
            stateAnnounceView0 = this.C == null ? null : this.C.getState();
        }
        if(z) {
            if(stateAnnounceView0 != null) {
                stateAnnounceView0.e(k0.d.e());
            }
        }
        else if(stateAnnounceView0 != null) {
            stateAnnounceView0.e(k0.d.a());
        }
    }

    public final void setInputVisible(boolean z) {
        String s;
        if(this.E) {
            N n0 = this.z;
            if(n0 == null) {
                s = null;
            }
            else {
                LiveData liveData0 = n0.n();
                if(liveData0 == null) {
                    s = null;
                }
                else {
                    com.dcinside.app.post.fragments.N.c n$c0 = (com.dcinside.app.post.fragments.N.c)liveData0.f();
                    s = n$c0 == null ? null : n$c0.f();
                }
            }
            int v = 0;
            TextView textView0 = this.n;
            if(textView0 != null) {
                if(z || s == null || s.length() == 0) {
                    v = 8;
                }
                textView0.setVisibility(v);
            }
        }
        else if(z) {
            C c0 = this.C;
            if(c0 != null) {
                c0.d0();
            }
        }
        else {
            Nk.a.c(this);
        }
        N n1 = this.z;
        if(n1 != null) {
            n1.v(z);
        }
    }

    public final void setList(@m RecyclerView recyclerView0) {
        this.f = recyclerView0;
    }

    public final void setMoveIcon(@m View view0) {
        this.d = view0;
    }

    public final void setMoveWrap(@m ConstraintLayout constraintLayout0) {
        this.c = constraintLayout0;
    }

    private final void setNoteViewVisible(boolean z) {
        this.J(z);
        N n0 = this.z;
        if(n0 != null) {
            n0.x(z);
        }
    }

    public final void setParent(@m FrameLayout frameLayout0) {
        this.a = frameLayout0;
    }

    private final void setProgress(boolean z) {
        ProgressBar progressBar0 = this.r;
        if(progressBar0 != null) {
            progressBar0.setVisibility((z ? 0 : 8));
        }
    }

    public final void setTitle(@m TextView textView0) {
        this.e = textView0;
    }

    public final void t0(int v) {
        if(v == com.dcinside.app.read.reply.more.a.h.c()) {
            d4 d40 = this.B;
            if(d40 != null) {
                d40.F();
            }
        }
        else if(v == com.dcinside.app.read.reply.more.a.i.c()) {
            this.L(com.dcinside.app.post.fragments.N.a.d);
        }
    }

    private final void u0(int v) {
        t t0 = this.x;
        if(t0 != null) {
            N3 n30 = (N3)t0.a();
            if(n30 != null) {
                com.dcinside.app.post.fragments.N.a n$a0 = com.dcinside.app.post.fragments.N.a.c;
                String s = this.G;
                if(s == null) {
                    return;
                }
                n30.A7(n$a0, s, v);
                N n0 = this.z;
                if(n0 != null) {
                    n0.u(n$a0);
                }
                this.g.remove(v);
            }
        }
    }

    private final void v0(boolean z, int v, int v1) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostReadImageNoteView$requestNoteList$1", f = "PostReadImageNoteView.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.v4.t extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final v4 l;
            final int m;
            final N3 n;
            final AppCompatActivity o;
            final boolean p;
            final int q;

            com.dcinside.app.post.fragments.v4.t(v4 v40, int v, N3 n30, AppCompatActivity appCompatActivity0, boolean z, int v1, kotlin.coroutines.d d0) {
                this.l = v40;
                this.m = v;
                this.n = n30;
                this.o = appCompatActivity0;
                this.p = z;
                this.q = v1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.v4.t(this.l, this.m, this.n, this.o, this.p, this.q, d0);
            }

            // 检测为 Lambda 实现
            private static final void g(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void h(v4 v40, AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.post.fragments.v4.t)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostReadImageNoteView$requestNoteList$1$1", f = "PostReadImageNoteView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.post.fragments.v4.t.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final v4 l;

                    com.dcinside.app.post.fragments.v4.t.a(v4 v40, kotlin.coroutines.d d0) {
                        this.l = v40;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.post.fragments.v4.t.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.post.fragments.v4.t.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.setProgress(true);
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.post.fragments.v4.t.b extends kotlin.jvm.internal.N implements Function1 {
                    final v4 e;
                    final AppCompatActivity f;
                    final int g;
                    final boolean h;
                    final int i;

                    com.dcinside.app.post.fragments.v4.t.b(v4 v40, AppCompatActivity appCompatActivity0, int v, boolean z, int v1) {
                        this.e = v40;
                        this.f = appCompatActivity0;
                        this.g = v;
                        this.h = z;
                        this.i = v1;
                        super(1);
                    }

                    public final void a(com.dcinside.app.post.fragments.N3.d n3$d0) {
                        com.dcinside.app.response.k k0 = n3$d0.f();
                        this.e.J = k0 == null ? 1 : k0.f();
                        if(n3$d0.e() != null) {
                            this.e.a0(this.f, this.e.K, n3$d0.e());
                            return;
                        }
                        v4 v40 = this.e;
                        int v = this.g;
                        boolean z = this.h;
                        int v1 = this.i;
                        com.dcinside.app.response.k k1 = n3$d0.f();
                        if(k1 == null) {
                            return;
                        }
                        v40.m0(v, z, v1, k1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.dcinside.app.post.fragments.N3.d)object0));
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                o o0 = null;
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        o o1 = (o)this.l.P8.get(kotlin.coroutines.jvm.internal.b.f(this.m));
                        if(o1 != null && !kl.a(new o[]{o1})) {
                            return S0.a;
                        }
                        this.l.K = Math.max(this.l.K, this.m);
                        com.dcinside.app.post.fragments.v4.t.a v4$t$a0 = new com.dcinside.app.post.fragments.v4.t.a(this.l, null);
                        this.k = 1;
                        if(kotlinx.coroutines.i.h(h0.e(), v4$t$a0, this) == object1) {
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
                rx.g g0 = this.n.i5(this.l.G, this.m);
                if(g0 != null) {
                    rx.g g1 = g0.M3(rx.android.schedulers.a.c());
                    if(g1 != null) {
                        o0 = g1.y5((Object object0) -> new com.dcinside.app.post.fragments.v4.t.b(this.l, this.o, this.m, this.p, this.q).invoke(object0), (Throwable throwable0) -> {
                            if(jl.a.G0()) {
                                L.m(throwable0);
                                zk.a(throwable0);
                            }
                            L.m(throwable0);
                            this.l.a0(this.o, this.l.K, throwable0);
                        });
                    }
                }
                this.l.P8.put(kotlin.coroutines.jvm.internal.b.f(this.m), o0);
                return S0.a;
            }
        }

        t t0 = this.x;
        if(t0 != null) {
            Object object0 = t0.a();
            if(((N3)object0) != null) {
                FragmentActivity fragmentActivity0 = ((N3)object0).getActivity();
                AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
                if(appCompatActivity0 == null) {
                    return;
                }
                I0 i00 = this.v;
                if(i00 != null) {
                    kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                }
                LifecycleOwner lifecycleOwner0 = ((N3)object0).getViewLifecycleOwner();
                L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
                this.v = kotlinx.coroutines.k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.c(), null, new com.dcinside.app.post.fragments.v4.t(this, v, ((N3)object0), appCompatActivity0, z, v1, null), 2, null);
            }
        }
    }

    static void w0(v4 v40, boolean z, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            z = false;
        }
        if((v2 & 2) != 0) {
            v = 1;
        }
        if((v2 & 4) != 0) {
            v1 = -1;
        }
        v40.v0(z, v, v1);
    }

    private final void x0(i0.a a0) {
        static final class com.dcinside.app.post.fragments.v4.v extends kotlin.jvm.internal.N implements Function1 {
            public static final com.dcinside.app.post.fragments.v4.v e;

            static {
                com.dcinside.app.post.fragments.v4.v.e = new com.dcinside.app.post.fragments.v4.v();
            }

            com.dcinside.app.post.fragments.v4.v() {
                super(1);
            }

            public final void a(@l com.dcinside.app.realm.f0 f00) {
                L.p(f00, "it");
                f00.w6(true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.realm.f0)object0));
                return S0.a;
            }
        }

        boolean z4;
        boolean z3;
        boolean z2;
        String s1;
        boolean z = true;
        Q q0 = a0.n();
        if(q0 != null) {
            com.dcinside.app.realm.helper.a.a.r(q0, com.dcinside.app.post.fragments.v4.v.e);
        }
        if(!m0.a.a.f(new CharSequence[]{a0.m(), a0.o()})) {
            try {
                N n0 = this.z;
                String s = null;
                if(n0 == null) {
                    s1 = null;
                }
                else {
                    LiveData liveData0 = n0.l();
                    s1 = liveData0 == null ? null : ((String)liveData0.f());
                }
                boolean z1 = s1 == null || s1.length() == 0;
                if(z1) {
                    z3 = false;
                }
                else {
                    N n1 = this.z;
                    if(n1 == null) {
                        z2 = false;
                    }
                    else {
                        LiveData liveData1 = n1.m();
                        z2 = liveData1 == null ? false : L.g(liveData1.f(), Boolean.TRUE);
                    }
                    z3 = z2;
                }
                if(q0 == null) {
                    z4 = false;
                }
                else {
                    String s2 = q0.p0();
                    z4 = s2 == null || s2.length() <= 0 ? false : true;
                }
                if(!z4 && !z3) {
                    s = a0.m();
                }
                com.dcinside.app.realm.t.i.c(s, a0.o());
                if(!z1) {
                    dl dl0 = dl.a;
                    if(!z3) {
                        z = false;
                    }
                    dl0.m6(z);
                    return;
                }
                return;
            }
            catch(Exception exception0) {
            }
            timber.log.b.a.y(exception0);
        }
    }

    static void y0(v4 v40, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        v40.setDefaultHeight(z);
    }

    private final void z0() {
        String s = this.F;
        if(L.g(s, "write")) {
            this.setInputVisible(true);
            return;
        }
        if(L.g(s, "open")) {
            this.setInputVisible(false);
            this.F = null;
        }
    }
}

