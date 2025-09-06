package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

public class h {
    public static class a {
        private Map a;

        public a() {
            this.a = new HashMap();
        }

        @NonNull
        public h b() {
            return new h(this);
        }

        @NonNull
        public a c(@NonNull String s, boolean z) {
            this.a.put(s, Boolean.toString(z));
            return this;
        }

        @NonNull
        public a d(@NonNull String s, double f) {
            this.a.put(s, Double.toString(f));
            return this;
        }

        @NonNull
        public a e(@NonNull String s, float f) {
            this.a.put(s, Float.toString(f));
            return this;
        }

        @NonNull
        public a f(@NonNull String s, int v) {
            this.a.put(s, Integer.toString(v));
            return this;
        }

        @NonNull
        public a g(@NonNull String s, long v) {
            this.a.put(s, Long.toString(v));
            return this;
        }

        @NonNull
        public a h(@NonNull String s, @NonNull String s1) {
            this.a.put(s, s1);
            return this;
        }
    }

    final Map a;

    h(@NonNull a h$a0) {
        this.a = h$a0.a;
    }
}

