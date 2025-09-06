package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class DegradationPriorityBox extends AbstractFullBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    int[] priorities;

    static {
        DegradationPriorityBox.ajc$preClinit();
    }

    public DegradationPriorityBox() {
        super("stdp");
        this.priorities = new int[0];
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.priorities = new int[byteBuffer0.remaining() / 2];
        for(int v = 0; true; ++v) {
            int[] arr_v = this.priorities;
            if(v >= arr_v.length) {
                break;
            }
            arr_v[v] = IsoTypeReader.readUInt16(byteBuffer0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("DegradationPriorityBox.java", DegradationPriorityBox.class);
        DegradationPriorityBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getPriorities", "org.mp4parser.boxes.iso14496.part12.DegradationPriorityBox", "", "", "", "[I"), 38);
        DegradationPriorityBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setPriorities", "org.mp4parser.boxes.iso14496.part12.DegradationPriorityBox", "[I", "priorities", "", "void"), 42);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        int[] arr_v = this.priorities;
        for(int v = 0; v < arr_v.length; ++v) {
            IsoTypeWriter.writeUInt16(byteBuffer0, arr_v[v]);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.priorities.length * 2 + 4);
    }

    public int[] getPriorities() {
        JoinPoint joinPoint0 = Factory.makeJP(DegradationPriorityBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.priorities;
    }

    public void setPriorities(int[] arr_v) {
        JoinPoint joinPoint0 = Factory.makeJP(DegradationPriorityBox.ajc$tjp_1, this, this, arr_v);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.priorities = arr_v;
    }
}

