//public class Ideone
//{
//    string input= S.split(' ');
//    let totalMessages = [];
//    let message = string[0];
//  string.splice(0,1);
//
//  return recurse(message, string, totalMessages, K);
//}
//
//    function recurse (message, string, totalMessages, max) {
//
//        // console.log(string[0]);
//        if (string.length !== 0) {
//            if (string[0].length > max) return -1;
//        }
//
//        if (string.length === 0) {
//            totalMessages.push(message);
//            messageCount = totalMessages.length;
//            // console.log(totalMessages);
//            return messageCount;
//        }
//
//        // if (string.length === 1) {
//        //   console.log('last ele')
//        //   if (string[0].length > max) return 'message not splittable';
//        //   else totalMessages.push(string[0]);
//        //   return totalMessages;
//        // }
//        console.log("message ---> ",message);
//        console.log("String ----> ", string);
//        if (message.length + 1 + string[0].length === max) {
//            totalMessages.push(message + ' ' + string[0]);
//            message = string[1];
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
//    }}