package com.google.protobuf;

import java.io.IOException;

@k
interface c0 {
    boolean equals(Object arg1, Object arg2);

    int getSerializedSize(Object arg1);

    int hashCode(Object arg1);

    boolean isInitialized(Object arg1);

    void makeImmutable(Object arg1);

    void mergeFrom(Object arg1, a0 arg2, ExtensionRegistryLite arg3) throws IOException;

    void mergeFrom(Object arg1, Object arg2);

    void mergeFrom(Object arg1, byte[] arg2, int arg3, int arg4, b arg5) throws IOException;

    Object newInstance();

    void writeTo(Object arg1, Writer arg2) throws IOException;
}

