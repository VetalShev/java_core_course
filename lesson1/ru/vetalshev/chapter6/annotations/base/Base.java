package ru.vetalshev.chapter6.annotations.base;

@MarkerAnnotation
@OneMemberAnnotation(12)
@MultiMemberAnnotation(value1 = 12, value2 = 3, ready = true)
@BaseAction(level = 2, sqlRequest = "SELECT * FROM phonebook")
public class Base {

    public void doAction() {
        Class<Base> f = Base.class;
        BaseAction a = f.getAnnotation(BaseAction.class);
        System.out.println(a.level());
        System.out.println(a.sqlRequest());
    }

    public static void main(String[] args) {
        Base base = new Base();

        base.doAction();
    }

}
