package org.example.utils;

import org.example.Member;

import java.util.ArrayList;
import java.util.List;

public class NameUtils {

    public static List<Member> nameFormatConverter(List<Member> inputList) {
        List<Member> outputList = new ArrayList<>();
        for (Member member: inputList) {
            if (member.getFirstName() == null || member.getFirstName().isEmpty()) {
                String[] nameParts = member.getName().split(", ");
                if (nameParts.length == 2) {
                    outputList.add(new Member(
                            nameParts[1],
                            "",
                            nameParts[0],
                            member.getCategoryKey(),
                            member.getRemarks()));
                }
            } else {
                outputList.add(member);
            }
        }
        return outputList;
    }

}
