package com.dcinside.app.post.fragments;

import android.annotation.SuppressLint;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.t;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@SuppressLint({"ClickableViewAccessibility"})
@s0({"SMAP\nPostReadImageNoteScrollHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadImageNoteScrollHelper.kt\ncom/dcinside/app/post/fragments/PostReadImageNoteScrollHelper\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,172:1\n147#2:173\n*S KotlinDebug\n*F\n+ 1 PostReadImageNoteScrollHelper.kt\ncom/dcinside/app/post/fragments/PostReadImageNoteScrollHelper\n*L\n11#1:173\n*E\n"})
public final class k4 extends OnScrollListener {
    final class a extends GestureDetector.SimpleOnGestureListener {
        private final boolean a;
        final k4 b;

        public a(boolean z) {
            this.a = z;
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onFling(@m MotionEvent motionEvent0, @l MotionEvent motionEvent1, float f, float f1) {
            L.p(motionEvent1, "e2");
            v4 v40 = (v4)k4.this.a.a();
            if(v40 == null) {
                return false;
            }
            boolean z = (motionEvent0 == null ? 0.0f : motionEvent0.getRawY()) >= motionEvent1.getRawY();
            if(!this.a && v40.Y(f1, z) && !z) {
                v40.release();
                return true;
            }
            return false;
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onSingleTapUp(@l MotionEvent motionEvent0) {
            L.p(motionEvent0, "e");
            v4 v40 = (v4)k4.this.a.a();
            if(v40 == null) {
                return false;
            }
            if(this.a) {
                v40.release();
                return true;
            }
            return false;
        }
    }

    @l
    private t a;
    @l
    private final D b;
    @l
    private final D c;
    private float d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public k4(@l v4 v40) {
        static final class b extends N implements A3.a {
            final v4 e;
            final k4 f;

            b(v4 v40, k4 k40) {
                this.e = v40;
                this.f = k40;
                super(0);
            }

            @l
            public final GestureDetector b() {
                return new GestureDetector(this.e.getContext(), new a(this.f, false));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class c extends N implements A3.a {
            final v4 e;
            final k4 f;

            c(v4 v40, k4 k40) {
                this.e = v40;
                this.f = k40;
                super(0);
            }

            @l
            public final GestureDetector b() {
                return new GestureDetector(this.e.getContext(), new a(this.f, true));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(v40, "view");
        super();
        this.a = new t(v40);
        this.b = E.a(new b(v40, this));
        this.c = E.a(new c(v40, this));
    }

    // 检测为 Lambda 实现
    public static boolean a(View view0, MotionEvent motionEvent0) [...]

    public final void h(boolean z) {
        v4 v40 = (v4)this.a.a();
        if(v40 == null) {
            return;
        }
        if(!z) {
            FrameLayout frameLayout0 = v40.getParent();
            if(frameLayout0 != null) {
                frameLayout0.setClickable(true);
            }
            FrameLayout frameLayout1 = v40.getParent();
            if(frameLayout1 != null) {
                frameLayout1.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    return this.q().onTouchEvent(motionEvent0);
                });
            }
            LinearLayout linearLayout0 = v40.getBgWrap();
            if(linearLayout0 != null) {
                linearLayout0.setOnTouchListener((View view0, MotionEvent motionEvent0) -> true);
            }
            ConstraintLayout constraintLayout0 = v40.getMoveWrap();
            if(constraintLayout0 != null) {
                constraintLayout0.setClickable(true);
            }
            ConstraintLayout constraintLayout1 = v40.getMoveWrap();
            if(constraintLayout1 != null) {
                constraintLayout1.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    L.m(motionEvent0);
                    return this.o(motionEvent0);
                });
            }
            View view0 = v40.getMoveIcon();
            if(view0 != null) {
                view0.setClickable(true);
            }
            View view1 = v40.getMoveIcon();
            if(view1 != null) {
                view1.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    L.m(motionEvent0);
                    return this.o(motionEvent0);
                });
            }
            TextView textView0 = v40.getTitle();
            if(textView0 != null) {
                textView0.setClickable(true);
            }
            TextView textView1 = v40.getTitle();
            if(textView1 != null) {
                textView1.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    L.m(motionEvent0);
                    return this.o(motionEvent0);
                });
            }
            RecyclerView recyclerView0 = v40.getList();
            if(recyclerView0 != null) {
                recyclerView0.setClickable(true);
            }
            RecyclerView recyclerView1 = v40.getList();
            if(recyclerView1 != null) {
                recyclerView1.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                    L.p(this, "this$0");
                    L.m(motionEvent0);
                    return this.r(motionEvent0);
                });
            }
        }
        RecyclerView recyclerView2 = v40.getList();
        if(recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this);
        }
    }

    // 检测为 Lambda 实现
    private static final boolean i(k4 k40, View view0, MotionEvent motionEvent0) [...]

    private static final boolean j(View view0, MotionEvent motionEvent0) [...] // Inlined contents

    // 检测为 Lambda 实现
    private static final boolean k(k4 k40, View view0, MotionEvent motionEvent0) [...]

    // 检测为 Lambda 实现
    private static final boolean l(k4 k40, View view0, MotionEvent motionEvent0) [...]

    // 检测为 Lambda 实现
    private static final boolean m(k4 k40, View view0, MotionEvent motionEvent0) [...]

    // 检测为 Lambda 实现
    private static final boolean n(k4 k40, View view0, MotionEvent motionEvent0) [...]

    // 去混淆评级： 低(20)
    private final boolean o(MotionEvent motionEvent0) {
        return this.p().onTouchEvent(motionEvent0) ? true : this.s(motionEvent0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrollStateChanged(@l RecyclerView recyclerView0, int v) {
        L.p(recyclerView0, "recyclerView");
        boolean z = true;
        this.f = !recyclerView0.canScrollVertically(-1);
        this.g = !recyclerView0.canScrollVertically(1);
        if(v != 1) {
            z = false;
        }
        if(!this.e && z) {
            v4 v40 = (v4)this.a.a();
            if(v40 != null) {
                v40.setInputVisible(false);
            }
        }
        this.e = z;
        super.onScrollStateChanged(recyclerView0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrolled(@l RecyclerView recyclerView0, int v, int v1) {
        L.p(recyclerView0, "recyclerView");
        v4 v40 = (v4)this.a.a();
        if(v40 == null) {
            return;
        }
        if(v1 != 0 && v40.T()) {
            v40.d0();
        }
    }

    private final GestureDetector p() {
        return (GestureDetector)this.b.getValue();
    }

    private final GestureDetector q() {
        return (GestureDetector)this.c.getValue();
    }

    private final boolean r(MotionEvent motionEvent0) {
        v4 v40 = (v4)this.a.a();
        f v4$f0 = v40 == null ? null : v40.getCurrentSize();
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.d = motionEvent0.getRawY();
                return false;
            }
            case 2: {
                float f = this.d == 0.0f ? 0.0f : this.d - motionEvent0.getRawY();
                this.d = motionEvent0.getRawY();
                if(this.f && f < 0.0f) {
                    v4 v42 = (v4)this.a.a();
                    if(v42 != null) {
                        v42.q0(f);
                    }
                    this.u(true);
                    return false;
                }
                if((this.g || v4$f0 == f.b) && f > 0.0f) {
                    v4 v43 = (v4)this.a.a();
                    if(v43 != null) {
                        v43.q0(f);
                    }
                    this.u(true);
                    return false;
                }
                if(this.h) {
                    v4 v44 = (v4)this.a.a();
                    if(v44 != null) {
                        v44.q0(f);
                        return false;
                    }
                }
                break;
            }
            case 1: 
            case 3: {
                this.d = 0.0f;
                if(this.h) {
                    v4 v41 = (v4)this.a.a();
                    if(v41 != null) {
                        v41.o0(true);
                    }
                    this.u(false);
                    return false;
                }
                break;
            }
            default: {
                return false;
            }
        }
        return false;
    }

    private final boolean s(MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                v4 v40 = (v4)this.a.a();
                if(v40 != null) {
                    v40.R(true);
                }
                this.d = motionEvent0.getRawY();
                return false;
            }
            case 2: {
                float f = this.d;
                float f1 = motionEvent0.getRawY();
                this.d = motionEvent0.getRawY();
                v4 v42 = (v4)this.a.a();
                if(v42 != null) {
                    v42.q0(f - f1);
                    return false;
                }
                return false;
            }
            case 1: 
            case 3: {
                v4 v41 = (v4)this.a.a();
                if(v41 != null) {
                    v4.p0(v41, false, 1, null);
                }
                this.d = 0.0f;
                this.u(false);
                return false;
            }
            default: {
                return false;
            }
        }
    }

    public final void t() {
        this.e = false;
        this.d = 0.0f;
        v4 v40 = (v4)this.a.a();
        if(v40 == null) {
            return;
        }
        FrameLayout frameLayout0 = v40.getParent();
        if(frameLayout0 != null) {
            frameLayout0.setOnTouchListener(null);
        }
        LinearLayout linearLayout0 = v40.getBgWrap();
        if(linearLayout0 != null) {
            linearLayout0.setOnTouchListener(null);
        }
        ConstraintLayout constraintLayout0 = v40.getMoveWrap();
        if(constraintLayout0 != null) {
            constraintLayout0.setOnTouchListener(null);
        }
        View view0 = v40.getMoveIcon();
        if(view0 != null) {
            view0.setOnTouchListener(null);
        }
        TextView textView0 = v40.getTitle();
        if(textView0 != null) {
            textView0.setOnTouchListener(null);
        }
        RecyclerView recyclerView0 = v40.getList();
        if(recyclerView0 != null) {
            recyclerView0.setOnTouchListener(null);
        }
        RecyclerView recyclerView1 = v40.getList();
        if(recyclerView1 != null) {
            recyclerView1.removeOnScrollListener(this);
        }
    }

    private final void u(boolean z) {
        if(z == this.h) {
            return;
        }
        this.h = z;
    }
}

