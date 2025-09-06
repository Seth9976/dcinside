package androidx.datastore.preferences.protobuf;

import java.util.Map;

public interface StructOrBuilder extends MessageLiteOrBuilder {
    boolean containsFields(String arg1);

    @Deprecated
    Map getFields();

    int getFieldsCount();

    Map getFieldsMap();

    Value getFieldsOrThrow(String arg1);

    Value t(String arg1, Value arg2);
}

