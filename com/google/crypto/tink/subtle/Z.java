package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public interface z {
    public static class a implements z {
        @Override  // com.google.crypto.tink.subtle.z
        public Object a(String s, Provider provider0) throws GeneralSecurityException {
            return this.b(s, provider0);
        }

        public Cipher b(String s, Provider provider0) throws GeneralSecurityException {
            return provider0 == null ? Cipher.getInstance(s) : Cipher.getInstance(s, provider0);
        }
    }

    public static class b implements z {
        @Override  // com.google.crypto.tink.subtle.z
        public Object a(String s, Provider provider0) throws GeneralSecurityException {
            return this.b(s, provider0);
        }

        public KeyAgreement b(String s, Provider provider0) throws GeneralSecurityException {
            return provider0 == null ? KeyAgreement.getInstance(s) : KeyAgreement.getInstance(s, provider0);
        }
    }

    public static class c implements z {
        @Override  // com.google.crypto.tink.subtle.z
        public Object a(String s, Provider provider0) throws GeneralSecurityException {
            return this.b(s, provider0);
        }

        public KeyFactory b(String s, Provider provider0) throws GeneralSecurityException {
            return provider0 == null ? KeyFactory.getInstance(s) : KeyFactory.getInstance(s, provider0);
        }
    }

    public static class d implements z {
        @Override  // com.google.crypto.tink.subtle.z
        public Object a(String s, Provider provider0) throws GeneralSecurityException {
            return this.b(s, provider0);
        }

        public KeyPairGenerator b(String s, Provider provider0) throws GeneralSecurityException {
            return provider0 == null ? KeyPairGenerator.getInstance(s) : KeyPairGenerator.getInstance(s, provider0);
        }
    }

    public static class e implements z {
        @Override  // com.google.crypto.tink.subtle.z
        public Object a(String s, Provider provider0) throws GeneralSecurityException {
            return this.b(s, provider0);
        }

        public Mac b(String s, Provider provider0) throws GeneralSecurityException {
            return provider0 == null ? Mac.getInstance(s) : Mac.getInstance(s, provider0);
        }
    }

    public static class f implements z {
        @Override  // com.google.crypto.tink.subtle.z
        public Object a(String s, Provider provider0) throws GeneralSecurityException {
            return this.b(s, provider0);
        }

        public MessageDigest b(String s, Provider provider0) throws GeneralSecurityException {
            return provider0 == null ? MessageDigest.getInstance(s) : MessageDigest.getInstance(s, provider0);
        }
    }

    public static class g implements z {
        @Override  // com.google.crypto.tink.subtle.z
        public Object a(String s, Provider provider0) throws GeneralSecurityException {
            return this.b(s, provider0);
        }

        public Signature b(String s, Provider provider0) throws GeneralSecurityException {
            return provider0 == null ? Signature.getInstance(s) : Signature.getInstance(s, provider0);
        }
    }

    Object a(String arg1, Provider arg2) throws GeneralSecurityException;
}

