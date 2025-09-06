package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

public interface k {
    public static enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int a;

        private a(int v1) {
            this.a = v1;
        }

        private static a[] a() [...] // Inlined contents

        public int b() {
            return this.a;
        }
    }

    @NonNull
    a a(@NonNull String arg1);
}

