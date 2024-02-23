public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "City A");
        Address address2 = new Address("456 Oak Ave", "City B");

        ThirdLevel objectB = new ThirdLevel(1, "ABC", Gender.MALE, address1);
        ThirdLevel objectC = new ThirdLevel(2, "DEF", Gender.FEMALE, address2);

        System.out.println("Properties of objectB:");
        System.out.println("First Field: " + objectB.getFirstField());
        System.out.println("Second Field: " + objectB.getSecondField());
        System.out.println("Gender: " + objectB.getGender());
        System.out.println("Address: " + objectB.getAddress().getStreet() + ", " + objectB.getAddress().getCity());
        objectB.overloadedMethod(10);
        objectB.nonOverridableMethod("Hello");

        System.out.println();

        System.out.println("Properties of objectC:");
        System.out.println("First Field: " + objectC.getFirstField());
        System.out.println("Second Field: " + objectC.getSecondField());
        System.out.println("Gender: " + objectC.getGender());
        System.out.println("Address: " + objectC.getAddress().getStreet() + ", " + objectC.getAddress().getCity());
        objectC.overloadedMethod(20);
        objectC.nonOverridableMethod("World");
    }
}