package org.mp4parser.boxes.microsoft;

import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class PiffTrackEncryptionBox extends AbstractTrackEncryptionBox {
    private static StaticPart ajc$tjp_0;

    static {
        PiffTrackEncryptionBox.ajc$preClinit();
    }

    public PiffTrackEncryptionBox() {
        super("uuid");
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("PiffTrackEncryptionBox.java", PiffTrackEncryptionBox.class);
        PiffTrackEncryptionBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFlags", "org.mp4parser.boxes.microsoft.PiffTrackEncryptionBox", "", "", "", "int"), 29);
    }

    @Override  // org.mp4parser.support.AbstractFullBox
    public int getFlags() {
        JoinPoint joinPoint0 = Factory.makeJP(PiffTrackEncryptionBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return 0;
    }

    @Override  // org.mp4parser.support.AbstractBox
    public byte[] getUserType() {
        return new byte[]{(byte)0x89, 0x74, -37, -50, 0x7B, -25, 76, 81, (byte)0x84, -7, 0x71, 72, -7, -120, 37, 84};
    }
}

