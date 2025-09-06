package com.google.api;

import com.google.protobuf.DescriptorProtos.MethodOptions;
import com.google.protobuf.DescriptorProtos.ServiceOptions;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.GeneratedExtension;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat.FieldType;

public final class v {
    public static final int a = 1051;
    public static final GeneratedExtension b = null;
    public static final int c = 1049;
    public static final GeneratedExtension d = null;
    public static final int e = 1050;
    public static final GeneratedExtension f;

    static {
        v.b = GeneratedMessageLite.newRepeatedGeneratedExtension(MethodOptions.getDefaultInstance(), null, null, 1051, FieldType.STRING, false, String.class);
        v.d = GeneratedMessageLite.newSingularGeneratedExtension(ServiceOptions.getDefaultInstance(), "", null, null, 1049, FieldType.STRING, String.class);
        v.f = GeneratedMessageLite.newSingularGeneratedExtension(ServiceOptions.getDefaultInstance(), "", null, null, 1050, FieldType.STRING, String.class);
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite0) {
        extensionRegistryLite0.add(v.b);
        extensionRegistryLite0.add(v.d);
        extensionRegistryLite0.add(v.f);
    }
}

