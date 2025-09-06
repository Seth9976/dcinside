package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class SampleToChunkBox extends AbstractFullBox {
    public static class Entry {
        long firstChunk;
        long sampleDescriptionIndex;
        long samplesPerChunk;

        public Entry(long v, long v1, long v2) {
            this.firstChunk = v;
            this.samplesPerChunk = v1;
            this.sampleDescriptionIndex = v2;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || this.firstChunk != ((Entry)object0).firstChunk) {
                return false;
            }
            return this.sampleDescriptionIndex == ((Entry)object0).sampleDescriptionIndex ? this.samplesPerChunk == ((Entry)object0).samplesPerChunk : false;
        }

        public long getFirstChunk() {
            return this.firstChunk;
        }

        public long getSampleDescriptionIndex() {
            return this.sampleDescriptionIndex;
        }

        public long getSamplesPerChunk() {
            return this.samplesPerChunk;
        }

        @Override
        public int hashCode() {
            return (((int)(this.firstChunk ^ this.firstChunk >>> 0x20)) * 0x1F + ((int)(this.samplesPerChunk ^ this.samplesPerChunk >>> 0x20))) * 0x1F + ((int)(this.sampleDescriptionIndex ^ this.sampleDescriptionIndex >>> 0x20));
        }

        public void setFirstChunk(long v) {
            this.firstChunk = v;
        }

        public void setSampleDescriptionIndex(long v) {
            this.sampleDescriptionIndex = v;
        }

        public void setSamplesPerChunk(long v) {
            this.samplesPerChunk = v;
        }

        @Override
        public String toString() {
            return "Entry{firstChunk=" + this.firstChunk + ", samplesPerChunk=" + this.samplesPerChunk + ", sampleDescriptionIndex=" + this.sampleDescriptionIndex + '}';
        }
    }

    public static final String TYPE = "stsc";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    List entries;

    static {
        SampleToChunkBox.ajc$preClinit();
    }

    public SampleToChunkBox() {
        super("stsc");
        this.entries = Collections.emptyList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.entries = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.entries.add(new Entry(IsoTypeReader.readUInt32(byteBuffer0), IsoTypeReader.readUInt32(byteBuffer0), IsoTypeReader.readUInt32(byteBuffer0)));
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("SampleToChunkBox.java", SampleToChunkBox.class);
        SampleToChunkBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "", "", "", "java.util.List"), 41);
        SampleToChunkBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "java.util.List", "entries", "", "void"), 45);
        SampleToChunkBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "", "", "", "java.lang.String"), 78);
        SampleToChunkBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "blowup", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "int", "chunkCount", "", "[J"), 89);
    }

    public long[] blowup(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToChunkBox.ajc$tjp_3, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        long[] arr_v = new long[v];
        LinkedList linkedList0 = new LinkedList(this.entries);
        Collections.reverse(linkedList0);
        Iterator iterator0 = linkedList0.iterator();
        Object object0 = iterator0.next();
        Entry sampleToChunkBox$Entry0 = (Entry)object0;
        while(v > 1) {
            arr_v[v - 1] = sampleToChunkBox$Entry0.getSamplesPerChunk();
            if(((long)v) == sampleToChunkBox$Entry0.getFirstChunk()) {
                Object object1 = iterator0.next();
                sampleToChunkBox$Entry0 = (Entry)object1;
            }
            --v;
        }
        arr_v[0] = sampleToChunkBox$Entry0.getSamplesPerChunk();
        return arr_v;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.entries.size()));
        for(Object object0: this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((Entry)object0).getFirstChunk());
            IsoTypeWriter.writeUInt32(byteBuffer0, ((Entry)object0).getSamplesPerChunk());
            IsoTypeWriter.writeUInt32(byteBuffer0, ((Entry)object0).getSampleDescriptionIndex());
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.entries.size() * 12 + 8);
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToChunkBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToChunkBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(SampleToChunkBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "SampleToChunkBox[entryCount=" + this.entries.size() + "]";
    }
}

