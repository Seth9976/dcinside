package org.mp4parser.boxes.dece;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TrickPlayBox extends AbstractFullBox {
    public static class Entry {
        private int value;

        public Entry() {
        }

        public Entry(int v) {
            this.value = v;
        }

        public int getDependencyLevel() {
            return this.value & 0x3F;
        }

        public int getPicType() {
            return this.value >> 6 & 3;
        }

        public void setDependencyLevel(int v) {
            this.value |= v & 0x3F;
        }

        public void setPicType(int v) {
            this.value = (v & 3) << 6 | this.value & 0x1F;
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "Entry{picType=" + this.getPicType() + ",dependencyLevel=" + this.getDependencyLevel() + '}';
        }
    }

    public static final String TYPE = "trik";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private List entries;

    static {
        TrickPlayBox.ajc$preClinit();
    }

    public TrickPlayBox() {
        super("trik");
        this.entries = new ArrayList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        while(byteBuffer0.remaining() > 0) {
            this.entries.add(new Entry(IsoTypeReader.readUInt8(byteBuffer0)));
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TrickPlayBox.java", TrickPlayBox.class);
        TrickPlayBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"), 0x20);
        TrickPlayBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.dece.TrickPlayBox", "java.util.List", "entries", "", "void"), 36);
        TrickPlayBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"), 62);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        for(Object object0: this.entries) {
            IsoTypeWriter.writeUInt8(byteBuffer0, ((Entry)object0).value);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.entries.size() + 4);
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(TrickPlayBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(TrickPlayBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TrickPlayBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TrickPlayBox{entries=" + this.entries + '}';
    }
}

