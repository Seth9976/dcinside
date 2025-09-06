package com.google.firebase.sessions;

import com.google.firebase.encoders.json.g;

public enum j implements g {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int a;

    private j(int v1) {
        this.a = v1;
    }

    private static final j[] a() [...] // Inlined contents

    @Override  // com.google.firebase.encoders.json.g
    public int getNumber() {
        return this.a;
    }
}

