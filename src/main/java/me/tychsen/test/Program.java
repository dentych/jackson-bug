package me.tychsen.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Program {
    public static void main(String... args) throws JsonProcessingException {
        DAR dar = new DAR();
        dar.setName("DAR object");

        MAT mat = new MAT();
        mat.setName("MAT object");

        MyCollection bfer = new MyCollection();
        bfer.setDAR(dar);
        bfer.setMAT(mat);
        bfer.setSomeString("blabla123");

        ObjectMapper mapper = new ObjectMapper();
        String value = mapper.writeValueAsString(bfer);

        System.out.println("value = " + value);
    }

}

