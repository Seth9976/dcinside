package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.a;
import org.slf4j.b;

@Descriptor(tags = {3})
public class ESDescriptor extends BaseDescriptor {
    private static a LOG;
    int URLFlag;
    int URLLength;
    String URLString;
    DecoderConfigDescriptor decoderConfigDescriptor;
    int dependsOnEsId;
    int esId;
    int oCREsId;
    int oCRstreamFlag;
    List otherDescriptors;
    int remoteODFlag;
    SLConfigDescriptor slConfigDescriptor;
    int streamDependenceFlag;
    int streamPriority;

    static {
        ESDescriptor.LOG = b.i(ESDescriptor.class);
    }

    public ESDescriptor() {
        this.URLLength = 0;
        this.otherDescriptors = new ArrayList();
        this.tag = 3;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.URLFlag != ((ESDescriptor)object0).URLFlag) {
            return false;
        }
        if(this.URLLength != ((ESDescriptor)object0).URLLength) {
            return false;
        }
        if(this.dependsOnEsId != ((ESDescriptor)object0).dependsOnEsId) {
            return false;
        }
        if(this.esId != ((ESDescriptor)object0).esId) {
            return false;
        }
        if(this.oCREsId != ((ESDescriptor)object0).oCREsId) {
            return false;
        }
        if(this.oCRstreamFlag != ((ESDescriptor)object0).oCRstreamFlag) {
            return false;
        }
        if(this.remoteODFlag != ((ESDescriptor)object0).remoteODFlag) {
            return false;
        }
        if(this.streamDependenceFlag != ((ESDescriptor)object0).streamDependenceFlag) {
            return false;
        }
        if(this.streamPriority != ((ESDescriptor)object0).streamPriority) {
            return false;
        }
        String s = this.URLString;
        if(s != null) {
            if(!s.equals(((ESDescriptor)object0).URLString)) {
                return false;
            }
        }
        else if(((ESDescriptor)object0).URLString != null) {
            return false;
        }
        DecoderConfigDescriptor decoderConfigDescriptor0 = this.decoderConfigDescriptor;
        if(decoderConfigDescriptor0 != null) {
            if(!decoderConfigDescriptor0.equals(((ESDescriptor)object0).decoderConfigDescriptor)) {
                return false;
            }
        }
        else if(((ESDescriptor)object0).decoderConfigDescriptor != null) {
            return false;
        }
        List list0 = this.otherDescriptors;
        if(list0 != null) {
            if(!list0.equals(((ESDescriptor)object0).otherDescriptors)) {
                return false;
            }
        }
        else if(((ESDescriptor)object0).otherDescriptors != null) {
            return false;
        }
        SLConfigDescriptor sLConfigDescriptor0 = this.slConfigDescriptor;
        SLConfigDescriptor sLConfigDescriptor1 = ((ESDescriptor)object0).slConfigDescriptor;
        return sLConfigDescriptor0 == null ? sLConfigDescriptor1 == null : sLConfigDescriptor0.equals(sLConfigDescriptor1);
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        int v = this.streamDependenceFlag <= 0 ? 3 : 5;
        if(this.URLFlag > 0) {
            v += this.URLLength + 1;
        }
        if(this.oCRstreamFlag > 0) {
            v += 2;
        }
        int v1 = this.decoderConfigDescriptor.getSize();
        int v2 = this.slConfigDescriptor.getSize();
        if(this.otherDescriptors.size() > 0) {
            throw new RuntimeException(" Doesn\'t handle other descriptors yet");
        }
        return v + v1 + v2;
    }

    public DecoderConfigDescriptor getDecoderConfigDescriptor() {
        return this.decoderConfigDescriptor;
    }

    public int getDependsOnEsId() {
        return this.dependsOnEsId;
    }

    public int getEsId() {
        return this.esId;
    }

    public List getOtherDescriptors() {
        return this.otherDescriptors;
    }

    public int getRemoteODFlag() {
        return this.remoteODFlag;
    }

    public SLConfigDescriptor getSlConfigDescriptor() {
        return this.slConfigDescriptor;
    }

    public int getStreamDependenceFlag() {
        return this.streamDependenceFlag;
    }

    public int getStreamPriority() {
        return this.streamPriority;
    }

    public int getURLFlag() {
        return this.URLFlag;
    }

    public int getURLLength() {
        return this.URLLength;
    }

    public String getURLString() {
        return this.URLString;
    }

    public int getoCREsId() {
        return this.oCREsId;
    }

    public int getoCRstreamFlag() {
        return this.oCRstreamFlag;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (((((((((this.esId * 0x1F + this.streamDependenceFlag) * 0x1F + this.URLFlag) * 0x1F + this.oCRstreamFlag) * 0x1F + this.streamPriority) * 0x1F + this.URLLength) * 0x1F + (this.URLString == null ? 0 : this.URLString.hashCode())) * 0x1F + this.remoteODFlag) * 0x1F + this.dependsOnEsId) * 0x1F + this.oCREsId) * 0x1F;
        int v2 = this.decoderConfigDescriptor == null ? 0 : this.decoderConfigDescriptor.hashCode();
        int v3 = this.slConfigDescriptor == null ? 0 : this.slConfigDescriptor.hashCode();
        List list0 = this.otherDescriptors;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer0) throws IOException {
        this.esId = IsoTypeReader.readUInt16(byteBuffer0);
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        this.streamDependenceFlag = v >>> 7;
        this.URLFlag = v >>> 6 & 1;
        this.oCRstreamFlag = v >>> 5 & 1;
        this.streamPriority = v & 0x1F;
        if(v >>> 7 == 1) {
            this.dependsOnEsId = IsoTypeReader.readUInt16(byteBuffer0);
        }
        if(this.URLFlag == 1) {
            int v1 = IsoTypeReader.readUInt8(byteBuffer0);
            this.URLLength = v1;
            this.URLString = IsoTypeReader.readString(byteBuffer0, v1);
        }
        if(this.oCRstreamFlag == 1) {
            this.oCREsId = IsoTypeReader.readUInt16(byteBuffer0);
        }
        while(byteBuffer0.remaining() > 1) {
            BaseDescriptor baseDescriptor0 = ObjectDescriptorFactory.createFrom(-1, byteBuffer0);
            if(baseDescriptor0 instanceof DecoderConfigDescriptor) {
                this.decoderConfigDescriptor = (DecoderConfigDescriptor)baseDescriptor0;
            }
            else if(baseDescriptor0 instanceof SLConfigDescriptor) {
                this.slConfigDescriptor = (SLConfigDescriptor)baseDescriptor0;
            }
            else {
                this.otherDescriptors.add(baseDescriptor0);
            }
        }
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[this.getSize()]);
        IsoTypeWriter.writeUInt8(byteBuffer0, 3);
        this.writeSize(byteBuffer0, this.getContentSize());
        IsoTypeWriter.writeUInt16(byteBuffer0, this.esId);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.streamDependenceFlag << 7 | this.URLFlag << 6 | this.oCRstreamFlag << 5 | this.streamPriority & 0x1F);
        if(this.streamDependenceFlag > 0) {
            IsoTypeWriter.writeUInt16(byteBuffer0, this.dependsOnEsId);
        }
        if(this.URLFlag > 0) {
            IsoTypeWriter.writeUInt8(byteBuffer0, this.URLLength);
            IsoTypeWriter.writeUtf8String(byteBuffer0, this.URLString);
        }
        if(this.oCRstreamFlag > 0) {
            IsoTypeWriter.writeUInt16(byteBuffer0, this.oCREsId);
        }
        ByteBuffer byteBuffer1 = this.decoderConfigDescriptor.serialize();
        ByteBuffer byteBuffer2 = this.slConfigDescriptor.serialize();
        byteBuffer0.put(byteBuffer1.array());
        byteBuffer0.put(byteBuffer2.array());
        return byteBuffer0;
    }

    public void setDecoderConfigDescriptor(DecoderConfigDescriptor decoderConfigDescriptor0) {
        this.decoderConfigDescriptor = decoderConfigDescriptor0;
    }

    public void setDependsOnEsId(int v) {
        this.dependsOnEsId = v;
    }

    public void setEsId(int v) {
        this.esId = v;
    }

    public void setRemoteODFlag(int v) {
        this.remoteODFlag = v;
    }

    public void setSlConfigDescriptor(SLConfigDescriptor sLConfigDescriptor0) {
        this.slConfigDescriptor = sLConfigDescriptor0;
    }

    public void setStreamDependenceFlag(int v) {
        this.streamDependenceFlag = v;
    }

    public void setStreamPriority(int v) {
        this.streamPriority = v;
    }

    public void setURLFlag(int v) {
        this.URLFlag = v;
    }

    public void setURLLength(int v) {
        this.URLLength = v;
    }

    public void setURLString(String s) {
        this.URLString = s;
    }

    public void setoCREsId(int v) {
        this.oCREsId = v;
    }

    public void setoCRstreamFlag(int v) {
        this.oCRstreamFlag = v;
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        return "ESDescriptor{esId=" + this.esId + ", streamDependenceFlag=" + this.streamDependenceFlag + ", URLFlag=" + this.URLFlag + ", oCRstreamFlag=" + this.oCRstreamFlag + ", streamPriority=" + this.streamPriority + ", URLLength=" + this.URLLength + ", URLString=\'" + this.URLString + '\'' + ", remoteODFlag=" + this.remoteODFlag + ", dependsOnEsId=" + this.dependsOnEsId + ", oCREsId=" + this.oCREsId + ", decoderConfigDescriptor=" + this.decoderConfigDescriptor + ", slConfigDescriptor=" + this.slConfigDescriptor + '}';
    }
}

