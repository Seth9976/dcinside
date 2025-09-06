package com.google.crypto.tink.jwt;

import com.google.crypto.tink.internal.JsonParser;
import com.google.gson.m;
import com.google.gson.n;
import java.io.IOException;

final class a {
    static boolean a(String s) {
        return JsonParser.b(s);
    }

    static m b(String s) throws g {
        try {
            return JsonParser.c(s).n();
        }
        catch(IllegalStateException | n | IOException illegalStateException0) {
            throw new g("invalid JSON: " + illegalStateException0);
        }
    }

    static com.google.gson.g c(String s) throws g {
        try {
            return JsonParser.c(s).l();
        }
        catch(IllegalStateException | n | IOException illegalStateException0) {
            throw new g("invalid JSON: " + illegalStateException0);
        }
    }
}

