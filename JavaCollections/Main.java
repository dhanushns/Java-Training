package JavaCollections;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class Main {

    public static boolean isValidBracket(String str){
        stack_list bracket_stack = new stack_list();
        for(int i = 0 ; i < str.length(); i++){
            char bracket_1 = str.charAt(i);
            if(bracket_stack.isEmpty()){
               bracket_stack.addElement(bracket_1);
            }
            else{
                char bracket_2 = (char)bracket_stack.getTopElement();
                if(bracket_2 == '(' && bracket_1 == ')')
                    bracket_stack.removeTopElement();
                else if(bracket_2 == '[' && bracket_1 == ']')
                    bracket_stack.removeTopElement();
                else if(bracket_2 == '{' && bracket_1 == '}')
                    bracket_stack.removeTopElement();
                else
                    bracket_stack.addElement(bracket_1);
            }
        }
        return bracket_stack.isEmpty();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        arr_list arr = new arr_list("String");
//        MazePath.findPath(2,0,0,2,2,"",arr);
//        arr.display();
        stack_list stack = new  stack_list();
        stack.addElement(10);
        stack.addElement(20);
        stack.display();
        stack.insertElement(2,30);
        System.out.println("Element inserted");
        stack.display();
        System.out.println("Element at 1st Position");
        System.out.println(stack.getElement(2));
        System.out.println("Display Stack");
        stack.display();
        stack.removeElement(1);
        System.out.println("Element Removed");
        stack.display();
//        System.out.print("Enter the brackets : ");
//        String str_bracket = input.next();
//        System.out.println("Is it Valid Bracket : " + isValidBracket(str_bracket));
    }

}

class MazePath{
    public static void findPath(int n,int row, int col,int target_col, int target_row,String path,arr_list arr) {
        if (row == target_col && col == target_row) {
            arr.addElement(path);
            return;
        }
        if(row > n || col > n){
            return;
        }
        findPath(n,row,col+1,target_col,target_row,path+"H",arr);
        findPath(n,row+1,col,target_col,target_row,path+"V",arr);
        findPath(n,row+1,col+1,target_col,target_row,path+"D",arr);
    }
}

class arr_list{

    public ArrayList list;

    arr_list(String dataType){
        switch(dataType){
            case "String" : list = new ArrayList<String>(); break;
            case "Character" : list = new ArrayList<Character>(); break;
            case "Integer" : list = new ArrayList<Integer>(); break;
            case "Double" : list = new ArrayList<Double>(); break;
            case "Float" : list = new ArrayList<Float>(); break;
            default: list = new ArrayList<String>();
        }
    }

    public void addElement(Object element){
        list.add(element);
    }

    public void display(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public void removeElement(int element){
        int indexPosition = list.indexOf(element);
        list.remove(indexPosition);
    }

}

class stack_list{

    public Stack<Object> stack = new Stack<>();

    public void addElement(Object element){
        stack.push(element);
    }

    public Object removeTopElement(){
        return stack.pop();
    }

    public void insertElement(int index, Object element){
        Stack<Object> temp = new Stack<>();
        while(stack.size() >= index){
            temp.push(stack.pop());
        }
        stack.push(element);
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    public Object getTopElement(){
        return stack.peek();
    }

    public void display(){
        Stack<Object> temp = new Stack<>();
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            temp.push(stack.pop());
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public Object getElement(int index){
        Stack<Object> temp = new Stack<>();
        while(stack.size() > index){
            temp.push(stack.pop());
        }
        Object element = stack.pop();
        temp.push(element);
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return element;
    }

    public void removeElement(int index){
        Stack<Object> temp = new Stack<>();
        while(stack.size() > index){
            temp.push(stack.pop());
        }
        Object element = stack.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    public void clear(){
        while(!stack.isEmpty())
            stack.pop();
    }
}
