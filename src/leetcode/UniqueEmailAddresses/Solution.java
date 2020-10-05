package leetcode.UniqueEmailAddresses;

import java.util.Set;
import java.util.TreeSet;

class Solution {
    public static int getNumUniqueEmails(String[] input) {

        Set validEmails = new TreeSet<>();

        for (String i : input) {

            String local;
            String domain;

            String[] parts = i.split("@");

            local = parts[0].replaceAll("\\.", "");
            local = local.split("\\+")[0];
            local = local + "@";

            domain = parts[1];

            validEmails.add(local + domain);

        }

        return validEmails.size();

    }


    public static void main(String[] args) {

        //should return 4 unique e-mails

        String[] input = {"sam.biggins@mail.com", "sambiggins@mail.com", "sambiggins+test@mail.com", "sally+test@boo.com", "sally@bee.com", "faisal@bee.com", "faisal@bee.com"};
        System.out.println(getNumUniqueEmails(input));

    }
}
