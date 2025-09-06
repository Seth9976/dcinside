package com.dcinside.app.util;

import com.google.gson.Gson;
import kotlin.jvm.functions.Function1;

public final class sk implements Function1 {
    public final Gson a;

    public sk(Gson gson0) {
        this.a = gson0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.QB(this.a, ((String)object0));
    }
}

