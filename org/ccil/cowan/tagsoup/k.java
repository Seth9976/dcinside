package org.ccil.cowan.tagsoup;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class k implements b {
    private final l a;

    k(l l0) {
        this.a = l0;
        super();
    }

    @Override  // org.ccil.cowan.tagsoup.b
    public Reader a(InputStream inputStream0) {
        return new InputStreamReader(inputStream0);
    }
}

