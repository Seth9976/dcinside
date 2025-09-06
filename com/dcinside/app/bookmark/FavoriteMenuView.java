package com.dcinside.app.bookmark;

import Y.I5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.g;
import com.dcinside.app.base.i;
import com.dcinside.app.main.HomeActivity;
import com.dcinside.app.perform.e;
import com.dcinside.app.post.c0;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import com.dcinside.app.view.MenuPageIndicator;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.dcinside.app.view.tool.a;
import com.dcinside.app.view.tool.f;
import com.dcinside.app.view.tool.h;
import io.realm.F0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class FavoriteMenuView extends LinearLayout implements i, K {
    private boolean a;
    @m
    private AnimatorSet b;
    @l
    private final SharedPreferences.OnSharedPreferenceChangeListener c;
    private boolean d;
    @m
    private v e;
    @m
    private a f;
    @l
    private final I5 g;

    @j
    public FavoriteMenuView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public FavoriteMenuView(@l Context context0, @m AttributeSet attributeSet0) {
        public static final class com.dcinside.app.bookmark.FavoriteMenuView.a implements OnItemTouchListener {
            final FavoriteMenuView a;

            com.dcinside.app.bookmark.FavoriteMenuView.a(FavoriteMenuView favoriteMenuView0) {
                this.a = favoriteMenuView0;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
            public void h(@l RecyclerView recyclerView0, @l MotionEvent motionEvent0) {
                L.p(recyclerView0, "rv");
                L.p(motionEvent0, "e");
                if(this.a.f != null) {
                    a a0 = this.a.f;
                    L.m(a0);
                    a0.c(motionEvent0);
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
            public boolean i(@l RecyclerView recyclerView0, @l MotionEvent motionEvent0) {
                L.p(recyclerView0, "rv");
                L.p(motionEvent0, "e");
                if(this.a.f != null) {
                    a a0 = this.a.f;
                    L.m(a0);
                    a0.c(motionEvent0);
                }
                return false;
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
            public void j(boolean z) {
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0);
        this.c = (SharedPreferences sharedPreferences0, String s) -> {
            L.p(this, "this$0");
            this.E(s);
        };
        this.setOrientation(1);
        I5 i50 = I5.b(LayoutInflater.from(context0), this);
        L.o(i50, "inflate(...)");
        this.g = i50;
        A a0 = (View view0) -> {
            L.p(this, "this$0");
            this.G();
        };
        i50.f.setOnClickListener(a0);
        i50.c.getConfigIcon().setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.z();
        });
        C c0 = () -> {
            L.p(this, "this$0");
            this.H();
        };
        i50.e.setOnRetryListener(c0);
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        i50.b.setLayoutManager(nonPredictiveLayoutManager0);
        y y0 = new y(context0, (View view0, int v) -> {
            L.p(this, "this$0");
            return this.F(v);
        }, (View view0, int v) -> {
            L.p(this, "this$0");
            return this.A(v);
        });
        i50.b.addOnItemTouchListener(y0);
        com.dcinside.app.bookmark.FavoriteMenuView.a favoriteMenuView$a0 = new com.dcinside.app.bookmark.FavoriteMenuView.a(this);
        i50.b.addOnItemTouchListener(favoriteMenuView$a0);
        this.t(false);
        i50.f.setText(0x7F150339);  // string:favorite_menu_title "즐겨찾기 갤러리"
        if(context0 instanceof HomeActivity) {
            this.f = new f();
            return;
        }
        if(context0 instanceof c0) {
            this.f = new h();
        }
    }

    public FavoriteMenuView(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    private final boolean A(int v) {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F1500AC);  // string:alert_remove_favorite "즐겨찾기 해제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            public final Boolean a(@m Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class d extends N implements Function1 {
            final FavoriteMenuView e;
            final int f;

            d(FavoriteMenuView favoriteMenuView0, int v) {
                this.e = favoriteMenuView0;
                this.f = v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                Adapter recyclerView$Adapter0 = this.e.g.b.getAdapter();
                if(recyclerView$Adapter0 instanceof x) {
                    com.dcinside.app.realm.m m0 = (com.dcinside.app.realm.m)((x)recyclerView$Adapter0).x(this.f);
                    v v0 = this.e.e;
                    L.m(v0);
                    v0.u(this.e.getContext(), m0.S5(), m0.R5());
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Context context0 = this.getContext();
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.base.RealmBaseActivity");
        e.e.a(((g)context0)).n(b.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(c.e, "$tmp0");
            return (Boolean)c.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new d(this, v), "$tmp0");
            new d(this, v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(throwable0, "error");
            throwable0.printStackTrace();
            Dl.D(this.getContext(), 0x7F150321);  // string:failed_load_galley "갤러리 목록을 갱신할 수 없습니다."
        });
        return true;
    }

    // 检测为 Lambda 实现
    private static final Boolean B(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void C(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void D(FavoriteMenuView favoriteMenuView0, Throwable throwable0) [...]

    private final void E(String s) {
        if(L.g("MenuIsExpandedFavorite", s)) {
            boolean z = ll.S();
            boolean z1 = this.a;
            if(z) {
                if(!z1 && this.g.b.getAdapter() != null) {
                    Adapter recyclerView$Adapter0 = this.g.b.getAdapter();
                    L.m(recyclerView$Adapter0);
                    if(recyclerView$Adapter0.getItemCount() > 0) {
                        this.x();
                    }
                }
            }
            else if(z1) {
                this.w();
            }
        }
    }

    private final boolean F(int v) {
        Context context0 = this.getContext();
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.base.RealmBaseActivity");
        Adapter recyclerView$Adapter0 = this.g.b.getAdapter();
        if(recyclerView$Adapter0 instanceof x) {
            Xk.i(((g)context0), ((com.dcinside.app.realm.m)((x)recyclerView$Adapter0).x(v)).R5());
        }
        return true;
    }

    private final void G() {
        if(this.a) {
            this.w();
            return;
        }
        this.x();
    }

    private final void H() {
        v v0 = this.e;
        L.m(v0);
        v0.E(null);
    }

    private final void I(List list0, boolean z) {
        Adapter recyclerView$Adapter0 = this.g.b.getAdapter();
        if(recyclerView$Adapter0 instanceof x) {
            ((x)recyclerView$Adapter0).D(list0);
        }
        if(z) {
            int v = list0 == null ? 0 : list0.size();
            if(this.d) {
                this.d = false;
                if(v > 0 && ll.S()) {
                    this.t(true);
                    return;
                }
            }
            if(v == 0) {
                this.w();
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void k(FavoriteMenuView favoriteMenuView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void l(FavoriteMenuView favoriteMenuView0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void m(FavoriteMenuView favoriteMenuView0) [...]

    @Override  // com.dcinside.app.bookmark.K
    public void n(@l v v0, int v1, @m List list0) {
        L.p(v0, "favoriteBasket");
        String s = v0.A();
        if(m0.a.a.i(s)) {
            this.g.f.setSub(0x7F150B63);  // string:user_guest "(비로그인)"
        }
        else {
            String s1 = String.format(Locale.getDefault(), "(%s)", Arrays.copyOf(new Object[]{s}, 1));
            L.o(s1, "format(...)");
            this.g.f.setSub(s1);
        }
        switch(v1) {
            case 0: {
                k0.d d2 = k0.d.g(v0.x());
                this.g.e.e(d2);
                this.I(null, true);
                break;
            }
            case 1: {
                k0.d d0 = k0.d.e();
                this.g.e.e(d0);
                this.I(null, false);
                return;
            label_14:
                if(v1 == 2) {
                    k0.d d1 = k0.d.a();
                    this.g.e.e(d1);
                    this.I(list0, true);
                    return;
                }
                break;
            }
            default: {
                goto label_14;
            }
        }
    }

    // 检测为 Lambda 实现
    private static final boolean o(FavoriteMenuView favoriteMenuView0, View view0, int v) [...]

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a a0 = this.f;
        if(a0 != null) {
            L.m(a0);
            a0.e(this);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a a0 = this.f;
        if(a0 != null) {
            L.m(a0);
            a0.f();
        }
    }

    // 检测为 Lambda 实现
    private static final boolean p(FavoriteMenuView favoriteMenuView0, View view0, int v) [...]

    @Override  // com.dcinside.app.base.i
    public void release() {
        this.d = false;
        v v0 = this.e;
        if(v0 != null) {
            L.m(v0);
            v0.release();
            this.e = null;
        }
        ll.B0(this.c);
        this.g.b.swapAdapter(null, true);
        L.o(this.g.c, "favoritesMenuIndicator");
        MenuPageIndicator.O(this.g.c, this.g.b, 3, true, null, null, 24, null);
    }

    private final void t(boolean z) {
        int v1;
        if(z) {
            int v = Dk.d(dl.a.b0() * 36);
            com.dcinside.app.view.tool.j.h(this.g.b, v);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.g.c.getLayoutParams();
            L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin = v;
            this.g.c.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
            this.g.d.measure(0, 0);
            v1 = this.g.d.getMeasuredHeight();
        }
        else {
            v1 = 0;
        }
        AnimatorSet animatorSet0 = this.b;
        if(animatorSet0 != null) {
            L.m(animatorSet0);
            if(animatorSet0.isRunning()) {
                AnimatorSet animatorSet1 = this.b;
                L.m(animatorSet1);
                animatorSet1.cancel();
            }
        }
        this.a = z;
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{this.g.d.getHeight(), v1});
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            L.p(this, "this$0");
            L.p(valueAnimator0, "animation");
            Object object0 = valueAnimator0.getAnimatedValue();
            L.n(object0, "null cannot be cast to non-null type kotlin.Int");
            com.dcinside.app.view.tool.j.h(this.g.d, ((int)(((Integer)object0))));
        });
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.g.f.getArrow(), "rotation", new float[]{((float)(z ? 270 : 90))});
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b = animatorSet2;
        L.m(animatorSet2);
        animatorSet2.play(valueAnimator0).with(objectAnimator0);
        AnimatorSet animatorSet3 = this.b;
        L.m(animatorSet3);
        animatorSet3.start();
    }

    // 检测为 Lambda 实现
    private static final void u(FavoriteMenuView favoriteMenuView0, ValueAnimator valueAnimator0) [...]

    public final void v(@m F0 f00) {
        v v0 = this.e;
        List list0 = null;
        if(v0 != null) {
            L.m(v0);
            v0.release();
            this.e = null;
        }
        this.d = true;
        if(f00 == null) {
            this.g.f.setSub(0x7F150B63);  // string:user_guest "(비로그인)"
        }
        else {
            this.e = new v(f00, this);
        }
        ll.Q(this.c);
        this.c.onSharedPreferenceChanged(null, "MenuIsExpandedFavorite");
        x x0 = new x();
        v v1 = this.e;
        if(v1 != null) {
            L.m(v1);
            list0 = v1.y();
        }
        x0.D(list0);
        this.g.b.swapAdapter(x0, true);
        L.o(this.g.c, "favoritesMenuIndicator");
        MenuPageIndicator.O(this.g.c, this.g.b, 3, true, null, null, 24, null);
    }

    private final void w() {
        ll.R(false);
        this.t(false);
    }

    private final void x() {
        if(this.g.b.getAdapter() != null) {
            Adapter recyclerView$Adapter0 = this.g.b.getAdapter();
            L.m(recyclerView$Adapter0);
            if(recyclerView$Adapter0.getItemCount() > 0) {
                ll.R(true);
                this.t(true);
                return;
            }
        }
        Dl.K(this, "즐겨찾기 갤러리가 없습니다.");
    }

    // 检测为 Lambda 实现
    private static final void y(FavoriteMenuView favoriteMenuView0, SharedPreferences sharedPreferences0, String s) [...]

    private final void z() {
        Context context0 = this.getContext();
        context0.startActivity(new Intent(context0, BookmarkSettingActivity.class));
    }
}

