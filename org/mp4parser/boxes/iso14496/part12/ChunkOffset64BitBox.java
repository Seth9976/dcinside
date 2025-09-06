package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class ChunkOffset64BitBox extends ChunkOffsetBox {
    public static final String TYPE = "co64";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private long[] chunkOffsets;

    static {
        ChunkOffset64BitBox.ajc$preClinit();
    }

    public ChunkOffset64BitBox() {
        super("co64");
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.chunkOffsets = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            long[] arr_v = this.chunkOffsets;
            arr_v[v1] = IsoTypeReader.readUInt64(byteBuffer0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("ChunkOffset64BitBox.java", ChunkOffset64BitBox.class);
        ChunkOffset64BitBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getChunkOffsets", "org.mp4parser.boxes.iso14496.part12.ChunkOffset64BitBox", "", "", "", "[J"), 22);
        ChunkOffset64BitBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setChunkOffsets", "org.mp4parser.boxes.iso14496.part12.ChunkOffset64BitBox", "[J", "chunkOffsets", "", "void"), 27);
    }

    @Override  // org.mp4parser.boxes.iso14496.part12.ChunkOffsetBox
    public long[] getChunkOffsets() {
        JoinPoint joinPoint0 = Factory.makeJP(ChunkOffset64BitBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.chunkOffsets;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.chunkOffsets.length));
        long[] arr_v = this.chunkOffsets;
        for(int v = 0; v < arr_v.length; ++v) {
            IsoTypeWriter.writeUInt64(byteBuffer0, arr_v[v]);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.chunkOffsets.length * 8 + 8);
    }

    @Override  // org.mp4parser.boxes.iso14496.part12.ChunkOffsetBox
    public void setChunkOffsets(long[] arr_v) {
        JoinPoint joinPoint0 = Factory.makeJP(ChunkOffset64BitBox.ajc$tjp_1, this, this, arr_v);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.chunkOffsets = arr_v;
    }
}

