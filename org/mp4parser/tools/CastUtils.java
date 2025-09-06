package org.mp4parser.tools;

public class CastUtils {
    public static int l2i(long v) {
        if(v > 0x7FFFFFFFL || v < 0xFFFFFFFF80000000L) {
            throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group (" + v + ")");
        }
        return (int)v;
    }
}

