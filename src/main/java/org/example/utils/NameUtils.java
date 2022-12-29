package org.example.utils;

import org.example.Member;

import java.util.ArrayList;
import java.util.List;

public class NameUtils {

    public static List<Member> nameFormatConverter(List<Member> inputList) throws NullPointerException {
        List<Member> outputList = new ArrayList<>();
        for (Member members: inputList) {
            if (members.firstName == null || members.firstName.isEmpty()) {
                String[] nameParts = members.name.split(", ");
                if (nameParts.length == 2) {
                    outputList.add(new Member(
                            nameParts[1],
                            "",
                            nameParts[0],
                            members.categoryKey,
                            members.remarks));
                }
            } else {
                outputList.add(members);
            }
        }

        return outputList;
    }

}
