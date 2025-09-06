package androidx.datastore.preferences.protobuf;

public interface ValueOrBuilder extends MessageLiteOrBuilder {
    boolean getBoolValue();

    KindCase getKindCase();

    ListValue getListValue();

    NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    String getStringValue();

    ByteString getStringValueBytes();

    Struct getStructValue();

    boolean hasListValue();

    boolean hasStructValue();
}

