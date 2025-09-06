package com.dcinside.app.image;

import com.dcinside.app.realm.z;
import io.realm.F0.d;
import io.realm.F0;

public final class n implements d {
    public final z a;

    public n(z z0) {
        this.a = z0;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        ImageDownloadWorker.p(this.a, f00);
    }
}

