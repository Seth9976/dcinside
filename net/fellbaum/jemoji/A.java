package net.fellbaum.jemoji;

import j..util.stream.IntStream.VivifiedWrapper;
import j..util.stream.IntStream;

public final class a {
    public static IntStream a(String s) {
        return IntStream.VivifiedWrapper.convert(s.codePoints());
    }
}

