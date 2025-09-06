package com.dcinside.app.util.otp;

import javax.crypto.Mac;

public final class a implements com.dcinside.app.util.otp.g.a {
    public final Mac a;

    public a(Mac mac0) {
        this.a = mac0;
    }

    @Override  // com.dcinside.app.util.otp.g$a
    public final byte[] a(byte[] arr_b) {
        return this.a.doFinal(arr_b);
    }
}

