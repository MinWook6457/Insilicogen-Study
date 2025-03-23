/*
* Lv2 : 혼자 놀기의 달인
* https://school.programmers.co.kr/learn/courses/30/lessons/131130
* DFS로 풀이
*/

import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int n = cards.length;
        boolean[] visited = new boolean[n]; // 방문 체크
        List<Integer> groupSizes = new ArrayList<>(); 

        for (int i = 0; i < n; i++) {
            if (!visited[i]) { // 아직 방문하지 않은 상자라면 탐색 시작
                int count = 0;
                int idx = i;

                while (!visited[idx]) { // 새로운 그룹 탐색
                    visited[idx] = true;
                    count++;
                    idx = cards[idx] - 1; // 카드 값이 다음 열 상자의 인덱스
                }

                groupSizes.add(count); // 그룹 크기 저장
            }
        }

        if (groupSizes.size() < 2) return 0; // 그룹이 하나뿐이면 점수는 0

        // 가장 큰 두 개의 그룹 크기 찾기
        Collections.sort(groupSizes, Collections.reverseOrder());
        return groupSizes.get(0) * groupSizes.get(1);
    }
}
