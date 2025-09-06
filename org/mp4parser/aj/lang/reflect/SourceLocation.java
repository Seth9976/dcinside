package org.mp4parser.aj.lang.reflect;

public interface SourceLocation {
    int getColumn();

    String getFileName();

    int getLine();

    Class getWithinType();
}

