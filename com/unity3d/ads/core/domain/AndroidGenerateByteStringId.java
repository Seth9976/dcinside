package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidGenerateByteStringId implements GetByteStringId {
    @Override  // com.unity3d.ads.core.domain.GetByteStringId
    @l
    public ByteString invoke() {
        UUID uUID0 = UUID.randomUUID();
        L.o(uUID0, "randomUUID()");
        return ProtobufExtensionsKt.toByteString(uUID0);
    }
}

