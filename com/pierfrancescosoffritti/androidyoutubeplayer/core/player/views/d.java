package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import androidx.annotation.VisibleForTesting;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.io.y;
import kotlin.jvm.internal.L;
import y4.l;

public final class d {
    @VisibleForTesting
    @l
    public static final String a(@l InputStream inputStream0) {
        String s;
        L.p(inputStream0, "inputStream");
        try {
            try {
                s = u.m3(y.j(new BufferedReader(new InputStreamReader(inputStream0, "utf-8"))), "\n", null, null, 0, null, null, 62, null);
            }
            catch(Exception unused_ex) {
                throw new RuntimeException("Can\'t parse HTML file.");
            }
        }
        catch(Throwable throwable0) {
            c.a(inputStream0, throwable0);
            throw throwable0;
        }
        c.a(inputStream0, null);
        return s;
    }
}

