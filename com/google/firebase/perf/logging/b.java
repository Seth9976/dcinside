package com.google.firebase.perf.logging;

public final class b {
    private static final String a = "https://console.firebase.google.com";
    private static final String b = "android-ide";
    private static final String c = "perf-android-sdk";

    public static String a(String s, String s1, String s2) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", b.d(s, s1), s2, "perf-android-sdk", "android-ide");
    }

    public static String b(String s, String s1) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", b.d(s, s1), "perf-android-sdk", "android-ide");
    }

    public static String c(String s, String s1, String s2) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", b.d(s, s1), s2, "perf-android-sdk", "android-ide");
    }

    private static String d(String s, String s1) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", s, s1);
    }
}

