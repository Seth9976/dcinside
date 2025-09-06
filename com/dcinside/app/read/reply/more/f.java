package com.dcinside.app.read.reply.more;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.read.reply.more.holder.g;
import com.dcinside.app.read.reply.more.holder.j;
import com.dcinside.app.realm.e;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.wv.B;
import com.dcinside.app.wv.VideoEnabledWebView;
import io.realm.F0;
import io.realm.T0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nReplyMoreAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreAdapter.kt\ncom/dcinside/app/read/reply/more/ReplyMoreAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,399:1\n360#2,7:400\n1#3:407\n1#3:411\n1#3:416\n120#4,3:408\n124#4:412\n112#4,3:413\n129#4,15:417\n116#4:432\n129#4,15:433\n*S KotlinDebug\n*F\n+ 1 ReplyMoreAdapter.kt\ncom/dcinside/app/read/reply/more/ReplyMoreAdapter\n*L\n247#1:400,7\n328#1:411\n343#1:416\n328#1:408,3\n328#1:412\n343#1:413,3\n343#1:417,15\n343#1:432\n343#1:433,15\n*E\n"})
public final class f extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b {
        private final int a;
        @l
        private final ReplyMoreItem b;

        public b() {
            this(0, null, 3, null);
        }

        public b(int v, @l ReplyMoreItem replyMoreItem0) {
            L.p(replyMoreItem0, "replyMore");
            super();
            this.a = v;
            this.b = replyMoreItem0;
        }

        public b(int v, ReplyMoreItem replyMoreItem0, int v1, w w0) {
            this(((v1 & 1) == 0 ? v : 0), ((v1 & 2) == 0 ? replyMoreItem0 : new ReplyMoreItem(0, 0, null, null, null, null, false, null, 0, null, null, null, null, null, false, 0, null, null, null, null, 0xFFFFF, null)));
        }

        public final int a() {
            return this.a;
        }

        @l
        public final ReplyMoreItem b() {
            return this.b;
        }

        @l
        public final b c(int v, @l ReplyMoreItem replyMoreItem0) {
            L.p(replyMoreItem0, "replyMore");
            return new b(v, replyMoreItem0);
        }

        public static b d(b f$b0, int v, ReplyMoreItem replyMoreItem0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = f$b0.a;
            }
            if((v1 & 2) != 0) {
                replyMoreItem0 = f$b0.b;
            }
            return f$b0.c(v, replyMoreItem0);
        }

        @l
        public final ReplyMoreItem e() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            return this.a == ((b)object0).a ? L.g(this.b, ((b)object0).b) : false;
        }

        public final int f() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a * 0x1F + this.b.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "ReplyMoreAdapterItem(type=" + this.a + ", replyMore=" + this.b + ")";
        }
    }

    @l
    private List a;
    @m
    private com.dcinside.app.realm.f b;
    @m
    private com.dcinside.app.realm.f c;
    @l
    private BlockState d;
    @l
    private BlockState e;
    @m
    private A3.a f;
    @m
    private A3.a g;
    @m
    private A3.a h;
    @m
    private A3.a i;
    @m
    private A3.a j;
    @m
    private A3.a k;
    @m
    private A3.a l;
    @m
    private A3.a m;
    @m
    private o n;
    @m
    private com.dcinside.app.wv.f o;
    @l
    public static final a p = null;
    public static final int q = 10000007;
    public static final int r = 10000004;
    public static final int s = 10000022;
    public static final int t = 10000005;
    public static final int u = 10000006;
    public static final int v = 10000103;
    public static final int w = 10000104;
    public static final int x = 10000105;
    public static final int y = 10000106;
    public static final int z = 10000107;

    static {
        f.p = new a(null);
    }

    public f() {
        this.a = new ArrayList();
        this.d = new BlockState(false, false, false, 7, null);
        this.e = new BlockState(false, false, false, 7, null);
    }

    public final boolean K(@l BlockState blockState0, @l BlockState blockState1, @m com.dcinside.app.realm.f f0, @m com.dcinside.app.realm.f f1) {
        L.p(blockState0, "gallBlockState");
        L.p(blockState1, "allBlockState");
        return !L.g(blockState0, this.d) || !L.g(blockState1, this.e) || !L.g(f0, this.b) || !L.g(f1, this.c);
    }

    private final void L(Context context0, String s, long v) {
        @s0({"SMAP\nReplyMoreAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreAdapter.kt\ncom/dcinside/app/read/reply/more/ReplyMoreAdapter$blockDccon$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,399:1\n1611#2,9:400\n1863#2:409\n1864#2:411\n1620#2:412\n1#3:410\n*S KotlinDebug\n*F\n+ 1 ReplyMoreAdapter.kt\ncom/dcinside/app/read/reply/more/ReplyMoreAdapter$blockDccon$1\n*L\n282#1:400,9\n282#1:409\n282#1:411\n282#1:412\n282#1:410\n*E\n"})
        static final class c extends N implements Function1 {
            final Context e;
            final long f;
            final String g;
            final f h;

            c(Context context0, long v, String s, f f0) {
                this.e = context0;
                this.f = v;
                this.g = s;
                this.h = f0;
                super(1);
            }

            public final void a(com.dcinside.app.model.o o0) {
                L.o("해당 디시콘을 찾을 수 없습니다.", "getString(...)");
                List list0 = o0.c();
                if(list0 != null) {
                    com.dcinside.app.model.o.b o$b0 = (com.dcinside.app.model.o.b)list0.get(0);
                    if(o$b0 != null) {
                        String s = o$b0.g();
                        if(s == null) {
                            throw new com.dcinside.app.http.f("해당 디시콘을 찾을 수 없습니다.");
                        }
                        String s1 = o$b0.b();
                        if(s1 == null) {
                            throw new com.dcinside.app.http.f("해당 디시콘을 찾을 수 없습니다.");
                        }
                        List list1 = o0.b();
                        if(list1 == null) {
                            throw new com.dcinside.app.http.f("해당 디시콘을 찾을 수 없습니다.");
                        }
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object0: list1) {
                            String s2 = ((com.dcinside.app.model.o.a)object0).a();
                            if(s2 != null) {
                                arrayList0.add(s2);
                            }
                        }
                        com.dcinside.app.realm.f.i.a(this.f, s, s1, arrayList0.size(), new String[]{this.g});
                        this.h.T(this.f);
                        Dl.D(this.e, 0x7F15016B);  // string:block_dccon_item_success "해당 디시콘이 차단되었습니다."
                        return;
                    }
                }
                throw new com.dcinside.app.http.f("해당 디시콘을 찾을 수 없습니다.");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.o)object0));
                return S0.a;
            }
        }

        com.dcinside.app.realm.f.a f$a0 = com.dcinside.app.realm.f.i;
        if(f$a0.e(v)) {
            f$a0.a(v, "", "", 0, new String[]{s});
            this.T(v);
            Dl.D(context0, 0x7F15016B);  // string:block_dccon_item_success "해당 디시콘이 차단되었습니다."
            return;
        }
        o o0 = this.n;
        if(o0 != null) {
            o0.l();
        }
        this.n = uk.bk(String.valueOf(v)).y5((Object object0) -> {
            L.p(new c(context0, v, s, this), "$tmp0");
            new c(context0, v, s, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(context0, "$context");
            Dl.G(context0, throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void N(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void O(Context context0, Throwable throwable0) [...]

    private final void P(Context context0, long v) {
        @s0({"SMAP\nReplyMoreAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreAdapter.kt\ncom/dcinside/app/read/reply/more/ReplyMoreAdapter$blockDcconGroup$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,399:1\n1611#2,9:400\n1863#2:409\n1864#2:411\n1620#2:412\n1#3:410\n37#4,2:413\n*S KotlinDebug\n*F\n+ 1 ReplyMoreAdapter.kt\ncom/dcinside/app/read/reply/more/ReplyMoreAdapter$blockDcconGroup$1\n*L\n301#1:400,9\n301#1:409\n301#1:411\n301#1:412\n301#1:410\n303#1:413,2\n*E\n"})
        static final class d extends N implements Function1 {
            final Context e;
            final long f;
            final f g;

            d(Context context0, long v, f f0) {
                this.e = context0;
                this.f = v;
                this.g = f0;
                super(1);
            }

            public final void a(com.dcinside.app.model.o o0) {
                L.o("해당 디시콘을 찾을 수 없습니다.", "getString(...)");
                List list0 = o0.c();
                if(list0 != null) {
                    com.dcinside.app.model.o.b o$b0 = (com.dcinside.app.model.o.b)list0.get(0);
                    if(o$b0 != null) {
                        String s = o$b0.g();
                        if(s == null) {
                            throw new com.dcinside.app.http.f("해당 디시콘을 찾을 수 없습니다.");
                        }
                        String s1 = o$b0.b();
                        if(s1 == null) {
                            throw new com.dcinside.app.http.f("해당 디시콘을 찾을 수 없습니다.");
                        }
                        List list1 = o0.b();
                        if(list1 == null) {
                            throw new com.dcinside.app.http.f("해당 디시콘을 찾을 수 없습니다.");
                        }
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object0: list1) {
                            String s2 = ((com.dcinside.app.model.o.a)object0).a();
                            if(s2 != null) {
                                arrayList0.add(s2);
                            }
                        }
                        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
                        Object[] arr_object = Arrays.copyOf(arr_s, arr_s.length);
                        com.dcinside.app.realm.f.i.a(this.f, s, s1, arrayList0.size(), ((String[])arr_object));
                        this.g.T(this.f);
                        Dl.D(this.e, 0x7F150169);  // string:block_dccon_group_success "해당 디시콘 그룹이 차단되었습니다."
                        return;
                    }
                }
                throw new com.dcinside.app.http.f("해당 디시콘을 찾을 수 없습니다.");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.model.o)object0));
                return S0.a;
            }
        }

        o o0 = this.n;
        if(o0 != null) {
            o0.l();
        }
        this.n = uk.bk(String.valueOf(v)).y5((Object object0) -> {
            L.p(new d(context0, v, this), "$tmp0");
            new d(context0, v, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(context0, "$context");
            Dl.G(context0, throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void Q(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void R(Context context0, Throwable throwable0) [...]

    private final int S(int v) {
        int v1 = 0;
        for(Object object0: this.a) {
            if(((b)object0).f() != v) {
                ++v1;
                continue;
            }
            return v1;
        }
        return -1;
    }

    private final void T(long v) {
        Integer integer0 = this.S(10000106);
        if(integer0.intValue() <= -1) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v1 = (int)integer0;
            b f$b0 = (b)this.a.get(v1);
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                if(((Number)f$b0.e().D().f()).longValue() == v) {
                    this.b = com.dcinside.app.realm.f.i.c(f00, v);
                }
                if(((Number)f$b0.e().N().f()).longValue() == v) {
                    this.c = com.dcinside.app.realm.f.i.c(f00, v);
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                kotlin.io.c.a(f00, throwable0);
                throw throwable1;
            }
        label_18:
            kotlin.io.c.a(f00, null);
            A3.a a0 = this.m;
            if(a0 != null) {
                a0.invoke();
            }
            this.notifyItemChanged(v1);
        }
    }

    private final void U(Context context0, String s, String s1, String s2) {
        Integer integer1;
        T0 t01;
        boolean z;
        T0 t00;
        Integer integer0;
        F0 f00 = F0.g4();
        try {
            integer0 = null;
            L.m(f00);
            if(!f00.E0()) {
                f00.beginTransaction();
                goto label_5;
            }
            goto label_29;
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable0;
        }
        try {
        label_5:
            e e0 = e.k.c(f00, s1);
            if(e0 != null) {
                switch(s) {
                    case "block_id": {
                        t00 = e0.U5();
                        goto label_14;
                    }
                    case "block_ip": {
                        t00 = e0.V5();
                        goto label_14;
                    }
                    case "block_name": {
                        t00 = e0.W5();
                    label_14:
                        if(t00.contains(s2)) {
                            t00.remove(s2);
                            z = false;
                        }
                        else {
                            t00.add(s2);
                            e0.a6(true);
                            z = true;
                        }
                        break;
                    }
                    default: {
                        z = false;
                        break;
                    }
                }
                f00.p();
                goto label_51;
            }
            goto label_27;
        }
        catch(Throwable throwable1) {
        }
        try {
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable0;
        }
    label_27:
        kotlin.io.c.a(f00, null);
        return;
        try {
        label_29:
            e e1 = e.k.c(f00, s1);
            if(e1 != null) {
                switch(s) {
                    case "block_id": {
                        t01 = e1.U5();
                        goto label_38;
                    }
                    case "block_ip": {
                        t01 = e1.V5();
                        goto label_38;
                    }
                    case "block_name": {
                        t01 = e1.W5();
                    label_38:
                        if(t01.contains(s2)) {
                            t01.remove(s2);
                            z = false;
                        }
                        else {
                            t01.add(s2);
                            e1.a6(true);
                            z = true;
                        }
                        goto label_51;
                    }
                    default: {
                        z = false;
                        goto label_51;
                    }
                }
            }
            goto label_76;
        }
        catch(Throwable throwable2) {
        }
        try {
            throw throwable2;
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable0;
        }
    label_51:
        kotlin.io.c.a(f00, null);
        switch(s) {
            case "block_id": {
                integer1 = (int)(z ? 0x7F150170 : 0x7F150B21);  // string:block_id "차단 완료 - 식별 코드 \'%1$s\'"
                break;
            }
            case "block_ip": {
                integer1 = (int)(z ? 0x7F150176 : 0x7F150B23);  // string:block_ip "차단 완료 - IP \'%1$s\'"
                break;
            }
            case "block_name": {
                integer1 = (int)(z ? 0x7F15017D : 0x7F150B25);  // string:block_nickname "차단 완료 - 닉네임 \'%1$s\'"
                break;
            }
            default: {
                integer1 = null;
            }
        }
        if(integer1 != null) {
            String s3 = context0.getString(((int)integer1), new Object[]{s2});
            L.o(s3, "getString(...)");
            Dl.G(context0, s3);
        }
        Integer integer2 = this.S(10000106);
        if(integer2.intValue() > -1) {
            integer0 = integer2;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            b f$b0 = (b)this.a.get(v);
            this.a0(BlockState.d.a("", "", "", ""), BlockState.d.a("", "", "", ""));
            A3.a a0 = this.m;
            if(a0 != null) {
                a0.invoke();
            }
            this.notifyItemChanged(v);
        }
        return;
    label_76:
        kotlin.io.c.a(f00, null);
    }

    private final void V(Context context0, String s, long v, boolean z) {
        if((z ? this.b : this.c) != null && com.dcinside.app.realm.f.i.f(s)) {
            this.k0(context0, s, v);
            return;
        }
        this.L(context0, s, v);
    }

    static void W(f f0, Context context0, String s, long v, boolean z, int v1, Object object0) {
        f0.V(context0, s, v, ((v1 & 8) == 0 ? z : true));
    }

    private final void X(Context context0, long v, boolean z) {
        com.dcinside.app.realm.f f0 = z ? this.b : this.c;
        if(f0 != null && f0.Q5().size() >= f0.U5()) {
            this.l0(context0, v);
            return;
        }
        this.P(context0, v);
    }

    static void Y(f f0, Context context0, long v, boolean z, int v1, Object object0) {
        if((v1 & 4) != 0) {
            z = true;
        }
        f0.X(context0, v, z);
    }

    public final void Z(@m com.dcinside.app.realm.f f0, @m com.dcinside.app.realm.f f1) {
        this.b = f0;
        this.c = f1;
    }

    public final void a0(@l BlockState blockState0, @l BlockState blockState1) {
        L.p(blockState0, "blockState");
        L.p(blockState1, "allBlockState");
        this.d = blockState0;
        this.e = blockState1;
    }

    public final void b0(@l ReplyMoreItem replyMoreItem0) {
        L.p(replyMoreItem0, "item");
        this.a.add(new b(10000103, replyMoreItem0));
        this.a.add(new b(replyMoreItem0.O(), replyMoreItem0));
        this.a.add(new b(10000104, replyMoreItem0));
        if(replyMoreItem0.O() == 10000004 || replyMoreItem0.O() == 10000022) {
            this.a.add(new b(10000106, replyMoreItem0));
        }
        if(replyMoreItem0.B() || replyMoreItem0.L().m()) {
            this.a.add(new b(10000107, replyMoreItem0));
        }
        this.notifyItemRangeInserted(0, this.getItemCount());
    }

    public final void c0(@l A3.a a0) {
        L.p(a0, "onClick");
        this.m = a0;
    }

    public final void d0(@l A3.a a0) {
        L.p(a0, "onClick");
        this.h = a0;
    }

    public final void e0(@l A3.a a0) {
        L.p(a0, "onClick");
        this.k = a0;
    }

    public final void f0(@l A3.a a0) {
        L.p(a0, "onClick");
        this.f = a0;
    }

    public final void g0(@l A3.a a0) {
        L.p(a0, "onClick");
        this.l = a0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((b)this.a.get(v)).f();
    }

    public final void h0(@l A3.a a0) {
        L.p(a0, "onClick");
        this.j = a0;
    }

    public final void i0(@l A3.a a0) {
        L.p(a0, "onClick");
        this.g = a0;
    }

    public final void j0(@l A3.a a0) {
        L.p(a0, "onClick");
        this.i = a0;
    }

    private final void k0(Context context0, String s, long v) {
        com.dcinside.app.realm.f.i.g(s, v);
        this.T(v);
        Dl.D(context0, 0x7F150B20);  // string:unblock_dccon_item_success "디시콘 차단이 해제되었습니다."
    }

    private final void l0(Context context0, long v) {
        com.dcinside.app.realm.f.i.h(v);
        this.T(v);
        Dl.D(context0, 0x7F150B20);  // string:unblock_dccon_item_success "디시콘 차단이 해제되었습니다."
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        ReplyMoreItem replyMoreItem0 = ((b)this.a.get(v)).e();
        if(recyclerView$ViewHolder0 instanceof j) {
            ((j)recyclerView$ViewHolder0).h(replyMoreItem0);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.read.reply.more.holder.f) {
            ((com.dcinside.app.read.reply.more.holder.f)recyclerView$ViewHolder0).e("", replyMoreItem0.I());
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.read.reply.more.holder.e) {
            ((com.dcinside.app.read.reply.more.holder.e)recyclerView$ViewHolder0).h(((String)replyMoreItem0.D().e()), ((String)replyMoreItem0.N().e()), replyMoreItem0.I());
            return;
        }
        if(recyclerView$ViewHolder0 instanceof g) {
            ((g)recyclerView$ViewHolder0).e("", "", replyMoreItem0.P(), replyMoreItem0.I());
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.read.reply.more.holder.d) {
            ((com.dcinside.app.read.reply.more.holder.d)recyclerView$ViewHolder0).i(replyMoreItem0.O(), replyMoreItem0.X());
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.read.reply.more.holder.a) {
            ((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder0).e(replyMoreItem0, this.d, this.e, this.b, this.c);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.read.reply.more.holder.b) {
            ((com.dcinside.app.read.reply.more.holder.b)recyclerView$ViewHolder0).h(replyMoreItem0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$10", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.reply.more.f.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final String n;
            final String o;

            com.dcinside.app.read.reply.more.f.e(f f0, Context context0, String s, String s1, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = s;
                this.o = s1;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.reply.more.f.e(this.l, this.m, this.n, this.o, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                this.l.U(this.m, "block_ip", this.n, this.o);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$11", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.reply.more.f.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final String n;

            com.dcinside.app.read.reply.more.f.f(f f0, Context context0, String s, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = s;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.reply.more.f.f(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                this.l.U(this.m, "block_ip", "", this.n);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$12", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.reply.more.f.g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final String n;
            final String o;

            com.dcinside.app.read.reply.more.f.g(f f0, Context context0, String s, String s1, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = s;
                this.o = s1;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.reply.more.f.g(this.l, this.m, this.n, this.o, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                this.l.U(this.m, "block_id", this.n, this.o);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$13", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final String n;

            h(f f0, Context context0, String s, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = s;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                this.l.U(this.m, "block_id", "", this.n);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$14", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final V n;

            i(f f0, Context context0, V v0, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new i(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                f.W(this.l, this.m, ((String)this.n.e()), ((Number)this.n.f()).longValue(), false, 8, null);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$15", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.reply.more.f.j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final V n;

            com.dcinside.app.read.reply.more.f.j(f f0, Context context0, V v0, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.reply.more.f.j(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                f.Y(this.l, this.m, ((Number)this.n.f()).longValue(), false, 4, null);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$16", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final V n;

            k(f f0, Context context0, V v0, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new k(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                f.W(this.l, this.m, ((String)this.n.e()), ((Number)this.n.f()).longValue(), false, 8, null);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$17", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.reply.more.f.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final V n;

            com.dcinside.app.read.reply.more.f.l(f f0, Context context0, V v0, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.reply.more.f.l(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                f.Y(this.l, this.m, ((Number)this.n.f()).longValue(), false, 4, null);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$18", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.reply.more.f.m extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final V n;

            com.dcinside.app.read.reply.more.f.m(f f0, Context context0, V v0, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.reply.more.f.m(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                this.l.V(this.m, ((String)this.n.e()), ((Number)this.n.f()).longValue(), false);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$19", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final V n;

            n(f f0, Context context0, V v0, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = v0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new n(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                this.l.X(this.m, ((Number)this.n.f()).longValue(), false);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$1", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.reply.more.f.o extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;

            com.dcinside.app.read.reply.more.f.o(f f0, kotlin.coroutines.d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.reply.more.f.o(this.l, d0).invokeSuspend(S0.a);
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
                A3.a a0 = this.l.f;
                if(a0 != null) {
                    a0.invoke();
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$2", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.reply.more.f.p extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;

            com.dcinside.app.read.reply.more.f.p(f f0, kotlin.coroutines.d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.reply.more.f.p(this.l, d0).invokeSuspend(S0.a);
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
                A3.a a0 = this.l.g;
                if(a0 != null) {
                    a0.invoke();
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$3", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class q extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;

            q(f f0, kotlin.coroutines.d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new q(this.l, d0).invokeSuspend(S0.a);
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
                A3.a a0 = this.l.h;
                if(a0 != null) {
                    a0.invoke();
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$4", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class r extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;

            r(f f0, kotlin.coroutines.d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new r(this.l, d0).invokeSuspend(S0.a);
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
                A3.a a0 = this.l.i;
                if(a0 != null) {
                    a0.invoke();
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$5", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class s extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;

            s(f f0, kotlin.coroutines.d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new s(this.l, d0).invokeSuspend(S0.a);
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
                A3.a a0 = this.l.j;
                if(a0 != null) {
                    a0.invoke();
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$6", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class t extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;

            t(f f0, kotlin.coroutines.d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new t(this.l, d0).invokeSuspend(S0.a);
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
                A3.a a0 = this.l.k;
                if(a0 != null) {
                    a0.invoke();
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$7", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class u extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;

            u(f f0, kotlin.coroutines.d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new u(this.l, d0).invokeSuspend(S0.a);
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
                A3.a a0 = this.l.l;
                if(a0 != null) {
                    a0.invoke();
                }
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$8", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class v extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final String n;
            final String o;

            v(f f0, Context context0, String s, String s1, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = s;
                this.o = s1;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new v(this.l, this.m, this.n, this.o, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                this.l.U(this.m, "block_name", this.n, this.o);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.read.reply.more.ReplyMoreAdapter$onCreateViewHolder$9", f = "ReplyMoreAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.reply.more.f.w extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final f l;
            final Context m;
            final String n;

            com.dcinside.app.read.reply.more.f.w(f f0, Context context0, String s, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = context0;
                this.n = s;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.reply.more.f.w(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$ctx");
                this.l.U(this.m, "block_name", "", this.n);
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        Context context0 = viewGroup0.getContext();
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        if(v != 10000022) {
            switch(v) {
                case 10000004: {
                    break;
                }
                case 10000005: {
                    View view1 = layoutInflater0.inflate(0x7F0E026E, viewGroup0, false);  // layout:view_reply_more_reply_voice
                    L.m(view1);
                    return new g(view1, null);
                }
                case 10000006: {
                    View view2 = layoutInflater0.inflate(0x7F0E026E, viewGroup0, false);  // layout:view_reply_more_reply_voice
                    VideoEnabledWebView videoEnabledWebView0 = new VideoEnabledWebView(context0);
                    videoEnabledWebView0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    L.m(context0);
                    videoEnabledWebView0.setBackgroundColor(vk.b(context0, 0x1010054));
                    this.o = B.a.e(videoEnabledWebView0);
                    L.m(view2);
                    return new g(view2, videoEnabledWebView0);
                }
                case 10000007: {
                    View view3 = layoutInflater0.inflate(0x7F0E026D, viewGroup0, false);  // layout:view_reply_more_reply_text
                    L.m(view3);
                    return new com.dcinside.app.read.reply.more.holder.f(view3);
                }
                case 10000103: {
                    View view4 = layoutInflater0.inflate(0x7F0E026F, viewGroup0, false);  // layout:view_reply_more_user
                    L.m(view4);
                    ViewHolder recyclerView$ViewHolder0 = new j(view4);
                    com.dcinside.app.internal.r.M(((j)recyclerView$ViewHolder0).l(), null, new com.dcinside.app.read.reply.more.f.o(this, null), 1, null);
                    return recyclerView$ViewHolder0;
                }
                case 10000104: {
                    View view5 = layoutInflater0.inflate(0x7F0E026B, viewGroup0, false);  // layout:view_reply_more_name_search
                    L.m(view5);
                    ViewHolder recyclerView$ViewHolder1 = new com.dcinside.app.read.reply.more.holder.d(view5);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.d)recyclerView$ViewHolder1).f(), null, new com.dcinside.app.read.reply.more.f.p(this, null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.d)recyclerView$ViewHolder1).e(), null, new q(this, null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.d)recyclerView$ViewHolder1).h(), null, new r(this, null), 1, null);
                    return recyclerView$ViewHolder1;
                }
                case 10000105: {
                    View view6 = layoutInflater0.inflate(0x7F0E026A, viewGroup0, false);  // layout:view_reply_more_memo
                    L.m(view6);
                    ViewHolder recyclerView$ViewHolder2 = new com.dcinside.app.read.reply.more.holder.c(view6);
                    L.o(recyclerView$ViewHolder2.itemView, "itemView");
                    s f$s0 = new s(this, null);
                    com.dcinside.app.internal.r.M(recyclerView$ViewHolder2.itemView, null, f$s0, 1, null);
                    return recyclerView$ViewHolder2;
                }
                case 10000106: {
                    View view7 = layoutInflater0.inflate(0x7F0E0268, viewGroup0, false);  // layout:view_reply_more_block
                    L.m(view7);
                    ViewHolder recyclerView$ViewHolder3 = new com.dcinside.app.read.reply.more.holder.a(view7);
                    Context context1 = recyclerView$ViewHolder3.itemView.getContext();
                    ReplyMoreItem replyMoreItem0 = ((b)this.a.get(0)).e();
                    V v1 = replyMoreItem0.D();
                    V v2 = replyMoreItem0.N();
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).r(), null, new v(this, context1, "", "", null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).q(), null, new com.dcinside.app.read.reply.more.f.w(this, context1, "", null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).p(), null, new com.dcinside.app.read.reply.more.f.e(this, context1, "", "", null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).o(), null, new com.dcinside.app.read.reply.more.f.f(this, context1, "", null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).n(), null, new com.dcinside.app.read.reply.more.f.g(this, context1, "", "", null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).m(), null, new h(this, context1, "", null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).f(), null, new i(this, context1, v1, null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).h(), null, new com.dcinside.app.read.reply.more.f.j(this, context1, v1, null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).i(), null, new k(this, context1, v1, null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).j(), null, new com.dcinside.app.read.reply.more.f.l(this, context1, v1, null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).k(), null, new com.dcinside.app.read.reply.more.f.m(this, context1, v2, null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.a)recyclerView$ViewHolder3).l(), null, new n(this, context1, v2, null), 1, null);
                    return recyclerView$ViewHolder3;
                }
                case 10000107: {
                    View view8 = layoutInflater0.inflate(0x7F0E0269, viewGroup0, false);  // layout:view_reply_more_delete
                    L.m(view8);
                    ViewHolder recyclerView$ViewHolder4 = new com.dcinside.app.read.reply.more.holder.b(view8);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.b)recyclerView$ViewHolder4).f(), null, new t(this, null), 1, null);
                    com.dcinside.app.internal.r.M(((com.dcinside.app.read.reply.more.holder.b)recyclerView$ViewHolder4).e(), null, new u(this, null), 1, null);
                    return recyclerView$ViewHolder4;
                }
                default: {
                    View view0 = layoutInflater0.inflate(0x7F0E026D, viewGroup0, false);  // layout:view_reply_more_reply_text
                    L.m(view0);
                    return new com.dcinside.app.read.reply.more.holder.f(view0);
                }
            }
        }
        View view9 = layoutInflater0.inflate(0x7F0E026C, viewGroup0, false);  // layout:view_reply_more_reply_dccon
        L.m(view9);
        return new com.dcinside.app.read.reply.more.holder.e(view9);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView0);
        this.o = null;
        o o0 = this.n;
        if(o0 != null) {
            o0.l();
        }
    }
}

