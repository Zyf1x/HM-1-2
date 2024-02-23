public class FirstLevel {
    private int firstField;

    public FirstLevel(int firstField) {
        this.firstField = firstField;
    }

    public int getFirstField() {
        return firstField;
    }
}

class SecondLevel extends FirstLevel {
    private String secondField;

    public SecondLevel(int firstField, String secondField) {
        super(firstField);
        this.secondField = secondField;
    }

    public String getSecondField() {
        return secondField;
    }

    public void overloadedMethod(int value) {
        System.out.println("Overloaded method in SecondLevel: " + value);
    }

    public final void nonOverridableMethod(String text) {
        System.out.println("Non-overridable method in SecondLevel: " + text);
    }
}