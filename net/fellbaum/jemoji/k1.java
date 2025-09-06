package net.fellbaum.jemoji;

import java.util.function.Function;

enum K1 {
    DISCORD(new H1()),
    GITHUB(new I1()),
    SLACK(new J1());

    private final Function a;

    private K1(Function function0) {
        this.a = function0;
    }

    public Function a() {
        return this.a;
    }
}

