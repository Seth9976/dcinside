package com.google.protobuf.kotlin;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite.ExtendableBuilder;
import com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder;
import kotlin.jvm.internal.L;
import y4.l;

public final class ExtendableMessageLiteExtensionsKt {
    public static final boolean contains(@l ExtendableMessageOrBuilder generatedMessageLite$ExtendableMessageOrBuilder0, @l ExtensionLite extensionLite0) {
        L.p(generatedMessageLite$ExtendableMessageOrBuilder0, "<this>");
        L.p(extensionLite0, "extension");
        return generatedMessageLite$ExtendableMessageOrBuilder0.hasExtension(extensionLite0);
    }

    @l
    public static final Object get(@l ExtendableMessageOrBuilder generatedMessageLite$ExtendableMessageOrBuilder0, @l ExtensionLite extensionLite0) {
        L.p(generatedMessageLite$ExtendableMessageOrBuilder0, "<this>");
        L.p(extensionLite0, "extension");
        Object object0 = generatedMessageLite$ExtendableMessageOrBuilder0.getExtension(extensionLite0);
        L.o(object0, "getExtension(extension)");
        return object0;
    }

    public static final void set(@l ExtendableBuilder generatedMessageLite$ExtendableBuilder0, @l ExtensionLite extensionLite0, @l Object object0) {
        L.p(generatedMessageLite$ExtendableBuilder0, "<this>");
        L.p(extensionLite0, "extension");
        L.p(object0, "value");
        generatedMessageLite$ExtendableBuilder0.setExtension(extensionLite0, object0);
    }
}

