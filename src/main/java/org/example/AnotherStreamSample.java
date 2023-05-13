package org.example;

import java.util.*;

public class AnotherStreamSample {
    public static void main(String[] args) {

        ArrayList< String> users = new ArrayList<>();
        users.add("CMN");
        users.add("Ahmad");
        users.add("RTP");
        users.add("mmb");
        users.add("Mohsen");
        users.add("Jay");

        users.stream().filter(user -> !user.contains("A")&& !user.contains("a")&&  !user.contains("O")&&  !user.contains("o")&& !user.contains("U")&& !user.contains("u")&& !user.contains("I")&& !user.contains("i") &&  !user.contains("E")&&  !user.contains("e")).forEach(user->System.out.println(user));



    }
}
