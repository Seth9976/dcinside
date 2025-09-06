package org.mp4parser;

public interface FullBox extends ParsableBox {
    int getFlags();

    int getVersion();

    void setFlags(int arg1);

    void setVersion(int arg1);
}

