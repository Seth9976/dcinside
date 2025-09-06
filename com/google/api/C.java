package com.google.api;

import com.google.protobuf.DescriptorProtos.MethodOptions;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.GeneratedExtension;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat.FieldType;

public final class c {
    public static final int a = 0x44F2530;
    public static final GeneratedExtension b;

    static {
        c.b = GeneratedMessageLite.newSingularGeneratedExtension(MethodOptions.getDefaultInstance(), e0.bc(), e0.bc(), null, 0x44F2530, FieldType.MESSAGE, e0.class);
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite0) {
        extensionRegistryLite0.add(c.b);
    }
}

