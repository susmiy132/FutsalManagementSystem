//package com.example.demo.entity;
//
//import com.example.demo.programming.StackClass;
//
//public class Check {
//    boolean isBalanced(String exp){
//        StackClass stk = new StackClass(exp.length());
//        String openingbraces = "[{(";
//        String closingbraces = "]})";
//        for (int i=0; i<exp.length(); i++){
//            char bracket = exp.charAt(i);
////            checking if bracket is opening
//            if (bracket == '['  || bracket == '{' || bracket=='('){
////                confirmed opening bracket
//                stk.push(bracket);
//            }
//            else{
////                confirmed closing bracket
//                int index = closingbraces.indexOf(bracket);
//                char crossOpeningbracket = openingbraces.charAt(index);
//                if(stk.isEmpty()){
//                    return false;
//                }
//                else{
//                    int stkchar=stk.pop();
//                    if(stkchar!=crossOpeningbracket){
//                        return false;
//                    }
//                }
//            }
//        }
//        if(stk.isEmpty()){
//            return false;
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        Check check = new Check();
//        System.out.println(check.isBalanced("{()"));
//    }
//}
