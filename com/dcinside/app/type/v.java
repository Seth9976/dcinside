package com.dcinside.app.type;

public enum v {
    NOTICE("notice"),
    UNUSED_BEST("best"),
    RECOMMENDED("recommend"),
    ALL("");

    private final String a;

    private v(String s1) {
        this.a = s1;
    }

    private static v[] a() [...] // Inlined contents

    public String b() {
        return this.a;
    }
}

