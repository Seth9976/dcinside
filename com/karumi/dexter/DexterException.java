package com.karumi.dexter;

import com.karumi.dexter.listener.DexterError;

final class DexterException extends IllegalStateException {
    final DexterError error;

    DexterException(String s, DexterError dexterError0) {
        super(s);
        this.error = dexterError0;
    }
}

