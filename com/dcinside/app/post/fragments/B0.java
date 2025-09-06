package com.dcinside.app.post.fragments;

import A3.p;
import Q.c;
import Q.d;
import Z.f;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.image.s;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.K;
import com.dcinside.app.post.a;
import com.dcinside.app.post.d1;
import com.dcinside.app.post.e;
import com.dcinside.app.post.o0;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.response.MustRead;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.response.PostItem;
import com.dcinside.app.response.i;
import com.dcinside.app.rx.bus.A;
import com.dcinside.app.span.g;
import com.dcinside.app.span.j;
import com.dcinside.app.type.t;
import com.dcinside.app.type.x;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.zk;
import com.dcinside.app.view.ResizeTextView;
import com.dcinside.app.wv.k;
import io.realm.F0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.D;
import kotlin.E;
import kotlin.V;
import kotlin.collections.u;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.o;
import timber.log.b;
import y4.l;
import y4.m;

@s0({"SMAP\nPostListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostListAdapter.kt\ncom/dcinside/app/post/fragments/PostListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,752:1\n1#2:753\n9#3:754\n1557#4:755\n1628#4,3:756\n774#4:759\n865#4,2:760\n*S KotlinDebug\n*F\n+ 1 PostListAdapter.kt\ncom/dcinside/app/post/fragments/PostListAdapter\n*L\n199#1:754\n644#1:755\n644#1:756,3\n644#1:759\n644#1:760,2\n*E\n"})
public final class b0 extends a implements f, U, v, com.dcinside.app.wv.f {
    @m
    private F0 f;
    @l
    private final k g;
    @m
    private e h;
    @m
    private PostHead i;
    @l
    private final Y0 j;
    @l
    private final WeakReference k;
    @m
    private GalleryInfo l;
    @l
    private c m;
    @l
    private final D n;
    private int o;
    @m
    private o p;
    private boolean q;
    @m
    private V r;
    @l
    private ItemTouchHelper s;
    private boolean t;
    @l
    private Integer[] u;
    @l
    private final Runnable v;

    public b0(@l Fragment fragment0, @l com.dcinside.app.type.o o0) {
        static final class com.dcinside.app.post.fragments.b0.e extends N implements A3.a {
            final b0 e;

            com.dcinside.app.post.fragments.b0.e(b0 b00) {
                this.e = b00;
                super(0);
            }

            @l
            public final u1 b() {
                u1 u10 = new u1();
                u10.d(this.e);
                return u10;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(fragment0, "fragment");
        L.p(o0, "galleryMode");
        super();
        this.f = F0.g4();
        this.g = new k();
        this.h = new e();
        this.j = new Y0(o0 == com.dcinside.app.type.o.c);
        this.k = new WeakReference(fragment0);
        this.m = new c(false);
        this.n = E.a(new com.dcinside.app.post.fragments.b0.e(this));
        this.q = true;
        this.s = new ItemTouchHelper(new Z.e(this));
        Context context0 = fragment0.getContext();
        Integer integer0 = context0 == null ? null : vk.b(context0, 0x7F040500);  // attr:readSubjectColor0
        Context context1 = fragment0.getContext();
        Integer integer1 = context1 == null ? null : vk.b(context1, 0x7F040501);  // attr:readSubjectColor1
        Context context2 = fragment0.getContext();
        this.u = new Integer[]{integer0, integer1, null, (context2 == null ? null : vk.b(context2, 0x7F040502))};  // attr:readSubjectColor3
        this.v = () -> {
            int v4;
            L.p(this, "this$0");
            try {
                WeakReference weakReference0 = this.w();
                if(weakReference0 == null) {
                    return;
                }
                RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
                if(recyclerView0 == null) {
                    return;
                }
                LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                Integer integer0 = null;
                LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
                if(linearLayoutManager0 == null) {
                    return;
                }
                Integer integer1 = linearLayoutManager0.s();
                if(integer1.intValue() >= 0) {
                    integer0 = integer1;
                }
                if(integer0 == null) {
                    return;
                }
                int v = (int)integer0;
                int v1 = Math.min(linearLayoutManager0.i(), this.getItemCount() - 1);
                int v2 = -1;
                if(v <= v1) {
                    int v3 = -1;
                    v4 = -1;
                    while(true) {
                        switch(this.getItemViewType(v)) {
                            case 6: 
                            case 15: {
                                if(v3 == -1) {
                                    v3 = v;
                                    v4 = v3;
                                }
                                else {
                                    v4 = v;
                                }
                                break;
                            label_29:
                                if(v3 >= 0) {
                                    this.notifyItemRangeChanged(v3, v4 - v3 + 1);
                                    v3 = -1;
                                    v4 = -1;
                                }
                                break;
                            }
                            default: {
                                goto label_29;
                            }
                        }
                        if(v == v1) {
                            break;
                        }
                        ++v;
                    }
                    v2 = v3;
                }
                else {
                    v4 = -1;
                }
                if(v2 >= 0) {
                    this.notifyItemRangeChanged(v2, v4 - v2 + 1);
                }
            }
            catch(Exception exception0) {
                b.a.y(exception0);
                zk.a(exception0);
            }
        };
    }

    public final void N(@l i i0, int v, @l com.dcinside.app.type.v v1, @m x x0, @l c c0) {
        L.p(i0, "response");
        L.p(v1, "filter");
        L.p(c0, "adHost");
        GalleryInfo galleryInfo0 = i0.c();
        MustRead mustRead0 = galleryInfo0.I();
        int v2 = i0.g();
        this.l = galleryInfo0;
        this.m = c0;
        String s = galleryInfo0.r();
        MustRead mustRead1 = s == null || v != 1 || !L.g(galleryInfo0.i(), "") || galleryInfo0.q() == com.dcinside.app.type.m.g || !this.O(s, (mustRead0 == null ? null : mustRead0.f())) ? null : mustRead0;
        com.dcinside.app.post.fragments.Y0.a y0$a0 = this.j.a(i0.f(), v, v2, com.dcinside.app.type.v.b == v1 || v2 == 0 && v > 1, x0, i0.d(), mustRead1, this.i != null && this.i.i() == 999 && this.i.l() == 9);
        int v3 = y0$a0.a();
        int v4 = y0$a0.b();
        if(v3 == 0) {
            this.notifyDataSetChanged();
            return;
        }
        if(v4 > 0) {
            this.notifyItemRangeInserted(v3, v4);
        }
    }

    private final boolean O(String s, Integer integer0) {
        return integer0 == null ? false : !dl.a.b3(s).contains(integer0);
    }

    public final void P(@m String s) {
        ++this.o;
        this.j.d(s);
        this.notifyDataSetChanged();
    }

    public final void Q(int v) {
        GalleryInfo galleryInfo0 = this.l;
        if(galleryInfo0 != null) {
            String s = galleryInfo0.r();
            if(s != null) {
                PostItem postItem0 = this.j.getItem(v);
                if(postItem0.M() != 17) {
                    return;
                }
                this.j.k(v);
                this.notifyItemRemoved(v);
                dl.a.c3(s, postItem0.C());
            }
        }
    }

    private final u1 R() {
        return (u1)this.n.getValue();
    }

    @l
    public final ItemTouchHelper S() {
        return this.s;
    }

    public final void T(@l String s) {
        L.p(s, "galleryId");
        this.R().a(s, this.f);
    }

    public final boolean U() {
        return (this.h == null || this.h.f() != 0L ? 0 : 1) ^ 1;
    }

    public final boolean V(int v) {
        return this.R().b(v);
    }

    private final void W() {
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                if(!recyclerView0.isLayoutSuppressed()) {
                    recyclerView0.stopScroll();
                }
                recyclerView0.removeCallbacks(this.v);
                recyclerView0.post(this.v);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void X(b0 b00) [...]

    private final void Y(ViewHolder recyclerView$ViewHolder0, int v) {
        PostItem postItem0 = this.j.getItem(v);
        L.n(recyclerView$ViewHolder0, "null cannot be cast to non-null type com.dcinside.app.post.fragments.MustReadHolder");
        ((T)recyclerView$ViewHolder0).f().setText(postItem0.K());
    }

    private final void Z(int v, ViewHolder recyclerView$ViewHolder0, int v1) {
        Context context0 = recyclerView$ViewHolder0.itemView.getContext();
        L.n(recyclerView$ViewHolder0, "null cannot be cast to non-null type com.dcinside.app.post.fragments.PostListPageHolder");
        int v2 = this.j.getItem(v1).B();
        ((Z0)recyclerView$ViewHolder0).k().setVisibility((v == 11 || v2 == 1 ? 8 : 0));
        ((Z0)recyclerView$ViewHolder0).k().setText(context0.getString(0x7F1507E2, new Object[]{v2}));  // string:post_section_text "Page %1$d"
        int v3 = this.o;
        if(((Z0)recyclerView$ViewHolder0).j() != v3) {
            ((Z0)recyclerView$ViewHolder0).n(v3);
            Fragment fragment0 = (Fragment)this.k.get();
            S0 s00 = null;
            if(fragment0 == null || !fragment0.isVisible()) {
                fragment0 = null;
            }
            if(fragment0 instanceof S0) {
                s00 = (S0)fragment0;
            }
            if(s00 == null) {
                return;
            }
            GalleryInfo galleryInfo0 = this.l;
            if(galleryInfo0 == null) {
                return;
            }
            String s = galleryInfo0.r();
            if(s == null) {
                return;
            }
            int v4 = galleryInfo0.h();
            LifecycleOwner lifecycleOwner0 = s00.getViewLifecycleOwner();
            L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
            switch(v) {
                case 2: {
                    ((Z0)recyclerView$ViewHolder0).m(lifecycleOwner0, s, v4, true, d.h);
                    break;
                }
                case 3: {
                    ((Z0)recyclerView$ViewHolder0).m(lifecycleOwner0, s, v4, false, d.b);
                    return;
                }
                case 4: {
                    ((Z0)recyclerView$ViewHolder0).m(lifecycleOwner0, s, v4, false, d.c);
                    return;
                }
                case 10: {
                    ((Z0)recyclerView$ViewHolder0).m(lifecycleOwner0, s, v4, false, d.f);
                    return;
                }
                case 11: {
                    ((Z0)recyclerView$ViewHolder0).m(lifecycleOwner0, s, v4, false, d.g);
                    return;
                }
                case 12: {
                    ((Z0)recyclerView$ViewHolder0).m(lifecycleOwner0, s, v4, false, d.e);
                }
            }
        }
    }

    private final void a0(ViewHolder recyclerView$ViewHolder0, int v) {
        String s5;
        Integer integer0;
        Spannable spannable0;
        boolean z;
        Context context0 = recyclerView$ViewHolder0.itemView.getContext();
        PostItem postItem0 = this.j.getItem(v);
        L.n(recyclerView$ViewHolder0, "null cannot be cast to non-null type com.dcinside.app.post.fragments.PostListItemHolder");
        GalleryInfo galleryInfo0 = this.l;
        String s = galleryInfo0 == null ? null : galleryInfo0.r();
        String s1 = postItem0.N();
        if(!this.j.g() || this.z() != postItem0.C() || !L.g(this.y(), s)) {
            z = false;
        }
        else {
            this.A(v);
            z = true;
        }
        ((X0)recyclerView$ViewHolder0).w(z);
        ((X0)recyclerView$ViewHolder0).v(L.g((galleryInfo0 == null ? null : galleryInfo0.i()), "notice") && this.j.b(v) && (galleryInfo0 != null && galleryInfo0.b0()));
        boolean z1 = !postItem0.c() && this.V(postItem0.C());
        ((X0)recyclerView$ViewHolder0).t(postItem0.c());
        ((X0)recyclerView$ViewHolder0).i(postItem0.d0());
        float f = ((X0)recyclerView$ViewHolder0).x();
        ResizeTextView resizeTextView0 = ((X0)recyclerView$ViewHolder0).n();
        if(postItem0.W()) {
            spannable0 = new SpannableStringBuilder("자동 삭제된 글입니다.");
            L.m(context0);
            ((SpannableStringBuilder)spannable0).setSpan(new TextAppearanceSpan(null, 0, -1, vk.c(context0, 0x7F04032A), null), 0, ((SpannableStringBuilder)spannable0).length(), 33);  // attr:icTintNormal
        }
        else {
            String s2 = postItem0.K() == null ? "" : postItem0.K();
            if(z1) {
                Integer[] arr_integer = this.u;
                integer0 = arr_integer[dl.a.H1()];
            }
            else {
                integer0 = null;
            }
            WeakReference weakReference0 = this.w();
            RecyclerView recyclerView0 = weakReference0 == null ? null : ((RecyclerView)weakReference0.get());
            com.dcinside.app.span.i i0 = o0.a.c(postItem0, f);
            L.m(context0);
            String s3 = postItem0.J();
            spannable0 = g.y(resizeTextView0, null, s2, postItem0.G(), postItem0.H(), integer0, i0, o0.a.d(postItem0, f, context0), null, (s3 == null || postItem0.c() || integer0 != null ? null : new j(s3)), recyclerView0, postItem0.d0(), false, false, 0x2000, null);
        }
        resizeTextView0.setText(spannable0);
        boolean z2 = L.g(s, "dcbest");
        String s4 = postItem0.u();
        if(z2) {
            ((X0)recyclerView$ViewHolder0).m().setText(null);
            ImageView imageView0 = ((X0)recyclerView$ViewHolder0).l();
            s.b(imageView0);
            imageView0.setVisibility(8);
        }
        else {
            ((X0)recyclerView$ViewHolder0).m().setText(g.r(context0, null, postItem0.z(), s4, postItem0.v(), null, null, null, false, 0xE2, null));
            ImageView imageView1 = ((X0)recyclerView$ViewHolder0).l();
            t.c.d(postItem0, imageView1);
        }
        if(TextUtils.isEmpty(postItem0.A())) {
            ((X0)recyclerView$ViewHolder0).k().setVisibility(0);
        }
        else {
            ((X0)recyclerView$ViewHolder0).k().setVisibility(4);
        }
        ((X0)recyclerView$ViewHolder0).k().setText(g.s(context0, s4, postItem0.q(), postItem0.F(), (s4 == null || s4.length() == 0) && (s1 == null || s1.length() == 0) && ((X0)recyclerView$ViewHolder0).l().getVisibility() != 0 || z2, s, s1, postItem0.i()));
        if(z2) {
            s5 = null;
        }
        else if(this.i == null) {
            s5 = postItem0.m();
        }
        else {
            s5 = null;
        }
        ((X0)recyclerView$ViewHolder0).o().setText(g.u(context0, s5, postItem0.g()));
    }

    @Override  // com.dcinside.app.post.fragments.U
    public void b() {
        this.W();
    }

    private final void b0(ViewHolder recyclerView$ViewHolder0, int v) {
        boolean z1;
        PostItem postItem0 = this.j.getItem(v);
        Integer integer0 = null;
        B1 b10 = recyclerView$ViewHolder0 instanceof B1 ? ((B1)recyclerView$ViewHolder0) : null;
        boolean z = false;
        if(b10 == null) {
            return;
        }
        if(!this.j.g() || this.z() != postItem0.C() || !L.g(this.y(), (this.l == null ? null : this.l.r()))) {
            z1 = false;
        }
        else {
            this.A(v);
            z1 = true;
        }
        b10.r(z1);
        boolean z2 = L.g((this.l == null ? null : this.l.i()), "notice");
        boolean z3 = this.l != null && this.l.b0();
        if(z2 && this.j.b(v) && z3) {
            z = true;
        }
        b10.q(z);
        if(!postItem0.c() && this.V(postItem0.C())) {
            Integer[] arr_integer = this.u;
            integer0 = arr_integer[dl.a.H1()];
        }
        b10.n(postItem0.c());
        b10.i(postItem0.d0());
        b10.o(postItem0, integer0);
    }

    @Override  // com.dcinside.app.post.fragments.v
    public int c() {
        return this.j.c();
    }

    private final void c0(int v, boolean z) {
        Fragment fragment0 = (Fragment)this.k.get();
        String s = null;
        if(fragment0 == null || !fragment0.isVisible()) {
            fragment0 = null;
        }
        S0 s00 = fragment0 instanceof S0 ? ((S0)fragment0) : null;
        if(s00 == null) {
            return;
        }
        GalleryInfo galleryInfo0 = this.l;
        if(galleryInfo0 != null) {
            String s1 = galleryInfo0.r();
            if(s1 == null || v < 0) {
                return;
            }
            boolean z1 = false;
            s00.j3(true);
            PostItem postItem0 = this.j.getItem(v);
            if(this.l != null && this.l.c0() && (this.l != null && this.l.f0())) {
                if(this.l != null && this.l.F() == 2) {
                    z1 = true;
                }
                if(this.l != null && this.l.J() && !z1) {
                    s00.Q4(0x7F1506EA);  // string:need_member_use_this "멤버만 이용할 수 있습니다."
                    return;
                }
            }
            if(postItem0.U()) {
                s00.K4(postItem0.C());
                return;
            }
            if(m0.a.a.i(postItem0.A())) {
                if(!this.j.g()) {
                    s00.J3();
                }
                PostHead postHead0 = this.i;
                if(postHead0 != null) {
                    s = postHead0.i().toString();
                }
                new com.dcinside.app.util.Xk.a(s1, postItem0.C(), 0, null, false, false, false, false, false, z, null, z, s, null, 0x25FC, null).b(s00);
                return;
            }
            com.dcinside.app.main.a.l(s00, postItem0.A());
        }
    }

    @Override  // Z.f
    public boolean d(int v, int v1) {
        int v2 = this.getItemViewType(v1);
        if(this.j.b(v1) && v2 == 6) {
            this.j.h(v, v1);
            this.notifyItemMoved(v, v1);
            V v3 = this.r;
            if(v3 == null) {
                this.r = r0.a(v, v1);
                return true;
            }
            this.r = r0.a(v3.e(), v1);
            return true;
        }
        return false;
    }

    private final ViewHolder d0(ViewGroup viewGroup0) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E022B, viewGroup0, false);  // layout:view_post_list_block_gallery
        L.m(view0);
        return new h(view0);
    }

    private final ViewHolder e0(ViewGroup viewGroup0) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0232, viewGroup0, false);  // layout:view_post_list_manager_only
        L.m(view0);
        return new S(view0);
    }

    @Override  // com.dcinside.app.post.fragments.v
    @m
    public String f() {
        return this.j.f();
    }

    private final ViewHolder f0(ViewGroup viewGroup0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostListAdapter$onCreateMoreHolder$1", f = "PostListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.b0.a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final b0 m;

            com.dcinside.app.post.fragments.b0.a(b0 b00, kotlin.coroutines.d d0) {
                this.m = b00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.post.fragments.b0.a b0$a0 = new com.dcinside.app.post.fragments.b0.a(this.m, d0);
                b0$a0.l = view0;
                return b0$a0.invokeSuspend(kotlin.S0.a);
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
                this.m.l0(((View)this.l));
                return kotlin.S0.a;
            }
        }

        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0276, viewGroup0, false);  // layout:view_search_more
        L.m(view0);
        r.M(view0, null, new com.dcinside.app.post.fragments.b0.a(this, null), 1, null);
        ViewHolder recyclerView$ViewHolder0 = new d1(view0);
        com.dcinside.app.util.ql.a.a(view0, (View view0, boolean z) -> {
            L.p(this, "this$0");
            L.p(((d1)recyclerView$ViewHolder0), "$holder");
            if(z) {
                e e0 = this.h;
                if(e0 != null) {
                    e0.g(((d1)recyclerView$ViewHolder0));
                }
            }
            else {
                e e1 = this.h;
                if(e1 != null) {
                    e1.k();
                }
            }
        });
        return recyclerView$ViewHolder0;
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return this.g.g();
    }

    // 检测为 Lambda 实现
    private static final void g0(b0 b00, d1 d10, View view0, boolean z) [...]

    @Override  // com.dcinside.app.post.fragments.v
    @l
    public PostItem getItem(int v) {
        return this.j.getItem(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.j.e();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.j.getItem(v).M();
    }

    @Override  // Z.f
    public void h(int v) {
        this.q0(v == 2);
    }

    private final ViewHolder h0(ViewGroup viewGroup0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostListAdapter$onCreateMustReadHolder$1", f = "PostListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.b0.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final b0 l;
            final T m;

            com.dcinside.app.post.fragments.b0.b(b0 b00, T t0, kotlin.coroutines.d d0) {
                this.l = b00;
                this.m = t0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.b0.b(this.l, this.m, d0).invokeSuspend(kotlin.S0.a);
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
                int v = this.m.getBindingAdapterPosition();
                this.l.c0(v, false);
                return kotlin.S0.a;
            }
        }

        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0234, viewGroup0, false);  // layout:view_post_list_must_read
        L.m(view0);
        ViewHolder recyclerView$ViewHolder0 = new T(view0);
        r.M(view0, null, new com.dcinside.app.post.fragments.b0.b(this, ((T)recyclerView$ViewHolder0), null), 1, null);
        return recyclerView$ViewHolder0;
    }

    @Override  // com.dcinside.app.post.fragments.v
    public int i(int v) {
        return this.j.i(v);
    }

    private final ViewHolder i0(ViewGroup viewGroup0) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E022F, viewGroup0, false);  // layout:view_post_list_item_page
        L.m(view0);
        ViewHolder recyclerView$ViewHolder0 = new Z0(view0, this.m);
        this.g.a(((com.dcinside.app.wv.f)recyclerView$ViewHolder0));
        return recyclerView$ViewHolder0;
    }

    @Override  // com.dcinside.app.post.fragments.v
    public boolean isDone() {
        return this.j.isDone();
    }

    @Override  // com.dcinside.app.post.fragments.v
    public boolean j(int v) {
        return this.j.j(v);
    }

    private final ViewHolder j0(ViewGroup viewGroup0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostListAdapter$onCreatePostHolder$1", f = "PostListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.b0.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final b0 l;
            final X0 m;

            com.dcinside.app.post.fragments.b0.c(b0 b00, X0 x00, kotlin.coroutines.d d0) {
                this.l = b00;
                this.m = x00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.b0.c(this.l, this.m, d0).invokeSuspend(kotlin.S0.a);
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
                int v = this.m.getBindingAdapterPosition();
                this.l.c0(v, false);
                return kotlin.S0.a;
            }
        }

        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate((this.j.g() ? 0x7F0E0231 : 0x7F0E022E), viewGroup0, false);  // layout:view_post_list_item_split
        L.m(view0);
        ViewHolder recyclerView$ViewHolder0 = new X0(view0);
        ((X0)recyclerView$ViewHolder0).j().setLineSize(Dk.b(0x7F0703CB));  // dimen:post_item_padding_album
        r.M(view0, null, new com.dcinside.app.post.fragments.b0.c(this, ((X0)recyclerView$ViewHolder0), null), 1, null);
        return recyclerView$ViewHolder0;
    }

    private final ViewHolder k0(ViewGroup viewGroup0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.post.fragments.PostListAdapter$onCreatePostThumbnailHolder$1", f = "PostListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.b0.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final b0 l;
            final B1 m;

            com.dcinside.app.post.fragments.b0.d(b0 b00, B1 b10, kotlin.coroutines.d d0) {
                this.l = b00;
                this.m = b10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.b0.d(this.l, this.m, d0).invokeSuspend(kotlin.S0.a);
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
                int v = this.m.getBindingAdapterPosition();
                this.l.c0(v, false);
                return kotlin.S0.a;
            }
        }

        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0237, viewGroup0, false);  // layout:view_post_list_thumbnail_item
        L.m(view0);
        ViewHolder recyclerView$ViewHolder0 = new B1(view0);
        r.M(view0, null, new com.dcinside.app.post.fragments.b0.d(this, ((B1)recyclerView$ViewHolder0), null), 1, null);
        return recyclerView$ViewHolder0;
    }

    private final void l0(View view0) {
        Context context0 = Dl.b(view0);
        if(context0 != null) {
            com.dcinside.app.rx.bus.c.a(context0, new A(1));
        }
    }

    // 检测为 Lambda 实现
    private static final void m0(com.dcinside.app.ad.util.k k0, RecyclerView recyclerView0) [...]

    @Override  // com.dcinside.app.post.fragments.v
    public int n(int v) {
        int v1 = this.j.n(v);
        if(v1 < 0) {
            return v1;
        }
        this.notifyItemRemoved(v1);
        return v1;
    }

    private final void n0() {
        static final class com.dcinside.app.post.fragments.b0.f extends N implements Function1 {
            final b0 e;

            com.dcinside.app.post.fragments.b0.f(b0 b00) {
                this.e = b00;
                super(1);
            }

            public final void a(K k0) {
                this.e.t = false;
                this.e.r = null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((K)object0));
                return kotlin.S0.a;
            }
        }

        GalleryInfo galleryInfo0 = this.l;
        if(galleryInfo0 != null) {
            String s = galleryInfo0.r();
            if(s != null) {
                V v0 = this.r;
                if(v0 == null) {
                    return;
                }
                int v1 = ((Number)v0.a()).intValue();
                int v2 = ((Number)v0.b()).intValue();
                int v3 = this.j.getItem(v2).C();
                kotlin.ranges.l l0 = v1 <= v2 ? new kotlin.ranges.l(v1, v2) : new kotlin.ranges.l(v2, v1);
                ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
                Iterator iterator0 = l0.iterator();
                while(iterator0.hasNext()) {
                    int v4 = ((kotlin.collections.T)iterator0).b();
                    arrayList0.add(this.j.getItem(v4).C());
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: arrayList0) {
                    if(((Number)object0).intValue() > 0) {
                        arrayList1.add(object0);
                    }
                }
                int[] arr_v = u.U5(arrayList1);
                this.t = true;
                this.p = uk.XF(s, v3, arr_v).y5((Object object0) -> {
                    L.p(new com.dcinside.app.post.fragments.b0.f(this), "$tmp0");
                    new com.dcinside.app.post.fragments.b0.f(this).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this, "this$0");
                    this.t = false;
                    this.r = null;
                    this.j.h(v2, v1);
                    this.notifyItemMoved(v2, v1);
                    com.hjq.toast.s.F(throwable0.getMessage());
                });
            }
        }
    }

    @Override  // com.dcinside.app.post.fragments.v
    public void o(boolean z) {
        this.j.o(z);
    }

    // 检测为 Lambda 实现
    private static final void o0(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.post.a
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView0);
        this.s.m(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "viewHolder");
        int v1 = this.getItemViewType(v);
        switch(v1) {
            case 2: 
            case 3: 
            case 4: {
                break;
            }
            case 6: {
                this.a0(recyclerView$ViewHolder0, v);
                return;
            label_10:
                if(v1 != 10 && v1 != 11 && v1 != 12) {
                    return;
                }
                break;
            }
            case 15: {
                this.b0(recyclerView$ViewHolder0, v);
                return;
            }
            case 17: {
                this.Y(recyclerView$ViewHolder0, v);
                return;
            }
            default: {
                goto label_10;
            }
        }
        this.Z(v1, recyclerView$ViewHolder0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        switch(v) {
            case 6: {
                return this.j0(viewGroup0);
            }
            case 8: {
                return this.f0(viewGroup0);
            }
            case 2: 
            case 3: 
            case 4: 
            case 10: 
            case 11: 
            case 12: {
                return this.i0(viewGroup0);
            }
            case 13: {
                return this.d0(viewGroup0);
            }
            case 15: {
                return this.k0(viewGroup0);
            }
            case 17: {
                return this.h0(viewGroup0);
            }
            case 18: {
                return this.e0(viewGroup0);
            }
            default: {
                return this.j0(viewGroup0);
            }
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.R().a("", null);
        F0 f00 = this.f;
        if(f00 != null) {
            if(f00.isClosed()) {
                f00 = null;
            }
            if(f00 != null) {
                f00.y4();
                f00.close();
            }
        }
        this.f = null;
        e e0 = this.h;
        if(e0 != null) {
            e0.k();
        }
        this.h = null;
        o o0 = this.p;
        if(o0 != null) {
            o0.l();
        }
        this.g.onDestroy();
        this.j.d(null);
    }

    @Override  // com.dcinside.app.post.a
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView0);
        this.s.m(null);
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        this.g.onPause();
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        this.g.onResume();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "holder");
        super.onViewRecycled(recyclerView$ViewHolder0);
        if(!(recyclerView$ViewHolder0 instanceof Z0) || ((Z0)recyclerView$ViewHolder0).getItemViewType() != 4) {
            return;
        }
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                com.dcinside.app.ad.util.c c0 = ((Z0)recyclerView$ViewHolder0).h();
                if(c0 == null) {
                    return;
                }
                com.dcinside.app.ad.util.a a0 = c0.b();
                Runnable runnable0 = null;
                com.dcinside.app.ad.util.k k0 = a0 instanceof com.dcinside.app.ad.util.k ? ((com.dcinside.app.ad.util.k)a0) : null;
                if(k0 == null) {
                    return;
                }
                Object object0 = recyclerView0.getTag(0x7F0B06F1);  // id:list_ad_reload
                if(object0 instanceof Runnable) {
                    runnable0 = (Runnable)object0;
                }
                recyclerView0.removeCallbacks(runnable0);
                Z z0 = () -> {
                    L.p(k0, "$adSequential");
                    L.p(recyclerView0, "$parent");
                    try {
                        k0.f();
                        recyclerView0.setTag(0x7F0B06F1, null);  // id:list_ad_reload
                    }
                    catch(Exception unused_ex) {
                    }
                };
                recyclerView0.setTag(0x7F0B06F1, z0);  // id:list_ad_reload
                recyclerView0.post(z0);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void p0(b0 b00, int v, int v1, Throwable throwable0) [...]

    private final void q0(boolean z) {
        if(this.q != z) {
            this.q = z;
            if(!z) {
                this.n0();
            }
        }
    }

    @Override  // com.dcinside.app.post.fragments.v
    public int r() {
        return this.j.r();
    }

    public final void r0(@m Throwable throwable0) {
        e e0 = this.h;
        if(e0 != null) {
            e0.l(throwable0);
        }
    }

    public final void s0(@m PostHead postHead0) {
        this.i = postHead0;
    }

    @Override  // Z.f
    public boolean t() {
        if(!this.t) {
            return true;
        }
        com.hjq.toast.s.E(0x7F15052E);  // string:list_move_progress "순서 변경 중"
        return false;
    }

    public final void t0(boolean z) {
        e e0 = this.h;
        if(e0 != null) {
            e0.d(z);
        }
    }

    @Override  // Z.f
    public int u() {
        return this.getItemCount();
    }

    public final void u0(@l ItemTouchHelper itemTouchHelper0) {
        L.p(itemTouchHelper0, "<set-?>");
        this.s = itemTouchHelper0;
    }

    @Override  // com.dcinside.app.post.a
    @l
    public PostItem v(int v) {
        return this.j.getItem(v);
    }
}

