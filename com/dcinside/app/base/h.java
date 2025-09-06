package com.dcinside.app.base;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import io.realm.F0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nRealmBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealmBaseFragment.kt\ncom/dcinside/app/base/RealmBaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public class h extends Fragment {
    @m
    private F0 a;

    public h() {
        this(0, 1, null);
    }

    public h(@LayoutRes int v) {
        super(v);
    }

    public h(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    @l
    public final F0 i0() {
        F0 f00 = this.a;
        L.m(f00);
        return f00;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        F0 f00 = this.a;
        if(f00 != null) {
            if(f00.isClosed()) {
                f00 = null;
            }
            if(f00 != null) {
                f00.y4();
                f00.close();
            }
        }
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        F0 f00 = this.a;
        if(f00 != null) {
            if(f00.isClosed()) {
                f00 = null;
            }
            if(f00 != null) {
                f00.y4();
                f00.close();
            }
        }
        this.a = F0.g4();
    }
}

