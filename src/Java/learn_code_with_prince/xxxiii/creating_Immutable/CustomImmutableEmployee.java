package Java.learn_code_with_prince.xxxiii.creating_Immutable;

public final class CustomImmutableEmployee {
    final String panCardNo;

    public CustomImmutableEmployee(String panCardNo){
        this.panCardNo = panCardNo;
    }

    public String getPanCardNo() {
        return panCardNo;
    }
}
class ImmutableDemo{
    public static void main(String[] args) {
        CustomImmutableEmployee emp = new CustomImmutableEmployee("LIWPS57555");
        String s1 = emp.getPanCardNo();
        System.out.println("PanCard No is : " + s1);
    }
}
