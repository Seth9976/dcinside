package com.dcinside.app.write.menu.ai.type;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public enum e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final e a(@m String s) {
            e e0 = e.e;
            if(!L.g(s, "Euler")) {
                e0 = e.f;
                if(!L.g(s, "Euler a")) {
                    e0 = e.g;
                    if(!L.g(s, "DPM++ 2M")) {
                        e0 = e.h;
                        if(!L.g(s, "DPM++ 2M SDE Heun Karras")) {
                            e0 = e.i;
                            if(!L.g(s, "DPM++ 2M SDE Exponential")) {
                                e0 = e.j;
                                if(!L.g(s, "DPM++ 3M SDE")) {
                                    e0 = e.k;
                                    if(!L.g(s, "DPM++ 3M SDE Karras")) {
                                        return L.g(s, "DPM++ 3M SDE Exponential") ? e.l : null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return e0;
        }
    }

    EULER("Euler", 0x7F1505BA, 0x7F0800D6),  // string:make_ai_image_sampling_euler "Euler"
    EULER_A("Euler a", 0x7F1505BB, 0x7F0800D7),  // string:make_ai_image_sampling_euler_a "Euler a"
    DPM2("DPM++ 2M", 0x7F1505B4, 0x7F0800D0),  // string:make_ai_image_sampling_dpm2 "DPM++ 2M"
    DPM2_KARRAS("DPM++ 2M SDE Heun Karras", 0x7F1505B6, 0x7F0800D2),  // string:make_ai_image_sampling_dpm2_karras "DPM++ 2M SDE Heun Karras"
    DPM2_EXPO("DPM++ 2M SDE Exponential", 0x7F1505B5, 0x7F0800D1),  // string:make_ai_image_sampling_dpm2_expo "DPM++ 2M SDE Exponential"
    DPM3_SDE("DPM++ 3M SDE", 0x7F1505B9, 0x7F0800D5),  // string:make_ai_image_sampling_dpm3_sde "DPM++ 3M SDE"
    DPM3_KARRAS("DPM++ 3M SDE Karras", 0x7F1505B8, 0x7F0800D4),  // string:make_ai_image_sampling_dpm3_karras "DPM++ 3M SDE Karras"
    DPM3_EXPO("DPM++ 3M SDE Exponential", 0x7F1505B7, 0x7F0800D3);  // string:make_ai_image_sampling_dpm3_expo "DPM++ 3M SDE Exponential"

    @l
    private final String a;
    private final int b;
    private final int c;
    @l
    public static final a d;
    private static final e[] m;
    private static final kotlin.enums.a n;

    static {
        e.m = arr_e;
        L.p(arr_e, "entries");
        e.n = new d(arr_e);
        e.d = new a(null);
    }

    private e(String s1, int v1, int v2) {
        this.a = s1;
        this.b = v1;
        this.c = v2;
    }

    private static final e[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return e.n;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    @l
    public final String e() {
        return this.a;
    }
}

