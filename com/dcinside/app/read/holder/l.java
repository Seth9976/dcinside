package com.dcinside.app.read.holder;

import A3.p;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Mention;
import com.dcinside.app.model.Q;
import com.dcinside.app.post.fragments.d4;
import com.dcinside.app.read.C;
import com.dcinside.app.read.reply.more.ReplyMoreItem;
import com.dcinside.app.read.reply.more.ReplyPostInfo;
import com.dcinside.app.read.reply.more.j;
import com.dcinside.app.read.x;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.dl;
import com.dcinside.app.view.DividerConstraintLayout;
import com.dcinside.app.view.ResizeTextView;
import com.dcinside.app.wv.VideoEnabledWebView;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.m;

@s0({"SMAP\nReplyTextHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public class l extends b {
    @y4.l
    private final DividerConstraintLayout b;
    @y4.l
    private final ResizeTextView c;
    @y4.l
    private final ResizeTextView d;
    @m
    private final ResizeTextView e;
    @y4.l
    private final ResizeTextView f;
    @y4.l
    private final ImageView g;
    @y4.l
    private final ImageView h;
    @y4.l
    private final ResizeTextView i;
    @y4.l
    private final ImageView j;
    @y4.l
    private final View k;
    @y4.l
    private final ResizeTextView l;
    @m
    private j m;

    @z3.j
    public l(@y4.l View view0) {
        L.p(view0, "itemView");
        this(view0, null, 2, null);
    }

    @z3.j
    public l(@y4.l View view0, @m VideoEnabledWebView videoEnabledWebView0) {
        @f(c = "com.dcinside.app.read.holder.ReplyTextHolder$1", f = "ReplyTextHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nReplyTextHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
        static final class a extends o implements p {
            int k;
            Object l;
            final l m;

            a(l l0, d d0) {
                this.m = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                a l$a0 = new a(this.m, d0);
                l$a0.l = view0;
                return l$a0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.D();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplyTextHolder$2", f = "ReplyTextHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nReplyTextHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
        static final class com.dcinside.app.read.holder.l.b extends o implements p {
            int k;
            Object l;
            final l m;

            com.dcinside.app.read.holder.l.b(l l0, d d0) {
                this.m = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                com.dcinside.app.read.holder.l.b l$b0 = new com.dcinside.app.read.holder.l.b(this.m, d0);
                l$b0.l = view0;
                return l$b0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.B();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplyTextHolder$3", f = "ReplyTextHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nReplyTextHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
        static final class c extends o implements p {
            int k;
            Object l;
            final l m;

            c(l l0, d d0) {
                this.m = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                c l$c0 = new c(this.m, d0);
                l$c0.l = view0;
                return l$c0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.B();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.ReplyTextHolder$4", f = "ReplyTextHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nReplyTextHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
        static final class com.dcinside.app.read.holder.l.d extends o implements p {
            int k;
            Object l;
            final l m;

            com.dcinside.app.read.holder.l.d(l l0, d d0) {
                this.m = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                com.dcinside.app.read.holder.l.d l$d0 = new com.dcinside.app.read.holder.l.d(this.m, d0);
                l$d0.l = view0;
                return l$d0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                this.m.A();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0, videoEnabledWebView0);
        this.b = (DividerConstraintLayout)view0;
        View view1 = view0.findViewById(0x7F0B0D65);  // id:reply_name
        L.o(view1, "findViewById(...)");
        this.c = (ResizeTextView)view1;
        View view2 = view0.findViewById(0x7F0B0D2E);  // id:reply_ip
        L.o(view2, "findViewById(...)");
        this.d = (ResizeTextView)view2;
        ResizeTextView resizeTextView0 = (ResizeTextView)view0.findViewById(0x7F0B0D31);  // id:reply_memo
        this.e = resizeTextView0;
        View view3 = view0.findViewById(0x7F0B0D70);  // id:reply_time
        L.o(view3, "findViewById(...)");
        this.f = (ResizeTextView)view3;
        View view4 = view0.findViewById(0x7F0B0D33);  // id:reply_more
        L.o(view4, "findViewById(...)");
        this.g = (ImageView)view4;
        View view5 = view0.findViewById(0x7F0B0D30);  // id:reply_member_ic
        L.o(view5, "findViewById(...)");
        this.h = (ImageView)view5;
        View view6 = view0.findViewById(0x7F0B0D74);  // id:reply_user_memo
        L.o(view6, "findViewById(...)");
        this.i = (ResizeTextView)view6;
        View view7 = view0.findViewById(0x7F0B0D73);  // id:reply_under_icon
        L.o(view7, "findViewById(...)");
        this.j = (ImageView)view7;
        View view8 = view0.findViewById(0x7F0B0D2D);  // id:reply_first_icon
        L.o(view8, "findViewById(...)");
        this.k = view8;
        View view9 = view0.findViewById(0x7F0B0D32);  // id:reply_mention
        L.o(view9, "findViewById(...)");
        this.l = (ResizeTextView)view9;
        r.M(((ImageView)view4), null, new a(this, null), 1, null);
        r.M(((DividerConstraintLayout)view0), null, new com.dcinside.app.read.holder.l.b(this, null), 1, null);
        if(resizeTextView0 != null) {
            r.M(resizeTextView0, null, new c(this, null), 1, null);
        }
        r.M(((ResizeTextView)view9), null, new com.dcinside.app.read.holder.l.d(this, null), 1, null);
        float f = Dk.c(dl.a.V1().b());
        ((ResizeTextView)view1).v(f);
        ((ResizeTextView)view2).v(f);
        if(resizeTextView0 != null) {
            resizeTextView0.v(f);
        }
        ((ResizeTextView)view3).v(f);
        ((ResizeTextView)view6).v(f);
        ((ResizeTextView)view9).v(f);
    }

    public l(View view0, VideoEnabledWebView videoEnabledWebView0, int v, w w0) {
        if((v & 2) != 0) {
            videoEnabledWebView0 = null;
        }
        this(view0, videoEnabledWebView0);
    }

    private final void A() {
        Integer integer0 = this.getBindingAdapterPosition();
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            x x0 = this.e();
            if(x0 != null) {
                C c0 = x0.Q(v);
                if(c0 != null) {
                    com.dcinside.app.response.j j0 = c0.g();
                    if(j0 != null) {
                        Mention mention0 = j0.W();
                        if(mention0 != null) {
                            x x1 = this.e();
                            if(x1 != null) {
                                x1.V(mention0);
                            }
                        }
                    }
                }
            }
        }
    }

    private final void B() {
        Integer integer0 = this.getBindingAdapterPosition();
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            x x0 = this.e();
            if(x0 != null) {
                x0.L0(v);
            }
        }
    }

    private final void C(d4 d40) {
        @f(c = "com.dcinside.app.read.holder.ReplyTextHolder$showImageNoteMore$1", f = "ReplyTextHolder.kt", i = {}, l = {0x77}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.holder.l.f extends o implements A3.o {
            int k;
            final d4 l;
            final int m;
            final l n;
            final AppCompatActivity o;

            com.dcinside.app.read.holder.l.f(d4 d40, int v, l l0, AppCompatActivity appCompatActivity0, d d0) {
                this.l = d40;
                this.m = v;
                this.n = l0;
                this.o = appCompatActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.l
            public final d create(@m Object object0, @y4.l d d0) {
                return new com.dcinside.app.read.holder.l.f(this.l, this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@y4.l O o0, @m d d0) {
                return ((com.dcinside.app.read.holder.l.f)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                @f(c = "com.dcinside.app.read.holder.ReplyTextHolder$showImageNoteMore$1$1", f = "ReplyTextHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nReplyTextHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$showImageNoteMore$1$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,147:1\n192#2,7:148\n*S KotlinDebug\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$showImageNoteMore$1$1\n*L\n121#1:148,7\n*E\n"})
                static final class com.dcinside.app.read.holder.l.f.a extends o implements A3.o {
                    int k;
                    final l l;
                    final AppCompatActivity m;
                    final ReplyMoreItem n;

                    com.dcinside.app.read.holder.l.f.a(l l0, AppCompatActivity appCompatActivity0, ReplyMoreItem replyMoreItem0, d d0) {
                        this.l = l0;
                        this.m = appCompatActivity0;
                        this.n = replyMoreItem0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.l
                    public final d create(@m Object object0, @y4.l d d0) {
                        return new com.dcinside.app.read.holder.l.f.a(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@y4.l O o0, @m d d0) {
                        return ((com.dcinside.app.read.holder.l.f.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        j j0 = this.l.m;
                        if(j0 != null) {
                            j0.dismissAllowingStateLoss();
                        }
                        l l0 = this.l;
                        V[] arr_v = {r0.a("com.dcinside.app.read.reply.more.extra.REPLY_ITEM", this.n)};
                        FragmentManager fragmentManager0 = this.m.getSupportFragmentManager();
                        L.o(fragmentManager0, "getSupportFragmentManager(...)");
                        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                        ClassLoader classLoader0 = j.class.getClassLoader();
                        L.m(classLoader0);
                        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.read.reply.more.j");
                        if(fragment0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.read.reply.more.ReplyMoreDialogFragment");
                        }
                        ((j)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
                        ((j)fragment0).show(fragmentManager0, "com.dcinside.app.read.reply.more.j");
                        l0.m = (j)fragment0;
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        ReplyMoreItem replyMoreItem0 = this.l.z(this.m);
                        com.dcinside.app.read.holder.l.f.a l$f$a0 = new com.dcinside.app.read.holder.l.f.a(this.n, this.o, replyMoreItem0, null);
                        this.k = 1;
                        return i.h(h0.e(), l$f$a0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        Integer integer0 = this.getBindingAdapterPosition();
        AppCompatActivity appCompatActivity0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            Context context0 = this.itemView.getContext();
            if(context0 instanceof AppCompatActivity) {
                appCompatActivity0 = (AppCompatActivity)context0;
            }
            if(appCompatActivity0 == null) {
                return;
            }
            k.f(LifecycleOwnerKt.a(appCompatActivity0), h0.a(), null, new com.dcinside.app.read.holder.l.f(d40, v, this, appCompatActivity0, null), 2, null);
        }
    }

    private final void D() {
        ViewParent viewParent0 = this.itemView.getParent();
        Adapter recyclerView$Adapter0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 != null) {
            recyclerView$Adapter0 = recyclerView0.getAdapter();
        }
        if(recyclerView$Adapter0 instanceof d4) {
            this.C(((d4)recyclerView$Adapter0));
            return;
        }
        if(recyclerView$Adapter0 instanceof x) {
            this.n(((x)recyclerView$Adapter0));
        }
    }

    private final void n(x x0) {
        @f(c = "com.dcinside.app.read.holder.ReplyTextHolder$contentReplyMore$1", f = "ReplyTextHolder.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nReplyTextHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$contentReplyMore$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n739#2,9:148\n37#3,2:157\n1#4:159\n*S KotlinDebug\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$contentReplyMore$1\n*L\n82#1:148,9\n82#1:157,2\n*E\n"})
        static final class e extends o implements A3.o {
            int k;
            final x l;
            final int m;
            final l n;
            final AppCompatActivity o;

            e(x x0, int v, l l0, AppCompatActivity appCompatActivity0, d d0) {
                this.l = x0;
                this.m = v;
                this.n = l0;
                this.o = appCompatActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.l
            public final d create(@m Object object0, @y4.l d d0) {
                return new e(this.l, this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@y4.l O o0, @m d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                @f(c = "com.dcinside.app.read.holder.ReplyTextHolder$contentReplyMore$1$1", f = "ReplyTextHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nReplyTextHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$contentReplyMore$1$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,147:1\n192#2,7:148\n*S KotlinDebug\n*F\n+ 1 ReplyTextHolder.kt\ncom/dcinside/app/read/holder/ReplyTextHolder$contentReplyMore$1$1\n*L\n107#1:148,7\n*E\n"})
                static final class com.dcinside.app.read.holder.l.e.a extends o implements A3.o {
                    int k;
                    final l l;
                    final AppCompatActivity m;
                    final ReplyMoreItem n;

                    com.dcinside.app.read.holder.l.e.a(l l0, AppCompatActivity appCompatActivity0, ReplyMoreItem replyMoreItem0, d d0) {
                        this.l = l0;
                        this.m = appCompatActivity0;
                        this.n = replyMoreItem0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.l
                    public final d create(@m Object object0, @y4.l d d0) {
                        return new com.dcinside.app.read.holder.l.e.a(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@y4.l O o0, @m d d0) {
                        return ((com.dcinside.app.read.holder.l.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        j j0 = this.l.m;
                        if(j0 != null) {
                            j0.dismissAllowingStateLoss();
                        }
                        l l0 = this.l;
                        V[] arr_v = {r0.a("com.dcinside.app.read.reply.more.extra.REPLY_ITEM", this.n)};
                        FragmentManager fragmentManager0 = this.m.getSupportFragmentManager();
                        L.o(fragmentManager0, "getSupportFragmentManager(...)");
                        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                        ClassLoader classLoader0 = j.class.getClassLoader();
                        L.m(classLoader0);
                        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.read.reply.more.j");
                        if(fragment0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.read.reply.more.ReplyMoreDialogFragment");
                        }
                        ((j)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
                        ((j)fragment0).show(fragmentManager0, "com.dcinside.app.read.reply.more.j");
                        l0.m = (j)fragment0;
                        return S0.a;
                    }
                }

                String s9;
                boolean z;
                String s2;
                List list1;
                int v = 0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        C c0 = this.l.Q(this.m);
                        L.o(c0, "getItem(...)");
                        com.dcinside.app.response.j j0 = c0.g();
                        if(j0 == null) {
                            return S0.a;
                        }
                        String s = j0.X();
                        List list0 = new kotlin.text.r("\\.").p((j0.R() == null ? "" : j0.R()), 0);
                        if(!list0.isEmpty()) {
                            ListIterator listIterator0 = list0.listIterator(list0.size());
                            while(listIterator0.hasPrevious()) {
                                if(((String)listIterator0.previous()).length() == 0) {
                                    continue;
                                }
                                list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                                goto label_19;
                            }
                        }
                        list1 = u.H();
                    label_19:
                        String[] arr_s = (String[])list1.toArray(new String[0]);
                        if(arr_s.length < 2) {
                            arr_s = null;
                        }
                        if(arr_s == null) {
                            s2 = "";
                        }
                        else {
                            String s1 = String.format("%s.%s", Arrays.copyOf(new Object[]{arr_s[0], arr_s[1]}, 2));
                            L.o(s1, "format(...)");
                            s2 = s1;
                        }
                        String s3 = j0.f0();
                        Q q0 = this.l.T();
                        if(q0 == null) {
                            return S0.a;
                        }
                        V v1 = this.n.p(j0.N().g());
                        l l0 = this.n;
                        com.dcinside.app.dccon.b b0 = j0.N().h();
                        if(b0 == null) {
                            b0 = new com.dcinside.app.dccon.b(null, null, null, false, false, false, 0x3F, null);
                        }
                        V v2 = l0.p(b0);
                        com.dcinside.app.read.f f0 = com.dcinside.app.read.f.e.c(q0, j0);
                        if(q0.K0() || q0.F0() != com.dcinside.app.type.m.h && q0.F0() != com.dcinside.app.type.m.i) {
                            z = false;
                        }
                        else {
                            String s4 = B.E.k0();
                            z = Q.n0.b(q0, s4);
                        }
                        ReplyPostInfo replyPostInfo0 = ReplyPostInfo.h.a(q0, z);
                        com.dcinside.app.response.j.a j$a0 = j0.H();
                        String s5 = String.valueOf((j$a0 == null ? null : j$a0.k()));
                        int v3 = Al.a.x(s5, new String[]{"1757089841996"});
                        int v4 = this.m;
                        if(j$a0 != null) {
                            v = j$a0.l();
                        }
                        boolean z1 = j0.i0();
                        String s6 = j0.S() == null ? "" : j0.S();
                        int v5 = j0.U();
                        String s7 = j0.T() == null ? "" : j0.T();
                        if(j$a0 == null) {
                            s9 = "";
                        }
                        else {
                            String s8 = j$a0.h();
                            s9 = s8 == null ? "" : s8;
                        }
                        String s10 = j0.P();
                        ReplyMoreItem replyMoreItem0 = new ReplyMoreItem(v4, v, replyPostInfo0, (s == null ? "" : s), s2, (s3 == null ? "" : s3), z1, s6, v5, s7, s5, v1, v2, s9, f0.e(), v3, (s10 == null ? "" : s10), j0.W(), null, null, 0xC0000, null);
                        com.dcinside.app.read.holder.l.e.a l$e$a0 = new com.dcinside.app.read.holder.l.e.a(this.n, this.o, replyMoreItem0, null);
                        this.k = 1;
                        return i.h(h0.e(), l$e$a0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        Integer integer0 = this.getBindingAdapterPosition();
        AppCompatActivity appCompatActivity0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            Context context0 = this.itemView.getContext();
            if(context0 instanceof AppCompatActivity) {
                appCompatActivity0 = (AppCompatActivity)context0;
            }
            if(appCompatActivity0 == null) {
                return;
            }
            k.f(LifecycleOwnerKt.a(appCompatActivity0), h0.a(), null, new e(x0, v, this, appCompatActivity0, null), 2, null);
        }
    }

    @y4.l
    public final DividerConstraintLayout o() {
        return this.b;
    }

    private final V p(com.dcinside.app.dccon.b b0) {
        long v = 0L;
        if(b0 == null) {
            return r0.a("", 0L);
        }
        String s = b0.i();
        if(s != null) {
            Long long0 = v.d1(s);
            if(long0 != null) {
                v = (long)long0;
            }
        }
        return r0.a("", v);
    }

    @y4.l
    public final View q() {
        return this.k;
    }

    @y4.l
    public final ResizeTextView r() {
        return this.d;
    }

    @y4.l
    public final ImageView s() {
        return this.h;
    }

    @m
    public final ResizeTextView t() {
        return this.e;
    }

    @y4.l
    public final ResizeTextView u() {
        return this.l;
    }

    @y4.l
    public final ImageView v() {
        return this.g;
    }

    @y4.l
    public final ResizeTextView w() {
        return this.c;
    }

    @y4.l
    public final ResizeTextView x() {
        return this.f;
    }

    @y4.l
    public final ImageView y() {
        return this.j;
    }

    @y4.l
    public final ResizeTextView z() {
        return this.i;
    }
}

