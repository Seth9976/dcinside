package com.dcinside.app.head;

import A3.p;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.util.Dl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.collections.P;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nHeadSelectionMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadSelectionMenu.kt\ncom/dcinside/app/head/HeadSelectionMenu\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n1#2:131\n1#2:142\n1611#3,9:132\n1863#3:141\n1864#3:143\n1620#3:144\n360#3,7:147\n37#4,2:145\n*S KotlinDebug\n*F\n+ 1 HeadSelectionMenu.kt\ncom/dcinside/app/head/HeadSelectionMenu\n*L\n78#1:142\n78#1:132,9\n78#1:141\n78#1:143\n78#1:144\n108#1:147,7\n78#1:145,2\n*E\n"})
public final class e {
    public interface b {
        @m
        CharSequence a(@m CharSequence arg1);
    }

    public interface c {
        boolean b(@m PostHead arg1, @m PostHead arg2);
    }

    private final boolean a;
    private final boolean b;
    @l
    private final List c;
    @m
    private WeakReference d;
    @l
    private final WeakReference e;
    @l
    private final WeakReference f;
    @l
    private final WeakReference g;
    private int h;

    public e(@l Context context0, @m TextView textView0, boolean z, boolean z1, @l List list0, @m PostHead postHead0, @m b e$b0) {
        @f(c = "com.dcinside.app.head.HeadSelectionMenu$1", f = "HeadSelectionMenu.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final e l;

            a(e e0, d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.o();
                return S0.a;
            }
        }


        static final class com.dcinside.app.head.e.d extends N implements Function1 {
            final e e;

            com.dcinside.app.head.e.d(e e0) {
                this.e = e0;
                super(1);
            }

            @l
            public final Boolean a(@l P p0) {
                L.p(p0, "it");
                return Boolean.valueOf(this.e.i(((PostHead)p0.f()).l()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((P)object0));
            }
        }

        L.p(context0, "context");
        CharSequence charSequence1;
        CharSequence charSequence0;
        Iterator iterator1;
        Object object3;
        P p0;
        L.p(list0, "list");
        super();
        this.a = z;
        this.b = z1;
        this.c = list0;
        this.e = new WeakReference(e$b0);
        this.f = new WeakReference(context0);
        this.g = new WeakReference(textView0);
        this.h = -1;
        List list1 = kotlin.sequences.p.c3(kotlin.sequences.p.p0(kotlin.sequences.p.k3(u.A1(list0)), new com.dcinside.app.head.e.d(this)));
        Object object0 = null;
        if(textView0 != null) {
            r.M(textView0, null, new a(this, null), 1, null);
        }
        if(textView0 != null) {
            if(!list1.isEmpty()) {
                if(postHead0 == null) {
                    object3 = null;
                    iterator1 = list1.iterator();
                label_30:
                    while(iterator1.hasNext()) {
                        Object object4 = iterator1.next();
                        if(((PostHead)((P)object4).f()).o()) {
                            object3 = object4;
                            break;
                        }
                    }
                    p0 = (P)object3;
                    if(p0 == null) {
                        for(Object object5: list1) {
                            if(((PostHead)((P)object5).f()).i() == 0) {
                                object0 = object5;
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                        p0 = (P)object0;
                        if(p0 == null) {
                            p0 = (P)u.B2(list1);
                        }
                    }
                }
                else {
                    Object object1 = null;
                    for(Object object2: list1) {
                        if(((PostHead)((P)object2).f()).i() == postHead0.i()) {
                            object1 = object2;
                            break;
                        }
                    }
                    p0 = (P)object1;
                    if(p0 == null) {
                        object3 = null;
                        iterator1 = list1.iterator();
                        goto label_30;
                    }
                }
                this.h = p0.e();
                charSequence0 = ((PostHead)p0.f()).m();
                if(e$b0 != null) {
                    charSequence1 = e$b0.a(charSequence0);
                    if(charSequence1 != null) {
                        charSequence0 = charSequence1;
                    }
                }
            }
            else if(e$b0 == null) {
                charSequence0 = "말머리를 선택할 수 없습니다.";
                L.o("말머리를 선택할 수 없습니다.", "getString(...)");
            }
            else {
                charSequence1 = e$b0.a(null);
                if(charSequence1 == null) {
                    charSequence0 = "말머리를 선택할 수 없습니다.";
                    L.o("말머리를 선택할 수 없습니다.", "getString(...)");
                }
                else {
                    charSequence0 = charSequence1;
                }
            }
            textView0.setText(charSequence0);
        }
    }

    public e(Context context0, TextView textView0, boolean z, boolean z1, List list0, PostHead postHead0, b e$b0, int v, w w0) {
        this(context0, textView0, z, z1, list0, ((v & 0x20) == 0 ? postHead0 : null), ((v & 0x40) == 0 ? e$b0 : null));
    }

    private final void h(TextView textView0, int v) {
        textView0.setAlpha((this.i(v) ? 1.0f : 0.4f));
    }

    private final boolean i(int v) {
        switch(v) {
            case 1: {
                return this.a;
            }
            case 9: {
                return this.b;
            }
            default: {
                return true;
            }
        }
    }

    private final boolean j(int v) {
        switch(v) {
            case 1: {
                if(!this.a) {
                    Context context0 = (Context)this.f.get();
                    if(context0 != null) {
                        Dl.D(context0, 0x7F150BAE);  // string:write_head_grant_user "@com.dcinside.app.android:string/please_login_request"
                    }
                }
                return this.a;
            }
            case 9: {
                if(!this.b) {
                    Context context1 = (Context)this.f.get();
                    if(context1 != null) {
                        Dl.D(context1, 0x7F150BAD);  // string:write_head_grant_manager "매니저만 이용할 수 있습니다."
                    }
                }
                return this.b;
            }
            default: {
                return true;
            }
        }
    }

    private final void k(int v) {
        boolean z;
        TextView textView0 = (TextView)this.g.get();
        if(textView0 == null) {
            return;
        }
        if(v < 0) {
            return;
        }
        PostHead postHead0 = this.h < 0 ? null : ((PostHead)this.c.get(this.h));
        PostHead postHead1 = (PostHead)this.c.get(v);
        WeakReference weakReference0 = this.d;
        if(weakReference0 == null) {
            z = true;
        }
        else {
            c e$c0 = (c)weakReference0.get();
            z = e$c0 == null ? true : e$c0.b(postHead0, postHead1);
        }
        if(z) {
            this.h = v;
            CharSequence charSequence0 = postHead1.m();
            b e$b0 = (b)this.e.get();
            if(e$b0 != null) {
                CharSequence charSequence1 = e$b0.a(charSequence0);
                if(charSequence1 != null) {
                    charSequence0 = charSequence1;
                }
            }
            textView0.setText(charSequence0);
        }
    }

    public final void l(@l c e$c0) {
        L.p(e$c0, "onSelection");
        this.d = new WeakReference(e$c0);
    }

    public final void m(@m PostHead postHead0, boolean z) {
        int v = -1;
        if(postHead0 != null) {
            int v1 = 0;
            for(Object object0: this.c) {
                if(((PostHead)object0).i() == postHead0.i()) {
                    v = v1;
                    break;
                }
                ++v1;
            }
        }
        CharSequence charSequence0 = null;
        PostHead postHead1 = this.h < 0 ? null : ((PostHead)this.c.get(this.h));
        boolean z1 = true;
        if(z) {
            WeakReference weakReference0 = this.d;
            if(weakReference0 != null) {
                c e$c0 = (c)weakReference0.get();
                if(e$c0 != null) {
                    z1 = e$c0.b(postHead1, postHead0);
                }
            }
        }
        if(z1) {
            this.h = v;
            if(postHead0 != null) {
                charSequence0 = postHead0.m();
            }
            TextView textView0 = (TextView)this.g.get();
            if(textView0 != null) {
                b e$b0 = (b)this.e.get();
                if(e$b0 != null) {
                    CharSequence charSequence1 = e$b0.a(charSequence0);
                    if(charSequence1 != null) {
                        charSequence0 = charSequence1;
                    }
                }
                textView0.setText(charSequence0);
            }
        }
    }

    public static void n(e e0, PostHead postHead0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        e0.m(postHead0, z);
    }

    private final void o() {
        static final class com.dcinside.app.head.e.e extends N implements Function1 {
            public static final com.dcinside.app.head.e.e e;

            static {
                com.dcinside.app.head.e.e.e = new com.dcinside.app.head.e.e();
            }

            com.dcinside.app.head.e.e() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.J(0x7F150441);  // string:head_select_title "말머리 선택"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.head.e.f extends N implements A3.o {
            final e e;

            com.dcinside.app.head.e.f(e e0) {
                this.e = e0;
                super(2);
            }

            public final void a(@l TextView textView0, int v) {
                L.p(textView0, "v");
                int v1 = ((PostHead)this.e.c.get(v)).l();
                this.e.h(textView0, v1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((TextView)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }


        static final class g extends N implements Function1 {
            final e e;

            g(e e0) {
                this.e = e0;
                super(1);
            }

            @l
            public final Boolean a(int v) {
                int v1 = ((PostHead)this.e.c.get(v)).l();
                return Boolean.valueOf(this.e.j(v1));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }


        static final class h extends N implements Function1 {
            final e e;

            h(e e0) {
                this.e = e0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.k(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        Context context0 = (Context)this.f.get();
        if(context0 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.c) {
            String s = ((PostHead)object0).m();
            if(s != null) {
                arrayList0.add(s);
            }
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        if(arr_s.length == 0) {
            return;
        }
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).n(com.dcinside.app.head.e.e.e), arr_s, 0, 2, null).s(new com.dcinside.app.head.e.f(this)).r(new g(this)).d().x5((Object object0) -> {
            L.p(new h(this), "$tmp0");
            new h(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void p(Function1 function10, Object object0) [...]
}

