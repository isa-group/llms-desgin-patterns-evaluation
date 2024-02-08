package run2;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) {
        // Simulate compression by removing spaces
        return data.replace(" ", "");
    }

    private String decompress(String data) {
        // Simulate decompression by adding spaces between characters
        StringBuilder decompressed = new StringBuilder();
        for (char character : data.toCharArray()) {
            decompressed.append(character).append(" ");
        }
        return decompressed.toString().trim();
    }
}