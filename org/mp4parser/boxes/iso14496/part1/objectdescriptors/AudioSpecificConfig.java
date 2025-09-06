package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeWriter;

@Descriptor(objectTypeIndication = 0x40, tags = {5})
public class AudioSpecificConfig extends BaseDescriptor {
    public class ELDSpecificConfig {
        private static final int ELDEXT_TERM;
        public boolean aacScalefactorDataResilienceFlag;
        public boolean aacSectionDataResilienceFlag;
        public boolean aacSpectralDataResilienceFlag;
        public boolean frameLengthFlag;
        public boolean ldSbrCrcFlag;
        public boolean ldSbrPresentFlag;
        public boolean ldSbrSamplingRate;

        public ELDSpecificConfig(int v, BitReaderBuffer bitReaderBuffer0) {
            int v3;
            this.frameLengthFlag = bitReaderBuffer0.readBool();
            this.aacSectionDataResilienceFlag = bitReaderBuffer0.readBool();
            this.aacScalefactorDataResilienceFlag = bitReaderBuffer0.readBool();
            this.aacSpectralDataResilienceFlag = bitReaderBuffer0.readBool();
            boolean z = bitReaderBuffer0.readBool();
            this.ldSbrPresentFlag = z;
            if(z) {
                this.ldSbrSamplingRate = bitReaderBuffer0.readBool();
                this.ldSbrCrcFlag = bitReaderBuffer0.readBool();
                this.ld_sbr_header(v, bitReaderBuffer0);
            }
            while(bitReaderBuffer0.readBits(4) != 0) {
                int v1 = bitReaderBuffer0.readBits(4);
                if(v1 == 15) {
                    v3 = bitReaderBuffer0.readBits(8);
                    v1 = v3 + 15;
                }
                else {
                    v3 = 0;
                }
                if(v3 == 0xFF) {
                    v1 += bitReaderBuffer0.readBits(16);
                }
                for(int v2 = 0; v2 < v1; ++v2) {
                    bitReaderBuffer0.readBits(8);
                }
            }
        }

        public void ld_sbr_header(int v, BitReaderBuffer bitReaderBuffer0) {
            int v2;
            switch(v) {
                case 1: 
                case 2: {
                    v2 = 1;
                    break;
                }
                case 3: {
                    v2 = 2;
                    break;
                }
                case 4: 
                case 5: 
                case 6: {
                    v2 = 3;
                    break;
                }
                case 7: {
                    v2 = 4;
                    break;
                }
                default: {
                    v2 = 0;
                }
            }
            for(int v1 = 0; v1 < v2; ++v1) {
                new sbr_header(AudioSpecificConfig.this, bitReaderBuffer0);
            }
        }
    }

    public class sbr_header {
        public boolean bs_alter_scale;
        public boolean bs_amp_res;
        public int bs_freq_scale;
        public boolean bs_header_extra_1;
        public boolean bs_header_extra_2;
        public boolean bs_interpol_freq;
        public int bs_limiter_bands;
        public int bs_limiter_gains;
        public int bs_noise_bands;
        public int bs_reserved;
        public boolean bs_smoothing_mode;
        public int bs_start_freq;
        public int bs_stop_freq;
        public int bs_xover_band;

        public sbr_header(BitReaderBuffer bitReaderBuffer0) {
            this.bs_amp_res = bitReaderBuffer0.readBool();
            this.bs_start_freq = bitReaderBuffer0.readBits(4);
            this.bs_stop_freq = bitReaderBuffer0.readBits(4);
            this.bs_xover_band = bitReaderBuffer0.readBits(3);
            this.bs_reserved = bitReaderBuffer0.readBits(2);
            this.bs_header_extra_1 = bitReaderBuffer0.readBool();
            this.bs_header_extra_2 = bitReaderBuffer0.readBool();
            if(this.bs_header_extra_1) {
                this.bs_freq_scale = bitReaderBuffer0.readBits(2);
                this.bs_alter_scale = bitReaderBuffer0.readBool();
                this.bs_noise_bands = bitReaderBuffer0.readBits(2);
            }
            if(this.bs_header_extra_2) {
                this.bs_limiter_bands = bitReaderBuffer0.readBits(2);
                this.bs_limiter_gains = bitReaderBuffer0.readBits(2);
                this.bs_interpol_freq = bitReaderBuffer0.readBool();
            }
            this.bs_smoothing_mode = bitReaderBuffer0.readBool();
        }
    }

    public boolean aacScalefactorDataResilienceFlag;
    public boolean aacSectionDataResilienceFlag;
    public boolean aacSpectralDataResilienceFlag;
    public int audioObjectType;
    public static Map audioObjectTypeMap;
    public int channelConfiguration;
    byte[] configBytes;
    public int coreCoderDelay;
    public int dependsOnCoreCoder;
    public int directMapping;
    public ELDSpecificConfig eldSpecificConfig;
    public int epConfig;
    public int erHvxcExtensionFlag;
    public int extensionAudioObjectType;
    public int extensionChannelConfiguration;
    public int extensionFlag;
    public int extensionFlag3;
    public int extensionSamplingFrequency;
    public int extensionSamplingFrequencyIndex;
    public int fillBits;
    public int frameLengthFlag;
    public boolean gaSpecificConfig;
    public int hilnContMode;
    public int hilnEnhaLayer;
    public int hilnEnhaQuantMode;
    public int hilnFrameLength;
    public int hilnMaxNumLine;
    public int hilnQuantMode;
    public int hilnSampleRateCode;
    public int hvxcRateMode;
    public int hvxcVarMode;
    public int innerSyncExtensionType;
    public int isBaseLayer;
    public int layerNr;
    public int layer_length;
    public int numOfSubFrame;
    public int origExtensionAudioObjectType;
    public int originalAudioObjectType;
    public int outerSyncExtensionType;
    public int paraExtensionFlag;
    public int paraMode;
    public boolean parametricSpecificConfig;
    boolean parsed;
    public boolean psPresentFlag;
    public int sacPayloadEmbedding;
    public int samplingFrequency;
    public int samplingFrequencyIndex;
    public static Map samplingFrequencyIndexMap;
    public boolean sbrPresentFlag;
    public int syncExtensionType;
    public int var_ScalableFlag;

    static {
        AudioSpecificConfig.samplingFrequencyIndexMap = new HashMap();
        AudioSpecificConfig.audioObjectTypeMap = new HashMap();
        AudioSpecificConfig.samplingFrequencyIndexMap.put(0, 96000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(1, 88200);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(2, 0xFA00);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(3, 48000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(4, 44100);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(5, 32000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(6, 24000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(7, 22050);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(8, 16000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(9, 12000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(10, 11025);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(11, 8000);
        AudioSpecificConfig.audioObjectTypeMap.put(1, "AAC main");
        AudioSpecificConfig.audioObjectTypeMap.put(2, "AAC LC");
        AudioSpecificConfig.audioObjectTypeMap.put(3, "AAC SSR");
        AudioSpecificConfig.audioObjectTypeMap.put(4, "AAC LTP");
        AudioSpecificConfig.audioObjectTypeMap.put(5, "SBR");
        AudioSpecificConfig.audioObjectTypeMap.put(6, "AAC Scalable");
        AudioSpecificConfig.audioObjectTypeMap.put(7, "TwinVQ");
        AudioSpecificConfig.audioObjectTypeMap.put(8, "CELP");
        AudioSpecificConfig.audioObjectTypeMap.put(9, "HVXC");
        AudioSpecificConfig.audioObjectTypeMap.put(10, "(reserved)");
        AudioSpecificConfig.audioObjectTypeMap.put(11, "(reserved)");
        AudioSpecificConfig.audioObjectTypeMap.put(12, "TTSI");
        AudioSpecificConfig.audioObjectTypeMap.put(13, "Main synthetic");
        AudioSpecificConfig.audioObjectTypeMap.put(14, "Wavetable synthesis");
        AudioSpecificConfig.audioObjectTypeMap.put(15, "General MIDI");
        AudioSpecificConfig.audioObjectTypeMap.put(16, "Algorithmic Synthesis and Audio FX");
        AudioSpecificConfig.audioObjectTypeMap.put(17, "ER AAC LC");
        AudioSpecificConfig.audioObjectTypeMap.put(18, "(reserved)");
        AudioSpecificConfig.audioObjectTypeMap.put(19, "ER AAC LTP");
        AudioSpecificConfig.audioObjectTypeMap.put(20, "ER AAC Scalable");
        AudioSpecificConfig.audioObjectTypeMap.put(21, "ER TwinVQ");
        AudioSpecificConfig.audioObjectTypeMap.put(22, "ER BSAC");
        AudioSpecificConfig.audioObjectTypeMap.put(23, "ER AAC LD");
        AudioSpecificConfig.audioObjectTypeMap.put(24, "ER CELP");
        AudioSpecificConfig.audioObjectTypeMap.put(25, "ER HVXC");
        AudioSpecificConfig.audioObjectTypeMap.put(26, "ER HILN");
        AudioSpecificConfig.audioObjectTypeMap.put(27, "ER Parametric");
        AudioSpecificConfig.audioObjectTypeMap.put(28, "SSC");
        AudioSpecificConfig.audioObjectTypeMap.put(29, "PS");
        AudioSpecificConfig.audioObjectTypeMap.put(30, "MPEG Surround");
        AudioSpecificConfig.audioObjectTypeMap.put(0x1F, "(escape)");
        AudioSpecificConfig.audioObjectTypeMap.put(0x20, "Layer-1");
        AudioSpecificConfig.audioObjectTypeMap.put(33, "Layer-2");
        AudioSpecificConfig.audioObjectTypeMap.put(34, "Layer-3");
        AudioSpecificConfig.audioObjectTypeMap.put(35, "DST");
        AudioSpecificConfig.audioObjectTypeMap.put(36, "ALS");
        AudioSpecificConfig.audioObjectTypeMap.put(37, "SLS");
        AudioSpecificConfig.audioObjectTypeMap.put(38, "SLS non-core");
        AudioSpecificConfig.audioObjectTypeMap.put(39, "ER AAC ELD");
        AudioSpecificConfig.audioObjectTypeMap.put(40, "SMR Simple");
        AudioSpecificConfig.audioObjectTypeMap.put(41, "SMR Main");
    }

    public AudioSpecificConfig() {
        this.extensionSamplingFrequencyIndex = -1;
        this.syncExtensionType = -1;
        this.innerSyncExtensionType = -1;
        this.outerSyncExtensionType = -1;
        this.parsed = false;
        this.tag = 5;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            AudioSpecificConfig audioSpecificConfig0 = (AudioSpecificConfig)object0;
            if(this.aacScalefactorDataResilienceFlag != audioSpecificConfig0.aacScalefactorDataResilienceFlag) {
                return false;
            }
            if(this.aacSectionDataResilienceFlag != audioSpecificConfig0.aacSectionDataResilienceFlag) {
                return false;
            }
            if(this.aacSpectralDataResilienceFlag != audioSpecificConfig0.aacSpectralDataResilienceFlag) {
                return false;
            }
            if(this.audioObjectType != audioSpecificConfig0.audioObjectType) {
                return false;
            }
            if(this.channelConfiguration != audioSpecificConfig0.channelConfiguration) {
                return false;
            }
            if(this.coreCoderDelay != audioSpecificConfig0.coreCoderDelay) {
                return false;
            }
            if(this.dependsOnCoreCoder != audioSpecificConfig0.dependsOnCoreCoder) {
                return false;
            }
            if(this.directMapping != audioSpecificConfig0.directMapping) {
                return false;
            }
            if(this.epConfig != audioSpecificConfig0.epConfig) {
                return false;
            }
            if(this.erHvxcExtensionFlag != audioSpecificConfig0.erHvxcExtensionFlag) {
                return false;
            }
            if(this.extensionAudioObjectType != audioSpecificConfig0.extensionAudioObjectType) {
                return false;
            }
            if(this.extensionChannelConfiguration != audioSpecificConfig0.extensionChannelConfiguration) {
                return false;
            }
            if(this.extensionFlag != audioSpecificConfig0.extensionFlag) {
                return false;
            }
            if(this.extensionFlag3 != audioSpecificConfig0.extensionFlag3) {
                return false;
            }
            if(this.extensionSamplingFrequency != audioSpecificConfig0.extensionSamplingFrequency) {
                return false;
            }
            if(this.extensionSamplingFrequencyIndex != audioSpecificConfig0.extensionSamplingFrequencyIndex) {
                return false;
            }
            if(this.fillBits != audioSpecificConfig0.fillBits) {
                return false;
            }
            if(this.frameLengthFlag != audioSpecificConfig0.frameLengthFlag) {
                return false;
            }
            if(this.gaSpecificConfig != audioSpecificConfig0.gaSpecificConfig) {
                return false;
            }
            if(this.hilnContMode != audioSpecificConfig0.hilnContMode) {
                return false;
            }
            if(this.hilnEnhaLayer != audioSpecificConfig0.hilnEnhaLayer) {
                return false;
            }
            if(this.hilnEnhaQuantMode != audioSpecificConfig0.hilnEnhaQuantMode) {
                return false;
            }
            if(this.hilnFrameLength != audioSpecificConfig0.hilnFrameLength) {
                return false;
            }
            if(this.hilnMaxNumLine != audioSpecificConfig0.hilnMaxNumLine) {
                return false;
            }
            if(this.hilnQuantMode != audioSpecificConfig0.hilnQuantMode) {
                return false;
            }
            if(this.hilnSampleRateCode != audioSpecificConfig0.hilnSampleRateCode) {
                return false;
            }
            if(this.hvxcRateMode != audioSpecificConfig0.hvxcRateMode) {
                return false;
            }
            if(this.hvxcVarMode != audioSpecificConfig0.hvxcVarMode) {
                return false;
            }
            if(this.isBaseLayer != audioSpecificConfig0.isBaseLayer) {
                return false;
            }
            if(this.layerNr != audioSpecificConfig0.layerNr) {
                return false;
            }
            if(this.layer_length != audioSpecificConfig0.layer_length) {
                return false;
            }
            if(this.numOfSubFrame != audioSpecificConfig0.numOfSubFrame) {
                return false;
            }
            if(this.paraExtensionFlag != audioSpecificConfig0.paraExtensionFlag) {
                return false;
            }
            if(this.paraMode != audioSpecificConfig0.paraMode) {
                return false;
            }
            if(this.parametricSpecificConfig != audioSpecificConfig0.parametricSpecificConfig) {
                return false;
            }
            if(this.psPresentFlag != audioSpecificConfig0.psPresentFlag) {
                return false;
            }
            if(this.sacPayloadEmbedding != audioSpecificConfig0.sacPayloadEmbedding) {
                return false;
            }
            if(this.samplingFrequency != audioSpecificConfig0.samplingFrequency) {
                return false;
            }
            if(this.samplingFrequencyIndex != audioSpecificConfig0.samplingFrequencyIndex) {
                return false;
            }
            if(this.sbrPresentFlag != audioSpecificConfig0.sbrPresentFlag) {
                return false;
            }
            if(this.syncExtensionType != audioSpecificConfig0.syncExtensionType) {
                return false;
            }
            return this.var_ScalableFlag == audioSpecificConfig0.var_ScalableFlag ? Arrays.equals(this.configBytes, audioSpecificConfig0.configBytes) : false;
        }
        return false;
    }

    private int gaSpecificConfigSize() {
        int v = this.dependsOnCoreCoder == 1 ? 16 : 2;
        int v1 = v + 1;
        if(this.channelConfiguration == 0) {
            throw new UnsupportedOperationException("can\'t parse program_config_element yet");
        }
        int v2 = this.audioObjectType;
        if(v2 == 6 || v2 == 20) {
            v1 = v + 4;
        }
        if(this.extensionFlag == 1) {
            if(v2 == 22) {
                v1 += 16;
            }
            if(v2 == 17 || (v2 == 19 || v2 == 20) || v2 == 23) {
                v1 += 3;
            }
            ++v1;
            if(this.extensionFlag3 == 1) {
                throw new RuntimeException("Not implemented");
            }
        }
        return v1;
    }

    private static int getAudioObjectType(BitReaderBuffer bitReaderBuffer0) throws IOException {
        int v = bitReaderBuffer0.readBits(5);
        return v == 0x1F ? bitReaderBuffer0.readBits(6) + 0x20 : v;
    }

    public int getAudioObjectType() {
        return this.audioObjectType;
    }

    public int getChannelConfiguration() {
        return this.channelConfiguration;
    }

    public byte[] getConfigBytes() {
        return this.serializeConfigBytes().array();
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    protected int getContentSize() {
        int v = this.originalAudioObjectType <= 30 ? 5 : 11;
        int v1 = this.samplingFrequencyIndex == 15 ? v + 28 : v + 4;
        int v2 = v1 + 4;
        int v3 = this.audioObjectType;
        if(v3 == 5 || v3 == 29) {
            v2 = v1 + 8;
            if(this.extensionSamplingFrequencyIndex == 15) {
                v2 = v1 + 0x20;
            }
        }
        if(v3 == 22) {
            v2 += 4;
        }
        if(this.gaSpecificConfig) {
            v2 += this.gaSpecificConfigSize();
        }
        int v4 = this.outerSyncExtensionType;
        if(v4 >= 0) {
            if(v4 == 695) {
                int v5 = v2 + 16;
                int v6 = this.extensionAudioObjectType;
                if(v6 > 30) {
                    v5 = v2 + 22;
                }
                if(v6 == 5) {
                    v2 = v5 + 1;
                    if(this.sbrPresentFlag) {
                        v2 = this.extensionSamplingFrequencyIndex == 15 ? v5 + 29 : v5 + 5;
                        int v7 = this.innerSyncExtensionType;
                        if(v7 >= 0) {
                            v2 += (v7 == 0x548 ? 12 : 11);
                        }
                    }
                }
                else {
                    v2 = v5;
                }
                if(v6 == 22) {
                    int v8 = v2 + 1;
                    if(this.sbrPresentFlag) {
                        v8 = v2 + 5;
                        if(this.extensionSamplingFrequencyIndex == 15) {
                            v8 = v2 + 29;
                        }
                    }
                    return (int)Math.ceil(((double)(v8 + 4)) / 8.0);
                }
            }
            else {
                v2 += 11;
            }
        }
        return (int)Math.ceil(((double)v2) / 8.0);
    }

    public int getExtensionAudioObjectType() {
        return this.extensionAudioObjectType;
    }

    public int getExtensionSamplingFrequency() {
        return this.extensionSamplingFrequencyIndex == 15 ? this.extensionSamplingFrequency : ((int)(((Integer)AudioSpecificConfig.samplingFrequencyIndexMap.get(this.extensionSamplingFrequencyIndex))));
    }

    public int getSamplingFrequency() {
        return this.samplingFrequencyIndex == 15 ? this.samplingFrequency : ((int)(((Integer)AudioSpecificConfig.samplingFrequencyIndexMap.get(this.samplingFrequencyIndex))));
    }

    @Override
    public int hashCode() {
        return this.configBytes == null ? ((((((((((((((((((((((((((((((((((((((((this.audioObjectType * 0x1F + this.samplingFrequencyIndex) * 0x1F + this.samplingFrequency) * 0x1F + this.channelConfiguration) * 0x1F + this.extensionAudioObjectType) * 0x1F + this.sbrPresentFlag) * 0x1F + this.psPresentFlag) * 0x1F + this.extensionSamplingFrequencyIndex) * 0x1F + this.extensionSamplingFrequency) * 0x1F + this.extensionChannelConfiguration) * 0x1F + this.sacPayloadEmbedding) * 0x1F + this.fillBits) * 0x1F + this.epConfig) * 0x1F + this.directMapping) * 0x1F + this.syncExtensionType) * 0x1F + this.frameLengthFlag) * 0x1F + this.dependsOnCoreCoder) * 0x1F + this.coreCoderDelay) * 0x1F + this.extensionFlag) * 0x1F + this.layerNr) * 0x1F + this.numOfSubFrame) * 0x1F + this.layer_length) * 0x1F + this.aacSectionDataResilienceFlag) * 0x1F + this.aacScalefactorDataResilienceFlag) * 0x1F + this.aacSpectralDataResilienceFlag) * 0x1F + this.extensionFlag3) * 0x1F + this.gaSpecificConfig) * 0x1F + this.isBaseLayer) * 0x1F + this.paraMode) * 0x1F + this.paraExtensionFlag) * 0x1F + this.hvxcVarMode) * 0x1F + this.hvxcRateMode) * 0x1F + this.erHvxcExtensionFlag) * 0x1F + this.var_ScalableFlag) * 0x1F + this.hilnQuantMode) * 0x1F + this.hilnMaxNumLine) * 0x1F + this.hilnSampleRateCode) * 0x1F + this.hilnFrameLength) * 0x1F + this.hilnContMode) * 0x1F + this.hilnEnhaLayer) * 0x1F + this.hilnEnhaQuantMode) * 0x1F + this.parametricSpecificConfig : (((((((((((((((((((((((((((((((((((((((((Arrays.hashCode(this.configBytes) * 0x1F + this.audioObjectType) * 0x1F + this.samplingFrequencyIndex) * 0x1F + this.samplingFrequency) * 0x1F + this.channelConfiguration) * 0x1F + this.extensionAudioObjectType) * 0x1F + this.sbrPresentFlag) * 0x1F + this.psPresentFlag) * 0x1F + this.extensionSamplingFrequencyIndex) * 0x1F + this.extensionSamplingFrequency) * 0x1F + this.extensionChannelConfiguration) * 0x1F + this.sacPayloadEmbedding) * 0x1F + this.fillBits) * 0x1F + this.epConfig) * 0x1F + this.directMapping) * 0x1F + this.syncExtensionType) * 0x1F + this.frameLengthFlag) * 0x1F + this.dependsOnCoreCoder) * 0x1F + this.coreCoderDelay) * 0x1F + this.extensionFlag) * 0x1F + this.layerNr) * 0x1F + this.numOfSubFrame) * 0x1F + this.layer_length) * 0x1F + this.aacSectionDataResilienceFlag) * 0x1F + this.aacScalefactorDataResilienceFlag) * 0x1F + this.aacSpectralDataResilienceFlag) * 0x1F + this.extensionFlag3) * 0x1F + this.gaSpecificConfig) * 0x1F + this.isBaseLayer) * 0x1F + this.paraMode) * 0x1F + this.paraExtensionFlag) * 0x1F + this.hvxcVarMode) * 0x1F + this.hvxcRateMode) * 0x1F + this.erHvxcExtensionFlag) * 0x1F + this.var_ScalableFlag) * 0x1F + this.hilnQuantMode) * 0x1F + this.hilnMaxNumLine) * 0x1F + this.hilnSampleRateCode) * 0x1F + this.hilnFrameLength) * 0x1F + this.hilnContMode) * 0x1F + this.hilnEnhaLayer) * 0x1F + this.hilnEnhaQuantMode) * 0x1F + this.parametricSpecificConfig;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer0) throws IOException {
        this.parsed = true;
        ByteBuffer byteBuffer1 = byteBuffer0.slice();
        byteBuffer1.limit(this.sizeOfInstance);
        byteBuffer0.position(byteBuffer0.position() + this.sizeOfInstance);
        byte[] arr_b = new byte[this.sizeOfInstance];
        this.configBytes = arr_b;
        byteBuffer1.get(arr_b);
        byteBuffer1.rewind();
        BitReaderBuffer bitReaderBuffer0 = new BitReaderBuffer(byteBuffer1);
        int v = AudioSpecificConfig.getAudioObjectType(bitReaderBuffer0);
        this.audioObjectType = v;
        this.originalAudioObjectType = v;
        int v1 = bitReaderBuffer0.readBits(4);
        this.samplingFrequencyIndex = v1;
        if(v1 == 15) {
            this.samplingFrequency = bitReaderBuffer0.readBits(24);
        }
        this.channelConfiguration = bitReaderBuffer0.readBits(4);
        int v2 = this.audioObjectType;
        if(v2 == 5 || v2 == 29) {
            this.extensionAudioObjectType = 5;
            this.sbrPresentFlag = true;
            if(v2 == 29) {
                this.psPresentFlag = true;
            }
            int v3 = bitReaderBuffer0.readBits(4);
            this.extensionSamplingFrequencyIndex = v3;
            if(v3 == 15) {
                this.extensionSamplingFrequency = bitReaderBuffer0.readBits(24);
            }
            int v4 = AudioSpecificConfig.getAudioObjectType(bitReaderBuffer0);
            this.audioObjectType = v4;
            if(v4 == 22) {
                this.extensionChannelConfiguration = bitReaderBuffer0.readBits(4);
            }
        }
        else {
            this.extensionAudioObjectType = 0;
        }
        int v5 = this.audioObjectType;
        switch(v5) {
            case 8: {
                throw new UnsupportedOperationException("can\'t parse CelpSpecificConfig yet");
            }
            case 9: {
                throw new UnsupportedOperationException("can\'t parse HvxcSpecificConfig yet");
            }
            case 12: {
                throw new UnsupportedOperationException("can\'t parse TTSSpecificConfig yet");
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                throw new UnsupportedOperationException("can\'t parse StructuredAudioSpecificConfig yet");
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 6: 
            case 7: 
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                this.parseGaSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, v5, bitReaderBuffer0);
                break;
            }
            case 24: {
                throw new UnsupportedOperationException("can\'t parse ErrorResilientCelpSpecificConfig yet");
            }
            case 25: {
                throw new UnsupportedOperationException("can\'t parse ErrorResilientHvxcSpecificConfig yet");
            }
            case 26: 
            case 27: {
                this.parseParametricSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, v5, bitReaderBuffer0);
                break;
            }
            case 28: {
                throw new UnsupportedOperationException("can\'t parse SSCSpecificConfig yet");
            }
            case 30: {
                this.sacPayloadEmbedding = bitReaderBuffer0.readBits(1);
                throw new UnsupportedOperationException("can\'t parse SpatialSpecificConfig yet");
            }
            case 0x20: 
            case 33: 
            case 34: {
                throw new UnsupportedOperationException("can\'t parse MPEG_1_2_SpecificConfig yet");
            }
            case 35: {
                throw new UnsupportedOperationException("can\'t parse DSTSpecificConfig yet");
            }
            case 36: {
                this.fillBits = bitReaderBuffer0.readBits(5);
                throw new UnsupportedOperationException("can\'t parse ALSSpecificConfig yet");
            }
            case 37: 
            case 38: {
                throw new UnsupportedOperationException("can\'t parse SLSSpecificConfig yet");
            }
            case 39: {
                this.eldSpecificConfig = new ELDSpecificConfig(this, this.channelConfiguration, bitReaderBuffer0);
                break;
            }
            case 40: 
            case 41: {
                throw new UnsupportedOperationException("can\'t parse SymbolicMusicSpecificConfig yet");
            }
        }
        int v6 = this.audioObjectType;
        if(v6 != 17 && v6 != 39) {
            switch(v6) {
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: {
                    break;
                }
            }
        }
        else {
            int v7 = bitReaderBuffer0.readBits(2);
            this.epConfig = v7;
            if(v7 == 2 || v7 == 3) {
                throw new UnsupportedOperationException("can\'t parse ErrorProtectionSpecificConfig yet");
            }
        }
        if(this.extensionAudioObjectType != 5 && bitReaderBuffer0.remainingBits() >= 16) {
            int v8 = bitReaderBuffer0.readBits(11);
            this.syncExtensionType = v8;
            this.outerSyncExtensionType = v8;
            if(v8 == 695) {
                int v9 = AudioSpecificConfig.getAudioObjectType(bitReaderBuffer0);
                this.extensionAudioObjectType = v9;
                if(v9 == 5) {
                    boolean z = bitReaderBuffer0.readBool();
                    this.sbrPresentFlag = z;
                    if(z) {
                        int v10 = bitReaderBuffer0.readBits(4);
                        this.extensionSamplingFrequencyIndex = v10;
                        if(v10 == 15) {
                            this.extensionSamplingFrequency = bitReaderBuffer0.readBits(24);
                        }
                        if(bitReaderBuffer0.remainingBits() >= 12) {
                            int v11 = bitReaderBuffer0.readBits(11);
                            this.syncExtensionType = v11;
                            this.innerSyncExtensionType = v11;
                            if(v11 == 0x548) {
                                this.psPresentFlag = bitReaderBuffer0.readBool();
                            }
                        }
                    }
                }
                if(this.extensionAudioObjectType == 22) {
                    boolean z1 = bitReaderBuffer0.readBool();
                    this.sbrPresentFlag = z1;
                    if(z1) {
                        int v12 = bitReaderBuffer0.readBits(4);
                        this.extensionSamplingFrequencyIndex = v12;
                        if(v12 == 15) {
                            this.extensionSamplingFrequency = bitReaderBuffer0.readBits(24);
                        }
                    }
                    this.extensionChannelConfiguration = bitReaderBuffer0.readBits(4);
                }
            }
        }
    }

    private void parseErHvxcConfig(int v, int v1, int v2, BitReaderBuffer bitReaderBuffer0) throws IOException {
        this.hvxcVarMode = bitReaderBuffer0.readBits(1);
        this.hvxcRateMode = bitReaderBuffer0.readBits(2);
        int v3 = bitReaderBuffer0.readBits(1);
        this.erHvxcExtensionFlag = v3;
        if(v3 == 1) {
            this.var_ScalableFlag = bitReaderBuffer0.readBits(1);
        }
    }

    private void parseGaSpecificConfig(int v, int v1, int v2, BitReaderBuffer bitReaderBuffer0) throws IOException {
        this.frameLengthFlag = bitReaderBuffer0.readBits(1);
        int v3 = bitReaderBuffer0.readBits(1);
        this.dependsOnCoreCoder = v3;
        if(v3 == 1) {
            this.coreCoderDelay = bitReaderBuffer0.readBits(14);
        }
        this.extensionFlag = bitReaderBuffer0.readBits(1);
        if(v1 == 0) {
            throw new UnsupportedOperationException("can\'t parse program_config_element yet");
        }
        if(v2 == 6 || v2 == 20) {
            this.layerNr = bitReaderBuffer0.readBits(3);
        }
        if(this.extensionFlag == 1) {
            if(v2 == 22) {
                this.numOfSubFrame = bitReaderBuffer0.readBits(5);
                this.layer_length = bitReaderBuffer0.readBits(11);
            }
            if(v2 == 17 || (v2 == 19 || v2 == 20) || v2 == 23) {
                this.aacSectionDataResilienceFlag = bitReaderBuffer0.readBool();
                this.aacScalefactorDataResilienceFlag = bitReaderBuffer0.readBool();
                this.aacSpectralDataResilienceFlag = bitReaderBuffer0.readBool();
            }
            int v4 = bitReaderBuffer0.readBits(1);
            this.extensionFlag3 = v4;
            if(v4 == 1) {
                throw new RuntimeException("not yet implemented");
            }
        }
        this.gaSpecificConfig = true;
    }

    private void parseHilnConfig(int v, int v1, int v2, BitReaderBuffer bitReaderBuffer0) throws IOException {
        this.hilnQuantMode = bitReaderBuffer0.readBits(1);
        this.hilnMaxNumLine = bitReaderBuffer0.readBits(8);
        this.hilnSampleRateCode = bitReaderBuffer0.readBits(4);
        this.hilnFrameLength = bitReaderBuffer0.readBits(12);
        this.hilnContMode = bitReaderBuffer0.readBits(2);
    }

    private void parseHilnEnexConfig(int v, int v1, int v2, BitReaderBuffer bitReaderBuffer0) throws IOException {
        int v3 = bitReaderBuffer0.readBits(1);
        this.hilnEnhaLayer = v3;
        if(v3 == 1) {
            this.hilnEnhaQuantMode = bitReaderBuffer0.readBits(2);
        }
    }

    private void parseParaConfig(int v, int v1, int v2, BitReaderBuffer bitReaderBuffer0) throws IOException {
        int v3 = bitReaderBuffer0.readBits(2);
        this.paraMode = v3;
        if(v3 != 1) {
            this.parseErHvxcConfig(v, v1, v2, bitReaderBuffer0);
        }
        if(this.paraMode != 0) {
            this.parseHilnConfig(v, v1, v2, bitReaderBuffer0);
        }
        this.paraExtensionFlag = bitReaderBuffer0.readBits(1);
        this.parametricSpecificConfig = true;
    }

    private void parseParametricSpecificConfig(int v, int v1, int v2, BitReaderBuffer bitReaderBuffer0) throws IOException {
        int v3 = bitReaderBuffer0.readBits(1);
        this.isBaseLayer = v3;
        if(v3 == 1) {
            this.parseParaConfig(v, v1, v2, bitReaderBuffer0);
            return;
        }
        this.parseHilnEnexConfig(v, v1, v2, bitReaderBuffer0);
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.getSize());
        IsoTypeWriter.writeUInt8(byteBuffer0, this.tag);
        this.writeSize(byteBuffer0, this.getContentSize());
        byteBuffer0.put(this.serializeConfigBytes());
        return (ByteBuffer)byteBuffer0.rewind();
    }

    protected ByteBuffer serializeConfigBytes() {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[this.getContentSize()]);
        BitWriterBuffer bitWriterBuffer0 = new BitWriterBuffer(byteBuffer0);
        AudioSpecificConfig.writeAudioObjectType(this.originalAudioObjectType, bitWriterBuffer0);
        bitWriterBuffer0.writeBits(this.samplingFrequencyIndex, 4);
        if(this.samplingFrequencyIndex == 15) {
            bitWriterBuffer0.writeBits(this.samplingFrequency, 24);
        }
        bitWriterBuffer0.writeBits(this.channelConfiguration, 4);
        int v = this.audioObjectType;
        if(v == 5 || v == 29) {
            this.extensionAudioObjectType = 5;
            this.sbrPresentFlag = true;
            if(v == 29) {
                this.psPresentFlag = true;
            }
            bitWriterBuffer0.writeBits(this.extensionSamplingFrequencyIndex, 4);
            if(this.extensionSamplingFrequencyIndex == 15) {
                bitWriterBuffer0.writeBits(this.extensionSamplingFrequency, 24);
            }
            AudioSpecificConfig.writeAudioObjectType(this.audioObjectType, bitWriterBuffer0);
            if(this.audioObjectType == 22) {
                bitWriterBuffer0.writeBits(this.extensionChannelConfiguration, 4);
            }
        }
        switch(this.audioObjectType) {
            case 8: {
                throw new UnsupportedOperationException("can\'t write CelpSpecificConfig yet");
            }
            case 9: {
                throw new UnsupportedOperationException("can\'t write HvxcSpecificConfig yet");
            }
            case 12: {
                throw new UnsupportedOperationException("can\'t write TTSSpecificConfig yet");
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                throw new UnsupportedOperationException("can\'t write StructuredAudioSpecificConfig yet");
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 6: 
            case 7: 
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                this.writeGaSpecificConfig(bitWriterBuffer0);
                break;
            }
            case 24: {
                throw new UnsupportedOperationException("can\'t write ErrorResilientCelpSpecificConfig yet");
            }
            case 25: {
                throw new UnsupportedOperationException("can\'t write ErrorResilientHvxcSpecificConfig yet");
            }
            case 26: 
            case 27: {
                throw new UnsupportedOperationException("can\'t write parseParametricSpecificConfig yet");
            }
            case 28: {
                throw new UnsupportedOperationException("can\'t write SSCSpecificConfig yet");
            }
            case 30: {
                bitWriterBuffer0.writeBits(this.sacPayloadEmbedding, 1);
                throw new UnsupportedOperationException("can\'t write SpatialSpecificConfig yet");
            }
            case 0x20: 
            case 33: 
            case 34: {
                throw new UnsupportedOperationException("can\'t write MPEG_1_2_SpecificConfig yet");
            }
            case 35: {
                throw new UnsupportedOperationException("can\'t write DSTSpecificConfig yet");
            }
            case 36: {
                bitWriterBuffer0.writeBits(this.fillBits, 5);
                throw new UnsupportedOperationException("can\'t write ALSSpecificConfig yet");
            }
            case 37: 
            case 38: {
                throw new UnsupportedOperationException("can\'t write SLSSpecificConfig yet");
            }
            case 39: {
                throw new UnsupportedOperationException("can\'t write ELDSpecificConfig yet");
            }
            case 40: 
            case 41: {
                throw new UnsupportedOperationException("can\'t parse SymbolicMusicSpecificConfig yet");
            }
        }
        int v1 = this.audioObjectType;
        if(v1 != 17 && v1 != 39) {
            switch(v1) {
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: {
                    break;
                }
            }
        }
        else {
            bitWriterBuffer0.writeBits(this.epConfig, 2);
            if(this.epConfig == 2 || this.epConfig == 3) {
                throw new UnsupportedOperationException("can\'t parse ErrorProtectionSpecificConfig yet");
            }
        }
        int v2 = this.outerSyncExtensionType;
        if(v2 >= 0) {
            bitWriterBuffer0.writeBits(v2, 11);
            if(this.outerSyncExtensionType == 695) {
                AudioSpecificConfig.writeAudioObjectType(this.extensionAudioObjectType, bitWriterBuffer0);
                if(this.extensionAudioObjectType == 5) {
                    bitWriterBuffer0.writeBool(this.sbrPresentFlag);
                    if(this.sbrPresentFlag) {
                        bitWriterBuffer0.writeBits(this.extensionSamplingFrequencyIndex, 4);
                        if(this.extensionSamplingFrequencyIndex == 15) {
                            bitWriterBuffer0.writeBits(this.extensionSamplingFrequency, 24);
                        }
                        int v3 = this.innerSyncExtensionType;
                        if(v3 >= 0) {
                            bitWriterBuffer0.writeBits(v3, 11);
                            if(this.syncExtensionType == 0x548) {
                                bitWriterBuffer0.writeBool(this.psPresentFlag);
                            }
                        }
                    }
                }
                if(this.extensionAudioObjectType == 22) {
                    bitWriterBuffer0.writeBool(this.sbrPresentFlag);
                    if(this.sbrPresentFlag) {
                        bitWriterBuffer0.writeBits(this.extensionSamplingFrequencyIndex, 4);
                        if(this.extensionSamplingFrequencyIndex == 15) {
                            bitWriterBuffer0.writeBits(this.extensionSamplingFrequency, 24);
                        }
                    }
                    bitWriterBuffer0.writeBits(this.extensionChannelConfiguration, 4);
                }
            }
        }
        return (ByteBuffer)byteBuffer0.rewind();
    }

    public void setAudioObjectType(int v) {
        this.audioObjectType = v;
    }

    public void setChannelConfiguration(int v) {
        this.channelConfiguration = v;
    }

    public void setOriginalAudioObjectType(int v) {
        this.originalAudioObjectType = v;
    }

    public void setSamplingFrequency(int v) {
        this.samplingFrequency = v;
    }

    public void setSamplingFrequencyIndex(int v) {
        this.samplingFrequencyIndex = v;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("AudioSpecificConfig");
        stringBuilder0.append("{configBytes=");
        stringBuilder0.append(Hex.encodeHex(this.configBytes));
        stringBuilder0.append(", audioObjectType=");
        stringBuilder0.append(this.audioObjectType);
        stringBuilder0.append(" (");
        stringBuilder0.append(((String)AudioSpecificConfig.audioObjectTypeMap.get(this.audioObjectType)));
        stringBuilder0.append(")");
        stringBuilder0.append(", samplingFrequencyIndex=");
        stringBuilder0.append(this.samplingFrequencyIndex);
        stringBuilder0.append(" (");
        stringBuilder0.append(AudioSpecificConfig.samplingFrequencyIndexMap.get(this.samplingFrequencyIndex));
        stringBuilder0.append(")");
        stringBuilder0.append(", samplingFrequency=");
        stringBuilder0.append(this.samplingFrequency);
        stringBuilder0.append(", channelConfiguration=");
        stringBuilder0.append(this.channelConfiguration);
        if(this.extensionAudioObjectType > 0) {
            stringBuilder0.append(", extensionAudioObjectType=");
            stringBuilder0.append(this.extensionAudioObjectType);
            stringBuilder0.append(" (");
            stringBuilder0.append(((String)AudioSpecificConfig.audioObjectTypeMap.get(this.extensionAudioObjectType)));
            stringBuilder0.append(")");
            stringBuilder0.append(", sbrPresentFlag=");
            stringBuilder0.append(this.sbrPresentFlag);
            stringBuilder0.append(", psPresentFlag=");
            stringBuilder0.append(this.psPresentFlag);
            stringBuilder0.append(", extensionSamplingFrequencyIndex=");
            stringBuilder0.append(this.extensionSamplingFrequencyIndex);
            stringBuilder0.append(" (");
            stringBuilder0.append(AudioSpecificConfig.samplingFrequencyIndexMap.get(this.extensionSamplingFrequencyIndex));
            stringBuilder0.append(")");
            stringBuilder0.append(", extensionSamplingFrequency=");
            stringBuilder0.append(this.extensionSamplingFrequency);
            stringBuilder0.append(", extensionChannelConfiguration=");
            stringBuilder0.append(this.extensionChannelConfiguration);
        }
        stringBuilder0.append(", syncExtensionType=");
        stringBuilder0.append(this.syncExtensionType);
        if(this.gaSpecificConfig) {
            stringBuilder0.append(", frameLengthFlag=");
            stringBuilder0.append(this.frameLengthFlag);
            stringBuilder0.append(", dependsOnCoreCoder=");
            stringBuilder0.append(this.dependsOnCoreCoder);
            stringBuilder0.append(", coreCoderDelay=");
            stringBuilder0.append(this.coreCoderDelay);
            stringBuilder0.append(", extensionFlag=");
            stringBuilder0.append(this.extensionFlag);
            stringBuilder0.append(", layerNr=");
            stringBuilder0.append(this.layerNr);
            stringBuilder0.append(", numOfSubFrame=");
            stringBuilder0.append(this.numOfSubFrame);
            stringBuilder0.append(", layer_length=");
            stringBuilder0.append(this.layer_length);
            stringBuilder0.append(", aacSectionDataResilienceFlag=");
            stringBuilder0.append(this.aacSectionDataResilienceFlag);
            stringBuilder0.append(", aacScalefactorDataResilienceFlag=");
            stringBuilder0.append(this.aacScalefactorDataResilienceFlag);
            stringBuilder0.append(", aacSpectralDataResilienceFlag=");
            stringBuilder0.append(this.aacSpectralDataResilienceFlag);
            stringBuilder0.append(", extensionFlag3=");
            stringBuilder0.append(this.extensionFlag3);
        }
        if(this.parametricSpecificConfig) {
            stringBuilder0.append(", isBaseLayer=");
            stringBuilder0.append(this.isBaseLayer);
            stringBuilder0.append(", paraMode=");
            stringBuilder0.append(this.paraMode);
            stringBuilder0.append(", paraExtensionFlag=");
            stringBuilder0.append(this.paraExtensionFlag);
            stringBuilder0.append(", hvxcVarMode=");
            stringBuilder0.append(this.hvxcVarMode);
            stringBuilder0.append(", hvxcRateMode=");
            stringBuilder0.append(this.hvxcRateMode);
            stringBuilder0.append(", erHvxcExtensionFlag=");
            stringBuilder0.append(this.erHvxcExtensionFlag);
            stringBuilder0.append(", var_ScalableFlag=");
            stringBuilder0.append(this.var_ScalableFlag);
            stringBuilder0.append(", hilnQuantMode=");
            stringBuilder0.append(this.hilnQuantMode);
            stringBuilder0.append(", hilnMaxNumLine=");
            stringBuilder0.append(this.hilnMaxNumLine);
            stringBuilder0.append(", hilnSampleRateCode=");
            stringBuilder0.append(this.hilnSampleRateCode);
            stringBuilder0.append(", hilnFrameLength=");
            stringBuilder0.append(this.hilnFrameLength);
            stringBuilder0.append(", hilnContMode=");
            stringBuilder0.append(this.hilnContMode);
            stringBuilder0.append(", hilnEnhaLayer=");
            stringBuilder0.append(this.hilnEnhaLayer);
            stringBuilder0.append(", hilnEnhaQuantMode=");
            stringBuilder0.append(this.hilnEnhaQuantMode);
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    private static void writeAudioObjectType(int v, BitWriterBuffer bitWriterBuffer0) {
        if(v >= 0x20) {
            bitWriterBuffer0.writeBits(0x1F, 5);
            bitWriterBuffer0.writeBits(v - 0x20, 6);
            return;
        }
        bitWriterBuffer0.writeBits(v, 5);
    }

    private void writeGaSpecificConfig(BitWriterBuffer bitWriterBuffer0) {
        bitWriterBuffer0.writeBits(this.frameLengthFlag, 1);
        bitWriterBuffer0.writeBits(this.dependsOnCoreCoder, 1);
        if(this.dependsOnCoreCoder == 1) {
            bitWriterBuffer0.writeBits(this.coreCoderDelay, 14);
        }
        bitWriterBuffer0.writeBits(this.extensionFlag, 1);
        if(this.channelConfiguration == 0) {
            throw new UnsupportedOperationException("can\'t parse program_config_element yet");
        }
        if(this.audioObjectType == 6 || this.audioObjectType == 20) {
            bitWriterBuffer0.writeBits(this.layerNr, 3);
        }
        if(this.extensionFlag == 1) {
            if(this.audioObjectType == 22) {
                bitWriterBuffer0.writeBits(this.numOfSubFrame, 5);
                bitWriterBuffer0.writeBits(this.layer_length, 11);
            }
            if(this.audioObjectType == 17 || (this.audioObjectType == 19 || this.audioObjectType == 20) || this.audioObjectType == 23) {
                bitWriterBuffer0.writeBool(this.aacSectionDataResilienceFlag);
                bitWriterBuffer0.writeBool(this.aacScalefactorDataResilienceFlag);
                bitWriterBuffer0.writeBool(this.aacSpectralDataResilienceFlag);
            }
            bitWriterBuffer0.writeBits(this.extensionFlag3, 1);
            if(this.extensionFlag3 == 1) {
                throw new RuntimeException("not yet implemented");
            }
        }
    }
}

