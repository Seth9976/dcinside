package androidx.datastore.preferences.protobuf;

import java.io.IOException;

interface Schema {
    void a(Object arg1, Writer arg2) throws IOException;

    void b(Object arg1, Reader arg2, ExtensionRegistryLite arg3) throws IOException;

    void c(Object arg1, byte[] arg2, int arg3, int arg4, Registers arg5) throws IOException;

    boolean equals(Object arg1, Object arg2);

    int getSerializedSize(Object arg1);

    int hashCode(Object arg1);

    boolean isInitialized(Object arg1);

    void makeImmutable(Object arg1);

    void mergeFrom(Object arg1, Object arg2);

    Object newInstance();
}

