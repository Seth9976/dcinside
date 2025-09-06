package kotlin.time;

import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

class k extends j {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[h.values().length];
            try {
                arr_v[h.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[h.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[h.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[h.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[h.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[h.g.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[h.h.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @h0(version = "1.5")
    @l
    public static final h f(char c, boolean z) {
        if(!z) {
            if(c != 68) {
                throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
            }
            return h.h;
        }
        switch(c) {
            case 72: {
                return h.g;
            }
            case 77: {
                return h.f;
            }
            case 83: {
                return h.e;
            }
            default: {
                throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
            }
        }
    }

    @h0(version = "1.5")
    @l
    public static final h g(@l String s) {
        L.p(s, "shortName");
        switch(s) {
            case "d": {
                return h.h;
            }
            case "h": {
                return h.g;
            }
            case "m": {
                return h.f;
            }
            case "ms": {
                return h.d;
            }
            case "ns": {
                return h.b;
            }
            case "s": {
                return h.e;
            }
            case "us": {
                return h.c;
            }
            default: {
                throw new IllegalArgumentException("Unknown duration unit short name: " + s);
            }
        }
    }

    @h0(version = "1.3")
    @l
    public static final String h(@l h h0) {
        L.p(h0, "<this>");
        switch(h0) {
            case 1: {
                return "ns";
            }
            case 2: {
                return "us";
            }
            case 3: {
                return "ms";
            }
            case 4: {
                return "s";
            }
            case 5: {
                return "m";
            }
            case 6: {
                return "h";
            }
            case 7: {
                return "d";
            }
            default: {
                throw new IllegalStateException(("Unknown unit: " + h0).toString());
            }
        }
    }
}

