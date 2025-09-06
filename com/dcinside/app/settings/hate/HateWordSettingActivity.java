package com.dcinside.app.settings.hate;

import A3.p;
import Y.x;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.y;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.P0;
import io.realm.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import y4.l;
import y4.m;

@s0({"SMAP\nHateWordSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HateWordSettingActivity.kt\ncom/dcinside/app/settings/hate/HateWordSettingActivity\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n25#2:244\n37#3,2:245\n1755#4,3:247\n*S KotlinDebug\n*F\n+ 1 HateWordSettingActivity.kt\ncom/dcinside/app/settings/hate/HateWordSettingActivity\n*L\n107#1:244\n126#1:245,2\n131#1:247,3\n*E\n"})
public final class HateWordSettingActivity extends g implements P0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Activity activity0, @m String s) {
            L.p(activity0, "activity");
            Intent intent0 = new Intent(activity0, HateWordSettingActivity.class);
            intent0.putExtra("g", s);
            activity0.startActivity(intent0);
        }
    }

    static final class b extends Adapter {
        @m
        private final T0 a;
        @m
        private final F0 b;

        public b(@l g g0, @m T0 t00) {
            L.p(g0, "activity");
            super();
            this.a = t00;
            this.b = g0.F1();
        }

        @l
        public c A(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01CC, viewGroup0, false);  // layout:view_deletable_item
            L.m(view0);
            return new c(view0);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return L.g((this.a == null ? null : Boolean.valueOf(this.a.s())), Boolean.TRUE) ? this.a.size() : 0;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.z(((c)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.A(viewGroup0, v);
        }

        public final void w(int v) {
            if(this.a != null && this.a.s()) {
                try {
                    L.m(this.b);
                    h h0 = (F0 f00) -> {
                        L.p(this, "this$0");
                        this.a.T3(v);
                    };
                    this.b.Y3(h0);
                }
                catch(Exception exception0) {
                    timber.log.b.a.y(exception0);
                }
            }
        }

        // 检测为 Lambda 实现
        private static final void x(b hateWordSettingActivity$b0, int v, F0 f00) [...]

        @m
        public final T0 y() {
            return this.a;
        }

        public void z(@l c hateWordSettingActivity$c0, int v) {
            L.p(hateWordSettingActivity$c0, "holder");
            T0 t00 = this.a;
            if(t00 != null) {
                String s = (String)t00.get(v);
                if(s != null) {
                    hateWordSettingActivity$c0.h().setText(s);
                }
            }
        }
    }

    @s0({"SMAP\nHateWordSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HateWordSettingActivity.kt\ncom/dcinside/app/settings/hate/HateWordSettingActivity$HateWordViewHolder\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,243:1\n25#2:244\n*S KotlinDebug\n*F\n+ 1 HateWordSettingActivity.kt\ncom/dcinside/app/settings/hate/HateWordSettingActivity$HateWordViewHolder\n*L\n197#1:244\n*E\n"})
    static final class c extends ViewHolder {
        @l
        private final TextView a;
        @l
        private final View b;
        @l
        private final ImageView c;

        public c(@l View view0) {
            @f(c = "com.dcinside.app.settings.hate.HateWordSettingActivity$HateWordViewHolder$1", f = "HateWordSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class com.dcinside.app.settings.hate.HateWordSettingActivity.c.a extends o implements p {
                int k;
                final c l;

                com.dcinside.app.settings.hate.HateWordSettingActivity.c.a(c hateWordSettingActivity$c0, d d0) {
                    this.l = hateWordSettingActivity$c0;
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, @l View view0, @m d d0) {
                    return new com.dcinside.app.settings.hate.HateWordSettingActivity.c.a(this.l, d0).invokeSuspend(S0.a);
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
                    this.l.i();
                    return S0.a;
                }
            }

            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B03C3);  // id:deletable_subject
            L.o(view1, "findViewById(...)");
            this.a = (TextView)view1;
            View view2 = view0.findViewById(0x7F0B03C2);  // id:deletable_ic_wrap
            L.o(view2, "findViewById(...)");
            this.b = view2;
            View view3 = view0.findViewById(0x7F0B03C1);  // id:deletable_ic
            L.o(view3, "findViewById(...)");
            this.c = (ImageView)view3;
            r.M(view2, null, new com.dcinside.app.settings.hate.HateWordSettingActivity.c.a(this, null), 1, null);
            vk.h(0x7F04032A, new View[]{((ImageView)view3)});  // attr:icTintNormal
        }

        @l
        public final View f() {
            return this.b;
        }

        @l
        public final TextView h() {
            return this.a;
        }

        private final void i() {
            int v = this.getBindingAdapterPosition();
            ViewParent viewParent0 = this.itemView.getParent();
            Adapter recyclerView$Adapter0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof b) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((b)recyclerView$Adapter0) == null) {
                return;
            }
            ((b)recyclerView$Adapter0).w(v);
        }
    }

    @l
    private static final String A = "g";
    private x w;
    @m
    private y x;
    @l
    private final com.dcinside.app.settings.hate.HateWordSettingActivity.h y;
    @l
    public static final a z;

    static {
        HateWordSettingActivity.z = new a(null);
    }

    public HateWordSettingActivity() {
        public static final class com.dcinside.app.settings.hate.HateWordSettingActivity.h extends OnBackPressedCallback {
            final HateWordSettingActivity d;

            com.dcinside.app.settings.hate.HateWordSettingActivity.h(HateWordSettingActivity hateWordSettingActivity0) {
                this.d = hateWordSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.finish();
            }
        }

        this.y = new com.dcinside.app.settings.hate.HateWordSettingActivity.h(this);
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.W1(((y)object0));
    }

    private final void S1() {
        @f(c = "com.dcinside.app.settings.hate.HateWordSettingActivity$applyClickEvent$1", f = "HateWordSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.hate.HateWordSettingActivity.d extends o implements p {
            int k;
            final HateWordSettingActivity l;

            com.dcinside.app.settings.hate.HateWordSettingActivity.d(HateWordSettingActivity hateWordSettingActivity0, d d0) {
                this.l = hateWordSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.hate.HateWordSettingActivity.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.V1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.hate.HateWordSettingActivity$applyClickEvent$2", f = "HateWordSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            final HateWordSettingActivity l;

            e(HateWordSettingActivity hateWordSettingActivity0, d d0) {
                this.l = hateWordSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.X1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.hate.HateWordSettingActivity$applyClickEvent$3", f = "HateWordSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.hate.HateWordSettingActivity.f extends o implements p {
            int k;
            final HateWordSettingActivity l;

            com.dcinside.app.settings.hate.HateWordSettingActivity.f(HateWordSettingActivity hateWordSettingActivity0, d d0) {
                this.l = hateWordSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.hate.HateWordSettingActivity.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.Y1();
                return S0.a;
            }
        }

        x x0 = this.w;
        if(x0 == null) {
            L.S("binding");
            x0 = null;
        }
        L.o(x0.b, "hateWordSettingBtn");
        com.dcinside.app.settings.hate.HateWordSettingActivity.d hateWordSettingActivity$d0 = new com.dcinside.app.settings.hate.HateWordSettingActivity.d(this, null);
        r.M(x0.b, null, hateWordSettingActivity$d0, 1, null);
        x x1 = this.w;
        if(x1 == null) {
            L.S("binding");
            x1 = null;
        }
        L.o(x1.d, "hateWordSettingCopy");
        e hateWordSettingActivity$e0 = new e(this, null);
        r.M(x1.d, null, hateWordSettingActivity$e0, 1, null);
        x x2 = this.w;
        if(x2 == null) {
            L.S("binding");
            x2 = null;
        }
        L.o(x2.k, "hateWordSettingRemoveAll");
        com.dcinside.app.settings.hate.HateWordSettingActivity.f hateWordSettingActivity$f0 = new com.dcinside.app.settings.hate.HateWordSettingActivity.f(this, null);
        r.M(x2.k, null, hateWordSettingActivity$f0, 1, null);
    }

    private final void T1() {
        F0 f00 = this.F1();
        if(f00 != null) {
            f00.Y3((F0 f00) -> {
                L.p(this, "this$0");
                y y0 = this.x;
                if(y0 != null) {
                    T0 t00 = y0.T5();
                    if(t00 != null) {
                        t00.clear();
                    }
                }
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void U1(HateWordSettingActivity hateWordSettingActivity0, F0 f00) [...]

    private final void V1() {
        static final class com.dcinside.app.settings.hate.HateWordSettingActivity.g extends N implements Function1 {
            final List e;

            com.dcinside.app.settings.hate.HateWordSettingActivity.g(List list0) {
                this.e = list0;
                super(1);
            }

            public final void a(@l y y0) {
                L.p(y0, "it");
                y0.T5().addAll(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((y)object0));
                return S0.a;
            }
        }

        F0 f00 = this.F1();
        if(f00 != null && !f00.isClosed()) {
            y y0 = this.x;
            if(y0 == null) {
                return;
            }
            String s = y0.Q5();
            if(s == null) {
                return;
            }
            x x0 = this.w;
            x x1 = null;
            if(x0 == null) {
                L.S("binding");
                x0 = null;
            }
            String s1 = String.valueOf(x0.l.getText());
            x x2 = this.w;
            if(x2 == null) {
                L.S("binding");
            }
            else {
                x1 = x2;
            }
            x1.l.f();
            int v = 0;
            String[] arr_s = (String[])v.V4(s1, new String[]{"\n"}, false, 0, 6, null).toArray(new String[0]);
            if(arr_s.length != 0) {
                ArrayList arrayList0 = new ArrayList();
                while(v < arr_s.length) {
                    String s2 = arr_s[v];
                    if(!m0.a.a.h(s2)) {
                        y y1 = this.x;
                        if(y1 == null) {
                        label_31:
                            if(!arrayList0.isEmpty()) {
                                for(Object object0: arrayList0) {
                                    if(!L.g(s2, ((String)object0))) {
                                        continue;
                                    }
                                    goto label_38;
                                }
                            }
                            arrayList0.add(s2);
                        }
                        else {
                            T0 t00 = y1.T5();
                            if(t00 == null || !t00.contains(s2)) {
                                goto label_31;
                            }
                        }
                    }
                label_38:
                    ++v;
                }
                if(arrayList0.isEmpty()) {
                    return;
                }
                com.dcinside.app.settings.hate.HateWordSettingActivity.g hateWordSettingActivity$g0 = new com.dcinside.app.settings.hate.HateWordSettingActivity.g(arrayList0);
                y.h.j(s, hateWordSettingActivity$g0);
            }
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void W1(@l y y0) {
        int v = 0;
        L.p(y0, "element");
        x x0 = this.w;
        x x1 = null;
        if(x0 == null) {
            L.S("binding");
            x0 = null;
        }
        L.o(x0.j, "hateWordSettingRecycler");
        Adapter recyclerView$Adapter0 = x0.j.getAdapter();
        if(!(recyclerView$Adapter0 instanceof b)) {
            recyclerView$Adapter0 = null;
        }
        if(((b)recyclerView$Adapter0) == null) {
            return;
        }
        ((b)recyclerView$Adapter0).notifyDataSetChanged();
        x x2 = this.w;
        if(x2 == null) {
            L.S("binding");
            x2 = null;
        }
        String s = this.getString(0x7F150177, new Object[]{((b)recyclerView$Adapter0).getItemCount()});  // string:block_item_add_count "등록 (%1$d)"
        x2.e.setText(s);
        x x3 = this.w;
        if(x3 == null) {
            L.S("binding");
        }
        else {
            x1 = x3;
        }
        ConstraintLayout constraintLayout0 = x1.n;
        if(((b)recyclerView$Adapter0).getItemCount() <= 0) {
            v = 4;
        }
        constraintLayout0.setVisibility(v);
    }

    private final void X1() {
        y y0 = this.x;
        if(y0 != null) {
            T0 t00 = y0.T5();
            if(t00 == null || !t00.s() || t00.size() == 0) {
                return;
            }
            try {
                StringBuilder stringBuilder0 = new StringBuilder();
                for(Object object0: t00) {
                    if(stringBuilder0.length() > 0) {
                        stringBuilder0.append('\n');
                    }
                    stringBuilder0.append(((String)object0));
                }
                L.o("목록 복사", "getString(...)");
                String s = stringBuilder0.toString();
                L.o(s, "toString(...)");
                Clipboards.a.b(0x7F150219, "목록 복사", s);  // string:copy_block_list_to_clipboard "목록이 복사되었습니다."
                return;
            }
            catch(Exception exception0) {
            }
            exception0.printStackTrace();
        }
    }

    private final void Y1() {
        static final class j extends N implements Function1 {
            public static final j e;

            static {
                j.e = new j();
            }

            j() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150274);  // string:delete_all_hate_word "목록을 모두 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class k extends N implements Function1 {
            public static final k e;

            static {
                k.e = new k();
            }

            k() {
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


        static final class com.dcinside.app.settings.hate.HateWordSettingActivity.l extends N implements Function1 {
            final HateWordSettingActivity e;

            com.dcinside.app.settings.hate.HateWordSettingActivity.l(HateWordSettingActivity hateWordSettingActivity0) {
                this.e = hateWordSettingActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.T1();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(j.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(k.e, "$tmp0");
            return (Boolean)k.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.settings.hate.HateWordSettingActivity.l(this), "$tmp0");
            new com.dcinside.app.settings.hate.HateWordSettingActivity.l(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean Z1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void a2(Function1 function10, Object object0) [...]

    private final void b2(y y0) {
        if(y0 == null) {
            Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            this.finish();
            return;
        }
        this.x = y0;
        x x0 = this.w;
        if(x0 == null) {
            L.S("binding");
            x0 = null;
        }
        b hateWordSettingActivity$b0 = new b(this, y0.T5());
        x0.j.setAdapter(hateWordSettingActivity$b0);
        y0.r5(this);
        this.W1(y0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        static final class i extends N implements Function1 {
            final HateWordSettingActivity e;

            i(HateWordSettingActivity hateWordSettingActivity0) {
                this.e = hateWordSettingActivity0;
                super(1);
            }

            public final void a(@m y y0) {
                @f(c = "com.dcinside.app.settings.hate.HateWordSettingActivity$onCreate$2$1", f = "HateWordSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.settings.hate.HateWordSettingActivity.i.a extends o implements A3.o {
                    int k;
                    final HateWordSettingActivity l;
                    final y m;

                    com.dcinside.app.settings.hate.HateWordSettingActivity.i.a(HateWordSettingActivity hateWordSettingActivity0, y y0, d d0) {
                        this.l = hateWordSettingActivity0;
                        this.m = y0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.settings.hate.HateWordSettingActivity.i.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.settings.hate.HateWordSettingActivity.i.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.b2(this.m);
                        return S0.a;
                    }
                }

                kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this.e), h0.e(), null, new com.dcinside.app.settings.hate.HateWordSettingActivity.i.a(this.e, y0, null), 2, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((y)object0));
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        if(this.F1() == null) {
            Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            this.finish();
            return;
        }
        String s = this.getIntent().getStringExtra("g");
        if(s == null) {
            Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            this.finish();
            return;
        }
        x x0 = x.c(this.getLayoutInflater());
        L.o(x0, "inflate(...)");
        this.w = x0;
        x x1 = null;
        if(x0 == null) {
            L.S("binding");
            x0 = null;
        }
        this.setContentView(x0.b());
        this.getOnBackPressedDispatcher().h(this.y);
        x x2 = this.w;
        if(x2 == null) {
            L.S("binding");
            x2 = null;
        }
        this.S0(x2.m);
        kr.bhbfhfb.designcompat.a.d(this);
        this.setTitle(0x7F150440);  // string:hate_word_setting_words "보기 싫은 단어 설정"
        this.S1();
        x x3 = this.w;
        if(x3 == null) {
            L.S("binding");
        }
        else {
            x1 = x3;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        x1.j.setLayoutManager(nonPredictiveLayoutManager0);
        i hateWordSettingActivity$i0 = new i(this);
        y.h.e(s, hateWordSettingActivity$i0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        if(this.x != null && this.x.s()) {
            y y0 = this.x;
            if(y0 != null) {
                y0.K5();
            }
        }
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

