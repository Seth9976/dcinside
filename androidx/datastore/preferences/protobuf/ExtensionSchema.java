package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Map.Entry;

abstract class ExtensionSchema {
    abstract int a(Map.Entry arg1);

    abstract Object b(ExtensionRegistryLite arg1, MessageLite arg2, int arg3);

    abstract FieldSet c(Object arg1);

    abstract FieldSet d(Object arg1);

    abstract boolean e(MessageLite arg1);

    abstract void f(Object arg1);

    abstract Object g(Reader arg1, Object arg2, ExtensionRegistryLite arg3, FieldSet arg4, Object arg5, UnknownFieldSchema arg6) throws IOException;

    abstract void h(Reader arg1, Object arg2, ExtensionRegistryLite arg3, FieldSet arg4) throws IOException;

    abstract void i(ByteString arg1, Object arg2, ExtensionRegistryLite arg3, FieldSet arg4) throws IOException;

    abstract void j(Writer arg1, Map.Entry arg2) throws IOException;

    abstract void k(Object arg1, FieldSet arg2);
}

