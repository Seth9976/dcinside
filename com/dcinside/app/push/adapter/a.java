package com.dcinside.app.push.adapter;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.push.i;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Xk;
import g0.f.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nGalleryPushArticleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPushArticleAdapter.kt\ncom/dcinside/app/push/adapter/GalleryPushArticleAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1062#2:91\n230#2,2:92\n*S KotlinDebug\n*F\n+ 1 GalleryPushArticleAdapter.kt\ncom/dcinside/app/push/adapter/GalleryPushArticleAdapter\n*L\n77#1:91\n84#1:92,2\n*E\n"})
public final class a extends Adapter {
    @l
    private ArrayList a;

    public a() {
        this.a = new ArrayList();
    }

    public final void A(@l List list0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 GalleryPushArticleAdapter.kt\ncom/dcinside/app/push/adapter/GalleryPushArticleAdapter\n*L\n1#1,121:1\n77#2:122\n*E\n"})
        public static final class d implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((b)object1).a(), ((b)object0).a());
            }
        }

        L.p(list0, "list");
        List list1 = u.u5(list0, new d());
        this.a.clear();
        this.a.addAll(list1);
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.y(((h0.a)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.z(viewGroup0, v);
    }

    public final void w(@l String s) {
        L.p(s, "postNo");
        for(Object object0: this.a) {
            b f$b0 = (b)object0;
            if(L.g(f$b0.h(), s)) {
                this.a.remove(f$b0);
                this.notifyDataSetChanged();
                return;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final void x(Context context0, String s, String s1) {
        if(context0 instanceof i) {
            ((i)context0).h(s, s1);
        }
    }

    public void y(@l h0.a a0, int v) {
        @f(c = "com.dcinside.app.push.adapter.GalleryPushArticleAdapter$onBindViewHolder$1", f = "GalleryPushArticleAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.adapter.a.a extends o implements p {
            int k;
            final a l;
            final Context m;
            final b n;

            com.dcinside.app.push.adapter.a.a(a a0, Context context0, b f$b0, kotlin.coroutines.d d0) {
                this.l = a0;
                this.m = context0;
                this.n = f$b0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.adapter.a.a(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                a a0 = this.l;
                Context context0 = this.m;
                L.o(context0, "$context");
                String s = this.n.h();
                String s1 = "";
                if(s == null) {
                    s = "";
                }
                String s2 = this.n.d();
                if(s2 != null) {
                    s1 = s2;
                }
                a0.x(context0, s, s1);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.push.adapter.GalleryPushArticleAdapter$onBindViewHolder$2", f = "GalleryPushArticleAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.adapter.a.b extends o implements p {
            int k;
            final Context l;
            final b m;

            com.dcinside.app.push.adapter.a.b(Context context0, b f$b0, kotlin.coroutines.d d0) {
                this.l = context0;
                this.m = f$b0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.adapter.a.b(this.l, this.m, d0).invokeSuspend(S0.a);
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
                AppCompatActivity appCompatActivity0 = this.l instanceof AppCompatActivity ? ((AppCompatActivity)this.l) : null;
                if(appCompatActivity0 == null) {
                    return S0.a;
                }
                String s = this.m.h();
                Xk.k(appCompatActivity0, this.m.d(), (s == null ? 0 : Integer.parseInt(s)), false, false, false, 56, null);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.push.adapter.GalleryPushArticleAdapter$onBindViewHolder$3", f = "GalleryPushArticleAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final Context l;
            final b m;

            c(Context context0, b f$b0, kotlin.coroutines.d d0) {
                this.l = context0;
                this.m = f$b0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new c(this.l, this.m, d0).invokeSuspend(S0.a);
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
                AppCompatActivity appCompatActivity0 = this.l instanceof AppCompatActivity ? ((AppCompatActivity)this.l) : null;
                if(appCompatActivity0 == null) {
                    return S0.a;
                }
                String s = this.m.h();
                Xk.k(appCompatActivity0, this.m.d(), (s == null ? 0 : Integer.parseInt(s)), false, false, false, 56, null);
                return S0.a;
            }
        }

        L.p(a0, "holder");
        Context context0 = a0.itemView.getContext();
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        a0.i().setText(((b)object0).k());
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        spannableStringBuilder0.append(((b)object0).e());
        spannableStringBuilder0.append(' ');
        spannableStringBuilder0.append(' ');
        L.m(context0);
        com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new com.dcinside.app.span.b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
        if(((b)object0).g() != null) {
            spannableStringBuilder0.append(' ');
            spannableStringBuilder0.append(' ');
            spannableStringBuilder0.append(((b)object0).g());
        }
        spannableStringBuilder0.append(' ');
        spannableStringBuilder0.append(' ');
        com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new com.dcinside.app.span.b(context0, 0x7F08019D, null, 0, 0, false, null, 0x7C, null));  // drawable:divider_text
        spannableStringBuilder0.append(' ');
        spannableStringBuilder0.append(' ');
        String s = ((b)object0).c();
        if(s == null) {
            s = "";
        }
        a0.e().setText(spannableStringBuilder0.append(Bk.m(s)));
        r.M(a0.f(), null, new com.dcinside.app.push.adapter.a.a(this, context0, ((b)object0), null), 1, null);
        r.M(a0.i(), null, new com.dcinside.app.push.adapter.a.b(context0, ((b)object0), null), 1, null);
        r.M(a0.e(), null, new c(context0, ((b)object0), null), 1, null);
    }

    @l
    public h0.a z(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E019D, viewGroup0, false);  // layout:view_article_post_item
        L.m(view0);
        return new h0.a(view0);
    }
}

