//package com.rekha.Day65;
//import java.net.SocketTimeoutException;
//import java.util.Stack;
//public class UndoRedo {
//    public class UndoRedo{
//        Stack<String> undoStack = new Stack<>();
//        Stack<String> redoStack = new Stack<>();
//        public void performAction(String action){
//            undoStack.push(action);
//            redoStack.clear();
//            System.out.println("Performed action: " + action);
//        }
//        public void undo(){
//            if(!undoStack.isEmpty()){
//                String action = undoStack.pop();
//                redoStack.push(action);
//                System.out.println("Undo action: " + action);
//            }
//            else{
//                System.out.println("No action to undo");
//            }
//        }
//        public void redo(){
//            if(!redoStack.isEmpty()){
//                String action = redoStack.pop();
//                redoStack.push(action);
//                System.out.println("Redo action: " + action);
//            }
//            else{
//                System.out.println("No action to redo");
//            }
//        }
//    }
//    public static void main(String[] args){
//        UndoRedo editor = new UndoRedo();
//        editor.performAction("Hello");
//        editor.performAction("World");
//        editor.undo();
//        editor.redo();
//        editor.undo();
//        editor.redo();
//    }
//}
