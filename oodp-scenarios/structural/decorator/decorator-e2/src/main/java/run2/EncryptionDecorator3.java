package run2;

public class EncryptionDecorator3 extends DataSourceDecorator2 {
    public EncryptionDecorator3(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        // Encrypt data and then delegate writing to the wrapped dataSource
        String encryptedData = encrypt(data);
        dataSource.writeData(encryptedData);
    }

    @Override
    public String readData() {
        // Read and then decrypt data from the wrapped dataSource
        String data = dataSource.readData();
        return decrypt(data);
    }

    private String encrypt(String data) {
        // Simple encryption logic (illustrative)
        return new StringBuilder(data).reverse().toString(); // Example encryption
    }

    private String decrypt(String data) {
        // Simple decryption logic (reverse of the above)
        return new StringBuilder(data).reverse().toString(); // Example decryption
    }
}
