//class Solution {
//    public int solution(String S, int K) {
//        // write your code in Java SE 8
//        int count = 0;
//        String totalMessages="";
//        String message=S.split(" ")[0];
//        if (S.length() != 0) {
//            if (S.split(" ")[0].length() > K) return -1;
//        }
//        if (S.length() == 0) {
//            totalMessages = totalMessages+message;
//            messageCount = totalMessages.length;
//            // console.log(totalMessages);
//            return messageCount;
//        }
//        if (S.length() + 1 + S.split("")[0].length() == K) {
//            totalMessages=(message + ' ' + S.split(" ")[0]);
//            message = S.split(" ")[1];
//            //S.substring()
//            string.splice(0,2);
//        }
//        else if (message.length + 1 + string[0].length < max) {
//            message = message + ' ' + string[0];
//            string.splice(0,1);
//        }
//        else if (message.length + 1 + string[0].length > max) {
//            totalMessages.push(message);
//            message = string[0];
//            string.splice(0,1);
//        }
//        // console.log('M', message, 'S', string, 'TM', totalMessages);
//        return recurse(message, string, totalMessages, max);
//    }
//
//
//        for (String sms : S.split("(?<=\\G.{"+K+",}\\s)")) {
//            count++;
//            System.out.println("'" + sms.trim() + "'");
//
//        }
//        return count;
//    }
//}