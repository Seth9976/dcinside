package com.dcinside.app.post.fragments;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil.Callback;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.model.Q;
import com.dcinside.app.post.d1;
import com.dcinside.app.read.Q0;
import com.dcinside.app.read.f;
import com.dcinside.app.read.reply.more.ReplyMoreItem;
import com.dcinside.app.read.reply.more.ReplyPostInfo;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.j;
import com.dcinside.app.span.g;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Ck;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.DividerConstraintLayout;
import com.dcinside.app.view.ResizeTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nPostReadImageNoteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadImageNoteAdapter.kt\ncom/dcinside/app/post/fragments/PostReadImageNoteAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n147#2:260\n360#3,7:261\n739#3,9:276\n257#4,2:268\n257#4,2:270\n257#4,2:272\n257#4,2:274\n37#5,2:285\n1#6:287\n*S KotlinDebug\n*F\n+ 1 PostReadImageNoteAdapter.kt\ncom/dcinside/app/post/fragments/PostReadImageNoteAdapter\n*L\n38#1:260\n102#1:261,7\n197#1:276,9\n128#1:268,2\n133#1:270,2\n172#1:272,2\n178#1:274,2\n197#1:285,2\n*E\n"})
public final class d4 extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    final class b extends Callback {
        @l
        private final List a;
        @l
        private final List b;
        final d4 c;

        public b(@l List list0, @l List list1) {
            L.p(list0, "oldItem");
            L.p(list1, "newItem");
            this.c = d40;
            super();
            this.a = list0;
            this.b = list1;
        }

        @Override  // androidx.recyclerview.widget.DiffUtil$Callback
        public boolean a(int v, int v1) {
            return L.g(this.a.get(v), this.b.get(v1));
        }

        @Override  // androidx.recyclerview.widget.DiffUtil$Callback
        public boolean b(int v, int v1) {
            c d4$c0 = (c)this.a.get(v);
            c d4$c1 = (c)this.b.get(v1);
            return d4$c0.f() == d4$c1.f() && L.g(d4$c0.e(), d4$c1.e());
        }

        @Override  // androidx.recyclerview.widget.DiffUtil$Callback
        public int d() {
            return this.b.size();
        }

        @Override  // androidx.recyclerview.widget.DiffUtil$Callback
        public int e() {
            return this.a.size();
        }
    }

    public static final class c {
        private final int a;
        @m
        private final j b;

        public c(int v, @m j j0) {
            this.a = v;
            this.b = j0;
        }

        public c(int v, j j0, int v1, w w0) {
            if((v1 & 2) != 0) {
                j0 = null;
            }
            this(v, j0);
        }

        public final int a() {
            return this.a;
        }

        @m
        public final j b() {
            return this.b;
        }

        @l
        public final c c(int v, @m j j0) {
            return new c(v, j0);
        }

        public static c d(c d4$c0, int v, j j0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = d4$c0.a;
            }
            if((v1 & 2) != 0) {
                j0 = d4$c0.b;
            }
            return d4$c0.c(v, j0);
        }

        @m
        public final j e() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof c)) {
                return false;
            }
            return this.a == ((c)object0).a ? L.g(this.b, ((c)object0).b) : false;
        }

        public final int f() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = this.a * 0x1F;
            return this.b == null ? v : v + this.b.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "ImageNoteItem(type=" + this.a + ", item=" + this.b + ")";
        }
    }

    @l
    private final t a;
    @l
    private List b;
    @l
    public static final a c = null;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;

    static {
        d4.c = new a(null);
    }

    public d4(@l N3 n30) {
        L.p(n30, "readFragment");
        super();
        this.a = new t(n30);
        this.b = new ArrayList();
    }

    public final int A(int v) {
        int v1 = 0;
        for(Object object0: this.b) {
            j j0 = ((c)object0).e();
            if(j0 == null || j0.a0() != v) {
                ++v1;
                continue;
            }
            return v1;
        }
        return -1;
    }

    private final void B(com.dcinside.app.read.holder.l l0, int v) {
        CharSequence charSequence0;
        j j0 = ((c)this.b.get(v)).e();
        if(j0 == null) {
            return;
        }
        N3 n30 = (N3)this.a.a();
        if(n30 == null) {
            return;
        }
        DividerConstraintLayout dividerConstraintLayout0 = l0.o();
        Context context0 = dividerConstraintLayout0.getContext();
        int v1 = dividerConstraintLayout0.getChildCount();
        float f = j0.h0() ? 0.2f : 1.0f;
        int v2 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            View view0 = dividerConstraintLayout0.getChildAt(v3);
            if(view0 != null) {
                view0.setAlpha(f);
            }
        }
        l0.x().setText(j0.I());
        ResizeTextView resizeTextView0 = l0.t();
        if(resizeTextView0 != null) {
            if(j0.Q()) {
                charSequence0 = "차단된 댓글입니다.";
            }
            else {
                com.dcinside.app.response.j.a j$a0 = j0.H();
                charSequence0 = j$a0 == null ? null : j$a0.k();
            }
            if(m0.a.a.i(charSequence0)) {
                resizeTextView0.setVisibility(8);
            }
            else {
                resizeTextView0.setText(new SpannableStringBuilder(charSequence0));
                Ck.b().a(resizeTextView0);
                resizeTextView0.setVisibility(0);
            }
        }
        String s = j0.f0();
        String s1 = j0.R();
        if(s != null && s.length() != 0 || s1 == null || s1.length() == 0) {
            l0.r().setText(null);
        }
        else {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append('(');
            stringBuilder0.append(m0.a.a.m(s1, ".*"));
            stringBuilder0.append(')');
            l0.r().setText(stringBuilder0);
        }
        String s2 = j0.P();
        l0.w().setText(n30.d5().L(s, j0.X(), j0.S(), s2, s1, context0));
        Q q0 = n30.m5();
        String s3 = q0 == null ? null : q0.l1();
        if((m0.a.a.i(s3) || !m0.a.a.a(s, s3)) && !m0.a.a.d(s2, "owner")) {
            dividerConstraintLayout0.setBackgroundColor(0);
        }
        else {
            L.m(context0);
            dividerConstraintLayout0.setBackgroundColor(vk.b(context0, 0x7F040513));  // attr:replyNameBgHighlight
        }
        com.dcinside.app.type.t.c.e(j0, l0.s());
        ResizeTextView resizeTextView1 = l0.z();
        L.m(context0);
        Q q1 = n30.m5();
        CharSequence charSequence1 = g.A(context0, j0.R(), (q1 == null ? null : q1.G0()), s);
        if(charSequence1 == null || charSequence1.length() == 0) {
            resizeTextView1.setVisibility(8);
        }
        else {
            resizeTextView1.setText(charSequence1);
            resizeTextView1.setVisibility(0);
        }
        ImageView imageView0 = l0.y();
        if(!j0.i0()) {
            v2 = 8;
        }
        imageView0.setVisibility(v2);
    }

    private final void C(com.dcinside.app.read.holder.g g0, int v) {
        j j0 = ((c)this.b.get(v)).e();
        if(j0 == null) {
            return;
        }
        com.dcinside.app.response.j.a j$a0 = j0.H();
        g0.i().setText((j$a0 == null ? null : j$a0.k()));
        g0.k().setVisibility(8);
    }

    private final void D(d1 d10) {
        d10.h().setVisibility(8);
        d10.i().setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.p(d10, "$holder");
            N3 n30 = (N3)this.a.a();
            if(n30 == null) {
                return;
            }
            v4 v40 = n30.h5();
            if(v40 == null) {
                return;
            }
            v40.d0();
            d10.i().setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void E(d4 d40, d1 d10, View view0) [...]

    public final void F() {
        this.notifyDataSetChanged();
    }

    public final void G(@l List list0, boolean z) {
        L.p(list0, "list");
        ArrayList arrayList0 = new ArrayList();
        if(!list0.isEmpty() || z) {
            for(Object object0: list0) {
                arrayList0.add(new c((((j)object0).O() == null ? 1 : 2), ((j)object0)));
            }
        }
        else {
            arrayList0.add(new c(0, null, 2, null));
        }
        if(z) {
            arrayList0.add(new c(3, null, 2, null));
        }
        DiffResult diffUtil$DiffResult0 = DiffUtil.b(new b(this, this.b, arrayList0));
        L.o(diffUtil$DiffResult0, "calculateDiff(...)");
        this.b.clear();
        this.b.addAll(arrayList0);
        diffUtil$DiffResult0.e(this);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((c)this.b.get(v)).f();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        recyclerView$ViewHolder0.itemView.getContext();
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.read.holder.l) {
            this.B(((com.dcinside.app.read.holder.l)recyclerView$ViewHolder0), v);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.read.holder.g) {
            this.C(((com.dcinside.app.read.holder.g)recyclerView$ViewHolder0), v);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof d1) {
            this.D(((d1)recyclerView$ViewHolder0));
            return;
        }
        if(!(recyclerView$ViewHolder0 instanceof com.dcinside.app.totalsearch.holders.b) || this.getItemViewType(v) != 0) {
            return;
        }
        TextView textView0 = (TextView)recyclerView$ViewHolder0.itemView.findViewById(0x7F0B0FB0);  // id:total_search_empty
        textView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        textView0.setText("댓글이 없습니다.");
        textView0.setTextSize(15.0f);
        L.m(textView0);
        r.n0(textView0, 0x7F060134);  // color:lightGray
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 1: {
                View view2 = layoutInflater0.inflate(0x7F0E0265, viewGroup0, false);  // layout:view_reply_item_text
                L.o(view2, "inflate(...)");
                return new com.dcinside.app.read.holder.l(view2, null, 2, null);
            }
            case 2: {
                View view3 = layoutInflater0.inflate(0x7F0E0262, viewGroup0, false);  // layout:view_reply_item_deleted
                L.o(view3, "inflate(...)");
                return new com.dcinside.app.read.holder.g(view3);
            }
            default: {
                if(v != 3) {
                    View view0 = layoutInflater0.inflate(0x7F0E02A1, viewGroup0, false);  // layout:view_total_search_empty
                    L.o(view0, "inflate(...)");
                    return new com.dcinside.app.totalsearch.holders.b(view0);
                }
                View view1 = layoutInflater0.inflate(0x7F0E0276, viewGroup0, false);  // layout:view_search_more
                L.o(view1, "inflate(...)");
                return new d1(view1);
            }
        }
    }

    public final void w() {
        this.b.clear();
    }

    @l
    public final t x() {
        return this.a;
    }

    @m
    public final j y(int v) {
        c d4$c0 = (c)u.W2(this.b, v);
        return d4$c0 == null ? null : d4$c0.e();
    }

    @m
    public final ReplyMoreItem z(int v) {
        String s3;
        List list1;
        boolean z = true;
        int v1 = 0;
        j j0 = ((c)this.b.get(v)).e();
        CharSequence charSequence0 = null;
        if(j0 == null) {
            return null;
        }
        String s = j0.X();
        String s1 = s == null ? "" : s;
        List list0 = new kotlin.text.r("\\.").p((j0.R() == null ? "" : j0.R()), 0);
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                if(((String)listIterator0.previous()).length() == 0) {
                    continue;
                }
                list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                goto label_16;
            }
        }
        list1 = u.H();
    label_16:
        String[] arr_s = (String[])list1.toArray(new String[0]);
        if(arr_s.length < 2) {
            arr_s = null;
        }
        if(arr_s == null) {
            s3 = "";
        }
        else {
            String s2 = String.format("%s.%s", Arrays.copyOf(new Object[]{arr_s[0], arr_s[1]}, 2));
            L.o(s2, "format(...)");
            s3 = s2;
        }
        String s4 = j0.f0();
        String s5 = s4 == null ? "" : s4;
        N3 n30 = (N3)this.a.a();
        if(n30 != null) {
            Q q0 = n30.m5();
            if(q0 != null) {
                f f0 = f.e.c(q0, j0);
                if(q0.K0() || q0.F0() != com.dcinside.app.type.m.h && q0.F0() != com.dcinside.app.type.m.i) {
                    z = false;
                }
                else {
                    String s6 = B.E.k0();
                    if(!Q.n0.b(q0, s6)) {
                        z = false;
                    }
                }
                ReplyPostInfo replyPostInfo0 = ReplyPostInfo.h.a(q0, z);
                com.dcinside.app.response.j.a j$a0 = j0.H();
                if(j$a0 != null) {
                    charSequence0 = j$a0.k();
                }
                String s7 = String.valueOf(charSequence0);
                int v2 = Al.a.x(s7, new String[]{"1757089730845"});
                if(j$a0 != null) {
                    v1 = j$a0.l();
                }
                boolean z1 = j0.i0();
                String s8 = j0.S();
                String s9 = s8 == null ? "" : s8;
                int v3 = j0.U();
                String s10 = j0.T() == null ? "" : j0.T();
                boolean z2 = f0.e();
                String s11 = j0.P();
                return s11 == null ? new ReplyMoreItem(v, v1, replyPostInfo0, s1, s3, s5, z1, s9, v3, s10, s7, null, null, null, z2, v2, "", null, null, Q0.e, 0x63800, null) : new ReplyMoreItem(v, v1, replyPostInfo0, s1, s3, s5, z1, s9, v3, s10, s7, null, null, null, z2, v2, s11, null, null, Q0.e, 0x63800, null);
            }
        }
        return null;
    }
}

