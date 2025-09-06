package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long c = 3283890091615336259L;

        public InvalidWireTypeException(String s) {
            super(s);
        }
    }

    private MessageLite a;
    private static final long b = 0xE9924688C2F20054L;

    public InvalidProtocolBufferException(IOException iOException0) {
        super(iOException0.getMessage(), iOException0);
        this.a = null;
    }

    public InvalidProtocolBufferException(String s) {
        super(s);
        this.a = null;
    }

    public InvalidProtocolBufferException(String s, IOException iOException0) {
        super(s, iOException0);
        this.a = null;
    }

    public MessageLite a() {
        return this.a;
    }

    static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    static InvalidWireTypeException e() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    static InvalidProtocolBufferException i() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public InvalidProtocolBufferException j(MessageLite messageLite0) {
        this.a = messageLite0;
        return this;
    }

    static InvalidProtocolBufferException k() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static InvalidProtocolBufferException l() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public IOException m() {
        return this.getCause() instanceof IOException ? ((IOException)this.getCause()) : this;
    }
}

