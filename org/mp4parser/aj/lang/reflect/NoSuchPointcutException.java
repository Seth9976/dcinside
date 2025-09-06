package org.mp4parser.aj.lang.reflect;

public class NoSuchPointcutException extends Exception {
    private String name;
    private static final long serialVersionUID = 0x2D31373336313830L;

    public NoSuchPointcutException(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }
}

