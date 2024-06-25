class Solution {
    public int solution(int cap, int n, int[] deliveries, int[] pickups) {
        int distance = 0; // 최소 이동 거리
        
        /* 마지막 배달 및 수거 위치 추적 */
        int lastDelivery = n - 1; // 마지막 배달 위치
        int lastPickup = n - 1; // 마지막 수거 위치
        
        // 배달 및 수거 반복
        while (lastDelivery >= 0 || lastPickup >= 0) {
            // 배달할 집을 찾는다
            while (lastDelivery >= 0 && deliveries[lastDelivery] == 0) {
                lastDelivery--;
            }
            
            // 수거할 집을 찾는다
            while (lastPickup >= 0 && pickups[lastPickup] == 0) {
                lastPickup--;
            }
            
            // 트럭이 이동해야 하는 최대 거리
            int maxDistance = Math.max(lastDelivery, lastPickup) + 1; // 음수 방지
            distance += maxDistance * 2; // 왕복 거리
            
            // 트럭에 배달할 물건을 싣고 배달하면서 물건을 내린다
            int currentLoad = 0;
            for (int i = lastDelivery; i >= 0 && currentLoad < cap; i--) { 
                if (deliveries[i] > 0) { 
                    if (deliveries[i] + currentLoad <= cap) {
                        currentLoad += deliveries[i];
                        deliveries[i] = 0; // 배달 완료 표시
                    } else { // 남은 배달 계산
                        deliveries[i] -= (cap - currentLoad);
                        currentLoad = cap;
                    }
                }
            }
            
            // 트럭에 수거할 물건을 싣고 수거하면서 물건을 싣는다
            currentLoad = 0;
            for (int i = lastPickup; i >= 0 && currentLoad < cap; i--) {
                if (pickups[i] > 0) {
                    if (pickups[i] + currentLoad <= cap) {
                        currentLoad += pickups[i];
                        pickups[i] = 0; // 수거 완료 표시 
                    } else { // 남은 수거 계산
                        pickups[i] -= (cap - currentLoad);
                        currentLoad = cap;
                    }
                }
            }
        }
        
        return distance;
    }
}
