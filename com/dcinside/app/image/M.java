package com.dcinside.app.image;

import com.dcinside.app.realm.z;
import io.realm.F0.d;
import io.realm.F0;

public final class m implements d {
    public final z a;
    public final String b;

    public m(z z0, String s) {
        this.a = z0;
        this.b = s;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        ImageDownloadWorker.i(this.a, this.b, f00);
    }
}

