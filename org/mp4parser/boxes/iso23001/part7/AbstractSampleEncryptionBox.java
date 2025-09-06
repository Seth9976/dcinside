package org.mp4parser.boxes.iso23001.part7;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private static StaticPart ajc$tjp_5;
    protected int algorithmId;
    List entries;
    protected int ivSize;
    protected byte[] kid;

    static {
        AbstractSampleEncryptionBox.ajc$preClinit();
    }

    protected AbstractSampleEncryptionBox(String s) {
        super(s);
        this.algorithmId = -1;
        this.ivSize = -1;
        this.kid = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.entries = Collections.emptyList();
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        if((this.getFlags() & 1) > 0) {
            this.algorithmId = IsoTypeReader.readUInt24(byteBuffer0);
            this.ivSize = IsoTypeReader.readUInt8(byteBuffer0);
            byte[] arr_b = new byte[16];
            this.kid = arr_b;
            byteBuffer0.get(arr_b);
        }
        long v = IsoTypeReader.readUInt32(byteBuffer0);
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        ByteBuffer byteBuffer2 = byteBuffer0.duplicate();
        ByteBuffer byteBuffer3 = byteBuffer0.duplicate();
        List list0 = this.parseEntries(byteBuffer1, v, 8);
        this.entries = list0;
        if(list0 != null) {
            byteBuffer0.position(byteBuffer0.position() + byteBuffer0.remaining() - byteBuffer1.remaining());
            return;
        }
        List list1 = this.parseEntries(byteBuffer2, v, 16);
        this.entries = list1;
        if(list1 != null) {
            byteBuffer0.position(byteBuffer0.position() + byteBuffer0.remaining() - byteBuffer2.remaining());
            return;
        }
        List list2 = this.parseEntries(byteBuffer3, v, 0);
        this.entries = list2;
        if(list2 == null) {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }
        byteBuffer0.position(byteBuffer0.position() + byteBuffer0.remaining() - byteBuffer3.remaining());
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        AbstractSampleEncryptionBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getOffsetToFirstIV", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "int"), 29);
        AbstractSampleEncryptionBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 98);
        AbstractSampleEncryptionBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 102);
        AbstractSampleEncryptionBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "equals", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), 0xB6);
        AbstractSampleEncryptionBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "hashCode", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "int"), 209);
        AbstractSampleEncryptionBox.ajc$tjp_5 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getEntrySizes", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 0xD9);
    }

    @Override
    public boolean equals(Object object0) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_3, this, this, object0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.algorithmId != ((AbstractSampleEncryptionBox)object0).algorithmId) {
            return false;
        }
        if(this.ivSize != ((AbstractSampleEncryptionBox)object0).ivSize) {
            return false;
        }
        List list0 = this.entries;
        if(list0 != null) {
            return list0.equals(((AbstractSampleEncryptionBox)object0).entries) ? Arrays.equals(this.kid, ((AbstractSampleEncryptionBox)object0).kid) : false;
        }
        return ((AbstractSampleEncryptionBox)object0).entries == null ? Arrays.equals(this.kid, ((AbstractSampleEncryptionBox)object0).kid) : false;
    }

    @Override  // org.mp4parser.support.AbstractBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        super.getBox(writableByteChannel0);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        if(this.isOverrideTrackEncryptionBoxParameters()) {
            IsoTypeWriter.writeUInt24(byteBuffer0, this.algorithmId);
            IsoTypeWriter.writeUInt8(byteBuffer0, this.ivSize);
            byteBuffer0.put(this.kid);
        }
        IsoTypeWriter.writeUInt32(byteBuffer0, ((long)this.getNonEmptyEntriesNum()));
        Iterator iterator0 = this.entries.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                return;
            }
            Object object0 = iterator0.next();
            CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat0 = (CencSampleAuxiliaryDataFormat)object0;
            if(cencSampleAuxiliaryDataFormat0.getSize() > 0) {
                byte[] arr_b = cencSampleAuxiliaryDataFormat0.iv;
                if(arr_b.length != 8 && arr_b.length != 16) {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
                byteBuffer0.put(arr_b);
                if(this.isSubSampleEncryption()) {
                    IsoTypeWriter.writeUInt16(byteBuffer0, cencSampleAuxiliaryDataFormat0.pairs.length);
                    Pair[] arr_cencSampleAuxiliaryDataFormat$Pair = cencSampleAuxiliaryDataFormat0.pairs;
                    for(int v = 0; v < arr_cencSampleAuxiliaryDataFormat$Pair.length; ++v) {
                        Pair cencSampleAuxiliaryDataFormat$Pair0 = arr_cencSampleAuxiliaryDataFormat$Pair[v];
                        IsoTypeWriter.writeUInt16(byteBuffer0, cencSampleAuxiliaryDataFormat$Pair0.clear());
                        IsoTypeWriter.writeUInt32(byteBuffer0, cencSampleAuxiliaryDataFormat$Pair0.encrypted());
                    }
                }
            }
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        long v = (this.isOverrideTrackEncryptionBoxParameters() ? 8L + ((long)this.kid.length) : 4L) + 4L;
        for(Object object0: this.entries) {
            v += (long)((CencSampleAuxiliaryDataFormat)object0).getSize();
        }
        return v;
    }

    public List getEntries() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.entries;
    }

    public List getEntrySizes() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        List list0 = new ArrayList(this.entries.size());
        for(Object object0: this.entries) {
            CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat0 = (CencSampleAuxiliaryDataFormat)object0;
            int v = (short)cencSampleAuxiliaryDataFormat0.iv.length;
            list0.add(((short)(this.isSubSampleEncryption() ? ((short)(((short)(v + 2)) + cencSampleAuxiliaryDataFormat0.pairs.length * 6)) : ((short)cencSampleAuxiliaryDataFormat0.iv.length))));
        }
        return list0;
    }

    private int getNonEmptyEntriesNum() {
        int v = 0;
        for(Object object0: this.entries) {
            if(((CencSampleAuxiliaryDataFormat)object0).getSize() > 0) {
                ++v;
            }
        }
        return v;
    }

    public int getOffsetToFirstIV() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        int v = this.getSize() <= 0x100000000L ? 8 : 16;
        return this.isOverrideTrackEncryptionBoxParameters() ? v + (this.kid.length + 4) + 4 : v + 4;
    }

    @Override
    public int hashCode() {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        int v = (this.algorithmId * 0x1F + this.ivSize) * 0x1F;
        int v1 = 0;
        int v2 = this.kid == null ? 0 : Arrays.hashCode(this.kid);
        List list0 = this.entries;
        if(list0 != null) {
            v1 = list0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @DoNotParseDetail
    protected boolean isOverrideTrackEncryptionBoxParameters() {
        return (this.getFlags() & 1) > 0;
    }

    @DoNotParseDetail
    public boolean isSubSampleEncryption() {
        return (this.getFlags() & 2) > 0;
    }

    private List parseEntries(ByteBuffer byteBuffer0, long v, int v1) {
        List list0 = new ArrayList();
        while(true) {
            if(v <= 0L) {
                return list0;
            }
            try {
                CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat0 = new CencSampleAuxiliaryDataFormat();
                byte[] arr_b = new byte[v1];
                cencSampleAuxiliaryDataFormat0.iv = arr_b;
                byteBuffer0.get(arr_b);
                if((this.getFlags() & 2) > 0) {
                    cencSampleAuxiliaryDataFormat0.pairs = new Pair[IsoTypeReader.readUInt16(byteBuffer0)];
                    for(int v2 = 0; true; ++v2) {
                        Pair[] arr_cencSampleAuxiliaryDataFormat$Pair = cencSampleAuxiliaryDataFormat0.pairs;
                        if(v2 >= arr_cencSampleAuxiliaryDataFormat$Pair.length) {
                            break;
                        }
                        arr_cencSampleAuxiliaryDataFormat$Pair[v2] = cencSampleAuxiliaryDataFormat0.createPair(IsoTypeReader.readUInt16(byteBuffer0), IsoTypeReader.readUInt32(byteBuffer0));
                    }
                }
                list0.add(cencSampleAuxiliaryDataFormat0);
                --v;
                continue;
            }
            catch(BufferUnderflowException unused_ex) {
            }
            break;
        }
        return null;
    }

    public void setEntries(List list0) {
        JoinPoint joinPoint0 = Factory.makeJP(AbstractSampleEncryptionBox.ajc$tjp_2, this, this, list0);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.entries = list0;
    }

    @DoNotParseDetail
    public void setSubSampleEncryption(boolean z) {
        if(z) {
            this.setFlags(this.getFlags() | 2);
            return;
        }
        this.setFlags(this.getFlags() & 0xFFFFFD);
    }
}

