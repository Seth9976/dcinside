package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.a;
import org.slf4j.b;

@Descriptor(tags = {4})
public class DecoderConfigDescriptor extends BaseDescriptor {
    private static final a LOG;
    AudioSpecificConfig audioSpecificInfo;
    long avgBitRate;
    int bufferSizeDB;
    byte[] configDescriptorDeadBytes;
    DecoderSpecificInfo decoderSpecificInfo;
    long maxBitRate;
    int objectTypeIndication;
    List profileLevelIndicationDescriptors;
    int streamType;
    int upStream;

    static {
        DecoderConfigDescriptor.LOG = b.i(DecoderConfigDescriptor.class);
    }

    public DecoderConfigDescriptor() {
        this.profileLevelIndicationDescriptors = new ArrayList();
        this.tag = 4;
    }

    public AudioSpecificConfig getAudioSpecificInfo() {
        return this.audioSpecificInfo;
    }

    public long getAvgBitRate() {
        return this.avgBitRate;
    }

    public int getBufferSizeDB() {
        return this.bufferSizeDB;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        int v = 0;
        int v1 = this.audioSpecificInfo == null ? 0 : this.audioSpecificInfo.getSize();
        DecoderSpecificInfo decoderSpecificInfo0 = this.decoderSpecificInfo;
        if(decoderSpecificInfo0 != null) {
            v = decoderSpecificInfo0.getSize();
        }
        int v2 = v1 + 13 + v;
        for(Object object0: this.profileLevelIndicationDescriptors) {
            v2 += ((ProfileLevelIndicationDescriptor)object0).getSize();
        }
        return v2;
    }

    public DecoderSpecificInfo getDecoderSpecificInfo() {
        return this.decoderSpecificInfo;
    }

    public long getMaxBitRate() {
        return this.maxBitRate;
    }

    public int getObjectTypeIndication() {
        return this.objectTypeIndication;
    }

    public List getProfileLevelIndicationDescriptors() {
        return this.profileLevelIndicationDescriptors;
    }

    public int getStreamType() {
        return this.streamType;
    }

    public int getUpStream() {
        return this.upStream;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer0) throws IOException {
        this.objectTypeIndication = IsoTypeReader.readUInt8(byteBuffer0);
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        this.streamType = v >>> 2;
        this.upStream = v >> 1 & 1;
        this.bufferSizeDB = IsoTypeReader.readUInt24(byteBuffer0);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer0);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer0);
        while(byteBuffer0.remaining() > 2) {
            BaseDescriptor baseDescriptor0 = ObjectDescriptorFactory.createFrom(this.objectTypeIndication, byteBuffer0);
            Integer integer0 = baseDescriptor0 == null ? null : baseDescriptor0.getSize();
            DecoderConfigDescriptor.LOG.P("{} - DecoderConfigDescr1 read: {}, size: {}", new Object[]{baseDescriptor0, 0, integer0});
            if(baseDescriptor0 != null) {
                int v1 = baseDescriptor0.getSize();
                if(0 < v1) {
                    byte[] arr_b = new byte[v1];
                    this.configDescriptorDeadBytes = arr_b;
                    byteBuffer0.get(arr_b);
                }
            }
            if(baseDescriptor0 instanceof DecoderSpecificInfo) {
                this.decoderSpecificInfo = (DecoderSpecificInfo)baseDescriptor0;
            }
            else if(baseDescriptor0 instanceof AudioSpecificConfig) {
                this.audioSpecificInfo = (AudioSpecificConfig)baseDescriptor0;
            }
            else if(baseDescriptor0 instanceof ProfileLevelIndicationDescriptor) {
                this.profileLevelIndicationDescriptors.add(((ProfileLevelIndicationDescriptor)baseDescriptor0));
            }
        }
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.getSize());
        IsoTypeWriter.writeUInt8(byteBuffer0, this.tag);
        this.writeSize(byteBuffer0, this.getContentSize());
        IsoTypeWriter.writeUInt8(byteBuffer0, this.objectTypeIndication);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.streamType << 2 | this.upStream << 1 | 1);
        IsoTypeWriter.writeUInt24(byteBuffer0, this.bufferSizeDB);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.maxBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.avgBitRate);
        DecoderSpecificInfo decoderSpecificInfo0 = this.decoderSpecificInfo;
        if(decoderSpecificInfo0 != null) {
            byteBuffer0.put(decoderSpecificInfo0.serialize());
        }
        AudioSpecificConfig audioSpecificConfig0 = this.audioSpecificInfo;
        if(audioSpecificConfig0 != null) {
            byteBuffer0.put(audioSpecificConfig0.serialize());
        }
        for(Object object0: this.profileLevelIndicationDescriptors) {
            byteBuffer0.put(((ProfileLevelIndicationDescriptor)object0).serialize());
        }
        return (ByteBuffer)byteBuffer0.rewind();
    }

    public void setAudioSpecificInfo(AudioSpecificConfig audioSpecificConfig0) {
        this.audioSpecificInfo = audioSpecificConfig0;
    }

    public void setAvgBitRate(long v) {
        this.avgBitRate = v;
    }

    public void setBufferSizeDB(int v) {
        this.bufferSizeDB = v;
    }

    public void setDecoderSpecificInfo(DecoderSpecificInfo decoderSpecificInfo0) {
        this.decoderSpecificInfo = decoderSpecificInfo0;
    }

    public void setMaxBitRate(long v) {
        this.maxBitRate = v;
    }

    public void setObjectTypeIndication(int v) {
        this.objectTypeIndication = v;
    }

    public void setStreamType(int v) {
        this.streamType = v;
    }

    public void setUpStream(int v) {
        this.upStream = v;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("DecoderConfigDescriptor");
        stringBuilder0.append("{objectTypeIndication=");
        stringBuilder0.append(this.objectTypeIndication);
        stringBuilder0.append(", streamType=");
        stringBuilder0.append(this.streamType);
        stringBuilder0.append(", upStream=");
        stringBuilder0.append(this.upStream);
        stringBuilder0.append(", bufferSizeDB=");
        stringBuilder0.append(this.bufferSizeDB);
        stringBuilder0.append(", maxBitRate=");
        stringBuilder0.append(this.maxBitRate);
        stringBuilder0.append(", avgBitRate=");
        stringBuilder0.append(this.avgBitRate);
        stringBuilder0.append(", decoderSpecificInfo=");
        stringBuilder0.append(this.decoderSpecificInfo);
        stringBuilder0.append(", audioSpecificInfo=");
        stringBuilder0.append(this.audioSpecificInfo);
        stringBuilder0.append(", configDescriptorDeadBytes=");
        stringBuilder0.append(Hex.encodeHex((this.configDescriptorDeadBytes == null ? new byte[0] : this.configDescriptorDeadBytes)));
        stringBuilder0.append(", profileLevelIndicationDescriptors=");
        List list0 = this.profileLevelIndicationDescriptors;
        if(list0 == null) {
            list0 = "null";
        }
        stringBuilder0.append(list0);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

