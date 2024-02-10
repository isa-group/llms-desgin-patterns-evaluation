package run1;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        return decrypt(super.readData());
    }

    private String encrypt(String data) {
        // Simple character shifting for demonstration
        return new StringBuilder(data).reverse().toString();
    }

    private String decrypt(String data) {
        // Reverse the encryption logic
        return new StringBuilder(data).reverse().toString();
    }
}