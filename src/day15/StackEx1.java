package day15;

import java.util.*;

import day8.inheritanceEx1;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(new Integer(2));
		stack.push(Integer.parseInt("3"));
//stack.pop();//pop은 마지막 요소를 꺼낸다 -> 마지막 요소를 변환한다.
		System.out.println(stack.pop()+"을 스택에서 꺼냈습니다.");
		System.out.println(stack.pop()+"를 스택에서 꺼냈습니다.");
		for(Integer tmp : stack) {
			System.out.println(tmp);
		}
	}

}
