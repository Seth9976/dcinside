package com.dcinside.app.write.menu.ai.lora;

import androidx.recyclerview.widget.DiffUtil.Callback;
import com.dcinside.app.write.menu.ai.type.LoraModel;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class c extends Callback {
    @l
    private final List a;
    @l
    private final List b;

    public c(@l List list0, @l List list1) {
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
        return L.g(((LoraModel)this.b.get(v)).f(), ((LoraModel)this.a.get(v1)).f());
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

