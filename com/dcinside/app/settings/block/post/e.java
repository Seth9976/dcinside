package com.dcinside.app.settings.block.post;

import io.realm.F0.d;
import io.realm.F0;
import java.util.List;

public final class e implements d {
    public final BlockItemAddActivity a;
    public final List b;

    public e(BlockItemAddActivity blockItemAddActivity0, List list0) {
        this.a = blockItemAddActivity0;
        this.b = list0;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        BlockItemAddActivity.Z1(this.a, this.b, f00);
    }
}

