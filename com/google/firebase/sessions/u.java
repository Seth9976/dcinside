package com.google.firebase.sessions;

import com.google.firebase.encoders.json.g;

public enum u implements g {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int a;

    private u(int v1) {
        this.a = v1;
    }

    private static final u[] a() [...] // Inlined contents

    @Override  // com.google.firebase.encoders.json.g
    public int getNumber() {
        return this.a;
    }
}

