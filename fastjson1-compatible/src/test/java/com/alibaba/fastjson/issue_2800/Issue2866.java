package com.alibaba.fastjson.issue_2800;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Issue2866 {
    @Test
    public void test_for_issue() throws Exception {
        String json = "{\"A1\":1,\"A2\":2,\"A3\":3}";

        A a = JSON.parseObject(json, A.class, Feature.SupportNonPublicField);

        assertEquals(1, a.a1);
        assertEquals(2, a.A2);
        assertEquals(3, a.a3);
    }

    static class A{
        @JSONField(name="A1")
        int a1;

        int A2;
        @JSONField(name="A3")
        public int a3;
    }
}
