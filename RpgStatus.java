public class RpgStatus{
    public static void main(String[] args) {
        int hp = 100;
        System.out.println("체력1 = " + hp);
        hp -= 30; // 몬스터 공격
        System.out.println("체력2 = " + hp);
        hp += 50; // 포션
        System.out.println("체력3 = " + hp);
        hp /= 2; // 독 (절반)
        System.out.println("체력4 = " + hp);
    }
}