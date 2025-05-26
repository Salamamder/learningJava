package chap_09.coffee;

public class CoffebyNickname {
    public String nickname;

    public CoffebyNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + nickname );
    }
}
