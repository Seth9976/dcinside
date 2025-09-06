package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class HevcDecoderConfigurationRecord {
    public static class Array {
        public boolean array_completeness;
        public List nalUnits;
        public int nal_unit_type;
        public boolean reserved;

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null || this.getClass() != object0.getClass() || this.array_completeness != ((Array)object0).array_completeness) {
                return false;
            }
            if(this.nal_unit_type != ((Array)object0).nal_unit_type) {
                return false;
            }
            if(this.reserved != ((Array)object0).reserved) {
                return false;
            }
            ListIterator listIterator0 = this.nalUnits.listIterator();
            ListIterator listIterator1 = ((Array)object0).nalUnits.listIterator();
            while(listIterator0.hasNext() && listIterator1.hasNext()) {
                byte[] arr_b = (byte[])listIterator0.next();
                byte[] arr_b1 = (byte[])listIterator1.next();
                if(arr_b == null) {
                    if(arr_b1 == null) {
                        continue;
                    }
                    return false;
                }
                if(!Arrays.equals(arr_b, arr_b1)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return !listIterator0.hasNext() && !listIterator1.hasNext();
        }

        @Override
        public int hashCode() {
            int v = ((this.array_completeness * 0x1F + this.reserved) * 0x1F + this.nal_unit_type) * 0x1F;
            return this.nalUnits == null ? v : v + this.nalUnits.hashCode();
        }

        @Override
        public String toString() {
            return "Array{nal_unit_type=" + this.nal_unit_type + ", reserved=" + this.reserved + ", array_completeness=" + this.array_completeness + ", num_nals=" + this.nalUnits.size() + '}';
        }
    }

    List arrays;
    int avgFrameRate;
    int bitDepthChromaMinus8;
    int bitDepthLumaMinus8;
    int chromaFormat;
    int configurationVersion;
    int constantFrameRate;
    boolean frame_only_constraint_flag;
    long general_constraint_indicator_flags;
    int general_level_idc;
    long general_profile_compatibility_flags;
    int general_profile_idc;
    int general_profile_space;
    boolean general_tier_flag;
    boolean interlaced_source_flag;
    int lengthSizeMinusOne;
    int min_spatial_segmentation_idc;
    boolean non_packed_constraint_flag;
    int numTemporalLayers;
    int parallelismType;
    boolean progressive_source_flag;
    int reserved1;
    int reserved2;
    int reserved3;
    int reserved4;
    int reserved5;
    boolean temporalIdNested;

    public HevcDecoderConfigurationRecord() {
        this.reserved1 = 15;
        this.reserved2 = 0x3F;
        this.reserved3 = 0x3F;
        this.reserved4 = 0x1F;
        this.reserved5 = 0x1F;
        this.arrays = new ArrayList();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord0 = (HevcDecoderConfigurationRecord)object0;
            if(this.avgFrameRate != hevcDecoderConfigurationRecord0.avgFrameRate) {
                return false;
            }
            if(this.bitDepthChromaMinus8 != hevcDecoderConfigurationRecord0.bitDepthChromaMinus8) {
                return false;
            }
            if(this.bitDepthLumaMinus8 != hevcDecoderConfigurationRecord0.bitDepthLumaMinus8) {
                return false;
            }
            if(this.chromaFormat != hevcDecoderConfigurationRecord0.chromaFormat) {
                return false;
            }
            if(this.configurationVersion != hevcDecoderConfigurationRecord0.configurationVersion) {
                return false;
            }
            if(this.constantFrameRate != hevcDecoderConfigurationRecord0.constantFrameRate) {
                return false;
            }
            if(this.general_constraint_indicator_flags != hevcDecoderConfigurationRecord0.general_constraint_indicator_flags) {
                return false;
            }
            if(this.general_level_idc != hevcDecoderConfigurationRecord0.general_level_idc) {
                return false;
            }
            if(this.general_profile_compatibility_flags != hevcDecoderConfigurationRecord0.general_profile_compatibility_flags) {
                return false;
            }
            if(this.general_profile_idc != hevcDecoderConfigurationRecord0.general_profile_idc) {
                return false;
            }
            if(this.general_profile_space != hevcDecoderConfigurationRecord0.general_profile_space) {
                return false;
            }
            if(this.general_tier_flag != hevcDecoderConfigurationRecord0.general_tier_flag) {
                return false;
            }
            if(this.lengthSizeMinusOne != hevcDecoderConfigurationRecord0.lengthSizeMinusOne) {
                return false;
            }
            if(this.min_spatial_segmentation_idc != hevcDecoderConfigurationRecord0.min_spatial_segmentation_idc) {
                return false;
            }
            if(this.numTemporalLayers != hevcDecoderConfigurationRecord0.numTemporalLayers) {
                return false;
            }
            if(this.parallelismType != hevcDecoderConfigurationRecord0.parallelismType) {
                return false;
            }
            if(this.reserved1 != hevcDecoderConfigurationRecord0.reserved1) {
                return false;
            }
            if(this.reserved2 != hevcDecoderConfigurationRecord0.reserved2) {
                return false;
            }
            if(this.reserved3 != hevcDecoderConfigurationRecord0.reserved3) {
                return false;
            }
            if(this.reserved4 != hevcDecoderConfigurationRecord0.reserved4) {
                return false;
            }
            if(this.reserved5 != hevcDecoderConfigurationRecord0.reserved5) {
                return false;
            }
            if(this.temporalIdNested != hevcDecoderConfigurationRecord0.temporalIdNested) {
                return false;
            }
            return this.arrays == null ? hevcDecoderConfigurationRecord0.arrays == null : this.arrays.equals(hevcDecoderConfigurationRecord0.arrays);
        }
        return false;
    }

    public List getArrays() {
        return this.arrays;
    }

    public int getAvgFrameRate() {
        return this.avgFrameRate;
    }

    public int getBitDepthChromaMinus8() {
        return this.bitDepthChromaMinus8;
    }

    public int getBitDepthLumaMinus8() {
        return this.bitDepthLumaMinus8;
    }

    public int getChromaFormat() {
        return this.chromaFormat;
    }

    public int getConfigurationVersion() {
        return this.configurationVersion;
    }

    public int getConstantFrameRate() {
        return this.constantFrameRate;
    }

    public long getGeneral_constraint_indicator_flags() {
        return this.general_constraint_indicator_flags;
    }

    public int getGeneral_level_idc() {
        return this.general_level_idc;
    }

    public long getGeneral_profile_compatibility_flags() {
        return this.general_profile_compatibility_flags;
    }

    public int getGeneral_profile_idc() {
        return this.general_profile_idc;
    }

    public int getGeneral_profile_space() {
        return this.general_profile_space;
    }

    public int getLengthSizeMinusOne() {
        return this.lengthSizeMinusOne;
    }

    public int getMin_spatial_segmentation_idc() {
        return this.min_spatial_segmentation_idc;
    }

    public int getNumTemporalLayers() {
        return this.numTemporalLayers;
    }

    public int getParallelismType() {
        return this.parallelismType;
    }

    public int getSize() {
        int v = 23;
        for(Object object0: this.arrays) {
            v += 3;
            for(Object object1: ((Array)object0).nalUnits) {
                v = v + 2 + ((byte[])object1).length;
            }
        }
        return v;
    }

    @Override
    public int hashCode() {
        int v = (((((((((((((((((((((this.configurationVersion * 0x1F + this.general_profile_space) * 0x1F + this.general_tier_flag) * 0x1F + this.general_profile_idc) * 0x1F + ((int)(this.general_profile_compatibility_flags ^ this.general_profile_compatibility_flags >>> 0x20))) * 0x1F + ((int)(this.general_constraint_indicator_flags ^ this.general_constraint_indicator_flags >>> 0x20))) * 0x1F + this.general_level_idc) * 0x1F + this.reserved1) * 0x1F + this.min_spatial_segmentation_idc) * 0x1F + this.reserved2) * 0x1F + this.parallelismType) * 0x1F + this.reserved3) * 0x1F + this.chromaFormat) * 0x1F + this.reserved4) * 0x1F + this.bitDepthLumaMinus8) * 0x1F + this.reserved5) * 0x1F + this.bitDepthChromaMinus8) * 0x1F + this.avgFrameRate) * 0x1F + this.constantFrameRate) * 0x1F + this.numTemporalLayers) * 0x1F + this.temporalIdNested) * 0x1F + this.lengthSizeMinusOne) * 0x1F;
        return this.arrays == null ? v : v + this.arrays.hashCode();
    }

    public boolean isFrame_only_constraint_flag() {
        return this.frame_only_constraint_flag;
    }

    public boolean isGeneral_tier_flag() {
        return this.general_tier_flag;
    }

    public boolean isInterlaced_source_flag() {
        return this.interlaced_source_flag;
    }

    public boolean isNon_packed_constraint_flag() {
        return this.non_packed_constraint_flag;
    }

    public boolean isProgressive_source_flag() {
        return this.progressive_source_flag;
    }

    public boolean isTemporalIdNested() {
        return this.temporalIdNested;
    }

    public void parse(ByteBuffer byteBuffer0) {
        this.configurationVersion = IsoTypeReader.readUInt8(byteBuffer0);
        int v = IsoTypeReader.readUInt8(byteBuffer0);
        this.general_profile_space = (v & 0xC0) >> 6;
        this.general_tier_flag = (v & 0x20) > 0;
        this.general_profile_idc = v & 0x1F;
        this.general_profile_compatibility_flags = IsoTypeReader.readUInt32(byteBuffer0);
        long v1 = IsoTypeReader.readUInt48(byteBuffer0);
        this.frame_only_constraint_flag = (v1 >> 44 & 8L) > 0L;
        this.non_packed_constraint_flag = (v1 >> 44 & 4L) > 0L;
        this.interlaced_source_flag = (v1 >> 44 & 2L) > 0L;
        this.progressive_source_flag = (v1 >> 44 & 1L) > 0L;
        this.general_constraint_indicator_flags = v1 & 0x7FFFFFFFFFFFL;
        this.general_level_idc = IsoTypeReader.readUInt8(byteBuffer0);
        int v2 = IsoTypeReader.readUInt16(byteBuffer0);
        this.reserved1 = (0xF000 & v2) >> 12;
        this.min_spatial_segmentation_idc = v2 & 0xFFF;
        int v3 = IsoTypeReader.readUInt8(byteBuffer0);
        this.reserved2 = (v3 & 0xFC) >> 2;
        this.parallelismType = v3 & 3;
        int v4 = IsoTypeReader.readUInt8(byteBuffer0);
        this.reserved3 = (v4 & 0xFC) >> 2;
        this.chromaFormat = v4 & 3;
        int v5 = IsoTypeReader.readUInt8(byteBuffer0);
        this.reserved4 = (v5 & 0xF8) >> 3;
        this.bitDepthLumaMinus8 = v5 & 7;
        int v6 = IsoTypeReader.readUInt8(byteBuffer0);
        this.reserved5 = (v6 & 0xF8) >> 3;
        this.bitDepthChromaMinus8 = v6 & 7;
        this.avgFrameRate = IsoTypeReader.readUInt16(byteBuffer0);
        int v7 = IsoTypeReader.readUInt8(byteBuffer0);
        this.constantFrameRate = (v7 & 0xC0) >> 6;
        this.numTemporalLayers = (v7 & 56) >> 3;
        this.temporalIdNested = (v7 & 4) > 0;
        this.lengthSizeMinusOne = v7 & 3;
        int v8 = IsoTypeReader.readUInt8(byteBuffer0);
        this.arrays = new ArrayList();
        for(int v9 = 0; v9 < v8; ++v9) {
            Array hevcDecoderConfigurationRecord$Array0 = new Array();
            int v10 = IsoTypeReader.readUInt8(byteBuffer0);
            hevcDecoderConfigurationRecord$Array0.array_completeness = (v10 & 0x80) > 0;
            hevcDecoderConfigurationRecord$Array0.reserved = (v10 & 0x40) > 0;
            hevcDecoderConfigurationRecord$Array0.nal_unit_type = v10 & 0x3F;
            int v11 = IsoTypeReader.readUInt16(byteBuffer0);
            hevcDecoderConfigurationRecord$Array0.nalUnits = new ArrayList();
            for(int v12 = 0; v12 < v11; ++v12) {
                byte[] arr_b = new byte[IsoTypeReader.readUInt16(byteBuffer0)];
                byteBuffer0.get(arr_b);
                hevcDecoderConfigurationRecord$Array0.nalUnits.add(arr_b);
            }
            this.arrays.add(hevcDecoderConfigurationRecord$Array0);
        }
    }

    public void setArrays(List list0) {
        this.arrays = list0;
    }

    public void setAvgFrameRate(int v) {
        this.avgFrameRate = v;
    }

    public void setBitDepthChromaMinus8(int v) {
        this.bitDepthChromaMinus8 = v;
    }

    public void setBitDepthLumaMinus8(int v) {
        this.bitDepthLumaMinus8 = v;
    }

    public void setChromaFormat(int v) {
        this.chromaFormat = v;
    }

    public void setConfigurationVersion(int v) {
        this.configurationVersion = v;
    }

    public void setConstantFrameRate(int v) {
        this.constantFrameRate = v;
    }

    public void setFrame_only_constraint_flag(boolean z) {
        this.frame_only_constraint_flag = z;
    }

    public void setGeneral_constraint_indicator_flags(long v) {
        this.general_constraint_indicator_flags = v;
    }

    public void setGeneral_level_idc(int v) {
        this.general_level_idc = v;
    }

    public void setGeneral_profile_compatibility_flags(long v) {
        this.general_profile_compatibility_flags = v;
    }

    public void setGeneral_profile_idc(int v) {
        this.general_profile_idc = v;
    }

    public void setGeneral_profile_space(int v) {
        this.general_profile_space = v;
    }

    public void setGeneral_tier_flag(boolean z) {
        this.general_tier_flag = z;
    }

    public void setInterlaced_source_flag(boolean z) {
        this.interlaced_source_flag = z;
    }

    public void setLengthSizeMinusOne(int v) {
        this.lengthSizeMinusOne = v;
    }

    public void setMin_spatial_segmentation_idc(int v) {
        this.min_spatial_segmentation_idc = v;
    }

    public void setNon_packed_constraint_flag(boolean z) {
        this.non_packed_constraint_flag = z;
    }

    public void setNumTemporalLayers(int v) {
        this.numTemporalLayers = v;
    }

    public void setParallelismType(int v) {
        this.parallelismType = v;
    }

    public void setProgressive_source_flag(boolean z) {
        this.progressive_source_flag = z;
    }

    public void setTemporalIdNested(boolean z) {
        this.temporalIdNested = z;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        stringBuilder0.append(this.configurationVersion);
        stringBuilder0.append(", general_profile_space=");
        stringBuilder0.append(this.general_profile_space);
        stringBuilder0.append(", general_tier_flag=");
        stringBuilder0.append(this.general_tier_flag);
        stringBuilder0.append(", general_profile_idc=");
        stringBuilder0.append(this.general_profile_idc);
        stringBuilder0.append(", general_profile_compatibility_flags=");
        stringBuilder0.append(this.general_profile_compatibility_flags);
        stringBuilder0.append(", general_constraint_indicator_flags=");
        stringBuilder0.append(this.general_constraint_indicator_flags);
        stringBuilder0.append(", general_level_idc=");
        stringBuilder0.append(this.general_level_idc);
        String s = "";
        stringBuilder0.append((this.reserved1 == 15 ? "" : ", reserved1=" + this.reserved1));
        stringBuilder0.append(", min_spatial_segmentation_idc=");
        stringBuilder0.append(this.min_spatial_segmentation_idc);
        stringBuilder0.append((this.reserved2 == 0x3F ? "" : ", reserved2=" + this.reserved2));
        stringBuilder0.append(", parallelismType=");
        stringBuilder0.append(this.parallelismType);
        stringBuilder0.append((this.reserved3 == 0x3F ? "" : ", reserved3=" + this.reserved3));
        stringBuilder0.append(", chromaFormat=");
        stringBuilder0.append(this.chromaFormat);
        stringBuilder0.append((this.reserved4 == 0x1F ? "" : ", reserved4=" + this.reserved4));
        stringBuilder0.append(", bitDepthLumaMinus8=");
        stringBuilder0.append(this.bitDepthLumaMinus8);
        if(this.reserved5 != 0x1F) {
            s = ", reserved5=" + this.reserved5;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", bitDepthChromaMinus8=");
        stringBuilder0.append(this.bitDepthChromaMinus8);
        stringBuilder0.append(", avgFrameRate=");
        stringBuilder0.append(this.avgFrameRate);
        stringBuilder0.append(", constantFrameRate=");
        stringBuilder0.append(this.constantFrameRate);
        stringBuilder0.append(", numTemporalLayers=");
        stringBuilder0.append(this.numTemporalLayers);
        stringBuilder0.append(", temporalIdNested=");
        stringBuilder0.append(this.temporalIdNested);
        stringBuilder0.append(", lengthSizeMinusOne=");
        stringBuilder0.append(this.lengthSizeMinusOne);
        stringBuilder0.append(", arrays=");
        stringBuilder0.append(this.arrays);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public void write(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeUInt8(byteBuffer0, this.configurationVersion);
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.general_profile_space << 6) + (this.general_tier_flag ? 0x20 : 0) + this.general_profile_idc);
        IsoTypeWriter.writeUInt32(byteBuffer0, this.general_profile_compatibility_flags);
        long v = this.frame_only_constraint_flag ? this.general_constraint_indicator_flags | 0x800000000000L : this.general_constraint_indicator_flags;
        if(this.non_packed_constraint_flag) {
            v |= 0x400000000000L;
        }
        if(this.interlaced_source_flag) {
            v |= 0x200000000000L;
        }
        if(this.progressive_source_flag) {
            v |= 0x100000000000L;
        }
        IsoTypeWriter.writeUInt48(byteBuffer0, v);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.general_level_idc);
        IsoTypeWriter.writeUInt16(byteBuffer0, (this.reserved1 << 12) + this.min_spatial_segmentation_idc);
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.reserved2 << 2) + this.parallelismType);
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.reserved3 << 2) + this.chromaFormat);
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.reserved4 << 3) + this.bitDepthLumaMinus8);
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.reserved5 << 3) + this.bitDepthChromaMinus8);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.avgFrameRate);
        IsoTypeWriter.writeUInt8(byteBuffer0, (this.constantFrameRate << 6) + (this.numTemporalLayers << 3) + (this.temporalIdNested ? 4 : 0) + this.lengthSizeMinusOne);
        IsoTypeWriter.writeUInt8(byteBuffer0, this.arrays.size());
        for(Object object0: this.arrays) {
            IsoTypeWriter.writeUInt8(byteBuffer0, (((Array)object0).array_completeness ? 0x80 : 0) + (((Array)object0).reserved ? 0x40 : 0) + ((Array)object0).nal_unit_type);
            IsoTypeWriter.writeUInt16(byteBuffer0, ((Array)object0).nalUnits.size());
            for(Object object1: ((Array)object0).nalUnits) {
                IsoTypeWriter.writeUInt16(byteBuffer0, ((byte[])object1).length);
                byteBuffer0.put(((byte[])object1));
            }
        }
    }
}

