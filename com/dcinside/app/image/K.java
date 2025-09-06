package com.dcinside.app.image;

import com.dcinside.app.realm.z;
import io.realm.F0.d;
import io.realm.F0;

public final class k implements d {
    public final z a;

    public k(z z0) {
        this.a = z0;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        ImageDownloadWorker.g(this.a, f00);
    }
}

