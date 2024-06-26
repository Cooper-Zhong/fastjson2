package com.alibaba.fastjson2.issues_2200;

import com.alibaba.fastjson2.JSON;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Issue2202 {
    @Test
    public void test() {
        Bean bean = new Bean();
        assertEquals("{}", JSON.toJSONString(bean));
    }

    public static class Bean {
        public InputStream getInputStream() {
            throw new RuntimeException();
        }
    }
}
