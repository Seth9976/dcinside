package androidx.browser.trusted;

import android.net.Uri;

public final class k implements Runnable {
    public final TrustedWebActivityServiceConnectionPool a;
    public final Uri b;

    public k(TrustedWebActivityServiceConnectionPool trustedWebActivityServiceConnectionPool0, Uri uri0) {
        this.a = trustedWebActivityServiceConnectionPool0;
        this.b = uri0;
    }

    @Override
    public final void run() {
        this.a.e(this.b);
    }
}

