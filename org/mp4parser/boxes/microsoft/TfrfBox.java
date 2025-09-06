package org.mp4parser.boxes.microsoft;

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

public class TfrfBox extends AbstractFullBox {
    public class Entry {
        long fragmentAbsoluteDuration;
        long fragmentAbsoluteTime;

        public long getFragmentAbsoluteDuration() {
            return this.fragmentAbsoluteDuration;
        }

        public long getFragmentAbsoluteTime() {
            return this.fragmentAbsoluteTime;
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "Entry{fragmentAbsoluteTime=" + this.fragmentAbsoluteTime + ", fragmentAbsoluteDuration=" + this.fragmentAbsoluteDuration + '}';
        }
    }

    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    public List entries;

    static {
        TfrfBox.ajc$preClinit();
    }

    public TfrfBox() {
        super("uuid");
        this.entries = new ArrayList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        for(int v1 = 0; v1 < v; ++v1) {
            Entry tfrfBox$Entry0 = new Entry(this);
            if(this.getVersion() == 1) {
                tfrfBox$Entry0.fragmentAbsoluteTime = IsoTypeReader.readUInt64(byteBuffer0);
                tfrfBox$Entry0.fragmentAbsoluteDuration = IsoTypeReader.readUInt64(byteBuffer0);
            }
            else {
                tfrfBox$Entry0.fragmentAbsoluteTime = IsoTypeReader.readUInt32(byteBuffer0);
                tfrfBox$Entry0.fragmentAbsoluteDuration = IsoTypeReader.readUInt32(byteBuffer0);
            }
            this.entries.add(tfrfBox$Entry0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TfrfBox.java", TfrfBox.class);
        TfrfBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getFragmentCount", "org.mp4parser.boxes.microsoft.TfrfBox", "", "", "", "long"), 91);
        TfrfBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.microsoft.TfrfBox", "", "", "", "java.util.List"), 0x5F);
        TfrfBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.microsoft.TfrfBox", "", "", "", "java.lang.String"), 100);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.entries.size());
        for(Object object0: this.entries) {
            Entry tfrfBox$Entry0 = (Entry)object0;
            if(this.getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer0, tfrfBox$Entry0.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt64(byteBuffer0, tfrfBox$Entry0.fragmentAbsoluteDuration);
            }
            else {
                IsoTypeWriter.writeUInt32(byteBuffer0, tfrfBox$Entry0.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt32(byteBuffer0, tfrfBox$Entry0.fragmentAbsoluteDuration);
            }
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int v = this.entries.size();
        return this.getVersion() == 1 ? ((long)(v * 16 + 5)) : ((long)(v * 8 + 5));
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(TfrfBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public long getFragmentCount() {
        JoinPoint joinPoint0 = Factory.makeJP(TfrfBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return (long)this.entries.size();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-44, (byte)0x80, 0x7E, -14, -54, 57, 70, -107, (byte)0x8E, 84, 38, -53, -98, 70, -89, -97};
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TfrfBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TfrfBox{entries=" + this.entries + '}';
    }
}

