package run1;

public class CompressionDecorator3 extends DataSourceDecorator2 {
    public CompressionDecorator3(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        // Compress data and then delegate writing to the wrapped dataSource
        String compressedData = compress(data);
        dataSource.writeData(compressedData);
    }

    @Override
    public String readData() {
        // Read and then decompress data from the wrapped dataSource
        String data = dataSource.readData();
        return decompress(data);
    }

    private String compress(String data) {
        // Mock compression logic for illustration
        return data; // In real use, apply compression
    }

    private String decompress(String data) {
        // Mock decompression logic to match compression
        return data; // In real use, reverse the compression
    }
}