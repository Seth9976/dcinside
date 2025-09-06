package org.mp4parser.boxes.iso14496.part12;

import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public abstract class ChunkOffsetBox extends AbstractFullBox {
    private static StaticPart ajc$tjp_0;

    static {
        ChunkOffsetBox.ajc$preClinit();
    }

    public ChunkOffsetBox(String s) {
        super(s);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("ChunkOffsetBox.java", ChunkOffsetBox.class);
        ChunkOffsetBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }

    public abstract long[] getChunkOffsets();

    public abstract void setChunkOffsets(long[] arg1);

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(ChunkOffsetBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.getClass().getSimpleName() + "[entryCount=" + this.getChunkOffsets().length + "]";
    }
}

