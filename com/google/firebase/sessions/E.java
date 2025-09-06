package com.google.firebase.sessions;

import com.google.firebase.encoders.json.g;

public enum e implements g {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int a;

    private e(int v1) {
        this.a = v1;
    }

    private static final e[] a() [...] // Inlined contents

    @Override  // com.google.firebase.encoders.json.g
    public int getNumber() {
        return this.a;
    }
}

