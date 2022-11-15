package precourse.thirdweek.mon.mission1;

public class MemberTest {

    public static void main(String[] args) {

        Member memberJames = new MemberRED("James", 10000, 2);
        Member memberTomas = new MemberRED("Tomas", 30000, 2);
//
        Member memberEdward = new MemberPLATINUM("Edward", 10000, 2);
        Member memberPercy = new MemberPLATINUM("Percy", 30000, 2);

        Member memberElizabet = new MemberDIAMOND("Elizabet", 30000, 2);

        System.out.println(memberJames.showMemberInfo());
        System.out.println(memberTomas.showMemberInfo());
        System.out.println(memberEdward.showMemberInfo());
        System.out.println(memberPercy.showMemberInfo());
        System.out.println(memberElizabet.showMemberInfo());
    }
}
