final class ThirdLevel extends SecondLevel {
    private Gender gender;
    private Address address;

    public ThirdLevel(int firstField, String secondField, Gender gender, Address address) {
        super(firstField, secondField);
        this.gender = gender;
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public void overloadedMethod(int value) {
        System.out.println("Overridden method in ThirdLevel: " + value);
    }
}