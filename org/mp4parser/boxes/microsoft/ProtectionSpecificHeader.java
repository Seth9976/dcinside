package org.mp4parser.boxes.microsoft;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.mp4parser.boxes.microsoft.contentprotection.GenericHeader;
import org.mp4parser.tools.Hex;

public abstract class ProtectionSpecificHeader {
    protected static Map uuidRegistry;

    static {
        ProtectionSpecificHeader.uuidRegistry = new HashMap();
    }

    public static ProtectionSpecificHeader createFor(UUID uUID0, ByteBuffer byteBuffer0) {
        ProtectionSpecificHeader protectionSpecificHeader0;
        Class class0 = (Class)ProtectionSpecificHeader.uuidRegistry.get(uUID0);
        if(class0 == null) {
            protectionSpecificHeader0 = null;
        }
        else {
            try {
                protectionSpecificHeader0 = (ProtectionSpecificHeader)class0.newInstance();
            }
            catch(InstantiationException instantiationException0) {
                throw new RuntimeException(instantiationException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException(illegalAccessException0);
            }
        }
        if(protectionSpecificHeader0 == null) {
            protectionSpecificHeader0 = new GenericHeader();
        }
        protectionSpecificHeader0.parse(byteBuffer0);
        return protectionSpecificHeader0;
    }

    @Override
    public boolean equals(Object object0) {
        throw new RuntimeException("somebody called equals on me but that\'s not supposed to happen.");
    }

    public abstract ByteBuffer getData();

    public abstract UUID getSystemId();

    public abstract void parse(ByteBuffer arg1);

    @Override
    public String toString() {
        ByteBuffer byteBuffer0 = this.getData().duplicate();
        byteBuffer0.rewind();
        byte[] arr_b = new byte[byteBuffer0.limit()];
        byteBuffer0.get(arr_b);
        return "ProtectionSpecificHeader{data=" + Hex.encodeHex(arr_b) + '}';
    }
}

