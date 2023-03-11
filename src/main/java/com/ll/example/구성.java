// 조건 : 사람 클래스만 수정할 수 있습니다.
// super 메서드를 명시적으로 호출해서 문제를 해결해주세요.
class Main {
    public static void main(String[] args) {
        //new 사람();
    }
}

class 동물 {
    동물(String 이름) {
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}

// class 사람 extends 동물 { }