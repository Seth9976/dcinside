package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface i extends MessageLiteOrBuilder {
    String A7(String arg1);

    int D9();

    ByteString Pa();

    boolean T4(String arg1);

    ByteString U0();

    String U6(String arg1, String arg2);

    Map b2();

    String getDomain();

    @Deprecated
    Map getMetadata();

    String getReason();
}

