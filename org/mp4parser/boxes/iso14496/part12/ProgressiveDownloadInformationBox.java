package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class ProgressiveDownloadInformationBox extends AbstractFullBox {
    public static class Entry {
        long initialDelay;
        long rate;

        public Entry(long v, long v1) {
            this.rate = v;
            this.initialDelay = v1;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 != null && this.getClass() == object0.getClass() && this.initialDelay == ((Entry)object0).initialDelay ? this.rate == ((Entry)object0).rate : false;
        }

        public long getInitialDelay() {
            return this.initialDelay;
        }

        public long getRate() {
            return this.rate;
        }

        @Override
        public int hashCode() {
            return ((int)(this.rate ^ this.rate >>> 0x20)) * 0x1F + ((int)(this.initialDelay ^ this.initialDelay >>> 0x20));
        }

        public void setInitialDelay(long v) {
            this.initialDelay = v;
        }

        public void setRate(long v) {
            this.rate = v;
        }

        @Override
        public String toString() {
            return "Entry{rate=" + this.rate + ", initialDelay=" + this.initialDelay + '}';
        }
    }

    public static final String TYPE = "pdin";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    List entries;

    static {
        ProgressiveDownloadInformationBox.ajc$preClinit();
    }

    public ProgressiveDownloadInformationBox() {
        super("pdin");
        this.entries = Collections.emptyList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.entries = new LinkedList();
        while(byteBuffer0.remaining() >= 8) {
            Entry progressiveDownloadInformationBox$Entry0 = new Entry(IsoTypeReader.readUInt32(byteBuffer0), IsoTypeReader.readUInt32(byteBuffer0));
            this.entries.add(progressiveDownloadInformationBox$Entry0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("ProgressiveDownloadInformationBox.java", ProgressiveDownloadInformationBox.class);
        ProgressiveDownloadInformationBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"), 38);
        ProgressiveDownloadInformationBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.ProgressiveDownloadInformationBox", "java.util.List", "entries", "", "void"), 42);
        ProgressiveDownloadInformationBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"), 57);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        for(Object object0: this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((Entry)object0).getRate());
            IsoTypeWriter.writeUInt32(byteBuffer0, ((Entry)object0).getInitialDelay());
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.entries.size() * 8 + 4);
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(ProgressiveDownloadInformationBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(ProgressiveDownloadInformationBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(ProgressiveDownloadInformationBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "ProgressiveDownloadInfoBox{entries=" + this.entries + '}';
    }
}

