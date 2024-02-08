package run1;

public class DecoratorDemo2 {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("test.txt");

        // Wrap the dataSource with encryption and then compression
        DataSource secureDataSource = new CompressionDecorator3(new EncryptionDecorator3(dataSource));

        String originalData = "Hello, World!";
        secureDataSource.writeData(originalData); // Data is encrypted and compressed before writing

        String readData = secureDataSource.readData(); // Data is read, decompressed, and decrypted
        System.out.println("Original: " + originalData);
        System.out.println("Read: " + readData);
    }
}
