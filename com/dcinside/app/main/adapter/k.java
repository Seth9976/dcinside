package com.dcinside.app.main.adapter;

import androidx.recyclerview.widget.DiffUtil.Callback;
import com.dcinside.app.main.J0;
import com.dcinside.app.model.B;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class k extends Callback {
    @l
    private final List a;
    @l
    private final List b;

    public k(@l List list0, @l List list1) {
        L.p(list0, "newList");
        L.p(list1, "oldList");
        super();
        this.a = list0;
        this.b = list1;
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public boolean a(int v, int v1) {
        return L.g(this.b.get(v), this.a.get(v1));
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public boolean b(int v, int v1) {
        J0 j00 = (J0)this.b.get(v);
        J0 j01 = (J0)this.a.get(v1);
        if(j00.h() == j01.h()) {
            if(j00.b() != null) {
                B b0 = j01.b();
                if(L.g(j00.b().h(), (b0 == null ? null : b0.h()))) {
                    B b1 = j01.b();
                    return b1 != null && j00.b().i() == b1.i();
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public int d() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public int e() {
        return this.b.size();
    }
}

