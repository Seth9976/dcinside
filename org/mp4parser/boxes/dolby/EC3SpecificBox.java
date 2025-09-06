package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitReaderBuffer;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

public class EC3SpecificBox extends AbstractBox {
    public static class Entry {
        public int acmod;
        public int bsid;
        public int bsmod;
        public int chan_loc;
        public int fscod;
        public int lfeon;
        public int num_dep_sub;
        public int reserved;
        public int reserved2;

        @Override
        public String toString() {
            return "Entry{fscod=" + this.fscod + ", bsid=" + this.bsid + ", bsmod=" + this.bsmod + ", acmod=" + this.acmod + ", lfeon=" + this.lfeon + ", reserved=" + this.reserved + ", num_dep_sub=" + this.num_dep_sub + ", chan_loc=" + this.chan_loc + ", reserved2=" + this.reserved2 + '}';
        }
    }

    public static final String TYPE = "dec3";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    private static StaticPart ajc$tjp_6;
    private static StaticPart ajc$tjp_7;
    private static StaticPart ajc$tjp_8;
    int dataRate;
    List entries;
    int numIndSub;

    static {
        EC3SpecificBox.ajc$preClinit();
    }

    public EC3SpecificBox() {
        super("dec3");
        this.entries = new LinkedList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        BitReaderBuffer bitReaderBuffer0 = new BitReaderBuffer(byteBuffer0);
        this.dataRate = bitReaderBuffer0.readBits(13);
        this.numIndSub = bitReaderBuffer0.readBits(3) + 1;
        for(int v = 0; v < this.numIndSub; ++v) {
            Entry eC3SpecificBox$Entry0 = new Entry();
            eC3SpecificBox$Entry0.fscod = bitReaderBuffer0.readBits(2);
            eC3SpecificBox$Entry0.bsid = bitReaderBuffer0.readBits(5);
            eC3SpecificBox$Entry0.bsmod = bitReaderBuffer0.readBits(5);
            eC3SpecificBox$Entry0.acmod = bitReaderBuffer0.readBits(3);
            eC3SpecificBox$Entry0.lfeon = bitReaderBuffer0.readBits(1);
            eC3SpecificBox$Entry0.reserved = bitReaderBuffer0.readBits(3);
            int v1 = bitReaderBuffer0.readBits(4);
            eC3SpecificBox$Entry0.num_dep_sub = v1;
            if(v1 > 0) {
                eC3SpecificBox$Entry0.chan_loc = bitReaderBuffer0.readBits(9);
            }
            else {
                eC3SpecificBox$Entry0.reserved2 = bitReaderBuffer0.readBits(1);
            }
            this.entries.add(eC3SpecificBox$Entry0);
        }
    }

    public void addEntry(Entry eC3SpecificBox$Entry0) {
        JoinPoint joinPoint0 = Factory.makeJP(EC3SpecificBox.ajc$tjp_4, this, this, eC3SpecificBox$Entry0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries.add(eC3SpecificBox$Entry0);
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("EC3SpecificBox.java", EC3SpecificBox.class);
        EC3SpecificBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getContentSize", "org.mp4parser.boxes.dolby.EC3SpecificBox", "", "", "", "long"), 25);
        EC3SpecificBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getContent", "org.mp4parser.boxes.dolby.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 65);
        EC3SpecificBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.dolby.EC3SpecificBox", "", "", "", "java.util.List"), 86);
        EC3SpecificBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.dolby.EC3SpecificBox", "java.util.List", "entries", "", "void"), 90);
        EC3SpecificBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "addEntry", "org.mp4parser.boxes.dolby.EC3SpecificBox", "org.mp4parser.boxes.dolby.EC3SpecificBox$Entry", "entry", "", "void"), 94);
        EC3SpecificBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getDataRate", "org.mp4parser.boxes.dolby.EC3SpecificBox", "", "", "", "int"), 98);
        EC3SpecificBox.ajc$tjp_6 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setDataRate", "org.mp4parser.boxes.dolby.EC3SpecificBox", "int", "dataRate", "", "void"), 102);
        EC3SpecificBox.ajc$tjp_7 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getNumIndSub", "org.mp4parser.boxes.dolby.EC3SpecificBox", "", "", "", "int"), 106);
        EC3SpecificBox.ajc$tjp_8 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setNumIndSub", "org.mp4parser.boxes.dolby.EC3SpecificBox", "int", "numIndSub", "", "void"), 110);
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void getContent(ByteBuffer byteBuffer0) {
        JoinPoint joinPoint0 = Factory.makeJP(EC3SpecificBox.ajc$tjp_1, this, this, byteBuffer0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        BitWriterBuffer bitWriterBuffer0 = new BitWriterBuffer(byteBuffer0);
        bitWriterBuffer0.writeBits(this.dataRate, 13);
        bitWriterBuffer0.writeBits(this.entries.size() - 1, 3);
        for(Object object0: this.entries) {
            Entry eC3SpecificBox$Entry0 = (Entry)object0;
            bitWriterBuffer0.writeBits(eC3SpecificBox$Entry0.fscod, 2);
            bitWriterBuffer0.writeBits(eC3SpecificBox$Entry0.bsid, 5);
            bitWriterBuffer0.writeBits(eC3SpecificBox$Entry0.bsmod, 5);
            bitWriterBuffer0.writeBits(eC3SpecificBox$Entry0.acmod, 3);
            bitWriterBuffer0.writeBits(eC3SpecificBox$Entry0.lfeon, 1);
            bitWriterBuffer0.writeBits(eC3SpecificBox$Entry0.reserved, 3);
            bitWriterBuffer0.writeBits(eC3SpecificBox$Entry0.num_dep_sub, 4);
            if(eC3SpecificBox$Entry0.num_dep_sub > 0) {
                bitWriterBuffer0.writeBits(eC3SpecificBox$Entry0.chan_loc, 9);
            }
            else {
                bitWriterBuffer0.writeBits(eC3SpecificBox$Entry0.reserved2, 1);
            }
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    public long getContentSize() {
        JoinPoint joinPoint0 = Factory.makeJP(EC3SpecificBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        long v = 2L;
        for(Object object0: this.entries) {
            v += (((Entry)object0).num_dep_sub <= 0 ? 3L : 4L);
        }
        return v;
    }

    public int getDataRate() {
        JoinPoint joinPoint0 = Factory.makeJP(EC3SpecificBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.dataRate;
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(EC3SpecificBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public int getNumIndSub() {
        JoinPoint joinPoint0 = Factory.makeJP(EC3SpecificBox.ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.numIndSub;
    }

    public void setDataRate(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(EC3SpecificBox.ajc$tjp_6, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.dataRate = v;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(EC3SpecificBox.ajc$tjp_3, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    public void setNumIndSub(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(EC3SpecificBox.ajc$tjp_8, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.numIndSub = v;
    }
}

