package com.google.firebase.perf.util;

import androidx.annotation.NonNull;

public class b {
    public static enum a {
        TRACE_EVENT_RATE_LIMITED("_fstec"),
        NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
        TRACE_STARTED_NOT_STOPPED("_tsns"),
        FRAMES_TOTAL("_fr_tot"),
        FRAMES_SLOW("_fr_slo"),
        FRAMES_FROZEN("_fr_fzn");

        private String a;

        private a(@NonNull String s1) {
            this.a = s1;
        }

        private static a[] a() [...] // Inlined contents

        @Override
        public String toString() {
            return this.a;
        }
    }

    public static enum com.google.firebase.perf.util.b.b {
        APP_START_TRACE_NAME("_as"),
        ON_CREATE_TRACE_NAME("_astui"),
        ON_START_TRACE_NAME("_astfd"),
        ON_RESUME_TRACE_NAME("_asti"),
        FOREGROUND_TRACE_NAME("_fs"),
        BACKGROUND_TRACE_NAME("_bs");

        private String a;

        private com.google.firebase.perf.util.b.b(@NonNull String s1) {
            this.a = s1;
        }

        private static com.google.firebase.perf.util.b.b[] a() [...] // Inlined contents

        @Override
        public String toString() {
            return this.a;
        }
    }

    public static final String a = "FirebasePerfSharedPrefs";
    public static final String b = "isEnabled";
    public static final double c = 0.0;
    public static final double d = 1.0;
    public static final int e = 2000;
    public static final int f = 0xFF;
    public static final int g = 0x80;
    public static final int h = 5;
    public static final int i = 100;
    public static final int j = 100;
    public static final int k = 40;
    public static final int l = 100;
    public static final int m = 1;
    public static final int n = 100;
    public static final int o = 500;
    public static final String p = "_st_";
    public static final String q = "Parent_fragment";
    public static final String r = "Hosting_activity";
    public static final String s = "No parent";
    public static final int t = 16;
    public static final int u = 700;

}

