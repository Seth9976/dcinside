package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class x extends y {
    private final List a;

    public x(List list0) {
        super("Dependency cycle detected: " + Arrays.toString(list0.toArray()));
        this.a = list0;
    }

    public List a() {
        return this.a;
    }
}

