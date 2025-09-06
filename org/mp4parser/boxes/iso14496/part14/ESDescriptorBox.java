package org.mp4parser.boxes.iso14496.part14;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor;
import org.mp4parser.support.RequiresParseDetailAspect;

public class ESDescriptorBox extends AbstractDescriptorBox {
    public static final String TYPE = "esds";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;

    static {
        ESDescriptorBox.ajc$preClinit();
    }

    public ESDescriptorBox() {
        super("esds");
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("ESDescriptorBox.java", ESDescriptorBox.class);
        ESDescriptorBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor"), 36);
        ESDescriptorBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"), 40);
        ESDescriptorBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "equals", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"), 45);
        ESDescriptorBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hashCode", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "", "int"), 56);
    }

    @Override
    public boolean equals(Object object0) {
        JoinPoint joinPoint0 = Factory.makeJP(ESDescriptorBox.ajc$tjp_2, this, this, object0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            ByteBuffer byteBuffer0 = this.data;
            ByteBuffer byteBuffer1 = ((ESDescriptorBox)object0).data;
            return byteBuffer0 == null ? byteBuffer1 == null : byteBuffer0.equals(byteBuffer1);
        }
        return false;
    }

    @Override  // org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        ESDescriptor eSDescriptor0 = this.getEsDescriptor();
        if(eSDescriptor0 != null) {
            byteBuffer0.put(((ByteBuffer)eSDescriptor0.serialize().rewind()));
            return;
        }
        byteBuffer0.put(this.data.duplicate());
    }

    @Override  // org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox
    protected long getContentSize() {
        ESDescriptor eSDescriptor0 = this.getEsDescriptor();
        return eSDescriptor0 == null ? ((long)(this.data.remaining() + 4)) : ((long)(eSDescriptor0.getSize() + 4));
    }

    public ESDescriptor getEsDescriptor() {
        JoinPoint joinPoint0 = Factory.makeJP(ESDescriptorBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (ESDescriptor)super.getDescriptor();
    }

    @Override
    public int hashCode() {
        JoinPoint joinPoint0 = Factory.makeJP(ESDescriptorBox.ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.data == null ? 0 : this.data.hashCode();
    }

    public void setEsDescriptor(ESDescriptor eSDescriptor0) {
        JoinPoint joinPoint0 = Factory.makeJP(ESDescriptorBox.ajc$tjp_1, this, this, eSDescriptor0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        super.setDescriptor(eSDescriptor0);
    }
}

