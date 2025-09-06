package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class NetworkCapabilityTransportsOuterClass {
    public static final class NetworkCapabilityTransports extends GeneratedMessageLite implements NetworkCapabilityTransportsOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements NetworkCapabilityTransportsOrBuilder {
            private Builder() {
                super(NetworkCapabilityTransports.DEFAULT_INSTANCE);
            }

            Builder(a networkCapabilityTransportsOuterClass$a0) {
            }

            public Builder clearBluetooth() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearBluetooth();
                return this;
            }

            public Builder clearCellular() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearCellular();
                return this;
            }

            public Builder clearEthernet() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearEthernet();
                return this;
            }

            public Builder clearLowpan() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearLowpan();
                return this;
            }

            public Builder clearSatellite() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearSatellite();
                return this;
            }

            public Builder clearThread() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearThread();
                return this;
            }

            public Builder clearUsb() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearUsb();
                return this;
            }

            public Builder clearVpn() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearVpn();
                return this;
            }

            public Builder clearWifi() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearWifi();
                return this;
            }

            public Builder clearWifiAware() {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).clearWifiAware();
                return this;
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getBluetooth() {
                return ((NetworkCapabilityTransports)this.instance).getBluetooth();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getCellular() {
                return ((NetworkCapabilityTransports)this.instance).getCellular();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getEthernet() {
                return ((NetworkCapabilityTransports)this.instance).getEthernet();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getLowpan() {
                return ((NetworkCapabilityTransports)this.instance).getLowpan();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getSatellite() {
                return ((NetworkCapabilityTransports)this.instance).getSatellite();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getThread() {
                return ((NetworkCapabilityTransports)this.instance).getThread();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getUsb() {
                return ((NetworkCapabilityTransports)this.instance).getUsb();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getVpn() {
                return ((NetworkCapabilityTransports)this.instance).getVpn();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getWifi() {
                return ((NetworkCapabilityTransports)this.instance).getWifi();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean getWifiAware() {
                return ((NetworkCapabilityTransports)this.instance).getWifiAware();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasBluetooth() {
                return ((NetworkCapabilityTransports)this.instance).hasBluetooth();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasCellular() {
                return ((NetworkCapabilityTransports)this.instance).hasCellular();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasEthernet() {
                return ((NetworkCapabilityTransports)this.instance).hasEthernet();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasLowpan() {
                return ((NetworkCapabilityTransports)this.instance).hasLowpan();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasSatellite() {
                return ((NetworkCapabilityTransports)this.instance).hasSatellite();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasThread() {
                return ((NetworkCapabilityTransports)this.instance).hasThread();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasUsb() {
                return ((NetworkCapabilityTransports)this.instance).hasUsb();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasVpn() {
                return ((NetworkCapabilityTransports)this.instance).hasVpn();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasWifi() {
                return ((NetworkCapabilityTransports)this.instance).hasWifi();
            }

            @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
            public boolean hasWifiAware() {
                return ((NetworkCapabilityTransports)this.instance).hasWifiAware();
            }

            public Builder setBluetooth(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setBluetooth(z);
                return this;
            }

            public Builder setCellular(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setCellular(z);
                return this;
            }

            public Builder setEthernet(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setEthernet(z);
                return this;
            }

            public Builder setLowpan(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setLowpan(z);
                return this;
            }

            public Builder setSatellite(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setSatellite(z);
                return this;
            }

            public Builder setThread(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setThread(z);
                return this;
            }

            public Builder setUsb(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setUsb(z);
                return this;
            }

            public Builder setVpn(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setVpn(z);
                return this;
            }

            public Builder setWifi(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setWifi(z);
                return this;
            }

            public Builder setWifiAware(boolean z) {
                this.copyOnWrite();
                ((NetworkCapabilityTransports)this.instance).setWifiAware(z);
                return this;
            }
        }

        public static final int BLUETOOTH_FIELD_NUMBER = 1;
        public static final int CELLULAR_FIELD_NUMBER = 2;
        private static final NetworkCapabilityTransports DEFAULT_INSTANCE = null;
        public static final int ETHERNET_FIELD_NUMBER = 3;
        public static final int LOWPAN_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int SATELLITE_FIELD_NUMBER = 5;
        public static final int THREAD_FIELD_NUMBER = 6;
        public static final int USB_FIELD_NUMBER = 7;
        public static final int VPN_FIELD_NUMBER = 8;
        public static final int WIFI_AWARE_FIELD_NUMBER = 10;
        public static final int WIFI_FIELD_NUMBER = 9;
        private int bitField0_;
        private boolean bluetooth_;
        private boolean cellular_;
        private boolean ethernet_;
        private boolean lowpan_;
        private boolean satellite_;
        private boolean thread_;
        private boolean usb_;
        private boolean vpn_;
        private boolean wifiAware_;
        private boolean wifi_;

        static {
            NetworkCapabilityTransports networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0 = new NetworkCapabilityTransports();
            NetworkCapabilityTransports.DEFAULT_INSTANCE = networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0;
            GeneratedMessageLite.registerDefaultInstance(NetworkCapabilityTransports.class, networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0);
        }

        private void clearBluetooth() {
            this.bitField0_ &= -2;
            this.bluetooth_ = false;
        }

        private void clearCellular() {
            this.bitField0_ &= -3;
            this.cellular_ = false;
        }

        private void clearEthernet() {
            this.bitField0_ &= -5;
            this.ethernet_ = false;
        }

        private void clearLowpan() {
            this.bitField0_ &= -9;
            this.lowpan_ = false;
        }

        private void clearSatellite() {
            this.bitField0_ &= -17;
            this.satellite_ = false;
        }

        private void clearThread() {
            this.bitField0_ &= -33;
            this.thread_ = false;
        }

        private void clearUsb() {
            this.bitField0_ &= -65;
            this.usb_ = false;
        }

        private void clearVpn() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.vpn_ = false;
        }

        private void clearWifi() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.wifi_ = false;
        }

        private void clearWifiAware() {
            this.bitField0_ &= 0xFFFFFDFF;
            this.wifiAware_ = false;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new NetworkCapabilityTransports();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(NetworkCapabilityTransports.DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"bitField0_", "bluetooth_", "cellular_", "ethernet_", "lowpan_", "satellite_", "thread_", "usb_", "vpn_", "wifi_", "wifiAware_"});
                }
                case 4: {
                    return NetworkCapabilityTransports.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = NetworkCapabilityTransports.PARSER;
                    if(parser0 == null) {
                        Class class0 = NetworkCapabilityTransports.class;
                        synchronized(class0) {
                            parser0 = NetworkCapabilityTransports.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(NetworkCapabilityTransports.DEFAULT_INSTANCE);
                                NetworkCapabilityTransports.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getBluetooth() {
            return this.bluetooth_;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getCellular() {
            return this.cellular_;
        }

        public static NetworkCapabilityTransports getDefaultInstance() {
            return NetworkCapabilityTransports.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getEthernet() {
            return this.ethernet_;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getLowpan() {
            return this.lowpan_;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getSatellite() {
            return this.satellite_;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getThread() {
            return this.thread_;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getUsb() {
            return this.usb_;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getVpn() {
            return this.vpn_;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getWifi() {
            return this.wifi_;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean getWifiAware() {
            return this.wifiAware_;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasBluetooth() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasCellular() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasEthernet() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasLowpan() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasSatellite() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasThread() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasUsb() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasVpn() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasWifi() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override  // gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransportsOrBuilder
        public boolean hasWifiAware() {
            return (this.bitField0_ & 0x200) != 0;
        }

        public static Builder newBuilder() {
            return (Builder)NetworkCapabilityTransports.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(NetworkCapabilityTransports networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0) {
            return (Builder)NetworkCapabilityTransports.DEFAULT_INSTANCE.createBuilder(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0);
        }

        public static NetworkCapabilityTransports parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseDelimitedFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, inputStream0);
        }

        public static NetworkCapabilityTransports parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseDelimitedFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static NetworkCapabilityTransports parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, byteString0);
        }

        public static NetworkCapabilityTransports parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static NetworkCapabilityTransports parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static NetworkCapabilityTransports parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static NetworkCapabilityTransports parseFrom(InputStream inputStream0) throws IOException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, inputStream0);
        }

        public static NetworkCapabilityTransports parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static NetworkCapabilityTransports parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static NetworkCapabilityTransports parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static NetworkCapabilityTransports parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, arr_b);
        }

        public static NetworkCapabilityTransports parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (NetworkCapabilityTransports)GeneratedMessageLite.parseFrom(NetworkCapabilityTransports.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return NetworkCapabilityTransports.DEFAULT_INSTANCE.getParserForType();
        }

        private void setBluetooth(boolean z) {
            this.bitField0_ |= 1;
            this.bluetooth_ = z;
        }

        private void setCellular(boolean z) {
            this.bitField0_ |= 2;
            this.cellular_ = z;
        }

        private void setEthernet(boolean z) {
            this.bitField0_ |= 4;
            this.ethernet_ = z;
        }

        private void setLowpan(boolean z) {
            this.bitField0_ |= 8;
            this.lowpan_ = z;
        }

        private void setSatellite(boolean z) {
            this.bitField0_ |= 16;
            this.satellite_ = z;
        }

        private void setThread(boolean z) {
            this.bitField0_ |= 0x20;
            this.thread_ = z;
        }

        private void setUsb(boolean z) {
            this.bitField0_ |= 0x40;
            this.usb_ = z;
        }

        private void setVpn(boolean z) {
            this.bitField0_ |= 0x80;
            this.vpn_ = z;
        }

        private void setWifi(boolean z) {
            this.bitField0_ |= 0x100;
            this.wifi_ = z;
        }

        private void setWifiAware(boolean z) {
            this.bitField0_ |= 0x200;
            this.wifiAware_ = z;
        }
    }

    public interface NetworkCapabilityTransportsOrBuilder extends MessageLiteOrBuilder {
        boolean getBluetooth();

        boolean getCellular();

        boolean getEthernet();

        boolean getLowpan();

        boolean getSatellite();

        boolean getThread();

        boolean getUsb();

        boolean getVpn();

        boolean getWifi();

        boolean getWifiAware();

        boolean hasBluetooth();

        boolean hasCellular();

        boolean hasEthernet();

        boolean hasLowpan();

        boolean hasSatellite();

        boolean hasThread();

        boolean hasUsb();

        boolean hasVpn();

        boolean hasWifi();

        boolean hasWifiAware();
    }

    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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

