package org.mp4parser.boxes.iso14496.part14;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.ObjectDescriptorFactory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.slf4j.a;
import org.slf4j.b;

public class AbstractDescriptorBox extends AbstractFullBox {
    private static a LOG;
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    protected ByteBuffer data;
    protected BaseDescriptor descriptor;

    static {
        AbstractDescriptorBox.ajc$preClinit();
        AbstractDescriptorBox.LOG = b.j("org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox");
    }

    public AbstractDescriptorBox(String s) {
        super(s);
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.data = byteBuffer0.slice();
        byteBuffer0.position(byteBuffer0.position() + byteBuffer0.remaining());
        try {
            this.data.rewind();
            this.descriptor = ObjectDescriptorFactory.createFrom(-1, this.data.duplicate());
        }
        catch(IOException iOException0) {
            AbstractDescriptorBox.LOG.d("Error parsing ObjectDescriptor", iOException0);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            AbstractDescriptorBox.LOG.d("Error parsing ObjectDescriptor", indexOutOfBoundsException0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AbstractDescriptorBox.java", AbstractDescriptorBox.class);
        AbstractDescriptorBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 43);
        AbstractDescriptorBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 0x2F);
        AbstractDescriptorBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor"), 0x3F);
        AbstractDescriptorBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 67);
        AbstractDescriptorBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDescriptorAsString", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.lang.String"), 71);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        this.data.rewind();
        byteBuffer0.put(this.data);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.data.limit() + 4);
    }

    public ByteBuffer getData() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractDescriptorBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.data;
    }

    public BaseDescriptor getDescriptor() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractDescriptorBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.descriptor;
    }

    public String getDescriptorAsString() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractDescriptorBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "BaseDescriptor{tag=0, sizeOfInstance=0}";
    }

    public void setData(ByteBuffer byteBuffer0) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractDescriptorBox.ajc$tjp_1, this, this, byteBuffer0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.data = byteBuffer0;
    }

    public void setDescriptor(BaseDescriptor baseDescriptor0) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractDescriptorBox.ajc$tjp_3, this, this, baseDescriptor0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.descriptor = baseDescriptor0;
    }
}

