package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class CompositionTimeToSample extends AbstractFullBox {
    public static class Entry {
        int count;
        int offset;

        public Entry(int v, int v1) {
            this.count = v;
            this.offset = v1;
        }

        public int getCount() {
            return this.count;
        }

        public int getOffset() {
            return this.offset;
        }

        public void setCount(int v) {
            this.count = v;
        }

        public void setOffset(int v) {
            this.offset = v;
        }

        @Override
        public String toString() {
            return "Entry{count=" + this.count + ", offset=" + this.offset + '}';
        }
    }

    static final boolean $assertionsDisabled = false;
    public static final String TYPE = "ctts";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    List entries;

    static {
        CompositionTimeToSample.ajc$preClinit();
    }

    public CompositionTimeToSample() {
        super("ctts");
        this.entries = Collections.emptyList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.entries = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            Entry compositionTimeToSample$Entry0 = new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0)), byteBuffer0.getInt());
            this.entries.add(compositionTimeToSample$Entry0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("CompositionTimeToSample.java", CompositionTimeToSample.class);
        CompositionTimeToSample.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.CompositionTimeToSample", "", "", "", "java.util.List"), 82);
        CompositionTimeToSample.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.CompositionTimeToSample", "java.util.List", "entries", "", "void"), 86);
    }

    public static int[] blowupCompositionTimes(List list0) {
        long v = 0L;
        for(Object object0: list0) {
            v += (long)((Entry)object0).getCount();
        }
        int[] arr_v = new int[((int)v)];
        for(Object object1: list0) {
            Entry compositionTimeToSample$Entry0 = (Entry)object1;
            int v2 = 0;
            for(int v1 = 0; v2 < compositionTimeToSample$Entry0.getCount(); ++v1) {
                arr_v[v1] = compositionTimeToSample$Entry0.getOffset();
                ++v2;
            }
        }
        return arr_v;
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.entries.size()));
        for(Object object0: this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((long)((Entry)object0).getCount()));
            byteBuffer0.putInt(((Entry)object0).getOffset());
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.entries.size() * 8 + 8);
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionTimeToSample.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(CompositionTimeToSample.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }
}

