package Lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/131704

/* 
 * 컨테이너 동작 방식 : LIFO => 스택으로 관리
 * order로 부터 priority 배열 관리
 * 트럭에 실어야 하는 박스 : t_box
 * 박스가 놓인 컨베이어 벨트 탐색
*/
import java.util.*; // import 구문 중요;
class Solution {
    public int solution(int[] order) {
        int [] priority = new int[order.length]; 
        
        for(int i = 0 ; i < order.length; i++){
            priority[order[i] - 1] = i;
        }
        
        Stack<Integer> container = new Stack<>();
        
        int t_box = 0;
        
        for(int i = 0 ; i < priority.length ; i++){
            if(priority[i] == t_box){
                t_box++;
            }else{
                container.push(priority[i]);
            }
            while(!container.isEmpty() && container.peek() == t_box){
                container.pop();
                t_box++;
            }
        } 
        
        return t_box;
    }
}
