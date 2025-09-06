package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DynamicDeviceInfoOuterClass {
    public static enum ConnectionType implements EnumLite {
        class a implements EnumLiteMap {
            a() {
                super();
            }

            public ConnectionType a(int v) {
                return ConnectionType.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                b.a = new b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return ConnectionType.forNumber(v) != null;
            }
        }

        CONNECTION_TYPE_UNSPECIFIED(0),
        CONNECTION_TYPE_WIFI(1),
        CONNECTION_TYPE_CELLULAR(2),
        UNRECOGNIZED(-1);

        public static final int CONNECTION_TYPE_CELLULAR_VALUE = 2;
        public static final int CONNECTION_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int CONNECTION_TYPE_WIFI_VALUE = 1;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static ConnectionType[] $values() [...] // Inlined contents

        static {
            ConnectionType.internalValueMap = new a();
        }

        private ConnectionType(int v1) {
            this.value = v1;
        }

        public static ConnectionType forNumber(int v) {
            switch(v) {
                case 0: {
                    return ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
                }
                case 1: {
                    return ConnectionType.CONNECTION_TYPE_WIFI;
                }
                case 2: {
                    return ConnectionType.CONNECTION_TYPE_CELLULAR;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == ConnectionType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return ConnectionType.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Deprecated
        public static ConnectionType valueOf(int v) {
            return ConnectionType.forNumber(v);
        }
    }

    public static final class DynamicDeviceInfo extends GeneratedMessageLite implements DynamicDeviceInfoOrBuilder {
        public static final class Android extends GeneratedMessageLite implements AndroidOrBuilder {
            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AndroidOrBuilder {
                private Builder() {
                    super(Android.DEFAULT_INSTANCE);
                }

                Builder(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a dynamicDeviceInfoOuterClass$a0) {
                }

                public Builder clearAdbEnabled() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearAdbEnabled();
                    return this;
                }

                public Builder clearAirplaneMode() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearAirplaneMode();
                    return this;
                }

                public Builder clearChargingType() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearChargingType();
                    return this;
                }

                public Builder clearDeviceElapsedRealtime() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearDeviceElapsedRealtime();
                    return this;
                }

                public Builder clearDeviceUpTime() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearDeviceUpTime();
                    return this;
                }

                public Builder clearMaxVolume() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearMaxVolume();
                    return this;
                }

                public Builder clearNetworkCapabilityTransports() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearNetworkCapabilityTransports();
                    return this;
                }

                public Builder clearNetworkConnected() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearNetworkConnected();
                    return this;
                }

                public Builder clearNetworkMetered() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearNetworkMetered();
                    return this;
                }

                public Builder clearNetworkType() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearNetworkType();
                    return this;
                }

                public Builder clearSdCardPresent() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearSdCardPresent();
                    return this;
                }

                public Builder clearStayOnWhilePluggedIn() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearStayOnWhilePluggedIn();
                    return this;
                }

                public Builder clearTelephonyManagerNetworkType() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearTelephonyManagerNetworkType();
                    return this;
                }

                public Builder clearUsbConnected() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearUsbConnected();
                    return this;
                }

                public Builder clearVolume() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearVolume();
                    return this;
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean getAdbEnabled() {
                    return ((Android)this.instance).getAdbEnabled();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean getAirplaneMode() {
                    return ((Android)this.instance).getAirplaneMode();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public int getChargingType() {
                    return ((Android)this.instance).getChargingType();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public long getDeviceElapsedRealtime() {
                    return ((Android)this.instance).getDeviceElapsedRealtime();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public long getDeviceUpTime() {
                    return ((Android)this.instance).getDeviceUpTime();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public double getMaxVolume() {
                    return ((Android)this.instance).getMaxVolume();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public NetworkCapabilityTransports getNetworkCapabilityTransports() {
                    return ((Android)this.instance).getNetworkCapabilityTransports();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean getNetworkConnected() {
                    return ((Android)this.instance).getNetworkConnected();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean getNetworkMetered() {
                    return ((Android)this.instance).getNetworkMetered();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public int getNetworkType() {
                    return ((Android)this.instance).getNetworkType();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean getSdCardPresent() {
                    return ((Android)this.instance).getSdCardPresent();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean getStayOnWhilePluggedIn() {
                    return ((Android)this.instance).getStayOnWhilePluggedIn();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public int getTelephonyManagerNetworkType() {
                    return ((Android)this.instance).getTelephonyManagerNetworkType();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean getUsbConnected() {
                    return ((Android)this.instance).getUsbConnected();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public double getVolume() {
                    return ((Android)this.instance).getVolume();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasAdbEnabled() {
                    return ((Android)this.instance).hasAdbEnabled();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasAirplaneMode() {
                    return ((Android)this.instance).hasAirplaneMode();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasChargingType() {
                    return ((Android)this.instance).hasChargingType();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasDeviceElapsedRealtime() {
                    return ((Android)this.instance).hasDeviceElapsedRealtime();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasDeviceUpTime() {
                    return ((Android)this.instance).hasDeviceUpTime();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasMaxVolume() {
                    return ((Android)this.instance).hasMaxVolume();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasNetworkCapabilityTransports() {
                    return ((Android)this.instance).hasNetworkCapabilityTransports();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasNetworkConnected() {
                    return ((Android)this.instance).hasNetworkConnected();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasNetworkMetered() {
                    return ((Android)this.instance).hasNetworkMetered();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasNetworkType() {
                    return ((Android)this.instance).hasNetworkType();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasSdCardPresent() {
                    return ((Android)this.instance).hasSdCardPresent();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasStayOnWhilePluggedIn() {
                    return ((Android)this.instance).hasStayOnWhilePluggedIn();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasTelephonyManagerNetworkType() {
                    return ((Android)this.instance).hasTelephonyManagerNetworkType();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasUsbConnected() {
                    return ((Android)this.instance).hasUsbConnected();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
                public boolean hasVolume() {
                    return ((Android)this.instance).hasVolume();
                }

                public Builder mergeNetworkCapabilityTransports(NetworkCapabilityTransports networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0) {
                    this.copyOnWrite();
                    ((Android)this.instance).mergeNetworkCapabilityTransports(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0);
                    return this;
                }

                public Builder setAdbEnabled(boolean z) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAdbEnabled(z);
                    return this;
                }

                public Builder setAirplaneMode(boolean z) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAirplaneMode(z);
                    return this;
                }

                public Builder setChargingType(int v) {
                    this.copyOnWrite();
                    ((Android)this.instance).setChargingType(v);
                    return this;
                }

                public Builder setDeviceElapsedRealtime(long v) {
                    this.copyOnWrite();
                    ((Android)this.instance).setDeviceElapsedRealtime(v);
                    return this;
                }

                public Builder setDeviceUpTime(long v) {
                    this.copyOnWrite();
                    ((Android)this.instance).setDeviceUpTime(v);
                    return this;
                }

                public Builder setMaxVolume(double f) {
                    this.copyOnWrite();
                    ((Android)this.instance).setMaxVolume(f);
                    return this;
                }

                public Builder setNetworkCapabilityTransports(gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setNetworkCapabilityTransports(((NetworkCapabilityTransports)networkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder0.build()));
                    return this;
                }

                public Builder setNetworkCapabilityTransports(NetworkCapabilityTransports networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setNetworkCapabilityTransports(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0);
                    return this;
                }

                public Builder setNetworkConnected(boolean z) {
                    this.copyOnWrite();
                    ((Android)this.instance).setNetworkConnected(z);
                    return this;
                }

                public Builder setNetworkMetered(boolean z) {
                    this.copyOnWrite();
                    ((Android)this.instance).setNetworkMetered(z);
                    return this;
                }

                public Builder setNetworkType(int v) {
                    this.copyOnWrite();
                    ((Android)this.instance).setNetworkType(v);
                    return this;
                }

                public Builder setSdCardPresent(boolean z) {
                    this.copyOnWrite();
                    ((Android)this.instance).setSdCardPresent(z);
                    return this;
                }

                public Builder setStayOnWhilePluggedIn(boolean z) {
                    this.copyOnWrite();
                    ((Android)this.instance).setStayOnWhilePluggedIn(z);
                    return this;
                }

                public Builder setTelephonyManagerNetworkType(int v) {
                    this.copyOnWrite();
                    ((Android)this.instance).setTelephonyManagerNetworkType(v);
                    return this;
                }

                public Builder setUsbConnected(boolean z) {
                    this.copyOnWrite();
                    ((Android)this.instance).setUsbConnected(z);
                    return this;
                }

                public Builder setVolume(double f) {
                    this.copyOnWrite();
                    ((Android)this.instance).setVolume(f);
                    return this;
                }
            }

            public static final int ADB_ENABLED_FIELD_NUMBER = 5;
            public static final int AIRPLANE_MODE_FIELD_NUMBER = 11;
            public static final int CHARGING_TYPE_FIELD_NUMBER = 15;
            private static final Android DEFAULT_INSTANCE = null;
            public static final int DEVICE_ELAPSED_REALTIME_FIELD_NUMBER = 10;
            public static final int DEVICE_UP_TIME_FIELD_NUMBER = 9;
            public static final int MAX_VOLUME_FIELD_NUMBER = 8;
            public static final int NETWORK_CAPABILITY_TRANSPORTS_FIELD_NUMBER = 14;
            public static final int NETWORK_CONNECTED_FIELD_NUMBER = 1;
            public static final int NETWORK_METERED_FIELD_NUMBER = 3;
            public static final int NETWORK_TYPE_FIELD_NUMBER = 2;
            private static volatile Parser PARSER = null;
            public static final int SD_CARD_PRESENT_FIELD_NUMBER = 13;
            public static final int STAY_ON_WHILE_PLUGGED_IN_FIELD_NUMBER = 12;
            public static final int TELEPHONY_MANAGER_NETWORK_TYPE_FIELD_NUMBER = 4;
            public static final int USB_CONNECTED_FIELD_NUMBER = 6;
            public static final int VOLUME_FIELD_NUMBER = 7;
            private boolean adbEnabled_;
            private boolean airplaneMode_;
            private int bitField0_;
            private int chargingType_;
            private long deviceElapsedRealtime_;
            private long deviceUpTime_;
            private double maxVolume_;
            private NetworkCapabilityTransports networkCapabilityTransports_;
            private boolean networkConnected_;
            private boolean networkMetered_;
            private int networkType_;
            private boolean sdCardPresent_;
            private boolean stayOnWhilePluggedIn_;
            private int telephonyManagerNetworkType_;
            private boolean usbConnected_;
            private double volume_;

            static {
                Android dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0 = new Android();
                Android.DEFAULT_INSTANCE = dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0;
                GeneratedMessageLite.registerDefaultInstance(Android.class, dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0);
            }

            private void clearAdbEnabled() {
                this.bitField0_ &= -17;
                this.adbEnabled_ = false;
            }

            private void clearAirplaneMode() {
                this.bitField0_ &= 0xFFFFFBFF;
                this.airplaneMode_ = false;
            }

            private void clearChargingType() {
                this.bitField0_ &= 0xFFFFBFFF;
                this.chargingType_ = 0;
            }

            private void clearDeviceElapsedRealtime() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.deviceElapsedRealtime_ = 0L;
            }

            private void clearDeviceUpTime() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.deviceUpTime_ = 0L;
            }

            private void clearMaxVolume() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.maxVolume_ = 0.0;
            }

            private void clearNetworkCapabilityTransports() {
                this.networkCapabilityTransports_ = null;
                this.bitField0_ &= 0xFFFFDFFF;
            }

            private void clearNetworkConnected() {
                this.bitField0_ &= -2;
                this.networkConnected_ = false;
            }

            private void clearNetworkMetered() {
                this.bitField0_ &= -5;
                this.networkMetered_ = false;
            }

            private void clearNetworkType() {
                this.bitField0_ &= -3;
                this.networkType_ = 0;
            }

            private void clearSdCardPresent() {
                this.bitField0_ &= 0xFFFFEFFF;
                this.sdCardPresent_ = false;
            }

            private void clearStayOnWhilePluggedIn() {
                this.bitField0_ &= 0xFFFFF7FF;
                this.stayOnWhilePluggedIn_ = false;
            }

            private void clearTelephonyManagerNetworkType() {
                this.bitField0_ &= -9;
                this.telephonyManagerNetworkType_ = 0;
            }

            private void clearUsbConnected() {
                this.bitField0_ &= -33;
                this.usbConnected_ = false;
            }

            private void clearVolume() {
                this.bitField0_ &= -65;
                this.volume_ = 0.0;
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new Android();
                    }
                    case 2: {
                        return new Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(Android.DEFAULT_INSTANCE, "\u0000\u000F\u0000\u0001\u0001\u000F\u000F\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007က\u0006\bက\u0007\tဂ\b\nဂ\t\u000Bဇ\n\fဇ\u000B\rဇ\f\u000Eဉ\r\u000Fင\u000E", new Object[]{"bitField0_", "networkConnected_", "networkType_", "networkMetered_", "telephonyManagerNetworkType_", "adbEnabled_", "usbConnected_", "volume_", "maxVolume_", "deviceUpTime_", "deviceElapsedRealtime_", "airplaneMode_", "stayOnWhilePluggedIn_", "sdCardPresent_", "networkCapabilityTransports_", "chargingType_"});
                    }
                    case 4: {
                        return Android.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = Android.PARSER;
                        if(parser0 == null) {
                            Class class0 = Android.class;
                            synchronized(class0) {
                                parser0 = Android.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(Android.DEFAULT_INSTANCE);
                                    Android.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 7: {
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean getAdbEnabled() {
                return this.adbEnabled_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean getAirplaneMode() {
                return this.airplaneMode_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public int getChargingType() {
                return this.chargingType_;
            }

            public static Android getDefaultInstance() {
                return Android.DEFAULT_INSTANCE;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public long getDeviceElapsedRealtime() {
                return this.deviceElapsedRealtime_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public long getDeviceUpTime() {
                return this.deviceUpTime_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public double getMaxVolume() {
                return this.maxVolume_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public NetworkCapabilityTransports getNetworkCapabilityTransports() {
                return this.networkCapabilityTransports_ == null ? NetworkCapabilityTransports.getDefaultInstance() : this.networkCapabilityTransports_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean getNetworkConnected() {
                return this.networkConnected_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean getNetworkMetered() {
                return this.networkMetered_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public int getNetworkType() {
                return this.networkType_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean getSdCardPresent() {
                return this.sdCardPresent_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean getStayOnWhilePluggedIn() {
                return this.stayOnWhilePluggedIn_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public int getTelephonyManagerNetworkType() {
                return this.telephonyManagerNetworkType_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean getUsbConnected() {
                return this.usbConnected_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public double getVolume() {
                return this.volume_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasAdbEnabled() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasAirplaneMode() {
                return (this.bitField0_ & 0x400) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasChargingType() {
                return (this.bitField0_ & 0x4000) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasDeviceElapsedRealtime() {
                return (this.bitField0_ & 0x200) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasDeviceUpTime() {
                return (this.bitField0_ & 0x100) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasMaxVolume() {
                return (this.bitField0_ & 0x80) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasNetworkCapabilityTransports() {
                return (this.bitField0_ & 0x2000) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasNetworkConnected() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasNetworkMetered() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasNetworkType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasSdCardPresent() {
                return (this.bitField0_ & 0x1000) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasStayOnWhilePluggedIn() {
                return (this.bitField0_ & 0x800) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasTelephonyManagerNetworkType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasUsbConnected() {
                return (this.bitField0_ & 0x20) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder
            public boolean hasVolume() {
                return (this.bitField0_ & 0x40) != 0;
            }

            private void mergeNetworkCapabilityTransports(NetworkCapabilityTransports networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0) {
                networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0.getClass();
                this.networkCapabilityTransports_ = this.networkCapabilityTransports_ == null || this.networkCapabilityTransports_ == NetworkCapabilityTransports.getDefaultInstance() ? networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0 : ((NetworkCapabilityTransports)((gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder)NetworkCapabilityTransports.newBuilder(this.networkCapabilityTransports_).mergeFrom(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0)).buildPartial());
                this.bitField0_ |= 0x2000;
            }

            public static Builder newBuilder() {
                return (Builder)Android.DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Android dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0) {
                return (Builder)Android.DEFAULT_INSTANCE.createBuilder(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0);
            }

            public static Android parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (Android)GeneratedMessageLite.parseDelimitedFrom(Android.DEFAULT_INSTANCE, inputStream0);
            }

            public static Android parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Android)GeneratedMessageLite.parseDelimitedFrom(Android.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Android parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, byteString0);
            }

            public static Android parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static Android parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static Android parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static Android parseFrom(InputStream inputStream0) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, inputStream0);
            }

            public static Android parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Android parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static Android parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static Android parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, arr_b);
            }

            public static Android parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return Android.DEFAULT_INSTANCE.getParserForType();
            }

            private void setAdbEnabled(boolean z) {
                this.bitField0_ |= 16;
                this.adbEnabled_ = z;
            }

            private void setAirplaneMode(boolean z) {
                this.bitField0_ |= 0x400;
                this.airplaneMode_ = z;
            }

            private void setChargingType(int v) {
                this.bitField0_ |= 0x4000;
                this.chargingType_ = v;
            }

            private void setDeviceElapsedRealtime(long v) {
                this.bitField0_ |= 0x200;
                this.deviceElapsedRealtime_ = v;
            }

            private void setDeviceUpTime(long v) {
                this.bitField0_ |= 0x100;
                this.deviceUpTime_ = v;
            }

            private void setMaxVolume(double f) {
                this.bitField0_ |= 0x80;
                this.maxVolume_ = f;
            }

            private void setNetworkCapabilityTransports(NetworkCapabilityTransports networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0) {
                networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0.getClass();
                this.networkCapabilityTransports_ = networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0;
                this.bitField0_ |= 0x2000;
            }

            private void setNetworkConnected(boolean z) {
                this.bitField0_ |= 1;
                this.networkConnected_ = z;
            }

            private void setNetworkMetered(boolean z) {
                this.bitField0_ |= 4;
                this.networkMetered_ = z;
            }

            private void setNetworkType(int v) {
                this.bitField0_ |= 2;
                this.networkType_ = v;
            }

            private void setSdCardPresent(boolean z) {
                this.bitField0_ |= 0x1000;
                this.sdCardPresent_ = z;
            }

            private void setStayOnWhilePluggedIn(boolean z) {
                this.bitField0_ |= 0x800;
                this.stayOnWhilePluggedIn_ = z;
            }

            private void setTelephonyManagerNetworkType(int v) {
                this.bitField0_ |= 8;
                this.telephonyManagerNetworkType_ = v;
            }

            private void setUsbConnected(boolean z) {
                this.bitField0_ |= 0x20;
                this.usbConnected_ = z;
            }

            private void setVolume(double f) {
                this.bitField0_ |= 0x40;
                this.volume_ = f;
            }
        }

        public interface AndroidOrBuilder extends MessageLiteOrBuilder {
            boolean getAdbEnabled();

            boolean getAirplaneMode();

            int getChargingType();

            long getDeviceElapsedRealtime();

            long getDeviceUpTime();

            double getMaxVolume();

            NetworkCapabilityTransports getNetworkCapabilityTransports();

            boolean getNetworkConnected();

            boolean getNetworkMetered();

            int getNetworkType();

            boolean getSdCardPresent();

            boolean getStayOnWhilePluggedIn();

            int getTelephonyManagerNetworkType();

            boolean getUsbConnected();

            double getVolume();

            boolean hasAdbEnabled();

            boolean hasAirplaneMode();

            boolean hasChargingType();

            boolean hasDeviceElapsedRealtime();

            boolean hasDeviceUpTime();

            boolean hasMaxVolume();

            boolean hasNetworkCapabilityTransports();

            boolean hasNetworkConnected();

            boolean hasNetworkMetered();

            boolean hasNetworkType();

            boolean hasSdCardPresent();

            boolean hasStayOnWhilePluggedIn();

            boolean hasTelephonyManagerNetworkType();

            boolean hasUsbConnected();

            boolean hasVolume();
        }

        public static final class gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements DynamicDeviceInfoOrBuilder {
            private gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder() {
                super(DynamicDeviceInfo.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a dynamicDeviceInfoOuterClass$a0) {
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearAndroid() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearAndroid();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearAppActive() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearAppActive();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearBatteryLevel() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearBatteryLevel();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearBatteryStatus() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearBatteryStatus();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearConnectionType() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearConnectionType();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearFreeDiskSpace() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearFreeDiskSpace();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearFreeRamMemory() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearFreeRamMemory();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearIos() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearIos();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearLanguage() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearLanguage();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearLimitedOpenAdTracking() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearLimitedOpenAdTracking();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearLimitedTracking() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearLimitedTracking();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearLowPowerMode() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearLowPowerMode();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearNetworkOperator() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearNetworkOperator();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearNetworkOperatorName() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearNetworkOperatorName();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearPlatformSpecific() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearPlatformSpecific();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearScreenHeight() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearScreenHeight();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearScreenWidth() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearScreenWidth();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearTimeZone() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearTimeZone();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearTimeZoneOffset() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearTimeZoneOffset();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearUserId() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearUserId();
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder clearWiredHeadset() {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).clearWiredHeadset();
                return this;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public Android getAndroid() {
                return ((DynamicDeviceInfo)this.instance).getAndroid();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean getAppActive() {
                return ((DynamicDeviceInfo)this.instance).getAppActive();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public double getBatteryLevel() {
                return ((DynamicDeviceInfo)this.instance).getBatteryLevel();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public int getBatteryStatus() {
                return ((DynamicDeviceInfo)this.instance).getBatteryStatus();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public ConnectionType getConnectionType() {
                return ((DynamicDeviceInfo)this.instance).getConnectionType();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public int getConnectionTypeValue() {
                return ((DynamicDeviceInfo)this.instance).getConnectionTypeValue();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public long getFreeDiskSpace() {
                return ((DynamicDeviceInfo)this.instance).getFreeDiskSpace();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public long getFreeRamMemory() {
                return ((DynamicDeviceInfo)this.instance).getFreeRamMemory();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public Ios getIos() {
                return ((DynamicDeviceInfo)this.instance).getIos();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public String getLanguage() {
                return ((DynamicDeviceInfo)this.instance).getLanguage();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public ByteString getLanguageBytes() {
                return ((DynamicDeviceInfo)this.instance).getLanguageBytes();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean getLimitedOpenAdTracking() {
                return ((DynamicDeviceInfo)this.instance).getLimitedOpenAdTracking();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean getLimitedTracking() {
                return ((DynamicDeviceInfo)this.instance).getLimitedTracking();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean getLowPowerMode() {
                return ((DynamicDeviceInfo)this.instance).getLowPowerMode();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public String getNetworkOperator() {
                return "";
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public ByteString getNetworkOperatorBytes() {
                return ((DynamicDeviceInfo)this.instance).getNetworkOperatorBytes();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public String getNetworkOperatorName() {
                return ((DynamicDeviceInfo)this.instance).getNetworkOperatorName();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public ByteString getNetworkOperatorNameBytes() {
                return ((DynamicDeviceInfo)this.instance).getNetworkOperatorNameBytes();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public PlatformSpecificCase getPlatformSpecificCase() {
                return ((DynamicDeviceInfo)this.instance).getPlatformSpecificCase();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public int getScreenHeight() {
                return ((DynamicDeviceInfo)this.instance).getScreenHeight();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public int getScreenWidth() {
                return ((DynamicDeviceInfo)this.instance).getScreenWidth();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public String getTimeZone() {
                return ((DynamicDeviceInfo)this.instance).getTimeZone();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public ByteString getTimeZoneBytes() {
                return ((DynamicDeviceInfo)this.instance).getTimeZoneBytes();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public long getTimeZoneOffset() {
                return ((DynamicDeviceInfo)this.instance).getTimeZoneOffset();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public String getUserId() {
                return ((DynamicDeviceInfo)this.instance).getUserId();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ((DynamicDeviceInfo)this.instance).getUserIdBytes();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean getWiredHeadset() {
                return ((DynamicDeviceInfo)this.instance).getWiredHeadset();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasAndroid() {
                return ((DynamicDeviceInfo)this.instance).hasAndroid();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasAppActive() {
                return ((DynamicDeviceInfo)this.instance).hasAppActive();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasBatteryLevel() {
                return ((DynamicDeviceInfo)this.instance).hasBatteryLevel();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasBatteryStatus() {
                return ((DynamicDeviceInfo)this.instance).hasBatteryStatus();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasConnectionType() {
                return ((DynamicDeviceInfo)this.instance).hasConnectionType();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasFreeDiskSpace() {
                return ((DynamicDeviceInfo)this.instance).hasFreeDiskSpace();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasFreeRamMemory() {
                return ((DynamicDeviceInfo)this.instance).hasFreeRamMemory();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasIos() {
                return ((DynamicDeviceInfo)this.instance).hasIos();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasLanguage() {
                return ((DynamicDeviceInfo)this.instance).hasLanguage();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasLimitedOpenAdTracking() {
                return ((DynamicDeviceInfo)this.instance).hasLimitedOpenAdTracking();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasLimitedTracking() {
                return ((DynamicDeviceInfo)this.instance).hasLimitedTracking();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasLowPowerMode() {
                return ((DynamicDeviceInfo)this.instance).hasLowPowerMode();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasNetworkOperator() {
                return ((DynamicDeviceInfo)this.instance).hasNetworkOperator();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasNetworkOperatorName() {
                return ((DynamicDeviceInfo)this.instance).hasNetworkOperatorName();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasScreenHeight() {
                return ((DynamicDeviceInfo)this.instance).hasScreenHeight();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasScreenWidth() {
                return ((DynamicDeviceInfo)this.instance).hasScreenWidth();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasTimeZone() {
                return ((DynamicDeviceInfo)this.instance).hasTimeZone();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasTimeZoneOffset() {
                return ((DynamicDeviceInfo)this.instance).hasTimeZoneOffset();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasUserId() {
                return ((DynamicDeviceInfo)this.instance).hasUserId();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
            public boolean hasWiredHeadset() {
                return ((DynamicDeviceInfo)this.instance).hasWiredHeadset();
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder mergeAndroid(Android dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).mergeAndroid(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder mergeIos(Ios dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).mergeIos(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setAndroid(Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setAndroid(((Android)dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setAndroid(Android dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setAndroid(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setAppActive(boolean z) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setAppActive(z);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setBatteryLevel(double f) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setBatteryLevel(f);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setBatteryStatus(int v) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setBatteryStatus(v);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setConnectionType(ConnectionType dynamicDeviceInfoOuterClass$ConnectionType0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setConnectionType(dynamicDeviceInfoOuterClass$ConnectionType0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setConnectionTypeValue(int v) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setConnectionTypeValue(v);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setFreeDiskSpace(long v) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setFreeDiskSpace(v);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setFreeRamMemory(long v) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setFreeRamMemory(v);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setIos(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setIos(((Ios)dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setIos(Ios dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setIos(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLanguage(String s) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setLanguage(s);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLanguageBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setLanguageBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLimitedOpenAdTracking(boolean z) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setLimitedOpenAdTracking(z);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLimitedTracking(boolean z) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setLimitedTracking(z);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setLowPowerMode(boolean z) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setLowPowerMode(z);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setNetworkOperator(String s) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setNetworkOperator(s);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setNetworkOperatorBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setNetworkOperatorBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setNetworkOperatorName(String s) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setNetworkOperatorName(s);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setNetworkOperatorNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setNetworkOperatorNameBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setScreenHeight(int v) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setScreenHeight(v);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setScreenWidth(int v) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setScreenWidth(v);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setTimeZone(String s) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setTimeZone(s);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setTimeZoneBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setTimeZoneBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setTimeZoneOffset(long v) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setTimeZoneOffset(v);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setUserId(String s) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setUserId(s);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setUserIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setUserIdBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder setWiredHeadset(boolean z) {
                this.copyOnWrite();
                ((DynamicDeviceInfo)this.instance).setWiredHeadset(z);
                return this;
            }
        }

        public static final class Ios extends GeneratedMessageLite implements IosOrBuilder {
            public static final class gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements IosOrBuilder {
                private gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder() {
                    super(Ios.DEFAULT_INSTANCE);
                }

                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a dynamicDeviceInfoOuterClass$a0) {
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addAllLocaleList(Iterable iterable0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addAllLocaleList(iterable0);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addAllNwPathInterfaces(Iterable iterable0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addAllNwPathInterfaces(iterable0);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addLocaleList(String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addLocaleList(s);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addLocaleListBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addLocaleListBytes(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addNwPathInterfaces(String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addNwPathInterfaces(s);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder addNwPathInterfacesBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addNwPathInterfacesBytes(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearCurrentRadioAccessTechnology() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearCurrentRadioAccessTechnology();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearCurrentUiTheme() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearCurrentUiTheme();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearDeviceName() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearDeviceName();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearDeviceUpTimeWithSleep() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearDeviceUpTimeWithSleep();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearDeviceUpTimeWithoutSleep() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearDeviceUpTimeWithoutSleep();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearLocaleList() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearLocaleList();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearNetworkReachabilityFlags() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearNetworkReachabilityFlags();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearNwPathInterfaces() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearNwPathInterfaces();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearTrackingAuthStatus() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearTrackingAuthStatus();
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder clearVolume() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearVolume();
                    return this;
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public String getCurrentRadioAccessTechnology() {
                    return ((Ios)this.instance).getCurrentRadioAccessTechnology();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public ByteString getCurrentRadioAccessTechnologyBytes() {
                    return ((Ios)this.instance).getCurrentRadioAccessTechnologyBytes();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public int getCurrentUiTheme() {
                    return ((Ios)this.instance).getCurrentUiTheme();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public String getDeviceName() {
                    return ((Ios)this.instance).getDeviceName();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public ByteString getDeviceNameBytes() {
                    return ((Ios)this.instance).getDeviceNameBytes();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public long getDeviceUpTimeWithSleep() {
                    return ((Ios)this.instance).getDeviceUpTimeWithSleep();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public long getDeviceUpTimeWithoutSleep() {
                    return ((Ios)this.instance).getDeviceUpTimeWithoutSleep();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public String getLocaleList(int v) {
                    return ((Ios)this.instance).getLocaleList(v);
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public ByteString getLocaleListBytes(int v) {
                    return ((Ios)this.instance).getLocaleListBytes(v);
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public int getLocaleListCount() {
                    return ((Ios)this.instance).getLocaleListCount();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public List getLocaleListList() {
                    return DesugarCollections.unmodifiableList(((Ios)this.instance).getLocaleListList());
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public int getNetworkReachabilityFlags() {
                    return ((Ios)this.instance).getNetworkReachabilityFlags();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public String getNwPathInterfaces(int v) {
                    return ((Ios)this.instance).getNwPathInterfaces(v);
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public ByteString getNwPathInterfacesBytes(int v) {
                    return ((Ios)this.instance).getNwPathInterfacesBytes(v);
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public int getNwPathInterfacesCount() {
                    return ((Ios)this.instance).getNwPathInterfacesCount();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public List getNwPathInterfacesList() {
                    return DesugarCollections.unmodifiableList(((Ios)this.instance).getNwPathInterfacesList());
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public int getTrackingAuthStatus() {
                    return ((Ios)this.instance).getTrackingAuthStatus();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public double getVolume() {
                    return ((Ios)this.instance).getVolume();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public boolean hasCurrentRadioAccessTechnology() {
                    return ((Ios)this.instance).hasCurrentRadioAccessTechnology();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public boolean hasCurrentUiTheme() {
                    return ((Ios)this.instance).hasCurrentUiTheme();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public boolean hasDeviceName() {
                    return ((Ios)this.instance).hasDeviceName();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public boolean hasDeviceUpTimeWithSleep() {
                    return ((Ios)this.instance).hasDeviceUpTimeWithSleep();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public boolean hasDeviceUpTimeWithoutSleep() {
                    return ((Ios)this.instance).hasDeviceUpTimeWithoutSleep();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public boolean hasNetworkReachabilityFlags() {
                    return ((Ios)this.instance).hasNetworkReachabilityFlags();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public boolean hasTrackingAuthStatus() {
                    return ((Ios)this.instance).hasTrackingAuthStatus();
                }

                @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
                public boolean hasVolume() {
                    return ((Ios)this.instance).hasVolume();
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setCurrentRadioAccessTechnology(String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setCurrentRadioAccessTechnology(s);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setCurrentRadioAccessTechnologyBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setCurrentRadioAccessTechnologyBytes(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setCurrentUiTheme(int v) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setCurrentUiTheme(v);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setDeviceName(String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setDeviceName(s);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setDeviceNameBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setDeviceNameBytes(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setDeviceUpTimeWithSleep(long v) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setDeviceUpTimeWithSleep(v);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setDeviceUpTimeWithoutSleep(long v) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setDeviceUpTimeWithoutSleep(v);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setLocaleList(int v, String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setLocaleList(v, s);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setNetworkReachabilityFlags(int v) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setNetworkReachabilityFlags(v);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setNwPathInterfaces(int v, String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setNwPathInterfaces(v, s);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setTrackingAuthStatus(int v) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setTrackingAuthStatus(v);
                    return this;
                }

                public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder setVolume(double f) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setVolume(f);
                    return this;
                }
            }

            public static final int CURRENT_RADIO_ACCESS_TECHNOLOGY_FIELD_NUMBER = 1;
            public static final int CURRENT_UI_THEME_FIELD_NUMBER = 5;
            private static final Ios DEFAULT_INSTANCE = null;
            public static final int DEVICE_NAME_FIELD_NUMBER = 6;
            public static final int DEVICE_UP_TIME_WITHOUT_SLEEP_FIELD_NUMBER = 10;
            public static final int DEVICE_UP_TIME_WITH_SLEEP_FIELD_NUMBER = 9;
            public static final int LOCALE_LIST_FIELD_NUMBER = 4;
            public static final int NETWORK_REACHABILITY_FLAGS_FIELD_NUMBER = 2;
            public static final int NW_PATH_INTERFACES_FIELD_NUMBER = 3;
            private static volatile Parser PARSER = null;
            public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 8;
            public static final int VOLUME_FIELD_NUMBER = 7;
            private int bitField0_;
            private String currentRadioAccessTechnology_;
            private int currentUiTheme_;
            private String deviceName_;
            private long deviceUpTimeWithSleep_;
            private long deviceUpTimeWithoutSleep_;
            private ProtobufList localeList_;
            private int networkReachabilityFlags_;
            private ProtobufList nwPathInterfaces_;
            private int trackingAuthStatus_;
            private double volume_;

            static {
                Ios dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0 = new Ios();
                Ios.DEFAULT_INSTANCE = dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0;
                GeneratedMessageLite.registerDefaultInstance(Ios.class, dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0);
            }

            private Ios() {
                this.currentRadioAccessTechnology_ = "";
                this.nwPathInterfaces_ = GeneratedMessageLite.emptyProtobufList();
                this.localeList_ = GeneratedMessageLite.emptyProtobufList();
                this.deviceName_ = "";
            }

            private void addAllLocaleList(Iterable iterable0) {
                this.ensureLocaleListIsMutable();
                AbstractMessageLite.addAll(iterable0, this.localeList_);
            }

            private void addAllNwPathInterfaces(Iterable iterable0) {
                this.ensureNwPathInterfacesIsMutable();
                AbstractMessageLite.addAll(iterable0, this.nwPathInterfaces_);
            }

            private void addLocaleList(String s) {
                s.getClass();
                this.ensureLocaleListIsMutable();
                this.localeList_.add(s);
            }

            private void addLocaleListBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.ensureLocaleListIsMutable();
                this.localeList_.add(byteString0.toStringUtf8());
            }

            private void addNwPathInterfaces(String s) {
                s.getClass();
                this.ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.add(s);
            }

            private void addNwPathInterfacesBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.add(byteString0.toStringUtf8());
            }

            private void clearCurrentRadioAccessTechnology() {
                this.bitField0_ &= -2;
                this.currentRadioAccessTechnology_ = Ios.getDefaultInstance().getCurrentRadioAccessTechnology();
            }

            private void clearCurrentUiTheme() {
                this.bitField0_ &= -5;
                this.currentUiTheme_ = 0;
            }

            private void clearDeviceName() {
                this.bitField0_ &= -9;
                this.deviceName_ = "";
            }

            private void clearDeviceUpTimeWithSleep() {
                this.bitField0_ &= -65;
                this.deviceUpTimeWithSleep_ = 0L;
            }

            private void clearDeviceUpTimeWithoutSleep() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.deviceUpTimeWithoutSleep_ = 0L;
            }

            private void clearLocaleList() {
                this.localeList_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearNetworkReachabilityFlags() {
                this.bitField0_ &= -3;
                this.networkReachabilityFlags_ = 0;
            }

            private void clearNwPathInterfaces() {
                this.nwPathInterfaces_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearTrackingAuthStatus() {
                this.bitField0_ &= -33;
                this.trackingAuthStatus_ = 0;
            }

            private void clearVolume() {
                this.bitField0_ &= -17;
                this.volume_ = 0.0;
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new Ios();
                    }
                    case 2: {
                        return new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(Ios.DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ለ\u0000\u0002ဋ\u0001\u0003Ț\u0004Ț\u0005င\u0002\u0006ለ\u0003\u0007က\u0004\bင\u0005\tဂ\u0006\nဂ\u0007", new Object[]{"bitField0_", "currentRadioAccessTechnology_", "networkReachabilityFlags_", "nwPathInterfaces_", "localeList_", "currentUiTheme_", "deviceName_", "volume_", "trackingAuthStatus_", "deviceUpTimeWithSleep_", "deviceUpTimeWithoutSleep_"});
                    }
                    case 4: {
                        return Ios.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = Ios.PARSER;
                        if(parser0 == null) {
                            Class class0 = Ios.class;
                            synchronized(class0) {
                                parser0 = Ios.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(Ios.DEFAULT_INSTANCE);
                                    Ios.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 7: {
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            private void ensureLocaleListIsMutable() {
                ProtobufList internal$ProtobufList0 = this.localeList_;
                if(!internal$ProtobufList0.isModifiable()) {
                    this.localeList_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
                }
            }

            private void ensureNwPathInterfacesIsMutable() {
                ProtobufList internal$ProtobufList0 = this.nwPathInterfaces_;
                if(!internal$ProtobufList0.isModifiable()) {
                    this.nwPathInterfaces_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
                }
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public String getCurrentRadioAccessTechnology() {
                return this.currentRadioAccessTechnology_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public ByteString getCurrentRadioAccessTechnologyBytes() {
                return ByteString.copyFromUtf8(this.currentRadioAccessTechnology_);
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public int getCurrentUiTheme() {
                return this.currentUiTheme_;
            }

            public static Ios getDefaultInstance() {
                return Ios.DEFAULT_INSTANCE;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public String getDeviceName() {
                return this.deviceName_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public ByteString getDeviceNameBytes() {
                return ByteString.copyFromUtf8(this.deviceName_);
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public long getDeviceUpTimeWithSleep() {
                return this.deviceUpTimeWithSleep_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public long getDeviceUpTimeWithoutSleep() {
                return this.deviceUpTimeWithoutSleep_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public String getLocaleList(int v) {
                return (String)this.localeList_.get(v);
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public ByteString getLocaleListBytes(int v) {
                return ByteString.copyFromUtf8(((String)this.localeList_.get(v)));
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public int getLocaleListCount() {
                return this.localeList_.size();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public List getLocaleListList() {
                return this.localeList_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public int getNetworkReachabilityFlags() {
                return this.networkReachabilityFlags_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public String getNwPathInterfaces(int v) {
                return (String)this.nwPathInterfaces_.get(v);
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public ByteString getNwPathInterfacesBytes(int v) {
                return ByteString.copyFromUtf8(((String)this.nwPathInterfaces_.get(v)));
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public int getNwPathInterfacesCount() {
                return this.nwPathInterfaces_.size();
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public List getNwPathInterfacesList() {
                return this.nwPathInterfaces_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public int getTrackingAuthStatus() {
                return this.trackingAuthStatus_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public double getVolume() {
                return this.volume_;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public boolean hasCurrentRadioAccessTechnology() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public boolean hasCurrentUiTheme() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public boolean hasDeviceName() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public boolean hasDeviceUpTimeWithSleep() {
                return (this.bitField0_ & 0x40) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public boolean hasDeviceUpTimeWithoutSleep() {
                return (this.bitField0_ & 0x80) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public boolean hasNetworkReachabilityFlags() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public boolean hasTrackingAuthStatus() {
                return (this.bitField0_ & 0x20) != 0;
            }

            @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$IosOrBuilder
            public boolean hasVolume() {
                return (this.bitField0_ & 16) != 0;
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder newBuilder() {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder)Ios.DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder newBuilder(Ios dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0) {
                return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder)Ios.DEFAULT_INSTANCE.createBuilder(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (Ios)GeneratedMessageLite.parseDelimitedFrom(Ios.DEFAULT_INSTANCE, inputStream0);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Ios)GeneratedMessageLite.parseDelimitedFrom(Ios.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Ios parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, byteString0);
            }

            public static Ios parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static Ios parseFrom(InputStream inputStream0) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, inputStream0);
            }

            public static Ios parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static Ios parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, arr_b);
            }

            public static Ios parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return Ios.DEFAULT_INSTANCE.getParserForType();
            }

            private void setCurrentRadioAccessTechnology(String s) {
                s.getClass();
                this.bitField0_ |= 1;
                this.currentRadioAccessTechnology_ = s;
            }

            private void setCurrentRadioAccessTechnologyBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.currentRadioAccessTechnology_ = byteString0.toStringUtf8();
                this.bitField0_ |= 1;
            }

            private void setCurrentUiTheme(int v) {
                this.bitField0_ |= 4;
                this.currentUiTheme_ = v;
            }

            private void setDeviceName(String s) {
                s.getClass();
                this.bitField0_ |= 8;
                this.deviceName_ = s;
            }

            private void setDeviceNameBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.deviceName_ = byteString0.toStringUtf8();
                this.bitField0_ |= 8;
            }

            private void setDeviceUpTimeWithSleep(long v) {
                this.bitField0_ |= 0x40;
                this.deviceUpTimeWithSleep_ = v;
            }

            private void setDeviceUpTimeWithoutSleep(long v) {
                this.bitField0_ |= 0x80;
                this.deviceUpTimeWithoutSleep_ = v;
            }

            private void setLocaleList(int v, String s) {
                s.getClass();
                this.ensureLocaleListIsMutable();
                this.localeList_.set(v, s);
            }

            private void setNetworkReachabilityFlags(int v) {
                this.bitField0_ |= 2;
                this.networkReachabilityFlags_ = v;
            }

            private void setNwPathInterfaces(int v, String s) {
                s.getClass();
                this.ensureNwPathInterfacesIsMutable();
                this.nwPathInterfaces_.set(v, s);
            }

            private void setTrackingAuthStatus(int v) {
                this.bitField0_ |= 0x20;
                this.trackingAuthStatus_ = v;
            }

            private void setVolume(double f) {
                this.bitField0_ |= 16;
                this.volume_ = f;
            }
        }

        public interface IosOrBuilder extends MessageLiteOrBuilder {
            String getCurrentRadioAccessTechnology();

            ByteString getCurrentRadioAccessTechnologyBytes();

            int getCurrentUiTheme();

            String getDeviceName();

            ByteString getDeviceNameBytes();

            long getDeviceUpTimeWithSleep();

            long getDeviceUpTimeWithoutSleep();

            String getLocaleList(int arg1);

            ByteString getLocaleListBytes(int arg1);

            int getLocaleListCount();

            List getLocaleListList();

            int getNetworkReachabilityFlags();

            String getNwPathInterfaces(int arg1);

            ByteString getNwPathInterfacesBytes(int arg1);

            int getNwPathInterfacesCount();

            List getNwPathInterfacesList();

            int getTrackingAuthStatus();

            double getVolume();

            boolean hasCurrentRadioAccessTechnology();

            boolean hasCurrentUiTheme();

            boolean hasDeviceName();

            boolean hasDeviceUpTimeWithSleep();

            boolean hasDeviceUpTimeWithoutSleep();

            boolean hasNetworkReachabilityFlags();

            boolean hasTrackingAuthStatus();

            boolean hasVolume();
        }

        public static enum PlatformSpecificCase {
            ANDROID(12),
            IOS(13),
            PLATFORMSPECIFIC_NOT_SET(0);

            private final int value;

            private static PlatformSpecificCase[] $values() [...] // Inlined contents

            private PlatformSpecificCase(int v1) {
                this.value = v1;
            }

            public static PlatformSpecificCase forNumber(int v) {
                switch(v) {
                    case 0: {
                        return PlatformSpecificCase.PLATFORMSPECIFIC_NOT_SET;
                    }
                    case 12: {
                        return PlatformSpecificCase.ANDROID;
                    }
                    case 13: {
                        return PlatformSpecificCase.IOS;
                    }
                    default: {
                        return null;
                    }
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PlatformSpecificCase valueOf(int v) {
                return PlatformSpecificCase.forNumber(v);
            }
        }

        public static final int ANDROID_FIELD_NUMBER = 12;
        public static final int APP_ACTIVE_FIELD_NUMBER = 17;
        public static final int BATTERY_LEVEL_FIELD_NUMBER = 14;
        public static final int BATTERY_STATUS_FIELD_NUMBER = 15;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
        private static final DynamicDeviceInfo DEFAULT_INSTANCE = null;
        public static final int FREE_DISK_SPACE_FIELD_NUMBER = 5;
        public static final int FREE_RAM_MEMORY_FIELD_NUMBER = 6;
        public static final int IOS_FIELD_NUMBER = 13;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LIMITED_OPEN_AD_TRACKING_FIELD_NUMBER = 11;
        public static final int LIMITED_TRACKING_FIELD_NUMBER = 10;
        public static final int LOW_POWER_MODE_FIELD_NUMBER = 18;
        public static final int NETWORK_OPERATOR_FIELD_NUMBER = 2;
        public static final int NETWORK_OPERATOR_NAME_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 21;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 20;
        public static final int TIME_ZONE_FIELD_NUMBER = 8;
        public static final int TIME_ZONE_OFFSET_FIELD_NUMBER = 9;
        public static final int USER_ID_FIELD_NUMBER = 19;
        public static final int WIRED_HEADSET_FIELD_NUMBER = 7;
        private boolean appActive_;
        private double batteryLevel_;
        private int batteryStatus_;
        private int bitField0_;
        private int connectionType_;
        private long freeDiskSpace_;
        private long freeRamMemory_;
        private String language_;
        private boolean limitedOpenAdTracking_;
        private boolean limitedTracking_;
        private boolean lowPowerMode_;
        private String networkOperatorName_;
        private String networkOperator_;
        private int platformSpecificCase_;
        private Object platformSpecific_;
        private int screenHeight_;
        private int screenWidth_;
        private long timeZoneOffset_;
        private String timeZone_;
        private String userId_;
        private boolean wiredHeadset_;

        static {
            DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 = new DynamicDeviceInfo();
            DynamicDeviceInfo.DEFAULT_INSTANCE = dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
            GeneratedMessageLite.registerDefaultInstance(DynamicDeviceInfo.class, dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
        }

        private DynamicDeviceInfo() {
            this.platformSpecificCase_ = 0;
            this.language_ = "";
            this.networkOperator_ = "";
            this.networkOperatorName_ = "";
            this.timeZone_ = "";
            this.userId_ = "";
        }

        private void clearAndroid() {
            if(this.platformSpecificCase_ == 12) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearAppActive() {
            this.bitField0_ &= 0xFFFFDFFF;
            this.appActive_ = false;
        }

        private void clearBatteryLevel() {
            this.bitField0_ &= 0xFFFFFBFF;
            this.batteryLevel_ = 0.0;
        }

        private void clearBatteryStatus() {
            this.bitField0_ &= 0xFFFFF7FF;
            this.batteryStatus_ = 0;
        }

        private void clearConnectionType() {
            this.bitField0_ &= 0xFFFFEFFF;
            this.connectionType_ = 0;
        }

        private void clearFreeDiskSpace() {
            this.bitField0_ &= -9;
            this.freeDiskSpace_ = 0L;
        }

        private void clearFreeRamMemory() {
            this.bitField0_ &= -17;
            this.freeRamMemory_ = 0L;
        }

        private void clearIos() {
            if(this.platformSpecificCase_ == 13) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearLanguage() {
            this.bitField0_ &= -2;
            this.language_ = "";
        }

        private void clearLimitedOpenAdTracking() {
            this.bitField0_ &= 0xFFFFFDFF;
            this.limitedOpenAdTracking_ = false;
        }

        private void clearLimitedTracking() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.limitedTracking_ = false;
        }

        private void clearLowPowerMode() {
            this.bitField0_ &= 0xFFFFBFFF;
            this.lowPowerMode_ = false;
        }

        private void clearNetworkOperator() {
            this.bitField0_ &= -3;
            this.networkOperator_ = "";
        }

        private void clearNetworkOperatorName() {
            this.bitField0_ &= -5;
            this.networkOperatorName_ = "";
        }

        private void clearPlatformSpecific() {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }

        private void clearScreenHeight() {
            this.bitField0_ &= 0xFFFDFFFF;
            this.screenHeight_ = 0;
        }

        private void clearScreenWidth() {
            this.bitField0_ &= 0xFFFEFFFF;
            this.screenWidth_ = 0;
        }

        private void clearTimeZone() {
            this.bitField0_ &= -65;
            this.timeZone_ = "";
        }

        private void clearTimeZoneOffset() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.timeZoneOffset_ = 0L;
        }

        private void clearUserId() {
            this.bitField0_ &= 0xFFFF7FFF;
            this.userId_ = DynamicDeviceInfo.getDefaultInstance().getUserId();
        }

        private void clearWiredHeadset() {
            this.bitField0_ &= -33;
            this.wiredHeadset_ = false;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new DynamicDeviceInfo();
                }
                case 2: {
                    return new gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(DynamicDeviceInfo.DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\u0005\bለ\u0006\tဂ\u0007\nဇ\b\u000Bဇ\t\f<\u0000\r<\u0000\u000Eက\n\u000Fင\u000B\u0010ဌ\f\u0011ဇ\r\u0012ဇ\u000E\u0013ለ\u000F\u0014ဋ\u0010\u0015ဋ\u0011", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "language_", "networkOperator_", "networkOperatorName_", "freeDiskSpace_", "freeRamMemory_", "wiredHeadset_", "timeZone_", "timeZoneOffset_", "limitedTracking_", "limitedOpenAdTracking_", Android.class, Ios.class, "batteryLevel_", "batteryStatus_", "connectionType_", "appActive_", "lowPowerMode_", "userId_", "screenWidth_", "screenHeight_"});
                }
                case 4: {
                    return DynamicDeviceInfo.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = DynamicDeviceInfo.PARSER;
                    if(parser0 == null) {
                        Class class0 = DynamicDeviceInfo.class;
                        synchronized(class0) {
                            parser0 = DynamicDeviceInfo.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(DynamicDeviceInfo.DEFAULT_INSTANCE);
                                DynamicDeviceInfo.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public Android getAndroid() {
            return this.platformSpecificCase_ == 12 ? ((Android)this.platformSpecific_) : Android.getDefaultInstance();
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean getAppActive() {
            return this.appActive_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public double getBatteryLevel() {
            return this.batteryLevel_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public int getBatteryStatus() {
            return this.batteryStatus_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public ConnectionType getConnectionType() {
            ConnectionType dynamicDeviceInfoOuterClass$ConnectionType0 = ConnectionType.forNumber(this.connectionType_);
            return dynamicDeviceInfoOuterClass$ConnectionType0 == null ? ConnectionType.UNRECOGNIZED : dynamicDeviceInfoOuterClass$ConnectionType0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public int getConnectionTypeValue() {
            return this.connectionType_;
        }

        public static DynamicDeviceInfo getDefaultInstance() {
            return DynamicDeviceInfo.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public long getFreeDiskSpace() {
            return this.freeDiskSpace_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public long getFreeRamMemory() {
            return this.freeRamMemory_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public Ios getIos() {
            return this.platformSpecificCase_ == 13 ? ((Ios)this.platformSpecific_) : Ios.getDefaultInstance();
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public String getLanguage() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean getLimitedOpenAdTracking() {
            return this.limitedOpenAdTracking_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean getLimitedTracking() {
            return this.limitedTracking_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean getLowPowerMode() {
            return this.lowPowerMode_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public String getNetworkOperator() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public ByteString getNetworkOperatorBytes() {
            return ByteString.copyFromUtf8(this.networkOperator_);
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public String getNetworkOperatorName() {
            return this.networkOperatorName_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public ByteString getNetworkOperatorNameBytes() {
            return ByteString.copyFromUtf8(this.networkOperatorName_);
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public PlatformSpecificCase getPlatformSpecificCase() {
            return PlatformSpecificCase.forNumber(this.platformSpecificCase_);
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public int getScreenHeight() {
            return this.screenHeight_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public int getScreenWidth() {
            return this.screenWidth_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public String getTimeZone() {
            return this.timeZone_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public ByteString getTimeZoneBytes() {
            return ByteString.copyFromUtf8(this.timeZone_);
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public long getTimeZoneOffset() {
            return this.timeZoneOffset_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean getWiredHeadset() {
            return this.wiredHeadset_;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasAndroid() {
            return this.platformSpecificCase_ == 12;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasAppActive() {
            return (this.bitField0_ & 0x2000) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasBatteryLevel() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasBatteryStatus() {
            return (this.bitField0_ & 0x800) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasConnectionType() {
            return (this.bitField0_ & 0x1000) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasFreeDiskSpace() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasFreeRamMemory() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasIos() {
            return this.platformSpecificCase_ == 13;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasLanguage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasLimitedOpenAdTracking() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasLimitedTracking() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasLowPowerMode() {
            return (this.bitField0_ & 0x4000) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasNetworkOperator() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasNetworkOperatorName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasScreenHeight() {
            return (this.bitField0_ & 0x20000) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasScreenWidth() {
            return (this.bitField0_ & 0x10000) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasTimeZone() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasTimeZoneOffset() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasUserId() {
            return (this.bitField0_ & 0x8000) != 0;
        }

        @Override  // gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder
        public boolean hasWiredHeadset() {
            return (this.bitField0_ & 0x20) != 0;
        }

        private void mergeAndroid(Android dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0.getClass();
            this.platformSpecific_ = this.platformSpecificCase_ != 12 || this.platformSpecific_ == Android.getDefaultInstance() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0 : ((Builder)Android.newBuilder(((Android)this.platformSpecific_)).mergeFrom(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0)).buildPartial();
            this.platformSpecificCase_ = 12;
        }

        private void mergeIos(Ios dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0.getClass();
            this.platformSpecific_ = this.platformSpecificCase_ != 13 || this.platformSpecific_ == Ios.getDefaultInstance() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0 : ((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder)Ios.newBuilder(((Ios)this.platformSpecific_)).mergeFrom(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0)).buildPartial();
            this.platformSpecificCase_ = 13;
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder() {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder)DynamicDeviceInfo.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            return (gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder)DynamicDeviceInfo.DEFAULT_INSTANCE.createBuilder(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
        }

        public static DynamicDeviceInfo parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseDelimitedFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static DynamicDeviceInfo parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseDelimitedFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DynamicDeviceInfo parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, byteString0);
        }

        public static DynamicDeviceInfo parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static DynamicDeviceInfo parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static DynamicDeviceInfo parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static DynamicDeviceInfo parseFrom(InputStream inputStream0) throws IOException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static DynamicDeviceInfo parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DynamicDeviceInfo parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static DynamicDeviceInfo parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static DynamicDeviceInfo parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, arr_b);
        }

        public static DynamicDeviceInfo parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DynamicDeviceInfo)GeneratedMessageLite.parseFrom(DynamicDeviceInfo.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return DynamicDeviceInfo.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAndroid(Android dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0.getClass();
            this.platformSpecific_ = dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0;
            this.platformSpecificCase_ = 12;
        }

        private void setAppActive(boolean z) {
            this.bitField0_ |= 0x2000;
            this.appActive_ = z;
        }

        private void setBatteryLevel(double f) {
            this.bitField0_ |= 0x400;
            this.batteryLevel_ = f;
        }

        private void setBatteryStatus(int v) {
            this.bitField0_ |= 0x800;
            this.batteryStatus_ = v;
        }

        private void setConnectionType(ConnectionType dynamicDeviceInfoOuterClass$ConnectionType0) {
            this.connectionType_ = dynamicDeviceInfoOuterClass$ConnectionType0.getNumber();
            this.bitField0_ |= 0x1000;
        }

        private void setConnectionTypeValue(int v) {
            this.bitField0_ |= 0x1000;
            this.connectionType_ = v;
        }

        private void setFreeDiskSpace(long v) {
            this.bitField0_ |= 8;
            this.freeDiskSpace_ = v;
        }

        private void setFreeRamMemory(long v) {
            this.bitField0_ |= 16;
            this.freeRamMemory_ = v;
        }

        private void setIos(Ios dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0.getClass();
            this.platformSpecific_ = dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0;
            this.platformSpecificCase_ = 13;
        }

        private void setLanguage(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.language_ = s;
        }

        private void setLanguageBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.language_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setLimitedOpenAdTracking(boolean z) {
            this.bitField0_ |= 0x200;
            this.limitedOpenAdTracking_ = z;
        }

        private void setLimitedTracking(boolean z) {
            this.bitField0_ |= 0x100;
            this.limitedTracking_ = z;
        }

        private void setLowPowerMode(boolean z) {
            this.bitField0_ |= 0x4000;
            this.lowPowerMode_ = z;
        }

        private void setNetworkOperator(String s) {
            s.getClass();
            this.bitField0_ |= 2;
            this.networkOperator_ = s;
        }

        private void setNetworkOperatorBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.networkOperator_ = byteString0.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setNetworkOperatorName(String s) {
            s.getClass();
            this.bitField0_ |= 4;
            this.networkOperatorName_ = s;
        }

        private void setNetworkOperatorNameBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.networkOperatorName_ = byteString0.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setScreenHeight(int v) {
            this.bitField0_ |= 0x20000;
            this.screenHeight_ = v;
        }

        private void setScreenWidth(int v) {
            this.bitField0_ |= 0x10000;
            this.screenWidth_ = v;
        }

        private void setTimeZone(String s) {
            s.getClass();
            this.bitField0_ |= 0x40;
            this.timeZone_ = s;
        }

        private void setTimeZoneBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.timeZone_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x40;
        }

        private void setTimeZoneOffset(long v) {
            this.bitField0_ |= 0x80;
            this.timeZoneOffset_ = v;
        }

        private void setUserId(String s) {
            s.getClass();
            this.bitField0_ |= 0x8000;
            this.userId_ = s;
        }

        private void setUserIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.userId_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x8000;
        }

        private void setWiredHeadset(boolean z) {
            this.bitField0_ |= 0x20;
            this.wiredHeadset_ = z;
        }
    }

    public interface DynamicDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        Android getAndroid();

        boolean getAppActive();

        double getBatteryLevel();

        int getBatteryStatus();

        ConnectionType getConnectionType();

        int getConnectionTypeValue();

        long getFreeDiskSpace();

        long getFreeRamMemory();

        Ios getIos();

        String getLanguage();

        ByteString getLanguageBytes();

        boolean getLimitedOpenAdTracking();

        boolean getLimitedTracking();

        boolean getLowPowerMode();

        String getNetworkOperator();

        ByteString getNetworkOperatorBytes();

        String getNetworkOperatorName();

        ByteString getNetworkOperatorNameBytes();

        PlatformSpecificCase getPlatformSpecificCase();

        int getScreenHeight();

        int getScreenWidth();

        String getTimeZone();

        ByteString getTimeZoneBytes();

        long getTimeZoneOffset();

        String getUserId();

        ByteString getUserIdBytes();

        boolean getWiredHeadset();

        boolean hasAndroid();

        boolean hasAppActive();

        boolean hasBatteryLevel();

        boolean hasBatteryStatus();

        boolean hasConnectionType();

        boolean hasFreeDiskSpace();

        boolean hasFreeRamMemory();

        boolean hasIos();

        boolean hasLanguage();

        boolean hasLimitedOpenAdTracking();

        boolean hasLimitedTracking();

        boolean hasLowPowerMode();

        boolean hasNetworkOperator();

        boolean hasNetworkOperatorName();

        boolean hasScreenHeight();

        boolean hasScreenWidth();

        boolean hasTimeZone();

        boolean hasTimeZoneOffset();

        boolean hasUserId();

        boolean hasWiredHeadset();
    }

    static class gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

