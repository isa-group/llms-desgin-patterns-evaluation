package run2;

public class EncryptionDecorator2 extends DataSourceDecorator {
    public EncryptionDecorator2(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decrypt(data);
    }

    private String encrypt(String data) {
        // Simple character shift for demonstration (not secure)
        return data.chars()
                   .mapToObj(c -> String.valueOf((char) (c + 1))) // Shift each character
                   .reduce("", String::concat);
    }

    private String decrypt(String data) {
        // Reverse the encryption logic
        return data.chars()
                   .mapToObj(c -> String.valueOf((char) (c - 1))) // Shift back each character
                   .reduce("", String::concat);
    }
}
