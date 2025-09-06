package com.dcinside.app.view.recent;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.g;
import com.dcinside.app.base.i;
import com.dcinside.app.main.HomeActivity;
import com.dcinside.app.perform.e;
import com.dcinside.app.post.c0;
import com.dcinside.app.realm.s0;
import com.dcinside.app.settings.recent.RecentGallerySettingActivity;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.ql.b.f;
import com.dcinside.app.view.MenuPageIndicator;
import com.dcinside.app.view.MenuTitleView;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.dcinside.app.view.tool.h;
import com.dcinside.app.view.tool.j;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;
import io.realm.F0;
import io.realm.P0;
import io.realm.g1;
import java.util.List;
import kotlin.S0;

public class RecentMenuView extends LinearLayout implements i, P0 {
    static final class b extends SimpleOnItemTouchListener {
        private final f a;
        private final f b;
        private final GestureDetector c;
        private final int d;

        private b(Context context0, f ql$b$f0, f ql$b$f1) {
            class a extends GestureDetector.SimpleOnGestureListener {
                @Override  // android.view.GestureDetector$SimpleOnGestureListener
                public boolean onSingleTapUp(MotionEvent motionEvent0) {
                    return true;
                }
            }

            this.d = 0;
            this.a = ql$b$f0;
            this.b = ql$b$f1;
            this.c = new GestureDetector(context0, new a(this));
        }

        b(Context context0, f ql$b$f0, f ql$b$f1, p p0) {
            this(context0, ql$b$f0, ql$b$f1);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$SimpleOnItemTouchListener
        public boolean i(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
            if(this.c.onTouchEvent(motionEvent0)) {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                View view0 = recyclerView0.findChildViewUnder(f, f1);
                if(view0 instanceof ViewGroup) {
                    int v = ((ViewGroup)view0).getChildCount();
                    for(int v1 = 0; v1 < v; ++v1) {
                        View view1 = ((ViewGroup)view0).getChildAt(v1);
                        if(view1.isEnabled() && ((float)view1.getTop()) <= f1 && f1 <= ((float)view1.getBottom())) {
                            Object object0 = view1.getTag(0x7F0B0999);  // id:paging_menu_real_position
                            if(object0 instanceof Integer) {
                                int v2 = (int)(((Integer)object0));
                                if(v2 >= 0) {
                                    if(((float)(view1.getWidth() - this.d)) > f) {
                                        f ql$b$f0 = this.a;
                                        if(ql$b$f0 != null) {
                                            ql$b$f0.a(view1, v2);
                                            return false;
                                        }
                                    }
                                    else {
                                        f ql$b$f1 = this.b;
                                        if(ql$b$f1 != null) {
                                            ql$b$f1.a(view1, v2);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    protected RecyclerViewPager a;
    protected View b;
    protected MenuTitleView c;
    protected MenuPageIndicator d;
    private boolean e;
    private AnimatorSet f;
    private List g;
    private g1 h;
    private boolean i;
    private final SharedPreferences.OnSharedPreferenceChangeListener j;
    private com.dcinside.app.view.tool.a k;
    private com.dcinside.app.settings.recent.b l;

    public RecentMenuView(Context context0) {
        super(context0);
        this.j = (SharedPreferences sharedPreferences0, String s) -> if("MenuIsExpandedRecent".equals(s)) {
            boolean z = this.s();
            if(ll.U()) {
                if(!z && (this.g == null ? 0 : this.g.size()) > 0) {
                    this.q();
                }
            }
            else if(z) {
                this.p();
            }
        };
        this.r(context0);
    }

    public RecentMenuView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.j = (SharedPreferences sharedPreferences0, String s) -> if("MenuIsExpandedRecent".equals(s)) {
            boolean z = this.s();
            if(ll.U()) {
                if(!z && (this.g == null ? 0 : this.g.size()) > 0) {
                    this.q();
                }
            }
            else if(z) {
                this.p();
            }
        };
        this.r(context0);
    }

    public RecentMenuView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.j = (SharedPreferences sharedPreferences0, String s) -> if("MenuIsExpandedRecent".equals(s)) {
            boolean z = this.s();
            if(ll.U()) {
                if(!z && (this.g == null ? 0 : this.g.size()) > 0) {
                    this.q();
                }
            }
            else if(z) {
                this.p();
            }
        };
        this.r(context0);
    }

    public RecentMenuView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.j = (SharedPreferences sharedPreferences0, String s) -> if("MenuIsExpandedRecent".equals(s)) {
            boolean z = this.s();
            if(ll.U()) {
                if(!z && (this.g == null ? 0 : this.g.size()) > 0) {
                    this.q();
                }
            }
            else if(z) {
                this.p();
            }
        };
        this.r(context0);
    }

    // 检测为 Lambda 实现
    private static Object A(com.dcinside.app.perform.p.a p$a0) [...]

    private static Boolean B(Boolean boolean0) [...] // Inlined contents

    // 检测为 Lambda 实现
    private static void C(s0 s00, F0 f00) [...]

    // 检测为 Lambda 实现
    private void D(g g0, int v, Boolean boolean0) [...]

    public void E(@NonNull g1 g10) {
        this.g = g10.h().g2(g10);
        Adapter recyclerView$Adapter0 = this.a.getAdapter();
        if(recyclerView$Adapter0 instanceof c) {
            ((c)recyclerView$Adapter0).D(this.g);
        }
        int v = this.g.size();
        if(this.i) {
            this.i = false;
            if(v > 0 && ll.U()) {
                this.n(true).end();
                return;
            }
        }
        if(v == 0) {
            this.p();
        }
    }

    private void F() {
        try {
            com.dcinside.app.settings.recent.b b0 = this.l;
            if(b0 != null) {
                b0.dismissAllowingStateLoss();
            }
            this.l = new com.dcinside.app.settings.recent.b();
            FragmentManager fragmentManager0 = ((AppCompatActivity)this.getContext()).getSupportFragmentManager();
            this.l.show(fragmentManager0, this.l.getClass().getName());
        }
        catch(Exception unused_ex) {
        }
    }

    protected boolean G(int v) {
        g g0 = (g)this.getContext();
        e.s(g0).n((com.dcinside.app.perform.p.a p$a0) -> p$a0.m(0x7F1500AE)).z(0x104000A).x(0x1040000).b().Z1((Boolean boolean0) -> boolean0).y5((Boolean boolean0) -> {
            if(this.g == null) {
                return;
            }
            F0 f00 = g0.F1();
            if(f00 == null) {
                return;
            }
            String s = ((s0)this.g.get(v)).R5();
            s0 s00 = (s0)f00.C4(s0.class).i0("galleryId", s).r0();
            if(s00 == null) {
                return;
            }
            f00.Y3((F0 f00) -> s00.z5());
        }, (Throwable throwable0) -> {
            throwable0.printStackTrace();
            Dl.D(this.getContext(), 0x7F150321);  // string:failed_load_galley "갤러리 목록을 갱신할 수 없습니다."
        });
        return true;
    }

    // 检测为 Lambda 实现
    private void H(@Nullable SharedPreferences sharedPreferences0, String s) [...]

    protected boolean I(int v) {
        if(this.g != null) {
            g g0 = (g)this.getContext();
            s0 s00 = (s0)this.g.get(v);
            if(s00 != null && s00.s()) {
                String s = s00.R5();
                if(s == null) {
                    return true;
                }
                s0.Q5(this.getContext(), s);
                return true;
            }
            Dl.D(g0, 0x7F150869);  // string:realm_in_delete "데이터 처리중입니다.\n잠시 후 다시 시도해주세요."
        }
        return true;
    }

    private void J() {
        if(this.s()) {
            this.p();
            return;
        }
        this.q();
    }

    @Override  // io.realm.P0
    public void M(@NonNull Object object0) {
        this.E(((g1)object0));
    }

    // 检测为 Lambda 实现
    public static Boolean e(Boolean boolean0) [...]

    private Animator n(boolean z) {
        int v1;
        if(this.f != null && this.f.isRunning()) {
            this.f.cancel();
        }
        if(z) {
            int v = Dk.d(dl.a.N1() * 36);
            j.h(this.a, v);
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.d.getLayoutParams();
            viewGroup$MarginLayoutParams0.topMargin = v;
            this.d.setLayoutParams(viewGroup$MarginLayoutParams0);
            this.b.measure(0, 0);
            v1 = this.b.getMeasuredHeight();
        }
        else {
            v1 = 0;
        }
        this.e = z;
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{this.b.getHeight(), v1});
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            Integer integer0 = (Integer)valueAnimator0.getAnimatedValue();
            j.h(this.b, ((int)integer0));
        });
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.c.getArrow(), "rotation", new float[]{((float)(z ? 270 : 90))});
        AnimatorSet animatorSet0 = new AnimatorSet();
        this.f = animatorSet0;
        animatorSet0.play(valueAnimator0).with(objectAnimator0);
        this.f.start();
        return this.f;
    }

    public void o(F0 f00) {
        this.i = true;
        if(f00 != null) {
            g1 g10 = s0.V5(f00);
            this.h = g10;
            g10.l(this);
        }
        c c0 = new c(this.getContext());
        c0.D(this.g);
        this.a.swapAdapter(c0, true);
        this.d.M(this.a, 3, true, () -> {
            this.F();
            return null;
        });
        ll.Q(this.j);
        this.E(this.h);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.dcinside.app.view.tool.a a0 = this.k;
        if(a0 != null) {
            a0.e(this);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.dcinside.app.view.tool.a a0 = this.k;
        if(a0 != null) {
            a0.f();
        }
    }

    protected void p() {
        ll.T(false);
        this.n(false);
    }

    protected void q() {
        if((this.g == null ? 0 : this.g.size()) == 0) {
            Dl.J(this, 0x7F15032B);  // string:failed_recent_empty "최근 방문 갤러리가 없습니다."
            return;
        }
        ll.T(true);
        this.n(true);
    }

    protected void r(Context context0) {
        class com.dcinside.app.view.recent.RecentMenuView.a implements OnItemTouchListener {
            final RecentMenuView a;

            @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
            public void h(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
                if(RecentMenuView.this.k != null) {
                    RecentMenuView.this.k.c(motionEvent0);
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
            public boolean i(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
                if(RecentMenuView.this.k != null) {
                    RecentMenuView.this.k.c(motionEvent0);
                }
                return false;
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
            public void j(boolean z) {
            }
        }

        if(this.isInEditMode()) {
            return;
        }
        this.setOrientation(1);
        View.inflate(context0, 0x7F0E0215, this);  // layout:view_menu_recents
        this.a = (RecyclerViewPager)this.findViewById(0x7F0B0CD9);  // id:recents_menu_content
        this.b = this.findViewById(0x7F0B0CDB);  // id:recents_menu_panel
        this.c = (MenuTitleView)this.findViewById(0x7F0B0CDC);  // id:recents_menu_title
        MenuPageIndicator menuPageIndicator0 = (MenuPageIndicator)this.findViewById(0x7F0B0CDA);  // id:recents_menu_indicator
        this.d = menuPageIndicator0;
        menuPageIndicator0.setOnClickListener((View view0) -> {
            Context context0 = view0.getContext();
            RecentGallerySettingActivity.C.a(context0);
        });
        this.c.setOnClickListener((View view0) -> this.J());
        this.a.setLayoutManager(new NonPredictiveLayoutManager(0, false));
        this.a.addOnItemTouchListener(new b(context0, (View view0, int v) -> this.I(v), (View view0, int v) -> this.G(v), null));
        this.a.addOnItemTouchListener(new com.dcinside.app.view.recent.RecentMenuView.a(this));
        this.n(false);
        this.c.setText(0x7F150871);  // string:recent_menu_title "최근 방문 갤러리"
        if(context0 instanceof HomeActivity) {
            this.k = new com.dcinside.app.view.tool.f();
            return;
        }
        if(context0 instanceof c0) {
            this.k = new h();
        }
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        this.i = false;
        if(this.h != null && this.h.s()) {
            this.h.D();
        }
        this.g = null;
        this.h = null;
        ll.B0(this.j);
    }

    public boolean s() {
        return this.e;
    }

    // 检测为 Lambda 实现
    private void t(ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private S0 u() [...]

    // 检测为 Lambda 实现
    private static void v(View view0) [...]

    // 检测为 Lambda 实现
    private void w(View view0) [...]

    // 检测为 Lambda 实现
    private boolean x(View view0, int v) [...]

    // 检测为 Lambda 实现
    private boolean y(View view0, int v) [...]

    // 检测为 Lambda 实现
    private void z(Throwable throwable0) [...]
}

