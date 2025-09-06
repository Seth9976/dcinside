package com.dcinside.app.post.gui;

import A3.p;
import android.content.Context;
import android.view.View;
import androidx.annotation.StringRes;
import com.dcinside.app.base.i;
import com.dcinside.app.internal.r;
import com.dcinside.app.type.v;
import com.dcinside.app.util.vk;
import java.lang.ref.WeakReference;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nListTabManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListTabManager.kt\ncom/dcinside/app/post/gui/ListTabManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
public final class a implements i {
    public interface com.dcinside.app.post.gui.a.a {
        void B();

        void D(@l v arg1);

        boolean u(@l ListTabItemView arg1);
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[v.values().length];
            try {
                arr_v[v.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[v.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @l
    private final WeakReference a;
    @l
    private final ListTabItemView b;
    @l
    private final ListTabItemView[] c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    @l
    private v i;

    public a(@l v v0, @l View view0, @l com.dcinside.app.post.gui.a.a a$a0) {
        L.p(v0, "initialType");
        L.p(view0, "tabsView");
        L.p(a$a0, "onListTabEventListener");
        super();
        this.a = new WeakReference(a$a0);
        View view1 = view0.findViewById(0x7F0B0700);  // id:list_go_home
        L.o(view1, "findViewById(...)");
        this.b = (ListTabItemView)view1;
        ListTabItemView[] arr_listTabItemView = new ListTabItemView[4];
        View view2 = view0.findViewById(0x7F0B0716);  // id:list_notice
        L.o(view2, "findViewById(...)");
        arr_listTabItemView[0] = view2;
        View view3 = view0.findViewById(0x7F0B071B);  // id:list_recommended
        L.o(view3, "findViewById(...)");
        arr_listTabItemView[1] = view3;
        View view4 = view0.findViewById(0x7F0B071E);  // id:list_search
        L.o(view4, "findViewById(...)");
        arr_listTabItemView[2] = view4;
        View view5 = view0.findViewById(0x7F0B0725);  // id:list_write
        L.o(view5, "findViewById(...)");
        arr_listTabItemView[3] = view5;
        this.c = arr_listTabItemView;
        this.i = v0;
        this.g();
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        this.h(context0);
        this.f();
        this.p();
    }

    private final int c(int v) {
        switch(v) {
            case 0x7F0B0716: {  // id:list_notice
                return 0x7F0803E7;  // drawable:list_tab_notice
            }
            case 0x7F0B071B: {  // id:list_recommended
                return 0x7F0803E8;  // drawable:list_tab_recommend
            }
            case 0x7F0B071E: {  // id:list_search
                return 0x7F080292;  // drawable:ic_list_tab_search
            }
            case 0x7F0B0725: {  // id:list_write
                return 0x7F0803E9;  // drawable:list_tab_write
            }
            default: {
                return 0;
            }
        }
    }

    @StringRes
    private final int d(int v) {
        switch(v) {
            case 0x7F0B0716: {  // id:list_notice
                return 0x7F1506FF;  // string:notice "공지"
            }
            case 0x7F0B071B: {  // id:list_recommended
                return 0x7F150156;  // string:best_post "개념글"
            }
            case 0x7F0B071E: {  // id:list_search
                return 0x7F150903;  // string:search "검색"
            }
            case 0x7F0B0725: {  // id:list_write
                return 0x7F1507EB;  // string:post_write "글쓰기"
            }
            default: {
                return 0;
            }
        }
    }

    @l
    public final v e() {
        return this.i;
    }

    private final void f() {
        @f(c = "com.dcinside.app.post.gui.ListTabManager$initCallbacks$1", f = "ListTabManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final a l;

            c(a a0, d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.n();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.gui.ListTabManager$initCallbacks$2", f = "ListTabManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.gui.a.d extends o implements p {
            int k;
            Object l;
            final a m;

            com.dcinside.app.post.gui.a.d(a a0, d d0) {
                this.m = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.post.gui.a.d a$d0 = new com.dcinside.app.post.gui.a.d(this.m, d0);
                a$d0.l = view0;
                return a$d0.invokeSuspend(S0.a);
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
                View view0 = (View)this.l;
                ListTabItemView listTabItemView0 = view0 instanceof ListTabItemView ? ((ListTabItemView)view0) : null;
                if(listTabItemView0 == null) {
                    return S0.a;
                }
                this.m.o(listTabItemView0);
                return S0.a;
            }
        }

        c a$c0 = new c(this, null);
        r.M(this.b, null, a$c0, 1, null);
        ListTabItemView[] arr_listTabItemView = this.c;
        for(int v = 0; v < arr_listTabItemView.length; ++v) {
            r.M(arr_listTabItemView[v], null, new com.dcinside.app.post.gui.a.d(this, null), 1, null);
        }
    }

    private final void g() {
        this.c[0].setSelectAllow(true);
        this.c[1].setSelectAllow(true);
        this.c[0].setEnabled(this.d);
        this.c[1].setEnabled(this.d);
        this.c[2].setEnabled(this.f);
        this.c[3].setEnabled(this.g);
    }

    private final void h(Context context0) {
        int v = vk.b(context0, 0x7F040130);  // attr:colorBarIconActive
        int v1 = vk.b(context0, 0x7F040131);  // attr:colorBarIconInactive
        int v2 = vk.b(context0, 0x7F040132);  // attr:colorBarIconSelected
        int v3 = vk.b(context0, 0x7F040134);  // attr:colorBarTextActive
        int v4 = vk.b(context0, 0x7F040135);  // attr:colorBarTextInactive
        int v5 = vk.b(context0, 0x7F040136);  // attr:colorBarTextSelected
        int v6 = vk.b(context0, 0x7F040158);  // attr:colorPrimary
        com.dcinside.app.post.gui.ListTabItemView.a listTabItemView$a0 = new com.dcinside.app.post.gui.ListTabItemView.a(0x7F0803E6, 0x7F150531, v, v3, 0, 0, 0x20, null);  // drawable:list_tab_home
        com.dcinside.app.post.gui.ListTabItemView.a listTabItemView$a1 = new com.dcinside.app.post.gui.ListTabItemView.a(0x7F08069B, 0x7F150827, v2, v5, v6, 1);  // drawable:side_nav_whole
        this.b.F(listTabItemView$a0, listTabItemView$a0, listTabItemView$a0, listTabItemView$a0);
        ListTabItemView[] arr_listTabItemView = this.c;
        for(int v7 = 0; v7 < arr_listTabItemView.length; ++v7) {
            ListTabItemView listTabItemView0 = arr_listTabItemView[v7];
            int v8 = listTabItemView0.getId();
            int v9 = this.c(v8);
            int v10 = this.d(v8);
            ListTabItemView listTabItemView1 = listTabItemView0;
            com.dcinside.app.post.gui.ListTabItemView.a listTabItemView$a2 = new com.dcinside.app.post.gui.ListTabItemView.a(v9, v10, v, v3, 0, 0, 0x20, null);
            com.dcinside.app.post.gui.ListTabItemView.a listTabItemView$a3 = new com.dcinside.app.post.gui.ListTabItemView.a(v9, v10, v1, v4, 0, 0, 0x20, null);
            if(listTabItemView1.B()) {
                listTabItemView1.F(listTabItemView$a3, listTabItemView$a1, listTabItemView$a2, listTabItemView$a3);
            }
            else {
                if(!listTabItemView1.C()) {
                }
                listTabItemView1.F(listTabItemView$a3, listTabItemView$a2, listTabItemView$a2, listTabItemView$a3);
            }
        }
    }

    public final boolean i() {
        return this.h;
    }

    public final boolean j() {
        return this.e;
    }

    public final boolean k() {
        return this.f;
    }

    public final boolean l() {
        return this.d;
    }

    public final boolean m() {
        return this.g;
    }

    private final void n() {
        com.dcinside.app.post.gui.a.a a$a0 = (com.dcinside.app.post.gui.a.a)this.a.get();
        if(a$a0 == null) {
            return;
        }
        a$a0.B();
    }

    private final void o(ListTabItemView listTabItemView0) {
        v v0;
        com.dcinside.app.post.gui.a.a a$a0 = (com.dcinside.app.post.gui.a.a)this.a.get();
        if(a$a0 == null) {
            return;
        }
        if(a$a0.u(listTabItemView0)) {
            return;
        }
        if(listTabItemView0.isSelected()) {
            v0 = v.e;
            goto label_14;
        }
        else {
            ListTabItemView[] arr_listTabItemView = this.c;
            if(listTabItemView0 == arr_listTabItemView[0]) {
                v0 = v.b;
                goto label_14;
            }
            else if(listTabItemView0 == arr_listTabItemView[1]) {
                v0 = v.d;
            label_14:
                if(this.i == v0) {
                    return;
                }
                this.u(v0);
                a$a0.D(v0);
            }
        }
    }

    private final void p() {
        int v;
        switch(this.i) {
            case 1: {
                v = this.c[0].getId();
                break;
            }
            case 2: {
                v = this.c[1].getId();
                break;
            }
            default: {
                v = 0;
            }
        }
        ListTabItemView[] arr_listTabItemView = this.c;
        for(int v1 = 0; v1 < arr_listTabItemView.length; ++v1) {
            ListTabItemView listTabItemView0 = arr_listTabItemView[v1];
            listTabItemView0.setSelected(listTabItemView0.getId() == v);
        }
    }

    public final void q(boolean z) {
        this.h = z;
        this.c[3].setTintOnly(z);
    }

    public final void r(boolean z) {
        this.e = z;
        this.c[0].setNew(z);
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
    }

    public final void s(boolean z) {
        this.f = z;
        this.c[2].setEnabled(z);
    }

    public final void t(boolean z) {
        this.d = z;
        this.c[0].setEnabled(z);
        this.c[1].setEnabled(z);
    }

    public final void u(@l v v0) {
        L.p(v0, "newType");
        this.i = v0;
        this.p();
    }

    public final void v(boolean z) {
        this.g = z;
        this.c[3].setEnabled(z);
    }
}

