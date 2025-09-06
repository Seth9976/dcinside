package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface MessageLite extends MessageLiteOrBuilder {
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        Builder A6(CodedInputStream arg1) throws IOException;

        Builder A8(ByteString arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

        Builder F3(InputStream arg1, ExtensionRegistryLite arg2) throws IOException;

        boolean Ja(InputStream arg1, ExtensionRegistryLite arg2) throws IOException;

        Builder M6(byte[] arg1, int arg2, int arg3, ExtensionRegistryLite arg4) throws InvalidProtocolBufferException;

        Builder Z7(CodedInputStream arg1, ExtensionRegistryLite arg2) throws IOException;

        MessageLite build();

        MessageLite buildPartial();

        Builder clear();

        Builder clone();

        Builder l1(MessageLite arg1);

        boolean mergeDelimitedFrom(InputStream arg1) throws IOException;

        Builder mergeFrom(InputStream arg1) throws IOException;

        Builder mergeFrom(byte[] arg1) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] arg1, int arg2, int arg3) throws InvalidProtocolBufferException;

        Builder v8(byte[] arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

        Builder z6(ByteString arg1) throws InvalidProtocolBufferException;
    }

    Parser getParserForType();

    int getSerializedSize();

    void n(CodedOutputStream arg1) throws IOException;

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream arg1) throws IOException;

    void writeTo(OutputStream arg1) throws IOException;
}

