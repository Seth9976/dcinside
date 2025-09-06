package com.dcinside.app.main.view;

import A3.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Y;
import com.dcinside.app.util.Ok;
import com.dcinside.app.util.Xk;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import timber.log.b;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nCrowdPagerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrowdPagerAdapter.kt\ncom/dcinside/app/main/view/CrowdPagerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
public final class c extends com.lsjwzh.widget.recyclerviewpager.c {
    @s0({"SMAP\nCrowdPagerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrowdPagerAdapter.kt\ncom/dcinside/app/main/view/CrowdPagerAdapter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final void a(@l View view0, @m Y y0, int v) {
            Drawable drawable0;
            boolean z = true;
            L.p(view0, "child");
            if(!(view0 instanceof ViewGroup)) {
                return;
            }
            try {
                Context context0 = ((ViewGroup)view0).getContext();
                View view1 = ((ViewGroup)view0).getChildAt(0);
                L.n(view1, "null cannot be cast to non-null type android.widget.TextView");
                View view2 = ((ViewGroup)view0).getChildAt(1);
                L.n(view2, "null cannot be cast to non-null type android.widget.TextView");
                View view3 = ((ViewGroup)view0).getChildAt(2);
                L.n(view3, "null cannot be cast to non-null type android.widget.TextView");
                View view4 = ((ViewGroup)view0).getChildAt(3);
                L.n(view4, "null cannot be cast to non-null type android.widget.TextView");
                if((y0 == null ? null : y0.l()) == null) {
                    if(((TextView)view4).getVisibility() != 4) {
                        ((TextView)view4).setVisibility(4);
                        ((TextView)view2).setVisibility(4);
                        ((TextView)view3).setVisibility(4);
                        ((TextView)view1).setVisibility(4);
                    }
                    return;
                }
                if(((TextView)view4).getVisibility() != 0) {
                    ((TextView)view4).setVisibility(0);
                    ((TextView)view2).setVisibility(0);
                    ((TextView)view1).setVisibility(0);
                }
                String s = y0.h();
                if(s == null || !v.v2(s, "pr$", false, 2, null)) {
                    ((TextView)view3).setVisibility(4);
                }
                else {
                    ((TextView)view3).setVisibility(0);
                    String s1 = y0.e();
                    if(s1.length() <= 0) {
                        s1 = null;
                    }
                    ((TextView)view3).setText(s1);
                }
                ((TextView)view1).setText(context0.getString(0x7F150844, new Object[]{y0.m()}));  // string:ranking_dot_text "%d."
                if(y0.m() > 3) {
                    z = false;
                }
                ((TextView)view1).setSelected(z);
                ((TextView)view2).setText(y0.l());
                int v1 = y0.r();
                if(v1 == 0) {
                    ((TextView)view4).setText("");
                    drawable0 = ContextCompat.getDrawable(context0, 0x7F0804E1);  // drawable:ranking_edited
                }
                else {
                    ((TextView)view4).setText(String.valueOf(v1));
                    drawable0 = ContextCompat.getDrawable(context0, y0.a().b());
                }
                if(drawable0 != null) {
                    drawable0.setBounds(0, 0, v, v);
                }
                ((TextView)view4).setCompoundDrawables(null, null, drawable0, null);
                return;
            }
            catch(Exception exception0) {
            }
            b.a.y(exception0);
        }

        public static void b(a c$a0, View view0, Y y0, int v, int v1, Object object0) {
            if((v1 & 4) != 0) {
                v = 0;
            }
            c$a0.a(view0, y0, v);
        }
    }

    private final int a;
    private final int b;
    private final int c;
    @l
    private List d;
    private int e;
    @m
    private WeakReference f;
    @l
    public static final a g;

    static {
        c.g = new a(null);
    }

    public c(int v, int v1) {
        this.a = v;
        this.b = v1;
        this.c = 0;
        this.d = u.H();
    }

    private final void A(View view0) {
        try {
            List list0 = this.d;
            Integer integer0 = null;
            if(list0.isEmpty()) {
                list0 = null;
            }
            if(list0 == null) {
                return;
            }
            Context context0 = view0.getContext();
            AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
            if(appCompatActivity0 == null) {
                return;
            }
            ViewParent viewParent0 = view0.getParent();
            ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
            if(viewGroup0 == null) {
                return;
            }
            WeakReference weakReference0 = this.f;
            if(weakReference0 != null) {
                RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
                if(recyclerView0 != null) {
                    ViewHolder recyclerView$ViewHolder0 = recyclerView0.findContainingViewHolder(viewGroup0);
                    if(recyclerView$ViewHolder0 != null) {
                        Integer integer1 = recyclerView$ViewHolder0.getBindingAdapterPosition();
                        if(integer1.intValue() >= 0) {
                            integer0 = integer1;
                        }
                        if(integer0 != null) {
                            Y y0 = (Y)u.W2(list0, viewGroup0.indexOfChild(view0) + integer0.intValue() % this.a * 10);
                            if(y0 == null) {
                                return;
                            }
                            String s = y0.h();
                            if(s == null) {
                                return;
                            }
                            Xk.i(appCompatActivity0, s);
                            return;
                        }
                    }
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a.y(exception0);
    }

    @l
    public com.dcinside.app.main.view.b B(@l ViewGroup viewGroup0, int v) {
        @f(c = "com.dcinside.app.main.view.CrowdPagerAdapter$onCreateViewHolder$1", f = "CrowdPagerAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.view.c.b extends o implements p {
            int k;
            Object l;
            final c m;

            com.dcinside.app.main.view.c.b(c c0, d d0) {
                this.m = c0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.main.view.c.b c$b0 = new com.dcinside.app.main.view.c.b(this.m, d0);
                c$b0.l = view0;
                return c$b0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.A(((View)this.l));
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        Context context0 = viewGroup0.getContext();
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        LinearLayout linearLayout0 = new LinearLayout(context0);
        linearLayout0.setOrientation(1);
        L.m(context0);
        ColorStateList colorStateList0 = Ok.c.c(context0);
        for(int v1 = 0; v1 < 10; ++v1) {
            View view0 = layoutInflater0.inflate(0x7F0E01B5, linearLayout0, false);  // layout:view_crowd_item
            L.n(view0, "null cannot be cast to non-null type android.view.ViewGroup");
            r.M(((ViewGroup)view0), null, new com.dcinside.app.main.view.c.b(this, null), 1, null);
            View view1 = ((ViewGroup)view0).getChildAt(0);
            L.n(view1, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView)view1).setTextColor(colorStateList0);
            linearLayout0.addView(((ViewGroup)view0), new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        return new com.dcinside.app.main.view.b(linearLayout0);
    }

    public final void C(@l List list0) {
        L.p(list0, "value");
        this.d = list0;
        this.e = list0.isEmpty() ? 0 : this.b;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.e;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView0);
        this.f = new WeakReference(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.z(((com.dcinside.app.main.view.b)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.B(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView0);
        this.f = null;
    }

    private final void w(int v, int v1, View view0) {
        Y y0 = (Y)u.W2(this.d, v + v1 * 10);
        c.g.a(view0, y0, this.c);
    }

    @n
    public static final void x(@l View view0, @m Y y0, int v) {
        c.g.a(view0, y0, v);
    }

    @l
    public final List y() {
        return this.d;
    }

    public void z(@l com.dcinside.app.main.view.b b0, int v) {
        L.p(b0, "holder");
        L.n(b0.itemView, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout0 = (LinearLayout)b0.itemView;
        for(int v1 = 0; v1 < 10; ++v1) {
            View view0 = linearLayout0.getChildAt(v1);
            L.o(view0, "getChildAt(...)");
            this.w(v1, v % this.a, view0);
        }
    }
}

