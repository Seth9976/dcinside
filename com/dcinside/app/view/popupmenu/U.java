package com.dcinside.app.view.popupmenu;

import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.post.c0;
import com.dcinside.app.post.fragments.N3;
import com.dcinside.app.type.J;
import com.dcinside.app.util.dl;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

public final class u extends a {
    public u(@l N3 n30) {
        L.p(n30, "f");
        super(n30);
    }

    @Override  // com.dcinside.app.view.popupmenu.a
    public boolean b(Object object0, com.dcinside.app.view.popupmenu.l l0) {
        return this.h(((N3)object0), l0);
    }

    @Override  // com.dcinside.app.view.popupmenu.a
    public void e(Object object0, int v) {
        this.i(((N3)object0), v);
    }

    public boolean h(@l N3 n30, @l com.dcinside.app.view.popupmenu.l l0) {
        static final class com.dcinside.app.view.popupmenu.u.a extends N implements Function1 {
            public final class com.dcinside.app.view.popupmenu.u.a.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[J.values().length];
                    try {
                        arr_v[J.c.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[J.d.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    com.dcinside.app.view.popupmenu.u.a.a.a = arr_v;
                }
            }

            final u e;
            final FragmentActivity f;

            com.dcinside.app.view.popupmenu.u.a(u u0, FragmentActivity fragmentActivity0) {
                this.e = u0;
                this.f = fragmentActivity0;
                super(1);
            }

            public final void a(@l d l$d0) {
                L.p(l$d0, "$this$section");
                int v = dl.a.i2();
                switch(J.b.a(v)) {
                    case 1: {
                        a.d(this.e, l$d0, this.f, 0x7F150046, 0x7F0802EF, null, null, 0, false, null, 0xB8, null);  // string:action_post_split_ratio_item1 "1:1 비율로 변경"
                        break;
                    }
                    case 2: {
                        a.d(this.e, l$d0, this.f, 0x7F150045, 0x7F0802EE, null, null, 0, false, null, 0xB8, null);  // string:action_post_split_ratio_item0 "기본 비율로 변경"
                    }
                }
                a.d(this.e, l$d0, this.f, 0x7F15003B, 0x7F0802D6, null, null, 0, false, null, 0xF8, null);  // string:action_post_full_menu_remove "버튼 제거"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((d)object0));
                return S0.a;
            }
        }

        L.p(n30, "parent");
        L.p(l0, "builder");
        FragmentActivity fragmentActivity0 = n30.getActivity();
        if(fragmentActivity0 == null) {
            return false;
        }
        L.m(fragmentActivity0);
        l0.c(new com.dcinside.app.view.popupmenu.u.a(this, fragmentActivity0));
        return true;
    }

    public void i(@l N3 n30, int v) {
        L.p(n30, "parent");
        FragmentActivity fragmentActivity0 = n30.getActivity();
        c0 c00 = fragmentActivity0 instanceof c0 ? ((c0)fragmentActivity0) : null;
        if(c00 == null) {
            return;
        }
        switch(v) {
            case 0x7F15003B: {  // string:action_post_full_menu_remove "버튼 제거"
                n30.V8();
                break;
            }
            case 0x7F150045: {  // string:action_post_split_ratio_item0 "기본 비율로 변경"
                dl.a.Y5(J.c.c());
                c00.A5();
                break;
            }
            case 0x7F150046: {  // string:action_post_split_ratio_item1 "1:1 비율로 변경"
                dl.a.Y5(J.d.c());
                c00.A5();
            }
        }
        n30.w8(true, 0x7F080251);  // drawable:ic_expand_picker
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
    }
}

