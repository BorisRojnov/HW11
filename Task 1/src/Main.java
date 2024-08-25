public class Main {
    public static void main(String[] args) {
    Phone nokia = new Phone("+375298830933", "nokia", 3.8);
        System.out.println("Номер телефона " + nokia.phoneNumber + " модель телефона " + nokia.phoneModel
        + " вес телефона " + nokia.phoneWeight + " кг " + " производитель " + Phone.phoneCountryOrigin);

    Phone samsung = new Phone("+375336547126", "samsung", 3);
        System.out.println("Номер телефона " + samsung.phoneNumber + " модель телефона " + samsung.phoneModel
                + " вес телефона " + samsung.phoneWeight + " кг " + " производитель " + Phone.phoneCountryOrigin);

       Phone.receiveCall("Ольга");
       Phone.receiveCall("Borya", "+375115554039");
    }


}
