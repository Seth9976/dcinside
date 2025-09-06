package org.mp4parser.boxes.microsoft.contentprotection;

import java.nio.ByteBuffer;
import java.util.UUID;
import org.mp4parser.boxes.microsoft.ProtectionSpecificHeader;

public class GenericHeader extends ProtectionSpecificHeader {
    public static UUID PROTECTION_SYSTEM_ID;
    ByteBuffer data;

    static {
        UUID uUID0 = UUID.fromString("00000000-0000-0000-0000-000000000000");
        GenericHeader.PROTECTION_SYSTEM_ID = uUID0;
        ProtectionSpecificHeader.uuidRegistry.put(uUID0, GenericHeader.class);
    }

    @Override  // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public ByteBuffer getData() {
        return this.data;
    }

    @Override  // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public UUID getSystemId() {
        return GenericHeader.PROTECTION_SYSTEM_ID;
    }

    @Override  // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public void parse(ByteBuffer byteBuffer0) {
        this.data = byteBuffer0;
    }
}

