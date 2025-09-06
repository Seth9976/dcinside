package com.dcinside.app.settings.block.post;

import A3.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.realm.e;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.P0;
import io.realm.T0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
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
import y4.l;
import y4.m;

@s0({"SMAP\nBlockItemAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockItemAddActivity.kt\ncom/dcinside/app/settings/block/post/BlockItemAddActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,285:1\n37#2,2:286\n11102#3:288\n11437#3,3:289\n774#4:292\n865#4,2:293\n*S KotlinDebug\n*F\n+ 1 BlockItemAddActivity.kt\ncom/dcinside/app/settings/block/post/BlockItemAddActivity\n*L\n163#1:286,2\n166#1:288\n166#1:289,3\n166#1:292\n166#1:293,2\n*E\n"})
public final class BlockItemAddActivity extends g implements P0 {
    @s0({"SMAP\nBlockItemAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockItemAddActivity.kt\ncom/dcinside/app/settings/block/post/BlockItemAddActivity$BlockItemAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n147#2:286\n142#2:287\n147#2:288\n1#3:289\n*S KotlinDebug\n*F\n+ 1 BlockItemAddActivity.kt\ncom/dcinside/app/settings/block/post/BlockItemAddActivity$BlockItemAdapter\n*L\n228#1:286\n229#1:287\n232#1:288\n*E\n"})
    static final class a extends Adapter implements View.OnClickListener {
        @l
        private final T0 a;
        @l
        private t b;
        @l
        private t c;

        public a(@l BlockItemAddActivity blockItemAddActivity0, @l T0 t00) {
            L.p(blockItemAddActivity0, "activity");
            L.p(t00, "list");
            super();
            this.a = t00;
            this.b = new t(blockItemAddActivity0);
            this.c = new t(null);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.a.s() ? this.a.size() : 0;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
            L.p(recyclerView0, "recyclerView");
            this.c = new t(recyclerView0);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.w(((d)recyclerView$ViewHolder0), v);
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(@l View view0) {
            L.p(view0, "view");
            RecyclerView recyclerView0 = (RecyclerView)this.c.a();
            if(recyclerView0 == null) {
                return;
            }
            ViewParent viewParent0 = view0.getParent();
            Integer integer0 = null;
            View view1 = viewParent0 instanceof View ? ((View)viewParent0) : null;
            if(view1 == null) {
                return;
            }
            Integer integer1 = recyclerView0.getChildAdapterPosition(view1);
            if(integer1.intValue() >= 0) {
                integer0 = integer1;
            }
            if(integer0 != null) {
                int v = (int)integer0;
                BlockItemAddActivity blockItemAddActivity0 = (BlockItemAddActivity)this.b.a();
                if(blockItemAddActivity0 == null) {
                    return;
                }
                blockItemAddActivity0.b2(v);
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.x(viewGroup0, v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
            L.p(recyclerView0, "recyclerView");
        }

        @l
        public final T0 v() {
            return this.a;
        }

        public void w(@l d blockItemAddActivity$d0, int v) {
            L.p(blockItemAddActivity$d0, "holder");
            blockItemAddActivity$d0.f().setText(((String)this.a.get(v)));
        }

        @l
        public d x(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01CC, viewGroup0, false);  // layout:view_deletable_item
            L.m(view0);
            d blockItemAddActivity$d0 = new d(view0);
            blockItemAddActivity$d0.e().setOnClickListener(this);
            return blockItemAddActivity$d0;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
    }

    public static final class c {
        private c() {
        }

        public c(w w0) {
        }

        public final void a(@l Context context0, @m String s, @m String s1, @b @m String s2) {
            L.p(context0, "context");
            Intent intent0 = new Intent(context0, BlockItemAddActivity.class);
            intent0.putExtra("g", s);
            intent0.putExtra("t", s2);
            intent0.putExtra("gallName", s1);
            context0.startActivity(intent0);
        }
    }

    static final class d extends ViewHolder {
        @l
        private final TextView a;
        @l
        private final View b;
        @l
        private final ImageView c;

        public d(@l View view0) {
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
            vk.h(0x7F04032A, new View[]{((ImageView)view3)});  // attr:icTintNormal
        }

        @l
        public final View e() {
            return this.b;
        }

        @l
        public final TextView f() {
            return this.a;
        }
    }

    @l
    public static final c A = null;
    @l
    private static final String B = "gallName";
    @l
    private static final String C = "g";
    @l
    private static final String D = "t";
    @l
    public static final String E = "word";
    @l
    public static final String F = "nick";
    @l
    public static final String G = "id";
    @l
    public static final String H = "ip";
    private Y.m w;
    @m
    private e x;
    private T0 y;
    @m
    private a z;

    static {
        BlockItemAddActivity.A = new c(null);
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.a2(((e)object0));
    }

    private final void U1() {
        @f(c = "com.dcinside.app.settings.block.post.BlockItemAddActivity$applyClickEvent$1", f = "BlockItemAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.block.post.BlockItemAddActivity.e extends o implements p {
            int k;
            final BlockItemAddActivity l;

            com.dcinside.app.settings.block.post.BlockItemAddActivity.e(BlockItemAddActivity blockItemAddActivity0, kotlin.coroutines.d d0) {
                this.l = blockItemAddActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.block.post.BlockItemAddActivity.e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.Y1();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.block.post.BlockItemAddActivity$applyClickEvent$2", f = "BlockItemAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.block.post.BlockItemAddActivity.f extends o implements p {
            int k;
            final BlockItemAddActivity l;

            com.dcinside.app.settings.block.post.BlockItemAddActivity.f(BlockItemAddActivity blockItemAddActivity0, kotlin.coroutines.d d0) {
                this.l = blockItemAddActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.block.post.BlockItemAddActivity.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.d2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.block.post.BlockItemAddActivity$applyClickEvent$3", f = "BlockItemAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.block.post.BlockItemAddActivity.g extends o implements p {
            int k;
            final BlockItemAddActivity l;

            com.dcinside.app.settings.block.post.BlockItemAddActivity.g(BlockItemAddActivity blockItemAddActivity0, kotlin.coroutines.d d0) {
                this.l = blockItemAddActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.block.post.BlockItemAddActivity.g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.e2();
                return S0.a;
            }
        }

        Y.m m0 = this.w;
        if(m0 == null) {
            L.S("binding");
            m0 = null;
        }
        L.o(m0.b, "blockItemAddBtn");
        com.dcinside.app.settings.block.post.BlockItemAddActivity.e blockItemAddActivity$e0 = new com.dcinside.app.settings.block.post.BlockItemAddActivity.e(this, null);
        r.M(m0.b, null, blockItemAddActivity$e0, 1, null);
        Y.m m1 = this.w;
        if(m1 == null) {
            L.S("binding");
            m1 = null;
        }
        L.o(m1.d, "blockItemAddCopy");
        com.dcinside.app.settings.block.post.BlockItemAddActivity.f blockItemAddActivity$f0 = new com.dcinside.app.settings.block.post.BlockItemAddActivity.f(this, null);
        r.M(m1.d, null, blockItemAddActivity$f0, 1, null);
        Y.m m2 = this.w;
        if(m2 == null) {
            L.S("binding");
            m2 = null;
        }
        L.o(m2.k, "blockItemAddRemoveAll");
        com.dcinside.app.settings.block.post.BlockItemAddActivity.g blockItemAddActivity$g0 = new com.dcinside.app.settings.block.post.BlockItemAddActivity.g(this, null);
        r.M(m2.k, null, blockItemAddActivity$g0, 1, null);
    }

    private final void V1() {
        F0 f00 = this.F1();
        if(f00 != null) {
            f00.Y3((F0 f00) -> {
                L.p(this, "this$0");
                T0 t00 = this.y;
                if(t00 == null) {
                    L.S("blockItems");
                    t00 = null;
                }
                t00.clear();
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void W1(BlockItemAddActivity blockItemAddActivity0, F0 f00) [...]

    private final void X1(String s, String s1) {
        Y.m m0 = this.w;
        Y.m m1 = null;
        if(m0 == null) {
            L.S("binding");
            m0 = null;
        }
        int v = s == null || s.length() == 0 ? 8 : 0;
        m0.g.setVisibility(v);
        Y.m m2 = this.w;
        if(m2 == null) {
            L.S("binding");
        }
        else {
            m1 = m2;
        }
        m1.f.setText(s1);
    }

    private final void Y1() {
        T0 t00 = this.y;
        T0 t01 = null;
        if(t00 == null) {
            L.S("blockItems");
            t00 = null;
        }
        if(t00.s()) {
            if(this.y == null) {
                L.S("blockItems");
            }
            F0 f00 = this.F1();
            if(f00 != null && !f00.isClosed()) {
                Y.m m0 = this.w;
                if(m0 == null) {
                    L.S("binding");
                    m0 = null;
                }
                String s = String.valueOf(m0.l.getText());
                Y.m m1 = this.w;
                if(m1 == null) {
                    L.S("binding");
                    m1 = null;
                }
                m1.l.f();
                String[] arr_s = (String[])v.V4(s, new String[]{"\n"}, false, 0, 6, null).toArray(new String[0]);
                if(arr_s.length != 0) {
                    T0 t02 = this.y;
                    if(t02 == null) {
                        L.S("blockItems");
                    }
                    else {
                        t01 = t02;
                    }
                    HashSet hashSet0 = u.T5(t01);
                    ArrayList arrayList0 = new ArrayList(arr_s.length);
                    for(int v = 0; v < arr_s.length; ++v) {
                        arrayList0.add(v.G5(arr_s[v]).toString());
                    }
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: arrayList0) {
                        if(((String)object0).length() > 0 && !hashSet0.contains(((String)object0))) {
                            arrayList1.add(object0);
                        }
                    }
                    if(!arrayList1.isEmpty()) {
                        f00.Y3((F0 f00) -> {
                            L.p(this, "this$0");
                            L.p(arrayList1, "$newList");
                            T0 t00 = this.y;
                            if(t00 == null) {
                                L.S("blockItems");
                                t00 = null;
                            }
                            t00.addAll(arrayList1);
                        });
                    }
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void Z1(BlockItemAddActivity blockItemAddActivity0, List list0, F0 f00) [...]

    @SuppressLint({"NotifyDataSetChanged"})
    public void a2(@l e e0) {
        int v = 0;
        L.p(e0, "element");
        a blockItemAddActivity$a0 = this.z;
        if(blockItemAddActivity$a0 != null) {
            blockItemAddActivity$a0.notifyDataSetChanged();
        }
        Y.m m0 = this.w;
        Y.m m1 = null;
        if(m0 == null) {
            L.S("binding");
            m0 = null;
        }
        int v1 = this.z == null ? 0 : this.z.getItemCount();
        m0.e.setText(this.getString(0x7F150177, new Object[]{v1}));  // string:block_item_add_count "등록 (%1$d)"
        Y.m m2 = this.w;
        if(m2 == null) {
            L.S("binding");
        }
        else {
            m1 = m2;
        }
        ConstraintLayout constraintLayout0 = m1.n;
        if((this.z == null ? 0 : this.z.getItemCount()) <= 0) {
            v = 4;
        }
        constraintLayout0.setVisibility(v);
    }

    private final void b2(int v) {
        T0 t00 = this.y;
        if(t00 == null) {
            L.S("blockItems");
            t00 = null;
        }
        String s = (String)t00.get(v);
        F0 f00 = this.F1();
        if(f00 != null) {
            f00.Y3((F0 f00) -> {
                L.p(this, "this$0");
                T0 t00 = this.y;
                if(t00 == null) {
                    L.S("blockItems");
                    t00 = null;
                }
                t00.remove(s);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void c2(BlockItemAddActivity blockItemAddActivity0, String s, F0 f00) [...]

    private final void d2() {
        T0 t00 = this.y;
        T0 t01 = null;
        if(t00 == null) {
            L.S("blockItems");
            t00 = null;
        }
        if(t00.s()) {
            if(this.y == null) {
                L.S("blockItems");
            }
            T0 t02 = this.y;
            if(t02 == null) {
                L.S("blockItems");
                t02 = null;
            }
            if(t02.size() == 0) {
                return;
            }
            try {
                StringBuilder stringBuilder0 = new StringBuilder();
                T0 t03 = this.y;
                if(t03 == null) {
                    L.S("blockItems");
                }
                else {
                    t01 = t03;
                }
                for(Object object0: t01) {
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

    private final void e2() {
        static final class h extends N implements Function1 {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150271);  // string:delete_all_block "목록을 모두 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class i extends N implements Function1 {
            public static final i e;

            static {
                i.e = new i();
            }

            i() {
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


        static final class j extends N implements Function1 {
            final BlockItemAddActivity e;

            j(BlockItemAddActivity blockItemAddActivity0) {
                this.e = blockItemAddActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.V1();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(h.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(i.e, "$tmp0");
            return (Boolean)i.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new j(this), "$tmp0");
            new j(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean f2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void g2(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        Y.m m0 = Y.m.c(this.getLayoutInflater());
        L.o(m0, "inflate(...)");
        this.w = m0;
        T0 t00 = null;
        if(m0 == null) {
            L.S("binding");
            m0 = null;
        }
        this.setContentView(m0.b());
        Y.m m1 = this.w;
        if(m1 == null) {
            L.S("binding");
            m1 = null;
        }
        this.S0(m1.m);
        kr.bhbfhfb.designcompat.a.d(this);
        String s = this.getIntent().getStringExtra("g");
        String s1 = this.getIntent().getStringExtra("gallName");
        String s2 = this.getIntent().getStringExtra("t");
        F0 f00 = this.F1();
        if(f00 == null) {
            Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            this.finish();
            return;
        }
        if(s == null) {
            Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            this.finish();
            return;
        }
        e e0 = e.k.c(f00, s);
        this.x = e0;
        if(e0 == null) {
            Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            this.finish();
            return;
        }
        if(s2 != null) {
            switch(s2) {
                case "id": {
                    this.y = e0.U5();
                    kr.bhbfhfb.designcompat.a.g(this, 0x7F150194);  // string:block_setting_id_title "차단 식별 코드"
                    break;
                }
                case "ip": {
                    this.y = e0.V5();
                    Y.m m2 = this.w;
                    if(m2 == null) {
                        L.S("binding");
                        m2 = null;
                    }
                    m2.l.setRawInputType(0x2002);
                    kr.bhbfhfb.designcompat.a.g(this, 0x7F15019C);  // string:block_setting_ip_title "차단 IP"
                    break;
                }
                case "nick": {
                    this.y = e0.W5();
                    kr.bhbfhfb.designcompat.a.g(this, 0x7F15019E);  // string:block_setting_nick_title "차단 닉네임"
                    break;
                }
                case "word": {
                    this.y = e0.X5();
                    kr.bhbfhfb.designcompat.a.g(this, 0x7F1501AE);  // string:block_setting_word_title "차단 단어"
                    break;
                }
                default: {
                    Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
                    this.finish();
                    return;
                }
            }
            this.X1(s, s1);
            this.U1();
            Y.m m3 = this.w;
            if(m3 == null) {
                L.S("binding");
                m3 = null;
            }
            RecyclerView recyclerView0 = m3.j;
            recyclerView0.setLayoutManager(new NonPredictiveLayoutManager());
            T0 t01 = this.y;
            if(t01 == null) {
                L.S("blockItems");
            }
            else {
                t00 = t01;
            }
            a blockItemAddActivity$a0 = new a(this, t00);
            this.z = blockItemAddActivity$a0;
            recyclerView0.setAdapter(blockItemAddActivity$a0);
            e0.r5(this);
            this.a2(e0);
            return;
        }
        Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
        this.finish();
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        if(this.x != null && this.x.s()) {
            e e0 = this.x;
            if(e0 != null) {
                e0.K5();
            }
        }
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

