package com.dcinside.app.memo;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.z;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.vk;
import io.realm.T0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nMemoItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoItemAdapter.kt\ncom/dcinside/app/memo/MemoItemAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n278#2,2:161\n278#2,2:163\n257#2,2:165\n257#2,2:167\n1611#3,9:169\n1863#3:178\n1864#3:180\n1620#3:181\n774#3:182\n865#3,2:183\n1#4:179\n*S KotlinDebug\n*F\n+ 1 MemoItemAdapter.kt\ncom/dcinside/app/memo/MemoItemAdapter\n*L\n74#1:161,2\n75#1:163,2\n76#1:165,2\n77#1:167,2\n97#1:169,9\n97#1:178\n97#1:180\n97#1:181\n117#1:182\n117#1:183,2\n97#1:179\n*E\n"})
public final class j extends Adapter {
    @m
    private String a;
    @m
    private T0 b;
    private boolean c;
    @l
    private HashSet d;
    @m
    private o e;
    private boolean f;

    public j() {
        this.d = new HashSet();
    }

    public final void B(boolean z) {
        this.O(z);
        if(this.c) {
            T0 t00 = this.b;
            if(t00 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: t00) {
                    String s = ((q)object0).S5();
                    if(s != null) {
                        arrayList0.add(s);
                    }
                }
                this.d.addAll(arrayList0);
                return;
            }
            return;
        }
        if(this.G()) {
            this.d.clear();
        }
    }

    @m
    public final List C(@m T0 t00) {
        if(t00 != null && !t00.isEmpty()) {
            if(this.G()) {
                return t00;
            }
            List list0 = new ArrayList();
            for(Object object0: t00) {
                if(u.W1(this.d, ((q)object0).S5())) {
                    list0.add(object0);
                }
            }
            return list0;
        }
        return null;
    }

    @m
    public final String D() {
        return this.a;
    }

    @m
    public final q E(int v) {
        return this.b == null ? null : ((q)this.b.get(v));
    }

    @m
    public final T0 F() {
        return this.b;
    }

    private final boolean G() {
        return this.d.size() == this.getItemCount();
    }

    public final boolean H() {
        return this.f;
    }

    private final boolean I(String s) {
        return u.W1(this.d, s);
    }

    public void J(@l com.dcinside.app.memo.l l0, int v) {
        @f(c = "com.dcinside.app.memo.MemoItemAdapter$onBindViewHolder$1", f = "MemoItemAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j l;
            final com.dcinside.app.memo.l m;
            final String n;
            final String o;
            final int p;

            a(j j0, com.dcinside.app.memo.l l0, String s, String s1, int v, d d0) {
                this.l = j0;
                this.m = l0;
                this.n = s;
                this.o = s1;
                this.p = v;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, this.m, this.n, this.o, this.p, d0).invokeSuspend(S0.a);
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
                if(this.l.H()) {
                    boolean z = this.m.h().isChecked();
                    this.m.h().setChecked(!z);
                    return S0.a;
                }
                j j0 = this.l;
                View view0 = this.m.itemView;
                L.o(view0, "itemView");
                String s = this.n;
                String s1 = this.o;
                String s2 = this.l.D();
                if(s2 == null) {
                    return S0.a;
                }
                j0.S(view0, s, s1, s2, this.p);
                return S0.a;
            }
        }

        int v1;
        L.p(l0, "holder");
        Context context0 = l0.itemView.getContext();
        q q0 = this.E(v);
        String s = null;
        String s1 = q0 == null ? null : q0.S5();
        String s2 = q0 == null ? null : q0.R5();
        String s3 = q0 == null ? null : q0.Q5();
        Integer integer0 = q.g.a(s3);
        if(integer0 == null) {
            L.m(context0);
            v1 = vk.b(context0, 0x1010038);
        }
        else {
            v1 = (int)integer0;
        }
        boolean z = F.B(s1);
        L.m(context0);
        l0.l().setText(F.x(context0, s1, s2));
        CharSequence charSequence0 = l0.l().getText();
        L.o(charSequence0, "getText(...)");
        int v2 = v.s3(charSequence0, "-", 0, false, 6, null);
        if(v2 > -1) {
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(l0.l().getText());
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v1), v2, l0.l().getText().length(), 33);
            l0.l().setText(spannableStringBuilder0);
        }
        L.o(l0.itemView, "itemView");
        a j$a0 = new a(this, l0, (z ? null : s1), (z ? s1 : null), v, null);
        r.M(l0.itemView, null, j$a0, 1, null);
        int v3 = 4;
        int v4 = 0;
        l0.j().setVisibility((z ? 4 : 0));
        View view0 = l0.k();
        if(z) {
            v3 = 0;
        }
        view0.setVisibility(v3);
        l0.i().setVisibility((this.f ? 8 : 0));
        CheckBox checkBox0 = l0.h();
        if(!this.f) {
            v4 = 8;
        }
        checkBox0.setVisibility(v4);
        CheckBox checkBox1 = l0.h();
        if(q0 != null) {
            s = q0.S5();
        }
        checkBox1.setChecked(this.I(s));
        l0.h().setOnCheckedChangeListener((CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            L.m(context0);
            this.L(context0, z, (q0 == null ? null : q0.S5()));
        });
    }

    // 检测为 Lambda 实现
    private static final void K(j j0, Context context0, q q0, CompoundButton compoundButton0, boolean z) [...]

    private final void L(Context context0, boolean z, String s) {
        if(s != null && s.length() != 0) {
            if(z) {
                if(this.d.contains(s)) {
                    return;
                }
                this.d.add(s);
            }
            else {
                this.d.remove(s);
            }
            if(this.G() && !this.c) {
                c.a(context0, new z(true));
                return;
            }
            if(this.c && !this.G()) {
                c.a(context0, new z(false));
            }
        }
    }

    @l
    public com.dcinside.app.memo.l N(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new com.dcinside.app.memo.l(viewGroup0);
    }

    private final void O(boolean z) {
        this.c = z;
        this.notifyItemRangeChanged(0, this.getItemCount());
    }

    public final void P(boolean z) {
        this.f = z;
        this.d.clear();
    }

    public final void Q(@m String s) {
        this.a = s;
    }

    public final void R(@m T0 t00) {
        this.b = t00;
        this.notifyDataSetChanged();
    }

    private final void S(View view0, String s, String s1, String s2, int v) {
        static final class b extends N implements Function1 {
            final String e;
            final String f;
            final String g;
            final View h;
            final j i;
            final int j;

            b(String s, String s1, String s2, View view0, j j0, int v) {
                this.e = s;
                this.f = s1;
                this.g = s2;
                this.h = view0;
                this.i = j0;
                this.j = v;
                super(1);
            }

            public final void c(com.dcinside.app.memo.p p0) {
                String s = TextUtils.isEmpty(this.e) ? this.f : this.e;
                if(s == null) {
                    return;
                }
                L.m(p0);
                F.h(null, this.g, s, p0);
                Dl.D(this.h.getContext(), 0x7F150640);  // string:memo_add_success "변경 사항이 적용되었습니다."
                this.i.notifyItemChanged(this.j);
                k k0 = () -> {
                    L.p(this.h, "$view");
                    Nk.a.c(this.h);
                };
                this.h.postDelayed(k0, 100L);
            }

            // 检测为 Lambda 实现
            private static final void d(View view0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.c(((com.dcinside.app.memo.p)object0));
                return S0.a;
            }
        }

        o o0 = this.e;
        if(o0 != null) {
            o0.l();
        }
        boolean z = L.g(s2, "");
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        this.e = F.q(context0, s, s1, s2, v, ((int)z)).L1(() -> {
            L.p(view0, "$view");
            view0.postDelayed(() -> {
                L.p(view0, "$view");
                Nk.a.c(view0);
            }, 100L);
        }).y5((Object object0) -> {
            L.p(new b(s, s1, s2, view0, this, v), "$tmp0");
            new b(s, s1, s2, view0, this, v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(view0, "$view");
            Dl.G(view0.getContext(), throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void T(View view0) [...]

    // 检测为 Lambda 实现
    private static final void U(View view0) [...]

    // 检测为 Lambda 实现
    private static final void V(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void W(View view0, Throwable throwable0) [...]

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        if(this.b != null && this.b.s()) {
            T0 t00 = this.b;
            L.m(t00);
            return t00.size();
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.J(((com.dcinside.app.memo.l)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.N(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView0);
        o o0 = this.e;
        if(o0 != null) {
            o0.l();
        }
    }
}

