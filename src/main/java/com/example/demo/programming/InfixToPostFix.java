//package com.example.demo.programming;
//
//public class InfixToPostFix {
//    int precedence(char ch){
//        if(ch=='^'){
//            return 3;
//        }
//        if(ch=='*' || ch =='/'){
//            return 2;
//        }
//        if(ch=='+' || ch=='-'){
//            return 1;
//        }
//        return -1;
//    }
//
//
//    String convertPostfix(String exp){
//        StackClass stk = new StackClass(exp.length());
//        String postfix = "";
//        for(int i=0; i<exp.length(); i++){
//            char ch = exp.charAt(i);
//            if(precedence(ch)>0){
//
//                while(!stk.isEmpty() && precedence(ch)<=precedence(stk.peak())){
//                    postfix=postfix + stk.pop();
//                }
//                stk.push(ch);
//            }
//            else if(ch=='('){
//                stk.push(ch);
//            }
//            else if(ch==')'){
//                char x=stk.pop();
//                while (x!='('){
//                    postfix = postfix + x;
//                    x=stk.pop();
//                }
//            }
//            else{
//                postfix = postfix+ch;
//            }
//        }
//        System.out.println(postfix);
//        return postfix;
//    }
//}
