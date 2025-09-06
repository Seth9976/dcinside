package com.dcinside.app.album.picker;

import A3.p;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.dl;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.m;

@s0({"SMAP\nPickerSortHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerSortHolder.kt\ncom/dcinside/app/album/picker/PickerSortHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,46:1\n1557#2:47\n1628#2,3:48\n37#3,2:51\n*S KotlinDebug\n*F\n+ 1 PickerSortHolder.kt\ncom/dcinside/app/album/picker/PickerSortHolder\n*L\n25#1:47\n25#1:48,3\n26#1:51,2\n*E\n"})
public final class l extends ViewHolder {
    @y4.l
    private final View a;
    @y4.l
    private final TextView b;

    public l(@y4.l View view0) {
        @f(c = "com.dcinside.app.album.picker.PickerSortHolder$1", f = "PickerSortHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final l l;

            a(l l0, d d0) {
                this.l = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.k();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.album.picker.PickerSortHolder$2", f = "PickerSortHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final l l;

            b(l l0, d d0) {
                this.l = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.k();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B09CA);  // id:picker_sort_icon
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B09CB);  // id:picker_sort_text
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        r.M(view1, null, new a(this, null), 1, null);
        r.M(((TextView)view2), null, new b(this, null), 1, null);
    }

    @y4.l
    public final TextView j() {
        return this.b;
    }

    private final void k() {
        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            @m
            public final Object a(@y4.l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.J(0x7F15009A);  // string:album_sort_title "정렬"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.album.picker.l.d extends N implements Function1 {
            public static final com.dcinside.app.album.picker.l.d e;

            static {
                com.dcinside.app.album.picker.l.d.e = new com.dcinside.app.album.picker.l.d();
            }

            com.dcinside.app.album.picker.l.d() {
                super(1);
            }

            public final Boolean a(Integer integer0) {
                L.m(integer0);
                return ((int)integer0) < 0 ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class e extends N implements Function1 {
            final l e;

            e(l l0) {
                this.e = l0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.n(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        Context context0 = this.itemView.getContext();
        com.dcinside.app.base.d d0 = context0 instanceof com.dcinside.app.base.d ? ((com.dcinside.app.base.d)context0) : null;
        if(d0 == null) {
            return;
        }
        kotlin.enums.a a0 = com.dcinside.app.album.m.b();
        ArrayList arrayList0 = new ArrayList(u.b0(a0, 10));
        for(Object object0: a0) {
            arrayList0.add(d0.getString(((com.dcinside.app.album.m)object0).d()));
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(d0).n(c.e), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(com.dcinside.app.album.picker.l.d.e, "$tmp0");
            return (Boolean)com.dcinside.app.album.picker.l.d.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new e(this), "$tmp0");
            new e(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean l(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void m(Function1 function10, Object object0) [...]

    private final void n(int v) {
        kotlin.enums.a a0 = com.dcinside.app.album.m.b();
        if(v >= 0 && v < a0.size()) {
            int v1 = ((com.dcinside.app.album.m)a0.get(v)).e();
            dl.a.y4(v1);
            Context context0 = this.itemView.getContext();
            PickerActivity pickerActivity0 = context0 instanceof PickerActivity ? ((PickerActivity)context0) : null;
            if(pickerActivity0 == null) {
                return;
            }
            PickerActivity.q2(pickerActivity0, null, 1, null);
        }
    }
}

