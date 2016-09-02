package com.github.scribejava.core.services;

import java.io.UnsupportedEncodingException;

import com.github.scribejava.core.exceptions.OAuthSignatureException;
import com.github.scribejava.core.utils.Base64Coding;

public class CommonsEncoder extends Base64Encoder {

    @Override
    public String encode(byte[] bytes) {
        try {
            return new String(Base64Coding.encodeBase64(bytes), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new OAuthSignatureException("Can't perform base64 encoding", e);
        }
    }

    @Override
    public String getType() {
        return "CommonsCodec";
    }

    public static boolean isPresent() {
        try {
            Class.forName("org.apache.commons.codec.binary.Base64");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
