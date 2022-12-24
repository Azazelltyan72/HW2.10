public class TelephoneDirectory {
    private String name;
    private String telephoneNumber;

    public TelephoneDirectory(String name, String telephoneNumber) {
        this.name = name;
        if (telephoneNumber != null && !telephoneNumber.isBlank() && !telephoneNumber.isEmpty()) {
            this.telephoneNumber = telephoneNumber;
        } else {
            throw new IllegalArgumentException("Невозможно сохранить в телефонный справочник. Введите номер телефона");
        }
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
