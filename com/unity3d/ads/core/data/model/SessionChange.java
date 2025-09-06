package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class SessionChange {
    public static final class PrivacyFsmChange extends SessionChange {
        @l
        private final ByteString value;

        public PrivacyFsmChange(@l ByteString byteString0) {
            L.p(byteString0, "value");
            super(null);
            this.value = byteString0;
        }

        @l
        public final ByteString component1() {
            return this.value;
        }

        @l
        public final PrivacyFsmChange copy(@l ByteString byteString0) {
            L.p(byteString0, "value");
            return new PrivacyFsmChange(byteString0);
        }

        public static PrivacyFsmChange copy$default(PrivacyFsmChange sessionChange$PrivacyFsmChange0, ByteString byteString0, int v, Object object0) {
            if((v & 1) != 0) {
                byteString0 = sessionChange$PrivacyFsmChange0.value;
            }
            return sessionChange$PrivacyFsmChange0.copy(byteString0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof PrivacyFsmChange ? L.g(this.value, ((PrivacyFsmChange)object0).value) : false;
        }

        @l
        public final ByteString getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }
    }

    public static final class UserConsentChange extends SessionChange {
        @l
        private final ByteString value;

        public UserConsentChange(@l ByteString byteString0) {
            L.p(byteString0, "value");
            super(null);
            this.value = byteString0;
        }

        @l
        public final ByteString component1() {
            return this.value;
        }

        @l
        public final UserConsentChange copy(@l ByteString byteString0) {
            L.p(byteString0, "value");
            return new UserConsentChange(byteString0);
        }

        public static UserConsentChange copy$default(UserConsentChange sessionChange$UserConsentChange0, ByteString byteString0, int v, Object object0) {
            if((v & 1) != 0) {
                byteString0 = sessionChange$UserConsentChange0.value;
            }
            return sessionChange$UserConsentChange0.copy(byteString0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UserConsentChange ? L.g(this.value, ((UserConsentChange)object0).value) : false;
        }

        @l
        public final ByteString getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }
    }

    private SessionChange() {
    }

    public SessionChange(w w0) {
    }
}

