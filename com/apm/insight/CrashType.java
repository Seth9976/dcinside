package com.apm.insight;

public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL("all");

    private String mName;

    private CrashType(String s1) {
        this.mName = s1;
    }

    public final String getName() {
        return this.mName;
    }

    @Override
    public final String toString() {
        return this.getName();
    }
}

