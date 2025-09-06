package com.dcinside.app.type;

public enum h {
    LIST("list"),
    RECENT("recent"),
    INSERT("insert"),
    LAYER("package_detail"),
    BUY("buy_dccon"),
    SETTING_LIST("setting"),
    SETTING_SAVE("setting_save");

    private final String a;

    private h(String s1) {
        this.a = s1;
    }

    private static h[] a() [...] // Inlined contents

    public String b() {
        return this.a;
    }
}

