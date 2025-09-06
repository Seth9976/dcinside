package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import org.mp4parser.boxes.samplegrouping.GroupEntry;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class TemporalLayerSampleGroup extends GroupEntry {
    public static final String TYPE = "tscl";
    int temporalLayerId;
    int tlAvgBitRate;
    int tlAvgFrameRate;
    int tlConstantFrameRate;
    int tlMaxBitRate;
    long tlconstraint_indicator_flags;
    int tllevel_idc;
    long tlprofile_compatibility_flags;
    int tlprofile_idc;
    int tlprofile_space;
    boolean tltier_flag;

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.temporalLayerId != ((TemporalLayerSampleGroup)object0).temporalLayerId) {
            return false;
        }
        if(this.tlAvgBitRate != ((TemporalLayerSampleGroup)object0).tlAvgBitRate) {
            return false;
        }
        if(this.tlAvgFrameRate != ((TemporalLayerSampleGroup)object0).tlAvgFrameRate) {
            return false;
        }
        if(this.tlConstantFrameRate != ((TemporalLayerSampleGroup)object0).tlConstantFrameRate) {
            return false;
        }
        if(this.tlMaxBitRate != ((TemporalLayerSampleGroup)object0).tlMaxBitRate) {
            return false;
        }
        if(this.tlconstraint_indicator_flags != ((TemporalLayerSampleGroup)object0).tlconstraint_indicator_flags) {
            return false;
        }
        if(this.tllevel_idc != ((TemporalLayerSampleGroup)object0).tllevel_idc) {
            return false;
        }
        if(this.tlprofile_compatibility_flags != ((TemporalLayerSampleGroup)object0).tlprofile_compatibility_flags) {
            return false;
        }
        if(this.tlprofile_idc != ((TemporalLayerSampleGroup)object0).tlprofile_idc) {
            return false;
        }
        return this.tlprofile_space == ((TemporalLayerSampleGroup)object0).tlprofile_space ? this.tltier_flag == ((TemporalLayerSampleGroup)object0).tltier_flag : false;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(20);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.temporalLayerId);
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.tlprofile_space << 6) + (this.tltier_flag ? 0x20 : 0) + this.tlprofile_idc);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.tlprofile_compatibility_flags);
        IsoTypeWriter.writeUInt48(byteBuffer0, this.tlconstraint_indicator_flags);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.tllevel_idc);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.tlMaxBitRate);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.tlAvgBitRate);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.tlConstantFrameRate);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.tlAvgFrameRate);
        return (ByteBuffer)byteBuffer0.rewind();
    }

    public int getTemporalLayerId() {
        return this.temporalLayerId;
    }

    public int getTlAvgBitRate() {
        return this.tlAvgBitRate;
    }

    public int getTlAvgFrameRate() {
        return this.tlAvgFrameRate;
    }

    public int getTlConstantFrameRate() {
        return this.tlConstantFrameRate;
    }

    public int getTlMaxBitRate() {
        return this.tlMaxBitRate;
    }

    public long getTlconstraint_indicator_flags() {
        return this.tlconstraint_indicator_flags;
    }

    public int getTllevel_idc() {
        return this.tllevel_idc;
    }

    public long getTlprofile_compatibility_flags() {
        return this.tlprofile_compatibility_flags;
    }

    public int getTlprofile_idc() {
        return this.tlprofile_idc;
    }

    public int getTlprofile_space() {
        return this.tlprofile_space;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public String getType() {
        return "tscl";
    }

    @Override
    public int hashCode() {
        return (((((((((this.temporalLayerId * 0x1F + this.tlprofile_space) * 0x1F + this.tltier_flag) * 0x1F + this.tlprofile_idc) * 0x1F + ((int)(this.tlprofile_compatibility_flags ^ this.tlprofile_compatibility_flags >>> 0x20))) * 0x1F + ((int)(this.tlconstraint_indicator_flags ^ this.tlconstraint_indicator_flags >>> 0x20))) * 0x1F + this.tllevel_idc) * 0x1F + this.tlMaxBitRate) * 0x1F + this.tlAvgBitRate) * 0x1F + this.tlConstantFrameRate) * 0x1F + this.tlAvgFrameRate;
    }

    public boolean isTltier_flag() {
        return this.tltier_flag;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer0) {
        this.temporalLayerId = IsoTypeReader.readUInt8(byteBuffer0);
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        this.tlprofile_space = (v & 0xC0) >> 6;
        this.tltier_flag = (v & 0x20) > 0;
        this.tlprofile_idc = v & 0x1F;
        this.tlprofile_compatibility_flags = IsoTypeReader.readUInt32(byteBuffer0);
        this.tlconstraint_indicator_flags = IsoTypeReader.readUInt48(byteBuffer0);
        this.tllevel_idc = IsoTypeReader.readUInt8(byteBuffer0);
        this.tlMaxBitRate = IsoTypeReader.readUInt16(byteBuffer0);
        this.tlAvgBitRate = IsoTypeReader.readUInt16(byteBuffer0);
        this.tlConstantFrameRate = IsoTypeReader.readUInt8(byteBuffer0);
        this.tlAvgFrameRate = IsoTypeReader.readUInt16(byteBuffer0);
    }

    public void setTemporalLayerId(int v) {
        this.temporalLayerId = v;
    }

    public void setTlAvgBitRate(int v) {
        this.tlAvgBitRate = v;
    }

    public void setTlAvgFrameRate(int v) {
        this.tlAvgFrameRate = v;
    }

    public void setTlConstantFrameRate(int v) {
        this.tlConstantFrameRate = v;
    }

    public void setTlMaxBitRate(int v) {
        this.tlMaxBitRate = v;
    }

    public void setTlconstraint_indicator_flags(long v) {
        this.tlconstraint_indicator_flags = v;
    }

    public void setTllevel_idc(int v) {
        this.tllevel_idc = v;
    }

    public void setTlprofile_compatibility_flags(long v) {
        this.tlprofile_compatibility_flags = v;
    }

    public void setTlprofile_idc(int v) {
        this.tlprofile_idc = v;
    }

    public void setTlprofile_space(int v) {
        this.tlprofile_space = v;
    }

    public void setTltier_flag(boolean z) {
        this.tltier_flag = z;
    }

    @Override  // org.mp4parser.boxes.samplegrouping.GroupEntry
    public int size() {
        return 20;
    }

    @Override
    public String toString() {
        return "TemporalLayerSampleGroup{temporalLayerId=" + this.temporalLayerId + ", tlprofile_space=" + this.tlprofile_space + ", tltier_flag=" + this.tltier_flag + ", tlprofile_idc=" + this.tlprofile_idc + ", tlprofile_compatibility_flags=" + this.tlprofile_compatibility_flags + ", tlconstraint_indicator_flags=" + this.tlconstraint_indicator_flags + ", tllevel_idc=" + this.tllevel_idc + ", tlMaxBitRate=" + this.tlMaxBitRate + ", tlAvgBitRate=" + this.tlAvgBitRate + ", tlConstantFrameRate=" + this.tlConstantFrameRate + ", tlAvgFrameRate=" + this.tlAvgFrameRate + '}';
    }
}

