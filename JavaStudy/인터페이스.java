package JavaStudy;

/*
 시나리오
1. 식당를 운영하는 사람이 있다.
2. 단골손님들은 매일 먹는 음식이 정해져 있다.
3. 단골손님 A는 항상 김치찌개를 주문한다.
4. 단골손님 B는 항상 제육볶음을 주문한다
*/

// 공통 부분 : 주문 , 단골

interface ResCustomer {
    String getOrder();
}

// 단골손님 A와 B 클래스에서 인터페이스 ResCustomer의 getOrder 추상 메서드 구현
class ResCustomerA implements ResCustomer {
    public String getOrder() {
        return "손님 A에게 김치찌개를 준다";
    }
}

class ResCustomerB implements ResCustomer {
    public String getOrder() {
        return "손님 B에게 제육볶음을 준다";
    }
}

// 식당 사장
class ResOwner {
    public void giveFood(ResCustomer resCustomer) {
        System.out.println(resCustomer.getOrder());
    }
}

// 음식 주문
public class 인터페이스 {
    public static void main(String[] args) {
        ResOwner owner = new ResOwner();
        ResCustomerA a = new ResCustomerA();
        ResCustomerB b = new ResCustomerB();

        owner.giveFood(a);
        owner.giveFood(b);
    }
}

