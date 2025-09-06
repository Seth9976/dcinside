package org.mp4parser.boxes.iso14496.part12;

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TimeToSampleBox extends AbstractFullBox {
    public static class Entry {
        long count;
        long delta;

        public Entry(long v, long v1) {
            this.count = v;
            this.delta = v1;
        }

        public long getCount() {
            return this.count;
        }

        public long getDelta() {
            return this.delta;
        }

        public void setCount(long v) {
            this.count = v;
        }

        public void setDelta(long v) {
            this.delta = v;
        }

        @Override
        public String toString() {
            return "Entry{count=" + this.count + ", delta=" + this.delta + '}';
        }
    }

    static final boolean $assertionsDisabled = false;
    public static final String TYPE = "stts";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    static Map cache;
    List entries;

    static {
        TimeToSampleBox.ajc$preClinit();
        TimeToSampleBox.cache = new WeakHashMap();
    }

    public TimeToSampleBox() {
        super("stts");
        this.entries = Collections.emptyList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.entries = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.entries.add(new Entry(IsoTypeReader.readUInt32(byteBuffer0), IsoTypeReader.readUInt32(byteBuffer0)));
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("TimeToSampleBox.java", TimeToSampleBox.class);
        TimeToSampleBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "", "", "", "java.util.List"), 0x6F);
        TimeToSampleBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "java.util.List", "entries", "", "void"), 0x73);
        TimeToSampleBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "", "", "", "java.lang.String"), 0x77);
    }

    public static long[] blowupTimeToSamples(List list0) {
        synchronized(TimeToSampleBox.class) {
            SoftReference softReference0 = (SoftReference)TimeToSampleBox.cache.get(list0);
            if(softReference0 != null) {
                long[] arr_v = (long[])softReference0.get();
                if(arr_v != null) {
                    return arr_v;
                }
            }
            long v1 = 0L;
            for(Object object0: list0) {
                v1 += ((Entry)object0).getCount();
            }
            long[] arr_v1 = new long[((int)v1)];
            for(Object object1: list0) {
                Entry timeToSampleBox$Entry0 = (Entry)object1;
                int v3 = 0;
                for(int v2 = 0; ((long)v3) < timeToSampleBox$Entry0.getCount(); ++v2) {
                    arr_v1[v2] = timeToSampleBox$Entry0.getDelta();
                    ++v3;
                }
            }
            TimeToSampleBox.cache.put(list0, new SoftReference(arr_v1));
            return arr_v1;
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.entries.size()));
        for(Object object0: this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer0, ((Entry)object0).getCount());
            IsoTypeWriter.writeUInt32(byteBuffer0, ((Entry)object0).getDelta());
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (long)(this.entries.size() * 8 + 8);
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeToSampleBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(TimeToSampleBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(TimeToSampleBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "TimeToSampleBox[entryCount=" + this.entries.size() + "]";
    }
}

