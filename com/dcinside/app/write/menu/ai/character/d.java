package com.dcinside.app.write.menu.ai.character;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class d implements p {
    public final Function1 a;

    public d(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return CharaPromptSearchActivity.Y1(this.a, object0);
    }
}

