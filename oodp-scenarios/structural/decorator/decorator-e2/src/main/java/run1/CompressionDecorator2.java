package run1;

public class CompressionDecorator2 extends DataSourceDecorator {
        public CompressionDecorator2(DataSource dataSource) {
            super(dataSource);
        }
    
        @Override
        public void writeData(String data) {
            String compressedData = compress(data);
            super.writeData(compressedData);
        }
    
        @Override
        public String readData() {
            String data = super.readData();
            return decompress(data);
        }
    
        private String compress(String data) {
            // Mock compression: you should use real compression methods for actual data compression
            return data; // In a real scenario, you would compress the data here
        }
    
        private String decompress(String data) {
            // Mock decompression: match the compression logic
            return data; // In a real scenario, you would decompress the data here
        }
    }
