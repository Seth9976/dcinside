package com.dcinside.app.settings.block.post;

import io.realm.F0;

public final class d implements io.realm.F0.d {
    public final BlockItemAddActivity a;
    public final String b;

    public d(BlockItemAddActivity blockItemAddActivity0, String s) {
        this.a = blockItemAddActivity0;
        this.b = s;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        BlockItemAddActivity.c2(this.a, this.b, f00);
    }
}

