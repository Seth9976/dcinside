package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class EditListBox extends AbstractFullBox {
    public static class Entry {
        EditListBox editListBox;
        private double mediaRate;
        private long mediaTime;
        private long segmentDuration;

        public Entry(EditListBox editListBox0, long v, long v1, double f) {
            this.segmentDuration = v;
            this.mediaTime = v1;
            this.mediaRate = f;
            this.editListBox = editListBox0;
        }

        public Entry(EditListBox editListBox0, ByteBuffer byteBuffer0) {
            if(editListBox0.getVersion() == 1) {
                this.segmentDuration = IsoTypeReader.readUInt64(byteBuffer0);
                this.mediaTime = byteBuffer0.getLong();
            }
            else {
                this.segmentDuration = IsoTypeReader.readUInt32(byteBuffer0);
                this.mediaTime = (long)byteBuffer0.getInt();
            }
            this.mediaRate = IsoTypeReader.readFixedPoint1616(byteBuffer0);
            this.editListBox = editListBox0;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 != null && this.getClass() == object0.getClass() && this.mediaTime == ((Entry)object0).mediaTime ? this.segmentDuration == ((Entry)object0).segmentDuration : false;
        }

        public void getContent(ByteBuffer byteBuffer0) {
            if(this.editListBox.getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer0, this.segmentDuration);
                byteBuffer0.putLong(this.mediaTime);
            }
            else {
                IsoTypeWriter.writeUInt32(byteBuffer0, ((long)CastUtils.l2i(this.segmentDuration)));
                byteBuffer0.putInt(CastUtils.l2i(this.mediaTime));
            }
            IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.mediaRate);
        }

        public double getMediaRate() {
            return this.mediaRate;
        }

        public long getMediaTime() {
            return this.mediaTime;
        }

        public long getSegmentDuration() {
            return this.segmentDuration;
        }

        @Override
        public int hashCode() {
            return ((int)(this.segmentDuration ^ this.segmentDuration >>> 0x20)) * 0x1F + ((int)(this.mediaTime ^ this.mediaTime >>> 0x20));
        }

        public void setMediaRate(double f) {
            this.mediaRate = f;
        }

        public void setMediaTime(long v) {
            this.mediaTime = v;
        }

        public void setSegmentDuration(long v) {
            this.segmentDuration = v;
        }

        @Override
        public String toString() {
            return "Entry{segmentDuration=" + this.segmentDuration + ", mediaTime=" + this.mediaTime + ", mediaRate=" + this.mediaRate + '}';
        }
    }

    public static final String TYPE = "elst";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private List entries;

    static {
        EditListBox.ajc$preClinit();
    }

    public EditListBox() {
        super("elst");
        this.entries = new LinkedList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        int v = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer0));
        this.entries = new LinkedList();
        for(int v1 = 0; v1 < v; ++v1) {
            this.entries.add(new Entry(this, byteBuffer0));
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("EditListBox.java", EditListBox.class);
        EditListBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.EditListBox", "", "", "", "java.util.List"), 65);
        EditListBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.EditListBox", "java.util.List", "entries", "", "void"), 69);
        EditListBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.EditListBox", "", "", "", "java.lang.String"), 105);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.entries.size()));
        for(Object object0: this.entries) {
            ((Entry)object0).getContent(byteBuffer0);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.getVersion() == 1 ? ((long)(this.entries.size() * 20)) + 8L : ((long)(this.entries.size() * 12)) + 8L;
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(EditListBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(EditListBox.ajc$tjp_1, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(EditListBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "EditListBox{entries=" + this.entries + '}';
    }
}

