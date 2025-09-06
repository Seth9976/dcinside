package com.dcinside.app.type;

public enum i {
    MY("my_gall"),
    FAVORITE("favori_gall"),
    FAVORITE_SORT("favori_gall_sort"),
    DELETE_ALL("favori_all_del");

    private final String a;

    private i(String s1) {
        this.a = s1;
    }

    private static i[] a() [...] // Inlined contents

    public String b() {
        return this.a;
    }
}

