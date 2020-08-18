package Test;

import Library.Util;

public class SendGmail {
    public static void main(String[] args) {
        String userName = "sshukhratov@gmail.com";
        String passWord = "98741236s";


        // email
        String [] receivers = {"Cybertek.Batch@gmail.com", "fatime0116@gmail.com", "yasanomer@gmail.com",
                "kaheremank@gmail.com", "trlis369@gmail.com", "saboohiyan@gmail.com"};
        String subject = "Sardor Shukhratov";
        String text = "Hi, How are you? Sorry this is just test not spamming";

        for (String each: receivers){
            System.out.println("Sending to "+each);
            Util.sendEmails(userName,passWord,each,subject,text);
        }

        System.out.println("Completed");


    }
}
