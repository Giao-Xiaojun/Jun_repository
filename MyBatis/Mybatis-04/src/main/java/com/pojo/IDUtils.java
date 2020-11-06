package com.pojo;

import javax.crypto.interfaces.PBEKey;
import java.security.PublicKey;
import java.util.UUID;

public class IDUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}

