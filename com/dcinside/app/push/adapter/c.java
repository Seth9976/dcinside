package com.dcinside.app.push.adapter;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.post.d1;
import com.dcinside.app.push.B0;
import com.dcinside.app.push.j;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import h0.d;
import h0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nNoticePushAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticePushAdapter.kt\ncom/dcinside/app/push/adapter/NoticePushAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n1#1,494:1\n1872#2,3:495\n230#2,2:499\n13346#3:498\n13347#3:501\n78#4,4:502\n78#4,4:506\n*S KotlinDebug\n*F\n+ 1 NoticePushAdapter.kt\ncom/dcinside/app/push/adapter/NoticePushAdapter\n*L\n404#1:495,3\n414#1:499,2\n413#1:498\n413#1:501\n452#1:502,4\n483#1:506,4\n*E\n"})
public final class c extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[g0.c.values().length];
            try {
                arr_v[g0.c.i.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g0.c.k.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g0.c.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g0.c.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g0.c.g.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g0.c.e.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g0.c.l.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g0.c.f.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    private final boolean a;
    @m
    private final j b;
    private boolean c;
    @l
    private final SparseBooleanArray d;
    @l
    private ArrayList e;
    private boolean f;
    @l
    public static final a g = null;
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;

    static {
        c.g = new a(null);
    }

    public c(boolean z, @m j j0) {
        this.a = z;
        this.b = j0;
        this.d = new SparseBooleanArray();
        this.e = new ArrayList();
    }

    private final void A(f f0, int v) {
        Object object0 = this.e.get(v);
        L.o(object0, "get(...)");
        String s = ((g0.d.a)object0).a();
        g0.c c0 = g0.c.d.a(s);
        if(c0 != g0.c.j) {
            f0.r().setText(c0.d());
        }
        this.B(f0, c0);
        this.z(((g0.d.a)object0), f0, c0, v);
        String s1 = ((g0.d.a)object0).g();
        String s2 = ((g0.d.a)object0).q();
        int v1 = 8;
        if(s1 == null || s1.length() <= 0) {
            f0.k().setVisibility(8);
        }
        else {
            f0.k().setVisibility(0);
        }
        if(s2 == null || s2.length() <= 0) {
            f0.j().setVisibility(8);
        }
        else {
            f0.j().setVisibility(0);
        }
        f0.l().setText(((g0.d.a)object0).g());
        f0.o().setText(s2);
        TextView textView0 = f0.i();
        String s3 = ((g0.d.a)object0).e();
        if(s3 == null) {
            s3 = "";
        }
        textView0.setText(Bk.k(s3));
        if(v == this.e.size() - 1) {
            v1 = 0;
        }
        f0.n().setVisibility(v1);
        f0.h().setVisibility(v1);
    }

    private final void B(f f0, g0.c c0) {
        switch(c0) {
            case 1: 
            case 2: {
                f0.m().setVisibility(0);
                f0.p().setVisibility(8);
                f0.q().setVisibility(8);
                f0.v().setVisibility(8);
                f0.u().setVisibility(8);
                f0.t().setVisibility(8);
                f0.s().setVisibility(8);
                f0.r().setVisibility(0);
                return;
            }
            case 3: {
                f0.m().setVisibility(8);
                f0.p().setVisibility(0);
                f0.q().setVisibility(8);
                f0.v().setVisibility(8);
                f0.u().setVisibility(8);
                f0.t().setVisibility(8);
                f0.s().setVisibility(8);
                f0.r().setVisibility(0);
                return;
            }
            case 4: {
                f0.m().setVisibility(8);
                f0.p().setVisibility(0);
                f0.q().setVisibility(8);
                f0.v().setVisibility(8);
                f0.u().setVisibility(8);
                f0.t().setVisibility(8);
                f0.s().setVisibility(0);
                f0.r().setVisibility(4);
                return;
            }
            case 5: {
                f0.m().setVisibility(8);
                f0.p().setVisibility(8);
                f0.q().setVisibility(0);
                f0.v().setVisibility(0);
                f0.u().setVisibility(0);
                f0.t().setVisibility(0);
                f0.s().setVisibility(8);
                f0.r().setVisibility(0);
                return;
            }
            case 6: {
                f0.m().setVisibility(8);
                f0.q().setVisibility(0);
                f0.v().setVisibility(0);
                f0.u().setVisibility(0);
                f0.t().setVisibility(0);
                f0.s().setVisibility(8);
                f0.r().setVisibility(0);
                return;
            }
            case 7: {
                f0.m().setVisibility(8);
                f0.p().setVisibility(8);
                f0.q().setVisibility(0);
                f0.v().setVisibility(8);
                f0.u().setVisibility(8);
                f0.t().setVisibility(8);
                f0.s().setVisibility(8);
                f0.r().setVisibility(0);
                return;
            }
            case 8: {
                f0.m().setVisibility(8);
                f0.q().setVisibility(0);
                f0.v().setVisibility(0);
                f0.u().setVisibility(0);
                f0.t().setVisibility(0);
                f0.s().setVisibility(8);
                f0.r().setVisibility(0);
            }
        }
    }

    public final void C() {
        this.e.clear();
        this.notifyDataSetChanged();
    }

    public final void D() {
        this.d.clear();
        this.notifyDataSetChanged();
        V v0 = this.G();
        j j0 = this.b;
        if(j0 != null) {
            j0.Q(((Boolean)v0.e()).booleanValue(), ((Boolean)v0.f()).booleanValue());
        }
    }

    public final void E(@l String[] arr_s) {
        L.p(arr_s, "messages");
        int v = 0;
        while(v < arr_s.length) {
            String s = arr_s[v];
            Iterator iterator0 = this.e.iterator();
        label_5:
            if(!iterator0.hasNext()) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            Object object0 = iterator0.next();
            g0.d.a d$a0 = (g0.d.a)object0;
            if(L.g(d$a0.h(), s)) {
                this.e.remove(d$a0);
                ++v;
                continue;
            }
            goto label_5;
        }
        this.notifyDataSetChanged();
    }

    private final String F(String s) {
        if(s != null) {
            String s1 = v.l2(s, "추천 수", "", false, 4, null);
            if(s1 != null) {
                String s2 = v.G5(s1).toString();
                return s2 == null ? "" : s2;
            }
        }
        return "";
    }

    private final V G() {
        SparseBooleanArray sparseBooleanArray0 = this.d;
        int v = sparseBooleanArray0.size();
        boolean z = false;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            sparseBooleanArray0.keyAt(v1);
            if(sparseBooleanArray0.valueAt(v1)) {
                ++v2;
            }
        }
        Boolean boolean0 = Boolean.valueOf(v2 > 0);
        if(v2 == this.e.size()) {
            z = true;
        }
        return r0.a(boolean0, Boolean.valueOf(z));
    }

    private final String H(Context context0, String s) {
        int v;
        if(L.g(s, "R")) {
            v = 0x7F1506F8;  // string:new_reply_push "\' 새 댓글"
        }
        else if(L.g(s, "RR")) {
            v = 0x7F1506F9;  // string:new_reply_response_push "\' 새 답글"
        }
        else {
            return "";
        }
        String s1 = context0.getString(v);
        L.o(s1, "getString(...)");
        return s1;
    }

    @l
    public final List I() {
        List list0 = new ArrayList();
        SparseBooleanArray sparseBooleanArray0 = this.d;
        int v = sparseBooleanArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseBooleanArray0.keyAt(v1);
            if(sparseBooleanArray0.valueAt(v1)) {
                String s = ((g0.d.a)this.e.get(v2)).h();
                if(s == null) {
                    s = "";
                }
                ((ArrayList)list0).add(s);
            }
        }
        return list0;
    }

    public final boolean J() {
        return this.c;
    }

    public final void K(int v, boolean z) {
        this.d.put(v, z);
        V v1 = this.G();
        j j0 = this.b;
        if(j0 != null) {
            j0.Q(((Boolean)v1.e()).booleanValue(), ((Boolean)v1.f()).booleanValue());
        }
    }

    private final ViewHolder L(ViewGroup viewGroup0) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0276, viewGroup0, false);  // layout:view_search_more
        L.m(view0);
        ViewHolder recyclerView$ViewHolder0 = new d1(view0);
        ((d1)recyclerView$ViewHolder0).e().setVisibility(4);
        return recyclerView$ViewHolder0;
    }

    private final void N(Context context0, g0.d.a d$a0) {
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        String s = d$a0.f();
        if(s == null) {
            s = "";
        }
        String s1 = d$a0.k();
        new com.dcinside.app.util.Xk.a(s, (s1 == null ? 0 : Integer.parseInt(s1)), d$a0.l(), null, false, false, false, false, false, false, null, false, null, null, 0x35F8, null).a(appCompatActivity0);
    }

    private final String O(g0.c c0, String s) {
        switch(c0) {
            case 1: {
                return s == null ? null : v.l2(s, "키워드 : ", "", false, 4, null);
            }
            case 5: {
                return s == null ? null : v.l2(s, "관심글 : ", "", false, 4, null);
            }
            default: {
                return s;
            }
        }
    }

    private final String P(String s, String s1) {
        if(s1 != null) {
            String s2 = v.l2(s1, "[" + s + "]", "", false, 4, null);
            if(s2 != null) {
                String s3 = v.G5(s2).toString();
                return s3 == null ? "" : s3;
            }
        }
        return "";
    }

    public final void Q() {
        int v = 0;
        for(Object object0: this.e) {
            if(v < 0) {
                u.Z();
            }
            g0.d.a d$a0 = (g0.d.a)object0;
            this.d.put(v, true);
            ++v;
        }
        V v1 = this.G();
        j j0 = this.b;
        if(j0 != null) {
            j0.Q(((Boolean)v1.e()).booleanValue(), ((Boolean)v1.f()).booleanValue());
        }
        this.notifyDataSetChanged();
    }

    public final void R(boolean z) {
        this.c = z;
    }

    public final void S(@l List list0) {
        L.p(list0, "list");
        List list1 = u.V5(this.e);
        this.e.clear();
        this.e.addAll(list0);
        DiffResult diffUtil$DiffResult0 = DiffUtil.b(new B0(list0, list1));
        L.o(diffUtil$DiffResult0, "calculateDiff(...)");
        diffUtil$DiffResult0.e(this);
    }

    private final void T(int v, View view0, TextView textView0, String s) {
        if(v > 0 && L.g(s, "R")) {
            view0.setVisibility(0);
            textView0.setVisibility(0);
            textView0.setText(String.valueOf(v));
            return;
        }
        view0.setVisibility(4);
        textView0.setVisibility(4);
    }

    public final void U(boolean z, @m RecyclerView recyclerView0, boolean z1) {
        if(z1) {
            return;
        }
        if(recyclerView0 == null) {
            return;
        }
        this.f = z;
        ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(this.e.size());
        d1 d10 = recyclerView$ViewHolder0 instanceof d1 ? ((d1)recyclerView$ViewHolder0) : null;
        if(d10 == null) {
            return;
        }
        d10.h().setVisibility((z ? 0 : 4));
    }

    private final void V() {
        Object object0 = this.e.remove(this.e.size() - 1);
        L.o(object0, "removeAt(...)");
        g0.d.a d$a0 = new g0.d.a();
        d$a0.A(((g0.d.a)object0).h());
        d$a0.H(((g0.d.a)object0).o());
        d$a0.C(((g0.d.a)object0).j());
        d$a0.y(((g0.d.a)object0).f());
        d$a0.D(((g0.d.a)object0).k());
        d$a0.v(((g0.d.a)object0).c());
        d$a0.J(((g0.d.a)object0).q());
        d$a0.s(((g0.d.a)object0).a());
        d$a0.z(((g0.d.a)object0).g());
        d$a0.w(((g0.d.a)object0).d());
        d$a0.x(((g0.d.a)object0).e());
        d$a0.F(((g0.d.a)object0).m());
        d$a0.G(((g0.d.a)object0).n());
        d$a0.I(((g0.d.a)object0).p());
        this.e.add(d$a0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.e.size() + 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return v >= this.e.size() ? 2 : !this.a;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof d) {
            this.y(((d)recyclerView$ViewHolder0), v);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof f) {
            this.A(((f)recyclerView$ViewHolder0), v);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof d1) {
            ((d1)recyclerView$ViewHolder0).h().setVisibility((this.f ? 0 : 4));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        switch(v) {
            case 0: {
                View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E021A, viewGroup0, false);  // layout:view_my_active_post_item
                L.m(view1);
                return new d(view1);
            }
            case 1: {
                View view2 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E021D, viewGroup0, false);  // layout:view_new_post_item
                L.m(view2);
                return new f(view2);
            }
            case 2: {
                return this.L(viewGroup0);
            }
            default: {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E021A, viewGroup0, false);  // layout:view_my_active_post_item
                L.m(view0);
                return new d(view0);
            }
        }
    }

    public final void w(@l List list0) {
        L.p(list0, "list");
        List list1 = u.V5(this.e);
        this.V();
        this.e.addAll(list0);
        DiffResult diffUtil$DiffResult0 = DiffUtil.b(new B0(this.e, list1));
        L.o(diffUtil$DiffResult0, "calculateDiff(...)");
        diffUtil$DiffResult0.e(this);
    }

    private final void x(d d0, g0.d.a d$a0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.adapter.NoticePushAdapter$applyClickListener$1", f = "NoticePushAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.adapter.c.c extends o implements p {
            int k;
            final c l;
            final d m;
            final Context n;
            final g0.d.a o;

            com.dcinside.app.push.adapter.c.c(c c0, d d0, Context context0, g0.d.a d$a0, kotlin.coroutines.d d1) {
                this.l = c0;
                this.m = d0;
                this.n = context0;
                this.o = d$a0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.adapter.c.c(this.l, this.m, this.n, this.o, d0).invokeSuspend(S0.a);
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
                if(this.l.J()) {
                    this.m.f().setChecked(!this.m.f().isChecked());
                    return S0.a;
                }
                L.o(this.n, "$context");
                this.l.N(this.n, this.o);
                return S0.a;
            }
        }

        Context context0 = d0.itemView.getContext();
        L.o(d0.itemView, "itemView");
        com.dcinside.app.push.adapter.c.c c$c0 = new com.dcinside.app.push.adapter.c.c(this, d0, context0, d$a0, null);
        r.M(d0.itemView, null, c$c0, 1, null);
    }

    private final void y(d d0, int v) {
        String s;
        Context context0 = d0.itemView.getContext();
        Object object0 = this.e.get(v);
        L.o(object0, "get(...)");
        TextView textView0 = d0.s();
        if(((g0.d.a)object0).r()) {
            s = "\'차단된 사용자";
        }
        else {
            String s1 = ((g0.d.a)object0).o();
            s = s1 == null || s1.length() <= 0 ? null : context0.getString(0x7F1506F6, new Object[]{Dl.M(((g0.d.a)object0).o())});  // string:new_post_reply_text "\'%s"
        }
        textView0.setText(s);
        String s2 = ((g0.d.a)object0).a();
        if(g0.c.d.a(s2) == g0.c.f) {
            d0.r().setVisibility(8);
            d0.p().setVisibility(0);
            d0.o().setText(this.F(((g0.d.a)object0).o()));
        }
        else {
            d0.r().setVisibility(0);
            d0.p().setVisibility(8);
        }
        L.m(context0);
        d0.v().setText(this.H(context0, ((g0.d.a)object0).m()));
        Integer integer0 = ((g0.d.a)object0).d();
        this.T((integer0 == null ? 0 : ((int)integer0)), d0.u(), d0.t(), ((g0.d.a)object0).m());
        String s3 = Dl.M(((g0.d.a)object0).g());
        String s4 = Dl.M(((g0.d.a)object0).q());
        if(s3 == null || s3.length() <= 0) {
            d0.l().setVisibility(8);
        }
        else {
            d0.l().setVisibility(0);
        }
        if(s4 == null || s4.length() <= 0) {
            d0.k().setVisibility(8);
        }
        else {
            d0.k().setVisibility(0);
        }
        d0.m().setText(s3);
        d0.q().setText(s4);
        TextView textView1 = d0.j();
        String s5 = ((g0.d.a)object0).e();
        if(s5 == null) {
            s5 = "";
        }
        textView1.setText(Bk.k(s5));
        d0.i().setText(Dl.M(((g0.d.a)object0).j()));
        int v1 = v == this.e.size() - 1 ? 0 : 8;
        d0.n().setVisibility(v1);
        d0.h().setVisibility(v1);
        if(this.c) {
            d0.f().setVisibility(0);
            d0.f().setChecked(this.d.get(v));
        }
        else {
            d0.f().setVisibility(8);
        }
        this.x(d0, ((g0.d.a)object0));
    }

    private final void z(g0.d.a d$a0, f f0, g0.c c0, int v) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.adapter.NoticePushAdapter$bindContents$3", f = "NoticePushAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.adapter.c.d extends o implements p {
            int k;
            final c l;
            final f m;
            final Context n;
            final g0.d.a o;

            com.dcinside.app.push.adapter.c.d(c c0, f f0, Context context0, g0.d.a d$a0, kotlin.coroutines.d d0) {
                this.l = c0;
                this.m = f0;
                this.n = context0;
                this.o = d$a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.adapter.c.d(this.l, this.m, this.n, this.o, d0).invokeSuspend(S0.a);
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
                if(this.l.J()) {
                    boolean z = this.m.f().isChecked();
                    this.m.f().setChecked(!z);
                    return S0.a;
                }
                L.o(this.n, "$context");
                this.l.N(this.n, this.o);
                return S0.a;
            }
        }

        Context context0 = f0.itemView.getContext();
        String s = "";
        switch(c0) {
            case 1: {
                String s5 = this.O(c0, Dl.M(d$a0.o()));
                if(s5 != null) {
                    s = s5;
                }
                String s6 = Dl.M(this.P(d$a0.g(), d$a0.j()));
                SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder();
                spannableStringBuilder1.append(s);
                spannableStringBuilder1.setSpan(new StyleSpan(1), 0, spannableStringBuilder1.length(), 0);
                spannableStringBuilder1.append(' ');
                spannableStringBuilder1.append(s6);
                f0.m().setText(spannableStringBuilder1);
                break;
            }
            case 2: {
                String s2 = d$a0.p();
                if(s2 != null) {
                    String s3 = com.dcinside.app.internal.l.h(s2, 8, null, 2, null);
                    if(s3 != null) {
                        s = s3;
                    }
                }
                String s4 = Dl.M(d$a0.j());
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
                spannableStringBuilder0.append(s);
                spannableStringBuilder0.setSpan(new StyleSpan(1), 0, spannableStringBuilder0.length(), 0);
                spannableStringBuilder0.append(' ');
                spannableStringBuilder0.append(s4);
                f0.m().setText(spannableStringBuilder0);
                break;
            }
            case 3: 
            case 4: {
                f0.p().setText(Dl.M(d$a0.j()));
                break;
            }
            case 5: {
                String s1 = d$a0.j();
                f0.q().setText((s1 == null || s1.length() <= 0 ? null : context0.getString(0x7F1506F6, new Object[]{Dl.M(d$a0.j())})));  // string:new_post_reply_text "\'%s"
                L.m(context0);
                f0.v().setText(this.H(context0, d$a0.m()));
                Integer integer0 = d$a0.d();
                this.T((integer0 == null ? 0 : ((int)integer0)), f0.u(), f0.t(), d$a0.m());
                break;
            }
            default: {
                f0.m().setText(this.O(c0, d$a0.j()));
                f0.q().setText(this.P(d$a0.g(), d$a0.o()));
            }
        }
        L.o(f0.itemView, "itemView");
        com.dcinside.app.push.adapter.c.d c$d0 = new com.dcinside.app.push.adapter.c.d(this, f0, context0, d$a0, null);
        r.M(f0.itemView, null, c$d0, 1, null);
        if(this.c) {
            f0.f().setVisibility(0);
            f0.f().setChecked(this.d.get(v));
            return;
        }
        f0.f().setVisibility(8);
    }
}

