package com.dcinside.app;

import java.util.concurrent.Callable;

public final class a implements Callable {
    public final Application a;

    public a(Application application0) {
        this.a = application0;
    }

    @Override
    public final Object call() {
        return Application.d(this.a);
    }
}

