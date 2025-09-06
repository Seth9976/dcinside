package com.getkeepsafe.relinker;

import java.util.Arrays;

public class c extends RuntimeException {
    public c(String s, String[] arr_s, String[] arr_s1) {
        super("Could not find \'" + s + "\'. Looked for: " + Arrays.toString(arr_s) + ", but only found: " + Arrays.toString(arr_s1) + ".");
    }
}

